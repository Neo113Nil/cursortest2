package com.payair.hce;

/* loaded from: classes4.dex */
public final class DigitizedCardProfile {
    public static void AlternateContactlessPaymentDataJson(char[] cArr, char[] cArr2, int i) {
        char c = cArr[i % 4];
        char c2 = cArr2[(i + 2) % 4];
        int i2 = (i + 3) % 4;
        cArr2[i2] = (char) (((cArr[i2] * 32718) + c2) / 65535);
        cArr[i2] = (char) (((c * 32718) + c2) % 65535);
    }
}
