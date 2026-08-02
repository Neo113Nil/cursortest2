package com.google.android.gms.internal.ads;

import Q2.C0375o;
import Q2.C0379q;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q.C2294i;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class Kw implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10281k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f10282l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f10283m;

    public /* synthetic */ Kw(int i, Object obj, Object obj2) {
        this.f10281k = i;
        this.f10282l = obj;
        this.f10283m = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0074, code lost:
    
        if (r1 == 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        U5 u5 = (U5) this.f10283m;
        View view = (View) this.f10282l;
        try {
            Q5 q5 = new Q5(u5.f11728p, u5.f11729q, u5.f11730r, u5.f11731s, u5.f11732t, u5.f11733u, u5.f11734v, u5.f11737y);
            Application f = P2.o.f4767B.f.f();
            if (f != null && !TextUtils.isEmpty(u5.f11735w)) {
                String str = (String) view.getTag(f.getResources().getIdentifier((String) Q2.r.f5053d.f5056c.a(F7.f8786Y), "id", f.getPackageName()));
                if (str != null && str.equals(u5.f11735w)) {
                    return;
                }
            }
            E.H0 a5 = u5.a(view, q5);
            q5.b();
            if (a5.f1041a == 0 && a5.f1042b == 0) {
                return;
            }
            int i = a5.f1042b;
            if (i == 0) {
                if (q5.f11176k == 0) {
                    return;
                }
            }
            G3 g32 = u5.f11726n;
            synchronized (g32.f9166m) {
                try {
                    if (((LinkedList) g32.f9167n).contains(q5)) {
                        return;
                    }
                    u5.f11726n.e(q5);
                } finally {
                }
            }
        } catch (Exception e3) {
            U2.j.g("Exception in fetchContentOnUIThread", e3);
            P2.o.f4767B.f4774g.i("ContentFetchTask.fetchContent", e3);
        }
    }

    private final void b() {
        InterfaceC1341nf c1251lf;
        Context context = (Context) this.f10282l;
        F7.a(context);
        A7 a7 = F7.f8923x0;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) rVar.f5056c.a(F7.f8860m0)).booleanValue());
        if (((Boolean) rVar.f5056c.a(F7.f8900t0)).booleanValue()) {
            bundle.putString("ad_storage", "denied");
            bundle.putString("analytics_storage", "denied");
        }
        String str = (String) this.f10283m;
        m3.v.e(context);
        if (y3.r.i == null) {
            synchronized (y3.r.class) {
                try {
                    if (y3.r.i == null) {
                        y3.r.i = new y3.r(context, str, bundle);
                    }
                } finally {
                }
            }
        }
        A0.J0 j02 = y3.r.i.f21273d;
        try {
            try {
                IBinder b3 = U2.j.b(context).b("com.google.android.gms.ads.measurement.DynamiteMeasurementManager");
                int i = AbstractBinderC1296mf.f14504k;
                if (b3 == null) {
                    c1251lf = null;
                } else {
                    IInterface queryLocalInterface = b3.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
                    c1251lf = queryLocalInterface instanceof InterfaceC1341nf ? (InterfaceC1341nf) queryLocalInterface : new C1251lf(b3, "com.google.android.gms.ads.measurement.IMeasurementManager", 0);
                }
                BinderC2361b binderC2361b = new BinderC2361b(context);
                M9 m9 = new M9(j02);
                C1251lf c1251lf2 = (C1251lf) c1251lf;
                Parcel N5 = c1251lf2.N();
                F5.e(N5, binderC2361b);
                F5.e(N5, m9);
                c1251lf2.d1(N5, 2);
            } catch (Exception e3) {
                throw new U2.k(e3);
            }
        } catch (U2.k e5) {
            e = e5;
            U2.j.k("#007 Could not call remote method.", e);
        } catch (RemoteException e6) {
            e = e6;
            U2.j.k("#007 Could not call remote method.", e);
        } catch (NullPointerException e7) {
            e = e7;
            U2.j.k("#007 Could not call remote method.", e);
        }
    }

    private final void c() {
        C0724Yc c0724Yc = (C0724Yc) this.f10282l;
        Bitmap bitmap = (Bitmap) this.f10283m;
        c0724Yc.getClass();
        C1733wB c1733wB = AbstractC1823yB.f16414l;
        C1778xB c1778xB = new C1778xB();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, c1778xB);
        synchronized (c0724Yc.f12343h) {
            LC lc = c0724Yc.f12337a;
            C0973fD w5 = C1018gD.w();
            AbstractC1823yB b3 = c1778xB.b();
            w5.e();
            C1018gD.x((C1018gD) w5.f10141l, b3);
            w5.e();
            C1018gD.y((C1018gD) w5.f10141l);
            w5.e();
            C1018gD.z((C1018gD) w5.f10141l);
            C1018gD c1018gD = (C1018gD) w5.b();
            lc.e();
            C1331nD.I((C1331nD) lc.f10141l, c1018gD);
        }
    }

    private final void d() {
        Mt mt = new Mt(14, (C0733Ze) this.f10282l);
        C1125in c1125in = (C1125in) this.f10283m;
        synchronized (c1125in) {
            C0375o c0375o = c1125in.f;
            if (c0375o == null || c1125in.f13989d == null) {
                return;
            }
            P2.o.f4767B.f4789w.getClass();
            Oi.p(new RunnableC1081hn(1, c0375o, mt));
            c1125in.f = null;
            c1125in.f13989d.f0(null);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.E5, com.google.android.gms.internal.ads.bk] */
    private final void e() {
        ViewGroup viewGroup;
        View view;
        View view2;
        ViewGroup viewGroup2;
        G8 a5;
        Drawable drawable;
        Pj pj = (Pj) this.f10282l;
        Ij ij = pj.f11095c;
        boolean e3 = ij.e();
        ?? r42 = (E5) this.f10283m;
        if (e3 || ij.d()) {
            String[] strArr = {"1098", "3011"};
            for (int i = 0; i < 2; i++) {
                View N5 = r42.N(strArr[i]);
                if (N5 != null && (N5 instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) N5;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = r42.c().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        Gj gj = pj.f11096d;
        synchronized (gj) {
            view = gj.f9229d;
        }
        if (view != null) {
            view2 = gj.F();
            B8 b8 = pj.i;
            if (b8 != null && viewGroup == null) {
                Pj.b(layoutParams, b8.f7774o);
                view2.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (gj.L() instanceof BinderC1775x8) {
            BinderC1775x8 binderC1775x8 = (BinderC1775x8) gj.L();
            if (viewGroup == null) {
                Pj.b(layoutParams, binderC1775x8.f16238r);
                viewGroup = null;
            }
            C1820y8 c1820y8 = new C1820y8(context);
            m3.v.e(binderC1775x8);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(C1820y8.f16412l, null, null));
            shapeDrawable.getPaint().setColor(binderC1775x8.f16234n);
            c1820y8.setLayoutParams(layoutParams);
            c1820y8.setBackground(shapeDrawable);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            String str = binderC1775x8.f16231k;
            if (!TextUtils.isEmpty(str)) {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                TextView textView = new TextView(context);
                textView.setLayoutParams(layoutParams3);
                textView.setId(1195835393);
                textView.setTypeface(Typeface.DEFAULT);
                textView.setText(str);
                textView.setTextColor(binderC1775x8.f16235o);
                textView.setTextSize(binderC1775x8.f16236p);
                U2.e eVar = C0379q.f.f5048a;
                textView.setPadding(U2.e.l(context, 4), 0, U2.e.i(context.getResources().getDisplayMetrics(), 4), 0);
                c1820y8.addView(textView);
                layoutParams2.addRule(1, textView.getId());
            }
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(layoutParams2);
            imageView.setId(1195835394);
            ArrayList arrayList = binderC1775x8.f16232l;
            if (arrayList != null && arrayList.size() > 1) {
                c1820y8.f16413k = new AnimationDrawable();
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    int i6 = i5 + 1;
                    try {
                        c1820y8.f16413k.addFrame((Drawable) BinderC2361b.t1(((BinderC1865z8) arrayList.get(i5)).c()), binderC1775x8.f16237q);
                    } catch (Exception e5) {
                        U2.j.g("Error while getting drawable.", e5);
                    }
                    i5 = i6;
                }
                imageView.setBackground(c1820y8.f16413k);
            } else if (arrayList.size() == 1) {
                try {
                    imageView.setImageDrawable((Drawable) BinderC2361b.t1(((BinderC1865z8) arrayList.get(0)).c()));
                } catch (Exception e6) {
                    U2.j.g("Error while getting drawable.", e6);
                }
            }
            c1820y8.addView(imageView);
            c1820y8.setContentDescription((CharSequence) Q2.r.f5053d.f5056c.a(F7.f8713K3));
            view2 = c1820y8;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            if (view2.getParent() instanceof ViewGroup) {
                ((ViewGroup) view2.getParent()).removeView(view2);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view2);
            } else {
                M2.e eVar2 = new M2.e(r42.c().getContext());
                eVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                eVar2.addView(view2);
                FrameLayout g5 = r42.g();
                if (g5 != null) {
                    g5.addView(eVar2);
                }
            }
            r42.L(r42.k(), view2);
        }
        C1761wv c1761wv = Oj.f10958z;
        int i7 = c1761wv.f16186n;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                viewGroup2 = null;
                break;
            }
            View N6 = r42.N((String) c1761wv.get(i8));
            i8++;
            if (N6 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) N6;
                break;
            }
        }
        pj.f11099h.execute(new Kw(22, pj, viewGroup2));
        if (viewGroup2 == null) {
            return;
        }
        if (pj.c(viewGroup2, true)) {
            if (gj.R() != null) {
                gj.R().a0(new C0709Wb((InterfaceViewOnClickListenerC0810bk) r42, viewGroup2));
                return;
            }
            return;
        }
        A7 a7 = F7.D9;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && pj.c(viewGroup2, false)) {
            if (gj.P() != null) {
                gj.P().a0(new C0709Wb((InterfaceViewOnClickListenerC0810bk) r42, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View c5 = r42.c();
        Context context2 = c5 != null ? c5.getContext() : null;
        if (context2 == null || (a5 = pj.f11100j.a()) == null) {
            return;
        }
        try {
            InterfaceC2360a e7 = a5.e();
            if (e7 == null || (drawable = (Drawable) BinderC2361b.t1(e7)) == null) {
                return;
            }
            ImageView imageView2 = new ImageView(context2);
            imageView2.setImageDrawable(drawable);
            InterfaceC2360a h3 = r42.h();
            if (h3 != null) {
                if (((Boolean) rVar.f5056c.a(F7.O5)).booleanValue()) {
                    imageView2.setScaleType((ImageView.ScaleType) BinderC2361b.t1(h3));
                    imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView2);
                }
            }
            imageView2.setScaleType(Pj.f11092k);
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView2);
        } catch (RemoteException unused) {
            U2.j.i("Could not get main image drawable");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void f() {
        C1706vl c1706vl;
        C0950er b3;
        Executor executor;
        Kl kl;
        final Kl kl2 = (Kl) ((Mt) this.f10282l).f10741l;
        String str = (String) this.f10283m;
        int i = 5;
        Jr j5 = AbstractC1668us.j(kl2.f, 5);
        j5.e();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final Jr j6 = AbstractC1668us.j(kl2.f, i);
                j6.e();
                j6.H(next);
                final Object obj = new Object();
                final C0634Ld c0634Ld = new C0634Ld();
                E3.a l02 = AbstractC1400ot.l0(c0634Ld, ((Long) Q2.r.f5053d.f5056c.a(F7.f8729N1)).longValue(), TimeUnit.SECONDS, kl2.f10236k);
                kl2.f10237l.b(next);
                kl2.f10240o.C(next);
                P2.o.f4767B.f4776j.getClass();
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                l02.a(new Runnable() { // from class: com.google.android.gms.internal.ads.Il
                    @Override // java.lang.Runnable
                    public final void run() {
                        Kl kl3 = kl2;
                        Object obj2 = obj;
                        C0634Ld c0634Ld2 = c0634Ld;
                        String str2 = next;
                        long j7 = elapsedRealtime;
                        Jr jr = j6;
                        kl3.getClass();
                        synchronized (obj2) {
                            try {
                                if (!c0634Ld2.f10334k.isDone()) {
                                    P2.o.f4767B.f4776j.getClass();
                                    kl3.d(str2, (int) (SystemClock.elapsedRealtime() - j7), "Timeout.", false);
                                    kl3.f10237l.a(str2, "timeout");
                                    kl3.f10240o.j(str2, "timeout");
                                    Nr nr = kl3.f10241p;
                                    jr.C("Timeout");
                                    jr.g(false);
                                    nr.b(jr.l());
                                    c0634Ld2.b(Boolean.FALSE);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, kl2.i);
                arrayList.add(l02);
                Jl jl = new Jl(elapsedRealtime, c0634Ld, kl2, j6, obj, next);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i5 = 0;
                        while (i5 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i5);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new W9(optString, bundle));
                            i5++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                kl2.d(next, 0, "", false);
                try {
                    b3 = kl2.f10234h.b(next, new JSONObject());
                    executor = kl2.f10235j;
                    try {
                        kl = kl2;
                    } catch (Yq e3) {
                        e = e3;
                    }
                } catch (Yq e5) {
                    e = e5;
                }
                try {
                    kl2 = kl;
                    executor.execute(new RunnableC1699ve(kl, next, jl, b3, arrayList2));
                } catch (Yq e6) {
                    e = e6;
                    kl2 = kl;
                    jl = jl;
                    try {
                        String str2 = "Failed to create Adapter.";
                        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Ac)).booleanValue()) {
                            str2 = "Failed to create Adapter. " + e.getMessage();
                        }
                        jl.u3(str2);
                    } catch (RemoteException e7) {
                        U2.j.g("", e7);
                    }
                    i = 5;
                } catch (JSONException e8) {
                    e = e8;
                    kl2 = kl;
                    T2.G.n("Malformed CLD response", e);
                    kl2.f10240o.d("MalformedJson");
                    c1706vl = kl2.f10237l;
                    synchronized (c1706vl) {
                    }
                }
                i = 5;
            }
            AbstractC1044gv l5 = AbstractC1044gv.l(arrayList);
            A4 a42 = new A4(4, kl2, j5);
            Qw qw = kl2.i;
            Dw dw = new Dw(l5, false, false);
            dw.f8420z = new Cw(dw, a42, qw);
            dw.w();
        } catch (JSONException e9) {
            e = e9;
            T2.G.n("Malformed CLD response", e);
            kl2.f10240o.d("MalformedJson");
            c1706vl = kl2.f10237l;
            synchronized (c1706vl) {
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8788Y1)).booleanValue()) {
                    HashMap e10 = c1706vl.e();
                    e10.put("action", "aaia");
                    e10.put("aair", "MalformedJson");
                    c1706vl.f16033b.add(e10);
                }
            }
            kl2.f10232e.c(e);
            P2.o.f4767B.f4774g.i("AdapterInitializer.updateAdapterStatus", e);
            Nr nr = kl2.f10241p;
            j5.f(e);
            j5.g(false);
            nr.b(j5.l());
        }
    }

    private final void g() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Vl vl = (Vl) this.f10282l;
        String str = (String) this.f10283m;
        Ul ul = vl.f11931m;
        synchronized (ul) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("platform", "ANDROID");
                    if (!TextUtils.isEmpty(ul.f11795k)) {
                        jSONObject.put("sdkVersion", "afma-sdk-a-v" + ul.f11795k);
                    }
                    jSONObject.put("internalSdkVersion", ul.i);
                    jSONObject.put("osVersion", Build.VERSION.RELEASE);
                    jSONObject.put("adapters", ul.f11790d.a());
                    A7 a7 = F7.Z8;
                    Q2.r rVar = Q2.r.f5053d;
                    if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                        String str2 = P2.o.f4767B.f4774g.f8014g;
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put("plugin", str2);
                        }
                    }
                    long j5 = ul.f11801q;
                    P2.o oVar = P2.o.f4767B;
                    oVar.f4776j.getClass();
                    if (j5 < System.currentTimeMillis() / 1000) {
                        ul.f11799o = "{}";
                    }
                    jSONObject.put("networkExtras", ul.f11799o);
                    jSONObject.put("adSlots", ul.h());
                    jSONObject.put("appInfo", ul.f11791e.c());
                    String str3 = oVar.f4774g.d().t().f7598e;
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject.put("cld", new JSONObject(str3));
                    }
                    if (((Boolean) rVar.f5056c.a(F7.P8)).booleanValue() && (jSONObject2 = ul.f11800p) != null) {
                        U2.j.d("Server data: " + jSONObject2.toString());
                        jSONObject.put("serverData", ul.f11800p);
                    }
                    if (((Boolean) rVar.f5056c.a(F7.O8)).booleanValue()) {
                        jSONObject.put("openAction", ul.f11806v);
                        jSONObject.put("gesture", ul.f11802r);
                    }
                    jSONObject.put("isGamRegisteredTestDevice", oVar.f4780n.g());
                    U2.e eVar = C0379q.f.f5048a;
                    jSONObject.put("isSimulator", U2.e.j());
                    if (((Boolean) rVar.f5056c.a(F7.b9)).booleanValue()) {
                        jSONObject.put("uiStorage", new JSONObject(ul.f11808x));
                    }
                    if (!TextUtils.isEmpty((CharSequence) rVar.f5056c.a(F7.d9))) {
                        jSONObject.put("gmaDisk", (JSONObject) ul.f11793h.f14501b);
                    }
                    if (!TextUtils.isEmpty((CharSequence) rVar.f5056c.a(F7.c9))) {
                        jSONObject.put("userDisk", (JSONObject) ul.f11792g.f14501b);
                    }
                } catch (JSONException e3) {
                    P2.o.f4767B.f4774g.h("Inspector.toJson", e3);
                    U2.j.j("Ad inspector encountered an error", e3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        vl.f11932n.j("window.inspectorInfo", jSONObject.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable b3;
        C0733Ze c0733Ze;
        MediaPlayer mediaPlayer;
        MediaFormat format;
        Runnable runnable;
        String a5;
        I5 i5 = null;
        int i = 2;
        int i6 = 0;
        switch (this.f10281k) {
            case 0:
                E3.a aVar = (E3.a) this.f10282l;
                boolean z3 = aVar instanceof AbstractC0867cx;
                Jw jw = (Jw) this.f10283m;
                if (z3 && (b3 = ((AbstractC0867cx) aVar).b()) != null) {
                    jw.u(b3);
                    return;
                }
                try {
                    jw.mo14o(AbstractC1400ot.m0(aVar));
                    return;
                } catch (ExecutionException e3) {
                    jw.u(e3.getCause());
                    return;
                } catch (Throwable th) {
                    jw.u(th);
                    return;
                }
            case 1:
                C0709Wb c0709Wb = (C0709Wb) this.f10282l;
                c0709Wb.getClass();
                int i7 = AbstractC1260lo.f14419a;
                Fk fk = ((SurfaceHolderCallbackC0974fE) c0709Wb.f12041m).f13463k.f13921v;
                fk.c(25, new C0929eE((C1519re) this.f10283m));
                fk.b();
                return;
            case 2:
                C0709Wb c0709Wb2 = (C0709Wb) this.f10282l;
                SD sd = (SD) this.f10283m;
                c0709Wb2.getClass();
                synchronized (sd) {
                }
                int i8 = AbstractC1260lo.f14419a;
                SE se = ((SurfaceHolderCallbackC0974fE) c0709Wb2.f12041m).f13463k.f13883A;
                OE j5 = se.j((C1603tG) se.f11524d.f14582o);
                se.i(j5, 1020, new Hq(j5, sd));
                return;
            case 3:
                try {
                    ((C1500r3) this.f10283m).f15260l.put((A3) this.f10282l);
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            case 4:
                a();
                return;
            case 5:
                if (((C1548s6) this.f10283m).isCancelled()) {
                    ((E3.a) this.f10282l).cancel(true);
                    return;
                }
                return;
            case 6:
                boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8714K4)).booleanValue();
                D3.l lVar = (D3.l) this.f10282l;
                Context context = (Context) this.f10283m;
                if (booleanValue) {
                    try {
                        try {
                            IBinder b5 = U2.j.b(context).b("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger");
                            int i9 = H5.f9324k;
                            if (b5 != null) {
                                IInterface queryLocalInterface = b5.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
                                i5 = queryLocalInterface instanceof I5 ? (I5) queryLocalInterface : new G5(b5, "com.google.android.gms.ads.clearcut.IClearcut", 0);
                            }
                            lVar.f962m = i5;
                            ((G5) ((I5) lVar.f962m)).t1(new BinderC2361b(context));
                            lVar.f961l = true;
                            return;
                        } catch (Exception e5) {
                            throw new U2.k(e5);
                        }
                    } catch (U2.k | RemoteException | NullPointerException unused2) {
                        U2.j.d("Cannot dynamite load clearcut");
                        return;
                    }
                }
                return;
            case 7:
                C1515ra c1515ra = (C1515ra) this.f10283m;
                C4.m mVar = (C4.m) this.f10282l;
                mVar.getClass();
                P2.o.f4767B.f4776j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                try {
                    T2.G.m("loadJavascriptEngine > Before createJavascriptEngine");
                    C1068ha c1068ha = new C1068ha((Context) mVar.f909b, (U2.a) mVar.f911d);
                    T2.G.m("loadJavascriptEngine > After createJavascriptEngine");
                    T2.G.m("loadJavascriptEngine > Before setting new engine loaded listener");
                    c1068ha.f13758k.I().f13620r = new C1529ro(7, new C1201ka(mVar, arrayList, currentTimeMillis, c1515ra, c1068ha));
                    T2.G.m("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
                    c1068ha.b("/jsLoaded", new C1336na(mVar, currentTimeMillis, c1515ra, c1068ha));
                    A0.J0 j02 = new A0.J0();
                    C1381oa c1381oa = new C1381oa(mVar, c1068ha, j02);
                    j02.f304k = c1381oa;
                    T2.G.m("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
                    c1068ha.b("/requestReload", c1381oa);
                    String str = (String) mVar.f910c;
                    T2.G.m("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
                    if (str.endsWith(".js")) {
                        T2.G.m("loadJavascriptEngine > Before newEngine.loadJavascript");
                        T2.G.m("loadJavascript on adWebView from path: ".concat(str));
                        C1068ha.q(new RunnableC0978fa(c1068ha, "<!DOCTYPE html><html><head><script src=\"" + str + "\"></script></head><body></body></html>", 3));
                        T2.G.m("loadJavascriptEngine > After newEngine.loadJavascript");
                    } else if (str.startsWith("<html>")) {
                        T2.G.m("loadJavascriptEngine > Before newEngine.loadHtml");
                        T2.G.m("loadHtml on adWebView from html");
                        C1068ha.q(new RunnableC0978fa(c1068ha, str, i));
                        T2.G.m("loadJavascriptEngine > After newEngine.loadHtml");
                    } else {
                        T2.G.m("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                        T2.G.m("loadHtmlWrapper on adWebView from path: ".concat(str));
                        C1068ha.q(new RunnableC0978fa(c1068ha, str, i6));
                        T2.G.m("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
                    }
                    T2.G.m("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
                    T2.L.f5672l.postDelayed(new RunnableC1246la(mVar, c1515ra, c1068ha, arrayList, currentTimeMillis, 1), ((Integer) Q2.r.f5053d.f5056c.a(F7.f8807c)).intValue());
                    return;
                } catch (Throwable th2) {
                    U2.j.g("Error creating webview.", th2);
                    A7 a7 = F7.p7;
                    Q2.r rVar = Q2.r.f5053d;
                    if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                        c1515ra.o("SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine", th2);
                        return;
                    } else if (((Boolean) rVar.f5056c.a(F7.r7)).booleanValue()) {
                        P2.o.f4767B.f4774g.h("SdkJavascriptFactory.loadJavascriptEngine", th2);
                        c1515ra.n();
                        return;
                    } else {
                        P2.o.f4767B.f4774g.i("SdkJavascriptFactory.loadJavascriptEngine", th2);
                        c1515ra.n();
                        return;
                    }
                }
            case 8:
                b();
                return;
            case 9:
                Q1.j jVar = P2.o.f4767B.f4770b;
                Q1.j.g(((zzbrw) this.f10283m).f16802a, (AdOverlayInfoParcel) this.f10282l, true, null);
                return;
            case 10:
                ((U2.m) this.f10282l).d((String) this.f10283m);
                return;
            case 11:
                c();
                return;
            case 12:
                C0634Ld c0634Ld = (C0634Ld) this.f10283m;
                try {
                    c0634Ld.b(N2.b.a((Context) this.f10282l));
                    return;
                } catch (j3.g | IOException | IllegalStateException e6) {
                    c0634Ld.c(e6);
                    U2.j.g("Exception while getting advertising Id info", e6);
                    return;
                }
            case 13:
                boolean booleanValue2 = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8741P1)).booleanValue();
                TextureViewSurfaceTextureListenerC0683Sd textureViewSurfaceTextureListenerC0683Sd = (TextureViewSurfaceTextureListenerC0683Sd) this.f10283m;
                if (booleanValue2 && (c0733Ze = textureViewSurfaceTextureListenerC0683Sd.f11540m) != null && (mediaPlayer = (MediaPlayer) this.f10282l) != null) {
                    try {
                        MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                        if (trackInfo != null) {
                            HashMap hashMap = new HashMap();
                            while (i6 < trackInfo.length) {
                                MediaPlayer.TrackInfo trackInfo2 = trackInfo[i6];
                                if (trackInfo2 != null) {
                                    int trackType = trackInfo2.getTrackType();
                                    if (trackType == 1) {
                                        MediaFormat format2 = trackInfo2.getFormat();
                                        if (format2 != null) {
                                            if (format2.containsKey("frame-rate")) {
                                                try {
                                                    hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                                } catch (ClassCastException unused3) {
                                                    hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                                }
                                            }
                                            if (format2.containsKey("bitrate")) {
                                                Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                                textureViewSurfaceTextureListenerC0683Sd.f11539B = valueOf;
                                                hashMap.put("bitRate", String.valueOf(valueOf));
                                            }
                                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                                hashMap.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                            }
                                            if (format2.containsKey("mime")) {
                                                hashMap.put("videoMime", format2.getString("mime"));
                                            }
                                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                                hashMap.put("videoCodec", format2.getString("codecs-string"));
                                            }
                                        }
                                    } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                                        if (format.containsKey("mime")) {
                                            hashMap.put("audioMime", format.getString("mime"));
                                        }
                                        if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                            hashMap.put("audioCodec", format.getString("codecs-string"));
                                        }
                                    }
                                }
                                i6++;
                            }
                            if (!hashMap.isEmpty()) {
                                c0733Ze.a("onMetadataEvent", hashMap);
                            }
                        }
                    } catch (RuntimeException e7) {
                        P2.o.f4767B.f4774g.i("AdMediaPlayerView.reportMetadata", e7);
                    }
                }
                C0711Wd c0711Wd = textureViewSurfaceTextureListenerC0683Sd.f11553z;
                if (c0711Wd != null) {
                    c0711Wd.g();
                    return;
                }
                return;
            case 14:
                AtomicInteger atomicInteger = C0614Ie.f9545E;
                ((InterfaceC0677Re) this.f10282l).a("onGcacheInfoEvent", (HashMap) this.f10283m);
                return;
            case 15:
                d();
                return;
            case 16:
                ((ViewTreeObserverOnGlobalLayoutListenerC0805bf) this.f10282l).j0((String) this.f10283m);
                return;
            case 17:
                ((BinderC0894df) this.f10282l).f13114k.a("pubVideoCmd", (HashMap) this.f10283m);
                return;
            case 18:
                C0983ff c0983ff = (C0983ff) this.f10282l;
                Uri parse = Uri.parse((String) this.f10283m);
                C1028gf c1028gf = ((ViewTreeObserverOnGlobalLayoutListenerC0805bf) c0983ff.f13478b.f11282l).f12894x;
                if (c1028gf == null) {
                    U2.j.f("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                    return;
                } else {
                    c1028gf.B0(parse);
                    return;
                }
            case 19:
                ((C1746wg) this.f10282l).f16127k.o("AFMA_updateActiveView", (JSONObject) this.f10283m);
                return;
            case 20:
                K4 k42 = (K4) this.f10283m;
                AtomicReference atomicReference = (AtomicReference) k42.f10120l;
                C0679Rg c0679Rg = (C0679Rg) this.f10282l;
                c0679Rg.getClass();
                try {
                    InterfaceC1059h9 interfaceC1059h9 = c0679Rg.f11442j;
                    BinderC2361b binderC2361b = new BinderC2361b(k42);
                    C0969f9 c0969f9 = (C0969f9) interfaceC1059h9;
                    Parcel N5 = c0969f9.N();
                    F5.e(N5, binderC2361b);
                    Parcel Y4 = c0969f9.Y(N5, 2);
                    Object[] objArr = Y4.readInt() != 0 ? 1 : null;
                    Y4.recycle();
                    if (objArr != null || (runnable = (Runnable) atomicReference.getAndSet(null)) == null) {
                        return;
                    }
                    runnable.run();
                    return;
                } catch (RemoteException unused4) {
                    Runnable runnable2 = (Runnable) atomicReference.getAndSet(null);
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
            case C1639u7.zzm /* 21 */:
                try {
                    ((Ei) this.f10282l).mo13k(this.f10283m);
                    return;
                } catch (Throwable th3) {
                    P2.o.f4767B.f4774g.h("EventEmitter.notify", th3);
                    T2.G.n("Event emitter exception.", th3);
                    return;
                }
            case 22:
                Pj pj = (Pj) this.f10282l;
                Gj gj = pj.f11096d;
                if (gj.G() != null) {
                    boolean z5 = ((ViewGroup) this.f10283m) != null;
                    int D5 = gj.D();
                    Wq wq = pj.f11094b;
                    T2.I i10 = pj.f11093a;
                    if (D5 == 2 || gj.D() == 1) {
                        i10.f(wq.f, String.valueOf(gj.D()), z5);
                        return;
                    } else {
                        if (gj.D() == 6) {
                            i10.f(wq.f, "2", z5);
                            i10.f(wq.f, "1", z5);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 23:
                e();
                return;
            case 24:
                C1514rH.b(((C1470qH) this.f10283m).f15121a, ((C0901dm) this.f10282l).b());
                return;
            case 25:
                Kl kl = (Kl) this.f10282l;
                kl.getClass();
                kl.i.execute(new K4(29, (C0634Ld) this.f10283m));
                return;
            case 26:
                try {
                    ((U9) this.f10283m).x1(((Kl) this.f10282l).a());
                    return;
                } catch (RemoteException e8) {
                    U2.j.g("", e8);
                    return;
                }
            case 27:
                f();
                return;
            case 28:
                g();
                return;
            default:
                C0945em c0945em = (C0945em) this.f10282l;
                c0945em.getClass();
                P7 p7 = P2.o.f4767B.f4779m;
                Context context2 = (Context) this.f10283m;
                if (p7.f11066b.getAndSet(true)) {
                    return;
                }
                p7.f11067c = context2;
                p7.f11068d = c0945em.f13333l;
                if (p7.f != null || (a5 = C2294i.a(context2)) == null) {
                    return;
                }
                p7.f18853a = context2.getApplicationContext();
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(a5)) {
                    intent.setPackage(a5);
                }
                context2.bindService(intent, p7, 33);
                return;
        }
    }

    public String toString() {
        switch (this.f10281k) {
            case 0:
                C0905dr c0905dr = new C0905dr(Kw.class.getSimpleName(), 28);
                Er er = new Er(2);
                ((Er) c0905dr.f13188n).f8618m = er;
                c0905dr.f13188n = er;
                er.f8617l = (Jw) this.f10283m;
                return c0905dr.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ Kw(int i, Object obj, Object obj2, boolean z3) {
        this.f10281k = i;
        this.f10282l = obj2;
        this.f10283m = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Kw(Pj pj, InterfaceViewOnClickListenerC0810bk interfaceViewOnClickListenerC0810bk) {
        this.f10281k = 23;
        this.f10282l = pj;
        this.f10283m = (E5) interfaceViewOnClickListenerC0810bk;
    }
}
