package kotlinx.coroutines.debug.internal;

/* compiled from: DebugCoroutineInfoImpl.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B%\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ)\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00162\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b\"J\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000¢\u0006\u0002\b.J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\"\u0010/\u001a\u00020\u001d*\b\u0012\u0004\u0012\u00020\u0012002\b\u0010\u001e\u001a\u0004\u0018\u00010&H\u0082P¢\u0006\u0002\u00101J\b\u00102\u001a\u00020\u0016H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R(\u0010(\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00063"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "", "context", "Lkotlin/coroutines/CoroutineContext;", "creationStackBottom", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "sequenceNumber", "", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/debug/internal/StackTraceFrame;J)V", "getCreationStackBottom$kotlinx_coroutines_core", "()Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "_context", "Ljava/lang/ref/WeakReference;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "creationStackTrace", "", "Ljava/lang/StackTraceElement;", "getCreationStackTrace", "()Ljava/util/List;", "state", "", "getState$kotlinx_coroutines_core", "()Ljava/lang/String;", "_state", "unmatchedResume", "", "updateState", "", "frame", "Lkotlin/coroutines/Continuation;", "shouldBeMatched", "", "updateState$kotlinx_coroutines_core", "lastObservedThread", "Ljava/lang/Thread;", "_lastObservedFrame", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "value", "lastObservedFrame", "getLastObservedFrame$kotlinx_coroutines_core", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "setLastObservedFrame$kotlinx_coroutines_core", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "lastObservedStackTrace", "lastObservedStackTrace$kotlinx_coroutines_core", "yieldFrames", "Lkotlin/sequences/SequenceScope;", "(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DebugCoroutineInfoImpl {
    private final java.lang.ref.WeakReference<kotlin.coroutines.CoroutineContext> _context;
    public volatile java.lang.ref.WeakReference<kotlin.coroutines.jvm.internal.CoroutineStackFrame> _lastObservedFrame;
    public volatile java.lang.String _state = kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED;
    private final kotlinx.coroutines.debug.internal.StackTraceFrame creationStackBottom;
    public volatile java.lang.Thread lastObservedThread;
    public final long sequenceNumber;
    private int unmatchedResume;

    public DebugCoroutineInfoImpl(kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.debug.internal.StackTraceFrame stackTraceFrame, long j) {
        this.creationStackBottom = stackTraceFrame;
        this.sequenceNumber = j;
        this._context = new java.lang.ref.WeakReference<>(coroutineContext);
    }

    /* renamed from: getCreationStackBottom$kotlinx_coroutines_core, reason: from getter */
    public final kotlinx.coroutines.debug.internal.StackTraceFrame getCreationStackBottom() {
        return this.creationStackBottom;
    }

    public final kotlin.coroutines.CoroutineContext getContext() {
        return this._context.get();
    }

    public final java.util.List<java.lang.StackTraceElement> getCreationStackTrace() {
        return creationStackTrace();
    }

    /* renamed from: getState$kotlinx_coroutines_core, reason: from getter */
    public final java.lang.String get_state() {
        return this._state;
    }

    public final synchronized void updateState$kotlinx_coroutines_core(java.lang.String state, kotlin.coroutines.Continuation<?> frame, boolean shouldBeMatched) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this._state, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING) && kotlin.jvm.internal.Intrinsics.areEqual(state, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING) && shouldBeMatched) {
            this.unmatchedResume++;
        } else if (this.unmatchedResume > 0 && kotlin.jvm.internal.Intrinsics.areEqual(state, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.SUSPENDED)) {
            this.unmatchedResume--;
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this._state, state) && kotlin.jvm.internal.Intrinsics.areEqual(state, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.SUSPENDED) && getLastObservedFrame$kotlinx_coroutines_core() != null) {
            return;
        }
        this._state = state;
        setLastObservedFrame$kotlinx_coroutines_core(frame instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame ? (kotlin.coroutines.jvm.internal.CoroutineStackFrame) frame : null);
        this.lastObservedThread = kotlin.jvm.internal.Intrinsics.areEqual(state, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING) ? java.lang.Thread.currentThread() : null;
    }

    public final kotlin.coroutines.jvm.internal.CoroutineStackFrame getLastObservedFrame$kotlinx_coroutines_core() {
        java.lang.ref.WeakReference<kotlin.coroutines.jvm.internal.CoroutineStackFrame> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void setLastObservedFrame$kotlinx_coroutines_core(kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame) {
        this._lastObservedFrame = coroutineStackFrame != null ? new java.lang.ref.WeakReference<>(coroutineStackFrame) : null;
    }

    public final java.util.List<java.lang.StackTraceElement> lastObservedStackTrace$kotlinx_coroutines_core() {
        kotlin.coroutines.jvm.internal.CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (lastObservedFrame$kotlinx_coroutines_core != null) {
            java.lang.StackTraceElement stackTraceElement = lastObservedFrame$kotlinx_coroutines_core.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            lastObservedFrame$kotlinx_coroutines_core = lastObservedFrame$kotlinx_coroutines_core.getCallerFrame();
        }
        return arrayList;
    }

    private final java.util.List<java.lang.StackTraceElement> creationStackTrace() {
        kotlinx.coroutines.debug.internal.StackTraceFrame stackTraceFrame = this.creationStackBottom;
        return stackTraceFrame == null ? kotlin.collections.CollectionsKt.emptyList() : kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.sequence(new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1(this, stackTraceFrame, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004c -> B:11:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005d -> B:10:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object yieldFrames(kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> sequenceScope, kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 debugCoroutineInfoImpl$yieldFrames$1;
        int i;
        kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame2;
        kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl debugCoroutineInfoImpl;
        if (continuation instanceof kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1) {
            debugCoroutineInfoImpl$yieldFrames$1 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1) continuation;
            if ((debugCoroutineInfoImpl$yieldFrames$1.label & Integer.MIN_VALUE) != 0) {
                debugCoroutineInfoImpl$yieldFrames$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = debugCoroutineInfoImpl$yieldFrames$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debugCoroutineInfoImpl$yieldFrames$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    coroutineStackFrame2 = coroutineStackFrame;
                    debugCoroutineInfoImpl = this;
                    if (coroutineStackFrame2 == null) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl debugCoroutineInfoImpl2 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) debugCoroutineInfoImpl$yieldFrames$1.L$2;
                    kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame3 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) debugCoroutineInfoImpl$yieldFrames$1.L$1;
                    kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> sequenceScope2 = (kotlin.sequences.SequenceScope) debugCoroutineInfoImpl$yieldFrames$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    coroutineStackFrame2 = coroutineStackFrame3;
                    debugCoroutineInfoImpl = debugCoroutineInfoImpl2;
                    sequenceScope = sequenceScope2;
                    coroutineStackFrame2 = coroutineStackFrame2.getCallerFrame();
                    if (coroutineStackFrame2 == null) {
                        return kotlin.Unit.INSTANCE;
                    }
                    if (coroutineStackFrame2 == null) {
                        java.lang.StackTraceElement stackTraceElement = coroutineStackFrame2.getStackTraceElement();
                        if (stackTraceElement != null) {
                            debugCoroutineInfoImpl$yieldFrames$1.L$0 = sequenceScope;
                            debugCoroutineInfoImpl$yieldFrames$1.L$1 = coroutineStackFrame2;
                            debugCoroutineInfoImpl$yieldFrames$1.L$2 = debugCoroutineInfoImpl;
                            debugCoroutineInfoImpl$yieldFrames$1.label = 1;
                            if (sequenceScope.yield(stackTraceElement, debugCoroutineInfoImpl$yieldFrames$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            sequenceScope2 = sequenceScope;
                            debugCoroutineInfoImpl2 = debugCoroutineInfoImpl;
                            coroutineStackFrame3 = coroutineStackFrame2;
                            coroutineStackFrame2 = coroutineStackFrame3;
                            debugCoroutineInfoImpl = debugCoroutineInfoImpl2;
                            sequenceScope = sequenceScope2;
                        }
                        coroutineStackFrame2 = coroutineStackFrame2.getCallerFrame();
                        if (coroutineStackFrame2 == null) {
                        }
                        if (coroutineStackFrame2 == null) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        debugCoroutineInfoImpl$yieldFrames$1 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1(this, continuation);
        java.lang.Object obj2 = debugCoroutineInfoImpl$yieldFrames$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debugCoroutineInfoImpl$yieldFrames$1.label;
        if (i != 0) {
        }
    }

    public java.lang.String toString() {
        return "DebugCoroutineInfo(state=" + get_state() + ",context=" + getContext() + ')';
    }
}
