package com.payair.hce;

/* loaded from: classes4.dex */
public final class AlternateContactlessPaymentDataJson {
    public static void writeReplace(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }
}
