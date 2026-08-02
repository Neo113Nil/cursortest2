package com.paypal.oslo.core.telemetry.analytics.transformer;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\"\b\u0007\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\n\u0010\u000bR%\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsRegistryResolver;", "", "", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/ProviderType;", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", "Lkotlin/jvm/JvmSuppressWildcards;", "registries", "<init>", "(Ljava/util/Map;)V", "type", "getRegistry$telemetry_release", "(Lcom/paypal/oslo/core/telemetry/analytics/transformer/ProviderType;)Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AnalyticsRegistryResolver {
    public static final int $stable = 8;
    private final java.util.Map<com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType, com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public AnalyticsRegistryResolver(java.util.Map<com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType, com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighResolutionOutputSizeshNQ4ISI = map;
    }

    public final com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry getRegistry$telemetry_release(com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry analyticsTransformerRegistry = this.getHighResolutionOutputSizeshNQ4ISI.get(type);
        if (analyticsTransformerRegistry != null) {
            return analyticsTransformerRegistry;
        }
        throw new java.lang.IllegalArgumentException("No registry registered for provider type ".concat(java.lang.String.valueOf(type)).toString());
    }
}
