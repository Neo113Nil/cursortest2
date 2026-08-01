package com.applovin.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.Nf;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MaxUnityAdManager implements MaxAdListener, MaxAdViewAdListener, MaxRewardedAdListener, MaxAdRevenueListener, MaxAdReviewListener, MaxAdExpirationListener, AppLovinCmpService.OnCompletedListener, MaxUnityApplicationStateChangeTracker.MaxUnityApplicationStateCallback {
    private static final String DEFAULT_AD_VIEW_POSITION = "top_left";
    private static final String KEY_RENDER_OUTSIDE_SAFE_AREA = "render_outside_safe_area";
    private static final String SDK_TAG = "AppLovinSdk";
    private static final String TAG = "MaxUnityAdManager";
    private static BackgroundCallback backgroundCallback;
    private static WeakReference<Activity> currentActivity;
    private View safeAreaBackground;
    private AppLovinSdk sdk;
    private static final Point DEFAULT_AD_VIEW_OFFSET = new Point(0, 0);
    private static final ScheduledThreadPoolExecutor threadPoolExecutor = new ScheduledThreadPoolExecutor(3, new SdkThreadFactory());
    private Integer publisherBannerBackgroundColor = null;
    private final Map<String, MaxInterstitialAd> interstitials = new HashMap(2);
    private final Map<String, MaxAppOpenAd> appOpenAds = new HashMap(2);
    private final Map<String, MaxRewardedAd> rewardedAds = new HashMap(2);
    private final Map<String, MaxAdView> adViews = new HashMap(2);
    private final Map<String, MaxAdFormat> adViewFormats = new HashMap(2);
    private final Map<String, String> adViewPositions = new HashMap(2);
    private final Map<String, Point> adViewOffsets = new HashMap(2);
    private final Map<String, Integer> adViewWidths = new HashMap(2);
    private final Map<String, MaxAd> adInfoMap = new HashMap();
    private final Object adInfoMapLock = new Object();
    private final Map<String, Map<String, String>> adViewExtraParametersToSetAfterCreate = new HashMap(1);
    private final Map<String, Map<String, Object>> adViewLocalExtraParametersToSetAfterCreate = new HashMap(1);
    private final Map<String, String> AdViewCustomDataToSetAfterCreate = new HashMap(1);
    private final List<String> AdUnitsToShowAfterCreate = new ArrayList(2);
    private final Set<String> disabledAdaptiveBannerAdUnitIds = new HashSet(2);
    private final Set<String> disabledAutoRefreshAdViewAdUnitIds = new HashSet(2);
    private final MaxUnityApplicationStateChangeTracker applicationStateChangeTracker = new MaxUnityApplicationStateChangeTracker(this);

    public interface BackgroundCallback {
        void onEvent(String str);
    }

    public interface Listener {
        void onSdkInitializationComplete(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    public static void setCurrentActivity(Activity activity) {
    }

    protected static class Insets {
        int bottom;
        int left;
        int right;
        int top;

        protected Insets() {
        }
    }

    public MaxUnityAdManager() {
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda27
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4566lambda$new$2$comapplovinmediationunityMaxUnityAdManager();
            }
        });
    }

    /* renamed from: lambda$new$2$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4566lambda$new$2$comapplovinmediationunityMaxUnityAdManager() {
        View view = new View(getCurrentActivity());
        this.safeAreaBackground = view;
        view.setVisibility(8);
        this.safeAreaBackground.setBackgroundColor(0);
        this.safeAreaBackground.setClickable(false);
        FrameLayout frameLayout = new FrameLayout(getCurrentActivity());
        frameLayout.addView(this.safeAreaBackground, new FrameLayout.LayoutParams(0, 0));
        getCurrentActivity().addContentView(frameLayout, new LinearLayout.LayoutParams(-1, -1));
        Object parent = frameLayout.getParent();
        if (parent instanceof View) {
            ((View) parent).addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda7
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    MaxUnityAdManager.this.m4564lambda$new$0$comapplovinmediationunityMaxUnityAdManager(view2, i, i2, i3, i4, i5, i6, i7, i8);
                }
            });
        }
        getCurrentActivity().getWindow().getDecorView().getRootView().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda8
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                MaxUnityAdManager.this.m4565lambda$new$1$comapplovinmediationunityMaxUnityAdManager(view2, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    /* renamed from: lambda$new$0$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4564lambda$new$0$comapplovinmediationunityMaxUnityAdManager(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Iterator<MaxAdView> it = this.adViews.values().iterator();
        while (it.hasNext()) {
            Object parent = it.next().getParent();
            if (parent instanceof View) {
                ((View) parent).bringToFront();
            }
        }
    }

    /* renamed from: lambda$new$1$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4565lambda$new$1$comapplovinmediationunityMaxUnityAdManager(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i3 == i7 && i4 == i8 && i2 == i6) {
            return;
        }
        for (Map.Entry<String, MaxAdFormat> entry : this.adViewFormats.entrySet()) {
            positionAdView(entry.getKey(), entry.getValue());
        }
    }

    public static void setBackgroundCallback(BackgroundCallback backgroundCallback2) {
        backgroundCallback = backgroundCallback2;
    }

    public void initializeSdkWithCompletionHandler(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, final Listener listener) {
        AppLovinSdk appLovinSdk = AppLovinSdk.getInstance(getCurrentActivity());
        this.sdk = appLovinSdk;
        appLovinSdk.initialize(appLovinSdkInitializationConfiguration, new AppLovinSdk.SdkInitializationListener() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda28
            @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
            public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                MaxUnityAdManager.this.m4562x3112debb(listener, appLovinSdkConfiguration);
            }
        });
    }

    /* renamed from: lambda$initializeSdkWithCompletionHandler$4$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4562x3112debb(final Listener listener, final AppLovinSdkConfiguration appLovinSdkConfiguration) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4561xf7483cdc(listener, appLovinSdkConfiguration);
            }
        });
    }

    /* renamed from: lambda$initializeSdkWithCompletionHandler$3$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4561xf7483cdc(Listener listener, AppLovinSdkConfiguration appLovinSdkConfiguration) {
        listener.onSdkInitializationComplete(appLovinSdkConfiguration);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", "OnSdkInitializedEvent");
        JsonUtils.putString(jSONObject, "consentFlowUserGeography", Integer.toString(appLovinSdkConfiguration.getConsentFlowUserGeography().ordinal()));
        JsonUtils.putString(jSONObject, "consentDialogState", Integer.toString(appLovinSdkConfiguration.getConsentDialogState().ordinal()));
        JsonUtils.putString(jSONObject, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, appLovinSdkConfiguration.getCountryCode());
        JsonUtils.putString(jSONObject, "isSuccessfullyInitialized", String.valueOf(this.sdk.isInitialized()));
        JsonUtils.putBoolean(jSONObject, "isTestModeEnabled", appLovinSdkConfiguration.isTestModeEnabled());
        forwardUnityEvent(jSONObject);
    }

    public void createBanner(String str, String str2, boolean z) {
        createAdView(str, getAdViewAdFormat(str), str2, DEFAULT_AD_VIEW_OFFSET, z);
    }

    public void createBanner(String str, float f, float f2, boolean z) {
        createAdView(str, getAdViewAdFormat(str), DEFAULT_AD_VIEW_POSITION, getOffsetPixels(f, f2, getCurrentActivity()), z);
    }

    public void loadBanner(String str) {
        loadAdView(str, getAdViewAdFormat(str));
    }

    public void setBannerPlacement(String str, String str2) {
        setAdViewPlacement(str, getAdViewAdFormat(str), str2);
    }

    public void startBannerAutoRefresh(String str) {
        startAdViewAutoRefresh(str, getAdViewAdFormat(str));
    }

    public void stopBannerAutoRefresh(String str) {
        stopAdViewAutoRefresh(str, getAdViewAdFormat(str));
    }

    public void setBannerWidth(String str, int i) {
        setAdViewWidth(str, i, getAdViewAdFormat(str));
    }

    public void updateBannerPosition(String str, String str2) {
        updateAdViewPosition(str, str2, DEFAULT_AD_VIEW_OFFSET, getAdViewAdFormat(str));
    }

    public void updateBannerPosition(String str, float f, float f2) {
        updateAdViewPosition(str, DEFAULT_AD_VIEW_POSITION, getOffsetPixels(f, f2, getCurrentActivity()), getAdViewAdFormat(str));
    }

    public void showBanner(String str) {
        showAdView(str, getAdViewAdFormat(str));
    }

    public void hideBanner(String str) {
        hideAdView(str, getAdViewAdFormat(str));
    }

    public void destroyBanner(String str) {
        destroyAdView(str, getAdViewAdFormat(str));
    }

    public void setBannerBackgroundColor(String str, String str2) {
        setAdViewBackgroundColor(str, getAdViewAdFormat(str), str2);
    }

    public void setBannerExtraParameter(String str, String str2, String str3) {
        setAdViewExtraParameter(str, getAdViewAdFormat(str), str2, str3);
    }

    public void setBannerLocalExtraParameter(String str, String str2, Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            setAdViewLocalExtraParameter(str, getAdViewAdFormat(str), str2, obj);
        }
    }

    public void setBannerCustomData(String str, String str2) {
        setAdViewCustomData(str, getAdViewAdFormat(str), str2);
    }

    public String getBannerLayout(String str) {
        return getAdViewLayout(str, getAdViewAdFormat(str));
    }

    public static float getAdaptiveBannerHeight(float f) {
        return getDeviceSpecificAdViewAdFormat().getAdaptiveSize((int) f, getCurrentActivity()).getHeight();
    }

    public void createMRec(String str, String str2) {
        createAdView(str, MaxAdFormat.MREC, str2, DEFAULT_AD_VIEW_OFFSET, false);
    }

    public void createMRec(String str, float f, float f2) {
        createAdView(str, MaxAdFormat.MREC, DEFAULT_AD_VIEW_POSITION, getOffsetPixels(f, f2, getCurrentActivity()), false);
    }

    public void loadMRec(String str) {
        loadAdView(str, MaxAdFormat.MREC);
    }

    public void setMRecPlacement(String str, String str2) {
        setAdViewPlacement(str, MaxAdFormat.MREC, str2);
    }

    public void startMRecAutoRefresh(String str) {
        startAdViewAutoRefresh(str, MaxAdFormat.MREC);
    }

    public void stopMRecAutoRefresh(String str) {
        stopAdViewAutoRefresh(str, MaxAdFormat.MREC);
    }

    public void updateMRecPosition(String str, String str2) {
        updateAdViewPosition(str, str2, DEFAULT_AD_VIEW_OFFSET, MaxAdFormat.MREC);
    }

    public void updateMRecPosition(String str, float f, float f2) {
        updateAdViewPosition(str, DEFAULT_AD_VIEW_POSITION, getOffsetPixels(f, f2, getCurrentActivity()), MaxAdFormat.MREC);
    }

    public void showMRec(String str) {
        showAdView(str, MaxAdFormat.MREC);
    }

    public void hideMRec(String str) {
        hideAdView(str, MaxAdFormat.MREC);
    }

    public void setMRecExtraParameter(String str, String str2, String str3) {
        setAdViewExtraParameter(str, MaxAdFormat.MREC, str2, str3);
    }

    public void setMRecLocalExtraParameter(String str, String str2, Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            setAdViewLocalExtraParameter(str, MaxAdFormat.MREC, str2, obj);
        }
    }

    public void setMRecCustomData(String str, String str2) {
        setAdViewCustomData(str, MaxAdFormat.MREC, str2);
    }

    public String getMRecLayout(String str) {
        return getAdViewLayout(str, MaxAdFormat.MREC);
    }

    public void destroyMRec(String str) {
        destroyAdView(str, MaxAdFormat.MREC);
    }

    public void loadInterstitial(String str) {
        retrieveInterstitial(str).loadAd();
    }

    public boolean isInterstitialReady(String str) {
        return retrieveInterstitial(str).isReady();
    }

    public void showInterstitial(String str, String str2, String str3) {
        retrieveInterstitial(str).showAd(str2, str3, getCurrentActivity());
    }

    public void setInterstitialExtraParameter(String str, String str2, String str3) {
        retrieveInterstitial(str).setExtraParameter(str2, str3);
    }

    public void setInterstitialLocalExtraParameter(String str, String str2, Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            retrieveInterstitial(str).setLocalExtraParameter(str2, obj);
        }
    }

    public void loadAppOpenAd(String str) {
        retrieveAppOpenAd(str).loadAd();
    }

    public boolean isAppOpenAdReady(String str) {
        return retrieveAppOpenAd(str).isReady();
    }

    public void showAppOpenAd(String str, String str2, String str3) {
        retrieveAppOpenAd(str).showAd(str2, str3);
    }

    public void setAppOpenAdExtraParameter(String str, String str2, String str3) {
        retrieveAppOpenAd(str).setExtraParameter(str2, str3);
    }

    public void setAppOpenAdLocalExtraParameter(String str, String str2, Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            retrieveAppOpenAd(str).setLocalExtraParameter(str2, obj);
        }
    }

    public void loadRewardedAd(String str) {
        retrieveRewardedAd(str).loadAd();
    }

    public boolean isRewardedAdReady(String str) {
        return retrieveRewardedAd(str).isReady();
    }

    public void showRewardedAd(String str, String str2, String str3) {
        retrieveRewardedAd(str).showAd(str2, str3, getCurrentActivity());
    }

    public void setRewardedAdExtraParameter(String str, String str2, String str3) {
        retrieveRewardedAd(str).setExtraParameter(str2, str3);
    }

    public void setRewardedAdLocalExtraParameter(String str, String str2, Object obj) {
        if (str2 == null) {
            e("Failed to set local extra parameter: No key specified");
        } else {
            retrieveRewardedAd(str).setLocalExtraParameter(str2, obj);
        }
    }

    public void trackEvent(String str, String str2) {
        if (this.sdk == null) {
            return;
        }
        this.sdk.getEventService().trackEvent(str, deserializeParameters(str2));
    }

    public void showCmpForExistingUser() {
        this.sdk.getCmpService().showCmpForExistingUser(getCurrentActivity(), this);
    }

    @Override // com.applovin.sdk.AppLovinCmpService.OnCompletedListener
    public void onCompleted(final AppLovinCmpError appLovinCmpError) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda26
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.lambda$onCompleted$5(AppLovinCmpError.this);
            }
        });
    }

    static /* synthetic */ void lambda$onCompleted$5(AppLovinCmpError appLovinCmpError) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", "OnCmpCompletedEvent");
        JsonUtils.putBoolean(jSONObject, "keepInBackground", true);
        if (appLovinCmpError != null) {
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putInt(jSONObject2, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, appLovinCmpError.getCode().getValue());
            JsonUtils.putString(jSONObject2, "message", appLovinCmpError.getMessage());
            JsonUtils.putInt(jSONObject2, "cmpCode", appLovinCmpError.getCmpCode());
            JsonUtils.putString(jSONObject2, "cmpMessage", appLovinCmpError.getCmpMessage());
            JsonUtils.putJSONObject(jSONObject, "error", jSONObject2);
        }
        forwardUnityEvent(jSONObject);
    }

    @Override // com.applovin.mediation.unity.MaxUnityApplicationStateChangeTracker.MaxUnityApplicationStateCallback
    public void onApplicationStateChanged(final boolean z) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda33
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.lambda$onApplicationStateChanged$6(z);
            }
        });
    }

    static /* synthetic */ void lambda$onApplicationStateChanged$6(boolean z) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", "OnApplicationStateChanged");
        JsonUtils.putBoolean(jSONObject, "isPaused", z);
        forwardUnityEvent(jSONObject);
    }

    private JSONObject getAdInfo(MaxAd maxAd) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "adUnitId", maxAd.getAdUnitId());
        JsonUtils.putString(jSONObject, "adFormat", maxAd.getFormat().getLabel());
        JsonUtils.putString(jSONObject, "networkName", maxAd.getNetworkName());
        JsonUtils.putString(jSONObject, "networkPlacement", maxAd.getNetworkPlacement());
        JsonUtils.putString(jSONObject, "creativeId", !TextUtils.isEmpty(maxAd.getCreativeId()) ? maxAd.getCreativeId() : "");
        JsonUtils.putString(jSONObject, "placement", !TextUtils.isEmpty(maxAd.getPlacement()) ? maxAd.getPlacement() : "");
        JsonUtils.putString(jSONObject, "revenue", String.valueOf(maxAd.getRevenue()));
        JsonUtils.putString(jSONObject, "revenuePrecision", maxAd.getRevenuePrecision());
        JsonUtils.putJSONObject(jSONObject, "waterfallInfo", createAdWaterfallInfo(maxAd.getWaterfall()));
        JsonUtils.putString(jSONObject, "latencyMillis", String.valueOf(maxAd.getRequestLatencyMillis()));
        JsonUtils.putString(jSONObject, "dspName", TextUtils.isEmpty(maxAd.getDspName()) ? "" : maxAd.getDspName());
        return jSONObject;
    }

    private JSONObject createAdWaterfallInfo(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        JSONObject jSONObject = new JSONObject();
        if (maxAdWaterfallInfo == null) {
            return jSONObject;
        }
        JsonUtils.putString(jSONObject, "name", maxAdWaterfallInfo.getName());
        JsonUtils.putString(jSONObject, "testName", maxAdWaterfallInfo.getTestName());
        JSONArray jSONArray = new JSONArray();
        Iterator<MaxNetworkResponseInfo> it = maxAdWaterfallInfo.getNetworkResponses().iterator();
        while (it.hasNext()) {
            jSONArray.put(createNetworkResponseInfo(it.next()));
        }
        JsonUtils.putJsonArray(jSONObject, "networkResponses", jSONArray);
        JsonUtils.putString(jSONObject, "latencyMillis", String.valueOf(maxAdWaterfallInfo.getLatencyMillis()));
        return jSONObject;
    }

    private JSONObject createNetworkResponseInfo(MaxNetworkResponseInfo maxNetworkResponseInfo) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "adLoadState", Integer.toString(maxNetworkResponseInfo.getAdLoadState().ordinal()));
        if (maxNetworkResponseInfo.getMediatedNetwork() != null) {
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "name", maxNetworkResponseInfo.getMediatedNetwork().getName());
            JsonUtils.putString(jSONObject2, "adapterClassName", maxNetworkResponseInfo.getMediatedNetwork().getAdapterClassName());
            JsonUtils.putString(jSONObject2, Nf.b, maxNetworkResponseInfo.getMediatedNetwork().getAdapterVersion());
            JsonUtils.putString(jSONObject2, "sdkVersion", maxNetworkResponseInfo.getMediatedNetwork().getSdkVersion());
            JsonUtils.putInt(jSONObject2, "initializationStatus", maxNetworkResponseInfo.getMediatedNetwork().getInitializationStatus().getCode());
            JsonUtils.putJSONObject(jSONObject, "mediatedNetwork", jSONObject2);
        }
        JsonUtils.putJSONObject(jSONObject, "credentials", BundleUtils.toJSONObject(maxNetworkResponseInfo.getCredentials()));
        JsonUtils.putBoolean(jSONObject, "isBidding", maxNetworkResponseInfo.isBidding());
        MaxError error = maxNetworkResponseInfo.getError();
        if (error != null) {
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putString(jSONObject3, "errorMessage", error.getMessage());
            JsonUtils.putString(jSONObject3, "adLoadFailureInfo", error.getAdLoadFailureInfo());
            JsonUtils.putString(jSONObject3, IronSourceConstants.EVENTS_ERROR_CODE, Integer.toString(error.getCode()));
            JsonUtils.putString(jSONObject3, "latencyMillis", String.valueOf(error.getRequestLatencyMillis()));
            JsonUtils.putJSONObject(jSONObject, "error", jSONObject3);
        }
        JsonUtils.putString(jSONObject, "latencyMillis", String.valueOf(maxNetworkResponseInfo.getLatencyMillis()));
        return jSONObject;
    }

    public String getAdValue(String str, String str2) {
        MaxAd ad;
        return (TextUtils.isEmpty(str) || (ad = getAd(str)) == null) ? "" : ad.getAdValue(str2);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(final MaxAd maxAd) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda34
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4574x63f132af(maxAd);
            }
        });
    }

    /* renamed from: lambda$onAdLoaded$7$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4574x63f132af(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (format.isAdViewAd()) {
            if (MaxAdFormat.MREC == format) {
                str = "OnMRecAdLoadedEvent";
            } else {
                str = "OnBannerAdLoadedEvent";
            }
            positionAdView(maxAd);
            MaxAdView retrieveAdView = retrieveAdView(maxAd.getAdUnitId(), format);
            if (retrieveAdView != null && retrieveAdView.getVisibility() != 0) {
                retrieveAdView.stopAutoRefresh();
            }
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialLoadedEvent";
        } else if (MaxAdFormat.APP_OPEN == format) {
            str = "OnAppOpenAdLoadedEvent";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdLoadedEvent";
        } else {
            logInvalidAdFormat(format);
            return;
        }
        synchronized (this.adInfoMapLock) {
            this.adInfoMap.put(maxAd.getAdUnitId(), maxAd);
        }
        forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(final String str, final MaxError maxError) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4573x30b6f710(str, maxError);
            }
        });
    }

    /* renamed from: lambda$onAdLoadFailed$8$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4573x30b6f710(String str, MaxError maxError) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            logStackTrace(new IllegalArgumentException("adUnitId cannot be null"));
            return;
        }
        if (this.adViews.containsKey(str)) {
            if (MaxAdFormat.MREC == this.adViewFormats.get(str)) {
                str2 = "OnMRecAdLoadFailedEvent";
            } else {
                str2 = "OnBannerAdLoadFailedEvent";
            }
        } else if (this.interstitials.containsKey(str)) {
            str2 = "OnInterstitialLoadFailedEvent";
        } else if (this.appOpenAds.containsKey(str)) {
            str2 = "OnAppOpenAdLoadFailedEvent";
        } else if (this.rewardedAds.containsKey(str)) {
            str2 = "OnRewardedAdLoadFailedEvent";
        } else {
            logStackTrace(new IllegalStateException("invalid adUnitId: " + str));
            return;
        }
        synchronized (this.adInfoMapLock) {
            this.adInfoMap.remove(str);
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", str2);
        JsonUtils.putString(jSONObject, "adUnitId", str);
        JsonUtils.putString(jSONObject, IronSourceConstants.EVENTS_ERROR_CODE, Integer.toString(maxError.getCode()));
        JsonUtils.putString(jSONObject, "errorMessage", maxError.getMessage());
        JsonUtils.putJSONObject(jSONObject, "waterfallInfo", createAdWaterfallInfo(maxError.getWaterfall()));
        String adLoadFailureInfo = maxError.getAdLoadFailureInfo();
        if (TextUtils.isEmpty(adLoadFailureInfo)) {
            adLoadFailureInfo = "";
        }
        JsonUtils.putString(jSONObject, "adLoadFailureInfo", adLoadFailureInfo);
        JsonUtils.putString(jSONObject, "latencyMillis", String.valueOf(maxError.getRequestLatencyMillis()));
        forwardUnityEvent(jSONObject);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(final MaxAd maxAd) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4567xc18452e9(maxAd);
            }
        });
    }

    /* renamed from: lambda$onAdClicked$9$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4567xc18452e9(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER == format || MaxAdFormat.LEADER == format) {
            str = "OnBannerAdClickedEvent";
        } else if (MaxAdFormat.MREC == format) {
            str = "OnMRecAdClickedEvent";
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialClickedEvent";
        } else if (MaxAdFormat.APP_OPEN == format) {
            str = "OnAppOpenAdClickedEvent";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdClickedEvent";
        } else {
            logInvalidAdFormat(format);
            return;
        }
        forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(final MaxAd maxAd) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4570x43652f85(maxAd);
            }
        });
    }

    /* renamed from: lambda$onAdDisplayed$10$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4570x43652f85(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (format.isFullscreenAd()) {
            if (MaxAdFormat.INTERSTITIAL == format) {
                str = "OnInterstitialDisplayedEvent";
            } else if (MaxAdFormat.APP_OPEN == format) {
                str = "OnAppOpenAdDisplayedEvent";
            } else {
                str = "OnRewardedAdDisplayedEvent";
            }
            forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda29
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4569xf4285022(maxAd, maxError);
            }
        });
    }

    /* renamed from: lambda$onAdDisplayFailed$11$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4569xf4285022(MaxAd maxAd, MaxError maxError) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (format.isFullscreenAd()) {
            if (MaxAdFormat.INTERSTITIAL == format) {
                str = "OnInterstitialAdFailedToDisplayEvent";
            } else if (MaxAdFormat.APP_OPEN == format) {
                str = "OnAppOpenAdFailedToDisplayEvent";
            } else {
                str = "OnRewardedAdFailedToDisplayEvent";
            }
            JSONObject defaultAdEventParameters = getDefaultAdEventParameters(str, maxAd);
            JsonUtils.putString(defaultAdEventParameters, IronSourceConstants.EVENTS_ERROR_CODE, Integer.toString(maxError.getCode()));
            JsonUtils.putString(defaultAdEventParameters, "errorMessage", maxError.getMessage());
            JsonUtils.putString(defaultAdEventParameters, "mediatedNetworkErrorCode", Integer.toString(maxError.getMediatedNetworkErrorCode()));
            JsonUtils.putString(defaultAdEventParameters, "mediatedNetworkErrorMessage", maxError.getMediatedNetworkErrorMessage());
            JsonUtils.putJSONObject(defaultAdEventParameters, "waterfallInfo", createAdWaterfallInfo(maxError.getWaterfall()));
            JsonUtils.putString(defaultAdEventParameters, "latencyMillis", String.valueOf(maxError.getRequestLatencyMillis()));
            forwardUnityEvent(defaultAdEventParameters);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(final MaxAd maxAd) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4572x9e2174aa(maxAd);
            }
        });
    }

    /* renamed from: lambda$onAdHidden$12$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4572x9e2174aa(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (format.isFullscreenAd()) {
            if (MaxAdFormat.INTERSTITIAL == format) {
                str = "OnInterstitialHiddenEvent";
            } else if (MaxAdFormat.APP_OPEN == format) {
                str = "OnAppOpenAdHiddenEvent";
            } else {
                str = "OnRewardedAdHiddenEvent";
            }
            forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
        }
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(final MaxAd maxAd) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4568x9354e118(maxAd);
            }
        });
    }

    /* renamed from: lambda$onAdCollapsed$13$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4568x9354e118(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (!format.isAdViewAd()) {
            logInvalidAdFormat(format);
            return;
        }
        if (MaxAdFormat.MREC == format) {
            str = "OnMRecAdCollapsedEvent";
        } else {
            str = "OnBannerAdCollapsedEvent";
        }
        forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(final MaxAd maxAd) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda30
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4571xfe24b1f7(maxAd);
            }
        });
    }

    /* renamed from: lambda$onAdExpanded$14$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4571xfe24b1f7(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (!format.isAdViewAd()) {
            logInvalidAdFormat(format);
            return;
        }
        if (MaxAdFormat.MREC == format) {
            str = "OnMRecAdExpandedEvent";
        } else {
            str = "OnBannerAdExpandedEvent";
        }
        forwardUnityEvent(getDefaultAdEventParameters(str, maxAd));
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(final MaxAd maxAd, final MaxReward maxReward) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4578xd790293(maxAd, maxReward);
            }
        });
    }

    /* renamed from: lambda$onUserRewarded$15$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4578xd790293(MaxAd maxAd, MaxReward maxReward) {
        MaxAdFormat format = maxAd.getFormat();
        if (format != MaxAdFormat.REWARDED) {
            logInvalidAdFormat(format);
            return;
        }
        String label = maxReward.getLabel();
        String num = Integer.toString(maxReward.getAmount());
        JSONObject defaultAdEventParameters = getDefaultAdEventParameters("OnRewardedAdReceivedRewardEvent", maxAd);
        JsonUtils.putString(defaultAdEventParameters, "rewardLabel", label);
        JsonUtils.putString(defaultAdEventParameters, IronSourceConstants.EVENTS_REWARD_AMOUNT, num);
        forwardUnityEvent(defaultAdEventParameters);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(final MaxAd maxAd) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4575x84bedee6(maxAd);
            }
        });
    }

    /* renamed from: lambda$onAdRevenuePaid$16$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4575x84bedee6(MaxAd maxAd) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER == format || MaxAdFormat.LEADER == format) {
            str = "OnBannerAdRevenuePaidEvent";
        } else if (MaxAdFormat.MREC == format) {
            str = "OnMRecAdRevenuePaidEvent";
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnInterstitialAdRevenuePaidEvent";
        } else if (MaxAdFormat.APP_OPEN == format) {
            str = "OnAppOpenAdRevenuePaidEvent";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnRewardedAdRevenuePaidEvent";
        } else {
            logInvalidAdFormat(format);
            return;
        }
        JSONObject defaultAdEventParameters = getDefaultAdEventParameters(str, maxAd);
        JsonUtils.putBoolean(defaultAdEventParameters, "keepInBackground", format.isFullscreenAd());
        forwardUnityEvent(defaultAdEventParameters);
    }

    @Override // com.applovin.mediation.MaxAdExpirationListener
    public void onExpiredAdReloaded(final MaxAd maxAd, final MaxAd maxAd2) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4577x21c14f60(maxAd2, maxAd);
            }
        });
    }

    /* renamed from: lambda$onExpiredAdReloaded$17$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4577x21c14f60(MaxAd maxAd, MaxAd maxAd2) {
        String str;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.INTERSTITIAL == format) {
            str = "OnExpiredInterstitialAdReloadedEvent";
        } else if (MaxAdFormat.APP_OPEN == format) {
            str = "OnExpiredAppOpenAdReloadedEvent";
        } else if (MaxAdFormat.REWARDED == format) {
            str = "OnExpiredRewardedAdReloadedEvent";
        } else {
            logInvalidAdFormat(format);
            return;
        }
        synchronized (this.adInfoMapLock) {
            this.adInfoMap.put(maxAd.getAdUnitId(), maxAd);
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJSONObject(jSONObject, "expiredAdInfo", getAdInfo(maxAd2));
        JsonUtils.putJSONObject(jSONObject, "newAdInfo", getAdInfo(maxAd));
        JsonUtils.putString(jSONObject, "name", str);
        forwardUnityEvent(jSONObject);
    }

    @Override // com.applovin.mediation.MaxAdReviewListener
    public void onCreativeIdGenerated(final String str, final MaxAd maxAd) {
        threadPoolExecutor.execute(new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4576x7f028244(maxAd, str);
            }
        });
    }

    /* renamed from: lambda$onCreativeIdGenerated$18$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4576x7f028244(MaxAd maxAd, String str) {
        String str2;
        MaxAdFormat format = maxAd.getFormat();
        if (MaxAdFormat.BANNER == format || MaxAdFormat.LEADER == format) {
            str2 = "OnBannerAdReviewCreativeIdGeneratedEvent";
        } else if (MaxAdFormat.MREC == format) {
            str2 = "OnMRecAdReviewCreativeIdGeneratedEvent";
        } else if (MaxAdFormat.INTERSTITIAL == format) {
            str2 = "OnInterstitialAdReviewCreativeIdGeneratedEvent";
        } else if (MaxAdFormat.REWARDED == format) {
            str2 = "OnRewardedAdReviewCreativeIdGeneratedEvent";
        } else {
            logInvalidAdFormat(format);
            return;
        }
        JSONObject defaultAdEventParameters = getDefaultAdEventParameters(str2, maxAd);
        JsonUtils.putString(defaultAdEventParameters, "adReviewCreativeId", str);
        JsonUtils.putBoolean(defaultAdEventParameters, "keepInBackground", format.isFullscreenAd());
        forwardUnityEvent(defaultAdEventParameters);
    }

    private JSONObject getDefaultAdEventParameters(String str, MaxAd maxAd) {
        JSONObject adInfo = getAdInfo(maxAd);
        JsonUtils.putString(adInfo, "name", str);
        return adInfo;
    }

    private void createAdView(final String str, final MaxAdFormat maxAdFormat, final String str2, final Point point, final boolean z) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda25
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4558x67dd7f5b(maxAdFormat, str, str2, point, z);
            }
        });
    }

    /* renamed from: lambda$createAdView$19$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4558x67dd7f5b(MaxAdFormat maxAdFormat, String str, String str2, Point point, boolean z) {
        Map<String, Object> map;
        d("Creating " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\" and position: \"" + str2 + "\"");
        if (this.adViews.get(str) != null) {
            w("Trying to create a " + maxAdFormat.getLabel() + " that was already created. This will cause the current ad to be hidden.");
        }
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat, str2, point, z);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        this.safeAreaBackground.setVisibility(8);
        retrieveAdView.setVisibility(8);
        if (retrieveAdView.getParent() == null) {
            Activity currentActivity2 = getCurrentActivity();
            RelativeLayout relativeLayout = new RelativeLayout(currentActivity2);
            currentActivity2.addContentView(relativeLayout, new LinearLayout.LayoutParams(-1, -1));
            relativeLayout.addView(retrieveAdView);
            this.adViewFormats.put(str, maxAdFormat);
            positionAdView(str, maxAdFormat);
        }
        Map<String, String> map2 = this.adViewExtraParametersToSetAfterCreate.get(str);
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                retrieveAdView.setExtraParameter(entry.getKey(), entry.getValue());
                maybeHandleExtraParameterChanges(str, maxAdFormat, entry.getKey(), entry.getValue());
            }
            this.adViewExtraParametersToSetAfterCreate.remove(str);
        }
        if (this.adViewLocalExtraParametersToSetAfterCreate.containsKey(str) && (map = this.adViewLocalExtraParametersToSetAfterCreate.get(str)) != null) {
            for (Map.Entry<String, Object> entry2 : map.entrySet()) {
                retrieveAdView.setLocalExtraParameter(entry2.getKey(), entry2.getValue());
            }
            this.adViewLocalExtraParametersToSetAfterCreate.remove(str);
        }
        if (this.AdViewCustomDataToSetAfterCreate.containsKey(str)) {
            retrieveAdView.setCustomData(this.AdViewCustomDataToSetAfterCreate.get(str));
            this.AdViewCustomDataToSetAfterCreate.remove(str);
        }
        retrieveAdView.loadAd();
        if (this.disabledAutoRefreshAdViewAdUnitIds.contains(str)) {
            retrieveAdView.stopAutoRefresh();
        }
        if (this.AdUnitsToShowAfterCreate.contains(str)) {
            showAdView(str, maxAdFormat);
            this.AdUnitsToShowAfterCreate.remove(str);
        }
    }

    private void loadAdView(final String str, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4563xa3c9c1af(str, maxAdFormat);
            }
        });
    }

    /* renamed from: lambda$loadAdView$20$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4563xa3c9c1af(String str, MaxAdFormat maxAdFormat) {
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        if (!this.disabledAutoRefreshAdViewAdUnitIds.contains(str)) {
            if (retrieveAdView.getVisibility() != 0) {
                e("Auto-refresh will resume when the " + maxAdFormat.getLabel() + " ad is shown. You should only call LoadBanner() or LoadMRec() if you explicitly pause auto-refresh and want to manually load an ad.");
                return;
            } else {
                e("You must stop auto-refresh if you want to manually load " + maxAdFormat.getLabel() + " ads.");
                return;
            }
        }
        retrieveAdView.loadAd();
    }

    private void setAdViewPlacement(final String str, final MaxAdFormat maxAdFormat, final String str2) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4584x183b94fb(str2, maxAdFormat, str);
            }
        });
    }

    /* renamed from: lambda$setAdViewPlacement$21$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4584x183b94fb(String str, MaxAdFormat maxAdFormat, String str2) {
        d("Setting placement \"" + str + "\" for " + maxAdFormat.getLabel() + " with ad unit id \"" + str2 + "\"");
        MaxAdView retrieveAdView = retrieveAdView(str2, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
        } else {
            retrieveAdView.setPlacement(str);
        }
    }

    private void startAdViewAutoRefresh(final String str, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4587xb30bda61(maxAdFormat, str);
            }
        });
    }

    /* renamed from: lambda$startAdViewAutoRefresh$22$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4587xb30bda61(MaxAdFormat maxAdFormat, String str) {
        d("Starting " + maxAdFormat.getLabel() + " auto refresh for ad unit identifier \"" + str + "\"");
        this.disabledAutoRefreshAdViewAdUnitIds.remove(str);
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist for ad unit identifier \"" + str + "\"");
        } else {
            retrieveAdView.startAutoRefresh();
        }
    }

    private void stopAdViewAutoRefresh(final String str, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4588xf8843886(maxAdFormat, str);
            }
        });
    }

    /* renamed from: lambda$stopAdViewAutoRefresh$23$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4588xf8843886(MaxAdFormat maxAdFormat, String str) {
        d("Stopping " + maxAdFormat.getLabel() + " auto refresh for ad unit identifier \"" + str + "\"");
        this.disabledAutoRefreshAdViewAdUnitIds.add(str);
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist for ad unit identifier \"" + str + "\"");
        } else {
            retrieveAdView.stopAutoRefresh();
        }
    }

    private void setAdViewWidth(final String str, final int i, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4585xca482cb9(i, maxAdFormat, str);
            }
        });
    }

    /* renamed from: lambda$setAdViewWidth$24$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4585xca482cb9(int i, MaxAdFormat maxAdFormat, String str) {
        d("Setting width " + i + " for \"" + maxAdFormat + "\" with ad unit identifier \"" + str + "\"");
        int width = (maxAdFormat.isBannerOrLeaderAd() ? MaxAdFormat.BANNER.getSize() : maxAdFormat.getSize()).getWidth();
        if (i < width) {
            e("The provided width: " + i + "dp is smaller than the minimum required width: " + width + "dp for ad format: " + maxAdFormat + ". Automatically setting width to " + width + ".");
        }
        this.adViewWidths.put(str, Integer.valueOf(Math.max(width, i)));
        positionAdView(str, maxAdFormat);
    }

    private void updateAdViewPosition(final String str, final String str2, final Point point, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4589xc254e9b6(maxAdFormat, str2, str, point);
            }
        });
    }

    /* renamed from: lambda$updateAdViewPosition$25$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4589xc254e9b6(MaxAdFormat maxAdFormat, String str, String str2, Point point) {
        d("Updating " + maxAdFormat.getLabel() + " position to \"" + str + "\" for ad unit id \"" + str2 + "\"");
        if (retrieveAdView(str2, maxAdFormat) == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        this.adViewPositions.put(str2, str);
        this.adViewOffsets.put(str2, point);
        positionAdView(str2, maxAdFormat);
    }

    private void showAdView(final String str, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4586x329f7200(maxAdFormat, str);
            }
        });
    }

    /* renamed from: lambda$showAdView$26$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4586x329f7200(MaxAdFormat maxAdFormat, String str) {
        d("Showing " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist for ad unit id \"" + str + "\"");
            this.AdUnitsToShowAfterCreate.add(str);
            return;
        }
        this.safeAreaBackground.setVisibility(0);
        retrieveAdView.setVisibility(0);
        if (this.disabledAutoRefreshAdViewAdUnitIds.contains(str)) {
            return;
        }
        retrieveAdView.startAutoRefresh();
    }

    private void hideAdView(final String str, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4560x885d8324(maxAdFormat, str);
            }
        });
    }

    /* renamed from: lambda$hideAdView$27$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4560x885d8324(MaxAdFormat maxAdFormat, String str) {
        d("Hiding " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        this.AdUnitsToShowAfterCreate.remove(str);
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        this.safeAreaBackground.setVisibility(8);
        retrieveAdView.setVisibility(8);
        retrieveAdView.stopAutoRefresh();
    }

    private String getAdViewLayout(String str, MaxAdFormat maxAdFormat) {
        d("Getting " + maxAdFormat.getLabel() + " absolute position with ad unit id \"" + str + "\"");
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return "";
        }
        int[] iArr = new int[2];
        retrieveAdView.getLocationOnScreen(iArr);
        int pxToDp = AppLovinSdkUtils.pxToDp(getCurrentActivity(), iArr[0]);
        int pxToDp2 = AppLovinSdkUtils.pxToDp(getCurrentActivity(), iArr[1]);
        int pxToDp3 = AppLovinSdkUtils.pxToDp(getCurrentActivity(), retrieveAdView.getWidth());
        int pxToDp4 = AppLovinSdkUtils.pxToDp(getCurrentActivity(), retrieveAdView.getHeight());
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "origin_x", String.valueOf(pxToDp));
        JsonUtils.putString(jSONObject, "origin_y", String.valueOf(pxToDp2));
        JsonUtils.putString(jSONObject, "width", String.valueOf(pxToDp3));
        JsonUtils.putString(jSONObject, "height", String.valueOf(pxToDp4));
        return jSONObject.toString();
    }

    private void destroyAdView(final String str, final MaxAdFormat maxAdFormat) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4559xebaca321(maxAdFormat, str);
            }
        });
    }

    /* renamed from: lambda$destroyAdView$28$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4559xebaca321(MaxAdFormat maxAdFormat, String str) {
        d("Destroying " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\"");
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        ViewParent parent = retrieveAdView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(retrieveAdView);
        }
        retrieveAdView.setListener(null);
        retrieveAdView.setRevenueListener(null);
        retrieveAdView.setAdReviewListener(null);
        retrieveAdView.destroy();
        this.adViews.remove(str);
        this.adViewFormats.remove(str);
        this.adViewPositions.remove(str);
        this.adViewOffsets.remove(str);
        this.adViewWidths.remove(str);
        this.disabledAdaptiveBannerAdUnitIds.remove(str);
    }

    private void setAdViewBackgroundColor(final String str, final MaxAdFormat maxAdFormat, final String str2) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4580x9fb5a9a3(maxAdFormat, str, str2);
            }
        });
    }

    /* renamed from: lambda$setAdViewBackgroundColor$29$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4580x9fb5a9a3(MaxAdFormat maxAdFormat, String str, String str2) {
        d("Setting " + maxAdFormat.getLabel() + " with ad unit id \"" + str + "\" to color: " + str2);
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        int parseColor = Color.parseColor(str2);
        this.publisherBannerBackgroundColor = Integer.valueOf(parseColor);
        this.safeAreaBackground.setBackgroundColor(parseColor);
        retrieveAdView.setBackgroundColor(parseColor);
    }

    private void setAdViewExtraParameter(final String str, final MaxAdFormat maxAdFormat, final String str2, final String str3) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4582x602f26ab(maxAdFormat, str2, str3, str);
            }
        });
    }

    /* renamed from: lambda$setAdViewExtraParameter$30$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4582x602f26ab(MaxAdFormat maxAdFormat, String str, String str2, String str3) {
        d("Setting " + maxAdFormat.getLabel() + " extra with key: \"" + str + "\" value: " + str2);
        MaxAdView retrieveAdView = retrieveAdView(str3, maxAdFormat);
        if (retrieveAdView != null) {
            retrieveAdView.setExtraParameter(str, str2);
        } else {
            d(maxAdFormat.getLabel() + " does not exist for ad unit ID \"" + str3 + "\". Saving extra parameter to be set when it is created.");
            Map<String, String> map = this.adViewExtraParametersToSetAfterCreate.get(str3);
            if (map == null) {
                map = new HashMap<>(1);
                this.adViewExtraParametersToSetAfterCreate.put(str3, map);
            }
            map.put(str, str2);
        }
        maybeHandleExtraParameterChanges(str3, maxAdFormat, str, str2);
    }

    private void setAdViewLocalExtraParameter(final String str, final MaxAdFormat maxAdFormat, final String str2, final Object obj) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4583xa7e0185b(maxAdFormat, str2, obj, str);
            }
        });
    }

    /* renamed from: lambda$setAdViewLocalExtraParameter$31$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4583xa7e0185b(MaxAdFormat maxAdFormat, String str, Object obj, String str2) {
        d("Setting " + maxAdFormat.getLabel() + " local extra with key: \"" + str + "\" value: " + obj);
        MaxAdView retrieveAdView = retrieveAdView(str2, maxAdFormat);
        if (retrieveAdView != null) {
            retrieveAdView.setLocalExtraParameter(str, obj);
            return;
        }
        d(maxAdFormat.getLabel() + " does not exist for ad unit ID \"" + str2 + "\". Saving local extra parameter to be set when it is created.");
        Map<String, Object> map = this.adViewLocalExtraParametersToSetAfterCreate.get(str2);
        if (map == null) {
            map = new HashMap<>(1);
            this.adViewLocalExtraParametersToSetAfterCreate.put(str2, map);
        }
        map.put(str, obj);
    }

    private void maybeHandleExtraParameterChanges(String str, MaxAdFormat maxAdFormat, String str2, String str3) {
        if (MaxAdFormat.MREC != maxAdFormat) {
            if ("force_banner".equalsIgnoreCase(str2)) {
                MaxAdFormat deviceSpecificAdViewAdFormat = Boolean.parseBoolean(str3) ? MaxAdFormat.BANNER : getDeviceSpecificAdViewAdFormat();
                this.adViewFormats.put(str, deviceSpecificAdViewAdFormat);
                positionAdView(str, deviceSpecificAdViewAdFormat);
            } else if ("adaptive_banner".equalsIgnoreCase(str2)) {
                Log.e(TAG, "Setting adaptive banners via extra parameters is deprecated and will be removed in a future plugin version. Use the CreateBanner(adUnitIdentifier, AdViewConfiguration) API to properly configure adaptive banners.");
                if (Boolean.parseBoolean(str3)) {
                    this.disabledAdaptiveBannerAdUnitIds.remove(str);
                } else {
                    this.disabledAdaptiveBannerAdUnitIds.add(str);
                }
                positionAdView(str, maxAdFormat);
            }
        }
    }

    private void setAdViewCustomData(final String str, final MaxAdFormat maxAdFormat, final String str2) {
        Utils.runSafelyOnUiThread(getCurrentActivity(), new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4581x8dacd1ab(str, maxAdFormat, str2);
            }
        });
    }

    /* renamed from: lambda$setAdViewCustomData$32$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4581x8dacd1ab(String str, MaxAdFormat maxAdFormat, String str2) {
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView != null) {
            retrieveAdView.setCustomData(str2);
        } else {
            d(maxAdFormat.getLabel() + " does not exist for ad unit ID \"" + str + "\". Saving custom data to be set when it is created.");
            this.AdViewCustomDataToSetAfterCreate.put(str, str2);
        }
    }

    private void logInvalidAdFormat(MaxAdFormat maxAdFormat) {
        logStackTrace(new IllegalStateException("invalid ad format: " + maxAdFormat));
    }

    private void logStackTrace(Exception exc) {
        e(Log.getStackTraceString(exc));
    }

    private static void d(String str) {
        if (MaxUnityPlugin.isDisableAllLogs()) {
            return;
        }
        Log.d(SDK_TAG, "[MaxUnityAdManager] " + str);
    }

    private static void w(String str) {
        if (MaxUnityPlugin.isDisableAllLogs()) {
            return;
        }
        Log.w(SDK_TAG, "[MaxUnityAdManager] " + str);
    }

    private static void e(String str) {
        if (MaxUnityPlugin.isDisableAllLogs()) {
            return;
        }
        Log.e(SDK_TAG, "[MaxUnityAdManager] " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str, Throwable th) {
        if (MaxUnityPlugin.isDisableAllLogs()) {
            return;
        }
        Log.e(SDK_TAG, "[MaxUnityAdManager] " + str, th);
    }

    private MaxInterstitialAd retrieveInterstitial(String str) {
        MaxInterstitialAd maxInterstitialAd = this.interstitials.get(str);
        if (maxInterstitialAd != null) {
            return maxInterstitialAd;
        }
        MaxInterstitialAd maxInterstitialAd2 = new MaxInterstitialAd(str);
        maxInterstitialAd2.setListener(this);
        maxInterstitialAd2.setRevenueListener(this);
        maxInterstitialAd2.setAdReviewListener(this);
        maxInterstitialAd2.setExpirationListener(this);
        this.interstitials.put(str, maxInterstitialAd2);
        return maxInterstitialAd2;
    }

    private MaxAppOpenAd retrieveAppOpenAd(String str) {
        MaxAppOpenAd maxAppOpenAd = this.appOpenAds.get(str);
        if (maxAppOpenAd != null) {
            return maxAppOpenAd;
        }
        MaxAppOpenAd maxAppOpenAd2 = new MaxAppOpenAd(str);
        maxAppOpenAd2.setListener(this);
        maxAppOpenAd2.setRevenueListener(this);
        maxAppOpenAd2.setExpirationListener(this);
        this.appOpenAds.put(str, maxAppOpenAd2);
        return maxAppOpenAd2;
    }

    private MaxRewardedAd retrieveRewardedAd(String str) {
        MaxRewardedAd maxRewardedAd = this.rewardedAds.get(str);
        if (maxRewardedAd != null) {
            return maxRewardedAd;
        }
        MaxRewardedAd maxRewardedAd2 = MaxRewardedAd.getInstance(str);
        maxRewardedAd2.setListener(this);
        maxRewardedAd2.setRevenueListener(this);
        maxRewardedAd2.setAdReviewListener(this);
        maxRewardedAd2.setExpirationListener(this);
        this.rewardedAds.put(str, maxRewardedAd2);
        return maxRewardedAd2;
    }

    private MaxAdView retrieveAdView(String str, MaxAdFormat maxAdFormat) {
        return retrieveAdView(str, maxAdFormat, null, null, true);
    }

    private MaxAdView retrieveAdView(String str, MaxAdFormat maxAdFormat, String str2, Point point, boolean z) {
        MaxAdView maxAdView = this.adViews.get(str);
        if (maxAdView != null || str2 == null || point == null) {
            return maxAdView;
        }
        MaxAdViewConfiguration.Builder builder = MaxAdViewConfiguration.builder();
        if (maxAdFormat.isBannerOrLeaderAd()) {
            if (z) {
                builder.setAdaptiveType(MaxAdViewConfiguration.AdaptiveType.ANCHORED);
            } else {
                builder.setAdaptiveType(MaxAdViewConfiguration.AdaptiveType.NONE);
                this.disabledAdaptiveBannerAdUnitIds.add(str);
            }
        }
        MaxAdView maxAdView2 = new MaxAdView(str, maxAdFormat, builder.build());
        maxAdView2.setListener(this);
        maxAdView2.setRevenueListener(this);
        maxAdView2.setAdReviewListener(this);
        this.adViews.put(str, maxAdView2);
        this.adViewPositions.put(str, str2);
        this.adViewOffsets.put(str, point);
        maxAdView2.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
        return maxAdView2;
    }

    private void positionAdView(MaxAd maxAd) {
        positionAdView(maxAd.getAdUnitId(), maxAd.getFormat());
    }

    private void positionAdView(final String str, final MaxAdFormat maxAdFormat) {
        getCurrentActivity().runOnUiThread(new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.this.m4579x53834a10(str, maxAdFormat);
            }
        });
    }

    /* renamed from: lambda$positionAdView$33$com-applovin-mediation-unity-MaxUnityAdManager, reason: not valid java name */
    /* synthetic */ void m4579x53834a10(String str, MaxAdFormat maxAdFormat) {
        String str2;
        int i;
        MaxAdView retrieveAdView = retrieveAdView(str, maxAdFormat);
        if (retrieveAdView == null) {
            e(maxAdFormat.getLabel() + " does not exist");
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) retrieveAdView.getParent();
        if (relativeLayout == null) {
            e(maxAdFormat.getLabel() + "'s parent does not exist");
            return;
        }
        Rect rect = new Rect();
        relativeLayout.getWindowVisibleDisplayFrame(rect);
        String str3 = this.adViewPositions.get(str);
        Point point = this.adViewOffsets.get(str);
        Insets safeInsets = getSafeInsets();
        boolean contains = this.disabledAdaptiveBannerAdUnitIds.contains(str);
        boolean containsKey = this.adViewWidths.containsKey(str);
        int intValue = containsKey ? this.adViewWidths.get(str).intValue() : ("top_center".equalsIgnoreCase(str3) || "bottom_center".equalsIgnoreCase(str3)) ? AppLovinSdkUtils.pxToDp(getCurrentActivity(), rect.width()) : maxAdFormat.getSize().getWidth();
        int height = ((maxAdFormat == MaxAdFormat.BANNER || maxAdFormat == MaxAdFormat.LEADER) && !contains) ? maxAdFormat.getAdaptiveSize(intValue, getCurrentActivity()).getHeight() : maxAdFormat.getSize().getHeight();
        int dpToPx = AppLovinSdkUtils.dpToPx(getCurrentActivity(), intValue);
        int dpToPx2 = AppLovinSdkUtils.dpToPx(getCurrentActivity(), height);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) retrieveAdView.getLayoutParams();
        layoutParams.height = dpToPx2;
        retrieveAdView.setLayoutParams(layoutParams);
        retrieveAdView.setRotation(0.0f);
        retrieveAdView.setTranslationX(0.0f);
        layoutParams.setMargins(0, 0, 0, 0);
        int i2 = safeInsets.left + point.x;
        int i3 = safeInsets.top + point.y;
        int i4 = safeInsets.right;
        int i5 = safeInsets.bottom;
        int i6 = 1;
        if ("centered".equalsIgnoreCase(str3)) {
            if (MaxAdFormat.MREC == maxAdFormat || containsKey) {
                layoutParams.width = dpToPx;
            } else {
                layoutParams.width = -1;
            }
            i = 17;
            str2 = "top_center";
        } else {
            int i7 = str3.contains(ViewHierarchyConstants.DIMENSION_TOP_KEY) ? 48 : str3.contains("bottom") ? 80 : 0;
            str2 = "top_center";
            if (str3.contains("center")) {
                int i8 = i7 | 1;
                if (MaxAdFormat.MREC == maxAdFormat || containsKey) {
                    layoutParams.width = dpToPx;
                } else {
                    layoutParams.width = -1;
                }
                boolean contains2 = str3.contains("left");
                boolean contains3 = str3.contains("right");
                if (contains2 || contains3) {
                    int i9 = i7 | 17;
                    if (MaxAdFormat.MREC == maxAdFormat) {
                        i9 |= str3.contains("left") ? 3 : 5;
                    } else {
                        int width = (rect.width() - safeInsets.left) - safeInsets.right;
                        int height2 = (rect.height() - safeInsets.top) - safeInsets.bottom;
                        int max = ((height2 > width ? -1 : 1) * (Math.max(width, height2) - Math.min(width, height2))) / 2;
                        i2 += max;
                        i4 += max;
                        int i10 = (width / 2) - (dpToPx2 / 2);
                        if (contains2) {
                            i10 = -i10;
                        }
                        retrieveAdView.setTranslationX(i10);
                        retrieveAdView.setRotation(90.0f);
                    }
                    relativeLayout.setBackgroundColor(0);
                    i = i9;
                } else {
                    i = i8;
                }
            } else {
                layoutParams.width = dpToPx;
                i = str3.contains("left") ? i7 | 3 : str3.contains("right") ? i7 | 5 : i7;
            }
        }
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            if (this.publisherBannerBackgroundColor != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.safeAreaBackground.getLayoutParams();
                if (str2.equals(str3)) {
                    layoutParams2.height = safeInsets.top;
                    layoutParams2.width = -1;
                    this.safeAreaBackground.setVisibility(retrieveAdView.getVisibility());
                    i2 -= safeInsets.left;
                    i4 -= safeInsets.right;
                    i6 = 49;
                } else if ("bottom_center".equals(str3)) {
                    layoutParams2.height = safeInsets.bottom;
                    layoutParams2.width = -1;
                    this.safeAreaBackground.setVisibility(retrieveAdView.getVisibility());
                    i2 -= safeInsets.left;
                    i4 -= safeInsets.right;
                    i6 = 81;
                } else {
                    this.safeAreaBackground.setVisibility(8);
                }
                layoutParams2.gravity = i6;
                this.safeAreaBackground.requestLayout();
            } else {
                this.safeAreaBackground.setVisibility(8);
            }
        }
        layoutParams.setMargins(i2, i3, i4, i5);
        relativeLayout.setGravity(i);
    }

    protected Insets getSafeInsets() {
        Window window;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        DisplayCutout displayCutout2;
        Insets insets = new Insets();
        if (Build.VERSION.SDK_INT < 28 || (window = getCurrentActivity().getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return insets;
        }
        if (Build.VERSION.SDK_INT < 35) {
            if (!getRenderOutsideSafeArea() || (displayCutout2 = rootWindowInsets.getDisplayCutout()) == null) {
                return insets;
            }
            insets.left = displayCutout2.getSafeInsetLeft();
            insets.top = displayCutout2.getSafeInsetTop();
            insets.right = displayCutout2.getSafeInsetRight();
            insets.bottom = displayCutout2.getSafeInsetBottom();
            return insets;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            android.graphics.Insets insets2 = rootWindowInsets.getInsets(WindowInsets.Type.navigationBars());
            insets.left = insets2.left;
            insets.top = insets2.top;
            insets.right = insets2.right;
            insets.bottom = insets2.bottom;
        }
        if ((!getRenderOutsideSafeArea() && Build.VERSION.SDK_INT < 30) || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            return insets;
        }
        insets.left = Math.max(insets.left, displayCutout.getSafeInsetLeft());
        insets.top = Math.max(insets.top, displayCutout.getSafeInsetTop());
        insets.right = Math.max(insets.right, displayCutout.getSafeInsetRight());
        insets.bottom = Math.max(insets.bottom, displayCutout.getSafeInsetBottom());
        return insets;
    }

    private static void forwardUnityEvent(final JSONObject jSONObject) {
        Runnable runnable = new Runnable() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                MaxUnityAdManager.backgroundCallback.onEvent(jSONObject.toString());
            }
        };
        if (Utils.isMainThread()) {
            threadPoolExecutor.execute(runnable);
        } else {
            runnable.run();
        }
    }

    protected static Map<String, String> deserializeParameters(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return JsonUtils.toStringMap(JsonUtils.jsonObjectFromJsonString(str, new JSONObject()));
            } catch (Throwable th) {
                e("Failed to deserialize: (" + str + ") with exception: " + th);
                return Collections.emptyMap();
            }
        }
        return Collections.emptyMap();
    }

    private MaxAdFormat getAdViewAdFormat(String str) {
        if (this.adViewFormats.containsKey(str)) {
            return this.adViewFormats.get(str);
        }
        return getDeviceSpecificAdViewAdFormat();
    }

    private static MaxAdFormat getDeviceSpecificAdViewAdFormat() {
        return AppLovinSdkUtils.isTablet(getCurrentActivity()) ? MaxAdFormat.LEADER : MaxAdFormat.BANNER;
    }

    private static Activity getCurrentActivity() {
        return Utils.getCurrentActivity();
    }

    private static Point getOffsetPixels(float f, float f2, Context context) {
        return new Point(AppLovinSdkUtils.dpToPx(context, (int) f), AppLovinSdkUtils.dpToPx(context, (int) f2));
    }

    private MaxAd getAd(String str) {
        MaxAd maxAd;
        synchronized (this.adInfoMapLock) {
            maxAd = this.adInfoMap.get(str);
        }
        return maxAd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class SdkThreadFactory implements ThreadFactory {
        private SdkThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:Max-Unity-Plugin:shared");
            thread.setDaemon(true);
            thread.setPriority(5);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.applovin.mediation.unity.MaxUnityAdManager$SdkThreadFactory$$ExternalSyntheticLambda0
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread2, Throwable th) {
                    MaxUnityAdManager.e("Caught unhandled exceptions", th);
                }
            });
            return thread;
        }
    }

    private boolean getRenderOutsideSafeArea() {
        return Boolean.parseBoolean(this.sdk.getSettings().getExtraParameters().get(KEY_RENDER_OUTSIDE_SAFE_AREA));
    }
}
