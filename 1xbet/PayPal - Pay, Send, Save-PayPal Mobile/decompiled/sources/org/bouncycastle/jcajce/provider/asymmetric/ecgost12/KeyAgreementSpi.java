package org.bouncycastle.jcajce.provider.asymmetric.ecgost12;

/* loaded from: classes17.dex */
public class KeyAgreementSpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi {
    private static final org.bouncycastle.asn1.x9.X9IntegerConverter Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x9.X9IntegerConverter();
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.params.ECDomainParameters getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.agreement.ECVKOAgreement getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizes;

    private void Camera2StreamConfigurationMap(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidKeyException {
        if (key instanceof java.security.PrivateKey) {
            org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter((java.security.PrivateKey) key);
            this.getHighSpeedVideoFpsRanges = eCPrivateKeyParameters.getParameters();
            this.ukmParameters = algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec ? ((org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec) algorithmParameterSpec).getUserKeyingMaterial() : null;
            this.getHighSpeedVideoFpsRangesFor.init(new org.bouncycastle.crypto.params.ParametersWithUKM(eCPrivateKeyParameters, this.ukmParameters));
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(" key agreement requires ");
        java.lang.String name2 = org.bouncycastle.jce.interfaces.ECPrivateKey.class.getName();
        sb.append(name2.substring(name2.lastIndexOf(46) + 1));
        sb.append(" for initialisation");
        throw new java.security.InvalidKeyException(sb.toString());
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected java.security.Key engineDoPhase(java.security.Key key, boolean z) throws java.security.InvalidKeyException, java.lang.IllegalStateException {
        if (this.getHighSpeedVideoFpsRanges == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(" not initialised.");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (!z) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(this.getHighSpeedVideoSizes);
            sb2.append(" can only be between two parties.");
            throw new java.lang.IllegalStateException(sb2.toString());
        }
        if (key instanceof java.security.PublicKey) {
            java.security.PublicKey publicKey = (java.security.PublicKey) key;
            try {
                this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.calculateAgreement(publicKey instanceof org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PublicKey ? ((org.bouncycastle.jcajce.provider.asymmetric.ecgost12.BCECGOST3410_2012PublicKey) publicKey).getHighSpeedVideoSizes : org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePublicKeyParameter(publicKey));
                return null;
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("calculation failed: ");
                sb3.append(e.getMessage());
                throw new java.security.InvalidKeyException(sb3.toString()) { // from class: org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi.1
                    @Override // java.lang.Throwable
                    public java.lang.Throwable getCause() {
                        return e;
                    }
                };
            }
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(this.getHighSpeedVideoSizes);
        sb4.append(" key agreement requires ");
        java.lang.String name2 = org.bouncycastle.jce.interfaces.ECPublicKey.class.getName();
        sb4.append(name2.substring(name2.lastIndexOf(46) + 1));
        sb4.append(" for doPhase");
        throw new java.security.InvalidKeyException(sb4.toString());
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec)) {
            throw new java.security.InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        Camera2StreamConfigurationMap(key, algorithmParameterSpec);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(java.security.Key key, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        Camera2StreamConfigurationMap(key, null);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] calcSecret() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static class ECVKO256 extends org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi {
        public ECVKO256() {
            super("ECGOST3410-2012-256", new org.bouncycastle.crypto.agreement.ECVKOAgreement(new org.bouncycastle.crypto.digests.GOST3411_2012_256Digest()), null);
        }
    }

    public static class ECVKO512 extends org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyAgreementSpi {
        public ECVKO512() {
            super("ECGOST3410-2012-512", new org.bouncycastle.crypto.agreement.ECVKOAgreement(new org.bouncycastle.crypto.digests.GOST3411_2012_256Digest()), null);
        }
    }

    protected KeyAgreementSpi(java.lang.String str, org.bouncycastle.crypto.agreement.ECVKOAgreement eCVKOAgreement, org.bouncycastle.crypto.DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = eCVKOAgreement;
    }
}
