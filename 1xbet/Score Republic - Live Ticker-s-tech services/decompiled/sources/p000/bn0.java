package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bn0 extends AtomicInteger implements InterfaceC0187eu {

    /* JADX INFO: renamed from: j */
    public final xm0 f921j;

    /* JADX INFO: renamed from: k */
    public final wa0 f922k;

    /* JADX INFO: renamed from: l */
    public final cn0[] f923l;

    /* JADX INFO: renamed from: m */
    public final Object[] f924m;

    public bn0(xm0 xm0Var, int i, wa0 wa0Var) {
        super(i);
        this.f921j = xm0Var;
        this.f922k = wa0Var;
        cn0[] cn0VarArr = new cn0[i];
        for (int i2 = 0; i2 < i; i2++) {
            cn0VarArr[i2] = new cn0(this, i2);
        }
        this.f923l = cn0VarArr;
        this.f924m = new Object[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m725a(int i) {
        cn0[] cn0VarArr = this.f923l;
        int length = cn0VarArr.length;
        for (int i2 = 0; i2 < i; i2++) {
            cn0 cn0Var = cn0VarArr[i2];
            cn0Var.getClass();
            EnumC0262gu.m2146a(cn0Var);
        }
        while (true) {
            i++;
            if (i >= length) {
                return;
            }
            cn0 cn0Var2 = cn0VarArr[i];
            cn0Var2.getClass();
            EnumC0262gu.m2146a(cn0Var2);
        }
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        if (getAndSet(0) > 0) {
            for (cn0 cn0Var : this.f923l) {
                cn0Var.getClass();
                EnumC0262gu.m2146a(cn0Var);
            }
        }
    }
}
