package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ch0 extends AtomicReference implements y30, ib1, InterfaceC0187eu {

    /* JADX INFO: renamed from: j */
    public final C0468mf f1250j;

    /* JADX INFO: renamed from: k */
    public final o31 f1251k;

    /* JADX INFO: renamed from: l */
    public final o31 f1252l;

    /* JADX INFO: renamed from: m */
    public final l30 f1253m;

    public ch0(C0468mf c0468mf) {
        o31 o31Var = t22.f7261f;
        o31 o31Var2 = t22.f7259d;
        this.f1250j = c0468mf;
        this.f1251k = o31Var;
        this.f1252l = o31Var2;
        this.f1253m = l30.f4655j;
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        jb1.m2843a(this);
    }

    @Override // p000.ib1
    public final void cancel() {
        jb1.m2843a(this);
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: e */
    public final void mo933e(ib1 ib1Var) {
        if (jb1.m2844b(this, ib1Var)) {
            try {
                this.f1253m.accept(this);
            } catch (Throwable th) {
                wo1.m5394u(th);
                ib1Var.cancel();
                onError(th);
            }
        }
    }

    @Override // p000.y30
    public final void onComplete() {
        Object obj = get();
        jb1 jb1Var = jb1.f3893j;
        if (obj != jb1Var) {
            lazySet(jb1Var);
            try {
                this.f1252l.getClass();
            } catch (Throwable th) {
                wo1.m5394u(th);
                vt1.m5196h(th);
            }
        }
    }

    @Override // p000.y30
    public final void onError(Throwable th) {
        Object obj = get();
        jb1 jb1Var = jb1.f3893j;
        if (obj == jb1Var) {
            vt1.m5196h(th);
            return;
        }
        lazySet(jb1Var);
        try {
            this.f1251k.accept(th);
        } catch (Throwable th2) {
            wo1.m5394u(th2);
            vt1.m5196h(new C0658rk(th, th2));
        }
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        if (get() == jb1.f3893j) {
            return;
        }
        try {
            this.f1250j.accept(obj);
        } catch (Throwable th) {
            wo1.m5394u(th);
            ((ib1) get()).cancel();
            onError(th);
        }
    }

    @Override // p000.ib1
    public final void request(long j) {
        ((ib1) get()).request(j);
    }
}
