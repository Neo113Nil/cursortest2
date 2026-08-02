package com.paypal.oslo.feature.activity.domain.usecase.search;

/* loaded from: classes10.dex */
public final class ActivitySearchActionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySearchActionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> getHighSpeedVideoFpsRangesFor;

    private ActivitySearchActionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySearchActionsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySearchActionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider2) {
        return new com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySearchActionsUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySearchActionsUseCase newInstance(com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider activityBaseActionsProvider, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager) {
        return new com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySearchActionsUseCase(activityBaseActionsProvider, activityFeatureManager);
    }
}
