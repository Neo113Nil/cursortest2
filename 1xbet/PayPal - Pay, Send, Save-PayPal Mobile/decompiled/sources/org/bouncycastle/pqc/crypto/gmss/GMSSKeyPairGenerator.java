package org.bouncycastle.pqc.crypto.gmss;

/* loaded from: classes17.dex */
public class GMSSKeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    public static final java.lang.String OID = "1.3.6.1.4.1.8301.3.1.3.3";
    private byte[][] Camera2StreamConfigurationMap;
    private int[] getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.pqc.crypto.gmss.GMSSParameters getHighSpeedVideoFpsRanges;
    private org.bouncycastle.pqc.crypto.gmss.GMSSDigestProvider getHighSpeedVideoFpsRangesFor;
    private byte[][] getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor = false;
    private int[] getInputFormats;
    private org.bouncycastle.pqc.crypto.gmss.GMSSKeyGenerationParameters getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom getOutputMinFrameDuration;
    private byte[][] getOutputMinFrameDurationlomOqCM;
    private org.bouncycastle.crypto.Digest getOutputSizes;
    private int[] getOutputStallDuration;
    private int getOutputStallDurationlomOqCM;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        int i;
        int i2;
        java.util.Vector[] vectorArr;
        if (!this.getHighSpeedVideoSizesFor) {
            initialize(new org.bouncycastle.pqc.crypto.gmss.GMSSKeyGenerationParameters(null, new org.bouncycastle.pqc.crypto.gmss.GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{3, 3, 3, 3}, new int[]{2, 2, 2, 2})));
        }
        int i3 = this.getOutputStallDurationlomOqCM;
        byte[][][] bArr = new byte[i3][][];
        int i4 = i3 - 1;
        byte[][][] bArr2 = new byte[i4][][];
        org.bouncycastle.pqc.crypto.gmss.Treehash[][] treehashArr = new org.bouncycastle.pqc.crypto.gmss.Treehash[i3][];
        org.bouncycastle.pqc.crypto.gmss.Treehash[][] treehashArr2 = new org.bouncycastle.pqc.crypto.gmss.Treehash[i4][];
        java.util.Vector[] vectorArr2 = new java.util.Vector[i3];
        java.util.Vector[] vectorArr3 = new java.util.Vector[i4];
        java.util.Vector[][] vectorArr4 = new java.util.Vector[i3][];
        java.util.Vector[][] vectorArr5 = new java.util.Vector[i4][];
        boolean z = false;
        int i5 = 0;
        while (true) {
            i = this.getOutputStallDurationlomOqCM;
            if (i5 >= i) {
                break;
            }
            bArr[i5] = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, this.getInputFormats[i5], this.getOutputFormats);
            int i6 = this.getInputFormats[i5];
            treehashArr[i5] = new org.bouncycastle.pqc.crypto.gmss.Treehash[i6 - this.getHighResolutionOutputSizeshNQ4ISI[i5]];
            if (i5 > 0) {
                int i7 = i5 - 1;
                bArr2[i7] = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, i6, this.getOutputFormats);
                treehashArr2[i7] = new org.bouncycastle.pqc.crypto.gmss.Treehash[this.getInputFormats[i5] - this.getHighResolutionOutputSizeshNQ4ISI[i5]];
            }
            vectorArr2[i5] = new java.util.Vector();
            if (i5 > 0) {
                vectorArr3[i5 - 1] = new java.util.Vector();
            }
            i5++;
        }
        byte[][] bArr3 = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, i, this.getOutputFormats);
        byte[][] bArr4 = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, this.getOutputStallDurationlomOqCM - 1, this.getOutputFormats);
        byte[][] bArr5 = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, this.getOutputStallDurationlomOqCM, this.getOutputFormats);
        int i8 = 0;
        while (true) {
            i2 = this.getOutputStallDurationlomOqCM;
            if (i8 >= i2) {
                break;
            }
            java.lang.System.arraycopy(this.Camera2StreamConfigurationMap[i8], 0, bArr5[i8], 0, this.getOutputFormats);
            i8++;
        }
        int i9 = 1;
        this.getHighSpeedVideoSizes = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, i2 - 1, this.getOutputFormats);
        int i10 = this.getOutputStallDurationlomOqCM - 1;
        while (i10 >= 0) {
            org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc highSpeedVideoSizes = i10 == this.getOutputStallDurationlomOqCM - i9 ? getHighSpeedVideoSizes(null, vectorArr2[i10], bArr5[i10], i10) : getHighSpeedVideoSizes(bArr3[i10 + 1], vectorArr2[i10], bArr5[i10], i10);
            int i11 = 0;
            while (i11 < this.getInputFormats[i10]) {
                java.lang.System.arraycopy(highSpeedVideoSizes.getAuthPath()[i11], 0, bArr[i10][i11], 0, this.getOutputFormats);
                i11++;
                bArr = bArr;
                vectorArr2 = vectorArr2;
            }
            vectorArr4[i10] = highSpeedVideoSizes.getRetain();
            treehashArr[i10] = highSpeedVideoSizes.getTreehash();
            java.lang.System.arraycopy(highSpeedVideoSizes.getRoot(), 0, bArr3[i10], 0, this.getOutputFormats);
            i10--;
            i9 = 1;
        }
        byte[][][] bArr6 = bArr;
        java.util.Vector[] vectorArr6 = vectorArr2;
        int i12 = this.getOutputStallDurationlomOqCM - 2;
        while (i12 >= 0) {
            java.util.Vector vector = vectorArr3[i12];
            int i13 = i12 + 1;
            byte[] bArr7 = bArr5[i13];
            byte[] bArr8 = new byte[this.getOutputStallDurationlomOqCM];
            java.util.Vector[][] vectorArr7 = vectorArr4;
            org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc gMSSRootCalc = new org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc(this.getInputFormats[i13], this.getHighResolutionOutputSizeshNQ4ISI[i13], this.getHighSpeedVideoFpsRangesFor);
            gMSSRootCalc.initialize(vector);
            int i14 = 0;
            int i15 = 0;
            int i16 = 3;
            while (true) {
                int i17 = this.getInputFormats[i13];
                vectorArr = vectorArr3;
                if (i14 >= (1 << i17)) {
                    break;
                }
                if (i14 == i16 && i15 < i17 - this.getHighResolutionOutputSizeshNQ4ISI[i13]) {
                    gMSSRootCalc.initializeTreehashSeed(bArr7, i15);
                    i16 *= 2;
                    i15++;
                }
                gMSSRootCalc.update(new org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature(this.getOutputMinFrameDuration.nextSeed(bArr7), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputStallDuration[i13]).getPublicKey());
                i14++;
                vectorArr3 = vectorArr;
                i15 = i15;
                bArr7 = bArr7;
            }
            if (!gMSSRootCalc.wasFinished()) {
                java.lang.System.err.println("N�chster Baum noch nicht fertig konstruiert!!!");
                gMSSRootCalc = null;
            }
            for (int i18 = 0; i18 < this.getInputFormats[i13]; i18++) {
                java.lang.System.arraycopy(gMSSRootCalc.getAuthPath()[i18], 0, bArr2[i12][i18], 0, this.getOutputFormats);
            }
            vectorArr5[i12] = gMSSRootCalc.getRetain();
            treehashArr2[i12] = gMSSRootCalc.getTreehash();
            java.lang.System.arraycopy(gMSSRootCalc.getRoot(), 0, bArr4[i12], 0, this.getOutputFormats);
            java.lang.System.arraycopy(bArr5[i13], 0, this.getOutputMinFrameDurationlomOqCM[i12], 0, this.getOutputFormats);
            i12--;
            z = false;
            vectorArr4 = vectorArr7;
            vectorArr3 = vectorArr;
        }
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.pqc.crypto.gmss.GMSSPublicKeyParameters(bArr3[z ? 1 : 0], this.getHighSpeedVideoFpsRanges), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.pqc.crypto.gmss.GMSSPrivateKeyParameters(this.Camera2StreamConfigurationMap, this.getOutputMinFrameDurationlomOqCM, bArr6, bArr2, treehashArr, treehashArr2, vectorArr6, vectorArr3, vectorArr4, vectorArr5, bArr4, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor));
    }

    public void initialize(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        org.bouncycastle.pqc.crypto.gmss.GMSSKeyGenerationParameters gMSSKeyGenerationParameters = (org.bouncycastle.pqc.crypto.gmss.GMSSKeyGenerationParameters) keyGenerationParameters;
        this.getInputSizeshNQ4ISI = gMSSKeyGenerationParameters;
        org.bouncycastle.pqc.crypto.gmss.GMSSParameters gMSSParameters = new org.bouncycastle.pqc.crypto.gmss.GMSSParameters(gMSSKeyGenerationParameters.getParameters().getNumOfLayers(), this.getInputSizeshNQ4ISI.getParameters().getHeightOfTrees(), this.getInputSizeshNQ4ISI.getParameters().getWinternitzParameter(), this.getInputSizeshNQ4ISI.getParameters().getK());
        this.getHighSpeedVideoFpsRanges = gMSSParameters;
        this.getOutputStallDurationlomOqCM = gMSSParameters.getNumOfLayers();
        this.getInputFormats = this.getHighSpeedVideoFpsRanges.getHeightOfTrees();
        this.getOutputStallDuration = this.getHighSpeedVideoFpsRanges.getWinternitzParameter();
        this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getK();
        this.Camera2StreamConfigurationMap = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, this.getOutputStallDurationlomOqCM, this.getOutputFormats);
        this.getOutputMinFrameDurationlomOqCM = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, this.getOutputStallDurationlomOqCM - 1, this.getOutputFormats);
        java.security.SecureRandom random = keyGenerationParameters.getRandom();
        for (int i = 0; i < this.getOutputStallDurationlomOqCM; i++) {
            random.nextBytes(this.Camera2StreamConfigurationMap[i]);
            this.getOutputMinFrameDuration.nextSeed(this.Camera2StreamConfigurationMap[i]);
        }
        this.getHighSpeedVideoSizesFor = true;
    }

    public void initialize(int i, java.security.SecureRandom secureRandom) {
        org.bouncycastle.pqc.crypto.gmss.GMSSKeyGenerationParameters gMSSKeyGenerationParameters;
        if (i <= 10) {
            gMSSKeyGenerationParameters = new org.bouncycastle.pqc.crypto.gmss.GMSSKeyGenerationParameters(secureRandom, new org.bouncycastle.pqc.crypto.gmss.GMSSParameters(1, new int[]{10}, new int[]{3}, new int[]{2}));
        } else {
            gMSSKeyGenerationParameters = i <= 20 ? new org.bouncycastle.pqc.crypto.gmss.GMSSKeyGenerationParameters(secureRandom, new org.bouncycastle.pqc.crypto.gmss.GMSSParameters(2, new int[]{10, 10}, new int[]{5, 4}, new int[]{2, 2})) : new org.bouncycastle.pqc.crypto.gmss.GMSSKeyGenerationParameters(secureRandom, new org.bouncycastle.pqc.crypto.gmss.GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{9, 9, 9, 3}, new int[]{2, 2, 2, 2}));
        }
        initialize(gMSSKeyGenerationParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    private org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc getHighSpeedVideoSizes(byte[] bArr, java.util.Vector vector, byte[] bArr2, int i) {
        byte[] Verify;
        int i2 = this.getOutputFormats;
        byte[] bArr3 = new byte[i2];
        byte[] bArr4 = new byte[i2];
        byte[] nextSeed = this.getOutputMinFrameDuration.nextSeed(bArr2);
        org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc gMSSRootCalc = new org.bouncycastle.pqc.crypto.gmss.GMSSRootCalc(this.getInputFormats[i], this.getHighResolutionOutputSizeshNQ4ISI[i], this.getHighSpeedVideoFpsRangesFor);
        gMSSRootCalc.initialize(vector);
        if (i == this.getOutputStallDurationlomOqCM - 1) {
            Verify = new org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature(nextSeed, this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputStallDuration[i]).getPublicKey();
        } else {
            this.getHighSpeedVideoSizes[i] = new org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature(nextSeed, this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputStallDuration[i]).getSignature(bArr);
            Verify = new org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSVerify(this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputStallDuration[i]).Verify(bArr, this.getHighSpeedVideoSizes[i]);
        }
        gMSSRootCalc.update(Verify);
        int i3 = 3;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            int i6 = this.getInputFormats[i];
            if (i5 >= (1 << i6)) {
                break;
            }
            if (i5 == i3 && i4 < i6 - this.getHighResolutionOutputSizeshNQ4ISI[i]) {
                gMSSRootCalc.initializeTreehashSeed(bArr2, i4);
                i3 *= 2;
                i4++;
            }
            gMSSRootCalc.update(new org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature(this.getOutputMinFrameDuration.nextSeed(bArr2), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputStallDuration[i]).getPublicKey());
            i5++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        java.lang.System.err.println("Baum noch nicht fertig konstruiert!!!");
        return null;
    }

    public GMSSKeyPairGenerator(org.bouncycastle.pqc.crypto.gmss.GMSSDigestProvider gMSSDigestProvider) {
        this.getHighSpeedVideoFpsRangesFor = gMSSDigestProvider;
        org.bouncycastle.crypto.Digest digest = gMSSDigestProvider.get();
        this.getOutputSizes = digest;
        this.getOutputFormats = digest.getDigestSize();
        this.getOutputMinFrameDuration = new org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom(this.getOutputSizes);
    }
}
