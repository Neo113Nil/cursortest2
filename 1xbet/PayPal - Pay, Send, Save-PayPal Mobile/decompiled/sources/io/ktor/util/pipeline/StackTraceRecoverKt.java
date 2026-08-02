package io.ktor.util.pipeline;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "exception", "Lkotlin/coroutines/Continuation;", "continuation", "recoverStackTraceBridge", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StackTraceRecoverKt {
    public static final java.lang.Throwable recoverStackTraceBridge(java.lang.Throwable th, kotlin.coroutines.Continuation<?> continuation) {
        java.lang.Throwable th2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "");
        try {
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                th2 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(th, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
                return io.ktor.util.pipeline.StackTraceRecoverJvmKt.withCause(th2, th.getCause());
            }
            th2 = th;
            return io.ktor.util.pipeline.StackTraceRecoverJvmKt.withCause(th2, th.getCause());
        } catch (java.lang.Throwable unused) {
            return th;
        }
    }
}
