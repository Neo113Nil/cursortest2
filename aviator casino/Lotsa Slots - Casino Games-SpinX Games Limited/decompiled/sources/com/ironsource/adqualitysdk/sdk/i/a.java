package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static int f93;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static int f94;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static int f95;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final java.lang.Object f96 = new java.lang.Object();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m5770(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static int m5771(int i) {
        com.ironsource.adqualitysdk.sdk.i.b bVar = com.ironsource.adqualitysdk.sdk.i.b.f664;
        return ((bVar.f666[0][i >>> 24] + bVar.f666[1][(i >>> 16) & 255]) ^ bVar.f666[2][(i >>> 8) & 255]) + bVar.f666[3][i & 255];
    }
}
