package He;

import De.B;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.AbstractC10744q0;
import xe.I;

/* loaded from: classes.dex */
public final class b extends AbstractC10744q0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f10879b = new b();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final I f10880c;

    static {
        k kVar = k.f10893b;
        int a11 = B.a();
        if (64 >= a11) {
            a11 = 64;
        }
        f10880c = kVar.w(B.d(a11, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NotNull Runnable runnable) {
        q(kotlin.coroutines.g.f71771a, runnable);
    }

    @Override // xe.I
    public final void q(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        f10880c.q(coroutineContext, runnable);
    }

    @Override // xe.I
    public final void r(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        f10880c.r(coroutineContext, runnable);
    }

    @Override // xe.I
    @NotNull
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // xe.I
    @NotNull
    public final I w(int i11) {
        return k.f10893b.w(i11);
    }

    @Override // xe.AbstractC10744q0
    @NotNull
    public final Executor x() {
        return this;
    }
}
