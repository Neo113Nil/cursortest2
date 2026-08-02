package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

/* loaded from: classes13.dex */
public final class ContactSectionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.ContactsApi> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.transfer.mapper.RecommendedContactToP2PContactItemMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.IsAmountAndIntentUpdateInitiatedUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateTransferAttemptReceiverUseCase> getOutputMinFrameDuration;

    private ContactSectionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateTransferAttemptReceiverUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.IsAmountAndIntentUpdateInitiatedUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.transfer.mapper.RecommendedContactToP2PContactItemMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> provider6, dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.ContactsApi> provider7) {
        this.getOutputMinFrameDuration = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getInputFormats = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
        this.Camera2StreamConfigurationMap = provider6;
        this.getHighResolutionOutputSizeshNQ4ISI = provider7;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel get() {
        return newInstance(this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getInputFormats.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateTransferAttemptReceiverUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.IsAmountAndIntentUpdateInitiatedUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.transfer.mapper.RecommendedContactToP2PContactItemMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> provider6, dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.ContactsApi> provider7) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel newInstance(com.paypal.oslo.feature.p2p.domain.usecase.UpdateTransferAttemptReceiverUseCase updateTransferAttemptReceiverUseCase, com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getPaymentTransferAttemptUseCase, com.paypal.oslo.feature.p2p.domain.usecase.IsAmountAndIntentUpdateInitiatedUseCase isAmountAndIntentUpdateInitiatedUseCase, com.paypal.oslo.feature.p2p.domain.usecase.ResolvePaymentContingencyUseCase resolvePaymentContingencyUseCase, com.paypal.oslo.feature.p2p.ui.transfer.mapper.RecommendedContactToP2PContactItemMapper recommendedContactToP2PContactItemMapper, com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager, com.paypal.oslo.feature.contacts.api.ContactsApi contactsApi) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel(updateTransferAttemptReceiverUseCase, getPaymentTransferAttemptUseCase, isAmountAndIntentUpdateInitiatedUseCase, resolvePaymentContingencyUseCase, recommendedContactToP2PContactItemMapper, p2pFeatureGateManager, contactsApi);
    }
}
