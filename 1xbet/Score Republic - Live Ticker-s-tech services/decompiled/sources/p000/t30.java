package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class t30 implements vy0 {

    /* JADX INFO: renamed from: j */
    public final AtomicReference f7268j;

    /* JADX INFO: renamed from: k */
    public final int f7269k;

    public t30(AtomicReference atomicReference, int i) {
        this.f7268j = atomicReference;
        this.f7269k = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.vy0
    /* JADX INFO: renamed from: a */
    public final void mo1970a(y30 y30Var) {
        v30 v30Var;
        u30 u30Var = new u30(y30Var);
        y30Var.mo933e(u30Var);
        loop0: while (true) {
            v30 v30Var2 = (v30) this.f7268j.get();
            if (v30Var2 == null || v30Var2.m5048f()) {
                v30 v30Var3 = new v30(this.f7268j, this.f7269k);
                AtomicReference atomicReference = this.f7268j;
                while (true) {
                    if (atomicReference.compareAndSet(v30Var2, v30Var3)) {
                        v30Var = v30Var3;
                    } else if (atomicReference.get() != v30Var2) {
                    }
                }
            } else {
                v30Var = v30Var2;
            }
            AtomicReference atomicReference2 = v30Var.f8044l;
            while (true) {
                u30[] u30VarArr = (u30[]) atomicReference2.get();
                if (u30VarArr == v30.f8041s) {
                    break;
                }
                int length = u30VarArr.length;
                u30[] u30VarArr2 = new u30[length + 1];
                System.arraycopy(u30VarArr, 0, u30VarArr2, 0, length);
                u30VarArr2[length] = u30Var;
                do {
                    if (atomicReference2.compareAndSet(u30VarArr, u30VarArr2)) {
                        break loop0;
                    }
                } while (atomicReference2.get() == u30VarArr);
            }
        }
        if (u30Var.get() == Long.MIN_VALUE) {
            v30Var.m5049g(u30Var);
        } else {
            u30Var.f7659k = v30Var;
        }
        v30Var.m5047b();
    }
}
