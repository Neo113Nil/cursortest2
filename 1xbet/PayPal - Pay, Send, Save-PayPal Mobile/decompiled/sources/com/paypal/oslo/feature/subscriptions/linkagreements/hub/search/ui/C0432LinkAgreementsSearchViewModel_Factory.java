package com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui;

/* renamed from: com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C0432LinkAgreementsSearchViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase> getHighSpeedVideoSizes;

    private C0432LinkAgreementsSearchViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel get(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        return newInstance(this.getHighSpeedVideoSizes.get(), agreementType);
    }

    public static com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.C0432LinkAgreementsSearchViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase> provider) {
        return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.C0432LinkAgreementsSearchViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel newInstance(com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase getAvailableMerchantsUseCase, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.search.ui.LinkAgreementsSearchViewModel(getAvailableMerchantsUseCase, agreementType);
    }
}
