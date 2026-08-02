package p000;

import java.lang.reflect.Array;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gv0 extends y40 {

    /* JADX INFO: renamed from: A */
    public lj0 f2944A;

    /* JADX INFO: renamed from: B */
    public final AbstractC0875xf f2945B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ hv0 f2946C;

    /* JADX INFO: renamed from: w */
    public final AbstractC0959zp f2947w;

    /* JADX INFO: renamed from: x */
    public yu0 f2948x;

    /* JADX INFO: renamed from: y */
    public boolean f2949y;

    /* JADX INFO: renamed from: z */
    public C0511nl f2950z;

    public gv0(hv0 hv0Var, hj0 hj0Var, va0 va0Var) {
        this.f2946C = hv0Var;
        lj0 lj0Var = (lj0) hj0Var.m2273c();
        if (lj0Var != null) {
            this.f2944A = lj0Var;
            ta0 ta0Var = new ta0(1, this, lj0Var);
            hj0 hj0VarM2270d = hj0.m2270d();
            hj0VarM2270d.m2274e(hj0Var.f3222b);
            C0831w8 c0831w8 = hj0Var.f3223c;
            a90.m127k(c0831w8, "attrs");
            hj0VarM2270d.f3223c = c0831w8;
            Object[][] objArr = hj0Var.f3224d;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length, 2);
            hj0VarM2270d.f3224d = objArr2;
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            hj0VarM2270d.m2271a(ta0Var);
            this.f2947w = va0Var.mo960a(hj0VarM2270d.m2272b());
        } else {
            this.f2947w = va0Var.mo960a(hj0Var);
        }
        this.f2945B = this.f2947w.mo2658f();
    }

    @Override // p000.y40
    /* JADX INFO: renamed from: G */
    public final AbstractC0959zp mo2154G() {
        return this.f2947w;
    }

    /* JADX INFO: renamed from: H */
    public final void m2155H() {
        this.f2949y = true;
        lj0 lj0Var = this.f2944A;
        ja1 ja1Var = ja1.f3883m;
        a90.m122f("The error status must not be OK", true ^ ja1Var.m2838f());
        lj0Var.mo3228a(new C0511nl(EnumC0474ml.f5073l, ja1Var));
        this.f2945B.mo5320h(2, "Subchannel ejected: {0}", this);
    }

    @Override // p000.AbstractC0959zp
    /* JADX INFO: renamed from: e */
    public final C0831w8 mo2156e() {
        yu0 yu0Var = this.f2948x;
        AbstractC0959zp abstractC0959zp = this.f2947w;
        if (yu0Var == null) {
            return abstractC0959zp.mo2156e();
        }
        C0831w8 c0831w8Mo2156e = abstractC0959zp.mo2156e();
        c0831w8Mo2156e.getClass();
        yu0 yu0Var2 = this.f2948x;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(hv0.f3339n, yu0Var2);
        for (Map.Entry entry : c0831w8Mo2156e.f8455a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C0794v8) entry.getKey(), entry.getValue());
            }
        }
        return new C0831w8(identityHashMap);
    }

    @Override // p000.y40, p000.AbstractC0959zp
    /* JADX INFO: renamed from: s */
    public final void mo2157s() {
        yu0 yu0Var = this.f2948x;
        if (yu0Var != null) {
            this.f2948x = null;
            yu0Var.f9472f.remove(this);
        }
        super.mo2157s();
    }

    @Override // p000.y40
    public final String toString() {
        return "OutlierDetectionSubchannel{addresses=" + this.f2947w.mo2657d() + '}';
    }

    @Override // p000.AbstractC0959zp
    /* JADX INFO: renamed from: u */
    public final void mo2158u(lj0 lj0Var) {
        if (this.f2944A != null) {
            mo2154G().mo2158u(lj0Var);
            return;
        }
        this.f2944A = lj0Var;
        mo2154G().mo2158u(new ta0(1, this, lj0Var));
    }

    @Override // p000.y40, p000.AbstractC0959zp
    /* JADX INFO: renamed from: z */
    public final void mo2159z(List list) {
        hv0 hv0Var = this.f2946C;
        if (hv0.m2339g(mo2657d()) && hv0.m2339g(list)) {
            zu0 zu0Var = hv0Var.f3340f;
            if (zu0Var.f9963p.containsValue(this.f2948x)) {
                yu0 yu0Var = this.f2948x;
                yu0Var.getClass();
                this.f2948x = null;
                yu0Var.f9472f.remove(this);
            }
            SocketAddress socketAddress = (SocketAddress) ((C0190ex) list.get(0)).f2195a.get(0);
            if (hv0Var.f3340f.f9963p.containsKey(socketAddress)) {
                ((yu0) hv0Var.f3340f.f9963p.get(socketAddress)).m5834a(this);
            }
        } else if (hv0.m2339g(mo2657d()) && !hv0.m2339g(list)) {
            zu0 zu0Var2 = hv0Var.f3340f;
            if (zu0Var2.f9963p.containsKey(m5992c().f2195a.get(0))) {
                zu0 zu0Var3 = hv0Var.f3340f;
                yu0 yu0Var2 = (yu0) zu0Var3.f9963p.get(m5992c().f2195a.get(0));
                yu0Var2.getClass();
                this.f2948x = null;
                yu0Var2.f9472f.remove(this);
                f50 f50Var = yu0Var2.f9468b;
                ((AtomicLong) f50Var.f2313k).set(0L);
                ((AtomicLong) f50Var.f2314l).set(0L);
                f50 f50Var2 = yu0Var2.f9469c;
                ((AtomicLong) f50Var2.f2313k).set(0L);
                ((AtomicLong) f50Var2.f2314l).set(0L);
            }
        } else if (!hv0.m2339g(mo2657d()) && hv0.m2339g(list)) {
            SocketAddress socketAddress2 = (SocketAddress) ((C0190ex) list.get(0)).f2195a.get(0);
            if (hv0Var.f3340f.f9963p.containsKey(socketAddress2)) {
                ((yu0) hv0Var.f3340f.f9963p.get(socketAddress2)).m5834a(this);
            }
        }
        this.f2947w.mo2159z(list);
    }
}
