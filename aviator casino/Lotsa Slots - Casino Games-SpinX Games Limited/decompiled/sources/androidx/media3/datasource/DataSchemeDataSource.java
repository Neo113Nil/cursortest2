package androidx.media3.datasource;

/* loaded from: classes2.dex */
public final class DataSchemeDataSource extends androidx.media3.datasource.BaseDataSource {
    public static final java.lang.String SCHEME_DATA = "data";
    private int bytesRemaining;
    private byte[] data;
    private androidx.media3.datasource.DataSpec dataSpec;
    private int readPosition;

    public DataSchemeDataSource() {
        super(false);
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        transferInitializing(dataSpec);
        this.dataSpec = dataSpec;
        android.net.Uri normalizeScheme = dataSpec.uri.normalizeScheme();
        java.lang.String scheme = normalizeScheme.getScheme();
        androidx.media3.common.util.Assertions.checkArgument("data".equals(scheme), "Unsupported scheme: " + scheme);
        java.lang.String[] split = androidx.media3.common.util.Util.split(normalizeScheme.getSchemeSpecificPart(), ",");
        if (split.length != 2) {
            throw androidx.media3.common.ParserException.createForMalformedDataOfUnknownType("Unexpected URI format: " + normalizeScheme, null);
        }
        java.lang.String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.data = android.util.Base64.decode(str, 0);
            } catch (java.lang.IllegalArgumentException e) {
                throw androidx.media3.common.ParserException.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e);
            }
        } else {
            this.data = androidx.media3.common.util.Util.getUtf8Bytes(java.net.URLDecoder.decode(str, com.google.common.base.Charsets.US_ASCII.name()));
        }
        if (dataSpec.position > this.data.length) {
            this.data = null;
            throw new androidx.media3.datasource.DataSourceException(2008);
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

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.bytesRemaining;
        if (i3 == 0) {
            return -1;
        }
        int min = java.lang.Math.min(i2, i3);
        java.lang.System.arraycopy(androidx.media3.common.util.Util.castNonNull(this.data), this.readPosition, bArr, i, min);
        this.readPosition += min;
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
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
    public void close() {
        if (this.data != null) {
            this.data = null;
            transferEnded();
        }
        this.dataSpec = null;
    }
}
