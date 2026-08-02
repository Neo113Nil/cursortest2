package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0427StatementHubViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware.Factory> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware> getHighSpeedVideoSizes;

    private C0427StatementHubViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware.Factory> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubReducer> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs) {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), statementHubArgs);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.C0427StatementHubViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware.Factory> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubReducer> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.C0427StatementHubViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.LoadStatementMiddleware loadStatementMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubObservabilityMiddleware.Factory factory, com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubReducer statementHubReducer, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel(loadStatementMiddleware, factory, statementHubReducer, statementHubArgs);
    }
}
