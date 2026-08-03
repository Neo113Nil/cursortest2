package androidx.media3.datasource;

/* loaded from: classes2.dex */
public final class AesCipherDataSink implements androidx.media3.datasource.DataSink {
    private androidx.media3.datasource.AesFlushingCipher cipher;
    private final byte[] scratch;
    private final byte[] secretKey;
    private final androidx.media3.datasource.DataSink wrappedDataSink;

    public AesCipherDataSink(byte[] bArr, androidx.media3.datasource.DataSink dataSink) {
        this(bArr, dataSink, null);
    }

    public AesCipherDataSink(byte[] bArr, androidx.media3.datasource.DataSink dataSink, byte[] bArr2) {
        this.wrappedDataSink = dataSink;
        this.secretKey = bArr;
        this.scratch = bArr2;
    }

    @Override // androidx.media3.datasource.DataSink
    public void open(androidx.media3.datasource.DataSpec dataSpec) throws java.io.IOException {
        this.wrappedDataSink.open(dataSpec);
        this.cipher = new androidx.media3.datasource.AesFlushingCipher(1, this.secretKey, dataSpec.key, dataSpec.position + dataSpec.uriPositionOffset);
    }

    @Override // androidx.media3.datasource.DataSink
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.scratch == null) {
            ((androidx.media3.datasource.AesFlushingCipher) androidx.media3.common.util.Util.castNonNull(this.cipher)).updateInPlace(bArr, i, i2);
            this.wrappedDataSink.write(bArr, i, i2);
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            int min = java.lang.Math.min(i2 - i3, this.scratch.length);
            ((androidx.media3.datasource.AesFlushingCipher) androidx.media3.common.util.Util.castNonNull(this.cipher)).update(bArr, i + i3, min, this.scratch, 0);
            this.wrappedDataSink.write(this.scratch, 0, min);
            i3 += min;
        }
    }

    @Override // androidx.media3.datasource.DataSink
    public void close() throws java.io.IOException {
        this.cipher = null;
        this.wrappedDataSink.close();
    }
}
