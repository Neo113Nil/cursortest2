package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0016\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0019\u0010\u001a\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8EX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lkotlinx/coroutines/internal/ScopeCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/getHighResolutionOutputSizeshNQ4ISI;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "state", "", "afterCompletion", "(Ljava/lang/Object;)V", "afterCompletionUndispatched", "()V", "afterResume", "Lkotlin/coroutines/Continuation;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "", "isScopedCoroutine", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ScopeCoroutine<T> extends kotlinx.coroutines.AbstractCoroutine<T> implements kotlin.coroutines.jvm.internal.CoroutineStackFrame {
    public final kotlin.coroutines.Continuation<T> uCont;

    public void afterCompletionUndispatched() {
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    /* renamed from: getStackTraceElement */
    public final java.lang.StackTraceElement getGetHighResolutionOutputSizeshNQ4ISI() {
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean isScopedCoroutine() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScopeCoroutine(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.Continuation<? super T> continuation) {
        super(coroutineContext, true, true);
        this.uCont = continuation;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
        kotlin.coroutines.Continuation<T> continuation = this.uCont;
        if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            return (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void afterCompletion(java.lang.Object state) {
        kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(this.uCont), kotlinx.coroutines.CompletionStateKt.recoverResult(state, this.uCont));
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void afterResume(java.lang.Object state) {
        kotlin.coroutines.Continuation<T> continuation = this.uCont;
        continuation.resumeWith(kotlinx.coroutines.CompletionStateKt.recoverResult(state, continuation));
    }
}
