package com.applovin.mediation.ads;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.l;
import com.applovin.impl.t7;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class MaxAppOpenAd {

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f4583a;

    public MaxAppOpenAd(String str) {
        this(str, l.p());
    }

    public void destroy() {
        this.f4583a.logApiCall("destroy()");
        this.f4583a.destroy();
    }

    public String getAdUnitId() {
        return this.f4583a.getAdUnitId();
    }

    public boolean isLoading() {
        boolean isLoading = this.f4583a.isLoading();
        this.f4583a.logApiCall("isLoading() " + isLoading + " for ad unit id " + this.f4583a.getAdUnitId());
        return isLoading;
    }

    public boolean isReady() {
        boolean isReady = this.f4583a.isReady();
        this.f4583a.logApiCall("isReady() " + isReady + " for ad unit id " + this.f4583a.getAdUnitId());
        return isReady;
    }

    public boolean isShowing() {
        boolean isShowing = this.f4583a.isShowing();
        this.f4583a.logApiCall("isShowing() " + isShowing + " for ad unit id " + this.f4583a.getAdUnitId());
        return isShowing;
    }

    public void loadAd() {
        this.f4583a.logApiCall("loadAd()");
        this.f4583a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f4583a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f4583a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f4583a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f4583a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f4583a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f4583a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f4583a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f4583a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f4583a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f4583a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f4583a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f4583a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f4583a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f4583a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public String toString() {
        return "" + this.f4583a;
    }

    @Deprecated
    public MaxAppOpenAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str) {
        showAd(str, null);
    }

    @Deprecated
    public MaxAppOpenAd(String str, AppLovinSdk appLovinSdk) {
        this(str, appLovinSdk, l.p());
    }

    public void showAd(String str, String str2) {
        this.f4583a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        t7.b(str2, "MaxAppOpenAd");
        this.f4583a.showAd(str, str2, null);
    }

    private MaxAppOpenAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxAppOpenAd", "MaxAppOpenAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        this.f4583a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.APP_OPEN, null, "MaxAppOpenAd", appLovinSdk.a(), context);
    }
}
