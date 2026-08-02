package org.bouncycastle.jcajce.provider.asymmetric;

/* loaded from: classes17.dex */
public class RSA {
    private static final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges;

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.String str;
            java.lang.String str2;
            configurableProvider.addAlgorithm("AlgorithmParameters.OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$OAEP");
            configurableProvider.addAlgorithm("AlgorithmParameters.PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi$PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.RSAPSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.RSASSA-PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA224withRSA/PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA256withRSA/PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA384withRSA/PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA512withRSA/PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA224WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA256WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA384WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA512WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA3-224WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA3-256WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA3-384WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA3-512WITHRSAANDMGF1", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.RAWRSAPSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.NONEWITHRSAPSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.NONEWITHRSASSA-PSS", "PSS");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.NONEWITHRSAANDMGF1", "PSS");
            configurableProvider.addAttributes("Cipher.RSA", org.bouncycastle.jcajce.provider.asymmetric.RSA.getHighSpeedVideoFpsRanges);
            configurableProvider.addAlgorithm("Cipher.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
            configurableProvider.addAlgorithm("Cipher.RSA/RAW", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$NoPadding");
            configurableProvider.addAlgorithm("Cipher.RSA/PKCS1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
            configurableProvider.addAlgorithm("Cipher", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
            configurableProvider.addAlgorithm("Cipher", org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_ea_rsa, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding");
            configurableProvider.addAlgorithm("Cipher.RSA/1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PrivateOnly");
            configurableProvider.addAlgorithm("Cipher.RSA/2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$PKCS1v1_5Padding_PublicOnly");
            configurableProvider.addAlgorithm("Cipher.RSA/OAEP", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
            configurableProvider.addAlgorithm("Cipher", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSAES_OAEP, "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$OAEPPadding");
            configurableProvider.addAlgorithm("Cipher.RSA/ISO9796-1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.CipherSpi$ISO9796d1Padding");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RSA//RAW", "RSA");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RSA//NOPADDING", "RSA");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RSA//PKCS1PADDING", "RSA/PKCS1");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RSA//OAEPPADDING", "RSA/OAEP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RSA//ISO9796-1PADDING", "RSA/ISO9796-1");
            configurableProvider.addAlgorithm("KeyFactory.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi");
            configurableProvider.addAlgorithm("KeyFactory.RSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi");
            configurableProvider.addAlgorithm("KeyPairGenerator.RSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyPairGeneratorSpi$PSS");
            org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi keyFactorySpi = new org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi();
            registerOid(configurableProvider, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, "RSA", keyFactorySpi);
            registerOid(configurableProvider, org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_ea_rsa, "RSA", keyFactorySpi);
            registerOid(configurableProvider, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSAES_OAEP, "RSA", keyFactorySpi);
            registerOid(configurableProvider, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS, "RSA", keyFactorySpi);
            registerOidAlgorithmParameters(configurableProvider, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption, "RSA");
            registerOidAlgorithmParameters(configurableProvider, org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_ea_rsa, "RSA");
            registerOidAlgorithmParameters(configurableProvider, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSAES_OAEP, "OAEP");
            registerOidAlgorithmParameters(configurableProvider, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS, "PSS");
            configurableProvider.addAlgorithm("Signature.RSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Signature.");
            sb.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS);
            configurableProvider.addAlgorithm(sb.toString(), "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Signature.OID.");
            sb2.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS);
            configurableProvider.addAlgorithm(sb2.toString(), "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$PSSwithRSA");
            configurableProvider.addAlgorithm("Signature.RSA", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$noneRSA");
            configurableProvider.addAlgorithm("Signature.RAWRSASSA-PSS", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$nonePSS");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.RAWRSA", "RSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.NONEWITHRSA", "RSA");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.RAWRSAPSS", "RAWRSASSA-PSS");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.NONEWITHRSAPSS", "RAWRSASSA-PSS");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.NONEWITHRSASSA-PSS", "RAWRSASSA-PSS");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.NONEWITHRSAANDMGF1", "RAWRSASSA-PSS");
            configurableProvider.addAlgorithm("Alg.Alias.Signature.RSAPSS", org.jose4j.jws.RsaUsingShaAlgorithm.RSASSA_PSS);
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA224", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA224withRSA");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA256", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA256withRSA");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA384", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA384withRSA");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA512", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512withRSA");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA512(224)", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_224withRSA");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA512(256)", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_256withRSA");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA3-224", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_224withRSA");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA3-256", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_256withRSA");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA3-384", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_384withRSA");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA3-512", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_512withRSA");
            getHighSpeedVideoSizes(configurableProvider, "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHAKE128WithRSAPSS", org.bouncycastle.internal.asn1.cms.CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE128);
            getHighSpeedVideoSizes(configurableProvider, "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHAKE256WithRSAPSS", org.bouncycastle.internal.asn1.cms.CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE256);
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA224", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA224withRSAandSHAKE128");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA256", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA256withRSAandSHAKE128");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA384", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA384withRSAandSHAKE128");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA512", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512withRSAandSHAKE128");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA512(224)", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_224withRSAandSHAKE128");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA512(256)", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_256withRSAandSHAKE128");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA224", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA224withRSAandSHAKE256");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA256", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA256withRSAandSHAKE256");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA384", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA384withRSAandSHAKE256");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA512", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512withRSAandSHAKE256");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA512(224)", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_224withRSAandSHAKE256");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA512(256)", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA512_256withRSAandSHAKE256");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA3-224", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_224withRSAandSHAKE128");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA3-256", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_256withRSAandSHAKE128");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA3-384", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_384withRSAandSHAKE128");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA3-512", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_512withRSAandSHAKE128");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA3-224", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_224withRSAandSHAKE256");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA3-256", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_256withRSAandSHAKE256");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA3-384", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_384withRSAandSHAKE256");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA3-512", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA3_512withRSAandSHAKE256");
            if (configurableProvider.hasAlgorithm("MessageDigest", "MD2")) {
                str2 = "SHA3-512";
                str = "SHA3-384";
                Camera2StreamConfigurationMap(configurableProvider, "MD2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD2", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md2WithRSAEncryption);
            } else {
                str = "SHA3-384";
                str2 = "SHA3-512";
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "MD4")) {
                Camera2StreamConfigurationMap(configurableProvider, "MD4", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD4", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md4WithRSAEncryption);
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "MD5")) {
                Camera2StreamConfigurationMap(configurableProvider, "MD5", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$MD5", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5WithRSAEncryption);
                getHighResolutionOutputSizeshNQ4ISI(configurableProvider, "MD5", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$MD5WithRSAEncryption");
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "SHA1")) {
                configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA1withRSA/PSS", "PSS");
                configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.SHA1WITHRSAANDMGF1", "PSS");
                getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA1", "MGF1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA1withRSA");
                getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA1", "SHAKE128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA1withRSAandSHAKE128");
                getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA1", "SHAKE256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi$SHA1withRSAandSHAKE256");
                Camera2StreamConfigurationMap(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA1", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha1WithRSAEncryption);
                getHighResolutionOutputSizeshNQ4ISI(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA1WithRSAEncryption");
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Alg.Alias.Signature.");
                sb3.append(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.sha1WithRSA);
                configurableProvider.addAlgorithm(sb3.toString(), "SHA1WITHRSA");
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Alg.Alias.Signature.OID.");
                sb4.append(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.sha1WithRSA);
                configurableProvider.addAlgorithm(sb4.toString(), "SHA1WITHRSA");
                getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA1", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA1WithRSAEncryption");
            }
            Camera2StreamConfigurationMap(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA224", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha224WithRSAEncryption);
            Camera2StreamConfigurationMap(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA256", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha256WithRSAEncryption);
            Camera2StreamConfigurationMap(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA384", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha384WithRSAEncryption);
            Camera2StreamConfigurationMap(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512WithRSAEncryption);
            Camera2StreamConfigurationMap(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_224", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512_224WithRSAEncryption);
            Camera2StreamConfigurationMap(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA512_256", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512_256WithRSAEncryption);
            Camera2StreamConfigurationMap(configurableProvider, "SHA3-224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_224", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224);
            Camera2StreamConfigurationMap(configurableProvider, "SHA3-256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256);
            Camera2StreamConfigurationMap(configurableProvider, str, "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_384", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384);
            Camera2StreamConfigurationMap(configurableProvider, str2, "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$SHA3_512", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512);
            getHighResolutionOutputSizeshNQ4ISI(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA224WithRSAEncryption");
            getHighResolutionOutputSizeshNQ4ISI(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA256WithRSAEncryption");
            getHighResolutionOutputSizeshNQ4ISI(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA384WithRSAEncryption");
            getHighResolutionOutputSizeshNQ4ISI(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512WithRSAEncryption");
            getHighResolutionOutputSizeshNQ4ISI(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512_224WithRSAEncryption");
            getHighResolutionOutputSizeshNQ4ISI(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$SHA512_256WithRSAEncryption");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA224", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA224WithRSAEncryption");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA256WithRSAEncryption");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA384", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA384WithRSAEncryption");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA512", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512WithRSAEncryption");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA512(224)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512_224WithRSAEncryption");
            getHighSpeedVideoFpsRangesFor(configurableProvider, "SHA512(256)", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$SHA512_256WithRSAEncryption");
            if (configurableProvider.hasAlgorithm("MessageDigest", "RIPEMD128")) {
                Camera2StreamConfigurationMap(configurableProvider, "RIPEMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128);
                Camera2StreamConfigurationMap(configurableProvider, "RMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD128", null);
                getHighSpeedVideoFpsRangesFor(configurableProvider, "RMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD128WithRSAEncryption");
                getHighSpeedVideoFpsRangesFor(configurableProvider, "RIPEMD128", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD128WithRSAEncryption");
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "RIPEMD160")) {
                Camera2StreamConfigurationMap(configurableProvider, "RIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160);
                Camera2StreamConfigurationMap(configurableProvider, "RMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD160", null);
                configurableProvider.addAlgorithm("Alg.Alias.Signature.RIPEMD160WithRSA/ISO9796-2", "RIPEMD160withRSA/ISO9796-2");
                configurableProvider.addAlgorithm("Signature.RIPEMD160withRSA/ISO9796-2", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$RIPEMD160WithRSAEncryption");
                getHighSpeedVideoFpsRangesFor(configurableProvider, "RMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD160WithRSAEncryption");
                getHighSpeedVideoFpsRangesFor(configurableProvider, "RIPEMD160", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$RIPEMD160WithRSAEncryption");
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "RIPEMD256")) {
                Camera2StreamConfigurationMap(configurableProvider, "RIPEMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256);
                Camera2StreamConfigurationMap(configurableProvider, "RMD256", "org.bouncycastle.jcajce.provider.asymmetric.rsa.DigestSignatureSpi$RIPEMD256", null);
            }
            if (configurableProvider.hasAlgorithm("MessageDigest", "WHIRLPOOL")) {
                getHighResolutionOutputSizeshNQ4ISI(configurableProvider, "Whirlpool", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$WhirlpoolWithRSAEncryption");
                getHighResolutionOutputSizeshNQ4ISI(configurableProvider, "WHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi$WhirlpoolWithRSAEncryption");
                getHighSpeedVideoFpsRangesFor(configurableProvider, "Whirlpool", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$WhirlpoolWithRSAEncryption");
                getHighSpeedVideoFpsRangesFor(configurableProvider, "WHIRLPOOL", "org.bouncycastle.jcajce.provider.asymmetric.rsa.X931SignatureSpi$WhirlpoolWithRSAEncryption");
            }
        }

        private static void getHighSpeedVideoFpsRangesFor(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, java.lang.String str, java.lang.String str2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb.append(str);
            sb.append("withRSA/X9.31");
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("WITHRSA/X9.31");
            configurableProvider.addAlgorithm(obj, sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb3.append(str);
            sb3.append("WithRSA/X9.31");
            java.lang.String obj2 = sb3.toString();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("WITHRSA/X9.31");
            configurableProvider.addAlgorithm(obj2, sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Signature.");
            sb5.append(str);
            sb5.append("WITHRSA/X9.31");
            configurableProvider.addAlgorithm(sb5.toString(), str2);
        }

        private static void getHighSpeedVideoSizes(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, java.lang.String str, java.lang.String str2, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb.append(str);
            sb.append("withRSA/PSS");
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("WITHRSAPSS");
            configurableProvider.addAlgorithm(obj, sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb3.append(str);
            sb3.append("WithRSA/PSS");
            java.lang.String obj2 = sb3.toString();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("WITHRSAPSS");
            configurableProvider.addAlgorithm(obj2, sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb5.append(str);
            sb5.append("withRSASSA-PSS");
            java.lang.String obj3 = sb5.toString();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("WITHRSAPSS");
            configurableProvider.addAlgorithm(obj3, sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb7.append(str);
            sb7.append("WithRSASSA-PSS");
            java.lang.String obj4 = sb7.toString();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("WITHRSAPSS");
            configurableProvider.addAlgorithm(obj4, sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb9.append(str);
            sb9.append("WITHRSASSA-PSS");
            java.lang.String obj5 = sb9.toString();
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("WITHRSAPSS");
            configurableProvider.addAlgorithm(obj5, sb10.toString());
            configurableProvider.addAlgorithm("Signature", aSN1ObjectIdentifier, str2);
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("Signature.");
            sb11.append(str);
            sb11.append("WITHRSAPSS");
            configurableProvider.addAlgorithm(sb11.toString(), str2);
        }

        private static void getHighSpeedVideoFpsRangesFor(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            java.lang.String concat = "WITHRSAAND".concat(java.lang.String.valueOf(str2));
            if (str2.equals("MGF1")) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Alg.Alias.Signature.");
                sb.append(str);
                sb.append("withRSA/PSS");
                java.lang.String obj = sb.toString();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(concat);
                configurableProvider.addAlgorithm(obj, sb2.toString());
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Alg.Alias.Signature.");
                sb3.append(str);
                sb3.append("WithRSA/PSS");
                java.lang.String obj2 = sb3.toString();
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append(concat);
                configurableProvider.addAlgorithm(obj2, sb4.toString());
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Alg.Alias.Signature.");
                sb5.append(str);
                sb5.append("withRSASSA-PSS");
                java.lang.String obj3 = sb5.toString();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(concat);
                configurableProvider.addAlgorithm(obj3, sb6.toString());
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Alg.Alias.Signature.");
                sb7.append(str);
                sb7.append("WithRSASSA-PSS");
                java.lang.String obj4 = sb7.toString();
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(str);
                sb8.append(concat);
                configurableProvider.addAlgorithm(obj4, sb8.toString());
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Alg.Alias.Signature.");
                sb9.append(str);
                sb9.append("WITHRSASSA-PSS");
                java.lang.String obj5 = sb9.toString();
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                sb10.append(str);
                sb10.append(concat);
                configurableProvider.addAlgorithm(obj5, sb10.toString());
            }
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb11.append(str);
            sb11.append("withRSAand");
            sb11.append(str2);
            java.lang.String obj6 = sb11.toString();
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append(concat);
            configurableProvider.addAlgorithm(obj6, sb12.toString());
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb13.append(str);
            sb13.append("WithRSAAnd");
            sb13.append(str2);
            java.lang.String obj7 = sb13.toString();
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            sb14.append(str);
            sb14.append(concat);
            configurableProvider.addAlgorithm(obj7, sb14.toString());
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder("Signature.");
            sb15.append(str);
            sb15.append("WITHRSAAND");
            sb15.append(str2);
            configurableProvider.addAlgorithm(sb15.toString(), str3);
        }

        private static void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, java.lang.String str, java.lang.String str2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb.append(str);
            sb.append("withRSA/ISO9796-2");
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("WITHRSA/ISO9796-2");
            configurableProvider.addAlgorithm(obj, sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Alg.Alias.Signature.");
            sb3.append(str);
            sb3.append("WithRSA/ISO9796-2");
            java.lang.String obj2 = sb3.toString();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("WITHRSA/ISO9796-2");
            configurableProvider.addAlgorithm(obj2, sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Signature.");
            sb5.append(str);
            sb5.append("WITHRSA/ISO9796-2");
            configurableProvider.addAlgorithm(sb5.toString(), str2);
        }

        private static void Camera2StreamConfigurationMap(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, java.lang.String str, java.lang.String str2, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append("WITHRSA");
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("withRSA");
            java.lang.String obj2 = sb2.toString();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("WithRSA");
            java.lang.String obj3 = sb3.toString();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("/RSA");
            java.lang.String obj4 = sb4.toString();
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("WITHRSAENCRYPTION");
            java.lang.String obj5 = sb5.toString();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("withRSAEncryption");
            java.lang.String obj6 = sb6.toString();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("WithRSAEncryption");
            java.lang.String obj7 = sb7.toString();
            configurableProvider.addAlgorithm("Signature.".concat(java.lang.String.valueOf(obj)), str2);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(java.lang.String.valueOf(obj2)), obj);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(java.lang.String.valueOf(obj3)), obj);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(java.lang.String.valueOf(obj5)), obj);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(java.lang.String.valueOf(obj6)), obj);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(java.lang.String.valueOf(obj7)), obj);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(java.lang.String.valueOf(obj4)), obj);
            if (aSN1ObjectIdentifier != null) {
                configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)), obj);
                configurableProvider.addAlgorithm("Alg.Alias.Signature.OID.".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)), obj);
            }
        }
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRanges = hashMap;
        hashMap.put("SupportedKeyClasses", "javax.crypto.interfaces.RSAPublicKey|javax.crypto.interfaces.RSAPrivateKey");
        hashMap.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
