package org.bouncycastle.operator;

/* loaded from: classes17.dex */
public class DefaultSecretKeySizeProvider implements org.bouncycastle.operator.SecretKeySizeProvider {
    private static final java.util.Map Camera2StreamConfigurationMap;
    public static final org.bouncycastle.operator.SecretKeySizeProvider INSTANCE = new org.bouncycastle.operator.DefaultSecretKeySizeProvider();

    @Override // org.bouncycastle.operator.SecretKeySizeProvider
    public int getKeySize(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        int keySize = getKeySize(algorithmIdentifier.getAlgorithm());
        if (keySize > 0) {
            return keySize;
        }
        return -1;
    }

    @Override // org.bouncycastle.operator.SecretKeySizeProvider
    public int getKeySize(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.lang.Integer num = (java.lang.Integer) Camera2StreamConfigurationMap.get(aSN1ObjectIdentifier);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(new org.bouncycastle.asn1.ASN1ObjectIdentifier(org.bouncycastle.cms.CMSEnvelopedGenerator.CAST5_CBC), org.bouncycastle.util.Integers.valueOf(128));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC, org.bouncycastle.util.Integers.valueOf(192));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_CMS3DESwrap, org.bouncycastle.util.Integers.valueOf(192));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC, org.bouncycastle.util.Integers.valueOf(64));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC, org.bouncycastle.util.Integers.valueOf(64));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC, org.bouncycastle.util.Integers.valueOf(128));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC, org.bouncycastle.util.Integers.valueOf(192));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC, org.bouncycastle.util.Integers.valueOf(256));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_GCM, org.bouncycastle.util.Integers.valueOf(128));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_GCM, org.bouncycastle.util.Integers.valueOf(192));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_GCM, org.bouncycastle.util.Integers.valueOf(256));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CCM, org.bouncycastle.util.Integers.valueOf(128));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CCM, org.bouncycastle.util.Integers.valueOf(192));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CCM, org.bouncycastle.util.Integers.valueOf(256));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_wrap, org.bouncycastle.util.Integers.valueOf(128));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_wrap, org.bouncycastle.util.Integers.valueOf(192));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap, org.bouncycastle.util.Integers.valueOf(256));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_wrap_pad, org.bouncycastle.util.Integers.valueOf(128));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_wrap_pad, org.bouncycastle.util.Integers.valueOf(192));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_wrap_pad, org.bouncycastle.util.Integers.valueOf(256));
        hashMap.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_cbc, org.bouncycastle.util.Integers.valueOf(128));
        hashMap.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_cbc, org.bouncycastle.util.Integers.valueOf(192));
        hashMap.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_cbc, org.bouncycastle.util.Integers.valueOf(256));
        hashMap.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia128_wrap, org.bouncycastle.util.Integers.valueOf(128));
        hashMap.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia192_wrap, org.bouncycastle.util.Integers.valueOf(192));
        hashMap.put(org.bouncycastle.asn1.ntt.NTTObjectIdentifiers.id_camellia256_wrap, org.bouncycastle.util.Integers.valueOf(256));
        hashMap.put(org.bouncycastle.asn1.kisa.KISAObjectIdentifiers.id_seedCBC, org.bouncycastle.util.Integers.valueOf(128));
        hashMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.desCBC, org.bouncycastle.util.Integers.valueOf(64));
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR28147_gcfb, org.bouncycastle.util.Integers.valueOf(256));
        Camera2StreamConfigurationMap = java.util.Collections.unmodifiableMap(hashMap);
    }
}
