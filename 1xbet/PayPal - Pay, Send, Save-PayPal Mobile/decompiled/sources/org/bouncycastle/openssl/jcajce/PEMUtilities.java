package org.bouncycastle.openssl.jcajce;

/* loaded from: classes17.dex */
class PEMUtilities {
    private static final java.util.Set Camera2StreamConfigurationMap;
    private static final java.util.Map getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Map getHighSpeedVideoFpsRanges;
    private static final java.util.Map getHighSpeedVideoFpsRangesFor;
    private static final java.util.Set getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v28, types: [javax.crypto.spec.RC2ParameterSpec] */
    /* JADX WARN: Type inference failed for: r1v43, types: [javax.crypto.spec.RC2ParameterSpec] */
    /* JADX WARN: Type inference failed for: r1v44, types: [javax.crypto.spec.RC2ParameterSpec] */
    static byte[] getHighSpeedVideoFpsRangesFor(boolean z, org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper, byte[] bArr, char[] cArr, java.lang.String str, byte[] bArr2) throws org.bouncycastle.openssl.PEMException {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        byte[] bArr3;
        javax.crypto.SecretKey highSpeedVideoSizes;
        java.lang.String str6;
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr2);
        if (str.endsWith("-CFB")) {
            str2 = "CFB";
            str3 = "NoPadding";
        } else {
            str2 = "CBC";
            str3 = "PKCS5Padding";
        }
        if (str.endsWith("-ECB") || "DES-EDE".equals(str) || "DES-EDE3".equals(str)) {
            str2 = "ECB";
            ivParameterSpec = null;
        }
        javax.crypto.spec.IvParameterSpec ivParameterSpec2 = ivParameterSpec;
        if (str.endsWith("-OFB")) {
            str4 = "OFB";
            str5 = "NoPadding";
        } else {
            str4 = str2;
            str5 = str3;
        }
        int i = 1;
        if (str.startsWith("DES-EDE")) {
            highSpeedVideoSizes = getHighSpeedVideoSizes(jcaJceHelper, cArr, "DESede", 24, bArr2, !str.startsWith("DES-EDE3"));
            str6 = "DESede";
        } else if (str.startsWith("DES-")) {
            highSpeedVideoSizes = getHighSpeedVideoSizes(jcaJceHelper, cArr, "DES", 8, bArr2, false);
            str6 = "DES";
        } else if (str.startsWith("BF-")) {
            highSpeedVideoSizes = getHighSpeedVideoSizes(jcaJceHelper, cArr, "Blowfish", 16, bArr2, false);
            str6 = "Blowfish";
        } else {
            int i2 = 128;
            if (str.startsWith("RC2-")) {
                if (str.startsWith("RC2-40-")) {
                    i2 = 40;
                } else if (str.startsWith("RC2-64-")) {
                    i2 = 64;
                }
                int i3 = i2;
                highSpeedVideoSizes = getHighSpeedVideoSizes(jcaJceHelper, cArr, "RC2", i3 / 8, bArr2, false);
                ivParameterSpec2 = ivParameterSpec2 == null ? new javax.crypto.spec.RC2ParameterSpec(i3) : new javax.crypto.spec.RC2ParameterSpec(i3, bArr2);
                str6 = "RC2";
            } else {
                if (!str.startsWith("AES-")) {
                    throw new org.bouncycastle.openssl.EncryptionException("unknown encryption with private key");
                }
                if (bArr2.length > 8) {
                    byte[] bArr4 = new byte[8];
                    java.lang.System.arraycopy(bArr2, 0, bArr4, 0, 8);
                    bArr3 = bArr4;
                } else {
                    bArr3 = bArr2;
                }
                if (!str.startsWith("AES-128-")) {
                    if (str.startsWith("AES-192-")) {
                        i2 = 192;
                    } else {
                        if (!str.startsWith("AES-256-")) {
                            throw new org.bouncycastle.openssl.EncryptionException("unknown AES encryption with private key");
                        }
                        i2 = 256;
                    }
                }
                highSpeedVideoSizes = getHighSpeedVideoSizes(jcaJceHelper, cArr, org.jose4j.keys.AesKey.ALGORITHM, i2 / 8, bArr3, false);
                str6 = org.jose4j.keys.AesKey.ALGORITHM;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str6);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(str4);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(str5);
        try {
            javax.crypto.Cipher createCipher = jcaJceHelper.createCipher(sb.toString());
            if (!z) {
                i = 2;
            }
            if (ivParameterSpec2 == null) {
                createCipher.init(i, highSpeedVideoSizes);
            } else {
                createCipher.init(i, highSpeedVideoSizes, ivParameterSpec2);
            }
            return createCipher.doFinal(bArr);
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.openssl.EncryptionException("exception using cipher - please check password and data.", e);
        }
    }

