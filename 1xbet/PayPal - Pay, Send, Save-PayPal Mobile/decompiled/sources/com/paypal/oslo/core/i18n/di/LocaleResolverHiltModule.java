package com.paypal.oslo.core.i18n.di;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/i18n/di/LocaleResolverHiltModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lkotlinx/serialization/json/Json;", "json", "Lcom/paypal/oslo/core/i18n/data/datasource/LocaleResolverAssetMetadata;", "provideAssetMetadata", "(Landroid/content/Context;Lkotlinx/serialization/json/Json;)Lcom/paypal/oslo/core/i18n/data/datasource/LocaleResolverAssetMetadata;", "assetMetadata", "Lcom/paypal/oslo/core/i18n/domain/repository/LocaleResolverRepository;", "provideLocaleResolverRepository", "(Lcom/paypal/oslo/core/i18n/data/datasource/LocaleResolverAssetMetadata;)Lcom/paypal/oslo/core/i18n/domain/repository/LocaleResolverRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class LocaleResolverHiltModule {
    public static final com.paypal.oslo.core.i18n.di.LocaleResolverHiltModule INSTANCE = new com.paypal.oslo.core.i18n.di.LocaleResolverHiltModule();

    private LocaleResolverHiltModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata provideAssetMetadata(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        return new com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata(context, json);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository provideLocaleResolverRepository(com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata assetMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetMetadata, "");
        return new com.paypal.oslo.core.i18n.data.repository.LocaleResolverRepositoryImpl(assetMetadata);
    }
}
