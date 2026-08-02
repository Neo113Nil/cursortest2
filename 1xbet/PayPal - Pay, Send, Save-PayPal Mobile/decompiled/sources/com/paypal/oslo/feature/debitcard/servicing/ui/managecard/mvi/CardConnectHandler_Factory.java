package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi;

/* loaded from: classes12.dex */
public final class CardConnectHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.CardConnectHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.api.CardConnectApi> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager> getHighSpeedVideoSizes;

    private CardConnectHandler_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.api.CardConnectApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.CardConnectHandler get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.CardConnectHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cardconnect.api.CardConnectApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager> provider2) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.CardConnectHandler_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.CardConnectHandler newInstance(com.paypal.oslo.feature.cardconnect.api.CardConnectApi cardConnectApi, com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.CardConnectHandler(cardConnectApi, featureGateManager);
    }
}
