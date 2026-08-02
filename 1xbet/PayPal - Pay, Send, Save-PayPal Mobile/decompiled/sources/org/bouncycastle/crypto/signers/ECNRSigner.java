package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class ECNRSigner implements org.bouncycastle.crypto.DSAExt {
    private org.bouncycastle.crypto.params.ECKeyParameters Camera2StreamConfigurationMap;
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.DSA
    public boolean verifySignature(byte[] bArr, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        if (this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("not initialised for verifying");
        }
        org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = (org.bouncycastle.crypto.params.ECPublicKeyParameters) this.Camera2StreamConfigurationMap;
        java.math.BigInteger n = eCPublicKeyParameters.getParameters().getN();
        int bitLength = n.bitLength();
        java.math.BigInteger bigInteger3 = new java.math.BigInteger(1, bArr);
        if (bigInteger3.bitLength() > bitLength) {
            throw new org.bouncycastle.crypto.DataLengthException("input too large for ECNR key.");
        }
        java.math.BigInteger highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(eCPublicKeyParameters, bigInteger, bigInteger2);
        return highResolutionOutputSizeshNQ4ISI != null && highResolutionOutputSizeshNQ4ISI.equals(bigInteger3.mod(n));
    }

    @Override // org.bouncycastle.crypto.DSA
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighSpeedVideoFpsRangesFor = z;
        if (!z) {
            this.Camera2StreamConfigurationMap = (org.bouncycastle.crypto.params.ECPublicKeyParameters) cipherParameters;
            return;
        }
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom)) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            this.Camera2StreamConfigurationMap = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) cipherParameters;
        } else {
            org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
            this.getHighResolutionOutputSizeshNQ4ISI = parametersWithRandom.getRandom();
            this.Camera2StreamConfigurationMap = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) parametersWithRandom.getParameters();
        }
    }

    public byte[] getRecoveredMessage(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        if (this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("not initialised for verifying/recovery");
        }
        java.math.BigInteger highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((org.bouncycastle.crypto.params.ECPublicKeyParameters) this.Camera2StreamConfigurationMap, bigInteger, bigInteger2);
        if (highResolutionOutputSizeshNQ4ISI != null) {
            return org.bouncycastle.util.BigIntegers.asUnsignedByteArray(highResolutionOutputSizeshNQ4ISI);
        }
        return null;
    }

    @Override // org.bouncycastle.crypto.DSAExt
    public java.math.BigInteger getOrder() {
        return this.Camera2StreamConfigurationMap.getParameters().getN();
    }

    @Override // org.bouncycastle.crypto.DSA
    public java.math.BigInteger[] generateSignature(byte[] bArr) {
        org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair;
        java.math.BigInteger mod;
        if (!this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("not initialised for signing");
        }
        java.math.BigInteger order = getOrder();
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr);
        org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) this.Camera2StreamConfigurationMap;
        if (bigInteger.compareTo(order) >= 0) {
            throw new org.bouncycastle.crypto.DataLengthException("input too large for ECNR key");
        }
        do {
            org.bouncycastle.crypto.generators.ECKeyPairGenerator eCKeyPairGenerator = new org.bouncycastle.crypto.generators.ECKeyPairGenerator();
            eCKeyPairGenerator.init(new org.bouncycastle.crypto.params.ECKeyGenerationParameters(eCPrivateKeyParameters.getParameters(), this.getHighResolutionOutputSizeshNQ4ISI));
            generateKeyPair = eCKeyPairGenerator.generateKeyPair();
            mod = ((org.bouncycastle.crypto.params.ECPublicKeyParameters) generateKeyPair.getPublic()).getQ().getAffineXCoord().toBigInteger().add(bigInteger).mod(order);
        } while (mod.equals(org.bouncycastle.math.ec.ECConstants.ZERO));
        return new java.math.BigInteger[]{mod, ((org.bouncycastle.crypto.params.ECPrivateKeyParameters) generateKeyPair.getPrivate()).getD().subtract(mod.multiply(eCPrivateKeyParameters.getD())).mod(order)};
    }

    private static java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        java.math.BigInteger n = eCPublicKeyParameters.getParameters().getN();
        if (bigInteger.compareTo(org.bouncycastle.math.ec.ECConstants.ONE) < 0 || bigInteger.compareTo(n) >= 0 || bigInteger2.compareTo(org.bouncycastle.math.ec.ECConstants.ZERO) < 0 || bigInteger2.compareTo(n) >= 0) {
            return null;
        }
        org.bouncycastle.math.ec.ECPoint normalize = org.bouncycastle.math.ec.ECAlgorithms.sumOfTwoMultiplies(eCPublicKeyParameters.getParameters().getG(), bigInteger2, eCPublicKeyParameters.getQ(), bigInteger).normalize();
        if (normalize.isInfinity()) {
            return null;
        }
        return bigInteger.subtract(normalize.getAffineXCoord().toBigInteger()).mod(n);
    }
}
