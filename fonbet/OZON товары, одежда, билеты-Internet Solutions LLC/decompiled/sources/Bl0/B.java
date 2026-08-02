package Bl0;

import Kc.C3493a;
import androidx.work.impl.WorkDatabase;
import g5.C6632e;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class B {
    public static final int a(WorkDatabase workDatabase, String str) {
        Long b11 = workDatabase.b().b(str);
        int longValue = b11 != null ? (int) b11.longValue() : 0;
        workDatabase.b().a(new C6632e(str, Long.valueOf(longValue != Integer.MAX_VALUE ? longValue + 1 : 0)));
        return longValue;
    }

    public static void b(io.reactivex.w wVar, AtomicInteger atomicInteger, Gc.c cVar) {
        if (atomicInteger.getAndIncrement() == 0) {
            cVar.getClass();
            Throwable b11 = Gc.i.b(cVar);
            if (b11 != null) {
                wVar.onError(b11);
            } else {
                wVar.onComplete();
            }
        }
    }

    public static void c(io.reactivex.w wVar, Throwable th2, AtomicInteger atomicInteger, Gc.c cVar) {
        cVar.getClass();
        if (!Gc.i.a(cVar, th2)) {
            C3493a.f(th2);
        } else if (atomicInteger.getAndIncrement() == 0) {
            wVar.onError(Gc.i.b(cVar));
        }
    }

    public static void d(io.reactivex.w wVar, Object obj, AtomicInteger atomicInteger, Gc.c cVar) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            wVar.onNext(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                cVar.getClass();
                Throwable b11 = Gc.i.b(cVar);
                if (b11 != null) {
                    wVar.onError(b11);
                } else {
                    wVar.onComplete();
                }
            }
        }
    }
}
