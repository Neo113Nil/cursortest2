package com.google.android.gms.internal.ads;

import Q2.C0367k;
import Q2.C0375o;
import Q2.C0379q;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.p9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1417p9 implements InterfaceC1821y9 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14971k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f14972l;

    public /* synthetic */ C1417p9(int i, Object obj) {
        this.f14971k = i;
        this.f14972l = obj;
    }

    private final void a(Object obj, Map map) {
        char c5;
        J2.f fVar;
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.X8)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            String str4 = (String) map.get("format");
            if (!str.equals("load") || TextUtils.isEmpty(str4)) {
                if (str.equals("show")) {
                    ((BinderC0767am) this.f14972l).v3(str2, str3);
                    return;
                }
                return;
            }
            BinderC0767am binderC0767am = (BinderC0767am) this.f14972l;
            synchronized (binderC0767am) {
                try {
                    switch (str4.hashCode()) {
                        case -1999289321:
                            if (str4.equals("NATIVE")) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1372958932:
                            if (str4.equals("INTERSTITIAL")) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -428325382:
                            if (str4.equals("APP_OPEN_AD")) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 543046670:
                            if (str4.equals("REWARDED")) {
                                c5 = 4;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1854800829:
                            if (str4.equals("REWARDED_INTERSTITIAL")) {
                                c5 = 5;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1951953708:
                            if (str4.equals("BANNER")) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    if (c5 == 0) {
                        C0788b6.a(binderC0767am.w3(), str2, BinderC0767am.x3(), new Wl(binderC0767am, str2, str3));
                        return;
                    }
                    if (c5 == 1) {
                        J2.j jVar = new J2.j(binderC0767am.w3());
                        jVar.setAdSize(J2.i.i);
                        jVar.setAdUnitId(str2);
                        jVar.setAdListener(new Xl(binderC0767am, str2, jVar, str3));
                        jVar.a(BinderC0767am.x3());
                        return;
                    }
                    if (c5 == 2) {
                        V2.a.a(binderC0767am.w3(), str2, BinderC0767am.x3(), new Yl(binderC0767am, str2, str3));
                        return;
                    }
                    if (c5 != 3) {
                        if (c5 == 4) {
                            C0675Rc.a(binderC0767am.w3(), str2, BinderC0767am.x3(), new Zl(binderC0767am, str2, str3, 0));
                            return;
                        } else {
                            if (c5 != 5) {
                                return;
                            }
                            C0717Xc.a(binderC0767am.w3(), str2, BinderC0767am.x3(), new Zl(binderC0767am, str2, str3, 1));
                            return;
                        }
                    }
                    Context w32 = binderC0767am.w3();
                    m3.v.f("context cannot be null", w32);
                    C0375o c0375o = C0379q.f.f5049b;
                    BinderC0610Ia binderC0610Ia = new BinderC0610Ia();
                    c0375o.getClass();
                    Q2.G g5 = (Q2.G) new C0367k(c0375o, w32, str2, binderC0610Ia).d(w32, false);
                    try {
                        g5.Y2(new BinderC1372o9(1, new C0905dr(binderC0767am, str2, str3, 16, false)));
                    } catch (RemoteException e3) {
                        U2.j.j("Failed to add google native ad listener", e3);
                    }
                    try {
                        g5.j2(new Q2.U0(new com.google.ads.mediation.e(binderC0767am, str3)));
                    } catch (RemoteException e5) {
                        U2.j.j("Failed to set AdListener.", e5);
                    }
                    try {
                        fVar = new J2.f(w32, g5.b());
                    } catch (RemoteException e6) {
                        U2.j.g("Failed to build AdLoader.", e6);
                        fVar = new J2.f(w32, new Q2.K0(new Q2.L0()));
                    }
                    fVar.a(BinderC0767am.x3());
                } finally {
                }
            }
        }
    }

    private final /* bridge */ /* synthetic */ void c(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (((ViewTreeObserverOnGlobalLayoutListenerC0805bf) this.f14972l)) {
                    try {
                        ViewTreeObserverOnGlobalLayoutListenerC0805bf viewTreeObserverOnGlobalLayoutListenerC0805bf = (ViewTreeObserverOnGlobalLayoutListenerC0805bf) this.f14972l;
                        if (viewTreeObserverOnGlobalLayoutListenerC0805bf.f12864R != parseInt) {
                            viewTreeObserverOnGlobalLayoutListenerC0805bf.f12864R = parseInt;
                            viewTreeObserverOnGlobalLayoutListenerC0805bf.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e3) {
                U2.j.j("Exception occurred while getting webview content height", e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
    public final void b(Object obj, Map map) {
        switch (this.f14971k) {
            case 0:
                InterfaceC1462q9 interfaceC1462q9 = (InterfaceC1462q9) this.f14972l;
                if (interfaceC1462q9 == null) {
                    return;
                }
                String str = (String) map.get("name");
                if (str == null) {
                    U2.j.h("Ad metadata with no name parameter.");
                    str = "";
                }
                Bundle bundle = null;
                if (map.containsKey("info")) {
                    try {
                        bundle = N4.b.a0(new JSONObject((String) map.get("info")));
                    } catch (JSONException e3) {
                        U2.j.g("Failed to convert ad metadata to JSON.", e3);
                    }
                }
                if (bundle == null) {
                    U2.j.f("Failed to convert ad metadata to Bundle.");
                    return;
                } else {
                    interfaceC1462q9.Q(str, bundle);
                    return;
                }
            case 1:
                String str2 = (String) map.get("name");
                if (str2 == null) {
                    U2.j.i("App event with no name parameter.");
                    return;
                } else {
                    ((InterfaceC1506r9) this.f14972l).j(str2, (String) map.get("info"));
                    return;
                }
            case 2:
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
                boolean equals = "1".equals(map.get("transparentBackground"));
                boolean equals2 = "1".equals(map.get("blur"));
                float f = 0.0f;
                try {
                    if (map.get("blurRadius") != null) {
                        f = Float.parseFloat((String) map.get("blurRadius"));
                    }
                } catch (NumberFormatException e5) {
                    U2.j.g("Fail to parse float", e5);
                }
                A9 a9 = (A9) this.f14972l;
                synchronized (a9) {
                    a9.f7539a = equals;
                    a9.f7542d.set(true);
                }
                ((A9) this.f14972l).b(equals2, f);
                interfaceC0677Re.A(equals);
                return;
            case 3:
                a(obj, map);
                return;
            case 4:
                String str3 = (String) map.get("action");
                boolean equals3 = "grant".equals(str3);
                Zi zi = (Zi) this.f14972l;
                if (!equals3) {
                    if ("video_start".equals(str3)) {
                        zi.p();
                        return;
                    } else {
                        if ("video_complete".equals(str3)) {
                            zi.a();
                            return;
                        }
                        return;
                    }
                }
                C0575Dc c0575Dc = null;
                try {
                    int parseInt = Integer.parseInt((String) map.get("amount"));
                    String str4 = (String) map.get("type");
                    if (!TextUtils.isEmpty(str4)) {
                        c0575Dc = new C0575Dc(str4, parseInt);
                    }
                } catch (NumberFormatException e6) {
                    U2.j.j("Unable to parse reward amount.", e6);
                }
                zi.v0(c0575Dc);
                return;
            case 5:
                if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
                    return;
                }
                T2.G.m("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
                if (map.containsKey("title")) {
                    intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
                }
                try {
                    T2.L l5 = P2.o.f4767B.f4771c;
                    T2.L.p((Context) this.f14972l, intent);
                    return;
                } catch (RuntimeException e7) {
                    U2.j.j("Failed to open Share Sheet", e7);
                    P2.o.f4767B.f4774g.i("ShareSheetGmsgHandler.onGmsg", e7);
                    return;
                }
            case 6:
                String str5 = (String) map.get("action");
                if (str5 == null) {
                    U2.j.i("Action missing from video GMSG.");
                    return;
                }
                if (str5.equals("src")) {
                    String str6 = (String) map.get("src");
                    if (str6 == null) {
                        U2.j.i("src missing from video GMSG.");
                        return;
                    } else {
                        ((C1354ns) this.f14972l).accept(str6);
                        return;
                    }
                }
                return;
            case 7:
                c(obj, map);
                return;
            default:
                ((C0765ak) this.f14972l).f12700b.b(map);
                return;
        }
    }
}
