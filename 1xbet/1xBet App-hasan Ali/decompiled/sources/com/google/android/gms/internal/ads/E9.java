package com.google.android.gms.internal.ads;

import Q2.C0379q;
import Q2.InterfaceC0347a;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s3.BinderC2361b;

/* loaded from: classes.dex */
public final class E9 implements InterfaceC1821y9 {

    /* renamed from: k, reason: collision with root package name */
    public final P2.a f8461k;

    /* renamed from: l, reason: collision with root package name */
    public final C1482ql f8462l;

    /* renamed from: n, reason: collision with root package name */
    public final C1876zb f8464n;

    /* renamed from: o, reason: collision with root package name */
    public final Xm f8465o;

    /* renamed from: p, reason: collision with root package name */
    public final C1074hg f8466p;

    /* renamed from: q, reason: collision with root package name */
    public S2.a f8467q = null;

    /* renamed from: r, reason: collision with root package name */
    public final C0606Hd f8468r = AbstractC0613Id.f9544g;

    /* renamed from: m, reason: collision with root package name */
    public final U2.m f8463m = new U2.m(null);

    public E9(P2.a aVar, C1876zb c1876zb, Xm xm, C1482ql c1482ql, C1074hg c1074hg) {
        this.f8461k = aVar;
        this.f8464n = c1876zb;
        this.f8465o = xm;
        this.f8462l = c1482ql;
        this.f8466p = c1074hg;
    }

