package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class EnvelopedDataHelper {
    protected static final java.util.Map BASE_CIPHER_NAMES;
    protected static final java.util.Map CIPHER_ALG_NAMES;
    protected static final org.bouncycastle.operator.SecretKeySizeProvider KEY_SIZE_PROVIDER = org.bouncycastle.operator.DefaultSecretKeySizeProvider.INSTANCE;
    protected static final java.util.Map MAC_ALG_NAMES;
    private static final short[] getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Map getHighSpeedVideoFpsRanges;
    private static final java.util.Set getHighSpeedVideoFpsRangesFor;
    private static final short[] getHighSpeedVideoSizes;
    private org.bouncycastle.cms.jcajce.JcaJceExtHelper Camera2StreamConfigurationMap;

    interface JCECallback {
        java.lang.Object Camera2StreamConfigurationMap() throws org.bouncycastle.cms.CMSException, java.security.InvalidAlgorithmParameterException, java.security.InvalidKeyException, java.security.spec.InvalidParameterSpecException, java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException, java.security.NoSuchProviderException;
    }

    public java.security.Key getJceKey(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.operator.GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof java.security.Key) {
            return (java.security.Key) genericKey.getRepresentation();
        }
        if (!(genericKey.getRepresentation() instanceof byte[])) {
            throw new java.lang.IllegalArgumentException("unknown generic key type");
        }
        byte[] bArr = (byte[]) genericKey.getRepresentation();
        java.lang.String str = (java.lang.String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str == null) {
            str = aSN1ObjectIdentifier.getId();
        }
        return new javax.crypto.spec.SecretKeySpec(bArr, str);
    }

    public void keySizeCheck(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.Key key) throws org.bouncycastle.cms.CMSException {
        byte[] bArr;
        int keySize = KEY_SIZE_PROVIDER.getKeySize(algorithmIdentifier);
        if (keySize > 0) {
            try {
                bArr = key.getEncoded();
            } catch (java.lang.Exception unused) {
                bArr = null;
            }
            if (bArr != null && bArr.length * 8 != keySize) {
                throw new org.bouncycastle.cms.CMSException("Expected key size for algorithm OID not found in recipient.");
            }
        }
    }

    static boolean getInputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return getHighSpeedVideoFpsRangesFor.contains(aSN1ObjectIdentifier);
    }

    static java.security.Key getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.operator.GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof java.security.Key) {
            return (java.security.Key) genericKey.getRepresentation();
        }
        if (genericKey.getRepresentation() instanceof byte[]) {
            return new javax.crypto.spec.SecretKeySpec((byte[]) genericKey.getRepresentation(), "ENC");
        }
        throw new java.lang.IllegalArgumentException("unknown generic key type");
    }

    static java.lang.String getInputFormats(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.lang.String str = (java.lang.String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        return str == null ? aSN1ObjectIdentifier.getId() : str;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof javax.crypto.spec.IvParameterSpec) {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, new org.bouncycastle.asn1.DEROctetString(((javax.crypto.spec.IvParameterSpec) algorithmParameterSpec).getIV()));
        }
        if (!(algorithmParameterSpec instanceof javax.crypto.spec.RC2ParameterSpec)) {
            throw new java.lang.IllegalStateException("unknown parameter spec: ".concat(java.lang.String.valueOf(algorithmParameterSpec)));
        }
        javax.crypto.spec.RC2ParameterSpec rC2ParameterSpec = (javax.crypto.spec.RC2ParameterSpec) algorithmParameterSpec;
        int effectiveKeyBits = rC2ParameterSpec.getEffectiveKeyBits();
        if (effectiveKeyBits == -1) {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, new org.bouncycastle.asn1.pkcs.RC2CBCParameter(rC2ParameterSpec.getIV()));
        }
        int i = effectiveKeyBits;
        if (effectiveKeyBits < 256) {
            i = getHighSpeedVideoSizes[effectiveKeyBits];
        }
        return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, new org.bouncycastle.asn1.pkcs.RC2CBCParameter(i, rC2ParameterSpec.getIV()));
    }

    static org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.security.AlgorithmParameters algorithmParameters) throws org.bouncycastle.cms.CMSException {
        return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, algorithmParameters != null ? org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(algorithmParameters) : org.bouncycastle.asn1.DERNull.INSTANCE);
    }

    final java.security.AlgorithmParameters getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, javax.crypto.SecretKey secretKey, java.security.SecureRandom secureRandom) throws org.bouncycastle.cms.CMSException {
        try {
            java.security.AlgorithmParameterGenerator outputFormats = getOutputFormats(aSN1ObjectIdentifier);
            if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.cms.CMSAlgorithm.RC2_CBC)) {
                byte[] bArr = new byte[8];
                secureRandom.nextBytes(bArr);
                try {
                    outputFormats.init(new javax.crypto.spec.RC2ParameterSpec(secretKey.getEncoded().length * 8, bArr), secureRandom);
                } catch (java.security.InvalidAlgorithmParameterException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("parameters generation error: ");
                    sb.append(e);
                    throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
                }
            }
            return outputFormats.generateParameters();
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        } catch (java.security.GeneralSecurityException e2) {
            throw new org.bouncycastle.cms.CMSException("exception creating algorithm parameter generator: ".concat(java.lang.String.valueOf(e2)), e2);
        }
    }

    public org.bouncycastle.operator.SymmetricKeyUnwrapper createSymmetricUnwrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, javax.crypto.SecretKey secretKey) {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(algorithmIdentifier, secretKey);
    }

    final javax.crypto.Cipher getOutputMinFrameDuration(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.cms.CMSException {
        java.lang.String str = (java.lang.String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str == null) {
            throw new org.bouncycastle.cms.CMSException("no name for ".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("RFC3211Wrap");
        try {
            return this.Camera2StreamConfigurationMap.createCipher(sb.toString());
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cannot create cipher: ");
            sb2.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb2.toString(), e);
        }
    }

    final javax.crypto.Mac getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.cms.CMSException {
        try {
            java.lang.String str = (java.lang.String) MAC_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.Camera2StreamConfigurationMap.createMac(str);
                } catch (java.security.NoSuchAlgorithmException unused) {
                }
            }
            return this.Camera2StreamConfigurationMap.createMac(aSN1ObjectIdentifier.getId());
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create mac: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    final java.security.KeyPairGenerator getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.cms.CMSException {
        try {
            java.lang.String str = (java.lang.String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.Camera2StreamConfigurationMap.createKeyPairGenerator(str);
                } catch (java.security.NoSuchAlgorithmException unused) {
                }
            }
            return this.Camera2StreamConfigurationMap.createKeyPairGenerator(aSN1ObjectIdentifier.getId());
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create key pair generator: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    public javax.crypto.KeyGenerator createKeyGenerator(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.cms.CMSException {
        try {
            java.lang.String str = (java.lang.String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.Camera2StreamConfigurationMap.createKeyGenerator(str);
                } catch (java.security.NoSuchAlgorithmException unused) {
                }
            }
            return this.Camera2StreamConfigurationMap.createKeyGenerator(aSN1ObjectIdentifier.getId());
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create key generator: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    public java.security.KeyFactory createKeyFactory(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.cms.CMSException {
        try {
            java.lang.String str = (java.lang.String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.Camera2StreamConfigurationMap.createKeyFactory(str);
                } catch (java.security.NoSuchAlgorithmException unused) {
                }
            }
            return this.Camera2StreamConfigurationMap.createKeyFactory(aSN1ObjectIdentifier.getId());
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create key factory: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    final javax.crypto.KeyAgreement getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.cms.CMSException {
        try {
            java.lang.String str = (java.lang.String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.Camera2StreamConfigurationMap.createKeyAgreement(str);
                } catch (java.security.NoSuchAlgorithmException unused) {
                }
            }
            return this.Camera2StreamConfigurationMap.createKeyAgreement(aSN1ObjectIdentifier.getId());
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create key agreement: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    public javax.crypto.Cipher createContentCipher(final java.security.Key key, final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.cms.CMSException {
        return (javax.crypto.Cipher) Camera2StreamConfigurationMap(new org.bouncycastle.cms.jcajce.EnvelopedDataHelper.JCECallback() { // from class: org.bouncycastle.cms.jcajce.EnvelopedDataHelper.1
            @Override // org.bouncycastle.cms.jcajce.EnvelopedDataHelper.JCECallback
            public final java.lang.Object Camera2StreamConfigurationMap() throws org.bouncycastle.cms.CMSException, java.security.InvalidAlgorithmParameterException, java.security.InvalidKeyException, java.security.spec.InvalidParameterSpecException, java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException, java.security.NoSuchProviderException {
                javax.crypto.Cipher Camera2StreamConfigurationMap = org.bouncycastle.cms.jcajce.EnvelopedDataHelper.this.Camera2StreamConfigurationMap(algorithmIdentifier.getAlgorithm());
                org.bouncycastle.asn1.ASN1Encodable parameters = algorithmIdentifier.getParameters();
                java.lang.String id = algorithmIdentifier.getAlgorithm().getId();
                if (parameters == null || (parameters instanceof org.bouncycastle.asn1.ASN1Null)) {
                    if (id.equals(org.bouncycastle.cms.CMSAlgorithm.DES_CBC.getId()) || id.equals(org.bouncycastle.cms.CMSEnvelopedDataGenerator.DES_EDE3_CBC) || id.equals(org.bouncycastle.cms.CMSEnvelopedGenerator.IDEA_CBC) || id.equals(org.bouncycastle.cms.CMSEnvelopedGenerator.CAST5_CBC)) {
                        Camera2StreamConfigurationMap.init(2, key, new javax.crypto.spec.IvParameterSpec(new byte[8]));
                        return Camera2StreamConfigurationMap;
                    }
                    Camera2StreamConfigurationMap.init(2, key);
                    return Camera2StreamConfigurationMap;
                }
                try {
                    java.security.AlgorithmParameters highSpeedVideoFpsRanges = org.bouncycastle.cms.jcajce.EnvelopedDataHelper.this.getHighSpeedVideoFpsRanges(algorithmIdentifier.getAlgorithm());
                    org.bouncycastle.cms.jcajce.CMSUtils.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges, parameters);
                    Camera2StreamConfigurationMap.init(2, key, highSpeedVideoFpsRanges);
                    return Camera2StreamConfigurationMap;
                } catch (java.security.NoSuchAlgorithmException e) {
                    if (!id.equals(org.bouncycastle.cms.CMSAlgorithm.DES_CBC.getId()) && !id.equals(org.bouncycastle.cms.CMSEnvelopedDataGenerator.DES_EDE3_CBC) && !id.equals(org.bouncycastle.cms.CMSEnvelopedGenerator.IDEA_CBC) && !id.equals(org.bouncycastle.cms.CMSEnvelopedDataGenerator.AES128_CBC) && !id.equals(org.bouncycastle.cms.CMSEnvelopedDataGenerator.AES192_CBC) && !id.equals(org.bouncycastle.cms.CMSEnvelopedDataGenerator.AES256_CBC)) {
                        throw e;
                    }
                    Camera2StreamConfigurationMap.init(2, key, new javax.crypto.spec.IvParameterSpec(org.bouncycastle.asn1.ASN1OctetString.getInstance(parameters).getOctets()));
                    return Camera2StreamConfigurationMap;
                }
            }
        });
    }

    final javax.crypto.Cipher Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.cms.CMSException {
        try {
            java.lang.String str = (java.lang.String) CIPHER_ALG_NAMES.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.Camera2StreamConfigurationMap.createCipher(str);
                } catch (java.security.NoSuchAlgorithmException unused) {
                }
            }
            return this.Camera2StreamConfigurationMap.createCipher(aSN1ObjectIdentifier.getId());
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create cipher: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    public org.bouncycastle.operator.jcajce.JceKTSKeyUnwrapper createAsymmetricUnwrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.PrivateKey privateKey, byte[] bArr, byte[] bArr2) {
        return this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(algorithmIdentifier, org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(privateKey), bArr, bArr2);
    }

    public org.bouncycastle.operator.jcajce.JceAsymmetricKeyUnwrapper createAsymmetricUnwrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.PrivateKey privateKey) {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(algorithmIdentifier, org.bouncycastle.cms.jcajce.CMSUtils.getHighResolutionOutputSizeshNQ4ISI(privateKey));
    }

    final java.security.AlgorithmParameters getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        java.lang.String str = (java.lang.String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str != null) {
            try {
                return this.Camera2StreamConfigurationMap.createAlgorithmParameters(str);
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
        }
        return this.Camera2StreamConfigurationMap.createAlgorithmParameters(aSN1ObjectIdentifier.getId());
    }

    private java.security.AlgorithmParameterGenerator getOutputFormats(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws java.security.GeneralSecurityException {
        java.lang.String str = (java.lang.String) BASE_CIPHER_NAMES.get(aSN1ObjectIdentifier);
        if (str != null) {
            try {
                return this.Camera2StreamConfigurationMap.createAlgorithmParameterGenerator(str);
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
        }
        return this.Camera2StreamConfigurationMap.createAlgorithmParameterGenerator(aSN1ObjectIdentifier.getId());
    }

    final byte[] getHighSpeedVideoSizes(int i, char[] cArr, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, int i2) throws org.bouncycastle.cms.CMSException {
        org.bouncycastle.cms.jcajce.JcaJceExtHelper jcaJceExtHelper;
        java.lang.String str;
        org.bouncycastle.asn1.pkcs.PBKDF2Params pBKDF2Params = org.bouncycastle.asn1.pkcs.PBKDF2Params.getInstance(algorithmIdentifier.getParameters());
        try {
            if (i == 0) {
                jcaJceExtHelper = this.Camera2StreamConfigurationMap;
                str = "PBKDF2with8BIT";
            } else {
                jcaJceExtHelper = this.Camera2StreamConfigurationMap;
                str = (java.lang.String) getHighSpeedVideoFpsRanges.get(pBKDF2Params.getPrf());
            }
            return jcaJceExtHelper.createSecretKeyFactory(str).generateSecret(new javax.crypto.spec.PBEKeySpec(cArr, pBKDF2Params.getSalt(), pBKDF2Params.getIterationCount().intValue(), i2)).getEncoded();
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to calculate derived key from password: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cms.CMSException(sb.toString(), e);
        }
    }

    /* renamed from: org.bouncycastle.cms.jcajce.EnvelopedDataHelper$2, reason: invalid class name */
    class AnonymousClass2 implements org.bouncycastle.cms.jcajce.EnvelopedDataHelper.JCECallback {
        final /* synthetic */ org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
        final /* synthetic */ java.security.Key getHighSpeedVideoSizes;

        @Override // org.bouncycastle.cms.jcajce.EnvelopedDataHelper.JCECallback
        public final java.lang.Object Camera2StreamConfigurationMap() throws org.bouncycastle.cms.CMSException, java.security.InvalidAlgorithmParameterException, java.security.InvalidKeyException, java.security.spec.InvalidParameterSpecException, java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException, java.security.NoSuchProviderException {
            javax.crypto.Mac highSpeedVideoSizes = org.bouncycastle.cms.jcajce.EnvelopedDataHelper.this.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap.getAlgorithm());
            org.bouncycastle.asn1.ASN1Encodable parameters = this.Camera2StreamConfigurationMap.getParameters();
            this.Camera2StreamConfigurationMap.getAlgorithm().getId();
            if (parameters == null || (parameters instanceof org.bouncycastle.asn1.ASN1Null)) {
                highSpeedVideoSizes.init(this.getHighSpeedVideoSizes);
                return highSpeedVideoSizes;
            }
            java.security.AlgorithmParameters highSpeedVideoFpsRanges = org.bouncycastle.cms.jcajce.EnvelopedDataHelper.this.getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap.getAlgorithm());
            org.bouncycastle.cms.jcajce.CMSUtils.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges, parameters);
            highSpeedVideoSizes.init(this.getHighSpeedVideoSizes, highSpeedVideoFpsRanges.getParameterSpec(java.security.spec.AlgorithmParameterSpec.class));
            return highSpeedVideoSizes;
        }

        AnonymousClass2(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.Key key) {
            this.Camera2StreamConfigurationMap = algorithmIdentifier;
            this.getHighSpeedVideoSizes = key;
        }
    }

    static java.lang.Object Camera2StreamConfigurationMap(org.bouncycastle.cms.jcajce.EnvelopedDataHelper.JCECallback jCECallback) throws org.bouncycastle.cms.CMSException {
        try {
            return jCECallback.Camera2StreamConfigurationMap();
        } catch (java.security.InvalidAlgorithmParameterException e) {
            throw new org.bouncycastle.cms.CMSException("algorithm parameters invalid.", e);
        } catch (java.security.InvalidKeyException e2) {
            throw new org.bouncycastle.cms.CMSException("key invalid in message.", e2);
        } catch (java.security.NoSuchAlgorithmException e3) {
            throw new org.bouncycastle.cms.CMSException("can't find algorithm.", e3);
        } catch (java.security.NoSuchProviderException e4) {
            throw new org.bouncycastle.cms.CMSException("can't find provider.", e4);
        } catch (java.security.spec.InvalidParameterSpecException e5) {
            throw new org.bouncycastle.cms.CMSException("MAC algorithm parameter spec invalid.", e5);
        } catch (javax.crypto.NoSuchPaddingException e6) {
            throw new org.bouncycastle.cms.CMSException("required padding not supported.", e6);
        }
    }

    EnvelopedDataHelper(org.bouncycastle.cms.jcajce.JcaJceExtHelper jcaJceExtHelper) {
        this.Camera2StreamConfigurationMap = jcaJceExtHelper;
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        getHighSpeedVideoFpsRangesFor = hashSet;
        java.util.HashMap hashMap = new java.util.HashMap();
        BASE_CIPHER_NAMES = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        CIPHER_ALG_NAMES = hashMap2;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        MAC_ALG_NAMES = hashMap3;
        java.util.HashMap hashMap4 = new java.util.HashMap();
        getHighSpeedVideoFpsRanges = hashMap4;
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.DES_CBC, "DES");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.DES_EDE3_CBC, "DESEDE");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.AES128_CBC, org.jose4j.keys.AesKey.ALGORITHM);
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.AES192_CBC, org.jose4j.keys.AesKey.ALGORITHM);
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.AES256_CBC, org.jose4j.keys.AesKey.ALGORITHM);
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.RC2_CBC, "RC2");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.CAST5_CBC, "CAST5");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.CAMELLIA128_CBC, "Camellia");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.CAMELLIA192_CBC, "Camellia");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.CAMELLIA256_CBC, "Camellia");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.SEED_CBC, "SEED");
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rc4, "RC4");
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR28147_gcfb, "GOST28147");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.DES_CBC, "DES/CBC/PKCS5Padding");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.RC2_CBC, "RC2/CBC/PKCS5Padding");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.DES_EDE3_CBC, "DESEDE/CBC/PKCS5Padding");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.AES128_CBC, "AES/CBC/PKCS5Padding");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.AES192_CBC, "AES/CBC/PKCS5Padding");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.AES256_CBC, "AES/CBC/PKCS5Padding");
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, "RSA/ECB/PKCS1Padding");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.CAST5_CBC, "CAST5/CBC/PKCS5Padding");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.CAMELLIA128_CBC, "Camellia/CBC/PKCS5Padding");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.CAMELLIA192_CBC, "Camellia/CBC/PKCS5Padding");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.CAMELLIA256_CBC, "Camellia/CBC/PKCS5Padding");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.SEED_CBC, "SEED/CBC/PKCS5Padding");
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rc4, "RC4");
        hashMap3.put(org.bouncycastle.cms.CMSAlgorithm.DES_EDE3_CBC, "DESEDEMac");
        hashMap3.put(org.bouncycastle.cms.CMSAlgorithm.AES128_CBC, "AESMac");
        hashMap3.put(org.bouncycastle.cms.CMSAlgorithm.AES192_CBC, "AESMac");
        hashMap3.put(org.bouncycastle.cms.CMSAlgorithm.AES256_CBC, "AESMac");
        hashMap3.put(org.bouncycastle.cms.CMSAlgorithm.RC2_CBC, "RC2Mac");
        hashMap4.put(org.bouncycastle.cms.PasswordRecipient.PRF.HMacSHA1.getAlgorithmID(), "PBKDF2WITHHMACSHA1");
        hashMap4.put(org.bouncycastle.cms.PasswordRecipient.PRF.HMacSHA224.getAlgorithmID(), "PBKDF2WITHHMACSHA224");
        hashMap4.put(org.bouncycastle.cms.PasswordRecipient.PRF.HMacSHA256.getAlgorithmID(), "PBKDF2WITHHMACSHA256");
        hashMap4.put(org.bouncycastle.cms.PasswordRecipient.PRF.HMacSHA384.getAlgorithmID(), "PBKDF2WITHHMACSHA384");
        hashMap4.put(org.bouncycastle.cms.PasswordRecipient.PRF.HMacSHA512.getAlgorithmID(), "PBKDF2WITHHMACSHA512");
        hashSet.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_GCM);
        hashSet.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_GCM);
        hashSet.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_GCM);
        hashSet.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CCM);
        hashSet.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CCM);
        hashSet.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM);
        getHighSpeedVideoSizes = new short[]{189, 86, 234, 242, 162, 241, 172, 42, 176, com.visa.cbp.setDeviceName.isOutputSupportedFor, 209, 156, 27, 51, 253, 208, 48, 4, 182, 220, 125, 223, 50, 75, 247, 203, 69, 155, 49, 187, 33, 90, 65, 159, 225, 217, 74, 77, 158, 218, 160, 104, 44, 195, 39, 95, 128, 54, 62, 238, 251, 149, 26, 254, 206, 168, 52, 169, 19, 240, 166, 63, 216, 12, 120, 36, 175, 35, 82, 193, 103, 23, 245, 102, com.visa.cbp.setDeviceName.Camera2StreamConfigurationMap, 231, 232, 7, 184, 96, 72, 230, 30, 83, 243, com.visa.cbp.setDeviceName.getOutputStallDurationlomOqCM, com.visa.cbp.getEncExpo.ResultReceiverMyResultReceiver, 114, 140, 8, 21, 110, 134, 0, com.visa.cbp.setDeviceName.getHighSpeedVideoFpsRanges, 250, 244, 127, 138, 66, 25, 246, 219, 205, 20, 141, 80, 18, 186, 60, 6, 78, 236, 179, 53, 17, 161, 136, 142, 43, com.visa.cbp.setDeviceName.coroutineBoundary, 153, 183, 113, 116, 211, 228, 191, 58, 222, 150, 14, 188, 10, 237, 119, 252, 55, 107, 3, 121, 137, 98, 198, 215, 192, 210, 124, 106, 139, 34, 163, 91, 5, 93, 2, 117, 213, 97, 227, 24, com.visa.cbp.setDeviceName.getOutputSizeshNQ4ISI, 85, 81, 173, 31, 11, 94, 133, 229, 194, 87, 99, 202, 61, 108, 180, 197, 204, 112, com.visa.cbp.getEncExpo.invoke, com.visa.cbp.setDeviceName.getHighSpeedVideoSizesFor, 89, 13, 71, 32, 200, 79, 88, 224, 1, 226, 22, 56, 196, com.visa.cbp.setDeviceName.getHighResolutionOutputSizeshNQ4ISI, 59, 15, 101, 70, 190, 126, 45, 123, 130, 249, 64, 181, 29, 115, 248, 235, 38, 199, com.visa.cbp.setDeviceName.unwrapAs, 151, 37, 84, 177, 40, 170, 152, 157, com.visa.cbp.setDeviceName._CREATION, 100, 109, 122, 212, 16, 129, 68, 239, 73, 214, 174, 46, 221, 118, 92, 47, 167, 28, 201, 9, 105, 154, 131, 207, 41, 57, 185, 233, 76, 255, 67, 171};
        getHighResolutionOutputSizeshNQ4ISI = new short[]{93, 190, 155, 139, 17, 153, 110, 77, 89, 243, 133, 166, 63, 183, 131, 197, 228, 115, 107, 58, 104, 90, 192, 71, 160, 100, 52, 12, 241, 208, 82, com.visa.cbp.setDeviceName._CREATION, 185, 30, 150, 67, 65, 216, 212, 44, 219, 248, 7, 119, 42, 202, 235, 239, 16, 28, 22, 13, 56, 114, 47, 137, 193, 249, 128, 196, 109, 174, 48, 61, 206, 32, 99, 254, 230, 26, 199, 184, 80, 232, 36, 23, 252, 37, com.visa.cbp.setDeviceName.getHighResolutionOutputSizeshNQ4ISI, 187, 106, 163, 68, 83, 217, 162, 1, 171, 188, 182, 31, 152, 238, 154, 167, 45, 79, 158, 142, 172, 224, 198, 73, 70, 41, 244, com.visa.cbp.setDeviceName.coroutineBoundary, 138, 175, 225, 91, 195, 179, 123, 87, 209, 124, 156, 237, com.visa.cbp.setDeviceName.unwrapAs, 64, 140, 226, 203, com.visa.cbp.setDeviceName.isOutputSupportedFor, 20, 201, 97, 46, 229, 204, 246, 94, 168, 92, 214, 117, 141, 98, 149, 88, 105, 118, 161, 74, 181, 85, 9, 120, 51, 130, 215, 221, 121, 245, 27, 11, 222, 38, 33, 40, 116, 4, 151, 86, 223, 60, 240, 55, 57, 220, 255, 6, com.visa.cbp.getEncExpo.ResultReceiverMyResultReceiver, 234, 66, 8, 218, 180, 113, 176, 207, 18, 122, 78, 250, 108, 29, com.visa.cbp.setDeviceName.getHighSpeedVideoFpsRanges, 0, 200, 127, com.visa.cbp.setDeviceName.getHighSpeedVideoSizesFor, 69, 170, 43, 194, 177, com.visa.cbp.setDeviceName.getOutputSizeshNQ4ISI, 213, 186, 242, 173, 25, com.visa.cbp.getEncExpo.invoke, 103, 54, 247, 15, 10, com.visa.cbp.setDeviceName.getOutputStallDurationlomOqCM, 125, 227, 157, 233, com.visa.cbp.setDeviceName.Camera2StreamConfigurationMap, 62, 35, 39, 102, 19, 236, 129, 21, 189, 34, 191, 159, 126, 169, 81, 75, 76, 251, 2, 211, 112, 134, 49, 231, 59, 5, 3, 84, 96, 72, 101, 24, 210, 205, 95, 50, 136, 14, 53, 253};
    }
}
