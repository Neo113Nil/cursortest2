package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gf1 extends x51 {

    /* JADX INFO: renamed from: p */
    public final ThreadLocal f2720p;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public gf1(InterfaceC0180en interfaceC0180en, xb1 xb1Var) {
        hf1 hf1Var = hf1.f3198j;
        super(xb1Var, interfaceC0180en.mo1466j(hf1Var) == null ? interfaceC0180en.mo1465i(hf1Var) : interfaceC0180en);
        this.f2720p = new ThreadLocal();
        InterfaceC0180en interfaceC0180en2 = xb1Var.f8992k;
        interfaceC0180en2.getClass();
        if (interfaceC0180en2.mo1466j(o31.f5604l) instanceof AbstractC0292hn) {
            return;
        }
        Object objM5199n = vt1.m5199n(interfaceC0180en, null);
        vt1.m5197j(interfaceC0180en, objM5199n);
        m2034e0(interfaceC0180en, objM5199n);
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m2033d0() {
        boolean z = this.threadLocalIsSet && this.f2720p.get() == null;
        this.f2720p.remove();
        return !z;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m2034e0(InterfaceC0180en interfaceC0180en, Object obj) {
        this.threadLocalIsSet = true;
        this.f2720p.set(new kv0(interfaceC0180en, obj));
    }

    @Override // p000.x51, p000.ig0
    /* JADX INFO: renamed from: p */
    public final void mo2035p(Object obj) {
        if (this.threadLocalIsSet) {
            kv0 kv0Var = (kv0) this.f2720p.get();
            if (kv0Var != null) {
                vt1.m5197j((InterfaceC0180en) kv0Var.f4582j, kv0Var.f4583k);
            }
            this.f2720p.remove();
        }
        Object objM2817z = j22.m2817z(obj);
        InterfaceC0808vm interfaceC0808vm = this.f8793o;
        InterfaceC0180en interfaceC0180enMo475d = interfaceC0808vm.mo475d();
        Object objM5199n = vt1.m5199n(interfaceC0180enMo475d, null);
        gf1 gf1VarM5654p = objM5199n != vt1.f8268d ? AbstractC0875xf.m5654p(interfaceC0808vm, interfaceC0180enMo475d, objM5199n) : null;
        try {
            this.f8793o.mo476f(objM2817z);
        } finally {
            if (gf1VarM5654p == null || gf1VarM5654p.m2033d0()) {
                vt1.m5197j(interfaceC0180enMo475d, objM5199n);
            }
        }
    }
}
