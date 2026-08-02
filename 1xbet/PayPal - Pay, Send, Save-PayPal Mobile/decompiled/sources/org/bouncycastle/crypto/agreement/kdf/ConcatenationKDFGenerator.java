package org.bouncycastle.crypto.agreement.kdf;

/* loaded from: classes17.dex */
public class ConcatenationKDFGenerator implements org.bouncycastle.crypto.DerivationFunction {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalArgumentException {
        int i3;
        int i4;
        if (bArr.length - i2 < i) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too small");
        }
        byte[] bArr2 = new byte[this.getHighResolutionOutputSizeshNQ4ISI];
        byte[] bArr3 = new byte[4];
        this.getHighSpeedVideoSizes.reset();
        if (i2 > this.getHighResolutionOutputSizeshNQ4ISI) {
            int i5 = 1;
            i4 = 0;
            while (true) {
                bArr3[0] = (byte) (i5 >>> 24);
                bArr3[1] = (byte) (i5 >>> 16);
                bArr3[2] = (byte) (i5 >>> 8);
                bArr3[3] = (byte) i5;
                this.getHighSpeedVideoSizes.update(bArr3, 0, 4);
                org.bouncycastle.crypto.Digest digest = this.getHighSpeedVideoSizes;
                byte[] bArr4 = this.getHighSpeedVideoFpsRangesFor;
                digest.update(bArr4, 0, bArr4.length);
                org.bouncycastle.crypto.Digest digest2 = this.getHighSpeedVideoSizes;
                byte[] bArr5 = this.getHighSpeedVideoFpsRanges;
                digest2.update(bArr5, 0, bArr5.length);
                this.getHighSpeedVideoSizes.doFinal(bArr2, 0);
                java.lang.System.arraycopy(bArr2, 0, bArr, i + i4, this.getHighResolutionOutputSizeshNQ4ISI);
                int i6 = this.getHighResolutionOutputSizeshNQ4ISI;
                i4 += i6;
                i3 = i5 + 1;
                if (i5 >= i2 / i6) {
                    break;
                }
                i5 = i3;
            }
        } else {
            i3 = 1;
            i4 = 0;
        }
        if (i4 < i2) {
            bArr3[0] = (byte) (i3 >>> 24);
            bArr3[1] = (byte) (i3 >>> 16);
            bArr3[2] = (byte) (i3 >>> 8);
            bArr3[3] = (byte) i3;
            this.getHighSpeedVideoSizes.update(bArr3, 0, 4);
            org.bouncycastle.crypto.Digest digest3 = this.getHighSpeedVideoSizes;
            byte[] bArr6 = this.getHighSpeedVideoFpsRangesFor;
            digest3.update(bArr6, 0, bArr6.length);
            org.bouncycastle.crypto.Digest digest4 = this.getHighSpeedVideoSizes;
            byte[] bArr7 = this.getHighSpeedVideoFpsRanges;
            digest4.update(bArr7, 0, bArr7.length);
            this.getHighSpeedVideoSizes.doFinal(bArr2, 0);
            java.lang.System.arraycopy(bArr2, 0, bArr, i + i4, i2 - i4);
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(org.bouncycastle.crypto.DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof org.bouncycastle.crypto.params.KDFParameters)) {
            throw new java.lang.IllegalArgumentException("KDF parameters required for generator");
        }
        org.bouncycastle.crypto.params.KDFParameters kDFParameters = (org.bouncycastle.crypto.params.KDFParameters) derivationParameters;
        this.getHighSpeedVideoFpsRangesFor = kDFParameters.getSharedSecret();
        this.getHighSpeedVideoFpsRanges = kDFParameters.getIV();
    }

    public org.bouncycastle.crypto.Digest getDigest() {
        return this.getHighSpeedVideoSizes;
    }

    public ConcatenationKDFGenerator(org.bouncycastle.crypto.Digest digest) {
        this.getHighSpeedVideoSizes = digest;
        this.getHighResolutionOutputSizeshNQ4ISI = digest.getDigestSize();
    }
}
