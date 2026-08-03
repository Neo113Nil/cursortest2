package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3456l {
    public static final int h = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f7462a;
    public final java.lang.String b;
    public final java.lang.Integer c;
    public final java.lang.Integer d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k e;
    public final java.lang.String f;
    public final java.lang.String g;

    public C3456l(java.lang.Integer num, java.lang.String str, java.lang.Integer num2, java.lang.Integer num3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k c3455k, java.lang.String str2, java.lang.String str3) {
        this.f7462a = num;
        this.b = str;
        this.c = num2;
        this.d = num3;
        this.e = c3455k;
        this.f = str2;
        this.g = str3;
    }

    public final java.lang.Integer a() {
        return this.f7462a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.Integer c() {
        return this.c;
    }

    public final java.lang.Integer d() {
        return this.d;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l)) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l c3456l = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7462a, c3456l.f7462a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3456l.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c3456l.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c3456l.d) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, c3456l.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, c3456l.f) && kotlin.jvm.internal.Intrinsics.areEqual(this.g, c3456l.g);
    }

    public final java.lang.String f() {
        return this.f;
    }

    public final java.lang.String g() {
        return this.g;
    }

    public final java.lang.String h() {
        return this.g;
    }

    public int hashCode() {
        java.lang.Integer num = this.f7462a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k c3455k = this.e;
        int hashCode5 = (hashCode4 + (c3455k == null ? 0 : c3455k.hashCode())) * 31;
        java.lang.String str2 = this.f;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.g;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k i() {
        return this.e;
    }

    public final java.lang.Integer j() {
        return this.c;
    }

    public final java.lang.String k() {
        return this.b;
    }

    public final java.lang.Integer l() {
        return this.d;
    }

    public final java.lang.String m() {
        return this.f;
    }

    public final java.lang.Integer n() {
        return this.f7462a;
    }

    public java.lang.String toString() {
        return "DECCta(verticalSpacing=" + this.f7462a + ", ctaText=" + this.b + ", buttonWidth=" + this.c + ", fontSize=" + this.d + ", border=" + this.e + ", foregroundColor=" + this.f + ", backgroundColor=" + this.g + ')';
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l a(java.lang.Integer num, java.lang.String str, java.lang.Integer num2, java.lang.Integer num3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k c3455k, java.lang.String str2, java.lang.String str3) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l(num, str, num2, num3, c3455k, str2, str3);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l c3456l, java.lang.Integer num, java.lang.String str, java.lang.Integer num2, java.lang.Integer num3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k c3455k, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = c3456l.f7462a;
        }
        if ((i & 2) != 0) {
            str = c3456l.b;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            num2 = c3456l.c;
        }
        java.lang.Integer num4 = num2;
        if ((i & 8) != 0) {
            num3 = c3456l.d;
        }
        java.lang.Integer num5 = num3;
        if ((i & 16) != 0) {
            c3455k = c3456l.e;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k c3455k2 = c3455k;
        if ((i & 32) != 0) {
            str2 = c3456l.f;
        }
        java.lang.String str5 = str2;
        if ((i & 64) != 0) {
            str3 = c3456l.g;
        }
        return c3456l.a(num, str4, num4, num5, c3455k2, str5, str3);
    }
}
