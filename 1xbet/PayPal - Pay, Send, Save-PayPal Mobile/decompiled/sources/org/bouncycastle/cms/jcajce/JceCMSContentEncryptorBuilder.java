package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JceCMSContentEncryptorBuilder {
    private static final org.bouncycastle.operator.SecretKeySizeProvider getHighSpeedVideoFpsRangesFor = org.bouncycastle.operator.DefaultSecretKeySizeProvider.INSTANCE;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private java.security.AlgorithmParameters getHighSpeedVideoFpsRanges;
    private org.bouncycastle.cms.jcajce.EnvelopedDataHelper getHighSpeedVideoSizes;
    private final int getInputSizeshNQ4ISI;
    private java.security.SecureRandom getOutputFormats;

    static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI() {
        return ((java.lang.Boolean) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() { // from class: org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder.1
            @Override // java.security.PrivilegedAction
            public final java.lang.Object run() {
                try {
                    return java.lang.Boolean.valueOf(javax.crypto.Cipher.class.getMethod("updateAAD", byte[].class) != null);
                } catch (java.lang.Exception unused) {
                    return java.lang.Boolean.FALSE;
                }
            }
        })).booleanValue();
    }

    public org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder setSecureRandom(java.security.SecureRandom secureRandom) {
        this.getOutputFormats = secureRandom;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.ProviderJcaJceExtHelper(provider));
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder setProvider(java.lang.String str) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.NamedJcaJceExtHelper(str));
        return this;
    }

    class CMSAuthOutputEncryptor implements org.bouncycastle.operator.OutputAEADEncryptor {
        private org.bouncycastle.operator.MacCaptureStream Camera2StreamConfigurationMap;
        private javax.crypto.SecretKey getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
        private javax.crypto.Cipher getHighSpeedVideoSizes;

        @Override // org.bouncycastle.operator.OutputEncryptor
        public java.io.OutputStream getOutputStream(java.io.OutputStream outputStream) {
            this.Camera2StreamConfigurationMap = new org.bouncycastle.operator.MacCaptureStream(outputStream, org.bouncycastle.asn1.cms.GCMParameters.getInstance(this.getHighSpeedVideoFpsRangesFor.getParameters()).getIcvLen());
            return new org.bouncycastle.jcajce.io.CipherOutputStream(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        }

        @Override // org.bouncycastle.operator.AADProcessor
        public byte[] getMAC() {
            return this.Camera2StreamConfigurationMap.getMac();
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public org.bouncycastle.operator.GenericKey getKey() {
            return new org.bouncycastle.operator.jcajce.JceGenericKey(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // org.bouncycastle.operator.AADProcessor
        public java.io.OutputStream getAADStream() {
            if (org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder.getHighResolutionOutputSizeshNQ4ISI()) {
                return new org.bouncycastle.cms.jcajce.JceAADStream(this.getHighSpeedVideoSizes);
            }
            return null;
        }

        CMSAuthOutputEncryptor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i, java.security.AlgorithmParameters algorithmParameters, java.security.SecureRandom secureRandom) throws org.bouncycastle.cms.CMSException {
            javax.crypto.KeyGenerator createKeyGenerator = org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder.this.getHighSpeedVideoSizes.createKeyGenerator(aSN1ObjectIdentifier);
            java.security.SecureRandom secureRandom2 = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom(secureRandom);
            if (i < 0) {
                createKeyGenerator.init(secureRandom2);
            } else {
                createKeyGenerator.init(i, secureRandom2);
            }
            this.getHighSpeedVideoSizes = org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder.this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(aSN1ObjectIdentifier);
            this.getHighResolutionOutputSizeshNQ4ISI = createKeyGenerator.generateKey();
            algorithmParameters = algorithmParameters == null ? org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder.this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(aSN1ObjectIdentifier, this.getHighResolutionOutputSizeshNQ4ISI, secureRandom2) : algorithmParameters;
            try {
                this.getHighSpeedVideoSizes.init(1, this.getHighResolutionOutputSizeshNQ4ISI, algorithmParameters, secureRandom2);
                algorithmParameters = algorithmParameters == null ? this.getHighSpeedVideoSizes.getParameters() : algorithmParameters;
                org.bouncycastle.cms.jcajce.EnvelopedDataHelper unused = org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder.this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.cms.jcajce.EnvelopedDataHelper.getHighResolutionOutputSizeshNQ4ISI(aSN1ObjectIdentifier, algorithmParameters);
            } catch (java.security.GeneralSecurityException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to initialize cipher: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
            }
        }
    }

    public org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder setAlgorithmParameters(java.security.AlgorithmParameters algorithmParameters) {
        this.getHighSpeedVideoFpsRanges = algorithmParameters;
        return this;
    }

    public org.bouncycastle.operator.OutputEncryptor build() throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.asn1.ASN1Encodable parameters;
        if (this.getHighSpeedVideoFpsRanges != null) {
            return org.bouncycastle.cms.jcajce.EnvelopedDataHelper.getInputSizeshNQ4ISI(this.Camera2StreamConfigurationMap) ? new org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder.CMSAuthOutputEncryptor(this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getOutputFormats) : new org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder.CMSOutputEncryptor(this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getOutputFormats);
        }
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighResolutionOutputSizeshNQ4ISI;
        if (algorithmIdentifier != null && (parameters = algorithmIdentifier.getParameters()) != null && !parameters.equals(org.bouncycastle.asn1.DERNull.INSTANCE)) {
            try {
                java.security.AlgorithmParameters highSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI.getAlgorithm());
                this.getHighSpeedVideoFpsRanges = highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges.init(parameters.toASN1Primitive().getEncoded());
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to process provided algorithmIdentifier: ");
                sb.append(e.toString());
                throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
            }
        }
        return org.bouncycastle.cms.jcajce.EnvelopedDataHelper.getInputSizeshNQ4ISI(this.Camera2StreamConfigurationMap) ? new org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder.CMSAuthOutputEncryptor(this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getOutputFormats) : new org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder.CMSOutputEncryptor(this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getOutputFormats);
    }

    class CMSOutputEncryptor implements org.bouncycastle.operator.OutputEncryptor {
        private javax.crypto.SecretKey Camera2StreamConfigurationMap;
        private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;
        private javax.crypto.Cipher getHighSpeedVideoSizes;

        @Override // org.bouncycastle.operator.OutputEncryptor
        public java.io.OutputStream getOutputStream(java.io.OutputStream outputStream) {
            return new org.bouncycastle.jcajce.io.CipherOutputStream(outputStream, this.getHighSpeedVideoSizes);
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public org.bouncycastle.operator.GenericKey getKey() {
            return new org.bouncycastle.operator.jcajce.JceGenericKey(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
        }

        @Override // org.bouncycastle.operator.OutputEncryptor
        public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        CMSOutputEncryptor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i, java.security.AlgorithmParameters algorithmParameters, java.security.SecureRandom secureRandom) throws org.bouncycastle.cms.CMSException {
            javax.crypto.KeyGenerator createKeyGenerator = org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder.this.getHighSpeedVideoSizes.createKeyGenerator(aSN1ObjectIdentifier);
            java.security.SecureRandom secureRandom2 = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom(secureRandom);
            if (i < 0) {
                createKeyGenerator.init(secureRandom2);
            } else {
                createKeyGenerator.init(i, secureRandom2);
            }
            this.getHighSpeedVideoSizes = org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder.this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(aSN1ObjectIdentifier);
            this.Camera2StreamConfigurationMap = createKeyGenerator.generateKey();
            algorithmParameters = algorithmParameters == null ? org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder.this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(aSN1ObjectIdentifier, this.Camera2StreamConfigurationMap, secureRandom2) : algorithmParameters;
            try {
                this.getHighSpeedVideoSizes.init(1, this.Camera2StreamConfigurationMap, algorithmParameters, secureRandom2);
                algorithmParameters = algorithmParameters == null ? this.getHighSpeedVideoSizes.getParameters() : algorithmParameters;
                org.bouncycastle.cms.jcajce.EnvelopedDataHelper unused = org.bouncycastle.cms.jcajce.JceCMSContentEncryptorBuilder.this.getHighSpeedVideoSizes;
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.cms.jcajce.EnvelopedDataHelper.getHighResolutionOutputSizeshNQ4ISI(aSN1ObjectIdentifier, algorithmParameters);
            } catch (java.security.GeneralSecurityException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to initialize cipher: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
            }
        }
    }

    public JceCMSContentEncryptorBuilder(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this(algorithmIdentifier.getAlgorithm(), getHighSpeedVideoFpsRangesFor.getKeySize(algorithmIdentifier.getAlgorithm()));
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmIdentifier;
    }

    public JceCMSContentEncryptorBuilder(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.DefaultJcaJceExtHelper());
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
        int keySize = getHighSpeedVideoFpsRangesFor.getKeySize(aSN1ObjectIdentifier);
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC)) {
            if (i != 168 && i != keySize) {
                throw new java.lang.IllegalArgumentException("incorrect keySize for encryptionOID passed to builder.");
            }
            this.getInputSizeshNQ4ISI = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
            return;
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC)) {
            if (i != 56 && i != keySize) {
                throw new java.lang.IllegalArgumentException("incorrect keySize for encryptionOID passed to builder.");
            }
            this.getInputSizeshNQ4ISI = 56;
            return;
        }
        if (keySize > 0 && keySize != i) {
            throw new java.lang.IllegalArgumentException("incorrect keySize for encryptionOID passed to builder.");
        }
        this.getInputSizeshNQ4ISI = i;
    }

    public JceCMSContentEncryptorBuilder(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this(aSN1ObjectIdentifier, getHighSpeedVideoFpsRangesFor.getKeySize(aSN1ObjectIdentifier));
    }
}
