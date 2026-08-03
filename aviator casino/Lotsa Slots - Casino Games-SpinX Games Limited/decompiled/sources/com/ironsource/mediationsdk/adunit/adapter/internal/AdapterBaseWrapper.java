package com.ironsource.mediationsdk.adunit.adapter.internal;

/* loaded from: classes5.dex */
public class AdapterBaseWrapper {
    com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface;
    com.ironsource.mediationsdk.model.NetworkSettings settings;

    public AdapterBaseWrapper(com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface, com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        this.adapterBaseInterface = adapterBaseInterface;
        this.settings = networkSettings;
    }

    public com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface getAdapterBaseInterface() {
        return this.adapterBaseInterface;
    }

    public com.ironsource.mediationsdk.model.NetworkSettings getSettings() {
        return this.settings;
    }
}