    public static int a(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri c(Context context, Q4 q42, Uri uri, View view, Activity activity, Xq xq) {
        if (q42 != null) {
            try {
                if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.Cb)).booleanValue() || xq == null) {
                    if (q42.b(uri)) {
                        return q42.a(uri, context, view, activity);
                    }
                } else if (q42.b(uri)) {
                    return xq.a(uri, context, view, activity);
                }
            } catch (R4 unused) {
            } catch (Exception e3) {
                P2.o.f4767B.f4774g.i("OpenGmsgHandler.maybeAddClickSignalsToUri", e3);
            }
        }
        return uri;
    }

    public static Uri d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e3) {
            U2.j.g("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e3);
        }
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1821y9
    public final void b(Object obj, Map map) {
        C1074hg c1074hg;
        InterfaceC0347a interfaceC0347a = (InterfaceC0347a) obj;
        String str = (String) map.get("u");
        HashMap hashMap = new HashMap();
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) interfaceC0347a;
        if (interfaceC0677Re.v() != null) {
            hashMap = interfaceC0677Re.v().f10532w0;
        }
        String M5 = AbstractC1668us.M(str, interfaceC0677Re.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            U2.j.i("Action missing from an open GMSG.");
            return;
        }
        P2.a aVar = this.f8461k;
        if (aVar != null && !aVar.b()) {
            aVar.a(M5);
        } else {
            E3.a a5 = (((Boolean) Q2.r.f5053d.f5056c.a(F7.E9)).booleanValue() && (c1074hg = this.f8466p) != null && C1074hg.b(M5)) ? c1074hg.a(M5, C0379q.f.f5052e) : AbstractC1400ot.c0(M5);
            a5.a(new Kw(0, a5, new m2.g(this, map, interfaceC0347a, str2, 4)), this.f8468r);
        }
    }

    public final void e(Context context, String str, String str2) {
        this.f8465o.b(str);
        C1482ql c1482ql = this.f8462l;
        if (c1482ql != null) {
            AbstractC0952et.I("dialog_not_shown_reason", str2);
            BinderC0857cn.u3(context, c1482ql, this.f8465o, str, "dialog_not_shown", Cv.c(1, new Object[]{"dialog_not_shown_reason", str2}, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0110, code lost:
    
        if (com.google.android.gms.internal.ads.AbstractC1668us.O(r13, new java.util.ArrayList(), r6) == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0153, code lost:
    
        r6 = r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(InterfaceC0347a interfaceC0347a, Map map, boolean z3, String str, boolean z5, boolean z6) {
        Intent intent;
        Intent intent2;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo O5;
        boolean z7 = true;
        g(true);
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) interfaceC0347a;
        Context context = interfaceC0677Re.getContext();
        Q4 b02 = interfaceC0677Re.b0();
        View K = interfaceC0677Re.K();
        Xq Y4 = interfaceC0677Re.Y();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            intent2 = null;
        } else {
            Uri d5 = d(c(context, b02, Uri.parse(str2), K, null, Y4));
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8888q4)).booleanValue()) {
                    z7 = false;
                }
            }
            Uri build = "http".equalsIgnoreCase(d5.getScheme()) ? d5.buildUpon().scheme("https").build() : "https".equalsIgnoreCase(d5.getScheme()) ? d5.buildUpon().scheme("http").build() : null;
            ArrayList arrayList = new ArrayList();
            Intent intent3 = new Intent("android.intent.action.VIEW");
            intent3.addFlags(268435456);
            intent3.setData(d5);
            intent3.setAction("android.intent.action.VIEW");
            if (build == null) {
                intent = null;
            } else {
                Intent intent4 = new Intent("android.intent.action.VIEW");
                intent4.addFlags(268435456);
                intent4.setData(build);
                intent4.setAction("android.intent.action.VIEW");
                intent = intent4;
            }
            if (z7) {
                T2.L l5 = P2.o.f4767B.f4771c;
                T2.L.E(context, intent3);
                T2.L.E(context, intent);
            }
            ResolveInfo O6 = AbstractC1668us.O(intent3, arrayList, context);
            if (O6 != null) {
                intent2 = AbstractC1668us.y(intent3, O6);
            } else {
                if (intent != null && (O5 = AbstractC1668us.O(intent, new ArrayList(), context)) != null) {
                    intent2 = AbstractC1668us.y(intent3, O5);
                }
                if (!arrayList.isEmpty()) {
                    if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        int size = arrayList.size();
                        int i = 0;
                        loop0: while (i < size) {
                            ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            do {
                                int i5 = i + 1;
                                if (it.hasNext()) {
                                }
                            } while (!it.next().processName.equals(resolveInfo.activityInfo.packageName));
                            intent2 = AbstractC1668us.y(intent3, resolveInfo);
                            break loop0;
                        }
                    }
                    if (parseBoolean) {
                        intent2 = AbstractC1668us.y(intent3, (ResolveInfo) arrayList.get(0));
                    }
                }
                intent2 = intent3;
            }
        }
        if (!z3 || this.f8465o == null || intent2 == null || !h(interfaceC0347a, interfaceC0677Re.getContext(), intent2.getData().toString(), str)) {
            try {
                ((InterfaceC0677Re) interfaceC0347a).E0(new S2.e(intent2, this.f8467q), z5, z6, str);
            } catch (ActivityNotFoundException e3) {
                U2.j.i(e3.getMessage());
            }
        }
    }

    public final void g(boolean z3) {
        C1876zb c1876zb = this.f8464n;
        if (c1876zb != null) {
            c1876zb.A(z3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.f8)).booleanValue() != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.a8)).booleanValue() : ((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.Z7)).booleanValue()) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(InterfaceC0347a interfaceC0347a, Context context, String str, String str2) {
        Context context2;
        String str3;
        InterfaceC0590Fb interfaceC0590Fb;
        C0660Pb c0660Pb;
        U2.h hVar;
        Xm xm = this.f8465o;
        C1482ql c1482ql = this.f8462l;
        if (c1482ql != null) {
            int i = BinderC0857cn.f13036r;
            context2 = context;
            str3 = str2;
            BinderC0857cn.u3(context2, c1482ql, xm, str3, "offline_open", new HashMap());
        } else {
            context2 = context;
            str3 = str2;
        }
        P2.o oVar = P2.o.f4767B;
        if (oVar.f4774g.a(context2)) {
            xm.getClass();
            xm.d(new C0905dr(xm, this.f8463m, str3, 19, false));
            return false;
        }
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) interfaceC0347a;
        Lq v4 = interfaceC0677Re.v();
        boolean z3 = (v4 == null || (hVar = v4.f10536y0) == null || hVar.f5875c) ? false : true;
        boolean z5 = (v4 == null || (c0660Pb = v4.f10496d0) == null || !c0660Pb.f11080a || c0660Pb.f11081b == null || !c0660Pb.f11082c) ? false : true;
        if (!z3) {
            if (z5) {
            }
            T2.x a5 = T2.L.a(context2);
            boolean a6 = new d1.l(context2).a();
            boolean o5 = oVar.f4773e.o(context2);
            boolean z6 = interfaceC0677Re.M().b() && interfaceC0677Re.e() == null;
            if (!a6) {
                if (!new d1.l(context2).a()) {
                }
                e(context2, str3, "notifications_disabled");
                return false;
            }
            if (o5) {
                e(context2, str3, "notification_channel_disabled");
                return false;
            }
            if (a5 == null) {
                e(context2, str3, "work_manager_unavailable");
                return false;
            }
            if (z6) {
                e(context2, str3, "ad_no_activity");
                return false;
            }
            if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.X7)).booleanValue()) {
                e(context2, str3, "notification_flow_disabled");
                return false;
            }
            if (interfaceC0677Re.V() == null || interfaceC0677Re.e() == null) {
                interfaceC0677Re.M0(str3, str);
            } else {
                Activity e3 = interfaceC0677Re.e();
                if (e3 == null) {
                    throw new NullPointerException("Null activity");
                }
                Wm wm = new Wm(e3, null, str3, str);
                try {
                    AdOverlayInfoParcel adOverlayInfoParcel = interfaceC0677Re.V().f5299m;
                    if (adOverlayInfoParcel == null || (interfaceC0590Fb = adOverlayInfoParcel.f7443F) == null) {
                        throw new S2.g("noioou");
                    }
                    interfaceC0590Fb.x2(new BinderC2361b(wm));
                } catch (Exception e5) {
                    e(context2, str3, e5.getMessage());
                    return false;
                }
            }
            interfaceC0347a.z();
            return true;
        }
        if (c1482ql != null) {
            int i5 = BinderC0857cn.f13036r;
            BinderC0857cn.u3(context2, c1482ql, xm, str3, "onfs", new HashMap());
        }
        return false;
    }

    public final void i(int i) {
        C1482ql c1482ql;
        String str;
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8904t4)).booleanValue() || (c1482ql = this.f8462l) == null) {
            return;
        }
        C1390oj a5 = c1482ql.a();
        a5.k("action", "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        a5.k("cct_open_status", str);
        a5.q();
    }
}
