package com.paypal.oslo.feature.consumerprivacy.ui.mapper;

/* loaded from: classes12.dex */
public final class ConnectedAppsMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.ui.mapper.ConnectedAppsMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.PermissionStringResolver> getHighSpeedVideoSizes;

    private ConnectedAppsMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.PermissionStringResolver> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.ui.mapper.ConnectedAppsMapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.mapper.ConnectedAppsMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.PermissionStringResolver> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.mapper.ConnectedAppsMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.ui.mapper.ConnectedAppsMapper newInstance(com.paypal.oslo.feature.consumerprivacy.domain.PermissionStringResolver permissionStringResolver) {
        return new com.paypal.oslo.feature.consumerprivacy.ui.mapper.ConnectedAppsMapper(permissionStringResolver);
    }
}
