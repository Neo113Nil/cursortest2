package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;

/* renamed from: com.google.android.gms.internal.ads.h5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1055h5 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f13710a = "0123456789abcdef".toCharArray();

    public static long a(double d5, DisplayMetrics displayMetrics) {
        return Math.round(d5 / displayMetrics.density);
    }

    public static byte[] b(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(str.charAt(i + 1), 16) + (Character.digit(str.charAt(i), 16) << 4));
        }
        return bArr;
    }
}
