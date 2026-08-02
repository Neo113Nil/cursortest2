package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class rl1 extends jl1 {

    /* JADX INFO: renamed from: b */
    public final qc1 f6886b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f6887c;

    /* JADX INFO: renamed from: d */
    public final Object f6888d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rl1(bj0 bj0Var, qc1 qc1Var) {
        this(4, qc1Var);
        this.f6887c = 1;
        this.f6888d = bj0Var;
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: a */
    public final C0451lz[] mo2926a(el1 el1Var) {
        int i = this.f6887c;
        Object obj = this.f6888d;
        switch (i) {
            case 0:
                return (C0451lz[]) ((ll1) obj).f4836a.f8225m;
            default:
                ll1 ll1Var = (ll1) el1Var.f2114g.get((bj0) obj);
                if (ll1Var == null) {
                    return null;
                }
                return (C0451lz[]) ll1Var.f4836a.f8225m;
        }
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: b */
    public final boolean mo2927b(el1 el1Var) {
        int i = this.f6887c;
        Object obj = this.f6888d;
        switch (i) {
            case 0:
                return ((ll1) obj).f4836a.f8223k;
            default:
                ll1 ll1Var = (ll1) el1Var.f2114g.get((bj0) obj);
                return ll1Var != null && ll1Var.f4836a.f8223k;
        }
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: c */
    public final int mo2928c(el1 el1Var) {
        switch (this.f6887c) {
            case 0:
                return 0;
            default:
                return ((ll1) el1Var.f2114g.get((bj0) this.f6888d)) != null ? 0 : -1;
        }
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: d */
    public final void mo2929d(Status status) {
        this.f6886b.m4062c(new C0642r4(status));
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: e */
    public final void mo2930e(Exception exc) {
        this.f6886b.m4062c(exc);
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo2931f(a81 a81Var, boolean z) {
        int i = this.f6887c;
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: g */
    public final void mo2932g(el1 el1Var) throws DeadObjectException {
        try {
            m4380k(el1Var);
        } catch (DeadObjectException e) {
            mo2929d(jl1.m2925h(e));
            throw e;
        } catch (RemoteException e2) {
            mo2929d(jl1.m2925h(e2));
        } catch (RuntimeException e3) {
            this.f6886b.m4062c(e3);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4380k(el1 el1Var) {
        switch (this.f6887c) {
            case 0:
                ll1 ll1Var = (ll1) this.f6888d;
                C0809vn c0809vn = ll1Var.f4836a;
                ((oq0) ((C0415l) c0809vn.f8226n).f4614b).accept(el1Var.f2110c, this.f6886b);
                bj0 bj0Var = (bj0) ((p90) c0809vn.f8224l).f6028k;
                if (bj0Var != null) {
                    el1Var.f2114g.put(bj0Var, ll1Var);
                }
                break;
            default:
                ll1 ll1Var2 = (ll1) el1Var.f2114g.remove((bj0) this.f6888d);
                if (ll1Var2 == null) {
                    this.f6886b.m4063d(Boolean.FALSE);
                } else {
                    ((dx1) ((C0415l) ll1Var2.f4837b.f3922k).f4615c).accept(el1Var.f2110c, this.f6886b);
                    ((p90) ll1Var2.f4836a.f8224l).f6028k = null;
                }
                break;
        }
    }

    public rl1(int i, qc1 qc1Var) {
        super(i);
        this.f6886b = qc1Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rl1(ll1 ll1Var, qc1 qc1Var) {
        this(3, qc1Var);
        this.f6887c = 0;
        this.f6888d = ll1Var;
    }

    /* JADX INFO: renamed from: i */
    private final /* bridge */ /* synthetic */ void m4378i(a81 a81Var, boolean z) {
    }

    /* JADX INFO: renamed from: j */
    private final /* bridge */ /* synthetic */ void m4379j(a81 a81Var, boolean z) {
    }
}
