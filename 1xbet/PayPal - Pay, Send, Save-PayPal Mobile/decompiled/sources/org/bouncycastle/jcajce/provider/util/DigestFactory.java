package org.bouncycastle.jcajce.provider.util;

/* loaded from: classes17.dex */
public class DigestFactory {
    private static java.util.Set getHighSpeedVideoFpsRangesFor = new java.util.HashSet();
    private static java.util.Set Camera2StreamConfigurationMap = new java.util.HashSet();
    private static java.util.Set getHighSpeedVideoSizes = new java.util.HashSet();
    private static java.util.Set getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet();
    private static java.util.Set getInputFormats = new java.util.HashSet();
    private static java.util.Set getOutputStallDurationlomOqCM = new java.util.HashSet();
    private static java.util.Set getOutputStallDuration = new java.util.HashSet();
    private static java.util.Set getOutputSizeshNQ4ISI = new java.util.HashSet();
    private static java.util.Set getHighSpeedVideoSizesFor = new java.util.HashSet();
    private static java.util.Set getOutputMinFrameDuration = new java.util.HashSet();
    private static java.util.Set getOutputFormats = new java.util.HashSet();
    private static java.util.Set getInputSizeshNQ4ISI = new java.util.HashSet();
    private static java.util.Set getOutputSizes = new java.util.HashSet();
    private static java.util.Set getOutputMinFrameDurationlomOqCM = new java.util.HashSet();
    private static java.util.Map getHighSpeedVideoFpsRanges = new java.util.HashMap();

    public static boolean isSameDigest(java.lang.String str, java.lang.String str2) {
        if (Camera2StreamConfigurationMap.contains(str) && Camera2StreamConfigurationMap.contains(str2)) {
            return true;
        }
        if (getHighSpeedVideoSizes.contains(str) && getHighSpeedVideoSizes.contains(str2)) {
            return true;
        }
        if (getHighResolutionOutputSizeshNQ4ISI.contains(str) && getHighResolutionOutputSizeshNQ4ISI.contains(str2)) {
            return true;
        }
        if (getInputFormats.contains(str) && getInputFormats.contains(str2)) {
            return true;
        }
        if (getOutputStallDurationlomOqCM.contains(str) && getOutputStallDurationlomOqCM.contains(str2)) {
            return true;
        }
        if (getOutputStallDuration.contains(str) && getOutputStallDuration.contains(str2)) {
            return true;
        }
        if (getOutputSizeshNQ4ISI.contains(str) && getOutputSizeshNQ4ISI.contains(str2)) {
            return true;
        }
        if (getHighSpeedVideoSizesFor.contains(str) && getHighSpeedVideoSizesFor.contains(str2)) {
            return true;
        }
        if (getOutputMinFrameDuration.contains(str) && getOutputMinFrameDuration.contains(str2)) {
            return true;
        }
        if (getOutputFormats.contains(str) && getOutputFormats.contains(str2)) {
            return true;
        }
        if (getInputSizeshNQ4ISI.contains(str) && getInputSizeshNQ4ISI.contains(str2)) {
            return true;
        }
        return getHighSpeedVideoFpsRangesFor.contains(str) && getHighSpeedVideoFpsRangesFor.contains(str2);
    }

    public static org.bouncycastle.asn1.ASN1ObjectIdentifier getOID(java.lang.String str) {
        return (org.bouncycastle.asn1.ASN1ObjectIdentifier) getHighSpeedVideoFpsRanges.get(str);
    }

    public static org.bouncycastle.crypto.Digest getDigest(java.lang.String str) {
        java.lang.String upperCase = org.bouncycastle.util.Strings.toUpperCase(str);
        if (Camera2StreamConfigurationMap.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA1();
        }
        if (getHighSpeedVideoFpsRangesFor.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createMD5();
        }
        if (getHighSpeedVideoSizes.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA224();
        }
        if (getHighResolutionOutputSizeshNQ4ISI.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA256();
        }
        if (getInputFormats.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA384();
        }
        if (getOutputStallDurationlomOqCM.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA512();
        }
        if (getOutputStallDuration.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA512_224();
        }
        if (getOutputSizeshNQ4ISI.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA512_256();
        }
        if (getHighSpeedVideoSizesFor.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA3_224();
        }
        if (getOutputMinFrameDuration.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA3_256();
        }
        if (getOutputFormats.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA3_384();
        }
        if (getInputSizeshNQ4ISI.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA3_512();
        }
        if (getOutputSizes.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHAKE128();
        }
        if (getOutputMinFrameDurationlomOqCM.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHAKE256();
        }
        return null;
    }

