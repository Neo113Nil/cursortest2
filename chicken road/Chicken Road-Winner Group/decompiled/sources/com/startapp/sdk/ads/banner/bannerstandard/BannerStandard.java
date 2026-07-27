package com.startapp.sdk.ads.banner.bannerstandard;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerInterface;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.BannerSize;
import com.startapp.sdk.ads.banner.bannerstandard.CloseableLayout;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MraidMetadata;
import com.startapp.sdk.internal.aa;
import com.startapp.sdk.internal.ad;
import com.startapp.sdk.internal.ba;
import com.startapp.sdk.internal.bd;
import com.startapp.sdk.internal.cb;
import com.startapp.sdk.internal.d7;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.fi;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.g7;
import com.startapp.sdk.internal.h1;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.ik;
import com.startapp.sdk.internal.j0;
import com.startapp.sdk.internal.j1;
import com.startapp.sdk.internal.jk;
import com.startapp.sdk.internal.o1;
import com.startapp.sdk.internal.og;
import com.startapp.sdk.internal.p1;
import com.startapp.sdk.internal.pc;
import com.startapp.sdk.internal.pf;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.q1;
import com.startapp.sdk.internal.q7;
import com.startapp.sdk.internal.qc;
import com.startapp.sdk.internal.rk;
import com.startapp.sdk.internal.sd;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.u1;
import com.startapp.sdk.internal.v1;
import com.startapp.sdk.internal.v6;
import com.startapp.sdk.internal.vc;
import com.startapp.sdk.internal.wc;
import com.startapp.sdk.internal.wf;
import com.startapp.sdk.internal.x6;
import com.startapp.sdk.internal.xc;
import com.startapp.sdk.internal.xf;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z9;
import d2.C0279i;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import o1.AbstractC1150b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BannerStandard extends BannerBase implements AdEventListener, BannerInterface {
    private static final String LOG_TAG = "BannerStandard";
    protected q1 adHtml;
    private RelativeLayout adInformationContatiner;
    private com.startapp.sdk.adsbase.adinformation.a adInformationLayout;
    private sd adSession;
    private final Object adSessionLock;
    private boolean callLoadHtmlOnAttached;
    private boolean callbackSent;
    private CloseableLayout closeableAdContainer;
    private boolean defaultLoad;
    private final ib externalAds;
    private final wf impressionListener;
    protected boolean jsTag;
    protected BannerListener listener;
    private a mraidController;
    private BannerOptions options;
    private ViewGroup rootView;
    private xf scheduledImpression;
    private boolean sessionStarted;
    private BannerSize size;
    private WebView twoPartWebView;
    private double viewHeightDp;
    private double viewWidthDp;
    private boolean visible;
    private WebView webView;
    private RelativeLayout webViewContainer;
    protected boolean webViewTouched;

    public class a extends v1 implements pc {
        private MraidState mraidState;
        private boolean mraidVisibility;
        private final wc nativeFeatureManager;
        private final xc orientationProperties;
        private ad resizeProperties;
        private a twoPart;
        private ik viewabilityTracker;
        jk visibilityResult;
        private final WebView webView;

        public a(WebView webView, u1 u1Var) {
            super(u1Var);
            this.webView = webView;
            this.nativeFeatureManager = new wc(BannerStandard.this.getContext());
            this.orientationProperties = new xc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addVisibilityTracker() {
            if (this.viewabilityTracker == null) {
                this.viewabilityTracker = new ik(this.webView, BannerStandard.this.getAdLoadingSize(), BannerMetaData.c().a(), new e(this));
            }
            a aVar = this.twoPart;
            if (aVar != null) {
                aVar.addVisibilityTracker();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fireExposureChangeEvent(jk jkVar) {
            String str;
            if (jkVar.equals(this.visibilityResult)) {
                return;
            }
            this.visibilityResult = jkVar;
            Rect rect = jkVar.f3935b;
            if (rect == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("left", rect.left);
                jSONObject.put("top", rect.top);
                jSONObject.put("width", rect.width());
                jSONObject.put("height", rect.height());
                Rect[] rectArr = jkVar.f3936c;
                int length = rectArr == null ? 0 : rectArr.length;
                if (length > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i3 = 0; i3 < length; i3++) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("left", rectArr[i3].left);
                        jSONObject2.put("top", rectArr[i3].top);
                        jSONObject2.put("width", rectArr[i3].width());
                        jSONObject2.put("height", rectArr[i3].height());
                        jSONArray.put(jSONObject2);
                    }
                    str = jSONArray.toString();
                } else {
                    str = null;
                }
                si.a(this.webView, false, "mraid.fireExposureChangeEvent", Float.valueOf(jkVar.f3934a), jSONObject.toString(), str);
            } catch (JSONException unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fireViewableChangeEvent(boolean z3) {
            if (this.mraidVisibility == z3) {
                return;
            }
            this.mraidVisibility = z3;
            si.a(this.webView, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(z3));
        }

        private void updateDisplayMetrics(WebView webView) {
            Context context = BannerStandard.this.getContext();
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int i3 = displayMetrics.widthPixels;
                int i4 = displayMetrics.heightPixels;
                int[] iArr = new int[2];
                BannerStandard.this.getLocationOnScreen(iArr);
                int i5 = iArr[0];
                int i6 = iArr[1];
                float f = i4;
                si.a(webView, true, "mraid.setScreenSize", Integer.valueOf(ii.b(context, i3)), Integer.valueOf(Math.round(f / context.getResources().getDisplayMetrics().density)));
                qc.b(context, i5, i6, BannerStandard.this.size.getWidth(), BannerStandard.this.size.getHeight(), webView);
                si.a(webView, true, "mraid.setMaxSize", Integer.valueOf(ii.b(context, i3)), Integer.valueOf(Math.round(f / context.getResources().getDisplayMetrics().density)));
                qc.a(context, i5, i6, BannerStandard.this.size.getWidth(), BannerStandard.this.size.getHeight(), webView);
            } catch (Throwable th) {
                d9.a(th);
            }
        }

        public void cancelViewabilityTracking() {
            ik ikVar = this.viewabilityTracker;
            if (ikVar != null) {
                ikVar.f3887a.removeCallbacksAndMessages(null);
                this.viewabilityTracker = null;
            }
            a aVar = this.twoPart;
            if (aVar != null) {
                aVar.cancelViewabilityTracking();
            }
        }

        @Override // com.startapp.sdk.internal.v1, com.startapp.sdk.internal.oc
        public void close() {
            BannerStandard.this.handleCollapse();
        }

        @Override // com.startapp.sdk.internal.v1, com.startapp.sdk.internal.oc
        public void expand(String str) {
            BannerStandard.this.cancelReloadTask();
            boolean isEmpty = TextUtils.isEmpty(str);
            boolean z3 = !isEmpty;
            if (!isEmpty) {
                BannerStandard.this.setupTwoPartMraidController(str);
            }
            if (getState() == MraidState.DEFAULT) {
                BannerStandard.this.onMraidExpandDefault(new FrameLayout.LayoutParams(-1, -1), z3);
            } else if (getState() == MraidState.RESIZED && !isEmpty) {
                BannerStandard.this.onMraidExpandResized(new FrameLayout.LayoutParams(-1, -1));
            }
            BannerStandard.this.setCloseableAdContainerLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            setState(MraidState.EXPANDED);
        }

        public ad getResizeProperties() {
            return this.resizeProperties;
        }

        public MraidState getState() {
            return this.mraidState;
        }

        public void init() {
            this.webView.setWebViewClient(new bd(this, this));
        }

        public void initTwoPart(WebView webView) {
            if (this.twoPart == null) {
                a aVar = BannerStandard.this.new a(webView, this.openListener);
                this.twoPart = aVar;
                aVar.init();
                this.twoPart.onMraidDetected();
            }
        }

        @Override // com.startapp.sdk.internal.v1
        public boolean isFeatureSupported(String str) {
            return this.nativeFeatureManager.f4608b.contains(str);
        }

        @Override // com.startapp.sdk.internal.pc
        public void onMraidDetected() {
            if (this.mraidState != null) {
                return;
            }
            this.mraidState = MraidState.LOADING;
            addVisibilityTracker();
        }

        @Override // com.startapp.sdk.internal.pc
        public void onPageFinished(String str) {
            BannerStandard.this.getContext();
            WeakHashMap weakHashMap = si.f4343a;
            Log.println(2, "StartAppSDK", "Banner received callback onPageFinished()");
            ((y6) ((x6) ((BannerBase) BannerStandard.this).eventTracer.a())).c(BannerStandard.this, fi.f3701F);
            BannerStandard.this.makeImpression(this.mraidState != null);
            WebView webView = this.webView;
            if (this.mraidState == MraidState.LOADING) {
                si.a(webView, true, "mraid.setPlacementType", "inline");
                vc.a(BannerStandard.this.getContext(), webView, this.nativeFeatureManager);
                si.a(this.webView, true, "gClientInterface.onPageFinished", Boolean.valueOf(this.mraidState != null));
                updateDisplayMetrics(webView);
                MraidState mraidState = MraidState.DEFAULT;
                this.mraidState = mraidState;
                si.a(webView, true, "mraid.fireStateChangeEvent", mraidState.toString());
                si.a(webView, true, "mraid.fireReadyEvent", new Object[0]);
            }
            BannerStandard.this.onWebviewPageFinished(webView);
        }

        public void release() {
            cancelViewabilityTracking();
            a aVar = this.twoPart;
            if (aVar != null) {
                aVar.release();
                this.twoPart = null;
            }
        }

        public boolean releaseTwoPart() {
            a aVar = this.twoPart;
            if (aVar == null) {
                return false;
            }
            aVar.release();
            this.twoPart = null;
            return true;
        }

        @Override // com.startapp.sdk.internal.v1, com.startapp.sdk.internal.oc
        public void resize() {
            BannerStandard.this.handleResize();
        }

        @Override // com.startapp.sdk.internal.v1, com.startapp.sdk.internal.oc
        public void setExpandProperties(Map<String, String> map) {
            String str = map.get("useCustomClose");
            if (str != null) {
                BannerStandard.this.handleCustomClose(Boolean.parseBoolean(str));
            }
        }

        @Override // com.startapp.sdk.internal.v1, com.startapp.sdk.internal.oc
        public void setOrientationProperties(Map<String, String> map) {
            boolean parseBoolean = Boolean.parseBoolean(map.get("allowOrientationChange"));
            String str = map.get("forceOrientation");
            xc xcVar = this.orientationProperties;
            if (xcVar.f4631a == parseBoolean) {
                int i3 = xcVar.f4632b;
                int indexOf = xc.f4630c.indexOf(str);
                if (indexOf == -1) {
                    indexOf = 2;
                }
                if (i3 == indexOf) {
                    return;
                }
            }
            xc xcVar2 = this.orientationProperties;
            xcVar2.f4631a = parseBoolean;
            int indexOf2 = xc.f4630c.indexOf(str);
            xcVar2.f4632b = indexOf2 != -1 ? indexOf2 : 2;
            applyOrientationProperties((Activity) BannerStandard.this.getContext(), this.orientationProperties);
        }

        @Override // com.startapp.sdk.internal.v1, com.startapp.sdk.internal.oc
        public void setResizeProperties(Map<String, String> map) {
            boolean z3;
            try {
                int parseInt = Integer.parseInt(map.get("width"));
                int parseInt2 = Integer.parseInt(map.get("height"));
                int parseInt3 = Integer.parseInt(map.get("offsetX"));
                int parseInt4 = Integer.parseInt(map.get("offsetY"));
                String str = map.get("allowOffscreen");
                String str2 = map.get("customClosePosition");
                if (str != null && !Boolean.parseBoolean(str)) {
                    z3 = false;
                    this.resizeProperties = new ad(parseInt, parseInt2, parseInt3, parseInt4, str2, z3);
                }
                z3 = true;
                this.resizeProperties = new ad(parseInt, parseInt2, parseInt3, parseInt4, str2, z3);
            } catch (Exception unused) {
                qc.a(this.webView, "wrong format", "setResizeProperties");
            }
        }

        public void setState(MraidState mraidState) {
            this.mraidState = mraidState;
            if (mraidState != null) {
                si.a(this.webView, true, "mraid.fireStateChangeEvent", mraidState.toString());
            }
        }

        @Override // com.startapp.sdk.internal.v1, com.startapp.sdk.internal.oc
        public void useCustomClose(String str) {
            BannerStandard.this.handleCustomClose(Boolean.parseBoolean(str));
        }
    }

    public BannerStandard(Context context) {
        this(context, true, (AdPreferences) null);
    }

    private void addAdInformationLayout() {
        if (this.adInformationLayout == null && this.adInformationContatiner == null) {
            this.adInformationContatiner = new RelativeLayout(getContext());
            com.startapp.sdk.adsbase.adinformation.a aVar = new com.startapp.sdk.adsbase.adinformation.a(getContext(), AdInformationConfig.ImageResourceType.INFO_S, AdPreferences.Placement.INAPP_BANNER, this.adHtml.getAdInfoOverride(), this.adHtml.getConsentData(), this.adHtml.getRequestUrl(), this.adHtml.getDParam(), this.adHtml.getErid(), this.adHtml.getEridUrl());
            this.adInformationLayout = aVar;
            aVar.a(this.adInformationContatiner);
        }
        try {
            ViewGroup viewGroup = (ViewGroup) this.adInformationContatiner.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.adInformationContatiner);
            }
        } catch (Exception unused) {
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.webView.addView(this.adInformationContatiner, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void attachAdViewToContainer(View view, int i3, int i4) {
        this.webViewContainer.removeAllViews();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ii.a(getContext(), i3), ii.a(getContext(), i4));
        layoutParams.addRule(13);
        this.webViewContainer.addView(view, layoutParams);
    }

    private void cancelViewabilityTracking() {
        a aVar = this.mraidController;
        if (aVar != null) {
            aVar.cancelViewabilityTracking();
        }
    }

    private void detachTwoPartMraidController() {
        CloseableLayout closeableLayout = this.closeableAdContainer;
        if (closeableLayout != null) {
            closeableLayout.removeView(this.twoPartWebView);
        }
        this.twoPartWebView.stopLoading();
        this.twoPartWebView = null;
    }

    private ViewGroup getAndMemoizeRootView() {
        if (this.rootView == null) {
            this.rootView = getTopmostView();
        }
        return this.rootView;
    }

    private long getImpressionDelayMillis() {
        Long l3 = this.adHtml.f4038j;
        return l3 != null ? TimeUnit.SECONDS.toMillis(l3.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().z());
    }

    private ViewGroup getTopmostView() {
        View rootView;
        ViewGroup viewGroup = this.rootView;
        if (viewGroup != null) {
            return viewGroup;
        }
        Context context = getContext();
        RelativeLayout relativeLayout = this.webViewContainer;
        View view = null;
        View findViewById = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        if (relativeLayout != null && (rootView = relativeLayout.getRootView()) != null && (view = rootView.findViewById(R.id.content)) == null) {
            view = rootView;
        }
        if (findViewById == null) {
            findViewById = view;
        }
        return findViewById instanceof ViewGroup ? (ViewGroup) findViewById : this.webViewContainer;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0 A[Catch: all -> 0x00e5, TryCatch #1 {all -> 0x00e5, blocks: (B:33:0x00e0, B:39:0x00e7, B:41:0x00f0, B:42:0x00f9, B:46:0x010f), top: B:17:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean handleClick(String str) {
        boolean z3;
        j1.a(getContext(), this.listener, (View) this, g0.a(str, (String) null));
        cancelScheduledImpression(null);
        cancelViewabilityTracking();
        Context context = getContext();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
        boolean a3 = g0.a(context);
        q1 q1Var = this.adHtml;
        String[] strArr = q1Var.f4035g;
        String[] strArr2 = q1Var.f4030a;
        boolean z4 = true;
        if (!this.jsTag && str.contains("index=")) {
            try {
                String[] split = str.split("&");
                int parseInt = Integer.parseInt(split[split.length - 1].split("=")[1]);
                if (parseInt < 0) {
                    d9 d9Var = new d9(e9.f3618e);
                    d9Var.f3574d = "Wrong index extracted from URL";
                    d9Var.f3575e = "adId: " + this.adHtml.getAdId();
                    d9Var.a();
                    return false;
                }
                q1 q1Var2 = this.adHtml;
                try {
                    if (parseInt >= 0) {
                        boolean[] zArr = q1Var2.f4036h;
                        if (parseInt < zArr.length) {
                            z3 = zArr[parseInt];
                            if (z3 || a3) {
                                g0.a(getContext(), str, parseInt >= strArr.length ? new String[]{strArr[parseInt]} : null, new TrackingParams(getAdTag()), (this.adHtml.a(parseInt) || a3) ? false : true, false);
                            } else {
                                Context context2 = getContext();
                                String[] strArr3 = parseInt < strArr.length ? new String[]{strArr[parseInt]} : null;
                                String str2 = parseInt < strArr2.length ? strArr2[parseInt] : null;
                                TrackingParams trackingParams = new TrackingParams(getAdTag());
                                long y = AdsCommonMetaData.k().y();
                                long x3 = AdsCommonMetaData.k().x();
                                boolean a4 = this.adHtml.a(parseInt);
                                Boolean[] boolArr = this.adHtml.f4043o;
                                g0.a(context2, str, strArr3, str2, trackingParams, y, x3, a4, (boolArr == null || parseInt < 0 || parseInt >= boolArr.length) ? null : boolArr[parseInt], false, null);
                            }
                        }
                    } else {
                        q1Var2.getClass();
                    }
                    if (z3) {
                    }
                    g0.a(getContext(), str, parseInt >= strArr.length ? new String[]{strArr[parseInt]} : null, new TrackingParams(getAdTag()), (this.adHtml.a(parseInt) || a3) ? false : true, false);
                } catch (Throwable th) {
                    th = th;
                    d9.a(th);
                    return z4;
                }
                z3 = false;
            } catch (Throwable th2) {
                th = th2;
                z4 = false;
            }
        } else {
            if (strArr.length < 1) {
                d9 d9Var2 = new d9(e9.f3618e);
                d9Var2.f3574d = "No tracking URLs";
                d9Var2.f3575e = "adId: " + this.adHtml.getAdId();
                d9Var2.a();
                return false;
            }
            boolean[] zArr2 = this.adHtml.f4036h;
            if (!(zArr2.length <= 0 ? false : zArr2[0]) || a3) {
                g0.a(getContext(), str, new String[]{strArr[0]}, new TrackingParams(getAdTag()), this.adHtml.a(0) && !a3, false);
            } else {
                if (strArr2.length < 1) {
                    d9 d9Var3 = new d9(e9.f3618e);
                    d9Var3.f3574d = "No package names";
                    d9Var3.f3575e = "adId: " + this.adHtml.getAdId();
                    d9Var3.a();
                    return false;
                }
                Context context3 = getContext();
                String[] strArr4 = {strArr[0]};
                String str3 = strArr2[0];
                TrackingParams trackingParams2 = new TrackingParams(getAdTag());
                long y3 = AdsCommonMetaData.k().y();
                long x4 = AdsCommonMetaData.k().x();
                boolean a5 = this.adHtml.a(0);
                Boolean[] boolArr2 = this.adHtml.f4043o;
                g0.a(context3, str, strArr4, str3, trackingParams2, y3, x4, a5, (boolArr2 == null || boolArr2.length <= 0) ? null : boolArr2[0], false, null);
            }
        }
        this.webView.stopLoading();
        setClicked(true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCollapse() {
        a aVar = this.mraidController;
        if (aVar == null || aVar.getState() == MraidState.LOADING) {
            return;
        }
        MraidState state = this.mraidController.getState();
        MraidState mraidState = MraidState.HIDDEN;
        if (state == mraidState) {
            return;
        }
        if (this.mraidController.getState() == MraidState.RESIZED || this.mraidController.getState() == MraidState.EXPANDED) {
            if (this.mraidController.releaseTwoPart()) {
                detachTwoPartMraidController();
            } else {
                CloseableLayout closeableLayout = this.closeableAdContainer;
                if (closeableLayout != null) {
                    closeableLayout.removeView(this.webView);
                }
                WebView webView = this.webView;
                if (webView != null) {
                    attachAdViewToContainer(webView, this.size.getWidth(), this.size.getHeight());
                }
                updateBannerView();
            }
            CloseableLayout closeableLayout2 = this.closeableAdContainer;
            if (closeableLayout2 != null && closeableLayout2.getParent() != null && (closeableLayout2.getParent() instanceof ViewGroup)) {
                ((ViewGroup) closeableLayout2.getParent()).removeView(closeableLayout2);
            }
            this.mraidController.setState(MraidState.DEFAULT);
        } else if (this.mraidController.getState() == MraidState.DEFAULT) {
            updateBannerView();
            this.mraidController.setState(mraidState);
        }
        scheduleReloadTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCustomClose(boolean z3) {
        if (this.closeableAdContainer == null || z3 == (!r0.a())) {
            return;
        }
        this.closeableAdContainer.setCloseVisible(!z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleResize() {
        a aVar = this.mraidController;
        if (aVar == null) {
            return;
        }
        ad resizeProperties = aVar.getResizeProperties();
        if (resizeProperties == null) {
            qc.a(this.webView, "requires: setResizeProperties first", "resize");
            return;
        }
        cancelReloadTask();
        if (this.mraidController.getState() == MraidState.LOADING || this.mraidController.getState() == MraidState.HIDDEN) {
            return;
        }
        if (this.mraidController.getState() == MraidState.EXPANDED) {
            qc.a(this.webView, "Not allowed to resize from an already expanded ad", "resize");
            return;
        }
        int i3 = resizeProperties.f3455a;
        int i4 = resizeProperties.f3456b;
        int i5 = resizeProperties.f3457c;
        int i6 = resizeProperties.f3458d;
        int[] iArr = new int[2];
        this.webView.getLocationOnScreen(iArr);
        Context context = getContext();
        int b3 = ii.b(context, iArr[0]) + i5;
        int round = Math.round(iArr[1] / context.getResources().getDisplayMetrics().density) + i6;
        Rect rect = new Rect(b3, round, i3 + b3, i4 + round);
        ViewGroup topmostView = getTopmostView();
        int round2 = Math.round(topmostView.getWidth() / context.getResources().getDisplayMetrics().density);
        int round3 = Math.round(topmostView.getHeight() / context.getResources().getDisplayMetrics().density);
        topmostView.getLocationOnScreen(new int[2]);
        int round4 = Math.round(r6[0] / context.getResources().getDisplayMetrics().density);
        int round5 = Math.round(r6[1] / context.getResources().getDisplayMetrics().density);
        if (!resizeProperties.f) {
            if (rect.width() > round2 || rect.height() > round3) {
                qc.a(this.webView, "Not enough room for the ad", "resize");
                return;
            }
            rect.offsetTo(clampInt(round4, rect.left, (round4 + round2) - rect.width()), clampInt(round5, rect.top, (round5 + round3) - rect.height()));
        }
        Rect rect2 = new Rect();
        try {
            CloseableLayout.ClosePosition a3 = CloseableLayout.ClosePosition.a(resizeProperties.f3459e);
            CloseableLayout closeableLayout = this.closeableAdContainer;
            if (closeableLayout != null) {
                closeableLayout.a(a3, rect, rect2);
            }
            if (!new Rect(round4, round5, round2 + round4, round3 + round5).contains(rect2)) {
                qc.a(this.webView, "The close region to appear within the max allowed size", "resize");
                return;
            }
            if (!rect.contains(rect2)) {
                qc.a(this.webView, "The close region to appear within the max allowed size", "resize");
                return;
            }
            this.closeableAdContainer.setCloseVisible(false);
            this.closeableAdContainer.setClosePosition(a3);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect.width(), rect.height());
            layoutParams.leftMargin = rect.left - round4;
            layoutParams.topMargin = rect.top - round5;
            if (this.mraidController.getState() == MraidState.DEFAULT) {
                RelativeLayout relativeLayout = this.webViewContainer;
                if (relativeLayout != null) {
                    relativeLayout.removeView(this.webView);
                    this.webViewContainer.setVisibility(4);
                }
                this.closeableAdContainer.addView(this.webView, new FrameLayout.LayoutParams(-1, -1));
                getAndMemoizeRootView().addView(this.closeableAdContainer, layoutParams);
            } else if (this.mraidController.getState() == MraidState.RESIZED) {
                setCloseableAdContainerLayoutParams(layoutParams);
            }
            this.closeableAdContainer.setClosePosition(a3);
            this.mraidController.setState(MraidState.RESIZED);
        } catch (Exception e3) {
            qc.a(this.webView, e3.getMessage() != null ? e3.getMessage() : "", "resize");
        }
    }

    private boolean isEnoughSize() {
        return this.viewWidthDp >= ((double) this.size.getWidth()) && this.viewHeightDp >= ((double) this.size.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0279i lambda$loadExternalInline$0(g7 g7Var, AdUnitConfig adUnitConfig, int i3, MetaData metaData, ba baVar) {
        C0279i c0279i = C0279i.f4852a;
        if (baVar == null) {
            this.listener.onFailedToReceiveAd(this);
            g7Var.a(Boolean.FALSE);
            return c0279i;
        }
        Point adLoadingSize = getAdLoadingSize();
        q7 q7Var = (q7) baVar;
        q7Var.f4251c = adLoadingSize.x;
        q7Var.f4252d = adLoadingSize.y;
        q7Var.f4253e = new b(this, adLoadingSize, g7Var, adUnitConfig, i3, metaData);
        q7Var.a();
        return c0279i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadExternalInline$1(g7 g7Var, int i3) {
        g7 g7Var2;
        Throwable th;
        AdUnitConfig adUnitConfig;
        try {
            MetaData E3 = MetaData.E();
            ExternalAdConfig v3 = E3.v();
            if (v3 != null) {
                try {
                    adUnitConfig = v3.getMapping().get(getAdTag());
                } catch (Throwable th2) {
                    th = th2;
                    g7Var2 = g7Var;
                    g7Var2.a(Boolean.FALSE);
                    d9.a(th);
                }
            } else {
                adUnitConfig = null;
            }
            AdUnitConfig adUnitConfig2 = adUnitConfig;
            if (adUnitConfig2 == null) {
                g7Var.a(Boolean.FALSE);
                return;
            }
            g7Var2 = g7Var;
            try {
                ((j0) this.externalAds.a()).a(adUnitConfig2, new i(this, g7Var2, adUnitConfig2, i3, E3, 0));
            } catch (Throwable th3) {
                th = th3;
                th = th;
                g7Var2.a(Boolean.FALSE);
                d9.a(th);
            }
        } catch (Throwable th4) {
            th = th4;
            g7Var2 = g7Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$onFailedToReceiveBanner$3(String str, Boolean bool) {
        if (!Boolean.FALSE.equals(bool)) {
            return null;
        }
        sendLoadError(str);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$reload$2(String str, Boolean bool) {
        ExternalConfig u3;
        if (!Boolean.FALSE.equals(bool) || (u3 = MetaData.E().u()) == null || !u3.getLoadInnerAdIfNoExternal()) {
            return null;
        }
        reloadInnerAd(str);
        return null;
    }

    private void loadExternalInline(int i3, g7 g7Var) {
        ((y6) ((x6) this.eventTracer.a())).c(this, fi.f3696A);
        g0.a(new S.a(i3, 2, this, g7Var));
    }

    private void loadHtml() {
        String str;
        q1 q1Var = this.adHtml;
        if (q1Var == null || this.webView == null || (str = q1Var.f4031b) == null) {
            return;
        }
        if (!TextUtils.isEmpty(getAdTag())) {
            str = str.replaceAll("startapp_adtag_placeholder", getAdTag());
        }
        a aVar = this.mraidController;
        if (aVar != null) {
            aVar.release();
            this.mraidController = null;
        }
        a aVar2 = new a(this.webView, new j(this));
        this.mraidController = aVar2;
        aVar2.init();
        ((y6) ((x6) this.eventTracer.a())).c(this, fi.f3700E);
        attachAdViewToContainer(this.webView, this.size.getWidth(), this.size.getHeight());
        getContext();
        si.a(this.webView, str);
        onAdLoadedToView();
    }

    private void onFailedToReceiveBanner(String str) {
        if (d7.a(true, getAdTag(), true, false)) {
            loadExternalInline(2, new h(this, str, 1));
        } else {
            sendLoadError(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onImpressionSent(String str) {
        ((y6) ((x6) this.eventTracer.a())).c(this, fi.f3702G);
        Context context = getContext();
        BannerListener bannerListener = this.listener;
        v6.a("onImpression", bannerListener != null, str, null);
        g0.a(bannerListener != null ? new h1(context, bannerListener, this) : null);
        scheduleReloadTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMraidExpandDefault(FrameLayout.LayoutParams layoutParams, boolean z3) {
        if (z3) {
            CloseableLayout closeableLayout = this.closeableAdContainer;
            if (closeableLayout != null) {
                closeableLayout.addView(this.twoPartWebView, layoutParams);
            }
        } else {
            RelativeLayout relativeLayout = this.webViewContainer;
            if (relativeLayout != null) {
                relativeLayout.removeView(this.webView);
                this.webViewContainer.setVisibility(4);
            }
            CloseableLayout closeableLayout2 = this.closeableAdContainer;
            if (closeableLayout2 != null) {
                closeableLayout2.addView(this.webView, layoutParams);
            }
        }
        getAndMemoizeRootView().addView(this.closeableAdContainer, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMraidExpandResized(FrameLayout.LayoutParams layoutParams) {
        CloseableLayout closeableLayout = this.closeableAdContainer;
        if (closeableLayout != null) {
            closeableLayout.removeView(this.webView);
        }
        RelativeLayout relativeLayout = this.webViewContainer;
        if (relativeLayout != null) {
            relativeLayout.addView(this.webView, layoutParams);
            this.webViewContainer.setVisibility(4);
        }
        this.closeableAdContainer.addView(this.twoPartWebView, layoutParams);
    }

    private void onPause() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onPause();
        }
        WebView webView2 = this.twoPartWebView;
        if (webView2 != null) {
            webView2.onPause();
        }
    }

    private void onResume() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.onResume();
        }
        WebView webView2 = this.twoPartWebView;
        if (webView2 != null) {
            webView2.onResume();
        }
    }

    private void prepareWebView(WebView webView) {
        webView.setBackgroundColor(0);
        webView.setHorizontalScrollBarEnabled(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setVerticalScrollBarEnabled(false);
        webView.setOnTouchListener(new c(this));
        webView.setOnLongClickListener(new o1(this));
        webView.setLongClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void proceedWithImpression() {
        xf xfVar = this.scheduledImpression;
        if (xfVar != null) {
            xfVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reloadImpl(String str) {
        if (this.adHtml != null) {
            Point adLoadingSize = getAdLoadingSize();
            this.adHtml.f4239s = isFixedSize();
            q1 q1Var = this.adHtml;
            int i3 = adLoadingSize.x;
            int i4 = adLoadingSize.y;
            q1Var.f4032c = i3;
            q1Var.f4033d = i4;
            q1Var.setState(Ad.AdState.UN_INITIALIZED);
            this.adHtml.f4240t = getBannerType();
            ((y6) ((x6) this.eventTracer.a())).a(this, this.adHtml);
            ((y6) ((x6) this.eventTracer.a())).c(this, fi.f3697B);
            this.adHtml.load(prepareAdPreferences(), this, str);
        }
    }

    private void reloadInnerAd(String str) {
        if (!waitForFinishAdSession()) {
            reloadImpl(str);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new d(this, str), MetaData.E().N());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendInfoAdRequest(boolean z3, String uuid, String originalTS, AdPreferences adPreferences, Point size, AdUnitConfig config, int i3) {
        Context context = getContext();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
        ib ibVar = this.httpClient;
        ib ibVar2 = this.networkApiExecutor;
        ib ibVar3 = this.eventTracer;
        ib ibVar4 = this.motionProcessor;
        z9 z9Var = new z9(context, adPreferences, placement, ibVar, ibVar2, ibVar3, ibVar4);
        z9Var.f4786b = z3;
        kotlin.jvm.internal.j.e(uuid, "uuid");
        z9Var.f4787c = uuid;
        kotlin.jvm.internal.j.e(originalTS, "originalTS");
        z9Var.f4789e = originalTS;
        kotlin.jvm.internal.j.e(config, "config");
        z9Var.f4788d = config;
        kotlin.jvm.internal.j.e(size, "size");
        z9Var.f = size;
        z9Var.f4790g = Integer.valueOf(getBannerType());
        z9Var.f4791h = Integer.valueOf(i3);
        z9Var.f4792i = config.getSioPrice();
        new aa(context, adPreferences, placement, ibVar, ibVar2, ibVar3, ibVar4, z9Var).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendLoadError(String str) {
        setErrorMessage(str);
        if (this.listener == null || this.callbackSent) {
            return;
        }
        this.callbackSent = true;
        j1.a(getContext(), this.listener, (BannerBase) this, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseableAdContainerLayoutParams(FrameLayout.LayoutParams layoutParams) {
        CloseableLayout closeableLayout = this.closeableAdContainer;
        if (closeableLayout != null) {
            closeableLayout.setLayoutParams(layoutParams);
        }
    }

    private boolean setSize(int i3, int i4) {
        if (this.webView == null) {
            return false;
        }
        this.size = new BannerSize(i3, i4);
        int a3 = ii.a(getContext(), this.size.getWidth());
        int a4 = ii.a(getContext(), this.size.getHeight());
        this.webViewContainer.setMinimumWidth(a3);
        this.webViewContainer.setMinimumHeight(a4);
        ViewGroup.LayoutParams layoutParams = this.webView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(a3, a4);
        } else {
            layoutParams.width = a3;
            layoutParams.height = a4;
        }
        this.webView.setLayoutParams(layoutParams);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupTwoPartMraidController(String str) {
        this.webViewTouched = false;
        if (this.twoPartWebView == null) {
            this.twoPartWebView = ((rk) this.webViewFactory.a()).c();
        }
        a aVar = this.mraidController;
        if (aVar != null) {
            aVar.initTwoPart(this.twoPartWebView);
        }
        prepareWebView(this.twoPartWebView);
        this.twoPartWebView.loadUrl(str);
    }

    private void startAdSession(WebView webView) {
        try {
            startAdSessionUnsafe(webView);
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    private void startAdSessionUnsafe(WebView webView) {
        sd sdVar;
        synchronized (this.adSessionLock) {
            try {
                sdVar = this.adSession;
                if (sdVar == null) {
                    sdVar = new sd(webView);
                    this.adSession = sdVar;
                    this.sessionStarted = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC1150b abstractC1150b = sdVar.f4332a;
        if (abstractC1150b != null) {
            abstractC1150b.e();
            try {
                RelativeLayout relativeLayout = this.adInformationContatiner;
                if (relativeLayout != null) {
                    o1.e eVar = o1.e.f10156c;
                    AbstractC1150b abstractC1150b2 = sdVar.f4332a;
                    if (abstractC1150b2 != null) {
                        abstractC1150b2.a(relativeLayout, eVar);
                    }
                }
                CloseableLayout closeableLayout = this.closeableAdContainer;
                if (closeableLayout != null) {
                    o1.e eVar2 = o1.e.f10155b;
                    AbstractC1150b abstractC1150b3 = sdVar.f4332a;
                    if (abstractC1150b3 != null) {
                        abstractC1150b3.a(closeableLayout, eVar2);
                    }
                }
            } catch (RuntimeException unused) {
            }
            AbstractC1150b abstractC1150b4 = sdVar.f4332a;
            if (abstractC1150b4 != null) {
                abstractC1150b4.d(webView);
            }
            if (sdVar.f4333b != null && sdVar.f4336e.compareAndSet(false, true)) {
                sdVar.f4333b.b();
            }
            sdVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateBannerView() {
        if (this.visible && isAdLoadedToView() && isEnoughSize()) {
            final int i3 = 0;
            g0.a(new Runnable(this) { // from class: com.startapp.sdk.ads.banner.bannerstandard.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BannerStandard f2941b;

                {
                    this.f2941b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            this.f2941b.showBannerViewImpl();
                            break;
                        default:
                            this.f2941b.hideBannerViewImpl();
                            break;
                    }
                }
            });
        } else {
            final int i4 = 1;
            g0.a(new Runnable(this) { // from class: com.startapp.sdk.ads.banner.bannerstandard.g

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BannerStandard f2941b;

                {
                    this.f2941b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            this.f2941b.showBannerViewImpl();
                            break;
                        default:
                            this.f2941b.hideBannerViewImpl();
                            break;
                    }
                }
            });
        }
    }

    private boolean waitForFinishAdSession() {
        sd sdVar;
        synchronized (this.adSessionLock) {
            sdVar = this.adSession;
            this.adSession = null;
        }
        if (sdVar == null) {
            return false;
        }
        try {
            AbstractC1150b abstractC1150b = sdVar.f4332a;
            if (abstractC1150b == null) {
                return true;
            }
            abstractC1150b.c();
            return true;
        } catch (Throwable th) {
            d9.a(th);
            return false;
        }
    }

    public void cancelScheduledImpression(String str) {
        xf xfVar = this.scheduledImpression;
        if (xfVar != null) {
            xfVar.a(str, null);
        }
    }

    public int clampInt(int i3, int i4, int i5) {
        return Math.max(i3, Math.min(i4, i5));
    }

    public void finalize() throws Throwable {
        try {
            cancelScheduledImpression("AD_CLOSED_TOO_QUICKLY");
            waitForFinishAdSession();
        } finally {
            super.finalize();
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public Point getAdLoadingSize() {
        Point point = this.desirableSizeForManualLoading;
        return point != null ? point : super.getAdLoadingSize();
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public String getBannerName() {
        return "StartApp Banner";
    }

    public int getBannerType() {
        return 0;
    }

    public String getBidToken() {
        q1 q1Var = this.adHtml;
        if (q1Var != null) {
            return si.a(q1Var.f4031b, "@bidToken@", "@bidToken@");
        }
        return null;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public int getHeightInDp() {
        return 50;
    }

    public int getOffset() {
        q1 q1Var = this.adHtml;
        if (q1Var == null) {
            return 0;
        }
        return q1Var.f4238r;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public long getRefreshDelayMillis() {
        long N2;
        synchronized (this.adSessionLock) {
            try {
                N2 = this.adSession != null ? MetaData.E().N() : 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return N2;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public int getRefreshRate() {
        return this.options.i();
    }

    public WebView getTwoPartWebView() {
        return this.twoPartWebView;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public View getViewableBanner() {
        RelativeLayout relativeLayout = this.webViewContainer;
        return relativeLayout != null ? relativeLayout : super.getViewableBanner();
    }

    public WebView getWebView() {
        return this.webView;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public int getWidthInDp() {
        return 320;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, com.startapp.sdk.ads.banner.BannerInterface
    public void hideBanner() {
        this.visible = false;
        updateBannerView();
    }

    public void hideBannerViewImpl() {
        RelativeLayout relativeLayout = this.webViewContainer;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public void initRuntime() {
        try {
            Context context = getContext();
            CloseableLayout closeableLayout = new CloseableLayout(context);
            this.closeableAdContainer = closeableLayout;
            closeableLayout.setOnCloseListener(new j(this));
            this.webView = ((rk) this.webViewFactory.a()).c();
            this.options = new BannerOptions();
            if (this.adHtml == null) {
                this.adHtml = new q1(context, this.eventTracer, this.consentManager, this.adCacheManager, this.videoAdCacheManager, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.motionProcessor, this.webViewCacheLoader, getOffset());
            }
            prepareWebView(this.webView);
            this.options = BannerMetaData.c().b();
            setMinimumWidth(ii.a(getContext(), this.size.getWidth()));
            setMinimumHeight(ii.a(getContext(), this.size.getHeight()));
            WebView webView = this.webView;
            Context context2 = getContext();
            p1 p1Var = new p1(this);
            TrackingParams trackingParams = new TrackingParams(getAdTag());
            boolean a3 = this.adHtml.a(0);
            cb cbVar = new cb(context2, p1Var, trackingParams);
            cbVar.f3541b = a3;
            webView.addJavascriptInterface(cbVar, "startappwall");
            this.webViewContainer = new RelativeLayout(getContext());
            updateBannerView();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            addView(this.webViewContainer, layoutParams);
        } catch (Throwable th) {
            d9.a(th);
            hideBanner();
            onFailedToReceiveBanner("BannerStandard.init - webview failed");
        }
    }

    public boolean isFixedSize() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        return layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public boolean isTiedToAdm() {
        q1 q1Var = this.adHtml;
        return q1Var != null && q1Var.isTiedToAdm();
    }

    public void makeImpression(boolean z3) {
        long max = Math.max(0L, getImpressionDelayMillis() - getTimePassedSinceAdLoadedToViewMillis());
        getContext();
        WeakHashMap weakHashMap = si.f4343a;
        Log.println(2, "StartAppSDK", "Banner will send impression in " + max + " millis");
        TrackingParams trackingParams = new TrackingParams(getAdTag());
        trackingParams.a(z3);
        MraidMetadata K2 = MetaData.E().K();
        xf xfVar = new xf(getContext(), AdPreferences.Placement.INAPP_BANNER, this.adHtml.f4037i, trackingParams, max, z3 && K2 != null && si.a(K2.a()), this.impressionListener);
        this.scheduledImpression = xfVar;
        startVisibilityRunnable(xfVar);
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        ((y6) ((x6) this.eventTracer.a())).a((Object) this, fi.f3710e);
        super.onAttachedToWindow();
        if (this.callLoadHtmlOnAttached) {
            this.callLoadHtmlOnAttached = false;
            loadHtml();
        }
        onResume();
        if (this.defaultLoad && !isAdLoadedToView()) {
            loadBanner(null);
        }
        a aVar = this.mraidController;
        if (aVar != null) {
            aVar.addVisibilityTracker();
        }
        if (this.webView != null) {
            synchronized (this.adSessionLock) {
                try {
                    if (this.sessionStarted) {
                        startAdSession(this.webView);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        waitForFinishAdSession();
        onPause();
        cancelViewabilityTracking();
        ((y6) ((x6) this.eventTracer.a())).c(this, fi.f3703H);
        ((y6) ((x6) this.eventTracer.a())).b(this, fi.f3710e);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public void onFailedToReceiveAd(Ad ad) {
        ((y6) ((x6) this.eventTracer.a())).c(this, fi.f3711g);
        ((y6) ((x6) this.eventTracer.a())).b(this, fi.f3708c);
        onFailedToReceiveBanner(ad != null ? ad.getErrorMessage() : null);
    }

    public boolean onMraidClickEvent(String str) {
        if (!this.webViewTouched) {
            d9 d9Var = new d9(e9.f3618e);
            d9Var.f3574d = "fake_click";
            d9Var.f3576g = g0.a(str, (String) null);
            d9Var.f3575e = "jsTag=" + this.jsTag;
            d9Var.a();
        }
        if ((!this.jsTag || this.webViewTouched) && str != null) {
            return handleClick(str);
        }
        return false;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public void onReceiveAd(Ad ad) {
        String str;
        ((y6) ((x6) this.eventTracer.a())).c(this, fi.f);
        ((y6) ((x6) this.eventTracer.a())).b(this, fi.f3708c);
        this.webViewTouched = false;
        removeView(this.adInformationContatiner);
        q1 q1Var = this.adHtml;
        if (q1Var == null || (str = q1Var.f4031b) == null || str.compareTo("") == 0) {
            onFailedToReceiveBanner("No Banner received");
            return;
        }
        this.jsTag = "true".equals(si.a(this.adHtml.f4031b, "@jsTag@", "@jsTag@"));
        String a3 = si.a(this.adHtml.f4031b, "@width@", "@width@");
        String a4 = si.a(this.adHtml.f4031b, "@height@", "@height@");
        if (a3 != null && a4 != null) {
            try {
                if (!setSize(Integer.parseInt(a3), Integer.parseInt(a4))) {
                    onFailedToReceiveBanner("Banner cannot be displayed (not enough room)");
                    return;
                }
            } catch (NumberFormatException unused) {
                onFailedToReceiveBanner("Error parsing width and height from HTML: " + a3 + " x " + a4);
                return;
            } catch (Throwable th) {
                d9.a(th);
                onFailedToReceiveBanner(th.getMessage());
                return;
            }
        }
        if (isAttachedToWindow()) {
            loadHtml();
        } else {
            this.callLoadHtmlOnAttached = true;
        }
        addAdInformationLayout();
        addDisplayEventOnLoad();
        updateBannerView();
        if (this.listener == null || this.callbackSent) {
            return;
        }
        this.callbackSent = true;
        Context context = getContext();
        BannerListener bannerListener = this.listener;
        String[] strArr = this.adHtml.f4037i;
        j1.b(context, bannerListener, this, g0.a(strArr.length <= 0 ? null : strArr[0], (String) null));
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.viewWidthDp = Math.ceil(i3 / displayMetrics.density);
        this.viewHeightDp = Math.ceil(i4 / displayMetrics.density);
        updateBannerView();
    }

    public void onWebviewPageFinished(WebView webView) {
        if (MetaData.E().j0()) {
            startAdSession(webView);
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.View
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (z3) {
            onResume();
        } else {
            onPause();
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public void reload(String str) {
        ((y6) ((x6) this.eventTracer.a())).a((Object) this, fi.f3708c);
        if (d7.a(false, getAdTag(), true, false)) {
            loadExternalInline(1, new h(this, str, 0));
        } else {
            reloadInnerAd(str);
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public void scheduleReloadTask() {
        xf xfVar = this.scheduledImpression;
        if (xfVar == null || xfVar.f4643j.get() == 0) {
            return;
        }
        super.scheduleReloadTask();
    }

    @Override // com.startapp.sdk.ads.banner.BannerInterface
    public void setBannerListener(BannerListener bannerListener) {
        this.listener = bannerListener;
    }

    @Override // com.startapp.sdk.ads.banner.BannerInterface
    public void showBanner() {
        try {
            ((pf) this.runtimeClassDetector.a()).a(2048);
        } catch (Throwable unused) {
        }
        this.visible = true;
        updateBannerView();
    }

    public void showBannerViewImpl() {
        if (isEnoughSize()) {
            RelativeLayout relativeLayout = this.webViewContainer;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            if (this.adHtml != null) {
                pg pgVar = (pg) this.showIntentionsKeeper.a();
                AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
                int bannerType = getBannerType();
                String adId = this.adHtml.getAdId();
                if (adId != null) {
                    pgVar.f4227a.put(new og(placement, bannerType), adId);
                }
            }
        }
    }

    public BannerStandard(Context context, AdPreferences adPreferences) {
        this(context, true, adPreferences);
    }

    public BannerStandard(Context context, BannerListener bannerListener) {
        this(context, true, (AdPreferences) null);
        setBannerListener(bannerListener);
    }

    public BannerStandard(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        this(context, true, adPreferences);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public BannerStandard(Context context, boolean z3) {
        this(context, z3, (AdPreferences) null);
    }

    public BannerStandard(Context context, boolean z3, AdPreferences adPreferences) {
        this(context, z3, adPreferences, null);
    }

    public BannerStandard(Context context, boolean z3, AdPreferences adPreferences, q1 q1Var) {
        this(context, null, 0, z3, adPreferences, q1Var);
    }

    public BannerStandard(Context context, AttributeSet attributeSet, int i3, boolean z3, AdPreferences adPreferences, q1 q1Var) {
        this(context, attributeSet, i3, z3, adPreferences, q1Var, com.startapp.sdk.components.a.a(context).f3345K, com.startapp.sdk.components.a.a(context).f3362j, com.startapp.sdk.components.a.a(context).f3346M, com.startapp.sdk.components.a.a(context).f3347N, com.startapp.sdk.components.a.a(context).f3355b, com.startapp.sdk.components.a.a(context).f3366n, com.startapp.sdk.components.a.a(context).f3335A, com.startapp.sdk.components.a.a(context).f3375w, com.startapp.sdk.components.a.a(context).f3356c, com.startapp.sdk.components.a.a(context).f3373u, com.startapp.sdk.components.a.a(context).f3364l, com.startapp.sdk.components.a.a(context).f3354a);
    }

    public BannerStandard(Context context, AttributeSet attributeSet, int i3, boolean z3, AdPreferences adPreferences, q1 q1Var, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9, ib ibVar10, ib ibVar11, ib ibVar12) {
        super(context, attributeSet, i3, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, ibVar6, ibVar7, ibVar8, ibVar9, ibVar10, ibVar11);
        this.webViewTouched = true;
        this.jsTag = false;
        this.defaultLoad = true;
        this.visible = true;
        this.size = new BannerSize(getWidthInDp(), getHeightInDp());
        this.callbackSent = false;
        this.adInformationLayout = null;
        this.adInformationContatiner = null;
        this.adSessionLock = new Object();
        this.impressionListener = new com.startapp.sdk.ads.banner.bannerstandard.a(this);
        this.externalAds = ibVar12;
        try {
            this.defaultLoad = z3;
            this.adHtml = q1Var;
            setAdPreferences(adPreferences);
            init();
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    public BannerStandard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BannerStandard(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, true, null, null);
    }
}
