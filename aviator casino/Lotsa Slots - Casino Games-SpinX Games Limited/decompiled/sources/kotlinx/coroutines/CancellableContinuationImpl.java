package kotlinx.coroutines;

/* compiled from: CancellableContinuationImpl.kt */
@kotlin.Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020!H\u0002J\b\u0010,\u001a\u00020!H\u0001J\u0015\u00100\u001a\n\u0018\u000101j\u0004\u0018\u0001`2H\u0016¢\u0006\u0002\u00103J\u000f\u00104\u001a\u0004\u0018\u00010\u0017H\u0010¢\u0006\u0002\b5J\u001f\u00106\u001a\u00020*2\b\u00107\u001a\u0004\u0018\u00010\u00172\u0006\u00108\u001a\u000209H\u0010¢\u0006\u0002\b:J\u0010\u0010;\u001a\u00020!2\u0006\u00108\u001a\u000209H\u0002J\u0012\u0010<\u001a\u00020!2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0015\u0010=\u001a\u00020*2\u0006\u00108\u001a\u000209H\u0000¢\u0006\u0002\b>J\u0017\u0010?\u001a\u00020*2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020*0AH\u0082\bJ\u0018\u0010B\u001a\u00020*2\u0006\u0010C\u001a\u00020D2\b\u00108\u001a\u0004\u0018\u000109J\u001e\u0010E\u001a\u00020*2\n\u0010F\u001a\u0006\u0012\u0002\b\u00030G2\b\u00108\u001a\u0004\u0018\u000109H\u0002Jn\u0010H\u001a\u00020*\"\u0004\b\u0001\u0010I2K\u0010J\u001aG\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*0K2\u0006\u00108\u001a\u0002092\u0006\u0010N\u001a\u0002HI¢\u0006\u0002\u0010OJ\u0010\u0010P\u001a\u0002092\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u00020!H\u0002J\b\u0010T\u001a\u00020!H\u0002J\n\u0010U\u001a\u0004\u0018\u00010\u0017H\u0001J\n\u0010V\u001a\u0004\u0018\u00010\u0019H\u0002J\r\u0010W\u001a\u00020*H\u0000¢\u0006\u0002\bXJ\u001b\u0010Y\u001a\u00020*2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016¢\u0006\u0002\u0010\\J:\u0010]\u001a\u00020*2\u0006\u0010N\u001a\u00028\u00002#\u0010J\u001a\u001f\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020*\u0018\u00010^H\u0016¢\u0006\u0002\u0010_Jn\u0010]\u001a\u00020*\"\b\b\u0001\u0010I*\u00028\u00002\u0006\u0010N\u001a\u0002HI2M\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010KH\u0016¢\u0006\u0002\u0010`J\u001c\u0010a\u001a\u00020*2\n\u0010F\u001a\u0006\u0012\u0002\b\u00030G2\u0006\u0010b\u001a\u00020\nH\u0016J1\u0010a\u001a\u00020*2'\u0010C\u001a#\u0012\u0015\u0012\u0013\u0018\u000109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020*0^j\u0002`cH\u0016J\u0015\u0010d\u001a\u00020*2\u0006\u0010C\u001a\u00020DH\u0000¢\u0006\u0002\beJ\u0010\u0010f\u001a\u00020*2\u0006\u0010C\u001a\u00020\u0017H\u0002J\u001a\u0010g\u001a\u00020*2\u0006\u0010C\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010h\u001a\u00020*2\u0006\u0010i\u001a\u00020\nH\u0002J\u0086\u0001\u0010j\u001a\u0004\u0018\u00010\u0017\"\u0004\b\u0001\u0010I2\u0006\u0010\u001d\u001a\u00020k2\u0006\u0010l\u001a\u0002HI2\u0006\u0010\t\u001a\u00020\n2M\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010K2\b\u0010m\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010nJv\u0010o\u001a\u00020*\"\u0004\b\u0001\u0010I2\u0006\u0010l\u001a\u0002HI2\u0006\u0010\t\u001a\u00020\n2O\b\u0002\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010KH\u0000¢\u0006\u0004\bp\u0010qJv\u0010r\u001a\u0004\u0018\u00010s\"\u0004\b\u0001\u0010I2\u0006\u0010l\u001a\u0002HI2\b\u0010m\u001a\u0004\u0018\u00010\u00172M\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010KH\u0002¢\u0006\u0002\u0010tJ\u0012\u0010u\u001a\u00020v2\b\u0010l\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010w\u001a\u00020*H\u0002J\r\u0010x\u001a\u00020*H\u0000¢\u0006\u0002\byJ!\u0010T\u001a\u0004\u0018\u00010\u00172\u0006\u0010N\u001a\u00028\u00002\b\u0010m\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010zJz\u0010T\u001a\u0004\u0018\u00010\u0017\"\b\b\u0001\u0010I*\u00028\u00002\u0006\u0010N\u001a\u0002HI2\b\u0010m\u001a\u0004\u0018\u00010\u00172M\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010KH\u0016¢\u0006\u0002\u0010{J\u0012\u0010|\u001a\u0004\u0018\u00010\u00172\u0006\u0010}\u001a\u000209H\u0016J\u0010\u0010~\u001a\u00020*2\u0006\u0010\u007f\u001a\u00020\u0017H\u0016J\u001c\u0010\u0080\u0001\u001a\u00020**\u00030\u0081\u00012\u0006\u0010N\u001a\u00028\u0000H\u0016¢\u0006\u0003\u0010\u0082\u0001J\u0016\u0010\u0083\u0001\u001a\u00020**\u00030\u0081\u00012\u0006\u0010}\u001a\u000209H\u0016J\"\u0010\u0084\u0001\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0010¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u0001092\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0010¢\u0006\u0003\b\u0088\u0001J\t\u0010\u0089\u0001\u001a\u00020&H\u0016J\t\u0010\u008a\u0001\u001a\u00020&H\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\t\u0010\u0013\u001a\u00020\u0014X\u0082\u0004R\u0011\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016X\u0082\u0004R\u0011\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016X\u0082\u0004R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\"R\u0014\u0010#\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001c\u0010-\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u0006\u008b\u0001"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/Waiter;", "delegate", "Lkotlin/coroutines/Continuation;", "resumeMode", "", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicInt;", "_state", "Lkotlinx/atomicfu/AtomicRef;", "", "_parentHandle", "Lkotlinx/coroutines/DisposableHandle;", "parentHandle", "getParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "isActive", "", "()Z", "isCompleted", "isCancelled", "stateDebugRepresentation", "", "getStateDebugRepresentation", "()Ljava/lang/String;", "initCancellability", "", "isReusable", "resetStateReusable", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "()Ljava/lang/StackTraceElement;", "takeState", "takeState$kotlinx_coroutines_core", "cancelCompletedResult", "takenState", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "cancelLater", "cancel", "parentCancelled", "parentCancelled$kotlinx_coroutines_core", "callCancelHandlerSafely", "block", "Lkotlin/Function0;", "callCancelHandler", "handler", "Lkotlinx/coroutines/CancelHandler;", "callSegmentOnCancellation", com.ironsource.D1.i, "Lkotlinx/coroutines/internal/Segment;", "callOnCancellation", "R", "onCancellation", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "value", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Ljava/lang/Object;)V", "getContinuationCancellationCause", "parent", "Lkotlinx/coroutines/Job;", "trySuspend", "tryResume", "getResult", "installParentHandle", "releaseClaimedReusableContinuation", "releaseClaimedReusableContinuation$kotlinx_coroutines_core", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "resume", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "invokeOnCancellation", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "Lkotlinx/coroutines/CompletionHandler;", "invokeOnCancellationInternal", "invokeOnCancellationInternal$kotlinx_coroutines_core", "invokeOnCancellationImpl", "multipleHandlersError", "dispatchResume", com.ironsource.X3.a.t, "resumedState", "Lkotlinx/coroutines/NotCompleted;", "proposedUpdate", "idempotent", "(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;ILkotlin/jvm/functions/Function3;Ljava/lang/Object;)Ljava/lang/Object;", "resumeImpl", "resumeImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function3;)V", "tryResumeImpl", "Lkotlinx/coroutines/internal/Symbol;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/internal/Symbol;", "alreadyResumedError", "", "detachChildIfNonReusable", "detachChild", "detachChild$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "tryResumeWithException", "exception", "completeResume", "token", "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getExceptionalResult", "getExceptionalResult$kotlinx_coroutines_core", "toString", "nameString", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class CancellableContinuationImpl<T> extends kotlinx.coroutines.DispatchedTask<T> implements kotlinx.coroutines.CancellableContinuation<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.Waiter {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;
    private final kotlin.coroutines.CoroutineContext context;
    private final kotlin.coroutines.Continuation<T> delegate;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _decisionAndIndex$volatile$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.CancellableContinuationImpl.class, "_decisionAndIndex$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$volatile$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.CancellableContinuationImpl.class, java.lang.Object.class, "_state$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _parentHandle$volatile$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.CancellableContinuationImpl.class, java.lang.Object.class, "_parentHandle$volatile");

    private final /* synthetic */ int get_decisionAndIndex$volatile() {
        return this._decisionAndIndex$volatile;
    }

    private final /* synthetic */ java.lang.Object get_parentHandle$volatile() {
        return this._parentHandle$volatile;
    }

    private final /* synthetic */ java.lang.Object get_state$volatile() {
        return this._state$volatile;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.lang.Object obj, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Int(java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, java.lang.Object obj, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1) {
        while (true) {
            function1.invoke(java.lang.Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void set_decisionAndIndex$volatile(int i) {
        this._decisionAndIndex$volatile = i;
    }

    private final /* synthetic */ void set_parentHandle$volatile(java.lang.Object obj) {
        this._parentHandle$volatile = obj;
    }

    private final /* synthetic */ void set_state$volatile(java.lang.Object obj) {
        this._state$volatile = obj;
    }

    private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Int(java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, java.lang.Object obj, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1) {
        int i;
        do {
            i = atomicIntegerFieldUpdater.get(obj);
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i, function1.invoke(java.lang.Integer.valueOf(i)).intValue()));
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this.delegate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationImpl(kotlin.coroutines.Continuation<? super T> continuation, int i) {
        super(i);
        this.delegate = continuation;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && i == -1) {
            throw new java.lang.AssertionError();
        }
        this.context = continuation.get$context();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = kotlinx.coroutines.Active.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext, reason: from getter */
    public kotlin.coroutines.CoroutineContext get$context() {
        return this.context;
    }

    private final kotlinx.coroutines.DisposableHandle getParentHandle() {
        return (kotlinx.coroutines.DisposableHandle) _parentHandle$volatile$FU.get(this);
    }

    public final java.lang.Object getState$kotlinx_coroutines_core() {
        return _state$volatile$FU.get(this);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isActive() {
        return getState$kotlinx_coroutines_core() instanceof kotlinx.coroutines.NotCompleted;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof kotlinx.coroutines.NotCompleted);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isCancelled() {
        return getState$kotlinx_coroutines_core() instanceof kotlinx.coroutines.CancelledContinuation;
    }

    private final java.lang.String getStateDebugRepresentation() {
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return state$kotlinx_coroutines_core instanceof kotlinx.coroutines.NotCompleted ? "Active" : state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CancelledContinuation ? com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_CANCELLED : com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void initCancellability() {
        kotlinx.coroutines.DisposableHandle installParentHandle = installParentHandle();
        if (installParentHandle != null && isCompleted()) {
            installParentHandle.dispose();
            _parentHandle$volatile$FU.set(this, kotlinx.coroutines.NonDisposableHandle.INSTANCE);
        }
    }

    private final boolean isReusable() {
        if (kotlinx.coroutines.DispatchedTaskKt.isReusableMode(this.resumeMode)) {
            kotlin.coroutines.Continuation<T> continuation = this.delegate;
            kotlin.jvm.internal.Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((kotlinx.coroutines.internal.DispatchedContinuation) continuation).isReusable$kotlinx_coroutines_core()) {
                return true;
            }
        }
        return false;
    }

    public final boolean resetStateReusable() {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && this.resumeMode != 2) {
            throw new java.lang.AssertionError();
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && getParentHandle() == kotlinx.coroutines.NonDisposableHandle.INSTANCE) {
            throw new java.lang.AssertionError();
        }
        java.lang.Object obj = _state$volatile$FU.get(this);
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(!(obj instanceof kotlinx.coroutines.NotCompleted))) {
            throw new java.lang.AssertionError();
        }
        if ((obj instanceof kotlinx.coroutines.CompletedContinuation) && ((kotlinx.coroutines.CompletedContinuation) obj).idempotentResume != null) {
            detachChild$kotlinx_coroutines_core();
            return false;
        }
        _decisionAndIndex$volatile$FU.set(this, 536870911);
        _state$volatile$FU.set(this, kotlinx.coroutines.Active.INSTANCE);
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
        kotlin.coroutines.Continuation<T> continuation = this.delegate;
        if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            return (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Object takeState$kotlinx_coroutines_core() {
        return getState$kotlinx_coroutines_core();
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object takenState, java.lang.Throwable cause) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof kotlinx.coroutines.NotCompleted) {
                throw new java.lang.IllegalStateException("Not completed".toString());
            }
            if (obj instanceof kotlinx.coroutines.CompletedExceptionally) {
                return;
            }
            if (obj instanceof kotlinx.coroutines.CompletedContinuation) {
                kotlinx.coroutines.CompletedContinuation completedContinuation = (kotlinx.coroutines.CompletedContinuation) obj;
                if (!(!completedContinuation.getCancelled())) {
                    throw new java.lang.IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj, kotlinx.coroutines.CompletedContinuation.copy$default(completedContinuation, null, null, null, null, cause, 15, null))) {
                    completedContinuation.invokeHandlers(this, cause);
                    return;
                }
            } else {
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj, new kotlinx.coroutines.CompletedContinuation(obj, null, null, null, cause, 14, null))) {
                    return;
                }
            }
        }
    }

    private final boolean cancelLater(java.lang.Throwable cause) {
        if (!isReusable()) {
            return false;
        }
        kotlin.coroutines.Continuation<T> continuation = this.delegate;
        kotlin.jvm.internal.Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((kotlinx.coroutines.internal.DispatchedContinuation) continuation).postponeCancellation$kotlinx_coroutines_core(cause);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(java.lang.Throwable cause) {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof kotlinx.coroutines.NotCompleted)) {
                return false;
            }
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj, new kotlinx.coroutines.CancelledContinuation(this, cause, (obj instanceof kotlinx.coroutines.CancelHandler) || (obj instanceof kotlinx.coroutines.internal.Segment))));
        kotlinx.coroutines.NotCompleted notCompleted = (kotlinx.coroutines.NotCompleted) obj;
        if (notCompleted instanceof kotlinx.coroutines.CancelHandler) {
            callCancelHandler((kotlinx.coroutines.CancelHandler) obj, cause);
        } else if (notCompleted instanceof kotlinx.coroutines.internal.Segment) {
            callSegmentOnCancellation((kotlinx.coroutines.internal.Segment) obj, cause);
        }
        detachChildIfNonReusable();
        dispatchResume(this.resumeMode);
        return true;
    }

    public final void parentCancelled$kotlinx_coroutines_core(java.lang.Throwable cause) {
        if (cancelLater(cause)) {
            return;
        }
        cancel(cause);
        detachChildIfNonReusable();
    }

    private final void callCancelHandlerSafely(kotlin.jvm.functions.Function0<kotlin.Unit> block) {
        try {
            block.invoke();
        } catch (java.lang.Throwable th) {
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(get$context(), new kotlinx.coroutines.CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    public final void callCancelHandler(kotlinx.coroutines.CancelHandler handler, java.lang.Throwable cause) {
        try {
            handler.invoke(cause);
        } catch (java.lang.Throwable th) {
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(get$context(), new kotlinx.coroutines.CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    private final void callSegmentOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, java.lang.Throwable cause) {
        int i = _decisionAndIndex$volatile$FU.get(this) & 536870911;
        if (i == 536870911) {
            throw new java.lang.IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            segment.onCancellation(i, cause, get$context());
        } catch (java.lang.Throwable th) {
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(get$context(), new kotlinx.coroutines.CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void callOnCancellation(kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super R, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit> onCancellation, java.lang.Throwable cause, R value) {
        try {
            onCancellation.invoke(cause, value, get$context());
        } catch (java.lang.Throwable th) {
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(get$context(), new kotlinx.coroutines.CompletionHandlerException("Exception in resume onCancellation handler for " + this, th));
        }
    }

    public java.lang.Throwable getContinuationCancellationCause(kotlinx.coroutines.Job parent) {
        return parent.getCancellationException();
    }

    private final boolean trySuspend() {
        int i;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new java.lang.IllegalStateException("Already suspended".toString());
            }
        } while (!_decisionAndIndex$volatile$FU.compareAndSet(this, i, 536870912 + (536870911 & i)));
        return true;
    }

    private final boolean tryResume() {
        int i;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new java.lang.IllegalStateException("Already resumed".toString());
            }
        } while (!_decisionAndIndex$volatile$FU.compareAndSet(this, i, 1073741824 + (536870911 & i)));
        return true;
    }

    public final java.lang.Object getResult() {
        kotlinx.coroutines.Job job;
        boolean isReusable = isReusable();
        if (trySuspend()) {
            if (getParentHandle() == null) {
                installParentHandle();
            }
            if (isReusable) {
                releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            }
            return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (isReusable) {
            releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        }
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally)) {
            if (kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(this.resumeMode) && (job = (kotlinx.coroutines.Job) get$context().get(kotlinx.coroutines.Job.INSTANCE)) != null && !job.isActive()) {
                java.util.concurrent.CancellationException cancellationException = job.getCancellationException();
                cancelCompletedResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core, cancellationException);
                if (!kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
                    throw cancellationException;
                }
                kotlinx.coroutines.CancellableContinuationImpl<T> cancellableContinuationImpl = this;
                if (cancellableContinuationImpl instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
                    throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(cancellationException, cancellableContinuationImpl);
                }
                throw cancellationException;
            }
            return getSuccessfulResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core);
        }
        java.lang.Throwable th = ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        if (!kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
            throw th;
        }
        kotlinx.coroutines.CancellableContinuationImpl<T> cancellableContinuationImpl2 = this;
        if (cancellableContinuationImpl2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(th, cancellableContinuationImpl2);
        }
        throw th;
    }

    private final kotlinx.coroutines.DisposableHandle installParentHandle() {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) get$context().get(kotlinx.coroutines.Job.INSTANCE);
        if (job == null) {
            return null;
        }
        kotlinx.coroutines.DisposableHandle invokeOnCompletion$default = kotlinx.coroutines.JobKt__JobKt.invokeOnCompletion$default(job, false, new kotlinx.coroutines.ChildContinuation(this), 1, null);
        androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_parentHandle$volatile$FU, this, null, invokeOnCompletion$default);
        return invokeOnCompletion$default;
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
        java.lang.Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core;
        kotlin.coroutines.Continuation<T> continuation = this.delegate;
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation ? (kotlinx.coroutines.internal.DispatchedContinuation) continuation : null;
        if (dispatchedContinuation == null || (tryReleaseClaimedContinuation$kotlinx_coroutines_core = dispatchedContinuation.tryReleaseClaimedContinuation$kotlinx_coroutines_core(this)) == null) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
        cancel(tryReleaseClaimedContinuation$kotlinx_coroutines_core);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object result) {
        resumeImpl$kotlinx_coroutines_core$default(this, kotlinx.coroutines.CompletionStateKt.toState(result, this), this.resumeMode, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit resume$lambda$13$lambda$12(kotlin.jvm.functions.Function1 function1, java.lang.Throwable th, java.lang.Object obj, kotlin.coroutines.CoroutineContext coroutineContext) {
        function1.invoke(th);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resume(T value, final kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onCancellation) {
        resumeImpl$kotlinx_coroutines_core(value, this.resumeMode, onCancellation != null ? new kotlin.jvm.functions.Function3() { // from class: kotlinx.coroutines.CancellableContinuationImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                kotlin.Unit resume$lambda$13$lambda$12;
                resume$lambda$13$lambda$12 = kotlinx.coroutines.CancellableContinuationImpl.resume$lambda$13$lambda$12(kotlin.jvm.functions.Function1.this, (java.lang.Throwable) obj, obj2, (kotlin.coroutines.CoroutineContext) obj3);
                return resume$lambda$13$lambda$12;
            }
        } : null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public <R extends T> void resume(R value, kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super R, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit> onCancellation) {
        resumeImpl$kotlinx_coroutines_core(value, this.resumeMode, onCancellation);
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, int index) {
        int i;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decisionAndIndex$volatile$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & 536870911) != 536870911) {
                throw new java.lang.IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, ((i >> 29) << 29) + index));
        invokeOnCancellationImpl(segment);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        kotlinx.coroutines.CancellableContinuationKt.invokeOnCancellation(this, new kotlinx.coroutines.CancelHandler.UserSupplied(handler));
    }

    public final void invokeOnCancellationInternal$kotlinx_coroutines_core(kotlinx.coroutines.CancelHandler handler) {
        invokeOnCancellationImpl(handler);
    }

    private final void invokeOnCancellationImpl(java.lang.Object handler) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(handler instanceof kotlinx.coroutines.CancelHandler) && !(handler instanceof kotlinx.coroutines.internal.Segment)) {
            throw new java.lang.AssertionError();
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof kotlinx.coroutines.Active) {
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj, handler)) {
                    return;
                }
            } else if ((obj instanceof kotlinx.coroutines.CancelHandler) || (obj instanceof kotlinx.coroutines.internal.Segment)) {
                multipleHandlersError(handler, obj);
            } else {
                boolean z = obj instanceof kotlinx.coroutines.CompletedExceptionally;
                if (z) {
                    kotlinx.coroutines.CompletedExceptionally completedExceptionally = (kotlinx.coroutines.CompletedExceptionally) obj;
                    if (!completedExceptionally.makeHandled()) {
                        multipleHandlersError(handler, obj);
                    }
                    if (obj instanceof kotlinx.coroutines.CancelledContinuation) {
                        if (!z) {
                            completedExceptionally = null;
                        }
                        java.lang.Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
                        if (handler instanceof kotlinx.coroutines.CancelHandler) {
                            callCancelHandler((kotlinx.coroutines.CancelHandler) handler, th);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(handler, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            callSegmentOnCancellation((kotlinx.coroutines.internal.Segment) handler, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj instanceof kotlinx.coroutines.CompletedContinuation) {
                    kotlinx.coroutines.CompletedContinuation completedContinuation = (kotlinx.coroutines.CompletedContinuation) obj;
                    if (completedContinuation.cancelHandler != null) {
                        multipleHandlersError(handler, obj);
                    }
                    if (handler instanceof kotlinx.coroutines.internal.Segment) {
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNull(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    kotlinx.coroutines.CancelHandler cancelHandler = (kotlinx.coroutines.CancelHandler) handler;
                    if (completedContinuation.getCancelled()) {
                        callCancelHandler(cancelHandler, completedContinuation.cancelCause);
                        return;
                    } else {
                        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj, kotlinx.coroutines.CompletedContinuation.copy$default(completedContinuation, null, cancelHandler, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (handler instanceof kotlinx.coroutines.internal.Segment) {
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNull(handler, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj, new kotlinx.coroutines.CompletedContinuation(obj, (kotlinx.coroutines.CancelHandler) handler, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final void multipleHandlersError(java.lang.Object handler, java.lang.Object state) {
        throw new java.lang.IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + handler + ", already has " + state).toString());
    }

    private final void dispatchResume(int mode) {
        if (tryResume()) {
            return;
        }
        kotlinx.coroutines.DispatchedTaskKt.dispatch(this, mode);
    }

    private final <R> java.lang.Object resumedState(kotlinx.coroutines.NotCompleted state, R proposedUpdate, int resumeMode, kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super R, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit> onCancellation, java.lang.Object idempotent) {
        if (proposedUpdate instanceof kotlinx.coroutines.CompletedExceptionally) {
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && idempotent != null) {
                throw new java.lang.AssertionError();
            }
            if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() || onCancellation == null) {
                return proposedUpdate;
            }
            throw new java.lang.AssertionError();
        }
        if (!kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(resumeMode) && idempotent == null) {
            return proposedUpdate;
        }
        if (onCancellation == null && !(state instanceof kotlinx.coroutines.CancelHandler) && idempotent == null) {
            return proposedUpdate;
        }
        return new kotlinx.coroutines.CompletedContinuation(proposedUpdate, state instanceof kotlinx.coroutines.CancelHandler ? (kotlinx.coroutines.CancelHandler) state : null, onCancellation, idempotent, null, 16, null);
    }

    public static /* synthetic */ void resumeImpl$kotlinx_coroutines_core$default(kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl, java.lang.Object obj, int i, kotlin.jvm.functions.Function3 function3, int i2, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            function3 = null;
        }
        cancellableContinuationImpl.resumeImpl$kotlinx_coroutines_core(obj, i, function3);
    }

    public final <R> void resumeImpl$kotlinx_coroutines_core(R proposedUpdate, int resumeMode, kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super R, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit> onCancellation) {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof kotlinx.coroutines.NotCompleted) {
            } else {
                if (obj instanceof kotlinx.coroutines.CancelledContinuation) {
                    kotlinx.coroutines.CancelledContinuation cancelledContinuation = (kotlinx.coroutines.CancelledContinuation) obj;
                    if (cancelledContinuation.makeResumed()) {
                        if (onCancellation != null) {
                            callOnCancellation(onCancellation, cancelledContinuation.cause, proposedUpdate);
                            return;
                        }
                        return;
                    }
                }
                alreadyResumedError(proposedUpdate);
                throw new kotlin.KotlinNothingValueException();
            }
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj, resumedState((kotlinx.coroutines.NotCompleted) obj, proposedUpdate, resumeMode, onCancellation, null)));
        detachChildIfNonReusable();
        dispatchResume(resumeMode);
    }

    private final <R> kotlinx.coroutines.internal.Symbol tryResumeImpl(R proposedUpdate, java.lang.Object idempotent, kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super R, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit> onCancellation) {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof kotlinx.coroutines.NotCompleted) {
            } else {
                if (!(obj instanceof kotlinx.coroutines.CompletedContinuation) || idempotent == null) {
                    return null;
                }
                kotlinx.coroutines.CompletedContinuation completedContinuation = (kotlinx.coroutines.CompletedContinuation) obj;
                if (completedContinuation.idempotentResume != idempotent) {
                    return null;
                }
                if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() || kotlin.jvm.internal.Intrinsics.areEqual(completedContinuation.result, proposedUpdate)) {
                    return kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN;
                }
                throw new java.lang.AssertionError();
            }
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(_state$volatile$FU, this, obj, resumedState((kotlinx.coroutines.NotCompleted) obj, proposedUpdate, this.resumeMode, onCancellation, idempotent)));
        detachChildIfNonReusable();
        return kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN;
    }

    private final java.lang.Void alreadyResumedError(java.lang.Object proposedUpdate) {
        throw new java.lang.IllegalStateException(("Already resumed, but proposed with update " + proposedUpdate).toString());
    }

    private final void detachChildIfNonReusable() {
        if (isReusable()) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
    }

    public final void detachChild$kotlinx_coroutines_core() {
        kotlinx.coroutines.DisposableHandle parentHandle = getParentHandle();
        if (parentHandle == null) {
            return;
        }
        parentHandle.dispose();
        _parentHandle$volatile$FU.set(this, kotlinx.coroutines.NonDisposableHandle.INSTANCE);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResume(T value, java.lang.Object idempotent) {
        return tryResumeImpl(value, idempotent, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public <R extends T> java.lang.Object tryResume(R value, java.lang.Object idempotent, kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super R, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit> onCancellation) {
        return tryResumeImpl(value, idempotent, onCancellation);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResumeWithException(java.lang.Throwable exception) {
        return tryResumeImpl(new kotlinx.coroutines.CompletedExceptionally(exception, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void completeResume(java.lang.Object token) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && token != kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN) {
            throw new java.lang.AssertionError();
        }
        dispatchResume(this.resumeMode);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatched(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, T t) {
        kotlin.coroutines.Continuation<T> continuation = this.delegate;
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation ? (kotlinx.coroutines.internal.DispatchedContinuation) continuation : null;
        resumeImpl$kotlinx_coroutines_core$default(this, t, (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatchedWithException(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, java.lang.Throwable th) {
        kotlin.coroutines.Continuation<T> continuation = this.delegate;
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation ? (kotlinx.coroutines.internal.DispatchedContinuation) continuation : null;
        resumeImpl$kotlinx_coroutines_core$default(this, new kotlinx.coroutines.CompletedExceptionally(th, false, 2, null), (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.DispatchedTask
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(java.lang.Object state) {
        return state instanceof kotlinx.coroutines.CompletedContinuation ? (T) ((kotlinx.coroutines.CompletedContinuation) state).result : state;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Throwable getExceptionalResult$kotlinx_coroutines_core(java.lang.Object state) {
        java.lang.Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(state);
        if (exceptionalResult$kotlinx_coroutines_core == null) {
            return null;
        }
        kotlin.coroutines.Continuation<T> continuation = this.delegate;
        return (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) ? kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(exceptionalResult$kotlinx_coroutines_core, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation) : exceptionalResult$kotlinx_coroutines_core;
    }

    public java.lang.String toString() {
        return nameString() + '(' + kotlinx.coroutines.DebugStringsKt.toDebugString(this.delegate) + "){" + getStateDebugRepresentation() + "}@" + kotlinx.coroutines.DebugStringsKt.getHexAddress(this);
    }

    protected java.lang.String nameString() {
        return "CancellableContinuation";
    }
}
