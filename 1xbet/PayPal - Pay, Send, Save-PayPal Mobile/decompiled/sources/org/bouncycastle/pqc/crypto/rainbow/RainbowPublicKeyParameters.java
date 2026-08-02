package org.bouncycastle.pqc.crypto.rainbow;

/* loaded from: classes17.dex */
public class RainbowPublicKeyParameters extends org.bouncycastle.pqc.crypto.rainbow.RainbowKeyParameters {
    private short[] Camera2StreamConfigurationMap;
    private short[][] getHighResolutionOutputSizeshNQ4ISI;
    private short[][] getHighSpeedVideoFpsRangesFor;

    public short[][] getCoeffSingular() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public short[] getCoeffScalar() {
        return this.Camera2StreamConfigurationMap;
    }

    public short[][] getCoeffQuadratic() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public RainbowPublicKeyParameters(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        super(false, i);
        this.getHighResolutionOutputSizeshNQ4ISI = sArr;
        this.getHighSpeedVideoFpsRangesFor = sArr2;
        this.Camera2StreamConfigurationMap = sArr3;
    }
}
