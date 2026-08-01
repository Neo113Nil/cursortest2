package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;

/* loaded from: classes6.dex */
public final class Ob {

    /* renamed from: a, reason: collision with root package name */
    private AdapterNativeAdViewBinder f7839a;
    private AdapterNativeAdData b;

    public final void a(AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.f7839a = adapterNativeAdViewBinder;
    }

    public final AdapterNativeAdViewBinder b() {
        return this.f7839a;
    }

    public final AdapterNativeAdData a() {
        return this.b;
    }

    public final void a(AdapterNativeAdData adapterNativeAdData) {
        this.b = adapterNativeAdData;
    }
}
