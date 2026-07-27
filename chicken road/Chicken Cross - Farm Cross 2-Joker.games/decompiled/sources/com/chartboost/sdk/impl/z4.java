package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5097a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final Float f;
    public final Float g;

    public z4(String location, String adId, String cgn, int i, String rewardCurrency, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(cgn, "cgn");
        Intrinsics.checkNotNullParameter(rewardCurrency, "rewardCurrency");
        this.f5097a = location;
        this.b = adId;
        this.c = cgn;
        this.d = i;
        this.e = rewardCurrency;
        this.f = f;
        this.g = f2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.f5097a;
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final Float f() {
        return this.g;
    }

    public final Float g() {
        return this.f;
    }
}
