package com.paypal.oslo.feature.activity.ui.detail.model;

/* loaded from: classes10.dex */
public final class ActivityTransactionDetailViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailActionsUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter> getOutputMinFrameDuration;

    private ActivityTransactionDetailViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailActionsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter> provider5, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider6) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getOutputMinFrameDuration = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailActionsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter> provider5, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider6) {
        return new com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel newInstance(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig, com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailUseCase activityDetailUseCase, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailActionsUseCase activityDetailActionsUseCase, com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter phoneNumberFormatter, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel(activityComposeConfig, activityDetailUseCase, iActivityErrorMapper, activityDetailActionsUseCase, phoneNumberFormatter, dynamicConfiguration);
    }
}
