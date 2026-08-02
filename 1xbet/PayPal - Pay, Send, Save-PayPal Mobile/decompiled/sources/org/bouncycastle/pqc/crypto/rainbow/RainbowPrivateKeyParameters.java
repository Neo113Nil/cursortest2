package org.bouncycastle.pqc.crypto.rainbow;

/* loaded from: classes17.dex */
public class RainbowPrivateKeyParameters extends org.bouncycastle.pqc.crypto.rainbow.RainbowKeyParameters {
    private short[] Camera2StreamConfigurationMap;
    private short[][] getHighResolutionOutputSizeshNQ4ISI;
    private short[][] getHighSpeedVideoFpsRanges;
    private short[] getHighSpeedVideoFpsRangesFor;
    private int[] getHighSpeedVideoSizesFor;
    private org.bouncycastle.pqc.crypto.rainbow.Layer[] getInputSizeshNQ4ISI;

    public int[] getVi() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.pqc.crypto.rainbow.Layer[] getLayers() {
        return this.getInputSizeshNQ4ISI;
    }

    public short[][] getInvA2() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public short[][] getInvA1() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public short[] getB2() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public short[] getB1() {
        return this.Camera2StreamConfigurationMap;
    }

    public RainbowPrivateKeyParameters(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, org.bouncycastle.pqc.crypto.rainbow.Layer[] layerArr) {
        super(true, iArr[iArr.length - 1] - iArr[0]);
        this.getHighSpeedVideoFpsRanges = sArr;
        this.Camera2StreamConfigurationMap = sArr2;
        this.getHighResolutionOutputSizeshNQ4ISI = sArr3;
        this.getHighSpeedVideoFpsRangesFor = sArr4;
        this.getHighSpeedVideoSizesFor = iArr;
        this.getInputSizeshNQ4ISI = layerArr;
    }
}
