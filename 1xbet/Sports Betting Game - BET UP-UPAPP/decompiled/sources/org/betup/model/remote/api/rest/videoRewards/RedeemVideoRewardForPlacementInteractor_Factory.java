package org.betup.model.remote.api.rest.videoRewards;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class RedeemVideoRewardForPlacementInteractor_Factory implements Factory<RedeemVideoRewardForPlacementInteractor> {
    private final Provider<Context> contextProvider;

    public RedeemVideoRewardForPlacementInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public RedeemVideoRewardForPlacementInteractor get() {
        return new RedeemVideoRewardForPlacementInteractor(this.contextProvider.get());
    }

    public static RedeemVideoRewardForPlacementInteractor_Factory create(Provider<Context> contextProvider) {
        return new RedeemVideoRewardForPlacementInteractor_Factory(contextProvider);
    }
}
