package bf;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f55986a;

    f(e eVar) {
        this.f55986a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC5657a e11;
        Logger logger;
        long j11;
        while (true) {
            synchronized (this.f55986a) {
                e11 = this.f55986a.e();
            }
            if (e11 == null) {
                return;
            }
            c d11 = e11.d();
            Intrinsics.f(d11);
            logger = e.f55977i;
            boolean isLoggable = logger.isLoggable(Level.FINE);
            if (isLoggable) {
                d11.h().getClass();
                j11 = System.nanoTime();
                C5658b.a(e11, d11, "starting");
            } else {
                j11 = -1;
            }
            try {
                try {
                    e.b(this.f55986a, e11);
                    Unit unit = Unit.f71690a;
                    if (isLoggable) {
                        d11.h().getClass();
                        C5658b.a(e11, d11, "finished run in ".concat(C5658b.b(System.nanoTime() - j11)));
                    }
                } finally {
                }
            } catch (Throwable th2) {
                if (isLoggable) {
                    d11.h().getClass();
                    C5658b.a(e11, d11, "failed a run in ".concat(C5658b.b(System.nanoTime() - j11)));
                }
                throw th2;
            }
        }
    }
}
