package com.paypal.oslo.core.telemetry.vendors.fpti.transformer;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\u00020\n2\u001b\u0010\u0007\u001a\u0017\u0012\u0013\u0012\u0011\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00060\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0010\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0011\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u000eJ\u0019\u0010\u0012\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\u000eJ\u0019\u0010\u0013\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u0013\u0010\u000eJ\u0019\u0010\u0014\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u000eJ\u0019\u0010\u0015\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ\u0019\u0010\u0016\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ\u0019\u0010\u0017\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u000eJ\u0019\u0010\u0018\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u0018\u0010\u000eJ\u0019\u0010\u0019\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u0019\u0010\u000eJ\u0019\u0010\u001a\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u001a\u0010\u000eJ\u0019\u0010\u001b\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u001b\u0010\u000eJ\u0019\u0010\u001c\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0004\b\u001c\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/transformer/FPTIContextRegistryModule;", "", "<init>", "()V", "", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/ContextTransformer;", "Lkotlin/jvm/JvmSuppressWildcards;", "transformers", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/TransformationDelegate;", "delegate", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", "provideRegistry", "(Ljava/util/Set;Lcom/paypal/oslo/core/telemetry/analytics/transformer/TransformationDelegate;)Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsTransformerRegistry;", "provideErrorContextTransformer", "()Lcom/paypal/oslo/core/telemetry/analytics/transformer/ContextTransformer;", "provideUIContextTransformer", "provideAppContextTransformer", "provideUserIntentContextTransformer", "provideMetadataTransformer", "provideTechnicalContextTransformer", "provideNavigationContextTransformer", "provideUserContextTransformer", "provideBusinessFlowContextTransformer", "provideTransitionTypeContextTransformer", "provideTrafficSourceContextTransformer", "provideTrafficDestinationContextTransformer", "provideDeviceInfoContextTransformer", "provideDeviceStateContextTransformer", "provideVeniceContextTransformer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes2.dex */
public final class FPTIContextRegistryModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule INSTANCE = new com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule();

    private FPTIContextRegistryModule() {
    }

    @dagger.Provides
    @com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsProviderKey(com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType.FPTI)
    @dagger.multibindings.IntoMap
    public final com.paypal.oslo.core.telemetry.analytics.transformer.AnalyticsTransformerRegistry provideRegistry(java.util.Set<com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object>> transformers, com.paypal.oslo.core.telemetry.analytics.transformer.TransformationDelegate delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transformers, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "");
        return new com.paypal.oslo.core.telemetry.analytics.transformer.DefaultAnalyticsTransformerRegistry(transformers, delegate);
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideErrorContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideErrorContextTransformer$$inlined$defaultTransformer$1 fPTIContextRegistryModule$provideErrorContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideErrorContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext errorContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(errorContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideErrorContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideUIContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideUIContextTransformer$$inlined$defaultTransformer$1 fPTIContextRegistryModule$provideUIContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideUIContextTransformer$$inlined$defaultTransformer$1
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
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideUIContextTransformer$$inlined$defaultTransformer$2
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
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideAppContextTransformer$$inlined$defaultTransformer$1 fPTIContextRegistryModule$provideAppContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideAppContextTransformer$$inlined$defaultTransformer$1
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
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.session.ApplicationContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideAppContextTransformer$$inlined$defaultTransformer$2
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
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideUserIntentContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideUserIntentContextTransformer$$inlined$defaultTransformer$1 fPTIContextRegistryModule$provideUserIntentContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideUserIntentContextTransformer$$inlined$defaultTransformer$1
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
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideUserIntentContextTransformer$$inlined$defaultTransformer$2
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
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideMetadataTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideMetadataTransformer$$inlined$defaultTransformer$1 fPTIContextRegistryModule$provideMetadataTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideMetadataTransformer$$inlined$defaultTransformer$1
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
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.MetadataContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideMetadataTransformer$$inlined$defaultTransformer$2
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
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideTechnicalContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideTechnicalContextTransformer$$inlined$defaultTransformer$1 fPTIContextRegistryModule$provideTechnicalContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TechnicalContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideTechnicalContextTransformer$$inlined$defaultTransformer$1
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
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TechnicalContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideTechnicalContextTransformer$$inlined$defaultTransformer$2
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
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideNavigationContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideNavigationContextTransformer$$inlined$defaultTransformer$1 fPTIContextRegistryModule$provideNavigationContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideNavigationContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext navigationContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(navigationContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideNavigationContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideUserContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideUserContextTransformer$$inlined$defaultTransformer$1 fPTIContextRegistryModule$provideUserContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideUserContextTransformer$$inlined$defaultTransformer$1
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
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideUserContextTransformer$$inlined$defaultTransformer$2
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

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideBusinessFlowContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideBusinessFlowContextTransformer$$inlined$defaultTransformer$1 fPTIContextRegistryModule$provideBusinessFlowContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideBusinessFlowContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext businessFlowContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessFlowContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(businessFlowContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideBusinessFlowContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideTransitionTypeContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideTransitionTypeContextTransformer$$inlined$defaultTransformer$1 fPTIContextRegistryModule$provideTransitionTypeContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideTransitionTypeContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeContext transitionTypeContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transitionTypeContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(transitionTypeContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideTransitionTypeContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.operational.TransitionTypeContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideTrafficSourceContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideTrafficSourceContextTransformer$$inlined$defaultTransformer$1 fPTIContextRegistryModule$provideTrafficSourceContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideTrafficSourceContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext trafficSourceContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trafficSourceContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(trafficSourceContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideTrafficSourceContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficSourceContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideTrafficDestinationContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideTrafficDestinationContextTransformer$$inlined$defaultTransformer$1 fPTIContextRegistryModule$provideTrafficDestinationContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideTrafficDestinationContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext trafficDestinationContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trafficDestinationContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(trafficDestinationContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideTrafficDestinationContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.standard.TrafficDestinationContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideDeviceInfoContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideDeviceInfoContextTransformer$$inlined$defaultTransformer$1 fPTIContextRegistryModule$provideDeviceInfoContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceInfoContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideDeviceInfoContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceInfoContext deviceInfoContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceInfoContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(deviceInfoContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceInfoContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideDeviceInfoContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceInfoContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceInfoContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceInfoContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceInfoContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideDeviceStateContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideDeviceStateContextTransformer$$inlined$defaultTransformer$1 fPTIContextRegistryModule$provideDeviceStateContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceStateContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideDeviceStateContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceStateContext deviceStateContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceStateContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceStateContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(deviceStateContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceStateContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideDeviceStateContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceStateContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceStateContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceStateContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceStateContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideVeniceContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideVeniceContextTransformer$$inlined$defaultTransformer$1 fPTIContextRegistryModule$provideVeniceContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.operational.VeniceContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideVeniceContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.operational.VeniceContext veniceContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(veniceContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.operational.VeniceContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(veniceContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.operational.VeniceContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIContextRegistryModule$provideVeniceContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.operational.VeniceContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.operational.VeniceContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.operational.VeniceContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.operational.VeniceContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }
}
