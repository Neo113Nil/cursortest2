package X4;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final B0.e f3584a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f3585b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f3586c;

    public o(r rVar, B0.e eVar) {
        this.f3586c = rVar;
        this.f3584a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T4.l lVar;
        String str = "OkHttp " + ((T4.q) this.f3586c.f3590b.f1783c).f();
        r rVar = this.f3586c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            rVar.f3592d.h();
            boolean z = false;
            try {
                try {
                    try {
                        this.f3584a.n(rVar.f());
                        lVar = rVar.f3589a.f2960a;
                    } catch (IOException e3) {
                        e = e3;
                        z = true;
                        if (z) {
                            d5.e eVar = d5.e.f5492a;
                            d5.e.f5492a.j("Callback failure for " + r.a(rVar), 4, e);
                        } else {
                            ((x3.b) this.f3584a.f146b).accept(e);
                        }
                        lVar = rVar.f3589a.f2960a;
                        lVar.c(this);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        rVar.c();
                        if (!z) {
                            IOException iOException = new IOException("canceled due to " + th);
                            iOException.initCause(th);
                            ((x3.b) this.f3584a.f146b).accept(iOException);
                        }
                        if (!(th instanceof InterruptedException)) {
                            throw th;
                        }
                        Thread.currentThread().interrupt();
                        lVar = rVar.f3589a.f2960a;
                        lVar.c(this);
                    }
                } catch (Throwable th2) {
                    rVar.f3589a.f2960a.c(this);
                    throw th2;
                }
            } catch (IOException e6) {
                e = e6;
            } catch (Throwable th3) {
                th = th3;
            }
            lVar.c(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
