package De;

import Sc.C4001c;
import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* renamed from: De.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2864g {
    public static final void a(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        Throwable runtimeException;
        Iterator<xe.J> it = C2863f.a().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th2);
            } catch (Throwable th3) {
                if (th2 == th3) {
                    runtimeException = th2;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    C4001c.a(runtimeException, th2);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            C4001c.a(th2, new C2865h(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }
}
