package p000;

/* JADX INFO: renamed from: o */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0526o extends ig0 implements InterfaceC0808vm, InterfaceC0476mn {

    /* JADX INFO: renamed from: n */
    public final InterfaceC0180en f5570n;

    public AbstractC0526o(InterfaceC0180en interfaceC0180en, boolean z) {
        super(z);
        m2608H((ag0) interfaceC0180en.mo1466j(wa0.f8474n));
        this.f5570n = interfaceC0180en.mo1465i(this);
    }

    @Override // p000.ig0
    /* JADX INFO: renamed from: G */
    public final void mo2607G(C0694sj c0694sj) {
        AbstractC0959zp.m5980i(this.f5570n, c0694sj);
    }

    @Override // p000.ig0
    /* JADX INFO: renamed from: O */
    public final void mo2614O(Object obj) {
        if (!(obj instanceof C0657rj)) {
            mo3102b0(obj);
        } else {
            C0657rj c0657rj = (C0657rj) obj;
            mo3101a0(c0657rj.f6860a, C0657rj.f6859b.get(c0657rj) != 0);
        }
    }

    @Override // p000.InterfaceC0476mn
    /* JADX INFO: renamed from: b */
    public final InterfaceC0180en mo434b() {
        return this.f5570n;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m3607c0(EnumC0587pn enumC0587pn, AbstractC0526o abstractC0526o, v60 v60Var) {
        Object objMo1490g;
        int iOrdinal = enumC0587pn.ordinal();
        kf1 kf1Var = kf1.f4365a;
        if (iOrdinal == 0) {
            try {
                af0.m195j(d71.m1111f(d71.m1106a(abstractC0526o, this, v60Var)), kf1Var);
                return;
            } catch (Throwable th) {
                mo476f(new o21(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                v60Var.getClass();
                d71.m1111f(d71.m1106a(abstractC0526o, this, v60Var)).mo476f(kf1Var);
                return;
            }
            if (iOrdinal != 3) {
                throw new C0694sj(5);
            }
            try {
                InterfaceC0180en interfaceC0180en = this.f5570n;
                Object objM5199n = vt1.m5199n(interfaceC0180en, null);
                try {
                    if (v60Var instanceof AbstractC0243gb) {
                        xe1.m5634a(2, v60Var);
                        objMo1490g = v60Var.mo1490g(abstractC0526o, this);
                    } else {
                        objMo1490g = d71.m1117r(v60Var, abstractC0526o, this);
                    }
                    vt1.m5197j(interfaceC0180en, objM5199n);
                    if (objMo1490g != EnumC0513nn.f5459j) {
                        mo476f(objMo1490g);
                    }
                } catch (Throwable th2) {
                    vt1.m5197j(interfaceC0180en, objM5199n);
                    throw th2;
                }
            } catch (Throwable th3) {
                mo476f(new o21(th3));
            }
        }
    }

    @Override // p000.InterfaceC0808vm
    /* JADX INFO: renamed from: d */
    public final InterfaceC0180en mo475d() {
        return this.f5570n;
    }

    @Override // p000.InterfaceC0808vm
    /* JADX INFO: renamed from: f */
    public final void mo476f(Object obj) {
        Throwable thM3843a = p21.m3843a(obj);
        if (thM3843a != null) {
            obj = new C0657rj(thM3843a, false);
        }
        Object objM2612L = m2612L(obj);
        if (objM2612L == AbstractC0959zp.f9884o) {
            return;
        }
        mo2035p(objM2612L);
    }

    @Override // p000.ig0
    /* JADX INFO: renamed from: u */
    public final String mo2630u() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    /* JADX INFO: renamed from: b0 */
    public void mo3102b0(Object obj) {
    }

    /* JADX INFO: renamed from: a0 */
    public void mo3101a0(Throwable th, boolean z) {
    }
}
