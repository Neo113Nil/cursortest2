package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4831q {
    public static final int e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Integer f11061a;
    public final C4826l b;
    public final C4824j c;
    public final C4830p d;

    public C4831q(Integer num, C4826l c4826l, C4824j c4824j, C4830p c4830p) {
        this.f11061a = num;
        this.b = c4826l;
        this.c = c4824j;
        this.d = c4830p;
    }

    public final Integer a() {
        return this.f11061a;
    }

    public final C4826l b() {
        return this.b;
    }

    public final C4824j c() {
        return this.c;
    }

    public final C4830p d() {
        return this.d;
    }

    public final Integer e() {
        return this.f11061a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4831q)) {
            return false;
        }
        C4831q c4831q = (C4831q) obj;
        return Intrinsics.areEqual(this.f11061a, c4831q.f11061a) && Intrinsics.areEqual(this.b, c4831q.b) && Intrinsics.areEqual(this.c, c4831q.c) && Intrinsics.areEqual(this.d, c4831q.d);
    }

    public final C4824j f() {
        return this.c;
    }

    public final C4826l g() {
        return this.b;
    }

    public final C4830p h() {
        return this.d;
    }

    public int hashCode() {
        Integer num = this.f11061a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        C4826l c4826l = this.b;
        int hashCode2 = (hashCode + (c4826l == null ? 0 : c4826l.hashCode())) * 31;
        C4824j c4824j = this.c;
        int hashCode3 = (hashCode2 + (c4824j == null ? 0 : c4824j.hashCode())) * 31;
        C4830p c4830p = this.d;
        return hashCode3 + (c4830p != null ? c4830p.hashCode() : 0);
    }

    public String toString() {
        return "DECRenderingData(appNameFontSize=" + this.f11061a + ", decCTA=" + this.b + ", decAppIcon=" + this.c + ", decRating=" + this.d + ')';
    }

    public final C4831q a(Integer num, C4826l c4826l, C4824j c4824j, C4830p c4830p) {
        return new C4831q(num, c4826l, c4824j, c4830p);
    }

    public static /* synthetic */ C4831q a(C4831q c4831q, Integer num, C4826l c4826l, C4824j c4824j, C4830p c4830p, int i, Object obj) {
        if ((i & 1) != 0) {
            num = c4831q.f11061a;
        }
        if ((i & 2) != 0) {
            c4826l = c4831q.b;
        }
        if ((i & 4) != 0) {
            c4824j = c4831q.c;
        }
        if ((i & 8) != 0) {
            c4830p = c4831q.d;
        }
        return c4831q.a(num, c4826l, c4824j, c4830p);
    }
}
