package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class ByteArrayDataSink implements com.google.android.exoplayer2.upstream.DataSink {
    private java.io.ByteArrayOutputStream stream;

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void open(com.google.android.exoplayer2.upstream.DataSpec dataSpec) {
        if (dataSpec.length == -1) {
            this.stream = new java.io.ByteArrayOutputStream();
        } else {
            com.google.android.exoplayer2.util.Assertions.checkArgument(dataSpec.length <= 2147483647L);
            this.stream = new java.io.ByteArrayOutputStream((int) dataSpec.length);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void close() throws java.io.IOException {
        ((java.io.ByteArrayOutputStream) com.google.android.exoplayer2.util.Util.castNonNull(this.stream)).close();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void write(byte[] bArr, int i, int i2) {
        ((java.io.ByteArrayOutputStream) com.google.android.exoplayer2.util.Util.castNonNull(this.stream)).write(bArr, i, i2);
    }

    public byte[] getData() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = this.stream;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }
}
