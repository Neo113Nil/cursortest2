package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR2\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/pds/analytics/AnalyticsEventScope;", "", "", "timestamp", "", "", "Lcom/paypal/pds/analytics/TypedKey;", "chain", "<init>", "(JLjava/util/List;)V", "J", "getTimestamp", "()J", "Ljava/util/List;", "getChain", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AnalyticsEventScope {
    public static final int $stable = 8;
    private final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> chain;
    private final long timestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticsEventScope(long j, java.util.List<? extends java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, ? extends java.lang.Object>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.timestamp = j;
        this.chain = list;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> getChain() {
        return this.chain;
    }
}
