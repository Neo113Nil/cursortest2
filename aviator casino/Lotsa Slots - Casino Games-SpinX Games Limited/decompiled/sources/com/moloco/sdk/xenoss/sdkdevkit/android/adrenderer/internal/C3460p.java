package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3460p {
    public static final int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Float f7534a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;
    public final int e;

    public C3460p(java.lang.Float f2, java.lang.String foregroundColor, java.lang.String backgroundColor, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.f7534a = f2;
        this.b = foregroundColor;
        this.c = backgroundColor;
        this.d = i;
        this.e = i2;
    }

    public final java.lang.Float a() {
        return this.f7534a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final java.lang.String c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p)) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p c3460p = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.f7534a, (java.lang.Object) c3460p.f7534a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3460p.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c3460p.c) && this.d == c3460p.d && this.e == c3460p.e;
    }

    public final java.lang.String f() {
        return this.c;
    }

    public final int g() {
        return this.e;
    }

    public final java.lang.String h() {
        return this.b;
    }

    public int hashCode() {
        java.lang.Float f2 = this.f7534a;
        return ((((((((f2 == null ? 0 : f2.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e;
    }

    public final int i() {
        return this.d;
    }

    public final java.lang.Float j() {
        return this.f7534a;
    }

    public java.lang.String toString() {
        return "DECRating(value=" + this.f7534a + ", foregroundColor=" + this.b + ", backgroundColor=" + this.c + ", size=" + this.d + ", fontSize=" + this.e + ')';
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p a(java.lang.Float f2, java.lang.String foregroundColor, java.lang.String backgroundColor, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p(f2, foregroundColor, backgroundColor, i, i2);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p c3460p, java.lang.Float f2, java.lang.String str, java.lang.String str2, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            f2 = c3460p.f7534a;
        }
        if ((i3 & 2) != 0) {
            str = c3460p.b;
        }
        java.lang.String str3 = str;
        if ((i3 & 4) != 0) {
            str2 = c3460p.c;
        }
        java.lang.String str4 = str2;
        if ((i3 & 8) != 0) {
            i = c3460p.d;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = c3460p.e;
        }
        return c3460p.a(f2, str3, str4, i4, i2);
    }
}
