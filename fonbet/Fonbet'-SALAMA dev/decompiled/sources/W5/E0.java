package W5;

import U5.EnumC0446m;
import java.lang.Thread;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import n.ThreadFactoryC1443c;
import w1.P2;

/* loaded from: classes2.dex */
public final class E0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6763a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6764b;

    public /* synthetic */ E0(Object obj, int i7) {
        this.f6763a = i7;
        this.f6764b = obj;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Set keySet;
        switch (this.f6763a) {
            case 0:
                Logger logger = Q0.f6922g0;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder("[");
                Q0 q02 = (Q0) this.f6764b;
                sb.append(q02.f6958d);
                sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
                logger.log(level, sb.toString(), th);
                if (q02.f6932C) {
                    return;
                }
                q02.f6932C = true;
                q02.B(true);
                q02.G(false);
                D0 d02 = new D0(th);
                q02.f6931B = d02;
                q02.f6937H.i(d02);
                q02.f6949T.t(null);
                q02.f6947R.l(4, "PANIC! Entering TRANSIENT_FAILURE");
                q02.f6977u.b(EnumC0446m.f6552c);
                return;
            case 1:
                ((android.support.v4.media.session.t) ((ThreadFactoryC1443c) this.f6764b).f15283b).j0(th);
                return;
            default:
                P2 p22 = (P2) this.f6764b;
                synchronized (((WeakHashMap) p22.f17509c)) {
                    keySet = ((WeakHashMap) p22.f17509c).keySet();
                }
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    try {
                        ((Thread.UncaughtExceptionHandler) it.next()).uncaughtException(thread, th);
                    } catch (Throwable unused) {
                    }
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) ((P2) this.f6764b).f17508b;
                if (uncaughtExceptionHandler != null) {
                    try {
                        uncaughtExceptionHandler.uncaughtException(thread, th);
                        return;
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                return;
        }
    }
}
