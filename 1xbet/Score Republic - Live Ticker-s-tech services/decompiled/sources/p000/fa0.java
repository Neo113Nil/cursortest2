package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fa0 extends bj1 {
    @Override // p000.InterfaceC0518ns
    /* JADX INFO: renamed from: a */
    public final void mo1751a(InterfaceC0518ns interfaceC0518ns) {
        C0629qs c0629qs = this.f896h;
        if (c0629qs.f6574c && !c0629qs.f6581j) {
            c0629qs.mo759d((int) ((((C0629qs) c0629qs.f6583l.get(0)).f6578g * ((ea0) this.f890b).f2037p0) + 0.5f));
        }
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: d */
    public final void mo708d() {
        C0143dm c0143dm = this.f890b;
        ea0 ea0Var = (ea0) c0143dm;
        int i = ea0Var.f2038q0;
        int i2 = ea0Var.f2039r0;
        int i3 = ea0Var.f2041t0;
        C0629qs c0629qs = this.f896h;
        if (i3 == 1) {
            if (i != -1) {
                c0629qs.f6583l.add(c0143dm.f1699S.f1713d.f896h);
                this.f890b.f1699S.f1713d.f896h.f6582k.add(c0629qs);
                c0629qs.f6577f = i;
            } else if (i2 != -1) {
                c0629qs.f6583l.add(c0143dm.f1699S.f1713d.f897i);
                this.f890b.f1699S.f1713d.f897i.f6582k.add(c0629qs);
                c0629qs.f6577f = -i2;
            } else {
                c0629qs.f6573b = true;
                c0629qs.f6583l.add(c0143dm.f1699S.f1713d.f897i);
                this.f890b.f1699S.f1713d.f897i.f6582k.add(c0629qs);
            }
            m1752m(this.f890b.f1713d.f896h);
            m1752m(this.f890b.f1713d.f897i);
            return;
        }
        if (i != -1) {
            c0629qs.f6583l.add(c0143dm.f1699S.f1715e.f896h);
            this.f890b.f1699S.f1715e.f896h.f6582k.add(c0629qs);
            c0629qs.f6577f = i;
        } else if (i2 != -1) {
            c0629qs.f6583l.add(c0143dm.f1699S.f1715e.f897i);
            this.f890b.f1699S.f1715e.f897i.f6582k.add(c0629qs);
            c0629qs.f6577f = -i2;
        } else {
            c0629qs.f6573b = true;
            c0629qs.f6583l.add(c0143dm.f1699S.f1715e.f897i);
            this.f890b.f1699S.f1715e.f897i.f6582k.add(c0629qs);
        }
        m1752m(this.f890b.f1715e.f896h);
        m1752m(this.f890b.f1715e.f897i);
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: e */
    public final void mo709e() {
        C0143dm c0143dm = this.f890b;
        int i = ((ea0) c0143dm).f2041t0;
        C0629qs c0629qs = this.f896h;
        if (i == 1) {
            c0143dm.f1704X = c0629qs.f6578g;
        } else {
            c0143dm.f1705Y = c0629qs.f6578g;
        }
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: f */
    public final void mo710f() {
        this.f896h.m4137c();
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: k */
    public final boolean mo713k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m1752m(C0629qs c0629qs) {
        C0629qs c0629qs2 = this.f896h;
        c0629qs2.f6582k.add(c0629qs);
        c0629qs.f6583l.add(c0629qs2);
    }
}
