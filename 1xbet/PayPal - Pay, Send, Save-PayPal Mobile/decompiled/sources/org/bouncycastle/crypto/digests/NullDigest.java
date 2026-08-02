package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public class NullDigest implements org.bouncycastle.crypto.Digest {
    private org.bouncycastle.crypto.digests.NullDigest.OpenByteArrayOutputStream Camera2StreamConfigurationMap = new org.bouncycastle.crypto.digests.NullDigest.OpenByteArrayOutputStream(0);

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        this.Camera2StreamConfigurationMap.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        this.Camera2StreamConfigurationMap.write(b);
    }

    static class OpenByteArrayOutputStream extends java.io.ByteArrayOutputStream {
        @Override // java.io.ByteArrayOutputStream
        public void reset() {
            super.reset();
            org.bouncycastle.util.Arrays.clear(this.buf);
        }

        final void getHighSpeedVideoFpsRangesFor(byte[] bArr, int i) {
            java.lang.System.arraycopy(this.buf, 0, bArr, i, size());
        }

        /* synthetic */ OpenByteArrayOutputStream(byte b) {
            this();
        }

        private OpenByteArrayOutputStream() {
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.Camera2StreamConfigurationMap.reset();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.Camera2StreamConfigurationMap.size();
    }

    @Override // org.bouncycastle.crypto.Digest
    public java.lang.String getAlgorithmName() {
        return "NULL";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        int size = this.Camera2StreamConfigurationMap.size();
        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(bArr, i);
        reset();
        return size;
    }
}
