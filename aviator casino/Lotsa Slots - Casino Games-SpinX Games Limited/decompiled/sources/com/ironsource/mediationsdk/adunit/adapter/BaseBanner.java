package com.ironsource.mediationsdk.adunit.adapter;

/* loaded from: classes5.dex */
public abstract class BaseBanner<NetworkAdapter extends com.ironsource.mediationsdk.adunit.adapter.BaseAdapter> extends com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<NetworkAdapter, com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener> implements com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener> {
    public BaseBanner(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        super(com.unity3d.mediation.LevelPlay.AdFormat.BANNER, networkSettings);
    }
}
