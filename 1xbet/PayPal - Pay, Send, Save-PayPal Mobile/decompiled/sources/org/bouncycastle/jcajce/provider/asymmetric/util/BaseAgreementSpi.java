package org.bouncycastle.jcajce.provider.asymmetric.util;

/* loaded from: classes17.dex */
public abstract class BaseAgreementSpi extends javax.crypto.KeyAgreementSpi {
    private static final java.util.Hashtable Camera2StreamConfigurationMap;
    private static final java.util.Hashtable getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Map<java.lang.String, java.lang.Integer> getHighSpeedVideoFpsRanges;
    private static final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor;
    private static final java.util.Map<java.lang.String, org.bouncycastle.asn1.ASN1ObjectIdentifier> getHighSpeedVideoSizes;
    protected final java.lang.String kaAlgorithm;
    protected final org.bouncycastle.crypto.DerivationFunction kdf;
    protected byte[] ukmParameters;

    protected abstract byte[] calcSecret();

    @Override // javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() throws java.lang.IllegalStateException {
        if (this.kdf == null) {
            return calcSecret();
        }
        byte[] calcSecret = calcSecret();
        try {
            return getHighSpeedVideoFpsRangesFor(calcSecret, null, calcSecret.length * 8);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.IllegalStateException(e.getMessage());
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public javax.crypto.SecretKey engineGenerateSecret(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str);
        java.util.Hashtable hashtable = Camera2StreamConfigurationMap;
        java.lang.String id = hashtable.containsKey(upperCase) ? ((org.bouncycastle.asn1.ASN1ObjectIdentifier) hashtable.get(upperCase)).getId() : str;
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(calcSecret(), id, getKeySize(id));
        java.lang.String algorithm = getAlgorithm(str);
        if (getHighResolutionOutputSizeshNQ4ISI.containsKey(algorithm)) {
            org.bouncycastle.crypto.params.DESParameters.setOddParity(highSpeedVideoFpsRangesFor);
        }
        return new javax.crypto.spec.SecretKeySpec(highSpeedVideoFpsRangesFor, algorithm);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i) throws java.lang.IllegalStateException, javax.crypto.ShortBufferException {
        byte[] engineGenerateSecret = engineGenerateSecret();
        if (bArr.length - i >= engineGenerateSecret.length) {
            java.lang.System.arraycopy(engineGenerateSecret, 0, bArr, i, engineGenerateSecret.length);
            return engineGenerateSecret.length;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.kaAlgorithm);
        sb.append(" key agreement: need ");
        sb.append(engineGenerateSecret.length);
        sb.append(" bytes");
        throw new javax.crypto.ShortBufferException(sb.toString());
    }

