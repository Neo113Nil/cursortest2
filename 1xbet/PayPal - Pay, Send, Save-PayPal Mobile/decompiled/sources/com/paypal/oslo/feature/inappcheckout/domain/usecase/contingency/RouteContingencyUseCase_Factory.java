package com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency;

/* loaded from: classes13.dex */
public final class RouteContingencyUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.RouteContingencyUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAddCardContingencyUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.PostEvalContingencyUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleUpdateCardContingencyUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleEConsentContingencyUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAuthChallengeContingencyUseCase> getHighSpeedVideoSizes;

    private RouteContingencyUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleEConsentContingencyUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAddCardContingencyUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleUpdateCardContingencyUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAuthChallengeContingencyUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.PostEvalContingencyUseCase> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.RouteContingencyUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.RouteContingencyUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleEConsentContingencyUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAddCardContingencyUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleUpdateCardContingencyUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAuthChallengeContingencyUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.PostEvalContingencyUseCase> provider5) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.RouteContingencyUseCase_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.RouteContingencyUseCase newInstance(com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleEConsentContingencyUseCase handleEConsentContingencyUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAddCardContingencyUseCase handleAddCardContingencyUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleUpdateCardContingencyUseCase handleUpdateCardContingencyUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleAuthChallengeContingencyUseCase handleAuthChallengeContingencyUseCase, com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.PostEvalContingencyUseCase postEvalContingencyUseCase) {
        return new com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.RouteContingencyUseCase(handleEConsentContingencyUseCase, handleAddCardContingencyUseCase, handleUpdateCardContingencyUseCase, handleAuthChallengeContingencyUseCase, postEvalContingencyUseCase);
    }
}
