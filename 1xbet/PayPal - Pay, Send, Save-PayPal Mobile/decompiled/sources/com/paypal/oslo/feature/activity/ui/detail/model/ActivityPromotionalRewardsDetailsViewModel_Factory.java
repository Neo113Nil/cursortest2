package com.paypal.oslo.feature.activity.ui.detail.model;

/* loaded from: classes10.dex */
public final class ActivityPromotionalRewardsDetailsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.ui.detail.model.ActivityPromotionalRewardsDetailsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> getHighSpeedVideoFpsRanges;

    private ActivityPromotionalRewardsDetailsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.ui.detail.model.ActivityPromotionalRewardsDetailsViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.activity.ui.detail.model.ActivityPromotionalRewardsDetailsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider) {
        return new com.paypal.oslo.feature.activity.ui.detail.model.ActivityPromotionalRewardsDetailsViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.activity.ui.detail.model.ActivityPromotionalRewardsDetailsViewModel newInstance(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig) {
        return new com.paypal.oslo.feature.activity.ui.detail.model.ActivityPromotionalRewardsDetailsViewModel(activityComposeConfig);
    }
}
