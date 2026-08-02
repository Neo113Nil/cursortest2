package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.u9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1641u9 implements InterfaceC1821y9 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15797k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f15798l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f15799m;

    public /* synthetic */ C1641u9(int i, Object obj, Object obj2) {
        this.f15797k = i;
        this.f15798l = obj;
        this.f15799m = obj2;
    }

    private final void a(Object obj, Map map) {
        Vk vk = (Vk) this.f15798l;
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f15799m;
        C1656ug c1656ug = vk.i;
        synchronized (c1656ug) {
            c1656ug.f15879m.add(interfaceC0677Re);
            C1477qg c1477qg = c1656ug.f15877k;
            interfaceC0677Re.s0("/updateActiveView", c1477qg.f15151e);
            interfaceC0677Re.s0("/untrackActiveViewUnit", c1477qg.f);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
    public final void b(Object obj, Map map) {
        char c5;
        G9 g9;
        String str;
        switch (this.f15797k) {
            case 0:
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
                AbstractC1776x9.b(map, (Vi) this.f15798l);
                String str2 = (String) map.get("u");
                if (str2 == null) {
                    U2.j.i("URL missing from click GMSG.");
                    return;
                }
                Hw r5 = Hw.r(AbstractC1776x9.a(interfaceC0677Re, str2));
                C1686v9 c1686v9 = new C1686v9((C1074hg) this.f15799m, str2, 0);
                C0606Hd c0606Hd = AbstractC0613Id.f9539a;
                C1537rw j02 = AbstractC1400ot.j0(r5, c1686v9, c0606Hd);
                j02.a(new Kw(0, j02, new C1731w9(interfaceC0677Re)), c0606Hd);
                return;
            case 1:
                P2.o oVar = P2.o.f4767B;
                C1204kd c1204kd = oVar.f4790x;
                Context context = (Context) this.f15798l;
                if (c1204kd.e(context)) {
                    String str3 = (String) map.get("eventName");
                    String str4 = (String) map.get("eventId");
                    int hashCode = str3.hashCode();
                    if (hashCode == 94399) {
                        if (str3.equals("_aa")) {
                            c5 = 2;
                        }
                        c5 = 65535;
                    } else if (hashCode != 94401) {
                        if (hashCode == 94407 && str3.equals("_ai")) {
                            c5 = 1;
                        }
                        c5 = 65535;
                    } else {
                        if (str3.equals("_ac")) {
                            c5 = 0;
                        }
                        c5 = 65535;
                    }
                    C1204kd c1204kd2 = oVar.f4790x;
                    HashMap hashMap = (HashMap) this.f15799m;
                    if (c5 == 0) {
                        Map map2 = (Map) hashMap.get("_ac");
                        c1204kd2.getClass();
                        c1204kd2.k(context, "_ac", str4, C1204kd.f(map2));
                        return;
                    } else if (c5 == 1) {
                        Map map3 = (Map) hashMap.get("_ai");
                        c1204kd2.getClass();
                        c1204kd2.k(context, "_ai", str4, C1204kd.f(map3));
                        return;
                    } else if (c5 != 2) {
                        U2.j.f("logScionEvent gmsg contained unsupported eventName");
                        return;
                    } else {
                        c1204kd2.k(context, "_aa", str4, null);
                        return;
                    }
                }
                return;
            case 2:
                String str5 = (String) map.get("id");
                String str6 = (String) map.get("fail");
                String str7 = (String) map.get("fail_reason");
                String str8 = (String) map.get("fail_stack");
                String str9 = (String) map.get("result");
                if (true == TextUtils.isEmpty(str8)) {
                    str7 = "Unknown Fail Reason.";
                }
                String concat = TextUtils.isEmpty(str8) ? "" : "\n".concat(String.valueOf(str8));
                synchronized (this.f15798l) {
                    try {
                        g9 = (G9) ((HashMap) this.f15799m).remove(str5);
                    } catch (JSONException e3) {
                        g9.d(e3.getMessage());
                    } finally {
                    }
                    if (g9 == null) {
                        U2.j.i("Received result for unexpected method invocation: " + str5);
                        return;
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        g9.d(str7 + concat);
                        return;
                    }
                    if (str9 == null) {
                        g9.a(null);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str9);
                    if (T2.G.o()) {
                        T2.G.m("Result GMSG: " + jSONObject.toString(2));
                    }
                    g9.a(jSONObject);
                    return;
                }
            case 3:
                C1524rj c1524rj = (C1524rj) ((WeakReference) this.f15798l).get();
                if (c1524rj == null) {
                    return;
                }
                c1524rj.f15348g.i();
                A7 a7 = F7.vc;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    View view = (View) ((WeakReference) this.f15799m).get();
                    Rj rj = c1524rj.f15342D;
                    rj.getClass();
                    if (!((Boolean) rVar.f5056c.a(a7)).booleanValue() || view == null) {
                        return;
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (parent == null) {
                            str = "0";
                        } else if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                            str = "1";
                        } else {
                            parent = parent.getParent();
                        }
                    }
                    C1390oj a5 = rj.f11445a.a();
                    a5.k("action", "hcp");
                    a5.k("hcp", str);
                    a5.l(c1524rj.f15350j);
                    a5.q();
                    return;
                }
                return;
            case 4:
                Tj tj = (Tj) this.f15798l;
                try {
                    tj.f11666p = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    U2.j.f("Failed to call parse unconfirmedClickTimestamp.");
                }
                tj.f11665o = (String) map.get("id");
                String str10 = (String) map.get("asset_id");
                C1104i9 c1104i9 = (C1104i9) this.f15799m;
                if (c1104i9 == null) {
                    U2.j.d("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    Parcel N5 = c1104i9.N();
                    N5.writeString(str10);
                    c1104i9.d1(N5, 1);
                    return;
                } catch (RemoteException e5) {
                    U2.j.k("#007 Could not call remote method.", e5);
                    return;
                }
            case 5:
                a(obj, map);
                return;
            default:
                InterfaceC0677Re interfaceC0677Re2 = (InterfaceC0677Re) obj;
                String str11 = (String) map.get("u");
                if (str11 == null) {
                    U2.j.i("URL missing from httpTrack GMSG.");
                    return;
                }
                Lq v4 = interfaceC0677Re2.v();
                if (v4 != null && !v4.f10504i0) {
                    ((C1041gs) this.f15798l).b(str11, v4.f10534x0, null);
                    return;
                }
                Nq d02 = interfaceC0677Re2.d0();
                if (d02 == null) {
                    P2.o.f4767B.f4774g.i("BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                P2.o.f4767B.f4776j.getClass();
                K3 k32 = new K3(System.currentTimeMillis(), d02.f10823b, str11, 2);
                Xm xm = (Xm) this.f15799m;
                xm.getClass();
                xm.d(new C0709Wb(25, xm, k32));
                return;
        }
    }

    public void c(String str, G9 g9) {
        synchronized (this.f15798l) {
            ((HashMap) this.f15799m).put(str, g9);
        }
    }

    public C1641u9() {
        this.f15797k = 2;
        this.f15798l = new Object();
        this.f15799m = new HashMap();
    }

    public C1641u9(C1524rj c1524rj, View view) {
        this.f15797k = 3;
        this.f15798l = new WeakReference(c1524rj);
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.vc)).booleanValue()) {
            this.f15799m = new WeakReference(view);
        } else {
            this.f15799m = new WeakReference(null);
        }
    }
}
