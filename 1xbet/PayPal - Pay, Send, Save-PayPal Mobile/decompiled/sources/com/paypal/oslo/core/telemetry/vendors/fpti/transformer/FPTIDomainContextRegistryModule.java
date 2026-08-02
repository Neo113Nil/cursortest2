package com.paypal.oslo.core.telemetry.vendors.fpti.transformer;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u0019\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/transformer/FPTIDomainContextRegistryModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/ContextTransformer;", "provideTransactionContextTransformer", "()Lcom/paypal/oslo/core/telemetry/analytics/transformer/ContextTransformer;", "provideMerchantContextTransformer", "provideAuthenticationContextTransformer", "provideSORContextTransformer", "provideFundingInstrumentContextTransformer", "provideNotificationContextTransformer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class FPTIDomainContextRegistryModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule INSTANCE = new com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule();

    private FPTIDomainContextRegistryModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideTransactionContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule$provideTransactionContextTransformer$$inlined$defaultTransformer$1 fPTIDomainContextRegistryModule$provideTransactionContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.TransactionContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule$provideTransactionContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.TransactionContext transactionContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.TransactionContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(transactionContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.TransactionContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule$provideTransactionContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.TransactionContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.TransactionContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.TransactionContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.TransactionContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideMerchantContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule$provideMerchantContextTransformer$$inlined$defaultTransformer$1 fPTIDomainContextRegistryModule$provideMerchantContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule$provideMerchantContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext merchantContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(merchantContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule$provideMerchantContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.MerchantContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideAuthenticationContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule$provideAuthenticationContextTransformer$$inlined$defaultTransformer$1 fPTIDomainContextRegistryModule$provideAuthenticationContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.AuthenticationContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule$provideAuthenticationContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.AuthenticationContext authenticationContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.AuthenticationContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(authenticationContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.AuthenticationContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule$provideAuthenticationContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.AuthenticationContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.AuthenticationContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.AuthenticationContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.AuthenticationContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideSORContextTransformer() {
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule.$r8$lambda$Pa3uNV5NHO5gc0JXydKfUx68KZY((com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext) obj);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule$provideSORContextTransformer$$inlined$contextTransformer$1
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

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideFundingInstrumentContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule$provideFundingInstrumentContextTransformer$$inlined$defaultTransformer$1 fPTIDomainContextRegistryModule$provideFundingInstrumentContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.FundingInstrumentContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule$provideFundingInstrumentContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.FundingInstrumentContext fundingInstrumentContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.FundingInstrumentContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(fundingInstrumentContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.FundingInstrumentContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule$provideFundingInstrumentContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.FundingInstrumentContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.FundingInstrumentContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.FundingInstrumentContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.FundingInstrumentContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, java.lang.Object> provideNotificationContextTransformer() {
        final com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule$provideNotificationContextTransformer$$inlined$defaultTransformer$1 fPTIDomainContextRegistryModule$provideNotificationContextTransformer$$inlined$defaultTransformer$1 = new kotlin.jvm.functions.Function1<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule$provideNotificationContextTransformer$$inlined$defaultTransformer$1
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext notificationContext) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationContext, "");
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                for (kotlin.reflect.KProperty1 kProperty1 : kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext.class))) {
                    com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(notificationContext), createMapBuilder);
                }
                return kotlin.collections.MapsKt.build(createMapBuilder);
            }
        };
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.vendors.fpti.transformer.FPTIDomainContextRegistryModule$provideNotificationContextTransformer$$inlined$defaultTransformer$2
            private final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext> type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext.class);

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.NotificationContext context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    public static /* synthetic */ java.util.Map $r8$lambda$Pa3uNV5NHO5gc0JXydKfUx68KZY(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORContext sORContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sORContext, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        for (java.util.Map.Entry<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType, com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference> entry : sORContext.getReferences().entrySet()) {
            com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType key = entry.getKey();
            com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORReference value = entry.getValue();
            java.lang.String key2 = key.getKey();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("sor.");
            sb.append(key2);
            sb.append(".id");
            createMapBuilder.put(sb.toString(), value.getId());
        }
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }
}
