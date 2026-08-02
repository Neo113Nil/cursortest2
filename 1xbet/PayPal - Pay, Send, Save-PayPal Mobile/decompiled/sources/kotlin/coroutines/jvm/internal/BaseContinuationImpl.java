package kotlin.coroutines.jvm.internal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH$¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/io/Serializable;", "completion", "<init>", "(Lkotlin/coroutines/Continuation;)V", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "create", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/coroutines/Continuation;", "getCompletion", "()Lkotlin/coroutines/Continuation;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class BaseContinuationImpl implements kotlin.coroutines.Continuation<java.lang.Object>, kotlin.coroutines.jvm.internal.CoroutineStackFrame, java.io.Serializable {
    private final kotlin.coroutines.Continuation<java.lang.Object> completion;

    protected abstract java.lang.Object invokeSuspend(java.lang.Object result);

    protected void releaseIntercepted() {
    }

    public BaseContinuationImpl(kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        this.completion = continuation;
    }

    public final kotlin.coroutines.Continuation<java.lang.Object> getCompletion() {
        return this.completion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(java.lang.Object result) {
        java.lang.Object invokeSuspend;
        kotlin.coroutines.Continuation continuation = this;
        while (true) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineResumed(continuation);
            kotlin.coroutines.jvm.internal.BaseContinuationImpl baseContinuationImpl = (kotlin.coroutines.jvm.internal.BaseContinuationImpl) continuation;
            kotlin.coroutines.Continuation continuation2 = baseContinuationImpl.completion;
            kotlin.jvm.internal.Intrinsics.checkNotNull(continuation2);
            try {
                invokeSuspend = baseContinuationImpl.invokeSuspend(result);
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                result = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (invokeSuspend == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return;
            }
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            result = kotlin.Result.m23436constructorimpl(invokeSuspend);
            baseContinuationImpl.releaseIntercepted();
            if (!(continuation2 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl)) {
                continuation2.resumeWith(result);
                return;
            }
            continuation = continuation2;
        }
    }

    public kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> completion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completion, "");
        throw new java.lang.UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object value, kotlin.coroutines.Continuation<?> completion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completion, "");
        throw new java.lang.UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Continuation at ");
        java.lang.Object getHighResolutionOutputSizeshNQ4ISI = getGetHighResolutionOutputSizeshNQ4ISI();
        if (getHighResolutionOutputSizeshNQ4ISI == null) {
            getHighResolutionOutputSizeshNQ4ISI = getClass().getName();
        }
        sb.append(getHighResolutionOutputSizeshNQ4ISI);
        return sb.toString();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
        kotlin.coroutines.Continuation<java.lang.Object> continuation = this.completion;
        if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            return (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    /* renamed from: getStackTraceElement */
    public java.lang.StackTraceElement getGetHighResolutionOutputSizeshNQ4ISI() {
        return kotlin.coroutines.jvm.internal.DebugMetadataKt.getStackTraceElement(this);
    }
}
