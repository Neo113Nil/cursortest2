package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
class DigestUtil {
    private static java.util.Map<java.lang.String, org.bouncycastle.asn1.ASN1ObjectIdentifier> getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
    private static java.util.Map<org.bouncycastle.asn1.ASN1ObjectIdentifier, java.lang.String> getHighSpeedVideoFpsRanges = new java.util.HashMap();

    static org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256)) {
            return new org.bouncycastle.crypto.digests.SHA256Digest();
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512)) {
            return new org.bouncycastle.crypto.digests.SHA512Digest();
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128)) {
            return new org.bouncycastle.crypto.digests.SHAKEDigest(128);
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256)) {
            return new org.bouncycastle.crypto.digests.SHAKEDigest(256);
        }
        throw new java.lang.IllegalArgumentException("unrecognized digest OID: ".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)));
    }

    DigestUtil() {
    }

    static {
        getHighSpeedVideoFpsRangesFor.put("SHA-256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        getHighSpeedVideoFpsRangesFor.put("SHA-512", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512);
        getHighSpeedVideoFpsRangesFor.put("SHAKE128", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128);
        getHighSpeedVideoFpsRangesFor.put("SHAKE256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256);
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256, "SHA-256");
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512, "SHA-512");
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128, "SHAKE128");
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256, "SHAKE256");
    }
}
