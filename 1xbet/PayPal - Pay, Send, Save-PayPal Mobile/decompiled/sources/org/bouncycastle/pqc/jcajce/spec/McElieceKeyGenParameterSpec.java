package org.bouncycastle.pqc.jcajce.spec;

/* loaded from: classes17.dex */
public class McElieceKeyGenParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private int Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    public int getT() {
        return this.getHighSpeedVideoSizes;
    }

    public int getN() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getM() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getFieldPoly() {
        return this.Camera2StreamConfigurationMap;
    }

    public McElieceKeyGenParameterSpec(int i, int i2, int i3) {
        this.getHighSpeedVideoFpsRangesFor = i;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("m must be positive");
        }
        if (i > 32) {
            throw new java.lang.IllegalArgumentException(" m is too large");
        }
        int i4 = 1 << i;
        this.getHighSpeedVideoFpsRanges = i4;
        this.getHighSpeedVideoSizes = i2;
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("t must be positive");
        }
        if (i2 > i4) {
            throw new java.lang.IllegalArgumentException("t must be less than n = 2^m");
        }
        if (org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2.degree(i3) != i || !org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2.isIrreducible(i3)) {
            throw new java.lang.IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
        }
        this.Camera2StreamConfigurationMap = i3;
    }

    public McElieceKeyGenParameterSpec(int i, int i2) throws java.security.InvalidParameterException {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("m must be positive");
        }
        if (i > 32) {
            throw new java.lang.IllegalArgumentException("m is too large");
        }
        this.getHighSpeedVideoFpsRangesFor = i;
        int i3 = 1 << i;
        this.getHighSpeedVideoFpsRanges = i3;
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("t must be positive");
        }
        if (i2 > i3) {
            throw new java.lang.IllegalArgumentException("t must be less than n = 2^m");
        }
        this.getHighSpeedVideoSizes = i2;
        this.Camera2StreamConfigurationMap = org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2.getIrreduciblePolynomial(i);
    }

    public McElieceKeyGenParameterSpec(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("key size must be positive");
        }
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getHighSpeedVideoFpsRanges = 1;
        while (true) {
            int i2 = this.getHighSpeedVideoFpsRanges;
            if (i2 >= i) {
                int i3 = i2 >>> 1;
                this.getHighSpeedVideoSizes = i3;
                int i4 = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoSizes = i3 / i4;
                this.Camera2StreamConfigurationMap = org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2.getIrreduciblePolynomial(i4);
                return;
            }
            this.getHighSpeedVideoFpsRanges = i2 << 1;
            this.getHighSpeedVideoFpsRangesFor++;
        }
    }

    public McElieceKeyGenParameterSpec() {
        this(11, 50);
    }
}
