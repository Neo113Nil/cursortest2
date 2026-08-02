package com.paypal.oslo.core.telemetry.analytics.transformer;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsRegistryResolver;", "resolver", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/ProviderType;", "type", "Lkotlin/properties/ReadOnlyProperty;", "", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", "analyticsRegistry", "(Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsRegistryResolver;Lcom/paypal/oslo/core/telemetry/analytics/transformer/ProviderType;)Lkotlin/properties/ReadOnlyProperty;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AnalyticsRegistryDelegateKt {
    public static final kotlin.properties.ReadOnlyProperty<java.lang.Object, com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry> analyticsRegistry(com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver analyticsRegistryResolver, com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType providerType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsRegistryResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerType, "");
        return new com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryDelegateKt$analyticsRegistry$1(analyticsRegistryResolver, providerType);
    }
}
