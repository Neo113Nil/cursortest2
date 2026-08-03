package androidx.media3.datasource;

/* loaded from: classes2.dex */
public final class RawResourceDataSource extends androidx.media3.datasource.BaseDataSource {

    @java.lang.Deprecated
    public static final java.lang.String RAW_RESOURCE_SCHEME = "rawresource";
    private final android.content.Context applicationContext;
    private android.content.res.AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;
    private androidx.media3.datasource.DataSpec dataSpec;
    private java.io.InputStream inputStream;
    private boolean opened;

    public static class RawResourceDataSourceException extends androidx.media3.datasource.DataSourceException {
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

    @java.lang.Deprecated
    public static android.net.Uri buildRawResourceUri(int i) {
        return android.net.Uri.parse("rawresource:///" + i);
    }

    public RawResourceDataSource(android.content.Context context) {
        super(false);
        this.applicationContext = context.getApplicationContext();
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException {
        this.dataSpec = dataSpec;
        transferInitializing(dataSpec);
        android.content.res.AssetFileDescriptor openAssetFileDescriptor = openAssetFileDescriptor(this.applicationContext, dataSpec);
        this.assetFileDescriptor = openAssetFileDescriptor;
        long length = openAssetFileDescriptor.getLength();
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.assetFileDescriptor.getFileDescriptor());
        this.inputStream = fileInputStream;
        if (length != -1) {
            try {
                if (dataSpec.position > length) {
                    throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, null, 2008);
                }
            } catch (androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException e) {
                throw e;
            } catch (java.io.IOException e2) {
                throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, e2, 2000);
            }
        }
        long startOffset = this.assetFileDescriptor.getStartOffset();
        long skip = fileInputStream.skip(dataSpec.position + startOffset) - startOffset;
        if (skip != dataSpec.position) {
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, null, 2008);
        }
        if (length == -1) {
            java.nio.channels.FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.bytesRemaining = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.bytesRemaining = size;
                if (size < 0) {
                    throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, null, 2008);
                }
            }
        } else {
            long j = length - skip;
            this.bytesRemaining = j;
            if (j < 0) {
                throw new androidx.media3.datasource.DataSourceException(2008);
            }
        }
        if (dataSpec.length != -1) {
            long j2 = this.bytesRemaining;
            this.bytesRemaining = j2 == -1 ? dataSpec.length : java.lang.Math.min(j2, dataSpec.length);
        }
        this.opened = true;
        transferStarted(dataSpec);
        return dataSpec.length != -1 ? dataSpec.length : this.bytesRemaining;
    }

    private static android.content.res.AssetFileDescriptor openAssetFileDescriptor(android.content.Context context, androidx.media3.datasource.DataSpec dataSpec) throws androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException {
        java.lang.String host;
        android.content.res.Resources resourcesForApplication;
        int identifier;
        android.net.Uri normalizeScheme = dataSpec.uri.normalizeScheme();
        if (android.text.TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            java.util.List<java.lang.String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                identifier = parseResourceId(pathSegments.get(0));
            } else {
                throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
        } else if (android.text.TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            java.lang.String str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(normalizeScheme.getPath());
            if (str.startsWith(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING)) {
                str = str.substring(1);
            }
            if (android.text.TextUtils.isEmpty(normalizeScheme.getHost())) {
                host = context.getPackageName();
            } else {
                host = normalizeScheme.getHost();
            }
            if (host.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(host);
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (str.matches("\\d+")) {
                identifier = parseResourceId(str);
            } else {
                identifier = resourcesForApplication.getIdentifier(host + ":" + str, "raw", null);
                if (identifier == 0) {
                    throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
        } else {
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
        }
        try {
            android.content.res.AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("Resource is compressed: " + normalizeScheme, null, 2000);
        } catch (android.content.res.Resources.NotFoundException e2) {
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, e2, 2005);
        }
    }

    private static int parseResourceId(java.lang.String str) throws androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException {
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException {
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
                throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, e, 2000);
            }
        }
        int read = ((java.io.InputStream) androidx.media3.common.util.Util.castNonNull(this.inputStream)).read(bArr, i, i2);
        if (read == -1) {
            if (this.bytesRemaining == -1) {
                return -1;
            }
            throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException("End of stream reached having not read sufficient data.", new java.io.EOFException(), 2000);
        }
        long j2 = this.bytesRemaining;
        if (j2 != -1) {
            this.bytesRemaining = j2 - read;
        }
        bytesTransferred(read);
        return read;
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        androidx.media3.datasource.DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() throws androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException {
        this.dataSpec = null;
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
                    throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, e, 2000);
                }
            } catch (java.io.IOException e2) {
                throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, e2, 2000);
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
                    throw new androidx.media3.datasource.RawResourceDataSource.RawResourceDataSourceException(null, e3, 2000);
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
