package p000;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: eq */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0183eq {

    /* JADX INFO: renamed from: a */
    public final Class f2160a;

    /* JADX INFO: renamed from: b */
    public final List f2161b;

    /* JADX INFO: renamed from: c */
    public final h21 f2162c;

    /* JADX INFO: renamed from: d */
    public final kw0 f2163d;

    /* JADX INFO: renamed from: e */
    public final String f2164e;

    public C0183eq(Class cls, Class cls2, Class cls3, List list, h21 h21Var, kw0 kw0Var) {
        this.f2160a = cls;
        this.f2161b = list;
        this.f2162c = h21Var;
        this.f2163d = kw0Var;
        this.f2164e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX INFO: renamed from: a */
    public final v11 m1492a(int i, int i2, C0678s3 c0678s3, InterfaceC0847wo interfaceC0847wo, uu0 uu0Var) {
        v11 v11VarMo1139a;
        ie1 ie1Var;
        int iMo584l;
        b21 b21VarM5620b;
        v11 v11Var;
        boolean z;
        boolean z2;
        Object c0403ko;
        String str;
        kw0 kw0Var = this.f2163d;
        List list = (List) kw0Var.mo1367b();
        o80.m3647h(list, "Argument must not be null");
        try {
            v11 v11VarM1493b = m1493b(interfaceC0847wo, i, i2, uu0Var, list);
            kw0Var.mo1366a(list);
            RunnableC0146dq runnableC0146dq = (RunnableC0146dq) c0678s3.f7022k;
            int i3 = c0678s3.f7021j;
            C0071bq c0071bq = runnableC0146dq.f1776j;
            Class<?> cls = v11VarM1493b.get().getClass();
            if (i3 != 4) {
                ie1 ie1VarM744e = c0071bq.m744e(cls);
                ie1Var = ie1VarM744e;
                v11VarMo1139a = ie1VarM744e.mo1139a(runnableC0146dq.f1783q, v11VarM1493b, runnableC0146dq.f1787u, runnableC0146dq.f1788v);
            } else {
                v11VarMo1139a = v11VarM1493b;
                ie1Var = null;
            }
            if (!v11VarM1493b.equals(v11VarMo1139a)) {
                v11VarM1493b.mo269e();
            }
            if (c0071bq.f944c.m4041a().f5952d.m5620b(v11VarMo1139a.mo268d()) != null) {
                b21VarM5620b = c0071bq.f944c.m4041a().f5952d.m5620b(v11VarMo1139a.mo268d());
                if (b21VarM5620b == null) {
                    throw new o01(v11VarMo1139a.mo268d());
                }
                iMo584l = b21VarM5620b.mo584l(runnableC0146dq.f1790x);
            } else {
                iMo584l = 3;
                b21VarM5620b = null;
            }
            xg0 xg0Var = runnableC0146dq.f1765F;
            ArrayList arrayListM741b = c0071bq.m741b();
            int size = arrayListM741b.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    v11Var = null;
                    z = false;
                    break;
                }
                v11Var = null;
                if (((gq0) arrayListM741b.get(i4)).f2846a.equals(xg0Var)) {
                    z = true;
                    break;
                }
                i4++;
            }
            switch (runnableC0146dq.f1789w.f4091a) {
                default:
                    if (((!z && i3 == 3) || i3 == 1) && iMo584l == 2) {
                        z2 = true;
                        break;
                    }
                case 0:
                case 1:
                    z2 = false;
                    break;
            }
            if (z2) {
                if (b21VarM5620b == null) {
                    throw new o01(v11VarMo1139a.get().getClass());
                }
                int iM292o = AbstractC0024an.m292o(iMo584l);
                if (iM292o == 0) {
                    c0403ko = new C0403ko(runnableC0146dq.f1765F, runnableC0146dq.f1784r);
                } else {
                    if (iM292o != 1) {
                        if (iMo584l == 1) {
                            str = "SOURCE";
                        } else if (iMo584l != 2) {
                            str = iMo584l != 3 ? "null" : "NONE";
                        } else {
                            str = "TRANSFORMED";
                        }
                        C0270h1.m2190f("Unknown strategy: ".concat(str));
                        return v11Var;
                    }
                    c0403ko = new x11(c0071bq.f944c.f6405a, runnableC0146dq.f1765F, runnableC0146dq.f1784r, runnableC0146dq.f1787u, runnableC0146dq.f1788v, ie1Var, cls, runnableC0146dq.f1790x);
                }
                ak0 ak0Var = (ak0) ak0.f223n.mo1367b();
                ak0Var.f227m = false;
                ak0Var.f226l = true;
                ak0Var.f225k = v11VarMo1139a;
                qd0 qd0Var = runnableC0146dq.f1781o;
                qd0Var.f6471k = c0403ko;
                qd0Var.f6472l = b21VarM5620b;
                qd0Var.f6473m = ak0Var;
                v11VarMo1139a = ak0Var;
            }
            return this.f2162c.mo1764o(v11VarMo1139a, uu0Var);
        } catch (Throwable th) {
            kw0Var.mo1366a(list);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final v11 m1493b(InterfaceC0847wo interfaceC0847wo, int i, int i2, uu0 uu0Var, List list) throws t80 {
        List list2 = this.f2161b;
        int size = list2.size();
        v11 v11VarMo18a = null;
        for (int i3 = 0; i3 < size; i3++) {
            y11 y11Var = (y11) list2.get(i3);
            try {
                if (y11Var.mo19b(interfaceC0847wo.mo617m(), uu0Var)) {
                    v11VarMo18a = y11Var.mo18a(interfaceC0847wo.mo617m(), i, i2, uu0Var);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + y11Var, e);
                }
                list.add(e);
            }
            if (v11VarMo18a != null) {
                break;
            }
        }
        if (v11VarMo18a != null) {
            return v11VarMo18a;
        }
        throw new t80(this.f2164e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f2160a + ", decoders=" + this.f2161b + ", transcoder=" + this.f2162c + '}';
    }
}
