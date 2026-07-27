package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f4739a;
    public final int b;
    public final int c;

    public e0(ViewGroup bannerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        this.f4739a = bannerView;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.c;
    }

    public final ViewGroup b() {
        return this.f4739a;
    }

    public final int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.areEqual(this.f4739a, e0Var.f4739a) && this.b == e0Var.b && this.c == e0Var.c;
    }

    public int hashCode() {
        return (((this.f4739a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        return "AdUnitBannerData(bannerView=" + this.f4739a + ", bannerWidth=" + this.b + ", bannerHeight=" + this.c + ")";
    }
}
