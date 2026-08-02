package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ut */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0778ut extends pc1 {

    /* JADX INFO: renamed from: l */
    public int f7905l;

    public AbstractC0778ut(int i) {
        super(false, 0L);
        this.f7905l = i;
    }

    /* JADX INFO: renamed from: e */
    public abstract InterfaceC0808vm mo1183e();

    /* JADX INFO: renamed from: g */
    public Throwable mo1184g(Object obj) {
        C0657rj c0657rj = obj instanceof C0657rj ? (C0657rj) obj : null;
        if (c0657rj != null) {
            return c0657rj.f6860a;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m4953j(Throwable th) {
        AbstractC0959zp.m5980i(mo1183e().mo475d(), new C0624qn("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: k */
    public abstract Object mo1186k();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC0808vm interfaceC0808vmMo1183e = mo1183e();
            interfaceC0808vmMo1183e.getClass();
            C0704st c0704st = (C0704st) interfaceC0808vmMo1183e;
            AbstractC0882xm abstractC0882xm = c0704st.f7207n;
            Object obj = c0704st.f7209p;
            InterfaceC0180en interfaceC0180enMo475d = abstractC0882xm.mo475d();
            Object objM5199n = vt1.m5199n(interfaceC0180enMo475d, obj);
            ag0 ag0Var = null;
            gf1 gf1VarM5654p = objM5199n != vt1.f8268d ? AbstractC0875xf.m5654p(abstractC0882xm, interfaceC0180enMo475d, objM5199n) : null;
            try {
                InterfaceC0180en interfaceC0180enMo475d2 = abstractC0882xm.mo475d();
                Object objMo1186k = mo1186k();
                Throwable thMo1184g = mo1184g(objMo1186k);
                if (thMo1184g == null) {
                    int i = this.f7905l;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        ag0Var = (ag0) interfaceC0180enMo475d2.mo1466j(wa0.f8474n);
                    }
                }
                if (ag0Var != null && !ag0Var.mo203a()) {
                    CancellationException cancellationExceptionM2635z = ((ig0) ag0Var).m2635z();
                    mo1181b(cancellationExceptionM2635z);
                    abstractC0882xm.mo476f(new o21(cancellationExceptionM2635z));
                } else if (thMo1184g != null) {
                    abstractC0882xm.mo476f(new o21(thMo1184g));
                } else {
                    abstractC0882xm.mo476f(mo1185i(objMo1186k));
                }
            } finally {
                if (gf1VarM5654p == null || gf1VarM5654p.m2033d0()) {
                    vt1.m5197j(interfaceC0180enMo475d, objM5199n);
                }
            }
        } catch (Throwable th) {
            m4953j(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo1181b(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: i */
    public Object mo1185i(Object obj) {
        return obj;
    }
}
