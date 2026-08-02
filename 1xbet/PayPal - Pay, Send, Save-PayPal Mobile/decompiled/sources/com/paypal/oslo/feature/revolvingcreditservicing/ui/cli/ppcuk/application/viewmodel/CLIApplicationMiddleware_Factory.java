package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel;

/* loaded from: classes14.dex */
public final class CLIApplicationMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cli.RequestCreditLineIncreaseUseCase> getHighSpeedVideoSizes;

    private CLIApplicationMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cli.RequestCreditLineIncreaseUseCase> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationMiddleware get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cli.RequestCreditLineIncreaseUseCase> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationMiddleware_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper cLIApplicationUiModelMapper, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cli.RequestCreditLineIncreaseUseCase requestCreditLineIncreaseUseCase) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.viewmodel.CLIApplicationMiddleware(cLIApplicationUiModelMapper, requestCreditLineIncreaseUseCase);
    }
}
