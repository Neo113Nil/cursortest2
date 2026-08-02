package Ce;

import Sc.r;
import com.google.common.util.concurrent.s;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes.dex */
final class c<T> implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.concurrent.futures.c f4811a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10737n f4812b;

    public c(@NotNull androidx.concurrent.futures.c cVar, @NotNull C10737n c10737n) {
        this.f4811a = cVar;
        this.f4812b = c10737n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.concurrent.futures.c cVar = this.f4811a;
        boolean isCancelled = cVar.isCancelled();
        C10737n c10737n = this.f4812b;
        if (isCancelled) {
            c10737n.A(null);
            return;
        }
        try {
            r.Companion companion = r.INSTANCE;
            c10737n.resumeWith(s.a(cVar));
        } catch (ExecutionException e11) {
            r.Companion companion2 = r.INSTANCE;
            Throwable cause = e11.getCause();
            Intrinsics.f(cause);
            c10737n.resumeWith(Sc.s.a(cause));
        }
    }
}
