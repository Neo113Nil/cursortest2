package com.google.android.gms.internal.ads;

import P.C0322v0;
import Q2.C0379q;
import Q2.InterfaceC0347a;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import d2.AbstractC1914b;
import e2.AbstractC1933n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import k4.AbstractC2036a;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import r0.AbstractC2346c;

/* renamed from: com.google.android.gms.internal.ads.bf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0805bf extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, InterfaceC0677Re {

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f12848l0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public C1125in f12849A;

    /* renamed from: B, reason: collision with root package name */
    public C1586t f12850B;

    /* renamed from: C, reason: collision with root package name */
    public final String f12851C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f12852D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f12853E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f12854F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f12855G;

    /* renamed from: H, reason: collision with root package name */
    public Boolean f12856H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f12857I;
    public final String J;
    public BinderC0894df K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f12858L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f12859M;

    /* renamed from: N, reason: collision with root package name */
    public A8 f12860N;

    /* renamed from: O, reason: collision with root package name */
    public ViewTreeObserverOnGlobalLayoutListenerC1840yk f12861O;

    /* renamed from: P, reason: collision with root package name */
    public Z5 f12862P;

    /* renamed from: Q, reason: collision with root package name */
    public int f12863Q;

    /* renamed from: R, reason: collision with root package name */
    public int f12864R;

    /* renamed from: S, reason: collision with root package name */
    public I7 f12865S;

    /* renamed from: T, reason: collision with root package name */
    public final I7 f12866T;

    /* renamed from: U, reason: collision with root package name */
    public I7 f12867U;

    /* renamed from: V, reason: collision with root package name */
    public final C1390oj f12868V;

    /* renamed from: W, reason: collision with root package name */
    public int f12869W;

    /* renamed from: a0, reason: collision with root package name */
    public S2.d f12870a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f12871b0;

    /* renamed from: c0, reason: collision with root package name */
    public final C0322v0 f12872c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f12873d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f12874e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f12875f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f12876g0;

    /* renamed from: h0, reason: collision with root package name */
    public HashMap f12877h0;

    /* renamed from: i0, reason: collision with root package name */
    public final WindowManager f12878i0;

    /* renamed from: j0, reason: collision with root package name */
    public final C1773x6 f12879j0;

    /* renamed from: k, reason: collision with root package name */
    public final C1206kf f12880k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f12881k0;

    /* renamed from: l, reason: collision with root package name */
    public final Q4 f12882l;

    /* renamed from: m, reason: collision with root package name */
    public final Xq f12883m;

    /* renamed from: n, reason: collision with root package name */
    public final T7 f12884n;

    /* renamed from: o, reason: collision with root package name */
    public final U2.a f12885o;

    /* renamed from: p, reason: collision with root package name */
    public Mt f12886p;

    /* renamed from: q, reason: collision with root package name */
    public final G.v f12887q;

    /* renamed from: r, reason: collision with root package name */
    public final DisplayMetrics f12888r;

    /* renamed from: s, reason: collision with root package name */
    public final float f12889s;

    /* renamed from: t, reason: collision with root package name */
    public Lq f12890t;

    /* renamed from: u, reason: collision with root package name */
    public Nq f12891u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f12892v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f12893w;

    /* renamed from: x, reason: collision with root package name */
    public C1028gf f12894x;

    /* renamed from: y, reason: collision with root package name */
    public S2.d f12895y;

    /* renamed from: z, reason: collision with root package name */
    public C1169jn f12896z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTreeObserverOnGlobalLayoutListenerC0805bf(C1206kf c1206kf, C1586t c1586t, String str, boolean z3, Q4 q42, T7 t7, U2.a aVar, Mt mt, G.v vVar, C1773x6 c1773x6, Lq lq, Nq nq, Xq xq) {
        super(c1206kf);
        Nq nq2;
        String str2;
        G7 c5;
        int i = 2;
        this.f12892v = false;
        this.f12893w = false;
        this.f12857I = true;
        this.J = "";
        this.f12873d0 = -1;
        this.f12874e0 = -1;
        this.f12875f0 = -1;
        this.f12876g0 = -1;
        this.f12880k = c1206kf;
        this.f12850B = c1586t;
        this.f12851C = str;
        this.f12854F = z3;
        this.f12882l = q42;
        this.f12883m = xq;
        this.f12884n = t7;
        this.f12885o = aVar;
        this.f12886p = mt;
        this.f12887q = vVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f12878i0 = windowManager;
        T2.L l5 = P2.o.f4767B.f4771c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.f12888r = displayMetrics;
        this.f12889s = displayMetrics.density;
        this.f12879j0 = c1773x6;
        this.f12890t = lq;
        this.f12891u = nq;
        this.f12872c0 = new C0322v0(c1206kf.f14252a, this, this);
        this.f12881k0 = false;
        setBackgroundColor(0);
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.gb)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e3) {
            U2.j.g("Unable to enable Javascript.", e3);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        A7 a7 = F7.fb;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        P2.o oVar = P2.o.f4767B;
        settings.setUserAgentString(oVar.f4771c.x(c1206kf, aVar.f5852k));
        Context context = getContext();
        AbstractC2036a.l0(context, new P2.e(i, settings, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        B0();
        addJavascriptInterface(new C0983ff(this, new Qt(12, this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        C1390oj c1390oj = this.f12868V;
        if (c1390oj != null && (c5 = oVar.f4774g.c()) != null) {
            ((ArrayBlockingQueue) c5.f9170a).offer((L7) c1390oj.f14828m);
        }
        L7 l7 = new L7(this.f12851C);
        C1390oj c1390oj2 = new C1390oj(l7);
        this.f12868V = c1390oj2;
        synchronized (l7.f10325c) {
        }
        if (((Boolean) rVar.f5056c.a(F7.f8741P1)).booleanValue() && (nq2 = this.f12891u) != null && (str2 = nq2.f10823b) != null) {
            l7.b("gqi", str2);
        }
        I7 d5 = L7.d();
        this.f12866T = d5;
        ((HashMap) c1390oj2.f14827l).put("native:view_create", d5);
        Context context2 = null;
        this.f12867U = null;
        this.f12865S = null;
        if (H3.g.f2320m == null) {
            H3.g.f2320m = new H3.g();
        }
        H3.g gVar = H3.g.f2320m;
        gVar.getClass();
        T2.G.m("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(c1206kf);
        if (!defaultUserAgent.equals(gVar.f2322l)) {
            AtomicBoolean atomicBoolean = j3.h.f17515a;
            try {
                context2 = c1206kf.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (context2 == null) {
                c1206kf.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(c1206kf)).apply();
            }
            gVar.f2322l = defaultUserAgent;
        }
        T2.G.m("User agent is updated.");
        oVar.f4774g.f8016j.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void A(boolean z3) {
        if (z3) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        S2.d dVar = this.f12895y;
        if (dVar != null) {
            if (z3) {
                dVar.f5308v.setBackgroundColor(0);
            } else {
                dVar.f5308v.setBackgroundColor(-16777216);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void A0(String str, U4 u42) {
        C1028gf c1028gf = this.f12894x;
        if (c1028gf != null) {
            synchronized (c1028gf.f13616n) {
                try {
                    List<InterfaceC1821y9> list = (List) c1028gf.f13615m.get(str);
                    if (list == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (InterfaceC1821y9 interfaceC1821y9 : list) {
                        if ((interfaceC1821y9 instanceof C1023ga) && ((C1023ga) interfaceC1821y9).f13587k.equals((InterfaceC1821y9) u42.f11722l)) {
                            arrayList.add(interfaceC1821y9);
                        }
                    }
                    list.removeAll(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized Z5 B() {
        return this.f12862P;
    }

    public final synchronized void B0() {
        Lq lq = this.f12890t;
        if (lq != null && lq.f10512m0) {
            U2.j.d("Disabling hardware acceleration on an overlay.");
            T0();
            return;
        }
        if (!this.f12854F && !this.f12850B.b()) {
            U2.j.d("Enabling hardware acceleration on an AdView.");
            X0();
            return;
        }
        U2.j.d("Enabling hardware acceleration on an overlay.");
        X0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void C0() {
        this.f12881k0 = true;
    }

    public final synchronized void D(String str) {
        if (S()) {
            U2.j.i("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void D0(Z5 z5) {
        this.f12862P = z5;
    }

    @Override // com.google.android.gms.internal.ads.Vi
    public final void E() {
        C1028gf c1028gf = this.f12894x;
        if (c1028gf != null) {
            c1028gf.E();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void E0(S2.e eVar, boolean z3, boolean z5, String str) {
        this.f12894x.W0(eVar, z3, z5, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void F() {
        ViewTreeObserverOnGlobalLayoutListenerC1840yk viewTreeObserverOnGlobalLayoutListenerC1840yk = this.f12861O;
        if (viewTreeObserverOnGlobalLayoutListenerC1840yk != null) {
            T2.L.f5672l.post(new K4(28, viewTreeObserverOnGlobalLayoutListenerC1840yk));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final boolean F0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized S2.d G() {
        return this.f12870a0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized String G0() {
        return this.f12851C;
    }

    public final void H(String str) {
        if (w() == null) {
            synchronized (this) {
                Boolean f = P2.o.f4767B.f4774g.f();
                this.f12856H = f;
                if (f == null) {
                    try {
                        evaluateJavascript("(function(){})()", null);
                        o0(Boolean.TRUE);
                    } catch (IllegalStateException unused) {
                        o0(Boolean.FALSE);
                    }
                }
            }
        }
        if (w().booleanValue()) {
            D(str);
        } else {
            n0("javascript:".concat(str));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void H0(int i) {
        this.f12869W = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final /* synthetic */ C1028gf I() {
        return this.f12894x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void I0(S2.d dVar) {
        this.f12870a0 = dVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void J(boolean z3) {
        this.f12857I = z3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void J0(boolean z3) {
        S2.d dVar;
        int i = this.f12863Q + (true != z3 ? -1 : 1);
        this.f12863Q = i;
        if (i > 0 || (dVar = this.f12895y) == null) {
            return;
        }
        dVar.k1();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final View K() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void K0(C1586t c1586t) {
        this.f12850B = c1586t;
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void L(int i, boolean z3, boolean z5) {
        InterfaceC0347a interfaceC0347a;
        Vi vi;
        BinderC0857cn binderC0857cn;
        int i5;
        InterfaceC0347a interfaceC0347a2;
        boolean z6;
        C1028gf c1028gf = this.f12894x;
        C0733Ze c0733Ze = c1028gf.f13613k;
        boolean l02 = C1028gf.l0(c0733Ze.f12501k.r0(), c0733Ze);
        boolean z7 = true;
        if (!l02 && z5) {
            z7 = false;
        }
        if (l02) {
            interfaceC0347a = null;
            vi = null;
        } else {
            interfaceC0347a = c1028gf.f13617o;
            vi = null;
        }
        S2.m mVar = c1028gf.f13618p;
        Vi vi2 = vi;
        S2.c cVar = c1028gf.f13602E;
        U2.a aVar = c0733Ze.f12501k.f12885o;
        Vi vi3 = z7 ? vi2 : c1028gf.f13623u;
        if (C1028gf.j0(c0733Ze)) {
            binderC0857cn = c1028gf.f13611P;
            i5 = i;
            z6 = z3;
            interfaceC0347a2 = interfaceC0347a;
        } else {
            binderC0857cn = vi2;
            i5 = i;
            interfaceC0347a2 = interfaceC0347a;
            z6 = z3;
        }
        c1028gf.X0(new AdOverlayInfoParcel(interfaceC0347a2, mVar, cVar, c0733Ze, z6, i5, aVar, vi3, binderC0857cn));
    }

    public final synchronized void L0() {
        if (this.f12871b0) {
            return;
        }
        this.f12871b0 = true;
        P2.o.f4767B.f4774g.f8016j.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized C1586t M() {
        return this.f12850B;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void M0(String str, String str2) {
        C1028gf c1028gf = this.f12894x;
        c1028gf.getClass();
        C0733Ze c0733Ze = c1028gf.f13613k;
        c1028gf.X0(new AdOverlayInfoParcel(c0733Ze, c0733Ze.f12501k.f12885o, str, str2, c1028gf.f13611P));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void N(int i) {
        S2.d dVar = this.f12895y;
        if (dVar != null) {
            dVar.u3(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void N0() {
        float f;
        HashMap hashMap = new HashMap(3);
        P2.o oVar = P2.o.f4767B;
        hashMap.put("app_muted", String.valueOf(oVar.f4775h.d()));
        hashMap.put("app_volume", String.valueOf(oVar.f4775h.a()));
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager != null) {
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            if (streamMaxVolume != 0) {
                f = streamVolume / streamMaxVolume;
                hashMap.put("device_volume", String.valueOf(f));
                a("volume", hashMap);
            }
        }
        f = 0.0f;
        hashMap.put("device_volume", String.valueOf(f));
        a("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void O(ViewTreeObserverOnGlobalLayoutListenerC1840yk viewTreeObserverOnGlobalLayoutListenerC1840yk) {
        this.f12861O = viewTreeObserverOnGlobalLayoutListenerC1840yk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void O0() {
        S2.d V4 = V();
        if (V4 != null) {
            V4.f5308v.f5326l = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized A8 P() {
        return this.f12860N;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final ArrayList P0() {
        return new ArrayList();
    }

    public final /* synthetic */ void Q(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void Q0(boolean z3) {
        S2.d dVar = this.f12895y;
        if (dVar != null) {
            dVar.A3(this.f12894x.p(), z3);
        } else {
            this.f12852D = z3;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final E3.a R() {
        T7 t7 = this.f12884n;
        return t7 == null ? Mw.f10750l : (Hw) AbstractC1400ot.l0(Hw.r(Mw.f10750l), ((Long) AbstractC1013g8.f13565c.s()).longValue(), TimeUnit.MILLISECONDS, t7.f11630c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void R0(BinderC0894df binderC0894df) {
        if (this.K != null) {
            U2.j.f("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.K = binderC0894df;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized boolean S() {
        return this.f12853E;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void S0(String str, String str2) {
        Throwable th;
        String str3;
        try {
            try {
                if (S()) {
                    U2.j.i("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str4 = (String) Q2.r.f5053d.f5056c.a(F7.f8756S);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str4);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (JSONException e3) {
                    U2.j.j("Unable to build MRAID_ENV", e3);
                    str3 = null;
                }
                super.loadDataWithBaseURL(str, AbstractC1073hf.b(str2, str3), "text/html", "UTF-8", null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void T(boolean z3, int i, String str, boolean z5, boolean z6) {
        C1028gf c1028gf = this.f12894x;
        C0733Ze c0733Ze = c1028gf.f13613k;
        boolean r02 = c0733Ze.f12501k.r0();
        boolean l02 = C1028gf.l0(r02, c0733Ze);
        boolean z7 = true;
        if (!l02 && z5) {
            z7 = false;
        }
        InterfaceC0347a interfaceC0347a = l02 ? null : c1028gf.f13617o;
        C0698Ue c0698Ue = r02 ? null : new C0698Ue(c0733Ze, c1028gf.f13618p);
        InterfaceC1462q9 interfaceC1462q9 = c1028gf.f13621s;
        BinderC0857cn binderC0857cn = null;
        InterfaceC1506r9 interfaceC1506r9 = c1028gf.f13622t;
        boolean z8 = z7;
        C0698Ue c0698Ue2 = c0698Ue;
        S2.c cVar = c1028gf.f13602E;
        U2.a aVar = c0733Ze.f12501k.f12885o;
        Vi vi = z8 ? null : c1028gf.f13623u;
        if (C1028gf.j0(c0733Ze)) {
            binderC0857cn = c1028gf.f13611P;
        }
        c1028gf.X0(new AdOverlayInfoParcel(interfaceC0347a, c0698Ue2, interfaceC1462q9, interfaceC1506r9, cVar, c0733Ze, z3, i, str, aVar, vi, binderC0857cn, z6));
    }

    public final synchronized void T0() {
        try {
            if (!this.f12855G) {
                setLayerType(1, null);
            }
            this.f12855G = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized C1125in U() {
        return this.f12849A;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void U0(C1169jn c1169jn) {
        this.f12896z = c1169jn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized S2.d V() {
        return this.f12895y;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized boolean V0() {
        return this.f12857I;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void W(boolean z3) {
        this.f12894x.f13609N = z3;
    }

    public final void W0(boolean z3) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z3 ? "0" : "1");
        a("onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void X() {
        if (this.f12865S == null) {
            C1390oj c1390oj = this.f12868V;
            AbstractC1803xs.m((L7) c1390oj.f14828m, this.f12866T, "aes2");
            I7 d5 = L7.d();
            this.f12865S = d5;
            ((HashMap) c1390oj.f14827l).put("native:view_show", d5);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f12885o.f5852k);
        a("onshow", hashMap);
    }

    public final synchronized void X0() {
        try {
            if (this.f12855G) {
                setLayerType(0, null);
            }
            this.f12855G = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final Xq Y() {
        return this.f12883m;
    }

    public final synchronized void Y0() {
        try {
            T2.L.f5672l.post(new RunnableC0726Ye(this, 1));
        } catch (Throwable th) {
            P2.o.f4767B.f4774g.i("AdWebViewImpl.loadUrlUnsafe", th);
            U2.j.j("Could not call loadUrl in destroy(). ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized C1169jn Z() {
        return this.f12896z;
    }

    public final synchronized void Z0() {
        try {
            HashMap hashMap = this.f12877h0;
            if (hashMap != null) {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    ((AbstractC1744we) it.next()).i();
                }
            }
            this.f12877h0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0889da
    public final void a(String str, Map map) {
        try {
            k(str, C0379q.f.f5048a.g(map));
        } catch (JSONException unused) {
            U2.j.i("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void a0(A8 a8) {
        this.f12860N = a8;
    }

    public final synchronized AbstractC1744we a1(String str) {
        HashMap hashMap = this.f12877h0;
        if (hashMap == null) {
            return null;
        }
        return (AbstractC1744we) hashMap.get(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final Q4 b0() {
        return this.f12882l;
    }

    public final synchronized String b1() {
        return this.J;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized int c() {
        return this.f12869W;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final Context c0() {
        return this.f12880k.f14254c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1113ia
    public final void d(String str) {
        H(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final Nq d0() {
        return this.f12891u;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0041 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:3:0x0001, B:6:0x001b, B:9:0x004a, B:11:0x004e, B:12:0x005b, B:17:0x0074, B:19:0x0093, B:21:0x0099, B:23:0x009f, B:26:0x00a9, B:29:0x00b8, B:32:0x0028, B:34:0x002c, B:39:0x0041, B:40:0x0048, B:41:0x0033, B:43:0x0039, B:44:0x0006, B:46:0x0010), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0677Re
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void destroy() {
        G7 c5;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        try {
            C1390oj c1390oj = this.f12868V;
            if (c1390oj != null && (c5 = P2.o.f4767B.f4774g.c()) != null) {
                ((ArrayBlockingQueue) c5.f9170a).offer((L7) c1390oj.f14828m);
            }
            C0322v0 c0322v0 = this.f12872c0;
            c0322v0.f4567c = false;
            Activity activity = (Activity) c0322v0.f4569e;
            if (activity != null && c0322v0.f4565a) {
                Window window = activity.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    viewTreeObserver = decorView.getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC0805bf) c0322v0.f);
                    }
                    c0322v0.f4565a = false;
                }
                viewTreeObserver = null;
                if (viewTreeObserver != null) {
                }
                c0322v0.f4565a = false;
            }
            S2.d dVar = this.f12895y;
            if (dVar != null) {
                dVar.a();
                this.f12895y.l();
                this.f12895y = null;
            }
            this.f12896z = null;
            this.f12849A = null;
            this.f12894x.z0();
            this.f12862P = null;
            this.f12886p = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f12853E) {
                return;
            }
            P2.o.f4767B.f4792z.c(this);
            Z0();
            this.f12853E = true;
            if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.qa)).booleanValue()) {
                T2.G.m("Destroying the WebView immediately...");
                p();
                return;
            }
            Activity activity2 = this.f12880k.f14252a;
            if (activity2 != null && activity2.isDestroyed()) {
                T2.G.m("Destroying the WebView immediately...");
                p();
            } else {
                T2.G.m("Initiating WebView self destruct sequence in 3...");
                T2.G.m("Loading blank page in WebView, 2...");
                Y0();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final Activity e() {
        return this.f12880k.f14252a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void e0() {
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (S()) {
            U2.j.k("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.ra)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            AbstractC0613Id.f.b(new RunnableC1362o(this, str, valueCallback, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final int f() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void f0(C1125in c1125in) {
        this.f12849A = c1125in;
    }

    public final void finalize() {
        try {
            synchronized (this) {
                try {
                    if (!this.f12853E) {
                        this.f12894x.z0();
                        P2.o.f4767B.f4792z.c(this);
                        Z0();
                        L0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final int g() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void g0(long j5, boolean z3) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z3 ? "0" : "1");
        hashMap.put("duration", Long.toString(j5));
        a("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final G.v h() {
        return this.f12887q;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void h0(Context context) {
        C1206kf c1206kf = this.f12880k;
        c1206kf.setBaseContext(context);
        this.f12872c0.f4569e = c1206kf.f14252a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void i0(Lq lq, Nq nq) {
        this.f12890t = lq;
        this.f12891u = nq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1113ia
    public final void j(String str, String str2) {
        H(str + "(" + str2 + ");");
    }

    public final /* synthetic */ void j0(String str) {
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0889da
    public final void k(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        U2.j.d("Dispatching AFMA event: ".concat(sb.toString()));
        H(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized boolean k0() {
        return this.f12852D;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final C1390oj l() {
        return this.f12868V;
    }

    public final /* synthetic */ void l0() {
        super.loadUrl("about:blank");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void loadData(String str, String str2, String str3) {
        if (S()) {
            U2.j.i("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            try {
                if (S()) {
                    U2.j.i("#004 The webview is destroyed. Ignoring action.");
                } else {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void loadUrl(String str) {
        if (S()) {
            U2.j.i("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            T2.L.f5672l.post(new Kw(16, this, str));
        } catch (Throwable th) {
            P2.o.f4767B.f4774g.i("AdWebViewImpl.loadUrl", th);
            U2.j.j("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final U2.a m() {
        return this.f12885o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final WebView m0() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final C1071hd n() {
        return null;
    }

    public final synchronized void n0(String str) {
        if (S()) {
            U2.j.i("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1113ia
    public final void o(String str, JSONObject jSONObject) {
        j(str, jSONObject.toString());
    }

    public final void o0(Boolean bool) {
        synchronized (this) {
            this.f12856H = bool;
        }
        P2.o.f4767B.f4774g.k(bool);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            boolean z3 = true;
            if (!S()) {
                C0322v0 c0322v0 = this.f12872c0;
                c0322v0.f4566b = true;
                if (c0322v0.f4567c) {
                    c0322v0.b();
                }
            }
            if (this.f12881k0) {
                onResume();
                this.f12881k0 = false;
            }
            boolean z5 = this.f12858L;
            C1028gf c1028gf = this.f12894x;
            if (c1028gf == null || !c1028gf.q()) {
                z3 = z5;
            } else {
                if (!this.f12859M) {
                    this.f12894x.H();
                    this.f12894x.n0();
                    this.f12859M = true;
                }
                v0();
            }
            W0(z3);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x0013, B:10:0x0017, B:15:0x002c, B:16:0x0033, B:17:0x001e, B:19:0x0024, B:20:0x0038, B:22:0x003f, B:24:0x0043, B:26:0x0049, B:28:0x004f, B:30:0x0059, B:31:0x0065), top: B:2:0x0001 }] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDetachedFromWindow() {
        C1028gf c1028gf;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        synchronized (this) {
            try {
                if (!S()) {
                    C0322v0 c0322v0 = this.f12872c0;
                    c0322v0.f4566b = false;
                    Activity activity = (Activity) c0322v0.f4569e;
                    if (activity != null && c0322v0.f4565a) {
                        Window window = activity.getWindow();
                        if (window != null && (decorView = window.getDecorView()) != null) {
                            viewTreeObserver = decorView.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC0805bf) c0322v0.f);
                            }
                            c0322v0.f4565a = false;
                        }
                        viewTreeObserver = null;
                        if (viewTreeObserver != null) {
                        }
                        c0322v0.f4565a = false;
                    }
                }
                super.onDetachedFromWindow();
                if (this.f12859M && (c1028gf = this.f12894x) != null && c1028gf.q() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.f12894x.H();
                    this.f12894x.n0();
                    this.f12859M = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        W0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j5) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Fa)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            T2.L l5 = P2.o.f4767B.f4771c;
            T2.L.p(getContext(), intent);
        } catch (ActivityNotFoundException e3) {
            U2.j.d("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            P2.o.f4767B.f4774g.i("AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)), e3);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (S()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean v02 = v0();
        S2.d V4 = V();
        if (V4 != null && v02 && V4.f5309w) {
            V4.f5309w = false;
            V4.f5300n.X();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a8 A[Catch: all -> 0x000f, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:19:0x0027, B:24:0x002f, B:26:0x0041, B:29:0x0046, B:31:0x004d, B:34:0x0057, B:37:0x005c, B:40:0x006d, B:41:0x0085, B:45:0x0074, B:48:0x0079, B:54:0x0095, B:56:0x00a7, B:59:0x00ac, B:61:0x00c9, B:62:0x00d1, B:65:0x00cd, B:66:0x00d6, B:68:0x00dc, B:71:0x00e7, B:78:0x010b, B:80:0x0112, B:83:0x0119, B:85:0x012b, B:87:0x0139, B:90:0x0146, B:94:0x014b, B:96:0x0191, B:97:0x0194, B:99:0x019b, B:104:0x01a8, B:106:0x01ae, B:107:0x01b1, B:109:0x01b5, B:110:0x01be, B:116:0x01c9), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012b A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:19:0x0027, B:24:0x002f, B:26:0x0041, B:29:0x0046, B:31:0x004d, B:34:0x0057, B:37:0x005c, B:40:0x006d, B:41:0x0085, B:45:0x0074, B:48:0x0079, B:54:0x0095, B:56:0x00a7, B:59:0x00ac, B:61:0x00c9, B:62:0x00d1, B:65:0x00cd, B:66:0x00d6, B:68:0x00dc, B:71:0x00e7, B:78:0x010b, B:80:0x0112, B:83:0x0119, B:85:0x012b, B:87:0x0139, B:90:0x0146, B:94:0x014b, B:96:0x0191, B:97:0x0194, B:99:0x019b, B:104:0x01a8, B:106:0x01ae, B:107:0x01b1, B:109:0x01b5, B:110:0x01be, B:116:0x01c9), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x014b A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:19:0x0027, B:24:0x002f, B:26:0x0041, B:29:0x0046, B:31:0x004d, B:34:0x0057, B:37:0x005c, B:40:0x006d, B:41:0x0085, B:45:0x0074, B:48:0x0079, B:54:0x0095, B:56:0x00a7, B:59:0x00ac, B:61:0x00c9, B:62:0x00d1, B:65:0x00cd, B:66:0x00d6, B:68:0x00dc, B:71:0x00e7, B:78:0x010b, B:80:0x0112, B:83:0x0119, B:85:0x012b, B:87:0x0139, B:90:0x0146, B:94:0x014b, B:96:0x0191, B:97:0x0194, B:99:0x019b, B:104:0x01a8, B:106:0x01ae, B:107:0x01b1, B:109:0x01b5, B:110:0x01be, B:116:0x01c9), top: B:3:0x0003 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onMeasure(int i, int i5) {
        C1586t c1586t;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10 = 0;
        if (S()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.f12854F && (i6 = (c1586t = this.f12850B).f15621a) != 0) {
            if (i6 == 5) {
                super.onMeasure(i, i5);
                return;
            }
            if (i6 == 4) {
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8725M3)).booleanValue()) {
                    super.onMeasure(i, i5);
                    return;
                }
                BinderC0894df s2 = s();
                float b3 = s2 != null ? s2.b() : 0.0f;
                if (b3 == 0.0f) {
                    super.onMeasure(i, i5);
                    return;
                }
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i5);
                float f = size2 * b3;
                int i11 = (int) (size / b3);
                if (size2 == 0) {
                    if (i11 != 0) {
                        i9 = (int) (i11 * b3);
                        i10 = size;
                        i8 = i11;
                        setMeasuredDimension(Math.min(i9, i10), Math.min(i11, i8));
                        return;
                    }
                    size2 = 0;
                }
                int i12 = (int) f;
                if (size != 0) {
                    i10 = size;
                } else if (i12 != 0) {
                    i11 = (int) (i12 / b3);
                    i8 = size2;
                    i9 = i12;
                    i10 = i9;
                    setMeasuredDimension(Math.min(i9, i10), Math.min(i11, i8));
                    return;
                }
                i8 = size2;
                i9 = i12;
                setMeasuredDimension(Math.min(i9, i10), Math.min(i11, i8));
                return;
            }
            if (i6 == 2) {
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8755R3)).booleanValue()) {
                    super.onMeasure(i, i5);
                    return;
                }
                s0("/contentHeight", new C1417p9(7, this));
                H("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f5 = this.f12888r.density;
                int size3 = View.MeasureSpec.getSize(i);
                int i13 = this.f12864R;
                setMeasuredDimension(size3, i13 != -1 ? (int) (i13 * f5) : View.MeasureSpec.getSize(i5));
                return;
            }
            if (c1586t.b()) {
                DisplayMetrics displayMetrics = this.f12888r;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size4 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i5);
            int size5 = View.MeasureSpec.getSize(i5);
            if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                i7 = Integer.MAX_VALUE;
                int i14 = (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
                C1586t c1586t2 = this.f12850B;
                z3 = c1586t2.f15623c <= i7 || c1586t2.f15622b > i14;
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.g5)).booleanValue()) {
                    C1586t c1586t3 = this.f12850B;
                    float f6 = c1586t3.f15623c;
                    float f7 = this.f12889s;
                    z3 &= f6 / f7 <= ((float) i7) / f7 && ((float) c1586t3.f15622b) / f7 <= ((float) i14) / f7;
                }
                if (z3) {
                    if (getVisibility() != 8) {
                        setVisibility(0);
                    }
                    if (!this.f12893w) {
                        this.f12879j0.b(10002);
                        this.f12893w = true;
                    }
                    C1586t c1586t4 = this.f12850B;
                    setMeasuredDimension(c1586t4.f15623c, c1586t4.f15622b);
                    return;
                }
                C1586t c1586t5 = this.f12850B;
                float f8 = c1586t5.f15623c;
                float f9 = this.f12889s;
                U2.j.i("Not enough space to show ad. Needs " + ((int) (f8 / f9)) + "x" + ((int) (c1586t5.f15622b / f9)) + " dp, but only has " + ((int) (size4 / f9)) + "x" + ((int) (size5 / f9)) + " dp.");
                if (getVisibility() != 8) {
                    setVisibility(4);
                }
                setMeasuredDimension(0, 0);
                if (this.f12892v) {
                    return;
                }
                this.f12879j0.b(10001);
                this.f12892v = true;
                return;
            }
            i7 = size4;
            if (mode2 != Integer.MIN_VALUE) {
            }
            C1586t c1586t22 = this.f12850B;
            if (c1586t22.f15623c <= i7) {
            }
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.g5)).booleanValue()) {
            }
            if (z3) {
            }
        }
        super.onMeasure(i, i5);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void onPause() {
        if (S()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.fc)).booleanValue() && AbstractC2346c.x("MUTE_AUDIO")) {
                U2.j.d("Muting webview");
                int i = AbstractC1914b.f16884a;
                if (!AbstractC1933n.f16916e.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                ((WebViewProviderBoundaryInterface) AbstractC1914b.b(this).f16910l).setAudioMuted(true);
            }
        } catch (Exception e3) {
            U2.j.g("Could not pause webview.", e3);
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.ic)).booleanValue()) {
                P2.o.f4767B.f4774g.i("AdWebViewImpl.onPause", e3);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void onResume() {
        if (S()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.fc)).booleanValue() && AbstractC2346c.x("MUTE_AUDIO")) {
                U2.j.d("Unmuting webview");
                int i = AbstractC1914b.f16884a;
                if (!AbstractC1933n.f16916e.b()) {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
                ((WebViewProviderBoundaryInterface) AbstractC1914b.b(this).f16910l).setAudioMuted(false);
            }
        } catch (Exception e3) {
            U2.j.g("Could not resume webview.", e3);
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.ic)).booleanValue()) {
                P2.o.f4767B.f4774g.i("AdWebViewImpl.onResume", e3);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3 = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8909u3)).booleanValue() && this.f12894x.k();
        if ((!this.f12894x.q() || this.f12894x.o()) && !z3) {
            Q4 q42 = this.f12882l;
            if (q42 != null) {
                q42.f11167b.a(motionEvent);
            }
            T7 t7 = this.f12884n;
            if (t7 != null) {
                if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > t7.f11628a.getEventTime()) {
                    t7.f11628a = MotionEvent.obtain(motionEvent);
                } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > t7.f11629b.getEventTime()) {
                    t7.f11629b = MotionEvent.obtain(motionEvent);
                }
            }
        } else {
            synchronized (this) {
                try {
                    A8 a8 = this.f12860N;
                    if (a8 != null) {
                        a8.f(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (S()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final synchronized void p() {
        T2.G.m("Destroying WebView!");
        L0();
        T2.L.f5672l.post(new RunnableC0726Ye(this, 2));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void p0(boolean z3) {
        try {
            boolean z5 = this.f12854F;
            this.f12854F = z3;
            B0();
            if (z3 != z5) {
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8761T)).booleanValue()) {
                    if (!this.f12850B.b()) {
                    }
                }
                try {
                    k("onStateChanged", new JSONObject().put("state", true != z3 ? "default" : "expanded"));
                } catch (JSONException e3) {
                    U2.j.g("Error occurred while dispatching state change.", e3);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // P2.i
    public final synchronized void q() {
        Mt mt = this.f12886p;
        if (mt != null) {
            mt.q();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void q0(S2.d dVar) {
        this.f12895y = dVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void r(String str, InterfaceC1821y9 interfaceC1821y9) {
        C1028gf c1028gf = this.f12894x;
        if (c1028gf != null) {
            synchronized (c1028gf.f13616n) {
                try {
                    List list = (List) c1028gf.f13615m.get(str);
                    if (list == null) {
                        return;
                    }
                    list.remove(interfaceC1821y9);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized boolean r0() {
        return this.f12854F;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized BinderC0894df s() {
        return this.K;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void s0(String str, InterfaceC1821y9 interfaceC1821y9) {
        C1028gf c1028gf = this.f12894x;
        if (c1028gf != null) {
            c1028gf.a(str, interfaceC1821y9);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C1028gf) {
            this.f12894x = (C1028gf) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (S()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e3) {
            U2.j.g("Could not stop loading webview.", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized String t() {
        Nq nq = this.f12891u;
        if (nq == null) {
            return null;
        }
        return nq.f10823b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void t0() {
        T2.G.m("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.Vi
    public final void u() {
        C1028gf c1028gf = this.f12894x;
        if (c1028gf != null) {
            c1028gf.u();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized void u0(String str, AbstractC1744we abstractC1744we) {
        try {
            if (this.f12877h0 == null) {
                this.f12877h0 = new HashMap();
            }
            this.f12877h0.put(str, abstractC1744we);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final Lq v() {
        return this.f12890t;
    }

    public final boolean v0() {
        int i;
        int i5;
        if (this.f12894x.p() || this.f12894x.q()) {
            U2.e eVar = C0379q.f.f5048a;
            DisplayMetrics displayMetrics = this.f12888r;
            int round = Math.round(displayMetrics.widthPixels / displayMetrics.density);
            int round2 = Math.round(displayMetrics.heightPixels / displayMetrics.density);
            Activity activity = this.f12880k.f14252a;
            if (activity == null || activity.getWindow() == null) {
                i = round;
                i5 = round2;
            } else {
                T2.L l5 = P2.o.f4767B.f4771c;
                int[] m5 = T2.L.m(activity);
                i = Math.round(m5[0] / displayMetrics.density);
                i5 = Math.round(m5[1] / displayMetrics.density);
            }
            int i6 = this.f12874e0;
            if (i6 != round || this.f12873d0 != round2 || this.f12875f0 != i || this.f12876g0 != i5) {
                boolean z3 = (i6 == round && this.f12873d0 == round2) ? false : true;
                this.f12874e0 = round;
                this.f12873d0 = round2;
                this.f12875f0 = i;
                this.f12876g0 = i5;
                new C0709Wb(9, this, "").v(round, round2, i, i5, displayMetrics.density, this.f12878i0.getDefaultDisplay().getRotation());
                return z3;
            }
        }
        return false;
    }

    public final synchronized Boolean w() {
        return this.f12856H;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void w0(boolean z3, int i, String str, String str2, boolean z5) {
        C1028gf c1028gf = this.f12894x;
        C0733Ze c0733Ze = c1028gf.f13613k;
        boolean r02 = c0733Ze.f12501k.r0();
        boolean l02 = C1028gf.l0(r02, c0733Ze);
        boolean z6 = true;
        if (!l02 && z5) {
            z6 = false;
        }
        InterfaceC0347a interfaceC0347a = l02 ? null : c1028gf.f13617o;
        C0698Ue c0698Ue = r02 ? null : new C0698Ue(c0733Ze, c1028gf.f13618p);
        InterfaceC1462q9 interfaceC1462q9 = c1028gf.f13621s;
        BinderC0857cn binderC0857cn = null;
        InterfaceC1506r9 interfaceC1506r9 = c1028gf.f13622t;
        boolean z7 = z6;
        C0698Ue c0698Ue2 = c0698Ue;
        S2.c cVar = c1028gf.f13602E;
        U2.a aVar = c0733Ze.f12501k.f12885o;
        Vi vi = z7 ? null : c1028gf.f13623u;
        if (C1028gf.j0(c0733Ze)) {
            binderC0857cn = c1028gf.f13611P;
        }
        c1028gf.X0(new AdOverlayInfoParcel(interfaceC0347a, c0698Ue2, interfaceC1462q9, interfaceC1506r9, cVar, c0733Ze, z3, i, str, str2, aVar, vi, binderC0857cn));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void x(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final void x0(int i) {
        I7 i7 = this.f12866T;
        C1390oj c1390oj = this.f12868V;
        if (i == 0) {
            AbstractC1803xs.m((L7) c1390oj.f14828m, i7, "aebb2");
        }
        AbstractC1803xs.m((L7) c1390oj.f14828m, i7, "aeh2");
        c1390oj.getClass();
        ((L7) c1390oj.f14828m).b("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.f12885o.f5852k);
        a("onhide", hashMap);
    }

    @Override // P2.i
    public final synchronized void y() {
        Mt mt = this.f12886p;
        if (mt != null) {
            mt.y();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0677Re
    public final synchronized boolean y0() {
        return this.f12863Q > 0;
    }

    @Override // Q2.InterfaceC0347a
    public final void z() {
        C1028gf c1028gf = this.f12894x;
        if (c1028gf != null) {
            c1028gf.z();
        }
    }

    @Override // com.google.android.gms.internal.ads.L5
    public final void z0(K5 k5) {
        boolean z3;
        synchronized (this) {
            z3 = k5.f10128j;
            this.f12858L = z3;
        }
        W0(z3);
    }
}
