package com.ironsource;

/* renamed from: com.ironsource.be, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2975be implements com.ironsource.Db {

    /* renamed from: a, reason: collision with root package name */
    private final com.unity3d.ironsourceads.rewarded.RewardedAdRequest f6162a;
    private final com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener b;
    private final com.ironsource.InterfaceC3052g1 c;
    private final com.ironsource.InterfaceC3248r1 d;

    public C2975be(com.unity3d.ironsourceads.rewarded.RewardedAdRequest adRequest, com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener publisherListener, com.ironsource.InterfaceC3052g1 adapterConfigProvider, com.ironsource.InterfaceC3248r1 analyticsFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.f6162a = adRequest;
        this.b = publisherListener;
        this.c = adapterConfigProvider;
        this.d = analyticsFactory;
    }

    @Override // com.ironsource.Db
    public com.ironsource.Ab a() throws java.lang.Exception {
        com.ironsource.mediationsdk.logger.IronSourceError d;
        java.lang.String instanceId = this.f6162a.getInstanceId();
        java.lang.String sDKVersion = com.ironsource.sdk.utils.SDKUtils.getSDKVersion();
        com.ironsource.mediationsdk.IronSource.a aVar = com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        com.ironsource.InterfaceC3266s1 a2 = this.d.a(new com.ironsource.C3159m1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            com.ironsource.Bb a3 = new com.ironsource.Cb(this.f6162a.getAdm(), this.f6162a.getProviderName$mediationsdk_release(), this.c, com.ironsource.C3099ic.e.a().c().get()).a();
            new com.ironsource.Zd(a3).a();
            com.ironsource.C3313uc c3313uc = new com.ironsource.C3313uc();
            com.ironsource.C3196o2 c3196o2 = new com.ironsource.C3196o2(this.f6162a.getAdm(), this.f6162a.getProviderName$mediationsdk_release());
            com.unity3d.ironsourceads.rewarded.RewardedAdRequest rewardedAdRequest = this.f6162a;
            kotlin.jvm.internal.Intrinsics.checkNotNull(a3);
            com.ironsource.Q7 q7 = com.ironsource.Q7.f5934a;
            return new com.ironsource.Yd(rewardedAdRequest, a3, new com.ironsource.C2957ae(q7, this.b), c3196o2, c3313uc, a2, new com.ironsource.Td(a2, q7.d()), null, null, 384, null);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            if (e instanceof com.ironsource.C3261re) {
                d = ((com.ironsource.C3261re) e).a();
            } else {
                com.ironsource.C3306u5 c3306u5 = com.ironsource.C3306u5.f6757a;
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                d = c3306u5.d(message);
            }
            return new com.ironsource.C3342w5(this.f6162a, new com.ironsource.C2957ae(com.ironsource.Q7.f5934a, this.b), a2, d);
        }
    }

    public /* synthetic */ C2975be(com.unity3d.ironsourceads.rewarded.RewardedAdRequest rewardedAdRequest, com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener rewardedAdLoaderListener, com.ironsource.InterfaceC3052g1 interfaceC3052g1, com.ironsource.InterfaceC3248r1 interfaceC3248r1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(rewardedAdRequest, rewardedAdLoaderListener, interfaceC3052g1, (i & 8) != 0 ? new com.ironsource.C3231q1(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO) : interfaceC3248r1);
    }
}
