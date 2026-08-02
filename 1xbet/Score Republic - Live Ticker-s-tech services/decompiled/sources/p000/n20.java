package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n20 extends AtomicLong implements ib1 {

    /* JADX INFO: renamed from: j */
    public final y30 f5260j;

    /* JADX INFO: renamed from: k */
    public final C0264gw f5261k = new C0264gw(2);

    public n20(y30 y30Var) {
        this.f5260j = y30Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m3466a() {
        C0264gw c0264gw = this.f5261k;
        if (c0264gw.m2160b()) {
            return;
        }
        try {
            this.f5260j.onComplete();
        } finally {
            EnumC0262gu.m2146a(c0264gw);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3467b(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        C0264gw c0264gw = this.f5261k;
        if (c0264gw.m2160b()) {
            return false;
        }
        try {
            this.f5260j.onError(th);
            return true;
        } finally {
            EnumC0262gu.m2146a(c0264gw);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3468c(Throwable th) {
        if (mo3472g(th)) {
            return;
        }
        vt1.m5196h(th);
    }

    @Override // p000.ib1
    public final void cancel() {
        C0264gw c0264gw = this.f5261k;
        c0264gw.getClass();
        EnumC0262gu.m2146a(c0264gw);
        mo3471f();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo3469d(Object obj);

    /* JADX INFO: renamed from: g */
    public boolean mo3472g(Throwable th) {
        return m3467b(th);
    }

    @Override // p000.ib1
    public final void request(long j) {
        if (jb1.m2845c(j)) {
            AbstractC0875xf.m5647b(this, j);
            mo3470e();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return getClass().getSimpleName() + "{" + super.toString() + "}";
    }

    /* JADX INFO: renamed from: e */
    public void mo3470e() {
    }

    /* JADX INFO: renamed from: f */
    public void mo3471f() {
    }
}
