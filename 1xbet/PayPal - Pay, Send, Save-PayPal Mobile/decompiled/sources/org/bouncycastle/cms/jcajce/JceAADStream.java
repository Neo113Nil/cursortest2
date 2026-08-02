package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
class JceAADStream extends java.io.OutputStream {
    private static final byte[] getHighSpeedVideoFpsRangesFor = new byte[1];
    private javax.crypto.Cipher getHighSpeedVideoFpsRanges;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        this.getHighSpeedVideoFpsRanges.updateAAD(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws java.io.IOException {
        byte[] bArr = getHighSpeedVideoFpsRangesFor;
        bArr[0] = (byte) i;
        this.getHighSpeedVideoFpsRanges.updateAAD(bArr, 0, 1);
    }

    JceAADStream(javax.crypto.Cipher cipher) {
        this.getHighSpeedVideoFpsRanges = cipher;
    }
}
