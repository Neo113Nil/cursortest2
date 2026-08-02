package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class MGF1BytesGenerator implements org.bouncycastle.crypto.DerivationFunction {
    private int Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalArgumentException {
        int i3;
        if (bArr.length - i2 < i) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too small");
        }
        byte[] bArr2 = new byte[this.Camera2StreamConfigurationMap];
        byte[] bArr3 = new byte[4];
        this.getHighResolutionOutputSizeshNQ4ISI.reset();
        if (i2 > this.Camera2StreamConfigurationMap) {
            i3 = 0;
            do {
                bArr3[0] = (byte) (i3 >>> 24);
                bArr3[1] = (byte) (i3 >>> 16);
                bArr3[2] = (byte) (i3 >>> 8);
                bArr3[3] = (byte) i3;
                org.bouncycastle.crypto.Digest digest = this.getHighResolutionOutputSizeshNQ4ISI;
                byte[] bArr4 = this.getHighSpeedVideoFpsRanges;
                digest.update(bArr4, 0, bArr4.length);
                this.getHighResolutionOutputSizeshNQ4ISI.update(bArr3, 0, 4);
                this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr2, 0);
                int i4 = this.Camera2StreamConfigurationMap;
                java.lang.System.arraycopy(bArr2, 0, bArr, (i3 * i4) + i, i4);
                i3++;
            } while (i3 < i2 / this.Camera2StreamConfigurationMap);
        } else {
            i3 = 0;
        }
        if (this.Camera2StreamConfigurationMap * i3 < i2) {
            bArr3[0] = (byte) (i3 >>> 24);
            bArr3[1] = (byte) (i3 >>> 16);
            bArr3[2] = (byte) (i3 >>> 8);
            bArr3[3] = (byte) i3;
            org.bouncycastle.crypto.Digest digest2 = this.getHighResolutionOutputSizeshNQ4ISI;
            byte[] bArr5 = this.getHighSpeedVideoFpsRanges;
            digest2.update(bArr5, 0, bArr5.length);
            this.getHighResolutionOutputSizeshNQ4ISI.update(bArr3, 0, 4);
            this.getHighResolutionOutputSizeshNQ4ISI.doFinal(bArr2, 0);
            int i5 = i3 * this.Camera2StreamConfigurationMap;
            java.lang.System.arraycopy(bArr2, 0, bArr, i + i5, i2 - i5);
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(org.bouncycastle.crypto.DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof org.bouncycastle.crypto.params.MGFParameters)) {
            throw new java.lang.IllegalArgumentException("MGF parameters required for MGF1Generator");
        }
        this.getHighSpeedVideoFpsRanges = ((org.bouncycastle.crypto.params.MGFParameters) derivationParameters).getSeed();
    }

    public org.bouncycastle.crypto.Digest getDigest() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public MGF1BytesGenerator(org.bouncycastle.crypto.Digest digest) {
        this.getHighResolutionOutputSizeshNQ4ISI = digest;
        this.Camera2StreamConfigurationMap = digest.getDigestSize();
    }
}
