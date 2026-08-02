package w1;

import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;

/* renamed from: w1.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1736p2 {

    /* renamed from: f, reason: collision with root package name */
    public static final g0.m f17821f = new g0.m(1);

    /* renamed from: a, reason: collision with root package name */
    public final C1683c1 f17822a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17823b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17824c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedList f17825d;

    /* renamed from: e, reason: collision with root package name */
    public C1704h2 f17826e;

    public AbstractC1736p2(C1683c1 c1683c1, boolean z4) {
        boolean z7 = c1683c1 == null ? false : c1683c1.f17824c;
        this.f17822a = c1683c1;
        this.f17823b = z4;
        this.f17824c = z7;
        this.f17825d = new LinkedList();
    }

    public final synchronized void b() {
        if (this.f17823b) {
            while (this.f17825d.size() > 0) {
                C1704h2 c1704h2 = (C1704h2) this.f17825d.remove();
                if (!c1704h2.isDone()) {
                    this.f17826e = c1704h2;
                    if (!c(c1704h2)) {
                        this.f17826e = null;
                        this.f17825d.addFirst(c1704h2);
                        return;
                    }
                }
            }
        } else if (this.f17826e == null && this.f17825d.size() > 0) {
            C1704h2 c1704h22 = (C1704h2) this.f17825d.remove();
            if (!c1704h22.isDone()) {
                this.f17826e = c1704h22;
                if (!c(c1704h22)) {
                    this.f17826e = null;
                    this.f17825d.addFirst(c1704h22);
                }
            }
        }
    }

    public boolean c(C1704h2 c1704h2) {
        C1683c1 c1683c1 = this.f17822a;
        if (c1683c1 == null) {
            return true;
        }
        c1683c1.d(c1704h2);
        return true;
    }

    public Future d(Runnable runnable) {
        C1704h2 c1732o2 = runnable instanceof C1704h2 ? (C1704h2) runnable : new C1732o2(this, runnable);
        synchronized (this) {
            this.f17825d.add(c1732o2);
            b();
        }
        return c1732o2;
    }

    public void e(com.flurry.android.marketing.messaging.notification.b bVar) {
        C1704h2 c1704h2 = new C1704h2(this, f17821f);
        synchronized (this) {
            this.f17825d.add(c1704h2);
            b();
        }
        if (this.f17824c) {
            for (C1683c1 c1683c1 = this.f17822a; c1683c1 != null; c1683c1 = c1683c1.f17822a) {
            }
        }
        while (!c1704h2.isDone()) {
            try {
                c1704h2.get();
            } catch (CancellationException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
        if (!g(bVar)) {
            f(bVar);
        }
        synchronized (this) {
            try {
                if (this.f17826e == c1704h2) {
                    this.f17826e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        b();
    }

    public final void f(Runnable runnable) {
        for (C1683c1 c1683c1 = this.f17822a; c1683c1 != null; c1683c1 = c1683c1.f17822a) {
        }
        runnable.run();
    }

    public boolean g(Runnable runnable) {
        return false;
    }
}
