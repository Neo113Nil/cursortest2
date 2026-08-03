package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3453i {
    public static final int j = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7459a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.Integer f;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l g;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j h;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p i;

    public C3453i(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l c3456l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j c3454j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p c3460p) {
        this.f7459a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = num;
        this.g = c3456l;
        this.h = c3454j;
        this.i = c3460p;
    }

    public final java.lang.String a() {
        return this.f7459a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final java.lang.String d() {
        return this.d;
    }

    public final java.lang.String e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i)) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i c3453i = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7459a, c3453i.f7459a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3453i.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c3453i.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c3453i.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, c3453i.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, c3453i.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, c3453i.g) && kotlin.jvm.internal.Intrinsics.areEqual(this.h, c3453i.h) && kotlin.jvm.internal.Intrinsics.areEqual(this.i, c3453i.i);
    }

    public final java.lang.Integer f() {
        return this.f;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l g() {
        return this.g;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j h() {
        return this.h;
    }

    public int hashCode() {
        java.lang.String str = this.f7459a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.Integer num = this.f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l c3456l = this.g;
        int hashCode7 = (hashCode6 + (c3456l == null ? 0 : c3456l.hashCode())) * 31;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j c3454j = this.h;
        int hashCode8 = (hashCode7 + (c3454j == null ? 0 : c3454j.hashCode())) * 31;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p c3460p = this.i;
        return hashCode8 + (c3460p != null ? c3460p.hashCode() : 0);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p i() {
        return this.i;
    }

    public final java.lang.String j() {
        return this.f7459a;
    }

    public final java.lang.Integer k() {
        return this.f;
    }

    public final java.lang.String l() {
        return this.c;
    }

    public final java.lang.String m() {
        return this.b;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j n() {
        return this.h;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l o() {
        return this.g;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p p() {
        return this.i;
    }

    public final java.lang.String q() {
        return this.d;
    }

    public final java.lang.String r() {
        return this.e;
    }

    public java.lang.String toString() {
        return "DEC(appName=" + this.f7459a + ", ctaUrl=" + this.b + ", ctaTrackingUrl=" + this.c + ", impressionTrackingUrl=" + this.d + ", skipToDECTrackingUrl=" + this.e + ", appNameFontSize=" + this.f + ", decCta=" + this.g + ", decAppIcon=" + this.h + ", decRating=" + this.i + ')';
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l c3456l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j c3454j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p c3460p) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3453i(str, str2, str3, str4, str5, num, c3456l, c3454j, c3460p);
    }
}
