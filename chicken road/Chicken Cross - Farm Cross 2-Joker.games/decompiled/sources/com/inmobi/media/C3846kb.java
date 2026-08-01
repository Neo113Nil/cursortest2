package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.ironsource.C4769zd;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.kb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3846kb extends Qm {
    public static final /* synthetic */ int j = 0;
    public C3791ib h;
    public boolean i;

    @Override // com.inmobi.media.Qm, com.inmobi.media.AbstractC3781i1
    public final void a() {
        this.d.post(new Runnable() { // from class: com.inmobi.media.kb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C3846kb.a(C3846kb.this);
            }
        });
        Z9 z9 = this.f;
        if (z9 != null) {
            z9.d("InterstitialUnifiedAdManager", "AdManager state - CREATED");
        }
        this.f6810a = (byte) 0;
        this.b = null;
        C3791ib c3791ib = this.h;
        if (c3791ib != null) {
            c3791ib.d();
        }
        Z9 z92 = this.f;
        if (z92 != null) {
            z92.a();
        }
    }

    public final void b(PublisherCallbacks callbacks) {
        C3791ib c3791ib;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        if (this.c == null) {
            this.c = callbacks;
        }
        if (Intrinsics.areEqual(this.b, Boolean.FALSE)) {
            C3791ib c3791ib2 = this.h;
            if (c3791ib2 != null) {
                c3791ib2.b((short) 2006);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            Z9 z9 = this.f;
            if (z9 != null) {
                z9.b("InMobi", "Cannot call load() API after calling load(byte[])");
            }
            Kc.a((byte) 1, "InMobi", "Cannot call load() API after calling load(byte[])");
            return;
        }
        if (this.i) {
            C3791ib c3791ib3 = this.h;
            if (c3791ib3 != null) {
                c3791ib3.b((short) 2004);
            }
            callbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            Z9 z92 = this.f;
            if (z92 != null) {
                z92.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            Kc.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            return;
        }
        this.b = Boolean.TRUE;
        C3791ib c3791ib4 = this.h;
        if (c3791ib4 == null || !a("InMobi", String.valueOf(c3791ib4.l), callbacks) || (c3791ib = this.h) == null) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.c;
        if (c3791ib.d((publisherCallbacks == null || publisherCallbacks.getType() != 1) ? (byte) 1 : (byte) 2)) {
            this.f6810a = (byte) 1;
            Z9 z93 = this.f;
            if (z93 != null) {
                C3791ib c3791ib5 = this.h;
                z93.c("InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c3791ib5 != null ? c3791ib5.l : null));
            }
            C3791ib c3791ib6 = this.h;
            Kc.a((byte) 2, "InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c3791ib6 != null ? c3791ib6.l : null));
            C3791ib c3791ib7 = this.h;
            if (c3791ib7 != null) {
                c3791ib7.e(this);
            }
            C3791ib c3791ib8 = this.h;
            if (c3791ib8 != null) {
                c3791ib8.D();
            }
        }
    }

    @Override // com.inmobi.media.Qm, com.inmobi.media.AbstractC3781i1
    public final void c(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        Z9 z9 = this.f;
        if (z9 != null) {
            z9.c("InterstitialUnifiedAdManager", "onAdLoadSucceeded");
        }
        if (this.h != null) {
            d(info);
            return;
        }
        Z9 z92 = this.f;
        if (z92 != null) {
            z92.b("InterstitialUnifiedAdManager", "adUnit is null");
        }
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        byte b = this.f6810a;
        if (b == 8 || b == 1) {
            b((AbstractC3923n1) null, inMobiAdRequestStatus);
            return;
        }
        if (b == 2) {
            Kc.a((byte) 1, "InMobi", "Unable to Show Ad, canShowAd Failed");
            Z9 z93 = this.f;
            if (z93 != null) {
                z93.b("InMobi", "Unable to Show Ad, canShowAd Failed");
            }
            a(true, (short) 0);
            return;
        }
        if (b != 5) {
            Kc.a((byte) 1, "InMobi", "Invalid state passed in fireErrorScenarioCallback");
            Z9 z94 = this.f;
            if (z94 != null) {
                z94.b("InMobi", "Invalid state passed in fireErrorScenarioCallback");
                return;
            }
            return;
        }
        Kc.a((byte) 1, "InMobi", "Ad will be dismissed, Internal error");
        Z9 z95 = this.f;
        if (z95 != null) {
            z95.b("InMobi", "Ad will be dismissed, Internal error");
        }
        C3791ib c3791ib = this.h;
        if (c3791ib != null) {
            c3791ib.b((byte) 4);
        }
        a();
    }

    public final void d(final AdMetaInfo adMetaInfo) {
        Z9 z9 = this.f;
        if (z9 != null) {
            z9.c("InterstitialUnifiedAdManager", C4769zd.f);
        }
        super.c(adMetaInfo);
        Z9 z92 = this.f;
        if (z92 != null) {
            z92.d("InterstitialUnifiedAdManager", "AdManager state - LOADED");
        }
        this.f6810a = (byte) 2;
        this.d.post(new Runnable() { // from class: com.inmobi.media.kb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C3846kb.b(C3846kb.this, adMetaInfo);
            }
        });
    }

    @Override // com.inmobi.media.Qm
    public final AbstractC3923n1 f() {
        return this.h;
    }

    public final boolean h() {
        byte b = this.f6810a;
        if (b == 1) {
            Z9 z9 = this.f;
            if (z9 != null) {
                z9.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            Kc.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(false, (short) 2147);
            return false;
        }
        if (b == 7) {
            Kc.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            Z9 z92 = this.f;
            if (z92 != null) {
                z92.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            a(false, (short) 2168);
            return false;
        }
        if (b == 5) {
            C3791ib c3791ib = this.h;
            if (c3791ib != null) {
                Kc.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + c3791ib.l);
                Z9 z93 = this.f;
                if (z93 != null) {
                    C3791ib c3791ib2 = this.h;
                    z93.b("InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + (c3791ib2 != null ? c3791ib2.l : null));
                }
                a(false, (short) 2148);
            }
            return false;
        }
        if (!this.i) {
            return true;
        }
        C3791ib c3791ib3 = this.h;
        if (c3791ib3 != null) {
            c3791ib3.d((short) 2149);
        }
        Kc.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
        Z9 z94 = this.f;
        if (z94 != null) {
            z94.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
        }
        return false;
    }

    public final void i() {
        C3791ib c3791ib;
        Z9 z9 = this.f;
        if (z9 != null) {
            z9.a("InterstitialUnifiedAdManager", "render");
        }
        C3791ib c3791ib2 = this.h;
        if (c3791ib2 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (c3791ib2.b == 4 && this.e != null) {
            Z9 z92 = this.f;
            if (z92 != null) {
                z92.c("InterstitialUnifiedAdManager", "already in ready state");
            }
            AdMetaInfo adMetaInfo = this.e;
            Intrinsics.checkNotNull(adMetaInfo);
            d(adMetaInfo);
            return;
        }
        if (this.i) {
            Z9 z93 = this.f;
            if (z93 != null) {
                z93.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            Kc.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            b(this.h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3791ib c3791ib3 = this.h;
            if (c3791ib3 != null) {
                c3791ib3.c((short) 2128);
                return;
            }
            return;
        }
        C3791ib c3791ib4 = this.h;
        com.inmobi.media.ads.network.common.model.Ad b = c3791ib4 != null ? c3791ib4.b(0) : null;
        C3791ib c3791ib5 = this.h;
        boolean a2 = a("InMobi", String.valueOf(c3791ib5 != null ? c3791ib5.l : null));
        if (b == null) {
            Z9 z94 = this.f;
            if (z94 != null) {
                z94.b("InterstitialUnifiedAdManager", "ad is null. failure");
            }
            b(this.h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3791ib c3791ib6 = this.h;
            if (c3791ib6 != null) {
                c3791ib6.b((short) 2166);
            }
        }
        if (this.e == null) {
            Z9 z95 = this.f;
            if (z95 != null) {
                z95.b("InterstitialUnifiedAdManager", "ad meta info is null. failure");
            }
            b(this.h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3791ib c3791ib7 = this.h;
            if (c3791ib7 != null) {
                c3791ib7.b((short) 2167);
            }
        }
        if (b == null || !a2) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.c;
        if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c3791ib = this.h) != null) {
            c3791ib.d((byte) 1);
        }
        Z9 z96 = this.f;
        if (z96 != null) {
            z96.d("InterstitialUnifiedAdManager", "AdManager state - LOADING_INTO_VIEW");
        }
        this.f6810a = (byte) 8;
        C3791ib c3791ib8 = this.h;
        if (c3791ib8 != null) {
            c3791ib8.Z();
        }
    }

    @Override // com.inmobi.media.AbstractC3781i1
    public final void d() {
        Z9 z9 = this.f;
        if (z9 != null) {
            z9.a("InterstitialUnifiedAdManager", "showTimeOut");
        }
        C3791ib c3791ib = this.h;
        if (c3791ib != null) {
            if (c3791ib.b != 6 && c3791ib.b != 7) {
                a(true, (short) 2159);
            } else {
                c3791ib.f(this);
            }
        }
    }

    public static final void a(C3846kb c3846kb) {
        Z9 z9 = c3846kb.f;
        if (z9 != null) {
            z9.a("InterstitialUnifiedAdManager", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = c3846kb.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
        }
    }

    public static final void a(C3846kb c3846kb, AdMetaInfo adMetaInfo) {
        Z9 z9 = c3846kb.f;
        if (z9 != null) {
            z9.a("InterstitialUnifiedAdManager", "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacks = c3846kb.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public final void a(boolean z, short s) {
        C3791ib c3791ib;
        Z9 z9 = this.f;
        if (z9 != null) {
            z9.c("InterstitialUnifiedAdManager", "onShowFailure");
        }
        if (s != 0 && (c3791ib = this.h) != null) {
            c3791ib.d(s);
        }
        this.d.post(new Runnable() { // from class: com.inmobi.media.kb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C3846kb.c(C3846kb.this);
            }
        });
        if (z) {
            Z9 z92 = this.f;
            if (z92 != null) {
                z92.d("InterstitialUnifiedAdManager", "AdManager state - FAILED");
            }
            this.f6810a = (byte) 6;
            C3791ib c3791ib2 = this.h;
            if (c3791ib2 != null) {
                c3791ib2.d();
            }
        }
        Z9 z93 = this.f;
        if (z93 != null) {
            z93.a();
        }
    }

    public static final void c(C3846kb c3846kb) {
        Z9 z9 = c3846kb.f;
        if (z9 != null) {
            z9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c3846kb.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        Z9 z92 = c3846kb.f;
        if (z92 != null) {
            z92.a();
        }
        C3791ib c3791ib = c3846kb.h;
        if (c3791ib != null) {
            c3791ib.b((byte) 4);
        }
    }

    public final void a(Activity activity) {
        C3633cm c3633cm;
        Z9 z9 = this.f;
        if (z9 != null) {
            z9.a("InterstitialUnifiedAdManager", "show");
        }
        C3791ib c3791ib = this.h;
        if (c3791ib != null && (c3633cm = c3791ib.I) != null) {
            c3633cm.b = true;
        }
        if (c3791ib != null) {
            c3791ib.S();
        }
        if (h()) {
            if (!AbstractC4263z7.a()) {
                if (this.h != null) {
                    a(true, (short) 2141);
                    return;
                }
                return;
            }
            C3791ib c3791ib2 = this.h;
            if (c3791ib2 == null || !c3791ib2.d((byte) 4)) {
                return;
            }
            this.i = true;
            C3791ib c3791ib3 = this.h;
            if (c3791ib3 != null) {
                c3791ib3.a(this, activity);
            }
        }
    }

    public final void a(C3600bi pubSettings, Context context, boolean z, String logType) {
        C3791ib c3791ib;
        Ej j2;
        C3791ib c3791ib2;
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logType, "logType");
        if (this.h == null) {
            C4147v0 c4147v0 = new C4147v0("int");
            c4147v0.b = pubSettings.f7031a;
            c4147v0.d = pubSettings.c;
            c4147v0.c = pubSettings.d;
            c4147v0.e = pubSettings.h;
            c4147v0.k = pubSettings.f;
            this.h = new C3791ib(context, c4147v0.a(), this);
        }
        if (z) {
            g();
        }
        String str = pubSettings.h;
        if (str != null) {
            Z9 z9 = this.f;
            if (z9 != null) {
                z9.a();
            }
            Z9 a2 = AbstractC3771hj.a(logType, str);
            this.f = a2;
            if (a2 != null) {
                a2.a("InterstitialUnifiedAdManager", "Ad Unit initialised");
            }
            Z9 logger = this.f;
            if (logger != null && (c3791ib2 = this.h) != null) {
                Intrinsics.checkNotNullParameter(logger, "logger");
                c3791ib2.i = logger;
                C3611c0 c3611c0 = c3791ib2.u;
                c3611c0.getClass();
                Intrinsics.checkNotNullParameter(logger, "logger");
                c3611c0.f = logger;
            }
            Z9 z92 = this.f;
            if (z92 != null) {
                z92.a("InterstitialUnifiedAdManager", "adding interstitialAdUnit in referenceTracker");
            }
            C3791ib c3791ib3 = this.h;
            Intrinsics.checkNotNull(c3791ib3);
            AbstractC3771hj.a(c3791ib3, this.f);
        }
        C3791ib c3791ib4 = this.h;
        if (c3791ib4 != null) {
            c3791ib4.a(context);
        }
        C3791ib c3791ib5 = this.h;
        if (c3791ib5 != null) {
            c3791ib5.a(pubSettings.d);
        }
        C3791ib c3791ib6 = this.h;
        if (c3791ib6 != null) {
            c3791ib6.M();
        }
        if (pubSettings.e && (c3791ib = this.h) != null && (j2 = c3791ib.j()) != null) {
            c3791ib.H = true;
            j2.m();
        }
        WatermarkData watermarkData = this.g;
        if (watermarkData != null) {
            C3791ib c3791ib7 = this.h;
            if (c3791ib7 != null) {
                Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
                c3791ib7.A = watermarkData;
                Ej r = c3791ib7.r();
                if (r != null) {
                    r.setWatermark(watermarkData);
                }
            }
            Z9 z93 = this.f;
            if (z93 != null) {
                z93.c("InterstitialUnifiedAdManager", "setting up watermark");
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3781i1
    public final void b() {
        this.d.post(new Runnable() { // from class: com.inmobi.media.kb$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C3846kb.b(C3846kb.this);
            }
        });
        Z9 z9 = this.f;
        if (z9 != null) {
            z9.d("InterstitialUnifiedAdManager", "AdManager state - DISPLAY_FAILED");
        }
        this.f6810a = (byte) 6;
        C3791ib c3791ib = this.h;
        if (c3791ib != null) {
            c3791ib.d();
        }
        Z9 z92 = this.f;
        if (z92 != null) {
            z92.a();
        }
    }

    @Override // com.inmobi.media.Qm, com.inmobi.media.AbstractC3781i1
    public final void b(final AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        Z9 z9 = this.f;
        if (z9 != null) {
            z9.c("InterstitialUnifiedAdManager", "onAdFetchSuccess");
        }
        this.e = info;
        if (this.h == null) {
            Z9 z92 = this.f;
            if (z92 != null) {
                z92.b("InterstitialUnifiedAdManager", "onAdFetchSuccess - adUnit is null - fail");
            }
            a((AbstractC3923n1) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            a((short) 2190);
            return;
        }
        super.b(info);
        this.d.post(new Runnable() { // from class: com.inmobi.media.kb$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C3846kb.a(C3846kb.this, info);
            }
        });
    }

    public static final void b(C3846kb c3846kb) {
        Z9 z9 = c3846kb.f;
        if (z9 != null) {
            z9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c3846kb.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C3791ib c3791ib = c3846kb.h;
        if (c3791ib != null) {
            c3791ib.b((byte) 4);
        }
    }

    public static final void b(C3846kb c3846kb, AdMetaInfo adMetaInfo) {
        Z9 z9 = c3846kb.f;
        if (z9 != null) {
            z9.a("InterstitialUnifiedAdManager", "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacks = c3846kb.c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.Qm, com.inmobi.media.AbstractC3781i1
    public final void a(AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.a(info);
        C3791ib c3791ib = this.h;
        if (c3791ib != null) {
            c3791ib.T();
        }
        this.i = false;
    }

    @Override // com.inmobi.media.Qm
    public final void a(WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        super.a(watermarkData);
        C3791ib c3791ib = this.h;
        if (c3791ib != null) {
            Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
            c3791ib.A = watermarkData;
            Ej r = c3791ib.r();
            if (r != null) {
                r.setWatermark(watermarkData);
            }
        }
    }
}
