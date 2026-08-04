package L5;

import D6.y0;
import F2.InterfaceC0238k0;
import F2.R0;
import F2.T0;
import R5.C0407c;
import R5.f0;
import W5.AbstractC0486a1;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzfs;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbxy;
import io.sentry.SentryBaseEvent;
import io.sentry.protocol.Device;
import io.sentry.rrweb.RRWebVideoEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p155w1.C1010l1;
import p155w1.C1013m0;
import p155w1.C1050x1;
import p155w1.C1052y0;
import p155w1.F0;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public class V implements p159w5.c, p164x5.a, A5.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p159w5.b f4442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1050x1 f4443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0322a f4444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0323b f4445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public F0 f4446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f4447f = new HashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1013m0 f4448x = new C1013m0(6);

    public static void a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
    }

    @Override // p164x5.a
    public final void onAttachedToActivity(p164x5.b bVar) {
        C1050x1 c1050x1 = this.f4443b;
        if (c1050x1 != null) {
            c1050x1.f17931b = (p121q5.c) ((Q3.o) bVar).f5822a;
        }
        C0322a c0322a = this.f4444c;
        if (c0322a != null) {
            c0322a.f4452d = (p121q5.c) ((Q3.o) bVar).f5822a;
        }
        F0 f7 = this.f4446e;
        if (f7 != null) {
            f7.f17382e = (p121q5.c) ((Q3.o) bVar).f5822a;
        }
    }

    @Override // p159w5.c
    public final void onAttachedToEngine(p159w5.b bVar) {
        this.f4442a = bVar;
        Context context = bVar.f18081a;
        L l7 = new L();
        try {
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                l7.f4418b = bundle.getString("io.flutter.plugins.googlemobileads.FLUTTER_GAME_TEMPLATE_VERSION");
                l7.f4417a = applicationInfo.metaData.getString("io.flutter.plugins.googlemobileads.FLUTTER_NEWS_TEMPLATE_VERSION");
            }
        } catch (PackageManager.NameNotFoundException | ClassCastException unused) {
        }
        this.f4444c = new C0322a(context, l7);
        A5.y yVar = new A5.y(this.f4444c);
        A5.f fVar = bVar.f18083c;
        A5.s sVar = new A5.s(fVar, "plugins.flutter.io/google_mobile_ads", yVar, null);
        sVar.b(this);
        C1050x1 c1050x1 = new C1050x1(sVar);
        this.f4443b = c1050x1;
        ((io.flutter.plugin.platform.p) bVar.f18084d).k("plugins.flutter.io/google_mobile_ads/ad_widget", new W(c1050x1));
        C0323b c0323b = new C0323b();
        new A5.s(fVar, "plugins.flutter.io/google_mobile_ads/app_state_method").b(c0323b);
        new A5.j(fVar, "plugins.flutter.io/google_mobile_ads/app_state_event").a(c0323b);
        this.f4445d = c0323b;
        this.f4446e = new F0(fVar, bVar.f18081a);
    }

    @Override // p164x5.a
    public final void onDetachedFromActivity() {
        p159w5.b bVar;
        C0322a c0322a = this.f4444c;
        if (c0322a != null && (bVar = this.f4442a) != null) {
            c0322a.f4452d = bVar.f18081a;
        }
        C1050x1 c1050x1 = this.f4443b;
        if (c1050x1 != null) {
            c1050x1.f17931b = null;
        }
        F0 f7 = this.f4446e;
        if (f7 != null) {
            f7.f17382e = null;
        }
    }

    @Override // p164x5.a
    public final void onDetachedFromActivityForConfigChanges() {
        p159w5.b bVar;
        C0322a c0322a = this.f4444c;
        if (c0322a != null && (bVar = this.f4442a) != null) {
            c0322a.f4452d = bVar.f18081a;
        }
        C1050x1 c1050x1 = this.f4443b;
        if (c1050x1 != null) {
            c1050x1.f17931b = null;
        }
        F0 f7 = this.f4446e;
        if (f7 != null) {
            f7.f17382e = null;
        }
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(p159w5.b bVar) {
        C0323b c0323b = this.f4445d;
        if (c0323b != null) {
            ProcessLifecycleOwner.f9594z.f9600f.b(c0323b);
            this.f4445d = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:385:0x0aac  */
    @Override // A5.q
    public final void onMethodCall(A5.o oVar, A5.r rVar) {
        p159w5.b bVar;
        WebView webView;
        C0407c c0407c;
        O o7;
        O2.f fVar;
        p167y2.j jVarH;
        p167y2.w wVar;
        Q q7;
        boolean z4 = true;
        C1050x1 c1050x1 = this.f4443b;
        if (c1050x1 == null || (bVar = this.f4442a) == null) {
            p155w1.L.m(new StringBuilder("method call received before instanceManager initialized: "), oVar.f676a, "GoogleMobileAdsPlugin");
            return;
        }
        Context context = (p121q5.c) c1050x1.f17931b;
        if (context == null) {
            context = bVar.f18081a;
        }
        Context context2 = context;
        String str = oVar.f676a;
        str.getClass();
        C0343w c0343w = null;
        switch (str) {
            case "MobileAds#openDebugMenu":
                String str2 = (String) oVar.a("adUnitId");
                this.f4448x.getClass();
                C1013m0.j(context2, str2);
                ((A5.p) rVar).success(null);
                return;
            case "loadInterstitialAd":
                int iIntValue = ((Integer) oVar.a("adId")).intValue();
                C1050x1 c1050x2 = this.f4443b;
                String str3 = (String) oVar.a("adUnitId");
                r rVar2 = (r) oVar.a(SentryBaseEvent.JsonKeys.REQUEST);
                G g3 = new G(iIntValue, c1050x2, str3, rVar2, new C1052y0(context2, 6));
                this.f4443b.h0(g3, ((Integer) oVar.a("adId")).intValue());
                if (c1050x2 != null && str3 != null && rVar2 != null) {
                    K2.a.load(context2, str3, rVar2.a(), new F(g3));
                }
                ((A5.p) rVar).success(null);
                return;
            case "MobileAds#setAppMuted":
                C1013m0 c1013m0 = this.f4448x;
                boolean zBooleanValue = ((Boolean) oVar.a("muted")).booleanValue();
                c1013m0.getClass();
                C1013m0.m(zBooleanValue);
                ((A5.p) rVar).success(null);
                return;
            case "loadAppOpenAd":
                int iIntValue2 = ((Integer) oVar.a("adId")).intValue();
                C1050x1 c1050x3 = this.f4443b;
                a(c1050x3);
                String str4 = (String) oVar.a("adUnitId");
                a(str4);
                r rVar3 = (r) oVar.a(SentryBaseEvent.JsonKeys.REQUEST);
                C0334m c0334m = (C0334m) oVar.a("adManagerRequest");
                A a2 = new A(iIntValue2, c1050x3, str4, rVar3, c0334m, new C1052y0(context2, 6));
                this.f4443b.h0(a2, ((Integer) oVar.a("adId")).intValue());
                if (rVar3 != null) {
                    A2.b.load(context2, str4, rVar3.a(), new z(a2));
                } else if (c0334m != null) {
                    A2.b.load(context2, str4, c0334m.c(), new z(a2));
                }
                ((A5.p) rVar).success(null);
                return;
            case "MobileAds#registerWebView":
                Integer num = (Integer) oVar.a("webViewId");
                C1013m0 c1013m1 = this.f4448x;
                int iIntValue3 = num.intValue();
                p128r5.b bVar2 = this.f4442a.f18082b;
                c1013m1.getClass();
                long j = iIntValue3;
                f0 f0Var = (f0) ((p159w5.c) ((HashMap) bVar2.f16040d.f16059b).get(f0.class));
                if (f0Var == null || (c0407c = (C0407c) f0Var.f6163b.f3679c) == null) {
                    webView = null;
                } else {
                    Object objE = c0407c.e(j);
                    if (objE instanceof WebView) {
                        webView = (WebView) objE;
                    } else {
                        webView = null;
                    }
                }
                if (webView != null) {
                    T0.e();
                    com.google.android.gms.common.internal.D.d("#008 Must be called on the main UI thread.");
                    zzbxy zzbxyVarZza = zzbtf.zza(webView.getContext());
                    if (zzbxyVarZza == null) {
                        J2.j.d("Internal error, query info generator is null.");
                    } else {
                        try {
                            zzbxyVarZza.zzj(new p105o3.b(webView));
                        } catch (RemoteException e7) {
                            J2.j.e("", e7);
                        }
                    }
                    break;
                } else {
                    p150v0.a.j(iIntValue3, "MobileAds.registerWebView unable to find webView with id: ", "FlutterMobileAdsWrapper");
                }
                ((A5.p) rVar).success(null);
                return;
            case "loadRewardedAd":
                String str5 = (String) oVar.a("adUnitId");
                a(str5);
                r rVar4 = (r) oVar.a(SentryBaseEvent.JsonKeys.REQUEST);
                C0334m c0334m2 = (C0334m) oVar.a("adManagerRequest");
                if (rVar4 != null) {
                    int iIntValue4 = ((Integer) oVar.a("adId")).intValue();
                    C1050x1 c1050x4 = this.f4443b;
                    a(c1050x4);
                    o7 = new O(iIntValue4, c1050x4, str5, rVar4, new C1052y0(context2, 6));
                } else {
                    if (c0334m2 == null) {
                        ((A5.p) rVar).error("InvalidRequest", "A null or invalid ad request was provided.", null);
                        return;
                    }
                    int iIntValue5 = ((Integer) oVar.a("adId")).intValue();
                    C1050x1 c1050x5 = this.f4443b;
                    a(c1050x5);
                    o7 = new O(iIntValue5, c1050x5, str5, c0334m2, new C1052y0(context2, 6));
                }
                C1050x1 c1050x6 = this.f4443b;
                Integer num2 = (Integer) oVar.a("adId");
                a(num2);
                c1050x6.h0(o7, num2.intValue());
                M m7 = new M(o7);
                String str6 = o7.f4423c;
                C1052y0 c1052y0 = o7.f4424d;
                r rVar5 = o7.f4425e;
                if (rVar5 != null) {
                    S2.c.load((Context) c1052y0.f17938b, str6, rVar5.a(), m7);
                } else {
                    C0334m c0334m3 = o7.f4426f;
                    if (c0334m3 != null) {
                        S2.c.load((Context) c1052y0.f17938b, str6, c0334m3.c(), (S2.d) m7);
                    } else {
                        Log.e("FlutterRewardedAd", "A null or invalid ad request was provided.");
                    }
                }
                ((A5.p) rVar).success(null);
                return;
            case "MobileAds#getRequestConfiguration":
                this.f4448x.getClass();
                ((A5.p) rVar).success(T0.e().f2641h);
                return;
            case "loadFluidAd":
                C0325d c0325d = new C0325d(((Integer) oVar.a("adId")).intValue(), this.f4443b, (String) oVar.a("adUnitId"), Collections.singletonList(new C0343w(p167y2.j.f18167p)), (C0334m) oVar.a(SentryBaseEvent.JsonKeys.REQUEST), new p145u1.c(context2, 7));
                c0325d.f4459i = -1;
                this.f4443b.h0(c0325d, ((Integer) oVar.a("adId")).intValue());
                c0325d.d();
                ((A5.p) rVar).success(null);
                return;
            case "loadNativeAd":
                String str7 = (String) oVar.a("factoryId");
                if (this.f4447f.get(str7) != null) {
                    throw new ClassCastException();
                }
                if (((M5.b) oVar.a("nativeTemplateStyle")) == null) {
                    ((A5.p) rVar).error("NativeAdError", AbstractC0486a1.h("No NativeAdFactory with id: ", str7, " or nativeTemplateStyle"), null);
                    return;
                }
                C1050x1 c1050x7 = this.f4443b;
                String str8 = (String) oVar.a("adUnitId");
                r rVar6 = (r) oVar.a(SentryBaseEvent.JsonKeys.REQUEST);
                C0334m c0334m4 = (C0334m) oVar.a("adManagerRequest");
                Map map = (Map) oVar.a("customOptions");
                Integer num3 = (Integer) oVar.a("adId");
                num3.getClass();
                J j3 = (J) oVar.a("nativeAdOptions");
                C1052y0 c1052y1 = new C1052y0(context2, 6);
                M5.b bVar3 = (M5.b) oVar.a("nativeTemplateStyle");
                if (c1050x7 == null) {
                    throw new IllegalStateException("AdInstanceManager cannot be null.");
                }
                if (str8 == null) {
                    throw new IllegalStateException("AdUnitId cannot be null.");
                }
                if (bVar3 == null) {
                    throw new IllegalStateException("NativeAdFactory and nativeTemplateStyle cannot be null.");
                }
                if (rVar6 == null && c0334m4 == null) {
                    throw new IllegalStateException("adRequest or addManagerRequest must be non-null.");
                }
                H h6 = rVar6 == null ? new H(context2, num3.intValue(), c1050x7, str8, c0334m4, c1052y1, map, j3, bVar3) : new H(context2, num3.intValue(), c1050x7, str8, rVar6, c1052y1, map, j3, bVar3);
                this.f4443b.h0(h6, ((Integer) oVar.a("adId")).intValue());
                C1010l1 c1010l1 = new C1010l1();
                c1010l1.f17777a = new WeakReference(h6);
                I i7 = new I(h6.f4481a, h6.f4401b);
                J j7 = h6.f4406g;
                if (j7 == null) {
                    fVar = new O2.f(new O2.e());
                } else {
                    O2.e eVar = new O2.e();
                    Integer num4 = j7.f4409a;
                    if (num4 != null) {
                        eVar.f4984e = num4.intValue();
                    }
                    Integer num5 = j7.f4410b;
                    if (num5 != null) {
                        eVar.f4981b = num5.intValue();
                    }
                    T t7 = j7.f4411c;
                    if (t7 != null) {
                        p167y2.z zVar = new p167y2.z();
                        zVar.f18197a = true;
                        zVar.f18198b = false;
                        zVar.f18199c = false;
                        Boolean bool = t7.f4437a;
                        if (bool != null) {
                            zVar.f18199c = bool.booleanValue();
                        }
                        Boolean bool2 = t7.f4438b;
                        if (bool2 != null) {
                            zVar.f18198b = bool2.booleanValue();
                        }
                        Boolean bool3 = t7.f4439c;
                        if (bool3 != null) {
                            zVar.f18197a = bool3.booleanValue();
                        }
                        eVar.f4983d = new p167y2.A(zVar);
                    }
                    Boolean bool4 = j7.f4412d;
                    if (bool4 != null) {
                        eVar.f4985f = bool4.booleanValue();
                    }
                    Boolean bool5 = j7.f4413e;
                    if (bool5 != null) {
                        eVar.f4982c = bool5.booleanValue();
                    }
                    Boolean bool6 = j7.f4414f;
                    if (bool6 != null) {
                        eVar.f4980a = bool6.booleanValue();
                    }
                    fVar = new O2.f(eVar);
                }
                C1052y0 c1052y2 = h6.f4403d;
                String str9 = h6.f4402c;
                r rVar7 = h6.f4404e;
                if (rVar7 != null) {
                    p167y2.i iVarA = rVar7.a();
                    p167y2.f fVar2 = new p167y2.f((Context) c1052y2.f17938b, str9);
                    fVar2.b(c1010l1);
                    fVar2.d(fVar);
                    fVar2.c(i7);
                    fVar2.a().a(iVarA.f18160a);
                } else {
                    C0334m c0334m5 = h6.f4405f;
                    if (c0334m5 != null) {
                        p172z2.b bVarC = c0334m5.c();
                        p167y2.f fVar3 = new p167y2.f((Context) c1052y2.f17938b, str9);
                        fVar3.b(c1010l1);
                        fVar3.d(fVar);
                        fVar3.c(i7);
                        fVar3.a().a(bVarC.f18160a);
                    } else {
                        Log.e("FlutterNativeAd", "A null or invalid ad request was provided.");
                    }
                }
                ((A5.p) rVar).success(null);
                return;
            case "setServerSideVerificationOptions":
                C1050x1 c1050x8 = this.f4443b;
                Integer num6 = (Integer) oVar.a("adId");
                num6.getClass();
                AbstractC0331j abstractC0331j = (AbstractC0331j) ((HashMap) c1050x8.f17932c).get(num6);
                S s7 = (S) oVar.a("serverSideVerificationOptions");
                if (abstractC0331j == null) {
                    Log.w("GoogleMobileAdsPlugin", "Error - null ad in setServerSideVerificationOptions");
                } else if (abstractC0331j instanceof O) {
                    S2.c cVar = ((O) abstractC0331j).f4427g;
                    if (cVar != null) {
                        cVar.setServerSideVerificationOptions(s7.a());
                    } else {
                        Log.e("FlutterRewardedAd", "RewardedAd is null in setServerSideVerificationOptions");
                    }
                } else if (abstractC0331j instanceof Q) {
                    T2.a aVar = ((Q) abstractC0331j).f4434g;
                    if (aVar != null) {
                        aVar.setServerSideVerificationOptions(s7.a());
                    } else {
                        Log.e("FlutterRIAd", "RewardedInterstitialAd is null in setServerSideVerificationOptions");
                    }
                } else {
                    Log.w("GoogleMobileAdsPlugin", "Error - setServerSideVerificationOptions called on non-rewarded ad");
                }
                ((A5.p) rVar).success(null);
                return;
            case "AdSize#getAnchoredAdaptiveBannerAdSize":
                String str10 = (String) oVar.a(Device.JsonKeys.ORIENTATION);
                int iIntValue6 = ((Integer) oVar.a("width")).intValue();
                if (str10 == null) {
                    p167y2.j jVar = p167y2.j.f18161i;
                    jVarH = J2.d.h(iIntValue6, context2, 0);
                    jVarH.f18173d = true;
                } else if (str10.equals("portrait")) {
                    p167y2.j jVar2 = p167y2.j.f18161i;
                    jVarH = J2.d.h(iIntValue6, context2, 1);
                    jVarH.f18173d = true;
                } else {
                    if (!str10.equals("landscape")) {
                        throw new IllegalArgumentException("Unexpected value for orientation: ".concat(str10));
                    }
                    p167y2.j jVar3 = p167y2.j.f18161i;
                    jVarH = J2.d.h(iIntValue6, context2, 2);
                    jVarH.f18173d = true;
                }
                int i8 = jVarH.f18171b;
                if (p167y2.j.f18168q.equals(jVarH)) {
                    ((A5.p) rVar).success(null);
                    return;
                } else {
                    ((A5.p) rVar).success(Integer.valueOf(i8));
                    return;
                }
            case "loadAdManagerInterstitialAd":
                int iIntValue7 = ((Integer) oVar.a("adId")).intValue();
                C1050x1 c1050x9 = this.f4443b;
                a(c1050x9);
                String str11 = (String) oVar.a("adUnitId");
                a(str11);
                C0334m c0334m6 = (C0334m) oVar.a(SentryBaseEvent.JsonKeys.REQUEST);
                C0338q c0338q = new C0338q(iIntValue7, c1050x9, str11, c0334m6, new C1052y0(context2, 6));
                C1050x1 c1050x10 = this.f4443b;
                Integer num7 = (Integer) oVar.a("adId");
                a(num7);
                c1050x10.h0(c0338q, num7.intValue());
                p172z2.c.load(context2, str11, c0334m6.c(), new C0337p(c0338q));
                ((A5.p) rVar).success(null);
                return;
            case "loadBannerAd":
                int iIntValue8 = ((Integer) oVar.a("adId")).intValue();
                C1050x1 c1050x11 = this.f4443b;
                String str12 = (String) oVar.a("adUnitId");
                r rVar8 = (r) oVar.a(SentryBaseEvent.JsonKeys.REQUEST);
                C0343w c0343w2 = (C0343w) oVar.a(RRWebVideoEvent.JsonKeys.SIZE);
                B b7 = new B(iIntValue8, c1050x11, str12, rVar8, c0343w2, new p145u1.c(context2, 7));
                this.f4443b.h0(b7, ((Integer) oVar.a("adId")).intValue());
                AdView adView = new AdView(context2);
                b7.f4393c = adView;
                adView.setAdUnitId(str12);
                b7.f4393c.setAdSize(c0343w2.f4508a);
                b7.f4393c.setOnPaidEventListener(new P2(16, c1050x11, b7, false));
                b7.f4393c.setAdListener(new C(iIntValue8, c1050x11, b7));
                b7.f4393c.b(rVar8.a());
                ((A5.p) rVar).success(null);
                return;
            case "MobileAds#setAppVolume":
                C1013m0 c1013m2 = this.f4448x;
                double dDoubleValue = ((Double) oVar.a("volume")).doubleValue();
                c1013m2.getClass();
                float f7 = (float) dDoubleValue;
                T0 t0E = T0.e();
                t0E.getClass();
                com.google.android.gms.common.internal.D.a("The app volume must be a value between 0 and 1 inclusive.", f7 >= 0.0f && f7 <= 1.0f);
                synchronized (t0E.f2638e) {
                    if (t0E.f2639f == null) {
                        z4 = false;
                    }
                    com.google.android.gms.common.internal.D.k("MobileAds.initialize() must be called prior to setting the app volume.", z4);
                    try {
                        t0E.f2639f.zzq(f7);
                        break;
                    } catch (RemoteException e8) {
                        J2.j.e("Unable to set app volume.", e8);
                    }
                    break;
                }
                ((A5.p) rVar).success(null);
                return;
            case "MobileAds#getVersionString":
                this.f4448x.getClass();
                T0.e();
                String[] strArrSplit = TextUtils.split("24.1.0", "\\.");
                if (strArrSplit.length != 3) {
                    wVar = new p167y2.w(0, 0, 0);
                } else {
                    try {
                        wVar = new p167y2.w(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
                    } catch (NumberFormatException unused) {
                        wVar = new p167y2.w(0, 0, 0);
                    }
                }
                ((A5.p) rVar).success(wVar.toString());
                return;
            case "loadAdManagerBannerAd":
                C0336o c0336o = new C0336o(((Integer) oVar.a("adId")).intValue(), this.f4443b, (String) oVar.a("adUnitId"), (List) oVar.a("sizes"), (C0334m) oVar.a(SentryBaseEvent.JsonKeys.REQUEST), new p145u1.c(context2, 7));
                this.f4443b.h0(c0336o, ((Integer) oVar.a("adId")).intValue());
                c0336o.d();
                ((A5.p) rVar).success(null);
                return;
            case "_init":
                HashMap map2 = (HashMap) this.f4443b.f17932c;
                for (Map.Entry entry : map2.entrySet()) {
                    if (entry.getValue() != null) {
                        ((AbstractC0331j) entry.getValue()).b();
                    }
                }
                map2.clear();
                ((A5.p) rVar).success(null);
                return;
            case "disposeAd":
                C1050x1 c1050x12 = this.f4443b;
                Integer num8 = (Integer) oVar.a("adId");
                num8.getClass();
                HashMap map3 = (HashMap) c1050x12.f17932c;
                if (map3.containsKey(num8)) {
                    AbstractC0331j abstractC0331j2 = (AbstractC0331j) map3.get(num8);
                    if (abstractC0331j2 != null) {
                        abstractC0331j2.b();
                    }
                    map3.remove(num8);
                }
                ((A5.p) rVar).success(null);
                return;
            case "getAdSize":
                C1050x1 c1050x13 = this.f4443b;
                Integer num9 = (Integer) oVar.a("adId");
                num9.getClass();
                AbstractC0331j abstractC0331j3 = (AbstractC0331j) ((HashMap) c1050x13.f17932c).get(num9);
                if (abstractC0331j3 == null) {
                    ((A5.p) rVar).success(null);
                    return;
                }
                if (abstractC0331j3 instanceof B) {
                    B b8 = (B) abstractC0331j3;
                    AdView adView2 = b8.f4393c;
                    if (adView2 != null && adView2.getAdSize() != null) {
                        c0343w = new C0343w(b8.f4393c.getAdSize());
                    }
                    ((A5.p) rVar).success(c0343w);
                    return;
                }
                if (!(abstractC0331j3 instanceof C0336o)) {
                    ((A5.p) rVar).error("unexpected_ad_type", "Unexpected ad type for getAdSize: " + abstractC0331j3, null);
                    return;
                }
                C0336o c0336o2 = (C0336o) abstractC0331j3;
                AdManagerAdView adManagerAdView = c0336o2.f4492g;
                if (adManagerAdView != null && adManagerAdView.getAdSize() != null) {
                    c0343w = new C0343w(c0336o2.f4492g.getAdSize());
                }
                ((A5.p) rVar).success(c0343w);
                return;
            case "MobileAds#updateRequestConfiguration":
                p167y2.u uVar = T0.e().f2641h;
                uVar.getClass();
                C0.J j8 = new C0.J();
                j8.f(uVar.f18184a);
                j8.g(uVar.f18185b);
                j8.e(uVar.f18186c);
                ArrayList arrayList = uVar.f18187d;
                ArrayList arrayList2 = (ArrayList) j8.f1237d;
                arrayList2.clear();
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                }
                String str13 = (String) oVar.a("maxAdContentRating");
                Integer num10 = (Integer) oVar.a("tagForChildDirectedTreatment");
                Integer num11 = (Integer) oVar.a("tagForUnderAgeOfConsent");
                List list = (List) oVar.a("testDeviceIds");
                if (str13 != null) {
                    j8.e(str13);
                }
                if (num10 != null) {
                    j8.f(num10.intValue());
                }
                if (num11 != null) {
                    j8.g(num11.intValue());
                }
                if (list != null) {
                    ArrayList arrayList3 = (ArrayList) j8.f1237d;
                    arrayList3.clear();
                    arrayList3.addAll(list);
                }
                int i9 = j8.f1234a;
                int i10 = j8.f1235b;
                p167y2.u uVar2 = new p167y2.u(i9, i10, (String) j8.f1238e, (ArrayList) j8.f1237d, j8.f1236c);
                T0 t0E2 = T0.e();
                t0E2.getClass();
                synchronized (t0E2.f2638e) {
                    try {
                        p167y2.u uVar3 = t0E2.f2641h;
                        t0E2.f2641h = uVar2;
                        InterfaceC0238k0 interfaceC0238k0 = t0E2.f2639f;
                        if (interfaceC0238k0 != null) {
                            if (uVar3.f18184a != i9 || uVar3.f18185b != i10) {
                                try {
                                    interfaceC0238k0.zzu(new zzfs(uVar2));
                                } catch (RemoteException e9) {
                                    J2.j.e("Unable to set request configuration parcel.", e9);
                                }
                            }
                            break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ((A5.p) rVar).success(null);
                return;
            case "MobileAds#disableMediationInitialization":
                this.f4448x.getClass();
                T0 t0E3 = T0.e();
                synchronized (t0E3.f2638e) {
                    t0E3.c(context2);
                    try {
                        t0E3.f2639f.zzi();
                        break;
                    } catch (RemoteException unused2) {
                        J2.j.d("Unable to disable mediation adapter initialization.");
                    }
                    break;
                }
                ((A5.p) rVar).success(null);
                return;
            case "MobileAds#openAdInspector":
                C1013m0 c1013m3 = this.f4448x;
                R4.c cVar2 = new R4.c((A5.p) rVar, 7);
                c1013m3.getClass();
                T0 t0E4 = T0.e();
                synchronized (t0E4.f2638e) {
                    t0E4.c(context2);
                    t0E4.f2640g = cVar2;
                    try {
                        t0E4.f2639f.zzm(new R0());
                        break;
                    } catch (RemoteException unused3) {
                        J2.j.d("Unable to open the ad inspector.");
                        ((A5.p) cVar2.f6064b).error(Integer.toString(0), "Ad inspector had an internal error.", "com.google.android.gms.ads");
                    }
                    break;
                }
                return;
            case "showAdWithoutView":
                C1050x1 c1050x14 = this.f4443b;
                Integer num12 = (Integer) oVar.a("adId");
                num12.getClass();
                AbstractC0329h abstractC0329h = (AbstractC0329h) ((AbstractC0331j) ((HashMap) c1050x14.f17932c).get(num12));
                if (abstractC0329h == null) {
                    ((A5.p) rVar).error("AdShowError", "Ad failed to show.", null);
                    return;
                } else {
                    abstractC0329h.e();
                    ((A5.p) rVar).success(null);
                    return;
                }
            case "MobileAds#initialize":
                C1013m0 c1013m4 = this.f4448x;
                U u4 = new U((A5.p) rVar);
                c1013m4.getClass();
                new Thread(new y0(11, context2, u4)).start();
                return;
            case "setImmersiveMode":
                C1050x1 c1050x15 = this.f4443b;
                Integer num13 = (Integer) oVar.a("adId");
                num13.getClass();
                ((AbstractC0329h) ((AbstractC0331j) ((HashMap) c1050x15.f17932c).get(num13))).d(((Boolean) oVar.a("immersiveModeEnabled")).booleanValue());
                ((A5.p) rVar).success(null);
                return;
            case "loadRewardedInterstitialAd":
                String str14 = (String) oVar.a("adUnitId");
                a(str14);
                r rVar9 = (r) oVar.a(SentryBaseEvent.JsonKeys.REQUEST);
                C0334m c0334m7 = (C0334m) oVar.a("adManagerRequest");
                if (rVar9 != null) {
                    int iIntValue9 = ((Integer) oVar.a("adId")).intValue();
                    C1050x1 c1050x16 = this.f4443b;
                    a(c1050x16);
                    q7 = new Q(iIntValue9, c1050x16, str14, rVar9, new C1052y0(context2, 6));
                } else {
                    if (c0334m7 == null) {
                        ((A5.p) rVar).error("InvalidRequest", "A null or invalid ad request was provided.", null);
                        return;
                    }
                    int iIntValue10 = ((Integer) oVar.a("adId")).intValue();
                    C1050x1 c1050x17 = this.f4443b;
                    a(c1050x17);
                    q7 = new Q(iIntValue10, c1050x17, str14, c0334m7, new C1052y0(context2, 6));
                }
                C1050x1 c1050x18 = this.f4443b;
                Integer num14 = (Integer) oVar.a("adId");
                a(num14);
                c1050x18.h0(q7, num14.intValue());
                P p5 = new P(q7);
                String str15 = q7.f4430c;
                C1052y0 c1052y3 = q7.f4431d;
                r rVar10 = q7.f4432e;
                if (rVar10 != null) {
                    T2.a.load((Context) c1052y3.f17938b, str15, rVar10.a(), p5);
                } else {
                    C0334m c0334m8 = q7.f4433f;
                    if (c0334m8 != null) {
                        T2.a.load((Context) c1052y3.f17938b, str15, c0334m8.c(), (T2.b) p5);
                    } else {
                        Log.e("FlutterRIAd", "A null or invalid ad request was provided.");
                    }
                }
                ((A5.p) rVar).success(null);
                return;
            default:
                ((A5.p) rVar).notImplemented();
                return;
        }
    }

    @Override // p164x5.a
    public final void onReattachedToActivityForConfigChanges(p164x5.b bVar) {
        C1050x1 c1050x1 = this.f4443b;
        if (c1050x1 != null) {
            c1050x1.f17931b = (p121q5.c) ((Q3.o) bVar).f5822a;
        }
        C0322a c0322a = this.f4444c;
        if (c0322a != null) {
            c0322a.f4452d = (p121q5.c) ((Q3.o) bVar).f5822a;
        }
        F0 f7 = this.f4446e;
        if (f7 != null) {
            f7.f17382e = (p121q5.c) ((Q3.o) bVar).f5822a;
        }
    }
}
