package org.betup.model.remote.api.rest.videoRewards;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class GetVideoRewardForPlacementStateInteractor_Factory implements Factory<GetVideoRewardForPlacementStateInteractor> {
    private final Provider<Context> contextProvider;

    public GetVideoRewardForPlacementStateInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public GetVideoRewardForPlacementStateInteractor get() {
        return new GetVideoRewardForPlacementStateInteractor(this.contextProvider.get());
    }

    public static GetVideoRewardForPlacementStateInteractor_Factory create(Provider<Context> contextProvider) {
        return new GetVideoRewardForPlacementStateInteractor_Factory(contextProvider);
    }
}
