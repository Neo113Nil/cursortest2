package androidx.media3.datasource;

/* loaded from: classes2.dex */
public final class AesCipherDataSource implements androidx.media3.datasource.DataSource {
    private androidx.media3.datasource.AesFlushingCipher cipher;
    private final byte[] secretKey;
    private final androidx.media3.datasource.DataSource upstream;

    public AesCipherDataSource(byte[] bArr, androidx.media3.datasource.DataSource dataSource) {
        this.upstream = dataSource;
        this.secretKey = bArr;
    }

    @Override // androidx.media3.datasource.DataSource
    public void addTransferListener(androidx.media3.datasource.TransferListener transferListener) {
        androidx.media3.common.util.Assertions.checkNotNull(transferListener);
        this.upstream.addTransferListener(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        long open = this.upstream.open(dataSpec);
        this.cipher = new androidx.media3.datasource.AesFlushingCipher(2, this.secretKey, dataSpec.key, dataSpec.position + dataSpec.uriPositionOffset);
        return open;
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (i2 == 0) {
            return 0;
        }
        int read = this.upstream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        ((androidx.media3.datasource.AesFlushingCipher) androidx.media3.common.util.Util.castNonNull(this.cipher)).updateInPlace(bArr, i, read);
        return read;
    }

    @Override // androidx.media3.datasource.DataSource
    public android.net.Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() throws java.io.IOException {
        this.cipher = null;
        this.upstream.close();
    }
}
