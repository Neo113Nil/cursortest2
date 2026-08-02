package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h20 extends AtomicInteger implements y30, ib1 {

    /* JADX INFO: renamed from: k */
    public final r60 f3009k;

    /* JADX INFO: renamed from: l */
    public final int f3010l;

    /* JADX INFO: renamed from: m */
    public final int f3011m;

    /* JADX INFO: renamed from: n */
    public ib1 f3012n;

    /* JADX INFO: renamed from: o */
    public int f3013o;

    /* JADX INFO: renamed from: p */
    public y71 f3014p;

    /* JADX INFO: renamed from: q */
    public volatile boolean f3015q;

    /* JADX INFO: renamed from: r */
    public volatile boolean f3016r;

    /* JADX INFO: renamed from: t */
    public volatile boolean f3018t;

    /* JADX INFO: renamed from: u */
    public int f3019u;

    /* JADX INFO: renamed from: j */
    public final k20 f3008j = new k20(this);

    /* JADX INFO: renamed from: s */
    public final C0757u8 f3017s = new C0757u8();

    public h20(r60 r60Var, int i) {
        this.f3009k = r60Var;
        this.f3010l = i;
        this.f3011m = i;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2200a();

    /* JADX INFO: renamed from: b */
    public abstract void mo2201b(Throwable th);

    /* JADX INFO: renamed from: c */
    public abstract void mo2202c(Object obj);

    @Override // p000.y30
    /* JADX INFO: renamed from: e */
    public final void mo933e(ib1 ib1Var) {
        if (jb1.m2846d(this.f3012n, ib1Var)) {
            this.f3012n = ib1Var;
            if (ib1Var instanceof fz0) {
                fz0 fz0Var = (fz0) ib1Var;
                int iMo592f = fz0Var.mo592f(7);
                if (iMo592f == 1) {
                    this.f3019u = iMo592f;
                    this.f3014p = fz0Var;
                    this.f3015q = true;
                    mo2203f();
                    mo2200a();
                    return;
                }
                if (iMo592f == 2) {
                    this.f3019u = iMo592f;
                    this.f3014p = fz0Var;
                    mo2203f();
                    ib1Var.request(this.f3010l);
                    return;
                }
            }
            this.f3014p = new s91(this.f3010l);
            mo2203f();
            ib1Var.request(this.f3010l);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo2203f();

    @Override // p000.y30
    public final void onComplete() {
        this.f3015q = true;
        mo2200a();
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        if (this.f3019u == 2 || this.f3014p.offer(obj)) {
            mo2200a();
        } else {
            this.f3012n.cancel();
            onError(new IllegalStateException("Queue full?!"));
        }
    }
}
