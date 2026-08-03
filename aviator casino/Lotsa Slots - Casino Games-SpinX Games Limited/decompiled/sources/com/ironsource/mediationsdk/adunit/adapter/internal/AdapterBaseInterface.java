package com.ironsource.mediationsdk.adunit.adapter.internal;

/* loaded from: classes5.dex */
public interface AdapterBaseInterface {
    java.lang.String getAdapterVersion();

    java.lang.String getNetworkSDKVersion();

    void init(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData, android.content.Context context, com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener networkInitializationListener);
}
