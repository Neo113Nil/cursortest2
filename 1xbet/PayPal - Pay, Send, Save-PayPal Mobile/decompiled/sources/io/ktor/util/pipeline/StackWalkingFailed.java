package io.ktor.util.pipeline;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"Lio/ktor/util/pipeline/StackWalkingFailed;", "", "<init>", "()V", "", "failedToCaptureStackFrame"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StackWalkingFailed {
    public static final io.ktor.util.pipeline.StackWalkingFailed INSTANCE = new io.ktor.util.pipeline.StackWalkingFailed();

    private StackWalkingFailed() {
    }

    public final void failedToCaptureStackFrame() {
        throw new java.lang.IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.".toString());
    }
}
