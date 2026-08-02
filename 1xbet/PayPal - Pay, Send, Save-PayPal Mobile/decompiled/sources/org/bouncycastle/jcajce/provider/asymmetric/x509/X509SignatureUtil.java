package org.bouncycastle.jcajce.provider.asymmetric.x509;

/* loaded from: classes17.dex */
class X509SignatureUtil {
    private static final java.util.Map<org.bouncycastle.asn1.ASN1ObjectIdentifier, java.lang.String> getHighSpeedVideoFpsRanges;
    private static final org.bouncycastle.asn1.ASN1Null getHighSpeedVideoFpsRangesFor;

    static java.lang.String Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        java.lang.String highSpeedVideoFpsRanges;
        java.lang.String highSpeedVideoFpsRanges2;
        java.lang.StringBuilder sb;
        java.lang.String str;
        org.bouncycastle.asn1.ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters != null && !getHighSpeedVideoFpsRangesFor.equals(parameters)) {
            if (algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS)) {
                org.bouncycastle.asn1.pkcs.RSASSAPSSparams rSASSAPSSparams = org.bouncycastle.asn1.pkcs.RSASSAPSSparams.getInstance(parameters);
                sb = new java.lang.StringBuilder();
                sb.append(getHighSpeedVideoSizes(rSASSAPSSparams.getHashAlgorithm().getAlgorithm()));
                str = "withRSAandMGF1";
            } else if (algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA2)) {
                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(parameters);
                sb = new java.lang.StringBuilder();
                sb.append(getHighSpeedVideoSizes((org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0)));
                str = "withECDSA";
            }
            sb.append(str);
            return sb.toString();
        }
        java.lang.String str2 = getHighSpeedVideoFpsRanges.get(algorithmIdentifier.getAlgorithm());
        if (str2 != null) {
            return str2;
        }
        org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        java.security.Provider provider = java.security.Security.getProvider(org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
        if (provider != null && (highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(provider, algorithm)) != null) {
            return highSpeedVideoFpsRanges2;
        }
        java.security.Provider[] providers = java.security.Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            java.security.Provider provider2 = providers[i];
            if (provider != provider2 && (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(provider2, algorithm)) != null) {
                return highSpeedVideoFpsRanges;
            }
        }
        return algorithm.getId();
    }

    static void getHighSpeedVideoFpsRanges(java.security.Signature signature, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        if (aSN1Encodable == null || getHighSpeedVideoFpsRangesFor.equals(aSN1Encodable)) {
            return;
        }
        java.security.AlgorithmParameters algorithmParameters = java.security.AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
        try {
            algorithmParameters.init(aSN1Encodable.toASN1Primitive().getEncoded());
            if (signature.getAlgorithm().endsWith("MGF1")) {
                try {
                    signature.setParameter(algorithmParameters.getParameterSpec(java.security.spec.PSSParameterSpec.class));
                } catch (java.security.GeneralSecurityException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception extracting parameters: ");
                    sb.append(e.getMessage());
                    throw new java.security.SignatureException(sb.toString());
                }
            }
        } catch (java.io.IOException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("IOException decoding parameters: ");
            sb2.append(e2.getMessage());
            throw new java.security.SignatureException(sb2.toString());
        }
    }

    static void getHighSpeedVideoFpsRangesFor(byte[] bArr, java.lang.StringBuffer stringBuffer, java.lang.String str) {
        java.lang.StringBuffer append;
        java.lang.String hexString;
        if (bArr.length <= 20) {
            stringBuffer.append("            Signature: ").append(org.bouncycastle.util.encoders.Hex.toHexString(bArr)).append(str);
            return;
        }
        stringBuffer.append("            Signature: ").append(org.bouncycastle.util.encoders.Hex.toHexString(bArr, 0, 20)).append(str);
        for (int i = 20; i < bArr.length; i += 20) {
            if (i < bArr.length - 20) {
                append = stringBuffer.append("                       ");
                hexString = org.bouncycastle.util.encoders.Hex.toHexString(bArr, i, 20);
            } else {
                append = stringBuffer.append("                       ");
                hexString = org.bouncycastle.util.encoders.Hex.toHexString(bArr, i, bArr.length - i);
            }
            append.append(hexString).append(str);
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.security.Provider provider, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.lang.String property = provider.getProperty("Alg.Alias.Signature.".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)));
        if (property != null) {
            return property;
        }
        java.lang.String property2 = provider.getProperty("Alg.Alias.Signature.OID.".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)));
        if (property2 != null) {
            return property2;
        }
        return null;
    }

    static boolean getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        return org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_alg_composite.equals((org.bouncycastle.asn1.ASN1Primitive) algorithmIdentifier.getAlgorithm());
    }

    private static java.lang.String getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.lang.String digestName = org.bouncycastle.jcajce.util.MessageDigestUtils.getDigestName(aSN1ObjectIdentifier);
        int indexOf = digestName.indexOf(45);
        if (indexOf <= 0 || digestName.startsWith("SHA3")) {
            return digestName;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(digestName.substring(0, indexOf));
        sb.append(digestName.substring(indexOf + 1));
        return sb.toString();
    }

    X509SignatureUtil() {
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRanges = hashMap;
        hashMap.put(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed25519, "Ed25519");
        hashMap.put(org.bouncycastle.asn1.edec.EdECObjectIdentifiers.id_Ed448, "Ed448");
        hashMap.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.dsaWithSHA1, "SHA1withDSA");
        hashMap.put(org.bouncycastle.asn1.x9.X9ObjectIdentifiers.id_dsa_with_sha1, "SHA1withDSA");
        getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.DERNull.INSTANCE;
    }
}
