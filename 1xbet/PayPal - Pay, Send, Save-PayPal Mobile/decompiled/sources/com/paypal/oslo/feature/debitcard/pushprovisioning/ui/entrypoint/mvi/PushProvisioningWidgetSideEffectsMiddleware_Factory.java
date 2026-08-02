package com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi;

/* loaded from: classes12.dex */
public final class PushProvisioningWidgetSideEffectsMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase> Camera2StreamConfigurationMap;

    private PushProvisioningWidgetSideEffectsMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase> provider) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware newInstance(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase getPushProvisioningStatusUseCase) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.ui.entrypoint.mvi.PushProvisioningWidgetSideEffectsMiddleware(getPushProvisioningStatusUseCase);
    }
}
