package com.paypal.oslo.core.telemetry.analytics.transformer;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001J&\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u000b\u001a\u00020\u00038CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsRegistryDelegateKt$analyticsRegistry$1;", "Lkotlin/properties/ReadOnlyProperty;", "", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AnalyticsRegistryDelegateKt$analyticsRegistry$1 implements kotlin.properties.ReadOnlyProperty<java.lang.Object, com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;

    AnalyticsRegistryDelegateKt$analyticsRegistry$1(final com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver analyticsRegistryResolver, final com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType providerType) {
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryDelegateKt$analyticsRegistry$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry registry$telemetry_release;
                registry$telemetry_release = com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsRegistryResolver.this.getRegistry$telemetry_release(providerType);
                return registry$telemetry_release;
            }
        });
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final /* bridge */ /* synthetic */ com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry getValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty) {
        return getValue(obj, (kotlin.reflect.KProperty<?>) kProperty);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.properties.ReadOnlyProperty
    public final com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry getValue(java.lang.Object thisRef, kotlin.reflect.KProperty<?> property) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        return (com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry) this.getHighSpeedVideoFpsRanges.getValue();
    }
}
