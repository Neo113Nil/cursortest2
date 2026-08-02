package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wa1 extends AtomicInteger implements y30, ib1 {

    /* JADX INFO: renamed from: j */
    public final y30 f8480j;

    /* JADX INFO: renamed from: k */
    public final C0757u8 f8481k = new C0757u8();

    /* JADX INFO: renamed from: l */
    public final AtomicLong f8482l = new AtomicLong();

    /* JADX INFO: renamed from: m */
    public final AtomicReference f8483m = new AtomicReference();

    /* JADX INFO: renamed from: n */
    public final AtomicBoolean f8484n = new AtomicBoolean();

    /* JADX INFO: renamed from: o */
    public volatile boolean f8485o;

    public wa1(y30 y30Var) {
        this.f8480j = y30Var;
    }

    @Override // p000.ib1
    public final void cancel() {
        if (this.f8485o) {
            return;
        }
        jb1.m2843a(this.f8483m);
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: e */
    public final void mo933e(ib1 ib1Var) {
        if (!this.f8484n.compareAndSet(false, true)) {
            ib1Var.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
            return;
        }
        this.f8480j.mo933e(this);
        if (jb1.m2844b(this.f8483m, ib1Var)) {
            long andSet = this.f8482l.getAndSet(0L);
            if (andSet != 0) {
                ib1Var.request(andSet);
            }
        }
    }

    @Override // p000.y30
    public final void onComplete() {
        this.f8485o = true;
        y30 y30Var = this.f8480j;
        C0757u8 c0757u8 = this.f8481k;
        if (getAndIncrement() == 0) {
            c0757u8.getClass();
            Throwable thM4416b = AbstractC0671rx.m4416b(c0757u8);
            if (thM4416b != null) {
                y30Var.onError(thM4416b);
            } else {
                y30Var.onComplete();
            }
        }
    }

    @Override // p000.y30
    public final void onError(Throwable th) {
        this.f8485o = true;
        y30 y30Var = this.f8480j;
        C0757u8 c0757u8 = this.f8481k;
        c0757u8.getClass();
        if (!AbstractC0671rx.m4415a(c0757u8, th)) {
            vt1.m5196h(th);
        } else if (getAndIncrement() == 0) {
            y30Var.onError(AbstractC0671rx.m4416b(c0757u8));
        }
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            y30 y30Var = this.f8480j;
            y30Var.onNext(obj);
            if (decrementAndGet() != 0) {
                C0757u8 c0757u8 = this.f8481k;
                c0757u8.getClass();
                Throwable thM4416b = AbstractC0671rx.m4416b(c0757u8);
                if (thM4416b != null) {
                    y30Var.onError(thM4416b);
                } else {
                    y30Var.onComplete();
                }
            }
        }
    }

    @Override // p000.ib1
    public final void request(long j) {
        if (j <= 0) {
            cancel();
            onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
            return;
        }
        AtomicReference atomicReference = this.f8483m;
        ib1 ib1Var = (ib1) atomicReference.get();
        if (ib1Var != null) {
            ib1Var.request(j);
            return;
        }
        if (jb1.m2845c(j)) {
            AtomicLong atomicLong = this.f8482l;
            AbstractC0875xf.m5647b(atomicLong, j);
            ib1 ib1Var2 = (ib1) atomicReference.get();
            if (ib1Var2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    ib1Var2.request(andSet);
                }
            }
        }
    }
}
