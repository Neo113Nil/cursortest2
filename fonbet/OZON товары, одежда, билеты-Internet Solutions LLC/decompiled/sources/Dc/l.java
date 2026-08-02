package Dc;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import nc.InterfaceC8487b;

/* loaded from: classes.dex */
public final class l extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, InterfaceC8487b {

    /* renamed from: b, reason: collision with root package name */
    static final Object f6382b = new Object();

    /* renamed from: c, reason: collision with root package name */
    static final Object f6383c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final Object f6384d = new Object();

    /* renamed from: e, reason: collision with root package name */
    static final Object f6385e = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Runnable f6386a;

    public l(Runnable runnable, rc.c cVar) {
        super(3);
        this.f6386a = runnable;
        lazySet(0, cVar);
    }

    public final void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f6385e) {
                return;
            }
            if (obj == f6383c) {
                future.cancel(false);
                return;
            } else if (obj == f6384d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f6385e;
            if (obj6 == obj || obj6 == (obj4 = f6383c) || obj6 == (obj5 = f6384d)) {
                break;
            }
            boolean z11 = get(2) != Thread.currentThread();
            if (z11) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 != null) {
                    ((Future) obj6).cancel(z11);
                }
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f6382b) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((rc.c) obj2).b(this);
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        Object obj = get(0);
        return obj == f6382b || obj == f6385e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean compareAndSet;
        Object obj2;
        Object obj3;
        Object obj4 = f6384d;
        Object obj5 = f6383c;
        Object obj6 = f6382b;
        Object obj7 = f6385e;
        lazySet(2, Thread.currentThread());
        try {
            this.f6386a.run();
        } finally {
            try {
                lazySet(2, null);
                obj2 = get(0);
                if (obj2 != obj6) {
                    ((rc.c) obj2).b(this);
                }
                do {
                    obj3 = get(1);
                    if (obj3 != obj5) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj3, obj7));
            } catch (Throwable th2) {
                do {
                    if (obj == obj5 || obj == obj4) {
                        break;
                    }
                } while (!compareAndSet);
            }
        }
        lazySet(2, null);
        obj2 = get(0);
        if (obj2 != obj6 && compareAndSet(0, obj2, obj7) && obj2 != null) {
            ((rc.c) obj2).b(this);
        }
        do {
            obj3 = get(1);
            if (obj3 != obj5 || obj3 == obj4) {
                return;
            }
        } while (!compareAndSet(1, obj3, obj7));
    }
}
