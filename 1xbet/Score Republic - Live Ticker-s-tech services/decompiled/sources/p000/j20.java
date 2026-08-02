package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class j20 extends h20 {

    /* JADX INFO: renamed from: v */
    public final y30 f3791v;

    /* JADX INFO: renamed from: w */
    public final AtomicInteger f3792w;

    public j20(y30 y30Var, cd0 cd0Var, int i) {
        super(cd0Var, i);
        this.f3791v = y30Var;
        this.f3792w = new AtomicInteger();
    }

    @Override // p000.h20
    /* JADX INFO: renamed from: a */
    public final void mo2200a() {
        if (this.f3792w.getAndIncrement() == 0) {
            while (!this.f3016r) {
                if (!this.f3018t) {
                    boolean z = this.f3015q;
                    try {
                        Object objPoll = this.f3014p.poll();
                        boolean z2 = objPoll == null;
                        if (z && z2) {
                            this.f3791v.onComplete();
                            return;
                        }
                        if (!z2) {
                            try {
                                Object objApply = this.f3009k.apply(objPoll);
                                zg1.m5905p(objApply, "The mapper returned a null Publisher");
                                vy0 vy0Var = (vy0) objApply;
                                if (this.f3019u != 1) {
                                    int i = this.f3013o + 1;
                                    if (i == this.f3011m) {
                                        this.f3013o = 0;
                                        this.f3012n.request(i);
                                    } else {
                                        this.f3013o = i;
                                    }
                                }
                                if (vy0Var instanceof Callable) {
                                    try {
                                        Object objCall = ((Callable) vy0Var).call();
                                        if (objCall == null) {
                                            continue;
                                        } else if (!this.f3008j.f4263p) {
                                            this.f3018t = true;
                                            this.f3008j.m2986f(new l20(this.f3008j, objCall));
                                        } else if (get() == 0 && compareAndSet(0, 1)) {
                                            this.f3791v.onNext(objCall);
                                            if (!compareAndSet(1, 0)) {
                                                y30 y30Var = this.f3791v;
                                                C0757u8 c0757u8 = this.f3017s;
                                                c0757u8.getClass();
                                                y30Var.onError(AbstractC0671rx.m4416b(c0757u8));
                                                return;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        wo1.m5394u(th);
                                        this.f3012n.cancel();
                                        C0757u8 c0757u9 = this.f3017s;
                                        c0757u9.getClass();
                                        AbstractC0671rx.m4415a(c0757u9, th);
                                        y30 y30Var2 = this.f3791v;
                                        C0757u8 c0757u10 = this.f3017s;
                                        c0757u10.getClass();
                                        y30Var2.onError(AbstractC0671rx.m4416b(c0757u10));
                                        return;
                                    }
                                } else {
                                    this.f3018t = true;
                                    vy0Var.mo1970a(this.f3008j);
                                }
                            } catch (Throwable th2) {
                                wo1.m5394u(th2);
                                this.f3012n.cancel();
                                C0757u8 c0757u11 = this.f3017s;
                                c0757u11.getClass();
                                AbstractC0671rx.m4415a(c0757u11, th2);
                                y30 y30Var3 = this.f3791v;
                                C0757u8 c0757u12 = this.f3017s;
                                c0757u12.getClass();
                                y30Var3.onError(AbstractC0671rx.m4416b(c0757u12));
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        wo1.m5394u(th3);
                        this.f3012n.cancel();
                        C0757u8 c0757u13 = this.f3017s;
                        c0757u13.getClass();
                        AbstractC0671rx.m4415a(c0757u13, th3);
                        y30 y30Var4 = this.f3791v;
                        C0757u8 c0757u14 = this.f3017s;
                        c0757u14.getClass();
                        y30Var4.onError(AbstractC0671rx.m4416b(c0757u14));
                        return;
                    }
                }
                if (this.f3792w.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // p000.h20
    /* JADX INFO: renamed from: b */
    public final void mo2201b(Throwable th) {
        C0757u8 c0757u8 = this.f3017s;
        c0757u8.getClass();
        if (!AbstractC0671rx.m4415a(c0757u8, th)) {
            vt1.m5196h(th);
            return;
        }
        this.f3012n.cancel();
        if (getAndIncrement() == 0) {
            this.f3791v.onError(AbstractC0671rx.m4416b(c0757u8));
        }
    }

    @Override // p000.h20
    /* JADX INFO: renamed from: c */
    public final void mo2202c(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            y30 y30Var = this.f3791v;
            y30Var.onNext(obj);
            if (compareAndSet(1, 0)) {
                return;
            }
            C0757u8 c0757u8 = this.f3017s;
            c0757u8.getClass();
            y30Var.onError(AbstractC0671rx.m4416b(c0757u8));
        }
    }

    @Override // p000.ib1
    public final void cancel() {
        if (this.f3016r) {
            return;
        }
        this.f3016r = true;
        this.f3008j.cancel();
        this.f3012n.cancel();
    }

    @Override // p000.h20
    /* JADX INFO: renamed from: f */
    public final void mo2203f() {
        this.f3791v.mo933e(this);
    }

    @Override // p000.y30
    public final void onError(Throwable th) {
        C0757u8 c0757u8 = this.f3017s;
        c0757u8.getClass();
        if (!AbstractC0671rx.m4415a(c0757u8, th)) {
            vt1.m5196h(th);
            return;
        }
        this.f3008j.cancel();
        if (getAndIncrement() == 0) {
            c0757u8.getClass();
            this.f3791v.onError(AbstractC0671rx.m4416b(c0757u8));
        }
    }

    @Override // p000.ib1
    public final void request(long j) {
        this.f3008j.request(j);
    }
}
