package org.bouncycastle.pqc.jcajce.spec;

/* loaded from: classes17.dex */
public class McElieceCCA2KeyGenParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    public static final java.lang.String SHA1 = "SHA-1";
    public static final java.lang.String SHA224 = "SHA-224";
    public static final java.lang.String SHA256 = "SHA-256";
    public static final java.lang.String SHA384 = "SHA-384";
    public static final java.lang.String SHA512 = "SHA-512";
    private final int Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;

    public int getT() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getN() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getM() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getFieldPoly() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String getDigest() {
        return this.getHighSpeedVideoSizes;
    }

    public McElieceCCA2KeyGenParameterSpec(int i, java.lang.String str) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("key size must be positive");
        }
        int i2 = 1;
        int i3 = 0;
        while (i2 < i) {
            i2 <<= 1;
            i3++;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = (i2 >>> 1) / i3;
        this.Camera2StreamConfigurationMap = i3;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2.getIrreduciblePolynomial(i3);
        this.getHighSpeedVideoSizes = str;
    }

    public McElieceCCA2KeyGenParameterSpec(int i, int i2, java.lang.String str) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("m must be positive");
        }
        if (i > 32) {
            throw new java.lang.IllegalArgumentException("m is too large");
        }
        this.Camera2StreamConfigurationMap = i;
        int i3 = 1 << i;
        this.getHighSpeedVideoFpsRangesFor = i3;
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("t must be positive");
        }
        if (i2 > i3) {
            throw new java.lang.IllegalArgumentException("t must be less than n = 2^m");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2.getIrreduciblePolynomial(i);
        this.getHighSpeedVideoSizes = str;
    }

    public McElieceCCA2KeyGenParameterSpec(int i, int i2, int i3, java.lang.String str) {
        this.Camera2StreamConfigurationMap = i;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("m must be positive");
        }
        if (i > 32) {
            throw new java.lang.IllegalArgumentException(" m is too large");
        }
        int i4 = 1 << i;
        this.getHighSpeedVideoFpsRangesFor = i4;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("t must be positive");
        }
        if (i2 > i4) {
            throw new java.lang.IllegalArgumentException("t must be less than n = 2^m");
        }
        if (org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2.degree(i3) != i || !org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2.isIrreducible(i3)) {
            throw new java.lang.IllegalArgumentException("polynomial is not a field polynomial for GF(2^m)");
        }
        this.getHighSpeedVideoFpsRanges = i3;
        this.getHighSpeedVideoSizes = str;
    }

    public McElieceCCA2KeyGenParameterSpec(int i, int i2, int i3) {
        this(i, i2, i3, "SHA-256");
    }

    public McElieceCCA2KeyGenParameterSpec(int i, int i2) {
        this(i, i2, "SHA-256");
    }

    public McElieceCCA2KeyGenParameterSpec(int i) {
        this(i, "SHA-256");
    }

    public McElieceCCA2KeyGenParameterSpec() {
        this(11, 50, "SHA-256");
    }
}
