package com.paypal.oslo.core.telemetry.analytics.context;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u00020\u000b2\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\t\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/context/ContextKeyCache;", "", "<init>", "()V", "Lkotlin/reflect/KClass;", "contextClass", "Lcom/paypal/oslo/core/telemetry/analytics/context/ContextKeyMetadata;", "getMetadata", "(Lkotlin/reflect/KClass;)Lcom/paypal/oslo/core/telemetry/analytics/context/ContextKeyMetadata;", "", "contextClasses", "", "warmup", "([Lkotlin/reflect/KClass;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/ConcurrentHashMap;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContextKeyCache {
    public static final com.paypal.oslo.core.telemetry.analytics.context.ContextKeyCache INSTANCE = new com.paypal.oslo.core.telemetry.analytics.context.ContextKeyCache();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.util.concurrent.ConcurrentHashMap<kotlin.reflect.KClass<?>, com.paypal.oslo.core.telemetry.analytics.context.ContextKeyMetadata> getHighSpeedVideoSizes = new java.util.concurrent.ConcurrentHashMap<>();
    public static final int $stable = 8;

    private ContextKeyCache() {
    }

    public final com.paypal.oslo.core.telemetry.analytics.context.ContextKeyMetadata getMetadata(kotlin.reflect.KClass<?> contextClass) {
        java.lang.Object obj;
        java.lang.String key;
        java.lang.Object obj2;
        java.lang.String name2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextClass, "");
        java.util.concurrent.ConcurrentHashMap<kotlin.reflect.KClass<?>, com.paypal.oslo.core.telemetry.analytics.context.ContextKeyMetadata> concurrentHashMap = getHighSpeedVideoSizes;
        com.paypal.oslo.core.telemetry.analytics.context.ContextKeyMetadata contextKeyMetadata = concurrentHashMap.get(contextClass);
        if (contextKeyMetadata == null) {
            java.util.Iterator<T> it = contextClass.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((java.lang.annotation.Annotation) obj) instanceof com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey) {
                    break;
                }
            }
            com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey contextKey = (com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey) obj;
            if (contextKey == null || (key = contextKey.key()) == null) {
                java.lang.String simpleName = contextClass.getSimpleName();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Class ");
                sb.append(simpleName);
                sb.append(" must be annotated with @ContextKey");
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            java.util.Collection<kotlin.reflect.KProperty1> memberProperties = kotlin.reflect.full.KClasses.getMemberProperties(contextClass);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(memberProperties, 10)), 16));
            for (kotlin.reflect.KProperty1 kProperty1 : memberProperties) {
                java.util.Iterator<T> it2 = kProperty1.getAnnotations().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (((java.lang.annotation.Annotation) obj2) instanceof com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey) {
                        break;
                    }
                }
                com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey attributeKey = (com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey) obj2;
                if (attributeKey == null || (name2 = attributeKey.key()) == null) {
                    name2 = kProperty1.getName();
                }
                java.lang.String name3 = kProperty1.getName();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(key);
                sb2.append(".");
                sb2.append(name2);
                kotlin.Pair pair = kotlin.TuplesKt.to(name3, sb2.toString());
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            com.paypal.oslo.core.telemetry.analytics.context.ContextKeyMetadata contextKeyMetadata2 = new com.paypal.oslo.core.telemetry.analytics.context.ContextKeyMetadata(key, linkedHashMap);
            contextKeyMetadata = concurrentHashMap.putIfAbsent(contextClass, contextKeyMetadata2);
            if (contextKeyMetadata == null) {
                contextKeyMetadata = contextKeyMetadata2;
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextKeyMetadata, "");
        return contextKeyMetadata;
    }

    public final void warmup(kotlin.reflect.KClass<?>... contextClasses) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextClasses, "");
        for (kotlin.reflect.KClass<?> kClass : contextClasses) {
            INSTANCE.getMetadata(kClass);
        }
    }
}
