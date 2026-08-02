package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class rv0 extends kj0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6978a = 0;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f6979b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final Object f6980c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ mj0 f6981d;

    public rv0(wv0 wv0Var, AbstractC0959zp abstractC0959zp) {
        this.f6981d = wv0Var;
        a90.m127k(abstractC0959zp, "subchannel");
        this.f6980c = abstractC0959zp;
    }

    @Override // p000.kj0
    /* JADX INFO: renamed from: a */
    public final ij0 mo1140a(yv0 yv0Var) {
        int i = this.f6978a;
        mj0 mj0Var = this.f6981d;
        AtomicBoolean atomicBoolean = this.f6979b;
        switch (i) {
            case 0:
                if (atomicBoolean.compareAndSet(false, true)) {
                    gc1 gc1VarMo963h = ((tv0) mj0Var).f7608f.mo963h();
                    tv0 tv0Var = (tv0) this.f6980c;
                    Objects.requireNonNull(tv0Var);
                    gc1VarMo963h.execute(new RunnableC0944za(7, tv0Var));
                }
                break;
            default:
                if (atomicBoolean.compareAndSet(false, true)) {
                    ((wv0) mj0Var).f8707f.mo963h().execute(new RunnableC0897y0(20, this));
                }
                break;
        }
        return ij0.f3585e;
    }

    public rv0(tv0 tv0Var, tv0 tv0Var2) {
        this.f6981d = tv0Var;
        this.f6980c = tv0Var2;
    }
}
