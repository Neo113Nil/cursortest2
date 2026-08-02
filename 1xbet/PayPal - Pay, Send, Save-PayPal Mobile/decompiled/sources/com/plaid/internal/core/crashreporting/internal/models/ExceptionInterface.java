package com.plaid.internal.core.crashreporting.internal.models;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0012\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0004\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionInterface;", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V", "Ljava/util/Queue;", "Lcom/plaid/internal/core/crashreporting/internal/models/ExceptionModel;", "exceptions", "(Ljava/util/Queue;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getInterfaceName", "interfaceName", "values", "Ljava/util/Queue;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ExceptionInterface {
    public static final java.lang.String EXCEPTION_INTERFACE = "sentry.interfaces.Exception";
    private final java.util.Queue<com.plaid.internal.core.crashreporting.internal.models.ExceptionModel> values;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExceptionInterface(java.lang.Throwable th) {
        this(com.plaid.internal.core.crashreporting.internal.models.ExceptionModel.INSTANCE.extractExceptionQueue(th));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(com.plaid.internal.core.crashreporting.internal.models.ExceptionInterface.class, other.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(this.values, ((com.plaid.internal.core.crashreporting.internal.models.ExceptionInterface) other).values);
    }

    public final java.lang.String getInterfaceName() {
        return EXCEPTION_INTERFACE;
    }

    public final int hashCode() {
        return this.values.hashCode();
    }

    public final java.lang.String toString() {
        java.util.Queue<com.plaid.internal.core.crashreporting.internal.models.ExceptionModel> queue = this.values;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExceptionInterface{exceptions=");
        sb.append(queue);
        sb.append("}");
        return sb.toString();
    }

    private ExceptionInterface(java.util.Queue<com.plaid.internal.core.crashreporting.internal.models.ExceptionModel> queue) {
        java.util.List reversed = kotlin.collections.CollectionsKt.reversed(queue);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = reversed.iterator();
        while (it.hasNext()) {
            linkedList.add((com.plaid.internal.core.crashreporting.internal.models.ExceptionModel) it.next());
        }
        this.values = linkedList;
    }
}
