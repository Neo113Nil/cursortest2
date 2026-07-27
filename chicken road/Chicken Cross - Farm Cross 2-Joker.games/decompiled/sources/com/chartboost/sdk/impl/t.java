package com.chartboost.sdk.impl;

import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.impl.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes4.dex */
public abstract class t {
    public static final c0 a(Ad ad) {
        Intrinsics.checkNotNullParameter(ad, "<this>");
        if (ad instanceof Interstitial) {
            return c0.b.g;
        }
        if (ad instanceof Rewarded) {
            return c0.c.g;
        }
        if (ad instanceof Banner) {
            return c0.a.g;
        }
        mb.b("Unknown ad type: " + Reflection.getOrCreateKotlinClass(ad.getClass()).getSimpleName() + ", defaulting to Interstitial", (Throwable) null, 2, (Object) null);
        return c0.b.g;
    }
}
