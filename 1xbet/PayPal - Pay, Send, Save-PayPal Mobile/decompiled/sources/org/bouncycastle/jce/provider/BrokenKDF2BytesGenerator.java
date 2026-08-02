package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class BrokenKDF2BytesGenerator implements org.bouncycastle.crypto.DerivationFunction {
    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(org.bouncycastle.crypto.DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof org.bouncycastle.crypto.params.KDFParameters)) {
            throw new java.lang.IllegalArgumentException("KDF parameters required for generator");
        }
        org.bouncycastle.crypto.params.KDFParameters kDFParameters = (org.bouncycastle.crypto.params.KDFParameters) derivationParameters;
        this.getHighSpeedVideoFpsRangesFor = kDFParameters.getSharedSecret();
        this.getHighSpeedVideoSizes = kDFParameters.getIV();
    }

    public org.bouncycastle.crypto.Digest getDigest() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalArgumentException {
        if (bArr.length - i2 < i) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too small");
        }
        long j = i2 * 8;
        if (j > this.getHighSpeedVideoFpsRanges.getDigestSize() * 17179869184L) {
            throw new java.lang.IllegalArgumentException("Output length too large");
        }
        int digestSize = (int) (j / this.getHighSpeedVideoFpsRanges.getDigestSize());
        int digestSize2 = this.getHighSpeedVideoFpsRanges.getDigestSize();
        byte[] bArr2 = new byte[digestSize2];
        for (int i3 = 1; i3 <= digestSize; i3++) {
            org.bouncycastle.crypto.Digest digest = this.getHighSpeedVideoFpsRanges;
            byte[] bArr3 = this.getHighSpeedVideoFpsRangesFor;
            digest.update(bArr3, 0, bArr3.length);
            this.getHighSpeedVideoFpsRanges.update((byte) (i3 & 255));
            this.getHighSpeedVideoFpsRanges.update((byte) ((i3 >> 8) & 255));
            this.getHighSpeedVideoFpsRanges.update((byte) ((i3 >> 16) & 255));
            this.getHighSpeedVideoFpsRanges.update((byte) ((i3 >> 24) & 255));
            org.bouncycastle.crypto.Digest digest2 = this.getHighSpeedVideoFpsRanges;
            byte[] bArr4 = this.getHighSpeedVideoSizes;
            digest2.update(bArr4, 0, bArr4.length);
            this.getHighSpeedVideoFpsRanges.doFinal(bArr2, 0);
            int i4 = i2 - i;
            if (i4 > digestSize2) {
                java.lang.System.arraycopy(bArr2, 0, bArr, i, digestSize2);
                i += digestSize2;
            } else {
                java.lang.System.arraycopy(bArr2, 0, bArr, i, i4);
            }
        }
        this.getHighSpeedVideoFpsRanges.reset();
        return i2;
    }

    public BrokenKDF2BytesGenerator(org.bouncycastle.crypto.Digest digest) {
        this.getHighSpeedVideoFpsRanges = digest;
    }
}
