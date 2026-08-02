package kotlinx.atomicfu;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 '2\u00020\u0001:\u0001'B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0015\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0011J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u001a\u0010\nJ\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u001b\u0010\nJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\n"}, d2 = {"Lkotlinx/atomicfu/AtomicInt;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlinx/atomicfu/TraceBase;", "trace", "<init>", "(ILkotlinx/atomicfu/TraceBase;)V", "", "lazySet", "(I)V", "expect", "update", "", "compareAndSet", "(II)Z", "getAndSet", "(I)I", "getAndIncrement", "()I", "getAndDecrement", "delta", "getAndAdd", "addAndGet", "incrementAndGet", "decrementAndGet", "plusAssign", "minusAssign", "", "toString", "()Ljava/lang/String;", "Lkotlinx/atomicfu/TraceBase;", "getTrace", "()Lkotlinx/atomicfu/TraceBase;", "getTrace$annotations", "()V", com.visa.cbp.getEncExpo.warmup, "getValue", "setValue", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AtomicInt {
    private static final kotlinx.atomicfu.AtomicInt.Companion Companion = new kotlinx.atomicfu.AtomicInt.Companion(null);
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<kotlinx.atomicfu.AtomicInt> getHighSpeedVideoFpsRangesFor = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.atomicfu.AtomicInt.class, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
    private final kotlinx.atomicfu.TraceBase trace;
    private volatile int value;

    @kotlin.Deprecated(message = "The property was intended for internal use only and will be hidden in the future release.")
    public static /* synthetic */ void getTrace$annotations() {
    }

    public AtomicInt(int i, kotlinx.atomicfu.TraceBase traceBase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceBase, "");
        this.trace = traceBase;
        this.value = i;
    }

    public final kotlinx.atomicfu.TraceBase getTrace() {
        return this.trace;
    }

    public final int getValue() {
        return this.value;
    }

    public final void setValue(int i) {
        this.value = i;
        if (this.trace != kotlinx.atomicfu.TraceBase.None.INSTANCE) {
            kotlinx.atomicfu.TraceBase traceBase = this.trace;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("set(");
            sb.append(i);
            sb.append(')');
            traceBase.append(sb.toString());
        }
    }

    public final void lazySet(int value) {
        getHighSpeedVideoFpsRangesFor.lazySet(this, value);
        if (this.trace != kotlinx.atomicfu.TraceBase.None.INSTANCE) {
            kotlinx.atomicfu.TraceBase traceBase = this.trace;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("lazySet(");
            sb.append(value);
            sb.append(')');
            traceBase.append(sb.toString());
        }
    }

    public final boolean compareAndSet(int expect, int update) {
        boolean compareAndSet = getHighSpeedVideoFpsRangesFor.compareAndSet(this, expect, update);
        if (compareAndSet && this.trace != kotlinx.atomicfu.TraceBase.None.INSTANCE) {
            kotlinx.atomicfu.TraceBase traceBase = this.trace;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CAS(");
            sb.append(expect);
            sb.append(", ");
            sb.append(update);
            sb.append(')');
            traceBase.append(sb.toString());
        }
        return compareAndSet;
    }

    public final int getAndSet(int value) {
        int andSet = getHighSpeedVideoFpsRangesFor.getAndSet(this, value);
        if (this.trace != kotlinx.atomicfu.TraceBase.None.INSTANCE) {
            kotlinx.atomicfu.TraceBase traceBase = this.trace;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("getAndSet(");
            sb.append(value);
            sb.append("):");
            sb.append(andSet);
            traceBase.append(sb.toString());
        }
        return andSet;
    }

    public final int getAndIncrement() {
        int andIncrement = getHighSpeedVideoFpsRangesFor.getAndIncrement(this);
        if (this.trace != kotlinx.atomicfu.TraceBase.None.INSTANCE) {
            this.trace.append("getAndInc():".concat(java.lang.String.valueOf(andIncrement)));
        }
        return andIncrement;
    }

    public final int getAndDecrement() {
        int andDecrement = getHighSpeedVideoFpsRangesFor.getAndDecrement(this);
        if (this.trace != kotlinx.atomicfu.TraceBase.None.INSTANCE) {
            this.trace.append("getAndDec():".concat(java.lang.String.valueOf(andDecrement)));
        }
        return andDecrement;
    }

    public final int getAndAdd(int delta) {
        int andAdd = getHighSpeedVideoFpsRangesFor.getAndAdd(this, delta);
        if (this.trace != kotlinx.atomicfu.TraceBase.None.INSTANCE) {
            kotlinx.atomicfu.TraceBase traceBase = this.trace;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("getAndAdd(");
            sb.append(delta);
            sb.append("):");
            sb.append(andAdd);
            traceBase.append(sb.toString());
        }
        return andAdd;
    }

    public final int addAndGet(int delta) {
        int addAndGet = getHighSpeedVideoFpsRangesFor.addAndGet(this, delta);
        if (this.trace != kotlinx.atomicfu.TraceBase.None.INSTANCE) {
            kotlinx.atomicfu.TraceBase traceBase = this.trace;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("addAndGet(");
            sb.append(delta);
            sb.append("):");
            sb.append(addAndGet);
            traceBase.append(sb.toString());
        }
        return addAndGet;
    }

    public final int incrementAndGet() {
        int incrementAndGet = getHighSpeedVideoFpsRangesFor.incrementAndGet(this);
        if (this.trace != kotlinx.atomicfu.TraceBase.None.INSTANCE) {
            this.trace.append("incAndGet():".concat(java.lang.String.valueOf(incrementAndGet)));
        }
        return incrementAndGet;
    }

    public final int decrementAndGet() {
        int decrementAndGet = getHighSpeedVideoFpsRangesFor.decrementAndGet(this);
        if (this.trace != kotlinx.atomicfu.TraceBase.None.INSTANCE) {
            this.trace.append("decAndGet():".concat(java.lang.String.valueOf(decrementAndGet)));
        }
        return decrementAndGet;
    }

    public final void plusAssign(int delta) {
        getAndAdd(delta);
    }

    public final void minusAssign(int delta) {
        getAndAdd(-delta);
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.value);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R,\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006*\u00020\u00050\u0005*\f\u0012\b\u0012\u0006*\u00020\u00050\u00050\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/atomicfu/AtomicInt$Companion;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;", "Lkotlinx/atomicfu/AtomicInt;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
