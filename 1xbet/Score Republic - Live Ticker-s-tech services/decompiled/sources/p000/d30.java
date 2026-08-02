package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class d30 extends AtomicReference implements y30, InterfaceC0187eu {

    /* JADX INFO: renamed from: j */
    public final long f1532j;

    /* JADX INFO: renamed from: k */
    public final e30 f1533k;

    /* JADX INFO: renamed from: l */
    public final int f1534l;

    /* JADX INFO: renamed from: m */
    public final int f1535m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f1536n;

    /* JADX INFO: renamed from: o */
    public volatile y71 f1537o;

    /* JADX INFO: renamed from: p */
    public long f1538p;

    /* JADX INFO: renamed from: q */
    public int f1539q;

    public d30(e30 e30Var, long j) {
        this.f1532j = j;
        this.f1533k = e30Var;
        int i = e30Var.f1918m;
        this.f1535m = i;
        this.f1534l = i >> 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1084a(long j) {
        if (this.f1539q != 1) {
            long j2 = this.f1538p + j;
            if (j2 < this.f1534l) {
                this.f1538p = j2;
            } else {
                this.f1538p = 0L;
                ((ib1) get()).request(j2);
            }
        }
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        jb1.m2843a(this);
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: e */
    public final void mo933e(ib1 ib1Var) {
        if (jb1.m2844b(this, ib1Var)) {
            if (ib1Var instanceof fz0) {
                fz0 fz0Var = (fz0) ib1Var;
                int iMo592f = fz0Var.mo592f(7);
                if (iMo592f == 1) {
                    this.f1539q = iMo592f;
                    this.f1537o = fz0Var;
                    this.f1536n = true;
                    this.f1533k.m1351b();
                    return;
                }
                if (iMo592f == 2) {
                    this.f1539q = iMo592f;
                    this.f1537o = fz0Var;
                }
            }
            ib1Var.request(this.f1535m);
        }
    }

    @Override // p000.y30
    public final void onComplete() {
        this.f1536n = true;
        this.f1533k.m1351b();
    }

    @Override // p000.y30
    public final void onError(Throwable th) {
        lazySet(jb1.f3893j);
        e30 e30Var = this.f1533k;
        C0757u8 c0757u8 = e30Var.f1921p;
        c0757u8.getClass();
        if (!AbstractC0671rx.m4415a(c0757u8, th)) {
            vt1.m5196h(th);
            return;
        }
        this.f1536n = true;
        e30Var.f1925t.cancel();
        for (d30 d30Var : (d30[]) e30Var.f1923r.getAndSet(e30.f1913A)) {
            d30Var.getClass();
            jb1.m2843a(d30Var);
        }
        e30Var.m1351b();
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        int i = this.f1539q;
        e30 e30Var = this.f1533k;
        if (i == 2) {
            e30Var.m1351b();
            return;
        }
        if (e30Var.get() == 0 && e30Var.compareAndSet(0, 1)) {
            long j = e30Var.f1924s.get();
            y71 s91Var = this.f1537o;
            if (j == 0 || !(s91Var == null || s91Var.isEmpty())) {
                if (s91Var == null && (s91Var = this.f1537o) == null) {
                    s91Var = new s91(e30Var.f1918m);
                    this.f1537o = s91Var;
                }
                if (!s91Var.offer(obj)) {
                    e30Var.onError(new bq0("Inner queue full?!"));
                    return;
                }
            } else {
                e30Var.f1915j.onNext(obj);
                if (j != Long.MAX_VALUE) {
                    e30Var.f1924s.decrementAndGet();
                }
                m1084a(1L);
            }
            if (e30Var.decrementAndGet() == 0) {
                return;
            }
        } else {
            y71 s91Var2 = this.f1537o;
            if (s91Var2 == null) {
                s91Var2 = new s91(e30Var.f1918m);
                this.f1537o = s91Var2;
            }
            if (!s91Var2.offer(obj)) {
                e30Var.onError(new bq0("Inner queue full?!"));
                return;
            } else if (e30Var.getAndIncrement() != 0) {
                return;
            }
        }
        e30Var.m1352c();
    }
}
