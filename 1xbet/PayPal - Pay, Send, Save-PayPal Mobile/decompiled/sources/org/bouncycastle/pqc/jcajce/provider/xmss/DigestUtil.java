package org.bouncycastle.pqc.jcajce.provider.xmss;

/* loaded from: classes17.dex */
class DigestUtil {
    public static byte[] getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.Digest digest) {
        boolean z = digest instanceof org.bouncycastle.crypto.Xof;
        int digestSize = digest.getDigestSize();
        if (z) {
            digestSize *= 2;
        }
        byte[] bArr = new byte[digestSize];
        if (z) {
            ((org.bouncycastle.crypto.Xof) digest).doFinal(bArr, 0, digestSize);
            return bArr;
        }
        digest.doFinal(bArr, 0);
        return bArr;
    }

    public static java.lang.String getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256)) {
            return "SHA256";
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512)) {
            return "SHA512";
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128)) {
            return "SHAKE128";
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256)) {
            return "SHAKE256";
        }
        throw new java.lang.IllegalArgumentException("unrecognized digest OID: ".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)));
    }

    static org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        if (str.equals("SHA-256")) {
            return org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256;
        }
        if (str.equals("SHA-512")) {
            return org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512;
        }
        if (str.equals("SHAKE128")) {
            return org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128;
        }
        if (str.equals("SHAKE256")) {
            return org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256;
        }
        throw new java.lang.IllegalArgumentException("unrecognized digest: ".concat(java.lang.String.valueOf(str)));
    }

    DigestUtil() {
    }
}
