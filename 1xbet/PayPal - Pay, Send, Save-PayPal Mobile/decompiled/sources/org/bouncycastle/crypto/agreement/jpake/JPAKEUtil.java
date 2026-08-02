package org.bouncycastle.crypto.agreement.jpake;

/* loaded from: classes17.dex */
public class JPAKEUtil {
    static final java.math.BigInteger getHighSpeedVideoFpsRanges = java.math.BigInteger.valueOf(0);
    static final java.math.BigInteger getHighSpeedVideoSizes = java.math.BigInteger.valueOf(1);

    private static java.math.BigInteger getHighSpeedVideoFpsRanges(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.lang.String str, org.bouncycastle.crypto.Digest digest) {
        digest.reset();
        getHighResolutionOutputSizeshNQ4ISI(digest, bigInteger);
        getHighResolutionOutputSizeshNQ4ISI(digest, bigInteger2);
        getHighResolutionOutputSizeshNQ4ISI(digest, bigInteger3);
        byte[] uTF8ByteArray = org.bouncycastle.util.Strings.toUTF8ByteArray(str);
        digest.update(getHighSpeedVideoSizes(uTF8ByteArray.length), 0, 4);
        digest.update(uTF8ByteArray, 0, uTF8ByteArray.length);
        org.bouncycastle.util.Arrays.fill(uTF8ByteArray, (byte) 0);
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return new java.math.BigInteger(bArr);
    }

