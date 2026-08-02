package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel;

/* loaded from: classes14.dex */
public final class StatementViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.C0425StatementViewModel_Factory getHighSpeedVideoSizes;

    private StatementViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.C0425StatementViewModel_Factory c0425StatementViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0425StatementViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementArgs statementArgs) {
        return this.getHighSpeedVideoSizes.get(statementArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.C0425StatementViewModel_Factory c0425StatementViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementViewModel_Factory_Impl(c0425StatementViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.C0425StatementViewModel_Factory c0425StatementViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.statement.viewmodel.StatementViewModel_Factory_Impl(c0425StatementViewModel_Factory));
    }
}
