package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n30 extends AbstractC0797vb implements y30, Runnable {

    /* JADX INFO: renamed from: j */
    public final f51 f5266j;

    /* JADX INFO: renamed from: k */
    public final int f5267k;

    /* JADX INFO: renamed from: l */
    public final int f5268l;

    /* JADX INFO: renamed from: m */
    public final AtomicLong f5269m = new AtomicLong();

    /* JADX INFO: renamed from: n */
    public ib1 f5270n;

    /* JADX INFO: renamed from: o */
    public y71 f5271o;

    /* JADX INFO: renamed from: p */
    public volatile boolean f5272p;

    /* JADX INFO: renamed from: q */
    public volatile boolean f5273q;

    /* JADX INFO: renamed from: r */
    public Throwable f5274r;

    /* JADX INFO: renamed from: s */
    public int f5275s;

    /* JADX INFO: renamed from: t */
    public long f5276t;

    /* JADX INFO: renamed from: u */
    public boolean f5277u;

    public n30(f51 f51Var, int i) {
        this.f5266j = f51Var;
        this.f5267k = i;
        this.f5268l = i - (i >> 2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3473c(boolean z, boolean z2, y30 y30Var) {
        if (this.f5272p) {
            clear();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.f5274r;
        if (th != null) {
            this.f5272p = true;
            clear();
            y30Var.onError(th);
            this.f5266j.mo480c();
            return true;
        }
        if (!z2) {
            return false;
        }
        this.f5272p = true;
        y30Var.onComplete();
        this.f5266j.mo480c();
        return true;
    }

    @Override // p000.ib1
    public final void cancel() {
        if (this.f5272p) {
            return;
        }
        this.f5272p = true;
        this.f5270n.cancel();
        this.f5266j.mo480c();
        if (this.f5277u || getAndIncrement() != 0) {
            return;
        }
        this.f5271o.clear();
    }

    @Override // p000.y71
    public final void clear() {
        this.f5271o.clear();
    }

    @Override // p000.ez0
    /* JADX INFO: renamed from: f */
    public final int mo592f(int i) {
        this.f5277u = true;
        return 2;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo3474g();

    /* JADX INFO: renamed from: h */
    public abstract void mo3475h();

    /* JADX INFO: renamed from: i */
    public abstract void mo3476i();

    @Override // p000.y71
    public final boolean isEmpty() {
        return this.f5271o.isEmpty();
    }

    /* JADX INFO: renamed from: j */
    public final void m3477j() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.f5266j.mo1499b(this);
    }

    @Override // p000.y30
    public final void onComplete() {
        if (this.f5273q) {
            return;
        }
        this.f5273q = true;
        m3477j();
    }

    @Override // p000.y30
    public final void onError(Throwable th) {
        if (this.f5273q) {
            vt1.m5196h(th);
            return;
        }
        this.f5274r = th;
        this.f5273q = true;
        m3477j();
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        if (this.f5273q) {
            return;
        }
        if (this.f5275s == 2) {
            m3477j();
            return;
        }
        if (!this.f5271o.offer(obj)) {
            this.f5270n.cancel();
            this.f5274r = new bq0("Queue is full?!");
            this.f5273q = true;
        }
        m3477j();
    }

    @Override // p000.ib1
    public final void request(long j) {
        if (jb1.m2845c(j)) {
            AbstractC0875xf.m5647b(this.f5269m, j);
            m3477j();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5277u) {
            mo3475h();
        } else if (this.f5275s == 1) {
            mo3476i();
        } else {
            mo3474g();
        }
    }
}
