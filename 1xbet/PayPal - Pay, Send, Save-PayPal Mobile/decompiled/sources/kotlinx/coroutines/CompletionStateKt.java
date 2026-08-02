package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\u0003\u0010\u0007\u001a3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"T", "Lkotlin/Result;", "", "toState", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/CancellableContinuation;", "caller", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Object;", "state", "Lkotlin/coroutines/Continuation;", "uCont", "recoverResult", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CompletionStateKt {
    public static final <T> java.lang.Object toState(java.lang.Object obj) {
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(obj);
        return m23439exceptionOrNullimpl == null ? obj : new kotlinx.coroutines.CompletedExceptionally(m23439exceptionOrNullimpl, false, 2, null);
    }

    public static final <T> java.lang.Object toState(java.lang.Object obj, kotlinx.coroutines.CancellableContinuation<?> cancellableContinuation) {
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(obj);
        if (m23439exceptionOrNullimpl == null) {
            return obj;
        }
        if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()) {
            kotlinx.coroutines.CancellableContinuation<?> cancellableContinuation2 = cancellableContinuation;
            if (cancellableContinuation2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
                m23439exceptionOrNullimpl = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(m23439exceptionOrNullimpl, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) cancellableContinuation2);
            }
        }
        return new kotlinx.coroutines.CompletedExceptionally(m23439exceptionOrNullimpl, false, 2, null);
    }

    public static final <T> java.lang.Object recoverResult(java.lang.Object obj, kotlin.coroutines.Continuation<? super T> continuation) {
        if (obj instanceof kotlinx.coroutines.CompletedExceptionally) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.Throwable th = ((kotlinx.coroutines.CompletedExceptionally) obj).cause;
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                th = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(th, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
            }
            return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        return kotlin.Result.m23436constructorimpl(obj);
    }
}
