package com.paypal.oslo.feature.subscriptions.updatefi.ui;

/* loaded from: classes15.dex */
public final class UpdateFiViewModel_Factory_Impl implements com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel.Factory {
    private final com.paypal.oslo.feature.subscriptions.updatefi.ui.C0436UpdateFiViewModel_Factory getHighSpeedVideoSizes;

    private UpdateFiViewModel_Factory_Impl(com.paypal.oslo.feature.subscriptions.updatefi.ui.C0436UpdateFiViewModel_Factory c0436UpdateFiViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0436UpdateFiViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel.Factory
    public final com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel create(java.util.List<java.lang.String> list, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel> map, java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource updateFiSource) {
        return this.getHighSpeedVideoSizes.get(list, agreementType, map, str, updateFiSource);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel.Factory> create(com.paypal.oslo.feature.subscriptions.updatefi.ui.C0436UpdateFiViewModel_Factory c0436UpdateFiViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel_Factory_Impl(c0436UpdateFiViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.subscriptions.updatefi.ui.C0436UpdateFiViewModel_Factory c0436UpdateFiViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.subscriptions.updatefi.ui.UpdateFiViewModel_Factory_Impl(c0436UpdateFiViewModel_Factory));
    }
}
