package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel;

/* loaded from: classes14.dex */
public final class CLIManageViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.C0395CLIManageViewModel_Factory getHighSpeedVideoSizes;

    private CLIManageViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.C0395CLIManageViewModel_Factory c0395CLIManageViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0395CLIManageViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CLIManageArgs cLIManageArgs) {
        return this.getHighSpeedVideoSizes.get(cLIManageArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.C0395CLIManageViewModel_Factory c0395CLIManageViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel_Factory_Impl(c0395CLIManageViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.C0395CLIManageViewModel_Factory c0395CLIManageViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel_Factory_Impl(c0395CLIManageViewModel_Factory));
    }
}
