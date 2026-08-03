package com.unity3d.mediation.adapters.levelplay;

/* loaded from: classes5.dex */
public abstract class LevelPlayBaseBanner<NetworkAdapter extends com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter> extends com.ironsource.mediationsdk.adunit.adapter.BaseBanner<NetworkAdapter> implements com.ironsource.InterfaceC3268s3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBaseBanner(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        super(networkSettings);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
    }

    @Override // com.ironsource.InterfaceC3268s3
    public void collectBiddingData(com.ironsource.mediationsdk.adunit.adapter.utility.AdData adData, android.content.Context context, com.ironsource.mediationsdk.bidding.BiddingDataCallback biddingDataCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
    }
}
