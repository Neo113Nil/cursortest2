package a3;

import Q2.X0;
import Q2.a1;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.BinderC0857cn;
import com.google.android.gms.internal.ads.Bq;
import com.google.android.gms.internal.ads.C0580Dh;
import com.google.android.gms.internal.ads.C0606Hd;
import com.google.android.gms.internal.ads.C0650Nf;
import com.google.android.gms.internal.ads.C0763ai;
import com.google.android.gms.internal.ads.C0769ao;
import com.google.android.gms.internal.ads.C0809bj;
import com.google.android.gms.internal.ads.C0852ci;
import com.google.android.gms.internal.ads.C0900dl;
import com.google.android.gms.internal.ads.C0936ed;
import com.google.android.gms.internal.ads.C0951es;
import com.google.android.gms.internal.ads.C1038gp;
import com.google.android.gms.internal.ads.C1040gr;
import com.google.android.gms.internal.ads.C1041gs;
import com.google.android.gms.internal.ads.C1119ih;
import com.google.android.gms.internal.ads.C1324n6;
import com.google.android.gms.internal.ads.C1343nh;
import com.google.android.gms.internal.ads.C1344ni;
import com.google.android.gms.internal.ads.C1388oh;
import com.google.android.gms.internal.ads.C1392ol;
import com.google.android.gms.internal.ads.C1482ql;
import com.google.android.gms.internal.ads.C1523ri;
import com.google.android.gms.internal.ads.C1565sf;
import com.google.android.gms.internal.ads.C1567sh;
import com.google.android.gms.internal.ads.C1610tf;
import com.google.android.gms.internal.ads.C1664uo;
import com.google.android.gms.internal.ads.C1706vl;
import com.google.android.gms.internal.ads.C1743wd;
import com.google.android.gms.internal.ads.C1745wf;
import com.google.android.gms.internal.ads.C1754wo;
import com.google.android.gms.internal.ads.C1773x6;
import com.google.android.gms.internal.ads.C1846yq;
import com.google.android.gms.internal.ads.CD;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.DD;
import com.google.android.gms.internal.ads.Dr;
import com.google.android.gms.internal.ads.ED;
import com.google.android.gms.internal.ads.Eo;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.G7;
import com.google.android.gms.internal.ads.Gp;
import com.google.android.gms.internal.ads.Gr;
import com.google.android.gms.internal.ads.Hh;
import com.google.android.gms.internal.ads.Hi;
import com.google.android.gms.internal.ads.Ho;
import com.google.android.gms.internal.ads.ID;
import com.google.android.gms.internal.ads.Ii;
import com.google.android.gms.internal.ads.Ik;
import com.google.android.gms.internal.ads.Kl;
import com.google.android.gms.internal.ads.Kw;
import com.google.android.gms.internal.ads.Lh;
import com.google.android.gms.internal.ads.Ll;
import com.google.android.gms.internal.ads.Nr;
import com.google.android.gms.internal.ads.Ot;
import com.google.android.gms.internal.ads.Pt;
import com.google.android.gms.internal.ads.Q4;
import com.google.android.gms.internal.ads.Qi;
import com.google.android.gms.internal.ads.Sq;
import com.google.android.gms.internal.ads.T7;
import com.google.android.gms.internal.ads.Uq;
import com.google.android.gms.internal.ads.Wk;
import com.google.android.gms.internal.ads.Xh;
import com.google.android.gms.internal.ads.Xm;
import com.google.android.gms.internal.ads.Xq;
import e2.C1930k;
import java.io.IOException;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import q3.C2308a;

