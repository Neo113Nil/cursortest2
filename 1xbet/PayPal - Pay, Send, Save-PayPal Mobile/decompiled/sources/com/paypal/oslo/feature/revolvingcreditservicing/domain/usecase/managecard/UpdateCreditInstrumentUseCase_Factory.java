package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard;

/* loaded from: classes14.dex */
public final class UpdateCreditInstrumentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateCreditInstrumentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ManageAccountRepository> Camera2StreamConfigurationMap;

    private UpdateCreditInstrumentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ManageAccountRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateCreditInstrumentUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateCreditInstrumentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ManageAccountRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateCreditInstrumentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateCreditInstrumentUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ManageAccountRepository manageAccountRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateCreditInstrumentUseCase(manageAccountRepository);
    }
}
