package io.ktor.util.pipeline;

/* compiled from: SuspendFunctionGun.kt */
@kotlin.Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0017\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"io/ktor/util/pipeline/SuspendFunctionGun$continuation$1", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lio/ktor/util/CoroutineStackFrame;", "Ljava/lang/StackTraceElement;", "Lio/ktor/util/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "peekContinuation", "()Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "", "currentIndex", "I", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SuspendFunctionGun$continuation$1 implements kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {
    private int currentIndex = Integer.MIN_VALUE;
    final /* synthetic */ io.ktor.util.pipeline.SuspendFunctionGun<TSubject, TContext> this$0;

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
        return null;
    }

    SuspendFunctionGun$continuation$1(io.ktor.util.pipeline.SuspendFunctionGun<TSubject, TContext> suspendFunctionGun) {
        this.this$0 = suspendFunctionGun;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
        kotlin.coroutines.Continuation<?> peekContinuation = peekContinuation();
        if (peekContinuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            return (kotlin.coroutines.jvm.internal.CoroutineStackFrame) peekContinuation;
        }
        return null;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final void setCurrentIndex(int i) {
        this.currentIndex = i;
    }

    private final kotlin.coroutines.Continuation<?> peekContinuation() {
        kotlin.coroutines.Continuation<?>[] continuationArr;
        int i;
        if (this.currentIndex == Integer.MIN_VALUE) {
            i = ((io.ktor.util.pipeline.SuspendFunctionGun) this.this$0).lastSuspensionIndex;
            this.currentIndex = i;
        }
        if (this.currentIndex >= 0) {
            try {
                continuationArr = ((io.ktor.util.pipeline.SuspendFunctionGun) this.this$0).suspensions;
                int i2 = this.currentIndex;
                kotlin.coroutines.Continuation<?> continuation = continuationArr[i2];
                if (continuation == null) {
                    return io.ktor.util.pipeline.StackWalkingFailedFrame.INSTANCE;
                }
                this.currentIndex = i2 - 1;
                return continuation;
            } catch (java.lang.Throwable unused) {
                return io.ktor.util.pipeline.StackWalkingFailedFrame.INSTANCE;
            }
        }
        this.currentIndex = Integer.MIN_VALUE;
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public kotlin.coroutines.CoroutineContext get$context() {
        kotlin.coroutines.Continuation[] continuationArr;
        int i;
        int i2;
        kotlin.coroutines.Continuation[] continuationArr2;
        continuationArr = ((io.ktor.util.pipeline.SuspendFunctionGun) this.this$0).suspensions;
        i = ((io.ktor.util.pipeline.SuspendFunctionGun) this.this$0).lastSuspensionIndex;
        kotlin.coroutines.Continuation continuation = continuationArr[i];
        if (continuation == this || continuation == null) {
            i2 = ((io.ktor.util.pipeline.SuspendFunctionGun) this.this$0).lastSuspensionIndex;
            int i3 = i2 - 1;
            while (i3 >= 0) {
                continuationArr2 = ((io.ktor.util.pipeline.SuspendFunctionGun) this.this$0).suspensions;
                int i4 = i3 - 1;
                kotlin.coroutines.Continuation continuation2 = continuationArr2[i3];
                if (continuation2 != this && continuation2 != null) {
                    return continuation2.get$context();
                }
                i3 = i4;
            }
            throw new java.lang.IllegalStateException("Not started".toString());
        }
        return continuation.get$context();
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object result) {
        if (!kotlin.Result.m10804isFailureimpl(result)) {
            this.this$0.loop(false);
            return;
        }
        io.ktor.util.pipeline.SuspendFunctionGun<TSubject, TContext> suspendFunctionGun = this.this$0;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(result);
        kotlin.jvm.internal.Intrinsics.checkNotNull(m10801exceptionOrNullimpl);
        suspendFunctionGun.resumeRootWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl)));
    }
}
