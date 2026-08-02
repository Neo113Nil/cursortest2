package p000;

/* JADX INFO: renamed from: hn */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0292hn extends AbstractC0563p implements InterfaceC0104cn {

    /* JADX INFO: renamed from: k */
    public static final C0255gn f3260k = new C0255gn(o31.f5604l, new C0217fn());

    public AbstractC0292hn() {
        super(o31.f5604l);
    }

    @Override // p000.AbstractC0563p, p000.InterfaceC0180en
    /* JADX INFO: renamed from: j */
    public final InterfaceC0104cn mo1466j(InterfaceC0144dn interfaceC0144dn) {
        InterfaceC0104cn interfaceC0104cn;
        interfaceC0144dn.getClass();
        if (interfaceC0144dn instanceof C0255gn) {
            C0255gn c0255gn = (C0255gn) interfaceC0144dn;
            InterfaceC0144dn interfaceC0144dn2 = this.f5939j;
            if ((interfaceC0144dn2 == c0255gn || c0255gn.f2811k == interfaceC0144dn2) && (interfaceC0104cn = (InterfaceC0104cn) c0255gn.f2810j.mo170i(this)) != null) {
                return interfaceC0104cn;
            }
        } else if (o31.f5604l == interfaceC0144dn) {
            return this;
        }
        return null;
    }

    @Override // p000.AbstractC0563p, p000.InterfaceC0180en
    /* JADX INFO: renamed from: m */
    public final InterfaceC0180en mo1468m(InterfaceC0144dn interfaceC0144dn) {
        interfaceC0144dn.getClass();
        if (interfaceC0144dn instanceof C0255gn) {
            C0255gn c0255gn = (C0255gn) interfaceC0144dn;
            InterfaceC0144dn interfaceC0144dn2 = this.f5939j;
            if ((interfaceC0144dn2 != c0255gn && c0255gn.f2811k != interfaceC0144dn2) || ((InterfaceC0104cn) c0255gn.f2810j.mo170i(this)) == null) {
                return this;
            }
        } else if (o31.f5604l != interfaceC0144dn) {
            return this;
        }
        return C0301hw.f3348j;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo1225o(InterfaceC0180en interfaceC0180en, Runnable runnable);

    /* JADX INFO: renamed from: p */
    public boolean mo2243p(InterfaceC0180en interfaceC0180en) {
        return !(this instanceof ff1);
    }

    /* JADX INFO: renamed from: q */
    public AbstractC0292hn mo2309q(int i) {
        oa2.m3656c(i);
        return new di0(this, i);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0959zp.m5979g(this);
    }
}
