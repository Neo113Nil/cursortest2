package com.google.android.gms.internal.ads;

import android.widget.FrameLayout;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.Nf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650Nf implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10798a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10799b;

    public /* synthetic */ C0650Nf(int i, Object obj) {
        this.f10798a = i;
        this.f10799b = obj;
    }

    public static G.v b() {
        return new G.v(9, new V9(21), new V9(20), false);
    }

    public Gj a() {
        Gj gj = (Gj) ((Mt) this.f10799b).f10741l;
        AbstractC1400ot.D(gj);
        return gj;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        Object obj;
        int i = 0;
        Object obj2 = this.f10799b;
        switch (this.f10798a) {
            case 0:
                return b();
            case 1:
                return new C0734Zf(i, new C1864z7(((C1520rf) obj2).f15326b.a(), false));
            case 2:
                C1071hd y5 = C1071hd.y(((C1520rf) obj2).f15326b.a());
                return new C0761ag(1, new C0709Wb(10, (C2308a) y5.f13761l, (C0892dd) ((CD) y5.f13763n).d()));
            case 3:
                return (FrameLayout) ((Mt) obj2).f10741l;
            case 4:
                return ((C0595Fg) obj2).a();
            case 5:
                C0936ed c0936ed = (C0936ed) obj2;
                return new Si(new C0644Mg((InterfaceC0677Re) ((C0616Ig) c0936ed.f13314b).f9589b.f17997o, (C1482ql) ((CD) c0936ed.f13315c).d(), ((C1119ih) c0936ed.f13316d).a()), AbstractC0613Id.f9539a);
            case 6:
                C0847cd c0847cd = (C0847cd) obj2;
                C0672Qg c0672Qg = new C0672Qg((InterfaceC0677Re) ((C0616Ig) c0847cd.f13003b).f9589b.f17997o, (Executor) ((CD) c0847cd.f13004c).d());
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.gc)).booleanValue()) {
                    Si si = new Si(c0672Qg, AbstractC0613Id.f9539a);
                    int i5 = AbstractC1177jv.f14189m;
                    obj = new Jv(si);
                } else {
                    int i6 = AbstractC1177jv.f14189m;
                    obj = Dv.f8414t;
                }
                AbstractC1400ot.D(obj);
                return obj;
            case 7:
                return new Si(new C0609Hg(i, (C1344ni) ((C0721Xg) obj2).f12206b.f12040l), AbstractC0613Id.f9544g);
            case 8:
                C0637Lg c0637Lg = (C0637Lg) obj2;
                return new C0728Yg(new C1116id(c0637Lg.f10452b.a(), c0637Lg.f10453c.a().f));
            case 9:
                return new C0851ch(((FD) obj2).d());
            case 10:
                return ((C1701vg) obj2).a();
            case 11:
                Kj kj = (Kj) ((C1435pj) obj2).f15020b.f14827l;
                AbstractC1400ot.D(kj);
                Set singleton = kj.f10214d != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
                AbstractC1400ot.D(singleton);
                return singleton;
            case 12:
                Hj hj = (Hj) ((C1032gj) obj2).f13638b.d();
                AbstractC1400ot.D(hj);
                JSONObject jSONObject = hj.f9455b;
                if (jSONObject != null) {
                    return jSONObject;
                }
                try {
                    return new JSONObject(hj.f9599a.f10537z);
                } catch (JSONException unused) {
                    return null;
                }
            case 13:
                BinderC1704vj binderC1704vj = new BinderC1704vj(((C1749wj) obj2).f16143b.a());
                Ej ej = new Ej();
                ej.f8579a = binderC1704vj;
                return ej;
            case 14:
                Gj gj = (Gj) ((Mt) obj2).f10741l;
                AbstractC1400ot.D(gj);
                return gj;
            case 15:
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                return new C1390oj(20, c0606Hd, ((C1436pk) obj2).d());
            case 16:
                return new C0939eg(1, (InterfaceC0677Re) ((DD) obj2).d());
            case 17:
                return new Si(new C0939eg(1, (InterfaceC0677Re) ((DD) ((C0650Nf) obj2).f10799b).d()), AbstractC0613Id.f);
            case 18:
                C0606Hd c0606Hd2 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd2);
                C0847cd c0847cd2 = (C0847cd) obj2;
                Set singleton2 = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8714K4)).booleanValue() ? Collections.singleton(new Si(new C1123il((C1773x6) ((CD) c0847cd2.f13003b).d(), ((FD) c0847cd2.f13004c).d()), c0606Hd2)) : Collections.EMPTY_SET;
                AbstractC1400ot.D(singleton2);
                return singleton2;
            case 19:
                C1655uf c1655uf = (C1655uf) obj2;
                C1662um c1662um = new C1662um(c1655uf.f15875b.a(), (C1204kd) c1655uf.f15876c.d());
                C0606Hd c0606Hd3 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd3);
                return new Si(c1662um, c0606Hd3);
            case 20:
                return new Mt(26, ((C1655uf) obj2).a());
            case C1639u7.zzm /* 21 */:
                C0847cd c0847cd3 = (C0847cd) obj2;
                Qm qm = (Qm) ((CD) c0847cd3.f13003b).d();
                C0847cd c0847cd4 = (C0847cd) c0847cd3.f13004c;
                C1123il c1123il = new C1123il(qm, new Rm(((C0847cd) c0847cd4.f13003b).b(), ((C1476qf) c0847cd4.f13004c).a()));
                C0606Hd c0606Hd4 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd4);
                return new Si(c1123il, c0606Hd4);
            case 22:
                return new Mo(5, ((Hh) obj2).f9452b.f9208c);
            default:
                AbstractC1400ot.D(AbstractC0613Id.f9539a);
                AbstractC1400ot.D(((C1428pc) ((Zp) obj2).f12528b.f834m).f14998n);
                return new Yp();
        }
    }
}
