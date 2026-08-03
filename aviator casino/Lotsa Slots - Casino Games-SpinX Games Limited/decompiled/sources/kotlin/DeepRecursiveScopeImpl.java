package kotlin;

/* compiled from: DeepRecursive.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004BJ\u00129\u0010\u0005\u001a5\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0002\b\b\u0012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0017\u001a\u00020\u00182\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H\u0016¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010\u001bJ2\u0010\u001a\u001a\u0002H\u001c\"\u0004\b\u0002\u0010\u001d\"\u0004\b\u0003\u0010\u001c*\u000e\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u001c0\u001e2\u0006\u0010\t\u001a\u0002H\u001dH\u0096@¢\u0006\u0002\u0010\u001fJd\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00042=\u0010!\u001a9\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006j\u0002`\r¢\u0006\u0002\b\b2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\u0002¢\u0006\u0002\u0010\"J\u000b\u0010#\u001a\u00028\u0001¢\u0006\u0002\u0010$RG\u0010\f\u001a9\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006j\u0002`\r¢\u0006\u0002\b\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lkotlin/DeepRecursiveScopeImpl;", "T", "R", "Lkotlin/DeepRecursiveScope;", "Lkotlin/coroutines/Continuation;", "block", "Lkotlin/Function3;", "", "Lkotlin/ExtensionFunctionType;", "value", "<init>", "(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;)V", "function", "Lkotlin/DeepRecursiveFunctionBlock;", "Lkotlin/jvm/functions/Function3;", "cont", "result", "Lkotlin/Result;", "Ljava/lang/Object;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "resumeWith", "", "(Ljava/lang/Object;)V", "callRecursive", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "U", "Lkotlin/DeepRecursiveFunction;", "(Lkotlin/DeepRecursiveFunction;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "crossFunctionCompletion", "currentFunction", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "runCallLoop", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DeepRecursiveScopeImpl<T, R> extends kotlin.DeepRecursiveScope<T, R> implements kotlin.coroutines.Continuation<R> {
    private kotlin.coroutines.Continuation<java.lang.Object> cont;
    private kotlin.jvm.functions.Function3<? super kotlin.DeepRecursiveScope<?, ?>, java.lang.Object, ? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> function;
    private java.lang.Object result;
    private java.lang.Object value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeepRecursiveScopeImpl(kotlin.jvm.functions.Function3<? super kotlin.DeepRecursiveScope<T, R>, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> block, T t) {
        super(null);
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        this.function = block;
        this.value = t;
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.cont = this;
        obj = kotlin.DeepRecursiveKt.UNDEFINED_RESULT;
        this.result = obj;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public kotlin.coroutines.CoroutineContext get$context() {
        return kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object result) {
        this.cont = null;
        this.result = result;
    }

    @Override // kotlin.DeepRecursiveScope
    public java.lang.Object callRecursive(T t, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.cont = continuation;
        this.value = t;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }

    @Override // kotlin.DeepRecursiveScope
    public <U, S> java.lang.Object callRecursive(kotlin.DeepRecursiveFunction<U, S> deepRecursiveFunction, U u, kotlin.coroutines.Continuation<? super S> continuation) {
        kotlin.jvm.functions.Function3<kotlin.DeepRecursiveScope<U, S>, U, kotlin.coroutines.Continuation<? super S>, java.lang.Object> block$kotlin_stdlib = deepRecursiveFunction.getBlock$kotlin_stdlib();
        kotlin.jvm.internal.Intrinsics.checkNotNull(block$kotlin_stdlib, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>");
        kotlin.jvm.functions.Function3<? super kotlin.DeepRecursiveScope<?, ?>, java.lang.Object, ? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> function3 = this.function;
        if (block$kotlin_stdlib != function3) {
            this.function = block$kotlin_stdlib;
            kotlin.jvm.internal.Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.cont = crossFunctionCompletion(function3, continuation);
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.cont = continuation;
        }
        this.value = u;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }

    private final kotlin.coroutines.Continuation<java.lang.Object> crossFunctionCompletion(final kotlin.jvm.functions.Function3<? super kotlin.DeepRecursiveScope<?, ?>, java.lang.Object, ? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> currentFunction, final kotlin.coroutines.Continuation<java.lang.Object> cont) {
        final kotlin.coroutines.EmptyCoroutineContext emptyCoroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        return new kotlin.coroutines.Continuation<java.lang.Object>() { // from class: kotlin.DeepRecursiveScopeImpl$crossFunctionCompletion$$inlined$Continuation$1
            @Override // kotlin.coroutines.Continuation
            /* renamed from: getContext, reason: from getter */
            public kotlin.coroutines.CoroutineContext get$context() {
                return kotlin.coroutines.CoroutineContext.this;
            }

            @Override // kotlin.coroutines.Continuation
            public void resumeWith(java.lang.Object result) {
                this.function = currentFunction;
                this.cont = cont;
                this.result = result;
            }
        };
    }

    public final R runCallLoop() {
        java.lang.Object obj;
        java.lang.Object obj2;
        while (true) {
            R r = (R) this.result;
            kotlin.coroutines.Continuation<java.lang.Object> continuation = this.cont;
            if (continuation != null) {
                obj = kotlin.DeepRecursiveKt.UNDEFINED_RESULT;
                if (!kotlin.Result.m10800equalsimpl0(obj, r)) {
                    obj2 = kotlin.DeepRecursiveKt.UNDEFINED_RESULT;
                    this.result = obj2;
                    continuation.resumeWith(r);
                } else {
                    try {
                        kotlin.jvm.functions.Function3<? super kotlin.DeepRecursiveScope<?, ?>, java.lang.Object, ? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> function3 = this.function;
                        java.lang.Object obj3 = this.value;
                        java.lang.Object wrapWithContinuationImpl = !(function3 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl) ? kotlin.coroutines.intrinsics.IntrinsicsKt.wrapWithContinuationImpl(function3, this, obj3, continuation) : ((kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function3, 3)).invoke(this, obj3, continuation);
                        if (wrapWithContinuationImpl != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            continuation.resumeWith(kotlin.Result.m10798constructorimpl(wrapWithContinuationImpl));
                        }
                    } catch (java.lang.Throwable th) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        continuation.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th)));
                    }
                }
            } else {
                kotlin.ResultKt.throwOnFailure(r);
                return r;
            }
        }
    }
}
