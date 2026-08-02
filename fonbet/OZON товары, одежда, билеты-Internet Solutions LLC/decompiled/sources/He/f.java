package He;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.AbstractC10744q0;

/* loaded from: classes.dex */
public class f extends AbstractC10744q0 {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private a f10883b;

    public f(long j11, int i11, int i12, @NotNull String str) {
        this.f10883b = new a(j11, i11, i12, str);
    }

    @Override // xe.I
    public final void q(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        a.k(this.f10883b, runnable, 6);
    }

    @Override // xe.I
    public final void r(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        a.k(this.f10883b, runnable, 2);
    }

    @Override // xe.AbstractC10744q0
    @NotNull
    public final Executor x() {
        return this.f10883b;
    }

    public final void z(@NotNull Runnable runnable, boolean z11) {
        this.f10883b.j(runnable, true, z11);
    }
}
