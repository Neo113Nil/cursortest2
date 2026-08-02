package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vo0 implements s51 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0379k0 f8229a;

    /* JADX INFO: renamed from: b */
    public final qf1 f8230b;

    /* JADX INFO: renamed from: c */
    public final C0820vy f8231c;

    public vo0(qf1 qf1Var, C0820vy c0820vy, AbstractC0379k0 abstractC0379k0) {
        this.f8230b = qf1Var;
        c0820vy.getClass();
        this.f8231c = c0820vy;
        this.f8229a = abstractC0379k0;
    }

    @Override // p000.s51
    /* JADX INFO: renamed from: a */
    public final void mo4475a(Object obj, Object obj2) {
        w51.m5267k(this.f8230b, obj, obj2);
    }

    @Override // p000.s51
    /* JADX INFO: renamed from: b */
    public final void mo4476b(Object obj) {
        this.f8230b.getClass();
        of1 of1Var = ((t70) obj).unknownFields;
        if (of1Var.f5722e) {
            of1Var.f5722e = false;
        }
        this.f8231c.getClass();
        AbstractC0024an.m289l(obj);
        throw null;
    }

    @Override // p000.s51
    /* JADX INFO: renamed from: c */
    public final boolean mo4477c(Object obj) {
        this.f8231c.getClass();
        AbstractC0024an.m289l(obj);
        throw null;
    }

    @Override // p000.s51
    /* JADX INFO: renamed from: d */
    public final t70 mo4478d() {
        AbstractC0379k0 abstractC0379k0 = this.f8229a;
        return abstractC0379k0 instanceof t70 ? ((t70) abstractC0379k0).m4757i() : ((p70) ((t70) abstractC0379k0).mo507c(5)).m3855b();
    }

    @Override // p000.s51
    /* JADX INFO: renamed from: e */
    public final int mo4479e(t70 t70Var) {
        this.f8230b.getClass();
        return t70Var.unknownFields.hashCode();
    }

    @Override // p000.s51
    /* JADX INFO: renamed from: f */
    public final void mo4480f(Object obj, C0212fi c0212fi, C0746ty c0746ty) {
        this.f8230b.getClass();
        qf1.m4094a(obj);
        this.f8231c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.s51
    /* JADX INFO: renamed from: g */
    public final void mo4481g(Object obj, nu1 nu1Var) {
        this.f8231c.getClass();
        AbstractC0024an.m289l(obj);
        throw null;
    }

    @Override // p000.s51
    /* JADX INFO: renamed from: h */
    public final int mo4482h(t70 t70Var) {
        this.f8230b.getClass();
        of1 of1Var = t70Var.unknownFields;
        int i = of1Var.f5721d;
        if (i != -1) {
            return i;
        }
        int iM2870f = 0;
        for (int i2 = 0; i2 < of1Var.f5718a; i2++) {
            int i3 = of1Var.f5719b[i2] >>> 3;
            iM2870f += C0360ji.m2870f(3, (C0799vd) of1Var.f5720c[i2]) + C0360ji.m2873i(i3) + C0360ji.m2872h(2) + (C0360ji.m2872h(1) * 2);
        }
        of1Var.f5721d = iM2870f;
        return iM2870f;
    }

    @Override // p000.s51
    /* JADX INFO: renamed from: i */
    public final boolean mo4483i(t70 t70Var, t70 t70Var2) {
        this.f8230b.getClass();
        return t70Var.unknownFields.equals(t70Var2.unknownFields);
    }
}
