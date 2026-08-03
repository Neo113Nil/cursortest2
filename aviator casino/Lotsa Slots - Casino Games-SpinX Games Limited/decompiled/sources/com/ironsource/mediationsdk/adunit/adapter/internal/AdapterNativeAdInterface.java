package com.ironsource.mediationsdk.adunit.adapter.internal;

/* loaded from: classes5.dex */
public interface AdapterNativeAdInterface<Listener extends com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> {
    void destroyAd(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData);

    void loadAd(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData, android.content.Context context, Listener listener);
}
