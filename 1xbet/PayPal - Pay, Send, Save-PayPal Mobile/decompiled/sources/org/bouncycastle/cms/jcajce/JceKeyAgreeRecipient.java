package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public abstract class JceKeyAgreeRecipient implements org.bouncycastle.cms.KeyAgreeRecipient {
    private static org.bouncycastle.cms.jcajce.KeyMaterialGenerator Camera2StreamConfigurationMap;
    private static final java.util.Set getHighResolutionOutputSizeshNQ4ISI;
    private static org.bouncycastle.cms.jcajce.KeyMaterialGenerator getHighSpeedVideoFpsRanges;
    private static org.bouncycastle.cms.jcajce.KeyMaterialGenerator getHighSpeedVideoSizes;
    protected org.bouncycastle.cms.jcajce.EnvelopedDataHelper contentHelper;
    private org.bouncycastle.operator.SecretKeySizeProvider getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizesFor;
    private java.security.PrivateKey getOutputFormats;
    protected org.bouncycastle.cms.jcajce.EnvelopedDataHelper helper;

    protected java.security.Key unwrapSessionKey(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, javax.crypto.SecretKey secretKey, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2, byte[] bArr) throws org.bouncycastle.cms.CMSException, java.security.InvalidKeyException, java.security.NoSuchAlgorithmException {
        javax.crypto.Cipher Camera2StreamConfigurationMap2 = this.helper.Camera2StreamConfigurationMap(aSN1ObjectIdentifier);
        Camera2StreamConfigurationMap2.init(4, secretKey);
        return Camera2StreamConfigurationMap2.unwrap(bArr, org.bouncycastle.cms.jcajce.EnvelopedDataHelper.getInputFormats(aSN1ObjectIdentifier2), 3);
    }

    public org.bouncycastle.cms.jcajce.JceKeyAgreeRecipient setProvider(java.security.Provider provider) {
        org.bouncycastle.cms.jcajce.EnvelopedDataHelper envelopedDataHelper = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.ProviderJcaJceExtHelper(provider));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKeyAgreeRecipient setProvider(java.lang.String str) {
        org.bouncycastle.cms.jcajce.EnvelopedDataHelper envelopedDataHelper = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.NamedJcaJceExtHelper(str));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKeyAgreeRecipient setPrivateKeyAlgorithmIdentifier(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getHighSpeedVideoSizesFor = algorithmIdentifier;
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKeyAgreeRecipient setContentProvider(java.security.Provider provider) {
        this.contentHelper = org.bouncycastle.cms.jcajce.CMSUtils.getHighSpeedVideoFpsRanges(provider);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKeyAgreeRecipient setContentProvider(java.lang.String str) {
        this.contentHelper = org.bouncycastle.cms.jcajce.CMSUtils.getHighSpeedVideoFpsRangesFor(str);
        return this;
    }

    @Override // org.bouncycastle.cms.KeyAgreeRecipient
    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getPrivateKeyAlgorithmIdentifier() {
        if (this.getHighSpeedVideoSizesFor == null) {
            this.getHighSpeedVideoSizesFor = org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(this.getOutputFormats.getEncoded()).getPrivateKeyAlgorithm();
        }
        return this.getHighSpeedVideoSizesFor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected java.security.Key extractSecretKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, byte[] bArr) throws org.bouncycastle.cms.CMSException {
        try {
            try {
                org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier3 = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(algorithmIdentifier.getParameters());
                java.security.PublicKey generatePublic = this.helper.createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()).generatePublic(new java.security.spec.X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
                try {
                    javax.crypto.SecretKey Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(algorithmIdentifier, algorithmIdentifier3, generatePublic, aSN1OctetString, this.getOutputFormats, Camera2StreamConfigurationMap);
                    if (!algorithmIdentifier3.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_None_KeyWrap) && !algorithmIdentifier3.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap)) {
                        return unwrapSessionKey(algorithmIdentifier3.getAlgorithm(), Camera2StreamConfigurationMap2, algorithmIdentifier2.getAlgorithm(), bArr);
                    }
                    org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey gost2814789EncryptedKey = org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey.getInstance(bArr);
                    org.bouncycastle.asn1.cryptopro.Gost2814789KeyWrapParameters gost2814789KeyWrapParameters = org.bouncycastle.asn1.cryptopro.Gost2814789KeyWrapParameters.getInstance(algorithmIdentifier3.getParameters());
                    javax.crypto.Cipher Camera2StreamConfigurationMap3 = this.helper.Camera2StreamConfigurationMap(algorithmIdentifier3.getAlgorithm());
                    Camera2StreamConfigurationMap3.init(4, Camera2StreamConfigurationMap2, new org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec(gost2814789KeyWrapParameters.getEncryptionParamSet(), aSN1OctetString.getOctets()));
                    return Camera2StreamConfigurationMap3.unwrap(org.bouncycastle.util.Arrays.concatenate(gost2814789EncryptedKey.getEncryptedKey(), gost2814789EncryptedKey.getMacKey()), org.bouncycastle.cms.jcajce.EnvelopedDataHelper.getInputFormats(algorithmIdentifier2.getAlgorithm()), 3);
                } catch (java.security.InvalidKeyException e) {
                    if (getHighResolutionOutputSizeshNQ4ISI.contains(algorithmIdentifier.getAlgorithm())) {
                        return unwrapSessionKey(algorithmIdentifier3.getAlgorithm(), Camera2StreamConfigurationMap(algorithmIdentifier, algorithmIdentifier3, generatePublic, aSN1OctetString, this.getOutputFormats, getHighSpeedVideoFpsRanges), algorithmIdentifier2.getAlgorithm(), bArr);
                    }
                    if (aSN1OctetString == null) {
                        throw e;
                    }
                    try {
                        return unwrapSessionKey(algorithmIdentifier3.getAlgorithm(), Camera2StreamConfigurationMap(algorithmIdentifier, algorithmIdentifier3, generatePublic, aSN1OctetString, this.getOutputFormats, getHighSpeedVideoSizes), algorithmIdentifier2.getAlgorithm(), bArr);
                    } catch (java.security.InvalidKeyException unused) {
                        throw e;
                    }
                }
            } catch (java.security.InvalidKeyException e2) {
                throw new org.bouncycastle.cms.CMSException("key invalid in message.", e2);
            }
        } catch (java.security.NoSuchAlgorithmException e3) {
            throw new org.bouncycastle.cms.CMSException("can't find algorithm.", e3);
        } catch (java.security.spec.InvalidKeySpecException e4) {
            throw new org.bouncycastle.cms.CMSException("originator key spec invalid.", e4);
        } catch (javax.crypto.NoSuchPaddingException e5) {
            throw new org.bouncycastle.cms.CMSException("required padding not supported.", e5);
        } catch (java.lang.Exception e6) {
            throw new org.bouncycastle.cms.CMSException("originator key invalid.", e6);
        }
    }

    private javax.crypto.SecretKey Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, java.security.PublicKey publicKey, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, java.security.PrivateKey privateKey, org.bouncycastle.cms.jcajce.KeyMaterialGenerator keyMaterialGenerator) throws org.bouncycastle.cms.CMSException, java.security.GeneralSecurityException, java.io.IOException {
        java.security.PrivateKey highResolutionOutputSizeshNQ4ISI = org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(privateKey);
        org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec userKeyingMaterialSpec = null;
        userKeyingMaterialSpec = null;
        if (org.bouncycastle.cms.jcajce.CMSUtils.Camera2StreamConfigurationMap(algorithmIdentifier.getAlgorithm())) {
            org.bouncycastle.asn1.cms.ecc.MQVuserKeyingMaterial mQVuserKeyingMaterial = org.bouncycastle.asn1.cms.ecc.MQVuserKeyingMaterial.getInstance(aSN1OctetString.getOctets());
            java.security.PublicKey generatePublic = this.helper.createKeyFactory(algorithmIdentifier.getAlgorithm()).generatePublic(new java.security.spec.X509EncodedKeySpec(new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(getPrivateKeyAlgorithmIdentifier(), mQVuserKeyingMaterial.getEphemeralPublicKey().getPublicKey().getBytes()).getEncoded()));
            javax.crypto.KeyAgreement highResolutionOutputSizeshNQ4ISI2 = this.helper.getHighResolutionOutputSizeshNQ4ISI(algorithmIdentifier.getAlgorithm());
            byte[] octets = mQVuserKeyingMaterial.getAddedukm() != null ? mQVuserKeyingMaterial.getAddedukm().getOctets() : null;
            org.bouncycastle.cms.jcajce.KeyMaterialGenerator keyMaterialGenerator2 = getHighSpeedVideoFpsRanges;
            if (keyMaterialGenerator == keyMaterialGenerator2) {
                octets = keyMaterialGenerator2.getHighSpeedVideoFpsRangesFor(algorithmIdentifier2, this.getHighSpeedVideoFpsRangesFor.getKeySize(algorithmIdentifier2), octets);
            }
            highResolutionOutputSizeshNQ4ISI2.init(highResolutionOutputSizeshNQ4ISI, new org.bouncycastle.jcajce.spec.MQVParameterSpec(highResolutionOutputSizeshNQ4ISI, generatePublic, octets));
            highResolutionOutputSizeshNQ4ISI2.doPhase(publicKey, true);
            return highResolutionOutputSizeshNQ4ISI2.generateSecret(algorithmIdentifier2.getAlgorithm().getId());
        }
        javax.crypto.KeyAgreement highResolutionOutputSizeshNQ4ISI3 = this.helper.getHighResolutionOutputSizeshNQ4ISI(algorithmIdentifier.getAlgorithm());
        if (org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(algorithmIdentifier.getAlgorithm())) {
            int keySize = this.getHighSpeedVideoFpsRangesFor.getKeySize(algorithmIdentifier2);
            userKeyingMaterialSpec = aSN1OctetString != null ? new org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec(keyMaterialGenerator.getHighSpeedVideoFpsRangesFor(algorithmIdentifier2, keySize, aSN1OctetString.getOctets())) : new org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec(keyMaterialGenerator.getHighSpeedVideoFpsRangesFor(algorithmIdentifier2, keySize, null));
        } else if (org.bouncycastle.cms.jcajce.CMSUtils.getHighSpeedVideoFpsRanges(algorithmIdentifier.getAlgorithm())) {
            if (aSN1OctetString != null) {
                userKeyingMaterialSpec = new org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec(aSN1OctetString.getOctets());
            }
        } else {
            if (!org.bouncycastle.cms.jcajce.CMSUtils.getHighSpeedVideoSizes(algorithmIdentifier.getAlgorithm())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown key agreement algorithm: ");
                sb.append(algorithmIdentifier.getAlgorithm());
                throw new org.bouncycastle.cms.CMSException(sb.toString());
            }
            if (aSN1OctetString != null) {
                userKeyingMaterialSpec = new org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec(aSN1OctetString.getOctets());
            }
        }
        highResolutionOutputSizeshNQ4ISI3.init(highResolutionOutputSizeshNQ4ISI, userKeyingMaterialSpec);
        highResolutionOutputSizeshNQ4ISI3.doPhase(publicKey, true);
        return highResolutionOutputSizeshNQ4ISI3.generateSecret(algorithmIdentifier2.getAlgorithm().getId());
    }

    public JceKeyAgreeRecipient(java.security.PrivateKey privateKey) {
        org.bouncycastle.cms.jcajce.EnvelopedDataHelper envelopedDataHelper = new org.bouncycastle.cms.jcajce.EnvelopedDataHelper(new org.bouncycastle.cms.jcajce.DefaultJcaJceExtHelper());
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.operator.DefaultSecretKeySizeProvider();
        this.getHighSpeedVideoSizesFor = null;
        this.getOutputFormats = org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(privateKey);
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        getHighResolutionOutputSizeshNQ4ISI = hashSet;
        hashSet.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.dhSinglePass_stdDH_sha1kdf_scheme);
        hashSet.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.mqvSinglePass_sha1kdf_scheme);
        getHighSpeedVideoFpsRanges = new org.bouncycastle.cms.jcajce.KeyMaterialGenerator() { // from class: org.bouncycastle.cms.jcajce.JceKeyAgreeRecipient.1
            @Override // org.bouncycastle.cms.jcajce.KeyMaterialGenerator
            public final byte[] getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, int i, byte[] bArr) {
                try {
                    return new org.bouncycastle.asn1.cms.ecc.ECCCMSSharedInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(algorithmIdentifier.getAlgorithm(), org.bouncycastle.asn1.DERNull.INSTANCE), bArr, org.bouncycastle.util.Pack.intToBigEndian(i)).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
                } catch (java.io.IOException e) {
                    throw new java.lang.IllegalStateException("Unable to create KDF material: ".concat(java.lang.String.valueOf(e)));
                }
            }
        };
        getHighSpeedVideoSizes = new org.bouncycastle.cms.jcajce.KeyMaterialGenerator() { // from class: org.bouncycastle.cms.jcajce.JceKeyAgreeRecipient.2
            @Override // org.bouncycastle.cms.jcajce.KeyMaterialGenerator
            public final byte[] getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, int i, byte[] bArr) {
                return bArr;
            }
        };
        Camera2StreamConfigurationMap = new org.bouncycastle.cms.jcajce.RFC5753KeyMaterialGenerator();
    }
}
