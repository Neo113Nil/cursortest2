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
import com.google.android.gms.internal.ads.zzbbd;
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
import o3.BinderC1507b;
import q5.AbstractActivityC1559c;
import r5.C1577b;
import v0.AbstractC1663a;
import w1.C1719l1;
import w1.C1722m0;
import w1.C1759x1;
import w1.C1761y0;
import w1.F0;
import w1.P2;
import w5.C1782b;
import w5.InterfaceC1783c;
import x5.InterfaceC1789a;
import x5.InterfaceC1790b;
import y2.C1796A;

/* loaded from: classes2.dex */
public class V implements InterfaceC1783c, InterfaceC1789a, A5.q {

    /* renamed from: a, reason: collision with root package name */
    public C1782b f4442a;

    /* renamed from: b, reason: collision with root package name */
    public C1759x1 f4443b;

    /* renamed from: c, reason: collision with root package name */
    public C0322a f4444c;

    /* renamed from: d, reason: collision with root package name */
    public C0323b f4445d;

    /* renamed from: e, reason: collision with root package name */
    public F0 f4446e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f4447f = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    public final C1722m0 f4448x = new C1722m0(6);

    public static void a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
    }

    @Override // x5.InterfaceC1789a
    public final void onAttachedToActivity(InterfaceC1790b interfaceC1790b) {
        C1759x1 c1759x1 = this.f4443b;
        if (c1759x1 != null) {
            c1759x1.f17925b = (AbstractActivityC1559c) ((Q3.o) interfaceC1790b).f5822a;
        }
        C0322a c0322a = this.f4444c;
        if (c0322a != null) {
            c0322a.f4452d = (AbstractActivityC1559c) ((Q3.o) interfaceC1790b).f5822a;
        }
        F0 f02 = this.f4446e;
        if (f02 != null) {
            f02.f17376e = (AbstractActivityC1559c) ((Q3.o) interfaceC1790b).f5822a;
        }
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of;
        this.f4442a = c1782b;
        Context context = c1782b.f18075a;
        L l7 = new L();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getApplicationContext().getPackageManager();
                String packageName = context.getPackageName();
                of = PackageManager.ApplicationInfoFlags.of(128L);
                applicationInfo = packageManager.getApplicationInfo(packageName, of);
            } else {
                applicationInfo = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                l7.f4418b = bundle.getString("io.flutter.plugins.googlemobileads.FLUTTER_GAME_TEMPLATE_VERSION");
                l7.f4417a = applicationInfo.metaData.getString("io.flutter.plugins.googlemobileads.FLUTTER_NEWS_TEMPLATE_VERSION");
            }
        } catch (PackageManager.NameNotFoundException | ClassCastException unused) {
        }
        this.f4444c = new C0322a(context, l7);
        A5.y yVar = new A5.y(this.f4444c);
        A5.f fVar = c1782b.f18077c;
        A5.s sVar = new A5.s(fVar, "plugins.flutter.io/google_mobile_ads", yVar, null);
        sVar.b(this);
        C1759x1 c1759x1 = new C1759x1(sVar);
        this.f4443b = c1759x1;
        ((io.flutter.plugin.platform.p) c1782b.f18078d).k("plugins.flutter.io/google_mobile_ads/ad_widget", new W(c1759x1));
        C0323b c0323b = new C0323b();
        new A5.s(fVar, "plugins.flutter.io/google_mobile_ads/app_state_method").b(c0323b);
        new A5.j(fVar, "plugins.flutter.io/google_mobile_ads/app_state_event").a(c0323b);
        this.f4445d = c0323b;
        this.f4446e = new F0(fVar, c1782b.f18075a);
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivity() {
        C1782b c1782b;
        C0322a c0322a = this.f4444c;
        if (c0322a != null && (c1782b = this.f4442a) != null) {
            c0322a.f4452d = c1782b.f18075a;
        }
        C1759x1 c1759x1 = this.f4443b;
        if (c1759x1 != null) {
            c1759x1.f17925b = null;
        }
        F0 f02 = this.f4446e;
        if (f02 != null) {
            f02.f17376e = null;
        }
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivityForConfigChanges() {
        C1782b c1782b;
        C0322a c0322a = this.f4444c;
        if (c0322a != null && (c1782b = this.f4442a) != null) {
            c0322a.f4452d = c1782b.f18075a;
        }
        C1759x1 c1759x1 = this.f4443b;
        if (c1759x1 != null) {
            c1759x1.f17925b = null;
        }
        F0 f02 = this.f4446e;
        if (f02 != null) {
            f02.f17376e = null;
        }
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        C0323b c0323b = this.f4445d;
        if (c0323b != null) {
            ProcessLifecycleOwner.f9594z.f9600f.b(c0323b);
            this.f4445d = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0ab7  */
    @Override // A5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMethodCall(A5.o oVar, A5.r rVar) {
        C1782b c1782b;
        char c3;
        WebView webView;
        C0407c c0407c;
        O o7;
        Object obj;
        H h6;
        O2.f fVar;
        y2.j h7;
        y2.w wVar;
        Q q7;
        boolean z4 = true;
        C1759x1 c1759x1 = this.f4443b;
        if (c1759x1 == null || (c1782b = this.f4442a) == null) {
            w1.L.m(new StringBuilder("method call received before instanceManager initialized: "), oVar.f676a, "GoogleMobileAdsPlugin");
            return;
        }
        Context context = (AbstractActivityC1559c) c1759x1.f17925b;
        if (context == null) {
            context = c1782b.f18075a;
        }
        Context context2 = context;
        String str = oVar.f676a;
        str.getClass();
        C0343w c0343w = null;
        switch (str.hashCode()) {
            case -1959534605:
                if (str.equals("MobileAds#openDebugMenu")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -1941808395:
                if (str.equals("loadInterstitialAd")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -1826439721:
                if (str.equals("MobileAds#setAppMuted")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -1771320504:
                if (str.equals("loadAppOpenAd")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case -1557947903:
                if (str.equals("MobileAds#registerWebView")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case -1548893609:
                if (str.equals("loadRewardedAd")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case -1395015128:
                if (str.equals("MobileAds#getRequestConfiguration")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case -1273455673:
                if (str.equals("loadFluidAd")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case -965504608:
                if (str.equals("loadNativeAd")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case -918684377:
                if (str.equals("setServerSideVerificationOptions")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case -768079951:
                if (str.equals("AdSize#getAnchoredAdaptiveBannerAdSize")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case -676596397:
                if (str.equals("loadAdManagerInterstitialAd")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case -572043403:
                if (str.equals("loadBannerAd")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case -533157842:
                if (str.equals("MobileAds#setAppVolume")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            case -436783448:
                if (str.equals("MobileAds#getVersionString")) {
                    c3 = 14;
                    break;
                }
                c3 = 65535;
                break;
            case -172783533:
                if (str.equals("loadAdManagerBannerAd")) {
                    c3 = 15;
                    break;
                }
                c3 = 65535;
                break;
            case 90971631:
                if (str.equals("_init")) {
                    c3 = 16;
                    break;
                }
                c3 = 65535;
                break;
            case 250880674:
                if (str.equals("disposeAd")) {
                    c3 = 17;
                    break;
                }
                c3 = 65535;
                break;
            case 273004986:
                if (str.equals("getAdSize")) {
                    c3 = 18;
                    break;
                }
                c3 = 65535;
                break;
            case 288452133:
                if (str.equals("MobileAds#updateRequestConfiguration")) {
                    c3 = 19;
                    break;
                }
                c3 = 65535;
                break;
            case 316173893:
                if (str.equals("MobileAds#disableMediationInitialization")) {
                    c3 = 20;
                    break;
                }
                c3 = 65535;
                break;
            case 1064076149:
                if (str.equals("MobileAds#openAdInspector")) {
                    c3 = 21;
                    break;
                }
                c3 = 65535;
                break;
            case 1355848557:
                if (str.equals("showAdWithoutView")) {
                    c3 = 22;
                    break;
                }
                c3 = 65535;
                break;
            case 1403601573:
                if (str.equals("MobileAds#initialize")) {
                    c3 = 23;
                    break;
                }
                c3 = 65535;
                break;
            case 1661969852:
                if (str.equals("setImmersiveMode")) {
                    c3 = 24;
                    break;
                }
                c3 = 65535;
                break;
            case 1882741923:
                if (str.equals("loadRewardedInterstitialAd")) {
                    c3 = 25;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                String str2 = (String) oVar.a("adUnitId");
                this.f4448x.getClass();
                C1722m0.j(context2, str2);
                ((A5.p) rVar).success(null);
                return;
            case 1:
                int intValue = ((Integer) oVar.a("adId")).intValue();
                C1759x1 c1759x12 = this.f4443b;
                String str3 = (String) oVar.a("adUnitId");
                r rVar2 = (r) oVar.a(SentryBaseEvent.JsonKeys.REQUEST);
                G g3 = new G(intValue, c1759x12, str3, rVar2, new C1761y0(context2, 6));
                this.f4443b.h0(g3, ((Integer) oVar.a("adId")).intValue());
                if (c1759x12 != null && str3 != null && rVar2 != null) {
                    K2.a.load(context2, str3, rVar2.a(), new F(g3));
                }
                ((A5.p) rVar).success(null);
                return;
            case 2:
                C1722m0 c1722m0 = this.f4448x;
                boolean booleanValue = ((Boolean) oVar.a("muted")).booleanValue();
                c1722m0.getClass();
                C1722m0.m(booleanValue);
                ((A5.p) rVar).success(null);
                return;
            case 3:
                int intValue2 = ((Integer) oVar.a("adId")).intValue();
                C1759x1 c1759x13 = this.f4443b;
                a(c1759x13);
                String str4 = (String) oVar.a("adUnitId");
                a(str4);
                r rVar3 = (r) oVar.a(SentryBaseEvent.JsonKeys.REQUEST);
                C0334m c0334m = (C0334m) oVar.a("adManagerRequest");
                A a2 = new A(intValue2, c1759x13, str4, rVar3, c0334m, new C1761y0(context2, 6));
                this.f4443b.h0(a2, ((Integer) oVar.a("adId")).intValue());
                if (rVar3 != null) {
                    A2.b.load(context2, str4, rVar3.a(), new z(a2));
                } else if (c0334m != null) {
                    A2.b.load(context2, str4, c0334m.c(), new z(a2));
                }
                ((A5.p) rVar).success(null);
                return;
            case 4:
                Integer num = (Integer) oVar.a("webViewId");
                C1722m0 c1722m02 = this.f4448x;
                int intValue3 = num.intValue();
                C1577b c1577b = this.f4442a.f18076b;
                c1722m02.getClass();
                long j = intValue3;
                f0 f0Var = (f0) ((InterfaceC1783c) ((HashMap) c1577b.f16034d.f16053b).get(f0.class));
                if (f0Var != null && (c0407c = (C0407c) f0Var.f6163b.f3679c) != null) {
                    Object e7 = c0407c.e(j);
                    if (e7 instanceof WebView) {
                        webView = (WebView) e7;
                        if (webView != null) {
                            AbstractC1663a.j(intValue3, "MobileAds.registerWebView unable to find webView with id: ", "FlutterMobileAdsWrapper");
                        } else {
                            T0.e();
                            com.google.android.gms.common.internal.D.d("#008 Must be called on the main UI thread.");
                            zzbxy zza = zzbtf.zza(webView.getContext());
                            if (zza == null) {
                                J2.j.d("Internal error, query info generator is null.");
                            } else {
                                try {
                                    zza.zzj(new BinderC1507b(webView));
                                } catch (RemoteException e8) {
                                    J2.j.e("", e8);
                                }
                            }
                        }
                        ((A5.p) rVar).success(null);
                        return;
                    }
                }
                webView = null;
                if (webView != null) {
                }
                ((A5.p) rVar).success(null);
                return;
            case 5:
                String str5 = (String) oVar.a("adUnitId");
                a(str5);
                r rVar4 = (r) oVar.a(SentryBaseEvent.JsonKeys.REQUEST);
                C0334m c0334m2 = (C0334m) oVar.a("adManagerRequest");
                if (rVar4 != null) {
                    int intValue4 = ((Integer) oVar.a("adId")).intValue();
                    C1759x1 c1759x14 = this.f4443b;
                    a(c1759x14);
                    o7 = new O(intValue4, c1759x14, str5, rVar4, new C1761y0(context2, 6));
                } else {
                    if (c0334m2 == null) {
                        ((A5.p) rVar).error("InvalidRequest", "A null or invalid ad request was provided.", null);
                        return;
                    }
                    int intValue5 = ((Integer) oVar.a("adId")).intValue();
                    C1759x1 c1759x15 = this.f4443b;
                    a(c1759x15);
                    o7 = new O(intValue5, c1759x15, str5, c0334m2, new C1761y0(context2, 6));
                }
                C1759x1 c1759x16 = this.f4443b;
                Integer num2 = (Integer) oVar.a("adId");
                a(num2);
                c1759x16.h0(o7, num2.intValue());
                M m7 = new M(o7);
                String str6 = o7.f4423c;
                C1761y0 c1761y0 = o7.f4424d;
                r rVar5 = o7.f4425e;
                if (rVar5 != null) {
                    S2.c.load((Context) c1761y0.f17932b, str6, rVar5.a(), m7);
                } else {
                    C0334m c0334m3 = o7.f4426f;
                    if (c0334m3 != null) {
                        S2.c.load((Context) c1761y0.f17932b, str6, c0334m3.c(), (S2.d) m7);
                    } else {
                        Log.e("FlutterRewardedAd", "A null or invalid ad request was provided.");
                    }
                }
                ((A5.p) rVar).success(null);
                return;
            case 6:
                this.f4448x.getClass();
                ((A5.p) rVar).success(T0.e().f2641h);
                return;
            case 7:
                C0325d c0325d = new C0325d(((Integer) oVar.a("adId")).intValue(), this.f4443b, (String) oVar.a("adUnitId"), Collections.singletonList(new C0343w(y2.j.f18161p)), (C0334m) oVar.a(SentryBaseEvent.JsonKeys.REQUEST), new u1.c(context2, 7));
                c0325d.f4459i = -1;
                this.f4443b.h0(c0325d, ((Integer) oVar.a("adId")).intValue());
                c0325d.d();
                ((A5.p) rVar).success(null);
                return;
            case '\b':
                String str7 = (String) oVar.a("factoryId");
                if (this.f4447f.get(str7) != null) {
                    throw new ClassCastException();
                }
                if (((M5.b) oVar.a("nativeTemplateStyle")) == null) {
                    ((A5.p) rVar).error("NativeAdError", AbstractC0486a1.h("No NativeAdFactory with id: ", str7, " or nativeTemplateStyle"), null);
                    return;
                }
                C1759x1 c1759x17 = this.f4443b;
                String str8 = (String) oVar.a("adUnitId");
                r rVar6 = (r) oVar.a(SentryBaseEvent.JsonKeys.REQUEST);
                C0334m c0334m4 = (C0334m) oVar.a("adManagerRequest");
                Map map = (Map) oVar.a("customOptions");
                Integer num3 = (Integer) oVar.a("adId");
                num3.getClass();
                J j3 = (J) oVar.a("nativeAdOptions");
                C1761y0 c1761y02 = new C1761y0(context2, 6);
                M5.b bVar = (M5.b) oVar.a("nativeTemplateStyle");
                if (c1759x17 == null) {
                    throw new IllegalStateException("AdInstanceManager cannot be null.");
                }
                if (str8 == null) {
                    throw new IllegalStateException("AdUnitId cannot be null.");
                }
                if (bVar == null) {
                    throw new IllegalStateException("NativeAdFactory and nativeTemplateStyle cannot be null.");
                }
                if (rVar6 == null && c0334m4 == null) {
                    throw new IllegalStateException("adRequest or addManagerRequest must be non-null.");
                }
                if (rVar6 == null) {
                    obj = null;
                    h6 = new H(context2, num3.intValue(), c1759x17, str8, c0334m4, c1761y02, map, j3, bVar);
                } else {
                    obj = null;
                    h6 = new H(context2, num3.intValue(), c1759x17, str8, rVar6, c1761y02, map, j3, bVar);
                }
                this.f4443b.h0(h6, ((Integer) oVar.a("adId")).intValue());
                C1719l1 c1719l1 = new C1719l1();
                c1719l1.f17771a = new WeakReference(h6);
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
                        y2.z zVar = new y2.z();
                        zVar.f18191a = true;
                        zVar.f18192b = false;
                        zVar.f18193c = false;
                        Boolean bool = t7.f4437a;
                        if (bool != null) {
                            zVar.f18193c = bool.booleanValue();
                        }
                        Boolean bool2 = t7.f4438b;
                        if (bool2 != null) {
                            zVar.f18192b = bool2.booleanValue();
                        }
                        Boolean bool3 = t7.f4439c;
                        if (bool3 != null) {
                            zVar.f18191a = bool3.booleanValue();
                        }
                        eVar.f4983d = new C1796A(zVar);
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
                C1761y0 c1761y03 = h6.f4403d;
                String str9 = h6.f4402c;
                r rVar7 = h6.f4404e;
                if (rVar7 != null) {
                    y2.i a4 = rVar7.a();
                    y2.f fVar2 = new y2.f((Context) c1761y03.f17932b, str9);
                    fVar2.b(c1719l1);
                    fVar2.d(fVar);
                    fVar2.c(i7);
                    fVar2.a().a(a4.f18154a);
                } else {
                    C0334m c0334m5 = h6.f4405f;
                    if (c0334m5 != null) {
                        z2.b c4 = c0334m5.c();
                        y2.f fVar3 = new y2.f((Context) c1761y03.f17932b, str9);
                        fVar3.b(c1719l1);
                        fVar3.d(fVar);
                        fVar3.c(i7);
                        fVar3.a().a(c4.f18154a);
                    } else {
                        Log.e("FlutterNativeAd", "A null or invalid ad request was provided.");
                    }
                }
                ((A5.p) rVar).success(obj);
                return;
            case '\t':
                C1759x1 c1759x18 = this.f4443b;
                Integer num6 = (Integer) oVar.a("adId");
                num6.getClass();
                AbstractC0331j abstractC0331j = (AbstractC0331j) ((HashMap) c1759x18.f17926c).get(num6);
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
            case '\n':
                String str10 = (String) oVar.a(Device.JsonKeys.ORIENTATION);
                int intValue6 = ((Integer) oVar.a("width")).intValue();
                if (str10 == null) {
                    y2.j jVar = y2.j.f18155i;
                    h7 = J2.d.h(intValue6, context2, 0);
                    h7.f18167d = true;
                } else if (str10.equals("portrait")) {
                    y2.j jVar2 = y2.j.f18155i;
                    h7 = J2.d.h(intValue6, context2, 1);
                    h7.f18167d = true;
                } else {
                    if (!str10.equals("landscape")) {
                        throw new IllegalArgumentException("Unexpected value for orientation: ".concat(str10));
                    }
                    y2.j jVar3 = y2.j.f18155i;
                    h7 = J2.d.h(intValue6, context2, 2);
                    h7.f18167d = true;
                }
                int i8 = h7.f18165b;
                if (y2.j.f18162q.equals(h7)) {
                    ((A5.p) rVar).success(null);
                    return;
                } else {
                    ((A5.p) rVar).success(Integer.valueOf(i8));
                    return;
                }
            case 11:
                int intValue7 = ((Integer) oVar.a("adId")).intValue();
                C1759x1 c1759x19 = this.f4443b;
                a(c1759x19);
                String str11 = (String) oVar.a("adUnitId");
                a(str11);
                C0334m c0334m6 = (C0334m) oVar.a(SentryBaseEvent.JsonKeys.REQUEST);
                C0338q c0338q = new C0338q(intValue7, c1759x19, str11, c0334m6, new C1761y0(context2, 6));
                C1759x1 c1759x110 = this.f4443b;
                Integer num7 = (Integer) oVar.a("adId");
                a(num7);
                c1759x110.h0(c0338q, num7.intValue());
                z2.c.load(context2, str11, c0334m6.c(), new C0337p(c0338q));
                ((A5.p) rVar).success(null);
                return;
            case '\f':
                int intValue8 = ((Integer) oVar.a("adId")).intValue();
                C1759x1 c1759x111 = this.f4443b;
                String str12 = (String) oVar.a("adUnitId");
                r rVar8 = (r) oVar.a(SentryBaseEvent.JsonKeys.REQUEST);
                C0343w c0343w2 = (C0343w) oVar.a(RRWebVideoEvent.JsonKeys.SIZE);
                B b7 = new B(intValue8, c1759x111, str12, rVar8, c0343w2, new u1.c(context2, 7));
                this.f4443b.h0(b7, ((Integer) oVar.a("adId")).intValue());
                AdView adView = new AdView(context2);
                b7.f4393c = adView;
                adView.setAdUnitId(str12);
                b7.f4393c.setAdSize(c0343w2.f4508a);
                b7.f4393c.setOnPaidEventListener(new P2(16, c1759x111, b7, false));
                b7.f4393c.setAdListener(new C(intValue8, c1759x111, b7));
                b7.f4393c.b(rVar8.a());
                ((A5.p) rVar).success(null);
                return;
            case '\r':
                C1722m0 c1722m03 = this.f4448x;
                double doubleValue = ((Double) oVar.a("volume")).doubleValue();
                c1722m03.getClass();
                float f7 = (float) doubleValue;
                T0 e9 = T0.e();
                e9.getClass();
                com.google.android.gms.common.internal.D.a("The app volume must be a value between 0 and 1 inclusive.", f7 >= 0.0f && f7 <= 1.0f);
                synchronized (e9.f2638e) {
                    if (e9.f2639f == null) {
                        z4 = false;
                    }
                    com.google.android.gms.common.internal.D.k("MobileAds.initialize() must be called prior to setting the app volume.", z4);
                    try {
                        e9.f2639f.zzq(f7);
                    } catch (RemoteException e10) {
                        J2.j.e("Unable to set app volume.", e10);
                    }
                }
                ((A5.p) rVar).success(null);
                return;
            case 14:
                this.f4448x.getClass();
                T0.e();
                String[] split = TextUtils.split("24.1.0", "\\.");
                if (split.length != 3) {
                    wVar = new y2.w(0, 0, 0);
                } else {
                    try {
                        wVar = new y2.w(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
                    } catch (NumberFormatException unused) {
                        wVar = new y2.w(0, 0, 0);
                    }
                }
                ((A5.p) rVar).success(wVar.toString());
                return;
            case 15:
                C0336o c0336o = new C0336o(((Integer) oVar.a("adId")).intValue(), this.f4443b, (String) oVar.a("adUnitId"), (List) oVar.a("sizes"), (C0334m) oVar.a(SentryBaseEvent.JsonKeys.REQUEST), new u1.c(context2, 7));
                this.f4443b.h0(c0336o, ((Integer) oVar.a("adId")).intValue());
                c0336o.d();
                ((A5.p) rVar).success(null);
                return;
            case 16:
                HashMap hashMap = (HashMap) this.f4443b.f17926c;
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (entry.getValue() != null) {
                        ((AbstractC0331j) entry.getValue()).b();
                    }
                }
                hashMap.clear();
                ((A5.p) rVar).success(null);
                return;
            case 17:
                C1759x1 c1759x112 = this.f4443b;
                Integer num8 = (Integer) oVar.a("adId");
                num8.getClass();
                HashMap hashMap2 = (HashMap) c1759x112.f17926c;
                if (hashMap2.containsKey(num8)) {
                    AbstractC0331j abstractC0331j2 = (AbstractC0331j) hashMap2.get(num8);
                    if (abstractC0331j2 != null) {
                        abstractC0331j2.b();
                    }
                    hashMap2.remove(num8);
                }
                ((A5.p) rVar).success(null);
                return;
            case 18:
                C1759x1 c1759x113 = this.f4443b;
                Integer num9 = (Integer) oVar.a("adId");
                num9.getClass();
                AbstractC0331j abstractC0331j3 = (AbstractC0331j) ((HashMap) c1759x113.f17926c).get(num9);
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
            case 19:
                y2.u uVar = T0.e().f2641h;
                uVar.getClass();
                C0.J j8 = new C0.J();
                j8.f(uVar.f18178a);
                j8.g(uVar.f18179b);
                j8.e(uVar.f18180c);
                ArrayList arrayList = uVar.f18181d;
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
                y2.u uVar2 = new y2.u(i9, i10, (String) j8.f1238e, (ArrayList) j8.f1237d, j8.f1236c);
                T0 e11 = T0.e();
                e11.getClass();
                synchronized (e11.f2638e) {
                    try {
                        y2.u uVar3 = e11.f2641h;
                        e11.f2641h = uVar2;
                        InterfaceC0238k0 interfaceC0238k0 = e11.f2639f;
                        if (interfaceC0238k0 != null) {
                            if (uVar3.f18178a != i9 || uVar3.f18179b != i10) {
                                try {
                                    interfaceC0238k0.zzu(new zzfs(uVar2));
                                } catch (RemoteException e12) {
                                    J2.j.e("Unable to set request configuration parcel.", e12);
                                }
                            }
                        }
                    } finally {
                    }
                }
                ((A5.p) rVar).success(null);
                return;
            case 20:
                this.f4448x.getClass();
                T0 e13 = T0.e();
                synchronized (e13.f2638e) {
                    e13.c(context2);
                    try {
                        e13.f2639f.zzi();
                    } catch (RemoteException unused2) {
                        J2.j.d("Unable to disable mediation adapter initialization.");
                    }
                }
                ((A5.p) rVar).success(null);
                return;
            case zzbbd.zzt.zzm /* 21 */:
                C1722m0 c1722m04 = this.f4448x;
                R4.c cVar2 = new R4.c((A5.p) rVar, 7);
                c1722m04.getClass();
                T0 e14 = T0.e();
                synchronized (e14.f2638e) {
                    e14.c(context2);
                    e14.f2640g = cVar2;
                    try {
                        e14.f2639f.zzm(new R0());
                    } catch (RemoteException unused3) {
                        J2.j.d("Unable to open the ad inspector.");
                        ((A5.p) cVar2.f6064b).error(Integer.toString(0), "Ad inspector had an internal error.", "com.google.android.gms.ads");
                    }
                }
                return;
            case 22:
                C1759x1 c1759x114 = this.f4443b;
                Integer num12 = (Integer) oVar.a("adId");
                num12.getClass();
                AbstractC0329h abstractC0329h = (AbstractC0329h) ((AbstractC0331j) ((HashMap) c1759x114.f17926c).get(num12));
                if (abstractC0329h == null) {
                    ((A5.p) rVar).error("AdShowError", "Ad failed to show.", null);
                    return;
                } else {
                    abstractC0329h.e();
                    ((A5.p) rVar).success(null);
                    return;
                }
            case 23:
                C1722m0 c1722m05 = this.f4448x;
                U u4 = new U((A5.p) rVar);
                c1722m05.getClass();
                new Thread(new y0(11, context2, u4)).start();
                return;
            case 24:
                C1759x1 c1759x115 = this.f4443b;
                Integer num13 = (Integer) oVar.a("adId");
                num13.getClass();
                ((AbstractC0329h) ((AbstractC0331j) ((HashMap) c1759x115.f17926c).get(num13))).d(((Boolean) oVar.a("immersiveModeEnabled")).booleanValue());
                ((A5.p) rVar).success(null);
                return;
            case 25:
                String str14 = (String) oVar.a("adUnitId");
                a(str14);
                r rVar9 = (r) oVar.a(SentryBaseEvent.JsonKeys.REQUEST);
                C0334m c0334m7 = (C0334m) oVar.a("adManagerRequest");
                if (rVar9 != null) {
                    int intValue9 = ((Integer) oVar.a("adId")).intValue();
                    C1759x1 c1759x116 = this.f4443b;
                    a(c1759x116);
                    q7 = new Q(intValue9, c1759x116, str14, rVar9, new C1761y0(context2, 6));
                } else {
                    if (c0334m7 == null) {
                        ((A5.p) rVar).error("InvalidRequest", "A null or invalid ad request was provided.", null);
                        return;
                    }
                    int intValue10 = ((Integer) oVar.a("adId")).intValue();
                    C1759x1 c1759x117 = this.f4443b;
                    a(c1759x117);
                    q7 = new Q(intValue10, c1759x117, str14, c0334m7, new C1761y0(context2, 6));
                }
                C1759x1 c1759x118 = this.f4443b;
                Integer num14 = (Integer) oVar.a("adId");
                a(num14);
                c1759x118.h0(q7, num14.intValue());
                P p5 = new P(q7);
                String str15 = q7.f4430c;
                C1761y0 c1761y04 = q7.f4431d;
                r rVar10 = q7.f4432e;
                if (rVar10 != null) {
                    T2.a.load((Context) c1761y04.f17932b, str15, rVar10.a(), p5);
                } else {
                    C0334m c0334m8 = q7.f4433f;
                    if (c0334m8 != null) {
                        T2.a.load((Context) c1761y04.f17932b, str15, c0334m8.c(), (T2.b) p5);
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

    @Override // x5.InterfaceC1789a
    public final void onReattachedToActivityForConfigChanges(InterfaceC1790b interfaceC1790b) {
        C1759x1 c1759x1 = this.f4443b;
        if (c1759x1 != null) {
            c1759x1.f17925b = (AbstractActivityC1559c) ((Q3.o) interfaceC1790b).f5822a;
        }
        C0322a c0322a = this.f4444c;
        if (c0322a != null) {
            c0322a.f4452d = (AbstractActivityC1559c) ((Q3.o) interfaceC1790b).f5822a;
        }
        F0 f02 = this.f4446e;
        if (f02 != null) {
            f02.f17376e = (AbstractActivityC1559c) ((Q3.o) interfaceC1790b).f5822a;
        }
    }
}
