package De;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* renamed from: De.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2865h extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final transient CoroutineContext f6621a;

    public C2865h(@NotNull CoroutineContext coroutineContext) {
        this.f6621a = coroutineContext;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String getLocalizedMessage() {
        return this.f6621a.toString();
    }
}
