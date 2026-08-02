package org.bouncycastle.pqc.crypto.util;

/* loaded from: classes17.dex */
class Utils {
    static final java.util.Map getHighSpeedVideoSizesFor;
    static final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.qTESLA_p_I);
    static final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.qTESLA_p_III);
    static final org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256);
    static final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256);
    static final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
    static final org.bouncycastle.asn1.x509.AlgorithmIdentifier getInputFormats = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512);
    static final org.bouncycastle.asn1.x509.AlgorithmIdentifier getOutputFormats = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128);
    static final org.bouncycastle.asn1.x509.AlgorithmIdentifier getOutputMinFrameDuration = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256);

    static org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        if (str.equals("SHA-256")) {
            return getHighSpeedVideoFpsRangesFor;
        }
        if (str.equals("SHA-512")) {
            return getInputFormats;
        }
        if (str.equals("SHAKE128")) {
            return getOutputFormats;
        }
        if (str.equals("SHAKE256")) {
            return getOutputMinFrameDuration;
        }
        throw new java.lang.IllegalArgumentException("unknown tree digest: ".concat(java.lang.String.valueOf(str)));
    }

    static java.lang.String getHighSpeedVideoFpsRangesFor(org.bouncycastle.pqc.asn1.SPHINCS256KeyParams sPHINCS256KeyParams) {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier treeDigest = sPHINCS256KeyParams.getTreeDigest();
        if (treeDigest.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) Camera2StreamConfigurationMap.getAlgorithm())) {
            return "SHA3-256";
        }
        if (treeDigest.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) getHighSpeedVideoFpsRanges.getAlgorithm())) {
            return "SHA-512/256";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown tree digest: ");
        sb.append(treeDigest.getAlgorithm());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    static org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges(java.lang.String str) {
        if (str.equals("SHA3-256")) {
            return Camera2StreamConfigurationMap;
        }
        if (str.equals("SHA-512/256")) {
            return getHighSpeedVideoFpsRanges;
        }
        throw new java.lang.IllegalArgumentException("unknown tree digest: ".concat(java.lang.String.valueOf(str)));
    }

    static int Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        return ((java.lang.Integer) getHighSpeedVideoSizesFor.get(algorithmIdentifier.getAlgorithm())).intValue();
    }

    static org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (i == 5) {
            return getHighSpeedVideoSizes;
        }
        if (i == 6) {
            return getHighResolutionOutputSizeshNQ4ISI;
        }
        throw new java.lang.IllegalArgumentException("unknown security category: ".concat(java.lang.String.valueOf(i)));
    }

    public static java.lang.String Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1)) {
            return "SHA-1";
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224)) {
            return "SHA-224";
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256)) {
            return "SHA-256";
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384)) {
            return "SHA-384";
        }
        if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512)) {
            return "SHA-512";
        }
        throw new java.lang.IllegalArgumentException("unrecognised digest algorithm: ".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)));
    }

    static org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
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

    public static org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap(java.lang.String str) {
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

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoSizesFor = hashMap;
        hashMap.put(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.qTESLA_p_I, org.bouncycastle.util.Integers.valueOf(5));
        hashMap.put(org.bouncycastle.pqc.asn1.PQCObjectIdentifiers.qTESLA_p_III, org.bouncycastle.util.Integers.valueOf(6));
    }
}
