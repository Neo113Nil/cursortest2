package com.paypal.oslo.core.telemetry.vendors.pie.transformer;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\u00020\n2\u001b\u0010\u0007\u001a\u0017\u0012\u0013\u0012\u0011\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00060\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/pie/transformer/PieContextRegistryModule;", "", "<init>", "()V", "", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/ContextTransformer;", "Lkotlin/jvm/JvmSuppressWildcards;", "transformers", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/TransformationDelegate;", "delegate", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", "provideRegistry", "(Ljava/util/Set;Lcom/paypal/oslo/core/telemetry/analytics/transformer/TransformationDelegate;)Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", "provideSORContextTransformer", "()Lcom/paypal/oslo/core/telemetry/analytics/transformer/ContextTransformer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes2.dex */
public final class PieContextRegistryModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.core.telemetry.vendors.pie.transformer.PieContextRegistryModule INSTANCE = new com.paypal.oslo.core.telemetry.vendors.pie.transformer.PieContextRegistryModule();

    private PieContextRegistryModule() {
    }

    @dagger.Provides
    @com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsProviderKey(com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType.PIE)
    @dagger.multibindings.IntoMap
    public final com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry provideRegistry(java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> transformers, com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transformers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "");
        return new com.paypal.oslo.core.telemetry.analytics.transformer.DefaultAnalyticsTransformerRegistry(transformers, delegate);
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideSORContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.pie.transformer.PieContextRegistryModule$provideSORContextTransformer$$inlined$defaultTransformer$1 pieContextRegistryModule$provideSORContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.pie.transformer.PieContextRegistryModule$provideSORContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext sORContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sORContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(sORContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.pie.transformer.PieContextRegistryModule$provideSORContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }
}
