package org.bouncycastle.jcajce.util;

/* loaded from: classes17.dex */
public class JcaJceUtils {
    public static void loadParameters(java.security.AlgorithmParameters algorithmParameters, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) throws java.io.IOException {
        try {
            algorithmParameters.init(aSN1Encodable.toASN1Primitive().getEncoded(), "ASN.1");
        } catch (java.lang.Exception unused) {
            algorithmParameters.init(aSN1Encodable.toASN1Primitive().getEncoded());
        }
    }

    public static java.lang.String getDigestAlgName(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "MD5" : org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "SHA1" : org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "SHA224" : org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "SHA256" : org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "SHA384" : org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "SHA512" : org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd128.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "RIPEMD128" : org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "RIPEMD160" : org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd256.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "RIPEMD256" : org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411.equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier) ? "GOST3411" : aSN1ObjectIdentifier.getId();
    }

    public static org.bouncycastle.asn1.ASN1Encodable extractParameters(java.security.AlgorithmParameters algorithmParameters) throws java.io.IOException {
        try {
            return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(algorithmParameters.getEncoded("ASN.1"));
        } catch (java.lang.Exception unused) {
            return org.bouncycastle.asn1.ASN1Primitive.fromByteArray(algorithmParameters.getEncoded());
        }
    }

    private JcaJceUtils() {
    }
}
