package com.visa.cbp.sdk.facade.util;

/* loaded from: classes5.dex */
public class Utils {
    private static final long MILLIS_IN_SECONDS = 1000;
    private static final java.lang.String TAG = "Utils";
    private static java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.US);
    private static java.security.SecureRandom secureRandom = new java.security.SecureRandom();

    static {
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
    }

    public static void enforceNotNull(java.util.Objects objects) {
        if (objects == null) {
            throw new java.lang.NullPointerException("Value can not be null");
        }
    }

    public static void closeCursor(android.database.Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static boolean validateCursor(android.database.Cursor cursor) {
        if (cursor == null || cursor.getCount() <= 0) {
            return false;
        }
        cursor.moveToFirst();
        return true;
    }

    public static java.lang.String getUtcTimestamp() {
        return simpleDateFormat.format(new java.util.Date());
    }

    private static byte[] getSalt() throws java.security.NoSuchAlgorithmException {
        byte[] bArr = new byte[16];
        java.security.SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        return bArr;
    }

    public static java.lang.String listToCsvString(java.util.List<java.lang.String> list) {
        if (list == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str = "";
        for (java.lang.String str2 : list) {
            sb.append(str);
            sb.append(str2);
            str = ",";
        }
        return sb.toString();
    }

    public static java.util.List<java.lang.String> csvStringToList(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return java.util.Arrays.asList(str.split("\\s*,\\s*"));
    }

    public static long getCurrentTimeInSeconds() {
        return java.lang.System.currentTimeMillis() / 1000;
    }

    public static long getSecureRandomLong() {
        return secureRandom.nextLong();
    }

    public static int getSecureRandomInt() {
        return secureRandom.nextInt();
    }

    public static java.lang.String getSecureRandomString() {
        return new java.math.BigInteger(130, secureRandom).toString(32);
    }

    public static byte[] fillByteArrayWithRandomBytes(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        secureRandom.nextBytes(bArr2);
        return bArr2;
    }

    public static byte[] hexToByteArray(java.lang.String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((java.lang.Character.digit(str.charAt(i), 16) << 4) | java.lang.Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static boolean isHexString(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return (!(str instanceof java.lang.String) || str.matches("[0-9A-Fa-f]+")) && str.length() % 2 == 0;
    }
}
