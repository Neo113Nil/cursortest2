package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements;

/* loaded from: classes14.dex */
public final class GetStatementSummaryUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.GetStatementSummaryUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.StatementsRepository> getHighSpeedVideoFpsRangesFor;

    private GetStatementSummaryUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.StatementsRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.GetStatementSummaryUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.GetStatementSummaryUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.StatementsRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.GetStatementSummaryUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.GetStatementSummaryUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.StatementsRepository statementsRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.GetStatementSummaryUseCase(statementsRepository);
    }
}
