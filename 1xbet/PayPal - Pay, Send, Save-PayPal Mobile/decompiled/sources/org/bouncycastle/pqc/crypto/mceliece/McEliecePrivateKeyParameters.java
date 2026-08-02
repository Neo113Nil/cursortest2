package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes17.dex */
public class McEliecePrivateKeyParameters extends org.bouncycastle.pqc.crypto.mceliece.McElieceKeyParameters {
    private int Camera2StreamConfigurationMap;
    private org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getHighSpeedVideoFpsRanges;
    private org.bouncycastle.pqc.math.linearalgebra.GF2mField getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getHighSpeedVideoSizesFor;
    private org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] getInputFormats;
    private org.bouncycastle.pqc.math.linearalgebra.Permutation getInputSizeshNQ4ISI;
    private org.bouncycastle.pqc.math.linearalgebra.Permutation getOutputFormats;
    private int getOutputMinFrameDuration;

    public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getSInv() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] getQInv() {
        return this.getInputFormats;
    }

    public org.bouncycastle.pqc.math.linearalgebra.Permutation getP2() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.pqc.math.linearalgebra.Permutation getP1() {
        return this.getInputSizeshNQ4ISI;
    }

    public int getN() {
        return this.getOutputMinFrameDuration;
    }

    public int getK() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getH() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM getGoppaPoly() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2mField getField() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public McEliecePrivateKeyParameters(int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[][] bArr7) {
        super(true, null);
        this.getOutputMinFrameDuration = i;
        this.Camera2StreamConfigurationMap = i2;
        org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField = new org.bouncycastle.pqc.math.linearalgebra.GF2mField(bArr);
        this.getHighSpeedVideoFpsRangesFor = gF2mField;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(gF2mField, bArr2);
        this.getHighSpeedVideoSizesFor = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(bArr3);
        this.getInputSizeshNQ4ISI = new org.bouncycastle.pqc.math.linearalgebra.Permutation(bArr4);
        this.getOutputFormats = new org.bouncycastle.pqc.math.linearalgebra.Permutation(bArr5);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(bArr6);
        this.getInputFormats = new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[bArr7.length];
        for (int i3 = 0; i3 < bArr7.length; i3++) {
            this.getInputFormats[i3] = new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.getHighSpeedVideoFpsRangesFor, bArr7[i3]);
        }
    }

    public McEliecePrivateKeyParameters(int i, int i2, org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField, org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM, org.bouncycastle.pqc.math.linearalgebra.Permutation permutation, org.bouncycastle.pqc.math.linearalgebra.Permutation permutation2, org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix) {
        super(true, null);
        this.Camera2StreamConfigurationMap = i2;
        this.getOutputMinFrameDuration = i;
        this.getHighSpeedVideoFpsRangesFor = gF2mField;
        this.getHighResolutionOutputSizeshNQ4ISI = polynomialGF2mSmallM;
        this.getHighSpeedVideoSizesFor = gF2Matrix;
        this.getInputSizeshNQ4ISI = permutation;
        this.getOutputFormats = permutation2;
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.pqc.math.linearalgebra.GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM);
        this.getInputFormats = new org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
    }
}
