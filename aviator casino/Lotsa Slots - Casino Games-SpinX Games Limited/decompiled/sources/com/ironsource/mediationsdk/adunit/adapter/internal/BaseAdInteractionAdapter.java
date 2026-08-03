package com.ironsource.mediationsdk.adunit.adapter.internal;

/* loaded from: classes5.dex */
public abstract class BaseAdInteractionAdapter<NetworkAdapter extends com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, Listener extends com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener> extends com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter<NetworkAdapter, Listener> implements com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<Listener> {
    public BaseAdInteractionAdapter(com.unity3d.mediation.LevelPlay.AdFormat adFormat, com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        super(adFormat, networkSettings);
    }
}
