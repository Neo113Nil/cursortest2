package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: wf */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0838wf implements i70 {

    /* JADX INFO: renamed from: j */
    public final InterfaceC0180en f8528j;

    /* JADX INFO: renamed from: k */
    public final int f8529k;

    /* JADX INFO: renamed from: l */
    public final EnumC0576pc f8530l;

    /* JADX INFO: renamed from: m */
    public final t10 f8531m;

    public C0838wf(t10 t10Var, InterfaceC0180en interfaceC0180en, int i, EnumC0576pc enumC0576pc) {
        this.f8528j = interfaceC0180en;
        this.f8529k = i;
        this.f8530l = enumC0576pc;
        this.f8531m = t10Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m5323a() {
        ArrayList arrayList = new ArrayList(4);
        C0301hw c0301hw = C0301hw.f3348j;
        InterfaceC0180en interfaceC0180en = this.f8528j;
        if (interfaceC0180en != c0301hw) {
            arrayList.add("context=" + interfaceC0180en);
        }
        int i = this.f8529k;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        EnumC0576pc enumC0576pc = EnumC0576pc.f6080j;
        EnumC0576pc enumC0576pc2 = this.f8530l;
        if (enumC0576pc2 != enumC0576pc) {
            arrayList.add("onBufferOverflow=" + enumC0576pc2);
        }
        return getClass().getSimpleName() + '[' + AbstractC0471mi.m3387u(arrayList, ", ", null, null, null, 62) + ']';
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // p000.i70
    /* JADX INFO: renamed from: h */
    public final t10 mo1141h(InterfaceC0180en interfaceC0180en, int i, EnumC0576pc enumC0576pc) {
        InterfaceC0180en interfaceC0180en2 = this.f8528j;
        InterfaceC0180en interfaceC0180enMo1465i = interfaceC0180en.mo1465i(interfaceC0180en2);
        EnumC0576pc enumC0576pc2 = EnumC0576pc.f6080j;
        EnumC0576pc enumC0576pc3 = this.f8530l;
        int i2 = this.f8529k;
        if (enumC0576pc == enumC0576pc2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            enumC0576pc = enumC0576pc3;
        }
        return (af0.m187a(interfaceC0180enMo1465i, interfaceC0180en2) && i == i2 && enumC0576pc == enumC0576pc3) ? this : new C0838wf(this.f8531m, interfaceC0180enMo1465i, i, enumC0576pc);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088 A[RETURN] */
    @Override // p000.t10
    /* JADX INFO: renamed from: r */
    public final Object mo622r(u10 u10Var, AbstractC0882xm abstractC0882xm) throws Throwable {
        Object objM4651e;
        int i = this.f8529k;
        int i2 = 0;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        InterfaceC0808vm interfaceC0808vm = null;
        kf1 kf1Var = kf1.f4365a;
        if (i == -3) {
            InterfaceC0180en interfaceC0180enMo475d = abstractC0882xm.mo475d();
            Boolean bool = Boolean.FALSE;
            C0804vi c0804vi = new C0804vi(4);
            InterfaceC0180en interfaceC0180en = this.f8528j;
            InterfaceC0180en interfaceC0180enMo1465i = !((Boolean) interfaceC0180en.mo1467l(bool, c0804vi)).booleanValue() ? interfaceC0180enMo475d.mo1465i(interfaceC0180en) : AbstractC0875xf.m5650g(interfaceC0180enMo475d, interfaceC0180en, false);
            if (af0.m187a(interfaceC0180enMo1465i, interfaceC0180enMo475d)) {
                Object objMo622r = this.f8531m.mo622r(u10Var, abstractC0882xm);
                if (objMo622r != enumC0513nn) {
                    objMo622r = kf1Var;
                }
                if (objMo622r == enumC0513nn) {
                    return objMo622r;
                }
            } else {
                o31 o31Var = o31.f5604l;
                if (af0.m187a(interfaceC0180enMo1465i.mo1466j(o31Var), interfaceC0180enMo475d.mo1466j(o31Var))) {
                    InterfaceC0180en interfaceC0180enMo475d2 = abstractC0882xm.mo475d();
                    if (!(u10Var instanceof q61)) {
                        u10Var = new b20(u10Var, interfaceC0180enMo475d2);
                    }
                    Object objM3018r = kd0.m3018r(interfaceC0180enMo1465i, u10Var, vt1.m5198m(interfaceC0180enMo1465i), new C0801vf(this, interfaceC0808vm, 1), abstractC0882xm);
                    if (objM3018r == enumC0513nn) {
                        return objM3018r;
                    }
                } else {
                    C0764uf c0764uf = new C0764uf(u10Var, this, interfaceC0808vm, i2);
                    x51 x51Var = new x51(abstractC0882xm, abstractC0882xm.mo475d());
                    objM4651e = t22.m4651e(x51Var, x51Var, c0764uf);
                    if (objM4651e != enumC0513nn) {
                        objM4651e = kf1Var;
                    }
                    if (objM4651e == enumC0513nn) {
                        return objM4651e;
                    }
                }
            }
        } else {
            C0764uf c0764uf2 = new C0764uf(u10Var, this, interfaceC0808vm, i2);
            x51 x51Var2 = new x51(abstractC0882xm, abstractC0882xm.mo475d());
            objM4651e = t22.m4651e(x51Var2, x51Var2, c0764uf2);
            if (objM4651e != enumC0513nn) {
                objM4651e = kf1Var;
            }
            if (objM4651e == enumC0513nn) {
                return objM4651e;
            }
        }
        return kf1Var;
    }

    public final String toString() {
        return this.f8531m + " -> " + m5323a();
    }
}
