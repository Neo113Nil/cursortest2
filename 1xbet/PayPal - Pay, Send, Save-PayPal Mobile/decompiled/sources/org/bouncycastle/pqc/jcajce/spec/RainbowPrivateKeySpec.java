package org.bouncycastle.pqc.jcajce.spec;

/* loaded from: classes17.dex */
public class RainbowPrivateKeySpec implements java.security.spec.KeySpec {
    private short[][] Camera2StreamConfigurationMap;
    private short[][] getHighResolutionOutputSizeshNQ4ISI;
    private short[] getHighSpeedVideoFpsRanges;
    private short[] getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.pqc.crypto.rainbow.Layer[] getHighSpeedVideoSizes;
    private int[] getOutputFormats;

    public int[] getVi() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.pqc.crypto.rainbow.Layer[] getLayers() {
        return this.getHighSpeedVideoSizes;
    }

    public short[][] getInvA2() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public short[][] getInvA1() {
        return this.Camera2StreamConfigurationMap;
    }

    public short[] getB2() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public short[] getB1() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public RainbowPrivateKeySpec(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, org.bouncycastle.pqc.crypto.rainbow.Layer[] layerArr) {
        this.Camera2StreamConfigurationMap = sArr;
        this.getHighSpeedVideoFpsRanges = sArr2;
        this.getHighResolutionOutputSizeshNQ4ISI = sArr3;
        this.getHighSpeedVideoFpsRangesFor = sArr4;
        this.getOutputFormats = iArr;
        this.getHighSpeedVideoSizes = layerArr;
    }
}
