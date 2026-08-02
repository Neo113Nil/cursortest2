package kotlinx.coroutines.intrinsics;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aQ\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001aX\u0010\r\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aX\u0010\u000f\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0005\u001a\u00028\u00012'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a`\u0010\u0014\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u00012'\u0010\u0013\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0002\b\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "receiver", "completion", "", "startCoroutineUndispatched", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Lkotlin/ExtensionFunctionType;", "block", "startUndispatchedOrReturn", "(Lkotlinx/coroutines/internal/ScopeCoroutine;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "startUndispatchedOrReturnIgnoreTimeout", "", "p0", "p1", "p2", "getHighResolutionOutputSizeshNQ4ISI", "(Lkotlinx/coroutines/internal/ScopeCoroutine;ZLjava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UndispatchedKt {
    public static final <T, R> java.lang.Object startUndispatchedOrReturn(kotlinx.coroutines.internal.ScopeCoroutine<? super T> scopeCoroutine, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        return getHighResolutionOutputSizeshNQ4ISI(scopeCoroutine, true, r, function2);
    }

    public static final <T, R> java.lang.Object startUndispatchedOrReturnIgnoreTimeout(kotlinx.coroutines.internal.ScopeCoroutine<? super T> scopeCoroutine, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        return getHighResolutionOutputSizeshNQ4ISI(scopeCoroutine, false, r, function2);
    }

    private static final <T, R> java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.internal.ScopeCoroutine<? super T> scopeCoroutine, boolean z, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        java.lang.Object completedExceptionally;
        java.lang.Object makeCompletingOnce$kotlinx_coroutines_core;
        try {
            completedExceptionally = !(function2 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl) ? kotlin.coroutines.intrinsics.IntrinsicsKt.wrapWithContinuationImpl(function2, r, scopeCoroutine) : ((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, scopeCoroutine);
        } catch (kotlinx.coroutines.DispatchException e) {
            scopeCoroutine.makeCompleting$kotlinx_coroutines_core(new kotlinx.coroutines.CompletedExceptionally(e.getCause(), false, 2, null));
            java.lang.Throwable cause = e.getCause();
            kotlin.coroutines.Continuation<? super T> continuation = scopeCoroutine.uCont;
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                throw kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(cause, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
            }
            throw cause;
        } catch (java.lang.Throwable th) {
            completedExceptionally = new kotlinx.coroutines.CompletedExceptionally(th, false, 2, null);
        }
        if (completedExceptionally != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() && (makeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally)) != kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            scopeCoroutine.afterCompletionUndispatched();
            if (makeCompletingOnce$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
                if (!z) {
                    java.lang.Throwable th2 = ((kotlinx.coroutines.CompletedExceptionally) makeCompletingOnce$kotlinx_coroutines_core).cause;
                    if ((th2 instanceof kotlinx.coroutines.TimeoutCancellationException) && ((kotlinx.coroutines.TimeoutCancellationException) th2).coroutine == scopeCoroutine) {
                        if (!(completedExceptionally instanceof kotlinx.coroutines.CompletedExceptionally)) {
                            return completedExceptionally;
                        }
                        java.lang.Throwable th3 = ((kotlinx.coroutines.CompletedExceptionally) completedExceptionally).cause;
                        kotlin.coroutines.Continuation<? super T> continuation2 = scopeCoroutine.uCont;
                        if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                            throw kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(th3, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation2);
                        }
                        throw th3;
                    }
                }
                java.lang.Throwable th4 = ((kotlinx.coroutines.CompletedExceptionally) makeCompletingOnce$kotlinx_coroutines_core).cause;
                kotlin.coroutines.Continuation<? super T> continuation3 = scopeCoroutine.uCont;
                if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation3 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                    throw kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(th4, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation3);
                }
                throw th4;
            }
            return kotlinx.coroutines.JobSupportKt.unboxState(makeCompletingOnce$kotlinx_coroutines_core);
        }
        return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
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
                    probeCoroutineCreated.resumeWith(kotlin.Result.m23436constructorimpl(wrapWithContinuationImpl));
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
            probeCoroutineCreated.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th)));
        }
    }
}
