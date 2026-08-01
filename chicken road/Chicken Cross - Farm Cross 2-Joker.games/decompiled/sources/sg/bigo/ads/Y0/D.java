package sg.bigo.ads.Y0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONArray;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.api.AdActivity;
import sg.bigo.ads.api.LandingStyleableActivity;
import sg.bigo.ads.api.LandscapeAdActivity;
import sg.bigo.ads.api.PopupAdActivity;
import sg.bigo.ads.controller.form.AdFormActivity;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.AbstractC5204s;
import sg.bigo.ads.n.AbstractC5391n;
import sg.bigo.ads.t.C5472b;
import sg.bigo.ads.t.C5476f;

/* loaded from: classes3.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f12627a = new WeakHashMap();
    public static long b = 0;
    public static C c = null;

    public static void a(Activity activity, sg.bigo.ads.e.h hVar) {
        if (activity == null || activity.getWindow() == null || hVar == null || hVar.p() == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - b < 2000) {
            return;
        }
        WeakReference weakReference = new WeakReference(activity);
        b = elapsedRealtime;
        sg.bigo.ads.P.e p = hVar.p();
        hVar.a((sg.bigo.ads.P.e) null);
        Activity activity2 = (Activity) weakReference.get();
        if (activity2 != null) {
            View decorView = activity2.getWindow().getDecorView();
            decorView.postDelayed(new B(decorView, hVar, p), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.m);
        }
    }

    public static sg.bigo.ads.e.h a(int i) {
        sg.bigo.ads.e.h hVar;
        WeakHashMap weakHashMap = f12627a;
        synchronized (weakHashMap) {
            Iterator it = weakHashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    hVar = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getValue()).intValue() == i) {
                    hVar = (sg.bigo.ads.e.h) entry.getKey();
                    break;
                }
            }
        }
        return hVar;
    }

    public static Pair a(Context context, String str, String str2) {
        int i = 0;
        if (context == null) {
            return new Pair(0, 0);
        }
        if (str != null && str.equals(str2)) {
            int i2 = !TextUtils.isEmpty(sg.bigo.ads.j1.b.a(str, context)) ? 1 : 0;
            return new Pair(Integer.valueOf(i2), Integer.valueOf(i2));
        }
        int i3 = TextUtils.isEmpty(str) ? -1 : !TextUtils.isEmpty(sg.bigo.ads.j1.b.a(str, context)) ? 1 : 0;
        if (TextUtils.isEmpty(str2)) {
            i = -1;
        } else if (!TextUtils.isEmpty(sg.bigo.ads.j1.b.a(str2, context))) {
            i = 1;
        }
        return new Pair(Integer.valueOf(i3), Integer.valueOf(i));
    }

    public static int a(sg.bigo.ads.e.h hVar) {
        sg.bigo.ads.T0.q qVar;
        Integer a2;
        if (hVar == null || (qVar = ((sg.bigo.ads.U0.b) hVar.e()).J) == null || (a2 = sg.bigo.ads.K0.z.a(qVar.a("clk_flow_attr.lp_gp_format"))) == null) {
            return 0;
        }
        return a2.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static sg.bigo.ads.P.f a(Context context, Activity activity, ArrayList arrayList, String str, String str2, boolean z, int i, JSONArray jSONArray, sg.bigo.ads.e.h hVar, boolean z2, int i2, boolean z3, boolean z4, boolean z5) {
        int i3;
        sg.bigo.ads.P.c cVar;
        int i4;
        boolean z6;
        int i5;
        int i6;
        int i7;
        JSONArray jSONArray2;
        sg.bigo.ads.P.c cVar2;
        Intent intent;
        String a2;
        int i8;
        int i9;
        boolean z7;
        int i10;
        g gVar;
        int i11;
        sg.bigo.ads.E1.k kVar;
        ArrayList arrayList2 = arrayList;
        sg.bigo.ads.P.f fVar = new sg.bigo.ads.P.f();
        ?? r8 = 0;
        boolean z8 = false;
        fVar.f12478a = 0;
        int i12 = 4;
        sg.bigo.ads.P.c cVar3 = null;
        if (hVar != null && (gVar = hVar.z) != null && (i11 = gVar.c) != 3 && i11 != 4 && (kVar = gVar.e) != null) {
            kVar.destroy();
            gVar.e = null;
        }
        int i13 = -1;
        int i14 = 1;
        if (arrayList2 != null) {
            boolean z9 = false;
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList.size()) {
                    i3 = i14;
                    cVar = cVar3;
                    i4 = i12;
                    z6 = z8;
                    i5 = i13;
                    r8 = z9 ? 1 : 0;
                    break;
                }
                String str3 = (String) arrayList2.get(i15);
                if (TextUtils.isEmpty(str3)) {
                    i8 = i15;
                    i9 = i14;
                    cVar = cVar3;
                    i4 = i12;
                    z7 = z8;
                    i10 = i13;
                } else {
                    i8 = i15;
                    cVar = cVar3;
                    i4 = i12;
                    z7 = z8;
                    boolean a3 = sg.bigo.ads.j1.b.a(Uri.parse(str3), context, activity, fVar, str2, z3, hVar != null ? ((sg.bigo.ads.U0.b) hVar.e()).U : cVar3, i2, true);
                    if (a3) {
                        if (hVar != null) {
                            i5 = -1;
                            if (fVar.a() > -1) {
                                hVar.a(fVar.d);
                            }
                        } else {
                            i5 = -1;
                        }
                        i3 = 1;
                        fVar.f12478a = 1;
                        r8 = a3;
                        z6 = z7;
                    } else {
                        i9 = 1;
                        i10 = -1;
                        z9 = a3 ? 1 : 0;
                    }
                }
                i15 = i8 + 1;
                i14 = i9;
                i13 = i10;
                i12 = i4;
                z8 = z7;
                cVar3 = cVar;
                arrayList2 = arrayList;
                z9 = z9;
            }
        } else {
            i3 = 1;
            cVar = null;
            i4 = 4;
            z6 = false;
            i5 = -1;
        }
        if (r8 == 0 && z5 && !TextUtils.isEmpty(str2)) {
            try {
                intent = new Intent();
                a2 = sg.bigo.ads.j1.b.a(str2, context);
            } catch (Exception unused) {
            }
            if (a2 == null) {
                r8 = z6;
                if (r8 != 0) {
                    fVar.f12478a = 6;
                }
            } else {
                intent.setComponent(new ComponentName(str2, a2));
                intent.addFlags(268435456);
                context.startActivity(intent);
                r8 = i3;
                if (r8 != 0) {
                }
            }
        }
        if (r8 == 0 && z && !TextUtils.isEmpty(str2)) {
            boolean b2 = sg.bigo.ads.j1.b.b(str2, context);
            if (b2) {
                fVar.f12478a = i4;
            }
            r8 = b2;
        }
        if (r8 != 0 || TextUtils.isEmpty(str)) {
            i6 = i3;
            i7 = i5;
        } else {
            Uri parse = Uri.parse(str);
            if (sg.bigo.ads.j1.b.a(str)) {
                fVar.f12478a = 2;
                i6 = i3;
                i7 = i5;
                boolean a4 = sg.bigo.ads.j1.b.a(parse, context, activity, fVar, z3, hVar != null ? ((sg.bigo.ads.U0.b) hVar.e()).U : cVar, i2, true);
                if (hVar != null && fVar.a() > i7) {
                    hVar.a(fVar.d);
                }
                r8 = a4;
            } else {
                i6 = i3;
                i7 = i5;
                fVar.f12478a = 3;
                if (i == i6) {
                    if (!z4 || !a(context, str, hVar, fVar, i2)) {
                        if (hVar != null) {
                            cVar2 = hVar.e();
                            jSONArray2 = jSONArray;
                        } else {
                            jSONArray2 = jSONArray;
                            cVar2 = cVar;
                        }
                        if (!sg.bigo.ads.j1.b.a(cVar2, context, str, jSONArray2)) {
                            r8 = z6;
                        }
                    }
                    r8 = i6;
                } else {
                    r8 = r8;
                    if (i == 2) {
                        a(context, str, hVar, fVar, z2);
                        r8 = i6;
                    }
                }
            }
            if (r8 == 0 && !TextUtils.isEmpty(str)) {
                r8 = a(context, str, hVar, fVar, 0, z2, i2);
            }
        }
        fVar.n = r8;
        if (r8 != 0 && hVar != null) {
            sg.bigo.ads.P.c e = hVar.e();
            long j = hVar.M;
            long j2 = ((sg.bigo.ads.U0.b) e).m;
            if (j != j2) {
                hVar.K = i7;
                hVar.M = j2;
            }
            hVar.L = System.currentTimeMillis();
            hVar.K += i6;
        }
        if (fVar.a() == i6) {
            fVar.f12478a = 5;
        }
        return fVar;
    }

    public static void a(Context context, String str, sg.bigo.ads.e.h hVar, sg.bigo.ads.P.f fVar, boolean z) {
        i iVar = new i(str, hVar == null ? null : hVar.e(), hVar, hVar != null ? hVar.z : null);
        z zVar = new z(iVar, str, hVar, fVar, z);
        sg.bigo.ads.S.j.a(context, str, zVar, new sg.bigo.ads.S.h(context, str, iVar, zVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Context context, String str, sg.bigo.ads.e.h hVar, sg.bigo.ads.P.f fVar, int i) {
        LandingPageStyleConfig landingPageStyleConfig;
        WeakReference weakReference;
        sg.bigo.ads.T0.q qVar;
        Integer a2;
        if (hVar != null && (weakReference = hVar.O) != null && weakReference.get() != null) {
            AbstractC5204s abstractC5204s = (AbstractC5204s) ((sg.bigo.ads.e.g) hVar.O.get());
            if (abstractC5204s.l != null) {
                sg.bigo.ads.T0.q qVar2 = abstractC5204s.u;
                if (((qVar2 == null || (a2 = sg.bigo.ads.K0.z.a(qVar2.a("clk_flow_attr.auto_clk_out_mode"))) == null) ? 0 : a2.intValue()) == 1 && (qVar = ((sg.bigo.ads.U0.b) ((InterfaceC5087a) abstractC5204s.l.e())).I) != null) {
                    int d0 = abstractC5204s.d0();
                    String str2 = d0 != 1 ? d0 != 9 ? "video_play_page.webview_force_time" : "layer.webview_force_time" : "endpage.webview_force_time";
                    int d02 = abstractC5204s.d0();
                    int a3 = AbstractC5391n.a(qVar, str2, d02 != 1 ? d02 != 9 ? "video_play_page.webview_force_time_new" : "layer.webview_force_time_new" : "endpage.webview_force_time_new");
                    int d03 = abstractC5204s.d0();
                    ViewGroup viewGroup = abstractC5204s.m;
                    landingPageStyleConfig = new LandingPageStyleConfig(C5472b.class, d03, 5, a3, viewGroup != null ? viewGroup.getMeasuredHeight() : 0, 0, 0.67f);
                    C5476f.a(landingPageStyleConfig);
                    if (landingPageStyleConfig != null) {
                        return false;
                    }
                    Class cls = landingPageStyleConfig.g;
                    int i2 = AdActivity.b;
                    Intent intent = new Intent(context, (Class<?>) LandingStyleableActivity.class);
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    intent.putExtra("impl_clazz", cls.getName());
                    intent.putExtra("layout_style", landingPageStyleConfig);
                    intent.putExtra("webview_force_time", landingPageStyleConfig.b);
                    intent.putExtra("url", str);
                    if (hVar != null) {
                        if ((((sg.bigo.ads.U0.b) hVar.e()).a(16) && !(hVar instanceof sg.bigo.ads.Q.d)) || i > 0) {
                            intent.putExtra("try_gp_inline", true);
                            intent.putExtra("gp_inline_ad_bundle", ((sg.bigo.ads.U0.b) hVar.e()).U);
                            int i3 = ((sg.bigo.ads.U0.b) hVar.e()).l;
                            intent.putExtra("gp_inline_real_launch", i3 == 2 || i3 == 1 || i3 == 15 || i3 == 16 || i3 == 17 || i3 == 18 || hVar.J == 2);
                        }
                    }
                    int hashCode = hVar.hashCode();
                    a(hashCode, hVar);
                    intent.putExtra("ad_identifier", hashCode);
                    intent.putExtra("land_way", 0);
                    context.startActivity(intent);
                    fVar.j = 5;
                    fVar.o = 1;
                    return true;
                }
            }
        }
        landingPageStyleConfig = null;
        if (landingPageStyleConfig != null) {
        }
    }

    public static void a(Context context, sg.bigo.ads.e.h hVar) {
        if (hVar == null) {
            sg.bigo.ads.s1.b.a(3000, 10221, "ad == null, launchFormActivity failed", (sg.bigo.ads.P.c) null);
            return;
        }
        try {
            int i = AdFormActivity.h;
            Intent intent = new Intent(context, (Class<?>) AdFormActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            int hashCode = hVar.hashCode();
            int l = hVar.l();
            a(hashCode, hVar);
            intent.putExtra("ad_identifier", hashCode);
            intent.putExtra("open_form_time", l);
            context.startActivity(intent);
        } catch (Exception e) {
            sg.bigo.ads.s1.b.a(3000, 10221, Log.getStackTraceString(e), hVar.e());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:77:0x0004, B:79:0x0008, B:81:0x000e, B:6:0x0025, B:8:0x0029, B:10:0x002d, B:17:0x0039, B:19:0x0046, B:20:0x0049, B:21:0x008c, B:23:0x0096, B:24:0x009a, B:26:0x009f, B:29:0x00b3, B:39:0x00e0, B:43:0x00e8, B:46:0x00ed, B:48:0x00f4, B:49:0x0105, B:51:0x010a, B:63:0x0055, B:67:0x005c, B:69:0x0069, B:70:0x006c, B:72:0x0074, B:74:0x0081, B:75:0x0084), top: B:76:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:77:0x0004, B:79:0x0008, B:81:0x000e, B:6:0x0025, B:8:0x0029, B:10:0x002d, B:17:0x0039, B:19:0x0046, B:20:0x0049, B:21:0x008c, B:23:0x0096, B:24:0x009a, B:26:0x009f, B:29:0x00b3, B:39:0x00e0, B:43:0x00e8, B:46:0x00ed, B:48:0x00f4, B:49:0x0105, B:51:0x010a, B:63:0x0055, B:67:0x005c, B:69:0x0069, B:70:0x006c, B:72:0x0074, B:74:0x0081, B:75:0x0084), top: B:76:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:77:0x0004, B:79:0x0008, B:81:0x000e, B:6:0x0025, B:8:0x0029, B:10:0x002d, B:17:0x0039, B:19:0x0046, B:20:0x0049, B:21:0x008c, B:23:0x0096, B:24:0x009a, B:26:0x009f, B:29:0x00b3, B:39:0x00e0, B:43:0x00e8, B:46:0x00ed, B:48:0x00f4, B:49:0x0105, B:51:0x010a, B:63:0x0055, B:67:0x005c, B:69:0x0069, B:70:0x006c, B:72:0x0074, B:74:0x0081, B:75:0x0084), top: B:76:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:77:0x0004, B:79:0x0008, B:81:0x000e, B:6:0x0025, B:8:0x0029, B:10:0x002d, B:17:0x0039, B:19:0x0046, B:20:0x0049, B:21:0x008c, B:23:0x0096, B:24:0x009a, B:26:0x009f, B:29:0x00b3, B:39:0x00e0, B:43:0x00e8, B:46:0x00ed, B:48:0x00f4, B:49:0x0105, B:51:0x010a, B:63:0x0055, B:67:0x005c, B:69:0x0069, B:70:0x006c, B:72:0x0074, B:74:0x0081, B:75:0x0084), top: B:76:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a A[Catch: Exception -> 0x001b, TRY_LEAVE, TryCatch #0 {Exception -> 0x001b, blocks: (B:77:0x0004, B:79:0x0008, B:81:0x000e, B:6:0x0025, B:8:0x0029, B:10:0x002d, B:17:0x0039, B:19:0x0046, B:20:0x0049, B:21:0x008c, B:23:0x0096, B:24:0x009a, B:26:0x009f, B:29:0x00b3, B:39:0x00e0, B:43:0x00e8, B:46:0x00ed, B:48:0x00f4, B:49:0x0105, B:51:0x010a, B:63:0x0055, B:67:0x005c, B:69:0x0069, B:70:0x006c, B:72:0x0074, B:74:0x0081, B:75:0x0084), top: B:76:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005c A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:77:0x0004, B:79:0x0008, B:81:0x000e, B:6:0x0025, B:8:0x0029, B:10:0x002d, B:17:0x0039, B:19:0x0046, B:20:0x0049, B:21:0x008c, B:23:0x0096, B:24:0x009a, B:26:0x009f, B:29:0x00b3, B:39:0x00e0, B:43:0x00e8, B:46:0x00ed, B:48:0x00f4, B:49:0x0105, B:51:0x010a, B:63:0x0055, B:67:0x005c, B:69:0x0069, B:70:0x006c, B:72:0x0074, B:74:0x0081, B:75:0x0084), top: B:76:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0074 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:77:0x0004, B:79:0x0008, B:81:0x000e, B:6:0x0025, B:8:0x0029, B:10:0x002d, B:17:0x0039, B:19:0x0046, B:20:0x0049, B:21:0x008c, B:23:0x0096, B:24:0x009a, B:26:0x009f, B:29:0x00b3, B:39:0x00e0, B:43:0x00e8, B:46:0x00ed, B:48:0x00f4, B:49:0x0105, B:51:0x010a, B:63:0x0055, B:67:0x005c, B:69:0x0069, B:70:0x006c, B:72:0x0074, B:74:0x0081, B:75:0x0084), top: B:76:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Context context, String str, sg.bigo.ads.e.h hVar, sg.bigo.ads.P.f fVar, int i, boolean z, int i2) {
        LandingPageStyleConfig a2;
        Class<x> cls;
        Intent intent;
        int i3;
        Class<x> cls2;
        boolean z2;
        Class cls3;
        if (hVar != null) {
            try {
                WeakReference weakReference = hVar.O;
                if (weakReference != null && weakReference.get() != null) {
                    a2 = ((sg.bigo.ads.e.g) hVar.O.get()).a(context, str, i, z);
                    if (a2 != null && (cls3 = a2.g) != null && a2.d > 0 && (i3 = a2.f12718a) != 0 && i3 != 7 && i3 != 8) {
                        int i4 = AdActivity.b;
                        intent = new Intent(context, (Class<?>) LandingStyleableActivity.class);
                        if (!(context instanceof Activity)) {
                            intent.addFlags(268435456);
                        }
                        intent.putExtra("impl_clazz", cls3.getName());
                        intent.putExtra("layout_style", a2);
                        intent.putExtra("webview_force_time", a2 == null ? a2.b : 1);
                        if (hVar != null) {
                            boolean z3 = hVar instanceof sg.bigo.ads.Q.d;
                            if ((((sg.bigo.ads.U0.b) hVar.e()).a(16) && !z3) || i2 > 0) {
                                intent.putExtra("try_gp_inline", true);
                                intent.putExtra("gp_inline_ad_bundle", ((sg.bigo.ads.U0.b) hVar.e()).U);
                                int i5 = ((sg.bigo.ads.U0.b) hVar.e()).l;
                                if (i5 != 2 && i5 != 1 && i5 != 15 && i5 != 16 && i5 != 17 && i5 != 18 && hVar.J != 2) {
                                    z2 = false;
                                    intent.putExtra("gp_inline_real_launch", z2);
                                }
                                z2 = true;
                                intent.putExtra("gp_inline_real_launch", z2);
                            }
                        }
                        intent.putExtra("url", str);
                        if (hVar != null) {
                            int hashCode = hVar.hashCode();
                            a(hashCode, hVar);
                            intent.putExtra("ad_identifier", hashCode);
                            intent.putExtra("land_way", i);
                        }
                        context.startActivity(intent);
                        if (fVar != null) {
                            fVar.j = i3;
                        }
                        return true;
                    }
                    cls = x.class;
                    if (a2 != null && (cls2 = a2.g) != null) {
                        cls = cls2;
                    }
                    if (!z) {
                        int i6 = AdActivity.b;
                        intent = new Intent(context, (Class<?>) LandscapeAdActivity.class);
                        if (!(context instanceof Activity)) {
                            intent.addFlags(268435456);
                        }
                        intent.putExtra("impl_clazz", cls.getName());
                    } else {
                        int i7 = AdActivity.b;
                        intent = new Intent(context, (Class<?>) AdActivity.class);
                        if (!(context instanceof Activity)) {
                            intent.addFlags(268435456);
                        }
                        intent.putExtra("impl_clazz", cls.getName());
                    }
                    i3 = 0;
                    intent.putExtra("layout_style", a2);
                    intent.putExtra("webview_force_time", a2 == null ? a2.b : 1);
                    if (hVar != null) {
                    }
                    intent.putExtra("url", str);
                    if (hVar != null) {
                    }
                    context.startActivity(intent);
                    if (fVar != null) {
                    }
                    return true;
                }
            } catch (Exception e) {
                sg.bigo.ads.s1.b.a(3000, 10116, Log.getStackTraceString(e), hVar != null ? hVar.e() : null);
                return false;
            }
        }
        a2 = null;
        if (a2 != null) {
            int i42 = AdActivity.b;
            intent = new Intent(context, (Class<?>) LandingStyleableActivity.class);
            if (!(context instanceof Activity)) {
            }
            intent.putExtra("impl_clazz", cls3.getName());
            intent.putExtra("layout_style", a2);
            intent.putExtra("webview_force_time", a2 == null ? a2.b : 1);
            if (hVar != null) {
            }
            intent.putExtra("url", str);
            if (hVar != null) {
            }
            context.startActivity(intent);
            if (fVar != null) {
            }
            return true;
        }
        cls = x.class;
        if (a2 != null) {
            cls = cls2;
        }
        if (!z) {
        }
        i3 = 0;
        intent.putExtra("layout_style", a2);
        intent.putExtra("webview_force_time", a2 == null ? a2.b : 1);
        if (hVar != null) {
        }
        intent.putExtra("url", str);
        if (hVar != null) {
        }
        context.startActivity(intent);
        if (fVar != null) {
        }
        return true;
    }

    public static boolean a(Context context, Class cls, sg.bigo.ads.e.h hVar) {
        if (Build.VERSION.SDK_INT == 26) {
            sg.bigo.ads.s1.b.a(3000, 10116, "android 8.0 cannot show popup", hVar.e());
            return false;
        }
        try {
            int i = AdActivity.b;
            Intent intent = new Intent(context, (Class<?>) PopupAdActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("impl_clazz", cls.getName());
            int hashCode = hVar.hashCode();
            a(hashCode, hVar);
            intent.putExtra("ad_identifier", hashCode);
            context.startActivity(intent);
            return true;
        } catch (Exception e) {
            sg.bigo.ads.s1.b.a(3000, 10116, Log.getStackTraceString(e), hVar.e());
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        if (a(r16, r18, r19, r12, r21) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if (sg.bigo.ads.j1.b.a(r19.e(), r16, r18, r14) != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static sg.bigo.ads.P.f a(Context context, Activity activity, String str, sg.bigo.ads.e.h hVar, sg.bigo.ads.P.f fVar, int i, boolean z, boolean z2) {
        int i2;
        sg.bigo.ads.P.f fVar2 = fVar == null ? new sg.bigo.ads.P.f() : fVar;
        if (TextUtils.isEmpty(str)) {
            return fVar2;
        }
        Uri parse = Uri.parse(str);
        JSONArray jSONArray = null;
        String str2 = hVar != null ? ((sg.bigo.ads.U0.b) hVar.e()).U : null;
        if (sg.bigo.ads.j1.b.a(parse, context, activity, fVar2, hVar != null ? ((sg.bigo.ads.U0.b) hVar.e()).z.g : null, z, str2, i, true)) {
            if (hVar != null && fVar2.a() > -1) {
                hVar.a(fVar2.d);
            }
            fVar2.f12478a = 1;
            return fVar2;
        }
        boolean z3 = false;
        fVar2.f12478a = 0;
        if (sg.bigo.ads.j1.b.a(str)) {
            fVar2.f12478a = 2;
            z3 = sg.bigo.ads.j1.b.a(parse, context, activity, fVar2, z, str2, i, true);
        } else {
            fVar2.f12478a = 3;
            if (hVar != null) {
                i2 = ((sg.bigo.ads.U0.b) hVar.e()).z.c;
                jSONArray = ((sg.bigo.ads.U0.b) hVar.e()).z.d;
            } else {
                i2 = 0;
            }
            if (i2 == 1) {
                if (z2) {
                }
            } else if (i2 == 2) {
                a(context, str, hVar, fVar2, false);
                z3 = true;
            } else {
                z3 = a(context, str, hVar, fVar2, 0, false, i);
            }
        }
        fVar2.n = z3;
        if (fVar2.a() == 1) {
            fVar2.f12478a = 5;
            if (hVar != null) {
                hVar.a(fVar2.d);
            }
        }
        return fVar2;
    }

    public static void a(int i, sg.bigo.ads.e.h hVar) {
        WeakHashMap weakHashMap = f12627a;
        synchronized (weakHashMap) {
            weakHashMap.put(hVar, Integer.valueOf(i));
        }
    }

    public static String a(String str, int i, int i2, int i3, int i4) {
        try {
            if (str.contains("ad_imp_indx=__ad_imp_indx__")) {
                str = I.a(str, "ad_imp_indx=__ad_imp_indx__", "ad_imp_indx=" + i, true);
            }
            if (str.contains("ad_click_indx=__ad_click_indx__")) {
                str = I.a(str, "ad_click_indx=__ad_click_indx__", "ad_click_indx=" + i2, true);
            }
            if (i3 > 0 && str.contains("click_source=__click_source__")) {
                str = I.a(str, "click_source=__click_source__", "click_source=" + i3, true);
            }
            return (i4 <= 0 || !str.contains("click_module=__click_module__")) ? str : I.a(str, "click_module=__click_module__", "click_module=" + i4, true);
        } catch (Throwable unused) {
            return str;
        }
    }
}
