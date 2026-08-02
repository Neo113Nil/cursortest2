package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0424StatementDetailsViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsObservabilityMiddleware.Factory> getHighSpeedVideoFpsRanges;

    private C0424StatementDetailsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsObservabilityMiddleware.Factory> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsReducer> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs) {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), statementDetailsNavigationArgs);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.C0424StatementDetailsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsObservabilityMiddleware.Factory> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsReducer> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.C0424StatementDetailsViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.GetStatementDetailsMiddleware getStatementDetailsMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsObservabilityMiddleware.Factory factory, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsReducer statementDetailsReducer, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel(getStatementDetailsMiddleware, factory, statementDetailsReducer, statementDetailsNavigationArgs);
    }
}
