package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.services.ads.rewarded.GoogleRewardedAdController;
import org.betup.services.ads.rewarded.RewardedAdController;

/* loaded from: classes2.dex */
public final class AppModule_ProvideRewardedAdControllerFactory implements Factory<RewardedAdController> {
    private final Provider<GoogleRewardedAdController> controllerProvider;
    private final AppModule module;

    public AppModule_ProvideRewardedAdControllerFactory(AppModule module, Provider<GoogleRewardedAdController> controllerProvider) {
        this.module = module;
        this.controllerProvider = controllerProvider;
    }

    @Override // javax.inject.Provider
    public RewardedAdController get() {
        return (RewardedAdController) Preconditions.checkNotNull(this.module.provideRewardedAdController(this.controllerProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideRewardedAdControllerFactory create(AppModule module, Provider<GoogleRewardedAdController> controllerProvider) {
        return new AppModule_ProvideRewardedAdControllerFactory(module, controllerProvider);
    }

    public static RewardedAdController proxyProvideRewardedAdController(AppModule instance, GoogleRewardedAdController controller) {
        return (RewardedAdController) Preconditions.checkNotNull(instance.provideRewardedAdController(controller), "Cannot return null from a non-@Nullable @Provides method");
    }
}
