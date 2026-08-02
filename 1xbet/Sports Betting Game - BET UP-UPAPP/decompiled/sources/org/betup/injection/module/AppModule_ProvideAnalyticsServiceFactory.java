package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.model.remote.api.rest.analytics.PostTrackEventInteractor;
import org.betup.model.remote.api.rest.analytics.PostTrackPurchaseInteractor;
import org.betup.services.analytics.AnalyticsService;

/* loaded from: classes2.dex */
public final class AppModule_ProvideAnalyticsServiceFactory implements Factory<AnalyticsService> {
    private final AppModule module;
    private final Provider<PostTrackEventInteractor> postTrackEventInteractorProvider;
    private final Provider<PostTrackPurchaseInteractor> postTrackPurchaseInteractorProvider;

    public AppModule_ProvideAnalyticsServiceFactory(AppModule module, Provider<PostTrackEventInteractor> postTrackEventInteractorProvider, Provider<PostTrackPurchaseInteractor> postTrackPurchaseInteractorProvider) {
        this.module = module;
        this.postTrackEventInteractorProvider = postTrackEventInteractorProvider;
        this.postTrackPurchaseInteractorProvider = postTrackPurchaseInteractorProvider;
    }

    @Override // javax.inject.Provider
    public AnalyticsService get() {
        return (AnalyticsService) Preconditions.checkNotNull(this.module.provideAnalyticsService(this.postTrackEventInteractorProvider.get(), this.postTrackPurchaseInteractorProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideAnalyticsServiceFactory create(AppModule module, Provider<PostTrackEventInteractor> postTrackEventInteractorProvider, Provider<PostTrackPurchaseInteractor> postTrackPurchaseInteractorProvider) {
        return new AppModule_ProvideAnalyticsServiceFactory(module, postTrackEventInteractorProvider, postTrackPurchaseInteractorProvider);
    }

    public static AnalyticsService proxyProvideAnalyticsService(AppModule instance, PostTrackEventInteractor postTrackEventInteractor, PostTrackPurchaseInteractor postTrackPurchaseInteractor) {
        return (AnalyticsService) Preconditions.checkNotNull(instance.provideAnalyticsService(postTrackEventInteractor, postTrackPurchaseInteractor), "Cannot return null from a non-@Nullable @Provides method");
    }
}
