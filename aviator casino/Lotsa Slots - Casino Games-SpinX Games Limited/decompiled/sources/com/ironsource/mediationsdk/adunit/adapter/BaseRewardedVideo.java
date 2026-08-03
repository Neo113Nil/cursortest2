package com.ironsource.mediationsdk.adunit.adapter;

/* loaded from: classes5.dex */
public abstract class BaseRewardedVideo<NetworkAdapter extends com.ironsource.mediationsdk.adunit.adapter.BaseAdapter> extends com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter<NetworkAdapter, com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener> {
    public BaseRewardedVideo(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        super(com.unity3d.mediation.LevelPlay.AdFormat.REWARDED, networkSettings);
    }
}