    static {
        getHighSpeedVideoFpsRangesFor.add("MD5");
        getHighSpeedVideoFpsRangesFor.add(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5.getId());
        Camera2StreamConfigurationMap.add("SHA1");
        Camera2StreamConfigurationMap.add("SHA-1");
        Camera2StreamConfigurationMap.add(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1.getId());
        getHighSpeedVideoSizes.add("SHA224");
        getHighSpeedVideoSizes.add("SHA-224");
        getHighSpeedVideoSizes.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224.getId());
        getHighResolutionOutputSizeshNQ4ISI.add("SHA256");
        getHighResolutionOutputSizeshNQ4ISI.add("SHA-256");
        getHighResolutionOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256.getId());
        getInputFormats.add("SHA384");
        getInputFormats.add("SHA-384");
        getInputFormats.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384.getId());
        getOutputStallDurationlomOqCM.add("SHA512");
        getOutputStallDurationlomOqCM.add("SHA-512");
        getOutputStallDurationlomOqCM.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512.getId());
        getOutputStallDuration.add("SHA512(224)");
        getOutputStallDuration.add("SHA-512(224)");
        getOutputStallDuration.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_224.getId());
        getOutputSizeshNQ4ISI.add("SHA512(256)");
        getOutputSizeshNQ4ISI.add("SHA-512(256)");
        getOutputSizeshNQ4ISI.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256.getId());
        getHighSpeedVideoSizesFor.add("SHA3-224");
        getHighSpeedVideoSizesFor.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_224.getId());
        getOutputMinFrameDuration.add("SHA3-256");
        getOutputMinFrameDuration.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256.getId());
        getOutputFormats.add("SHA3-384");
        getOutputFormats.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_384.getId());
        getInputSizeshNQ4ISI.add("SHA3-512");
        getInputSizeshNQ4ISI.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512.getId());
        getOutputSizes.add("SHAKE128");
        getOutputSizes.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128.getId());
        getOutputMinFrameDurationlomOqCM.add("SHAKE256");
        getOutputMinFrameDurationlomOqCM.add(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256.getId());
        getHighSpeedVideoFpsRanges.put("MD5", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5);
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5.getId(), org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.md5);
        getHighSpeedVideoFpsRanges.put("SHA1", org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
        getHighSpeedVideoFpsRanges.put("SHA-1", org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1.getId(), org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
        getHighSpeedVideoFpsRanges.put("SHA224", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224);
        getHighSpeedVideoFpsRanges.put("SHA-224", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224);
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224.getId(), org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224);
        getHighSpeedVideoFpsRanges.put("SHA256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        getHighSpeedVideoFpsRanges.put("SHA-256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256.getId(), org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        getHighSpeedVideoFpsRanges.put("SHA384", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384);
        getHighSpeedVideoFpsRanges.put("SHA-384", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384);
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384.getId(), org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384);
        getHighSpeedVideoFpsRanges.put("SHA512", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512);
        getHighSpeedVideoFpsRanges.put("SHA-512", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512);
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512.getId(), org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512);
        getHighSpeedVideoFpsRanges.put("SHA512(224)", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_224);
        getHighSpeedVideoFpsRanges.put("SHA-512(224)", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_224);
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_224.getId(), org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_224);
        getHighSpeedVideoFpsRanges.put("SHA512(256)", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256);
        getHighSpeedVideoFpsRanges.put("SHA-512(256)", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256);
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256.getId(), org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256);
        getHighSpeedVideoFpsRanges.put("SHA3-224", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_224);
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_224.getId(), org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_224);
        getHighSpeedVideoFpsRanges.put("SHA3-256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256);
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256.getId(), org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256);
        getHighSpeedVideoFpsRanges.put("SHA3-384", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_384);
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_384.getId(), org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_384);
        getHighSpeedVideoFpsRanges.put("SHA3-512", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512);
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512.getId(), org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512);
        getHighSpeedVideoFpsRanges.put("SHAKE128", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128);
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128.getId(), org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128);
        getHighSpeedVideoFpsRanges.put("SHAKE256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256);
        getHighSpeedVideoFpsRanges.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256.getId(), org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256);
    }
}
