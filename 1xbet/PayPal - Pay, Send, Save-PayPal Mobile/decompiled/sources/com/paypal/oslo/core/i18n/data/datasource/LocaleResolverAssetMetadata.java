package com.paypal.oslo.core.i18n.data.datasource;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00118WX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/i18n/data/datasource/LocaleResolverAssetMetadata;", "Lcom/paypal/oslo/core/i18n/data/datasource/DataSource;", "Landroid/content/Context;", "context", "Lkotlinx/serialization/json/Json;", "json", "<init>", "(Landroid/content/Context;Lkotlinx/serialization/json/Json;)V", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/json/Json;", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolverMetaData;", "localeResolverMetadata$delegate", "Lkotlin/Lazy;", "getLocaleResolverMetadata", "()Lcom/paypal/oslo/core/i18n/domain/model/LocaleResolverMetaData;", "localeResolverMetadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocaleResolverAssetMetadata implements com.paypal.oslo.core.i18n.data.datasource.DataSource {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.serialization.json.Json Camera2StreamConfigurationMap;

    /* renamed from: localeResolverMetadata$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy localeResolverMetadata;

    @javax.inject.Inject
    public LocaleResolverAssetMetadata(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, kotlinx.serialization.json.Json json) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        this.getHighSpeedVideoSizes = context;
        this.Camera2StreamConfigurationMap = json;
        this.getHighSpeedVideoFpsRanges = "LocaleResolver.json";
        this.localeResolverMetadata = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata.Camera2StreamConfigurationMap(com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata.this);
                return Camera2StreamConfigurationMap;
            }
        });
    }

    @Override // com.paypal.oslo.core.i18n.data.datasource.DataSource
    public final com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData getLocaleResolverMetadata() {
        return (com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData) this.localeResolverMetadata.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData Camera2StreamConfigurationMap(com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata localeResolverAssetMetadata) {
        try {
            java.io.InputStream open = localeResolverAssetMetadata.getHighSpeedVideoSizes.getResources().getAssets().open(localeResolverAssetMetadata.getHighSpeedVideoFpsRanges);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(open, "");
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(open, kotlin.text.Charsets.UTF_8), 8192);
            try {
                java.lang.String readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
                kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                kotlinx.serialization.json.Json json = localeResolverAssetMetadata.Camera2StreamConfigurationMap;
                json.getSerializersModule();
                return (com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData) json.decodeFromString(com.paypal.oslo.core.i18n.domain.model.LocaleResolverMetaData.INSTANCE.serializer(), readText);
            } finally {
            }
        } catch (java.io.IOException e) {
            com.paypal.oslo.core.i18n.LoggerKt.log.e(java.lang.String.valueOf(e.getMessage()), e);
            return null;
        } catch (kotlinx.serialization.SerializationException e2) {
            com.paypal.oslo.core.i18n.LoggerKt.log.e(java.lang.String.valueOf(e2.getMessage()), e2);
            return null;
        }
    }
}
