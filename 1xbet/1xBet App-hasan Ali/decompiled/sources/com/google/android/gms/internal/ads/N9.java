package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.net.Uri;
import android.os.Parcel;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class N9 implements InterfaceC1897zw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10779b;

    public /* synthetic */ N9(int i, Object obj) {
        this.f10778a = i;
        this.f10779b = obj;
    }

    private final E3.a a(Object obj) {
        Fs fs = (Fs) this.f10779b;
        Exception exc = (Exception) obj;
        synchronized (fs) {
            fs.f9136b = true;
            throw exc;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1897zw
    public final E3.a k(Object obj) {
        C1063hD c1063hD;
        C1582sw h02;
        C1398or c1398or;
        C1172jq c1172jq;
        switch (this.f10778a) {
            case 0:
                L9 l9 = (L9) obj;
                C0634Ld c0634Ld = new C0634Ld();
                M9 m9 = new M9(c0634Ld);
                Parcel N5 = l9.N();
                F5.c(N5, (J9) this.f10779b);
                F5.e(N5, m9);
                l9.h1(N5, 2);
                return c0634Ld;
            case 1:
                C0724Yc c0724Yc = (C0724Yc) this.f10779b;
                Map map = (Map) obj;
                c0724Yc.getClass();
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (optJSONArray != null) {
                                synchronized (c0724Yc.f12343h) {
                                    try {
                                        int length = optJSONArray.length();
                                        synchronized (c0724Yc.f12343h) {
                                            c1063hD = (C1063hD) c0724Yc.f12338b.get(str);
                                        }
                                        if (c1063hD == null) {
                                            AbstractC1803xs.n("Cannot find the corresponding resource object for " + str);
                                        } else {
                                            for (int i = 0; i < length; i++) {
                                                String string = optJSONArray.getJSONObject(i).getString("threat_type");
                                                c1063hD.e();
                                                C1108iD.z((C1108iD) c1063hD.f10141l, string);
                                            }
                                            c0724Yc.f = (length > 0) | c0724Yc.f;
                                        }
                                    } finally {
                                    }
                                }
                            }
                        }
                    } catch (JSONException e3) {
                        if (((Boolean) AbstractC1416p8.f14970a.s()).booleanValue()) {
                            U2.j.e("Failed to get SafeBrowsing metadata", e3);
                        }
                        return AbstractC1400ot.Z(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (c0724Yc.f) {
                    synchronized (c0724Yc.f12343h) {
                        LC lc = c0724Yc.f12337a;
                        lc.e();
                        C1331nD.K((C1331nD) lc.f10141l, 10);
                    }
                }
                boolean z3 = c0724Yc.f;
                if (!(z3 && c0724Yc.f12342g.f12492q) && (!(c0724Yc.f12345k && c0724Yc.f12342g.f12491p) && (z3 || !c0724Yc.f12342g.f12489n))) {
                    return Mw.f10750l;
                }
                synchronized (c0724Yc.f12343h) {
                    try {
                        for (C1063hD c1063hD2 : c0724Yc.f12338b.values()) {
                            LC lc2 = c0724Yc.f12337a;
                            C1108iD c1108iD = (C1108iD) c1063hD2.b();
                            lc2.e();
                            C1331nD.C((C1331nD) lc2.f10141l, c1108iD);
                        }
                        LC lc3 = c0724Yc.f12337a;
                        ArrayList arrayList = c0724Yc.f12339c;
                        lc3.e();
                        C1331nD.A((C1331nD) lc3.f10141l, arrayList);
                        LC lc4 = c0724Yc.f12337a;
                        ArrayList arrayList2 = c0724Yc.f12340d;
                        lc4.e();
                        C1331nD.B((C1331nD) lc4.f10141l, arrayList2);
                        if (((Boolean) AbstractC1416p8.f14970a.s()).booleanValue()) {
                            StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + ((C1331nD) c0724Yc.f12337a.f10141l).y() + "\n  clickUrl: " + ((C1331nD) c0724Yc.f12337a.f10141l).x() + "\n  resources: \n");
                            for (C1108iD c1108iD2 : Collections.unmodifiableList(((C1331nD) c0724Yc.f12337a.f10141l).z())) {
                                sb.append("    [");
                                sb.append(c1108iD2.w());
                                sb.append("] ");
                                sb.append(c1108iD2.y());
                            }
                            AbstractC1803xs.n(sb.toString());
                        }
                        byte[] d5 = ((C1331nD) c0724Yc.f12337a.b()).d();
                        String str2 = c0724Yc.f12342g.f12487l;
                        new T2.v(c0724Yc.f12341e);
                        T2.t a5 = T2.v.a(1, str2, null, d5);
                        if (((Boolean) AbstractC1416p8.f14970a.s()).booleanValue()) {
                            a5.f10334k.a(new C4(1), AbstractC0613Id.f9539a);
                        }
                        h02 = AbstractC1400ot.h0(a5, new C1364o1(3), AbstractC0613Id.f9544g);
                    } finally {
                    }
                }
                return h02;
            case 2:
                String str3 = (String) Q2.r.f5053d.f5056c.a(F7.N9);
                Uri.Builder builder = (Uri.Builder) this.f10779b;
                builder.appendQueryParameter(str3, "12");
                return AbstractC1400ot.c0(builder.toString());
            case 3:
                ((C0375o) this.f10779b).u((Throwable) obj);
                return Mw.f10750l;
            case 4:
                return ((C1707vm) this.f10779b).a((C1428pc) obj);
            case 5:
                return obj != null ? (C1582sw) this.f10779b : AbstractC1400ot.Z(new C0858co("Retrieve required value in native ad response failed.", 1));
            case 6:
                Q2.a1 b3 = Q2.a1.b();
                C1750wk c1750wk = (C1750wk) this.f10779b;
                InterfaceC0677Re a6 = c1750wk.f16146c.a(b3, null, null);
                C1548s6 c1548s6 = new C1548s6(a6);
                c1750wk.a(a6);
                a6.I().f13620r = new Qt(18, c1548s6);
                a6.loadUrl((String) Q2.r.f5053d.f5056c.a(F7.f8704I3));
                return c1548s6;
            case 7:
                C1842ym c1842ym = (C1842ym) obj;
                return AbstractC1400ot.c0(new Sq(new U4(27, ((C1213km) this.f10779b).f14280c), C1071hd.n(new InputStreamReader(c1842ym.f16473a), c1842ym.f16474b)));
            case 8:
                String str4 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str5 = (String) this.f10779b;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str4);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str5));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return AbstractC1400ot.c0(jSONObject);
                } catch (JSONException e5) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e5.getCause())));
                }
            case 9:
                return ((P2.c) this.f10779b).b((JSONObject) obj);
            case 10:
                return AbstractC1400ot.c0(new Sq(new U4(27, ((C1258lm) this.f10779b).f14414d), C1071hd.n(new StringReader(((JSONObject) obj).toString()), null)));
            case 11:
                Throwable th = (Throwable) obj;
                C1890zp c1890zp = (C1890zp) this.f10779b;
                c1890zp.getClass();
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8836h2)).booleanValue()) {
                    P2.o.f4767B.f4774g.i("OptionalSignalTimeout:" + c1890zp.f16772a.a(), th);
                }
                return Mw.f10750l;
            case 12:
                Throwable th2 = (Throwable) obj;
                ((Sp) this.f10779b).f11591c.b(new RunnableC1303mm(5, th2));
                String str6 = "";
                return AbstractC1400ot.c0(th2 instanceof SecurityException ? new C0993fp(2, 2, str6) : th2 instanceof IllegalStateException ? new C0993fp(3, 2, str6) : th2 instanceof IllegalArgumentException ? new C0993fp(4, 2, str6) : th2 instanceof TimeoutException ? new C0993fp(5, 2, str6) : new C0993fp(0, 2, str6));
            case 13:
                return AbstractC1400ot.c0(new To((String) ((Qo) this.f10779b).f11262c, 4));
            case 14:
                C1712vr c1712vr = (C1712vr) obj;
                C1324n6 c1324n6 = (C1324n6) this.f10779b;
                c1324n6.getClass();
                if (c1712vr == null || (c1398or = c1712vr.f16053a) == null || (c1172jq = c1712vr.f16054b) == null) {
                    throw new C0856cm("Empty prefetch", 1);
                }
                W6 w5 = C0789b7.w();
                U6 z5 = V6.z();
                z5.e();
                V6.w((V6) z5.f10141l);
                Y6 x5 = Y6.x();
                z5.e();
                V6.x((V6) z5.f10141l, x5);
                w5.e();
                C0789b7.x((C0789b7) w5.f10141l, (V6) z5.b());
                c1398or.f14864a.d().f.o((C0789b7) w5.b());
                return c1324n6.q(c1398or, c1172jq.f14166b);
            case 15:
                return a(obj);
            default:
                return AbstractC1400ot.c0(((Ar) this.f10779b).k(obj));
        }
    }

    public /* synthetic */ N9(Fs fs, Dp dp) {
        this.f10778a = 15;
        this.f10779b = fs;
    }
}
