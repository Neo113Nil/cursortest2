package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: gp */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0257gp extends xb1 implements v60 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f2836n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f2837o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f2838p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0257gp(Object obj, InterfaceC0808vm interfaceC0808vm, int i) {
        super(2, interfaceC0808vm);
        this.f2836n = i;
        this.f2838p = obj;
    }

    @Override // p000.v60
    /* JADX INFO: renamed from: g */
    public final Object mo1490g(Object obj, Object obj2) {
        int i = this.f2836n;
        kf1 kf1Var = kf1.f4365a;
        switch (i) {
            case 0:
                return ((C0257gp) mo1491k((InterfaceC0808vm) obj2, (aa1) obj)).mo17m(kf1Var);
            case 1:
                ((C0257gp) mo1491k((InterfaceC0808vm) obj2, (zq0) obj)).mo17m(kf1Var);
                return kf1Var;
            case 2:
                ((C0257gp) mo1491k((InterfaceC0808vm) obj2, (InterfaceC0476mn) obj)).mo17m(kf1Var);
                throw null;
            default:
                return ((C0257gp) mo1491k((InterfaceC0808vm) obj2, (zq0) obj)).mo17m(kf1Var);
        }
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: k */
    public final InterfaceC0808vm mo1491k(InterfaceC0808vm interfaceC0808vm, Object obj) {
        int i = this.f2836n;
        Object obj2 = this.f2838p;
        switch (i) {
            case 0:
                C0257gp c0257gp = new C0257gp((aa1) obj2, interfaceC0808vm, 0);
                c0257gp.f2837o = obj;
                return c0257gp;
            case 1:
                C0257gp c0257gp2 = new C0257gp((h60) obj2, interfaceC0808vm, 1);
                c0257gp2.f2837o = obj;
                return c0257gp2;
            case 2:
                C0257gp c0257gp3 = new C0257gp((gn0) obj2, interfaceC0808vm, 2);
                c0257gp3.f2837o = obj;
                return c0257gp3;
            default:
                C0257gp c0257gp4 = new C0257gp((Set) obj2, interfaceC0808vm, 3);
                c0257gp4.f2837o = obj;
                return c0257gp4;
        }
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) {
        int i = this.f2836n;
        boolean z = true;
        Object obj2 = this.f2838p;
        switch (i) {
            case 0:
                wo1.m5395v(obj);
                aa1 aa1Var = (aa1) this.f2837o;
                return Boolean.valueOf((aa1Var instanceof C0329io) && aa1Var.f115a <= ((aa1) obj2).f115a);
            case 1:
                wo1.m5395v(obj);
                ((h60) obj2).mo170i((zq0) this.f2837o);
                return kf1.f4365a;
            case 2:
                wo1.m5395v(obj);
                throw null;
            default:
                wo1.m5395v(obj);
                Set setKeySet = ((zq0) this.f2837o).m6022a().keySet();
                ArrayList arrayList = new ArrayList(AbstractC0545oi.m3692r(setKeySet));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((rw0) it.next()).f6986a);
                }
                Set set = (Set) obj2;
                if (set != l71.f4705a) {
                    if (set == null || !set.isEmpty()) {
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList.contains((String) it2.next())) {
                            }
                        }
                        z = false;
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
