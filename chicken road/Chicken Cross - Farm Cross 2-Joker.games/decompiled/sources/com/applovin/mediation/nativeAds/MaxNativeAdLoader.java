package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.l;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.List;

/* loaded from: classes.dex */
public class MaxNativeAdLoader {

    /* renamed from: a, reason: collision with root package name */
    private final MaxNativeAdLoaderImpl f4588a;

    public MaxNativeAdLoader(String str) {
        this(str, l.p());
    }

    public void a(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        this.f4588a.logApiCall("a()");
        this.f4588a.registerClickableViews(list, viewGroup, maxAd);
    }

    public void b(MaxAd maxAd) {
        this.f4588a.logApiCall("b()");
        this.f4588a.handleNativeAdViewRendered(maxAd);
    }

    public void destroy() {
        this.f4588a.logApiCall("destroy()");
        this.f4588a.destroy();
    }

    public String getAdUnitId() {
        return this.f4588a.getAdUnitId();
    }

    public String getPlacement() {
        this.f4588a.logApiCall("getPlacement()");
        return this.f4588a.getPlacement();
    }

    public void loadAd() {
        loadAd(null);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        this.f4588a.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f4588a.render(maxNativeAdView, maxAd);
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f4588a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f4588a.setAdReviewListener(maxAdReviewListener);
    }

    public void setCustomData(String str) {
        this.f4588a.logApiCall("setCustomData(value=" + str + ")");
        this.f4588a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f4588a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f4588a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f4588a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f4588a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        this.f4588a.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f4588a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        this.f4588a.logApiCall("setPlacement(placement=" + str + ")");
        this.f4588a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f4588a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f4588a.setRevenueListener(maxAdRevenueListener);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        this.f4588a.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f4588a.loadAd(maxNativeAdView);
    }

    @Deprecated
    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (appLovinSdk == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            if (context != null) {
                this.f4588a = new MaxNativeAdLoaderImpl(str, appLovinSdk.a());
                return;
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void destroy(MaxAd maxAd) {
        this.f4588a.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f4588a.destroy(maxAd);
    }
}
