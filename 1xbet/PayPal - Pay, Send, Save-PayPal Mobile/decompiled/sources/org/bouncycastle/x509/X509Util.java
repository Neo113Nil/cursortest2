package org.bouncycastle.x509;

/* loaded from: classes17.dex */
class X509Util {
    private static java.util.Hashtable getHighSpeedVideoFpsRangesFor = new java.util.Hashtable();
    private static java.util.Hashtable getHighSpeedVideoFpsRanges = new java.util.Hashtable();
    private static java.util.Set getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet();

    static byte[] getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str, java.lang.String str2, java.security.PrivateKey privateKey, java.security.SecureRandom secureRandom, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException, java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException {
        if (aSN1ObjectIdentifier == null) {
            throw new java.lang.IllegalStateException("no signature algorithm specified");
        }
        java.security.Signature signature = str2 != null ? java.security.Signature.getInstance(str, str2) : java.security.Signature.getInstance(str);
        if (secureRandom != null) {
            signature.initSign(privateKey, secureRandom);
        } else {
            signature.initSign(privateKey);
        }
        signature.update(aSN1Encodable.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
        return signature.sign();
    }

    static byte[] getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str, java.security.PrivateKey privateKey, java.security.SecureRandom secureRandom, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException {
        if (aSN1ObjectIdentifier == null) {
            throw new java.lang.IllegalStateException("no signature algorithm specified");
        }
        java.security.Signature signature = java.security.Signature.getInstance(str);
        if (secureRandom != null) {
            signature.initSign(privateKey, secureRandom);
        } else {
            signature.initSign(privateKey);
        }
        signature.update(aSN1Encodable.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
        return signature.sign();
    }

    static org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        if (getHighResolutionOutputSizeshNQ4ISI.contains(aSN1ObjectIdentifier)) {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier);
        }
        java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str);
        return getHighSpeedVideoFpsRanges.containsKey(upperCase) ? new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, (org.bouncycastle.asn1.ASN1Encodable) getHighSpeedVideoFpsRanges.get(upperCase)) : new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, org.bouncycastle.asn1.DERNull.INSTANCE);
    }

    static java.security.Provider getHighSpeedVideoFpsRanges(java.lang.String str) throws java.security.NoSuchProviderException {
        java.security.Provider provider = java.security.Security.getProvider(str);
        if (provider != null) {
            return provider;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Provider ");
        sb.append(str);
        sb.append(" not found");
        throw new java.security.NoSuchProviderException(sb.toString());
    }

    static org.bouncycastle.x509.X509Util.Implementation getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, java.security.Provider provider) throws java.security.NoSuchAlgorithmException {
        java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str2);
        while (true) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Alg.Alias.");
            sb.append(str);
            sb.append(".");
            sb.append(upperCase);
            java.lang.String property = provider.getProperty(sb.toString());
            if (property == null) {
                break;
            }
            upperCase = property;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(".");
        sb2.append(upperCase);
        java.lang.String property2 = provider.getProperty(sb2.toString());
        if (property2 == null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("cannot find implementation ");
            sb3.append(upperCase);
            sb3.append(" for provider ");
            sb3.append(provider.getName());
            throw new java.security.NoSuchAlgorithmException(sb3.toString());
        }
        try {
            java.lang.ClassLoader classLoader = provider.getClass().getClassLoader();
            return new org.bouncycastle.x509.X509Util.Implementation((classLoader != null ? classLoader.loadClass(property2) : java.lang.Class.forName(property2)).newInstance(), provider);
        } catch (java.lang.ClassNotFoundException unused) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("algorithm ");
            sb4.append(upperCase);
            sb4.append(" in provider ");
            sb4.append(provider.getName());
            sb4.append(" but no class \"");
            sb4.append(property2);
            sb4.append("\" found!");
            throw new java.lang.IllegalStateException(sb4.toString());
        } catch (java.lang.Exception unused2) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("algorithm ");
            sb5.append(upperCase);
            sb5.append(" in provider ");
            sb5.append(provider.getName());
            sb5.append(" but class \"");
            sb5.append(property2);
            sb5.append("\" inaccessible!");
            throw new java.lang.IllegalStateException(sb5.toString());
        }
    }

    static org.bouncycastle.x509.X509Util.Implementation Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2) throws java.security.NoSuchAlgorithmException {
        java.security.Provider[] providers = java.security.Security.getProviders();
        if (providers.length != 0) {
            return getHighSpeedVideoFpsRangesFor(str, org.bouncycastle.util.Strings.toUpperCase(str2), providers[0]);
        }
        throw new java.security.NoSuchAlgorithmException("cannot find implementation ".concat(java.lang.String.valueOf(str2)));
    }

    static org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str);
        return getHighSpeedVideoFpsRangesFor.containsKey(upperCase) ? (org.bouncycastle.asn1.ASN1ObjectIdentifier) getHighSpeedVideoFpsRangesFor.get(upperCase) : new org.bouncycastle.asn1.ASN1ObjectIdentifier(upperCase);
    }

    static java.util.Iterator getHighSpeedVideoFpsRangesFor() {
        java.util.Enumeration keys = getHighSpeedVideoFpsRangesFor.keys();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (keys.hasMoreElements()) {
            arrayList.add(keys.nextElement());
        }
        return arrayList.iterator();
    }

    private static org.bouncycastle.asn1.pkcs.RSASSAPSSparams Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, int i) {
        return new org.bouncycastle.asn1.pkcs.RSASSAPSSparams(algorithmIdentifier, new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_mgf1, algorithmIdentifier), new org.bouncycastle.asn1.ASN1Integer(i), new org.bouncycastle.asn1.ASN1Integer(1L));
    }

    static org.bouncycastle.jce.X509Principal getHighSpeedVideoSizes(javax.security.auth.x500.X500Principal x500Principal) {
        try {
            return new org.bouncycastle.jce.X509Principal(x500Principal.getEncoded());
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalArgumentException("cannot convert principal");
        }
    }

    static class Implementation {
        java.security.Provider Camera2StreamConfigurationMap;
        java.lang.Object getHighSpeedVideoFpsRangesFor;

        Implementation(java.lang.Object obj, java.security.Provider provider) {
            this.getHighSpeedVideoFpsRangesFor = obj;
            this.Camera2StreamConfigurationMap = provider;
        }
    }

    X509Util() {
    }

    static {
        getHighSpeedVideoFpsRangesFor.put("MD2WITHRSAENCRYPTION", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md2WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("MD2WITHRSA", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md2WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("MD5WITHRSAENCRYPTION", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("MD5WITHRSA", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA1WITHRSAENCRYPTION", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha1WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA1WITHRSA", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha1WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA224WITHRSAENCRYPTION", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha224WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA224WITHRSA", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha224WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA256WITHRSAENCRYPTION", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha256WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA256WITHRSA", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha256WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA384WITHRSAENCRYPTION", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha384WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA384WITHRSA", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha384WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA512WITHRSAENCRYPTION", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA512WITHRSA", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sha512WithRSAEncryption);
        getHighSpeedVideoFpsRangesFor.put("SHA1WITHRSAANDMGF1", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS);
        getHighSpeedVideoFpsRangesFor.put("SHA224WITHRSAANDMGF1", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS);
        getHighSpeedVideoFpsRangesFor.put("SHA256WITHRSAANDMGF1", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS);
        getHighSpeedVideoFpsRangesFor.put("SHA384WITHRSAANDMGF1", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS);
        getHighSpeedVideoFpsRangesFor.put("SHA512WITHRSAANDMGF1", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS);
        getHighSpeedVideoFpsRangesFor.put("RIPEMD160WITHRSAENCRYPTION", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160);
        getHighSpeedVideoFpsRangesFor.put("RIPEMD160WITHRSA", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160);
        getHighSpeedVideoFpsRangesFor.put("RIPEMD128WITHRSAENCRYPTION", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128);
        getHighSpeedVideoFpsRangesFor.put("RIPEMD128WITHRSA", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128);
        getHighSpeedVideoFpsRangesFor.put("RIPEMD256WITHRSAENCRYPTION", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256);
        getHighSpeedVideoFpsRangesFor.put("RIPEMD256WITHRSA", org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256);
        getHighSpeedVideoFpsRangesFor.put("SHA1WITHDSA", org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa_with_sha1);
        getHighSpeedVideoFpsRangesFor.put("DSAWITHSHA1", org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa_with_sha1);
        getHighSpeedVideoFpsRangesFor.put("SHA224WITHDSA", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha224);
        getHighSpeedVideoFpsRangesFor.put("SHA256WITHDSA", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha256);
        getHighSpeedVideoFpsRangesFor.put("SHA384WITHDSA", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha384);
        getHighSpeedVideoFpsRangesFor.put("SHA512WITHDSA", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha512);
        getHighSpeedVideoFpsRangesFor.put("SHA1WITHECDSA", org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA1);
        getHighSpeedVideoFpsRangesFor.put("ECDSAWITHSHA1", org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA1);
        getHighSpeedVideoFpsRangesFor.put("SHA224WITHECDSA", org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA224);
        getHighSpeedVideoFpsRangesFor.put("SHA256WITHECDSA", org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA256);
        getHighSpeedVideoFpsRangesFor.put("SHA384WITHECDSA", org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA384);
        getHighSpeedVideoFpsRangesFor.put("SHA512WITHECDSA", org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA512);
        getHighSpeedVideoFpsRangesFor.put("GOST3411WITHGOST3410", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94);
        getHighSpeedVideoFpsRangesFor.put("GOST3411WITHGOST3410-94", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94);
        getHighSpeedVideoFpsRangesFor.put("GOST3411WITHECGOST3410", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
        getHighSpeedVideoFpsRangesFor.put("GOST3411WITHECGOST3410-2001", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
        getHighSpeedVideoFpsRangesFor.put("GOST3411WITHGOST3410-2001", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA1);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA224);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA256);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA384);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA512);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa_with_sha1);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.dsaWithSHA1);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha224);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha256);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha384);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.dsa_with_sha512);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94);
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
        getHighSpeedVideoFpsRanges.put("SHA1WITHRSAANDMGF1", Camera2StreamConfigurationMap(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, org.bouncycastle.asn1.DERNull.INSTANCE), 20));
        getHighSpeedVideoFpsRanges.put("SHA224WITHRSAANDMGF1", Camera2StreamConfigurationMap(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224, org.bouncycastle.asn1.DERNull.INSTANCE), 28));
        getHighSpeedVideoFpsRanges.put("SHA256WITHRSAANDMGF1", Camera2StreamConfigurationMap(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256, org.bouncycastle.asn1.DERNull.INSTANCE), 32));
        getHighSpeedVideoFpsRanges.put("SHA384WITHRSAANDMGF1", Camera2StreamConfigurationMap(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384, org.bouncycastle.asn1.DERNull.INSTANCE), 48));
        getHighSpeedVideoFpsRanges.put("SHA512WITHRSAANDMGF1", Camera2StreamConfigurationMap(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512, org.bouncycastle.asn1.DERNull.INSTANCE), 64));
    }
}
