package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public abstract class JceKeyTransRecipient implements org.bouncycastle.cms.KeyTransRecipient {
    private java.security.PrivateKey Camera2StreamConfigurationMap;
    protected org.bouncycastle.cms.jcajce.EnvelopedDataHelper contentHelper;
    protected java.util.Map extraMappings;
    protected org.bouncycastle.cms.jcajce.EnvelopedDataHelper helper;
    protected boolean unwrappedKeyMustBeEncodable;
    protected boolean validateKeySize;

    public org.bouncycastle.cms.jcajce.JceKeyTransRecipient setProvider(java.security.Provider provider) {
        org.bouncycastle.cms.jcajce.EnvelopedDataHelper envelopedDataHelper = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.ProviderJcaJceExtHelper(provider));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKeyTransRecipient setProvider(java.lang.String str) {
        org.bouncycastle.cms.jcajce.EnvelopedDataHelper envelopedDataHelper = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.NamedJcaJceExtHelper(str));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKeyTransRecipient setMustProduceEncodableUnwrappedKey(boolean z) {
        this.unwrappedKeyMustBeEncodable = z;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKeyTransRecipient setKeySizeValidation(boolean z) {
        this.validateKeySize = z;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKeyTransRecipient setContentProvider(java.security.Provider provider) {
        this.contentHelper = org.bouncycastle.cms.jcajce.CMSUtils.getHighSpeedVideoFpsRanges(provider);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKeyTransRecipient setContentProvider(java.lang.String str) {
        this.contentHelper = org.bouncycastle.cms.jcajce.CMSUtils.getHighSpeedVideoFpsRangesFor(str);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKeyTransRecipient setAlgorithmMapping(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        this.extraMappings.put(aSN1ObjectIdentifier, str);
        return this;
    }

    protected java.security.Key extractSecretKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) throws org.bouncycastle.cms.CMSException {
        if (!org.bouncycastle.cms.jcajce.CMSUtils.getHighSpeedVideoSizes(algorithmIdentifier.getAlgorithm())) {
            org.bouncycastle.operator.jcajce.JceAsymmetricKeyUnwrapper mustProduceEncodableUnwrappedKey = this.helper.createAsymmetricUnwrapper(algorithmIdentifier, this.Camera2StreamConfigurationMap).setMustProduceEncodableUnwrappedKey(this.unwrappedKeyMustBeEncodable);
            if (!this.extraMappings.isEmpty()) {
                for (org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier : this.extraMappings.keySet()) {
                    mustProduceEncodableUnwrappedKey.setAlgorithmMapping(aSN1ObjectIdentifier, (java.lang.String) this.extraMappings.get(aSN1ObjectIdentifier));
                }
            }
            try {
                java.security.Key jceKey = this.helper.getJceKey(algorithmIdentifier2.getAlgorithm(), mustProduceEncodableUnwrappedKey.generateUnwrappedKey(algorithmIdentifier2, bArr));
                if (this.validateKeySize) {
                    this.helper.keySizeCheck(algorithmIdentifier2, jceKey);
                }
                return jceKey;
            } catch (org.bouncycastle.operator.OperatorException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("exception unwrapping key: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
            }
        }
        try {
            org.bouncycastle.asn1.cryptopro.GostR3410KeyTransport gostR3410KeyTransport = org.bouncycastle.asn1.cryptopro.GostR3410KeyTransport.getInstance(bArr);
            org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters transportParameters = gostR3410KeyTransport.getTransportParameters();
            java.security.PublicKey generatePublic = this.helper.createKeyFactory(algorithmIdentifier.getAlgorithm()).generatePublic(new java.security.spec.X509EncodedKeySpec(transportParameters.getEphemeralPublicKey().getEncoded()));
            javax.crypto.KeyAgreement highResolutionOutputSizeshNQ4ISI = this.helper.getHighResolutionOutputSizeshNQ4ISI(algorithmIdentifier.getAlgorithm());
            highResolutionOutputSizeshNQ4ISI.init(this.Camera2StreamConfigurationMap, new org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec(transportParameters.getUkm()));
            highResolutionOutputSizeshNQ4ISI.doPhase(generatePublic, true);
            javax.crypto.SecretKey generateSecret = highResolutionOutputSizeshNQ4ISI.generateSecret(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap.getId());
            javax.crypto.Cipher Camera2StreamConfigurationMap = this.helper.Camera2StreamConfigurationMap(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap);
            Camera2StreamConfigurationMap.init(4, generateSecret, new org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec(transportParameters.getEncryptionParamSet(), transportParameters.getUkm()));
            org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey sessionEncryptedKey = gostR3410KeyTransport.getSessionEncryptedKey();
            return Camera2StreamConfigurationMap.unwrap(org.bouncycastle.util.Arrays.concatenate(sessionEncryptedKey.getEncryptedKey(), sessionEncryptedKey.getMacKey()), org.bouncycastle.cms.jcajce.EnvelopedDataHelper.getInputFormats(algorithmIdentifier2.getAlgorithm()), 3);
        } catch (java.lang.Exception e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("exception unwrapping key: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb2.toString(), e2);
        }
    }

    public JceKeyTransRecipient(java.security.PrivateKey privateKey) {
        org.bouncycastle.cms.jcajce.EnvelopedDataHelper envelopedDataHelper = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.DefaultJcaJceExtHelper());
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        this.extraMappings = new java.util.HashMap();
        this.validateKeySize = false;
        this.Camera2StreamConfigurationMap = org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(privateKey);
    }
}
