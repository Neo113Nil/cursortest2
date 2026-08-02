package kotlinx.coroutines.debug.internal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "Ljava/io/Serializable;", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "source", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/CoroutineContext;)V", "", "coroutineId", "Ljava/lang/Long;", "getCoroutineId", "()Ljava/lang/Long;", "", "dispatcher", "Ljava/lang/String;", "getDispatcher", "()Ljava/lang/String;", "name", "getName", "state", "getState", "lastObservedThreadState", "getLastObservedThreadState", "lastObservedThreadName", "getLastObservedThreadName", "", "Ljava/lang/StackTraceElement;", "lastObservedStackTrace", "Ljava/util/List;", "getLastObservedStackTrace", "()Ljava/util/List;", "sequenceNumber", "J", "getSequenceNumber", "()J"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DebuggerInfo implements java.io.Serializable {
    private final java.lang.Long coroutineId;
    private final java.lang.String dispatcher;
    private final java.util.List<java.lang.StackTraceElement> lastObservedStackTrace;
    private final java.lang.String lastObservedThreadName;
    private final java.lang.String lastObservedThreadState;
    private final java.lang.String name;
    private final long sequenceNumber;
    private final java.lang.String state;

    public DebuggerInfo(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl debugCoroutineInfoImpl, kotlin.coroutines.CoroutineContext coroutineContext) {
        java.lang.Thread.State state;
        kotlinx.coroutines.CoroutineId coroutineId = (kotlinx.coroutines.CoroutineId) coroutineContext.get(kotlinx.coroutines.CoroutineId.INSTANCE);
        this.coroutineId = coroutineId != null ? java.lang.Long.valueOf(coroutineId.getId()) : null;
        kotlin.coroutines.ContinuationInterceptor continuationInterceptor = (kotlin.coroutines.ContinuationInterceptor) coroutineContext.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
        this.dispatcher = continuationInterceptor != null ? continuationInterceptor.toString() : null;
        kotlinx.coroutines.CoroutineName coroutineName = (kotlinx.coroutines.CoroutineName) coroutineContext.get(kotlinx.coroutines.CoroutineName.INSTANCE);
        this.name = coroutineName != null ? coroutineName.getName() : null;
        this.state = debugCoroutineInfoImpl.get_state();
        java.lang.Thread thread = debugCoroutineInfoImpl.lastObservedThread;
        this.lastObservedThreadState = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        java.lang.Thread thread2 = debugCoroutineInfoImpl.lastObservedThread;
        this.lastObservedThreadName = thread2 != null ? thread2.getName() : null;
        this.lastObservedStackTrace = debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core();
        this.sequenceNumber = debugCoroutineInfoImpl.sequenceNumber;
    }

    public final java.lang.Long getCoroutineId() {
        return this.coroutineId;
    }

    public final java.lang.String getDispatcher() {
        return this.dispatcher;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getState() {
        return this.state;
    }

    public final java.lang.String getLastObservedThreadState() {
        return this.lastObservedThreadState;
    }

    public final java.lang.String getLastObservedThreadName() {
        return this.lastObservedThreadName;
    }

    public final java.util.List<java.lang.StackTraceElement> getLastObservedStackTrace() {
        return this.lastObservedStackTrace;
    }

    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }
}
