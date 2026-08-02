package com.google.android.gms.internal.ads;

import Q2.C0375o;
import Q2.C0379q;
import Q2.C0393x0;
import Q2.InterfaceC0391w0;
import Q2.InterfaceC0392x;
import a3.AbstractC0467k;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import d3.InterfaceC1915a;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class Oi implements Ei, Jw, Ar, InterfaceC1695va, InterfaceC1740wa, InterfaceC0735Zg, InterfaceC1165jj, InterfaceC1307mq {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10957k;

    public /* synthetic */ Oi(int i) {
        this.f10957k = i;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.en] */
    public static C1169jn b(final int i, final int i5, final WebView webView, final String str, final String str2, final String str3) {
        Object obj = null;
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8750Q4)).booleanValue() || !AbstractC1803xs.f16343b.f2300l) {
            return null;
        }
        try {
            obj = new Object() { // from class: com.google.android.gms.internal.ads.en
                public final Object a() {
                    C1748wi a5 = C1748wi.a("Google", str);
                    Ds n5 = Oi.n("javascript");
                    int i6 = i5;
                    As l5 = Oi.l(AbstractC0467k.p(i6));
                    Ds ds = Ds.f8406n;
                    if (n5 == ds) {
                        U2.j.i("Omid html session error; Unable to parse impression owner: javascript");
                        return null;
                    }
                    if (l5 == null) {
                        U2.j.i("Omid html session error; Unable to parse creative type: ".concat(AbstractC0467k.D(i6)));
                        return null;
                    }
                    String str4 = str2;
                    Ds n6 = Oi.n(str4);
                    if (l5 == As.f7734o && n6 == ds) {
                        U2.j.i("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
                        return null;
                    }
                    Z1 z12 = new Z1(a5, webView, str3, "", EnumC1848ys.f16493l);
                    C1894zt a6 = C1894zt.a(l5, Oi.m(AbstractC0467k.q(i)), n5, n6, true);
                    if (AbstractC1803xs.f16343b.f2300l) {
                        return new C1169jn(new C1893zs(a6, z12, UUID.randomUUID().toString()), z12);
                    }
                    throw new IllegalStateException("Method called before OM SDK activation");
                }
            }.a();
        } catch (RuntimeException e3) {
            P2.o.f4767B.f4774g.h("omid exception", e3);
        }
        return (C1169jn) obj;
    }

    public static C0375o e(U2.a aVar, WebView webView) {
        try {
            return new C0375o(C1748wi.a("Google", aVar.f5853l + "." + aVar.f5854m), webView);
        } catch (RuntimeException e3) {
            P2.o.f4767B.f4774g.h("omid exception", e3);
            return null;
        }
    }

    public static String f() {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8750Q4)).booleanValue()) {
            return "a.1.5.2-google_20241009";
        }
        return null;
    }

    public static final Set g(C1841yl c1841yl, Executor executor) {
        return ((Boolean) AbstractC1146j8.f14087a.s()).booleanValue() ? Collections.singleton(new Si(c1841yl, executor)) : Collections.EMPTY_SET;
    }

    public static void h(C1893zs c1893zs, View view) {
        p(new RunnableC0902dn(c1893zs, view, 1));
    }

    public static void i(C1893zs c1893zs) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8750Q4)).booleanValue() && AbstractC1803xs.f16343b.f2300l) {
            p(new RunnableC0991fn(c1893zs, 0));
        }
    }

    public static boolean j(Context context) {
        Object obj;
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8750Q4)).booleanValue()) {
            U2.j.i("Omid flag is disabled");
            return false;
        }
        try {
            obj = new Ms(context, 3).mo12a();
        } catch (RuntimeException e3) {
            P2.o.f4767B.f4774g.h("omid exception", e3);
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        return bool != null && bool.booleanValue();
    }

    public static As l(String str) {
        char c5;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c5 = 0;
            }
            c5 = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c5 = 1;
            }
            c5 = 65535;
        } else {
            if (str.equals("video")) {
                c5 = 2;
            }
            c5 = 65535;
        }
        if (c5 == 0) {
            return As.f7732m;
        }
        if (c5 == 1) {
            return As.f7733n;
        }
        if (c5 != 2) {
            return null;
        }
        return As.f7734o;
    }

    public static Cs m(String str) {
        char c5;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c5 = 0;
            }
            c5 = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c5 = 2;
            }
            c5 = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c5 = 1;
            }
            c5 = 65535;
        }
        return c5 != 0 ? c5 != 1 ? c5 != 2 ? Cs.f8095m : Cs.f8097o : Cs.f8094l : Cs.f8096n;
    }

    public static Ds n(String str) {
        return "native".equals(str) ? Ds.f8404l : "javascript".equals(str) ? Ds.f8405m : Ds.f8406n;
    }

    public static final void p(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e3) {
            P2.o.f4767B.f4774g.h("omid exception", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0735Zg
    /* renamed from: a */
    public InterfaceC0391w0 mo15a() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695va
    public Object d(JSONObject jSONObject) {
        return new C1473qc(jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo13k(Object obj) {
        C0393x0 e3;
        C0393x0 e5;
        C0393x0 e6;
        switch (this.f10957k) {
            case 0:
                ((Ni) obj).a();
                break;
            case 1:
                ((Ri) obj).w();
                break;
            case 2:
                ((Vi) obj).u();
                break;
            case 3:
                ((Vi) obj).E();
                break;
            case 4:
                Xi xi = (Xi) obj;
                if (!xi.f12210d) {
                    xi.f12208b.c(xi.f12207a, xi.f12209c);
                    xi.f12210d = true;
                    break;
                }
                break;
            case 5:
                ((H9) obj).p();
                break;
            case 6:
                ((H9) obj).a();
                break;
            case 7:
                InterfaceC0391w0 J = ((Ok) obj).f10973a.J();
                if (J != null) {
                    try {
                        e3 = J.e();
                    } catch (RemoteException unused) {
                    }
                    if (e3 == null) {
                        try {
                            e3.f();
                            break;
                        } catch (RemoteException e7) {
                            U2.j.j("Unable to call onVideoEnd()", e7);
                            return;
                        }
                    }
                }
                e3 = null;
                if (e3 == null) {
                }
                break;
            case 8:
                InterfaceC0391w0 J4 = ((Ok) obj).f10973a.J();
                if (J4 != null) {
                    try {
                        e5 = J4.e();
                    } catch (RemoteException unused2) {
                    }
                    if (e5 == null) {
                        try {
                            e5.b();
                            break;
                        } catch (RemoteException e8) {
                            U2.j.j("Unable to call onVideoEnd()", e8);
                            return;
                        }
                    }
                }
                e5 = null;
                if (e5 == null) {
                }
                break;
            case 9:
                InterfaceC0391w0 J5 = ((Ok) obj).f10973a.J();
                if (J5 != null) {
                    try {
                        e6 = J5.e();
                    } catch (RemoteException unused3) {
                    }
                    if (e6 == null) {
                        try {
                            e6.e();
                            break;
                        } catch (RemoteException e9) {
                            U2.j.j("Unable to call onVideoEnd()", e9);
                            return;
                        }
                    }
                }
                e6 = null;
                if (e6 == null) {
                }
                break;
            case 10:
                ((Ok) obj).getClass();
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case C1639u7.zzm /* 21 */:
            default:
                ((InterfaceC1915a) obj).d();
                break;
            case 22:
                ((InterfaceC0392x) obj).f();
                break;
            case 23:
                ((InterfaceC0392x) obj).j();
                break;
            case 24:
                ((Q2.W) obj).p();
                break;
            case 25:
                ((S2.m) obj).Q1();
                break;
            case 26:
                ((InterfaceC1031gi) obj).f();
                break;
            case 27:
                ((S2.m) obj).h1();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1740wa
    public JSONObject o(Object obj) {
        Fm fm = (Fm) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.S8)).booleanValue()) {
            jSONObject2.put("ad_request_url", fm.f9114c.f);
            jSONObject2.put("ad_request_post_body", fm.f9114c.f15127c);
        }
        jSONObject2.put("base_url", fm.f9114c.f15126b);
        jSONObject2.put("signals", fm.f9113b);
        Im im = fm.f9112a;
        jSONObject3.put("body", im.f9616c);
        jSONObject3.put("headers", C0379q.f.f5048a.g(im.f9615b));
        jSONObject3.put("response_code", im.f9614a);
        jSONObject3.put("latency", im.f9617d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", fm.f9114c.f15131h);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        switch (this.f10957k) {
            case 11:
                break;
            default:
                T2.G.m("Notification of cache hit failed.");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o, reason: collision with other method in class */
    public /* synthetic */ void mo14o(Object obj) {
        switch (this.f10957k) {
            case 11:
                ((InterfaceC0677Re) obj).destroy();
                break;
            default:
                T2.G.m("Notification of cache hit successful.");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ar
    public Object k(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        T2.G.m("Ad request signals:");
        T2.G.m(jSONObject.toString(2));
        return jSONObject;
    }

    private final void c(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1165jj
    public void z(boolean z3, Context context, Sh sh) {
    }
}
