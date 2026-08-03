package kotlinx.coroutines;

/* compiled from: CompletionState.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0004\u001a+\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0000¢\u0006\u0002\u0010\u0007\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000bH\u0000¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"toState", "", "T", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "caller", "Lkotlinx/coroutines/CancellableContinuation;", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Object;", "recoverResult", "state", "uCont", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompletionStateKt {
    public static final <T> java.lang.Object toState(java.lang.Object obj) {
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(obj);
        return m10801exceptionOrNullimpl == null ? obj : new kotlinx.coroutines.CompletedExceptionally(m10801exceptionOrNullimpl, false, 2, null);
    }

    public static final <T> java.lang.Object toState(java.lang.Object obj, kotlinx.coroutines.CancellableContinuation<?> cancellableContinuation) {
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(obj);
        if (m10801exceptionOrNullimpl != null) {
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
                kotlinx.coroutines.CancellableContinuation<?> cancellableContinuation2 = cancellableContinuation;
                if (cancellableContinuation2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
                    m10801exceptionOrNullimpl = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(m10801exceptionOrNullimpl, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) cancellableContinuation2);
                }
            }
            obj = new kotlinx.coroutines.CompletedExceptionally(m10801exceptionOrNullimpl, false, 2, null);
        }
        return obj;
    }

    public static final <T> java.lang.Object recoverResult(java.lang.Object obj, kotlin.coroutines.Continuation<? super T> continuation) {
        if (obj instanceof kotlinx.coroutines.CompletedExceptionally) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.Throwable th = ((kotlinx.coroutines.CompletedExceptionally) obj).cause;
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                th = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(th, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
            }
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        return kotlin.Result.m10798constructorimpl(obj);
    }
}
