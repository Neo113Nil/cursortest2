package com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui;

/* loaded from: classes15.dex */
public final class LinkAgreementsSearchViewModel_Factory_Impl implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel.Factory {
    private final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.C0432LinkAgreementsSearchViewModel_Factory getHighSpeedVideoSizes;

    private LinkAgreementsSearchViewModel_Factory_Impl(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.C0432LinkAgreementsSearchViewModel_Factory c0432LinkAgreementsSearchViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0432LinkAgreementsSearchViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel.Factory
    public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel create(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        return this.getHighSpeedVideoSizes.get(agreementType);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel.Factory> create(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.C0432LinkAgreementsSearchViewModel_Factory c0432LinkAgreementsSearchViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel_Factory_Impl(c0432LinkAgreementsSearchViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.C0432LinkAgreementsSearchViewModel_Factory c0432LinkAgreementsSearchViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel_Factory_Impl(c0432LinkAgreementsSearchViewModel_Factory));
    }
}
