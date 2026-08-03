package com.unity3d.ironsourceads.interstitial;

/* loaded from: classes5.dex */
public final class InterstitialAdInfo {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f8024a;
    private final java.lang.String b;

    public InterstitialAdInfo(java.lang.String instanceId, java.lang.String adId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        this.f8024a = instanceId;
        this.b = adId;
    }

    public final java.lang.String getAdId() {
        return this.b;
    }

    public final java.lang.String getInstanceId() {
        return this.f8024a;
    }

    public java.lang.String toString() {
        return "[instanceId: '" + this.f8024a + "', adId: '" + this.b + "']";
    }
}
