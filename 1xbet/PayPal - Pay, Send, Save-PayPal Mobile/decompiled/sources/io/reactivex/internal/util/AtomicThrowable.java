package io.reactivex.internal.util;

/* loaded from: classes17.dex */
public final class AtomicThrowable extends java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public final boolean addThrowable(java.lang.Throwable th) {
        return io.reactivex.internal.util.ExceptionHelper.addThrowable(this, th);
    }

    public final java.lang.Throwable terminate() {
        return io.reactivex.internal.util.ExceptionHelper.terminate(this);
    }

    public final boolean isTerminated() {
        return get() == io.reactivex.internal.util.ExceptionHelper.TERMINATED;
    }
}
