package org.bouncycastle.crypto.ec;

/* loaded from: classes17.dex */
public class ECNewRandomnessTransform implements org.bouncycastle.crypto.ec.ECPairFactorTransform {
    private org.bouncycastle.crypto.params.ECPublicKeyParameters Camera2StreamConfigurationMap;
    private java.security.SecureRandom getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.ec.ECPairTransform
    public org.bouncycastle.crypto.ec.ECPair transform(org.bouncycastle.crypto.ec.ECPair eCPair) {
        org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = this.Camera2StreamConfigurationMap;
        if (eCPublicKeyParameters == null) {
            throw new java.lang.IllegalStateException("ECNewRandomnessTransform not initialised");
        }
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        java.math.BigInteger n = parameters.getN();
        org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier = createBasePointMultiplier();
        java.math.BigInteger highResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.ec.ECUtil.getHighResolutionOutputSizeshNQ4ISI(n, this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.math.ec.ECPoint[] eCPointArr = {createBasePointMultiplier.multiply(parameters.getG(), highResolutionOutputSizeshNQ4ISI).add(org.bouncycastle.math.ec.ECAlgorithms.cleanPoint(parameters.getCurve(), eCPair.getX())), this.Camera2StreamConfigurationMap.getQ().multiply(highResolutionOutputSizeshNQ4ISI).add(org.bouncycastle.math.ec.ECAlgorithms.cleanPoint(parameters.getCurve(), eCPair.getY()))};
        parameters.getCurve().normalizeAll(eCPointArr);
        this.getHighSpeedVideoFpsRangesFor = highResolutionOutputSizeshNQ4ISI;
        return new org.bouncycastle.crypto.ec.ECPair(eCPointArr[0], eCPointArr[1]);
    }

    @Override // org.bouncycastle.crypto.ec.ECPairTransform
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        java.security.SecureRandom secureRandom;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            if (!(parametersWithRandom.getParameters() instanceof org.bouncycastle.crypto.params.ECPublicKeyParameters)) {
                throw new java.lang.IllegalArgumentException("ECPublicKeyParameters are required for new randomness transform.");
            }
            this.Camera2StreamConfigurationMap = (org.bouncycastle.crypto.params.ECPublicKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ECPublicKeyParameters)) {
                throw new java.lang.IllegalArgumentException("ECPublicKeyParameters are required for new randomness transform.");
            }
            this.Camera2StreamConfigurationMap = (org.bouncycastle.crypto.params.ECPublicKeyParameters) cipherParameters;
            secureRandom = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        }
        this.getHighSpeedVideoFpsRanges = secureRandom;
    }

    @Override // org.bouncycastle.crypto.ec.ECPairFactorTransform
    public java.math.BigInteger getTransformValue() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    protected org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier() {
        return new org.bouncycastle.math.ec.FixedPointCombMultiplier();
    }
}
