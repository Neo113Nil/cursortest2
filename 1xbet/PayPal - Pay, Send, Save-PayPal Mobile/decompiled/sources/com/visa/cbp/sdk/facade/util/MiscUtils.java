package com.visa.cbp.sdk.facade.util;

/* loaded from: classes5.dex */
public class MiscUtils {
    public static final java.lang.String CORRELATION_ID_DELIMITER = "_";
    public static final java.lang.String CORRELATION_ID_SDK_INDICATOR = "VTS_SDK";
    private static final java.lang.String TAG = "com.visa.cbp.sdk.facade.util.MiscUtils";

    public static void ignoringMethodForFlow2(java.lang.String str) {
    }

    public static void logError(com.visa.cbp.sdk.facade.error.CbpError cbpError) {
        if (cbpError != null) {
            cbpError.getErrorCode();
            cbpError.getErrorMessage();
            cbpError.getReasonCode();
            cbpError.getCorrelationId();
        }
    }

    public static boolean isOnAirplaneMode(android.content.Context context) {
        return android.provider.Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    public static java.lang.String generateRequestCorrelationId(android.content.Context context) {
        java.lang.String string = android.provider.Settings.Secure.getString(context.getContentResolver(), a.b.l);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.util.UUID.randomUUID().toString());
        sb.append("_");
        sb.append(string);
        sb.append("_VTS_SDK");
        return sb.toString();
    }

    public static boolean isNotEmptyList(java.util.List list) {
        return (list == null || list.isEmpty() || list.size() <= 0) ? false : true;
    }

    public static boolean arrayCompare(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (bArr == null) {
            return true;
        }
        if (bArr2 == null) {
            return false;
        }
        int i4 = i;
        while (i4 < i + i3) {
            if (bArr2[i2] != bArr[i4]) {
                return false;
            }
            i4++;
            i2++;
        }
        return true;
    }

    public static int byteArrayToInt(byte[] bArr) {
        return new java.math.BigInteger(bArr).intValue();
    }

    public static byte[] longToByteArray(long j) {
        return java.math.BigInteger.valueOf(j).toByteArray();
    }

    public static java.lang.String byteArrayToHex(byte[] bArr) {
        return new java.lang.String(com.visa.cbp.external.common.Hex.encode(bArr));
    }

    public static byte[] hexToByteArray(java.lang.String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((java.lang.Character.digit(str.charAt(i), 16) << 4) | java.lang.Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static final short setShort(byte[] bArr, short s, short s2) {
        bArr[s] = (byte) (s2 >> 8);
        bArr[s + 1] = (byte) s2;
        return (short) (s + 2);
    }

    public static java.lang.String asciiToHex(java.lang.String str) {
        char[] charArray = str.toCharArray();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (char c : charArray) {
            stringBuffer.append(java.lang.Integer.toHexString(c));
        }
        return stringBuffer.toString();
    }
}
