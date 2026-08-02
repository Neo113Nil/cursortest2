package com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui;

/* renamed from: com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C0433LinkAgreementsViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase> Camera2StreamConfigurationMap;

    private C0433LinkAgreementsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel get(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        return newInstance(this.Camera2StreamConfigurationMap.get(), agreementType);
    }

    public static com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.C0433LinkAgreementsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase> provider) {
        return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.C0433LinkAgreementsViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel newInstance(com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.usecase.GetAvailableMerchantsUseCase getAvailableMerchantsUseCase, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        return new com.paypal.oslo.feature.subscriptions.linkagreements.hub.ui.LinkAgreementsViewModel(getAvailableMerchantsUseCase, agreementType);
    }
}
