package kotlinx.atomicfu;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u000b"}, d2 = {"Lkotlinx/atomicfu/AtomicBoolean;", "", "", "v", "Lkotlinx/atomicfu/TraceBase;", "trace", "<init>", "(ZLkotlinx/atomicfu/TraceBase;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "lazySet", "(Z)V", "expect", "update", "compareAndSet", "(ZZ)Z", "getAndSet", "(Z)Z", "", "toString", "()Ljava/lang/String;", "Lkotlinx/atomicfu/TraceBase;", "getTrace", "()Lkotlinx/atomicfu/TraceBase;", "getTrace$annotations", "()V", "", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getValue", "()Z", "setValue", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AtomicBoolean {
    private static final kotlinx.atomicfu.AtomicBoolean.Companion Companion = new kotlinx.atomicfu.AtomicBoolean.Companion(null);
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater<kotlinx.atomicfu.AtomicBoolean> getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.atomicfu.AtomicBoolean.class, "getHighSpeedVideoFpsRanges");

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private volatile int getHighSpeedVideoSizes;
    private final kotlinx.atomicfu.TraceBase trace;

    @kotlin.Deprecated(message = "The property was intended for internal use only and will be hidden in the future release.")
    public static /* synthetic */ void getTrace$annotations() {
    }

    public AtomicBoolean(boolean z, kotlinx.atomicfu.TraceBase traceBase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceBase, "");
        this.trace = traceBase;
        this.getHighSpeedVideoSizes = z ? 1 : 0;
    }

    public final kotlinx.atomicfu.TraceBase getTrace() {
        return this.trace;
    }

    public final boolean getValue() {
        return this.getHighSpeedVideoSizes != 0;
    }

    public final void setValue(boolean z) {
        this.getHighSpeedVideoSizes = z ? 1 : 0;
        if (this.trace != kotlinx.atomicfu.TraceBase.None.INSTANCE) {
            kotlinx.atomicfu.TraceBase traceBase = this.trace;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("set(");
            sb.append(z);
            sb.append(')');
            traceBase.append(sb.toString());
        }
    }

    public final void lazySet(boolean value) {
        getHighResolutionOutputSizeshNQ4ISI.lazySet(this, value ? 1 : 0);
        if (this.trace != kotlinx.atomicfu.TraceBase.None.INSTANCE) {
            kotlinx.atomicfu.TraceBase traceBase = this.trace;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("lazySet(");
            sb.append(value);
            sb.append(')');
            traceBase.append(sb.toString());
        }
    }

    public final boolean compareAndSet(boolean expect, boolean update) {
        boolean compareAndSet = getHighResolutionOutputSizeshNQ4ISI.compareAndSet(this, expect ? 1 : 0, update ? 1 : 0);
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

    public final boolean getAndSet(boolean value) {
        int andSet = getHighResolutionOutputSizeshNQ4ISI.getAndSet(this, value ? 1 : 0);
        if (this.trace != kotlinx.atomicfu.TraceBase.None.INSTANCE) {
            kotlinx.atomicfu.TraceBase traceBase = this.trace;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("getAndSet(");
            sb.append(value);
            sb.append("):");
            sb.append(andSet);
            traceBase.append(sb.toString());
        }
        return andSet == 1;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(getValue());
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R,\u0010\u0006\u001a\u001a\u0012\b\u0012\u0006*\u00020\u00050\u0005*\f\u0012\b\u0012\u0006*\u00020\u00050\u00050\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/atomicfu/AtomicBoolean$Companion;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;", "Lkotlinx/atomicfu/AtomicBoolean;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
