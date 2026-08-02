package com.paypal.oslo.feature.wallet.amexandp3.ui;

/* loaded from: classes15.dex */
public final class ProvisionInstrumentsViewModel_Factory_Impl implements com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Factory {
    private final com.paypal.oslo.feature.wallet.amexandp3.ui.C0438ProvisionInstrumentsViewModel_Factory getHighResolutionOutputSizeshNQ4ISI;

    private ProvisionInstrumentsViewModel_Factory_Impl(com.paypal.oslo.feature.wallet.amexandp3.ui.C0438ProvisionInstrumentsViewModel_Factory c0438ProvisionInstrumentsViewModel_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0438ProvisionInstrumentsViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Factory
    public final com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel create(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest partnerLinkingRequest, java.lang.String str) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(partnerLinkingRequest, str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Factory> create(com.paypal.oslo.feature.wallet.amexandp3.ui.C0438ProvisionInstrumentsViewModel_Factory c0438ProvisionInstrumentsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel_Factory_Impl(c0438ProvisionInstrumentsViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.wallet.amexandp3.ui.C0438ProvisionInstrumentsViewModel_Factory c0438ProvisionInstrumentsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.wallet.amexandp3.ui.ProvisionInstrumentsViewModel_Factory_Impl(c0438ProvisionInstrumentsViewModel_Factory));
    }
}
