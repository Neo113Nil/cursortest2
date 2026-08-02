package org.bouncycastle.jcajce.provider.asymmetric;

/* loaded from: classes17.dex */
public class GM {
    private static final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor;

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("Signature.SHA256WITHSM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi$sha256WithSM2");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb.append(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2sign_with_sha256);
            configurableProvider.addAlgorithm(sb.toString(), "SHA256WITHSM2");
            configurableProvider.addAlgorithm("Signature.SM3WITHSM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMSignatureSpi$sm3WithSM2");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb2.append(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2sign_with_sm3);
            configurableProvider.addAlgorithm(sb2.toString(), "SM3WITHSM2");
            configurableProvider.addAlgorithm("Cipher.SM2", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.SM2WITHSM3", "SM2");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Alg.Alias.Cipher.");
            sb3.append(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2encrypt_with_sm3);
            configurableProvider.addAlgorithm(sb3.toString(), "SM2");
            configurableProvider.addAlgorithm("Cipher.SM2WITHBLAKE2B", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withBlake2b");
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Alg.Alias.Cipher.");
            sb4.append(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2encrypt_with_blake2b512);
            configurableProvider.addAlgorithm(sb4.toString(), "SM2WITHBLAKE2B");
            configurableProvider.addAlgorithm("Cipher.SM2WITHBLAKE2S", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withBlake2s");
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Alg.Alias.Cipher.");
            sb5.append(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2encrypt_with_blake2s256);
            configurableProvider.addAlgorithm(sb5.toString(), "SM2WITHBLAKE2S");
            configurableProvider.addAlgorithm("Cipher.SM2WITHWHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withWhirlpool");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Alg.Alias.Cipher.");
            sb6.append(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2encrypt_with_whirlpool);
            configurableProvider.addAlgorithm(sb6.toString(), "SM2WITHWHIRLPOOL");
            configurableProvider.addAlgorithm("Cipher.SM2WITHMD5", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withMD5");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Alg.Alias.Cipher.");
            sb7.append(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2encrypt_with_md5);
            configurableProvider.addAlgorithm(sb7.toString(), "SM2WITHMD5");
            configurableProvider.addAlgorithm("Cipher.SM2WITHRIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withRMD");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Alg.Alias.Cipher.");
            sb8.append(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2encrypt_with_rmd160);
            configurableProvider.addAlgorithm(sb8.toString(), "SM2WITHRIPEMD160");
            configurableProvider.addAlgorithm("Cipher.SM2WITHSHA1", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha1");
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Alg.Alias.Cipher.");
            sb9.append(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2encrypt_with_sha1);
            configurableProvider.addAlgorithm(sb9.toString(), "SM2WITHSHA1");
            configurableProvider.addAlgorithm("Cipher.SM2WITHSHA224", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha224");
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("Alg.Alias.Cipher.");
            sb10.append(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2encrypt_with_sha224);
            configurableProvider.addAlgorithm(sb10.toString(), "SM2WITHSHA224");
            configurableProvider.addAlgorithm("Cipher.SM2WITHSHA256", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha256");
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("Alg.Alias.Cipher.");
            sb11.append(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2encrypt_with_sha256);
            configurableProvider.addAlgorithm(sb11.toString(), "SM2WITHSHA256");
            configurableProvider.addAlgorithm("Cipher.SM2WITHSHA384", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha384");
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder("Alg.Alias.Cipher.");
            sb12.append(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2encrypt_with_sha384);
            configurableProvider.addAlgorithm(sb12.toString(), "SM2WITHSHA384");
            configurableProvider.addAlgorithm("Cipher.SM2WITHSHA512", "org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi$SM2withSha512");
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder("Alg.Alias.Cipher.");
            sb13.append(org.bouncycastle.asn1.gm.GMObjectIdentifiers.sm2encrypt_with_sha512);
            configurableProvider.addAlgorithm(sb13.toString(), "SM2WITHSHA512");
        }
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRangesFor = hashMap;
        hashMap.put("SupportedKeyClasses", "java.security.interfaces.ECPublicKey|java.security.interfaces.ECPrivateKey");
        hashMap.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
