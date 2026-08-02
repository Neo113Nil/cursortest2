package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes17.dex */
public class McElieceParameters implements org.bouncycastle.crypto.CipherParameters {
    public static final int DEFAULT_M = 11;
    public static final int DEFAULT_T = 50;
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    public int getT() {
        return this.getHighSpeedVideoSizes;
    }

    public int getN() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getM() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getFieldPoly() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public McElieceParameters(org.bouncycastle.crypto.Digest digest) {
        this(11, 50, digest);
    }

    public McElieceParameters(int i, org.bouncycastle.crypto.Digest digest) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("key size must be positive");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.Camera2StreamConfigurationMap = 1;
        while (true) {
            int i2 = this.Camera2StreamConfigurationMap;
            if (i2 >= i) {
                int i3 = i2 >>> 1;
                this.getHighSpeedVideoSizes = i3;
                int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoSizes = i3 / i4;
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2.getIrreduciblePolynomial(i4);
                this.getHighSpeedVideoFpsRanges = digest;
                return;
            }
            this.Camera2StreamConfigurationMap = i2 << 1;
            this.getHighResolutionOutputSizeshNQ4ISI++;
        }
    }

    public McElieceParameters(int i, int i2, org.bouncycastle.crypto.Digest digest) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("m must be positive");
        }
        if (i > 32) {
            throw new java.lang.IllegalArgumentException("m is too large");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        int i3 = 1 << i;
        this.Camera2StreamConfigurationMap = i3;
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("t must be positive");
        }
        if (i2 > i3) {
            throw new java.lang.IllegalArgumentException("t must be less than n = 2^m");
        }
        this.getHighSpeedVideoSizes = i2;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2.getIrreduciblePolynomial(i);
        this.getHighSpeedVideoFpsRanges = digest;
    }

    public McElieceParameters(int i, int i2, int i3, org.bouncycastle.crypto.Digest digest) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("m must be positive");
        }
        if (i > 32) {
            throw new java.lang.IllegalArgumentException(" m is too large");
        }
        int i4 = 1 << i;
        this.Camera2StreamConfigurationMap = i4;
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
        this.getHighSpeedVideoFpsRangesFor = i3;
        this.getHighSpeedVideoFpsRanges = digest;
    }

    public McElieceParameters(int i, int i2, int i3) {
        this(i, i2, i3, null);
    }

    public McElieceParameters(int i, int i2) {
        this(i, i2, (org.bouncycastle.crypto.Digest) null);
    }

    public McElieceParameters(int i) {
        this(i, (org.bouncycastle.crypto.Digest) null);
    }

    public McElieceParameters() {
        this(11, 50);
    }
}
