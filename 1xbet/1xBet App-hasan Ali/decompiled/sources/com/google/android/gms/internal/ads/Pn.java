package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Pn implements InterfaceC1259ln {

    /* renamed from: a, reason: collision with root package name */
    public final C1880zf f11115a;

    /* renamed from: b, reason: collision with root package name */
    public final C0606Hd f11116b;

    /* renamed from: c, reason: collision with root package name */
    public final C0905dr f11117c;

    /* renamed from: d, reason: collision with root package name */
    public final C0995fr f11118d;

    /* renamed from: e, reason: collision with root package name */
    public final Nk f11119e;
    public final C1392ol f;

    public Pn(C1880zf c1880zf, C0606Hd c0606Hd, C0905dr c0905dr, C0995fr c0995fr, Nk nk, C1392ol c1392ol) {
        this.f11115a = c1880zf;
        this.f11116b = c0606Hd;
        this.f11117c = c0905dr;
        this.f11118d = c0995fr;
        this.f11119e = nk;
        this.f = c1392ol;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final boolean a(Sq sq, Lq lq) {
        Pq pq = lq.f10523s;
        return (pq == null || pq.f11128c == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1259ln
    public final E3.a b(Sq sq, Lq lq) {
        E3.a a5 = this.f11118d.a();
        C0565Ca c0565Ca = new C0565Ca(10, this, lq);
        C0606Hd c0606Hd = this.f11116b;
        return AbstractC1400ot.j0(AbstractC1400ot.j0(a5, c0565Ca, c0606Hd), new C1030gh(this, sq, lq, 7), c0606Hd);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Dw c(final Sq sq, final Lq lq, final JSONObject jSONObject) {
        E3.a aVar;
        E3.a aVar2;
        D7 d7;
        C0606Hd c0606Hd;
        C1391ok c1391ok;
        String str;
        B8 b8;
        E3.a aVar3;
        int i;
        E3.a aVar4;
        Q2.a1 a1Var;
        JSONObject optJSONObject;
        E3.a j02;
        JSONObject optJSONObject2;
        E3.a aVar5;
        E3.a aVar6;
        E3.a c5;
        final E3.a aVar7;
        int i5;
        E3.a c02;
        JSONArray optJSONArray;
        Qw qw;
        boolean z3;
        E3.a h02;
        JSONArray jSONArray;
        E3.a aVar8;
        E3.a j03;
        Optional ofNullable;
        Optional map;
        Optional map2;
        Optional map3;
        Object orElse;
        C1537rw j04;
        Mw mw;
        Lq lq2 = lq;
        int i6 = 1;
        A7 a7 = F7.f8816d2;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            AbstractC0467k.C(P2.o.f4767B.f4776j, this.f.f14846c, "rendering-webview-creation-start");
        }
        final E3.a a5 = this.f11118d.a();
        C0905dr c0905dr = this.f11117c;
        CallableC0564Bh callableC0564Bh = new CallableC0564Bh(sq, lq2, jSONObject, i6);
        C0606Hd c0606Hd2 = (C0606Hd) c0905dr.f13186l;
        E3.a d5 = c0606Hd2.d(callableC0564Bh);
        C1391ok c1391ok2 = (C1391ok) c0905dr.f13187m;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("images");
        B8 b82 = c1391ok2.f14835h;
        E3.a b3 = c1391ok2.b(optJSONArray2, b82.f7771l, b82.f7773n);
        C1071hd c1071hd = sq.f11596b;
        A7 a72 = F7.D9;
        D7 d72 = rVar.f5056c;
        if (((Boolean) d72.a(a72)).booleanValue()) {
            JSONArray optJSONArray3 = jSONObject.optJSONArray("images");
            if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
                aVar = b3;
                aVar2 = d5;
                d7 = d72;
                c0606Hd = c0606Hd2;
                c1391ok = c1391ok2;
                str = "images";
                b8 = b82;
                aVar3 = Mw.f10750l;
            } else {
                JSONObject optJSONObject3 = optJSONArray3.optJSONObject(0);
                if (optJSONObject3 == null) {
                    aVar3 = Mw.f10750l;
                } else {
                    String optString = optJSONObject3.optString("base_url");
                    String optString2 = optJSONObject3.optString("html");
                    int optInt = optJSONObject3.optInt("width", 0);
                    int optInt2 = optJSONObject3.optInt("height", 0);
                    if (optInt != 0) {
                        i = optInt;
                    } else if (optInt2 != 0) {
                        i = 0;
                    } else {
                        a1Var = Q2.a1.b();
                        aVar4 = d5;
                        if (TextUtils.isEmpty(optString2)) {
                            c1391ok = c1391ok2;
                            str = "images";
                            aVar2 = aVar4;
                            aVar = b3;
                            d7 = d72;
                            Q2.a1 a1Var2 = a1Var;
                            b8 = b82;
                            c0606Hd = c0606Hd2;
                            lq2 = lq;
                            C1537rw j05 = AbstractC1400ot.j0(Mw.f10750l, new C1346nk(c1391ok, a1Var2, lq, (Nq) c1071hd.f13762m, optString, optString2, 0), AbstractC0613Id.f);
                            aVar3 = AbstractC1400ot.j0(j05, new C1301mk(j05, 1), AbstractC0613Id.f9544g);
                        } else {
                            aVar3 = Mw.f10750l;
                            lq2 = lq;
                            c0606Hd = c0606Hd2;
                            c1391ok = c1391ok2;
                            str = "images";
                            b8 = b82;
                            aVar2 = aVar4;
                            aVar = b3;
                            d7 = d72;
                        }
                    }
                    aVar4 = d5;
                    a1Var = new Q2.a1(c1391ok2.f14829a, new J2.i(i, optInt2));
                    if (TextUtils.isEmpty(optString2)) {
                    }
                }
            }
            final E3.a a6 = c1391ok.a(jSONObject.optJSONObject("secondary_image"), b8.f7771l);
            E3.a a8 = c1391ok.a(jSONObject.optJSONObject("app_icon"), b8.f7771l);
            optJSONObject = jSONObject.optJSONObject("attribution");
            if (optJSONObject != null) {
                j02 = Mw.f10750l;
            } else {
                JSONArray optJSONArray4 = optJSONObject.optJSONArray(str);
                JSONObject optJSONObject4 = optJSONObject.optJSONObject("image");
                if (optJSONArray4 == null && optJSONObject4 != null) {
                    optJSONArray4 = new JSONArray();
                    optJSONArray4.put(optJSONObject4);
                }
                C1582sw h03 = AbstractC1400ot.h0(c1391ok.b(optJSONArray4, false, true), new C0557Ba(1, c1391ok, optJSONObject), c1391ok.f14834g);
                j02 = optJSONObject.optBoolean("require") ? AbstractC1400ot.j0(h03, new N9(5, h03), AbstractC0613Id.f9544g) : AbstractC1400ot.X(h03, Exception.class, new C0727Yf(1), AbstractC0613Id.f9544g);
            }
            C1071hd c1071hd2 = sq.f11596b;
            String[] strArr = {"html_containers", "instream"};
            JSONObject j06 = N4.b.j0(jSONObject, strArr);
            optJSONObject2 = j06 != null ? null : j06.optJSONObject(strArr[1]);
            Nq nq = (Nq) c1071hd2.f13762m;
            if (optJSONObject2 != null) {
                JSONObject optJSONObject5 = jSONObject.optJSONObject("video");
                if (optJSONObject5 == null) {
                    mw = Mw.f10750l;
                } else {
                    String optString3 = optJSONObject5.optString("vast_xml");
                    boolean z5 = ((Boolean) d7.a(F7.C9)).booleanValue() && optJSONObject5.has("html");
                    if (TextUtils.isEmpty(optString3)) {
                        if (!z5) {
                            U2.j.i("Required field 'vast_xml' or 'html' is missing");
                            mw = Mw.f10750l;
                        }
                    } else if (!z5) {
                        C1750wk c1750wk = c1391ok.i;
                        c1750wk.getClass();
                        Mw mw2 = Mw.f10750l;
                        aVar5 = j02;
                        N9 n9 = new N9(6, c1750wk);
                        Executor executor = c1750wk.f16145b;
                        aVar6 = a8;
                        j04 = AbstractC1400ot.j0(AbstractC1400ot.j0(mw2, n9, executor), new C0565Ca(5, c1750wk, optJSONObject5), executor);
                        c5 = AbstractC1400ot.X(AbstractC1400ot.l0(j04, ((Integer) d7.a(F7.f8709J3)).intValue(), TimeUnit.SECONDS, c1391ok.f14837k), Exception.class, new C0727Yf(1), AbstractC0613Id.f9544g);
                    }
                    aVar5 = j02;
                    aVar6 = a8;
                    j04 = c1391ok.c(optJSONObject5, lq2, nq);
                    c5 = AbstractC1400ot.X(AbstractC1400ot.l0(j04, ((Integer) d7.a(F7.f8709J3)).intValue(), TimeUnit.SECONDS, c1391ok.f14837k), Exception.class, new C0727Yf(1), AbstractC0613Id.f9544g);
                }
                aVar5 = j02;
                aVar7 = mw;
                aVar6 = a8;
                if (((Boolean) d7.a(F7.zc)).booleanValue()) {
                    ofNullable = Optional.ofNullable(jSONObject.optJSONObject("video"));
                    map = ofNullable.map(new C1078hk(0));
                    map2 = map.map(new C1078hk(1));
                    map3 = map2.map(new C1078hk(2));
                    orElse = map3.orElse(0);
                    if (((Integer) orElse).intValue() == 3) {
                        c02 = new C0634Ld();
                        i5 = 0;
                        aVar7.a(new Kw(i5, aVar7, new Mt(22, c02)), AbstractC0613Id.f);
                        C1390oj c1390oj = (C1390oj) c0905dr.f13188n;
                        optJSONArray = jSONObject.optJSONArray("custom_assets");
                        if (optJSONArray != null) {
                            h02 = AbstractC1400ot.c0(Collections.EMPTY_LIST);
                            z3 = true;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            int length = optJSONArray.length();
                            int i7 = i5;
                            while (true) {
                                qw = (Qw) c1390oj.f14827l;
                                if (i7 >= length) {
                                    break;
                                }
                                JSONObject optJSONObject6 = optJSONArray.optJSONObject(i7);
                                if (optJSONObject6 == null) {
                                    aVar8 = Mw.f10750l;
                                } else {
                                    String optString4 = optJSONObject6.optString("name");
                                    if (optString4 == null) {
                                        aVar8 = Mw.f10750l;
                                    } else {
                                        String optString5 = optJSONObject6.optString("type");
                                        jSONArray = optJSONArray;
                                        if ("string".equals(optString5)) {
                                            aVar8 = AbstractC1400ot.c0(new C1481qk(optString4, optJSONObject6.optString("string_value")));
                                        } else if ("image".equals(optString5)) {
                                            C1391ok c1391ok3 = (C1391ok) c1390oj.f14828m;
                                            aVar8 = AbstractC1400ot.h0(c1391ok3.a(optJSONObject6.optJSONObject("image_value"), c1391ok3.f14835h.f7771l), new C1596t9(optString4, 2), qw);
                                        } else {
                                            aVar8 = Mw.f10750l;
                                        }
                                        arrayList.add(aVar8);
                                        i7++;
                                        optJSONArray = jSONArray;
                                    }
                                }
                                jSONArray = optJSONArray;
                                arrayList.add(aVar8);
                                i7++;
                                optJSONArray = jSONArray;
                            }
                            z3 = true;
                            h02 = AbstractC1400ot.h0(new Aw(AbstractC1044gv.l(arrayList), true), new C1364o1(8), qw);
                        }
                        if (jSONObject.optBoolean("enable_omid")) {
                            j03 = Mw.f10750l;
                        } else {
                            JSONObject optJSONObject7 = jSONObject.optJSONObject("omid_settings");
                            if (optJSONObject7 == null) {
                                j03 = Mw.f10750l;
                            } else {
                                String optString6 = optJSONObject7.optString("omid_html");
                                j03 = TextUtils.isEmpty(optString6) ? Mw.f10750l : AbstractC1400ot.j0(Mw.f10750l, new C0565Ca(c1391ok, optString6), AbstractC0613Id.f);
                            }
                        }
                        final E3.a aVar9 = j03;
                        ArrayList arrayList2 = new ArrayList();
                        final E3.a aVar10 = aVar2;
                        arrayList2.add(aVar10);
                        final E3.a aVar11 = aVar;
                        arrayList2.add(aVar11);
                        arrayList2.add(aVar3);
                        arrayList2.add(a6);
                        final E3.a aVar12 = aVar6;
                        arrayList2.add(aVar12);
                        final E3.a aVar13 = aVar5;
                        arrayList2.add(aVar13);
                        arrayList2.add(aVar7);
                        arrayList2.add(c02);
                        arrayList2.add(h02);
                        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Z4)).booleanValue() || jSONObject.optInt("template_id") == 3) {
                            arrayList2.add(aVar9);
                        }
                        AbstractC1044gv l5 = AbstractC1044gv.l(arrayList2);
                        final E3.a aVar14 = c02;
                        boolean z6 = z3;
                        final E3.a aVar15 = aVar3;
                        final E3.a aVar16 = h02;
                        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.ik
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                AbstractC1044gv abstractC1044gv;
                                JSONObject optJSONObject8;
                                E3.a aVar17 = E3.a.this;
                                E3.a aVar18 = aVar11;
                                E3.a aVar19 = aVar12;
                                E3.a aVar20 = a6;
                                E3.a aVar21 = aVar13;
                                JSONObject jSONObject2 = jSONObject;
                                E3.a aVar22 = aVar7;
                                E3.a aVar23 = aVar14;
                                E3.a aVar24 = aVar15;
                                E3.a aVar25 = aVar9;
                                E3.a aVar26 = aVar16;
                                Gj gj = (Gj) aVar17.get();
                                List list = (List) aVar18.get();
                                synchronized (gj) {
                                    gj.f9230e = list;
                                }
                                gj.k((I8) aVar19.get());
                                gj.n((I8) aVar20.get());
                                gj.h((E8) aVar21.get());
                                JSONObject optJSONObject9 = jSONObject2.optJSONObject("mute");
                                if (optJSONObject9 == null) {
                                    C0954ev c0954ev = AbstractC1044gv.f13676l;
                                    abstractC1044gv = C1761wv.f16184o;
                                } else {
                                    JSONArray optJSONArray5 = optJSONObject9.optJSONArray("reasons");
                                    if (optJSONArray5 == null || optJSONArray5.length() <= 0) {
                                        C0954ev c0954ev2 = AbstractC1044gv.f13676l;
                                        abstractC1044gv = C1761wv.f16184o;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i8 = 0; i8 < optJSONArray5.length(); i8++) {
                                            Q2.H0 e3 = C1391ok.e(optJSONArray5.optJSONObject(i8));
                                            if (e3 != null) {
                                                arrayList3.add(e3);
                                            }
                                        }
                                        abstractC1044gv = AbstractC1044gv.l(arrayList3);
                                    }
                                }
                                gj.o(abstractC1044gv);
                                JSONObject optJSONObject10 = jSONObject2.optJSONObject("mute");
                                gj.j((optJSONObject10 == null || (optJSONObject8 = optJSONObject10.optJSONObject("default_reason")) == null) ? null : C1391ok.e(optJSONObject8));
                                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) aVar22.get();
                                if (interfaceC0677Re != null) {
                                    gj.y(interfaceC0677Re);
                                    gj.x(interfaceC0677Re.K());
                                    gj.w(interfaceC0677Re.s());
                                }
                                gj.E().putAll((Bundle) aVar23.get());
                                InterfaceC0677Re interfaceC0677Re2 = (InterfaceC0677Re) aVar24.get();
                                if (interfaceC0677Re2 != null) {
                                    gj.m(interfaceC0677Re2);
                                    gj.z(interfaceC0677Re2.K());
                                }
                                if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.Z4)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                                    InterfaceC0677Re interfaceC0677Re3 = (InterfaceC0677Re) aVar25.get();
                                    if (interfaceC0677Re3 != null) {
                                        gj.p(interfaceC0677Re3);
                                    }
                                } else {
                                    gj.q(aVar25);
                                    gj.s(new C0634Ld());
                                }
                                for (C1481qk c1481qk : (List) aVar26.get()) {
                                    if (c1481qk.f15161a != 1) {
                                        gj.l(c1481qk.f15162b, c1481qk.f15164d);
                                    } else {
                                        gj.u(c1481qk.f15162b, c1481qk.f15163c);
                                    }
                                }
                                return gj;
                            }
                        };
                        final Dw dw = new Dw(l5, false, false);
                        dw.f8420z = new Cw(dw, callable, c0606Hd);
                        dw.w();
                        E3.a[] aVarArr = new E3.a[2];
                        aVarArr[0] = a5;
                        aVarArr[z6 ? 1 : 0] = dw;
                        C1761wv m5 = AbstractC1044gv.m(aVarArr);
                        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.ads.On
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Pn pn;
                                final int i8;
                                int i9 = 13;
                                int i10 = 0;
                                Pn pn2 = Pn.this;
                                Dw dw2 = dw;
                                E3.a aVar17 = a5;
                                Sq sq2 = sq;
                                Lq lq3 = lq;
                                JSONObject jSONObject2 = jSONObject;
                                pn2.getClass();
                                Gj gj = (Gj) dw2.get();
                                Kk kk = (Kk) aVar17.get();
                                A7 a73 = F7.f8816d2;
                                Q2.r rVar2 = Q2.r.f5053d;
                                if (((Boolean) rVar2.f5056c.a(a73)).booleanValue()) {
                                    AbstractC0467k.C(P2.o.f4767B.f4776j, pn2.f.f14846c, "rendering-webview-creation-end");
                                }
                                C1880zf c1880zf = pn2.f11115a;
                                C0905dr c0905dr2 = new C0905dr(sq2, lq3, (String) null);
                                Mt mt = new Mt(21, gj);
                                C0709Wb c0709Wb = new C0709Wb(17, jSONObject2, kk);
                                C1880zf c1880zf2 = c1880zf.f16679c;
                                C0554Af c0554Af = c1880zf.f16677b;
                                CD b5 = CD.b(new C1476qf(c0554Af.f7616D0, 12));
                                C1119ih c1119ih = new C1119ih(c0905dr2, 0);
                                C1614tj c1614tj = new C1614tj(c0709Wb, i10);
                                C1032gj c1032gj = new C1032gj(CD.b(new C0847cd(c1119ih, c1614tj, i9)), 3);
                                CD b6 = CD.b(new C0650Nf(12, c1032gj));
                                C1745wf c1745wf = c0554Af.f7660j;
                                O5 o5 = AbstractC1561sb.f15499O;
                                CD b7 = CD.b(new C0936ed(c1745wf, b6, o5, 1));
                                CD b9 = CD.b(new a3.y(b5, CD.b(new C1655uf(c0554Af.f7655g, b7, 2)), c0554Af.f7648c, CD.b(new C1701vg(b7, b5, 0)), c0554Af.f));
                                CD b10 = CD.b(new C1701vg(b9, b6, 2));
                                CD b11 = CD.b(new C0556Ah(c1880zf2.f16715v, c1119ih, 0));
                                CD b12 = CD.b(new C1388oh(b11, 12));
                                int i11 = KD.f10142c;
                                ArrayList arrayList3 = new ArrayList(1);
                                ArrayList arrayList4 = new ArrayList(3);
                                arrayList4.add(c1880zf2.f16700n0);
                                arrayList4.add(c1880zf2.f16702o0);
                                arrayList4.add(b10);
                                arrayList3.add(b12);
                                CD b13 = CD.b(new Lh(new KD(arrayList3, arrayList4), 3));
                                CD b14 = CD.b(AbstractC1561sb.f15496L);
                                CD b15 = CD.b(new C1701vg(b14, c0554Af.f7648c, 9));
                                C1119ih c1119ih2 = new C1119ih(c0905dr2, 3);
                                C1119ih c1119ih3 = new C1119ih(c0905dr2, 2);
                                C1565sf c1565sf = c0554Af.f7655g;
                                CD b16 = CD.b(new C1520rf(c1565sf, 13));
                                CD b17 = CD.b(AbstractC1561sb.f15501Q);
                                C1476qf c1476qf = c0554Af.f7635R;
                                CD cd = c0554Af.f7689x0;
                                CD cd2 = c0554Af.f7650d;
                                CD b18 = CD.b(new C1118ig(c1565sf, c1476qf, b16, b17, cd, cd2));
                                CD b19 = CD.b(new C1387og(c1565sf, c0554Af.f7648c, cd2, c1119ih2, c1119ih, c1880zf2.f16692j0, CD.b(new C1118ig(c0554Af.f7620G, c0554Af.f7618F, c1119ih, c1119ih3, b18, c1880zf2.f16683e)), new Lj(1), new O5(29), c0554Af.f7613C, c1880zf2.f16694k0, c1880zf2.f16683e, c1880zf2.f16710s0));
                                C1388oh c1388oh = new C1388oh(b19, 1);
                                C1388oh c1388oh2 = new C1388oh(CD.b(new C0847cd(c1119ih, c0554Af.f7633P, 3)), 18);
                                ArrayList arrayList5 = new ArrayList(4);
                                ArrayList arrayList6 = new ArrayList(2);
                                arrayList5.add(c1880zf2.f16704p0);
                                arrayList6.add(c1880zf2.f16706q0);
                                arrayList6.add(c1880zf2.f16708r0);
                                arrayList5.add(b15);
                                arrayList5.add(c1388oh);
                                arrayList5.add(c1388oh2);
                                CD b20 = CD.b(new Lh(new KD(arrayList5, arrayList6), 4));
                                CD b21 = CD.b(new C1212kl(c0554Af.f7655g, c0554Af.f7687w0, c0554Af.f7688x, c1119ih2, c1119ih, c0554Af.f7617E, o5));
                                CD b22 = CD.b(new C1388oh(b21, 10));
                                CD b23 = CD.b(new C1701vg(b14, c0554Af.f7648c, 8));
                                int i12 = 0;
                                CD b24 = CD.b(new C1388oh(CD.b(new C1478qh(c0554Af.f7679s0, c1880zf2.f16681d, i12)), 8));
                                C1388oh c1388oh3 = new C1388oh(b19, i12);
                                ArrayList arrayList7 = new ArrayList(5);
                                ArrayList arrayList8 = new ArrayList(3);
                                arrayList7.add(c1880zf2.f16712t0);
                                arrayList7.add(c1880zf2.f16714u0);
                                arrayList8.add(c1880zf2.f16716v0);
                                arrayList8.add(c1880zf2.f16718w0);
                                arrayList7.add(b22);
                                arrayList7.add(b23);
                                arrayList8.add(b24);
                                arrayList7.add(c1388oh3);
                                CD b25 = CD.b(new Lh(new KD(arrayList7, arrayList8), 0));
                                CD b26 = CD.b(new C1701vg(b9, b6, 1));
                                int i13 = 11;
                                CD b27 = CD.b(new C1388oh(b21, i13));
                                CD b28 = CD.b(new C1701vg(b14, c0554Af.f7648c, i13));
                                CD b29 = CD.b(new C1701vg(b14, c0554Af.f7648c, 14));
                                CD b30 = CD.b(JB.f9876C);
                                C1032gj c1032gj2 = new C1032gj(b30, 6);
                                ArrayList arrayList9 = new ArrayList(2);
                                ArrayList arrayList10 = new ArrayList(1);
                                arrayList10.add(c1880zf2.B0);
                                arrayList9.add(b29);
                                arrayList9.add(c1032gj2);
                                C1476qf c1476qf2 = new C1476qf(CD.b(new C0847cd(new KD(arrayList9, arrayList10), c1119ih, 11)), 19);
                                C1388oh c1388oh4 = new C1388oh(b19, 3);
                                C0650Nf c0650Nf = new C0650Nf(14, mt);
                                C1032gj c1032gj3 = new C1032gj(CD.b(new C0936ed(c0650Nf, c1032gj, c0554Af.f7648c, 11)), 5);
                                ArrayList arrayList11 = new ArrayList(7);
                                ArrayList arrayList12 = new ArrayList(3);
                                arrayList11.add(c1880zf2.f16720x0);
                                arrayList11.add(c1880zf2.f16722y0);
                                arrayList12.add(c1880zf2.f16724z0);
                                arrayList12.add(c1880zf2.f16632A0);
                                arrayList12.add(b26);
                                arrayList11.add(b27);
                                arrayList11.add(b28);
                                arrayList11.add(c1476qf2);
                                arrayList11.add(c1388oh4);
                                arrayList11.add(c1032gj3);
                                CD b31 = CD.b(new Lh(new KD(arrayList11, arrayList12), 2));
                                C1388oh c1388oh5 = new C1388oh(b19, 5);
                                ArrayList arrayList13 = new ArrayList(1);
                                ArrayList arrayList14 = new ArrayList(1);
                                arrayList14.add(c1880zf2.f16635C0);
                                arrayList13.add(c1388oh5);
                                CD b32 = CD.b(new Lh(new KD(arrayList13, arrayList14), 18));
                                C1476qf c1476qf3 = new C1476qf(CD.b(new C0556Ah(c1119ih, c0554Af.f7620G)), 29);
                                ArrayList arrayList15 = new ArrayList(1);
                                new ArrayList(1).add(c1880zf2.f16637D0);
                                arrayList15.add(c1476qf3);
                                CD b33 = CD.b(new C1701vg(b14, c0554Af.f7648c, 15));
                                ArrayList arrayList16 = new ArrayList(1);
                                ArrayList arrayList17 = new ArrayList(1);
                                arrayList17.add(c1880zf2.E0);
                                arrayList16.add(b33);
                                CD b34 = CD.b(new Lh(new KD(arrayList16, arrayList17), 19));
                                CD b35 = CD.b(new C1388oh(b11, 13));
                                C1388oh c1388oh6 = new C1388oh(b19, 4);
                                ArrayList arrayList18 = new ArrayList(6);
                                ArrayList arrayList19 = new ArrayList(4);
                                arrayList18.add(c1880zf2.f16640F0);
                                arrayList19.add(c1880zf2.f16642G0);
                                arrayList18.add(c1880zf2.f16644H0);
                                arrayList18.add(c1880zf2.f16646I0);
                                arrayList19.add(c1880zf2.f16647J0);
                                arrayList19.add(c1880zf2.f16648K0);
                                arrayList19.add(c1880zf2.f16650L0);
                                arrayList18.add(c1880zf2.f16652M0);
                                arrayList18.add(b35);
                                arrayList18.add(c1388oh6);
                                CD b36 = CD.b(new Lh(new KD(arrayList18, arrayList19), 5));
                                C1388oh c1388oh7 = new C1388oh(CD.b(new C1476qf(b20, 18)), 7);
                                CD b37 = CD.b(new C1701vg(b14, c0554Af.f7648c, 13));
                                ArrayList arrayList20 = new ArrayList(2);
                                ArrayList arrayList21 = new ArrayList(1);
                                arrayList21.add(c1880zf2.f16656O0);
                                arrayList20.add(c1388oh7);
                                arrayList20.add(b37);
                                CD b38 = CD.b(new Lh(new KD(arrayList20, arrayList21), 9));
                                List list = Collections.EMPTY_LIST;
                                new ArrayList(1).add(c1880zf2.f16658P0);
                                CD b39 = CD.b(new C1388oh(b21, 9));
                                ArrayList arrayList22 = new ArrayList(1);
                                List list2 = Collections.EMPTY_LIST;
                                arrayList22.add(b39);
                                CD b40 = CD.b(new C1701vg(b14, c0554Af.f7648c, 10));
                                C1388oh c1388oh8 = new C1388oh(b19, 2);
                                ArrayList arrayList23 = new ArrayList(2);
                                new ArrayList(1).add(c1880zf2.f16660Q0);
                                arrayList23.add(b40);
                                arrayList23.add(c1388oh8);
                                CD b41 = CD.b(new C1388oh(b21, 6));
                                ArrayList arrayList24 = new ArrayList(1);
                                List list3 = Collections.EMPTY_LIST;
                                arrayList24.add(b41);
                                C1119ih c1119ih4 = new C1119ih(c0905dr2, 1);
                                a3.y yVar = new a3.y(c1119ih, c1119ih4, c1880zf2.f16721y, c1119ih3, c1880zf2.f);
                                ArrayList arrayList25 = new ArrayList(1);
                                ArrayList arrayList26 = new ArrayList(1);
                                arrayList26.add(c1880zf2.f16664S0);
                                arrayList25.add(c1880zf2.f16666T0);
                                a3.r rVar3 = new a3.r(c1119ih2, c1119ih, b13, b36, c1880zf2.f16662R0, yVar, b14, new Lh(new KD(arrayList25, arrayList26), 6), b32);
                                C1614tj c1614tj2 = new C1614tj(c0709Wb, 1);
                                CD b42 = CD.b(new Uj(c1614tj2, c0554Af.f));
                                CD b43 = CD.b(new C1701vg(b9, b6, 3));
                                List list4 = Collections.EMPTY_LIST;
                                ArrayList arrayList27 = new ArrayList(2);
                                arrayList27.add(c1880zf2.f16668U0);
                                arrayList27.add(b43);
                                CD b44 = CD.b(new C0936ed(c1880zf2.f16715v, new KD(list4, arrayList27), c1119ih, 10));
                                CD cd3 = c1880zf2.f16715v;
                                C1435pj c1435pj = c1880zf2.f16655O;
                                CD cd4 = c0554Af.f7613C;
                                C1745wf c1745wf2 = c0554Af.f7660j;
                                Hh hh = c1880zf2.f16681d;
                                CD cd5 = c0554Af.f;
                                C1032gj c1032gj4 = new C1032gj(CD.b(new C1569sj(cd3, c1435pj, c1614tj, c1614tj2, c0650Nf, cd4, b31, b25, b34, c1119ih, c1745wf2, hh, b9, b42, cd5, b44, c0554Af.f7620G, c1880zf2.f16683e, c0554Af.f7622H, b17, c0554Af.f7625I0)), 4);
                                CD b45 = CD.b(new C1659uj(c1745wf2, 0));
                                CD cd6 = c0554Af.f7648c;
                                CD b46 = CD.b(new a3.M(b45, cd6, cd3, cd5, 2));
                                CD cd7 = c1880zf2.f16696l0;
                                C0555Ag c0555Ag = new C0555Ag(cd7, (DD) c1614tj2, b46, (DD) c1032gj4, 6);
                                Uj uj = new Uj(cd7, c1614tj2);
                                CD b47 = CD.b(new C0650Nf(13, new C1749wj(c0650Nf, 0)));
                                Qj qj = new Qj(c0554Af.f7635R, c1880zf2.f16681d, c1032gj, c0650Nf, c0555Ag, uj, cd6, b47);
                                C1168jm c1168jm = new C1168jm();
                                CD b48 = CD.b(new Ak(c1119ih4, c1168jm, c0650Nf, 1));
                                CD b49 = CD.b(new Ak(c1119ih4, c1168jm, c0650Nf, 0));
                                CD b50 = CD.b(new C0555Ag((DD) c1119ih4, (DD) c1168jm, (DD) c0650Nf, c0554Af.f7688x, 8));
                                CD b51 = CD.b(new C0847cd(c1168jm, c0650Nf, 17));
                                C1565sf c1565sf2 = c0554Af.f7655g;
                                CD b52 = CD.b(new C0555Ag(c1565sf2, c0650Nf, qj, c1168jm, 7));
                                C1168jm.a(c1168jm, CD.b(new Dj(rVar3, cd6, c0650Nf, c1032gj4, qj, c1032gj, c1435pj, b48, b49, b50, b51, b52, new C0637Lg(c1565sf2, c1880zf2.f16681d, 2), c0554Af.f7613C, c1745wf2, c1565sf2, b47, b30, c0554Af.f7626J0)));
                                CD cd8 = c1880zf2.f16670V0;
                                CD cd9 = c1880zf2.f16654N0;
                                CD b53 = CD.b(new Qj(b25, b20, cd8, b38, cd9, c1119ih, c1119ih3, b18, 2));
                                CD b54 = CD.b(new a3.M(c0554Af.f7648c, b46, CD.b(new C0556Ah(c1880zf2.f16715v, c1119ih, 2)), b18, 3));
                                CD b55 = CD.b(new C0595Fg(b25, b20, c1880zf2.f16670V0, b38, cd9, b34, c0554Af.f7688x, c0554Af.f7620G, c0554Af.f7617E, b18));
                                if (((Boolean) rVar2.f5056c.a(a73)).booleanValue()) {
                                    P2.o.f4767B.f4776j.getClass();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    pn = pn2;
                                    pn.f.f14846c.putLong("rendering-ad-component-creation-end", currentTimeMillis);
                                    pn.f.f14846c.putLong("rendering-configure-webview-start", currentTimeMillis);
                                } else {
                                    pn = pn2;
                                }
                                Kj kj = (Kj) c1880zf2.f16675a.f14827l;
                                AbstractC1400ot.D(kj);
                                AbstractC1400ot.D(gj);
                                AbstractC1400ot.D(kk);
                                C1381oa c1381oa = new C1381oa(kj, gj, kk, CD.a(b52));
                                if (((Y8) c1381oa.f14803l) != null) {
                                    ((Kk) c1381oa.f14804m).c("/nativeAdCustomClick", c1381oa);
                                }
                                Hk hk = (Hk) b53.d();
                                Yh yh = hk.f9462b;
                                Ek ek = kk.f10217a;
                                Objects.requireNonNull(yh);
                                ek.a(hk.f9461a, hk.f9463c, hk.f9464d, hk.f9465e, new Gk(0, yh));
                                Lq lq4 = hk.f;
                                Nq nq2 = hk.f9466g;
                                C1074hg c1074hg = hk.f9467h;
                                synchronized (kk) {
                                    try {
                                        C1582sw c1582sw = kk.f10227m;
                                        if (c1582sw != null) {
                                            try {
                                                C1071hd c1071hd3 = new C1071hd(kk, lq4, nq2, c1074hg, 9, false);
                                                c1582sw.a(new Kw(0, c1582sw, c1071hd3), kk.f10221e);
                                            } catch (Throwable th) {
                                                th = th;
                                                kk = kk;
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                final C1705vk c1705vk = (C1705vk) b54.d();
                                InterfaceC0677Re R4 = gj.R();
                                c1705vk.getClass();
                                if (R4 != null) {
                                    View K = R4.K();
                                    Ti ti = c1705vk.f16030c;
                                    ti.p1(K);
                                    C1615tk c1615tk = new C1615tk(R4, 0);
                                    Executor executor2 = c1705vk.f16028a;
                                    ti.m1(c1615tk, executor2);
                                    ti.m1(new C1615tk(R4, 1), executor2);
                                    C1746wg c1746wg = c1705vk.f16029b;
                                    ti.m1(c1746wg, executor2);
                                    c1746wg.f16127k = R4;
                                    C1028gf I5 = R4.I();
                                    if (!((Boolean) rVar2.f5056c.a(F7.J9)).booleanValue() || I5 == null) {
                                        i8 = 0;
                                    } else {
                                        I5.j("/click");
                                        Vi vi = I5.f13623u;
                                        C1074hg c1074hg2 = c1705vk.f16031d;
                                        i8 = 0;
                                        I5.a("/click", new C1641u9(0, vi, c1074hg2));
                                        I5.i(c1074hg2, null, null);
                                    }
                                    R4.s0("/trackActiveViewUnit", new InterfaceC1821y9() { // from class: com.google.android.gms.internal.ads.uk
                                        @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
                                        public final void b(Object obj, Map map4) {
                                            switch (i8) {
                                                case 0:
                                                    C1746wg c1746wg2 = c1705vk.f16029b;
                                                    c1746wg2.f16131o = true;
                                                    c1746wg2.a();
                                                    break;
                                                default:
                                                    c1705vk.f16029b.f16131o = false;
                                                    break;
                                            }
                                        }
                                    });
                                    final int i14 = 1;
                                    R4.s0("/untrackActiveViewUnit", new InterfaceC1821y9() { // from class: com.google.android.gms.internal.ads.uk
                                        @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
                                        public final void b(Object obj, Map map4) {
                                            switch (i14) {
                                                case 0:
                                                    C1746wg c1746wg2 = c1705vk.f16029b;
                                                    c1746wg2.f16131o = true;
                                                    c1746wg2.a();
                                                    break;
                                                default:
                                                    c1705vk.f16029b.f16131o = false;
                                                    break;
                                            }
                                        }
                                    });
                                }
                                ((Mk) b55.d()).a(pn.f11119e, gj.P());
                                if (((Boolean) rVar2.f5056c.a(a73)).booleanValue()) {
                                    AbstractC0467k.C(P2.o.f4767B.f4776j, pn.f.f14846c, "rendering-configure-webview-end");
                                }
                                return (Cj) c1168jm.d();
                            }
                        };
                        Dw dw2 = new Dw(m5, z6, false);
                        dw2.f8420z = new Cw(dw2, callable2, this.f11116b);
                        dw2.w();
                        return dw2;
                    }
                }
                i5 = 0;
                c02 = AbstractC1400ot.c0(new Bundle());
                C1390oj c1390oj2 = (C1390oj) c0905dr.f13188n;
                optJSONArray = jSONObject.optJSONArray("custom_assets");
                if (optJSONArray != null) {
                }
                if (jSONObject.optBoolean("enable_omid")) {
                }
                final E3.a aVar92 = j03;
                ArrayList arrayList22 = new ArrayList();
                final E3.a aVar102 = aVar2;
                arrayList22.add(aVar102);
                final E3.a aVar112 = aVar;
                arrayList22.add(aVar112);
                arrayList22.add(aVar3);
                arrayList22.add(a6);
                final E3.a aVar122 = aVar6;
                arrayList22.add(aVar122);
                final E3.a aVar132 = aVar5;
                arrayList22.add(aVar132);
                arrayList22.add(aVar7);
                arrayList22.add(c02);
                arrayList22.add(h02);
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Z4)).booleanValue()) {
                }
                arrayList22.add(aVar92);
                AbstractC1044gv l52 = AbstractC1044gv.l(arrayList22);
                final E3.a aVar142 = c02;
                boolean z62 = z3;
                final E3.a aVar152 = aVar3;
                final E3.a aVar162 = h02;
                Callable callable3 = new Callable() { // from class: com.google.android.gms.internal.ads.ik
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        AbstractC1044gv abstractC1044gv;
                        JSONObject optJSONObject8;
                        E3.a aVar17 = E3.a.this;
                        E3.a aVar18 = aVar112;
                        E3.a aVar19 = aVar122;
                        E3.a aVar20 = a6;
                        E3.a aVar21 = aVar132;
                        JSONObject jSONObject2 = jSONObject;
                        E3.a aVar22 = aVar7;
                        E3.a aVar23 = aVar142;
                        E3.a aVar24 = aVar152;
                        E3.a aVar25 = aVar92;
                        E3.a aVar26 = aVar162;
                        Gj gj = (Gj) aVar17.get();
                        List list = (List) aVar18.get();
                        synchronized (gj) {
                            gj.f9230e = list;
                        }
                        gj.k((I8) aVar19.get());
                        gj.n((I8) aVar20.get());
                        gj.h((E8) aVar21.get());
                        JSONObject optJSONObject9 = jSONObject2.optJSONObject("mute");
                        if (optJSONObject9 == null) {
                            C0954ev c0954ev = AbstractC1044gv.f13676l;
                            abstractC1044gv = C1761wv.f16184o;
                        } else {
                            JSONArray optJSONArray5 = optJSONObject9.optJSONArray("reasons");
                            if (optJSONArray5 == null || optJSONArray5.length() <= 0) {
                                C0954ev c0954ev2 = AbstractC1044gv.f13676l;
                                abstractC1044gv = C1761wv.f16184o;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i8 = 0; i8 < optJSONArray5.length(); i8++) {
                                    Q2.H0 e3 = C1391ok.e(optJSONArray5.optJSONObject(i8));
                                    if (e3 != null) {
                                        arrayList3.add(e3);
                                    }
                                }
                                abstractC1044gv = AbstractC1044gv.l(arrayList3);
                            }
                        }
                        gj.o(abstractC1044gv);
                        JSONObject optJSONObject10 = jSONObject2.optJSONObject("mute");
                        gj.j((optJSONObject10 == null || (optJSONObject8 = optJSONObject10.optJSONObject("default_reason")) == null) ? null : C1391ok.e(optJSONObject8));
                        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) aVar22.get();
                        if (interfaceC0677Re != null) {
                            gj.y(interfaceC0677Re);
                            gj.x(interfaceC0677Re.K());
                            gj.w(interfaceC0677Re.s());
                        }
                        gj.E().putAll((Bundle) aVar23.get());
                        InterfaceC0677Re interfaceC0677Re2 = (InterfaceC0677Re) aVar24.get();
                        if (interfaceC0677Re2 != null) {
                            gj.m(interfaceC0677Re2);
                            gj.z(interfaceC0677Re2.K());
                        }
                        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.Z4)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                            InterfaceC0677Re interfaceC0677Re3 = (InterfaceC0677Re) aVar25.get();
                            if (interfaceC0677Re3 != null) {
                                gj.p(interfaceC0677Re3);
                            }
                        } else {
                            gj.q(aVar25);
                            gj.s(new C0634Ld());
                        }
                        for (C1481qk c1481qk : (List) aVar26.get()) {
                            if (c1481qk.f15161a != 1) {
                                gj.l(c1481qk.f15162b, c1481qk.f15164d);
                            } else {
                                gj.u(c1481qk.f15162b, c1481qk.f15163c);
                            }
                        }
                        return gj;
                    }
                };
                final Dw dw3 = new Dw(l52, false, false);
                dw3.f8420z = new Cw(dw3, callable3, c0606Hd);
                dw3.w();
                E3.a[] aVarArr2 = new E3.a[2];
                aVarArr2[0] = a5;
                aVarArr2[z62 ? 1 : 0] = dw3;
                C1761wv m52 = AbstractC1044gv.m(aVarArr2);
                Callable callable22 = new Callable() { // from class: com.google.android.gms.internal.ads.On
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Pn pn;
                        final int i8;
                        int i9 = 13;
                        int i10 = 0;
                        Pn pn2 = Pn.this;
                        Dw dw22 = dw3;
                        E3.a aVar17 = a5;
                        Sq sq2 = sq;
                        Lq lq3 = lq;
                        JSONObject jSONObject2 = jSONObject;
                        pn2.getClass();
                        Gj gj = (Gj) dw22.get();
                        Kk kk = (Kk) aVar17.get();
                        A7 a73 = F7.f8816d2;
                        Q2.r rVar2 = Q2.r.f5053d;
                        if (((Boolean) rVar2.f5056c.a(a73)).booleanValue()) {
                            AbstractC0467k.C(P2.o.f4767B.f4776j, pn2.f.f14846c, "rendering-webview-creation-end");
                        }
                        C1880zf c1880zf = pn2.f11115a;
                        C0905dr c0905dr2 = new C0905dr(sq2, lq3, (String) null);
                        Mt mt = new Mt(21, gj);
                        C0709Wb c0709Wb = new C0709Wb(17, jSONObject2, kk);
                        C1880zf c1880zf2 = c1880zf.f16679c;
                        C0554Af c0554Af = c1880zf.f16677b;
                        CD b5 = CD.b(new C1476qf(c0554Af.f7616D0, 12));
                        C1119ih c1119ih = new C1119ih(c0905dr2, 0);
                        C1614tj c1614tj = new C1614tj(c0709Wb, i10);
                        C1032gj c1032gj = new C1032gj(CD.b(new C0847cd(c1119ih, c1614tj, i9)), 3);
                        CD b6 = CD.b(new C0650Nf(12, c1032gj));
                        C1745wf c1745wf = c0554Af.f7660j;
                        O5 o5 = AbstractC1561sb.f15499O;
                        CD b7 = CD.b(new C0936ed(c1745wf, b6, o5, 1));
                        CD b9 = CD.b(new a3.y(b5, CD.b(new C1655uf(c0554Af.f7655g, b7, 2)), c0554Af.f7648c, CD.b(new C1701vg(b7, b5, 0)), c0554Af.f));
                        CD b10 = CD.b(new C1701vg(b9, b6, 2));
                        CD b11 = CD.b(new C0556Ah(c1880zf2.f16715v, c1119ih, 0));
                        CD b12 = CD.b(new C1388oh(b11, 12));
                        int i11 = KD.f10142c;
                        ArrayList arrayList3 = new ArrayList(1);
                        ArrayList arrayList4 = new ArrayList(3);
                        arrayList4.add(c1880zf2.f16700n0);
                        arrayList4.add(c1880zf2.f16702o0);
                        arrayList4.add(b10);
                        arrayList3.add(b12);
                        CD b13 = CD.b(new Lh(new KD(arrayList3, arrayList4), 3));
                        CD b14 = CD.b(AbstractC1561sb.f15496L);
                        CD b15 = CD.b(new C1701vg(b14, c0554Af.f7648c, 9));
                        C1119ih c1119ih2 = new C1119ih(c0905dr2, 3);
                        C1119ih c1119ih3 = new C1119ih(c0905dr2, 2);
                        C1565sf c1565sf = c0554Af.f7655g;
                        CD b16 = CD.b(new C1520rf(c1565sf, 13));
                        CD b17 = CD.b(AbstractC1561sb.f15501Q);
                        C1476qf c1476qf = c0554Af.f7635R;
                        CD cd = c0554Af.f7689x0;
                        CD cd2 = c0554Af.f7650d;
                        CD b18 = CD.b(new C1118ig(c1565sf, c1476qf, b16, b17, cd, cd2));
                        CD b19 = CD.b(new C1387og(c1565sf, c0554Af.f7648c, cd2, c1119ih2, c1119ih, c1880zf2.f16692j0, CD.b(new C1118ig(c0554Af.f7620G, c0554Af.f7618F, c1119ih, c1119ih3, b18, c1880zf2.f16683e)), new Lj(1), new O5(29), c0554Af.f7613C, c1880zf2.f16694k0, c1880zf2.f16683e, c1880zf2.f16710s0));
                        C1388oh c1388oh = new C1388oh(b19, 1);
                        C1388oh c1388oh2 = new C1388oh(CD.b(new C0847cd(c1119ih, c0554Af.f7633P, 3)), 18);
                        ArrayList arrayList5 = new ArrayList(4);
                        ArrayList arrayList6 = new ArrayList(2);
                        arrayList5.add(c1880zf2.f16704p0);
                        arrayList6.add(c1880zf2.f16706q0);
                        arrayList6.add(c1880zf2.f16708r0);
                        arrayList5.add(b15);
                        arrayList5.add(c1388oh);
                        arrayList5.add(c1388oh2);
                        CD b20 = CD.b(new Lh(new KD(arrayList5, arrayList6), 4));
                        CD b21 = CD.b(new C1212kl(c0554Af.f7655g, c0554Af.f7687w0, c0554Af.f7688x, c1119ih2, c1119ih, c0554Af.f7617E, o5));
                        CD b22 = CD.b(new C1388oh(b21, 10));
                        CD b23 = CD.b(new C1701vg(b14, c0554Af.f7648c, 8));
                        int i12 = 0;
                        CD b24 = CD.b(new C1388oh(CD.b(new C1478qh(c0554Af.f7679s0, c1880zf2.f16681d, i12)), 8));
                        C1388oh c1388oh3 = new C1388oh(b19, i12);
                        ArrayList arrayList7 = new ArrayList(5);
                        ArrayList arrayList8 = new ArrayList(3);
                        arrayList7.add(c1880zf2.f16712t0);
                        arrayList7.add(c1880zf2.f16714u0);
                        arrayList8.add(c1880zf2.f16716v0);
                        arrayList8.add(c1880zf2.f16718w0);
                        arrayList7.add(b22);
                        arrayList7.add(b23);
                        arrayList8.add(b24);
                        arrayList7.add(c1388oh3);
                        CD b25 = CD.b(new Lh(new KD(arrayList7, arrayList8), 0));
                        CD b26 = CD.b(new C1701vg(b9, b6, 1));
                        int i13 = 11;
                        CD b27 = CD.b(new C1388oh(b21, i13));
                        CD b28 = CD.b(new C1701vg(b14, c0554Af.f7648c, i13));
                        CD b29 = CD.b(new C1701vg(b14, c0554Af.f7648c, 14));
                        CD b30 = CD.b(JB.f9876C);
                        C1032gj c1032gj2 = new C1032gj(b30, 6);
                        ArrayList arrayList9 = new ArrayList(2);
                        ArrayList arrayList10 = new ArrayList(1);
                        arrayList10.add(c1880zf2.B0);
                        arrayList9.add(b29);
                        arrayList9.add(c1032gj2);
                        C1476qf c1476qf2 = new C1476qf(CD.b(new C0847cd(new KD(arrayList9, arrayList10), c1119ih, 11)), 19);
                        C1388oh c1388oh4 = new C1388oh(b19, 3);
                        C0650Nf c0650Nf = new C0650Nf(14, mt);
                        C1032gj c1032gj3 = new C1032gj(CD.b(new C0936ed(c0650Nf, c1032gj, c0554Af.f7648c, 11)), 5);
                        ArrayList arrayList11 = new ArrayList(7);
                        ArrayList arrayList12 = new ArrayList(3);
                        arrayList11.add(c1880zf2.f16720x0);
                        arrayList11.add(c1880zf2.f16722y0);
                        arrayList12.add(c1880zf2.f16724z0);
                        arrayList12.add(c1880zf2.f16632A0);
                        arrayList12.add(b26);
                        arrayList11.add(b27);
                        arrayList11.add(b28);
                        arrayList11.add(c1476qf2);
                        arrayList11.add(c1388oh4);
                        arrayList11.add(c1032gj3);
                        CD b31 = CD.b(new Lh(new KD(arrayList11, arrayList12), 2));
                        C1388oh c1388oh5 = new C1388oh(b19, 5);
                        ArrayList arrayList13 = new ArrayList(1);
                        ArrayList arrayList14 = new ArrayList(1);
                        arrayList14.add(c1880zf2.f16635C0);
                        arrayList13.add(c1388oh5);
                        CD b32 = CD.b(new Lh(new KD(arrayList13, arrayList14), 18));
                        C1476qf c1476qf3 = new C1476qf(CD.b(new C0556Ah(c1119ih, c0554Af.f7620G)), 29);
                        ArrayList arrayList15 = new ArrayList(1);
                        new ArrayList(1).add(c1880zf2.f16637D0);
                        arrayList15.add(c1476qf3);
                        CD b33 = CD.b(new C1701vg(b14, c0554Af.f7648c, 15));
                        ArrayList arrayList16 = new ArrayList(1);
                        ArrayList arrayList17 = new ArrayList(1);
                        arrayList17.add(c1880zf2.E0);
                        arrayList16.add(b33);
                        CD b34 = CD.b(new Lh(new KD(arrayList16, arrayList17), 19));
                        CD b35 = CD.b(new C1388oh(b11, 13));
                        C1388oh c1388oh6 = new C1388oh(b19, 4);
                        ArrayList arrayList18 = new ArrayList(6);
                        ArrayList arrayList19 = new ArrayList(4);
                        arrayList18.add(c1880zf2.f16640F0);
                        arrayList19.add(c1880zf2.f16642G0);
                        arrayList18.add(c1880zf2.f16644H0);
                        arrayList18.add(c1880zf2.f16646I0);
                        arrayList19.add(c1880zf2.f16647J0);
                        arrayList19.add(c1880zf2.f16648K0);
                        arrayList19.add(c1880zf2.f16650L0);
                        arrayList18.add(c1880zf2.f16652M0);
                        arrayList18.add(b35);
                        arrayList18.add(c1388oh6);
                        CD b36 = CD.b(new Lh(new KD(arrayList18, arrayList19), 5));
                        C1388oh c1388oh7 = new C1388oh(CD.b(new C1476qf(b20, 18)), 7);
                        CD b37 = CD.b(new C1701vg(b14, c0554Af.f7648c, 13));
                        ArrayList arrayList20 = new ArrayList(2);
                        ArrayList arrayList21 = new ArrayList(1);
                        arrayList21.add(c1880zf2.f16656O0);
                        arrayList20.add(c1388oh7);
                        arrayList20.add(b37);
                        CD b38 = CD.b(new Lh(new KD(arrayList20, arrayList21), 9));
                        List list = Collections.EMPTY_LIST;
                        new ArrayList(1).add(c1880zf2.f16658P0);
                        CD b39 = CD.b(new C1388oh(b21, 9));
                        ArrayList arrayList222 = new ArrayList(1);
                        List list2 = Collections.EMPTY_LIST;
                        arrayList222.add(b39);
                        CD b40 = CD.b(new C1701vg(b14, c0554Af.f7648c, 10));
                        C1388oh c1388oh8 = new C1388oh(b19, 2);
                        ArrayList arrayList23 = new ArrayList(2);
                        new ArrayList(1).add(c1880zf2.f16660Q0);
                        arrayList23.add(b40);
                        arrayList23.add(c1388oh8);
                        CD b41 = CD.b(new C1388oh(b21, 6));
                        ArrayList arrayList24 = new ArrayList(1);
                        List list3 = Collections.EMPTY_LIST;
                        arrayList24.add(b41);
                        C1119ih c1119ih4 = new C1119ih(c0905dr2, 1);
                        a3.y yVar = new a3.y(c1119ih, c1119ih4, c1880zf2.f16721y, c1119ih3, c1880zf2.f);
                        ArrayList arrayList25 = new ArrayList(1);
                        ArrayList arrayList26 = new ArrayList(1);
                        arrayList26.add(c1880zf2.f16664S0);
                        arrayList25.add(c1880zf2.f16666T0);
                        a3.r rVar3 = new a3.r(c1119ih2, c1119ih, b13, b36, c1880zf2.f16662R0, yVar, b14, new Lh(new KD(arrayList25, arrayList26), 6), b32);
                        C1614tj c1614tj2 = new C1614tj(c0709Wb, 1);
                        CD b42 = CD.b(new Uj(c1614tj2, c0554Af.f));
                        CD b43 = CD.b(new C1701vg(b9, b6, 3));
                        List list4 = Collections.EMPTY_LIST;
                        ArrayList arrayList27 = new ArrayList(2);
                        arrayList27.add(c1880zf2.f16668U0);
                        arrayList27.add(b43);
                        CD b44 = CD.b(new C0936ed(c1880zf2.f16715v, new KD(list4, arrayList27), c1119ih, 10));
                        CD cd3 = c1880zf2.f16715v;
                        C1435pj c1435pj = c1880zf2.f16655O;
                        CD cd4 = c0554Af.f7613C;
                        C1745wf c1745wf2 = c0554Af.f7660j;
                        Hh hh = c1880zf2.f16681d;
                        CD cd5 = c0554Af.f;
                        C1032gj c1032gj4 = new C1032gj(CD.b(new C1569sj(cd3, c1435pj, c1614tj, c1614tj2, c0650Nf, cd4, b31, b25, b34, c1119ih, c1745wf2, hh, b9, b42, cd5, b44, c0554Af.f7620G, c1880zf2.f16683e, c0554Af.f7622H, b17, c0554Af.f7625I0)), 4);
                        CD b45 = CD.b(new C1659uj(c1745wf2, 0));
                        CD cd6 = c0554Af.f7648c;
                        CD b46 = CD.b(new a3.M(b45, cd6, cd3, cd5, 2));
                        CD cd7 = c1880zf2.f16696l0;
                        C0555Ag c0555Ag = new C0555Ag(cd7, (DD) c1614tj2, b46, (DD) c1032gj4, 6);
                        Uj uj = new Uj(cd7, c1614tj2);
                        CD b47 = CD.b(new C0650Nf(13, new C1749wj(c0650Nf, 0)));
                        Qj qj = new Qj(c0554Af.f7635R, c1880zf2.f16681d, c1032gj, c0650Nf, c0555Ag, uj, cd6, b47);
                        C1168jm c1168jm = new C1168jm();
                        CD b48 = CD.b(new Ak(c1119ih4, c1168jm, c0650Nf, 1));
                        CD b49 = CD.b(new Ak(c1119ih4, c1168jm, c0650Nf, 0));
                        CD b50 = CD.b(new C0555Ag((DD) c1119ih4, (DD) c1168jm, (DD) c0650Nf, c0554Af.f7688x, 8));
                        CD b51 = CD.b(new C0847cd(c1168jm, c0650Nf, 17));
                        C1565sf c1565sf2 = c0554Af.f7655g;
                        CD b52 = CD.b(new C0555Ag(c1565sf2, c0650Nf, qj, c1168jm, 7));
                        C1168jm.a(c1168jm, CD.b(new Dj(rVar3, cd6, c0650Nf, c1032gj4, qj, c1032gj, c1435pj, b48, b49, b50, b51, b52, new C0637Lg(c1565sf2, c1880zf2.f16681d, 2), c0554Af.f7613C, c1745wf2, c1565sf2, b47, b30, c0554Af.f7626J0)));
                        CD cd8 = c1880zf2.f16670V0;
                        CD cd9 = c1880zf2.f16654N0;
                        CD b53 = CD.b(new Qj(b25, b20, cd8, b38, cd9, c1119ih, c1119ih3, b18, 2));
                        CD b54 = CD.b(new a3.M(c0554Af.f7648c, b46, CD.b(new C0556Ah(c1880zf2.f16715v, c1119ih, 2)), b18, 3));
                        CD b55 = CD.b(new C0595Fg(b25, b20, c1880zf2.f16670V0, b38, cd9, b34, c0554Af.f7688x, c0554Af.f7620G, c0554Af.f7617E, b18));
                        if (((Boolean) rVar2.f5056c.a(a73)).booleanValue()) {
                            P2.o.f4767B.f4776j.getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            pn = pn2;
                            pn.f.f14846c.putLong("rendering-ad-component-creation-end", currentTimeMillis);
                            pn.f.f14846c.putLong("rendering-configure-webview-start", currentTimeMillis);
                        } else {
                            pn = pn2;
                        }
                        Kj kj = (Kj) c1880zf2.f16675a.f14827l;
                        AbstractC1400ot.D(kj);
                        AbstractC1400ot.D(gj);
                        AbstractC1400ot.D(kk);
                        C1381oa c1381oa = new C1381oa(kj, gj, kk, CD.a(b52));
                        if (((Y8) c1381oa.f14803l) != null) {
                            ((Kk) c1381oa.f14804m).c("/nativeAdCustomClick", c1381oa);
                        }
                        Hk hk = (Hk) b53.d();
                        Yh yh = hk.f9462b;
                        Ek ek = kk.f10217a;
                        Objects.requireNonNull(yh);
                        ek.a(hk.f9461a, hk.f9463c, hk.f9464d, hk.f9465e, new Gk(0, yh));
                        Lq lq4 = hk.f;
                        Nq nq2 = hk.f9466g;
                        C1074hg c1074hg = hk.f9467h;
                        synchronized (kk) {
                            try {
                                C1582sw c1582sw = kk.f10227m;
                                if (c1582sw != null) {
                                    try {
                                        C1071hd c1071hd3 = new C1071hd(kk, lq4, nq2, c1074hg, 9, false);
                                        c1582sw.a(new Kw(0, c1582sw, c1071hd3), kk.f10221e);
                                    } catch (Throwable th) {
                                        th = th;
                                        kk = kk;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        final C1705vk c1705vk = (C1705vk) b54.d();
                        InterfaceC0677Re R4 = gj.R();
                        c1705vk.getClass();
                        if (R4 != null) {
                            View K = R4.K();
                            Ti ti = c1705vk.f16030c;
                            ti.p1(K);
                            C1615tk c1615tk = new C1615tk(R4, 0);
                            Executor executor2 = c1705vk.f16028a;
                            ti.m1(c1615tk, executor2);
                            ti.m1(new C1615tk(R4, 1), executor2);
                            C1746wg c1746wg = c1705vk.f16029b;
                            ti.m1(c1746wg, executor2);
                            c1746wg.f16127k = R4;
                            C1028gf I5 = R4.I();
                            if (!((Boolean) rVar2.f5056c.a(F7.J9)).booleanValue() || I5 == null) {
                                i8 = 0;
                            } else {
                                I5.j("/click");
                                Vi vi = I5.f13623u;
                                C1074hg c1074hg2 = c1705vk.f16031d;
                                i8 = 0;
                                I5.a("/click", new C1641u9(0, vi, c1074hg2));
                                I5.i(c1074hg2, null, null);
                            }
                            R4.s0("/trackActiveViewUnit", new InterfaceC1821y9() { // from class: com.google.android.gms.internal.ads.uk
                                @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
                                public final void b(Object obj, Map map4) {
                                    switch (i8) {
                                        case 0:
                                            C1746wg c1746wg2 = c1705vk.f16029b;
                                            c1746wg2.f16131o = true;
                                            c1746wg2.a();
                                            break;
                                        default:
                                            c1705vk.f16029b.f16131o = false;
                                            break;
                                    }
                                }
                            });
                            final int i14 = 1;
                            R4.s0("/untrackActiveViewUnit", new InterfaceC1821y9() { // from class: com.google.android.gms.internal.ads.uk
                                @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
                                public final void b(Object obj, Map map4) {
                                    switch (i14) {
                                        case 0:
                                            C1746wg c1746wg2 = c1705vk.f16029b;
                                            c1746wg2.f16131o = true;
                                            c1746wg2.a();
                                            break;
                                        default:
                                            c1705vk.f16029b.f16131o = false;
                                            break;
                                    }
                                }
                            });
                        }
                        ((Mk) b55.d()).a(pn.f11119e, gj.P());
                        if (((Boolean) rVar2.f5056c.a(a73)).booleanValue()) {
                            AbstractC0467k.C(P2.o.f4767B.f4776j, pn.f.f14846c, "rendering-configure-webview-end");
                        }
                        return (Cj) c1168jm.d();
                    }
                };
                Dw dw22 = new Dw(m52, z62, false);
                dw22.f8420z = new Cw(dw22, callable22, this.f11116b);
                dw22.w();
                return dw22;
            }
            aVar5 = j02;
            aVar6 = a8;
            c5 = c1391ok.c(optJSONObject2, lq2, nq);
            aVar7 = c5;
            if (((Boolean) d7.a(F7.zc)).booleanValue()) {
            }
            i5 = 0;
            c02 = AbstractC1400ot.c0(new Bundle());
            C1390oj c1390oj22 = (C1390oj) c0905dr.f13188n;
            optJSONArray = jSONObject.optJSONArray("custom_assets");
            if (optJSONArray != null) {
            }
            if (jSONObject.optBoolean("enable_omid")) {
            }
            final E3.a aVar922 = j03;
            ArrayList arrayList222 = new ArrayList();
            final E3.a aVar1022 = aVar2;
            arrayList222.add(aVar1022);
            final E3.a aVar1122 = aVar;
            arrayList222.add(aVar1122);
            arrayList222.add(aVar3);
            arrayList222.add(a6);
            final E3.a aVar1222 = aVar6;
            arrayList222.add(aVar1222);
            final E3.a aVar1322 = aVar5;
            arrayList222.add(aVar1322);
            arrayList222.add(aVar7);
            arrayList222.add(c02);
            arrayList222.add(h02);
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Z4)).booleanValue()) {
            }
            arrayList222.add(aVar922);
            AbstractC1044gv l522 = AbstractC1044gv.l(arrayList222);
            final E3.a aVar1422 = c02;
            boolean z622 = z3;
            final E3.a aVar1522 = aVar3;
            final E3.a aVar1622 = h02;
            Callable callable32 = new Callable() { // from class: com.google.android.gms.internal.ads.ik
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    AbstractC1044gv abstractC1044gv;
                    JSONObject optJSONObject8;
                    E3.a aVar17 = E3.a.this;
                    E3.a aVar18 = aVar1122;
                    E3.a aVar19 = aVar1222;
                    E3.a aVar20 = a6;
                    E3.a aVar21 = aVar1322;
                    JSONObject jSONObject2 = jSONObject;
                    E3.a aVar22 = aVar7;
                    E3.a aVar23 = aVar1422;
                    E3.a aVar24 = aVar1522;
                    E3.a aVar25 = aVar922;
                    E3.a aVar26 = aVar1622;
                    Gj gj = (Gj) aVar17.get();
                    List list = (List) aVar18.get();
                    synchronized (gj) {
                        gj.f9230e = list;
                    }
                    gj.k((I8) aVar19.get());
                    gj.n((I8) aVar20.get());
                    gj.h((E8) aVar21.get());
                    JSONObject optJSONObject9 = jSONObject2.optJSONObject("mute");
                    if (optJSONObject9 == null) {
                        C0954ev c0954ev = AbstractC1044gv.f13676l;
                        abstractC1044gv = C1761wv.f16184o;
                    } else {
                        JSONArray optJSONArray5 = optJSONObject9.optJSONArray("reasons");
                        if (optJSONArray5 == null || optJSONArray5.length() <= 0) {
                            C0954ev c0954ev2 = AbstractC1044gv.f13676l;
                            abstractC1044gv = C1761wv.f16184o;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i8 = 0; i8 < optJSONArray5.length(); i8++) {
                                Q2.H0 e3 = C1391ok.e(optJSONArray5.optJSONObject(i8));
                                if (e3 != null) {
                                    arrayList3.add(e3);
                                }
                            }
                            abstractC1044gv = AbstractC1044gv.l(arrayList3);
                        }
                    }
                    gj.o(abstractC1044gv);
                    JSONObject optJSONObject10 = jSONObject2.optJSONObject("mute");
                    gj.j((optJSONObject10 == null || (optJSONObject8 = optJSONObject10.optJSONObject("default_reason")) == null) ? null : C1391ok.e(optJSONObject8));
                    InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) aVar22.get();
                    if (interfaceC0677Re != null) {
                        gj.y(interfaceC0677Re);
                        gj.x(interfaceC0677Re.K());
                        gj.w(interfaceC0677Re.s());
                    }
                    gj.E().putAll((Bundle) aVar23.get());
                    InterfaceC0677Re interfaceC0677Re2 = (InterfaceC0677Re) aVar24.get();
                    if (interfaceC0677Re2 != null) {
                        gj.m(interfaceC0677Re2);
                        gj.z(interfaceC0677Re2.K());
                    }
                    if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.Z4)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                        InterfaceC0677Re interfaceC0677Re3 = (InterfaceC0677Re) aVar25.get();
                        if (interfaceC0677Re3 != null) {
                            gj.p(interfaceC0677Re3);
                        }
                    } else {
                        gj.q(aVar25);
                        gj.s(new C0634Ld());
                    }
                    for (C1481qk c1481qk : (List) aVar26.get()) {
                        if (c1481qk.f15161a != 1) {
                            gj.l(c1481qk.f15162b, c1481qk.f15164d);
                        } else {
                            gj.u(c1481qk.f15162b, c1481qk.f15163c);
                        }
                    }
                    return gj;
                }
            };
            final Dw dw32 = new Dw(l522, false, false);
            dw32.f8420z = new Cw(dw32, callable32, c0606Hd);
            dw32.w();
            E3.a[] aVarArr22 = new E3.a[2];
            aVarArr22[0] = a5;
            aVarArr22[z622 ? 1 : 0] = dw32;
            C1761wv m522 = AbstractC1044gv.m(aVarArr22);
            Callable callable222 = new Callable() { // from class: com.google.android.gms.internal.ads.On
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Pn pn;
                    final int i8;
                    int i9 = 13;
                    int i10 = 0;
                    Pn pn2 = Pn.this;
                    Dw dw222 = dw32;
                    E3.a aVar17 = a5;
                    Sq sq2 = sq;
                    Lq lq3 = lq;
                    JSONObject jSONObject2 = jSONObject;
                    pn2.getClass();
                    Gj gj = (Gj) dw222.get();
                    Kk kk = (Kk) aVar17.get();
                    A7 a73 = F7.f8816d2;
                    Q2.r rVar2 = Q2.r.f5053d;
                    if (((Boolean) rVar2.f5056c.a(a73)).booleanValue()) {
                        AbstractC0467k.C(P2.o.f4767B.f4776j, pn2.f.f14846c, "rendering-webview-creation-end");
                    }
                    C1880zf c1880zf = pn2.f11115a;
                    C0905dr c0905dr2 = new C0905dr(sq2, lq3, (String) null);
                    Mt mt = new Mt(21, gj);
                    C0709Wb c0709Wb = new C0709Wb(17, jSONObject2, kk);
                    C1880zf c1880zf2 = c1880zf.f16679c;
                    C0554Af c0554Af = c1880zf.f16677b;
                    CD b5 = CD.b(new C1476qf(c0554Af.f7616D0, 12));
                    C1119ih c1119ih = new C1119ih(c0905dr2, 0);
                    C1614tj c1614tj = new C1614tj(c0709Wb, i10);
                    C1032gj c1032gj = new C1032gj(CD.b(new C0847cd(c1119ih, c1614tj, i9)), 3);
                    CD b6 = CD.b(new C0650Nf(12, c1032gj));
                    C1745wf c1745wf = c0554Af.f7660j;
                    O5 o5 = AbstractC1561sb.f15499O;
                    CD b7 = CD.b(new C0936ed(c1745wf, b6, o5, 1));
                    CD b9 = CD.b(new a3.y(b5, CD.b(new C1655uf(c0554Af.f7655g, b7, 2)), c0554Af.f7648c, CD.b(new C1701vg(b7, b5, 0)), c0554Af.f));
                    CD b10 = CD.b(new C1701vg(b9, b6, 2));
                    CD b11 = CD.b(new C0556Ah(c1880zf2.f16715v, c1119ih, 0));
                    CD b12 = CD.b(new C1388oh(b11, 12));
                    int i11 = KD.f10142c;
                    ArrayList arrayList3 = new ArrayList(1);
                    ArrayList arrayList4 = new ArrayList(3);
                    arrayList4.add(c1880zf2.f16700n0);
                    arrayList4.add(c1880zf2.f16702o0);
                    arrayList4.add(b10);
                    arrayList3.add(b12);
                    CD b13 = CD.b(new Lh(new KD(arrayList3, arrayList4), 3));
                    CD b14 = CD.b(AbstractC1561sb.f15496L);
                    CD b15 = CD.b(new C1701vg(b14, c0554Af.f7648c, 9));
                    C1119ih c1119ih2 = new C1119ih(c0905dr2, 3);
                    C1119ih c1119ih3 = new C1119ih(c0905dr2, 2);
                    C1565sf c1565sf = c0554Af.f7655g;
                    CD b16 = CD.b(new C1520rf(c1565sf, 13));
                    CD b17 = CD.b(AbstractC1561sb.f15501Q);
                    C1476qf c1476qf = c0554Af.f7635R;
                    CD cd = c0554Af.f7689x0;
                    CD cd2 = c0554Af.f7650d;
                    CD b18 = CD.b(new C1118ig(c1565sf, c1476qf, b16, b17, cd, cd2));
                    CD b19 = CD.b(new C1387og(c1565sf, c0554Af.f7648c, cd2, c1119ih2, c1119ih, c1880zf2.f16692j0, CD.b(new C1118ig(c0554Af.f7620G, c0554Af.f7618F, c1119ih, c1119ih3, b18, c1880zf2.f16683e)), new Lj(1), new O5(29), c0554Af.f7613C, c1880zf2.f16694k0, c1880zf2.f16683e, c1880zf2.f16710s0));
                    C1388oh c1388oh = new C1388oh(b19, 1);
                    C1388oh c1388oh2 = new C1388oh(CD.b(new C0847cd(c1119ih, c0554Af.f7633P, 3)), 18);
                    ArrayList arrayList5 = new ArrayList(4);
                    ArrayList arrayList6 = new ArrayList(2);
                    arrayList5.add(c1880zf2.f16704p0);
                    arrayList6.add(c1880zf2.f16706q0);
                    arrayList6.add(c1880zf2.f16708r0);
                    arrayList5.add(b15);
                    arrayList5.add(c1388oh);
                    arrayList5.add(c1388oh2);
                    CD b20 = CD.b(new Lh(new KD(arrayList5, arrayList6), 4));
                    CD b21 = CD.b(new C1212kl(c0554Af.f7655g, c0554Af.f7687w0, c0554Af.f7688x, c1119ih2, c1119ih, c0554Af.f7617E, o5));
                    CD b22 = CD.b(new C1388oh(b21, 10));
                    CD b23 = CD.b(new C1701vg(b14, c0554Af.f7648c, 8));
                    int i12 = 0;
                    CD b24 = CD.b(new C1388oh(CD.b(new C1478qh(c0554Af.f7679s0, c1880zf2.f16681d, i12)), 8));
                    C1388oh c1388oh3 = new C1388oh(b19, i12);
                    ArrayList arrayList7 = new ArrayList(5);
                    ArrayList arrayList8 = new ArrayList(3);
                    arrayList7.add(c1880zf2.f16712t0);
                    arrayList7.add(c1880zf2.f16714u0);
                    arrayList8.add(c1880zf2.f16716v0);
                    arrayList8.add(c1880zf2.f16718w0);
                    arrayList7.add(b22);
                    arrayList7.add(b23);
                    arrayList8.add(b24);
                    arrayList7.add(c1388oh3);
                    CD b25 = CD.b(new Lh(new KD(arrayList7, arrayList8), 0));
                    CD b26 = CD.b(new C1701vg(b9, b6, 1));
                    int i13 = 11;
                    CD b27 = CD.b(new C1388oh(b21, i13));
                    CD b28 = CD.b(new C1701vg(b14, c0554Af.f7648c, i13));
                    CD b29 = CD.b(new C1701vg(b14, c0554Af.f7648c, 14));
                    CD b30 = CD.b(JB.f9876C);
                    C1032gj c1032gj2 = new C1032gj(b30, 6);
                    ArrayList arrayList9 = new ArrayList(2);
                    ArrayList arrayList10 = new ArrayList(1);
                    arrayList10.add(c1880zf2.B0);
                    arrayList9.add(b29);
                    arrayList9.add(c1032gj2);
                    C1476qf c1476qf2 = new C1476qf(CD.b(new C0847cd(new KD(arrayList9, arrayList10), c1119ih, 11)), 19);
                    C1388oh c1388oh4 = new C1388oh(b19, 3);
                    C0650Nf c0650Nf = new C0650Nf(14, mt);
                    C1032gj c1032gj3 = new C1032gj(CD.b(new C0936ed(c0650Nf, c1032gj, c0554Af.f7648c, 11)), 5);
                    ArrayList arrayList11 = new ArrayList(7);
                    ArrayList arrayList12 = new ArrayList(3);
                    arrayList11.add(c1880zf2.f16720x0);
                    arrayList11.add(c1880zf2.f16722y0);
                    arrayList12.add(c1880zf2.f16724z0);
                    arrayList12.add(c1880zf2.f16632A0);
                    arrayList12.add(b26);
                    arrayList11.add(b27);
                    arrayList11.add(b28);
                    arrayList11.add(c1476qf2);
                    arrayList11.add(c1388oh4);
                    arrayList11.add(c1032gj3);
                    CD b31 = CD.b(new Lh(new KD(arrayList11, arrayList12), 2));
                    C1388oh c1388oh5 = new C1388oh(b19, 5);
                    ArrayList arrayList13 = new ArrayList(1);
                    ArrayList arrayList14 = new ArrayList(1);
                    arrayList14.add(c1880zf2.f16635C0);
                    arrayList13.add(c1388oh5);
                    CD b32 = CD.b(new Lh(new KD(arrayList13, arrayList14), 18));
                    C1476qf c1476qf3 = new C1476qf(CD.b(new C0556Ah(c1119ih, c0554Af.f7620G)), 29);
                    ArrayList arrayList15 = new ArrayList(1);
                    new ArrayList(1).add(c1880zf2.f16637D0);
                    arrayList15.add(c1476qf3);
                    CD b33 = CD.b(new C1701vg(b14, c0554Af.f7648c, 15));
                    ArrayList arrayList16 = new ArrayList(1);
                    ArrayList arrayList17 = new ArrayList(1);
                    arrayList17.add(c1880zf2.E0);
                    arrayList16.add(b33);
                    CD b34 = CD.b(new Lh(new KD(arrayList16, arrayList17), 19));
                    CD b35 = CD.b(new C1388oh(b11, 13));
                    C1388oh c1388oh6 = new C1388oh(b19, 4);
                    ArrayList arrayList18 = new ArrayList(6);
                    ArrayList arrayList19 = new ArrayList(4);
                    arrayList18.add(c1880zf2.f16640F0);
                    arrayList19.add(c1880zf2.f16642G0);
                    arrayList18.add(c1880zf2.f16644H0);
                    arrayList18.add(c1880zf2.f16646I0);
                    arrayList19.add(c1880zf2.f16647J0);
                    arrayList19.add(c1880zf2.f16648K0);
                    arrayList19.add(c1880zf2.f16650L0);
                    arrayList18.add(c1880zf2.f16652M0);
                    arrayList18.add(b35);
                    arrayList18.add(c1388oh6);
                    CD b36 = CD.b(new Lh(new KD(arrayList18, arrayList19), 5));
                    C1388oh c1388oh7 = new C1388oh(CD.b(new C1476qf(b20, 18)), 7);
                    CD b37 = CD.b(new C1701vg(b14, c0554Af.f7648c, 13));
                    ArrayList arrayList20 = new ArrayList(2);
                    ArrayList arrayList21 = new ArrayList(1);
                    arrayList21.add(c1880zf2.f16656O0);
                    arrayList20.add(c1388oh7);
                    arrayList20.add(b37);
                    CD b38 = CD.b(new Lh(new KD(arrayList20, arrayList21), 9));
                    List list = Collections.EMPTY_LIST;
                    new ArrayList(1).add(c1880zf2.f16658P0);
                    CD b39 = CD.b(new C1388oh(b21, 9));
                    ArrayList arrayList2222 = new ArrayList(1);
                    List list2 = Collections.EMPTY_LIST;
                    arrayList2222.add(b39);
                    CD b40 = CD.b(new C1701vg(b14, c0554Af.f7648c, 10));
                    C1388oh c1388oh8 = new C1388oh(b19, 2);
                    ArrayList arrayList23 = new ArrayList(2);
                    new ArrayList(1).add(c1880zf2.f16660Q0);
                    arrayList23.add(b40);
                    arrayList23.add(c1388oh8);
                    CD b41 = CD.b(new C1388oh(b21, 6));
                    ArrayList arrayList24 = new ArrayList(1);
                    List list3 = Collections.EMPTY_LIST;
                    arrayList24.add(b41);
                    C1119ih c1119ih4 = new C1119ih(c0905dr2, 1);
                    a3.y yVar = new a3.y(c1119ih, c1119ih4, c1880zf2.f16721y, c1119ih3, c1880zf2.f);
                    ArrayList arrayList25 = new ArrayList(1);
                    ArrayList arrayList26 = new ArrayList(1);
                    arrayList26.add(c1880zf2.f16664S0);
                    arrayList25.add(c1880zf2.f16666T0);
                    a3.r rVar3 = new a3.r(c1119ih2, c1119ih, b13, b36, c1880zf2.f16662R0, yVar, b14, new Lh(new KD(arrayList25, arrayList26), 6), b32);
                    C1614tj c1614tj2 = new C1614tj(c0709Wb, 1);
                    CD b42 = CD.b(new Uj(c1614tj2, c0554Af.f));
                    CD b43 = CD.b(new C1701vg(b9, b6, 3));
                    List list4 = Collections.EMPTY_LIST;
                    ArrayList arrayList27 = new ArrayList(2);
                    arrayList27.add(c1880zf2.f16668U0);
                    arrayList27.add(b43);
                    CD b44 = CD.b(new C0936ed(c1880zf2.f16715v, new KD(list4, arrayList27), c1119ih, 10));
                    CD cd3 = c1880zf2.f16715v;
                    C1435pj c1435pj = c1880zf2.f16655O;
                    CD cd4 = c0554Af.f7613C;
                    C1745wf c1745wf2 = c0554Af.f7660j;
                    Hh hh = c1880zf2.f16681d;
                    CD cd5 = c0554Af.f;
                    C1032gj c1032gj4 = new C1032gj(CD.b(new C1569sj(cd3, c1435pj, c1614tj, c1614tj2, c0650Nf, cd4, b31, b25, b34, c1119ih, c1745wf2, hh, b9, b42, cd5, b44, c0554Af.f7620G, c1880zf2.f16683e, c0554Af.f7622H, b17, c0554Af.f7625I0)), 4);
                    CD b45 = CD.b(new C1659uj(c1745wf2, 0));
                    CD cd6 = c0554Af.f7648c;
                    CD b46 = CD.b(new a3.M(b45, cd6, cd3, cd5, 2));
                    CD cd7 = c1880zf2.f16696l0;
                    C0555Ag c0555Ag = new C0555Ag(cd7, (DD) c1614tj2, b46, (DD) c1032gj4, 6);
                    Uj uj = new Uj(cd7, c1614tj2);
                    CD b47 = CD.b(new C0650Nf(13, new C1749wj(c0650Nf, 0)));
                    Qj qj = new Qj(c0554Af.f7635R, c1880zf2.f16681d, c1032gj, c0650Nf, c0555Ag, uj, cd6, b47);
                    C1168jm c1168jm = new C1168jm();
                    CD b48 = CD.b(new Ak(c1119ih4, c1168jm, c0650Nf, 1));
                    CD b49 = CD.b(new Ak(c1119ih4, c1168jm, c0650Nf, 0));
                    CD b50 = CD.b(new C0555Ag((DD) c1119ih4, (DD) c1168jm, (DD) c0650Nf, c0554Af.f7688x, 8));
                    CD b51 = CD.b(new C0847cd(c1168jm, c0650Nf, 17));
                    C1565sf c1565sf2 = c0554Af.f7655g;
                    CD b52 = CD.b(new C0555Ag(c1565sf2, c0650Nf, qj, c1168jm, 7));
                    C1168jm.a(c1168jm, CD.b(new Dj(rVar3, cd6, c0650Nf, c1032gj4, qj, c1032gj, c1435pj, b48, b49, b50, b51, b52, new C0637Lg(c1565sf2, c1880zf2.f16681d, 2), c0554Af.f7613C, c1745wf2, c1565sf2, b47, b30, c0554Af.f7626J0)));
                    CD cd8 = c1880zf2.f16670V0;
                    CD cd9 = c1880zf2.f16654N0;
                    CD b53 = CD.b(new Qj(b25, b20, cd8, b38, cd9, c1119ih, c1119ih3, b18, 2));
                    CD b54 = CD.b(new a3.M(c0554Af.f7648c, b46, CD.b(new C0556Ah(c1880zf2.f16715v, c1119ih, 2)), b18, 3));
                    CD b55 = CD.b(new C0595Fg(b25, b20, c1880zf2.f16670V0, b38, cd9, b34, c0554Af.f7688x, c0554Af.f7620G, c0554Af.f7617E, b18));
                    if (((Boolean) rVar2.f5056c.a(a73)).booleanValue()) {
                        P2.o.f4767B.f4776j.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        pn = pn2;
                        pn.f.f14846c.putLong("rendering-ad-component-creation-end", currentTimeMillis);
                        pn.f.f14846c.putLong("rendering-configure-webview-start", currentTimeMillis);
                    } else {
                        pn = pn2;
                    }
                    Kj kj = (Kj) c1880zf2.f16675a.f14827l;
                    AbstractC1400ot.D(kj);
                    AbstractC1400ot.D(gj);
                    AbstractC1400ot.D(kk);
                    C1381oa c1381oa = new C1381oa(kj, gj, kk, CD.a(b52));
                    if (((Y8) c1381oa.f14803l) != null) {
                        ((Kk) c1381oa.f14804m).c("/nativeAdCustomClick", c1381oa);
                    }
                    Hk hk = (Hk) b53.d();
                    Yh yh = hk.f9462b;
                    Ek ek = kk.f10217a;
                    Objects.requireNonNull(yh);
                    ek.a(hk.f9461a, hk.f9463c, hk.f9464d, hk.f9465e, new Gk(0, yh));
                    Lq lq4 = hk.f;
                    Nq nq2 = hk.f9466g;
                    C1074hg c1074hg = hk.f9467h;
                    synchronized (kk) {
                        try {
                            C1582sw c1582sw = kk.f10227m;
                            if (c1582sw != null) {
                                try {
                                    C1071hd c1071hd3 = new C1071hd(kk, lq4, nq2, c1074hg, 9, false);
                                    c1582sw.a(new Kw(0, c1582sw, c1071hd3), kk.f10221e);
                                } catch (Throwable th) {
                                    th = th;
                                    kk = kk;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    final C1705vk c1705vk = (C1705vk) b54.d();
                    InterfaceC0677Re R4 = gj.R();
                    c1705vk.getClass();
                    if (R4 != null) {
                        View K = R4.K();
                        Ti ti = c1705vk.f16030c;
                        ti.p1(K);
                        C1615tk c1615tk = new C1615tk(R4, 0);
                        Executor executor2 = c1705vk.f16028a;
                        ti.m1(c1615tk, executor2);
                        ti.m1(new C1615tk(R4, 1), executor2);
                        C1746wg c1746wg = c1705vk.f16029b;
                        ti.m1(c1746wg, executor2);
                        c1746wg.f16127k = R4;
                        C1028gf I5 = R4.I();
                        if (!((Boolean) rVar2.f5056c.a(F7.J9)).booleanValue() || I5 == null) {
                            i8 = 0;
                        } else {
                            I5.j("/click");
                            Vi vi = I5.f13623u;
                            C1074hg c1074hg2 = c1705vk.f16031d;
                            i8 = 0;
                            I5.a("/click", new C1641u9(0, vi, c1074hg2));
                            I5.i(c1074hg2, null, null);
                        }
                        R4.s0("/trackActiveViewUnit", new InterfaceC1821y9() { // from class: com.google.android.gms.internal.ads.uk
                            @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
                            public final void b(Object obj, Map map4) {
                                switch (i8) {
                                    case 0:
                                        C1746wg c1746wg2 = c1705vk.f16029b;
                                        c1746wg2.f16131o = true;
                                        c1746wg2.a();
                                        break;
                                    default:
                                        c1705vk.f16029b.f16131o = false;
                                        break;
                                }
                            }
                        });
                        final int i14 = 1;
                        R4.s0("/untrackActiveViewUnit", new InterfaceC1821y9() { // from class: com.google.android.gms.internal.ads.uk
                            @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
                            public final void b(Object obj, Map map4) {
                                switch (i14) {
                                    case 0:
                                        C1746wg c1746wg2 = c1705vk.f16029b;
                                        c1746wg2.f16131o = true;
                                        c1746wg2.a();
                                        break;
                                    default:
                                        c1705vk.f16029b.f16131o = false;
                                        break;
                                }
                            }
                        });
                    }
                    ((Mk) b55.d()).a(pn.f11119e, gj.P());
                    if (((Boolean) rVar2.f5056c.a(a73)).booleanValue()) {
                        AbstractC0467k.C(P2.o.f4767B.f4776j, pn.f.f14846c, "rendering-configure-webview-end");
                    }
                    return (Cj) c1168jm.d();
                }
            };
            Dw dw222 = new Dw(m522, z622, false);
            dw222.f8420z = new Cw(dw222, callable222, this.f11116b);
            dw222.w();
            return dw222;
        }
        aVar3 = Mw.f10750l;
        aVar = b3;
        aVar2 = d5;
        d7 = d72;
        c0606Hd = c0606Hd2;
        c1391ok = c1391ok2;
        str = "images";
        b8 = b82;
        final E3.a a62 = c1391ok.a(jSONObject.optJSONObject("secondary_image"), b8.f7771l);
        E3.a a82 = c1391ok.a(jSONObject.optJSONObject("app_icon"), b8.f7771l);
        optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject != null) {
        }
        C1071hd c1071hd22 = sq.f11596b;
        String[] strArr2 = {"html_containers", "instream"};
        JSONObject j062 = N4.b.j0(jSONObject, strArr2);
        if (j062 != null) {
        }
        Nq nq2 = (Nq) c1071hd22.f13762m;
        if (optJSONObject2 != null) {
        }
        aVar7 = c5;
        if (((Boolean) d7.a(F7.zc)).booleanValue()) {
        }
        i5 = 0;
        c02 = AbstractC1400ot.c0(new Bundle());
        C1390oj c1390oj222 = (C1390oj) c0905dr.f13188n;
        optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray != null) {
        }
        if (jSONObject.optBoolean("enable_omid")) {
        }
        final E3.a aVar9222 = j03;
        ArrayList arrayList2222 = new ArrayList();
        final E3.a aVar10222 = aVar2;
        arrayList2222.add(aVar10222);
        final E3.a aVar11222 = aVar;
        arrayList2222.add(aVar11222);
        arrayList2222.add(aVar3);
        arrayList2222.add(a62);
        final E3.a aVar12222 = aVar6;
        arrayList2222.add(aVar12222);
        final E3.a aVar13222 = aVar5;
        arrayList2222.add(aVar13222);
        arrayList2222.add(aVar7);
        arrayList2222.add(c02);
        arrayList2222.add(h02);
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Z4)).booleanValue()) {
        }
        arrayList2222.add(aVar9222);
        AbstractC1044gv l5222 = AbstractC1044gv.l(arrayList2222);
        final E3.a aVar14222 = c02;
        boolean z6222 = z3;
        final E3.a aVar15222 = aVar3;
        final E3.a aVar16222 = h02;
        Callable callable322 = new Callable() { // from class: com.google.android.gms.internal.ads.ik
            @Override // java.util.concurrent.Callable
            public final Object call() {
                AbstractC1044gv abstractC1044gv;
                JSONObject optJSONObject8;
                E3.a aVar17 = E3.a.this;
                E3.a aVar18 = aVar11222;
                E3.a aVar19 = aVar12222;
                E3.a aVar20 = a62;
                E3.a aVar21 = aVar13222;
                JSONObject jSONObject2 = jSONObject;
                E3.a aVar22 = aVar7;
                E3.a aVar23 = aVar14222;
                E3.a aVar24 = aVar15222;
                E3.a aVar25 = aVar9222;
                E3.a aVar26 = aVar16222;
                Gj gj = (Gj) aVar17.get();
                List list = (List) aVar18.get();
                synchronized (gj) {
                    gj.f9230e = list;
                }
                gj.k((I8) aVar19.get());
                gj.n((I8) aVar20.get());
                gj.h((E8) aVar21.get());
                JSONObject optJSONObject9 = jSONObject2.optJSONObject("mute");
                if (optJSONObject9 == null) {
                    C0954ev c0954ev = AbstractC1044gv.f13676l;
                    abstractC1044gv = C1761wv.f16184o;
                } else {
                    JSONArray optJSONArray5 = optJSONObject9.optJSONArray("reasons");
                    if (optJSONArray5 == null || optJSONArray5.length() <= 0) {
                        C0954ev c0954ev2 = AbstractC1044gv.f13676l;
                        abstractC1044gv = C1761wv.f16184o;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i8 = 0; i8 < optJSONArray5.length(); i8++) {
                            Q2.H0 e3 = C1391ok.e(optJSONArray5.optJSONObject(i8));
                            if (e3 != null) {
                                arrayList3.add(e3);
                            }
                        }
                        abstractC1044gv = AbstractC1044gv.l(arrayList3);
                    }
                }
                gj.o(abstractC1044gv);
                JSONObject optJSONObject10 = jSONObject2.optJSONObject("mute");
                gj.j((optJSONObject10 == null || (optJSONObject8 = optJSONObject10.optJSONObject("default_reason")) == null) ? null : C1391ok.e(optJSONObject8));
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) aVar22.get();
                if (interfaceC0677Re != null) {
                    gj.y(interfaceC0677Re);
                    gj.x(interfaceC0677Re.K());
                    gj.w(interfaceC0677Re.s());
                }
                gj.E().putAll((Bundle) aVar23.get());
                InterfaceC0677Re interfaceC0677Re2 = (InterfaceC0677Re) aVar24.get();
                if (interfaceC0677Re2 != null) {
                    gj.m(interfaceC0677Re2);
                    gj.z(interfaceC0677Re2.K());
                }
                if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.Z4)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                    InterfaceC0677Re interfaceC0677Re3 = (InterfaceC0677Re) aVar25.get();
                    if (interfaceC0677Re3 != null) {
                        gj.p(interfaceC0677Re3);
                    }
                } else {
                    gj.q(aVar25);
                    gj.s(new C0634Ld());
                }
                for (C1481qk c1481qk : (List) aVar26.get()) {
                    if (c1481qk.f15161a != 1) {
                        gj.l(c1481qk.f15162b, c1481qk.f15164d);
                    } else {
                        gj.u(c1481qk.f15162b, c1481qk.f15163c);
                    }
                }
                return gj;
            }
        };
        final Dw dw322 = new Dw(l5222, false, false);
        dw322.f8420z = new Cw(dw322, callable322, c0606Hd);
        dw322.w();
        E3.a[] aVarArr222 = new E3.a[2];
        aVarArr222[0] = a5;
        aVarArr222[z6222 ? 1 : 0] = dw322;
        C1761wv m5222 = AbstractC1044gv.m(aVarArr222);
        Callable callable2222 = new Callable() { // from class: com.google.android.gms.internal.ads.On
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Pn pn;
                final int i8;
                int i9 = 13;
                int i10 = 0;
                Pn pn2 = Pn.this;
                Dw dw2222 = dw322;
                E3.a aVar17 = a5;
                Sq sq2 = sq;
                Lq lq3 = lq;
                JSONObject jSONObject2 = jSONObject;
                pn2.getClass();
                Gj gj = (Gj) dw2222.get();
                Kk kk = (Kk) aVar17.get();
                A7 a73 = F7.f8816d2;
                Q2.r rVar2 = Q2.r.f5053d;
                if (((Boolean) rVar2.f5056c.a(a73)).booleanValue()) {
                    AbstractC0467k.C(P2.o.f4767B.f4776j, pn2.f.f14846c, "rendering-webview-creation-end");
                }
                C1880zf c1880zf = pn2.f11115a;
                C0905dr c0905dr2 = new C0905dr(sq2, lq3, (String) null);
                Mt mt = new Mt(21, gj);
                C0709Wb c0709Wb = new C0709Wb(17, jSONObject2, kk);
                C1880zf c1880zf2 = c1880zf.f16679c;
                C0554Af c0554Af = c1880zf.f16677b;
                CD b5 = CD.b(new C1476qf(c0554Af.f7616D0, 12));
                C1119ih c1119ih = new C1119ih(c0905dr2, 0);
                C1614tj c1614tj = new C1614tj(c0709Wb, i10);
                C1032gj c1032gj = new C1032gj(CD.b(new C0847cd(c1119ih, c1614tj, i9)), 3);
                CD b6 = CD.b(new C0650Nf(12, c1032gj));
                C1745wf c1745wf = c0554Af.f7660j;
                O5 o5 = AbstractC1561sb.f15499O;
                CD b7 = CD.b(new C0936ed(c1745wf, b6, o5, 1));
                CD b9 = CD.b(new a3.y(b5, CD.b(new C1655uf(c0554Af.f7655g, b7, 2)), c0554Af.f7648c, CD.b(new C1701vg(b7, b5, 0)), c0554Af.f));
                CD b10 = CD.b(new C1701vg(b9, b6, 2));
                CD b11 = CD.b(new C0556Ah(c1880zf2.f16715v, c1119ih, 0));
                CD b12 = CD.b(new C1388oh(b11, 12));
                int i11 = KD.f10142c;
                ArrayList arrayList3 = new ArrayList(1);
                ArrayList arrayList4 = new ArrayList(3);
                arrayList4.add(c1880zf2.f16700n0);
                arrayList4.add(c1880zf2.f16702o0);
                arrayList4.add(b10);
                arrayList3.add(b12);
                CD b13 = CD.b(new Lh(new KD(arrayList3, arrayList4), 3));
                CD b14 = CD.b(AbstractC1561sb.f15496L);
                CD b15 = CD.b(new C1701vg(b14, c0554Af.f7648c, 9));
                C1119ih c1119ih2 = new C1119ih(c0905dr2, 3);
                C1119ih c1119ih3 = new C1119ih(c0905dr2, 2);
                C1565sf c1565sf = c0554Af.f7655g;
                CD b16 = CD.b(new C1520rf(c1565sf, 13));
                CD b17 = CD.b(AbstractC1561sb.f15501Q);
                C1476qf c1476qf = c0554Af.f7635R;
                CD cd = c0554Af.f7689x0;
                CD cd2 = c0554Af.f7650d;
                CD b18 = CD.b(new C1118ig(c1565sf, c1476qf, b16, b17, cd, cd2));
                CD b19 = CD.b(new C1387og(c1565sf, c0554Af.f7648c, cd2, c1119ih2, c1119ih, c1880zf2.f16692j0, CD.b(new C1118ig(c0554Af.f7620G, c0554Af.f7618F, c1119ih, c1119ih3, b18, c1880zf2.f16683e)), new Lj(1), new O5(29), c0554Af.f7613C, c1880zf2.f16694k0, c1880zf2.f16683e, c1880zf2.f16710s0));
                C1388oh c1388oh = new C1388oh(b19, 1);
                C1388oh c1388oh2 = new C1388oh(CD.b(new C0847cd(c1119ih, c0554Af.f7633P, 3)), 18);
                ArrayList arrayList5 = new ArrayList(4);
                ArrayList arrayList6 = new ArrayList(2);
                arrayList5.add(c1880zf2.f16704p0);
                arrayList6.add(c1880zf2.f16706q0);
                arrayList6.add(c1880zf2.f16708r0);
                arrayList5.add(b15);
                arrayList5.add(c1388oh);
                arrayList5.add(c1388oh2);
                CD b20 = CD.b(new Lh(new KD(arrayList5, arrayList6), 4));
                CD b21 = CD.b(new C1212kl(c0554Af.f7655g, c0554Af.f7687w0, c0554Af.f7688x, c1119ih2, c1119ih, c0554Af.f7617E, o5));
                CD b22 = CD.b(new C1388oh(b21, 10));
                CD b23 = CD.b(new C1701vg(b14, c0554Af.f7648c, 8));
                int i12 = 0;
                CD b24 = CD.b(new C1388oh(CD.b(new C1478qh(c0554Af.f7679s0, c1880zf2.f16681d, i12)), 8));
                C1388oh c1388oh3 = new C1388oh(b19, i12);
                ArrayList arrayList7 = new ArrayList(5);
                ArrayList arrayList8 = new ArrayList(3);
                arrayList7.add(c1880zf2.f16712t0);
                arrayList7.add(c1880zf2.f16714u0);
                arrayList8.add(c1880zf2.f16716v0);
                arrayList8.add(c1880zf2.f16718w0);
                arrayList7.add(b22);
                arrayList7.add(b23);
                arrayList8.add(b24);
                arrayList7.add(c1388oh3);
                CD b25 = CD.b(new Lh(new KD(arrayList7, arrayList8), 0));
                CD b26 = CD.b(new C1701vg(b9, b6, 1));
                int i13 = 11;
                CD b27 = CD.b(new C1388oh(b21, i13));
                CD b28 = CD.b(new C1701vg(b14, c0554Af.f7648c, i13));
                CD b29 = CD.b(new C1701vg(b14, c0554Af.f7648c, 14));
                CD b30 = CD.b(JB.f9876C);
                C1032gj c1032gj2 = new C1032gj(b30, 6);
                ArrayList arrayList9 = new ArrayList(2);
                ArrayList arrayList10 = new ArrayList(1);
                arrayList10.add(c1880zf2.B0);
                arrayList9.add(b29);
                arrayList9.add(c1032gj2);
                C1476qf c1476qf2 = new C1476qf(CD.b(new C0847cd(new KD(arrayList9, arrayList10), c1119ih, 11)), 19);
                C1388oh c1388oh4 = new C1388oh(b19, 3);
                C0650Nf c0650Nf = new C0650Nf(14, mt);
                C1032gj c1032gj3 = new C1032gj(CD.b(new C0936ed(c0650Nf, c1032gj, c0554Af.f7648c, 11)), 5);
                ArrayList arrayList11 = new ArrayList(7);
                ArrayList arrayList12 = new ArrayList(3);
                arrayList11.add(c1880zf2.f16720x0);
                arrayList11.add(c1880zf2.f16722y0);
                arrayList12.add(c1880zf2.f16724z0);
                arrayList12.add(c1880zf2.f16632A0);
                arrayList12.add(b26);
                arrayList11.add(b27);
                arrayList11.add(b28);
                arrayList11.add(c1476qf2);
                arrayList11.add(c1388oh4);
                arrayList11.add(c1032gj3);
                CD b31 = CD.b(new Lh(new KD(arrayList11, arrayList12), 2));
                C1388oh c1388oh5 = new C1388oh(b19, 5);
                ArrayList arrayList13 = new ArrayList(1);
                ArrayList arrayList14 = new ArrayList(1);
                arrayList14.add(c1880zf2.f16635C0);
                arrayList13.add(c1388oh5);
                CD b32 = CD.b(new Lh(new KD(arrayList13, arrayList14), 18));
                C1476qf c1476qf3 = new C1476qf(CD.b(new C0556Ah(c1119ih, c0554Af.f7620G)), 29);
                ArrayList arrayList15 = new ArrayList(1);
                new ArrayList(1).add(c1880zf2.f16637D0);
                arrayList15.add(c1476qf3);
                CD b33 = CD.b(new C1701vg(b14, c0554Af.f7648c, 15));
                ArrayList arrayList16 = new ArrayList(1);
                ArrayList arrayList17 = new ArrayList(1);
                arrayList17.add(c1880zf2.E0);
                arrayList16.add(b33);
                CD b34 = CD.b(new Lh(new KD(arrayList16, arrayList17), 19));
                CD b35 = CD.b(new C1388oh(b11, 13));
                C1388oh c1388oh6 = new C1388oh(b19, 4);
                ArrayList arrayList18 = new ArrayList(6);
                ArrayList arrayList19 = new ArrayList(4);
                arrayList18.add(c1880zf2.f16640F0);
                arrayList19.add(c1880zf2.f16642G0);
                arrayList18.add(c1880zf2.f16644H0);
                arrayList18.add(c1880zf2.f16646I0);
                arrayList19.add(c1880zf2.f16647J0);
                arrayList19.add(c1880zf2.f16648K0);
                arrayList19.add(c1880zf2.f16650L0);
                arrayList18.add(c1880zf2.f16652M0);
                arrayList18.add(b35);
                arrayList18.add(c1388oh6);
                CD b36 = CD.b(new Lh(new KD(arrayList18, arrayList19), 5));
                C1388oh c1388oh7 = new C1388oh(CD.b(new C1476qf(b20, 18)), 7);
                CD b37 = CD.b(new C1701vg(b14, c0554Af.f7648c, 13));
                ArrayList arrayList20 = new ArrayList(2);
                ArrayList arrayList21 = new ArrayList(1);
                arrayList21.add(c1880zf2.f16656O0);
                arrayList20.add(c1388oh7);
                arrayList20.add(b37);
                CD b38 = CD.b(new Lh(new KD(arrayList20, arrayList21), 9));
                List list = Collections.EMPTY_LIST;
                new ArrayList(1).add(c1880zf2.f16658P0);
                CD b39 = CD.b(new C1388oh(b21, 9));
                ArrayList arrayList22222 = new ArrayList(1);
                List list2 = Collections.EMPTY_LIST;
                arrayList22222.add(b39);
                CD b40 = CD.b(new C1701vg(b14, c0554Af.f7648c, 10));
                C1388oh c1388oh8 = new C1388oh(b19, 2);
                ArrayList arrayList23 = new ArrayList(2);
                new ArrayList(1).add(c1880zf2.f16660Q0);
                arrayList23.add(b40);
                arrayList23.add(c1388oh8);
                CD b41 = CD.b(new C1388oh(b21, 6));
                ArrayList arrayList24 = new ArrayList(1);
                List list3 = Collections.EMPTY_LIST;
                arrayList24.add(b41);
                C1119ih c1119ih4 = new C1119ih(c0905dr2, 1);
                a3.y yVar = new a3.y(c1119ih, c1119ih4, c1880zf2.f16721y, c1119ih3, c1880zf2.f);
                ArrayList arrayList25 = new ArrayList(1);
                ArrayList arrayList26 = new ArrayList(1);
                arrayList26.add(c1880zf2.f16664S0);
                arrayList25.add(c1880zf2.f16666T0);
                a3.r rVar3 = new a3.r(c1119ih2, c1119ih, b13, b36, c1880zf2.f16662R0, yVar, b14, new Lh(new KD(arrayList25, arrayList26), 6), b32);
                C1614tj c1614tj2 = new C1614tj(c0709Wb, 1);
                CD b42 = CD.b(new Uj(c1614tj2, c0554Af.f));
                CD b43 = CD.b(new C1701vg(b9, b6, 3));
                List list4 = Collections.EMPTY_LIST;
                ArrayList arrayList27 = new ArrayList(2);
                arrayList27.add(c1880zf2.f16668U0);
                arrayList27.add(b43);
                CD b44 = CD.b(new C0936ed(c1880zf2.f16715v, new KD(list4, arrayList27), c1119ih, 10));
                CD cd3 = c1880zf2.f16715v;
                C1435pj c1435pj = c1880zf2.f16655O;
                CD cd4 = c0554Af.f7613C;
                C1745wf c1745wf2 = c0554Af.f7660j;
                Hh hh = c1880zf2.f16681d;
                CD cd5 = c0554Af.f;
                C1032gj c1032gj4 = new C1032gj(CD.b(new C1569sj(cd3, c1435pj, c1614tj, c1614tj2, c0650Nf, cd4, b31, b25, b34, c1119ih, c1745wf2, hh, b9, b42, cd5, b44, c0554Af.f7620G, c1880zf2.f16683e, c0554Af.f7622H, b17, c0554Af.f7625I0)), 4);
                CD b45 = CD.b(new C1659uj(c1745wf2, 0));
                CD cd6 = c0554Af.f7648c;
                CD b46 = CD.b(new a3.M(b45, cd6, cd3, cd5, 2));
                CD cd7 = c1880zf2.f16696l0;
                C0555Ag c0555Ag = new C0555Ag(cd7, (DD) c1614tj2, b46, (DD) c1032gj4, 6);
                Uj uj = new Uj(cd7, c1614tj2);
                CD b47 = CD.b(new C0650Nf(13, new C1749wj(c0650Nf, 0)));
                Qj qj = new Qj(c0554Af.f7635R, c1880zf2.f16681d, c1032gj, c0650Nf, c0555Ag, uj, cd6, b47);
                C1168jm c1168jm = new C1168jm();
                CD b48 = CD.b(new Ak(c1119ih4, c1168jm, c0650Nf, 1));
                CD b49 = CD.b(new Ak(c1119ih4, c1168jm, c0650Nf, 0));
                CD b50 = CD.b(new C0555Ag((DD) c1119ih4, (DD) c1168jm, (DD) c0650Nf, c0554Af.f7688x, 8));
                CD b51 = CD.b(new C0847cd(c1168jm, c0650Nf, 17));
                C1565sf c1565sf2 = c0554Af.f7655g;
                CD b52 = CD.b(new C0555Ag(c1565sf2, c0650Nf, qj, c1168jm, 7));
                C1168jm.a(c1168jm, CD.b(new Dj(rVar3, cd6, c0650Nf, c1032gj4, qj, c1032gj, c1435pj, b48, b49, b50, b51, b52, new C0637Lg(c1565sf2, c1880zf2.f16681d, 2), c0554Af.f7613C, c1745wf2, c1565sf2, b47, b30, c0554Af.f7626J0)));
                CD cd8 = c1880zf2.f16670V0;
                CD cd9 = c1880zf2.f16654N0;
                CD b53 = CD.b(new Qj(b25, b20, cd8, b38, cd9, c1119ih, c1119ih3, b18, 2));
                CD b54 = CD.b(new a3.M(c0554Af.f7648c, b46, CD.b(new C0556Ah(c1880zf2.f16715v, c1119ih, 2)), b18, 3));
                CD b55 = CD.b(new C0595Fg(b25, b20, c1880zf2.f16670V0, b38, cd9, b34, c0554Af.f7688x, c0554Af.f7620G, c0554Af.f7617E, b18));
                if (((Boolean) rVar2.f5056c.a(a73)).booleanValue()) {
                    P2.o.f4767B.f4776j.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    pn = pn2;
                    pn.f.f14846c.putLong("rendering-ad-component-creation-end", currentTimeMillis);
                    pn.f.f14846c.putLong("rendering-configure-webview-start", currentTimeMillis);
                } else {
                    pn = pn2;
                }
                Kj kj = (Kj) c1880zf2.f16675a.f14827l;
                AbstractC1400ot.D(kj);
                AbstractC1400ot.D(gj);
                AbstractC1400ot.D(kk);
                C1381oa c1381oa = new C1381oa(kj, gj, kk, CD.a(b52));
                if (((Y8) c1381oa.f14803l) != null) {
                    ((Kk) c1381oa.f14804m).c("/nativeAdCustomClick", c1381oa);
                }
                Hk hk = (Hk) b53.d();
                Yh yh = hk.f9462b;
                Ek ek = kk.f10217a;
                Objects.requireNonNull(yh);
                ek.a(hk.f9461a, hk.f9463c, hk.f9464d, hk.f9465e, new Gk(0, yh));
                Lq lq4 = hk.f;
                Nq nq22 = hk.f9466g;
                C1074hg c1074hg = hk.f9467h;
                synchronized (kk) {
                    try {
                        C1582sw c1582sw = kk.f10227m;
                        if (c1582sw != null) {
                            try {
                                C1071hd c1071hd3 = new C1071hd(kk, lq4, nq22, c1074hg, 9, false);
                                c1582sw.a(new Kw(0, c1582sw, c1071hd3), kk.f10221e);
                            } catch (Throwable th) {
                                th = th;
                                kk = kk;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                final C1705vk c1705vk = (C1705vk) b54.d();
                InterfaceC0677Re R4 = gj.R();
                c1705vk.getClass();
                if (R4 != null) {
                    View K = R4.K();
                    Ti ti = c1705vk.f16030c;
                    ti.p1(K);
                    C1615tk c1615tk = new C1615tk(R4, 0);
                    Executor executor2 = c1705vk.f16028a;
                    ti.m1(c1615tk, executor2);
                    ti.m1(new C1615tk(R4, 1), executor2);
                    C1746wg c1746wg = c1705vk.f16029b;
                    ti.m1(c1746wg, executor2);
                    c1746wg.f16127k = R4;
                    C1028gf I5 = R4.I();
                    if (!((Boolean) rVar2.f5056c.a(F7.J9)).booleanValue() || I5 == null) {
                        i8 = 0;
                    } else {
                        I5.j("/click");
                        Vi vi = I5.f13623u;
                        C1074hg c1074hg2 = c1705vk.f16031d;
                        i8 = 0;
                        I5.a("/click", new C1641u9(0, vi, c1074hg2));
                        I5.i(c1074hg2, null, null);
                    }
                    R4.s0("/trackActiveViewUnit", new InterfaceC1821y9() { // from class: com.google.android.gms.internal.ads.uk
                        @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
                        public final void b(Object obj, Map map4) {
                            switch (i8) {
                                case 0:
                                    C1746wg c1746wg2 = c1705vk.f16029b;
                                    c1746wg2.f16131o = true;
                                    c1746wg2.a();
                                    break;
                                default:
                                    c1705vk.f16029b.f16131o = false;
                                    break;
                            }
                        }
                    });
                    final int i14 = 1;
                    R4.s0("/untrackActiveViewUnit", new InterfaceC1821y9() { // from class: com.google.android.gms.internal.ads.uk
                        @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
                        public final void b(Object obj, Map map4) {
                            switch (i14) {
                                case 0:
                                    C1746wg c1746wg2 = c1705vk.f16029b;
                                    c1746wg2.f16131o = true;
                                    c1746wg2.a();
                                    break;
                                default:
                                    c1705vk.f16029b.f16131o = false;
                                    break;
                            }
                        }
                    });
                }
                ((Mk) b55.d()).a(pn.f11119e, gj.P());
                if (((Boolean) rVar2.f5056c.a(a73)).booleanValue()) {
                    AbstractC0467k.C(P2.o.f4767B.f4776j, pn.f.f14846c, "rendering-configure-webview-end");
                }
                return (Cj) c1168jm.d();
            }
        };
        Dw dw2222 = new Dw(m5222, z6222, false);
        dw2222.f8420z = new Cw(dw2222, callable2222, this.f11116b);
        dw2222.w();
        return dw2222;
    }
}