    public static java.math.BigInteger calculateMacTag(java.lang.String str, java.lang.String str2, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, java.math.BigInteger bigInteger5, org.bouncycastle.crypto.Digest digest) {
        digest.reset();
        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger5);
        digest.update(asUnsignedByteArray, 0, asUnsignedByteArray.length);
        org.bouncycastle.util.Arrays.fill(asUnsignedByteArray, (byte) 0);
        byte[] uTF8ByteArray = org.bouncycastle.util.Strings.toUTF8ByteArray("JPAKE_KC");
        digest.update(uTF8ByteArray, 0, uTF8ByteArray.length);
        org.bouncycastle.util.Arrays.fill(uTF8ByteArray, (byte) 0);
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        org.bouncycastle.crypto.macs.HMac hMac = new org.bouncycastle.crypto.macs.HMac(digest);
        byte[] bArr2 = new byte[hMac.getMacSize()];
        hMac.init(new org.bouncycastle.crypto.params.KeyParameter(bArr));
        byte[] uTF8ByteArray2 = org.bouncycastle.util.Strings.toUTF8ByteArray("KC_1_U");
        hMac.update(uTF8ByteArray2, 0, uTF8ByteArray2.length);
        org.bouncycastle.util.Arrays.fill(uTF8ByteArray2, (byte) 0);
        byte[] uTF8ByteArray3 = org.bouncycastle.util.Strings.toUTF8ByteArray(str);
        hMac.update(uTF8ByteArray3, 0, uTF8ByteArray3.length);
        org.bouncycastle.util.Arrays.fill(uTF8ByteArray3, (byte) 0);
        byte[] uTF8ByteArray4 = org.bouncycastle.util.Strings.toUTF8ByteArray(str2);
        hMac.update(uTF8ByteArray4, 0, uTF8ByteArray4.length);
        org.bouncycastle.util.Arrays.fill(uTF8ByteArray4, (byte) 0);
        byte[] asUnsignedByteArray2 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger);
        hMac.update(asUnsignedByteArray2, 0, asUnsignedByteArray2.length);
        org.bouncycastle.util.Arrays.fill(asUnsignedByteArray2, (byte) 0);
        byte[] asUnsignedByteArray3 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger2);
        hMac.update(asUnsignedByteArray3, 0, asUnsignedByteArray3.length);
        org.bouncycastle.util.Arrays.fill(asUnsignedByteArray3, (byte) 0);
        byte[] asUnsignedByteArray4 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger3);
        hMac.update(asUnsignedByteArray4, 0, asUnsignedByteArray4.length);
        org.bouncycastle.util.Arrays.fill(asUnsignedByteArray4, (byte) 0);
        byte[] asUnsignedByteArray5 = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger4);
        hMac.update(asUnsignedByteArray5, 0, asUnsignedByteArray5.length);
        org.bouncycastle.util.Arrays.fill(asUnsignedByteArray5, (byte) 0);
        hMac.doFinal(bArr2, 0);
        org.bouncycastle.util.Arrays.fill(bArr, (byte) 0);
        return new java.math.BigInteger(bArr2);
    }

    public static void validateZeroKnowledgeProof(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, java.math.BigInteger[] bigIntegerArr, java.lang.String str, org.bouncycastle.crypto.Digest digest) throws org.bouncycastle.crypto.CryptoException {
        java.math.BigInteger bigInteger5 = bigIntegerArr[0];
        java.math.BigInteger bigInteger6 = bigIntegerArr[1];
        java.math.BigInteger highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bigInteger3, bigInteger5, bigInteger4, str, digest);
        if (bigInteger4.compareTo(getHighSpeedVideoFpsRanges) != 1 || bigInteger4.compareTo(bigInteger) != -1 || bigInteger4.modPow(bigInteger2, bigInteger).compareTo(getHighSpeedVideoSizes) != 0 || bigInteger3.modPow(bigInteger6, bigInteger).multiply(bigInteger4.modPow(highSpeedVideoFpsRanges, bigInteger)).mod(bigInteger).compareTo(bigInteger5) != 0) {
            throw new org.bouncycastle.crypto.CryptoException("Zero-knowledge proof validation failed");
        }
    }

    public static void validateParticipantIdsEqual(java.lang.String str, java.lang.String str2) throws org.bouncycastle.crypto.CryptoException {
        if (str.equals(str2)) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Received payload from incorrect partner (");
        sb.append(str2);
        sb.append("). Expected to receive payload from ");
        sb.append(str);
        sb.append(".");
        throw new org.bouncycastle.crypto.CryptoException(sb.toString());
    }

    public static void validateParticipantIdsDiffer(java.lang.String str, java.lang.String str2) throws org.bouncycastle.crypto.CryptoException {
        if (str.equals(str2)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Both participants are using the same participantId (");
            sb.append(str);
            sb.append("). This is not allowed. Each participant must use a unique participantId.");
            throw new org.bouncycastle.crypto.CryptoException(sb.toString());
        }
    }

    public static void validateNotNull(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" must not be null");
        throw new java.lang.NullPointerException(sb.toString());
    }

    public static void validateMacTag(java.lang.String str, java.lang.String str2, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, java.math.BigInteger bigInteger5, org.bouncycastle.crypto.Digest digest, java.math.BigInteger bigInteger6) throws org.bouncycastle.crypto.CryptoException {
        if (!calculateMacTag(str2, str, bigInteger3, bigInteger4, bigInteger, bigInteger2, bigInteger5, digest).equals(bigInteger6)) {
            throw new org.bouncycastle.crypto.CryptoException("Partner MacTag validation failed. Therefore, the password, MAC, or digest algorithm of each participant does not match.");
        }
    }

    public static void validateGx4(java.math.BigInteger bigInteger) throws org.bouncycastle.crypto.CryptoException {
        if (bigInteger.equals(getHighSpeedVideoSizes)) {
            throw new org.bouncycastle.crypto.CryptoException("g^x validation failed.  g^x should not be 1.");
        }
    }

    public static void validateGa(java.math.BigInteger bigInteger) throws org.bouncycastle.crypto.CryptoException {
        if (bigInteger.equals(getHighSpeedVideoSizes)) {
            throw new org.bouncycastle.crypto.CryptoException("ga is equal to 1.  It should not be.  The chances of this happening are on the order of 2^160 for a 160-bit q.  Try again.");
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.crypto.Digest digest, java.math.BigInteger bigInteger) {
        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger);
        digest.update(getHighSpeedVideoSizes(asUnsignedByteArray.length), 0, 4);
        digest.update(asUnsignedByteArray, 0, asUnsignedByteArray.length);
        org.bouncycastle.util.Arrays.fill(asUnsignedByteArray, (byte) 0);
    }

    private static byte[] getHighSpeedVideoSizes(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) (i >>> 16), (byte) (i >>> 8), (byte) i};
    }

    public static java.math.BigInteger generateX2(java.math.BigInteger bigInteger, java.security.SecureRandom secureRandom) {
        java.math.BigInteger bigInteger2 = getHighSpeedVideoSizes;
        return org.bouncycastle.util.BigIntegers.createRandomInRange(bigInteger2, bigInteger.subtract(bigInteger2), secureRandom);
    }

    public static java.math.BigInteger generateX1(java.math.BigInteger bigInteger, java.security.SecureRandom secureRandom) {
        return org.bouncycastle.util.BigIntegers.createRandomInRange(getHighSpeedVideoFpsRanges, bigInteger.subtract(getHighSpeedVideoSizes), secureRandom);
    }

    public static java.math.BigInteger[] calculateZeroKnowledgeProof(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, java.math.BigInteger bigInteger5, java.lang.String str, org.bouncycastle.crypto.Digest digest, java.security.SecureRandom secureRandom) {
        java.math.BigInteger createRandomInRange = org.bouncycastle.util.BigIntegers.createRandomInRange(getHighSpeedVideoFpsRanges, bigInteger2.subtract(getHighSpeedVideoSizes), secureRandom);
        java.math.BigInteger modPow = bigInteger3.modPow(createRandomInRange, bigInteger);
        return new java.math.BigInteger[]{modPow, createRandomInRange.subtract(bigInteger5.multiply(getHighSpeedVideoFpsRanges(bigInteger3, modPow, bigInteger4, str, digest))).mod(bigInteger2)};
    }

    public static java.math.BigInteger calculateX2s(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
        return bigInteger2.multiply(bigInteger3).mod(bigInteger);
    }

    public static java.math.BigInteger calculateS(char[] cArr) {
        return new java.math.BigInteger(org.bouncycastle.util.Strings.toUTF8ByteArray(cArr));
    }

    public static java.math.BigInteger calculateKeyingMaterial(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4, java.math.BigInteger bigInteger5, java.math.BigInteger bigInteger6) {
        return bigInteger3.modPow(bigInteger4.multiply(bigInteger5).negate().mod(bigInteger2), bigInteger).multiply(bigInteger6).modPow(bigInteger4, bigInteger);
    }

    public static java.math.BigInteger calculateGx(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
        return bigInteger2.modPow(bigInteger3, bigInteger);
    }

    public static java.math.BigInteger calculateGA(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4) {
        return bigInteger2.multiply(bigInteger3).multiply(bigInteger4).mod(bigInteger);
    }

    public static java.math.BigInteger calculateA(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, java.math.BigInteger bigInteger4) {
        return bigInteger3.modPow(bigInteger4, bigInteger);
    }
}
