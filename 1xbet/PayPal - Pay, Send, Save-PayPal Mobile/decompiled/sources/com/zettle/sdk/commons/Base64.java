package com.zettle.sdk.commons;

/* loaded from: classes16.dex */
public class Base64 {
    static final char[] getHighResolutionOutputSizeshNQ4ISI = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
    static final int[] Camera2StreamConfigurationMap = new int[com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE];

    static {
        int i = 0;
        while (true) {
            char[] cArr = getHighResolutionOutputSizeshNQ4ISI;
            if (i >= cArr.length) {
                return;
            }
            Camera2StreamConfigurationMap[cArr[i]] = i;
            i++;
        }
    }

    private Base64() {
    }

    public static java.lang.String byteArrToB64String(byte[] bArr) {
        int i;
        int i2;
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[(int) java.lang.Math.ceil((bArr.length * 4) / 3.0f)];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < bArr.length) {
            byte b = bArr[i3];
            if (i4 == 0) {
                i = (b & 252) >> 2;
            } else if (i4 == 2) {
                i = b & 63;
            } else if (i4 == 4) {
                i = (b & com.google.common.base.Ascii.SI) << 2;
                int i6 = i3 + 1;
                if (i6 < bArr.length) {
                    i2 = (bArr[i6] & com.visa.cbp.getEncExpo.startTransaction) >> 6;
                    i |= i2;
                }
            } else if (i4 != 6) {
                i = 0;
            } else {
                i = (b & 3) << 4;
                int i7 = i3 + 1;
                if (i7 < bArr.length) {
                    i2 = (bArr[i7] & com.visa.cbp.getEncExpo.onUnminimized) >> 4;
                    i |= i2;
                }
            }
            if (i4 != 0) {
                i3++;
            }
            i4 = (i4 + 6) % 8;
            cArr[i5] = getHighResolutionOutputSizeshNQ4ISI[i];
            i5++;
        }
        return new java.lang.String(cArr);
    }

    public static byte[] b64StringToByteArr(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return new byte[0];
        }
        int length = str.length();
        while (str.charAt(length - 1) == '=') {
            length--;
        }
        byte[] bArr = new byte[(length * 3) / 4];
        int i = 0;
        char c = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 >= length) {
                return bArr;
            }
            int[] iArr = Camera2StreamConfigurationMap;
            int i4 = iArr[str.charAt(i)];
            int i5 = iArr[str.charAt(i3)];
            if (c == 0) {
                bArr[i2] = (byte) ((i4 << 2) | (i5 >> 4));
                i2++;
                i = i3;
                c = 2;
            } else if (c == 2) {
                bArr[i2] = (byte) ((i4 << 4) | (i5 >> 2));
                i2++;
                c = 4;
                i = i3;
            } else if (c == 4) {
                bArr[i2] = (byte) ((i4 << 6) | i5);
                i += 2;
                i2++;
                c = 0;
            }
        }
    }
}
