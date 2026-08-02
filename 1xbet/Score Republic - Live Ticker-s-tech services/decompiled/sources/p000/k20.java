package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class k20 extends AtomicInteger implements y30, ib1 {

    /* JADX INFO: renamed from: j */
    public ib1 f4257j;

    /* JADX INFO: renamed from: k */
    public long f4258k;

    /* JADX INFO: renamed from: l */
    public final AtomicReference f4259l = new AtomicReference();

    /* JADX INFO: renamed from: m */
    public final AtomicLong f4260m = new AtomicLong();

    /* JADX INFO: renamed from: n */
    public final AtomicLong f4261n = new AtomicLong();

    /* JADX INFO: renamed from: o */
    public volatile boolean f4262o;

    /* JADX INFO: renamed from: p */
    public boolean f4263p;

    /* JADX INFO: renamed from: q */
    public final h20 f4264q;

    /* JADX INFO: renamed from: r */
    public long f4265r;

    public k20(h20 h20Var) {
        this.f4264q = h20Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m2983a() {
        if (getAndIncrement() != 0) {
            return;
        }
        m2984b();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0082 A[PHI: r14
      0x0082: PHI (r14v4 long) = (r14v3 long), (r14v6 long) binds: [B:22:0x0060, B:24:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    public final void m2984b() {
        long j;
        int iAddAndGet = 1;
        long j2 = 0;
        long jM5648c = 0;
        ib1 ib1Var = null;
        while (true) {
            ib1 ib1Var2 = (ib1) this.f4259l.get();
            if (ib1Var2 != null) {
                ib1Var2 = (ib1) this.f4259l.getAndSet(null);
            }
            long andSet = this.f4260m.get();
            if (andSet != j2) {
                andSet = this.f4260m.getAndSet(j2);
            }
            long andSet2 = this.f4261n.get();
            if (andSet2 != j2) {
                andSet2 = this.f4261n.getAndSet(j2);
            }
            ib1 ib1Var3 = this.f4257j;
            if (this.f4262o) {
                if (ib1Var3 != null) {
                    ib1Var3.cancel();
                    this.f4257j = null;
                }
                if (ib1Var2 != null) {
                    ib1Var2.cancel();
                }
                j = j2;
            } else {
                long jM5648c2 = this.f4258k;
                if (jM5648c2 != Long.MAX_VALUE) {
                    jM5648c2 = AbstractC0875xf.m5648c(jM5648c2, andSet);
                    if (jM5648c2 != Long.MAX_VALUE) {
                        jM5648c2 -= andSet2;
                        if (jM5648c2 < j2) {
                            j = j2;
                            vt1.m5196h(new C0877xh("More produced than requested: " + jM5648c2));
                            jM5648c2 = j;
                        } else {
                            j = j2;
                        }
                    } else {
                        j = j2;
                    }
                    this.f4258k = jM5648c2;
                } else {
                    j = j2;
                }
                if (ib1Var2 != null) {
                    this.f4257j = ib1Var2;
                    if (jM5648c2 != j) {
                        jM5648c = AbstractC0875xf.m5648c(jM5648c, jM5648c2);
                        ib1Var = ib1Var2;
                    }
                } else if (ib1Var3 != null && andSet != j) {
                    jM5648c = AbstractC0875xf.m5648c(jM5648c, andSet);
                    ib1Var = ib1Var3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                break;
            } else {
                j2 = j;
            }
        }
        if (jM5648c != j) {
            ib1Var.request(jM5648c);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2985c(long j) {
        if (this.f4263p) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            AbstractC0875xf.m5647b(this.f4261n, j);
            m2983a();
            return;
        }
        long j2 = this.f4258k;
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 - j;
            if (j3 < 0) {
                vt1.m5196h(new C0877xh("More produced than requested: " + j3));
                j3 = 0L;
            }
            this.f4258k = j3;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        m2984b();
    }

    @Override // p000.ib1
    public final void cancel() {
        if (this.f4262o) {
            return;
        }
        this.f4262o = true;
        m2983a();
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: e */
    public final void mo933e(ib1 ib1Var) {
        m2986f(ib1Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m2986f(ib1 ib1Var) {
        if (this.f4262o) {
            ib1Var.cancel();
            return;
        }
        zg1.m5905p(ib1Var, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            m2983a();
            return;
        }
        this.f4257j = ib1Var;
        long j = this.f4258k;
        if (decrementAndGet() != 0) {
            m2984b();
        }
        if (j != 0) {
            ib1Var.request(j);
        }
    }

    @Override // p000.y30
    public final void onComplete() {
        long j = this.f4265r;
        if (j != 0) {
            this.f4265r = 0L;
            m2985c(j);
        }
        h20 h20Var = this.f4264q;
        h20Var.f3018t = false;
        h20Var.mo2200a();
    }

    @Override // p000.y30
    public final void onError(Throwable th) {
        long j = this.f4265r;
        if (j != 0) {
            this.f4265r = 0L;
            m2985c(j);
        }
        this.f4264q.mo2201b(th);
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        this.f4265r++;
        this.f4264q.mo2202c(obj);
    }

    @Override // p000.ib1
    public final void request(long j) {
        if (!jb1.m2845c(j) || this.f4263p) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            AbstractC0875xf.m5647b(this.f4260m, j);
            m2983a();
            return;
        }
        long j2 = this.f4258k;
        if (j2 != Long.MAX_VALUE) {
            long jM5648c = AbstractC0875xf.m5648c(j2, j);
            this.f4258k = jM5648c;
            if (jM5648c == Long.MAX_VALUE) {
                this.f4263p = true;
            }
        }
        ib1 ib1Var = this.f4257j;
        if (decrementAndGet() != 0) {
            m2984b();
        }
        if (ib1Var != null) {
            ib1Var.request(j);
        }
    }
}
