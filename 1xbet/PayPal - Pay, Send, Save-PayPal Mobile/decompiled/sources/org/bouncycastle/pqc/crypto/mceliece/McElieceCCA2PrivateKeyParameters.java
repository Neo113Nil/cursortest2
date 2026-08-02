package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes17.dex */
public class McElieceCCA2PrivateKeyParameters extends org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyParameters {
    private org.bouncycastle.pqc.math.linearalgebra.GF2mField Camera2StreamConfigurationMap;
    private org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getInputFormats;
    private org.bouncycastle.pqc.math.linearalgebra.Permutation getInputSizeshNQ4ISI;
    private org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] getOutputFormats;

    public int getT() {
        return this.getHighSpeedVideoFpsRanges.getDegree();
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] getQInv() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.pqc.math.linearalgebra.Permutation getP() {
        return this.getInputSizeshNQ4ISI;
    }

    public int getN() {
        return this.getInputFormats;
    }

    public int getK() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getH() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM getGoppaPoly() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2mField getField() {
        return this.Camera2StreamConfigurationMap;
    }

    public McElieceCCA2PrivateKeyParameters(int i, int i2, org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField, org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM, org.bouncycastle.pqc.math.linearalgebra.Permutation permutation, java.lang.String str) {
        this(i, i2, gF2mField, polynomialGF2mSmallM, org.bouncycastle.pqc.math.linearalgebra.GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM), permutation, str);
    }

    public McElieceCCA2PrivateKeyParameters(int i, int i2, org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField, org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM, org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix, org.bouncycastle.pqc.math.linearalgebra.Permutation permutation, java.lang.String str) {
        super(true, str);
        this.getInputFormats = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.Camera2StreamConfigurationMap = gF2mField;
        this.getHighSpeedVideoFpsRanges = polynomialGF2mSmallM;
        this.getHighResolutionOutputSizeshNQ4ISI = gF2Matrix;
        this.getInputSizeshNQ4ISI = permutation;
        this.getOutputFormats = new org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
    }
}
