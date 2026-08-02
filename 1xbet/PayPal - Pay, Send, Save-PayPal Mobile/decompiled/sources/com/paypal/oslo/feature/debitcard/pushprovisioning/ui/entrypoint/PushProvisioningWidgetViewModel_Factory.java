package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint;

/* loaded from: classes12.dex */
public final class PushProvisioningWidgetViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase> getHighSpeedVideoSizes;

    private PushProvisioningWidgetViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase> provider2) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel newInstance(com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetReducer pushProvisioningWidgetReducer, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase getPushProvisioningStatusUseCase) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.PushProvisioningWidgetViewModel(pushProvisioningWidgetReducer, getPushProvisioningStatusUseCase);
    }
}
