package org.bouncycastle.pqc.jcajce.spec;

/* loaded from: classes17.dex */
public class RainbowPublicKeySpec implements java.security.spec.KeySpec {
    private short[][] Camera2StreamConfigurationMap;
    private short[][] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private short[] getHighSpeedVideoSizes;

    public int getDocLength() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public short[][] getCoeffSingular() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public short[] getCoeffScalar() {
        return this.getHighSpeedVideoSizes;
    }

    public short[][] getCoeffQuadratic() {
        return this.Camera2StreamConfigurationMap;
    }

    public RainbowPublicKeySpec(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = sArr;
        this.getHighSpeedVideoFpsRanges = sArr2;
        this.getHighSpeedVideoSizes = sArr3;
    }
}
