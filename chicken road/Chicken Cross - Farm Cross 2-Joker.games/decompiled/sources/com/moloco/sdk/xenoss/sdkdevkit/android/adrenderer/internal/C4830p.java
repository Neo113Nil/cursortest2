package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4830p {
    public static final int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Float f11060a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public C4830p(Float f2, String foregroundColor, String backgroundColor, int i, int i2) {
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.f11060a = f2;
        this.b = foregroundColor;
        this.c = backgroundColor;
        this.d = i;
        this.e = i2;
    }

    public final Float a() {
        return this.f11060a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4830p)) {
            return false;
        }
        C4830p c4830p = (C4830p) obj;
        return Intrinsics.areEqual((Object) this.f11060a, (Object) c4830p.f11060a) && Intrinsics.areEqual(this.b, c4830p.b) && Intrinsics.areEqual(this.c, c4830p.c) && this.d == c4830p.d && this.e == c4830p.e;
    }

    public final String f() {
        return this.c;
    }

    public final int g() {
        return this.e;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        Float f2 = this.f11060a;
        return ((((((((f2 == null ? 0 : f2.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.e);
    }

    public final int i() {
        return this.d;
    }

    public final Float j() {
        return this.f11060a;
    }

    public String toString() {
        return "DECRating(value=" + this.f11060a + ", foregroundColor=" + this.b + ", backgroundColor=" + this.c + ", size=" + this.d + ", fontSize=" + this.e + ')';
    }

    public final C4830p a(Float f2, String foregroundColor, String backgroundColor, int i, int i2) {
        Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new C4830p(f2, foregroundColor, backgroundColor, i, i2);
    }

    public static /* synthetic */ C4830p a(C4830p c4830p, Float f2, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f2 = c4830p.f11060a;
        }
        if ((i3 & 2) != 0) {
            str = c4830p.b;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            str2 = c4830p.c;
        }
        String str4 = str2;
        if ((i3 & 8) != 0) {
            i = c4830p.d;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = c4830p.e;
        }
        return c4830p.a(f2, str3, str4, i4, i2);
    }
}
