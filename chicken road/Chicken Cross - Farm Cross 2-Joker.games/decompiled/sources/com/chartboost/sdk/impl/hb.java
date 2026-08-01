package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hb {

    /* renamed from: a, reason: collision with root package name */
    public final p1 f4791a;
    public final boolean b;
    public final Integer c;
    public final Integer d;
    public final j0 e;

    public hb(p1 appRequest, boolean z, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        this.f4791a = appRequest;
        this.b = z;
        this.c = num;
        this.d = num2;
        this.e = new j0();
    }

    public final p1 a() {
        return this.f4791a;
    }

    public final Integer b() {
        return this.c;
    }

    public final Integer c() {
        return this.d;
    }

    public final j0 d() {
        return this.e;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return Intrinsics.areEqual(this.f4791a, hbVar.f4791a) && this.b == hbVar.b && Intrinsics.areEqual(this.c, hbVar.c) && Intrinsics.areEqual(this.d, hbVar.d);
    }

    public int hashCode() {
        int hashCode = ((this.f4791a.hashCode() * 31) + Boolean.hashCode(this.b)) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "LoadParams(appRequest=" + this.f4791a + ", isCacheRequest=" + this.b + ", bannerHeight=" + this.c + ", bannerWidth=" + this.d + ")";
    }
}
