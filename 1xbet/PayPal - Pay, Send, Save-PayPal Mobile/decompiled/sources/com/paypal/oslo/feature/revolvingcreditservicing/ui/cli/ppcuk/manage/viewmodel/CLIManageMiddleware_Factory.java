package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel;

/* loaded from: classes14.dex */
public final class CLIManageMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.mapper.CLIManageUiModelMapper> getHighSpeedVideoFpsRangesFor;

    private CLIManageMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.mapper.CLIManageUiModelMapper> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageMiddleware get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.mapper.CLIManageUiModelMapper> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageMiddleware_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetCLIManageDataUseCase getCLIManageDataUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.mapper.CLIManageUiModelMapper cLIManageUiModelMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageMiddleware(getCLIManageDataUseCase, cLIManageUiModelMapper);
    }
}
