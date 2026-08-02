package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class w30 extends g20 {

    /* JADX INFO: renamed from: k */
    public final g20 f8352k;

    /* JADX INFO: renamed from: l */
    public final AtomicReference f8353l;

    /* JADX INFO: renamed from: m */
    public final int f8354m;

    /* JADX INFO: renamed from: n */
    public final t30 f8355n;

    public w30(t30 t30Var, g20 g20Var, AtomicReference atomicReference, int i) {
        this.f8355n = t30Var;
        this.f8352k = g20Var;
        this.f8353l = atomicReference;
        this.f8354m = i;
    }

    @Override // p000.g20
    /* JADX INFO: renamed from: e */
    public final void mo844e(y30 y30Var) {
        this.f8355n.mo1970a(y30Var);
    }

    /* JADX INFO: renamed from: f */
    public final void m5230f() {
        v30 v30Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.f8353l;
            v30Var = (v30) atomicReference.get();
            if (v30Var != null && !v30Var.m5048f()) {
                break;
            }
            v30 v30Var2 = new v30(atomicReference, this.f8354m);
            do {
                if (atomicReference.compareAndSet(v30Var, v30Var2)) {
                    v30Var = v30Var2;
                    break loop0;
                }
            } while (atomicReference.get() == v30Var);
        }
        AtomicBoolean atomicBoolean = v30Var.f8045m;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        this.f8352k.m1973d(v30Var);
    }
}
