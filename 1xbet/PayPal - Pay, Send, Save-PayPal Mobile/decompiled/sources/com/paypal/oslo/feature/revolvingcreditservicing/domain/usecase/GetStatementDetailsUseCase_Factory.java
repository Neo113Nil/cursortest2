package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

/* loaded from: classes14.dex */
public final class GetStatementDetailsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetStatementDetailsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.StatementsRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetStatementDetailsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.StatementsRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetStatementDetailsUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetStatementDetailsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.StatementsRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetStatementDetailsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetStatementDetailsUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.StatementsRepository statementsRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetStatementDetailsUseCase(statementsRepository);
    }
}
