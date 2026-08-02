package org.bouncycastle.jcajce.provider.asymmetric.ec;

/* loaded from: classes17.dex */
public class KeyAgreementSpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi {
    private static final org.bouncycastle.asn1.x9.X9IntegerConverter getHighSpeedVideoSizes = new org.bouncycastle.asn1.x9.X9IntegerConverter();
    private java.lang.Object Camera2StreamConfigurationMap;
    private org.bouncycastle.jcajce.spec.DHUParameterSpec getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.jcajce.spec.MQVParameterSpec getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.params.ECDomainParameters getInputSizeshNQ4ISI;
    private byte[] getOutputMinFrameDuration;

    private void Camera2StreamConfigurationMap(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters;
        org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters2;
        java.lang.Object obj = this.Camera2StreamConfigurationMap;
        org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = null;
        if (obj instanceof org.bouncycastle.crypto.agreement.ECMQVBasicAgreement) {
            this.getHighSpeedVideoFpsRanges = null;
            boolean z = key instanceof org.bouncycastle.jce.interfaces.MQVPrivateKey;
            if (!z && !(algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.MQVParameterSpec)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.getHighSpeedVideoFpsRangesFor);
                sb.append(" key agreement requires ");
                java.lang.String name2 = org.bouncycastle.jcajce.spec.MQVParameterSpec.class.getName();
                sb.append(name2.substring(name2.lastIndexOf(46) + 1));
                sb.append(" for initialisation");
                throw new java.security.InvalidAlgorithmParameterException(sb.toString());
            }
            if (z) {
                org.bouncycastle.jce.interfaces.MQVPrivateKey mQVPrivateKey = (org.bouncycastle.jce.interfaces.MQVPrivateKey) key;
                eCPrivateKeyParameters2 = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(mQVPrivateKey.getStaticPrivateKey());
                eCPrivateKeyParameters = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(mQVPrivateKey.getEphemeralPrivateKey());
                if (mQVPrivateKey.getEphemeralPublicKey() != null) {
                    eCPublicKeyParameters = (org.bouncycastle.crypto.params.ECPublicKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighResolutionOutputSizeshNQ4ISI(mQVPrivateKey.getEphemeralPublicKey());
                }
            } else {
                org.bouncycastle.jcajce.spec.MQVParameterSpec mQVParameterSpec = (org.bouncycastle.jcajce.spec.MQVParameterSpec) algorithmParameterSpec;
                org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters3 = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter((java.security.PrivateKey) key);
                eCPrivateKeyParameters = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(mQVParameterSpec.getEphemeralPrivateKey());
                eCPublicKeyParameters = mQVParameterSpec.getEphemeralPublicKey() != null ? (org.bouncycastle.crypto.params.ECPublicKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighResolutionOutputSizeshNQ4ISI(mQVParameterSpec.getEphemeralPublicKey()) : null;
                this.getHighSpeedVideoFpsRanges = mQVParameterSpec;
                this.ukmParameters = mQVParameterSpec.getUserKeyingMaterial();
                eCPrivateKeyParameters2 = eCPrivateKeyParameters3;
            }
            org.bouncycastle.crypto.params.MQVPrivateParameters mQVPrivateParameters = new org.bouncycastle.crypto.params.MQVPrivateParameters(eCPrivateKeyParameters2, eCPrivateKeyParameters, eCPublicKeyParameters);
            this.getInputSizeshNQ4ISI = eCPrivateKeyParameters2.getParameters();
            ((org.bouncycastle.crypto.agreement.ECMQVBasicAgreement) this.Camera2StreamConfigurationMap).init(mQVPrivateParameters);
            return;
        }
        if (!(algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.DHUParameterSpec)) {
            if (!(key instanceof java.security.PrivateKey)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(this.getHighSpeedVideoFpsRangesFor);
                sb2.append(" key agreement requires ");
                java.lang.String name3 = org.bouncycastle.jce.interfaces.ECPrivateKey.class.getName();
                sb2.append(name3.substring(name3.lastIndexOf(46) + 1));
                sb2.append(" for initialisation");
                throw new java.security.InvalidKeyException(sb2.toString());
            }
            if (this.kdf == null && (algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec)) {
                throw new java.security.InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
            }
            org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters4 = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter((java.security.PrivateKey) key);
            this.getInputSizeshNQ4ISI = eCPrivateKeyParameters4.getParameters();
            this.ukmParameters = algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec ? ((org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec) algorithmParameterSpec).getUserKeyingMaterial() : null;
            ((org.bouncycastle.crypto.BasicAgreement) this.Camera2StreamConfigurationMap).init(eCPrivateKeyParameters4);
            return;
        }
        if (!(obj instanceof org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement)) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(this.getHighSpeedVideoFpsRangesFor);
            sb3.append(" key agreement cannot be used with ");
            java.lang.String name4 = org.bouncycastle.jcajce.spec.DHUParameterSpec.class.getName();
            sb3.append(name4.substring(name4.lastIndexOf(46) + 1));
            throw new java.security.InvalidAlgorithmParameterException(sb3.toString());
        }
        org.bouncycastle.jcajce.spec.DHUParameterSpec dHUParameterSpec = (org.bouncycastle.jcajce.spec.DHUParameterSpec) algorithmParameterSpec;
        org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters5 = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter((java.security.PrivateKey) key);
        org.bouncycastle.crypto.params.ECPrivateKeyParameters eCPrivateKeyParameters6 = (org.bouncycastle.crypto.params.ECPrivateKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(dHUParameterSpec.getEphemeralPrivateKey());
        org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters2 = dHUParameterSpec.getEphemeralPublicKey() != null ? (org.bouncycastle.crypto.params.ECPublicKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighResolutionOutputSizeshNQ4ISI(dHUParameterSpec.getEphemeralPublicKey()) : null;
        this.getHighResolutionOutputSizeshNQ4ISI = dHUParameterSpec;
        this.ukmParameters = dHUParameterSpec.getUserKeyingMaterial();
        org.bouncycastle.crypto.params.ECDHUPrivateParameters eCDHUPrivateParameters = new org.bouncycastle.crypto.params.ECDHUPrivateParameters(eCPrivateKeyParameters5, eCPrivateKeyParameters6, eCPublicKeyParameters2);
        this.getInputSizeshNQ4ISI = eCPrivateKeyParameters5.getParameters();
        ((org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement) this.Camera2StreamConfigurationMap).init(eCDHUPrivateParameters);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected java.security.Key engineDoPhase(java.security.Key key, boolean z) throws java.security.InvalidKeyException, java.lang.IllegalStateException {
        org.bouncycastle.crypto.CipherParameters highResolutionOutputSizeshNQ4ISI;
        if (this.getInputSizeshNQ4ISI == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(" not initialised.");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (!z) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(this.getHighSpeedVideoFpsRangesFor);
            sb2.append(" can only be between two parties.");
            throw new java.lang.IllegalStateException(sb2.toString());
        }
        java.lang.Object obj = this.Camera2StreamConfigurationMap;
        if (obj instanceof org.bouncycastle.crypto.agreement.ECMQVBasicAgreement) {
            if (key instanceof org.bouncycastle.jce.interfaces.MQVPublicKey) {
                org.bouncycastle.jce.interfaces.MQVPublicKey mQVPublicKey = (org.bouncycastle.jce.interfaces.MQVPublicKey) key;
                highResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.MQVPublicParameters((org.bouncycastle.crypto.params.ECPublicKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighResolutionOutputSizeshNQ4ISI(mQVPublicKey.getStaticKey()), (org.bouncycastle.crypto.params.ECPublicKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighResolutionOutputSizeshNQ4ISI(mQVPublicKey.getEphemeralKey()));
            } else {
                highResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.MQVPublicParameters((org.bouncycastle.crypto.params.ECPublicKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighResolutionOutputSizeshNQ4ISI((java.security.PublicKey) key), (org.bouncycastle.crypto.params.ECPublicKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges.getOtherPartyEphemeralKey()));
            }
        } else if (obj instanceof org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement) {
            highResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.params.ECDHUPublicParameters((org.bouncycastle.crypto.params.ECPublicKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighResolutionOutputSizeshNQ4ISI((java.security.PublicKey) key), (org.bouncycastle.crypto.params.ECPublicKeyParameters) org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI.getOtherPartyEphemeralKey()));
        } else {
            if (!(key instanceof java.security.PublicKey)) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(this.getHighSpeedVideoFpsRangesFor);
                sb3.append(" key agreement requires ");
                java.lang.String name2 = org.bouncycastle.jce.interfaces.ECPublicKey.class.getName();
                sb3.append(name2.substring(name2.lastIndexOf(46) + 1));
                sb3.append(" for doPhase");
                throw new java.security.InvalidKeyException(sb3.toString());
            }
            highResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.asymmetric.ec.ECUtils.getHighResolutionOutputSizeshNQ4ISI((java.security.PublicKey) key);
        }
        try {
            java.lang.Object obj2 = this.Camera2StreamConfigurationMap;
            if (obj2 instanceof org.bouncycastle.crypto.BasicAgreement) {
                this.getOutputMinFrameDuration = bigIntToBytes(((org.bouncycastle.crypto.BasicAgreement) obj2).calculateAgreement(highResolutionOutputSizeshNQ4ISI));
                return null;
            }
            this.getOutputMinFrameDuration = ((org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement) obj2).calculateAgreement(highResolutionOutputSizeshNQ4ISI);
            return null;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("calculation failed: ");
            sb4.append(e.getMessage());
            throw new java.security.InvalidKeyException(sb4.toString()) { // from class: org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi.1
                @Override // java.lang.Throwable
                public java.lang.Throwable getCause() {
                    return e;
                }
            };
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.MQVParameterSpec) && !(algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec) && !(algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.DHUParameterSpec)) {
            throw new java.security.InvalidAlgorithmParameterException("No algorithm parameters supported");
        }
        Camera2StreamConfigurationMap(key, algorithmParameterSpec);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(java.security.Key key, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        try {
            Camera2StreamConfigurationMap(key, null);
        } catch (java.security.InvalidAlgorithmParameterException e) {
            throw new java.security.InvalidKeyException(e.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] calcSecret() {
        return org.bouncycastle.util.Arrays.clone(this.getOutputMinFrameDuration);
    }

    protected byte[] bigIntToBytes(java.math.BigInteger bigInteger) {
        org.bouncycastle.asn1.x9.X9IntegerConverter x9IntegerConverter = getHighSpeedVideoSizes;
        return x9IntegerConverter.integerToBytes(bigInteger, x9IntegerConverter.getByteLength(this.getInputSizeshNQ4ISI.getCurve()));
    }

    protected KeyAgreementSpi(java.lang.String str, org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement eCDHCUnifiedAgreement, org.bouncycastle.crypto.DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = eCDHCUnifiedAgreement;
    }

    public static class CDHwithSHA1KDFAndSharedInfo extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public CDHwithSHA1KDFAndSharedInfo() {
            super("ECCDHwithSHA1KDF", new org.bouncycastle.crypto.agreement.ECDHCBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()));
        }
    }

    public static class CDHwithSHA224KDFAndSharedInfo extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public CDHwithSHA224KDFAndSharedInfo() {
            super("ECCDHwithSHA224KDF", new org.bouncycastle.crypto.agreement.ECDHCBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA224()));
        }
    }

    public static class CDHwithSHA256KDFAndSharedInfo extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public CDHwithSHA256KDFAndSharedInfo() {
            super("ECCDHwithSHA256KDF", new org.bouncycastle.crypto.agreement.ECDHCBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class CDHwithSHA384KDFAndSharedInfo extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public CDHwithSHA384KDFAndSharedInfo() {
            super("ECCDHwithSHA384KDF", new org.bouncycastle.crypto.agreement.ECDHCBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384()));
        }
    }

    public static class CDHwithSHA512KDFAndSharedInfo extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public CDHwithSHA512KDFAndSharedInfo() {
            super("ECCDHwithSHA512KDF", new org.bouncycastle.crypto.agreement.ECDHCBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static class DH extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DH() {
            super("ECDH", new org.bouncycastle.crypto.agreement.ECDHBasicAgreement(), (org.bouncycastle.crypto.DerivationFunction) null);
        }
    }

    public static class DHC extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHC() {
            super("ECDHC", new org.bouncycastle.crypto.agreement.ECDHCBasicAgreement(), (org.bouncycastle.crypto.DerivationFunction) null);
        }
    }

    public static class DHUC extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHUC() {
            super("ECCDHU", new org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement(), (org.bouncycastle.crypto.DerivationFunction) null);
        }
    }

    public static class DHUwithSHA1CKDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            super("ECCDHUwithSHA1CKDF", new org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()));
        }
    }

    public static class DHUwithSHA1KDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            super("ECCDHUwithSHA1KDF", new org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()));
        }
    }

    public static class DHUwithSHA224CKDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            super("ECCDHUwithSHA224CKDF", new org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA224()));
        }
    }

    public static class DHUwithSHA224KDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            super("ECCDHUwithSHA224KDF", new org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA224()));
        }
    }

    public static class DHUwithSHA256CKDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            super("ECCDHUwithSHA256CKDF", new org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class DHUwithSHA256KDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            super("ECCDHUwithSHA256KDF", new org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class DHUwithSHA384CKDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            super("ECCDHUwithSHA384CKDF", new org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384()));
        }
    }

    public static class DHUwithSHA384KDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            super("ECCDHUwithSHA384KDF", new org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384()));
        }
    }

    public static class DHUwithSHA512CKDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            super("ECCDHUwithSHA512CKDF", new org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static class DHUwithSHA512KDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            super("ECCDHUwithSHA512KDF", new org.bouncycastle.crypto.agreement.ECDHCUnifiedAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static class DHwithSHA1CKDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super("ECDHwithSHA1CKDF", new org.bouncycastle.crypto.agreement.ECDHCBasicAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA1KDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super("ECDHwithSHA1KDF", new org.bouncycastle.crypto.agreement.ECDHBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA1KDFAndSharedInfo extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHwithSHA1KDFAndSharedInfo() {
            super("ECDHwithSHA1KDF", new org.bouncycastle.crypto.agreement.ECDHBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA224KDFAndSharedInfo extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHwithSHA224KDFAndSharedInfo() {
            super("ECDHwithSHA224KDF", new org.bouncycastle.crypto.agreement.ECDHBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA224()));
        }
    }

    public static class DHwithSHA256CKDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super("ECDHwithSHA256CKDF", new org.bouncycastle.crypto.agreement.ECDHCBasicAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class DHwithSHA256KDFAndSharedInfo extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHwithSHA256KDFAndSharedInfo() {
            super("ECDHwithSHA256KDF", new org.bouncycastle.crypto.agreement.ECDHBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class DHwithSHA384CKDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super("ECDHwithSHA384CKDF", new org.bouncycastle.crypto.agreement.ECDHCBasicAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384()));
        }
    }

    public static class DHwithSHA384KDFAndSharedInfo extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHwithSHA384KDFAndSharedInfo() {
            super("ECDHwithSHA384KDF", new org.bouncycastle.crypto.agreement.ECDHBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384()));
        }
    }

    public static class DHwithSHA512CKDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super("ECDHwithSHA512CKDF", new org.bouncycastle.crypto.agreement.ECDHCBasicAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static class DHwithSHA512KDFAndSharedInfo extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public DHwithSHA512KDFAndSharedInfo() {
            super("ECDHwithSHA512KDF", new org.bouncycastle.crypto.agreement.ECDHBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static class ECKAEGwithRIPEMD160KDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public ECKAEGwithRIPEMD160KDF() {
            super("ECKAEGwithRIPEMD160KDF", new org.bouncycastle.crypto.agreement.ECDHBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(new org.bouncycastle.crypto.digests.RIPEMD160Digest()));
        }
    }

    public static class ECKAEGwithSHA1KDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public ECKAEGwithSHA1KDF() {
            super("ECKAEGwithSHA1KDF", new org.bouncycastle.crypto.agreement.ECDHBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()));
        }
    }

    public static class ECKAEGwithSHA224KDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public ECKAEGwithSHA224KDF() {
            super("ECKAEGwithSHA224KDF", new org.bouncycastle.crypto.agreement.ECDHBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA224()));
        }
    }

    public static class ECKAEGwithSHA256KDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public ECKAEGwithSHA256KDF() {
            super("ECKAEGwithSHA256KDF", new org.bouncycastle.crypto.agreement.ECDHBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class ECKAEGwithSHA384KDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public ECKAEGwithSHA384KDF() {
            super("ECKAEGwithSHA384KDF", new org.bouncycastle.crypto.agreement.ECDHBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384()));
        }
    }

    public static class ECKAEGwithSHA512KDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public ECKAEGwithSHA512KDF() {
            super("ECKAEGwithSHA512KDF", new org.bouncycastle.crypto.agreement.ECDHBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static class MQV extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public MQV() {
            super("ECMQV", new org.bouncycastle.crypto.agreement.ECMQVBasicAgreement(), (org.bouncycastle.crypto.DerivationFunction) null);
        }
    }

    public static class MQVwithSHA1CKDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super("ECMQVwithSHA1CKDF", new org.bouncycastle.crypto.agreement.ECMQVBasicAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()));
        }
    }

    public static class MQVwithSHA1KDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            super("ECMQVwithSHA1KDF", new org.bouncycastle.crypto.agreement.ECMQVBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()));
        }
    }

    public static class MQVwithSHA1KDFAndSharedInfo extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public MQVwithSHA1KDFAndSharedInfo() {
            super("ECMQVwithSHA1KDF", new org.bouncycastle.crypto.agreement.ECMQVBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA1()));
        }
    }

    public static class MQVwithSHA224CKDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super("ECMQVwithSHA224CKDF", new org.bouncycastle.crypto.agreement.ECMQVBasicAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA224()));
        }
    }

    public static class MQVwithSHA224KDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            super("ECMQVwithSHA224KDF", new org.bouncycastle.crypto.agreement.ECMQVBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA224()));
        }
    }

    public static class MQVwithSHA224KDFAndSharedInfo extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public MQVwithSHA224KDFAndSharedInfo() {
            super("ECMQVwithSHA224KDF", new org.bouncycastle.crypto.agreement.ECMQVBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA224()));
        }
    }

    public static class MQVwithSHA256CKDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super("ECMQVwithSHA256CKDF", new org.bouncycastle.crypto.agreement.ECMQVBasicAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class MQVwithSHA256KDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            super("ECMQVwithSHA256KDF", new org.bouncycastle.crypto.agreement.ECMQVBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class MQVwithSHA256KDFAndSharedInfo extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public MQVwithSHA256KDFAndSharedInfo() {
            super("ECMQVwithSHA256KDF", new org.bouncycastle.crypto.agreement.ECMQVBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA256()));
        }
    }

    public static class MQVwithSHA384CKDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super("ECMQVwithSHA384CKDF", new org.bouncycastle.crypto.agreement.ECMQVBasicAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384()));
        }
    }

    public static class MQVwithSHA384KDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            super("ECMQVwithSHA384KDF", new org.bouncycastle.crypto.agreement.ECMQVBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384()));
        }
    }

    public static class MQVwithSHA384KDFAndSharedInfo extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public MQVwithSHA384KDFAndSharedInfo() {
            super("ECMQVwithSHA384KDF", new org.bouncycastle.crypto.agreement.ECMQVBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA384()));
        }
    }

    public static class MQVwithSHA512CKDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super("ECMQVwithSHA512CKDF", new org.bouncycastle.crypto.agreement.ECMQVBasicAgreement(), new org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static class MQVwithSHA512KDF extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            super("ECMQVwithSHA512KDF", new org.bouncycastle.crypto.agreement.ECMQVBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    public static class MQVwithSHA512KDFAndSharedInfo extends org.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi {
        public MQVwithSHA512KDFAndSharedInfo() {
            super("ECMQVwithSHA512KDF", new org.bouncycastle.crypto.agreement.ECMQVBasicAgreement(), new org.bouncycastle.crypto.generators.KDF2BytesGenerator(org.bouncycastle.crypto.util.DigestFactory.createSHA512()));
        }
    }

    protected KeyAgreementSpi(java.lang.String str, org.bouncycastle.crypto.BasicAgreement basicAgreement, org.bouncycastle.crypto.DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = basicAgreement;
    }
}
