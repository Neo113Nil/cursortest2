package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.i6;
import com.applovin.impl.m2;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class m2 {
    protected final com.applovin.impl.sdk.l b;
    protected final AppLovinAdServiceImpl c;
    private AppLovinAd d;
    private String e;
    private SoftReference f;
    private volatile String h;
    private volatile double j;

    /* renamed from: a, reason: collision with root package name */
    public final Map f4286a = Collections.synchronizedMap(new HashMap());
    private final Object g = new Object();
    private volatile boolean i = false;

    class a implements AppLovinAdRewardListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            m2.this.b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                m2.this.b.Q().b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            m2.this.b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                m2.this.b.Q().b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            m2.this.b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                m2.this.b.Q().a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            m2.this.b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                m2.this.b.Q().b("IncentivizedAdController", "Reward validation failed: " + i);
            }
        }
    }

    private class c implements p2, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final AppLovinAd f4289a;
        private final AppLovinAdDisplayListener b;
        private final AppLovinAdClickListener c;
        private final AppLovinAdVideoPlaybackListener d;
        private final AppLovinAdRewardListener e;

        /* synthetic */ c(m2 m2Var, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }

        private void a(com.applovin.impl.sdk.ad.b bVar, String str) {
            int i;
            m2.this.b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                m2.this.b.Q().a("IncentivizedAdController", "Finishing direct ad...");
            }
            String b = m2.this.b();
            if (!StringUtils.isValidString(b) || !m2.this.i) {
                m2.this.b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    m2.this.b.Q().b("IncentivizedAdController", "Invalid reward state - result: " + b + " and wasFullyEngaged: " + m2.this.i);
                }
                m2.this.b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    m2.this.b.Q().a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                bVar.d();
                if (m2.this.i) {
                    m2.this.b.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        m2.this.b.Q().b("IncentivizedAdController", "User closed the ad after fully watching but reward validation task did not return on time");
                    }
                    str = "network_timeout";
                    i = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    if (str == null) {
                        str = "unknown_early_dismissal_source";
                    }
                    m2.this.b.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        m2.this.b.Q().b("IncentivizedAdController", "Ad closed prematurely from source: " + str);
                    }
                    i = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                bVar.a(t4.a(str));
                m2.this.b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    m2.this.b.Q().a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                x2.a(this.e, bVar, i);
                HashMap<String, String> hashMap = CollectionUtils.hashMap("details", String.valueOf(m2.this.j));
                CollectionUtils.putStringIfValid("source", str, hashMap);
                m2.this.b.g().a(h2.M, bVar, hashMap);
            }
            if (bVar.A0().getAndSet(true)) {
                return;
            }
            m2.this.b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                m2.this.b.Q().a("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            m2.this.b.s0().a((n5) new s6(bVar, m2.this.b), i6.b.OTHER);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            x2.a(this.c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            x2.a(this.b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            AppLovinAd f = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            if (f instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) f;
                a(bVar, a(bVar, false));
            } else {
                String str = f == null ? "null/expired ad" : "invalid ad of type: " + f;
                m2.this.b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    m2.this.b.Q().b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            m2.this.a(f);
            m2.this.b.Q();
            if (com.applovin.impl.sdk.p.a()) {
                m2.this.b.Q().a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            x2.b(this.b, appLovinAd);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.applovin.sdk.AppLovinAd] */
        /* JADX WARN: Type inference failed for: r0v5, types: [com.applovin.sdk.AppLovinAd] */
        @Override // com.applovin.impl.p2
        public void onAdDisplayFailed(String str) {
            ?? r0 = this.f4289a;
            boolean z = r0 instanceof com.applovin.impl.sdk.ad.c;
            com.applovin.impl.sdk.ad.b bVar = r0;
            if (z) {
                bVar = ((com.applovin.impl.sdk.ad.c) r0).f();
            }
            boolean z2 = this.b instanceof p2;
            if (bVar instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar2 = bVar;
                a(bVar2, a(bVar2, StringUtils.isValidString(str)));
            } else {
                String str2 = bVar == null ? "null/expired ad" : "invalid ad of type: " + bVar;
                m2.this.b.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    m2.this.b.Q().b("IncentivizedAdController", "Received `" + (z2 ? "adDisplayFailed" : "adHidden") + "` callback for " + str2);
                }
            }
            m2.this.a(bVar);
            if (z2) {
                x2.a(this.b, str);
            } else {
                x2.b(this.b, this.f4289a);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            m2.this.a("quota_exceeded");
            x2.b(this.e, appLovinAd, map);
            m2.this.b.g().a(h2.L, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "quota_exceeded"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            m2.this.a("rejected");
            x2.a(this.e, appLovinAd, map);
            m2.this.b.g().a(h2.L, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "rejected"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            m2.this.a("accepted");
            x2.c(this.e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            m2.this.a("network_timeout");
            x2.a(this.e, appLovinAd, i);
            HashMap<String, String> hashMap = CollectionUtils.hashMap("error_message", "network_timeout");
            hashMap.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, String.valueOf(i));
            m2.this.b.g().a(h2.L, (com.applovin.impl.sdk.ad.b) appLovinAd, hashMap);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            x2.a(this.d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            AppLovinAd f = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            boolean z2 = true;
            boolean z3 = (f instanceof com.applovin.impl.sdk.ad.b) && ((com.applovin.impl.sdk.ad.b) f).I0();
            m2 m2Var = m2.this;
            if (z3) {
                d = 100.0d;
            }
            m2Var.j = d;
            m2 m2Var2 = m2.this;
            if (!z && !z3) {
                z2 = false;
            }
            m2Var2.i = z2;
            x2.a(this.d, appLovinAd, m2.this.j, m2.this.i);
        }

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f4289a = appLovinAd;
            this.b = appLovinAdDisplayListener;
            this.c = appLovinAdClickListener;
            this.d = appLovinAdVideoPlaybackListener;
            this.e = appLovinAdRewardListener;
        }

        private String a(com.applovin.impl.sdk.ad.b bVar, boolean z) {
            if (StringUtils.isValidString(bVar.w())) {
                return bVar.w();
            }
            if (z) {
                return "ad_display_failure";
            }
            return null;
        }
    }

    public m2(String str, AppLovinSdk appLovinSdk) {
        this.b = appLovinSdk.a();
        this.c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.e = str;
    }

    private void e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f;
        if (softReference == null || (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    public boolean d() {
        return this.d != null;
    }

    public String c() {
        return this.e;
    }

    public void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.b.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.b.Q().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f = new SoftReference(appLovinAdLoadListener);
        if (d()) {
            com.applovin.impl.sdk.p.h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.d);
                return;
            }
            return;
        }
        a(new b(appLovinAdLoadListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    class b implements AppLovinAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        private final AppLovinAdLoadListener f4288a;

        b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f4288a = appLovinAdLoadListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AppLovinAd appLovinAd) {
            try {
                this.f4288a.adReceived(appLovinAd);
            } catch (Throwable th) {
                com.applovin.impl.sdk.p.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                m2.this.b.E().a("IncentivizedAdController", "adLoaded", th);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            m2.this.d = appLovinAd;
            if (this.f4288a != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.m2$b$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        m2.b.this.a(appLovinAd);
                    }
                });
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(final int i) {
            if (this.f4288a != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.m2$b$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        m2.b.this.a(i);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i) {
            try {
                this.f4288a.failedToReceiveAd(i);
            } catch (Throwable th) {
                com.applovin.impl.sdk.p.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                m2.this.b.E().a("IncentivizedAdController", "adLoadFailed", th);
            }
        }
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.c.loadNextIncentivizedAd(this.e, appLovinAdLoadListener);
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.p.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    public void b(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private void a(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.d;
        }
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.p.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    public void b(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        a(appLovinAd, viewGroup, lifecycle, context, appLovinAdRewardListener == null ? a() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        String str;
        synchronized (this.g) {
            str = this.h;
        }
        return str;
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.b.s0().a((n5) new z6(bVar, appLovinAdRewardListener, this.b), i6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.g) {
            this.h = str;
        }
    }

    public void a(String str, Object obj) {
        this.f4286a.put(str, obj);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map a2 = j2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAd", a2);
        this.b.g().d(h2.F, a2);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd a3 = t7.a(appLovinAdImpl, this.b);
        String a4 = a(a3, appLovinAdImpl);
        if (StringUtils.isValidString(a4)) {
            a(appLovinAdImpl, a4, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.b.A0(), context);
        for (String str : this.f4286a.keySet()) {
            create.setExtraInfo(str, this.f4286a.get(str));
        }
        create.setAdDisplayListener(cVar);
        create.setAdVideoPlaybackListener(cVar);
        create.setAdClickListener(cVar);
        create.showAndRender(a3);
        a((com.applovin.impl.sdk.ad.b) a3, cVar);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map a2 = j2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAdView", a2);
        this.b.g().d(h2.F, a2);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd a3 = t7.a(appLovinAdImpl, this.b);
        String a4 = a(a3, appLovinAdImpl);
        if (StringUtils.isValidString(a4)) {
            a(appLovinAdImpl, a4, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.b.A0(), context);
        for (String str : this.f4286a.keySet()) {
            create.setExtraInfo(str, this.f4286a.get(str));
        }
        create.setAdDisplayListener(cVar);
        create.setAdVideoPlaybackListener(cVar);
        create.setAdClickListener(cVar);
        create.showAndRender(a3, viewGroup, lifecycle);
        a((com.applovin.impl.sdk.ad.b) a3, cVar);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            com.applovin.impl.sdk.p.h("IncentivizedAdController", "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.: " + appLovinAd2);
            return "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.";
        }
        if (appLovinAd2.getType() == AppLovinAdType.INCENTIVIZED) {
            return null;
        }
        com.applovin.impl.sdk.p.h("IncentivizedAdController", "Attempting to display ad with invalid ad type: " + appLovinAd2.getType());
        return "Attempting to display ad with invalid ad type";
    }

    private void a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, p2 p2Var) {
        x2.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        x2.a(p2Var, str);
        Map a2 = j2.a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid("source", "rewardedAdShowFailed", a2);
        CollectionUtils.putStringIfValid("error_message", str, a2);
        this.b.g().d(h2.I, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.d;
        if (appLovinAd2 == null) {
            return;
        }
        if (!(appLovinAd2 instanceof com.applovin.impl.sdk.ad.c)) {
            if (appLovinAd == appLovinAd2) {
                this.d = null;
            }
        } else {
            com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd2;
            if (cVar.f() == null || appLovinAd == cVar.f()) {
                this.d = null;
            }
        }
    }

    private AppLovinAdRewardListener a() {
        return new a();
    }
}
