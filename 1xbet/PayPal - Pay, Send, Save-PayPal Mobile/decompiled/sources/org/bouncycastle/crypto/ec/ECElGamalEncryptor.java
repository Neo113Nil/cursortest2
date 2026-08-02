package org.bouncycastle.crypto.ec;

/* loaded from: classes17.dex */
public class ECElGamalEncryptor implements org.bouncycastle.crypto.ec.ECEncryptor {
    private org.bouncycastle.crypto.params.ECPublicKeyParameters getHighSpeedVideoFpsRanges;
    private java.security.SecureRandom getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.ec.ECEncryptor
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        java.security.SecureRandom secureRandom;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            if (!(parametersWithRandom.getParameters() instanceof org.bouncycastle.crypto.params.ECPublicKeyParameters)) {
                throw new java.lang.IllegalArgumentException("ECPublicKeyParameters are required for encryption.");
            }
            this.getHighSpeedVideoFpsRanges = (org.bouncycastle.crypto.params.ECPublicKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ECPublicKeyParameters)) {
                throw new java.lang.IllegalArgumentException("ECPublicKeyParameters are required for encryption.");
            }
            this.getHighSpeedVideoFpsRanges = (org.bouncycastle.crypto.params.ECPublicKeyParameters) cipherParameters;
            secureRandom = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
        }
        this.getHighSpeedVideoSizes = secureRandom;
    }

    @Override // org.bouncycastle.crypto.ec.ECEncryptor
    public org.bouncycastle.crypto.ec.ECPair encrypt(org.bouncycastle.math.ec.ECPoint eCPoint) {
        org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = this.getHighSpeedVideoFpsRanges;
        if (eCPublicKeyParameters == null) {
            throw new java.lang.IllegalStateException("ECElGamalEncryptor not initialised");
        }
        org.bouncycastle.crypto.params.ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        java.math.BigInteger highResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.ec.ECUtil.getHighResolutionOutputSizeshNQ4ISI(parameters.getN(), this.getHighSpeedVideoSizes);
        org.bouncycastle.math.ec.ECPoint[] eCPointArr = {createBasePointMultiplier().multiply(parameters.getG(), highResolutionOutputSizeshNQ4ISI), this.getHighSpeedVideoFpsRanges.getQ().multiply(highResolutionOutputSizeshNQ4ISI).add(org.bouncycastle.math.ec.ECAlgorithms.cleanPoint(parameters.getCurve(), eCPoint))};
        parameters.getCurve().normalizeAll(eCPointArr);
        return new org.bouncycastle.crypto.ec.ECPair(eCPointArr[0], eCPointArr[1]);
    }

    protected org.bouncycastle.math.ec.ECMultiplier createBasePointMultiplier() {
        return new org.bouncycastle.math.ec.FixedPointCombMultiplier();
    }
}
