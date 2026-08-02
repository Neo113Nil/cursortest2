package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.webkit.WebView;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.mj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1300mj implements Mh, Ki {

    /* renamed from: k, reason: collision with root package name */
    public final C1116id f14521k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f14522l;

    /* renamed from: m, reason: collision with root package name */
    public final C1204kd f14523m;

    /* renamed from: n, reason: collision with root package name */
    public final WebView f14524n;

    /* renamed from: o, reason: collision with root package name */
    public String f14525o;

    /* renamed from: p, reason: collision with root package name */
    public final EnumC1818y6 f14526p;

    public C1300mj(C1116id c1116id, Context context, C1204kd c1204kd, WebView webView, EnumC1818y6 enumC1818y6) {
        this.f14521k = c1116id;
        this.f14522l = context;
        this.f14523m = c1204kd;
        this.f14524n = webView;
        this.f14526p = enumC1818y6;
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void C(BinderC1652uc binderC1652uc, String str, String str2) {
        Context context = this.f14522l;
        C1204kd c1204kd = this.f14523m;
        if (c1204kd.e(context)) {
            try {
                c1204kd.d(context, c1204kd.a(context), this.f14521k.f13939m, binderC1652uc.f15866k, binderC1652uc.f15867l);
            } catch (RemoteException e3) {
                U2.j.j("Remote Exception to get reward item.", e3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void i() {
        this.f14521k.a(false);
    }

    @Override // com.google.android.gms.internal.ads.Ki
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.Ki
    public final void o() {
        EnumC1818y6 enumC1818y6 = EnumC1818y6.f16407v;
        EnumC1818y6 enumC1818y62 = this.f14526p;
        if (enumC1818y62 == enumC1818y6) {
            return;
        }
        C1204kd c1204kd = this.f14523m;
        Context context = this.f14522l;
        String str = "";
        if (c1204kd.e(context)) {
            AtomicReference atomicReference = c1204kd.f;
            if (c1204kd.m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                try {
                    String str2 = (String) c1204kd.i(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                    if (str2 == null) {
                        str2 = (String) c1204kd.i(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                    }
                    if (str2 != null) {
                        str = str2;
                    }
                } catch (Exception unused) {
                    c1204kd.l("getCurrentScreenName", false);
                }
            }
        }
        this.f14525o = str;
        this.f14525o = String.valueOf(str).concat(enumC1818y62 == EnumC1818y6.f16404s ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void p() {
        WebView webView = this.f14524n;
        if (webView != null && this.f14525o != null) {
            Context context = webView.getContext();
            String str = this.f14525o;
            C1204kd c1204kd = this.f14523m;
            if (c1204kd.e(context) && (context instanceof Activity)) {
                AtomicReference atomicReference = c1204kd.f14249g;
                if (c1204kd.m(context, "com.google.firebase.analytics.FirebaseAnalytics", atomicReference, false)) {
                    ConcurrentHashMap concurrentHashMap = c1204kd.f14250h;
                    Method method = (Method) concurrentHashMap.get("setCurrentScreen");
                    if (method == null) {
                        try {
                            method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                            concurrentHashMap.put("setCurrentScreen", method);
                        } catch (Exception unused) {
                            c1204kd.l("setCurrentScreen", false);
                            method = null;
                        }
                    }
                    try {
                        method.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                    } catch (Exception unused2) {
                        c1204kd.l("setCurrentScreen", false);
                    }
                }
            }
        }
        this.f14521k.a(true);
    }

    @Override // com.google.android.gms.internal.ads.Mh
    public final void a() {
    }
}
