package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public class vh {
    private static final byte[] pcc = pcc("VP8X");

    private static byte[] pcc(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    public static boolean pcc(byte[] bArr, int i) {
        try {
            boolean pcc2 = pcc(bArr, i + 12, pcc);
            int i2 = i + 20;
            if (bArr.length <= i2) {
                return false;
            }
            return pcc2 && ((bArr[i2] & 2) == 2);
        } catch (Throwable th) {
            new Object[]{th};
            return false;
        }
    }

    private static boolean pcc(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
