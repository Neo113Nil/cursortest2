package com.paypal.oslo.feature.subscriptions.details.ui.viewmodel;

/* loaded from: classes15.dex */
public final class SubscriptionDetailViewModel_Factory_Impl implements com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel.Factory {
    private final com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.C0431SubscriptionDetailViewModel_Factory getHighSpeedVideoSizes;

    private SubscriptionDetailViewModel_Factory_Impl(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.C0431SubscriptionDetailViewModel_Factory c0431SubscriptionDetailViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0431SubscriptionDetailViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel.Factory
    public final com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel create(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        return this.getHighSpeedVideoSizes.get(agreementType);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel.Factory> create(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.C0431SubscriptionDetailViewModel_Factory c0431SubscriptionDetailViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel_Factory_Impl(c0431SubscriptionDetailViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.C0431SubscriptionDetailViewModel_Factory c0431SubscriptionDetailViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.subscriptions.details.ui.viewmodel.SubscriptionDetailViewModel_Factory_Impl(c0431SubscriptionDetailViewModel_Factory));
    }
}
