package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

/* loaded from: classes17.dex */
public class KeyAgreementSpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi {
    private static final org.bouncycastle.asn1.x9.X9IntegerConverter getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x9.X9IntegerConverter();
    private byte[] Camera2StreamConfigurationMap;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.agreement.ECVKOAgreement getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.params.ECDomainParameters getHighSpeedVideoSizes;

    private void getHighResolutionOutputSizeshNQ4ISI(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidKeyException {
        if (key instanceof java.security.PrivateKey) {
            org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter((java.security.PrivateKey) key);
            this.getHighSpeedVideoSizes = eCPrivateKeyParameters.getParameters();
            this.ukmParameters = algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec ? ((org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec) algorithmParameterSpec).getUserKeyingMaterial() : null;
            this.getHighSpeedVideoFpsRangesFor.init(new org.bouncycastle.crypto.params.ParametersWithUKM(eCPrivateKeyParameters, this.ukmParameters));
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(" key agreement requires ");
        java.lang.String name2 = org.bouncycastle.jce.interfaces.ECPrivateKey.class.getName();
        sb.append(name2.substring(name2.lastIndexOf(46) + 1));
        sb.append(" for initialisation");
        throw new java.security.InvalidKeyException(sb.toString());
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected java.security.Key engineDoPhase(java.security.Key key, boolean z) throws java.security.InvalidKeyException, java.lang.IllegalStateException {
        if (this.getHighSpeedVideoSizes == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(" not initialised.");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (!z) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb2.append(" can only be between two parties.");
            throw new java.lang.IllegalStateException(sb2.toString());
        }
        if (key instanceof java.security.PublicKey) {
            java.security.PublicKey publicKey = (java.security.PublicKey) key;
            try {
                this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.calculateAgreement(publicKey instanceof org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey ? ((org.bouncycastle.jcajce.provider.asymmetric.ecgost.BCECGOST3410PublicKey) publicKey).getHighResolutionOutputSizeshNQ4ISI : org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePublicKeyParameter(publicKey));
                return null;
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("calculation failed: ");
                sb3.append(e.getMessage());
                throw new java.security.InvalidKeyException(sb3.toString()) { // from class: org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyAgreementSpi.1
                    @Override // java.lang.Throwable
                    public java.lang.Throwable getCause() {
                        return e;
                    }
                };
            }
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(this.getHighResolutionOutputSizeshNQ4ISI);
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
        getHighResolutionOutputSizeshNQ4ISI(key, algorithmParameterSpec);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(java.security.Key key, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        getHighResolutionOutputSizeshNQ4ISI(key, null);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] calcSecret() {
        return this.Camera2StreamConfigurationMap;
    }

    public static class ECVKO extends org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyAgreementSpi {
        public ECVKO() {
            super("ECGOST3410", new org.bouncycastle.crypto.agreement.ECVKOAgreement(new org.bouncycastle.crypto.digests.GOST3411Digest()), null);
        }
    }

    protected KeyAgreementSpi(java.lang.String str, org.bouncycastle.crypto.agreement.ECVKOAgreement eCVKOAgreement, org.bouncycastle.crypto.DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = eCVKOAgreement;
    }
}
