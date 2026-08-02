package com.google.android.gms.internal.ads;

import Q2.C0375o;
import T2.C0432j;
import a3.AbstractC0467k;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1030gh implements InterfaceC1897zw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13634b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13635c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13636d;

    public /* synthetic */ C1030gh(InterfaceC1259ln interfaceC1259ln, Lq lq, Sq sq, Oi oi, int i) {
        this.f13633a = i;
        this.f13634b = interfaceC1259ln;
        this.f13635c = lq;
        this.f13636d = sq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1897zw
    public final E3.a k(Object obj) {
        switch (this.f13633a) {
            case 0:
                AbstractC0762ah abstractC0762ah = (AbstractC0762ah) obj;
                C1075hh c1075hh = (C1075hh) this.f13634b;
                if (abstractC0762ah != null) {
                    ((C0375o) this.f13635c).mo14o(abstractC0762ah);
                }
                return AbstractC1400ot.l0((E3.a) this.f13636d, ((Long) AbstractC1550s8.f15426a.s()).longValue(), TimeUnit.MILLISECONDS, c1075hh.f13778b);
            case 1:
                String str = (String) this.f13635c;
                JSONObject jSONObject = (JSONObject) this.f13636d;
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
                C1641u9 c1641u9 = ((Kk) this.f13634b).f10223h;
                c1641u9.getClass();
                C0634Ld c0634Ld = new C0634Ld();
                T2.L l5 = P2.o.f4767B.f4771c;
                String uuid = UUID.randomUUID().toString();
                c1641u9.c(uuid, new F9(c0634Ld, 0));
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", uuid);
                    jSONObject2.put("args", jSONObject);
                    interfaceC0677Re.o(str, jSONObject2);
                } catch (Exception e3) {
                    c0634Ld.c(e3);
                }
                return c0634Ld;
            case 2:
                C1663un c1663un = (C1663un) this.f13634b;
                c1663un.getClass();
                A7 a7 = F7.f8816d2;
                Q2.r rVar = Q2.r.f5053d;
                boolean booleanValue = ((Boolean) rVar.f5056c.a(a7)).booleanValue();
                C1392ol c1392ol = c1663un.i;
                if (booleanValue) {
                    AbstractC0467k.C(P2.o.f4767B.f4776j, c1392ol.f14846c, "rendering-webview-creation-start");
                }
                Sq sq = (Sq) this.f13636d;
                C1071hd c1071hd = sq.f11596b;
                Wq wq = c1663un.f15902c;
                Lq lq = (Lq) this.f13635c;
                final InterfaceC0677Re a5 = c1663un.f15901b.a(wq.f12099e, lq, (Nq) c1071hd.f13762m);
                a5.W(lq.f10485W);
                D7 d7 = rVar.f5056c;
                if (((Boolean) d7.a(a7)).booleanValue()) {
                    AbstractC0467k.C(P2.o.f4767B.f4776j, c1392ol.f14846c, "rendering-webview-creation-end");
                }
                C0634Ld c0634Ld2 = new C0634Ld();
                C0905dr c0905dr = new C0905dr(sq, lq, (String) null);
                U2.a aVar = c1663un.f15904e;
                boolean z3 = c1663un.f15905g;
                A9 a9 = c1663un.f;
                A9 a92 = a9;
                C1390oj c1390oj = new C1390oj(17, new C1753wn(aVar, c0634Ld2, lq, a5, wq, z3, a9, c1663un.f15906h, c1663un.f15907j), a5);
                f2.m mVar = new f2.m(lq.f10490a0, 2);
                C0578Df c0578Df = c1663un.f15900a;
                C0562Bf c0562Bf = new C0562Bf(c0578Df.f8268c, c0578Df.f8271d, c0905dr, c1390oj, mVar);
                if (((Boolean) d7.a(a7)).booleanValue()) {
                    AbstractC0467k.C(P2.o.f4767B.f4776j, c1392ol.f14846c, "rendering-ad-component-creation-end");
                }
                CD cd = c0562Bf.f7834O;
                Vk vk = (Vk) cd.d();
                if (!c1663un.f15905g) {
                    a92 = null;
                }
                vk.a(a5, false, a92, c1392ol.f14846c);
                c0634Ld2.b(c0562Bf);
                final int i = 0;
                ((Uh) c0562Bf.f7823B.d()).m1(new Vh() { // from class: com.google.android.gms.internal.ads.tn
                    @Override // com.google.android.gms.internal.ads.Vh
                    public final void t() {
                        switch (i) {
                            case 0:
                                InterfaceC0677Re interfaceC0677Re2 = a5;
                                if (interfaceC0677Re2.I() != null) {
                                    interfaceC0677Re2.I().T0();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC0677Re interfaceC0677Re3 = a5;
                                if (interfaceC0677Re3.I() != null) {
                                    interfaceC0677Re3.I().T0();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC0677Re interfaceC0677Re4 = a5;
                                if (interfaceC0677Re4.I() != null) {
                                    interfaceC0677Re4.I().T0();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC0677Re interfaceC0677Re5 = a5;
                                if (interfaceC0677Re5.I() != null) {
                                    interfaceC0677Re5.I().T0();
                                    break;
                                }
                                break;
                        }
                    }
                }, AbstractC0613Id.f9544g);
                Pq pq = lq.f10523s;
                String str2 = pq.f11126a;
                if (((Boolean) d7.a(F7.T4)).booleanValue() && ((C1125in) c0562Bf.f7854z.d()).c()) {
                    str2 = AbstractC1073hf.b(str2, AbstractC1073hf.a(lq));
                }
                return AbstractC1400ot.h0(Vk.b(a5, pq.f11127b, str2, c1392ol.f14846c), new C1792xh(a5, lq, c0562Bf, 1), c1663un.f15903d);
            case 3:
                An an = (An) this.f13634b;
                an.getClass();
                A7 a72 = F7.f8816d2;
                Q2.r rVar2 = Q2.r.f5053d;
                boolean booleanValue2 = ((Boolean) rVar2.f5056c.a(a72)).booleanValue();
                C1392ol c1392ol2 = an.f7718g;
                if (booleanValue2) {
                    AbstractC0467k.C(P2.o.f4767B.f4776j, c1392ol2.f14846c, "rendering-webview-creation-start");
                }
                Lq lq2 = (Lq) this.f13636d;
                Context context = an.f7714b;
                Q2.a1 g5 = AbstractC1668us.g(context, lq2.f10527u);
                Sq sq2 = (Sq) this.f13635c;
                final InterfaceC0677Re a6 = an.f7715c.a(g5, lq2, (Nq) sq2.f11596b.f13762m);
                a6.W(lq2.f10485W);
                A7 a73 = F7.x7;
                D7 d72 = rVar2.f5056c;
                View a8 = (((Boolean) d72.a(a73)).booleanValue() && lq2.f10501g0) ? ViewTreeObserverOnScrollChangedListenerC0693Tg.a(context, a6.K(), lq2) : new Yk(context, a6.K(), (C0432j) an.f.apply(lq2));
                if (((Boolean) d72.a(a72)).booleanValue()) {
                    AbstractC0467k.C(P2.o.f4767B.f4776j, c1392ol2.f14846c, "rendering-webview-creation-end");
                }
                C0905dr c0905dr2 = new C0905dr(sq2, lq2, (String) null);
                m2.g gVar = new m2.g(a8, a6, new Qt(22, a6), g5.f4982s ? new Mq(-3, 0, true) : new Mq(g5.f4978o, g5.f4975l, false));
                C0594Ff c0594Ff = an.f7713a;
                C0586Ef c0586Ef = new C0586Ef(c0594Ff.f9016d, c0594Ff.f9019e, c0905dr2, gVar);
                if (((Boolean) d72.a(a72)).booleanValue()) {
                    AbstractC0467k.C(P2.o.f4767B.f4776j, c1392ol2.f14846c, "rendering-ad-component-creation-end");
                }
                CD cd2 = c0586Ef.f8549P;
                ((Vk) cd2.d()).a(a6, false, null, c1392ol2.f14846c);
                Uh uh = (Uh) c0586Ef.f8539D.d();
                final int i5 = 1;
                Vh vh = new Vh() { // from class: com.google.android.gms.internal.ads.tn
                    @Override // com.google.android.gms.internal.ads.Vh
                    public final void t() {
                        switch (i5) {
                            case 0:
                                InterfaceC0677Re interfaceC0677Re2 = a6;
                                if (interfaceC0677Re2.I() != null) {
                                    interfaceC0677Re2.I().T0();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC0677Re interfaceC0677Re3 = a6;
                                if (interfaceC0677Re3.I() != null) {
                                    interfaceC0677Re3.I().T0();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC0677Re interfaceC0677Re4 = a6;
                                if (interfaceC0677Re4.I() != null) {
                                    interfaceC0677Re4.I().T0();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC0677Re interfaceC0677Re5 = a6;
                                if (interfaceC0677Re5.I() != null) {
                                    interfaceC0677Re5.I().T0();
                                    break;
                                }
                                break;
                        }
                    }
                };
                C0606Hd c0606Hd = AbstractC0613Id.f9544g;
                uh.m1(vh, c0606Hd);
                Pq pq2 = lq2.f10523s;
                String str3 = pq2.f11126a;
                if (((Boolean) d72.a(F7.T4)).booleanValue() && ((C1125in) c0586Ef.f8537B.d()).c()) {
                    str3 = AbstractC1073hf.b(str3, AbstractC1073hf.a(lq2));
                }
                C0634Ld b3 = Vk.b(a6, pq2.f11127b, str3, c1392ol2.f14846c);
                Xw xw = b3.f10334k;
                boolean z5 = lq2.f10475M;
                Executor executor = an.f7717e;
                if (z5) {
                    xw.a(new RunnableC0658Og(a6, 5), executor);
                }
                xw.a(new RunnableC1081hn(2, an, a6), executor);
                return AbstractC1400ot.h0(b3, new C1383oc(2, c0586Ef), c0606Hd);
            case 4:
                return AbstractC1400ot.c0(ViewTreeObserverOnScrollChangedListenerC0693Tg.a(((C1798xn) this.f13634b).f16326b, (View) this.f13635c, (Lq) this.f13636d));
            case 5:
                return AbstractC1400ot.c0(ViewTreeObserverOnScrollChangedListenerC0693Tg.a(((Dn) this.f13634b).f8363b, (View) this.f13635c, (Lq) this.f13636d));
            case 6:
                Jn jn = (Jn) this.f13634b;
                jn.getClass();
                A7 a74 = F7.f8816d2;
                Q2.r rVar3 = Q2.r.f5053d;
                boolean booleanValue3 = ((Boolean) rVar3.f5056c.a(a74)).booleanValue();
                C1392ol c1392ol3 = jn.f10060j;
                if (booleanValue3) {
                    AbstractC0467k.C(P2.o.f4767B.f4776j, c1392ol3.f14846c, "rendering-webview-creation-start");
                }
                Sq sq3 = (Sq) this.f13636d;
                C1071hd c1071hd2 = sq3.f11596b;
                Wq wq2 = jn.f10056d;
                Lq lq3 = (Lq) this.f13635c;
                final InterfaceC0677Re a10 = jn.f10055c.a(wq2.f12099e, lq3, (Nq) c1071hd2.f13762m);
                a10.W(lq3.f10485W);
                D7 d73 = rVar3.f5056c;
                if (((Boolean) d73.a(a74)).booleanValue()) {
                    AbstractC0467k.C(P2.o.f4767B.f4776j, c1392ol3.f14846c, "rendering-webview-creation-end");
                }
                C0634Ld c0634Ld3 = new C0634Ld();
                C0905dr c0905dr3 = new C0905dr(sq3, lq3, (String) null);
                U2.a aVar2 = jn.f;
                boolean z6 = jn.f10059h;
                A9 a93 = jn.f10058g;
                C0608Hf a11 = ((C0622Jf) jn.f10062l).a(c0905dr3, new C1390oj(17, new C0802bc(jn.f10054b, aVar2, c0634Ld3, lq3, a10, wq2, z6, a93, jn.i, jn.f10061k), a10));
                c0634Ld3.b(a11);
                if (((Boolean) d73.a(a74)).booleanValue()) {
                    AbstractC0467k.C(P2.o.f4767B.f4776j, c1392ol3.f14846c, "rendering-ad-component-creation-end");
                }
                final int i6 = 2;
                ((Uh) a11.f9415A.d()).m1(new Vh() { // from class: com.google.android.gms.internal.ads.tn
                    @Override // com.google.android.gms.internal.ads.Vh
                    public final void t() {
                        switch (i6) {
                            case 0:
                                InterfaceC0677Re interfaceC0677Re2 = a10;
                                if (interfaceC0677Re2.I() != null) {
                                    interfaceC0677Re2.I().T0();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC0677Re interfaceC0677Re3 = a10;
                                if (interfaceC0677Re3.I() != null) {
                                    interfaceC0677Re3.I().T0();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC0677Re interfaceC0677Re4 = a10;
                                if (interfaceC0677Re4.I() != null) {
                                    interfaceC0677Re4.I().T0();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC0677Re interfaceC0677Re5 = a10;
                                if (interfaceC0677Re5.I() != null) {
                                    interfaceC0677Re5.I().T0();
                                    break;
                                }
                                break;
                        }
                    }
                }, AbstractC0613Id.f9544g);
                Pq pq3 = lq3.f10523s;
                String str4 = pq3.f11126a;
                if (((Boolean) d73.a(F7.T4)).booleanValue() && ((C1125in) a11.f9447y.d()).c()) {
                    str4 = AbstractC1073hf.b(str4, AbstractC1073hf.a(lq3));
                }
                CD cd3 = a11.f9429Q;
                Vk vk2 = (Vk) cd3.d();
                if (!jn.f10059h) {
                    a93 = null;
                }
                vk2.a(a10, true, a93, c1392ol3.f14846c);
                return AbstractC1400ot.h0(Vk.b(a10, pq3.f11127b, str4, c1392ol3.f14846c), new C1792xh(a10, lq3, a11, 2), jn.f10057e);
            case 7:
                JSONArray jSONArray = (JSONArray) obj;
                Pn pn = (Pn) this.f13634b;
                pn.getClass();
                if (jSONArray.length() == 0) {
                    return AbstractC1400ot.Z(new C0856cm(3));
                }
                Sq sq4 = (Sq) this.f13635c;
                Wq wq3 = (Wq) sq4.f11595a.f11722l;
                Lq lq4 = (Lq) this.f13636d;
                if (wq3.f12103k <= 1) {
                    return AbstractC1400ot.h0(pn.c(sq4, lq4, jSONArray.getJSONObject(0)), new C1364o1(9), pn.f11116b);
                }
                int length = jSONArray.length();
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8821e2)).booleanValue()) {
                    pn.f.a("nsl", String.valueOf(length));
                }
                Wq wq4 = (Wq) sq4.f11595a.f11722l;
                pn.f11118d.b(Math.min(length, wq4.f12103k));
                int i7 = wq4.f12103k;
                ArrayList arrayList = new ArrayList(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    if (i8 < length) {
                        arrayList.add(pn.c(sq4, lq4, jSONArray.getJSONObject(i8)));
                    } else {
                        arrayList.add(AbstractC1400ot.Z(new C0856cm(3)));
                    }
                }
                return AbstractC1400ot.c0(arrayList);
            default:
                Jn jn2 = (Jn) this.f13634b;
                jn2.getClass();
                A7 a75 = F7.f8816d2;
                Q2.r rVar4 = Q2.r.f5053d;
                boolean booleanValue4 = ((Boolean) rVar4.f5056c.a(a75)).booleanValue();
                C1392ol c1392ol4 = jn2.f10060j;
                if (booleanValue4) {
                    AbstractC0467k.C(P2.o.f4767B.f4776j, c1392ol4.f14846c, "rendering-webview-creation-start");
                }
                Sq sq5 = (Sq) this.f13636d;
                C1071hd c1071hd3 = sq5.f11596b;
                Wq wq5 = jn2.f10056d;
                Lq lq5 = (Lq) this.f13635c;
                final InterfaceC0677Re a12 = jn2.f10055c.a(wq5.f12099e, lq5, (Nq) c1071hd3.f13762m);
                a12.W(lq5.f10485W);
                D7 d74 = rVar4.f5056c;
                if (((Boolean) d74.a(a75)).booleanValue()) {
                    AbstractC0467k.C(P2.o.f4767B.f4776j, c1392ol4.f14846c, "rendering-webview-creation-end");
                }
                C0634Ld c0634Ld4 = new C0634Ld();
                C0905dr c0905dr4 = new C0905dr(sq5, lq5, (String) null);
                U2.a aVar3 = jn2.f;
                A9 a94 = jn2.f10058g;
                Rk rk = new Rk(new C1170jo(jn2.f10054b, jn2.f10055c, wq5, aVar3, lq5, c0634Ld4, a12, a94, jn2.f10059h, jn2.i, jn2.f10060j, jn2.f10061k), a12, 0);
                C0636Lf c0636Lf = (C0636Lf) jn2.f10062l;
                C0629Kf c0629Kf = new C0629Kf(c0636Lf.f10391c, c0636Lf.f10394d, c0905dr4, rk);
                c0634Ld4.b(c0629Kf);
                if (((Boolean) d74.a(a75)).booleanValue()) {
                    AbstractC0467k.C(P2.o.f4767B.f4776j, c1392ol4.f14846c, "rendering-ad-component-creation-end");
                }
                a12.s0("/reward", new C1417p9(4, (Zi) c0629Kf.f10183P.d()));
                final int i9 = 3;
                ((Uh) c0629Kf.f10170A.d()).m1(new Vh() { // from class: com.google.android.gms.internal.ads.tn
                    @Override // com.google.android.gms.internal.ads.Vh
                    public final void t() {
                        switch (i9) {
                            case 0:
                                InterfaceC0677Re interfaceC0677Re2 = a12;
                                if (interfaceC0677Re2.I() != null) {
                                    interfaceC0677Re2.I().T0();
                                    break;
                                }
                                break;
                            case 1:
                                InterfaceC0677Re interfaceC0677Re3 = a12;
                                if (interfaceC0677Re3.I() != null) {
                                    interfaceC0677Re3.I().T0();
                                    break;
                                }
                                break;
                            case 2:
                                InterfaceC0677Re interfaceC0677Re4 = a12;
                                if (interfaceC0677Re4.I() != null) {
                                    interfaceC0677Re4.I().T0();
                                    break;
                                }
                                break;
                            default:
                                InterfaceC0677Re interfaceC0677Re5 = a12;
                                if (interfaceC0677Re5.I() != null) {
                                    interfaceC0677Re5.I().T0();
                                    break;
                                }
                                break;
                        }
                    }
                }, AbstractC0613Id.f9544g);
                CD cd4 = c0629Kf.f10184Q;
                Vk vk3 = (Vk) cd4.d();
                if (!jn2.f10059h) {
                    a94 = null;
                }
                vk3.a(a12, true, a94, c1392ol4.f14846c);
                Pq pq4 = lq5.f10523s;
                String str5 = pq4.f11126a;
                if (((Boolean) d74.a(F7.T4)).booleanValue() && ((C1125in) c0629Kf.f10203y.d()).c()) {
                    str5 = AbstractC1073hf.b(str5, AbstractC1073hf.a(lq5));
                }
                return AbstractC1400ot.h0(Vk.b(a12, pq4.f11127b, str5, c1392ol4.f14846c), new C1792xh(a12, lq5, c0629Kf, 3), jn2.f10057e);
        }
    }

    public /* synthetic */ C1030gh(Object obj, Object obj2, Object obj3, int i) {
        this.f13633a = i;
        this.f13634b = obj;
        this.f13635c = obj2;
        this.f13636d = obj3;
    }
}
