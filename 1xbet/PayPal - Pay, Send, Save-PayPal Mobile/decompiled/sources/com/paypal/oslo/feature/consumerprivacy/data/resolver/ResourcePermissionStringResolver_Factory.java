package com.paypal.oslo.feature.consumerprivacy.data.resolver;

/* loaded from: classes12.dex */
public final class ResourcePermissionStringResolver_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.resolver.ResourcePermissionStringResolver> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private ResourcePermissionStringResolver_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.resolver.ResourcePermissionStringResolver get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.resolver.ResourcePermissionStringResolver_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.data.resolver.ResourcePermissionStringResolver_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.resolver.ResourcePermissionStringResolver newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.consumerprivacy.data.resolver.ResourcePermissionStringResolver(context);
    }
}
