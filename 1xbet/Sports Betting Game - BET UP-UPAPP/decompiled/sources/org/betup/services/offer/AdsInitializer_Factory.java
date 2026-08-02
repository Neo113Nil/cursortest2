package org.betup.services.offer;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.betup.services.ads.MobileAdsInitializer;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.UserService;

/* loaded from: classes2.dex */
public final class AdsInitializer_Factory implements Factory<AdsInitializer> {
    private final Provider<LocalPreferencesService> localPreferencesServiceProvider;
    private final Provider<MobileAdsInitializer> mobileAdsInitializerProvider;
    private final Provider<UserService> userServiceProvider;

    public AdsInitializer_Factory(Provider<UserService> userServiceProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<MobileAdsInitializer> mobileAdsInitializerProvider) {
        this.userServiceProvider = userServiceProvider;
        this.localPreferencesServiceProvider = localPreferencesServiceProvider;
        this.mobileAdsInitializerProvider = mobileAdsInitializerProvider;
    }

    @Override // javax.inject.Provider
    public AdsInitializer get() {
        return new AdsInitializer(this.userServiceProvider.get(), this.localPreferencesServiceProvider.get(), this.mobileAdsInitializerProvider.get());
    }

    public static AdsInitializer_Factory create(Provider<UserService> userServiceProvider, Provider<LocalPreferencesService> localPreferencesServiceProvider, Provider<MobileAdsInitializer> mobileAdsInitializerProvider) {
        return new AdsInitializer_Factory(userServiceProvider, localPreferencesServiceProvider, mobileAdsInitializerProvider);
    }
}
