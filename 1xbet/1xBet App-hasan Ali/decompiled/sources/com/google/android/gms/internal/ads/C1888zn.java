package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import org.json.JSONObject;
import s3.BinderC2361b;

/* renamed from: com.google.android.gms.internal.ads.zn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1888zn implements InterfaceC1573sn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16764a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16765b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16766c;

    public /* synthetic */ C1888zn(Context context, Object obj, int i) {
        this.f16764a = i;
        this.f16765b = context;
        this.f16766c = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1573sn
    public final Object a(Sq sq, Lq lq, C1394on c1394on) {
        switch (this.f16764a) {
            case 0:
                m2.g gVar = new m2.g(lq, (InterfaceC1427pb) c1394on.f14849b, J2.c.f2704q);
                C0905dr c0905dr = new C0905dr(sq, lq, c1394on.f14848a);
                C1390oj c1390oj = new C1390oj(17, gVar, (Object) null);
                f2.m mVar = new f2.m(lq.f10490a0, 2);
                C0578Df c0578Df = (C0578Df) this.f16766c;
                C0578Df c0578Df2 = c0578Df.f8271d;
                C0562Bf c0562Bf = new C0562Bf(c0578Df.f8268c, c0578Df2, c0905dr, c1390oj, mVar);
                CD cd = c0562Bf.f7823B;
                gVar.f17997o = (Uh) cd.d();
                ((Hn) c1394on.f14850c).v3(new BinderC1350no((Kh) c0562Bf.f7827F.d(), (Ui) c0562Bf.f7829H.d(), (Uh) cd.d(), (Yh) c0562Bf.f7826E.d(), (C0763ai) c0562Bf.f7830I.d(), (C1793xi) c0578Df2.f8292l1.d(), (C1076hi) c0562Bf.J.d(), (C0853cj) c0562Bf.K.d(), (C1658ui) c0562Bf.f7831L.d(), (Sh) c0562Bf.f7833N.d()));
                return c0562Bf.q0();
            case 1:
                m2.g gVar2 = new m2.g(lq, (InterfaceC1427pb) c1394on.f14849b, J2.c.f2700m);
                C0608Hf a5 = ((C0622Jf) this.f16766c).a(new C0905dr(sq, lq, c1394on.f14848a), new C1390oj(17, gVar2, (Object) null));
                CD cd2 = a5.f9415A;
                gVar2.f17997o = (Uh) cd2.d();
                ((Hn) c1394on.f14850c).v3(new BinderC1350no((Kh) a5.f9419E.d(), (Ui) a5.f9422H.d(), (Uh) cd2.d(), (Yh) a5.f9418D.d(), (C0763ai) a5.f9423I.d(), (C1793xi) a5.f9432j.e1.d(), (C1076hi) a5.K.d(), (C0853cj) a5.f9424L.d(), (C1658ui) a5.f9425M.d(), (Sh) a5.f9427O.d()));
                return a5.q0();
            default:
                m2.g gVar3 = new m2.g(lq, (InterfaceC1427pb) c1394on.f14849b, J2.c.f2701n);
                C0905dr c0905dr2 = new C0905dr(sq, lq, c1394on.f14848a);
                Rk rk = new Rk(gVar3, null, 0);
                C0636Lf c0636Lf = (C0636Lf) this.f16766c;
                C0636Lf c0636Lf2 = c0636Lf.f10394d;
                C0629Kf c0629Kf = new C0629Kf(c0636Lf.f10391c, c0636Lf2, c0905dr2, rk);
                CD cd3 = c0629Kf.f10170A;
                gVar3.f17997o = (Uh) cd3.d();
                ((Hn) c1394on.f14850c).v3(new BinderC1305mo((Kh) c0629Kf.f10174E.d(), (Ui) c0629Kf.f10176G.d(), (Uh) cd3.d(), (Yh) c0629Kf.f10173D.d(), (C0763ai) c0629Kf.f10177H.d(), (Sh) c0629Kf.f10181N.d(), (C1793xi) c0636Lf2.f10421n1.d(), (C0853cj) c0629Kf.K.d(), (C1076hi) c0629Kf.J.d(), (Zi) c0629Kf.f10183P.d(), (C1658ui) c0629Kf.f10179L.d()));
                return c0629Kf.q0();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1573sn
    public final void b(Sq sq, Lq lq, C1394on c1394on) {
        switch (this.f16764a) {
            case 0:
                Object obj = c1394on.f14849b;
                try {
                    ((InterfaceC1427pb) obj).O2(lq.f10488Z);
                    ((InterfaceC1427pb) obj).M1(lq.f10483U, lq.f10529v.toString(), ((Wq) sq.f11595a.f11722l).f12098d, new BinderC2361b(this.f16765b), new BinderC1843yn(c1394on), (InterfaceC0659Pa) c1394on.f14850c);
                    return;
                } catch (RemoteException e3) {
                    T2.G.n("Remote exception loading an app open RTB ad", e3);
                    throw new Yq(e3);
                }
            case 1:
                Object obj2 = c1394on.f14849b;
                try {
                    ((InterfaceC1427pb) obj2).O2(lq.f10488Z);
                    ((InterfaceC1427pb) obj2).g2(lq.f10483U, lq.f10529v.toString(), ((Wq) sq.f11595a.f11722l).f12098d, new BinderC2361b(this.f16765b), new Mn(c1394on), (InterfaceC0659Pa) c1394on.f14850c);
                    return;
                } catch (RemoteException e5) {
                    T2.G.n("Remote exception loading a interstitial RTB ad", e5);
                    throw new Yq(e5);
                }
            default:
                Object obj3 = c1394on.f14849b;
                try {
                    ((InterfaceC1427pb) obj3).O2(lq.f10488Z);
                    U4 u42 = sq.f11595a;
                    int i = ((Wq) u42.f11722l).f12107o.f17003l;
                    IInterface iInterface = c1394on.f14850c;
                    Context context = this.f16765b;
                    JSONObject jSONObject = lq.f10529v;
                    Wq wq = (Wq) u42.f11722l;
                    if (i == 3) {
                        ((InterfaceC1427pb) obj3).r1(lq.f10483U, jSONObject.toString(), wq.f12098d, new BinderC2361b(context), new BinderC1037go(c1394on), (InterfaceC0659Pa) iInterface);
                    } else {
                        ((InterfaceC1427pb) obj3).l2(lq.f10483U, jSONObject.toString(), wq.f12098d, new BinderC2361b(context), new BinderC1037go(c1394on), (InterfaceC0659Pa) iInterface);
                    }
                    return;
                } catch (RemoteException e6) {
                    T2.G.n("Remote exception loading a rewarded RTB ad", e6);
                    return;
                }
        }
    }
}
