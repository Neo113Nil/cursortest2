package com.paypal.oslo.feature.wallet.amexandp3.ui;

/* renamed from: com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C0438ProvisionInstrumentsViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.ProvisionInstrumentsUseCase> Camera2StreamConfigurationMap;

    private C0438ProvisionInstrumentsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.ProvisionInstrumentsUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    public final com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel get(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest partnerLinkingRequest, java.lang.String str) {
        return newInstance(partnerLinkingRequest, str, this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.amexandp3.ui.C0438ProvisionInstrumentsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.ProvisionInstrumentsUseCase> provider) {
        return new com.paypal.oslo.feature.wallet.amexandp3.ui.C0438ProvisionInstrumentsViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel newInstance(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest partnerLinkingRequest, java.lang.String str, com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.ProvisionInstrumentsUseCase provisionInstrumentsUseCase) {
        return new com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel(partnerLinkingRequest, str, provisionInstrumentsUseCase);
    }
}
