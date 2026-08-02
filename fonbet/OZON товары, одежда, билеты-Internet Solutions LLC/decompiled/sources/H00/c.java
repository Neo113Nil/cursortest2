package H00;

import Sc.C4001c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.h;

/* loaded from: classes3.dex */
public final class c {
    public static final void a(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        b(throwable, null);
    }

    public static final void b(@NotNull Throwable throwable, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        int i11 = b.f10449e;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (b.c()) {
            h b11 = b.b();
            ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.ERROR;
            Thread currentThread = Thread.currentThread();
            String invoke = function0 != null ? function0.invoke() : null;
            h.a.d(b11, cVar, currentThread + ": " + invoke + " \n " + C4001c.b(throwable), null, Boolean.TRUE, 4);
        }
    }

    public static final void c(@NotNull Exception throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        d(throwable, null);
    }

    public static final void d(Throwable th2, Function0<String> function0) {
        if (b.c()) {
            if (th2 == null && function0 == null) {
                return;
            }
            ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.WARNING;
            if (th2 == null) {
                h b11 = b.b();
                Thread currentThread = Thread.currentThread();
                String invoke = function0 != null ? function0.invoke() : null;
                if (invoke == null) {
                    invoke = "";
                }
                h.a.d(b11, cVar, currentThread + ": " + invoke, null, Boolean.TRUE, 4);
                return;
            }
            if (function0 == null) {
                h.a.d(b.b(), cVar, C4001c.b(th2), null, Boolean.TRUE, 4);
                return;
            }
            h b12 = b.b();
            Thread currentThread2 = Thread.currentThread();
            String invoke2 = function0.invoke();
            h.a.d(b12, cVar, currentThread2 + ": " + ((Object) invoke2) + " \n " + C4001c.b(th2), null, Boolean.TRUE, 4);
        }
    }

    public static final void e(@NotNull Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        d(null, message);
    }
}
