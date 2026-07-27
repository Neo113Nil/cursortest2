package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
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
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MaxInterstitialAd implements MaxFullscreenAdImpl.a {
    private static WeakReference b = new WeakReference(null);

    /* renamed from: a, reason: collision with root package name */
    private final MaxFullscreenAdImpl f4584a;

    public MaxInterstitialAd(String str) {
        this(str, l.p());
    }

    public void destroy() {
        this.f4584a.logApiCall("destroy()");
        this.f4584a.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a
    public Activity getActivity() {
        this.f4584a.logApiCall("getActivity()");
        return (Activity) b.get();
    }

    public String getAdUnitId() {
        return this.f4584a.getAdUnitId();
    }

    public boolean isLoading() {
        boolean isLoading = this.f4584a.isLoading();
        this.f4584a.logApiCall("isLoading() " + isLoading + " for ad unit id " + this.f4584a.getAdUnitId());
        return isLoading;
    }

    public boolean isReady() {
        boolean isReady = this.f4584a.isReady();
        this.f4584a.logApiCall("isReady() " + isReady + " for ad unit id " + this.f4584a.getAdUnitId());
        return isReady;
    }

    public boolean isShowing() {
        boolean isShowing = this.f4584a.isShowing();
        this.f4584a.logApiCall("isShowing() " + isShowing + " for ad unit id " + this.f4584a.getAdUnitId());
        return isShowing;
    }

    public void loadAd() {
        this.f4584a.logApiCall("loadAd()");
        this.f4584a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f4584a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f4584a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        this.f4584a.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f4584a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f4584a.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f4584a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        this.f4584a.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f4584a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f4584a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f4584a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f4584a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f4584a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f4584a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f4584a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return "" + this.f4584a;
    }

    @Deprecated
    public MaxInterstitialAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    @Deprecated
    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (context == null) {
                throw new IllegalArgumentException("No context specified");
            }
            if (appLovinSdk != null) {
                if (context instanceof Activity) {
                    b = new WeakReference((Activity) context);
                }
                this.f4584a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.a(), context);
                return;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void showAd(String str, String str2, Activity activity) {
        this.f4584a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", activity=" + activity + ")");
        t7.b(str2, "MaxInterstitialAd");
        this.f4584a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        showAd((String) null, viewGroup, lifecycle, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        showAd(str, null, viewGroup, lifecycle, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity) {
        this.f4584a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + lifecycle + ", activity=" + activity + ")");
        this.f4584a.showAd(str, str2, viewGroup, lifecycle, activity);
    }

    @Deprecated
    public void showAd() {
        showAd((String) null);
    }

    @Deprecated
    public void showAd(String str) {
        showAd(str, (String) null);
    }

    @Deprecated
    public void showAd(String str, String str2) {
        this.f4584a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        t7.b(str2, "MaxInterstitialAd");
        this.f4584a.showAd(str, str2, getActivity());
    }

    @Deprecated
    public void showAd(ViewGroup viewGroup, Lifecycle lifecycle) {
        showAd((String) null, viewGroup, lifecycle);
    }

    @Deprecated
    public void showAd(String str, ViewGroup viewGroup, Lifecycle lifecycle) {
        showAd(str, (String) null, viewGroup, lifecycle);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, Lifecycle lifecycle) {
        this.f4584a.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + lifecycle + ")");
        this.f4584a.showAd(str, str2, viewGroup, lifecycle, getActivity());
    }
}
