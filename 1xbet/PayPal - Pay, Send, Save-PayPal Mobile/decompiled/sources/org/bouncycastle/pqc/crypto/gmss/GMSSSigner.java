package org.bouncycastle.pqc.crypto.gmss;

/* loaded from: classes17.dex */
public class GMSSSigner implements org.bouncycastle.pqc.crypto.MessageSigner {
    org.bouncycastle.pqc.crypto.gmss.GMSSKeyParameters Camera2StreamConfigurationMap;
    private org.bouncycastle.pqc.crypto.gmss.GMSSParameters getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.pqc.crypto.gmss.GMSSDigestProvider getHighSpeedVideoFpsRanges;
    private byte[][][] getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom getHighSpeedVideoSizes;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoSizesFor;
    private org.bouncycastle.crypto.Digest getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int[] getOutputFormats;
    private org.bouncycastle.pqc.crypto.gmss.util.GMSSUtil getOutputMinFrameDuration = new org.bouncycastle.pqc.crypto.gmss.util.GMSSUtil();
    private java.security.SecureRandom getOutputMinFrameDurationlomOqCM;
    private byte[] getOutputSizes;
    private org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature getOutputSizeshNQ4ISI;
    private byte[][] getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!z) {
            this.Camera2StreamConfigurationMap = (org.bouncycastle.pqc.crypto.gmss.GMSSPublicKeyParameters) cipherParameters;
            this.getHighSpeedVideoSizesFor.reset();
            org.bouncycastle.pqc.crypto.gmss.GMSSPublicKeyParameters gMSSPublicKeyParameters = (org.bouncycastle.pqc.crypto.gmss.GMSSPublicKeyParameters) this.Camera2StreamConfigurationMap;
            this.getOutputSizes = gMSSPublicKeyParameters.getPublicKey();
            org.bouncycastle.pqc.crypto.gmss.GMSSParameters parameters = gMSSPublicKeyParameters.getParameters();
            this.getHighResolutionOutputSizeshNQ4ISI = parameters;
            this.getOutputStallDurationlomOqCM = parameters.getNumOfLayers();
            return;
        }
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom)) {
            this.getOutputMinFrameDurationlomOqCM = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            this.Camera2StreamConfigurationMap = (org.bouncycastle.pqc.crypto.gmss.GMSSPrivateKeyParameters) cipherParameters;
            getHighResolutionOutputSizeshNQ4ISI();
        } else {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            this.getOutputMinFrameDurationlomOqCM = parametersWithRandom.getRandom();
            this.Camera2StreamConfigurationMap = (org.bouncycastle.pqc.crypto.gmss.GMSSPrivateKeyParameters) parametersWithRandom.getParameters();
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        this.getInputFormats.reset();
        int i = 0;
        for (int i2 = this.getOutputStallDurationlomOqCM - 1; i2 >= 0; i2--) {
            org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSVerify winternitzOTSVerify = new org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSVerify(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.getWinternitzParameter()[i2]);
            int signatureLength = winternitzOTSVerify.getSignatureLength();
            int bytesToIntLittleEndian = this.getOutputMinFrameDuration.bytesToIntLittleEndian(bArr2, i);
            int i3 = i + 4;
            byte[] bArr3 = new byte[signatureLength];
            java.lang.System.arraycopy(bArr2, i3, bArr3, 0, signatureLength);
            i = i3 + signatureLength;
            bArr = winternitzOTSVerify.Verify(bArr, bArr3);
            if (bArr == null) {
                java.lang.System.err.println("OTS Public Key is null in GMSSSignature.verify");
                return false;
            }
            byte[][] bArr4 = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, this.getHighResolutionOutputSizeshNQ4ISI.getHeightOfTrees()[i2], this.getInputSizeshNQ4ISI);
            for (byte[] bArr5 : bArr4) {
                java.lang.System.arraycopy(bArr2, i, bArr5, 0, this.getInputSizeshNQ4ISI);
                i += this.getInputSizeshNQ4ISI;
            }
            byte[] bArr6 = new byte[this.getInputSizeshNQ4ISI];
            int length = (1 << bArr4.length) + bytesToIntLittleEndian;
            for (int i4 = 0; i4 < bArr4.length; i4++) {
                int i5 = this.getInputSizeshNQ4ISI;
                int i6 = i5 << 1;
                byte[] bArr7 = new byte[i6];
                if (length % 2 == 0) {
                    java.lang.System.arraycopy(bArr, 0, bArr7, 0, i5);
                    byte[] bArr8 = bArr4[i4];
                    int i7 = this.getInputSizeshNQ4ISI;
                    java.lang.System.arraycopy(bArr8, 0, bArr7, i7, i7);
                } else {
                    java.lang.System.arraycopy(bArr4[i4], 0, bArr7, 0, i5);
                    java.lang.System.arraycopy(bArr, 0, bArr7, this.getInputSizeshNQ4ISI, bArr.length);
                    length--;
                }
                length /= 2;
                this.getHighSpeedVideoSizesFor.update(bArr7, 0, i6);
                bArr = new byte[this.getHighSpeedVideoSizesFor.getDigestSize()];
                this.getHighSpeedVideoSizesFor.doFinal(bArr, 0);
            }
        }
        return org.bouncycastle.util.Arrays.areEqual(this.getOutputSizes, bArr);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] bArr2 = new byte[this.getInputSizeshNQ4ISI];
        byte[] signature = this.getOutputSizeshNQ4ISI.getSignature(bArr);
        byte[] concatenateArray = this.getOutputMinFrameDuration.concatenateArray(this.getHighSpeedVideoFpsRangesFor[this.getOutputStallDurationlomOqCM - 1]);
        byte[] intToBytesLittleEndian = this.getOutputMinFrameDuration.intToBytesLittleEndian(this.getOutputFormats[this.getOutputStallDurationlomOqCM - 1]);
        int length = intToBytesLittleEndian.length + signature.length + concatenateArray.length;
        byte[] bArr3 = new byte[length];
        java.lang.System.arraycopy(intToBytesLittleEndian, 0, bArr3, 0, intToBytesLittleEndian.length);
        java.lang.System.arraycopy(signature, 0, bArr3, intToBytesLittleEndian.length, signature.length);
        java.lang.System.arraycopy(concatenateArray, 0, bArr3, intToBytesLittleEndian.length + signature.length, concatenateArray.length);
        byte[] bArr4 = new byte[0];
        for (int i = this.getOutputStallDurationlomOqCM - 2; i >= 0; i--) {
            byte[] concatenateArray2 = this.getOutputMinFrameDuration.concatenateArray(this.getHighSpeedVideoFpsRangesFor[i]);
            byte[] intToBytesLittleEndian2 = this.getOutputMinFrameDuration.intToBytesLittleEndian(this.getOutputFormats[i]);
            int length2 = bArr4.length;
            byte[] bArr5 = new byte[length2];
            java.lang.System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            bArr4 = new byte[intToBytesLittleEndian2.length + length2 + this.getOutputStallDuration[i].length + concatenateArray2.length];
            java.lang.System.arraycopy(bArr5, 0, bArr4, 0, length2);
            java.lang.System.arraycopy(intToBytesLittleEndian2, 0, bArr4, length2, intToBytesLittleEndian2.length);
            byte[] bArr6 = this.getOutputStallDuration[i];
            java.lang.System.arraycopy(bArr6, 0, bArr4, intToBytesLittleEndian2.length + length2, bArr6.length);
            java.lang.System.arraycopy(concatenateArray2, 0, bArr4, length2 + intToBytesLittleEndian2.length + this.getOutputStallDuration[i].length, concatenateArray2.length);
        }
        byte[] bArr7 = new byte[bArr4.length + length];
        java.lang.System.arraycopy(bArr3, 0, bArr7, 0, length);
        java.lang.System.arraycopy(bArr4, 0, bArr7, length, bArr4.length);
        return bArr7;
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        int i;
        this.getHighSpeedVideoSizesFor.reset();
        org.bouncycastle.pqc.crypto.gmss.GMSSPrivateKeyParameters gMSSPrivateKeyParameters = (org.bouncycastle.pqc.crypto.gmss.GMSSPrivateKeyParameters) this.Camera2StreamConfigurationMap;
        if (gMSSPrivateKeyParameters.isUsed()) {
            throw new java.lang.IllegalStateException("Private key already used");
        }
        if (gMSSPrivateKeyParameters.getIndex(0) >= gMSSPrivateKeyParameters.getNumLeafs(0)) {
            throw new java.lang.IllegalStateException("No more signatures can be generated");
        }
        org.bouncycastle.pqc.crypto.gmss.GMSSParameters parameters = gMSSPrivateKeyParameters.getParameters();
        this.getHighResolutionOutputSizeshNQ4ISI = parameters;
        this.getOutputStallDurationlomOqCM = parameters.getNumOfLayers();
        byte[] bArr = gMSSPrivateKeyParameters.getCurrentSeeds()[this.getOutputStallDurationlomOqCM - 1];
        int i2 = this.getInputSizeshNQ4ISI;
        byte[] bArr2 = new byte[i2];
        byte[] bArr3 = new byte[i2];
        java.lang.System.arraycopy(bArr, 0, bArr3, 0, i2);
        this.getOutputSizeshNQ4ISI = new org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature(this.getHighSpeedVideoSizes.nextSeed(bArr3), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.getWinternitzParameter()[this.getOutputStallDurationlomOqCM - 1]);
        byte[][][] currentAuthPaths = gMSSPrivateKeyParameters.getCurrentAuthPaths();
        this.getHighSpeedVideoFpsRangesFor = new byte[this.getOutputStallDurationlomOqCM][][];
        int i3 = 0;
        while (true) {
            i = this.getOutputStallDurationlomOqCM;
            if (i3 >= i) {
                break;
            }
            this.getHighSpeedVideoFpsRangesFor[i3] = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, currentAuthPaths[i3].length, this.getInputSizeshNQ4ISI);
            int i4 = 0;
            while (true) {
                byte[][] bArr4 = currentAuthPaths[i3];
                if (i4 < bArr4.length) {
                    java.lang.System.arraycopy(bArr4[i4], 0, this.getHighSpeedVideoFpsRangesFor[i3][i4], 0, this.getInputSizeshNQ4ISI);
                    i4++;
                }
            }
            i3++;
        }
        this.getOutputFormats = new int[i];
        java.lang.System.arraycopy(gMSSPrivateKeyParameters.getIndex(), 0, this.getOutputFormats, 0, this.getOutputStallDurationlomOqCM);
        this.getOutputStallDuration = new byte[this.getOutputStallDurationlomOqCM - 1][];
        for (int i5 = 0; i5 < this.getOutputStallDurationlomOqCM - 1; i5++) {
            byte[] subtreeRootSig = gMSSPrivateKeyParameters.getSubtreeRootSig(i5);
            byte[][] bArr5 = this.getOutputStallDuration;
            byte[] bArr6 = new byte[subtreeRootSig.length];
            bArr5[i5] = bArr6;
            java.lang.System.arraycopy(subtreeRootSig, 0, bArr6, 0, subtreeRootSig.length);
        }
        gMSSPrivateKeyParameters.markUsed();
    }

    public GMSSSigner(org.bouncycastle.pqc.crypto.gmss.GMSSDigestProvider gMSSDigestProvider) {
        this.getHighSpeedVideoFpsRanges = gMSSDigestProvider;
        org.bouncycastle.crypto.Digest digest = gMSSDigestProvider.get();
        this.getHighSpeedVideoSizesFor = digest;
        this.getInputFormats = digest;
        this.getInputSizeshNQ4ISI = digest.getDigestSize();
        this.getHighSpeedVideoSizes = new org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom(this.getHighSpeedVideoSizesFor);
    }
}
