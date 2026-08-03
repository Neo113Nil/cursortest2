package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class DataSchemeDataSource extends com.google.android.exoplayer2.upstream.BaseDataSource {
    public static final java.lang.String SCHEME_DATA = "data";
    private int bytesRemaining;
    private byte[] data;
    private com.google.android.exoplayer2.upstream.DataSpec dataSpec;
    private int readPosition;

    public DataSchemeDataSource() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws java.io.IOException {
        transferInitializing(dataSpec);
        this.dataSpec = dataSpec;
        android.net.Uri uri = dataSpec.uri;
        java.lang.String scheme = uri.getScheme();
        com.google.android.exoplayer2.util.Assertions.checkArgument("data".equals(scheme), "Unsupported scheme: " + scheme);
        java.lang.String[] split = com.google.android.exoplayer2.util.Util.split(uri.getSchemeSpecificPart(), ",");
        if (split.length != 2) {
            throw com.google.android.exoplayer2.ParserException.createForMalformedDataOfUnknownType("Unexpected URI format: " + uri, null);
        }
        java.lang.String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.data = android.util.Base64.decode(str, 0);
            } catch (java.lang.IllegalArgumentException e) {
                throw com.google.android.exoplayer2.ParserException.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e);
            }
        } else {
            this.data = com.google.android.exoplayer2.util.Util.getUtf8Bytes(java.net.URLDecoder.decode(str, com.google.common.base.Charsets.US_ASCII.name()));
        }
        if (dataSpec.position > this.data.length) {
            this.data = null;
            throw new com.google.android.exoplayer2.upstream.DataSourceException(2008);
        }
        int i = (int) dataSpec.position;
        this.readPosition = i;
        this.bytesRemaining = this.data.length - i;
        if (dataSpec.length != -1) {
            this.bytesRemaining = (int) java.lang.Math.min(this.bytesRemaining, dataSpec.length);
        }
        transferStarted(dataSpec);
        return dataSpec.length != -1 ? dataSpec.length : this.bytesRemaining;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.bytesRemaining;
        if (i3 == 0) {
            return -1;
        }
        int min = java.lang.Math.min(i2, i3);
        java.lang.System.arraycopy(com.google.android.exoplayer2.util.Util.castNonNull(this.data), this.readPosition, bArr, i, min);
        this.readPosition += min;
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public android.net.Uri getUri() {
        com.google.android.exoplayer2.upstream.DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.data != null) {
            this.data = null;
            transferEnded();
        }
        this.dataSpec = null;
    }
}
