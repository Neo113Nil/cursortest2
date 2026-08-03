package com.moloco.sdk.internal.services;

/* loaded from: classes5.dex */
public final class x {
    public static final int n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7322a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final boolean d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final int g;
    public final java.lang.String h;
    public final java.lang.String i;
    public final float j;
    public final long k;
    public final java.lang.String l;
    public final java.lang.String m;

    public x(java.lang.String manufacturer, java.lang.String model, java.lang.String hwVersion, boolean z, java.lang.String os, java.lang.String osVersion, int i, java.lang.String language, java.lang.String mobileCarrier, float f, long j, java.lang.String hardware, java.lang.String brand) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "model");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hwVersion, "hwVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(os, "os");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mobileCarrier, "mobileCarrier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hardware, "hardware");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brand, "brand");
        this.f7322a = manufacturer;
        this.b = model;
        this.c = hwVersion;
        this.d = z;
        this.e = os;
        this.f = osVersion;
        this.g = i;
        this.h = language;
        this.i = mobileCarrier;
        this.j = f;
        this.k = j;
        this.l = hardware;
        this.m = brand;
    }

    public final java.lang.String a() {
        return this.f7322a;
    }

    public final float b() {
        return this.j;
    }

    public final long c() {
        return this.k;
    }

    public final java.lang.String d() {
        return this.l;
    }

    public final java.lang.String e() {
        return this.m;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.services.x)) {
            return false;
        }
        com.moloco.sdk.internal.services.x xVar = (com.moloco.sdk.internal.services.x) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7322a, xVar.f7322a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, xVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, xVar.c) && this.d == xVar.d && kotlin.jvm.internal.Intrinsics.areEqual(this.e, xVar.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, xVar.f) && this.g == xVar.g && kotlin.jvm.internal.Intrinsics.areEqual(this.h, xVar.h) && kotlin.jvm.internal.Intrinsics.areEqual(this.i, xVar.i) && java.lang.Float.compare(this.j, xVar.j) == 0 && this.k == xVar.k && kotlin.jvm.internal.Intrinsics.areEqual(this.l, xVar.l) && kotlin.jvm.internal.Intrinsics.areEqual(this.m, xVar.m);
    }

    public final java.lang.String f() {
        return this.b;
    }

    public final java.lang.String g() {
        return this.c;
    }

    public final boolean h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f7322a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + java.lang.Float.floatToIntBits(this.j)) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(this.k)) * 31) + this.l.hashCode()) * 31) + this.m.hashCode();
    }

    public final java.lang.String i() {
        return this.e;
    }

    public final java.lang.String j() {
        return this.f;
    }

    public final int k() {
        return this.g;
    }

    public final java.lang.String l() {
        return this.h;
    }

    public final java.lang.String m() {
        return this.i;
    }

    public final int n() {
        return this.g;
    }

    public final java.lang.String o() {
        return this.m;
    }

    public final long p() {
        return this.k;
    }

    public final java.lang.String q() {
        return this.l;
    }

    public final java.lang.String r() {
        return this.c;
    }

    public final java.lang.String s() {
        return this.h;
    }

    public final java.lang.String t() {
        return this.f7322a;
    }

    public java.lang.String toString() {
        return "DeviceInfo(manufacturer=" + this.f7322a + ", model=" + this.b + ", hwVersion=" + this.c + ", isTablet=" + this.d + ", os=" + this.e + ", osVersion=" + this.f + ", apiLevel=" + this.g + ", language=" + this.h + ", mobileCarrier=" + this.i + ", screenDensity=" + this.j + ", dbtMs=" + this.k + ", hardware=" + this.l + ", brand=" + this.m + ')';
    }

    public final java.lang.String u() {
        return this.i;
    }

    public final java.lang.String v() {
        return this.b;
    }

    public final java.lang.String w() {
        return this.e;
    }

    public final java.lang.String x() {
        return this.f;
    }

    public final float y() {
        return this.j;
    }

    public final boolean z() {
        return this.d;
    }

    public final com.moloco.sdk.internal.services.x a(java.lang.String manufacturer, java.lang.String model, java.lang.String hwVersion, boolean z, java.lang.String os, java.lang.String osVersion, int i, java.lang.String language, java.lang.String mobileCarrier, float f, long j, java.lang.String hardware, java.lang.String brand) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "model");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hwVersion, "hwVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(os, "os");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(language, "language");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mobileCarrier, "mobileCarrier");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hardware, "hardware");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brand, "brand");
        return new com.moloco.sdk.internal.services.x(manufacturer, model, hwVersion, z, os, osVersion, i, language, mobileCarrier, f, j, hardware, brand);
    }
}
