package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q30 extends AbstractC0797vb implements y30 {

    /* JADX INFO: renamed from: j */
    public final y30 f6344j;

    /* JADX INFO: renamed from: k */
    public final x71 f6345k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC0003a2 f6346l;

    /* JADX INFO: renamed from: m */
    public ib1 f6347m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f6348n;

    /* JADX INFO: renamed from: o */
    public volatile boolean f6349o;

    /* JADX INFO: renamed from: p */
    public Throwable f6350p;

    /* JADX INFO: renamed from: q */
    public final AtomicLong f6351q = new AtomicLong();

    /* JADX INFO: renamed from: r */
    public boolean f6352r;

    public q30(y30 y30Var, int i, boolean z, o31 o31Var) {
        this.f6344j = y30Var;
        this.f6346l = o31Var;
        this.f6345k = z ? new t91(i) : new s91(i);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4029c(boolean z, boolean z2, y30 y30Var) {
        if (this.f6348n) {
            this.f6345k.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.f6350p;
        if (th != null) {
            this.f6345k.clear();
            y30Var.onError(th);
            return true;
        }
        if (!z2) {
            return false;
        }
        y30Var.onComplete();
        return true;
    }

    @Override // p000.ib1
    public final void cancel() {
        if (this.f6348n) {
            return;
        }
        this.f6348n = true;
        this.f6347m.cancel();
        if (this.f6352r || getAndIncrement() != 0) {
            return;
        }
        this.f6345k.clear();
    }

    @Override // p000.y71
    public final void clear() {
        this.f6345k.clear();
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: e */
    public final void mo933e(ib1 ib1Var) {
        if (jb1.m2846d(this.f6347m, ib1Var)) {
            this.f6347m = ib1Var;
            this.f6344j.mo933e(this);
            ib1Var.request(Long.MAX_VALUE);
        }
    }

    @Override // p000.ez0
    /* JADX INFO: renamed from: f */
    public final int mo592f(int i) {
        this.f6352r = true;
        return 2;
    }

    /* JADX INFO: renamed from: g */
    public final void m4030g() {
        if (getAndIncrement() == 0) {
            x71 x71Var = this.f6345k;
            y30 y30Var = this.f6344j;
            int iAddAndGet = 1;
            while (!m4029c(this.f6349o, x71Var.isEmpty(), y30Var)) {
                long j = this.f6351q.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.f6349o;
                    Object objPoll = x71Var.poll();
                    boolean z2 = objPoll == null;
                    if (m4029c(z, z2, y30Var)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    y30Var.onNext(objPoll);
                    j2++;
                }
                if (j2 == j && m4029c(this.f6349o, x71Var.isEmpty(), y30Var)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.f6351q.addAndGet(-j2);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // p000.y71
    public final boolean isEmpty() {
        return this.f6345k.isEmpty();
    }

    @Override // p000.y30
    public final void onComplete() {
        this.f6349o = true;
        if (this.f6352r) {
            this.f6344j.onComplete();
        } else {
            m4030g();
        }
    }

    @Override // p000.y30
    public final void onError(Throwable th) {
        this.f6350p = th;
        this.f6349o = true;
        if (this.f6352r) {
            this.f6344j.onError(th);
        } else {
            m4030g();
        }
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        if (this.f6345k.offer(obj)) {
            if (this.f6352r) {
                this.f6344j.onNext(null);
                return;
            } else {
                m4030g();
                return;
            }
        }
        this.f6347m.cancel();
        bq0 bq0Var = new bq0("Buffer is full");
        try {
            this.f6346l.run();
        } catch (Throwable th) {
            wo1.m5394u(th);
            bq0Var.initCause(th);
        }
        onError(bq0Var);
    }

    @Override // p000.y71
    public final Object poll() {
        return this.f6345k.poll();
    }

    @Override // p000.ib1
    public final void request(long j) {
        if (this.f6352r || !jb1.m2845c(j)) {
            return;
        }
        AbstractC0875xf.m5647b(this.f6351q, j);
        m4030g();
    }
}
