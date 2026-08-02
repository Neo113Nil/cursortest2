package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0425StatementViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementObservabilityMiddleware> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware> getHighSpeedVideoFpsRangesFor;

    private C0425StatementViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementObservabilityMiddleware> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementReducer> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementArgs statementArgs) {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), statementArgs);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.C0425StatementViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementObservabilityMiddleware> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementReducer> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.C0425StatementViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.DownloadStatementMiddleware downloadStatementMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementObservabilityMiddleware statementObservabilityMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementReducer statementReducer, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementArgs statementArgs) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementViewModel(downloadStatementMiddleware, statementObservabilityMiddleware, statementReducer, statementArgs);
    }
}
