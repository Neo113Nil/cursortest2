package p000;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class c22 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1074j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AtomicReference f1075k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ v22 f1076l;

    public c22(v22 v22Var, AtomicReference atomicReference, int i) {
        this.f1074j = i;
        switch (i) {
            case 1:
                this.f1075k = atomicReference;
                Objects.requireNonNull(v22Var);
                this.f1076l = v22Var;
                break;
            case 2:
                this.f1075k = atomicReference;
                Objects.requireNonNull(v22Var);
                this.f1076l = v22Var;
                break;
            case 3:
                this.f1075k = atomicReference;
                Objects.requireNonNull(v22Var);
                this.f1076l = v22Var;
                break;
            case 4:
                this.f1075k = atomicReference;
                Objects.requireNonNull(v22Var);
                this.f1076l = v22Var;
                break;
            default:
                this.f1075k = atomicReference;
                Objects.requireNonNull(v22Var);
                this.f1076l = v22Var;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m842a() {
        AtomicReference atomicReference = this.f1075k;
        synchronized (atomicReference) {
            try {
                try {
                    f02 f02Var = (f02) this.f1076l.f7192j;
                    atomicReference.set(Double.valueOf(f02Var.f2245m.m769K(f02Var.m1575r().m5219G(), jx1.f4177e0)));
                    this.f1075k.notify();
                } catch (Throwable th) {
                    this.f1075k.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1074j) {
            case 0:
                AtomicReference atomicReference = this.f1075k;
                synchronized (atomicReference) {
                    try {
                        try {
                            f02 f02Var = (f02) this.f1076l.f7192j;
                            atomicReference.set(Boolean.valueOf(f02Var.f2245m.m770L(f02Var.m1575r().m5219G(), jx1.f4165a0)));
                            this.f1075k.notify();
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (Throwable th2) {
                        this.f1075k.notify();
                        throw th2;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f1075k;
                synchronized (atomicReference2) {
                    try {
                        try {
                            f02 f02Var2 = (f02) this.f1076l.f7192j;
                            atomicReference2.set(f02Var2.f2245m.m766H(f02Var2.m1575r().m5219G(), jx1.f4168b0));
                            this.f1075k.notify();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        this.f1075k.notify();
                        throw th4;
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.f1075k;
                synchronized (atomicReference3) {
                    try {
                        try {
                            f02 f02Var3 = (f02) this.f1076l.f7192j;
                            atomicReference3.set(Long.valueOf(f02Var3.f2245m.m767I(f02Var3.m1575r().m5219G(), jx1.f4171c0)));
                            this.f1075k.notify();
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        this.f1075k.notify();
                        throw th6;
                    }
                }
                return;
            case 3:
                AtomicReference atomicReference4 = this.f1075k;
                synchronized (atomicReference4) {
                    try {
                        try {
                            f02 f02Var4 = (f02) this.f1076l.f7192j;
                            atomicReference4.set(Integer.valueOf(f02Var4.f2245m.m768J(f02Var4.m1575r().m5219G(), jx1.f4174d0)));
                            this.f1075k.notify();
                        } catch (Throwable th7) {
                            this.f1075k.notify();
                            throw th7;
                        }
                    } catch (Throwable th8) {
                        throw th8;
                    }
                }
                return;
            case 4:
                m842a();
                return;
            case 5:
                v22 v22Var = this.f1076l;
                fz1 fz1Var = ((f02) v22Var.f7192j).f2246n;
                f02.m1558k(fz1Var);
                Bundle bundleM1677x = fz1Var.f2560w.m1677x();
                v42 v42VarM1573p = ((f02) v22Var.f7192j).m1573p();
                AtomicReference atomicReference5 = this.f1075k;
                v42VarM1573p.mo11z();
                v42VarM1573p.m3446B();
                v42VarM1573p.m5067O(new RunnableC0452m(v42VarM1573p, atomicReference5, v42VarM1573p.m5069Q(false), bundleM1677x, 13, false));
                return;
            default:
                v42 v42VarM1573p2 = ((f02) this.f1076l.f7192j).m1573p();
                g62 g62VarM1992b = g62.m1992b(e32.f1942n);
                AtomicReference atomicReference6 = this.f1075k;
                v42VarM1573p2.mo11z();
                v42VarM1573p2.m3446B();
                v42VarM1573p2.m5067O(new RunnableC0452m(v42VarM1573p2, atomicReference6, v42VarM1573p2.m5069Q(false), g62VarM1992b, 14, false));
                return;
        }
    }

    public /* synthetic */ c22(v22 v22Var, AtomicReference atomicReference, int i, boolean z) {
        this.f1074j = i;
        this.f1076l = v22Var;
        this.f1075k = atomicReference;
    }
}
