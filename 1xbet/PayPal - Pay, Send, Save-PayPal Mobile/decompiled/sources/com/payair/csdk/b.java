package com.payair.csdk;

/* loaded from: classes10.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f4230a = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void a(byte b, byte b2, byte b3, int i, java.lang.StringBuilder sb) {
        int i2 = ((b << 16) & 16777215) | ((b2 << 8) & 65535) | (b3 & 255);
        while (i > 0) {
            sb.append(f4230a[i2 & 63]);
            i2 >>= 6;
            i--;
        }
    }

    public static java.lang.String a(java.util.Random random) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(8);
        for (int i = 1; i <= 8; i++) {
            sb.append("./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(64)));
        }
        return sb.toString();
    }
}
