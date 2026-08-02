package com.paypal.oslo.app.georestriction;

/* loaded from: classes10.dex */
public final class GeoRestrictionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.app.georestriction.GeoRestrictionViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRangesFor;

    private GeoRestrictionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.georestriction.GeoRestrictionViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.app.georestriction.GeoRestrictionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.app.georestriction.GeoRestrictionViewModel_Factory(provider);
    }

    public static com.paypal.oslo.app.georestriction.GeoRestrictionViewModel newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.app.georestriction.GeoRestrictionViewModel(featureGate);
    }
}
