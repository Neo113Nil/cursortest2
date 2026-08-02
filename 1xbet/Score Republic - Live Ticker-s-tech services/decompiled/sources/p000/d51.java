package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class d51 extends AtomicReferenceArray implements Runnable, Callable, InterfaceC0187eu {

    /* JADX INFO: renamed from: k */
    public static final Object f1557k = new Object();

    /* JADX INFO: renamed from: l */
    public static final Object f1558l = new Object();

    /* JADX INFO: renamed from: m */
    public static final Object f1559m = new Object();

    /* JADX INFO: renamed from: n */
    public static final Object f1560n = new Object();

    /* JADX INFO: renamed from: j */
    public final Runnable f1561j;

    public d51(Runnable runnable, C0584pk c0584pk) {
        super(3);
        this.f1561j = runnable;
        lazySet(0, c0584pk);
    }

    /* JADX INFO: renamed from: a */
    public final void m1094a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f1560n) {
                return;
            }
            if (obj == f1558l) {
                future.cancel(false);
                return;
            } else if (obj == f1559m) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f1560n;
            if (obj6 == obj || obj6 == (obj4 = f1558l) || obj6 == (obj5 = f1559m)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 == null) {
                    break;
                }
                ((Future) obj6).cancel(z);
                break;
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f1557k) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((C0584pk) obj2).m3949b(this);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2 = f1559m;
        Object obj3 = f1558l;
        Object obj4 = f1557k;
        Object obj5 = f1560n;
        lazySet(2, Thread.currentThread());
        try {
            this.f1561j.run();
        } catch (Throwable th) {
            try {
                vt1.m5196h(th);
            } finally {
                lazySet(2, null);
                Object obj6 = get(0);
                if (obj6 != obj4 && compareAndSet(0, obj6, obj5) && obj6 != null) {
                    ((C0584pk) obj6).m3949b(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj3 || obj == obj2) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj5));
            }
        }
        lazySet(2, null);
        Object obj7 = get(0);
        if (obj7 != obj4 && compareAndSet(0, obj7, obj5) && obj7 != null) {
            ((C0584pk) obj7).m3949b(this);
        }
        while (r2 != obj3 && r2 != obj2 && !compareAndSet(1, get(i), obj5)) {
        }
    }
}
