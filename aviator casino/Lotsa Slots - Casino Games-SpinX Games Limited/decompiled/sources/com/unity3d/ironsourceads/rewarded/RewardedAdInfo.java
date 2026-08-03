package com.unity3d.ironsourceads.rewarded;

/* loaded from: classes5.dex */
public final class RewardedAdInfo {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f8029a;
    private final java.lang.String b;

    public RewardedAdInfo(java.lang.String instanceId, java.lang.String adId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        this.f8029a = instanceId;
        this.b = adId;
    }

    public final java.lang.String getAdId() {
        return this.b;
    }

    public final java.lang.String getInstanceId() {
        return this.f8029a;
    }

    public java.lang.String toString() {
        return "[instanceId: '" + this.f8029a + "', adId: '" + this.b + "']";
    }
}
