package com.paypal.oslo.feature.xoom.ui.sendmoney;

/* loaded from: classes16.dex */
public final class SendMoneyViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.GetUserAgreementAcceptedUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateSendMoneyInitialUrlUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyReducer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase> getInputFormats;

    private SendMoneyViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateSendMoneyInitialUrlUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.GetUserAgreementAcceptedUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider6) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getInputFormats = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
        this.Camera2StreamConfigurationMap = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getInputFormats.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateSendMoneyInitialUrlUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.xoom.domain.usecase.GetUserAgreementAcceptedUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider6) {
        return new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel newInstance(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyReducer sendMoneyReducer, com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase validateUserUseCase, com.paypal.oslo.feature.xoom.domain.usecase.CreateSendMoneyInitialUrlUseCase createSendMoneyInitialUrlUseCase, com.paypal.oslo.feature.xoom.domain.usecase.CreateWebViewHeadersUseCase createWebViewHeadersUseCase, com.paypal.oslo.feature.xoom.domain.usecase.GetUserAgreementAcceptedUseCase getUserAgreementAcceptedUseCase, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel(sendMoneyReducer, validateUserUseCase, createSendMoneyInitialUrlUseCase, createWebViewHeadersUseCase, getUserAgreementAcceptedUseCase, dynamicConfiguration);
    }
}
