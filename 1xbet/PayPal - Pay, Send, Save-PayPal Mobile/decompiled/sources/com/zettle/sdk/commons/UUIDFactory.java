package com.zettle.sdk.commons;

/* loaded from: classes16.dex */
public final class UUIDFactory {
    private UUIDFactory() {
    }

    public static java.lang.String createUUID1AsString() {
        return toBase64String(com.zettle.sdk.commons.UUIDFactory.UUID1Generator.getHighSpeedVideoFpsRangesFor());
    }

    public static java.util.UUID createUUID1() {
        return com.zettle.sdk.commons.UUIDFactory.UUID1Generator.getHighSpeedVideoFpsRangesFor();
    }

    public static byte[] uuidToByteArray(java.lang.String str) {
        if (str.length() == 22) {
            return com.zettle.sdk.commons.Base64.b64StringToByteArr(str);
        }
        return str.getBytes();
    }

    public static java.lang.String toBase64String(java.util.UUID uuid) {
        return com.zettle.sdk.commons.Base64.byteArrToB64String(toByteArray(uuid)).split("=")[0];
    }

    public static byte[] toByteArray(java.util.UUID uuid) {
        if (uuid == null) {
            throw new java.lang.IllegalArgumentException("uuid cannot be null");
        }
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        byte[] bArr = new byte[16];
        java.lang.System.arraycopy(getHighSpeedVideoFpsRanges(mostSignificantBits), 0, bArr, 0, 8);
        java.lang.System.arraycopy(getHighSpeedVideoFpsRanges(leastSignificantBits), 0, bArr, 8, 8);
        return bArr;
    }

    public static java.util.UUID parse(java.lang.String str) {
        if (str == null || str.trim().length() == 0) {
            throw new java.lang.IllegalArgumentException("Cannot parse a UUID from an empty string");
        }
        if (str.length() != 22) {
            return java.util.UUID.fromString(str);
        }
        if (str == null || str.length() != 22) {
            throw new java.lang.IllegalArgumentException("Argument b64 string must be defined and have a length of exactly 22");
        }
        return fromByteArray(com.zettle.sdk.commons.Base64.b64StringToByteArr(str));
    }

    public static java.util.UUID fromByteArray(byte[] bArr) {
        if (bArr == null || bArr.length != 16) {
            throw new java.lang.IllegalArgumentException("Argument byte array must be defined and have a length of exactly 16");
        }
        return new java.util.UUID(getHighSpeedVideoFpsRanges(java.util.Arrays.copyOfRange(bArr, 0, 8)), getHighSpeedVideoFpsRanges(java.util.Arrays.copyOfRange(bArr, 8, 16)));
    }

    private static long getHighSpeedVideoFpsRanges(byte[] bArr) {
        if (bArr == null || bArr.length != 8) {
            throw new java.lang.IllegalArgumentException("Argument byte array must be defined and have a length of exactly 8");
        }
        long j = 0;
        for (int i = 0; i < 8; i++) {
            j += (bArr[i] & 255) << ((7 - i) * 8);
        }
        return j;
    }

    private static byte[] getHighSpeedVideoFpsRanges(long j) {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) (j >>> ((7 - i) * 8));
        }
        return bArr;
    }

    static class UUID1Generator {
        private UUID1Generator() {
        }

        public static java.util.UUID getHighSpeedVideoFpsRangesFor() {
            int currentTimeMillis = (int) (((java.lang.System.currentTimeMillis() * 10000) + 122192928000000000L) >>> 32);
            return new java.util.UUID((((int) r0) << 32) | ((((((currentTimeMillis << 16) | (currentTimeMillis >>> 16)) & (-61441)) | 4096) << 32) >>> 32), java.util.UUID.randomUUID().getLeastSignificantBits());
        }
    }

    public static java.util.Date getDateFromUUID1(java.util.UUID uuid) {
        return new java.util.Date((uuid.timestamp() - 122192928000000000L) / 10000);
    }
}
