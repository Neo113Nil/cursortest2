package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class Dn implements InterfaceC1573sn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8362a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Context f8363b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8364c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8365d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8366e;

    public Dn(Context context, U2.a aVar, C0622Jf c0622Jf, Qw qw) {
        this.f8363b = context;
        this.f8365d = aVar;
        this.f8364c = c0622Jf;
        this.f8366e = qw;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1573sn
    public final Object a(Sq sq, Lq lq, C1394on c1394on) {
        View view;
        int i = 12;
        Object obj = this.f8364c;
        Object obj2 = null;
        int i5 = 9;
        int i6 = 6;
        int i7 = 3;
        int i8 = 0;
        switch (this.f8362a) {
            case 0:
                boolean z3 = true;
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.x7)).booleanValue() && lq.f10501g0) {
                    try {
                        view = (View) BinderC2361b.t1(((C0666Qa) this.f8366e).t1());
                        C0666Qa c0666Qa = (C0666Qa) this.f8366e;
                        Parcel Y4 = c0666Qa.Y(c0666Qa.N(), 2);
                        ClassLoader classLoader = F5.f8654a;
                        if (Y4.readInt() == 0) {
                            z3 = false;
                        }
                        Y4.recycle();
                        if (view == null) {
                            throw new Yq(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                        }
                        if (z3) {
                            try {
                                view = (View) AbstractC1400ot.j0(Mw.f10750l, new C1030gh(this, view, lq, 5), AbstractC0613Id.f).get();
                            } catch (InterruptedException | ExecutionException e3) {
                                throw new Yq(e3);
                            }
                        }
                    } catch (RemoteException e5) {
                        throw new Yq(e5);
                    }
                } else {
                    view = (View) this.f8365d;
                }
                C0905dr c0905dr = new C0905dr(sq, lq, c1394on.f14848a);
                m2.g gVar = new m2.g(view, (InterfaceC0677Re) null, new C1529ro(25, c1394on), (Mq) lq.f10527u.get(0));
                C0594Ff c0594Ff = (C0594Ff) obj;
                C0594Ff c0594Ff2 = c0594Ff.f9019e;
                C0586Ef c0586Ef = new C0586Ef(c0594Ff.f9016d, c0594Ff2, c0905dr, gVar);
                ((Ti) c0586Ef.f8548O.d()).p1(view);
                ((Hn) c1394on.f14850c).v3(new BinderC1350no((Kh) c0586Ef.f8536A.d(), (Ui) c0586Ef.f8542G.d(), (Uh) c0586Ef.f8539D.d(), (Yh) c0586Ef.f8567y.d(), c0586Ef.r0(), (C1793xi) c0594Ff2.i1.d(), (C1076hi) c0586Ef.J.d(), (C0853cj) c0586Ef.K.d(), (C1658ui) c0586Ef.f8545L.d(), (Sh) c0586Ef.f8546M.d()));
                return c0586Ef.q0();
            case 1:
                C0608Hf a5 = ((C0622Jf) obj).a(new C0905dr(sq, lq, c1394on.f14848a), new C1390oj(17, new C0709Wb(26, this, c1394on), obj2));
                ((Xh) a5.f9438p.d()).m1(new C0939eg(0, (C0950er) c1394on.f14849b), (Qw) this.f8366e);
                ((Hn) c1394on.f14850c).v3(new BinderC1440po((Kh) a5.f9419E.d(), (Ui) a5.f9422H.d(), (Uh) a5.f9415A.d(), (Yh) a5.f9418D.d(), (C0763ai) a5.f9423I.d(), (C1793xi) a5.f9432j.e1.d(), (C1076hi) a5.K.d(), (C0853cj) a5.f9424L.d(), (C1658ui) a5.f9425M.d(), (Sh) a5.f9427O.d()));
                return a5.q0();
            default:
                if (!((Wq) sq.f11595a.f11722l).f12100g.contains(Integer.toString(6))) {
                    throw new C0858co("Unified must be used for RTB.", 2);
                }
                Gj S4 = Gj.S((InterfaceC0694Ua) this.f8365d);
                if (!((Wq) sq.f11595a.f11722l).f12100g.contains(Integer.toString(S4.D()))) {
                    throw new C0858co("No corresponding native ad listener", 1);
                }
                C0905dr c0905dr2 = new C0905dr(sq, lq, c1394on.f14848a);
                Mt mt = new Mt(21, S4);
                C0905dr c0905dr3 = new C0905dr((C0680Sa) null, (C0673Ra) null, (InterfaceC0694Ua) this.f8365d);
                C1880zf c1880zf = (C1880zf) obj;
                C1880zf c1880zf2 = c1880zf.f16679c;
                C1119ih c1119ih = new C1119ih(c0905dr2, 0);
                CD cd = c1880zf2.f16715v;
                C0554Af c0554Af = c1880zf.f16677b;
                O5 o5 = c0554Af.f7614C0;
                CD b3 = CD.b(new C0556Ah(cd, c1119ih, i8));
                CD b5 = CD.b(new C1388oh(b3, i));
                int i9 = KD.f10142c;
                ArrayList arrayList = new ArrayList(1);
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(c1880zf2.f16700n0);
                arrayList2.add(c1880zf2.f16702o0);
                arrayList.add(b5);
                CD b6 = CD.b(new Lh(new KD(arrayList, arrayList2), i7));
                CD b7 = CD.b(AbstractC1561sb.f15496L);
                CD b8 = CD.b(new C1701vg(b7, c0554Af.f7648c, i5));
                C1119ih c1119ih2 = new C1119ih(c0905dr2, 3);
                C1119ih c1119ih3 = new C1119ih(c0905dr2, 2);
                C1565sf c1565sf = c0554Af.f7655g;
                CD b9 = CD.b(new C1520rf(c1565sf, 13));
                CD b10 = CD.b(AbstractC1561sb.f15501Q);
                C1476qf c1476qf = c0554Af.f7635R;
                CD cd2 = c0554Af.f7689x0;
                CD cd3 = c0554Af.f7650d;
                CD b11 = CD.b(new C1387og(c1565sf, c0554Af.f7648c, cd3, c1119ih2, c1119ih, c1880zf2.f16692j0, CD.b(new C1118ig(c0554Af.f7620G, c0554Af.f7618F, c1119ih, c1119ih3, CD.b(new C1118ig(c1565sf, c1476qf, b9, b10, cd2, cd3)), c1880zf2.f16683e)), new Lj(1), new O5(29), c0554Af.f7613C, c1880zf2.f16694k0, c1880zf2.f16683e, c1880zf2.f16710s0));
                C1388oh c1388oh = new C1388oh(b11, 1);
                C1388oh c1388oh2 = new C1388oh(CD.b(new C0847cd(c1119ih, c0554Af.f7633P, 3)), 18);
                ArrayList arrayList3 = new ArrayList(4);
                ArrayList arrayList4 = new ArrayList(2);
                arrayList3.add(c1880zf2.f16704p0);
                arrayList4.add(c1880zf2.f16706q0);
                arrayList4.add(c1880zf2.f16708r0);
                arrayList3.add(b8);
                arrayList3.add(c1388oh);
                arrayList3.add(c1388oh2);
                CD b12 = CD.b(new Lh(new KD(arrayList3, arrayList4), 4));
                CD b13 = CD.b(new C1212kl(c0554Af.f7655g, c0554Af.f7687w0, c0554Af.f7688x, c1119ih2, c1119ih, c0554Af.f7617E, AbstractC1561sb.f15499O));
                CD b14 = CD.b(new C1388oh(b13, 10));
                CD b15 = CD.b(new C1701vg(b7, c0554Af.f7648c, 8));
                int i10 = 0;
                CD b16 = CD.b(new C1388oh(CD.b(new C1478qh(c0554Af.f7679s0, c1880zf2.f16681d, i10)), 8));
                C1388oh c1388oh3 = new C1388oh(b11, i10);
                ArrayList arrayList5 = new ArrayList(5);
                ArrayList arrayList6 = new ArrayList(3);
                arrayList5.add(c1880zf2.f16712t0);
                arrayList5.add(c1880zf2.f16714u0);
                arrayList6.add(c1880zf2.f16716v0);
                arrayList6.add(c1880zf2.f16718w0);
                arrayList5.add(b14);
                arrayList5.add(b15);
                arrayList6.add(b16);
                arrayList5.add(c1388oh3);
                CD b17 = CD.b(new Lh(new KD(arrayList5, arrayList6), 0));
                int i11 = 11;
                CD b18 = CD.b(new C1388oh(b13, i11));
                CD b19 = CD.b(new C1701vg(b7, c0554Af.f7648c, i11));
                CD b20 = CD.b(new C1701vg(b7, c0554Af.f7648c, 14));
                CD b21 = CD.b(JB.f9876C);
                C1032gj c1032gj = new C1032gj(b21, i6);
                ArrayList arrayList7 = new ArrayList(2);
                ArrayList arrayList8 = new ArrayList(1);
                arrayList8.add(c1880zf2.B0);
                arrayList7.add(b20);
                arrayList7.add(c1032gj);
                C1476qf c1476qf2 = new C1476qf(CD.b(new C0847cd(new KD(arrayList7, arrayList8), c1119ih, 11)), 19);
                C1388oh c1388oh4 = new C1388oh(b11, 3);
                ArrayList arrayList9 = new ArrayList(6);
                ArrayList arrayList10 = new ArrayList(2);
                arrayList9.add(c1880zf2.f16720x0);
                arrayList9.add(c1880zf2.f16722y0);
                arrayList10.add(c1880zf2.f16724z0);
                arrayList10.add(c1880zf2.f16632A0);
                arrayList9.add(b18);
                arrayList9.add(b19);
                arrayList9.add(c1476qf2);
                arrayList9.add(c1388oh4);
                CD b22 = CD.b(new Lh(new KD(arrayList9, arrayList10), 2));
                C1388oh c1388oh5 = new C1388oh(b11, 5);
                ArrayList arrayList11 = new ArrayList(1);
                ArrayList arrayList12 = new ArrayList(1);
                arrayList12.add(c1880zf2.f16635C0);
                arrayList11.add(c1388oh5);
                CD b23 = CD.b(new Lh(new KD(arrayList11, arrayList12), 18));
                C1476qf c1476qf3 = new C1476qf(CD.b(new C0556Ah(c1119ih, c0554Af.f7620G)), 29);
                ArrayList arrayList13 = new ArrayList(1);
                new ArrayList(1).add(c1880zf2.f16637D0);
                arrayList13.add(c1476qf3);
                CD b24 = CD.b(new C1701vg(b7, c0554Af.f7648c, 15));
                ArrayList arrayList14 = new ArrayList(1);
                ArrayList arrayList15 = new ArrayList(1);
                arrayList15.add(c1880zf2.E0);
                arrayList14.add(b24);
                CD b25 = CD.b(new Lh(new KD(arrayList14, arrayList15), 19));
                CD b26 = CD.b(new C1388oh(b3, 13));
                C1388oh c1388oh6 = new C1388oh(b11, 4);
                ArrayList arrayList16 = new ArrayList(6);
                ArrayList arrayList17 = new ArrayList(4);
                arrayList16.add(c1880zf2.f16640F0);
                arrayList17.add(c1880zf2.f16642G0);
                arrayList16.add(c1880zf2.f16644H0);
                arrayList16.add(c1880zf2.f16646I0);
                arrayList17.add(c1880zf2.f16647J0);
                arrayList17.add(c1880zf2.f16648K0);
                arrayList17.add(c1880zf2.f16650L0);
                arrayList16.add(c1880zf2.f16652M0);
                arrayList16.add(b26);
                arrayList16.add(c1388oh6);
                CD b27 = CD.b(new Lh(new KD(arrayList16, arrayList17), 5));
                C1388oh c1388oh7 = new C1388oh(CD.b(new C1476qf(b12, 18)), 7);
                CD b28 = CD.b(new C1701vg(b7, c0554Af.f7648c, 13));
                ArrayList arrayList18 = new ArrayList(2);
                ArrayList arrayList19 = new ArrayList(1);
                arrayList19.add(c1880zf2.f16656O0);
                arrayList18.add(c1388oh7);
                arrayList18.add(b28);
                CD b29 = CD.b(new Lh(new KD(arrayList18, arrayList19), 9));
                int i12 = 14;
                C0650Nf c0650Nf = new C0650Nf(i12, mt);
                C0847cd c0847cd = new C0847cd(new C1749wj(c0650Nf, 1), c0554Af.f7648c, i12);
                ArrayList arrayList20 = new ArrayList(1);
                ArrayList arrayList21 = new ArrayList(1);
                arrayList21.add(c1880zf2.f16658P0);
                arrayList20.add(c0847cd);
                CD b30 = CD.b(new Lh(new KD(arrayList20, arrayList21), 23));
                CD b31 = CD.b(new C1388oh(b13, 9));
                ArrayList arrayList22 = new ArrayList(1);
                List list = Collections.EMPTY_LIST;
                arrayList22.add(b31);
                CD b32 = CD.b(new Lh(new KD(arrayList22, list), 12));
                CD b33 = CD.b(new C1701vg(b7, c0554Af.f7648c, 10));
                C1388oh c1388oh8 = new C1388oh(b11, 2);
                ArrayList arrayList23 = new ArrayList(2);
                ArrayList arrayList24 = new ArrayList(1);
                arrayList24.add(c1880zf2.f16660Q0);
                arrayList23.add(b33);
                arrayList23.add(c1388oh8);
                Lh lh = new Lh(new KD(arrayList23, arrayList24), 1);
                CD b34 = CD.b(new C1388oh(b13, 6));
                ArrayList arrayList25 = new ArrayList(1);
                List list2 = Collections.EMPTY_LIST;
                arrayList25.add(b34);
                CD b35 = CD.b(new C0936ed(lh, new KD(arrayList25, list2), c0554Af.f7650d, 9));
                C1119ih c1119ih4 = new C1119ih(c0905dr2, 1);
                a3.y yVar = new a3.y(c1119ih, c1119ih4, c1880zf2.f16721y, c1119ih3, c1880zf2.f);
                ArrayList arrayList26 = new ArrayList(1);
                ArrayList arrayList27 = new ArrayList(1);
                arrayList27.add(c1880zf2.f16664S0);
                arrayList26.add(c1880zf2.f16666T0);
                a3.r rVar = new a3.r(c1119ih2, c1119ih, b6, b27, c1880zf2.f16662R0, yVar, b7, new Lh(new KD(arrayList26, arrayList27), 6), b23);
                C1032gj c1032gj2 = new C1032gj(CD.b(new C0595Fg(new C0943ek(c0905dr3, 0), new C0943ek(c0905dr3, 1), new C0943ek(c0905dr3, 2), b22, b17, b25, c1880zf2.f16715v, c1119ih, c0554Af.f7660j, c1880zf2.f16681d)), 8);
                CD b36 = CD.b(new C1791xg(c1119ih, 1));
                Lj lj = new Lj(2);
                Lj lj2 = new Lj(3);
                CD b37 = CD.b(new C0650Nf(13, new C1749wj(c0650Nf, 0)));
                Hh hh = c1880zf2.f16681d;
                C1476qf c1476qf4 = c0554Af.f7635R;
                CD cd4 = c0554Af.f7648c;
                Qj qj = new Qj(c1476qf4, hh, b36, c0650Nf, lj, lj2, cd4, b37);
                C1168jm c1168jm = new C1168jm();
                CD b38 = CD.b(new Ak(c1119ih4, c1168jm, c0650Nf, 1));
                CD b39 = CD.b(new Ak(c1119ih4, c1168jm, c0650Nf, 0));
                CD b40 = CD.b(new C0555Ag((DD) c1119ih4, (DD) c1168jm, (DD) c0650Nf, c0554Af.f7688x, 8));
                CD b41 = CD.b(new C0847cd(c1168jm, c0650Nf, 17));
                C1565sf c1565sf2 = c0554Af.f7655g;
                C1168jm.a(c1168jm, CD.b(new Dj(rVar, cd4, c0650Nf, c1032gj2, qj, b36, c1880zf2.f16655O, b38, b39, b40, b41, CD.b(new C0555Ag(c1565sf2, c0650Nf, qj, c1168jm, 7)), new C0637Lg(c1565sf2, c1880zf2.f16681d, 2), c0554Af.f7613C, c0554Af.f7660j, c1565sf2, b37, b21, c0554Af.f7626J0)));
                ((Hn) c1394on.f14850c).v3(new BinderC1350no((Kh) b17.d(), (Ui) b25.d(), (Uh) b22.d(), (Yh) b12.d(), (C0763ai) b27.d(), (C1793xi) c1880zf2.f16654N0.d(), (C1076hi) b29.d(), (C0853cj) b30.d(), (C1658ui) b32.d(), (Sh) b35.d()));
                return (Cj) c1168jm.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1573sn
    public final void b(Sq sq, Lq lq, C1394on c1394on) {
        switch (this.f8362a) {
            case 0:
                Object obj = c1394on.f14849b;
                try {
                    ((InterfaceC1427pb) obj).O2(lq.f10488Z);
                    boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.x7)).booleanValue();
                    IInterface iInterface = c1394on.f14850c;
                    Context context = this.f8363b;
                    JSONObject jSONObject = lq.f10529v;
                    if (booleanValue && lq.f10501g0) {
                        ((InterfaceC1427pb) obj).O1(lq.f10483U, jSONObject.toString(), ((Wq) sq.f11595a.f11722l).f12098d, new BinderC2361b(context), new Cn(this, c1394on), (InterfaceC0659Pa) iInterface, ((Wq) sq.f11595a.f11722l).f12099e);
                        return;
                    } else {
                        ((InterfaceC1427pb) obj).a1(lq.f10483U, jSONObject.toString(), ((Wq) sq.f11595a.f11722l).f12098d, new BinderC2361b(context), new Cn(this, c1394on), (InterfaceC0659Pa) iInterface, ((Wq) sq.f11595a.f11722l).f12099e);
                        return;
                    }
                } catch (RemoteException e3) {
                    throw new Yq(e3);
                }
            case 1:
                C0950er c0950er = (C0950er) c1394on.f14849b;
                Wq wq = (Wq) sq.f11595a.f11722l;
                String jSONObject2 = lq.f10529v.toString();
                String i02 = N4.b.i0(lq.f10523s);
                Context context2 = this.f8363b;
                InterfaceC0659Pa interfaceC0659Pa = (InterfaceC0659Pa) c1394on.f14850c;
                try {
                    c0950er.f13363a.b1(new BinderC2361b(context2), wq.f12098d, jSONObject2, i02, interfaceC0659Pa);
                    return;
                } finally {
                    Yq yq = new Yq(e3);
                }
            default:
                Object obj2 = c1394on.f14849b;
                try {
                    ((InterfaceC1427pb) obj2).O2(lq.f10488Z);
                    int i = ((U2.a) this.f8366e).f5854m;
                    int intValue = ((Integer) Q2.r.f5053d.f5056c.a(F7.f8690G1)).intValue();
                    IInterface iInterface2 = c1394on.f14850c;
                    Context context3 = this.f8363b;
                    JSONObject jSONObject3 = lq.f10529v;
                    if (i < intValue) {
                        ((InterfaceC1427pb) obj2).D1(lq.f10483U, jSONObject3.toString(), ((Wq) sq.f11595a.f11722l).f12098d, new BinderC2361b(context3), new Qn(this, c1394on), (InterfaceC0659Pa) iInterface2);
                        return;
                    } else {
                        ((InterfaceC1427pb) obj2).j3(lq.f10483U, jSONObject3.toString(), ((Wq) sq.f11595a.f11722l).f12098d, new BinderC2361b(context3), new Qn(this, c1394on), (InterfaceC0659Pa) iInterface2, ((Wq) sq.f11595a.f11722l).i);
                        return;
                    }
                } catch (RemoteException e32) {
                    throw new Yq(e32);
                }
        }
    }

    public Dn(Context context, C1880zf c1880zf, U2.a aVar) {
        this.f8363b = context;
        this.f8364c = c1880zf;
        this.f8366e = aVar;
    }

    public Dn(Context context, C0594Ff c0594Ff) {
        this.f8363b = context;
        this.f8364c = c0594Ff;
    }
}
