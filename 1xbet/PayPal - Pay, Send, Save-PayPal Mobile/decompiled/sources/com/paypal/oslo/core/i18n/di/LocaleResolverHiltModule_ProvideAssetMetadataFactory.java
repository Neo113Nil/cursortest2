package com.paypal.oslo.core.i18n.di;

/* loaded from: classes4.dex */
public final class LocaleResolverHiltModule_ProvideAssetMetadataFactory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighSpeedVideoFpsRanges;

    private LocaleResolverHiltModule_ProvideAssetMetadataFactory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata get() {
        return provideAssetMetadata(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.i18n.di.LocaleResolverHiltModule_ProvideAssetMetadataFactory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<kotlinx.serialization.json.Json> provider2) {
        return new com.paypal.oslo.core.i18n.di.LocaleResolverHiltModule_ProvideAssetMetadataFactory(provider, provider2);
    }

    public static com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata provideAssetMetadata(android.content.Context context, kotlinx.serialization.json.Json json) {
        return (com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.i18n.di.LocaleResolverHiltModule.INSTANCE.provideAssetMetadata(context, json));
    }
}
