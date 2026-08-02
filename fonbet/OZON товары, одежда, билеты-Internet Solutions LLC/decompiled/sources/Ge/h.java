package Ge;

import Kc.C3493a;
import Sc.C4001c;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import xe.K;

/* loaded from: classes10.dex */
public final class h {
    public static final void a(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        if (th2 instanceof CancellationException) {
            return;
        }
        try {
            C3493a.f(th2);
        } catch (Throwable th3) {
            C4001c.a(th2, th3);
            K.a(coroutineContext, th2);
        }
    }
}
