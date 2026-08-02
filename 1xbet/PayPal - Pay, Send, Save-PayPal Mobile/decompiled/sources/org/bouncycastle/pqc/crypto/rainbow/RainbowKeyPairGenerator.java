package org.bouncycastle.pqc.crypto.rainbow;

/* loaded from: classes17.dex */
public class RainbowKeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private short[] Camera2StreamConfigurationMap;
    private short[][] getHighResolutionOutputSizeshNQ4ISI;
    private short[][] getHighSpeedVideoFpsRanges;
    private short[][] getHighSpeedVideoFpsRangesFor;
    private short[][] getHighSpeedVideoSizes;
    private short[][] getHighSpeedVideoSizesFor;
    private org.bouncycastle.pqc.crypto.rainbow.Layer[] getInputFormats;
    private short[] getInputSizeshNQ4ISI;
    private boolean getOutputFormats = false;
    private int getOutputMinFrameDuration;
    private int[] getOutputMinFrameDurationlomOqCM;
    private java.security.SecureRandom getOutputSizes;
    private short[][] getOutputSizeshNQ4ISI;
    private short[] getOutputStallDuration;
    private org.bouncycastle.pqc.crypto.rainbow.RainbowKeyGenerationParameters getOutputStallDurationlomOqCM;

    public org.bouncycastle.crypto.AsymmetricCipherKeyPair genKeyPair() {
        if (!this.getOutputFormats) {
            initialize(new org.bouncycastle.pqc.crypto.rainbow.RainbowKeyGenerationParameters(org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom(), new org.bouncycastle.pqc.crypto.rainbow.RainbowParameters()));
        }
        int[] iArr = this.getOutputMinFrameDurationlomOqCM;
        int i = 0;
        int i2 = iArr[iArr.length - 1] - iArr[0];
        this.getHighSpeedVideoSizes = (short[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, i2, i2);
        this.getHighSpeedVideoFpsRangesFor = null;
        org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField computeInField = new org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField();
        while (this.getHighSpeedVideoFpsRangesFor == null) {
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    this.getHighSpeedVideoSizes[i3][i4] = (short) (this.getOutputSizes.nextInt() & 255);
                }
            }
            this.getHighSpeedVideoFpsRangesFor = computeInField.inverse(this.getHighSpeedVideoSizes);
        }
        this.Camera2StreamConfigurationMap = new short[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            this.Camera2StreamConfigurationMap[i5] = (short) (this.getOutputSizes.nextInt() & 255);
        }
        int i6 = this.getOutputMinFrameDurationlomOqCM[r2.length - 1];
        this.getHighSpeedVideoFpsRanges = (short[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, i6, i6);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField computeInField2 = new org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField();
        while (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            for (int i7 = 0; i7 < i6; i7++) {
                for (int i8 = 0; i8 < i6; i8++) {
                    this.getHighSpeedVideoFpsRanges[i7][i8] = (short) (this.getOutputSizes.nextInt() & 255);
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI = computeInField2.inverse(this.getHighSpeedVideoFpsRanges);
        }
        this.getInputSizeshNQ4ISI = new short[i6];
        for (int i9 = 0; i9 < i6; i9++) {
            this.getInputSizeshNQ4ISI[i9] = (short) (this.getOutputSizes.nextInt() & 255);
        }
        this.getInputFormats = new org.bouncycastle.pqc.crypto.rainbow.Layer[this.getOutputMinFrameDuration];
        int i10 = 0;
        while (i10 < this.getOutputMinFrameDuration) {
            org.bouncycastle.pqc.crypto.rainbow.Layer[] layerArr = this.getInputFormats;
            int[] iArr2 = this.getOutputMinFrameDurationlomOqCM;
            int i11 = i10 + 1;
            layerArr[i10] = new org.bouncycastle.pqc.crypto.rainbow.Layer(iArr2[i10], iArr2[i11], this.getOutputSizes);
            i10 = i11;
        }
        org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField computeInField3 = new org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField();
        int[] iArr3 = this.getOutputMinFrameDurationlomOqCM;
        int i12 = iArr3[iArr3.length - 1] - iArr3[0];
        int i13 = iArr3[iArr3.length - 1];
        short[][][] sArr = (short[][][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, i12, i13, i13);
        this.getOutputSizeshNQ4ISI = (short[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, i12, i13);
        this.getOutputStallDuration = new short[i12];
        short[] sArr2 = new short[i13];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            org.bouncycastle.pqc.crypto.rainbow.Layer[] layerArr2 = this.getInputFormats;
            if (i14 >= layerArr2.length) {
                break;
            }
            short[][][] coeffAlpha = layerArr2[i14].getCoeffAlpha();
            short[][][] coeffBeta = this.getInputFormats[i14].getCoeffBeta();
            short[][] coeffGamma = this.getInputFormats[i14].getCoeffGamma();
            short[] coeffEta = this.getInputFormats[i14].getCoeffEta();
            int length = coeffAlpha[i].length;
            int length2 = coeffBeta[i].length;
            int i16 = i;
            while (i16 < length) {
                int i17 = i;
                while (i17 < length) {
                    while (i < length2) {
                        int i18 = i13;
                        int i19 = i12;
                        int i20 = i17 + length2;
                        short[] multVect = computeInField3.multVect(coeffAlpha[i16][i17][i], this.getHighSpeedVideoFpsRanges[i20]);
                        int i21 = i15 + i16;
                        int i22 = i14;
                        sArr[i21] = computeInField3.addSquareMatrix(sArr[i21], computeInField3.multVects(multVect, this.getHighSpeedVideoFpsRanges[i]));
                        short[] multVect2 = computeInField3.multVect(this.getInputSizeshNQ4ISI[i], multVect);
                        short[][] sArr3 = this.getOutputSizeshNQ4ISI;
                        sArr3[i21] = computeInField3.addVect(multVect2, sArr3[i21]);
                        short[] multVect3 = computeInField3.multVect(this.getInputSizeshNQ4ISI[i20], computeInField3.multVect(coeffAlpha[i16][i17][i], this.getHighSpeedVideoFpsRanges[i]));
                        short[][] sArr4 = this.getOutputSizeshNQ4ISI;
                        sArr4[i21] = computeInField3.addVect(multVect3, sArr4[i21]);
                        short multElem = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(coeffAlpha[i16][i17][i], this.getInputSizeshNQ4ISI[i20]);
                        short[] sArr5 = this.getOutputStallDuration;
                        sArr5[i21] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr5[i21], org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(multElem, this.getInputSizeshNQ4ISI[i]));
                        i++;
                        i12 = i19;
                        i13 = i18;
                        coeffAlpha = coeffAlpha;
                        i14 = i22;
                        coeffEta = coeffEta;
                    }
                    i17++;
                    i = 0;
                }
                int i23 = i13;
                int i24 = i12;
                int i25 = i14;
                short[][][] sArr6 = coeffAlpha;
                short[] sArr7 = coeffEta;
                for (int i26 = 0; i26 < length2; i26++) {
                    for (int i27 = 0; i27 < length2; i27++) {
                        short[] multVect4 = computeInField3.multVect(coeffBeta[i16][i26][i27], this.getHighSpeedVideoFpsRanges[i26]);
                        int i28 = i15 + i16;
                        sArr[i28] = computeInField3.addSquareMatrix(sArr[i28], computeInField3.multVects(multVect4, this.getHighSpeedVideoFpsRanges[i27]));
                        short[] multVect5 = computeInField3.multVect(this.getInputSizeshNQ4ISI[i27], multVect4);
                        short[][] sArr8 = this.getOutputSizeshNQ4ISI;
                        sArr8[i28] = computeInField3.addVect(multVect5, sArr8[i28]);
                        short[] multVect6 = computeInField3.multVect(this.getInputSizeshNQ4ISI[i26], computeInField3.multVect(coeffBeta[i16][i26][i27], this.getHighSpeedVideoFpsRanges[i27]));
                        short[][] sArr9 = this.getOutputSizeshNQ4ISI;
                        sArr9[i28] = computeInField3.addVect(multVect6, sArr9[i28]);
                        short multElem2 = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(coeffBeta[i16][i26][i27], this.getInputSizeshNQ4ISI[i26]);
                        short[] sArr10 = this.getOutputStallDuration;
                        sArr10[i28] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr10[i28], org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(multElem2, this.getInputSizeshNQ4ISI[i27]));
                    }
                }
                for (int i29 = 0; i29 < length2 + length; i29++) {
                    short[] multVect7 = computeInField3.multVect(coeffGamma[i16][i29], this.getHighSpeedVideoFpsRanges[i29]);
                    short[][] sArr11 = this.getOutputSizeshNQ4ISI;
                    int i30 = i15 + i16;
                    sArr11[i30] = computeInField3.addVect(multVect7, sArr11[i30]);
                    short[] sArr12 = this.getOutputStallDuration;
                    sArr12[i30] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr12[i30], org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(coeffGamma[i16][i29], this.getInputSizeshNQ4ISI[i29]));
                }
                short[] sArr13 = this.getOutputStallDuration;
                int i31 = i15 + i16;
                sArr13[i31] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr13[i31], sArr7[i16]);
                i16++;
                i12 = i24;
                i13 = i23;
                coeffAlpha = sArr6;
                i14 = i25;
                coeffEta = sArr7;
                i = 0;
            }
            i15 += length;
            i14++;
            i = 0;
        }
        short[][][] sArr14 = (short[][][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, i12, i13, i13);
        short[][] sArr15 = (short[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, i12, i13);
        short[] sArr16 = new short[i12];
        for (int i32 = 0; i32 < i12; i32++) {
            int i33 = 0;
            while (true) {
                short[][] sArr17 = this.getHighSpeedVideoSizes;
                if (i33 < sArr17.length) {
                    sArr14[i32] = computeInField3.addSquareMatrix(sArr14[i32], computeInField3.multMatrix(sArr17[i32][i33], sArr[i33]));
                    sArr15[i32] = computeInField3.addVect(sArr15[i32], computeInField3.multVect(this.getHighSpeedVideoSizes[i32][i33], this.getOutputSizeshNQ4ISI[i33]));
                    sArr16[i32] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr16[i32], org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(this.getHighSpeedVideoSizes[i32][i33], this.getOutputStallDuration[i33]));
                    i33++;
                }
            }
            sArr16[i32] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr16[i32], this.Camera2StreamConfigurationMap[i32]);
        }
        this.getOutputSizeshNQ4ISI = sArr15;
        this.getOutputStallDuration = sArr16;
        int length3 = sArr14.length;
        int length4 = sArr14[0].length;
        this.getHighSpeedVideoSizesFor = (short[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, length3, ((length4 + 1) * length4) / 2);
        for (int i34 = 0; i34 < length3; i34++) {
            int i35 = 0;
            for (int i36 = 0; i36 < length4; i36++) {
                for (int i37 = i36; i37 < length4; i37++) {
                    short[][] sArr18 = this.getHighSpeedVideoSizesFor;
                    if (i37 == i36) {
                        sArr18[i34][i35] = sArr14[i34][i36][i37];
                    } else {
                        short[] sArr19 = sArr18[i34];
                        short[][] sArr20 = sArr14[i34];
                        sArr19[i35] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr20[i36][i37], sArr20[i37][i36]);
                    }
                    i35++;
                }
            }
        }
        org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters rainbowPrivateKeyParameters = new org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDurationlomOqCM, this.getInputFormats);
        int[] iArr4 = this.getOutputMinFrameDurationlomOqCM;
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters(iArr4[iArr4.length - 1] - iArr4[0], this.getHighSpeedVideoSizesFor, this.getOutputSizeshNQ4ISI, this.getOutputStallDuration), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) rainbowPrivateKeyParameters);
    }

    public void initialize(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        org.bouncycastle.pqc.crypto.rainbow.RainbowKeyGenerationParameters rainbowKeyGenerationParameters = (org.bouncycastle.pqc.crypto.rainbow.RainbowKeyGenerationParameters) keyGenerationParameters;
        this.getOutputStallDurationlomOqCM = rainbowKeyGenerationParameters;
        this.getOutputSizes = rainbowKeyGenerationParameters.getRandom();
        this.getOutputMinFrameDurationlomOqCM = this.getOutputStallDurationlomOqCM.getParameters().getVi();
        this.getOutputMinFrameDuration = this.getOutputStallDurationlomOqCM.getParameters().getNumOfLayers();
        this.getOutputFormats = true;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }
}
