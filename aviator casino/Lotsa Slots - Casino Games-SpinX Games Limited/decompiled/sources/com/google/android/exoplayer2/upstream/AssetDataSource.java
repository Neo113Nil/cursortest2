package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class AssetDataSource extends com.google.android.exoplayer2.upstream.BaseDataSource {
    private final android.content.res.AssetManager assetManager;
    private long bytesRemaining;
    private java.io.InputStream inputStream;
    private boolean opened;
    private android.net.Uri uri;

    public static final class AssetDataSourceException extends com.google.android.exoplayer2.upstream.DataSourceException {
        @java.lang.Deprecated
        public AssetDataSourceException(java.io.IOException iOException) {
            super(iOException, 2000);
        }

        public AssetDataSourceException(java.lang.Throwable th, int i) {
            super(th, i);
        }
    }

    public AssetDataSource(android.content.Context context) {
        super(false);
        this.assetManager = context.getAssets();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException {
        try {
            android.net.Uri uri = dataSpec.uri;
            this.uri = uri;
            java.lang.String str = (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING)) {
                str = str.substring(1);
            }
            transferInitializing(dataSpec);
            java.io.InputStream open = this.assetManager.open(str, 1);
            this.inputStream = open;
            if (open.skip(dataSpec.position) < dataSpec.position) {
                throw new com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException(null, 2008);
            }
            if (dataSpec.length != -1) {
                this.bytesRemaining = dataSpec.length;
            } else {
                long available = this.inputStream.available();
                this.bytesRemaining = available;
                if (available == 2147483647L) {
                    this.bytesRemaining = -1L;
                }
            }
            this.opened = true;
            transferStarted(dataSpec);
            return this.bytesRemaining;
        } catch (com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException(e2, e2 instanceof java.io.FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException {
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
                throw new com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException(e, 2000);
            }
        }
        int read = ((java.io.InputStream) com.google.android.exoplayer2.util.Util.castNonNull(this.inputStream)).read(bArr, i, i2);
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
    public void close() throws com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException {
        this.uri = null;
        try {
            try {
                java.io.InputStream inputStream = this.inputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (java.io.IOException e) {
                throw new com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException(e, 2000);
            }
        } finally {
            this.inputStream = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        }
    }
}
