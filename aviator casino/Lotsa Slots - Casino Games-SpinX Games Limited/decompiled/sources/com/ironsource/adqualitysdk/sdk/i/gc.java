package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public abstract class gc extends com.ironsource.adqualitysdk.sdk.i.gb {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2178 = -9019254268343255734L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2179 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2180;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final byte f2181;

    public gc(byte b) {
        this.f2181 = b;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    protected final void m7788(java.lang.StringBuilder sb) {
        int i = 2 % 2;
        int i2 = f2179 + 29;
        f2180 = i2 % 128;
        int i3 = i2 % 2;
        m7786(sb, this.f2181);
        if (i3 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    protected final void m7789(java.lang.StringBuilder sb) {
        int i = 2 % 2;
        int i2 = f2179 + 1;
        f2180 = i2 % 128;
        int i3 = i2 % 2;
        m7786(sb, this.f2181 - 1);
        int i4 = f2180 + 77;
        f2179 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static void m7786(java.lang.StringBuilder sb, int i) {
        int i2 = 2 % 2;
        int i3 = f2180 + 121;
        int i4 = i3 % 128;
        f2179 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 79;
        f2180 = i6 % 128;
        int i7 = i6 % 2;
        for (int i8 = 0; i8 < i; i8++) {
            sb.append(m7787("絪ၕ", 27967 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)).intern());
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static java.lang.String m7787(java.lang.String str, int i) {
        java.lang.String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.i.f2464) {
            com.ironsource.adqualitysdk.sdk.i.i.f2465 = i;
            char[] cArr3 = new char[cArr2.length];
            com.ironsource.adqualitysdk.sdk.i.i.f2463 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.i.f2463 < cArr2.length) {
                cArr3[com.ironsource.adqualitysdk.sdk.i.i.f2463] = (char) ((cArr2[com.ironsource.adqualitysdk.sdk.i.i.f2463] ^ (com.ironsource.adqualitysdk.sdk.i.i.f2463 * com.ironsource.adqualitysdk.sdk.i.i.f2465)) ^ f2178);
                com.ironsource.adqualitysdk.sdk.i.i.f2463++;
            }
            str2 = new java.lang.String(cArr3);
        }
        return str2;
    }
}
