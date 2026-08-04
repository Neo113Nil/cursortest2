package W5;

import U5.EnumC0446m;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class E0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6764b;

    public /* synthetic */ E0(Object obj, int i7) {
        this.f6763a = i7;
        this.f6764b = obj;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Set setKeySet;
        switch (this.f6763a) {
            case 0:
                Logger logger = Q0.f6922g0;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder("[");
                Q0 q1 = (Q0) this.f6764b;
                sb.append(q1.f6958d);
                sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
                logger.log(level, sb.toString(), th);
                if (q1.f6932C) {
                    return;
                }
                q1.f6932C = true;
                q1.B(true);
                q1.G(false);
                D0 d7 = new D0(th);
                q1.f6931B = d7;
                q1.f6937H.i(d7);
                q1.f6949T.t(null);
                q1.f6947R.l(4, "PANIC! Entering TRANSIENT_FAILURE");
                q1.f6977u.b(EnumC0446m.f6552c);
                return;
            case 1:
                ((android.support.v4.media.session.t) ((p094n.c) this.f6764b).f15289b).j0(th);
                return;
            default:
                P2 p5 = (P2) this.f6764b;
                synchronized (((WeakHashMap) p5.f17515c)) {
                    setKeySet = ((WeakHashMap) p5.f17515c).keySet();
                    break;
                }
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    ((Thread.UncaughtExceptionHandler) it.next()).uncaughtException(thread, th);
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) ((P2) this.f6764b).f17514b;
                if (uncaughtExceptionHandler != null) {
                    try {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
        }
    }
}
