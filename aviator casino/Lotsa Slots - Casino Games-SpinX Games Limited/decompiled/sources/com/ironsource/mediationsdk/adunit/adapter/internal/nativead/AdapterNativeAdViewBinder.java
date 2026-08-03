package com.ironsource.mediationsdk.adunit.adapter.internal.nativead;

/* loaded from: classes5.dex */
public abstract class AdapterNativeAdViewBinder implements com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinderInterface {
    private final com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder nativeAdViewHolder = new com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder();

    public final com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder getNativeAdViewHolder() {
        return this.nativeAdViewHolder;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(android.view.View view) {
        this.nativeAdViewHolder.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(android.view.View view) {
        this.nativeAdViewHolder.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(android.view.View view) {
        this.nativeAdViewHolder.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(android.view.View view) {
        this.nativeAdViewHolder.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView levelPlayMediaView) {
        this.nativeAdViewHolder.setMediaView(levelPlayMediaView);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(android.view.View view) {
        this.nativeAdViewHolder.setTitleView(view);
    }
}
