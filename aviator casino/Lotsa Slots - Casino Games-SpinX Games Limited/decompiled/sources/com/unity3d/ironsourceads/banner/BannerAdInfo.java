package com.unity3d.ironsourceads.banner;

/* loaded from: classes5.dex */
public final class BannerAdInfo {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f8011a;
    private final java.lang.String b;

    public BannerAdInfo(java.lang.String instanceId, java.lang.String adId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        this.f8011a = instanceId;
        this.b = adId;
    }

    public static /* synthetic */ com.unity3d.ironsourceads.banner.BannerAdInfo copy$default(com.unity3d.ironsourceads.banner.BannerAdInfo bannerAdInfo, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bannerAdInfo.f8011a;
        }
        if ((i & 2) != 0) {
            str2 = bannerAdInfo.b;
        }
        return bannerAdInfo.copy(str, str2);
    }

    public final java.lang.String component1() {
        return this.f8011a;
    }

    public final java.lang.String component2() {
        return this.b;
    }

    public final com.unity3d.ironsourceads.banner.BannerAdInfo copy(java.lang.String instanceId, java.lang.String adId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adId, "adId");
        return new com.unity3d.ironsourceads.banner.BannerAdInfo(instanceId, adId);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.unity3d.ironsourceads.banner.BannerAdInfo)) {
            return false;
        }
        com.unity3d.ironsourceads.banner.BannerAdInfo bannerAdInfo = (com.unity3d.ironsourceads.banner.BannerAdInfo) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f8011a, bannerAdInfo.f8011a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, bannerAdInfo.b);
    }

    public final java.lang.String getAdId() {
        return this.b;
    }

    public final java.lang.String getInstanceId() {
        return this.f8011a;
    }

    public int hashCode() {
        return (this.f8011a.hashCode() * 31) + this.b.hashCode();
    }

    public java.lang.String toString() {
        return "[instanceId: '" + this.f8011a + "', adId: '" + this.b + "']";
    }
}
