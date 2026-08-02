package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\u000f\u001a\u00020\u000e2)\u0010\r\u001a%\u0012\u001b\u0012\u0019\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u000f\u0010\u0010R,\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\n0\u00118!X \u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsChainHolder;", "", "<init>", "()V", "T", "Lcom/paypal/pds/analytics/TypedKey;", "key", "get", "(Lcom/paypal/pds/analytics/TypedKey;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "visitor", "", "traverseAncestors", "(Lkotlin/jvm/functions/Function1;)V", "", "getChain$analytics_release", "()Ljava/util/List;", "chain"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AnalyticsChainHolder {
    public static final int $stable = 0;

    public abstract java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> getChain$analytics_release();

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T get(com.paypal.pds.analytics.TypedKey<T> key) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.util.Iterator<T> it = getChain$analytics_release().iterator();
        do {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object obj = ((java.util.Map) it.next()).get(key);
            if (obj != 0 && key.getType().isInstance(obj)) {
                t = obj;
            }
        } while (t == null);
        return t;
    }

    public final void traverseAncestors(kotlin.jvm.functions.Function1<? super java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object>, java.lang.Boolean> visitor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visitor, "");
        java.util.Iterator<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> it = getChain$analytics_release().iterator();
        while (it.hasNext() && visitor.invoke(it.next()).booleanValue()) {
        }
    }
}
