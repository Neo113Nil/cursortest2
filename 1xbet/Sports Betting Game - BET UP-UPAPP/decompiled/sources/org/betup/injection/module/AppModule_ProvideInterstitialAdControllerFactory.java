package org.betup.injection.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.betup.services.ads.interstitial.GoogleInterstitialAdController;
import org.betup.services.ads.interstitial.InterstitialAdController;

/* loaded from: classes2.dex */
public final class AppModule_ProvideInterstitialAdControllerFactory implements Factory<InterstitialAdController> {
    private final Provider<GoogleInterstitialAdController> controllerProvider;
    private final AppModule module;

    public AppModule_ProvideInterstitialAdControllerFactory(AppModule module, Provider<GoogleInterstitialAdController> controllerProvider) {
        this.module = module;
        this.controllerProvider = controllerProvider;
    }

    @Override // javax.inject.Provider
    public InterstitialAdController get() {
        return (InterstitialAdController) Preconditions.checkNotNull(this.module.provideInterstitialAdController(this.controllerProvider.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static AppModule_ProvideInterstitialAdControllerFactory create(AppModule module, Provider<GoogleInterstitialAdController> controllerProvider) {
        return new AppModule_ProvideInterstitialAdControllerFactory(module, controllerProvider);
    }

    public static InterstitialAdController proxyProvideInterstitialAdController(AppModule instance, GoogleInterstitialAdController controller) {
        return (InterstitialAdController) Preconditions.checkNotNull(instance.provideInterstitialAdController(controller), "Cannot return null from a non-@Nullable @Provides method");
    }
}
