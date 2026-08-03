package io.ktor.util.pipeline;

/* compiled from: StackTraceRecover.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "exception", "Lkotlin/coroutines/Continuation;", "continuation", "recoverStackTraceBridge", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StackTraceRecoverKt {
    public static final java.lang.Throwable recoverStackTraceBridge(java.lang.Throwable exception, kotlin.coroutines.Continuation<?> continuation) {
        java.lang.Throwable th;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "continuation");
        try {
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                th = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(exception, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
                return io.ktor.util.pipeline.StackTraceRecoverJvmKt.withCause(th, exception.getCause());
            }
            th = exception;
            return io.ktor.util.pipeline.StackTraceRecoverJvmKt.withCause(th, exception.getCause());
        } catch (java.lang.Throwable unused) {
            return exception;
        }
    }
}
