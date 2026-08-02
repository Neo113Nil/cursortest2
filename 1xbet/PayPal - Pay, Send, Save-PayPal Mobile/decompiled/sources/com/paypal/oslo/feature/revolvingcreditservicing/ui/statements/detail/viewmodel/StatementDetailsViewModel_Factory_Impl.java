package com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel;

/* loaded from: classes14.dex */
public final class StatementDetailsViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.C0424StatementDetailsViewModel_Factory Camera2StreamConfigurationMap;

    private StatementDetailsViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.C0424StatementDetailsViewModel_Factory c0424StatementDetailsViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0424StatementDetailsViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.StatementDetailsNavigationArgs statementDetailsNavigationArgs) {
        return this.Camera2StreamConfigurationMap.get(statementDetailsNavigationArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.C0424StatementDetailsViewModel_Factory c0424StatementDetailsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel_Factory_Impl(c0424StatementDetailsViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.C0424StatementDetailsViewModel_Factory c0424StatementDetailsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.statements.detail.viewmodel.StatementDetailsViewModel_Factory_Impl(c0424StatementDetailsViewModel_Factory));
    }
}
