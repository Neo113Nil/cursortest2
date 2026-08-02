package com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui;

/* loaded from: classes15.dex */
public final class LinkAgreementsViewModel_Factory_Impl implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel.Factory {
    private final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.C0433LinkAgreementsViewModel_Factory getHighSpeedVideoSizes;

    private LinkAgreementsViewModel_Factory_Impl(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.C0433LinkAgreementsViewModel_Factory c0433LinkAgreementsViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0433LinkAgreementsViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel.Factory
    public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel create(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        return this.getHighSpeedVideoSizes.get(agreementType);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel.Factory> create(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.C0433LinkAgreementsViewModel_Factory c0433LinkAgreementsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel_Factory_Impl(c0433LinkAgreementsViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.C0433LinkAgreementsViewModel_Factory c0433LinkAgreementsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel_Factory_Impl(c0433LinkAgreementsViewModel_Factory));
    }
}
