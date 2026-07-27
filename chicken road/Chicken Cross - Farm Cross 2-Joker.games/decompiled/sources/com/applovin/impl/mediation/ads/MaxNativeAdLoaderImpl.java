package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.c3;
import com.applovin.impl.h3;
import com.applovin.impl.i;
import com.applovin.impl.i6;
import com.applovin.impl.j;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n5;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.t7;
import com.applovin.impl.u1;
import com.applovin.impl.v3;
import com.applovin.impl.x2;
import com.applovin.impl.x6;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class MaxNativeAdLoaderImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0082a, j.b {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";

    /* renamed from: a, reason: collision with root package name */
    private final c f4318a;
    private String b;
    private String c;
    private i d;
    private final Object e;
    private MaxNativeAdListener f;
    private final Map g;
    private final Set h;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f4319a;
        final /* synthetic */ List b;
        final /* synthetic */ ViewGroup c;

        a(MaxNativeAd maxNativeAd, List list, ViewGroup viewGroup) {
            this.f4319a = maxNativeAd;
            this.b = list;
            this.c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4319a.prepareForInteraction(this.b, this.c)) {
                return;
            }
            p.h(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAdView f4320a;
        final /* synthetic */ h3 b;
        final /* synthetic */ MaxNativeAd c;

        b(MaxNativeAdView maxNativeAdView, h3 h3Var, MaxNativeAd maxNativeAd) {
            this.f4320a = maxNativeAdView;
            this.b = h3Var;
            this.c = maxNativeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Rendering native ad view: " + this.f4320a);
            }
            MaxNativeAdLoaderImpl.this.sdk.z().d(this.b);
            this.f4320a.render(this.b, MaxNativeAdLoaderImpl.this.f4318a, MaxNativeAdLoaderImpl.this.sdk);
            this.c.setNativeAdView(this.f4320a);
            if (this.c.prepareForInteraction(this.f4320a.getClickableViews(), this.f4320a)) {
                return;
            }
            this.c.prepareViewForInteraction(this.f4320a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c implements a.InterfaceC0077a {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Native ad loaded");
            }
            h3 h3Var = (h3) maxAd;
            h3Var.g(MaxNativeAdLoaderImpl.this.b);
            h3Var.f(MaxNativeAdLoaderImpl.this.c);
            synchronized (MaxNativeAdLoaderImpl.this.e) {
                MaxNativeAdLoaderImpl.this.h.add(h3Var);
            }
            MaxNativeAdView a2 = MaxNativeAdLoaderImpl.this.a(h3Var.N());
            if (a2 != null) {
                a(a2);
                MaxNativeAdLoaderImpl.this.a(a2, h3Var, h3Var.getNativeAd());
                p pVar2 = MaxNativeAdLoaderImpl.this.logger;
                if (p.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl2.logger.a(maxNativeAdLoaderImpl2.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + a2 + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f);
                }
                x2.a(MaxNativeAdLoaderImpl.this.f, a2, maxAd, true);
                MaxNativeAdLoaderImpl.this.a(h3Var);
                MaxNativeAdLoaderImpl.this.a(a2);
                return;
            }
            p pVar3 = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl3.logger.a(maxNativeAdLoaderImpl3.tag, "No native ad view to render. Returning the native ad to be rendered later.");
            }
            p pVar4 = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl4.logger.a(maxNativeAdLoaderImpl4.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f);
            }
            x2.a(MaxNativeAdLoaderImpl.this.f, (MaxNativeAdView) null, maxAd, true);
            MaxNativeAdLoaderImpl.this.a(h3Var);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f);
            }
            x2.a(MaxNativeAdLoaderImpl.this.f, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.this.a(((MaxErrorImpl) maxError).getLoadTag());
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.this.f);
            }
            x2.a(MaxNativeAdLoaderImpl.this.f, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MaxNativeAdLoaderImpl.c.this.a(maxAd);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.revenueListener);
            }
            x2.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }

        /* synthetic */ c(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, a aVar) {
            this();
        }

        private void a(MaxNativeAdView maxNativeAdView) {
            h3 b;
            com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (b = adViewTracker.b()) == null) {
                return;
            }
            p pVar = MaxNativeAdLoaderImpl.this.logger;
            if (p.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            }
            MaxNativeAdLoaderImpl.this.destroy(b);
        }
    }

    public MaxNativeAdLoaderImpl(String str, l lVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", lVar);
        this.f4318a = new c(this, null);
        this.d = i.PUBLISHER_INITIATED;
        this.e = new Object();
        this.g = new HashMap();
        this.h = new HashSet();
        lVar.k().a(this);
        if (p.a()) {
            this.logger.a(this.tag, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        this.f = null;
        this.sdk.k().b(this);
        synchronized (this.e) {
            this.g.clear();
            this.h.clear();
        }
        super.destroy();
    }

    public String getPlacement() {
        return this.b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((h3) maxAd).getNativeAd();
        if (nativeAd == null) {
            if (p.a()) {
                this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        com.applovin.impl.mediation.ads.b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker != null) {
            adViewTracker.c();
        } else if (p.a()) {
            this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
        }
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        if (p.a()) {
            this.logger.a(this.tag, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.f4318a + "...");
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a(lowerCase, maxNativeAdView);
        this.sdk.Z().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.d, this.localExtraParameters, this.extraParameters, l.p(), this.f4318a);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0082a
    public void onAdExpired(u1 u1Var) {
        if (p.a()) {
            this.logger.a(this.tag, "Ad expired for ad unit id " + getAdUnitId());
        }
        if (p.a()) {
            this.logger.a(this.tag, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + u1Var + "), listener=" + this.f);
        }
        x2.b(this.f, (MaxAd) u1Var, true);
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        h3 h3Var;
        Iterator it = this.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                h3Var = null;
                break;
            } else {
                h3Var = (h3) it.next();
                if (h3Var.T().equalsIgnoreCase(str)) {
                    break;
                }
            }
        }
        if (h3Var != null) {
            h3Var.h(str2);
            x2.b(this.adReviewListener, str2, h3Var);
            synchronized (this.e) {
                this.h.remove(h3Var);
            }
        }
    }

    public void registerClickableViews(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        h3 h3Var = (h3) maxAd;
        MaxNativeAd nativeAd = h3Var.getNativeAd();
        if (nativeAd == null) {
            if (p.a()) {
                this.logger.b(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        h3Var.a(viewGroup);
        this.sdk.z().d(h3Var);
        a((c3) h3Var);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new com.applovin.impl.mediation.ads.b(h3Var, viewGroup, this.f4318a, this.sdk));
        a aVar = new a(nativeAd, list, viewGroup);
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(aVar);
        } else {
            this.sdk.s0().a((n5) new x6(this.sdk, "renderMaxNativeAd", aVar), i6.b.MEDIATION);
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof h3)) {
            p.h(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        }
        if (maxNativeAdView == null) {
            p.h(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        }
        h3 h3Var = (h3) maxAd;
        MaxNativeAd nativeAd = h3Var.getNativeAd();
        if (nativeAd == null) {
            if (p.a()) {
                this.logger.b(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
            }
            return false;
        }
        if (nativeAd.isExpired() && !((Boolean) this.sdk.a(v3.f8)).booleanValue()) {
            p.h(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            return false;
        }
        a(maxNativeAdView, h3Var, nativeAd);
        a(maxNativeAdView);
        return true;
    }

    public void setCustomData(String str) {
        t7.b(str, this.tag);
        this.c = str;
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof i)) {
            this.d = (i) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (p.a()) {
            this.logger.a(this.tag, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.b = str;
    }

    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f + ", revenueListener=" + this.revenueListener + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(h3 h3Var) {
        if (h3Var.x0().get()) {
            return;
        }
        this.sdk.f().a(h3Var, this);
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.e) {
            this.g.put(str, maxNativeAdView);
        }
    }

    public void destroy(MaxAd maxAd) {
        com.applovin.impl.mediation.ads.b adViewTracker;
        if (maxAd instanceof h3) {
            h3 h3Var = (h3) maxAd;
            if (h3Var.A0()) {
                if (p.a()) {
                    this.logger.a(this.tag, "Native ad (" + h3Var + ") has already been destroyed");
                    return;
                }
                return;
            }
            synchronized (this.e) {
                this.h.remove(h3Var);
            }
            MaxNativeAdView v0 = h3Var.v0();
            if (v0 != null && (adViewTracker = v0.getAdViewTracker()) != null && maxAd.equals(adViewTracker.b())) {
                v0.recycle();
            }
            MaxNativeAd nativeAd = h3Var.getNativeAd();
            if (nativeAd != null && nativeAd.getAdViewTracker() != null) {
                nativeAd.getAdViewTracker().a();
            }
            this.sdk.f().a(h3Var);
            this.sdk.Z().destroyAd(h3Var);
            if (this.sdk.T() != null) {
                this.sdk.T().c(this.adUnitId, h3Var.N());
                return;
            } else {
                this.sdk.S().c(this.adUnitId, h3Var.N());
                return;
            }
        }
        if (p.a()) {
            this.logger.a(this.tag, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MaxNativeAdView a(String str) {
        MaxNativeAdView maxNativeAdView;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.e) {
            maxNativeAdView = (MaxNativeAdView) this.g.remove(str);
        }
        return maxNativeAdView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView, h3 h3Var, MaxNativeAd maxNativeAd) {
        h3Var.a(maxNativeAdView);
        a((c3) h3Var);
        b bVar = new b(maxNativeAdView, h3Var, maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            this.sdk.s0().a((n5) new x6(this.sdk, "renderMaxNativeAd", bVar), i6.b.MEDIATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView) {
        com.applovin.impl.mediation.ads.b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker == null || !maxNativeAdView.isAttachedToWindow()) {
            return;
        }
        adViewTracker.c();
    }
}
