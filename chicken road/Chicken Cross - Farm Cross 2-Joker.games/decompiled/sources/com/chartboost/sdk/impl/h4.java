package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4788a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Float f;
    public final Float g;
    public final fa h;
    public final Boolean i;

    public h4(String location, String adId, String to, String cgn, String creative, Float f, Float f2, fa impressionMediaType, Boolean bool) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(cgn, "cgn");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(impressionMediaType, "impressionMediaType");
        this.f4788a = location;
        this.b = adId;
        this.c = to;
        this.d = cgn;
        this.e = creative;
        this.f = f;
        this.g = f2;
        this.h = impressionMediaType;
        this.i = bool;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final fa d() {
        return this.h;
    }

    public final String e() {
        return this.f4788a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        return Intrinsics.areEqual(this.f4788a, h4Var.f4788a) && Intrinsics.areEqual(this.b, h4Var.b) && Intrinsics.areEqual(this.c, h4Var.c) && Intrinsics.areEqual(this.d, h4Var.d) && Intrinsics.areEqual(this.e, h4Var.e) && Intrinsics.areEqual((Object) this.f, (Object) h4Var.f) && Intrinsics.areEqual((Object) this.g, (Object) h4Var.g) && this.h == h4Var.h && Intrinsics.areEqual(this.i, h4Var.i);
    }

    public final Boolean f() {
        return this.i;
    }

    public final String g() {
        return this.c;
    }

    public final Float h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f4788a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        Float f = this.f;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.g;
        int hashCode3 = (((hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31) + this.h.hashCode()) * 31;
        Boolean bool = this.i;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final Float i() {
        return this.f;
    }

    public String toString() {
        return "ClickParams(location=" + this.f4788a + ", adId=" + this.b + ", to=" + this.c + ", cgn=" + this.d + ", creative=" + this.e + ", videoPosition=" + this.f + ", videoDuration=" + this.g + ", impressionMediaType=" + this.h + ", retargetReinstall=" + this.i + ")";
    }
}
