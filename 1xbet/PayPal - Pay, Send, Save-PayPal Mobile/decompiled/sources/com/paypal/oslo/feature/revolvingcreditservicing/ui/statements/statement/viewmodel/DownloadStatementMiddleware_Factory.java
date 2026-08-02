package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel;

/* loaded from: classes14.dex */
public final class DownloadStatementMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.DownloadStatementUseCase> getHighSpeedVideoFpsRanges;

    private DownloadStatementMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.DownloadStatementUseCase> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.DownloadStatementUseCase> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.statements.DownloadStatementUseCase downloadStatementUseCase) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware(downloadStatementUseCase);
    }
}
