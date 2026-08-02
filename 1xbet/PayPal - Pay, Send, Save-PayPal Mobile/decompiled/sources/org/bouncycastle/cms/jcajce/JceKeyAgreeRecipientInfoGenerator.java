package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JceKeyAgreeRecipientInfoGenerator extends org.bouncycastle.cms.KeyAgreeRecipientInfoGenerator {
    private static org.bouncycastle.cms.jcajce.KeyMaterialGenerator Camera2StreamConfigurationMap = new org.bouncycastle.cms.jcajce.RFC5753KeyMaterialGenerator();
    private org.bouncycastle.cms.jcajce.EnvelopedDataHelper getHighResolutionOutputSizeshNQ4ISI;
    private java.security.SecureRandom getHighSpeedVideoFpsRanges;
    private org.bouncycastle.operator.SecretKeySizeProvider getHighSpeedVideoFpsRangesFor;
    private java.security.KeyPair getHighSpeedVideoSizes;
    private java.security.PrivateKey getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private java.util.List getInputSizeshNQ4ISI;
    private java.util.List getOutputFormats;
    private java.security.PublicKey getOutputMinFrameDuration;

    public org.bouncycastle.cms.jcajce.JceKeyAgreeRecipientInfoGenerator setUserKeyingMaterial(byte[] bArr) {
        this.getInputFormats = org.bouncycastle.util.Arrays.clone(bArr);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKeyAgreeRecipientInfoGenerator setSecureRandom(java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoFpsRanges = secureRandom;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKeyAgreeRecipientInfoGenerator setProvider(java.security.Provider provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.ProviderJcaJceExtHelper(provider));
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKeyAgreeRecipientInfoGenerator setProvider(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.NamedJcaJceExtHelper(str));
        return this;
    }

    @Override // org.bouncycastle.cms.KeyAgreeRecipientInfoGenerator
    public byte[] getUserKeyingMaterial(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.cms.CMSException {
        getHighSpeedVideoFpsRanges(algorithmIdentifier.getAlgorithm());
        java.security.KeyPair keyPair = this.getHighSpeedVideoSizes;
        if (keyPair == null) {
            return this.getInputFormats;
        }
        org.bouncycastle.asn1.cms.OriginatorPublicKey createOriginatorPublicKey = createOriginatorPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(keyPair.getPublic().getEncoded()));
        try {
            return (this.getInputFormats != null ? new org.bouncycastle.asn1.cms.ecc.MQVuserKeyingMaterial(createOriginatorPublicKey, new org.bouncycastle.asn1.DEROctetString(this.getInputFormats)) : new org.bouncycastle.asn1.cms.ecc.MQVuserKeyingMaterial(createOriginatorPublicKey, null)).getEncoded();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to encode user keying material: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    @Override // org.bouncycastle.cms.KeyAgreeRecipientInfoGenerator
    public org.bouncycastle.asn1.ASN1Sequence generateRecipientEncryptedKeys(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, org.bouncycastle.operator.GenericKey genericKey) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec userKeyingMaterialSpec;
        java.security.spec.AlgorithmParameterSpec algorithmParameterSpec;
        org.bouncycastle.asn1.DEROctetString dEROctetString;
        if (this.getInputSizeshNQ4ISI.isEmpty()) {
            throw new org.bouncycastle.cms.CMSException("No recipients associated with generator - use addRecipient()");
        }
        getHighSpeedVideoFpsRanges(algorithmIdentifier.getAlgorithm());
        java.security.PrivateKey privateKey = this.getHighSpeedVideoSizesFor;
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i = 0; i != this.getInputSizeshNQ4ISI.size(); i++) {
            java.security.PublicKey publicKey = (java.security.PublicKey) this.getOutputFormats.get(i);
            org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier keyAgreeRecipientIdentifier = (org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier) this.getInputSizeshNQ4ISI.get(i);
            try {
                org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm2 = algorithmIdentifier2.getAlgorithm();
                if (org.bouncycastle.cms.jcajce.CMSUtils.Camera2StreamConfigurationMap(algorithm)) {
                    algorithmParameterSpec = new org.bouncycastle.jcajce.spec.MQVParameterSpec(this.getHighSpeedVideoSizes, publicKey, this.getInputFormats);
                } else if (org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(algorithm)) {
                    algorithmParameterSpec = new org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec(Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(algorithmIdentifier2, this.getHighSpeedVideoFpsRangesFor.getKeySize(algorithm2), this.getInputFormats));
                } else {
                    if (org.bouncycastle.cms.jcajce.CMSUtils.getHighSpeedVideoFpsRanges(algorithm)) {
                        byte[] bArr = this.getInputFormats;
                        if (bArr != null) {
                            userKeyingMaterialSpec = new org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec(bArr);
                        } else {
                            if (algorithm.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_SSDH)) {
                                throw new org.bouncycastle.cms.CMSException("User keying material must be set for static keys.");
                            }
                            algorithmParameterSpec = null;
                        }
                    } else {
                        if (!org.bouncycastle.cms.jcajce.CMSUtils.getHighSpeedVideoSizes(algorithm)) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append("Unknown key agreement algorithm: ");
                            sb.append(algorithm);
                            throw new org.bouncycastle.cms.CMSException(sb.toString());
                        }
                        byte[] bArr2 = this.getInputFormats;
                        if (bArr2 == null) {
                            throw new org.bouncycastle.cms.CMSException("User keying material must be set for static keys.");
                        }
                        userKeyingMaterialSpec = new org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec(bArr2);
                    }
                    algorithmParameterSpec = userKeyingMaterialSpec;
                }
                javax.crypto.KeyAgreement highResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(algorithm);
                highResolutionOutputSizeshNQ4ISI.init(privateKey, algorithmParameterSpec, this.getHighSpeedVideoFpsRanges);
                highResolutionOutputSizeshNQ4ISI.doPhase(publicKey, true);
                javax.crypto.SecretKey generateSecret = highResolutionOutputSizeshNQ4ISI.generateSecret(algorithm2.getId());
                javax.crypto.Cipher Camera2StreamConfigurationMap2 = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(algorithm2);
                if (!algorithm2.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_None_KeyWrap) && !algorithm2.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap)) {
                    Camera2StreamConfigurationMap2.init(3, generateSecret, this.getHighSpeedVideoFpsRanges);
                    dEROctetString = new org.bouncycastle.asn1.DEROctetString(Camera2StreamConfigurationMap2.wrap(org.bouncycastle.cms.jcajce.EnvelopedDataHelper.getHighResolutionOutputSizeshNQ4ISI(genericKey)));
                    aSN1EncodableVector.add(new org.bouncycastle.asn1.cms.RecipientEncryptedKey(keyAgreeRecipientIdentifier, dEROctetString));
                }
                Camera2StreamConfigurationMap2.init(3, generateSecret, new org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet, this.getInputFormats));
                byte[] wrap = Camera2StreamConfigurationMap2.wrap(org.bouncycastle.cms.jcajce.EnvelopedDataHelper.getHighResolutionOutputSizeshNQ4ISI(genericKey));
                dEROctetString = new org.bouncycastle.asn1.DEROctetString(new org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey(org.bouncycastle.util.Arrays.copyOfRange(wrap, 0, wrap.length - 4), org.bouncycastle.util.Arrays.copyOfRange(wrap, wrap.length - 4, wrap.length)).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
                aSN1EncodableVector.add(new org.bouncycastle.asn1.cms.RecipientEncryptedKey(keyAgreeRecipientIdentifier, dEROctetString));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unable to encode wrapped key: ");
                sb2.append(e.getMessage());
                throw new org.bouncycastle.cms.CMSException(sb2.toString(), e);
            } catch (java.security.GeneralSecurityException e2) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("cannot perform agreement step: ");
                sb3.append(e2.getMessage());
                throw new org.bouncycastle.cms.CMSException(sb3.toString(), e2);
            }
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.cms.jcajce.JceKeyAgreeRecipientInfoGenerator addRecipient(byte[] bArr, java.security.PublicKey publicKey) throws java.security.cert.CertificateEncodingException {
        this.getInputSizeshNQ4ISI.add(new org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier(new org.bouncycastle.asn1.cms.RecipientKeyIdentifier(bArr)));
        this.getOutputFormats.add(publicKey);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKeyAgreeRecipientInfoGenerator addRecipient(java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateEncodingException {
        this.getInputSizeshNQ4ISI.add(new org.bouncycastle.asn1.cms.KeyAgreeRecipientIdentifier(org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(x509Certificate)));
        this.getOutputFormats.add(x509Certificate.getPublicKey());
        return this;
    }

    private void getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.cms.CMSException {
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = new java.security.SecureRandom();
        }
        if (org.bouncycastle.cms.jcajce.CMSUtils.Camera2StreamConfigurationMap(aSN1ObjectIdentifier) && this.getHighSpeedVideoSizes == null) {
            try {
                org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(this.getOutputMinFrameDuration.getEncoded());
                java.security.AlgorithmParameters highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(aSN1ObjectIdentifier);
                highSpeedVideoFpsRanges.init(subjectPublicKeyInfo.getAlgorithm().getParameters().toASN1Primitive().getEncoded());
                java.security.KeyPairGenerator highSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(aSN1ObjectIdentifier);
                highSpeedVideoFpsRangesFor.initialize(highSpeedVideoFpsRanges.getParameterSpec(java.security.spec.AlgorithmParameterSpec.class), this.getHighSpeedVideoFpsRanges);
                this.getHighSpeedVideoSizes = highSpeedVideoFpsRangesFor.generateKeyPair();
            } catch (java.lang.Exception e) {
                throw new org.bouncycastle.cms.CMSException("cannot determine MQV ephemeral key pair parameters from public key: ".concat(java.lang.String.valueOf(e)), e);
            }
        }
    }

    public JceKeyAgreeRecipientInfoGenerator(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.security.PrivateKey privateKey, java.security.PublicKey publicKey, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        super(aSN1ObjectIdentifier, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()), aSN1ObjectIdentifier2);
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.operator.DefaultSecretKeySizeProvider();
        this.getInputSizeshNQ4ISI = new java.util.ArrayList();
        this.getOutputFormats = new java.util.ArrayList();
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.DefaultJcaJceExtHelper());
        this.getOutputMinFrameDuration = publicKey;
        this.getHighSpeedVideoSizesFor = org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(privateKey);
    }
}
