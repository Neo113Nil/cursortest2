package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel;

/* loaded from: classes14.dex */
public final class LoadStatementMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.GetStatementSummaryUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper> getHighSpeedVideoSizes;

    private LoadStatementMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.GetStatementSummaryUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.GetStatementSummaryUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.GetStatementSummaryUseCase getStatementSummaryUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.mapper.StatementSummaryToUiModelMapper statementSummaryToUiModelMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware(getStatementSummaryUseCase, statementSummaryToUiModelMapper);
    }
}
