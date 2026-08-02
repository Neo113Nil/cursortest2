package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class BaseKDFBytesGenerator implements org.bouncycastle.crypto.DigestDerivationFunction {
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(org.bouncycastle.crypto.DerivationParameters derivationParameters) {
        if (derivationParameters instanceof org.bouncycastle.crypto.params.KDFParameters) {
            org.bouncycastle.crypto.params.KDFParameters kDFParameters = (org.bouncycastle.crypto.params.KDFParameters) derivationParameters;
            this.getHighSpeedVideoSizes = kDFParameters.getSharedSecret();
            this.getHighResolutionOutputSizeshNQ4ISI = kDFParameters.getIV();
        } else {
            if (!(derivationParameters instanceof org.bouncycastle.crypto.params.ISO18033KDFParameters)) {
                throw new java.lang.IllegalArgumentException("KDF parameters required for generator");
            }
            this.getHighSpeedVideoSizes = ((org.bouncycastle.crypto.params.ISO18033KDFParameters) derivationParameters).getSeed();
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
    }

    @Override // org.bouncycastle.crypto.DigestDerivationFunction
    public org.bouncycastle.crypto.Digest getDigest() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalArgumentException {
        int i3 = i2;
        int i4 = i;
        if (bArr.length - i3 < i4) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too small");
        }
        long j = i3;
        int digestSize = this.getHighSpeedVideoFpsRanges.getDigestSize();
        if (j > 8589934591L) {
            throw new java.lang.IllegalArgumentException("Output length too large");
        }
        long j2 = digestSize;
        int i5 = (int) (((j + j2) - 1) / j2);
        byte[] bArr2 = new byte[this.getHighSpeedVideoFpsRanges.getDigestSize()];
        byte[] bArr3 = new byte[4];
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRangesFor, bArr3, 0);
        int i6 = this.getHighSpeedVideoFpsRangesFor & (-256);
        for (int i7 = 0; i7 < i5; i7++) {
            org.bouncycastle.crypto.Digest digest = this.getHighSpeedVideoFpsRanges;
            byte[] bArr4 = this.getHighSpeedVideoSizes;
            digest.update(bArr4, 0, bArr4.length);
            this.getHighSpeedVideoFpsRanges.update(bArr3, 0, 4);
            byte[] bArr5 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (bArr5 != null) {
                this.getHighSpeedVideoFpsRanges.update(bArr5, 0, bArr5.length);
            }
            this.getHighSpeedVideoFpsRanges.doFinal(bArr2, 0);
            if (i3 > digestSize) {
                java.lang.System.arraycopy(bArr2, 0, bArr, i4, digestSize);
                i4 += digestSize;
                i3 -= digestSize;
            } else {
                java.lang.System.arraycopy(bArr2, 0, bArr, i4, i3);
            }
            byte b = (byte) (bArr3[3] + 1);
            bArr3[3] = b;
            if (b == 0) {
                i6 += 256;
                org.bouncycastle.util.Pack.intToBigEndian(i6, bArr3, 0);
            }
        }
        this.getHighSpeedVideoFpsRanges.reset();
        return (int) j;
    }

    protected BaseKDFBytesGenerator(int i, org.bouncycastle.crypto.Digest digest) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = digest;
    }
}
