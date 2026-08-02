package com.paypal.oslo.feature.userprofile.di;

/* loaded from: classes5.dex */
public final class UserProfileConfigModule_ProvideUserProfileConfigFactory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.config.UserProfileConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> getHighSpeedVideoFpsRanges;

    private UserProfileConfigModule_ProvideUserProfileConfigFactory(dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.config.UserProfileConfig get() {
        return provideUserProfileConfig(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.userprofile.di.UserProfileConfigModule_ProvideUserProfileConfigFactory create(dagger.internal.Provider<com.paypal.oslo.core.network.rest.config.RestConfig> provider) {
        return new com.paypal.oslo.feature.userprofile.di.UserProfileConfigModule_ProvideUserProfileConfigFactory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.config.UserProfileConfig provideUserProfileConfig(com.paypal.oslo.core.network.rest.config.RestConfig restConfig) {
        return (com.paypal.oslo.feature.userprofile.config.UserProfileConfig) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.userprofile.di.UserProfileConfigModule.INSTANCE.provideUserProfileConfig(restConfig));
    }
}
