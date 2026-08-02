package Ce;

import com.google.common.util.concurrent.o;
import com.google.common.util.concurrent.s;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes.dex */
public final class b {
    public static final Object a(@NotNull androidx.concurrent.futures.c cVar, @NotNull d frame) {
        try {
            if (cVar.isDone()) {
                return s.a(cVar);
            }
            C10737n c10737n = new C10737n(1, Wc.b.b(frame));
            c10737n.o();
            cVar.a(new c(cVar, c10737n), o.a());
            c10737n.q(new C2758a(cVar));
            Object n11 = c10737n.n();
            if (n11 == Wc.a.COROUTINE_SUSPENDED) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return n11;
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            Intrinsics.f(cause);
            throw cause;
        }
    }
}
