package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class f30 extends AtomicInteger implements y30, ib1 {

    /* JADX INFO: renamed from: j */
    public final y30 f2282j;

    /* JADX INFO: renamed from: k */
    public final int f2283k;

    /* JADX INFO: renamed from: p */
    public final r60 f2288p;

    /* JADX INFO: renamed from: r */
    public ib1 f2290r;

    /* JADX INFO: renamed from: s */
    public volatile boolean f2291s;

    /* JADX INFO: renamed from: l */
    public final AtomicLong f2284l = new AtomicLong();

    /* JADX INFO: renamed from: m */
    public final C0584pk f2285m = new C0584pk(0);

    /* JADX INFO: renamed from: o */
    public final C0757u8 f2287o = new C0757u8();

    /* JADX INFO: renamed from: n */
    public final AtomicInteger f2286n = new AtomicInteger(1);

    /* JADX INFO: renamed from: q */
    public final AtomicReference f2289q = new AtomicReference();

    public f30(y30 y30Var, r60 r60Var, int i) {
        this.f2282j = y30Var;
        this.f2288p = r60Var;
        this.f2283k = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m1584a() {
        t91 t91Var = (t91) this.f2289q.get();
        if (t91Var != null) {
            t91Var.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1585b() {
        if (getAndIncrement() == 0) {
            m1586c();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1586c() {
        y30 y30Var = this.f2282j;
        AtomicInteger atomicInteger = this.f2286n;
        AtomicReference atomicReference = this.f2289q;
        int iAddAndGet = 1;
        do {
            long j = this.f2284l.get();
            long j2 = 0;
            while (true) {
                if (j2 == j) {
                    break;
                }
                if (this.f2291s) {
                    m1584a();
                    return;
                }
                if (((Throwable) this.f2287o.get()) != null) {
                    C0757u8 c0757u8 = this.f2287o;
                    c0757u8.getClass();
                    Throwable thM4416b = AbstractC0671rx.m4416b(c0757u8);
                    m1584a();
                    y30Var.onError(thM4416b);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                t91 t91Var = (t91) atomicReference.get();
                Object objPoll = t91Var != null ? t91Var.poll() : null;
                boolean z2 = objPoll == null;
                if (z && z2) {
                    C0757u8 c0757u9 = this.f2287o;
                    c0757u9.getClass();
                    Throwable thM4416b2 = AbstractC0671rx.m4416b(c0757u9);
                    if (thM4416b2 != null) {
                        y30Var.onError(thM4416b2);
                        return;
                    } else {
                        y30Var.onComplete();
                        return;
                    }
                }
                if (z2) {
                    break;
                }
                y30Var.onNext(objPoll);
                j2++;
            }
            if (j2 == j) {
                if (this.f2291s) {
                    m1584a();
                    return;
                }
                if (((Throwable) this.f2287o.get()) != null) {
                    C0757u8 c0757u10 = this.f2287o;
                    c0757u10.getClass();
                    Throwable thM4416b3 = AbstractC0671rx.m4416b(c0757u10);
                    m1584a();
                    y30Var.onError(thM4416b3);
                    return;
                }
                boolean z3 = atomicInteger.get() == 0;
                t91 t91Var2 = (t91) atomicReference.get();
                boolean z4 = t91Var2 == null || t91Var2.isEmpty();
                if (z3 && z4) {
                    C0757u8 c0757u11 = this.f2287o;
                    c0757u11.getClass();
                    Throwable thM4416b4 = AbstractC0671rx.m4416b(c0757u11);
                    if (thM4416b4 != null) {
                        y30Var.onError(thM4416b4);
                        return;
                    } else {
                        y30Var.onComplete();
                        return;
                    }
                }
            }
            if (j2 != 0) {
                AbstractC0875xf.m5652l(this.f2284l, j2);
                if (this.f2283k != Integer.MAX_VALUE) {
                    this.f2290r.request(j2);
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // p000.ib1
    public final void cancel() {
        this.f2291s = true;
        this.f2290r.cancel();
        this.f2285m.mo480c();
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: e */
    public final void mo933e(ib1 ib1Var) {
        if (jb1.m2846d(this.f2290r, ib1Var)) {
            this.f2290r = ib1Var;
            this.f2282j.mo933e(this);
            int i = this.f2283k;
            if (i == Integer.MAX_VALUE) {
                ib1Var.request(Long.MAX_VALUE);
            } else {
                ib1Var.request(i);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final t91 m1587f() {
        while (true) {
            AtomicReference atomicReference = this.f2289q;
            t91 t91Var = (t91) atomicReference.get();
            if (t91Var != null) {
                return t91Var;
            }
            t91 t91Var2 = new t91(g20.f2582j);
            while (!atomicReference.compareAndSet(null, t91Var2)) {
                if (atomicReference.get() != null) {
                }
            }
            return t91Var2;
        }
    }

    @Override // p000.y30
    public final void onComplete() {
        this.f2286n.decrementAndGet();
        m1585b();
    }

    @Override // p000.y30
    public final void onError(Throwable th) {
        this.f2286n.decrementAndGet();
        C0757u8 c0757u8 = this.f2287o;
        c0757u8.getClass();
        if (!AbstractC0671rx.m4415a(c0757u8, th)) {
            vt1.m5196h(th);
        } else {
            this.f2285m.mo480c();
            m1585b();
        }
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        try {
            Object objApply = this.f2288p.apply(obj);
            zg1.m5905p(objApply, "The mapper returned a null MaybeSource");
            hm0 hm0Var = (hm0) objApply;
            this.f2286n.getAndIncrement();
            jm0 jm0Var = new jm0(this, 1);
            if (this.f2291s || !this.f2285m.m3948a(jm0Var)) {
                return;
            }
            hm0Var.m2293b(jm0Var);
        } catch (Throwable th) {
            wo1.m5394u(th);
            this.f2290r.cancel();
            onError(th);
        }
    }

    @Override // p000.ib1
    public final void request(long j) {
        if (jb1.m2845c(j)) {
            AbstractC0875xf.m5647b(this.f2284l, j);
            m1585b();
        }
    }
}
