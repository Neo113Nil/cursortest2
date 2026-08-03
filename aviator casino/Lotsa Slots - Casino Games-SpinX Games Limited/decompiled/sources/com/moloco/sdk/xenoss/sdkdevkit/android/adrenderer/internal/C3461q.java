package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3461q {
    public static final int e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f7535a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j c;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p d;

    public C3461q(java.lang.Integer num, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l c3456l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j c3454j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p c3460p) {
        this.f7535a = num;
        this.b = c3456l;
        this.c = c3454j;
        this.d = c3460p;
    }

    public final java.lang.Integer a() {
        return this.f7535a;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l b() {
        return this.b;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j c() {
        return this.c;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p d() {
        return this.d;
    }

    public final java.lang.Integer e() {
        return this.f7535a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3461q)) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3461q c3461q = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3461q) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7535a, c3461q.f7535a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3461q.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c3461q.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c3461q.d);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j f() {
        return this.c;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l g() {
        return this.b;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p h() {
        return this.d;
    }

    public int hashCode() {
        java.lang.Integer num = this.f7535a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l c3456l = this.b;
        int hashCode2 = (hashCode + (c3456l == null ? 0 : c3456l.hashCode())) * 31;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j c3454j = this.c;
        int hashCode3 = (hashCode2 + (c3454j == null ? 0 : c3454j.hashCode())) * 31;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p c3460p = this.d;
        return hashCode3 + (c3460p != null ? c3460p.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "DECRenderingData(appNameFontSize=" + this.f7535a + ", decCTA=" + this.b + ", decAppIcon=" + this.c + ", decRating=" + this.d + ')';
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3461q a(java.lang.Integer num, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l c3456l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j c3454j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p c3460p) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3461q(num, c3456l, c3454j, c3460p);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3461q a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3461q c3461q, java.lang.Integer num, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3456l c3456l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j c3454j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3460p c3460p, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = c3461q.f7535a;
        }
        if ((i & 2) != 0) {
            c3456l = c3461q.b;
        }
        if ((i & 4) != 0) {
            c3454j = c3461q.c;
        }
        if ((i & 8) != 0) {
            c3460p = c3461q.d;
        }
        return c3461q.a(num, c3456l, c3454j, c3460p);
    }
}
