package com.visa.cbp;

/* loaded from: classes5.dex */
public class setEncKeyInfo {
    public static final java.lang.String ConfirmReplenishRequest = "_";
    private static final java.lang.String getHighSpeedVideoFpsRanges = "com.visa.cbp.setEncKeyInfo";
    public static final java.lang.String valueOf = "VTS_SDK";

    public static void ConfirmReplenishRequest(java.lang.String str) {
    }

    public static void values(com.visa.cbp.sdk.facade.error.CbpError cbpError) {
        if (cbpError != null) {
            cbpError.getErrorCode();
            cbpError.getErrorMessage();
            cbpError.getReasonCode();
            cbpError.getCorrelationId();
        }
    }

    public static boolean values(android.content.Context context) {
        return android.provider.Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    public static java.lang.String ReplenishAckRequest(android.content.Context context) {
        java.lang.String string = android.provider.Settings.Secure.getString(context.getContentResolver(), a.b.l);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(java.util.UUID.randomUUID().toString());
        sb.append("_");
        sb.append(string);
        sb.append("_VTS_SDK");
        return sb.toString();
    }

    public static boolean BuildConfig(java.util.List list) {
        return (list == null || list.isEmpty() || list.size() <= 0) ? false : true;
    }

    public static boolean ConfirmReplenishRequest(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
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

    public static int ReplenishAckRequest(byte[] bArr) {
        return new java.math.BigInteger(bArr).intValue();
    }

    public static byte[] values(int i) {
        return java.math.BigInteger.valueOf(i).toByteArray();
    }
}
