package com.ironsource.mediationsdk.adunit.adapter.internal;

/* loaded from: classes5.dex */
public abstract class BaseAdAdapter<NetworkAdapter extends com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, Listener> {
    private final com.unity3d.mediation.LevelPlay.AdFormat mAdFormat;
    protected final java.util.UUID mAdUnitObjectId;
    protected final com.ironsource.mediationsdk.model.NetworkSettings mNetworkSettings;

    public BaseAdAdapter(com.unity3d.mediation.LevelPlay.AdFormat adFormat, com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        this(adFormat, networkSettings, null);
    }

    public NetworkAdapter getNetworkAdapter() {
        NetworkAdapter networkadapter = (NetworkAdapter) com.ironsource.mediationsdk.c.b().b(this.mNetworkSettings, com.ironsource.Ff.b(this.mAdFormat), this.mAdUnitObjectId);
        if (networkadapter != null) {
            return networkadapter;
        }
        return null;
    }

    protected com.ironsource.mediationsdk.model.NetworkSettings getNetworkSettings() {
        return this.mNetworkSettings;
    }

    public BaseAdAdapter(com.unity3d.mediation.LevelPlay.AdFormat adFormat, com.ironsource.mediationsdk.model.NetworkSettings networkSettings, java.util.UUID uuid) {
        this.mAdFormat = adFormat;
        this.mNetworkSettings = networkSettings;
        this.mAdUnitObjectId = uuid;
    }
}
