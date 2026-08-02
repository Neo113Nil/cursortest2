package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes17.dex */
public class McEliecePublicKeyParameters extends org.bouncycastle.pqc.crypto.mceliece.McElieceKeyParameters {
    private org.bouncycastle.pqc.math.linearalgebra.GF2Matrix Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;

    public int getT() {
        return this.getHighSpeedVideoFpsRanges;
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

    public McEliecePublicKeyParameters(int i, int i2, org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix) {
        super(false, null);
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = i2;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(gF2Matrix);
    }
}
