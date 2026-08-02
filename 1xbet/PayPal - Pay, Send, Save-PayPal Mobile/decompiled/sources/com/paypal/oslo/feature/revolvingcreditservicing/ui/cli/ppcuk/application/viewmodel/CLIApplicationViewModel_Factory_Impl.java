package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel;

/* loaded from: classes14.dex */
public final class CLIApplicationViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.C0393CLIApplicationViewModel_Factory getHighSpeedVideoSizes;

    private CLIApplicationViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.C0393CLIApplicationViewModel_Factory c0393CLIApplicationViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0393CLIApplicationViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CLIApplicationArgs cLIApplicationArgs) {
        return this.getHighSpeedVideoSizes.get(cLIApplicationArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.C0393CLIApplicationViewModel_Factory c0393CLIApplicationViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationViewModel_Factory_Impl(c0393CLIApplicationViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.C0393CLIApplicationViewModel_Factory c0393CLIApplicationViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationViewModel_Factory_Impl(c0393CLIApplicationViewModel_Factory));
    }
}
