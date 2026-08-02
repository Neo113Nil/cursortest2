package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel;

/* loaded from: classes14.dex */
public final class CLIApprovalViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.C0394CLIApprovalViewModel_Factory Camera2StreamConfigurationMap;

    private CLIApprovalViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.C0394CLIApprovalViewModel_Factory c0394CLIApprovalViewModel_Factory) {
        this.Camera2StreamConfigurationMap = c0394CLIApprovalViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CLIApprovalArgs cLIApprovalArgs) {
        return this.Camera2StreamConfigurationMap.get(cLIApprovalArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.C0394CLIApprovalViewModel_Factory c0394CLIApprovalViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel_Factory_Impl(c0394CLIApprovalViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.C0394CLIApprovalViewModel_Factory c0394CLIApprovalViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel_Factory_Impl(c0394CLIApprovalViewModel_Factory));
    }
}
