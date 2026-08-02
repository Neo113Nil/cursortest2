package com.paypal.oslo.feature.identity.challenges.stepupsna.data.network;

/* loaded from: classes12.dex */
public final class CellularNetworkManager_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private CellularNetworkManager_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.identity.challenges.stepupsna.data.network.CellularNetworkManager(context);
    }
}
