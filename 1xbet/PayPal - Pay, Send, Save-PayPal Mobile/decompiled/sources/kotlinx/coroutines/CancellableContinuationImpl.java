package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u00052\u00020\u0006B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020!H\u0002J\b\u0010,\u001a\u00020!H\u0001J\u0015\u00100\u001a\n\u0018\u000101j\u0004\u0018\u0001`2H\u0016¢\u0006\u0002\u00103J\u000f\u00104\u001a\u0004\u0018\u00010\u0017H\u0010¢\u0006\u0002\b5J\u001f\u00106\u001a\u00020*2\b\u00107\u001a\u0004\u0018\u00010\u00172\u0006\u00108\u001a\u000209H\u0010¢\u0006\u0002\b:J\u0010\u0010;\u001a\u00020!2\u0006\u00108\u001a\u000209H\u0002J\u0012\u0010<\u001a\u00020!2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0015\u0010=\u001a\u00020*2\u0006\u00108\u001a\u000209H\u0000¢\u0006\u0002\b>J\u0017\u0010?\u001a\u00020*2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020*0AH\u0082\bJ\u0018\u0010B\u001a\u00020*2\u0006\u0010C\u001a\u00020D2\b\u00108\u001a\u0004\u0018\u000109J\u001e\u0010E\u001a\u00020*2\n\u0010F\u001a\u0006\u0012\u0002\b\u00030G2\b\u00108\u001a\u0004\u0018\u000109H\u0002Jn\u0010H\u001a\u00020*\"\u0004\b\u0001\u0010I2K\u0010J\u001aG\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*0K2\u0006\u00108\u001a\u0002092\u0006\u0010N\u001a\u0002HI¢\u0006\u0002\u0010OJ\u0010\u0010P\u001a\u0002092\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u00020!H\u0002J\b\u0010T\u001a\u00020!H\u0002J\n\u0010U\u001a\u0004\u0018\u00010\u0017H\u0001J\n\u0010V\u001a\u0004\u0018\u00010\u0019H\u0002J\r\u0010W\u001a\u00020*H\u0000¢\u0006\u0002\bXJ\u001b\u0010Y\u001a\u00020*2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016¢\u0006\u0002\u0010\\J:\u0010]\u001a\u00020*2\u0006\u0010N\u001a\u00028\u00002#\u0010J\u001a\u001f\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020*\u0018\u00010^H\u0016¢\u0006\u0002\u0010_Jn\u0010]\u001a\u00020*\"\b\b\u0001\u0010I*\u00028\u00002\u0006\u0010N\u001a\u0002HI2M\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010KH\u0016¢\u0006\u0002\u0010`J\u001c\u0010a\u001a\u00020*2\n\u0010F\u001a\u0006\u0012\u0002\b\u00030G2\u0006\u0010b\u001a\u00020\nH\u0016J1\u0010a\u001a\u00020*2'\u0010C\u001a#\u0012\u0015\u0012\u0013\u0018\u000109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020*0^j\u0002`cH\u0016J\u0015\u0010d\u001a\u00020*2\u0006\u0010C\u001a\u00020DH\u0000¢\u0006\u0002\beJ\u0010\u0010f\u001a\u00020*2\u0006\u0010C\u001a\u00020\u0017H\u0002J\u001a\u0010g\u001a\u00020*2\u0006\u0010C\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010h\u001a\u00020*2\u0006\u0010i\u001a\u00020\nH\u0002J\u0086\u0001\u0010j\u001a\u0004\u0018\u00010\u0017\"\u0004\b\u0001\u0010I2\u0006\u0010\u001d\u001a\u00020k2\u0006\u0010l\u001a\u0002HI2\u0006\u0010\t\u001a\u00020\n2M\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010K2\b\u0010m\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010nJv\u0010o\u001a\u00020*\"\u0004\b\u0001\u0010I2\u0006\u0010l\u001a\u0002HI2\u0006\u0010\t\u001a\u00020\n2O\b\u0002\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010KH\u0000¢\u0006\u0004\bp\u0010qJv\u0010r\u001a\u0004\u0018\u00010s\"\u0004\b\u0001\u0010I2\u0006\u0010l\u001a\u0002HI2\b\u0010m\u001a\u0004\u0018\u00010\u00172M\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010KH\u0002¢\u0006\u0002\u0010tJ\u0012\u0010u\u001a\u00020v2\b\u0010l\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010w\u001a\u00020*H\u0002J\r\u0010x\u001a\u00020*H\u0000¢\u0006\u0002\byJ!\u0010T\u001a\u0004\u0018\u00010\u00172\u0006\u0010N\u001a\u00028\u00002\b\u0010m\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010zJz\u0010T\u001a\u0004\u0018\u00010\u0017\"\b\b\u0001\u0010I*\u00028\u00002\u0006\u0010N\u001a\u0002HI2\b\u0010m\u001a\u0004\u0018\u00010\u00172M\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010KH\u0016¢\u0006\u0002\u0010{J\u0012\u0010|\u001a\u0004\u0018\u00010\u00172\u0006\u0010}\u001a\u000209H\u0016J\u0010\u0010~\u001a\u00020*2\u0006\u0010\u007f\u001a\u00020\u0017H\u0016J\u001c\u0010\u0080\u0001\u001a\u00020**\u00030\u0081\u00012\u0006\u0010N\u001a\u00028\u0000H\u0016¢\u0006\u0003\u0010\u0082\u0001J\u0016\u0010\u0083\u0001\u001a\u00020**\u00030\u0081\u00012\u0006\u0010}\u001a\u000209H\u0016J\"\u0010\u0084\u0001\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0010¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u0001092\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0010¢\u0006\u0003\b\u0088\u0001J\t\u0010\u0089\u0001\u001a\u00020&H\u0016J\t\u0010\u008a\u0001\u001a\u00020&H\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\t\u0010\u0013\u001a\u00020\u0014X\u0082\u0004R\u0011\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016X\u0082\u0004R\u0011\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016X\u0082\u0004R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\"R\u0014\u0010#\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001c\u0010-\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u0006\u008b\u0001"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/Waiter;", "delegate", "Lkotlin/coroutines/Continuation;", "resumeMode", "", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicInt;", "_state", "Lkotlinx/atomicfu/AtomicRef;", "", "_parentHandle", "Lkotlinx/coroutines/DisposableHandle;", "parentHandle", "getParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "isActive", "", "()Z", "isCompleted", "isCancelled", "stateDebugRepresentation", "", "getStateDebugRepresentation", "()Ljava/lang/String;", "initCancellability", "", "isReusable", "resetStateReusable", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "()Ljava/lang/StackTraceElement;", "takeState", "takeState$kotlinx_coroutines_core", "cancelCompletedResult", "takenState", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "cancelLater", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "parentCancelled", "parentCancelled$kotlinx_coroutines_core", "callCancelHandlerSafely", "block", "Lkotlin/Function0;", "callCancelHandler", "handler", "Lkotlinx/coroutines/CancelHandler;", "callSegmentOnCancellation", com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory.SEGMENT_DATA_FORM_KEY, "Lkotlinx/coroutines/internal/Segment;", "callOnCancellation", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "onCancellation", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Ljava/lang/Object;)V", "getContinuationCancellationCause", "parent", "Lkotlinx/coroutines/Job;", "trySuspend", "tryResume", "getResult", "installParentHandle", "releaseClaimedReusableContinuation", "releaseClaimedReusableContinuation$kotlinx_coroutines_core", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "resume", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "invokeOnCancellation", "index", "Lkotlinx/coroutines/CompletionHandler;", "invokeOnCancellationInternal", "invokeOnCancellationInternal$kotlinx_coroutines_core", "invokeOnCancellationImpl", "multipleHandlersError", "dispatchResume", "mode", "resumedState", "Lkotlinx/coroutines/NotCompleted;", "proposedUpdate", "idempotent", "(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;ILkotlin/jvm/functions/Function3;Ljava/lang/Object;)Ljava/lang/Object;", "resumeImpl", "resumeImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function3;)V", "tryResumeImpl", "Lkotlinx/coroutines/internal/Symbol;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/internal/Symbol;", "alreadyResumedError", "", "detachChildIfNonReusable", "detachChild", "detachChild$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "tryResumeWithException", "exception", "completeResume", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getExceptionalResult", "getExceptionalResult$kotlinx_coroutines_core", "toString", "nameString", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class CancellableContinuationImpl<T> extends kotlinx.coroutines.DispatchedTask<T> implements kotlinx.coroutines.CancellableContinuation<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.Waiter {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;
    private final kotlin.coroutines.Continuation<T> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.CancellableContinuationImpl.class, "_decisionAndIndex$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoFpsRangesFor = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.CancellableContinuationImpl.class, java.lang.Object.class, "_state$volatile");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater Camera2StreamConfigurationMap = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.CancellableContinuationImpl.class, java.lang.Object.class, "_parentHandle$volatile");

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    /* renamed from: getStackTraceElement */
    public java.lang.StackTraceElement getGetHighResolutionOutputSizeshNQ4ISI() {
        return null;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationImpl(kotlin.coroutines.Continuation<? super T> continuation, int i) {
        super(i);
        this.getHighResolutionOutputSizeshNQ4ISI = continuation;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && i == -1) {
            throw new java.lang.AssertionError();
        }
        this.getHighSpeedVideoSizes = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = kotlinx.coroutines.Active.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
        return this.getHighSpeedVideoSizes;
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

    @Override // kotlinx.coroutines.CancellableContinuation
    public void initCancellability() {
        kotlinx.coroutines.DisposableHandle highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor == null || !isCompleted()) {
            return;
        }
        highSpeedVideoFpsRangesFor.dispose();
        Camera2StreamConfigurationMap.set(this, kotlinx.coroutines.NonDisposableHandle.INSTANCE);
    }

    private final boolean Camera2StreamConfigurationMap() {
        if (!kotlinx.coroutines.DispatchedTaskKt.isReusableMode(this.resumeMode)) {
            return false;
        }
        kotlin.coroutines.Continuation<T> continuation = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(continuation, "");
        return ((kotlinx.coroutines.internal.DispatchedContinuation) continuation).isReusable$kotlinx_coroutines_core();
    }

    public final boolean resetStateReusable() {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && this.resumeMode != 2) {
            throw new java.lang.AssertionError();
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && getHighSpeedVideoFpsRanges() == kotlinx.coroutines.NonDisposableHandle.INSTANCE) {
            throw new java.lang.AssertionError();
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoFpsRangesFor;
        java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && (obj instanceof kotlinx.coroutines.NotCompleted)) {
            throw new java.lang.AssertionError();
        }
        if ((obj instanceof kotlinx.coroutines.CompletedContinuation) && ((kotlinx.coroutines.CompletedContinuation) obj).getHighSpeedVideoFpsRanges != null) {
            detachChild$kotlinx_coroutines_core();
            return false;
        }
        getHighSpeedVideoFpsRanges.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, kotlinx.coroutines.Active.INSTANCE);
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
        kotlin.coroutines.Continuation<T> continuation = this.getHighResolutionOutputSizeshNQ4ISI;
        if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            return (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Object takeState$kotlinx_coroutines_core() {
        return getState$kotlinx_coroutines_core();
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable th) {
        if (!Camera2StreamConfigurationMap()) {
            return false;
        }
        kotlin.coroutines.Continuation<T> continuation = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(continuation, "");
        return ((kotlinx.coroutines.internal.DispatchedContinuation) continuation).postponeCancellation$kotlinx_coroutines_core(th);
    }

    public final void parentCancelled$kotlinx_coroutines_core(java.lang.Throwable cause) {
        if (getHighResolutionOutputSizeshNQ4ISI(cause)) {
            return;
        }
        cancel(cause);
        if (Camera2StreamConfigurationMap()) {
            return;
        }
        detachChild$kotlinx_coroutines_core();
    }

    public final void callCancelHandler(kotlinx.coroutines.CancelHandler handler, java.lang.Throwable cause) {
        try {
            handler.invoke(cause);
        } catch (java.lang.Throwable th) {
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new kotlinx.coroutines.CompletionHandlerException("Exception in invokeOnCancellation handler for ".concat(java.lang.String.valueOf(this)), th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void callOnCancellation(kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super R, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit> onCancellation, java.lang.Throwable cause, R value) {
        try {
            onCancellation.invoke(cause, value, getContext());
        } catch (java.lang.Throwable th) {
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new kotlinx.coroutines.CompletionHandlerException("Exception in resume onCancellation handler for ".concat(java.lang.String.valueOf(this)), th));
        }
    }

    public java.lang.Throwable getContinuationCancellationCause(kotlinx.coroutines.Job parent) {
        return parent.getCancellationException();
    }

    public final java.lang.Object getResult() {
        kotlinx.coroutines.Job job;
        boolean Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        if (getHighResolutionOutputSizeshNQ4ISI()) {
            if (getHighSpeedVideoFpsRanges() == null) {
                getHighSpeedVideoFpsRangesFor();
            }
            if (Camera2StreamConfigurationMap2) {
                releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            }
            return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (Camera2StreamConfigurationMap2) {
            releaseClaimedReusableContinuation$kotlinx_coroutines_core();
        }
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally)) {
            if (kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(this.resumeMode) && (job = (kotlinx.coroutines.Job) getContext().get(kotlinx.coroutines.Job.INSTANCE)) != null && !job.isActive()) {
                java.util.concurrent.CancellationException cancellationException = job.getCancellationException();
                cancelCompletedResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core, cancellationException);
                if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
                    throw kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(cancellationException, this);
                }
                throw cancellationException;
            }
            return getSuccessfulResult$kotlinx_coroutines_core(state$kotlinx_coroutines_core);
        }
        java.lang.Throwable th = ((kotlinx.coroutines.CompletedExceptionally) state$kotlinx_coroutines_core).cause;
        if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
            throw kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(th, this);
        }
        throw th;
    }

    private final kotlinx.coroutines.DisposableHandle getHighSpeedVideoFpsRangesFor() {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) getContext().get(kotlinx.coroutines.Job.INSTANCE);
        if (job == null) {
            return null;
        }
        kotlinx.coroutines.DisposableHandle invokeOnCompletion$default = kotlinx.coroutines.JobKt__JobKt.invokeOnCompletion$default(job, false, new kotlinx.coroutines.ChildContinuation(this), 1, null);
        androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(Camera2StreamConfigurationMap, this, null, invokeOnCompletion$default);
        return invokeOnCompletion$default;
    }

    public final void releaseClaimedReusableContinuation$kotlinx_coroutines_core() {
        java.lang.Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core;
        kotlin.coroutines.Continuation<T> continuation = this.getHighResolutionOutputSizeshNQ4ISI;
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

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resume(T value, final kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onCancellation) {
        resumeImpl$kotlinx_coroutines_core(value, this.resumeMode, onCancellation != null ? new kotlin.jvm.functions.Function3() { // from class: kotlinx.coroutines.CancellableContinuationImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return kotlinx.coroutines.CancellableContinuationImpl.m24055$r8$lambda$l1v82JNL5NlKgSjI328OOjF67g(kotlin.jvm.functions.Function1.this, (java.lang.Throwable) obj, obj2, (kotlin.coroutines.CoroutineContext) obj3);
            }
        } : null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public <R extends T> void resume(R value, kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super R, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit> onCancellation) {
        resumeImpl$kotlinx_coroutines_core(value, this.resumeMode, onCancellation);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void invokeOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        kotlinx.coroutines.CancellableContinuationKt.invokeOnCancellation(this, new kotlinx.coroutines.CancelHandler.UserSupplied(handler));
    }

    public final void invokeOnCancellationInternal$kotlinx_coroutines_core(kotlinx.coroutines.CancelHandler handler) {
        getHighSpeedVideoSizes(handler);
    }

    private final void getHighSpeedVideoSizes(java.lang.Object obj) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(obj instanceof kotlinx.coroutines.CancelHandler) && !(obj instanceof kotlinx.coroutines.internal.Segment)) {
            throw new java.lang.AssertionError();
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoFpsRangesFor;
        while (true) {
            java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof kotlinx.coroutines.Active) {
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRangesFor, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof kotlinx.coroutines.CancelHandler) || (obj2 instanceof kotlinx.coroutines.internal.Segment)) {
                getHighSpeedVideoFpsRangesFor(obj, obj2);
            } else {
                boolean z = obj2 instanceof kotlinx.coroutines.CompletedExceptionally;
                if (z) {
                    kotlinx.coroutines.CompletedExceptionally completedExceptionally = (kotlinx.coroutines.CompletedExceptionally) obj2;
                    if (!completedExceptionally.makeHandled()) {
                        getHighSpeedVideoFpsRangesFor(obj, obj2);
                    }
                    if (obj2 instanceof kotlinx.coroutines.CancelledContinuation) {
                        if (!z) {
                            completedExceptionally = null;
                        }
                        java.lang.Throwable th = completedExceptionally != null ? completedExceptionally.cause : null;
                        if (obj instanceof kotlinx.coroutines.CancelHandler) {
                            callCancelHandler((kotlinx.coroutines.CancelHandler) obj, th);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                            Camera2StreamConfigurationMap((kotlinx.coroutines.internal.Segment) obj, th);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof kotlinx.coroutines.CompletedContinuation) {
                    kotlinx.coroutines.CompletedContinuation completedContinuation = (kotlinx.coroutines.CompletedContinuation) obj2;
                    if (completedContinuation.getHighResolutionOutputSizeshNQ4ISI != null) {
                        getHighSpeedVideoFpsRangesFor(obj, obj2);
                    }
                    if (obj instanceof kotlinx.coroutines.internal.Segment) {
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                    kotlinx.coroutines.CancelHandler cancelHandler = (kotlinx.coroutines.CancelHandler) obj;
                    if (completedContinuation.getHighSpeedVideoSizes()) {
                        callCancelHandler(cancelHandler, completedContinuation.Camera2StreamConfigurationMap);
                        return;
                    } else {
                        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRangesFor, this, obj2, kotlinx.coroutines.CompletedContinuation.getHighSpeedVideoSizes(completedContinuation, null, cancelHandler, null, null, null, 29))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof kotlinx.coroutines.internal.Segment) {
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRangesFor, this, obj2, new kotlinx.coroutines.CompletedContinuation(obj2, (kotlinx.coroutines.CancelHandler) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("It's prohibited to register multiple handlers, tried to register ");
        sb.append(obj);
        sb.append(", already has ");
        sb.append(obj2);
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    private final void Camera2StreamConfigurationMap(int i) {
        if (getHighSpeedVideoSizes()) {
            return;
        }
        kotlinx.coroutines.DispatchedTaskKt.dispatch(this, i);
    }

    private static <R> java.lang.Object getHighSpeedVideoFpsRanges(kotlinx.coroutines.NotCompleted notCompleted, R r, int i, kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super R, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit> function3, java.lang.Object obj) {
        if (r instanceof kotlinx.coroutines.CompletedExceptionally) {
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && obj != null) {
                throw new java.lang.AssertionError();
            }
            if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() || function3 == null) {
                return r;
            }
            throw new java.lang.AssertionError();
        }
        if ((kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(i) || obj != null) && (function3 != null || (notCompleted instanceof kotlinx.coroutines.CancelHandler) || obj != null)) {
            return new kotlinx.coroutines.CompletedContinuation(r, notCompleted instanceof kotlinx.coroutines.CancelHandler ? (kotlinx.coroutines.CancelHandler) notCompleted : null, function3, obj, null, 16, null);
        }
        return r;
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

    public final void detachChild$kotlinx_coroutines_core() {
        kotlinx.coroutines.DisposableHandle highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges == null) {
            return;
        }
        highSpeedVideoFpsRanges.dispose();
        Camera2StreamConfigurationMap.set(this, kotlinx.coroutines.NonDisposableHandle.INSTANCE);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResume(T value, java.lang.Object idempotent) {
        return getHighSpeedVideoSizes(value, idempotent, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public <R extends T> java.lang.Object tryResume(R value, java.lang.Object idempotent, kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super R, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit> onCancellation) {
        return getHighSpeedVideoSizes(value, idempotent, onCancellation);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public java.lang.Object tryResumeWithException(java.lang.Throwable exception) {
        return getHighSpeedVideoSizes(new kotlinx.coroutines.CompletedExceptionally(exception, false, 2, null), null, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void completeResume(java.lang.Object token) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && token != kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN) {
            throw new java.lang.AssertionError();
        }
        Camera2StreamConfigurationMap(this.resumeMode);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatched(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, T t) {
        kotlin.coroutines.Continuation<T> continuation = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation ? (kotlinx.coroutines.internal.DispatchedContinuation) continuation : null;
        resumeImpl$kotlinx_coroutines_core$default(this, t, (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void resumeUndispatchedWithException(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, java.lang.Throwable th) {
        kotlin.coroutines.Continuation<T> continuation = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation ? (kotlinx.coroutines.internal.DispatchedContinuation) continuation : null;
        resumeImpl$kotlinx_coroutines_core$default(this, new kotlinx.coroutines.CompletedExceptionally(th, false, 2, null), (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == coroutineDispatcher ? 4 : this.resumeMode, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.DispatchedTask
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(java.lang.Object state) {
        return state instanceof kotlinx.coroutines.CompletedContinuation ? (T) ((kotlinx.coroutines.CompletedContinuation) state).getHighSpeedVideoFpsRangesFor : state;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Throwable getExceptionalResult$kotlinx_coroutines_core(java.lang.Object state) {
        java.lang.Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(state);
        if (exceptionalResult$kotlinx_coroutines_core == null) {
            return null;
        }
        kotlin.coroutines.Continuation<T> continuation = this.getHighResolutionOutputSizeshNQ4ISI;
        return (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) ? kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(exceptionalResult$kotlinx_coroutines_core, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation) : exceptionalResult$kotlinx_coroutines_core;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(nameString());
        sb.append('(');
        sb.append(kotlinx.coroutines.DebugStringsKt.toDebugString(this.getHighResolutionOutputSizeshNQ4ISI));
        sb.append("){");
        java.lang.Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.NotCompleted) {
            str = "Active";
        } else {
            str = state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CancelledContinuation ? "Cancelled" : com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE;
        }
        sb.append(str);
        sb.append("}@");
        sb.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(this));
        return sb.toString();
    }

    protected java.lang.String nameString() {
        return "CancellableContinuation";
    }

    /* renamed from: $r8$lambda$l1v82JNL5Nl-KgSjI328OOjF67g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m24055$r8$lambda$l1v82JNL5NlKgSjI328OOjF67g(kotlin.jvm.functions.Function1 function1, java.lang.Throwable th, java.lang.Object obj, kotlin.coroutines.CoroutineContext coroutineContext) {
        function1.invoke(th);
        return kotlin.Unit.INSTANCE;
    }

    private final void Camera2StreamConfigurationMap(kotlinx.coroutines.internal.Segment<?> segment, java.lang.Throwable th) {
        int i = getHighSpeedVideoFpsRanges.get(this) & 536870911;
        if (i == 536870911) {
            throw new java.lang.IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            segment.onCancellation(i, th, getContext());
        } catch (java.lang.Throwable th2) {
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), new kotlinx.coroutines.CompletionHandlerException("Exception in invokeOnCancellation handler for ".concat(java.lang.String.valueOf(this)), th2));
        }
    }

    private final kotlinx.coroutines.DisposableHandle getHighSpeedVideoFpsRanges() {
        return (kotlinx.coroutines.DisposableHandle) Camera2StreamConfigurationMap.get(this);
    }

    private final boolean getHighSpeedVideoSizes() {
        int i;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = getHighSpeedVideoFpsRanges;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new java.lang.IllegalStateException("Already resumed".toString());
            }
        } while (!getHighSpeedVideoFpsRanges.compareAndSet(this, i, (536870911 & i) + 1073741824));
        return true;
    }

    private final <R> kotlinx.coroutines.internal.Symbol getHighSpeedVideoSizes(R r, java.lang.Object obj, kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super R, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit> function3) {
        java.lang.Object obj2;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoFpsRangesFor;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof kotlinx.coroutines.NotCompleted)) {
                if (!(obj2 instanceof kotlinx.coroutines.CompletedContinuation) || obj == null) {
                    return null;
                }
                kotlinx.coroutines.CompletedContinuation completedContinuation = (kotlinx.coroutines.CompletedContinuation) obj2;
                if (completedContinuation.getHighSpeedVideoFpsRanges != obj) {
                    return null;
                }
                if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() || kotlin.jvm.internal.Intrinsics.areEqual(completedContinuation.getHighSpeedVideoFpsRangesFor, r)) {
                    return kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN;
                }
                throw new java.lang.AssertionError();
            }
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRangesFor, this, obj2, getHighSpeedVideoFpsRanges((kotlinx.coroutines.NotCompleted) obj2, r, this.resumeMode, function3, obj)));
        if (!Camera2StreamConfigurationMap()) {
            detachChild$kotlinx_coroutines_core();
        }
        return kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN;
    }

    private final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = getHighSpeedVideoFpsRanges;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new java.lang.IllegalStateException("Already suspended".toString());
            }
        } while (!getHighSpeedVideoFpsRanges.compareAndSet(this, i, (536870911 & i) + 536870912));
        return true;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean cancel(java.lang.Throwable cause) {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoFpsRangesFor;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof kotlinx.coroutines.NotCompleted)) {
                return false;
            }
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRangesFor, this, obj, new kotlinx.coroutines.CancelledContinuation(this, cause, (obj instanceof kotlinx.coroutines.CancelHandler) || (obj instanceof kotlinx.coroutines.internal.Segment))));
        kotlinx.coroutines.NotCompleted notCompleted = (kotlinx.coroutines.NotCompleted) obj;
        if (notCompleted instanceof kotlinx.coroutines.CancelHandler) {
            callCancelHandler((kotlinx.coroutines.CancelHandler) obj, cause);
        } else if (notCompleted instanceof kotlinx.coroutines.internal.Segment) {
            Camera2StreamConfigurationMap((kotlinx.coroutines.internal.Segment) obj, cause);
        }
        if (!Camera2StreamConfigurationMap()) {
            detachChild$kotlinx_coroutines_core();
        }
        Camera2StreamConfigurationMap(this.resumeMode);
        return true;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object takenState, java.lang.Throwable cause) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoFpsRangesFor;
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
                if (completedContinuation.getHighSpeedVideoSizes()) {
                    throw new java.lang.IllegalStateException("Must be called at most once".toString());
                }
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRangesFor, this, obj, kotlinx.coroutines.CompletedContinuation.getHighSpeedVideoSizes(completedContinuation, null, null, null, null, cause, 15))) {
                    completedContinuation.getHighSpeedVideoFpsRanges(this, cause);
                    return;
                }
            } else if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRangesFor, this, obj, new kotlinx.coroutines.CompletedContinuation(obj, null, null, null, cause, 14, null))) {
                return;
            }
        }
    }

    public final java.lang.Object getState$kotlinx_coroutines_core() {
        return getHighSpeedVideoFpsRangesFor.get(this);
    }

    @Override // kotlinx.coroutines.Waiter
    public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, int index) {
        int i;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = getHighSpeedVideoFpsRanges;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & 536870911) != 536870911) {
                throw new java.lang.IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, ((i >> 29) << 29) + index));
        getHighSpeedVideoSizes(segment);
    }

    public final <R> void resumeImpl$kotlinx_coroutines_core(R proposedUpdate, int resumeMode, kotlin.jvm.functions.Function3<? super java.lang.Throwable, ? super R, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit> onCancellation) {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoFpsRangesFor;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof kotlinx.coroutines.NotCompleted)) {
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
                throw new java.lang.IllegalStateException("Already resumed, but proposed with update ".concat(java.lang.String.valueOf(proposedUpdate)).toString());
            }
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRangesFor, this, obj, getHighSpeedVideoFpsRanges((kotlinx.coroutines.NotCompleted) obj, proposedUpdate, resumeMode, onCancellation, null)));
        if (!Camera2StreamConfigurationMap()) {
            detachChild$kotlinx_coroutines_core();
        }
        Camera2StreamConfigurationMap(resumeMode);
    }
}
