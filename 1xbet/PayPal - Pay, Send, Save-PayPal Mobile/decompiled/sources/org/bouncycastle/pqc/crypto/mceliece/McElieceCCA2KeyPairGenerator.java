package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes17.dex */
public class McElieceCCA2KeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    public static final java.lang.String OID = "1.3.6.1.4.1.8301.3.1.3.4.2";
    private int Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyGenerationParameters getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private java.security.SecureRandom getOutputFormats;
    private int getOutputMinFrameDuration;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            init(new org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyGenerationParameters(null, new org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2Parameters()));
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField = new org.bouncycastle.pqc.math.linearalgebra.GF2mField(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM = new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(gF2mField, this.getOutputMinFrameDuration, 'I', this.getOutputFormats);
        org.bouncycastle.pqc.math.linearalgebra.GoppaCode.MaMaPe computeSystematicForm = org.bouncycastle.pqc.math.linearalgebra.GoppaCode.computeSystematicForm(org.bouncycastle.pqc.math.linearalgebra.GoppaCode.createCanonicalCheckMatrix(gF2mField, polynomialGF2mSmallM), this.getOutputFormats);
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix secondMatrix = computeSystematicForm.getSecondMatrix();
        org.bouncycastle.pqc.math.linearalgebra.Permutation permutation = computeSystematicForm.getPermutation();
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix = (org.bouncycastle.pqc.math.linearalgebra.GF2Matrix) secondMatrix.computeTranspose();
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters(this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, gF2Matrix, this.getHighSpeedVideoFpsRanges.getParameters().getDigest()), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PrivateKeyParameters(this.Camera2StreamConfigurationMap, gF2Matrix.getNumRows(), gF2mField, polynomialGF2mSmallM, permutation, this.getHighSpeedVideoFpsRanges.getParameters().getDigest()));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2KeyGenerationParameters) keyGenerationParameters;
        this.getOutputFormats = keyGenerationParameters.getRandom();
        this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getParameters().getM();
        this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.getParameters().getN();
        this.getOutputMinFrameDuration = this.getHighSpeedVideoFpsRanges.getParameters().getT();
        this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.getParameters().getFieldPoly();
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }
}
