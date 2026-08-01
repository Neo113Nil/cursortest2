package com.unity3d.ironsourceads.rewarded;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class RewardedAdInfo {

    /* renamed from: a, reason: collision with root package name */
    private final String f11672a;
    private final String b;

    public RewardedAdInfo(String instanceId, String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f11672a = instanceId;
        this.b = adId;
    }

    public final String getAdId() {
        return this.b;
    }

    public final String getInstanceId() {
        return this.f11672a;
    }

    public String toString() {
        return "[instanceId: '" + this.f11672a + "', adId: '" + this.b + "']";
    }
}
