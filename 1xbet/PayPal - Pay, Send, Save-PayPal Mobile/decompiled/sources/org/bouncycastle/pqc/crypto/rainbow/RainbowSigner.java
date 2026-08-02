package org.bouncycastle.pqc.crypto.rainbow;

/* loaded from: classes17.dex */
public class RainbowSigner implements org.bouncycastle.pqc.crypto.MessageSigner {
    org.bouncycastle.pqc.crypto.rainbow.RainbowKeyParameters Camera2StreamConfigurationMap;
    private org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.pqc.crypto.rainbow.util.ComputeInField();
    private java.security.SecureRandom getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    private short[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        org.bouncycastle.pqc.crypto.rainbow.Layer[] layers = ((org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters) this.Camera2StreamConfigurationMap).getLayers();
        int length = layers.length;
        this.getHighSpeedVideoSizes = new short[((org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters) this.Camera2StreamConfigurationMap).getInvA2().length];
        int viNext = layers[length - 1].getViNext();
        byte[] bArr2 = new byte[viNext];
        short[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr);
        int i = 0;
        while (true) {
            try {
                short[] sArr = new short[highSpeedVideoFpsRangesFor.length];
                short[] multiplyMatrix = this.getHighResolutionOutputSizeshNQ4ISI.multiplyMatrix(((org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters) this.Camera2StreamConfigurationMap).getInvA1(), this.getHighResolutionOutputSizeshNQ4ISI.addVect(((org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters) this.Camera2StreamConfigurationMap).getB1(), highSpeedVideoFpsRangesFor));
                for (int i2 = 0; i2 < layers[0].getVi(); i2++) {
                    this.getHighSpeedVideoSizes[i2] = (short) this.getHighSpeedVideoFpsRanges.nextInt();
                    short[] sArr2 = this.getHighSpeedVideoSizes;
                    sArr2[i2] = (short) (sArr2[i2] & 255);
                }
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    short[] sArr3 = new short[layers[i4].getOi()];
                    short[] sArr4 = new short[layers[i4].getOi()];
                    for (int i5 = 0; i5 < layers[i4].getOi(); i5++) {
                        sArr3[i5] = multiplyMatrix[i3];
                        i3++;
                    }
                    short[] solveEquation = this.getHighResolutionOutputSizeshNQ4ISI.solveEquation(layers[i4].plugInVinegars(this.getHighSpeedVideoSizes), sArr3);
                    if (solveEquation == null) {
                        throw new java.lang.Exception("LES is not solveable!");
                    }
                    for (int i6 = 0; i6 < solveEquation.length; i6++) {
                        this.getHighSpeedVideoSizes[layers[i4].getVi() + i6] = solveEquation[i6];
                    }
                }
                short[] multiplyMatrix2 = this.getHighResolutionOutputSizeshNQ4ISI.multiplyMatrix(((org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters) this.Camera2StreamConfigurationMap).getInvA2(), this.getHighResolutionOutputSizeshNQ4ISI.addVect(((org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters) this.Camera2StreamConfigurationMap).getB2(), this.getHighSpeedVideoSizes));
                for (int i7 = 0; i7 < viNext; i7++) {
                    bArr2[i7] = (byte) multiplyMatrix2[i7];
                }
            } catch (java.lang.Exception unused) {
                i++;
                if (i >= 65536) {
                    break;
                }
            }
        }
        if (i != 65536) {
            return bArr2;
        }
        throw new java.lang.IllegalStateException("unable to generate signature - LES not solvable");
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        short[] sArr = new short[bArr2.length];
        int i = 0;
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            sArr[i2] = (short) (bArr2[i2] & 255);
        }
        short[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr);
        short[][] coeffQuadratic = ((org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters) this.Camera2StreamConfigurationMap).getCoeffQuadratic();
        short[][] coeffSingular = ((org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters) this.Camera2StreamConfigurationMap).getCoeffSingular();
        short[] coeffScalar = ((org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters) this.Camera2StreamConfigurationMap).getCoeffScalar();
        int length = coeffQuadratic.length;
        short[] sArr2 = new short[length];
        int length2 = coeffSingular[0].length;
        int i3 = 0;
        while (i3 < coeffQuadratic.length) {
            int i4 = i;
            int i5 = i4;
            while (i4 < length2) {
                for (int i6 = i4; i6 < length2; i6++) {
                    sArr2[i3] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr2[i3], org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(coeffQuadratic[i3][i5], org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(sArr[i4], sArr[i6])));
                    i5++;
                }
                sArr2[i3] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr2[i3], org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(coeffSingular[i3][i4], sArr[i4]));
                i4++;
            }
            sArr2[i3] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr2[i3], coeffScalar[i3]);
            i3++;
            i = 0;
        }
        if (highSpeedVideoFpsRangesFor.length != length) {
            return false;
        }
        boolean z = true;
        for (int i7 = 0; i7 < highSpeedVideoFpsRangesFor.length; i7++) {
            z = z && highSpeedVideoFpsRangesFor[i7] == sArr2[i7];
        }
        return z;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        org.bouncycastle.pqc.crypto.rainbow.RainbowKeyParameters rainbowKeyParameters;
        if (!z) {
            rainbowKeyParameters = (org.bouncycastle.pqc.crypto.rainbow.RainbowPublicKeyParameters) cipherParameters;
        } else {
            if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
                org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
                this.getHighSpeedVideoFpsRanges = parametersWithRandom.getRandom();
                this.Camera2StreamConfigurationMap = (org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters) parametersWithRandom.getParameters();
                this.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getDocLength();
            }
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            rainbowKeyParameters = (org.bouncycastle.pqc.crypto.rainbow.RainbowPrivateKeyParameters) cipherParameters;
        }
        this.Camera2StreamConfigurationMap = rainbowKeyParameters;
        this.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getDocLength();
    }

    private short[] getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        int i = this.getHighSpeedVideoFpsRangesFor;
        short[] sArr = new short[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length) {
            short s = bArr[i3];
            sArr[i2] = s;
            sArr[i2] = (short) (s & 255);
            i3++;
            i2++;
            if (i2 >= i) {
                break;
            }
        }
        return sArr;
    }
}
