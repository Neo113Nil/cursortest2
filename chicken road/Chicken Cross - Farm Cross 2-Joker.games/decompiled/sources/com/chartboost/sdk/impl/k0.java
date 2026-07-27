package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c0;
import com.chartboost.sdk.internal.Model.EndpointConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f4832a = new k0();

    public final Pair a(p1 appRequest, hb params, Function2 loadOpenRTBAd, Function2 loadAdGet, Function2 loadNrpAd, c0 adType, boolean z, EndpointConfig nrpWaterfallEndpoints) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadOpenRTBAd, "loadOpenRTBAd");
        Intrinsics.checkNotNullParameter(loadAdGet, "loadAdGet");
        Intrinsics.checkNotNullParameter(loadNrpAd, "loadNrpAd");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(nrpWaterfallEndpoints, "nrpWaterfallEndpoints");
        return appRequest.c() != null ? new Pair(loadOpenRTBAd, params) : a(adType, z, nrpWaterfallEndpoints) ? new Pair(loadNrpAd, params) : new Pair(loadAdGet, params);
    }

    public final boolean a(c0 c0Var, boolean z, EndpointConfig endpointConfig) {
        String rewarded;
        if (!z) {
            return false;
        }
        if (Intrinsics.areEqual(c0Var, c0.a.g)) {
            rewarded = endpointConfig.getBanner();
        } else if (Intrinsics.areEqual(c0Var, c0.b.g)) {
            rewarded = endpointConfig.getInterstitial();
        } else {
            if (!Intrinsics.areEqual(c0Var, c0.c.g)) {
                throw new NoWhenBranchMatchedException();
            }
            rewarded = endpointConfig.getRewarded();
        }
        return rewarded.length() > 0;
    }
}
