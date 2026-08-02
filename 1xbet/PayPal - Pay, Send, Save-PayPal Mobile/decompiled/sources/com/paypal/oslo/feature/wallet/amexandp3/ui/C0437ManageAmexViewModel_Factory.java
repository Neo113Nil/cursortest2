package com.paypal.oslo.feature.wallet.amexandp3.ui;

/* renamed from: com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C0437ManageAmexViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RetrievePaymentTokenUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RemovePaymentTokenUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private C0437ManageAmexViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RemovePaymentTokenUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RetrievePaymentTokenUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    public final com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel get(java.lang.String str) {
        return newInstance(str, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.amexandp3.ui.C0437ManageAmexViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RemovePaymentTokenUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RetrievePaymentTokenUseCase> provider2) {
        return new com.paypal.oslo.feature.wallet.amexandp3.ui.C0437ManageAmexViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel newInstance(java.lang.String str, com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RemovePaymentTokenUseCase removePaymentTokenUseCase, com.paypal.oslo.feature.wallet.amexandp3.domain.usecase.RetrievePaymentTokenUseCase retrievePaymentTokenUseCase) {
        return new com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel(str, removePaymentTokenUseCase, retrievePaymentTokenUseCase);
    }
}
