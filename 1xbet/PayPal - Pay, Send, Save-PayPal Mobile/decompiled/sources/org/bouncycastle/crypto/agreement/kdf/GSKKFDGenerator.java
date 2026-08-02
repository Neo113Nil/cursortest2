package org.bouncycastle.crypto.agreement.kdf;

/* loaded from: classes17.dex */
public class GSKKFDGenerator implements org.bouncycastle.crypto.DigestDerivationFunction {
    private final org.bouncycastle.crypto.Digest Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(org.bouncycastle.crypto.DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof org.bouncycastle.crypto.agreement.kdf.GSKKDFParameters)) {
            throw new java.lang.IllegalArgumentException("unkown parameters type");
        }
        org.bouncycastle.crypto.agreement.kdf.GSKKDFParameters gSKKDFParameters = (org.bouncycastle.crypto.agreement.kdf.GSKKDFParameters) derivationParameters;
        this.getHighSpeedVideoFpsRangesFor = gSKKDFParameters.getZ();
        this.getHighSpeedVideoFpsRanges = gSKKDFParameters.getStartCounter();
        this.getHighSpeedVideoSizes = gSKKDFParameters.getNonce();
    }

    @Override // org.bouncycastle.crypto.DigestDerivationFunction
    public org.bouncycastle.crypto.Digest getDigest() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalArgumentException {
        if (i + i2 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("output buffer too small");
        }
        org.bouncycastle.crypto.Digest digest = this.Camera2StreamConfigurationMap;
        byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
        digest.update(bArr2, 0, bArr2.length);
        int i3 = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = i3 + 1;
        byte[] intToBigEndian = org.bouncycastle.util.Pack.intToBigEndian(i3);
        this.Camera2StreamConfigurationMap.update(intToBigEndian, 0, intToBigEndian.length);
        byte[] bArr3 = this.getHighSpeedVideoSizes;
        if (bArr3 != null) {
            this.Camera2StreamConfigurationMap.update(bArr3, 0, bArr3.length);
        }
        this.Camera2StreamConfigurationMap.doFinal(this.getHighResolutionOutputSizeshNQ4ISI, 0);
        java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr, i, i2);
        org.bouncycastle.util.Arrays.clear(this.getHighResolutionOutputSizeshNQ4ISI);
        return i2;
    }

    public GSKKFDGenerator(org.bouncycastle.crypto.Digest digest) {
        this.Camera2StreamConfigurationMap = digest;
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[digest.getDigestSize()];
    }
}
