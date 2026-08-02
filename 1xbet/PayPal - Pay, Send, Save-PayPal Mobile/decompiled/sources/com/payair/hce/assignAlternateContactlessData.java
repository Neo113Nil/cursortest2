package com.payair.hce;

/* loaded from: classes10.dex */
public final class assignAlternateContactlessData {
    public static void DigitizedCardProfile(byte[] bArr, byte b, long j) {
        for (int i = 0; i < bArr.length; i++) {
            if (((1 << i) & j) != 0) {
                bArr[i] = (byte) (bArr[i] ^ b);
            }
        }
    }
}
