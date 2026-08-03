package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3454j {
    public static final int d = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f7460a;
    public final java.lang.String b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k c;

    public C3454j(java.lang.Integer num, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k c3455k) {
        this.f7460a = num;
        this.b = str;
        this.c = c3455k;
    }

    public final java.lang.Integer a() {
        return this.f7460a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k c() {
        return this.c;
    }

    public final java.lang.String d() {
        return this.b;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k e() {
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j)) {
            return false;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j c3454j = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7460a, c3454j.f7460a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3454j.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c3454j.c);
    }

    public final java.lang.Integer f() {
        return this.f7460a;
    }

    public int hashCode() {
        java.lang.Integer num = this.f7460a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k c3455k = this.c;
        return hashCode2 + (c3455k != null ? c3455k.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "DECAppIcon(size=" + this.f7460a + ", appIconUri=" + this.b + ", border=" + this.c + ')';
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j a(java.lang.Integer num, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k c3455k) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j(num, str, c3455k);
    }

    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3454j c3454j, java.lang.Integer num, java.lang.String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3455k c3455k, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = c3454j.f7460a;
        }
        if ((i & 2) != 0) {
            str = c3454j.b;
        }
        if ((i & 4) != 0) {
            c3455k = c3454j.c;
        }
        return c3454j.a(num, str, c3455k);
    }
}
