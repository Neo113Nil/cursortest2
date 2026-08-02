package com.google.android.gms.common.util;

/* loaded from: classes4.dex */
public class Hex {
    private static final char[] zza = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] zzb = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'e', 'f'};

    public static java.lang.String bytesToStringLowercase(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            char[] cArr2 = zzb;
            cArr[i] = cArr2[(b & 255) >>> 4];
            cArr[i + 1] = cArr2[b & com.google.common.base.Ascii.SI];
            i += 2;
        }
        return new java.lang.String(cArr);
    }

    public static java.lang.String bytesToStringUppercase(byte[] bArr) {
        return bytesToStringUppercase(bArr, false);
    }

    public static byte[] stringToBytes(java.lang.String str) throws java.lang.IllegalArgumentException {
        int length = str.length();
        if ((length & 1) != 0) {
            throw new java.lang.IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length >> 1];
        int i = 0;
        while (i < length) {
            int i2 = i + 2;
            bArr[i / 2] = (byte) java.lang.Integer.parseInt(str.substring(i, i2), 16);
            i = i2;
        }
        return bArr;
    }

    public static java.lang.String bytesToStringUppercase(byte[] bArr, boolean z) {
        int length = bArr.length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + length);
        for (int i = 0; i < length && (!z || i != length - 1 || (bArr[i] & 255) != 0); i++) {
            char[] cArr = zza;
            sb.append(cArr[(bArr[i] & com.visa.cbp.getEncExpo.onUnminimized) >>> 4]);
            sb.append(cArr[bArr[i] & com.google.common.base.Ascii.SI]);
        }
        return sb.toString();
    }
}
