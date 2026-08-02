package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes17.dex */
public class McElieceKeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private org.bouncycastle.pqc.crypto.mceliece.McElieceKeyGenerationParameters Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private int getInputFormats;
    private java.security.SecureRandom getOutputMinFrameDuration;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            getHighResolutionOutputSizeshNQ4ISI(new org.bouncycastle.pqc.crypto.mceliece.McElieceKeyGenerationParameters(null, new org.bouncycastle.pqc.crypto.mceliece.McElieceParameters()));
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField = new org.bouncycastle.pqc.math.linearalgebra.GF2mField(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM = new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(gF2mField, this.getInputFormats, 'I', this.getOutputMinFrameDuration);
        new org.bouncycastle.pqc.math.linearalgebra.PolynomialRingGF2m(gF2mField, polynomialGF2mSmallM).getSquareRootMatrix();
        org.bouncycastle.pqc.math.linearalgebra.GoppaCode.MaMaPe computeSystematicForm = org.bouncycastle.pqc.math.linearalgebra.GoppaCode.computeSystematicForm(org.bouncycastle.pqc.math.linearalgebra.GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM), this.getOutputMinFrameDuration);
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix secondMatrix = computeSystematicForm.getSecondMatrix();
        org.bouncycastle.pqc.math.linearalgebra.Permutation permutation = computeSystematicForm.getPermutation();
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix = (org.bouncycastle.pqc.math.linearalgebra.GF2Matrix) secondMatrix.computeTranspose();
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix extendLeftCompactForm = gF2Matrix.extendLeftCompactForm();
        int numRows = gF2Matrix.getNumRows();
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix[] createRandomRegularMatrixAndItsInverse = org.bouncycastle.pqc.math.linearalgebra.GF2Matrix.createRandomRegularMatrixAndItsInverse(numRows, this.getOutputMinFrameDuration);
        org.bouncycastle.pqc.math.linearalgebra.Permutation permutation2 = new org.bouncycastle.pqc.math.linearalgebra.Permutation(this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration);
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters(this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, (org.bouncycastle.pqc.math.linearalgebra.GF2Matrix) ((org.bouncycastle.pqc.math.linearalgebra.GF2Matrix) createRandomRegularMatrixAndItsInverse[0].rightMultiply(extendLeftCompactForm)).rightMultiply(permutation2)), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.pqc.crypto.mceliece.McEliecePrivateKeyParameters(this.getHighSpeedVideoFpsRangesFor, numRows, gF2mField, polynomialGF2mSmallM, permutation, permutation2, createRandomRegularMatrixAndItsInverse[1]));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        getHighResolutionOutputSizeshNQ4ISI(keyGenerationParameters);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.Camera2StreamConfigurationMap = (org.bouncycastle.pqc.crypto.mceliece.McElieceKeyGenerationParameters) keyGenerationParameters;
        this.getOutputMinFrameDuration = keyGenerationParameters.getRandom();
        this.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap.getParameters().getM();
        this.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getParameters().getN();
        this.getInputFormats = this.Camera2StreamConfigurationMap.getParameters().getT();
        this.getHighSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap.getParameters().getFieldPoly();
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }
}
