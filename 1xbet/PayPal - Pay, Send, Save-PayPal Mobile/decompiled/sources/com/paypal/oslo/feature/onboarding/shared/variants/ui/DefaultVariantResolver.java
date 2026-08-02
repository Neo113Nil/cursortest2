package com.paypal.oslo.feature.onboarding.shared.variants.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00032\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/shared/variants/ui/DefaultVariantResolver;", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantResolver;", "", "Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantKey;", "", "variantMappings", "Landroid/content/res/Resources;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "<init>", "(Ljava/util/Map;Landroid/content/res/Resources;)V", "key", "", "", "formatArgs", "", "text-sTNpmkc", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "text", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/res/Resources;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DefaultVariantResolver implements com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantResolver {
    public static final int $stable = 8;
    private final java.util.Map<com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey, java.lang.Integer> Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.res.Resources getHighSpeedVideoSizes;

    public DefaultVariantResolver(java.util.Map<com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey, java.lang.Integer> map, android.content.res.Resources resources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resources, "");
        this.Camera2StreamConfigurationMap = map;
        this.getHighSpeedVideoSizes = resources;
    }

    @Override // com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantResolver
    /* renamed from: text-sTNpmkc */
    public final java.lang.String mo16199textsTNpmkc(java.lang.String key, java.lang.Object... formatArgs) {
        java.lang.String string;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatArgs, "");
        java.lang.Integer num = this.Camera2StreamConfigurationMap.get(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16192boximpl(key));
        if (num == null) {
            return key;
        }
        try {
            if (formatArgs.length == 0) {
                string = this.getHighSpeedVideoSizes.getString(num.intValue());
            } else {
                string = this.getHighSpeedVideoSizes.getString(num.intValue(), java.util.Arrays.copyOf(formatArgs, formatArgs.length));
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(string);
            return string;
        } catch (android.content.res.Resources.NotFoundException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.onboarding.LoggerKt.log, "Resource not found for variant key", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("variantKey", key), kotlin.TuplesKt.to("stringResId", num)), null, e, 4, null);
            return key;
        }
    }
}
