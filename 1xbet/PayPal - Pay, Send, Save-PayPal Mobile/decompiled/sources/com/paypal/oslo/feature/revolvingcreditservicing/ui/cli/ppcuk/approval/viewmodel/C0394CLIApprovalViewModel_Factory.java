package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0394CLIApprovalViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIProcessingMiddleware> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalMiddleware> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalReducer> getHighSpeedVideoSizes;

    private C0394CLIApprovalViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalMiddleware> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIProcessingMiddleware> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CLIApprovalArgs cLIApprovalArgs) {
        return newInstance(cLIApprovalArgs, this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.C0394CLIApprovalViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalMiddleware> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIProcessingMiddleware> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.C0394CLIApprovalViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CLIApprovalArgs cLIApprovalArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalReducer cLIApprovalReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalMiddleware cLIApprovalMiddleware, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIProcessingMiddleware cLIProcessingMiddleware) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.approval.viewmodel.CLIApprovalViewModel(cLIApprovalArgs, cLIApprovalReducer, cLIApprovalMiddleware, cLIProcessingMiddleware);
    }
}
