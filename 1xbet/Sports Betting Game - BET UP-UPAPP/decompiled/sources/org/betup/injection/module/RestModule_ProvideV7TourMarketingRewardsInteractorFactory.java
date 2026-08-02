package org.betup.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.user.V7TourMarketingRewardsInteractor;

/* loaded from: classes2.dex */
public final class RestModule_ProvideV7TourMarketingRewardsInteractorFactory implements Factory<V7TourMarketingRewardsInteractor> {
    private final Provider<Context> contextProvider;
    private final RestModule module;

    public RestModule_ProvideV7TourMarketingRewardsInteractorFactory(RestModule module, Provider<Context> contextProvider) {
        this.module = module;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public V7TourMarketingRewardsInteractor get() {
        return (V7TourMarketingRewardsInteractor) Preconditions.checkNotNull(this.module.provideV7TourMarketingRewardsInteractor(this.contextProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static RestModule_ProvideV7TourMarketingRewardsInteractorFactory create(RestModule module, Provider<Context> contextProvider) {
        return new RestModule_ProvideV7TourMarketingRewardsInteractorFactory(module, contextProvider);
    }

    public static V7TourMarketingRewardsInteractor proxyProvideV7TourMarketingRewardsInteractor(RestModule instance, Context context) {
        return (V7TourMarketingRewardsInteractor) Preconditions.checkNotNull(instance.provideV7TourMarketingRewardsInteractor(context), "Cannot return null from a non-@Nullable @Provides method");
    }
}
