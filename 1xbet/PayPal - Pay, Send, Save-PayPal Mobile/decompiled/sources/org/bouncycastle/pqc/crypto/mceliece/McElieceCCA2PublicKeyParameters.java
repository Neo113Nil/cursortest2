package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes17.dex */
public class McElieceCCA2PublicKeyParameters extends org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters {
    private org.bouncycastle.pqc.math.linearalgebra.GF2Matrix Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRangesFor;

    public int getT() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getN() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getK() {
        return this.Camera2StreamConfigurationMap.getNumRows();
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getG() {
        return this.Camera2StreamConfigurationMap;
    }

    public McElieceCCA2PublicKeyParameters(int i, int i2, org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix, java.lang.String str) {
        super(false, str);
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(gF2Matrix);
    }
}
