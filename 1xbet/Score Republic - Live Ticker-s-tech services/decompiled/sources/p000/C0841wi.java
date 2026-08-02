package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: wi */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0841wi implements InterfaceC0180en, Serializable {

    /* JADX INFO: renamed from: j */
    public final InterfaceC0180en f8549j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC0104cn f8550k;

    public C0841wi(InterfaceC0180en interfaceC0180en, InterfaceC0104cn interfaceC0104cn) {
        interfaceC0180en.getClass();
        interfaceC0104cn.getClass();
        this.f8549j = interfaceC0180en;
        this.f8550k = interfaceC0104cn;
    }

    public final boolean equals(Object obj) {
        boolean zM187a;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0841wi) {
            C0841wi c0841wi = (C0841wi) obj;
            int i = 2;
            C0841wi c0841wi2 = c0841wi;
            int i2 = 2;
            while (true) {
                InterfaceC0180en interfaceC0180en = c0841wi2.f8549j;
                c0841wi2 = interfaceC0180en instanceof C0841wi ? (C0841wi) interfaceC0180en : null;
                if (c0841wi2 == null) {
                    break;
                }
                i2++;
            }
            C0841wi c0841wi3 = this;
            while (true) {
                InterfaceC0180en interfaceC0180en2 = c0841wi3.f8549j;
                c0841wi3 = interfaceC0180en2 instanceof C0841wi ? (C0841wi) interfaceC0180en2 : null;
                if (c0841wi3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    InterfaceC0104cn interfaceC0104cn = this.f8550k;
                    if (!af0.m187a(c0841wi.mo1466j(interfaceC0104cn.getKey()), interfaceC0104cn)) {
                        zM187a = false;
                        break;
                    }
                    InterfaceC0180en interfaceC0180en3 = this.f8549j;
                    if (!(interfaceC0180en3 instanceof C0841wi)) {
                        interfaceC0180en3.getClass();
                        InterfaceC0104cn interfaceC0104cn2 = (InterfaceC0104cn) interfaceC0180en3;
                        zM187a = af0.m187a(c0841wi.mo1466j(interfaceC0104cn2.getKey()), interfaceC0104cn2);
                        break;
                    }
                    this = (C0841wi) interfaceC0180en3;
                }
                if (zM187a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8550k.hashCode() + this.f8549j.hashCode();
    }

    @Override // p000.InterfaceC0180en
    /* JADX INFO: renamed from: i */
    public final InterfaceC0180en mo1465i(InterfaceC0180en interfaceC0180en) {
        interfaceC0180en.getClass();
        return interfaceC0180en == C0301hw.f3348j ? this : (InterfaceC0180en) interfaceC0180en.mo1467l(this, new C0804vi(1));
    }

    @Override // p000.InterfaceC0180en
    /* JADX INFO: renamed from: j */
    public final InterfaceC0104cn mo1466j(InterfaceC0144dn interfaceC0144dn) {
        interfaceC0144dn.getClass();
        while (true) {
            InterfaceC0104cn interfaceC0104cnMo1466j = this.f8550k.mo1466j(interfaceC0144dn);
            if (interfaceC0104cnMo1466j != null) {
                return interfaceC0104cnMo1466j;
            }
            InterfaceC0180en interfaceC0180en = this.f8549j;
            if (!(interfaceC0180en instanceof C0841wi)) {
                return interfaceC0180en.mo1466j(interfaceC0144dn);
            }
            this = (C0841wi) interfaceC0180en;
        }
    }

    @Override // p000.InterfaceC0180en
    /* JADX INFO: renamed from: l */
    public final Object mo1467l(Object obj, v60 v60Var) {
        return v60Var.mo1490g(this.f8549j.mo1467l(obj, v60Var), this.f8550k);
    }

    @Override // p000.InterfaceC0180en
    /* JADX INFO: renamed from: m */
    public final InterfaceC0180en mo1468m(InterfaceC0144dn interfaceC0144dn) {
        interfaceC0144dn.getClass();
        InterfaceC0104cn interfaceC0104cn = this.f8550k;
        InterfaceC0104cn interfaceC0104cnMo1466j = interfaceC0104cn.mo1466j(interfaceC0144dn);
        InterfaceC0180en interfaceC0180en = this.f8549j;
        if (interfaceC0104cnMo1466j != null) {
            return interfaceC0180en;
        }
        InterfaceC0180en interfaceC0180enMo1468m = interfaceC0180en.mo1468m(interfaceC0144dn);
        if (interfaceC0180enMo1468m == interfaceC0180en) {
            return this;
        }
        return interfaceC0180enMo1468m == C0301hw.f3348j ? interfaceC0104cn : new C0841wi(interfaceC0180enMo1468m, interfaceC0104cn);
    }

    public final String toString() {
        return "[" + ((String) mo1467l("", new C0804vi(0))) + ']';
    }
}
