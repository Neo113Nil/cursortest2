package com.paypal.oslo.core.i18n.data.datasource;

/* loaded from: classes10.dex */
public final class LocaleResolverAssetMetadata_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighSpeedVideoFpsRangesFor;

    private LocaleResolverAssetMetadata_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2) {
        return new com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata newInstance(android.content.Context context, kotlinx.serialization.json.Json json) {
        return new com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata(context, json);
    }
}
