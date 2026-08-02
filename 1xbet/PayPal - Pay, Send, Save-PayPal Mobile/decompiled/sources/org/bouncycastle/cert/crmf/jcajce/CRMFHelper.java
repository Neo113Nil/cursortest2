package org.bouncycastle.cert.crmf.jcajce;

/* loaded from: classes17.dex */
class CRMFHelper {
    protected static final java.util.Map Camera2StreamConfigurationMap;
    protected static final java.util.Map getHighResolutionOutputSizeshNQ4ISI;
    protected static final java.util.Map getHighSpeedVideoFpsRanges;
    protected static final java.util.Map getHighSpeedVideoFpsRangesFor;
    protected static final java.util.Map getHighSpeedVideoSizes;
    private org.bouncycastle.jcajce.util.JcaJceHelper getInputFormats;

    interface JCECallback {
        java.lang.Object getHighSpeedVideoFpsRanges() throws org.bouncycastle.cert.crmf.CRMFException, java.security.InvalidAlgorithmParameterException, java.security.InvalidKeyException, java.security.spec.InvalidParameterSpecException, java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException, java.security.NoSuchProviderException;
    }

    final java.security.PublicKey getHighSpeedVideoSizes(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws org.bouncycastle.cert.crmf.CRMFException {
        try {
            return getHighSpeedVideoSizesFor(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()).generatePublic(new java.security.spec.X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
        }
    }

    static org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.security.AlgorithmParameters algorithmParameters) throws org.bouncycastle.cert.crmf.CRMFException {
        org.bouncycastle.asn1.ASN1Encodable extractParameters;
        if (algorithmParameters != null) {
            try {
                extractParameters = org.bouncycastle.jcajce.util.AlgorithmParametersUtils.extractParameters(algorithmParameters);
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot encode parameters: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
            }
        } else {
            extractParameters = org.bouncycastle.asn1.DERNull.INSTANCE;
        }
        return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, extractParameters);
    }

