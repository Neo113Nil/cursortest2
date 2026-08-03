package com.ironsource.adapters.ironsource.nativeAd;

/* loaded from: classes5.dex */
public final class IronSourceNativeAdData extends com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData {
    private final java.lang.String advertiser;
    private final java.lang.String body;
    private final java.lang.String callToAction;
    private final com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface.Image icon;
    private final java.lang.String title;

    public IronSourceNativeAdData(com.ironsource.C8 nativeAdData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdData, "nativeAdData");
        this.title = nativeAdData.n();
        this.advertiser = nativeAdData.h();
        this.body = nativeAdData.i();
        this.callToAction = nativeAdData.j();
        this.icon = new com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface.Image(nativeAdData.k(), null);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public java.lang.String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public java.lang.String getBody() {
        return this.body;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public java.lang.String getCallToAction() {
        return this.callToAction;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface.Image getIcon() {
        return this.icon;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface
    public java.lang.String getTitle() {
        return this.title;
    }
}
