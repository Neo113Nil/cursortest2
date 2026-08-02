package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.viewmodel;

/* loaded from: classes14.dex */
public final class CLIDeclineViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.viewmodel.CLIDeclineViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.viewmodel.CLIDeclineReducer> Camera2StreamConfigurationMap;

    private CLIDeclineViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.viewmodel.CLIDeclineReducer> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.viewmodel.CLIDeclineViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.viewmodel.CLIDeclineViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.viewmodel.CLIDeclineReducer> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.viewmodel.CLIDeclineViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.viewmodel.CLIDeclineViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.viewmodel.CLIDeclineReducer cLIDeclineReducer) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.decline.viewmodel.CLIDeclineViewModel(cLIDeclineReducer);
    }
}
