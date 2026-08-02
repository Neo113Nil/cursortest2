package kotlinx.coroutines.debug.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b&\u0010\u000fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158GX\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b'\u0010\u001a"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "source", "Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "creationStackBottom", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getCreationStackBottom$kotlinx_coroutines_core", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "", "sequenceNumber", "J", "getSequenceNumber", "()J", "", "Ljava/lang/StackTraceElement;", "creationStackTrace", "Ljava/util/List;", "getCreationStackTrace", "()Ljava/util/List;", "", "state", "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "Ljava/lang/Thread;", "lastObservedThread", "Ljava/lang/Thread;", "getLastObservedThread", "()Ljava/lang/Thread;", "lastObservedFrame", "getLastObservedFrame", "lastObservedStackTrace"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DebugCoroutineInfo {
    private final kotlin.coroutines.CoroutineContext context;
    private final kotlin.coroutines.jvm.internal.CoroutineStackFrame creationStackBottom;
    private final java.util.List<java.lang.StackTraceElement> creationStackTrace;
    private final kotlin.coroutines.jvm.internal.CoroutineStackFrame lastObservedFrame;
    private final java.util.List<java.lang.StackTraceElement> lastObservedStackTrace;
    private final java.lang.Thread lastObservedThread;
    private final long sequenceNumber;
    private final java.lang.String state;

    public DebugCoroutineInfo(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl debugCoroutineInfoImpl, kotlin.coroutines.CoroutineContext coroutineContext) {
        this.context = coroutineContext;
        this.creationStackBottom = debugCoroutineInfoImpl.getCreationStackBottom();
        this.sequenceNumber = debugCoroutineInfoImpl.sequenceNumber;
        this.creationStackTrace = debugCoroutineInfoImpl.getCreationStackTrace();
        this.state = debugCoroutineInfoImpl.get_state();
        this.lastObservedThread = debugCoroutineInfoImpl.lastObservedThread;
        this.lastObservedFrame = debugCoroutineInfoImpl.getLastObservedFrame$kotlinx_coroutines_core();
        this.lastObservedStackTrace = debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core();
    }

    public final kotlin.coroutines.CoroutineContext getContext() {
        return this.context;
    }

    /* renamed from: getCreationStackBottom$kotlinx_coroutines_core, reason: from getter */
    public final kotlin.coroutines.jvm.internal.CoroutineStackFrame getCreationStackBottom() {
        return this.creationStackBottom;
    }

    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public final java.util.List<java.lang.StackTraceElement> getCreationStackTrace() {
        return this.creationStackTrace;
    }

    public final java.lang.String getState() {
        return this.state;
    }

    public final java.lang.Thread getLastObservedThread() {
        return this.lastObservedThread;
    }

    public final kotlin.coroutines.jvm.internal.CoroutineStackFrame getLastObservedFrame() {
        return this.lastObservedFrame;
    }

    public final java.util.List<java.lang.StackTraceElement> lastObservedStackTrace() {
        return this.lastObservedStackTrace;
    }
}
