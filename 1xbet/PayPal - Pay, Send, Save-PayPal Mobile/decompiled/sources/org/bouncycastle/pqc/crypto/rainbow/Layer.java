package org.bouncycastle.pqc.crypto.rainbow;

/* loaded from: classes17.dex */
public class Layer {
    private short[][][] Camera2StreamConfigurationMap;
    private short[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private short[][] getHighSpeedVideoFpsRangesFor;
    private short[][][] getHighSpeedVideoSizes;
    private int getInputFormats;
    private int getInputSizeshNQ4ISI;

    public short[][] plugInVinegars(short[] sArr) {
        int i = this.getHighSpeedVideoFpsRanges;
        short[][] sArr2 = (short[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, i, i + 1);
        short[] sArr3 = new short[this.getHighSpeedVideoFpsRanges];
        int i2 = 0;
        for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRanges; i3++) {
            for (int i4 = 0; i4 < this.getInputSizeshNQ4ISI; i4++) {
                for (int i5 = 0; i5 < this.getInputSizeshNQ4ISI; i5++) {
                    sArr3[i3] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr3[i3], org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(this.getHighSpeedVideoSizes[i3][i4][i5], sArr[i4]), sArr[i5]));
                }
            }
        }
        for (int i6 = 0; i6 < this.getHighSpeedVideoFpsRanges; i6++) {
            for (int i7 = 0; i7 < this.getHighSpeedVideoFpsRanges; i7++) {
                for (int i8 = 0; i8 < this.getInputSizeshNQ4ISI; i8++) {
                    short multElem = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(this.Camera2StreamConfigurationMap[i6][i7][i8], sArr[i8]);
                    short[] sArr4 = sArr2[i6];
                    sArr4[i7] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr4[i7], multElem);
                }
            }
        }
        for (int i9 = 0; i9 < this.getHighSpeedVideoFpsRanges; i9++) {
            for (int i10 = 0; i10 < this.getInputSizeshNQ4ISI; i10++) {
                sArr3[i9] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr3[i9], org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.multElem(this.getHighSpeedVideoFpsRangesFor[i9][i10], sArr[i10]));
            }
        }
        for (int i11 = 0; i11 < this.getHighSpeedVideoFpsRanges; i11++) {
            for (int i12 = this.getInputSizeshNQ4ISI; i12 < this.getInputFormats; i12++) {
                short[] sArr5 = sArr2[i11];
                int i13 = i12 - this.getInputSizeshNQ4ISI;
                sArr5[i13] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(this.getHighSpeedVideoFpsRangesFor[i11][i12], sArr5[i13]);
            }
        }
        for (int i14 = 0; i14 < this.getHighSpeedVideoFpsRanges; i14++) {
            sArr3[i14] = org.bouncycastle.pqc.crypto.rainbow.util.GF2Field.addElem(sArr3[i14], this.getHighResolutionOutputSizeshNQ4ISI[i14]);
        }
        while (true) {
            int i15 = this.getHighSpeedVideoFpsRanges;
            if (i2 >= i15) {
                return sArr2;
            }
            sArr2[i2][i15] = sArr3[i2];
            i2++;
        }
    }

    public int hashCode() {
        return (((((((((((this.getInputSizeshNQ4ISI * 37) + this.getInputFormats) * 37) + this.getHighSpeedVideoFpsRanges) * 37) + org.bouncycastle.util.Arrays.hashCode(this.Camera2StreamConfigurationMap)) * 37) + org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoSizes)) * 37) + org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoFpsRangesFor)) * 37) + org.bouncycastle.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public int getViNext() {
        return this.getInputFormats;
    }

    public int getVi() {
        return this.getInputSizeshNQ4ISI;
    }

    public int getOi() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public short[][] getCoeffGamma() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public short[] getCoeffEta() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public short[][][] getCoeffBeta() {
        return this.getHighSpeedVideoSizes;
    }

    public short[][][] getCoeffAlpha() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof org.bouncycastle.pqc.crypto.rainbow.Layer)) {
            return false;
        }
        org.bouncycastle.pqc.crypto.rainbow.Layer layer = (org.bouncycastle.pqc.crypto.rainbow.Layer) obj;
        return this.getInputSizeshNQ4ISI == layer.getVi() && this.getInputFormats == layer.getViNext() && this.getHighSpeedVideoFpsRanges == layer.getOi() && org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.equals(this.Camera2StreamConfigurationMap, layer.getCoeffAlpha()) && org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.equals(this.getHighSpeedVideoSizes, layer.getCoeffBeta()) && org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.equals(this.getHighSpeedVideoFpsRangesFor, layer.getCoeffGamma()) && org.bouncycastle.pqc.crypto.rainbow.util.RainbowUtil.equals(this.getHighResolutionOutputSizeshNQ4ISI, layer.getCoeffEta());
    }

    public Layer(int i, int i2, java.security.SecureRandom secureRandom) {
        this.getInputSizeshNQ4ISI = i;
        this.getInputFormats = i2;
        int i3 = i2 - i;
        this.getHighSpeedVideoFpsRanges = i3;
        this.Camera2StreamConfigurationMap = (short[][][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, i3, i3, i);
        int i4 = this.getHighSpeedVideoFpsRanges;
        int i5 = this.getInputSizeshNQ4ISI;
        this.getHighSpeedVideoSizes = (short[][][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, i4, i5, i5);
        this.getHighSpeedVideoFpsRangesFor = (short[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Short.TYPE, this.getHighSpeedVideoFpsRanges, this.getInputFormats);
        int i6 = this.getHighSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = new short[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            for (int i8 = 0; i8 < this.getHighSpeedVideoFpsRanges; i8++) {
                for (int i9 = 0; i9 < this.getInputSizeshNQ4ISI; i9++) {
                    this.Camera2StreamConfigurationMap[i7][i8][i9] = (short) (secureRandom.nextInt() & 255);
                }
            }
        }
        for (int i10 = 0; i10 < i6; i10++) {
            for (int i11 = 0; i11 < this.getInputSizeshNQ4ISI; i11++) {
                for (int i12 = 0; i12 < this.getInputSizeshNQ4ISI; i12++) {
                    this.getHighSpeedVideoSizes[i10][i11][i12] = (short) (secureRandom.nextInt() & 255);
                }
            }
        }
        for (int i13 = 0; i13 < i6; i13++) {
            for (int i14 = 0; i14 < this.getInputFormats; i14++) {
                this.getHighSpeedVideoFpsRangesFor[i13][i14] = (short) (secureRandom.nextInt() & 255);
            }
        }
        for (int i15 = 0; i15 < i6; i15++) {
            this.getHighResolutionOutputSizeshNQ4ISI[i15] = (short) (secureRandom.nextInt() & 255);
        }
    }

    public Layer(byte b, byte b2, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i = b & 255;
        this.getInputSizeshNQ4ISI = i;
        int i2 = b2 & 255;
        this.getInputFormats = i2;
        this.getHighSpeedVideoFpsRanges = i2 - i;
        this.Camera2StreamConfigurationMap = sArr;
        this.getHighSpeedVideoSizes = sArr2;
        this.getHighSpeedVideoFpsRangesFor = sArr3;
        this.getHighResolutionOutputSizeshNQ4ISI = sArr4;
    }
}
