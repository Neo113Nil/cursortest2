package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi;

/* loaded from: classes12.dex */
public final class DebitCardManagementReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementReducer> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager> Camera2StreamConfigurationMap;

    private DebitCardManagementReducer_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementReducer get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementReducer_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager> provider) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementReducer_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementReducer newInstance(com.paypal.oslo.feature.debitcard.shared.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementReducer(featureGateManager);
    }
}
