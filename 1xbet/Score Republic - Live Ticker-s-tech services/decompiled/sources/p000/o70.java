package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o70 implements Cloneable {

    /* JADX INFO: renamed from: j */
    public final s70 f5644j;

    /* JADX INFO: renamed from: k */
    public s70 f5645k;

    public o70(s70 s70Var) {
        this.f5644j = s70Var;
        if (s70Var.m4495i()) {
            C0270h1.m2190f("Default instance must be immutable.");
            throw null;
        }
        this.f5645k = s70Var.m4497k();
    }

    /* JADX INFO: renamed from: d */
    public static void m3634d(Object obj, Object obj2) {
        ey0 ey0Var = ey0.f2207c;
        ey0Var.getClass();
        ey0Var.m1525a(obj.getClass()).mo4248a(obj, obj2);
    }

    /* JADX INFO: renamed from: a */
    public final s70 m3635a() {
        s70 s70VarM3636b = m3636b();
        s70VarM3636b.getClass();
        if (s70.m4492h(s70VarM3636b, true)) {
            return s70VarM3636b;
        }
        throw new if1();
    }

    /* JADX INFO: renamed from: b */
    public final s70 m3636b() {
        boolean zM4495i = this.f5645k.m4495i();
        s70 s70Var = this.f5645k;
        if (!zM4495i) {
            return s70Var;
        }
        s70Var.getClass();
        ey0 ey0Var = ey0.f2207c;
        ey0Var.getClass();
        ey0Var.m1525a(s70Var.getClass()).mo4249b(s70Var);
        s70Var.m4496j();
        return this.f5645k;
    }

    /* JADX INFO: renamed from: c */
    public final void m3637c() {
        if (this.f5645k.m4495i()) {
            return;
        }
        s70 s70VarM4497k = this.f5644j.m4497k();
        m3634d(s70VarM4497k, this.f5645k);
        this.f5645k = s70VarM4497k;
    }

    public final Object clone() {
        o70 o70Var = (o70) this.f5644j.mo182e(5);
        o70Var.f5645k = m3636b();
        return o70Var;
    }
}
