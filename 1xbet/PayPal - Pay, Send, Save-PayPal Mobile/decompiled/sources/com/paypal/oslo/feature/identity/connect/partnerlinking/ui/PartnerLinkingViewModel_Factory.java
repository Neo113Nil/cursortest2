package com.paypal.oslo.feature.identity.connect.partnerlinking.ui;

/* loaded from: classes12.dex */
public final class PartnerLinkingViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.domain.IdentitySessionTransfer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.partnerlinking.domain.usecase.ValidateConnectUseCase> getHighSpeedVideoSizes;

    private PartnerLinkingViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.partnerlinking.domain.usecase.ValidateConnectUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.identity.domain.IdentitySessionTransfer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingReducer> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.partnerlinking.domain.usecase.ValidateConnectUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.identity.domain.IdentitySessionTransfer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingReducer> provider3) {
        return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel newInstance(com.paypal.oslo.feature.identity.connect.partnerlinking.domain.usecase.ValidateConnectUseCase validateConnectUseCase, com.paypal.oslo.core.identity.domain.IdentitySessionTransfer identitySessionTransfer, com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingReducer partnerLinkingReducer) {
        return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingViewModel(validateConnectUseCase, identitySessionTransfer, partnerLinkingReducer);
    }
}
