package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0395CLIManageViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageMiddleware> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageReducer> getHighSpeedVideoSizes;

    private C0395CLIManageViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageMiddleware> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CLIManageArgs cLIManageArgs) {
        return newInstance(cLIManageArgs, this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.C0395CLIManageViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageMiddleware> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.C0395CLIManageViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CLIManageArgs cLIManageArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageReducer cLIManageReducer, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageMiddleware cLIManageMiddleware) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel(cLIManageArgs, cLIManageReducer, cLIManageMiddleware);
    }
}
