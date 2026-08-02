package org.bouncycastle.cms.bc;

/* loaded from: classes17.dex */
class EnvelopedDataHelper {
    protected static final java.util.Map Camera2StreamConfigurationMap;
    private static final java.util.Set getHighResolutionOutputSizeshNQ4ISI;
    protected static final java.util.Map getHighSpeedVideoFpsRanges;
    private static final java.util.Map getHighSpeedVideoFpsRangesFor;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRanges = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        Camera2StreamConfigurationMap = hashMap2;
        java.util.HashSet hashSet = new java.util.HashSet();
        getHighResolutionOutputSizeshNQ4ISI = hashSet;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.cms.bc.EnvelopedDataHelper.1
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.SHA1Digest();
            }
        });
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA224, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.cms.bc.EnvelopedDataHelper.2
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.SHA224Digest();
            }
        });
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA256, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.cms.bc.EnvelopedDataHelper.3
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.SHA256Digest();
            }
        });
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA384, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.cms.bc.EnvelopedDataHelper.4
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.SHA384Digest();
            }
        });
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512, new org.bouncycastle.operator.bc.BcDigestProvider() { // from class: org.bouncycastle.cms.bc.EnvelopedDataHelper.5
            @Override // org.bouncycastle.operator.bc.BcDigestProvider
            public final org.bouncycastle.crypto.ExtendedDigest get(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
                return new org.bouncycastle.crypto.digests.SHA512Digest();
            }
        });
        getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableMap(hashMap3);
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.DES_EDE3_CBC, "DESEDE");
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.AES128_CBC, org.jose4j.keys.AesKey.ALGORITHM);
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.AES192_CBC, org.jose4j.keys.AesKey.ALGORITHM);
        hashMap.put(org.bouncycastle.cms.CMSAlgorithm.AES256_CBC, org.jose4j.keys.AesKey.ALGORITHM);
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.DES_EDE3_CBC, "DESEDEMac");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.AES128_CBC, "AESMac");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.AES192_CBC, "AESMac");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.AES256_CBC, "AESMac");
        hashMap2.put(org.bouncycastle.cms.CMSAlgorithm.RC2_CBC, "RC2Mac");
        hashSet.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_GCM);
        hashSet.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_GCM);
        hashSet.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_GCM);
        hashSet.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CCM);
        hashSet.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CCM);
        hashSet.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM);
    }

    static boolean getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return getHighResolutionOutputSizeshNQ4ISI.contains(aSN1ObjectIdentifier);
    }

    static org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.crypto.params.KeyParameter keyParameter, java.security.SecureRandom secureRandom) throws org.bouncycastle.cms.CMSException {
        try {
            return org.bouncycastle.crypto.util.AlgorithmIdentifierFactory.generateEncryptionAlgID(aSN1ObjectIdentifier, keyParameter.getKey().length * 8, secureRandom);
        } catch (java.lang.IllegalArgumentException e) {
            throw new org.bouncycastle.cms.CMSException(e.getMessage(), e);
        }
    }

    static org.bouncycastle.crypto.CipherKeyGenerator getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.security.SecureRandom secureRandom) throws org.bouncycastle.cms.CMSException {
        try {
            return org.bouncycastle.crypto.util.CipherKeyGeneratorFactory.createKeyGenerator(aSN1ObjectIdentifier, secureRandom);
        } catch (java.lang.IllegalArgumentException e) {
            throw new org.bouncycastle.cms.CMSException(e.getMessage(), e);
        }
    }

    static org.bouncycastle.crypto.ExtendedDigest getHighSpeedVideoSizes(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.operator.OperatorCreationException {
        return ((org.bouncycastle.operator.bc.BcDigestProvider) getHighSpeedVideoFpsRangesFor.get(algorithmIdentifier.getAlgorithm())).get(null);
    }

    static org.bouncycastle.crypto.Wrapper getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) throws org.bouncycastle.cms.CMSException {
        if (org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) || org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) || org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            return new org.bouncycastle.crypto.engines.RFC3211WrapEngine(new org.bouncycastle.crypto.engines.AESEngine());
        }
        if (org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            return new org.bouncycastle.crypto.engines.RFC3211WrapEngine(new org.bouncycastle.crypto.engines.DESedeEngine());
        }
        if (org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            return new org.bouncycastle.crypto.engines.RFC3211WrapEngine(new org.bouncycastle.crypto.engines.DESEngine());
        }
        if (org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.RC2_CBC.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
            return new org.bouncycastle.crypto.engines.RFC3211WrapEngine(new org.bouncycastle.crypto.engines.RC2Engine());
        }
        throw new org.bouncycastle.cms.CMSException("cannot recognise wrapper: ".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)));
    }

    static java.lang.Object getHighSpeedVideoFpsRanges(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws org.bouncycastle.cms.CMSException {
        try {
            return org.bouncycastle.crypto.util.CipherFactory.createContentCipher(z, cipherParameters, algorithmIdentifier);
        } catch (java.lang.IllegalArgumentException e) {
            throw new org.bouncycastle.cms.CMSException(e.getMessage(), e);
        }
    }

    EnvelopedDataHelper() {
    }
}
