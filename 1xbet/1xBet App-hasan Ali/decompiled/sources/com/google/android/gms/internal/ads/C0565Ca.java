package com.google.android.gms.internal.ads;

import Q2.C0379q;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
import q3.AbstractC2309b;

/* renamed from: com.google.android.gms.internal.ads.Ca, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0565Ca implements InterfaceC1897zw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7995c;

    public /* synthetic */ C0565Ca(int i, Object obj, Object obj2) {
        this.f7993a = i;
        this.f7994b = obj;
        this.f7995c = obj2;
    }

    private final E3.a a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Pn pn = (Pn) this.f7994b;
        pn.getClass();
        Mw c02 = AbstractC1400ot.c0((Kk) this.f7995c);
        C0995fr c0995fr = pn.f11118d;
        synchronized (c0995fr) {
            c0995fr.f13508a.addFirst(c02);
        }
        if (jSONObject.optBoolean("success")) {
            return AbstractC1400ot.c0(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new C1650ua("process json failed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        ((com.google.android.gms.internal.ads.C1218kr) r4.f13188n).f14296e++;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC1897zw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final E3.a k(Object obj) {
        int i;
        C1398or c1398or;
        int i5 = 9;
        int i6 = 6;
        int i7 = 5;
        int i8 = 0;
        switch (this.f7993a) {
            case 0:
                InterfaceC1560sa interfaceC1560sa = (InterfaceC1560sa) obj;
                interfaceC1560sa.b((String) this.f7994b, (InterfaceC1821y9) this.f7995c);
                return AbstractC1400ot.c0(interfaceC1560sa);
            case 1:
                ((C0581Ea) this.f7994b).getClass();
                C0634Ld c0634Ld = new C0634Ld();
                T2.L l5 = P2.o.f4767B.f4771c;
                String uuid = UUID.randomUUID().toString();
                AbstractC1776x9.f16254o.c(uuid, new F9(c0634Ld, 1));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", uuid);
                jSONObject.put("args", (JSONObject) this.f7995c);
                ((InterfaceC1560sa) obj).o("google.afma.activeView.handleUpdate", jSONObject);
                return c0634Ld;
            case 2:
                C1074hg c1074hg = (C1074hg) this.f7994b;
                c1074hg.getClass();
                c1074hg.f13774e.b(new RunnableC0984fg(c1074hg, (Throwable) obj, 0));
                String str = (String) Q2.r.f5053d.f5056c.a(F7.N9);
                Uri.Builder builder = (Uri.Builder) this.f7995c;
                builder.appendQueryParameter(str, "9");
                return AbstractC1400ot.c0(builder.toString());
            case 3:
                C1428pc c1428pc = (C1428pc) obj;
                C1253lh c1253lh = (C1253lh) this.f7994b;
                c1428pc.f15003s = (C1353nr) this.f7995c;
                C0905dr c0905dr = c1253lh.f14398h;
                return c0905dr.K(c1428pc, new U4(20, (C1572sm) c0905dr.f13187m), new C1529ro(23, c0905dr), new C0990fm(c1428pc, 2));
            case 4:
                C1391ok c1391ok = (C1391ok) this.f7995c;
                c1391ok.getClass();
                V9 v9 = P2.o.f4767B.f4772d;
                InterfaceC0677Re f = V9.f(c1391ok.f14833e, c1391ok.f14832d, c1391ok.f14829a, new C1586t(0, 0, 0), c1391ok.f14831c, c1391ok.f, null, c1391ok.f14842p, null, null, c1391ok.f14843q, null, "native-omid", false, false);
                C1548s6 c1548s6 = new C1548s6(f);
                f.I().f13619q = new U4(17, c1548s6);
                boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.W4)).booleanValue();
                String str2 = (String) this.f7994b;
                if (booleanValue) {
                    f.loadData(Base64.encodeToString(str2.getBytes(), 1), "text/html", "base64");
                } else {
                    f.loadData(str2, "text/html", "UTF-8");
                }
                return c1548s6;
            case 5:
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
                C1750wk c1750wk = (C1750wk) this.f7994b;
                Wq wq = c1750wk.f16144a;
                C1548s6 c1548s62 = new C1548s6(interfaceC0677Re);
                if (wq.f12096b != null) {
                    i = 0;
                    interfaceC0677Re.K0(new C1586t(5, 0, 0));
                } else {
                    i = 0;
                    interfaceC0677Re.K0(new C1586t(4, 0, 0));
                }
                interfaceC0677Re.I().f13619q = new C1570sk(c1750wk, interfaceC0677Re, c1548s62, i);
                interfaceC0677Re.o("google.afma.nativeAds.renderVideo", (JSONObject) this.f7995c);
                return c1548s62;
            case 6:
                return ((InterfaceC1752wm) ((ID) this.f7994b).d()).a((C1428pc) this.f7995c);
            case 7:
                Bundle bundle = (Bundle) obj;
                C1071hd c1071hd = (C1071hd) this.f7994b;
                C0554Af c0554Af = (C0554Af) c1071hd.f13764o;
                Context context = (Context) c0554Af.f7644a.f14810b;
                AbstractC1400ot.D(context);
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                C2.h hVar = (C2.h) c1071hd.f13761l;
                C1428pc c1428pc2 = (C1428pc) hVar.f834m;
                AbstractC1400ot.D(c1428pc2.f14998n);
                Yp yp = new Yp();
                CD cd = c0554Af.f7650d;
                C1890zp c1890zp = new C1890zp(yp, 0L, (ScheduledExecutorService) cd.d());
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) cd.d();
                Context context2 = (Context) c0554Af.f7644a.f14810b;
                AbstractC1400ot.D(context2);
                C1890zp c1890zp2 = new C1890zp(new Mo(i6, scheduledExecutorService), ((Long) Q2.r.f5053d.f5056c.a(F7.f8806b4)).longValue(), (ScheduledExecutorService) cd.d());
                V9 v92 = new V9(16);
                AbstractC1400ot.D(context2);
                C1890zp c1890zp3 = new C1890zp(new Up(v92, context2, (ScheduledExecutorService) cd.d(), c0606Hd, hVar.f833l, c1428pc2.f15006v, c1428pc2.f15005u), 0L, (ScheduledExecutorService) cd.d());
                C1890zp c1890zp4 = new C1890zp(new C1441pp(c0606Hd, 4), 0L, (ScheduledExecutorService) cd.d());
                AbstractC1400ot.D(context2);
                C1441pp c1441pp = new C1441pp(c0606Hd, 3);
                AbstractC1400ot.D(c0606Hd);
                ArrayList arrayList = ((C1428pc) hVar.f834m).f14999o;
                AbstractC1400ot.D(arrayList);
                Qo qo = new Qo(7, c0606Hd, arrayList);
                c1071hd.getClass();
                C0606Hd c0606Hd2 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd2);
                C1428pc c1428pc3 = (C1428pc) ((C2.h) c1071hd.f13761l).f834m;
                String string = c1428pc3.f14995k.getString("ms");
                if (string == null) {
                    string = "";
                }
                PackageInfo packageInfo = c1428pc3.f15000p;
                Qo qo2 = new Qo(6, c0606Hd2, string);
                Mp mp = (Mp) c0554Af.f7629L0.d();
                AbstractC1400ot.D(c1428pc2.f14998n);
                Mp[] mpArr = {qo2, mp, new Vo((C0568Cd) c0554Af.f7632O.d(), (ScheduledExecutorService) cd.d(), c0606Hd)};
                int i9 = AbstractC1177jv.f14189m;
                Object[] objArr = new Object[9];
                objArr[0] = c1890zp;
                objArr[1] = c1890zp2;
                objArr[2] = c1890zp3;
                objArr[3] = c1890zp4;
                objArr[4] = c1441pp;
                objArr[5] = qo;
                System.arraycopy(mpArr, 0, objArr, 6, 3);
                return new Op(context, c0606Hd, AbstractC1177jv.m(9, objArr), (Mr) ((CD) c1071hd.f13762m).d(), (C1482ql) c0554Af.f7688x.d()).a(C0379q.f.f5048a.f(bundle), ((C1428pc) this.f7995c).f15007w, false);
            case 8:
                return ((Op) this.f7994b).a(C0379q.f.f5048a.f((Bundle) obj), ((C1428pc) this.f7995c).f15007w, false);
            case 9:
                return a(obj);
            case 10:
                Kk kk = (Kk) obj;
                Pn pn = (Pn) this.f7994b;
                pn.getClass();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("isNonagon", true);
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.m8)).booleanValue() && AbstractC2309b.f()) {
                    jSONObject2.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("response", ((Lq) this.f7995c).f10523s.f11128c);
                jSONObject3.put("sdk_params", jSONObject2);
                return AbstractC1400ot.j0(kk.a("google.afma.nativeAds.preProcessJson", jSONObject3), new C0565Ca(i5, pn, kk), pn.f11116b);
            case 11:
                Sq sq = (Sq) obj;
                ((C1398or) this.f7994b).f14865b = sq;
                Iterator it = ((List) sq.f11596b.f13761l).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((Lq) it.next()).f10489a.iterator();
                        while (it2.hasNext()) {
                            if (((String) it2.next()).contains("FirstPartyRenderer")) {
                                i8 = 1;
                            }
                        }
                    } else if (i8 != 0) {
                        return ((C1253lh) this.f7995c).a(AbstractC1400ot.c0(sq));
                    }
                }
                return Mw.f10750l;
            default:
                C0905dr c0905dr2 = (C0905dr) this.f7994b;
                InterfaceC0588Eh interfaceC0588Eh = (InterfaceC0588Eh) this.f7995c;
                C1397oq c1397oq = (C1397oq) obj;
                C0905dr c0905dr3 = (C0905dr) c0905dr2.f13186l;
                InterfaceC1443pr interfaceC1443pr = c1397oq.f14863b;
                C1428pc c1428pc4 = c1397oq.f14862a;
                synchronized (c0905dr3) {
                    try {
                        C1129ir c1129ir = (C1129ir) ((ConcurrentHashMap) c0905dr3.f13186l).get(interfaceC1443pr);
                        c1398or = null;
                        if (c1129ir != null) {
                            C1802xr c1802xr = c1129ir.f14012d;
                            c1802xr.getClass();
                            P2.o.f4767B.f4776j.getClass();
                            c1802xr.f16340c = System.currentTimeMillis();
                            c1802xr.f16341d++;
                            c1129ir.a();
                            LinkedList linkedList = c1129ir.f14009a;
                            if (!linkedList.isEmpty() && (c1398or = (C1398or) linkedList.remove()) != null) {
                                c1802xr.f16342e++;
                                c1802xr.f16339b.f16174k = true;
                                break;
                            }
                            C1757wr c1757wr = c1129ir.f14012d.f16339b;
                            C1757wr clone = c1757wr.clone();
                            c1757wr.f16174k = false;
                            c1757wr.f16175l = 0;
                            if (c1398or != null) {
                                W6 w5 = C0789b7.w();
                                U6 z3 = V6.z();
                                z3.e();
                                V6.w((V6) z3.f10141l);
                                X6 w6 = Y6.w();
                                boolean z5 = clone.f16174k;
                                w6.e();
                                Y6.y((Y6) w6.f10141l, z5);
                                int i10 = clone.f16175l;
                                w6.e();
                                Y6.z((Y6) w6.f10141l, i10);
                                z3.e();
                                V6.x((V6) z3.f10141l, (Y6) w6.b());
                                w5.e();
                                C0789b7.x((C0789b7) w5.f10141l, (V6) z3.b());
                                c1398or.f14864a.d().f.y((C0789b7) w5.b());
                            }
                            c0905dr3.I();
                        } else {
                            ((C1218kr) c0905dr3.f13188n).f14295d++;
                            c0905dr3.I();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (c1398or != null && c1428pc4 != null) {
                    C1253lh d5 = interfaceC0588Eh.d();
                    Dr dr = Dr.f8384F;
                    C0905dr c0905dr4 = d5.f14398h;
                    Cr a5 = d5.f14394c.a(c0905dr4.K(c1428pc4, new Mt(25, c0905dr4), new Qt(21, c0905dr4), new C0727Yf(i7)), dr).a();
                    a5.a(new Kw(i8, a5, new C1529ro(14, d5)), d5.f14399j);
                    a5.a(new Kw(i8, a5, (Oi) c0905dr2.f13188n), (Qw) c0905dr2.f13187m);
                }
                return AbstractC1400ot.c0(new C1262lq(interfaceC1443pr, c1428pc4, c1398or));
        }
    }

    public /* synthetic */ C0565Ca(C1391ok c1391ok, String str) {
        this.f7993a = 4;
        this.f7995c = c1391ok;
        this.f7994b = str;
    }
}
