package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class uo0 implements r51 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0342j0 f7873a;

    /* JADX INFO: renamed from: b */
    public final pf1 f7874b;

    /* JADX INFO: renamed from: c */
    public final C0783uy f7875c;

    public uo0(pf1 pf1Var, C0783uy c0783uy, AbstractC0342j0 abstractC0342j0) {
        this.f7874b = pf1Var;
        c0783uy.getClass();
        this.f7875c = c0783uy;
        this.f7873a = abstractC0342j0;
    }

    @Override // p000.r51
    /* JADX INFO: renamed from: a */
    public final void mo4248a(Object obj, Object obj2) {
        v51.m5087k(this.f7874b, obj, obj2);
    }

    @Override // p000.r51
    /* JADX INFO: renamed from: b */
    public final void mo4249b(Object obj) {
        this.f7874b.getClass();
        nf1 nf1Var = ((s70) obj).unknownFields;
        if (nf1Var.f5403e) {
            nf1Var.f5403e = false;
        }
        this.f7875c.getClass();
        AbstractC0024an.m289l(obj);
        throw null;
    }

    @Override // p000.r51
    /* JADX INFO: renamed from: c */
    public final boolean mo4250c(Object obj) {
        this.f7875c.getClass();
        AbstractC0024an.m289l(obj);
        throw null;
    }

    @Override // p000.r51
    /* JADX INFO: renamed from: d */
    public final s70 mo4251d() {
        AbstractC0342j0 abstractC0342j0 = this.f7873a;
        return abstractC0342j0 instanceof s70 ? ((s70) abstractC0342j0).m4497k() : ((o70) ((s70) abstractC0342j0).mo182e(5)).m3636b();
    }

    @Override // p000.r51
    /* JADX INFO: renamed from: e */
    public final int mo4252e(s70 s70Var) {
        this.f7874b.getClass();
        return s70Var.unknownFields.hashCode();
    }

    @Override // p000.r51
    /* JADX INFO: renamed from: f */
    public final void mo4253f(Object obj, C0212fi c0212fi, C0709sy c0709sy) {
        this.f7874b.getClass();
        pf1.m3902a(obj);
        this.f7875c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.r51
    /* JADX INFO: renamed from: g */
    public final int mo4254g(s70 s70Var) {
        this.f7874b.getClass();
        nf1 nf1Var = s70Var.unknownFields;
        int i = nf1Var.f5402d;
        if (i != -1) {
            return i;
        }
        int iM3034d = 0;
        for (int i2 = 0; i2 < nf1Var.f5399a; i2++) {
            int i3 = nf1Var.f5400b[i2] >>> 3;
            C0762ud c0762ud = (C0762ud) nf1Var.f5401c[i2];
            int iM3034d2 = AbstractC0397ki.m3034d(i3) + AbstractC0397ki.m3033c(2) + (AbstractC0397ki.m3033c(1) * 2);
            int iM3033c = AbstractC0397ki.m3033c(3);
            int size = c0762ud.size();
            iM3034d += AbstractC0397ki.m3034d(size) + size + iM3033c + iM3034d2;
        }
        nf1Var.f5402d = iM3034d;
        return iM3034d;
    }

    @Override // p000.r51
    /* JADX INFO: renamed from: h */
    public final void mo4255h(Object obj, b90 b90Var) {
        this.f7875c.getClass();
        AbstractC0024an.m289l(obj);
        throw null;
    }

    @Override // p000.r51
    /* JADX INFO: renamed from: i */
    public final boolean mo4256i(s70 s70Var, s70 s70Var2) {
        this.f7874b.getClass();
        return s70Var.unknownFields.equals(s70Var2.unknownFields);
    }
}
