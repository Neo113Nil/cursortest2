package org.betup.model.remote.api.rest.user;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class V7TourMarketingRewardsInteractor_Factory implements Factory<V7TourMarketingRewardsInteractor> {
    private final Provider<Context> contextProvider;

    public V7TourMarketingRewardsInteractor_Factory(Provider<Context> contextProvider) {
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7TourMarketingRewardsInteractor get() {
        return new V7TourMarketingRewardsInteractor(this.contextProvider.get());
    }

    public static V7TourMarketingRewardsInteractor_Factory create(Provider<Context> contextProvider) {
        return new V7TourMarketingRewardsInteractor_Factory(contextProvider);
    }
}
