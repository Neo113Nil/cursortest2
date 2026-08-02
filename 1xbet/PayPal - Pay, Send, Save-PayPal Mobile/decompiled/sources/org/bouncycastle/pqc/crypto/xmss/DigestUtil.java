package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
class DigestUtil {
    private static java.util.Map<java.lang.String, org.bouncycastle.asn1.ASN1ObjectIdentifier> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
    private static java.util.Map<org.bouncycastle.asn1.ASN1ObjectIdentifier, java.lang.String> getHighSpeedVideoSizes = new java.util.HashMap();

    static org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap(java.lang.String str) {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = getHighResolutionOutputSizeshNQ4ISI.get(str);
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        throw new java.lang.IllegalArgumentException("unrecognized digest name: ".concat(java.lang.String.valueOf(str)));
    }

    static java.lang.String Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.lang.String str = getHighSpeedVideoSizes.get(aSN1ObjectIdentifier);
        if (str != null) {
            return str;
        }
        throw new java.lang.IllegalArgumentException("unrecognized digest oid: ".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)));
    }

    static org.bouncycastle.crypto.Digest getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
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
        getHighResolutionOutputSizeshNQ4ISI.put("SHA-256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        getHighResolutionOutputSizeshNQ4ISI.put("SHA-512", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512);
        getHighResolutionOutputSizeshNQ4ISI.put("SHAKE128", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128);
        getHighResolutionOutputSizeshNQ4ISI.put("SHAKE256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256);
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256, "SHA-256");
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512, "SHA-512");
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128, "SHAKE128");
        getHighSpeedVideoSizes.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256, "SHAKE256");
    }
}
