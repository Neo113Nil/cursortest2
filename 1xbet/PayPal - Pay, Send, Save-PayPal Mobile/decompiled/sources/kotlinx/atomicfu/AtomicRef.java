package kotlinx.atomicfu;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u001e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001eB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R*\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00008\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\n"}, d2 = {"Lkotlinx/atomicfu/AtomicRef;", "T", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/atomicfu/TraceBase;", "trace", "<init>", "(Ljava/lang/Object;Lkotlinx/atomicfu/TraceBase;)V", "", "lazySet", "(Ljava/lang/Object;)V", "expect", "update", "", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "getAndSet", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/atomicfu/TraceBase;", "getTrace", "()Lkotlinx/atomicfu/TraceBase;", "getTrace$annotations", "()V", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "setValue", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AtomicRef<T> {
    private static final kotlinx.atomicfu.AtomicRef.Companion Companion = new kotlinx.atomicfu.AtomicRef.Companion(null);
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<kotlinx.atomicfu.AtomicRef<?>, java.lang.Object> getHighSpeedVideoFpsRangesFor = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.atomicfu.AtomicRef.class, java.lang.Object.class, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
    private final kotlinx.atomicfu.TraceBase trace;
    private volatile T value;

    @kotlin.Deprecated(message = "The property was intended for internal use only and will be hidden in the future release.")
    public static /* synthetic */ void getTrace$annotations() {
    }

    public AtomicRef(T t, kotlinx.atomicfu.TraceBase traceBase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceBase, "");
        this.trace = traceBase;
        this.value = t;
    }

    public final kotlinx.atomicfu.TraceBase getTrace() {
        return this.trace;
    }

    public final T getValue() {
        return this.value;
    }

    public final void setValue(T t) {
        this.value = t;
        if (this.trace != kotlinx.atomicfu.TraceBase.None.INSTANCE) {
            kotlinx.atomicfu.TraceBase traceBase = this.trace;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("set(");
            sb.append(t);
            sb.append(')');
            traceBase.append(sb.toString());
        }
    }

    public final void lazySet(T value) {
        getHighSpeedVideoFpsRangesFor.lazySet(this, value);
        if (this.trace != kotlinx.atomicfu.TraceBase.None.INSTANCE) {
            kotlinx.atomicfu.TraceBase traceBase = this.trace;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("lazySet(");
            sb.append(value);
            sb.append(')');
            traceBase.append(sb.toString());
        }
    }

    public final boolean compareAndSet(T expect, T update) {
        boolean m = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRangesFor, this, expect, update);
        if (m && this.trace != kotlinx.atomicfu.TraceBase.None.INSTANCE) {
            kotlinx.atomicfu.TraceBase traceBase = this.trace;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CAS(");
            sb.append(expect);
            sb.append(", ");
            sb.append(update);
            sb.append(')');
            traceBase.append(sb.toString());
        }
        return m;
    }

    public final T getAndSet(T value) {
        T t = (T) getHighSpeedVideoFpsRangesFor.getAndSet(this, value);
        if (this.trace != kotlinx.atomicfu.TraceBase.None.INSTANCE) {
            kotlinx.atomicfu.TraceBase traceBase = this.trace;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("getAndSet(");
            sb.append(value);
            sb.append("):");
            sb.append(t);
            traceBase.append(sb.toString());
        }
        return t;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.value);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003RP\u0010\u0006\u001a>\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003*\u0006\u0012\u0002\b\u00030\u00050\u0005\u0012\b\u0012\u0006*\u00020\u00010\u0001*\u001e\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003*\u0006\u0012\u0002\b\u00030\u00050\u0005\u0012\b\u0012\u0006*\u00020\u00010\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/atomicfu/AtomicRef$Companion;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlinx/atomicfu/AtomicRef;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
