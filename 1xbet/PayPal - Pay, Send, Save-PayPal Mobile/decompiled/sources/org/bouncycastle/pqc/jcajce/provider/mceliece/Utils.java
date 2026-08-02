package org.bouncycastle.pqc.jcajce.provider.mceliece;

/* loaded from: classes17.dex */
class Utils {
    static org.bouncycastle.crypto.Digest Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        if (algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA1();
        }
        if (algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA224();
        }
        if (algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA256();
        }
        if (algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA384();
        }
        if (algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA512();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unrecognised OID in digest algorithm identifier: ");
        sb.append(algorithmIdentifier.getAlgorithm());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap(java.lang.String str) {
        if (str.equals("SHA-1")) {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, org.bouncycastle.asn1.DERNull.INSTANCE);
        }
        if (str.equals("SHA-224")) {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224);
        }
        if (str.equals("SHA-256")) {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        }
        if (str.equals("SHA-384")) {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384);
        }
        if (str.equals("SHA-512")) {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512);
        }
        throw new java.lang.IllegalArgumentException("unrecognised digest algorithm: ".concat(java.lang.String.valueOf(str)));
    }

    Utils() {
    }
}