    static boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return Camera2StreamConfigurationMap.contains(aSN1ObjectIdentifier);
    }

    static boolean getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return getHighSpeedVideoSizes.contains(aSN1ObjectIdentifier);
    }

    public static boolean getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return aSN1ObjectIdentifier.getId().startsWith(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_12PbeIds.getId());
    }

    static boolean getHighSpeedVideoSizes(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        return algorithmIdentifier == null || algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1);
    }

    static int getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.util.Map map = getHighSpeedVideoFpsRanges;
        if (map.containsKey(aSN1ObjectIdentifier)) {
            return ((java.lang.Integer) map.get(aSN1ObjectIdentifier)).intValue();
        }
        throw new java.lang.IllegalStateException("no salt size for algorithm: ".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)));
    }

    private static int getHighSpeedVideoSizes(java.lang.String str) {
        java.util.Map map = getHighResolutionOutputSizeshNQ4ISI;
        if (map.containsKey(str)) {
            return ((java.lang.Integer) map.get(str)).intValue();
        }
        throw new java.lang.IllegalStateException("no key size for algorithm: ".concat(java.lang.String.valueOf(str)));
    }

    private static javax.crypto.SecretKey getHighSpeedVideoSizes(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper, char[] cArr, java.lang.String str, int i, byte[] bArr, boolean z) throws org.bouncycastle.openssl.PEMException {
        try {
            byte[] encoded = jcaJceHelper.createSecretKeyFactory("PBKDF-OpenSSL").generateSecret(new javax.crypto.spec.PBEKeySpec(cArr, bArr, 1, i * 8)).getEncoded();
            if (z && encoded.length >= 24) {
                java.lang.System.arraycopy(encoded, 0, encoded, 16, 8);
            }
            return new javax.crypto.spec.SecretKeySpec(encoded, str);
        } catch (java.security.GeneralSecurityException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to create OpenSSL PBDKF: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.openssl.PEMException(sb.toString(), e);
        }
    }

    public static javax.crypto.SecretKey getHighSpeedVideoSizes(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper, java.lang.String str, char[] cArr, byte[] bArr, int i, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException {
        java.lang.String str2 = (java.lang.String) getHighSpeedVideoFpsRangesFor.get(algorithmIdentifier.getAlgorithm());
        if (str2 != null) {
            return new javax.crypto.spec.SecretKeySpec(jcaJceHelper.createSecretKeyFactory(str2).generateSecret(new javax.crypto.spec.PBEKeySpec(cArr, bArr, i, getHighSpeedVideoSizes(str))).getEncoded(), str);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown PRF in PKCS#2: ");
        sb.append(algorithmIdentifier.getAlgorithm());
        throw new java.security.NoSuchAlgorithmException(sb.toString());
    }

    public static javax.crypto.SecretKey getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.jcajce.util.JcaJceHelper jcaJceHelper, java.lang.String str, char[] cArr, byte[] bArr, int i) throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException {
        return new javax.crypto.spec.SecretKeySpec(jcaJceHelper.createSecretKeyFactory("PBKDF2with8BIT").generateSecret(new javax.crypto.spec.PBEKeySpec(cArr, bArr, i, getHighSpeedVideoSizes(str))).getEncoded(), str);
    }

    PEMUtilities() {
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighResolutionOutputSizeshNQ4ISI = hashMap;
        java.util.HashSet hashSet = new java.util.HashSet();
        getHighSpeedVideoSizes = hashSet;
        java.util.HashSet hashSet2 = new java.util.HashSet();
        Camera2StreamConfigurationMap = hashSet2;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        getHighSpeedVideoFpsRangesFor = hashMap2;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        getHighSpeedVideoFpsRanges = hashMap3;
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC);
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD2AndRC2_CBC);
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC);
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD5AndRC2_CBC);
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC);
        hashSet.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHA1AndRC2_CBC);
        hashSet2.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBES2);
        hashSet2.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC);
        hashSet2.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC);
        hashSet2.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC);
        hashSet2.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC);
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC.getId(), org.bouncycastle.util.Integers.valueOf(192));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC.getId(), org.bouncycastle.util.Integers.valueOf(128));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC.getId(), org.bouncycastle.util.Integers.valueOf(192));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC.getId(), org.bouncycastle.util.Integers.valueOf(256));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4.getId(), org.bouncycastle.util.Integers.valueOf(128));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4, org.bouncycastle.util.Integers.valueOf(40));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC, org.bouncycastle.util.Integers.valueOf(128));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, org.bouncycastle.util.Integers.valueOf(192));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC, org.bouncycastle.util.Integers.valueOf(128));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC, org.bouncycastle.util.Integers.valueOf(40));
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1, "PBKDF2withHMACSHA1");
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA256, "PBKDF2withHMACSHA256");
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512, "PBKDF2withHMACSHA512");
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA224, "PBKDF2withHMACSHA224");
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA384, "PBKDF2withHMACSHA384");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_224, "PBKDF2withHMACSHA3-224");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_256, "PBKDF2withHMACSHA3-256");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_384, "PBKDF2withHMACSHA3-384");
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_512, "PBKDF2withHMACSHA3-512");
        hashMap2.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411Hmac, "PBKDF2withHMACGOST3411");
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1, org.bouncycastle.util.Integers.valueOf(20));
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA256, org.bouncycastle.util.Integers.valueOf(32));
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512, org.bouncycastle.util.Integers.valueOf(64));
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA224, org.bouncycastle.util.Integers.valueOf(28));
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA384, org.bouncycastle.util.Integers.valueOf(48));
        hashMap3.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_224, org.bouncycastle.util.Integers.valueOf(28));
        hashMap3.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_256, org.bouncycastle.util.Integers.valueOf(32));
        hashMap3.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_384, org.bouncycastle.util.Integers.valueOf(48));
        hashMap3.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_512, org.bouncycastle.util.Integers.valueOf(64));
        hashMap3.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411Hmac, org.bouncycastle.util.Integers.valueOf(32));
    }
}
