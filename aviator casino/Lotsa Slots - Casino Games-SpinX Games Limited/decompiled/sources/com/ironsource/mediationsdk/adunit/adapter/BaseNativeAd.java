package com.ironsource.mediationsdk.adunit.adapter;

/* loaded from: classes5.dex */
public abstract class BaseNativeAd<NetworkAdapter extends com.ironsource.mediationsdk.adunit.adapter.BaseAdapter> extends com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<NetworkAdapter, com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener> implements com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener> {
    public BaseNativeAd(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        super(com.unity3d.mediation.LevelPlay.AdFormat.NATIVE_AD, networkSettings);
    }

    public com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties getNativeAdProperties(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData) {
        return new com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties(com.ironsource.C3079ha.a(adData.getConfiguration()));
    }
}
