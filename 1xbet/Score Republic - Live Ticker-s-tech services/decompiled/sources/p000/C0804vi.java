package p000;

/* JADX INFO: renamed from: vi */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0804vi implements v60 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8196j;

    public /* synthetic */ C0804vi(int i) {
        this.f8196j = i;
    }

    @Override // p000.v60
    /* JADX INFO: renamed from: g */
    public final Object mo1490g(Object obj, Object obj2) {
        C0841wi c0841wi;
        Object obj3;
        switch (this.f8196j) {
            case 0:
                String str = (String) obj;
                InterfaceC0104cn interfaceC0104cn = (InterfaceC0104cn) obj2;
                str.getClass();
                interfaceC0104cn.getClass();
                if (str.length() == 0) {
                    return interfaceC0104cn.toString();
                }
                return str + ", " + interfaceC0104cn;
            case 1:
                InterfaceC0180en interfaceC0180en = (InterfaceC0180en) obj;
                InterfaceC0104cn interfaceC0104cn2 = (InterfaceC0104cn) obj2;
                interfaceC0180en.getClass();
                interfaceC0104cn2.getClass();
                InterfaceC0180en interfaceC0180enMo1468m = interfaceC0180en.mo1468m(interfaceC0104cn2.getKey());
                C0301hw c0301hw = C0301hw.f3348j;
                if (interfaceC0180enMo1468m == c0301hw) {
                    return interfaceC0104cn2;
                }
                o31 o31Var = o31.f5604l;
                AbstractC0292hn abstractC0292hn = (AbstractC0292hn) interfaceC0180enMo1468m.mo1466j(o31Var);
                if (abstractC0292hn == null) {
                    c0841wi = new C0841wi(interfaceC0180enMo1468m, interfaceC0104cn2);
                } else {
                    InterfaceC0180en interfaceC0180enMo1468m2 = interfaceC0180enMo1468m.mo1468m(o31Var);
                    if (interfaceC0180enMo1468m2 == c0301hw) {
                        return new C0841wi(interfaceC0104cn2, abstractC0292hn);
                    }
                    c0841wi = new C0841wi(new C0841wi(interfaceC0180enMo1468m2, interfaceC0104cn2), abstractC0292hn);
                }
                return c0841wi;
            case 2:
                return ((InterfaceC0180en) obj).mo1465i((InterfaceC0104cn) obj2);
            case 3:
                return ((InterfaceC0180en) obj).mo1465i((InterfaceC0104cn) obj2);
            case 4:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                obj3 = bool;
                break;
            case 5:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 6:
                return obj;
            case 7:
                if (obj == null) {
                    return null;
                }
                dd0.m1158c();
                return null;
            default:
                obj3 = (ed1) obj;
                break;
        }
        return obj3;
    }
}
