package C0;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;
import n1.C1334u;
import n1.HandlerC1335v;

/* loaded from: classes.dex */
public abstract class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f327b;

    public /* synthetic */ c(C1334u c1334u) {
        this.f326a = 1;
        this.f327b = c1334u;
    }

    public static void a(t0.o oVar, String str) {
        t0.q qVar;
        boolean z;
        WorkDatabase workDatabase = oVar.f11884c;
        B0.r t5 = workDatabase.t();
        B0.c f3 = workDatabase.f();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int e3 = t5.e(str2);
            if (e3 != 3 && e3 != 4) {
                t5.k(6, str2);
            }
            linkedList.addAll(f3.e(str2));
        }
        t0.f fVar = oVar.f11887f;
        synchronized (fVar.f11863l) {
            try {
                s0.s.d().a(t0.f.f11851m, "Processor cancelling " + str);
                fVar.f11861j.add(str);
                qVar = (t0.q) fVar.f11857f.remove(str);
                z = qVar != null;
                if (qVar == null) {
                    qVar = (t0.q) fVar.f11858g.remove(str);
                }
                if (qVar != null) {
                    fVar.f11859h.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        t0.f.b(str, qVar);
        if (z) {
            fVar.i();
        }
        Iterator it = oVar.f11886e.iterator();
        while (it.hasNext()) {
            ((t0.h) it.next()).a(str);
        }
    }

    public abstract void b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f326a) {
            case 0:
                B0.t tVar = (B0.t) this.f327b;
                try {
                    b();
                    tVar.k(s0.x.f11798R);
                    return;
                } catch (Throwable th) {
                    tVar.k(new s0.u(th));
                    return;
                }
            default:
                C1334u c1334u = (C1334u) this.f327b;
                ReentrantLock reentrantLock = c1334u.f11417b;
                ReentrantLock reentrantLock2 = c1334u.f11417b;
                reentrantLock.lock();
                try {
                    try {
                        if (!Thread.interrupted()) {
                            c();
                        }
                    } finally {
                        reentrantLock2.unlock();
                    }
                } catch (RuntimeException e3) {
                    HandlerC1335v handlerC1335v = c1334u.f11416a.f11281h;
                    handlerC1335v.sendMessage(handlerC1335v.obtainMessage(2, e3));
                }
                return;
        }
    }

    public c() {
        this.f326a = 0;
        this.f327b = new B0.t();
    }
}
