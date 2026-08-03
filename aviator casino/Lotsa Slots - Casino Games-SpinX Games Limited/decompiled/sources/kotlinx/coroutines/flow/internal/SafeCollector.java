package kotlinx.coroutines.flow.internal;

/* compiled from: SafeCollector.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001d\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001bH\u0014¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0014H\u0016J\u0016\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010 J%\u0010\u001e\u001a\u0004\u0018\u00010\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J'\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010&J\u001a\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020)2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0019H\u0002R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u00020\u00108\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collector", "collectContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "collectContextSize", "", "lastEmissionContext", "completion_", "Lkotlin/coroutines/Continuation;", "", "context", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uCont", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)Ljava/lang/Object;", "checkContext", "currentContext", "previousContext", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "exceptionTransparencyViolated", "exception", "Lkotlinx/coroutines/flow/internal/DownstreamExceptionContext;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SafeCollector<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl implements kotlinx.coroutines.flow.FlowCollector<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {
    public final kotlin.coroutines.CoroutineContext collectContext;
    public final int collectContextSize;
    public final kotlinx.coroutines.flow.FlowCollector<T> collector;
    private kotlin.coroutines.Continuation<? super kotlin.Unit> completion_;
    private kotlin.coroutines.CoroutineContext lastEmissionContext;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int collectContextSize$lambda$0(int i, kotlin.coroutines.CoroutineContext.Element element) {
        return i + 1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
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
                int collectContextSize$lambda$0;
                collectContextSize$lambda$0 = kotlinx.coroutines.flow.internal.SafeCollector.collectContextSize$lambda$0(((java.lang.Integer) obj).intValue(), (kotlin.coroutines.CoroutineContext.Element) obj2);
                return java.lang.Integer.valueOf(collectContextSize$lambda$0);
            }
        })).intValue();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation = this.completion_;
        if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            return (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
        kotlin.coroutines.CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? kotlin.coroutines.EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    protected java.lang.Object invokeSuspend(java.lang.Object result) {
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(result);
        if (m10801exceptionOrNullimpl != null) {
            this.lastEmissionContext = new kotlinx.coroutines.flow.internal.DownstreamExceptionContext(m10801exceptionOrNullimpl, getContext());
        }
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation = this.completion_;
        if (continuation != null) {
            continuation.resumeWith(result);
        }
        return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        try {
            java.lang.Object emit = emit(continuation, (kotlin.coroutines.Continuation<? super kotlin.Unit>) t);
            if (emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            this.lastEmissionContext = new kotlinx.coroutines.flow.internal.DownstreamExceptionContext(th, continuation.getContext());
            throw th;
        }
    }

    private final java.lang.Object emit(kotlin.coroutines.Continuation<? super kotlin.Unit> uCont, T value) {
        kotlin.jvm.functions.Function3 function3;
        kotlin.coroutines.CoroutineContext context = uCont.getContext();
        kotlinx.coroutines.JobKt.ensureActive(context);
        kotlin.coroutines.CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != context) {
            checkContext(context, coroutineContext, value);
            this.lastEmissionContext = context;
        }
        this.completion_ = uCont;
        function3 = kotlinx.coroutines.flow.internal.SafeCollectorKt.emitFun;
        kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.collector;
        kotlin.jvm.internal.Intrinsics.checkNotNull(flowCollector, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        java.lang.Object invoke = function3.invoke(flowCollector, value, this);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(invoke, kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED())) {
            this.completion_ = null;
        }
        return invoke;
    }

    private final void checkContext(kotlin.coroutines.CoroutineContext currentContext, kotlin.coroutines.CoroutineContext previousContext, T value) {
        if (previousContext instanceof kotlinx.coroutines.flow.internal.DownstreamExceptionContext) {
            exceptionTransparencyViolated((kotlinx.coroutines.flow.internal.DownstreamExceptionContext) previousContext, value);
        }
        kotlinx.coroutines.flow.internal.SafeCollector_commonKt.checkContext(this, currentContext);
    }

    private final void exceptionTransparencyViolated(kotlinx.coroutines.flow.internal.DownstreamExceptionContext exception, java.lang.Object value) {
        throw new java.lang.IllegalStateException(kotlin.text.StringsKt.trimIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + exception.e + ", but then emission attempt of value '" + value + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }
}
