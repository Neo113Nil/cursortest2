package _COROUTINE;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"L_COROUTINE/ArtificialStackFrames;", "", "<init>", "()V", "Ljava/lang/StackTraceElement;", "coroutineCreation", "()Ljava/lang/StackTraceElement;", "coroutineBoundary"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArtificialStackFrames {
    public final java.lang.StackTraceElement coroutineCreation() {
        return _COROUTINE.CoroutineDebuggingKt.access$artificialFrame(new java.lang.Exception(), "_CREATION");
    }

    public final java.lang.StackTraceElement coroutineBoundary() {
        return _COROUTINE.CoroutineDebuggingKt.access$artificialFrame(new java.lang.Exception(), "_BOUNDARY");
    }
}
