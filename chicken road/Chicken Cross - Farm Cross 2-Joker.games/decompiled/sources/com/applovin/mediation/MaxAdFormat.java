package com.applovin.mediation;

import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.applovin.impl.a4;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4665u;
import com.ironsource.mediationsdk.j;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes.dex */
public class MaxAdFormat {

    /* renamed from: a, reason: collision with root package name */
    private final String f4577a;
    private final String b;
    public static final MaxAdFormat BANNER = new MaxAdFormat(j.f8411a, "Banner");
    public static final MaxAdFormat MREC = new MaxAdFormat("MREC", "MREC");
    public static final MaxAdFormat LEADER = new MaxAdFormat("LEADER", "Leader");
    public static final MaxAdFormat INTERSTITIAL = new MaxAdFormat("INTER", "Interstitial");
    public static final MaxAdFormat APP_OPEN = new MaxAdFormat("APPOPEN", "App Open");
    public static final MaxAdFormat REWARDED = new MaxAdFormat("REWARDED", "Rewarded");
    public static final MaxAdFormat NATIVE = new MaxAdFormat("NATIVE", "Native");

    @Deprecated
    public static final MaxAdFormat REWARDED_INTERSTITIAL = new MaxAdFormat("REWARDED_INTER", "Rewarded Interstitial");

    private MaxAdFormat(String str, String str2) {
        this.f4577a = str;
        this.b = str2;
    }

    public static MaxAdFormat formatFromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("banner")) {
            return BANNER;
        }
        if (str.equalsIgnoreCase("mrec")) {
            return MREC;
        }
        if (str.equalsIgnoreCase("native")) {
            return NATIVE;
        }
        if (str.equalsIgnoreCase("leaderboard") || str.equalsIgnoreCase("leader")) {
            return LEADER;
        }
        if (str.equalsIgnoreCase("interstitial") || str.equalsIgnoreCase("inter")) {
            return INTERSTITIAL;
        }
        if (str.equalsIgnoreCase("appopen") || str.equalsIgnoreCase(FirebaseAnalytics.Event.APP_OPEN)) {
            return APP_OPEN;
        }
        if (str.equalsIgnoreCase("rewarded") || str.equalsIgnoreCase(C4665u.j)) {
            return REWARDED;
        }
        p.h("AppLovinSdk", "Unknown ad format: " + str);
        return null;
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(Context context) {
        return getAdaptiveSize(-1, context);
    }

    @Deprecated
    public String getDisplayName() {
        return this.b;
    }

    public String getLabel() {
        return this.f4577a;
    }

    public AppLovinSdkUtils.Size getSize() {
        return this == BANNER ? new AppLovinSdkUtils.Size(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50) : this == LEADER ? new AppLovinSdkUtils.Size(728, 90) : this == MREC ? new AppLovinSdkUtils.Size(300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) : new AppLovinSdkUtils.Size(0, 0);
    }

    public boolean isAdViewAd() {
        return this == BANNER || this == MREC || this == LEADER;
    }

    public boolean isBannerOrLeaderAd() {
        return this == BANNER || this == LEADER;
    }

    public boolean isFullscreenAd() {
        return this == INTERSTITIAL || this == APP_OPEN || this == REWARDED;
    }

    public String toString() {
        return "MaxAdFormat{label='" + this.f4577a + "'}";
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(int i, Context context) {
        return (this == BANNER || this == LEADER) ? a4.a(i, this, context) : getSize();
    }
}
