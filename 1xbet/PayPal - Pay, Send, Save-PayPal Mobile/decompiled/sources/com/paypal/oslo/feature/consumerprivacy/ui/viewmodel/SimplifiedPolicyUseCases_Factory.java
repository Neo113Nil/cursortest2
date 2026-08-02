package com.paypal.oslo.feature.consumerprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class SimplifiedPolicyUseCases_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimplifiedPolicyUseCases> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindViaPayPalMeUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowPaymentRequestsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowVenmoDiscoveryUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindByIdentifiersUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePaymentRequestsFromUseCase> getHighSpeedVideoSizes;

    private SimplifiedPolicyUseCases_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindByIdentifiersUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowPaymentRequestsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePaymentRequestsFromUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindViaPayPalMeUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowVenmoDiscoveryUseCase> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimplifiedPolicyUseCases get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimplifiedPolicyUseCases_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindByIdentifiersUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowPaymentRequestsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePaymentRequestsFromUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindViaPayPalMeUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowVenmoDiscoveryUseCase> provider5) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimplifiedPolicyUseCases_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimplifiedPolicyUseCases newInstance(com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindByIdentifiersUseCase updateAllowFindByIdentifiersUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowPaymentRequestsUseCase updateAllowPaymentRequestsUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdatePaymentRequestsFromUseCase updatePaymentRequestsFromUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowFindViaPayPalMeUseCase updateAllowFindViaPayPalMeUseCase, com.paypal.oslo.feature.consumerprivacy.domain.usecase.UpdateAllowVenmoDiscoveryUseCase updateAllowVenmoDiscoveryUseCase) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.SimplifiedPolicyUseCases(updateAllowFindByIdentifiersUseCase, updateAllowPaymentRequestsUseCase, updatePaymentRequestsFromUseCase, updateAllowFindViaPayPalMeUseCase, updateAllowVenmoDiscoveryUseCase);
    }
}
