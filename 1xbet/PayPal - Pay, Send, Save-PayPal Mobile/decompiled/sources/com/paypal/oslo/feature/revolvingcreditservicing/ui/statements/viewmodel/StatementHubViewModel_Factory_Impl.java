package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel;

/* loaded from: classes14.dex */
public final class StatementHubViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.C0427StatementHubViewModel_Factory getHighSpeedVideoFpsRanges;

    private StatementHubViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.C0427StatementHubViewModel_Factory c0427StatementHubViewModel_Factory) {
        this.getHighSpeedVideoFpsRanges = c0427StatementHubViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementHubArgs statementHubArgs) {
        return this.getHighSpeedVideoFpsRanges.get(statementHubArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.C0427StatementHubViewModel_Factory c0427StatementHubViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel_Factory_Impl(c0427StatementHubViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.C0427StatementHubViewModel_Factory c0427StatementHubViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.viewmodel.StatementHubViewModel_Factory_Impl(c0427StatementHubViewModel_Factory));
    }
}
