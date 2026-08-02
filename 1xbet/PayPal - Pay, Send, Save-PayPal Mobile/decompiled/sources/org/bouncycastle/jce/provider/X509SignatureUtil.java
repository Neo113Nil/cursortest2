package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
class X509SignatureUtil {
    private static final org.bouncycastle.asn1.ASN1Null getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.DERNull.INSTANCE;

    static void getHighSpeedVideoFpsRanges(java.security.Signature signature, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        if (aSN1Encodable == null || getHighSpeedVideoFpsRanges.equals(aSN1Encodable)) {
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

    static java.lang.String Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        org.bouncycastle.asn1.ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (parameters != null && !getHighSpeedVideoFpsRanges.equals(parameters)) {
            if (algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_RSASSA_PSS)) {
                org.bouncycastle.asn1.pkcs.RSASSAPSSparams rSASSAPSSparams = org.bouncycastle.asn1.pkcs.RSASSAPSSparams.getInstance(parameters);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(Camera2StreamConfigurationMap(rSASSAPSSparams.getHashAlgorithm().getAlgorithm()));
                sb.append("withRSAandMGF1");
                return sb.toString();
            }
            if (algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x9.X9ObjectIdentifiers.ecdsa_with_SHA2)) {
                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(parameters);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0))));
                sb2.append("withECDSA");
                return sb2.toString();
            }
        }
        return algorithmIdentifier.getAlgorithm().getId();
    }

    private static java.lang.String Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "MD5" : org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "SHA1" : org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "SHA224" : org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "SHA256" : org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "SHA384" : org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "SHA512" : org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd128.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "RIPEMD128" : org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "RIPEMD160" : org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd256.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "RIPEMD256" : org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "GOST3411" : aSN1ObjectIdentifier.getId();
    }

    X509SignatureUtil() {
    }
}
