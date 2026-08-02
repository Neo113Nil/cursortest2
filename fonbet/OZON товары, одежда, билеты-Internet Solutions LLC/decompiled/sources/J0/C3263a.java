package J0;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* renamed from: J0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3263a extends CancellationException {
    public C3263a() {
        super("Anchored drag finished");
    }

    @Override // java.lang.Throwable
    @NotNull
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
