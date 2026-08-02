package com.paypal.oslo.feature.activity.domain.usecase.common;

/* loaded from: classes10.dex */
public final class ActivityNavigationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> getHighResolutionOutputSizeshNQ4ISI;

    private ActivityNavigationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider) {
        return new com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase newInstance(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig) {
        return new com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase(activityComposeConfig);
    }
}