    final java.security.AlgorithmParameters getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, javax.crypto.SecretKey secretKey, java.security.SecureRandom secureRandom) throws org.bouncycastle.cert.crmf.CRMFException {
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
                    throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
                }
            }
            return outputFormats.generateParameters();
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        } catch (java.security.GeneralSecurityException e2) {
            throw new org.bouncycastle.cert.crmf.CRMFException("exception creating algorithm parameter generator: ".concat(java.lang.String.valueOf(e2)), e2);
        }
    }

    final javax.crypto.Mac getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.cert.crmf.CRMFException {
        try {
            java.lang.String str = (java.lang.String) getHighSpeedVideoFpsRangesFor.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.getInputFormats.createMac(str);
                } catch (java.security.NoSuchAlgorithmException unused) {
                }
            }
            return this.getInputFormats.createMac(aSN1ObjectIdentifier.getId());
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create mac: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
        }
    }

    public final javax.crypto.KeyGenerator getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.cert.crmf.CRMFException {
        try {
            java.lang.String str = (java.lang.String) getHighSpeedVideoSizes.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.getInputFormats.createKeyGenerator(str);
                } catch (java.security.NoSuchAlgorithmException unused) {
                }
            }
            return this.getInputFormats.createKeyGenerator(aSN1ObjectIdentifier.getId());
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create key generator: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
        }
    }

    private java.security.KeyFactory getHighSpeedVideoSizesFor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.cert.crmf.CRMFException {
        try {
            java.lang.String str = (java.lang.String) getHighSpeedVideoFpsRanges.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.getInputFormats.createKeyFactory(str);
                } catch (java.security.NoSuchAlgorithmException unused) {
                }
            }
            return this.getInputFormats.createKeyFactory(aSN1ObjectIdentifier.getId());
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create cipher: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
        }
    }

    final java.security.MessageDigest Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.cert.crmf.CRMFException {
        try {
            java.lang.String str = (java.lang.String) getHighResolutionOutputSizeshNQ4ISI.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.getInputFormats.createMessageDigest(str);
                } catch (java.security.NoSuchAlgorithmException unused) {
                }
            }
            return this.getInputFormats.createMessageDigest(aSN1ObjectIdentifier.getId());
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create cipher: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
        }
    }

    final javax.crypto.Cipher getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.cert.crmf.CRMFException {
        try {
            java.lang.String str = (java.lang.String) Camera2StreamConfigurationMap.get(aSN1ObjectIdentifier);
            if (str != null) {
                try {
                    return this.getInputFormats.createCipher(str);
                } catch (java.security.NoSuchAlgorithmException unused) {
                }
            }
            return this.getInputFormats.createCipher(aSN1ObjectIdentifier.getId());
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot create cipher: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.crmf.CRMFException(sb.toString(), e);
        }
    }

    final java.security.AlgorithmParameters getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        java.lang.String str = (java.lang.String) getHighSpeedVideoSizes.get(aSN1ObjectIdentifier);
        if (str != null) {
            try {
                return this.getInputFormats.createAlgorithmParameters(str);
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
        }
        return this.getInputFormats.createAlgorithmParameters(aSN1ObjectIdentifier.getId());
    }

    private java.security.AlgorithmParameterGenerator getOutputFormats(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws java.security.GeneralSecurityException {
        java.lang.String str = (java.lang.String) getHighSpeedVideoSizes.get(aSN1ObjectIdentifier);
        if (str != null) {
            try {
                return this.getInputFormats.createAlgorithmParameterGenerator(str);
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
        }
        return this.getInputFormats.createAlgorithmParameterGenerator(aSN1ObjectIdentifier.getId());
    }

    static java.lang.Object getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.cert.crmf.jcajce.CRMFHelper.JCECallback jCECallback) throws org.bouncycastle.cert.crmf.CRMFException {
        try {
            return jCECallback.getHighSpeedVideoFpsRanges();
        } catch (java.security.InvalidAlgorithmParameterException e) {
            throw new org.bouncycastle.cert.crmf.CRMFException("algorithm parameters invalid.", e);
        } catch (java.security.InvalidKeyException e2) {
            throw new org.bouncycastle.cert.crmf.CRMFException("key invalid in message.", e2);
        } catch (java.security.NoSuchAlgorithmException e3) {
            throw new org.bouncycastle.cert.crmf.CRMFException("can't find algorithm.", e3);
        } catch (java.security.NoSuchProviderException e4) {
            throw new org.bouncycastle.cert.crmf.CRMFException("can't find provider.", e4);
        } catch (java.security.spec.InvalidParameterSpecException e5) {
            throw new org.bouncycastle.cert.crmf.CRMFException("MAC algorithm parameter spec invalid.", e5);
        } catch (javax.crypto.NoSuchPaddingException e6) {
            throw new org.bouncycastle.cert.crmf.CRMFException("required padding not supported.", e6);
        }
    }

    CRMFHelper(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper) {
        this.getInputFormats = jcaJceHelper;
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoSizes = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        Camera2StreamConfigurationMap = hashMap2;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        getHighResolutionOutputSizeshNQ4ISI = hashMap3;
        java.util.HashMap hashMap4 = new java.util.HashMap();
        getHighSpeedVideoFpsRanges = hashMap4;
        java.util.HashMap hashMap5 = new java.util.HashMap();
        getHighSpeedVideoFpsRangesFor = hashMap5;
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC, "DESEDE");
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC, org.jose4j.keys.AesKey.ALGORITHM);
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC, org.jose4j.keys.AesKey.ALGORITHM);
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC, org.jose4j.keys.AesKey.ALGORITHM);
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.DES_EDE3_CBC, "DESEDE/CBC/PKCS5Padding");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.AES128_CBC, "AES/CBC/PKCS5Padding");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.AES192_CBC, "AES/CBC/PKCS5Padding");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.AES256_CBC, "AES/CBC/PKCS5Padding");
        hashMap2.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption.getId()), "RSA/ECB/PKCS1Padding");
        hashMap3.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, "SHA1");
        hashMap3.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224, "SHA224");
        hashMap3.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256, "SHA256");
        hashMap3.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384, "SHA384");
        hashMap3.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512, "SHA512");
        hashMap5.put(org.bouncycastle.asn1.iana.IANAObjectIdentifiers.hmacSHA1, "HMACSHA1");
        hashMap5.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1, "HMACSHA1");
        hashMap5.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA224, "HMACSHA224");
        hashMap5.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA256, "HMACSHA256");
        hashMap5.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA384, "HMACSHA384");
        hashMap5.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512, "HMACSHA512");
        hashMap4.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, "RSA");
        hashMap4.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa, "DSA");
    }
}
