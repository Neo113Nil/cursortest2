package com.paypal.oslo.core.telemetry.vendors.adobe;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\u00020\n2\u001b\u0010\u0007\u001a\u0017\u0012\u0013\u0012\u0011\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00060\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0010\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0011\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u000eJ\u0019\u0010\u0012\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u0019\u0010\u0013\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u0013\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeContextRegistryModule;", "", "<init>", "()V", "", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/ContextTransformer;", "Lkotlin/jvm/JvmSuppressWildcards;", "transformers", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/TransformationDelegate;", "delegate", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", "provideRegistry", "(Ljava/util/Set;Lcom/paypal/oslo/core/telemetry/analytics/transformer/TransformationDelegate;)Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", "provideUIContextTransformer", "()Lcom/paypal/oslo/core/telemetry/analytics/transformer/ContextTransformer;", "provideAppContextTransformer", "provideTechnicalContextTransformer", "provideUserIntentContextTransformer", "provideMetadataContextTransformer", "provideUserContextTransformer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes2.dex */
public final class AdobeContextRegistryModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule INSTANCE = new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule();

    private AdobeContextRegistryModule() {
    }

    @dagger.Provides
    @com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsProviderKey(com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType.ADOBE)
    @dagger.multibindings.IntoMap
    public final com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry provideRegistry(java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> transformers, com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transformers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "");
        return new com.paypal.oslo.core.telemetry.analytics.transformer.DefaultAnalyticsTransformerRegistry(transformers, delegate);
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideUIContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideUIContextTransformer$$inlined$defaultTransformer$1 adobeContextRegistryModule$provideUIContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideUIContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext uIContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(uIContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideUIContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideAppContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideAppContextTransformer$$inlined$defaultTransformer$1 adobeContextRegistryModule$provideAppContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideAppContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext applicationContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(applicationContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideAppContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideTechnicalContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideTechnicalContextTransformer$$inlined$defaultTransformer$1 adobeContextRegistryModule$provideTechnicalContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TechnicalContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideTechnicalContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TechnicalContext technicalContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(technicalContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TechnicalContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(technicalContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TechnicalContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideTechnicalContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TechnicalContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TechnicalContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TechnicalContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TechnicalContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideUserIntentContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideUserIntentContextTransformer$$inlined$defaultTransformer$1 adobeContextRegistryModule$provideUserIntentContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideUserIntentContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userIntentContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(userIntentContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideUserIntentContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideMetadataContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideMetadataContextTransformer$$inlined$defaultTransformer$1 adobeContextRegistryModule$provideMetadataContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideMetadataContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext metadataContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(metadataContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideMetadataContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideUserContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideUserContextTransformer$$inlined$defaultTransformer$1 adobeContextRegistryModule$provideUserContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideUserContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext userContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(userContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.adobe.AdobeContextRegistryModule$provideUserContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }
}
