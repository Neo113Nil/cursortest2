package Be;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* renamed from: Be.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2629a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final transient Object f3566a;

    public C2629a(@NotNull Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f3566a = obj;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
