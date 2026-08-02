package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ul1 extends jl1 {

    /* JADX INFO: renamed from: b */
    public final m81 f7850b;

    /* JADX INFO: renamed from: c */
    public final qc1 f7851c;

    /* JADX INFO: renamed from: d */
    public final o31 f7852d;

    public ul1(int i, m81 m81Var, qc1 qc1Var, o31 o31Var) {
        super(i);
        this.f7851c = qc1Var;
        this.f7850b = m81Var;
        this.f7852d = o31Var;
        if (i == 2 && m81Var.f5009k) {
            C0270h1.m2190f("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: a */
    public final C0451lz[] mo2926a(el1 el1Var) {
        return (C0451lz[]) this.f7850b.f5010l;
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: b */
    public final boolean mo2927b(el1 el1Var) {
        return this.f7850b.f5009k;
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: c */
    public final int mo2928c(el1 el1Var) {
        return 0;
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: d */
    public final void mo2929d(Status status) {
        this.f7852d.getClass();
        this.f7851c.m4062c(status.f1343l != null ? new t11(status) : new C0642r4(status));
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: e */
    public final void mo2930e(Exception exc) {
        this.f7851c.m4062c(exc);
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: f */
    public final void mo2931f(a81 a81Var, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) a81Var.f64l;
        qc1 qc1Var = this.f7851c;
        map.put(qc1Var, boolValueOf);
        v92 v92Var = qc1Var.f6465a;
        a81 a81Var2 = new a81(a81Var, qc1Var);
        v92Var.getClass();
        v92Var.f8141b.m3364n(new vy1(rc1.f6820a, a81Var2));
        v92Var.m5139o();
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: g */
    public final void mo2932g(el1 el1Var) throws DeadObjectException {
        qc1 qc1Var = this.f7851c;
        try {
            m81 m81Var = this.f7850b;
            ((y01) ((m81) m81Var.f5011m).f5010l).accept(el1Var.f2110c, qc1Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo2929d(jl1.m2925h(e2));
        } catch (RuntimeException e3) {
            qc1Var.m4062c(e3);
        }
    }
}