/* loaded from: classes.dex */
public final class r implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6608a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final CD f6609b;

    /* renamed from: c, reason: collision with root package name */
    public final CD f6610c;

    /* renamed from: d, reason: collision with root package name */
    public final CD f6611d;

    /* renamed from: e, reason: collision with root package name */
    public final ID f6612e;
    public final ID f;

    /* renamed from: g, reason: collision with root package name */
    public final ID f6613g;

    /* renamed from: h, reason: collision with root package name */
    public final ID f6614h;
    public final ID i;

    /* renamed from: j, reason: collision with root package name */
    public final ID f6615j;

    public r(C1565sf c1565sf, C1388oh c1388oh, CD cd, CD cd2, CD cd3, Hh hh, CD cd4, CD cd5, CD cd6) {
        this.f6614h = c1565sf;
        this.i = c1388oh;
        this.f6609b = cd;
        this.f6610c = cd2;
        this.f6611d = cd3;
        this.f6615j = hh;
        this.f6612e = cd4;
        this.f = cd5;
        this.f6613g = cd6;
    }

    public G7 a() {
        Sq sq = (Sq) ((C1119ih) this.f6612e).f13965b.f13186l;
        AbstractC1400ot.D(sq);
        return new G7(sq, ((C1119ih) this.f).a(), (Xh) this.f6609b.d(), (C0763ai) this.f6613g.d(), ((Hi) this.f6614h).f9454b.f9224o, ((y) this.i).a(), (C1523ri) this.f6610c.d(), new C0852ci(((Lh) this.f6615j).f10455b.d()), (Qi) this.f6611d.d());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:53|(2:54|55)|(1:57)(7:64|65|66|67|68|69|(3:73|(1:78)(2:75|(1:77))|62))|58|59|61|62|51) */
    /* JADX WARN: Removed duplicated region for block: B:25:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0622  */
    @Override // com.google.android.gms.internal.ads.ID
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d() {
        C0580Dh c0580Dh;
        String string;
        BinderC0468l binderC0468l;
        u uVar;
        JSONObject jSONObject;
        String string2;
        JsonReader jsonReader;
        Iterator it;
        BinderC0468l binderC0468l2;
        long j5;
        P2.o oVar;
        long currentTimeMillis;
        A7 a7;
        Q2.r rVar;
        Map.Entry entry;
        E4.a f;
        long j6;
        switch (this.f6608a) {
            case 0:
                BinderC0468l binderC0468l3 = (BinderC0468l) this.f6609b.d();
                Gr gr = (Gr) this.f6610c.d();
                t tVar = (t) this.f6614h;
                tVar.getClass();
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd);
                s sVar = new s(c0606Hd, ((C0936ed) tVar.f6619b).a());
                C0580Dh a5 = ((C0469m) this.i).a();
                C0809bj c0809bj = (C0809bj) this.f6611d.d();
                o oVar2 = (o) ((CD) this.f6612e).d();
                C1743wd c1743wd = (C1743wd) ((CD) this.f).d();
                int intValue = ((Integer) ((CD) this.f6613g).d()).intValue();
                Bundle bundle = ((Hh) this.f6615j).a().f12111s;
                u uVar2 = null;
                if (intValue != 1) {
                    c0580Dh = a5;
                } else if (c1743wd == null) {
                    c0580Dh = a5;
                } else {
                    P2.o oVar3 = P2.o.f4767B;
                    oVar3.f4776j.getClass();
                    bundle.putLong("read-from-disk-start", System.currentTimeMillis());
                    oVar2.getClass();
                    o.c(30, bundle);
                    if (oVar3.f4774g.d().n()) {
                        oVar2.f6598b.f();
                        o.d(7, bundle);
                    } else if (oVar2.f6601e == null) {
                        oVar2.f6598b.f();
                        o.d(10, bundle);
                    } else {
                        z zVar = oVar2.f6598b;
                        Context context = oVar2.f6597a;
                        zVar.h();
                        synchronized (zVar.f6644d) {
                            string = zVar.f6641a.getString("pn", null);
                        }
                        int b3 = zVar.b();
                        String d5 = zVar.d();
                        int a6 = zVar.a();
                        if (TextUtils.equals(context.getApplicationInfo().packageName, string) && b3 == oVar2.f6601e.versionCode && TextUtils.equals(Build.MODEL, d5) && a6 == Build.VERSION.SDK_INT) {
                            for (Iterator it2 = oVar2.f6598b.e().entrySet().iterator(); it2.hasNext(); it2 = it) {
                                Map.Entry entry2 = (Map.Entry) it2.next();
                                try {
                                    j5 = new JSONObject((String) entry2.getValue()).getLong("ts_ms");
                                    oVar = P2.o.f4767B;
                                    oVar.f4776j.getClass();
                                    currentTimeMillis = System.currentTimeMillis() - j5;
                                    a7 = F7.i7;
                                    rVar = Q2.r.f5053d;
                                } catch (IOException | JSONException unused) {
                                    it = it2;
                                }
                                if (currentTimeMillis > ((Long) rVar.f5056c.a(a7)).longValue()) {
                                    it = it2;
                                    entry = entry2;
                                    binderC0468l2 = binderC0468l3;
                                } else {
                                    it = it2;
                                    try {
                                        entry = entry2;
                                        binderC0468l2 = binderC0468l3;
                                        E4.a f5 = Ot.g(oVar2.f6597a).f(((Long) rVar.f5056c.a(F7.f8832g3)).longValue(), oVar.f4774g.d().n());
                                        f = Pt.g(oVar2.f6597a).f(((Long) rVar.f5056c.a(F7.h3)).longValue(), oVar.f4774g.d().n());
                                        j6 = f5.f1485k;
                                    } catch (IOException | JSONException unused2) {
                                        binderC0468l2 = binderC0468l3;
                                        binderC0468l3 = binderC0468l2;
                                    }
                                    if (j6 == -1 || j6 <= j5) {
                                        long j7 = f.f1485k;
                                        if (j7 != -1) {
                                            if (j7 <= j5) {
                                            }
                                        }
                                        binderC0468l3 = binderC0468l2;
                                    }
                                }
                                oVar2.f6598b.c((String) entry.getKey());
                                binderC0468l3 = binderC0468l2;
                            }
                            binderC0468l = binderC0468l3;
                        } else {
                            binderC0468l = binderC0468l3;
                            oVar2.f6598b.f();
                            z zVar2 = oVar2.f6598b;
                            String str = oVar2.f6597a.getApplicationInfo().packageName;
                            int i = oVar2.f6601e.versionCode;
                            String str2 = Build.MODEL;
                            zVar2.g(i, Build.VERSION.SDK_INT, str);
                        }
                        o.c(31, bundle);
                        P2.o.f4767B.f4776j.getClass();
                        long currentTimeMillis2 = System.currentTimeMillis() - oVar2.f6599c;
                        A7 a72 = F7.f7;
                        Q2.r rVar2 = Q2.r.f5053d;
                        if (currentTimeMillis2 > ((Long) rVar2.f5056c.a(a72)).longValue()) {
                            o.d(2, bundle);
                            c0580Dh = a5;
                        } else {
                            o.c(32, bundle);
                            String str3 = c1743wd.f16117k;
                            String str4 = c1743wd.f16118l;
                            String bundle2 = c1743wd.f16120n.f4970x.toString();
                            String bundle3 = c1743wd.f16120n.f4959m.toString();
                            X0 x02 = c1743wd.f16120n;
                            c0580Dh = a5;
                            String n5 = U2.e.n(str3 + str4 + bundle2 + bundle3 + x02.f4965s + x02.f4972z + String.valueOf(x02.f4971y), "SHA-256");
                            if (TextUtils.isEmpty(n5)) {
                                o.d(3, bundle);
                            } else {
                                o.c(33, bundle);
                                o.c(34, bundle);
                                String c5 = oVar2.f6598b.c(n5);
                                o.c(35, bundle);
                                if (!oVar2.b()) {
                                    oVar2.f6600d.schedule(new K2.e(oVar2, n5, binderC0468l, new C1743wd(c1743wd.f16117k, c1743wd.f16118l, c1743wd.f16119m, c1743wd.f16120n, 2, n5), 4), ((Long) rVar2.f5056c.a(F7.h7)).longValue(), TimeUnit.MILLISECONDS);
                                }
                                if (TextUtils.isEmpty(c5)) {
                                    o.d(4, bundle);
                                } else {
                                    o.c(36, bundle);
                                    try {
                                        jSONObject = new JSONObject(c5);
                                        string2 = jSONObject.getString("sr");
                                    } catch (JSONException e3) {
                                        uVar = null;
                                        o.d(5, bundle);
                                        P2.o.f4767B.f4774g.i("DiskCachingManager.getSignalResponse", e3);
                                    }
                                    if (TextUtils.isEmpty(string2)) {
                                        o.d(8, bundle);
                                    } else {
                                        String string3 = jSONObject.getString("rs");
                                        if (TextUtils.isEmpty(string3)) {
                                            o.d(9, bundle);
                                        } else {
                                            String a8 = o.a(new String(Base64.decode(string3, 10), StandardCharsets.UTF_8));
                                            o.c(37, bundle);
                                            try {
                                                jsonReader = new JsonReader(new StringReader(string2));
                                                uVar = null;
                                            } catch (IOException e5) {
                                                e = e5;
                                                uVar = null;
                                            }
                                            try {
                                                u uVar3 = new u(jsonReader, null);
                                                uVar3.f6622c = a8;
                                                uVar3.f6624e = bundle;
                                                bundle.putBoolean("sod_h", true);
                                                uVar2 = uVar3;
                                            } catch (IOException e6) {
                                                e = e6;
                                                o.d(6, bundle);
                                                P2.o.f4767B.f4774g.i("DiskCachingManager.getSignalResponse", e);
                                                uVar2 = uVar;
                                                AbstractC0467k.C(P2.o.f4767B.f4776j, bundle, "read-from-disk-end");
                                                if (uVar2 == null) {
                                                }
                                            }
                                            AbstractC0467k.C(P2.o.f4767B.f4776j, bundle, "read-from-disk-end");
                                        }
                                    }
                                }
                            }
                        }
                        uVar2 = null;
                        AbstractC0467k.C(P2.o.f4767B.f4776j, bundle, "read-from-disk-end");
                    }
                    c0580Dh = a5;
                    AbstractC0467k.C(P2.o.f4767B.f4776j, bundle, "read-from-disk-end");
                }
                if (uVar2 == null) {
                    c0809bj.p1(uVar2);
                    return AbstractC1400ot.c0(uVar2);
                }
                C1324n6 p5 = gr.a(c0580Dh.f(), Dr.f8382D).p(sVar);
                long intValue2 = ((Integer) Q2.r.f5053d.f5056c.a(F7.m5)).intValue();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Cr a9 = p5.t(intValue2).a();
                a9.a(new Kw(0, a9, new C1930k(21, c0809bj)), AbstractC0613Id.f9539a);
                return a9;
            case 1:
                return a();
            case 2:
                return new Ik(((C1565sf) this.f6614h).a(), (Executor) this.f6609b.d(), (Q4) this.f6610c.d(), ((C1745wf) this.i).a(), C0650Nf.b(), (Xm) this.f6611d.d(), (C1041gs) ((CD) this.f6612e).d(), (C1482ql) ((CD) this.f).d(), (BinderC0857cn) ((CD) this.f6613g).d(), (Xq) ((CD) this.f6615j).d());
            case 3:
                Context context2 = (Context) this.f6609b.d();
                Q4 q42 = (Q4) this.f6610c.d();
                T7 t7 = (T7) this.f6611d.d();
                U2.a a10 = ((C1745wf) this.f6614h).a();
                Object obj = ((C0650Nf) this.i).f10799b;
                return new Wk(context2, q42, t7, a10, C0650Nf.b(), (C1773x6) ((CD) this.f6612e).d(), (C1344ni) ((DD) this.f6615j).d(), (BinderC0857cn) ((CD) this.f).d(), (Xq) ((CD) this.f6613g).d());
            case 4:
                Executor executor = (Executor) this.f6609b.d();
                Context a11 = ((C1565sf) this.f6613g).a();
                WeakReference weakReference = (WeakReference) ((C1610tf) this.f6614h).f15696b.f14812d;
                AbstractC1400ot.D(weakReference);
                C0606Hd c0606Hd2 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd2);
                return new Kl(executor, a11, weakReference, c0606Hd2, (C0900dl) this.f6610c.d(), (ScheduledExecutorService) this.f6611d.d(), (C1706vl) ((CD) this.f6612e).d(), ((C1745wf) this.i).a(), new Ii(((Lh) this.f6615j).f10455b.d()), (Nr) ((CD) this.f).d());
            case 5:
                return new Ho((Context) ((ED) this.f6613g).f8474a, (a1) ((ED) this.f6614h).f8474a, (String) ((ED) this.i).f8474a, (C1846yq) this.f6609b.d(), (Eo) this.f6610c.d(), (Bq) this.f6611d.d(), ((C1745wf) this.f6615j).a(), (Q4) ((CD) this.f6612e).d(), (C1482ql) ((CD) this.f).d());
            case 6:
                Context a12 = ((C1565sf) this.f6614h).a();
                String str5 = ((C1343nh) ((C1388oh) this.i).f14825b.d()).f14681l.f16614e;
                AbstractC1400ot.D(str5);
                return new C1038gp(a12, str5, (String) this.f6609b.d(), (C1343nh) this.f6610c.d(), (C1040gr) this.f6611d.d(), ((Hh) this.f6615j).a(), (C1392ol) ((CD) this.f6612e).d(), (C1567sh) ((CD) this.f).d(), ((Long) ((CD) this.f6613g).d()).longValue());
            case 7:
                C0606Hd c0606Hd3 = AbstractC0613Id.f9539a;
                AbstractC1400ot.D(c0606Hd3);
                return new Gp(c0606Hd3, (ScheduledExecutorService) this.f6609b.d(), (String) this.f6614h.d(), (C1754wo) this.f6610c.d(), (Context) this.f6611d.d(), ((Hh) this.f6615j).a(), (C1664uo) ((CD) this.f6612e).d(), (C0900dl) ((CD) this.f).d(), (Ll) ((CD) this.f6613g).d(), ((Integer) ((CD) this.i).d()).intValue());
            default:
                C0769ao c0769ao = (C0769ao) this.f6609b.d();
                U2.a a13 = ((C1745wf) this.f6614h).a();
                String str6 = ((C1343nh) ((C1388oh) this.i).f14825b.d()).f14681l.f16614e;
                AbstractC1400ot.D(str6);
                return new C0951es(c0769ao, a13, str6, (String) this.f6610c.d(), (Context) this.f6611d.d(), ((Hh) this.f6615j).f9452b.f9209d, (Uq) ((CD) this.f6612e).d(), (C2308a) ((CD) this.f).d(), (Q4) ((CD) this.f6613g).d());
        }
    }

    public r(C1565sf c1565sf, CD cd, CD cd2, C1745wf c1745wf, C0650Nf c0650Nf, CD cd3, CD cd4, CD cd5, CD cd6, CD cd7) {
        this.f6614h = c1565sf;
        this.f6609b = cd;
        this.f6610c = cd2;
        this.i = c1745wf;
        this.f6611d = cd3;
        this.f6612e = cd4;
        this.f = cd5;
        this.f6613g = cd6;
        this.f6615j = cd7;
    }

    public r(C1119ih c1119ih, C1119ih c1119ih2, CD cd, ID id, Hi hi, y yVar, CD cd2, Lh lh, CD cd3) {
        this.f6612e = c1119ih;
        this.f = c1119ih2;
        this.f6609b = cd;
        this.f6613g = id;
        this.f6614h = hi;
        this.i = yVar;
        this.f6610c = cd2;
        this.f6615j = lh;
        this.f6611d = cd3;
    }

    public r(CD cd, C1565sf c1565sf, C1610tf c1610tf, CD cd2, CD cd3, CD cd4, C1745wf c1745wf, Lh lh, CD cd5) {
        this.f6609b = cd;
        this.f6613g = c1565sf;
        this.f6614h = c1610tf;
        this.f6610c = cd2;
        this.f6611d = cd3;
        this.f6612e = cd4;
        this.i = c1745wf;
        this.f6615j = lh;
        this.f = cd5;
    }

    public r(CD cd, C1745wf c1745wf, C1388oh c1388oh, CD cd2, CD cd3, Hh hh, CD cd4, CD cd5, CD cd6) {
        this.f6609b = cd;
        this.f6614h = c1745wf;
        this.i = c1388oh;
        this.f6610c = cd2;
        this.f6611d = cd3;
        this.f6615j = hh;
        this.f6612e = cd4;
        this.f = cd5;
        this.f6613g = cd6;
    }

    public r(CD cd, CD cd2, t tVar, C0469m c0469m, CD cd3, CD cd4, CD cd5, CD cd6, Hh hh) {
        this.f6609b = cd;
        this.f6610c = cd2;
        this.f6614h = tVar;
        this.i = c0469m;
        this.f6611d = cd3;
        this.f6612e = cd4;
        this.f = cd5;
        this.f6613g = cd6;
        this.f6615j = hh;
    }

    public r(CD cd, CD cd2, CD cd3, C1745wf c1745wf, C0650Nf c0650Nf, CD cd4, DD dd, CD cd5, CD cd6) {
        this.f6609b = cd;
        this.f6610c = cd2;
        this.f6611d = cd3;
        this.f6614h = c1745wf;
        this.i = c0650Nf;
        this.f6612e = cd4;
        this.f6615j = dd;
        this.f = cd5;
        this.f6613g = cd6;
    }

    public r(CD cd, ID id, CD cd2, CD cd3, Hh hh, CD cd4, CD cd5, CD cd6, CD cd7) {
        this.f6609b = cd;
        this.f6614h = id;
        this.f6610c = cd2;
        this.f6611d = cd3;
        this.f6615j = hh;
        this.f6612e = cd4;
        this.f = cd5;
        this.f6613g = cd6;
        this.i = cd7;
    }

    public r(ED ed, ED ed2, ED ed3, CD cd, CD cd2, CD cd3, C1745wf c1745wf, CD cd4, CD cd5) {
        this.f6613g = ed;
        this.f6614h = ed2;
        this.i = ed3;
        this.f6609b = cd;
        this.f6610c = cd2;
        this.f6611d = cd3;
        this.f6615j = c1745wf;
        this.f6612e = cd4;
        this.f = cd5;
    }
}
