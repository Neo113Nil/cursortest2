package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class RawResourceDataSource extends com.google.android.exoplayer2.upstream.BaseDataSource {
    public static final java.lang.String RAW_RESOURCE_SCHEME = "rawresource";
    private android.content.res.AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;
    private java.io.InputStream inputStream;
    private boolean opened;
    private final java.lang.String packageName;
    private final android.content.res.Resources resources;
    private android.net.Uri uri;

    public static class RawResourceDataSourceException extends com.google.android.exoplayer2.upstream.DataSourceException {
        @java.lang.Deprecated
        public RawResourceDataSourceException(java.lang.String str) {
            super(str, null, 2000);
        }

        @java.lang.Deprecated
        public RawResourceDataSourceException(java.lang.Throwable th) {
            super(th, 2000);
        }

        public RawResourceDataSourceException(java.lang.String str, java.lang.Throwable th, int i) {
            super(str, th, i);
        }
    }

    public static android.net.Uri buildRawResourceUri(int i) {
        return android.net.Uri.parse("rawresource:///" + i);
    }

    public RawResourceDataSource(android.content.Context context) {
        super(false);
        this.resources = context.getResources();
        this.packageName = context.getPackageName();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException {
        int parseInt;
        java.lang.String str;
        android.net.Uri uri = dataSpec.uri;
        this.uri = uri;
        if (android.text.TextUtils.equals("rawresource", uri.getScheme()) || (android.text.TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && ((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(uri.getLastPathSegment())).matches("\\d+"))) {
            try {
                parseInt = java.lang.Integer.parseInt((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(uri.getLastPathSegment()));
            } catch (java.lang.NumberFormatException unused) {
                throw new com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else if (android.text.TextUtils.equals("android.resource", uri.getScheme())) {
            java.lang.String str2 = (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(uri.getPath());
            if (str2.startsWith(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING)) {
                str2 = str2.substring(1);
            }
            java.lang.String host = uri.getHost();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (android.text.TextUtils.isEmpty(host)) {
                str = "";
            } else {
                str = host + ":";
            }
            sb.append(str);
            sb.append(str2);
            parseInt = this.resources.getIdentifier(sb.toString(), "raw", this.packageName);
            if (parseInt == 0) {
                throw new com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException("Resource not found.", null, 2005);
            }
        } else {
            throw new com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException("URI must either use scheme rawresource or android.resource", null, 1004);
        }
        transferInitializing(dataSpec);
        try {
            android.content.res.AssetFileDescriptor openRawResourceFd = this.resources.openRawResourceFd(parseInt);
            this.assetFileDescriptor = openRawResourceFd;
            if (openRawResourceFd == null) {
                throw new com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException("Resource is compressed: " + uri, null, 2000);
            }
            long length = openRawResourceFd.getLength();
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(openRawResourceFd.getFileDescriptor());
            this.inputStream = fileInputStream;
            if (length != -1) {
                try {
                    if (dataSpec.position > length) {
                        throw new com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException(null, null, 2008);
                    }
                } catch (com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException e) {
                    throw e;
                } catch (java.io.IOException e2) {
                    throw new com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException(null, e2, 2000);
                }
            }
            long startOffset = openRawResourceFd.getStartOffset();
            long skip = fileInputStream.skip(dataSpec.position + startOffset) - startOffset;
            if (skip != dataSpec.position) {
                throw new com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException(null, null, 2008);
            }
            if (length == -1) {
                java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.bytesRemaining = -1L;
                } else {
                    long size = channel.size() - channel.position();
                    this.bytesRemaining = size;
                    if (size < 0) {
                        throw new com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException(null, null, 2008);
                    }
                }
            } else {
                long j = length - skip;
                this.bytesRemaining = j;
                if (j < 0) {
                    throw new com.google.android.exoplayer2.upstream.DataSourceException(2008);
                }
            }
            if (dataSpec.length != -1) {
                long j2 = this.bytesRemaining;
                this.bytesRemaining = j2 == -1 ? dataSpec.length : java.lang.Math.min(j2, dataSpec.length);
            }
            this.opened = true;
            transferStarted(dataSpec);
            return dataSpec.length != -1 ? dataSpec.length : this.bytesRemaining;
        } catch (android.content.res.Resources.NotFoundException e3) {
            throw new com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException(null, e3, 2005);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) java.lang.Math.min(j, i2);
            } catch (java.io.IOException e) {
                throw new com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException(null, e, 2000);
            }
        }
        int read = ((java.io.InputStream) com.google.android.exoplayer2.util.Util.castNonNull(this.inputStream)).read(bArr, i, i2);
        if (read == -1) {
            if (this.bytesRemaining == -1) {
                return -1;
            }
            throw new com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException("End of stream reached having not read sufficient data.", new java.io.EOFException(), 2000);
        }
        long j2 = this.bytesRemaining;
        if (j2 != -1) {
            this.bytesRemaining = j2 - read;
        }
        bytesTransferred(read);
        return read;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public android.net.Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException {
        this.uri = null;
        try {
            try {
                java.io.InputStream inputStream = this.inputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.inputStream = null;
                try {
                    try {
                        android.content.res.AssetFileDescriptor assetFileDescriptor = this.assetFileDescriptor;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.assetFileDescriptor = null;
                        if (this.opened) {
                            this.opened = false;
                            transferEnded();
                        }
                    }
                } catch (java.io.IOException e) {
                    throw new com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException(null, e, 2000);
                }
            } catch (java.io.IOException e2) {
                throw new com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException(null, e2, 2000);
            }
        } catch (java.lang.Throwable th) {
            this.inputStream = null;
            try {
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptor2 = this.assetFileDescriptor;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        transferEnded();
                    }
                    throw th;
                } catch (java.io.IOException e3) {
                    throw new com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException(null, e3, 2000);
                }
            } finally {
                this.assetFileDescriptor = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
            }
        }
    }
}
