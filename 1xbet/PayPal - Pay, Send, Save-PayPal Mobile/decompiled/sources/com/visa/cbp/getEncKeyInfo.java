package com.visa.cbp;

/* loaded from: classes5.dex */
public class getEncKeyInfo {
    private static final java.lang.String getHighSpeedVideoFpsRanges = "An error has occured while encrypting the given password. Due to the following reason: ";
    private static final long getHighSpeedVideoFpsRangesFor = 1000;
    private static final java.lang.String getHighSpeedVideoSizes = "getEncKeyInfo";
    private static java.text.SimpleDateFormat getHighResolutionOutputSizeshNQ4ISI = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.US);
    private static java.security.SecureRandom Camera2StreamConfigurationMap = new java.security.SecureRandom();

    static {
        getHighResolutionOutputSizeshNQ4ISI.setTimeZone(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
    }

    public static void valueOf(java.util.Objects objects) {
        if (objects == null) {
            throw new java.lang.NullPointerException("Value can not be null");
        }
    }

    public static void valueOf(android.database.Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static boolean ConfirmReplenishRequest(android.database.Cursor cursor) {
        if (cursor == null || cursor.getCount() <= 0) {
            return false;
        }
        cursor.moveToFirst();
        return true;
    }

    public static java.lang.String ConfirmReplenishRequest() {
        return getHighResolutionOutputSizeshNQ4ISI.format(new java.util.Date());
    }

    private static java.lang.String Camera2StreamConfigurationMap() throws java.security.NoSuchAlgorithmException {
        byte[] bArr = new byte[16];
        java.security.SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        return bArr.toString();
    }

    public static java.lang.String ReplenishAckRequest(java.util.List<java.lang.String> list) {
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

    public static java.util.List<java.lang.String> valueOf(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return java.util.Arrays.asList(str.split("\\s*,\\s*"));
    }

    public static void values(android.content.Context context, com.visa.cbp.setWidth setwidth) {
        com.visa.cbp.DigitalTicket.BuildConfig(context, setwidth).valueOf();
    }

    public static long BuildConfig() {
        return java.lang.System.currentTimeMillis() / 1000;
    }

    public static long values() {
        return Camera2StreamConfigurationMap.nextLong();
    }

    public static int ReplenishAckRequest() {
        return Camera2StreamConfigurationMap.nextInt();
    }

    public static java.lang.String valueOf() {
        return new java.math.BigInteger(130, Camera2StreamConfigurationMap).toString(32);
    }

    public static byte[] valueOf(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        Camera2StreamConfigurationMap.nextBytes(bArr2);
        return bArr2;
    }

    public static byte[] values(java.lang.String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((java.lang.Character.digit(str.charAt(i), 16) << 4) | java.lang.Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static long values(int i, int i2) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(2, i);
        calendar.set(1, i2);
        calendar.set(5, 0);
        calendar.set(11, calendar.getMinimum(11));
        calendar.set(12, calendar.getMinimum(12));
        calendar.set(13, calendar.getMinimum(13));
        calendar.set(14, calendar.getMinimum(14));
        return calendar.getTimeInMillis() + 86399999;
    }
}
