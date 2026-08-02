package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010#R\u0014\u0010'\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collector", "Lkotlin/coroutines/CoroutineContext;", "collectContext", "<init>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "releaseIntercepted", "()V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/CoroutineContext;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "", "collectContextSize", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/Continuation;", "getHighSpeedVideoSizes", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SafeCollector<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl implements kotlinx.coroutines.flow.FlowCollector<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {
    public final kotlin.coroutines.CoroutineContext collectContext;
    public final int collectContextSize;
    public final kotlinx.coroutines.flow.FlowCollector<T> collector;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private kotlin.coroutines.Continuation<? super kotlin.Unit> getHighSpeedVideoSizes;

    public static /* synthetic */ int $r8$lambda$idxg0bEmSgrK6v2pQsR7xybd4HY(int i, kotlin.coroutines.CoroutineContext.Element element) {
        return i + 1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    /* renamed from: getStackTraceElement */
    public final java.lang.StackTraceElement getGetHighResolutionOutputSizeshNQ4ISI() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.CoroutineContext coroutineContext) {
        super(kotlinx.coroutines.flow.internal.NoOpContinuation.INSTANCE, kotlin.coroutines.EmptyCoroutineContext.INSTANCE);
        this.collector = flowCollector;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((java.lang.Number) coroutineContext.fold(0, new kotlin.jvm.functions.Function2() { // from class: kotlinx.coroutines.flow.internal.SafeCollector$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Integer.valueOf(kotlinx.coroutines.flow.internal.SafeCollector.$r8$lambda$idxg0bEmSgrK6v2pQsR7xybd4HY(((java.lang.Integer) obj).intValue(), (kotlin.coroutines.CoroutineContext.Element) obj2));
            }
        })).intValue();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation = this.getHighSpeedVideoSizes;
        if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            return (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    public final kotlin.coroutines.CoroutineContext getContext() {
        kotlin.coroutines.CoroutineContext coroutineContext = this.getHighSpeedVideoFpsRanges;
        return coroutineContext == null ? kotlin.coroutines.EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object result) {
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(result);
        if (m23439exceptionOrNullimpl != null) {
            this.getHighSpeedVideoFpsRanges = new kotlinx.coroutines.flow.internal.DownstreamExceptionContext(m23439exceptionOrNullimpl, getContext());
        }
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation = this.getHighSpeedVideoSizes;
        if (continuation != null) {
            continuation.resumeWith(result);
        }
        return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.jvm.functions.Function3 function3;
        try {
            kotlin.coroutines.CoroutineContext context = continuation.getContext();
            kotlinx.coroutines.JobKt.ensureActive(context);
            kotlin.coroutines.CoroutineContext coroutineContext = this.getHighSpeedVideoFpsRanges;
            if (coroutineContext != context) {
                if (!(coroutineContext instanceof kotlinx.coroutines.flow.internal.DownstreamExceptionContext)) {
                    kotlinx.coroutines.flow.internal.SafeCollector_commonKt.checkContext(this, context);
                    this.getHighSpeedVideoFpsRanges = context;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                    sb.append(((kotlinx.coroutines.flow.internal.DownstreamExceptionContext) coroutineContext).e);
                    sb.append(", but then emission attempt of value '");
                    sb.append(t);
                    sb.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                    throw new java.lang.IllegalStateException(kotlin.text.StringsKt.trimIndent(sb.toString()).toString());
                }
            }
            this.getHighSpeedVideoSizes = continuation;
            function3 = kotlinx.coroutines.flow.internal.SafeCollectorKt.Camera2StreamConfigurationMap;
            kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.collector;
            kotlin.jvm.internal.Intrinsics.checkNotNull(flowCollector, "");
            kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
            java.lang.Object invoke = function3.invoke(flowCollector, t, this);
            if (!kotlin.jvm.internal.Intrinsics.areEqual(invoke, kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED())) {
                this.getHighSpeedVideoSizes = null;
            }
            if (invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return invoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            this.getHighSpeedVideoFpsRanges = new kotlinx.coroutines.flow.internal.DownstreamExceptionContext(th, continuation.getContext());
            throw th;
        }
    }
}
