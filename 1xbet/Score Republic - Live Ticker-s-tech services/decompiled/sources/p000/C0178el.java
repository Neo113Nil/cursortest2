package p000;

/* JADX INFO: renamed from: el */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0178el extends C0650rc {

    /* JADX INFO: renamed from: y */
    public final EnumC0576pc f2107y;

    public C0178el(int i, EnumC0576pc enumC0576pc) {
        super(i);
        this.f2107y = enumC0576pc;
        if (enumC0576pc != EnumC0576pc.f6080j) {
            if (i >= 1) {
                return;
            }
            C0270h1.m2186b(AbstractC0024an.m282e(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            throw null;
        }
        l01.f4622a.getClass();
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + new C0580pg(C0650rc.class).m3904a() + " instead").toString());
    }

    /* JADX INFO: renamed from: L */
    public final Object m1434L(Object obj, boolean z) {
        if (this.f2107y != EnumC0576pc.f6082l) {
            return m4313H(obj);
        }
        Object objMo1436k = super.mo1436k(obj);
        return (!(objMo1436k instanceof C0017ag) || (objMo1436k instanceof C0949zf)) ? objMo1436k : kf1.f4365a;
    }

    @Override // p000.C0650rc, p000.o61
    /* JADX INFO: renamed from: g */
    public final Object mo1435g(InterfaceC0808vm interfaceC0808vm, Object obj) throws Throwable {
        if (m1434L(obj, true) instanceof C0949zf) {
            throw m4330r();
        }
        return kf1.f4365a;
    }

    @Override // p000.C0650rc, p000.o61
    /* JADX INFO: renamed from: k */
    public final Object mo1436k(Object obj) {
        return m1434L(obj, false);
    }

    @Override // p000.C0650rc
    /* JADX INFO: renamed from: x */
    public final boolean mo1437x() {
        return this.f2107y == EnumC0576pc.f6081k;
    }
}
