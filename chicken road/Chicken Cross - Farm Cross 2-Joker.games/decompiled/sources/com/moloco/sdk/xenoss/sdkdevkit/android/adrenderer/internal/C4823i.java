package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4823i {
    public static final int j = 8;

    /* renamed from: a, reason: collision with root package name */
    public final String f10985a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final C4826l g;
    public final C4824j h;
    public final C4830p i;

    public C4823i(String str, String str2, String str3, String str4, String str5, Integer num, C4826l c4826l, C4824j c4824j, C4830p c4830p) {
        this.f10985a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = num;
        this.g = c4826l;
        this.h = c4824j;
        this.i = c4830p;
    }

    public final String a() {
        return this.f10985a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4823i)) {
            return false;
        }
        C4823i c4823i = (C4823i) obj;
        return Intrinsics.areEqual(this.f10985a, c4823i.f10985a) && Intrinsics.areEqual(this.b, c4823i.b) && Intrinsics.areEqual(this.c, c4823i.c) && Intrinsics.areEqual(this.d, c4823i.d) && Intrinsics.areEqual(this.e, c4823i.e) && Intrinsics.areEqual(this.f, c4823i.f) && Intrinsics.areEqual(this.g, c4823i.g) && Intrinsics.areEqual(this.h, c4823i.h) && Intrinsics.areEqual(this.i, c4823i.i);
    }

    public final Integer f() {
        return this.f;
    }

    public final C4826l g() {
        return this.g;
    }

    public final C4824j h() {
        return this.h;
    }

    public int hashCode() {
        String str = this.f10985a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        C4826l c4826l = this.g;
        int hashCode7 = (hashCode6 + (c4826l == null ? 0 : c4826l.hashCode())) * 31;
        C4824j c4824j = this.h;
        int hashCode8 = (hashCode7 + (c4824j == null ? 0 : c4824j.hashCode())) * 31;
        C4830p c4830p = this.i;
        return hashCode8 + (c4830p != null ? c4830p.hashCode() : 0);
    }

    public final C4830p i() {
        return this.i;
    }

    public final String j() {
        return this.f10985a;
    }

    public final Integer k() {
        return this.f;
    }

    public final String l() {
        return this.c;
    }

    public final String m() {
        return this.b;
    }

    public final C4824j n() {
        return this.h;
    }

    public final C4826l o() {
        return this.g;
    }

    public final C4830p p() {
        return this.i;
    }

    public final String q() {
        return this.d;
    }

    public final String r() {
        return this.e;
    }

    public String toString() {
        return "DEC(appName=" + this.f10985a + ", ctaUrl=" + this.b + ", ctaTrackingUrl=" + this.c + ", impressionTrackingUrl=" + this.d + ", skipToDECTrackingUrl=" + this.e + ", appNameFontSize=" + this.f + ", decCta=" + this.g + ", decAppIcon=" + this.h + ", decRating=" + this.i + ')';
    }

    public final C4823i a(String str, String str2, String str3, String str4, String str5, Integer num, C4826l c4826l, C4824j c4824j, C4830p c4830p) {
        return new C4823i(str, str2, str3, str4, str5, num, c4826l, c4824j, c4830p);
    }
}
