package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class aq1 implements hq1 {

    /* JADX INFO: renamed from: a */
    public final do1 f605a;

    /* JADX INFO: renamed from: b */
    public final wa0 f606b;

    public aq1(wa0 wa0Var, do1 do1Var) {
        x80 x80Var = to1.f7556a;
        this.f606b = wa0Var;
        this.f605a = do1Var;
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: a */
    public final zo1 mo464a() {
        do1 do1Var = this.f605a;
        if (do1Var instanceof zo1) {
            return ((zo1) do1Var).m5967i();
        }
        xo1 xo1Var = (xo1) ((zo1) do1Var).mo14s(5);
        boolean zM5965g = xo1Var.f9011k.m5965g();
        zo1 zo1Var = xo1Var.f9011k;
        if (!zM5965g) {
            return zo1Var;
        }
        zo1Var.getClass();
        eq1.f2165c.m1495a(zo1Var.getClass()).mo472i(zo1Var);
        zo1Var.m5966h();
        return xo1Var.f9011k;
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: b */
    public final int mo465b(zo1 zo1Var) {
        return zo1Var.zzc.hashCode();
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: c */
    public final void mo466c(Object obj, jg0 jg0Var) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: d */
    public final void mo467d(Object obj, Object obj2) {
        iq1.m2671b(obj, obj2);
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: e */
    public final int mo468e(do1 do1Var) {
        oq1 oq1Var = ((zo1) do1Var).zzc;
        int i = oq1Var.f5847d;
        if (i != -1) {
            return i;
        }
        int iM2771f = 0;
        for (int i2 = 0; i2 < oq1Var.f5844a; i2++) {
            int i3 = oq1Var.f5845b[i2] >>> 3;
            ko1 ko1Var = (ko1) oq1Var.f5846c[i2];
            int iM4391a = ro1.m4391a(8);
            int iM4391a2 = ro1.m4391a(i3) + ro1.m4391a(16);
            int iM4391a3 = ro1.m4391a(24);
            int iMo2330c = ko1Var.mo2330c();
            iM2771f += iM4391a + iM4391a + iM4391a2 + j11.m2771f(iMo2330c, iMo2330c, iM4391a3);
        }
        oq1Var.f5847d = iM2771f;
        return iM2771f;
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: f */
    public final boolean mo469f(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: g */
    public final void mo470g(Object obj, C0212fi c0212fi, so1 so1Var) {
        this.f606b.getClass();
        wa0.m5306u(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: h */
    public final boolean mo471h(zo1 zo1Var, zo1 zo1Var2) {
        return zo1Var.zzc.equals(zo1Var2.zzc);
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: i */
    public final void mo472i(Object obj) {
        this.f606b.getClass();
        oq1 oq1Var = ((zo1) obj).zzc;
        if (oq1Var.f5848e) {
            oq1Var.f5848e = false;
        }
        x80 x80Var = to1.f7556a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.hq1
    /* JADX INFO: renamed from: j */
    public final void mo473j(Object obj, byte[] bArr, int i, int i2, go1 go1Var) {
        zo1 zo1Var = (zo1) obj;
        if (zo1Var.zzc == oq1.f5843f) {
            zo1Var.zzc = oq1.m3748a();
        }
        obj.getClass();
        throw new ClassCastException();
    }
}
