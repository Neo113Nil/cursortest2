package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard;

/* loaded from: classes14.dex */
public final class UpdateStatementDeliveryPreferenceUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateStatementDeliveryPreferenceUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ManageAccountRepository> getHighSpeedVideoSizes;

    private UpdateStatementDeliveryPreferenceUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ManageAccountRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateStatementDeliveryPreferenceUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateStatementDeliveryPreferenceUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ManageAccountRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateStatementDeliveryPreferenceUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateStatementDeliveryPreferenceUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ManageAccountRepository manageAccountRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.managecard.UpdateStatementDeliveryPreferenceUseCase(manageAccountRepository);
    }
}