    protected static byte[] trimZeroes(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        int i = 0;
        while (i < bArr.length && bArr[i] == 0) {
            i++;
        }
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, length);
        return bArr2;
    }

    private byte[] getHighSpeedVideoFpsRangesFor(byte[] bArr, java.lang.String str, int i) throws java.security.NoSuchAlgorithmException {
        org.bouncycastle.crypto.DerivationParameters kDFParameters;
        org.bouncycastle.crypto.DerivationFunction derivationFunction = this.kdf;
        if (derivationFunction == null) {
            if (i <= 0) {
                return bArr;
            }
            int i2 = i / 8;
            byte[] bArr2 = new byte[i2];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, i2);
            org.bouncycastle.util.Arrays.clear(bArr);
            return bArr2;
        }
        if (i < 0) {
            throw new java.security.NoSuchAlgorithmException("unknown algorithm encountered: ".concat(java.lang.String.valueOf(str)));
        }
        int i3 = i / 8;
        byte[] bArr3 = new byte[i3];
        if (!(derivationFunction instanceof org.bouncycastle.crypto.agreement.kdf.DHKEKGenerator)) {
            kDFParameters = new org.bouncycastle.crypto.params.KDFParameters(bArr, this.ukmParameters);
        } else {
            if (str == null) {
                throw new java.security.NoSuchAlgorithmException("algorithm OID is null");
            }
            try {
                kDFParameters = new org.bouncycastle.crypto.agreement.kdf.DHKDFParameters(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str), i, bArr, this.ukmParameters);
            } catch (java.lang.IllegalArgumentException unused) {
                throw new java.security.NoSuchAlgorithmException("no OID for algorithm: ".concat(java.lang.String.valueOf(str)));
            }
        }
        this.kdf.init(kDFParameters);
        this.kdf.generateBytes(bArr3, 0, i3);
        org.bouncycastle.util.Arrays.clear(bArr);
        return bArr3;
    }

    protected static int getKeySize(java.lang.String str) {
        if (str.indexOf(91) > 0) {
            return java.lang.Integer.parseInt(str.substring(str.indexOf(91) + 1, str.indexOf(93)));
        }
        java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str);
        java.util.Map<java.lang.String, java.lang.Integer> map = getHighSpeedVideoFpsRanges;
        if (map.containsKey(upperCase)) {
            return map.get(upperCase).intValue();
        }
        return -1;
    }

    protected static java.lang.String getAlgorithm(java.lang.String str) {
        if (str.indexOf(91) > 0) {
            return str.substring(0, str.indexOf(91));
        }
        if (str.startsWith(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.aes.getId())) {
            return org.jose4j.keys.AesKey.ALGORITHM;
        }
        if (str.startsWith(org.bouncycastle.asn1.gnu.GNUObjectIdentifiers.Serpent.getId())) {
            return "Serpent";
        }
        java.lang.String str2 = getHighSpeedVideoFpsRangesFor.get(org.bouncycastle.util.Strings.toUpperCase(str));
        return str2 != null ? str2 : str;
    }

    public BaseAgreementSpi(java.lang.String str, org.bouncycastle.crypto.DerivationFunction derivationFunction) {
        this.kaAlgorithm = str;
        this.kdf = derivationFunction;
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoSizes = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        getHighSpeedVideoFpsRanges = hashMap2;
        java.util.HashMap hashMap3 = new java.util.HashMap();
        getHighSpeedVideoFpsRangesFor = hashMap3;
        java.util.Hashtable hashtable = new java.util.Hashtable();
        Camera2StreamConfigurationMap = hashtable;
        java.util.Hashtable hashtable2 = new java.util.Hashtable();
        getHighResolutionOutputSizeshNQ4ISI = hashtable2;
        java.lang.Integer valueOf = org.bouncycastle.util.Integers.valueOf(64);
        java.lang.Integer valueOf2 = org.bouncycastle.util.Integers.valueOf(128);
        java.lang.Integer valueOf3 = org.bouncycastle.util.Integers.valueOf(192);
        java.lang.Integer valueOf4 = org.bouncycastle.util.Integers.valueOf(256);
        hashMap2.put("DES", valueOf);
        hashMap2.put("DESEDE", valueOf3);
        hashMap2.put("BLOWFISH", valueOf2);
        hashMap2.put(org.jose4j.keys.AesKey.ALGORITHM, valueOf4);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_ECB.getId(), valueOf2);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_ECB.getId(), valueOf3);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_ECB.getId(), valueOf4);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC.getId(), valueOf2);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC.getId(), valueOf3);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC.getId(), valueOf4);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CFB.getId(), valueOf2);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CFB.getId(), valueOf3);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CFB.getId(), valueOf4);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_OFB.getId(), valueOf2);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_OFB.getId(), valueOf3);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_OFB.getId(), valueOf4);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_wrap.getId(), valueOf2);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_wrap.getId(), valueOf3);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap.getId(), valueOf4);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CCM.getId(), valueOf2);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CCM.getId(), valueOf3);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM.getId(), valueOf4);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_GCM.getId(), valueOf2);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_GCM.getId(), valueOf3);
        hashMap2.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_GCM.getId(), valueOf4);
        hashMap2.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_wrap.getId(), valueOf2);
        hashMap2.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_wrap.getId(), valueOf3);
        hashMap2.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_wrap.getId(), valueOf4);
        hashMap2.put(org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap.getId(), valueOf2);
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_CMS3DESwrap.getId(), valueOf3);
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC.getId(), valueOf3);
        hashMap2.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC.getId(), valueOf);
        hashMap2.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR28147_gcfb.getId(), valueOf4);
        hashMap2.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_None_KeyWrap.getId(), valueOf4);
        hashMap2.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap.getId(), valueOf4);
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1.getId(), org.bouncycastle.util.Integers.valueOf(160));
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA256.getId(), valueOf4);
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA384.getId(), org.bouncycastle.util.Integers.valueOf(384));
        hashMap2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512.getId(), org.bouncycastle.util.Integers.valueOf(512));
        hashMap.put("DESEDE", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC);
        hashMap.put(org.jose4j.keys.AesKey.ALGORITHM, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC);
        hashMap.put("CAMELLIA", org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_cbc);
        hashMap.put("SEED", org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_seedCBC);
        hashMap.put("DES", org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC);
        hashMap3.put(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.cast5CBC.getId(), "CAST5");
        hashMap3.put(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.as_sys_sec_alg_ideaCBC.getId(), "IDEA");
        hashMap3.put(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.cryptlib_algorithm_blowfish_ECB.getId(), "Blowfish");
        hashMap3.put(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.cryptlib_algorithm_blowfish_CBC.getId(), "Blowfish");
        hashMap3.put(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.cryptlib_algorithm_blowfish_CFB.getId(), "Blowfish");
        hashMap3.put(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.cryptlib_algorithm_blowfish_OFB.getId(), "Blowfish");
        hashMap3.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desECB.getId(), "DES");
        hashMap3.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC.getId(), "DES");
        hashMap3.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCFB.getId(), "DES");
        hashMap3.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desOFB.getId(), "DES");
        hashMap3.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desEDE.getId(), "DESede");
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC.getId(), "DESede");
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_CMS3DESwrap.getId(), "DESede");
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_CMSRC2wrap.getId(), "RC2");
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1.getId(), "HmacSHA1");
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA224.getId(), "HmacSHA224");
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA256.getId(), org.jose4j.mac.MacUtil.HMAC_SHA256);
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA384.getId(), org.jose4j.mac.MacUtil.HMAC_SHA384);
        hashMap3.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512.getId(), org.jose4j.mac.MacUtil.HMAC_SHA512);
        hashMap3.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_cbc.getId(), "Camellia");
        hashMap3.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_cbc.getId(), "Camellia");
        hashMap3.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_cbc.getId(), "Camellia");
        hashMap3.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_wrap.getId(), "Camellia");
        hashMap3.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_wrap.getId(), "Camellia");
        hashMap3.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_wrap.getId(), "Camellia");
        hashMap3.put(org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap.getId(), "SEED");
        hashMap3.put(org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_seedCBC.getId(), "SEED");
        hashMap3.put(org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_seedMAC.getId(), "SEED");
        hashMap3.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR28147_gcfb.getId(), "GOST28147");
        hashMap3.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_wrap.getId(), org.jose4j.keys.AesKey.ALGORITHM);
        hashMap3.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CCM.getId(), org.jose4j.keys.AesKey.ALGORITHM);
        hashMap3.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CCM.getId(), org.jose4j.keys.AesKey.ALGORITHM);
        hashtable.put("DESEDE", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC);
        hashtable.put(org.jose4j.keys.AesKey.ALGORITHM, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC);
        hashtable.put("DES", org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC);
        hashtable2.put("DES", "DES");
        hashtable2.put("DESEDE", "DES");
        hashtable2.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC.getId(), "DES");
        hashtable2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC.getId(), "DES");
        hashtable2.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_CMS3DESwrap.getId(), "DES");
    }
}
