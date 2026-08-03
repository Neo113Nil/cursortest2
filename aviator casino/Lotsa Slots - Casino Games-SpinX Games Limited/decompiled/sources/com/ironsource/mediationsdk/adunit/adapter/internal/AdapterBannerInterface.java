package com.ironsource.mediationsdk.adunit.adapter.internal;

/* loaded from: classes5.dex */
public interface AdapterBannerInterface<Listener extends com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> {
    void destroyAd(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData);

    void loadAd(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData, android.app.Activity activity, com.ironsource.mediationsdk.ISBannerSize iSBannerSize, Listener listener);
}
