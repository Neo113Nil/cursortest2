package com.ironsource.mediationsdk.adunit.adapter.internal;

/* loaded from: classes5.dex */
public interface AdapterAdFullScreenInterface<Listener extends com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener> {
    void destroyAd(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData);

    boolean isAdAvailable(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData);

    void loadAd(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData, android.content.Context context, Listener listener);

    void showAd(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData, android.app.Activity activity, Listener listener);
}
