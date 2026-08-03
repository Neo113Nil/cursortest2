package kotlinx.coroutines.intrinsics;

/* compiled from: Undispatched.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aO\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010\u0007\u001a\u0002H\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0000¢\u0006\u0002\u0010\t\u001aV\u0010\n\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00030\u000b2\u0006\u0010\u0007\u001a\u0002H\u00022'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\b\rH\u0000¢\u0006\u0002\u0010\u000e\u001aV\u0010\u000f\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00030\u000b2\u0006\u0010\u0007\u001a\u0002H\u00022'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\b\rH\u0000¢\u0006\u0002\u0010\u000e\u001a^\u0010\u0010\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00030\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u0002H\u00022'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0002\b\rH\u0002¢\u0006\u0002\u0010\u0013\u001a\u0018\u0010\u0014\u001a\u00020\u0012*\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u0018\u0010\u0017\u001a\u00020\u0018*\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002¨\u0006\u001b"}, d2 = {"startCoroutineUndispatched", "", "R", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "receiver", "completion", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "startUndispatchedOrReturn", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "block", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/internal/ScopeCoroutine;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "startUndispatchedOrReturnIgnoreTimeout", "startUndspatched", "alwaysRethrow", "", "(Lkotlinx/coroutines/internal/ScopeCoroutine;ZLjava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "notOwnTimeout", "cause", "", "dispatchExceptionAndMakeCompleting", "", "e", "Lkotlinx/coroutines/DispatchException;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UndispatchedKt {
    public static final <T, R> java.lang.Object startUndispatchedOrReturn(kotlinx.coroutines.internal.ScopeCoroutine<? super T> scopeCoroutine, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        return startUndspatched(scopeCoroutine, true, r, function2);
    }

    public static final <T, R> java.lang.Object startUndispatchedOrReturnIgnoreTimeout(kotlinx.coroutines.internal.ScopeCoroutine<? super T> scopeCoroutine, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        return startUndspatched(scopeCoroutine, false, r, function2);
    }

    private static final <T, R> java.lang.Object startUndspatched(kotlinx.coroutines.internal.ScopeCoroutine<? super T> scopeCoroutine, boolean z, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        java.lang.Object completedExceptionally;
        java.lang.Object makeCompletingOnce$kotlinx_coroutines_core;
        try {
            completedExceptionally = !(function2 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl) ? kotlin.coroutines.intrinsics.IntrinsicsKt.wrapWithContinuationImpl(function2, r, scopeCoroutine) : ((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, scopeCoroutine);
        } catch (kotlinx.coroutines.DispatchException e) {
            dispatchExceptionAndMakeCompleting(scopeCoroutine, e);
            throw new kotlin.KotlinNothingValueException();
        } catch (java.lang.Throwable th) {
            completedExceptionally = new kotlinx.coroutines.CompletedExceptionally(th, false, 2, null);
        }
        if (completedExceptionally != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() && (makeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally)) != kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            scopeCoroutine.afterCompletionUndispatched();
            if (makeCompletingOnce$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
                if (z || notOwnTimeout(scopeCoroutine, ((kotlinx.coroutines.CompletedExceptionally) makeCompletingOnce$kotlinx_coroutines_core).cause)) {
                    java.lang.Throwable th2 = ((kotlinx.coroutines.CompletedExceptionally) makeCompletingOnce$kotlinx_coroutines_core).cause;
                    kotlin.coroutines.Continuation<? super T> continuation = scopeCoroutine.uCont;
                    if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                        throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(th2, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
                    }
                    throw th2;
                }
                if (!(completedExceptionally instanceof kotlinx.coroutines.CompletedExceptionally)) {
                    return completedExceptionally;
                }
                java.lang.Throwable th3 = ((kotlinx.coroutines.CompletedExceptionally) completedExceptionally).cause;
                kotlin.coroutines.Continuation<? super T> continuation2 = scopeCoroutine.uCont;
                if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                    throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(th3, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation2);
                }
                throw th3;
            }
            return kotlinx.coroutines.JobSupportKt.unboxState(makeCompletingOnce$kotlinx_coroutines_core);
        }
        return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    private static final boolean notOwnTimeout(kotlinx.coroutines.internal.ScopeCoroutine<?> scopeCoroutine, java.lang.Throwable th) {
        return ((th instanceof kotlinx.coroutines.TimeoutCancellationException) && ((kotlinx.coroutines.TimeoutCancellationException) th).coroutine == scopeCoroutine) ? false : true;
    }

    private static final java.lang.Void dispatchExceptionAndMakeCompleting(kotlinx.coroutines.internal.ScopeCoroutine<?> scopeCoroutine, kotlinx.coroutines.DispatchException dispatchException) {
        scopeCoroutine.makeCompleting$kotlinx_coroutines_core(new kotlinx.coroutines.CompletedExceptionally(dispatchException.getCause(), false, 2, null));
        java.lang.Throwable cause = dispatchException.getCause();
        kotlin.coroutines.Continuation<?> continuation = scopeCoroutine.uCont;
        if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
            throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(cause, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
        }
        throw cause;
    }

    public static final <R, T> void startCoroutineUndispatched(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, R r, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.coroutines.Continuation probeCoroutineCreated = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            kotlin.coroutines.CoroutineContext context = probeCoroutineCreated.getContext();
            java.lang.Object updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, null);
            try {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineResumed(probeCoroutineCreated);
                java.lang.Object wrapWithContinuationImpl = !(function2 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl) ? kotlin.coroutines.intrinsics.IntrinsicsKt.wrapWithContinuationImpl(function2, r, probeCoroutineCreated) : ((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, probeCoroutineCreated);
                if (wrapWithContinuationImpl != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    probeCoroutineCreated.resumeWith(kotlin.Result.m10798constructorimpl(wrapWithContinuationImpl));
                }
            } finally {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
        } catch (java.lang.Throwable th) {
            th = th;
            if (th instanceof kotlinx.coroutines.DispatchException) {
                th = ((kotlinx.coroutines.DispatchException) th).getCause();
            }
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            probeCoroutineCreated.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th)));
        }
    }
}
