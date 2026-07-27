package com.unity3d.ironsourceads.interstitial;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InterstitialAdInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f11667a;
    private final String b;

    public InterstitialAdInfo(String instanceId, String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f11667a = instanceId;
        this.b = adId;
    }

    public final String getAdId() {
        return this.b;
    }

    public final String getInstanceId() {
        return this.f11667a;
    }

    public String toString() {
        return "[instanceId: '" + this.f11667a + "', adId: '" + this.b + "']";
    }
}
