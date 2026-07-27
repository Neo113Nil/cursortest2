package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.Gf;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.c;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;

/* loaded from: classes6.dex */
public abstract class BaseAdAdapter<NetworkAdapter extends AdapterBaseInterface, Listener> {
    private final LevelPlay.AdFormat mAdFormat;
    protected final UUID mAdUnitObjectId;
    protected final NetworkSettings mNetworkSettings;

    public BaseAdAdapter(LevelPlay.AdFormat adFormat, NetworkSettings networkSettings) {
        this(adFormat, networkSettings, null);
    }

    public NetworkAdapter getNetworkAdapter() {
        NetworkAdapter networkadapter = (NetworkAdapter) c.d().b(this.mNetworkSettings, Gf.b(this.mAdFormat), this.mAdUnitObjectId);
        if (networkadapter != null) {
            return networkadapter;
        }
        return null;
    }

    protected NetworkSettings getNetworkSettings() {
        return this.mNetworkSettings;
    }

    public BaseAdAdapter(LevelPlay.AdFormat adFormat, NetworkSettings networkSettings, UUID uuid) {
        this.mAdFormat = adFormat;
        this.mNetworkSettings = networkSettings;
        this.mAdUnitObjectId = uuid;
    }
}
