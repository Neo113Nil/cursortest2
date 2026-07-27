package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.ads.splash.SplashHideListener;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.a0;
import com.startapp.sdk.internal.a2;
import com.startapp.sdk.internal.aa;
import com.startapp.sdk.internal.d7;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.db;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.f6;
import com.startapp.sdk.internal.f7;
import com.startapp.sdk.internal.fh;
import com.startapp.sdk.internal.fi;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.gh;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.j0;
import com.startapp.sdk.internal.j7;
import com.startapp.sdk.internal.ja;
import com.startapp.sdk.internal.k7;
import com.startapp.sdk.internal.l7;
import com.startapp.sdk.internal.m8;
import com.startapp.sdk.internal.n7;
import com.startapp.sdk.internal.p;
import com.startapp.sdk.internal.pf;
import com.startapp.sdk.internal.rf;
import com.startapp.sdk.internal.s;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.t;
import com.startapp.sdk.internal.w0;
import com.startapp.sdk.internal.wb;
import com.startapp.sdk.internal.x6;
import com.startapp.sdk.internal.y;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z9;
import d2.C0279i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class StartAppAd extends Ad {

    /* renamed from: a, reason: collision with root package name */
    private final ib f3119a;

    /* renamed from: b, reason: collision with root package name */
    private final ib f3120b;

    /* renamed from: c, reason: collision with root package name */
    private final ib f3121c;

    /* renamed from: d, reason: collision with root package name */
    private CacheKey f3122d;

    /* renamed from: e, reason: collision with root package name */
    private f f3123e;
    private f7 f;

    /* renamed from: g, reason: collision with root package name */
    private AdMode f3124g;

    /* renamed from: h, reason: collision with root package name */
    private AdPreferences f3125h;

    /* renamed from: i, reason: collision with root package name */
    com.startapp.sdk.adsbase.adlisteners.VideoListener f3126i;

    /* renamed from: j, reason: collision with root package name */
    AdDisplayListener f3127j;

    /* renamed from: k, reason: collision with root package name */
    private final h f3128k;

    public enum AdMode {
        AUTOMATIC,
        FULLPAGE,
        OFFERWALL,
        REWARDED_VIDEO,
        VIDEO,
        OVERLAY
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StartAppAd(Context context) {
        super(context, null, r4, r5, r6, r7, r8, r9, r10, r11, r12);
        ib ibVar = com.startapp.sdk.components.a.a(context).f3345K;
        ib ibVar2 = com.startapp.sdk.components.a.a(context).f3362j;
        ib ibVar3 = com.startapp.sdk.components.a.a(context).f3346M;
        ib ibVar4 = com.startapp.sdk.components.a.a(context).f3347N;
        ib ibVar5 = com.startapp.sdk.components.a.a(context).f3355b;
        ib ibVar6 = com.startapp.sdk.components.a.a(context).f3366n;
        ib ibVar7 = com.startapp.sdk.components.a.a(context).f3335A;
        ib ibVar8 = com.startapp.sdk.components.a.a(context).f3375w;
        ib ibVar9 = com.startapp.sdk.components.a.a(context).f3356c;
        ib ibVar10 = com.startapp.sdk.components.a.a(context).f3354a;
        ib ibVar11 = com.startapp.sdk.components.a.a(context).f3341G;
        ib ibVar12 = com.startapp.sdk.components.a.a(context).f3373u;
        this.f3122d = null;
        this.f3124g = AdMode.AUTOMATIC;
        this.f3125h = null;
        this.f3126i = null;
        this.f3127j = null;
        this.f3128k = new h(this);
        this.f3119a = ibVar10;
        this.f3120b = ibVar11;
        this.f3121c = ibVar12;
        try {
            ((pf) ibVar12.a()).a(8192);
        } catch (Throwable unused) {
        }
    }

    public static void disableAutoInterstitial() {
        ja.f3914a.f3215a = false;
    }

    @Deprecated
    public static void disableSplash() {
    }

    public static void enableAutoInterstitial() {
        ja.f3914a.f3215a = true;
    }

    @Deprecated
    public static void enableConsent(Context context, boolean z3) {
        StartAppSDK.enableConsent(context, z3);
    }

    @Deprecated
    public static void init(Context context, String str, String str2) {
        StartAppSDK.init(context, str, str2);
    }

    public static void setAutoInterstitialPreferences(AutoInterstitialPreferences autoInterstitialPreferences) {
        e eVar = ja.f3914a;
        eVar.f3216b = autoInterstitialPreferences;
        eVar.f3217c = -1L;
        eVar.f3218d = -1;
    }

    public static void setCommonAdsPreferences(Context context, SDKAdPreferences sDKAdPreferences) {
        Context a3 = w0.a(context);
        if (a3 != null) {
            fh.f3695a.f3776a = sDKAdPreferences;
            e7.d(a3, "shared_prefs_sdk_ad_prefs", sDKAdPreferences);
        }
    }

    public static void setReturnAdsPreferences(AdPreferences adPreferences) {
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle) {
    }

    @Deprecated
    public void close() {
        wb.a(this.context).a(this.f3128k);
        wb.a(this.context).a(new Intent("com.startapp.android.CloseAdActivity"));
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final /* bridge */ /* synthetic */ a2 createService(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getAdId() {
        Object a3 = ((p) this.adCacheManager.a()).a(this.f3122d);
        if (a3 instanceof m8) {
            return ((m8) a3).getAdId();
        }
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final AdPreferences.Placement getPlacement() {
        AdPreferences.Placement placement = super.getPlacement();
        return (placement != null || this.f3122d == null || ((p) this.adCacheManager.a()).a(this.f3122d) == null) ? placement : ((Ad) ((p) this.adCacheManager.a()).a(this.f3122d)).getPlacement();
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final Ad.AdState getState() {
        f a3 = ((p) this.adCacheManager.a()).a(this.f3122d);
        return a3 != null ? a3.getState() : Ad.AdState.UN_INITIALIZED;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final boolean isBelowMinCPM() {
        f a3 = ((p) this.adCacheManager.a()).a(this.f3122d);
        if (a3 != null) {
            return a3.isBelowMinCPM();
        }
        return false;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Deprecated
    public boolean isReady() {
        f a3 = ((p) this.adCacheManager.a()).a(this.f3122d);
        if (a3 != null) {
            return a3.isReady();
        }
        return false;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener) {
        load(adPreferences, adEventListener, null);
    }

    public void loadAd() {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), (AdEventListener) null);
    }

    @Deprecated
    public void onBackPressed() {
        showAd("exit_ad");
        gh ghVar = fh.f3695a;
        ghVar.f3778c = false;
        ghVar.f3780e = true;
    }

    @Deprecated
    public void onPause() {
    }

    @Deprecated
    public void onRestoreInstanceState(Bundle bundle) {
        int i3 = bundle.getInt("AdMode");
        this.f3124g = AdMode.AUTOMATIC;
        if (i3 == 1) {
            this.f3124g = AdMode.FULLPAGE;
        } else if (i3 == 2) {
            this.f3124g = AdMode.OFFERWALL;
        } else if (i3 == 3) {
            this.f3124g = AdMode.OVERLAY;
        } else if (i3 == 4) {
            this.f3124g = AdMode.REWARDED_VIDEO;
        } else if (i3 == 5) {
            this.f3124g = AdMode.VIDEO;
        }
        Serializable serializable = bundle.getSerializable("AdPrefs");
        if (serializable != null) {
            this.f3125h = (AdPreferences) serializable;
        }
    }

    @Deprecated
    public void onResume() {
        if (isReady()) {
            return;
        }
        loadAd();
    }

    @Deprecated
    public void onSaveInstanceState(Bundle bundle) {
        int i3 = m.f3243a[this.f3124g.ordinal()];
        int i4 = 1;
        if (i3 != 1) {
            i4 = 2;
            if (i3 != 2) {
                i4 = 3;
                if (i3 != 3) {
                    i4 = 4;
                    if (i3 != 4) {
                        i4 = 0;
                    }
                }
            }
        }
        AdPreferences adPreferences = this.f3125h;
        if (adPreferences != null) {
            bundle.putSerializable("AdPrefs", adPreferences);
        }
        bundle.putInt("AdMode", i4);
    }

    public void setVideoListener(com.startapp.sdk.adsbase.adlisteners.VideoListener videoListener) {
        this.f3126i = videoListener;
    }

    public boolean showAd() {
        return showAd(null, null);
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig) {
    }

    @Override // com.startapp.sdk.adsbase.Ad
    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        String str2;
        if (!canShowAd()) {
            if (adEventListener != null) {
                setErrorMessage("serving ads disabled");
                a0.a(this.context, adEventListener, this, false);
                return;
            }
            return;
        }
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        if (adPreferences.getPlacementId() == null) {
            Context context = this.context;
            String packageName = context.getPackageName();
            String name = getClass().getName();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    str2 = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        str2 = context.getClass().getName();
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            adPreferences.setPlacementId(g0.a(packageName, name, str2, (String) null));
        }
        ((y6) ((x6) this.eventTracer.a())).a((Object) this, fi.f3706a);
        i iVar = new i(this, adEventListener);
        if (d7.a(false, adPreferences.getAdTag(), false, this.f3124g == AdMode.REWARDED_VIDEO)) {
            b(new j(this, iVar), 1);
            return;
        }
        ((y6) ((x6) this.eventTracer.a())).c(this, fi.f3729z);
        AdPreferences adPreferences2 = this.f3125h;
        if (adPreferences2 == null) {
            adPreferences2 = new AdPreferences();
        }
        this.f3122d = ((p) this.adCacheManager.a()).a(this, this.f3124g, this.f3125h, new k(this, iVar, adPreferences2), str);
    }

    public void loadAd(AdPreferences adPreferences) {
        loadAd(AdMode.AUTOMATIC, adPreferences, (AdEventListener) null);
    }

    @Deprecated
    public boolean showAd(String str) {
        return showAd(str, null);
    }

    public static void a(StartAppAd startAppAd, i iVar) {
        ((y6) ((x6) startAppAd.eventTracer.a())).c(startAppAd, fi.f3729z);
        AdPreferences adPreferences = startAppAd.f3125h;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        startAppAd.f3122d = ((p) startAppAd.adCacheManager.a()).a(startAppAd, startAppAd.f3124g, startAppAd.f3125h, new k(startAppAd, iVar, adPreferences), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AdEventListener adEventListener, int i3) {
        ((y6) ((x6) this.eventTracer.a())).c(this, fi.y);
        AdPreferences adPreferences = this.f3125h;
        if (adPreferences != null && !TextUtils.isEmpty(adPreferences.getAdTag())) {
            g0.a(new S.a(i3, 3, this, adEventListener));
        } else {
            adEventListener.onFailedToReceiveAd(null);
        }
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences) {
    }

    public void loadAd(AdEventListener adEventListener) {
        loadAd(adEventListener, (String) null);
    }

    public boolean showAd(AdDisplayListener adDisplayListener) {
        return showAd(null, adDisplayListener);
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, SplashConfig splashConfig, AdPreferences adPreferences, SplashHideListener splashHideListener) {
    }

    public void loadAd(AdEventListener adEventListener, String str) {
        loadAd(AdMode.AUTOMATIC, new AdPreferences(), adEventListener, str);
    }

    @Deprecated
    public boolean showAd(@Deprecated String str, AdDisplayListener adDisplayListener) {
        try {
            return a(str, adDisplayListener);
        } catch (Throwable th) {
            d9.a(th);
            setNotDisplayedReason(NotDisplayedReason.INTERNAL_ERROR);
            y.a(this.context, this.f3127j, null);
            return false;
        }
    }

    @Deprecated
    public static void onBackPressed(Context context) {
        new StartAppAd(context).onBackPressed();
    }

    @Deprecated
    public static void showSplash(Activity activity, Bundle bundle, AdPreferences adPreferences) {
    }

    public void loadAd(AdPreferences adPreferences, AdEventListener adEventListener) {
        loadAd(AdMode.AUTOMATIC, adPreferences, adEventListener);
    }

    public void loadAd(AdMode adMode) {
        loadAd(adMode, new AdPreferences(), (AdEventListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdEventListener adEventListener, int i3) {
        AdEventListener adEventListener2;
        Throwable th;
        AdUnitConfig adUnitConfig;
        try {
            MetaData E3 = MetaData.E();
            ExternalAdConfig v3 = E3.v();
            if (v3 != null) {
                try {
                    adUnitConfig = v3.getMapping().get(this.f3125h.getAdTag());
                } catch (Throwable th2) {
                    th = th2;
                    adEventListener2 = adEventListener;
                    adEventListener2.onFailedToReceiveAd(null);
                    d9.a(th);
                }
            } else {
                adUnitConfig = null;
            }
            if (adUnitConfig == null) {
                adEventListener.onFailedToReceiveAd(null);
                return;
            }
            adEventListener2 = adEventListener;
            try {
                ((j0) this.f3119a.a()).b(adUnitConfig, new com.startapp.sdk.ads.banner.bannerstandard.i(this, adEventListener2, adUnitConfig, i3, E3, 1));
            } catch (Throwable th3) {
                th = th3;
                th = th;
                adEventListener2.onFailedToReceiveAd(null);
                d9.a(th);
            }
        } catch (Throwable th4) {
            th = th4;
            adEventListener2 = adEventListener;
        }
    }

    public void loadAd(AdMode adMode, AdPreferences adPreferences) {
        loadAd(adMode, adPreferences, (AdEventListener) null);
    }

    @Deprecated
    public static boolean showAd(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return new StartAppAd(context).showAd();
        } catch (Throwable th) {
            d9.a(th);
            return false;
        }
    }

    public void loadAd(AdMode adMode, AdEventListener adEventListener) {
        loadAd(adMode, new AdPreferences(), adEventListener);
    }

    public void loadAd(AdMode adMode, AdPreferences adPreferences, AdEventListener adEventListener) {
        loadAd(adMode, adPreferences, adEventListener, null);
    }

    public void loadAd(AdMode adMode, AdEventListener adEventListener, String str) {
        loadAd(adMode, new AdPreferences(), adEventListener, str);
    }

    public void loadAd(AdMode adMode, AdPreferences adPreferences, AdEventListener adEventListener, String str) {
        try {
            ((pf) this.f3121c.a()).a(16384);
        } catch (Throwable unused) {
        }
        this.f3124g = adMode;
        this.f3125h = adPreferences;
        try {
            load(adPreferences, adEventListener, str);
        } catch (Throwable th) {
            d9.a(th);
            if (adEventListener != null) {
                a0.a(this.context, adEventListener, this, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0279i a(AdEventListener adEventListener, AdUnitConfig adUnitConfig, int i3, MetaData metaData, f7 f7Var) {
        DisplayMetrics displayMetrics;
        Point point = new Point();
        Resources resources = this.context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            point.x = displayMetrics.widthPixels;
            point.y = displayMetrics.heightPixels;
        }
        C0279i c0279i = C0279i.f4852a;
        if (f7Var == null) {
            adEventListener.onFailedToReceiveAd(null);
            return c0279i;
        }
        this.f = f7Var;
        n7 n7Var = (n7) f7Var;
        n7Var.f4091c = new l(this, adEventListener, adUnitConfig, i3, metaData, point);
        boolean z3 = this.f3124g == AdMode.REWARDED_VIDEO;
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        for (Map.Entry<String, List<String>> entry : n7Var.f4090b.getKeyValues().entrySet()) {
            builder.addCustomTargeting(entry.getKey(), entry.getValue());
        }
        AdManagerAdRequest build = builder.build();
        kotlin.jvm.internal.j.d(build, "build(...)");
        if (z3) {
            RewardedAd.load(n7Var.f4089a, n7Var.f4090b.getAdUnitId(), build, new j7(n7Var));
        } else {
            AdManagerInterstitialAd.load(n7Var.f4089a, n7Var.f4090b.getAdUnitId(), build, new k7(n7Var));
        }
        return c0279i;
    }

    public static void a(StartAppAd startAppAd, boolean z3, String uuid, String originalTS, AdPreferences adPreferences, AdUnitConfig config, int i3) {
        Context context = startAppAd.context;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OVERLAY;
        ib ibVar = startAppAd.httpClient;
        ib ibVar2 = startAppAd.networkApiExecutor;
        ib ibVar3 = startAppAd.eventTracer;
        ib ibVar4 = startAppAd.motionProcessor;
        z9 z9Var = new z9(context, adPreferences, placement, ibVar, ibVar2, ibVar3, ibVar4);
        z9Var.f4785a = startAppAd.f3124g == AdMode.REWARDED_VIDEO;
        z9Var.f4786b = z3;
        kotlin.jvm.internal.j.e(uuid, "uuid");
        z9Var.f4787c = uuid;
        kotlin.jvm.internal.j.e(originalTS, "originalTS");
        z9Var.f4789e = originalTS;
        kotlin.jvm.internal.j.e(config, "config");
        z9Var.f4788d = config;
        z9Var.f4791h = Integer.valueOf(i3);
        z9Var.f4792i = config.getSioPrice();
        new aa(context, adPreferences, placement, ibVar, ibVar2, ibVar3, ibVar4, z9Var).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c3, code lost:
    
        if (r10 == false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(String str, AdDisplayListener adDisplayListener) {
        AdRulesResult adRulesResult;
        boolean z3;
        boolean z4;
        String[] strArr;
        String[] strArr2;
        Activity resolveActivityToShowAd;
        try {
            ((pf) this.f3121c.a()).a(32768);
        } catch (Throwable unused) {
        }
        setNotDisplayedReason(null);
        this.f3127j = adDisplayListener;
        if (!canShowAd()) {
            setNotDisplayedReason(NotDisplayedReason.SERVING_ADS_DISABLED);
            y.a(this.context, this.f3127j, this);
            return false;
        }
        boolean z5 = true;
        if (this.f != null && (resolveActivityToShowAd = resolveActivityToShowAd()) != null) {
            g0.a(new D1.a(this, 5, resolveActivityToShowAd));
            return true;
        }
        if (this.f3122d == null) {
            loadAd(this.f3124g, this.f3125h, (AdEventListener) null);
        }
        if (AdsCommonMetaData.k().L() && !si.c(this.context)) {
            setNotDisplayedReason(NotDisplayedReason.APP_IN_BACKGROUND);
        } else {
            Context context = this.context;
            WeakHashMap weakHashMap = si.f4343a;
            if (((f6) com.startapp.sdk.components.a.a(context).f3372t.a()).b()) {
                if (isReady()) {
                    AdPreferences.Placement placement = getPlacement();
                    AdRulesResult a3 = AdsCommonMetaData.k().b().a(placement, str);
                    if (a3.b()) {
                        f b3 = ((p) this.adCacheManager.a()).b(this.f3122d);
                        this.f3123e = b3;
                        if (b3 != null) {
                            z3 = b3.a(str);
                            if (z3) {
                                t.f4350d.a(new s(placement, str));
                                AdPreferences adPreferences = this.f3125h;
                                if (adPreferences == null || adPreferences.equals(new AdPreferences())) {
                                    String str2 = "autoLoadNotShownAdPrefix" + this.f3124g.name();
                                    rf edit = ((sf) this.f3120b.a()).edit();
                                    edit.a(str2, 0);
                                    edit.f4299a.putInt(str2, 0);
                                    if (this.f3124g == AdMode.AUTOMATIC) {
                                        String str3 = "autoLoadNotShownAdPrefix" + AdMode.FULLPAGE.name();
                                        edit.a(str3, 0);
                                        edit.f4299a.putInt(str3, 0);
                                        String str4 = "autoLoadNotShownAdPrefix" + AdMode.OFFERWALL.name();
                                        edit.a(str4, 0);
                                        edit.f4299a.putInt(str4, 0);
                                    }
                                    edit.apply();
                                }
                            } else {
                                Object obj = this.f3123e;
                                if (obj instanceof Ad) {
                                    setNotDisplayedReason(((Ad) obj).getNotDisplayedReason());
                                }
                            }
                            adRulesResult = a3;
                            z5 = false;
                        }
                    } else {
                        setNotDisplayedReason(NotDisplayedReason.AD_RULES);
                    }
                    z3 = false;
                    adRulesResult = a3;
                    z5 = false;
                } else {
                    AdMode adMode = this.f3124g;
                    if (adMode != AdMode.REWARDED_VIDEO && adMode != AdMode.VIDEO) {
                        if (canShowAd() && AdsCommonMetaData.k().F().r() && MetaData.E().f0()) {
                            AdPreferences adPreferences2 = this.f3125h;
                            if (adPreferences2 == null) {
                                adPreferences2 = new AdPreferences();
                            }
                            adPreferences2.setType(Ad.AdType.NON_VIDEO);
                            AdPreferences.Placement placement2 = getPlacement();
                            f a4 = ((p) this.adCacheManager.a()).a(new CacheKey(placement2, adPreferences2));
                            if (a4 != null && a4.isReady() && AdsCommonMetaData.k().b().a(placement2, str).b()) {
                                a4.setVideoCancelCallBack(true);
                                z4 = a4.a(str);
                            }
                        }
                        z4 = false;
                    }
                    z5 = false;
                    if (!z5) {
                        setNotDisplayedReason(NotDisplayedReason.AD_NOT_READY);
                    }
                    adRulesResult = null;
                    z3 = false;
                }
                if (!z3 || z5) {
                    wb.a(this.context).a(this.f3128k, new IntentFilter("com.startapp.android.HideDisplayBroadcastListener"));
                    wb.a(this.context).a(this.f3128k, new IntentFilter("com.startapp.android.ShowDisplayBroadcastListener"));
                    wb.a(this.context).a(this.f3128k, new IntentFilter("com.startapp.android.ShowFailedDisplayBroadcastListener"));
                    wb.a(this.context).a(this.f3128k, new IntentFilter("com.startapp.android.OnClickCallback"));
                    wb.a(this.context).a(this.f3128k, new IntentFilter("com.startapp.android.OnVideoCompleted"));
                }
                if (!z3) {
                    NotDisplayedReason notDisplayedReason = getNotDisplayedReason();
                    if (notDisplayedReason == null) {
                        notDisplayedReason = NotDisplayedReason.INTERNAL_ERROR;
                        setNotDisplayedReason(notDisplayedReason);
                    }
                    Object a5 = ((p) this.adCacheManager.a()).a(this.f3122d);
                    if (notDisplayedReason != NotDisplayedReason.AD_RULES) {
                        if (z5) {
                            notDisplayedReason = NotDisplayedReason.AD_NOT_READY_VIDEO_FALLBACK;
                        }
                        Object obj2 = this.f3123e;
                        if (obj2 != null) {
                            a5 = obj2;
                        }
                        if (a5 instanceof m8) {
                            strArr2 = ((m8) a5).f4037i;
                        } else if (a5 instanceof db) {
                            List list = ((db) a5).f3581a;
                            ArrayList arrayList = new ArrayList();
                            if (list != null) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.addAll(Arrays.asList(((AdDetails) it.next()).t()));
                                }
                            }
                            strArr2 = (String[]) arrayList.toArray(new String[0]);
                        } else {
                            strArr2 = new String[0];
                        }
                        g0.a(strArr2, str, 0, notDisplayedReason.toString(), (JSONObject) null);
                    } else if (adRulesResult != null) {
                        if (a5 instanceof m8) {
                            strArr = ((m8) a5).f4037i;
                        } else if (a5 instanceof db) {
                            List list2 = ((db) a5).f3581a;
                            ArrayList arrayList2 = new ArrayList();
                            if (list2 != null) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.addAll(Arrays.asList(((AdDetails) it2.next()).t()));
                                }
                            }
                            strArr = (String[]) arrayList2.toArray(new String[0]);
                        } else {
                            strArr = new String[0];
                        }
                        g0.a(strArr, str, 0, adRulesResult.a());
                    }
                    this.f3123e = null;
                    if (!z5) {
                        y.a(this.context, this.f3127j, this);
                    }
                }
                return z3;
            }
            setNotDisplayedReason(NotDisplayedReason.NETWORK_PROBLEM);
        }
        adRulesResult = null;
        z5 = false;
        z3 = false;
        if (!z3) {
        }
        wb.a(this.context).a(this.f3128k, new IntentFilter("com.startapp.android.HideDisplayBroadcastListener"));
        wb.a(this.context).a(this.f3128k, new IntentFilter("com.startapp.android.ShowDisplayBroadcastListener"));
        wb.a(this.context).a(this.f3128k, new IntentFilter("com.startapp.android.ShowFailedDisplayBroadcastListener"));
        wb.a(this.context).a(this.f3128k, new IntentFilter("com.startapp.android.OnClickCallback"));
        wb.a(this.context).a(this.f3128k, new IntentFilter("com.startapp.android.OnVideoCompleted"));
        if (!z3) {
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Activity activity) {
        n7 n7Var = (n7) this.f;
        n7Var.getClass();
        kotlin.jvm.internal.j.e(activity, "activity");
        AdManagerInterstitialAd adManagerInterstitialAd = n7Var.f4092d;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(new l7(n7Var));
        }
        AdManagerInterstitialAd adManagerInterstitialAd2 = n7Var.f4092d;
        if (adManagerInterstitialAd2 != null) {
            adManagerInterstitialAd2.show(activity);
        } else {
            n7Var.a(activity);
        }
    }
}
