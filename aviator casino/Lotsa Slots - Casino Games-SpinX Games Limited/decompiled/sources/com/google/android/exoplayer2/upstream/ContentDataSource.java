package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class ContentDataSource extends com.google.android.exoplayer2.upstream.BaseDataSource {
    private android.content.res.AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;
    private java.io.FileInputStream inputStream;
    private boolean opened;
    private final android.content.ContentResolver resolver;
    private android.net.Uri uri;

    public static class ContentDataSourceException extends com.google.android.exoplayer2.upstream.DataSourceException {
        @java.lang.Deprecated
        public ContentDataSourceException(java.io.IOException iOException) {
            this(iOException, 2000);
        }

        public ContentDataSourceException(java.io.IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public ContentDataSource(android.content.Context context) {
        super(false);
        this.resolver = context.getContentResolver();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException {
        android.content.res.AssetFileDescriptor openAssetFileDescriptor;
        try {
            android.net.Uri uri = dataSpec.uri;
            this.uri = uri;
            transferInitializing(dataSpec);
            if ("content".equals(dataSpec.uri.getScheme())) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.resolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.resolver.openAssetFileDescriptor(uri, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            }
            this.assetFileDescriptor = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException(new java.io.IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.inputStream = fileInputStream;
            if (length != -1 && dataSpec.position > length) {
                throw new com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(dataSpec.position + startOffset) - startOffset;
            if (skip != dataSpec.position) {
                throw new com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.bytesRemaining = -1L;
                } else {
                    long position = size - channel.position();
                    this.bytesRemaining = position;
                    if (position < 0) {
                        throw new com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j = length - skip;
                this.bytesRemaining = j;
                if (j < 0) {
                    throw new com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException(null, 2008);
                }
            }
            if (dataSpec.length != -1) {
                long j2 = this.bytesRemaining;
                this.bytesRemaining = j2 == -1 ? dataSpec.length : java.lang.Math.min(j2, dataSpec.length);
            }
            this.opened = true;
            transferStarted(dataSpec);
            return dataSpec.length != -1 ? dataSpec.length : this.bytesRemaining;
        } catch (com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException(e2, e2 instanceof java.io.FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException {
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
                throw new com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException(e, 2000);
            }
        }
        int read = ((java.io.FileInputStream) com.google.android.exoplayer2.util.Util.castNonNull(this.inputStream)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
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
    public void close() throws com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException {
        this.uri = null;
        try {
            try {
                java.io.FileInputStream fileInputStream = this.inputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
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
                    throw new com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException(e, 2000);
                }
            } catch (java.io.IOException e2) {
                throw new com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException(e2, 2000);
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
                    throw new com.google.android.exoplayer2.upstream.ContentDataSource.ContentDataSourceException(e3, 2000);
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
