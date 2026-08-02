package com.google.android.gms.internal.ads;

import android.graphics.Color;

/* renamed from: com.google.android.gms.internal.ads.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0962f2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13418a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13419b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f13420c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f13421d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13422e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13423g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13424h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final int f13425j;

    public C0962f2(String str, int i, Integer num, Integer num2, float f, boolean z3, boolean z5, boolean z6, boolean z7, int i5) {
        this.f13418a = str;
        this.f13419b = i;
        this.f13420c = num;
        this.f13421d = num2;
        this.f13422e = f;
        this.f = z3;
        this.f13423g = z5;
        this.f13424h = z6;
        this.i = z7;
        this.f13425j = i5;
    }

    public static Integer a(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC1668us.S(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC1400ot.t(((parseLong >> 24) & 255) ^ 255), AbstractC1400ot.t(parseLong & 255), AbstractC1400ot.t((parseLong >> 8) & 255), AbstractC1400ot.t((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e3) {
            JB.n("SsaStyle", "Failed to parse color expression: '" + str + "'", e3);
            return null;
        }
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e3) {
            JB.n("SsaStyle", "Failed to parse boolean value: '" + str + "'", e3);
            return false;
        }
    }
}
