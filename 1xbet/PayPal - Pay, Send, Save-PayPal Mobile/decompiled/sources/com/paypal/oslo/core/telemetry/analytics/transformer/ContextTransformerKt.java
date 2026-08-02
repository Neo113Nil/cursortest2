package com.paypal.oslo.core.telemetry.analytics.transformer;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aG\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\u0014\b\b\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a4\u0010\n\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\b0\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\u0080\b¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "T", "Lkotlin/Function1;", "block", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/ContextTransformer;", "contextTransformer", "(Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/core/telemetry/analytics/transformer/ContextTransformer;", "", "", "defaultTransformer", "()Lcom/paypal/oslo/core/telemetry/analytics/transformer/ContextTransformer;", "p0", "p1", "", "p2", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContextTransformerKt {
    public static final /* synthetic */ <C, T> com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<C, T> contextTransformer(final kotlin.jvm.functions.Function1<? super C, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<C, T>() { // from class: com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt$contextTransformer$1
            private final kotlin.reflect.KClass<C> type;

            /* JADX WARN: Multi-variable type inference failed */
            {
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA);
                this.type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<C> getType() {
                return this.type;
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final T transform(C context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return function1.invoke(context);
            }
        };
    }

    public static final /* synthetic */ <C> com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<C, java.util.Map<java.lang.String, java.lang.Object>> defaultTransformer() {
        kotlin.jvm.internal.Intrinsics.needClassReification();
        final com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt$defaultTransformer$1 contextTransformerKt$defaultTransformer$1 = com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt$defaultTransformer$1.INSTANCE;
        kotlin.jvm.internal.Intrinsics.needClassReification();
        return new com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<C, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformerKt$defaultTransformer$$inlined$contextTransformer$1
            private final kotlin.reflect.KClass<C> type;

            {
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA);
                this.type = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final /* bridge */ boolean canHandle(java.lang.Object obj) {
                return super.canHandle(obj);
            }

            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final kotlin.reflect.KClass<C> getType() {
                return this.type;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
            @Override // com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> transform(C context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return kotlin.jvm.functions.Function1.this.invoke(context);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.Object obj, java.util.Map<java.lang.String, java.lang.Object> map) {
        if (obj != null) {
            java.util.Collection<kotlin.reflect.KProperty1> memberProperties = kotlin.reflect.full.KClasses.getMemberProperties(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj.getClass()));
            if (memberProperties.isEmpty()) {
                map.put(str, obj);
                return;
            }
            boolean z = false;
            for (kotlin.reflect.KProperty1 kProperty1 : memberProperties) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(kProperty1, "");
                try {
                    try {
                        getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.telemetry.analytics.context.ContextKeysKt.key(kProperty1), kProperty1.get(obj), map);
                    } catch (java.lang.IllegalStateException unused) {
                    }
                    z = true;
                } catch (java.lang.IllegalStateException unused2) {
                }
            }
            if (z) {
                return;
            }
            map.put(str, obj);
        }
    }
}
