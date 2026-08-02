package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;

/* renamed from: kotlinx.coroutines.internal.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1088e extends RuntimeException {
    public final transient CoroutineContext a;

    public C1088e(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.a.toString();
    }
}
