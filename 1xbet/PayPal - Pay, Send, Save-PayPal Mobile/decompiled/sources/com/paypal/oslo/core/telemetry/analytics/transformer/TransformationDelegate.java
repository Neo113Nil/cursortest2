package com.paypal.oslo.core.telemetry.analytics.transformer;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0016\u0010\t\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b0\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/transformer/TransformationDelegate;", "", "<init>", "()V", "T", "", "contexts", "", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/ContextTransformer;", "transformers", "execute", "(Ljava/util/List;Ljava/util/Set;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransformationDelegate {
    public static final int $stable = 0;

    @javax.inject.Inject
    public TransformationDelegate() {
    }

    public final <T> T execute(java.util.List<? extends java.lang.Object> contexts, java.util.Set<? extends com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, ? extends T>> transformers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contexts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transformers, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : contexts) {
            for (com.paypal.oslo.core.telemetry.analytics.transformer.ContextTransformer<?, ? extends T> contextTransformer : transformers) {
                if (contextTransformer.canHandle(obj)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(contextTransformer, "");
                    arrayList.add(contextTransformer.transform(obj));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        T t = (T) kotlin.collections.CollectionsKt.first((java.util.List) arrayList);
        if (!(t instanceof java.util.Map)) {
            return t;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (T t2 : arrayList) {
            if (t2 instanceof java.util.Map) {
                arrayList2.add(t2);
            }
        }
        java.util.Iterator<T> it = arrayList2.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll((java.util.Map) it.next());
        }
        return (T) linkedHashMap;
    }
}
