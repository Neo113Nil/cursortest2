package p155w1;

import com.flurry.android.marketing.messaging.notification.b;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import p046g0.m;

/* JADX INFO: renamed from: w1.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1027p2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f17827f = new m(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0974c1 f17828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedList f17831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0995h2 f17832e;

    public AbstractC1027p2(C0974c1 c0974c1, boolean z4) {
        boolean z7 = c0974c1 == null ? false : c0974c1.f17830c;
        this.f17828a = c0974c1;
        this.f17829b = z4;
        this.f17830c = z7;
        this.f17831d = new LinkedList();
    }

    public final synchronized void b() {
        if (this.f17829b) {
            while (this.f17831d.size() > 0) {
                C0995h2 c0995h2 = (C0995h2) this.f17831d.remove();
                if (!c0995h2.isDone()) {
                    this.f17832e = c0995h2;
                    if (!c(c0995h2)) {
                        this.f17832e = null;
                        this.f17831d.addFirst(c0995h2);
                        return;
                    }
                }
            }
        } else if (this.f17832e == null && this.f17831d.size() > 0) {
            C0995h2 c0995h3 = (C0995h2) this.f17831d.remove();
            if (!c0995h3.isDone()) {
                this.f17832e = c0995h3;
                if (!c(c0995h3)) {
                    this.f17832e = null;
                    this.f17831d.addFirst(c0995h3);
                }
            }
        }
    }

    public boolean c(C0995h2 c0995h2) {
        C0974c1 c0974c1 = this.f17828a;
        if (c0974c1 == null) {
            return true;
        }
        c0974c1.d(c0995h2);
        return true;
    }

    public Future d(Runnable runnable) {
        C0995h2 c1023o2 = runnable instanceof C0995h2 ? (C0995h2) runnable : new C1023o2(this, runnable);
        synchronized (this) {
            this.f17831d.add(c1023o2);
            b();
        }
        return c1023o2;
    }

    public void e(b bVar) {
        C0995h2 c0995h2 = new C0995h2(this, f17827f);
        synchronized (this) {
            this.f17831d.add(c0995h2);
            b();
        }
        if (this.f17830c) {
            for (C0974c1 c0974c1 = this.f17828a; c0974c1 != null; c0974c1 = c0974c1.f17828a) {
            }
        }
        while (!c0995h2.isDone()) {
            try {
                c0995h2.get();
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
                if (this.f17832e == c0995h2) {
                    this.f17832e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        b();
    }

    public final void f(Runnable runnable) {
        for (C0974c1 c0974c1 = this.f17828a; c0974c1 != null; c0974c1 = c0974c1.f17828a) {
        }
        runnable.run();
    }

    public boolean g(Runnable runnable) {
        return false;
    }
}
