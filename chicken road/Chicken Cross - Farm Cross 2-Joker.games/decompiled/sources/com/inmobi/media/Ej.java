package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebViewRenderProcessClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.media3.common.PlaybackException;
import androidx.webkit.Profile;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.inmobi.media.videoPlayer.model.HtmlOmidTracker;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.BuildConfig;
import io.ktor.sse.ServerSentEventKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Ej extends V2 implements D, InterfaceC3614c3, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, Kg, Ji {
    public static final C3855kj h1 = new C3855kj();
    public static final C3826jj i1 = new C3826jj();
    public static final String j1 = "Ej";
    public static final C3584b2 k1 = new C3584b2(Boolean.FALSE, new Function0() { // from class: com.inmobi.media.Ej$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(Ej.A());
        }
    }, false, true);
    public volatile Job A;
    public C3964od A0;
    public String B;
    public final GestureDetector B0;
    public C4187wd C;
    public final Im C0;
    public boolean D;
    public boolean D0;
    public JSONObject E;
    public boolean E0;
    public JSONObject F;
    public C4153v6 F0;
    public boolean G;
    public InterfaceC4097t6 G0;
    public boolean H;
    public String H0;
    public boolean I;
    public Jg I0;
    public boolean J;
    public N0 J0;
    public Vp K;
    public final AtomicBoolean K0;
    public boolean L;
    public boolean L0;
    public boolean M;
    public V M0;
    public String N;
    public String N0;
    public final AtomicBoolean O;
    public boolean O0;
    public final Object P;
    public Lq P0;
    public final Object Q;
    public boolean Q0;
    public boolean R;
    public Map R0;
    public final boolean S;
    public final C3970oj S0;
    public View T;
    public final Dj T0;
    public WebChromeClient.CustomViewCallback U;
    public String U0;
    public int V;
    public final C4110tj V0;
    public boolean W;
    public final C3998pj W0;
    public final C3913mj X0;
    public boolean Y0;
    public C3671e5 Z0;
    public boolean a0;
    public C3591b9 a1;
    public final byte b;
    public long b0;
    public boolean b1;
    public final Set c;
    public String c0;
    public Cj c1;
    public String d;
    public final AtomicBoolean d0;
    public InterfaceC4072s9 d1;
    public final boolean e;
    public ViewTreeObserver.OnGlobalLayoutListener e0;
    public final C4220xj e1;
    public String f;
    public Oj f0;
    public final C3798ij f1;
    public volatile long g;
    public final Lazy g0;
    public Jq g1;
    public final Ij h;
    public C3939nh h0;
    public final Y9 i;
    public final Lazy i0;
    public final C3715fk j;
    public String j0;
    public final yq k;
    public Map k0;
    public final C3979p0 l;
    public InterfaceC3585b3 l0;
    public final AdConfig m;
    public D m0;
    public volatile boolean n;
    public boolean n0;
    public volatile boolean o;
    public InterfaceC4228y0 o0;
    public volatile boolean p;
    public Tp p0;
    public InterfaceC3853kh q;
    public final boolean q0;
    public byte r;
    public int r0;
    public final Sk s;
    public String s0;
    public final Lazy t;
    public int[] t0;
    public WeakReference u;
    public long u0;
    public WeakReference v;
    public int v0;
    public WeakReference w;
    public final C3941nj w0;
    public Gj x;
    public final C4054rj x0;
    public final Mutex y;
    public int y0;
    public final AtomicBoolean z;
    public int z0;

    public /* synthetic */ Ej(Context context, byte b, LinkedHashSet linkedHashSet, String str, String str2, long j, Ij ij, Y9 y9, C3715fk c3715fk, yq yqVar, C3979p0 c3979p0, AdConfig adConfig, int i) {
        this(context, b, (i & 4) != 0 ? null : linkedHashSet, (i & 8) != 0 ? null : str, (i & 16) == 0, (i & 32) != 0 ? "DEFAULT" : str2, (i & 64) != 0 ? -1L : j, (i & 128) != 0 ? null : ij, y9, c3715fk, yqVar, c3979p0, adConfig);
    }

    public static final boolean A() {
        ConcurrentHashMap concurrentHashMap = Db.b;
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNull(context);
        Db a2 = Cb.a(context, BuildConfig.FLAVOR);
        Intrinsics.checkNotNullParameter("enableImraidLogs", "key");
        return a2.f6510a.getBoolean("enableImraidLogs", false);
    }

    public static final TelemetryConfig.LandingPageConfig C() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        return ((TelemetryConfig) AbstractC4260z4.f7518a.a(TelemetryConfig.class)).getLpConfig();
    }

    public static final Fk c(Ej ej) {
        return new Fk(ej.k, ej.i);
    }

    public static final Unit f() {
        Ej ej = InMobiAdActivity.u;
        if (ej != null) {
            ej.F();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getAdType$annotations() {
    }

    public static /* synthetic */ void getCloseAssetArea$annotations() {
    }

    public static /* synthetic */ void getImpressionType$annotations() {
    }

    private final TelemetryConfig.LandingPageConfig getLandingPageConfig() {
        return (TelemetryConfig.LandingPageConfig) this.i0.getValue();
    }

    public static /* synthetic */ void getMarkupType$annotations() {
    }

    public static /* synthetic */ void getMarkupTypeAdUnit$annotations() {
    }

    private final AdConfig.MraidConfig getMraidConfig() {
        return getAdConfig().getMraid();
    }

    public static /* synthetic */ void getPlacementType$annotations() {
    }

    private final C4250ym getScrollThrottler() {
        return (C4250ym) this.g0.getValue();
    }

    public static /* synthetic */ void getViewState$annotations() {
    }

    public static /* synthetic */ void getWindowInsetListener$annotations() {
    }

    public static final short m(String str) {
        Intrinsics.checkNotNull(str);
        return Short.parseShort(str);
    }

    private final void setAdSize(String str) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "setAdSize " + this);
        }
        C3900m6 c3900m6 = AbstractC3841k6.f7196a;
        this.r0 = (int) (AbstractC3841k6.b() * Integer.parseInt(((String[]) new Regex("x").split(str, 0).toArray(new String[0]))[0]));
        this.u0 = ((int) (AbstractC3841k6.b() * Integer.parseInt(((String[]) new Regex("x").split(str, 0).toArray(new String[0]))[1]))) * this.r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setOmidViewableAd(Jm trackerAttr) {
        boolean z;
        String str;
        AdSessionContext createHtmlAdSessionContext;
        C4217xg c4217xg = null;
        c4217xg = null;
        c4217xg = null;
        if (this.b1) {
            C3591b9 c3591b9 = this.a1;
            if (c3591b9 != null) {
                Tp viewableAd = this.p0;
                Intrinsics.checkNotNull(viewableAd);
                String str2 = this.s0;
                Intrinsics.checkNotNullParameter(this, "adContainer");
                Intrinsics.checkNotNullParameter(viewableAd, "viewableAd");
                Intrinsics.checkNotNullParameter(trackerAttr, "trackerAttr");
                Context context = (Context) c3591b9.g.get();
                if (context != null) {
                    c3591b9.h = getAdConfig().getViewability().getOmidConfig().getOmidEnabled();
                    CoroutineScope coroutineScope = c3591b9.d;
                    Bf bf = new Bf(c3591b9.d, c3591b9.c);
                    HashMap hashMap = trackerAttr.b;
                    Object obj = hashMap.get("customReferenceData");
                    String str3 = obj instanceof String ? (String) obj : null;
                    Object obj2 = hashMap.get("isolateVerificationScripts");
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    Object obj3 = hashMap.get("macros");
                    Map map = obj3 instanceof Map ? (Map) obj3 : null;
                    List<HtmlOmidTracker> omidTrackers = c3591b9.f7027a.getOmidTrackers();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(omidTrackers, 10));
                    for (Iterator it = omidTrackers.iterator(); it.hasNext(); it = it) {
                        HtmlOmidTracker htmlOmidTracker = (HtmlOmidTracker) it.next();
                        arrayList.add(new Bg(htmlOmidTracker.getVendor(), htmlOmidTracker.getVerificationParams(), htmlOmidTracker.getUrl()));
                    }
                    Ag ag = new Ag(context, this, viewableAd, coroutineScope, bf, new X8(arrayList, map == null ? MapsKt.emptyMap() : map, str3 == null ? "" : str3, str2, Intrinsics.areEqual(bool, Boolean.TRUE)), c3591b9.c);
                    c3591b9.o = ag;
                    c4217xg = ag;
                }
            }
        } else {
            Object obj4 = trackerAttr.b.get("omidAdSession");
            InterfaceC3752h1 interfaceC3752h1 = obj4 instanceof InterfaceC3752h1 ? (InterfaceC3752h1) obj4 : null;
            if (trackerAttr.b.containsKey("deferred")) {
                Object obj5 = trackerAttr.b.get("deferred");
                Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj5).booleanValue()) {
                    z = true;
                    Object obj6 = trackerAttr.b.get("customReferenceData");
                    str = !(obj6 instanceof String) ? (String) obj6 : null;
                    if (z && interfaceC3752h1 != null) {
                        String str4 = this.s0;
                        Gg gg = Fg.f6559a;
                        gg.getClass();
                        Intrinsics.checkNotNullParameter(this, "webView");
                        createHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(gg.b, this, str4, str);
                        Intrinsics.checkNotNullExpressionValue(createHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
                        C3880lg c3880lg = (C3880lg) interfaceC3752h1;
                        if (createHtmlAdSessionContext != null) {
                            c3880lg.c = createHtmlAdSessionContext;
                        }
                    }
                    if (interfaceC3752h1 != null) {
                        Tp tp = this.p0;
                        Intrinsics.checkNotNull(tp);
                        c4217xg = new C4217xg(this, tp, interfaceC3752h1, this.i);
                    }
                }
            }
            z = false;
            Object obj62 = trackerAttr.b.get("customReferenceData");
            if (!(obj62 instanceof String)) {
            }
            if (z) {
                String str42 = this.s0;
                Gg gg2 = Fg.f6559a;
                gg2.getClass();
                Intrinsics.checkNotNullParameter(this, "webView");
                createHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(gg2.b, this, str42, str);
                Intrinsics.checkNotNullExpressionValue(createHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
                C3880lg c3880lg2 = (C3880lg) interfaceC3752h1;
                if (createHtmlAdSessionContext != null) {
                }
            }
            if (interfaceC3752h1 != null) {
            }
        }
        if (c4217xg != null) {
            this.p0 = c4217xg;
            return;
        }
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).b(TAG, this.b1 ? "Failed to create OMID tracked hybrid video ad." : "Did not find a OMID ad session; the IAB decorator will not be applied.");
        }
    }

    public final boolean B() {
        if (Intrinsics.areEqual(getAdType(), "banner") && getAdConfig().getMraid3().getBannerEnabled()) {
            return true;
        }
        return Intrinsics.areEqual(getAdType(), "int") && getAdConfig().getMraid3().getInterstitialEnabled();
    }

    public final void D() {
        Activity activity;
        if (getPlacementType() == 0) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            String str = "onBannerAttachedToWindow " + this;
            if (((Activity) this.v.get()) == null) {
                int upperBoundForActivityContext = getAdConfig().getRendering().getUpperBoundForActivityContext();
                Intrinsics.checkNotNullParameter(this, "<this>");
                int i = 0;
                View view = this;
                loop0: while (true) {
                    activity = null;
                    if (view == null || i >= upperBoundForActivityContext) {
                        break;
                    }
                    Context context = view.getContext();
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    while (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                            break loop0;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    Object parent = view.getParent();
                    view = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                    i++;
                }
                if (activity != null) {
                    this.v = new WeakReference(activity);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    public void E() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "onImpressionFired " + this);
        }
        H();
        C3591b9 c3591b9 = this.a1;
        if (c3591b9 != null) {
            HtmlVideoPlayerConfig htmlVideoPlayerConfig = c3591b9.i;
            Ag ag = c3591b9.o;
            if (ag != null) {
                boolean skippable = htmlVideoPlayerConfig.getSkippable();
                float skipOffset = htmlVideoPlayerConfig.getSkipOffset();
                boolean autoplay = htmlVideoPlayerConfig.getAutoplay();
                if (skippable) {
                    Bf bf = ag.e;
                    if (bf != null) {
                        bf.a(skipOffset, autoplay);
                    }
                } else {
                    Bf bf2 = ag.e;
                    if (bf2 != null) {
                        bf2.a(autoplay);
                    }
                }
                Bf bf3 = ag.e;
                if (bf3 != null) {
                    if (bf3.e == null) {
                        Y9 y92 = bf3.b;
                        if (y92 != null) {
                            ((Z9) y92).a(AbstractC3724g1.f, "Failed to registerImpression: AdEvent is null");
                        }
                    } else {
                        Y9 y93 = bf3.b;
                        if (y93 != null) {
                            ((Z9) y93).a(AbstractC3724g1.f, "registerImpression");
                        }
                        AbstractC4012q5.a(bf3.f7114a, new C3583b1(bf3, null));
                    }
                }
            }
        }
        getListener().a(getTelemetryOnAdImpression());
    }

    public final void F() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "onUserLandingCompleted " + this);
        }
        h("window.imraid.broadcastEvent('onUserLandingCompleted');");
    }

    public final void G() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "processUnload " + this);
        }
        if (this.O.get()) {
            Y9 y92 = this.i;
            if (y92 != null) {
                String TAG2 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((Z9) y92).b(TAG2, "unload called on destroyed view");
                return;
            }
            return;
        }
        if (!B()) {
            Y9 y93 = this.i;
            if (y93 != null) {
                String TAG3 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((Z9) y93).b(TAG3, "mraid 3.0 is not enabled");
                return;
            }
            return;
        }
        if (this.E0) {
            Y9 y94 = this.i;
            if (y94 != null) {
                String TAG4 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((Z9) y94).b(TAG4, "unload called on failed view");
                return;
            }
            return;
        }
        if (this.Q0) {
            return;
        }
        this.Q0 = true;
        Wc wc = (Wc) P6.e.getValue();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Ej$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Ej.a(Ej.this);
            }
        };
        wc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wc.f6931a.post(runnable);
    }

    public final void H() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "recordContextualData " + this);
        }
        C3671e5 c3671e5 = this.Z0;
        if (c3671e5 != null) {
            c3671e5.a();
        }
    }

    public final void I() {
        String str;
        C4201x0 c4201x0;
        String str2;
        String str3;
        String str4;
        C4201x0 c4201x02;
        String str5;
        C4064s1 c4064s1;
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "sendTelemetryEventForNetworkLoad " + this);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            linkedHashMap.put("creativeId", creativeId);
        }
        String impressionId = getImpressionId();
        if (impressionId != null) {
            linkedHashMap.put("impressionId", impressionId);
        }
        linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(this.D0 ? (short) 2212 : (short) 2211));
        Ij ij = this.h;
        if (ij != null && (c4064s1 = ij.j) != null) {
            linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - c4064s1.f7364a.c));
        }
        Ij ij2 = this.h;
        if (ij2 != null && (c4201x02 = ij2.f6630a) != null && (str5 = c4201x02.f) != null) {
            linkedHashMap.put("plType", str5);
        }
        Ij ij3 = this.h;
        if (ij3 != null && (str4 = ij3.f) != null) {
            linkedHashMap.put("creativeType", str4);
        }
        Ij ij4 = this.h;
        if (ij4 != null && (str3 = ij4.b) != null) {
            linkedHashMap.put("markupType", str3);
        }
        Ij ij5 = this.h;
        if (ij5 != null && (c4201x0 = ij5.f6630a) != null && (str2 = c4201x0.e) != null) {
            linkedHashMap.put("adType", str2);
        }
        Ij ij6 = this.h;
        if (ij6 != null && (str = ij6.d) != null) {
            linkedHashMap.put("metadataBlob", str);
        }
        Ij ij7 = this.h;
        if (ij7 != null) {
            linkedHashMap.put("isRewarded", Boolean.valueOf(ij7.h));
        }
        a("NetworkLoadLimitExceeded", (HashMap) linkedHashMap);
    }

    public final void J() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "setCurrentPosition " + this);
        }
        this.F = new JSONObject();
        getLocationOnScreen(new int[2]);
        try {
            JSONObject jSONObject = this.F;
            if (jSONObject != null) {
                jSONObject.put("x", AbstractC3727g4.b(r0[0] / AbstractC3841k6.b()));
            }
            JSONObject jSONObject2 = this.F;
            if (jSONObject2 != null) {
                jSONObject2.put("y", AbstractC3727g4.b(r0[1] / AbstractC3841k6.b()));
            }
            int b = AbstractC3727g4.b(getWidth() / AbstractC3841k6.b());
            int b2 = AbstractC3727g4.b(getHeight() / AbstractC3841k6.b());
            JSONObject jSONObject3 = this.F;
            if (jSONObject3 != null) {
                jSONObject3.put("width", b);
            }
            JSONObject jSONObject4 = this.F;
            if (jSONObject4 != null) {
                jSONObject4.put("height", b2);
            }
        } catch (JSONException unused) {
        }
        synchronized (this.Q) {
            this.H = false;
            this.Q.notifyAll();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void K() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "setDefaultPosition " + this);
        }
        int[] iArr = new int[2];
        this.E = new JSONObject();
        if (this.w == null) {
            ViewParent parent = getParent();
            this.w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        WeakReference weakReference = this.w;
        if ((weakReference != null ? (ViewGroup) weakReference.get() : null) != null) {
            WeakReference weakReference2 = this.w;
            if (weakReference2 != null && (viewGroup3 = (ViewGroup) weakReference2.get()) != null) {
                viewGroup3.getLocationOnScreen(iArr);
            }
            try {
                JSONObject jSONObject = this.E;
                if (jSONObject != null) {
                    jSONObject.put("x", AbstractC3727g4.b(iArr[0] / AbstractC3841k6.b()));
                }
                JSONObject jSONObject2 = this.E;
                if (jSONObject2 != null) {
                    jSONObject2.put("y", AbstractC3727g4.b(iArr[1] / AbstractC3841k6.b()));
                }
                WeakReference weakReference3 = this.w;
                int b = AbstractC3727g4.b(((weakReference3 == null || (viewGroup2 = (ViewGroup) weakReference3.get()) == null) ? 0 : viewGroup2.getWidth()) / AbstractC3841k6.b());
                WeakReference weakReference4 = this.w;
                int b2 = AbstractC3727g4.b(((weakReference4 == null || (viewGroup = (ViewGroup) weakReference4.get()) == null) ? 0 : viewGroup.getHeight()) / AbstractC3841k6.b());
                JSONObject jSONObject3 = this.E;
                if (jSONObject3 != null) {
                    jSONObject3.put("width", b);
                }
                JSONObject jSONObject4 = this.E;
                if (jSONObject4 != null) {
                    jSONObject4.put("height", b2);
                }
            } catch (JSONException unused) {
                Unit unit = Unit.INSTANCE;
            }
        } else {
            try {
                JSONObject jSONObject5 = this.E;
                if (jSONObject5 != null) {
                    jSONObject5.put("x", 0);
                }
                JSONObject jSONObject6 = this.E;
                if (jSONObject6 != null) {
                    jSONObject6.put("y", 0);
                }
                JSONObject jSONObject7 = this.E;
                if (jSONObject7 != null) {
                    jSONObject7.put("width", 0);
                }
                JSONObject jSONObject8 = this.E;
                if (jSONObject8 != null) {
                    jSONObject8.put("height", 0);
                }
            } catch (JSONException unused2) {
                Unit unit2 = Unit.INSTANCE;
            }
        }
        synchronized (this.P) {
            this.G = false;
            this.P.notifyAll();
            Unit unit3 = Unit.INSTANCE;
        }
    }

    public final void L() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "setFallbackImpressionMinPercentageViewed " + this);
        }
        this.z0 = Intrinsics.areEqual("video", this.H0) ? getAdConfig().getViewability().getVideoImpressionMinPercentageViewed() : Intrinsics.areEqual("audio", this.H0) ? Intrinsics.areEqual("audio", getAdType()) ? getAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
    }

    public final void M() {
        this.y0 = Intrinsics.areEqual("video", this.H0) ? getAdConfig().getViewability().getVideoImpressionMinTimeViewed() : Intrinsics.areEqual("audio", this.H0) ? Intrinsics.areEqual("audio", getAdType()) ? getAdConfig().getViewability().getAudioImpressionMinTimeViewed() : getAdConfig().getViewability().getWebImpressionMinTimeViewed() : getAdConfig().getViewability().getWebImpressionMinTimeViewed();
    }

    public final void N() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "setFallbackImpressionParams " + this);
        }
        M();
        L();
        O();
    }

    public final void O() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "setFallbackImpressionType " + this);
        }
        String adType = getAdType();
        this.r = Intrinsics.areEqual(adType, "banner") ? getAdConfig().getViewability().getBannerImpressionType() : Intrinsics.areEqual(adType, "audio") ? getAdConfig().getViewability().getAudioImpressionType() : getAdConfig().getViewability().getInterstitialImpressionType();
    }

    public final void P() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "setImpressionParams " + this);
        }
        if (this.c == null) {
            N();
            return;
        }
        try {
            N();
            for (Jm jm : this.c) {
                if (jm.f6656a == 2) {
                    if (jm.b.containsKey("type")) {
                        Object obj = jm.b.get("type");
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                        this.r = (byte) ((Integer) obj).intValue();
                    } else {
                        O();
                    }
                    if (jm.b.containsKey("time")) {
                        Object obj2 = jm.b.get("time");
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                        this.y0 = ((Integer) obj2).intValue();
                    } else {
                        M();
                    }
                    if (jm.b.containsKey("view")) {
                        Object obj3 = jm.b.get("view");
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                        this.z0 = ((Integer) obj3).intValue();
                    } else {
                        L();
                    }
                    if (this.r == 2) {
                        if (jm.b.containsKey("pixel")) {
                            Object obj4 = jm.b.get("pixel");
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Int");
                            this.v0 = ((Integer) obj4).intValue();
                        } else {
                            O();
                        }
                        if (jm.b.containsKey("frame")) {
                            Object obj5 = jm.b.get("frame");
                            this.t0 = obj5 instanceof int[] ? (int[]) obj5 : null;
                        } else {
                            O();
                        }
                    }
                }
            }
        } catch (JSONException unused) {
            Y9 y92 = this.i;
            if (y92 != null) {
                String TAG2 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((Z9) y92).b(TAG2, "Exception in parsing the impressionType and pixel frame");
            }
            N();
        } catch (Exception unused2) {
            Y9 y93 = this.i;
            if (y93 != null) {
                String TAG3 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((Z9) y93).b(TAG3, "SDK encountered an unexpected error in parsing impression parameters");
            }
            N();
        }
    }

    public final void Q() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "setIsViewHardwareAccelerated " + this);
        }
        this.D = isHardwareAccelerated();
    }

    public final void R() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "skipFromInterActive " + this);
        }
        C3671e5 c3671e5 = this.Z0;
        if (c3671e5 != null) {
            c3671e5.h();
        }
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).a(TAG2, "skipFromInterActive");
        }
    }

    public final void S() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "startTrackingAudioVolume " + this);
        }
        if (!B() || this.e) {
            return;
        }
        r rVar = r.f7338a;
        C3941nj listener = this.w0;
        Y9 y92 = this.i;
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(r.g, null, null, new C3893m(y92, listener, null), 3, null);
    }

    public final void T() {
        Set linkedHashSet;
        Set<View> keySet;
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "startTrackingExposure " + this);
        }
        if (!B() || this.e) {
            Y9 y92 = this.i;
            if (y92 != null) {
                String TAG2 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((Z9) y92).b(TAG2, "exposureTracker is already initialized");
            }
        } else {
            Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
            if (friendlyViews == null || (keySet = friendlyViews.keySet()) == null || (linkedHashSet = CollectionsKt.toMutableSet(keySet)) == null) {
                linkedHashSet = new LinkedHashSet();
            }
            this.M0 = new V(this, linkedHashSet, getAdConfig().getMraid3().getExposureChangeInterval(), this.x0, this.i);
        }
        V v = this.M0;
        if (v != null) {
            v.a();
        }
    }

    public final void U() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "stopTrackingAudioVolume " + this);
        }
        r rVar = r.f7338a;
        C3941nj listener = this.w0;
        Y9 y92 = this.i;
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(r.g, null, null, new C3949o(y92, listener, null), 3, null);
    }

    public final void V() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "stopTrackingExposure " + this);
        }
        V v = this.M0;
        if (v != null) {
            v.b();
        }
    }

    public final void W() {
        new Z3(this, !this.I, !this.L, this.i).a(this.g1);
    }

    public final long X() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "timeSincePodShow " + this);
        }
        InterfaceC4228y0 interfaceC4228y0 = this.o0;
        if (interfaceC4228y0 != null) {
            return ((AbstractC3923n1) interfaceC4228y0).V();
        }
        return 0L;
    }

    public final void Y() {
        getListener().e(this);
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "ad dismissed");
        }
        Y9 y92 = this.i;
        if (y92 != null) {
            ((Z9) y92).a();
        }
        N0 n0 = this.J0;
        if (n0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
            n0 = null;
        }
        if (n0.d.get()) {
            n0.a("session end is already triggered");
            return;
        }
        if (!n0.f6730a.getEnabled()) {
            n0.a("config kill switch - false. ad quality will skip");
        } else if (n0.g == null) {
            n0.a("setup not done. ignore trigger");
        } else {
            n0.d.set(true);
            n0.a(false);
        }
    }

    public final void Z() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "unregisterBackButtonPressedEventListener " + this);
        }
        this.N = null;
    }

    public final void a(C3964od movementGestureDetector) {
        Intrinsics.checkNotNullParameter(movementGestureDetector, "movementGestureDetector");
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(2)) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).c(TAG, "Pan gesture is disabled from config");
                return;
            }
            return;
        }
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            JSONArray jSONArray = movementGestureDetector.j;
            ((Z9) y92).a(TAG2, StringsKt.trimIndent("onPanDetected\n " + (jSONArray != null ? Integer.valueOf(jSONArray.length()) : null) + " \n " + movementGestureDetector.j));
        }
        h("window.imraidview.onGestureDetected('2', '" + movementGestureDetector.j + "');");
    }

    public final void a0() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "updateActivitiesOrientationProperties " + this);
        }
        Activity activity = (Activity) this.u.get();
        if (activity == null || !(activity instanceof InMobiAdActivity)) {
            return;
        }
        Jg orientationProperties = this.I0;
        Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        C4210x9 c4210x9 = ((InMobiAdActivity) activity).f6443a;
        if (c4210x9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orientationHandler");
            c4210x9 = null;
        }
        c4210x9.a(orientationProperties);
    }

    public final void b(C3964od rotationDetector, MotionEvent initialEvent, MotionEvent endEvent) {
        Intrinsics.checkNotNullParameter(rotationDetector, "rotationDetector");
        Intrinsics.checkNotNullParameter(initialEvent, "initialEvent");
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(3)) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).c(TAG, "Rotation gesture is disabled from config");
                return;
            }
            return;
        }
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).a(TAG2, StringsKt.trimIndent(" Rotation detected " + rotationDetector.i + " \n " + initialEvent + " \n " + endEvent));
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(AbstractC3727g4.c(initialEvent.getX())), Integer.valueOf(AbstractC3727g4.c(initialEvent.getY()))})));
        jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(AbstractC3727g4.c(initialEvent.getX(1))), Integer.valueOf(AbstractC3727g4.c(initialEvent.getY(1)))})));
        jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(AbstractC3727g4.c(endEvent.getX())), Integer.valueOf(AbstractC3727g4.c(endEvent.getY()))})));
        jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(AbstractC3727g4.c(endEvent.getX(1))), Integer.valueOf(AbstractC3727g4.c(endEvent.getY(1)))})));
        h("window.imraidview.onGestureDetected('3', '" + jSONArray + "');");
    }

    public final void d(boolean z) {
        Vp vp = z ? Vp.c : Vp.b;
        if (this.K != vp) {
            if (!this.R) {
                this.K = vp;
                if (z) {
                    getListener().i(this);
                }
                c(z);
                N0 n0 = this.J0;
                if (n0 != null) {
                    Vp adViewableStatus = this.K;
                    Intrinsics.checkNotNullParameter(adViewableStatus, "adViewableStatus");
                    n0.h = adViewableStatus;
                }
                q();
            }
            C3591b9 c3591b9 = this.a1;
            if (c3591b9 != null) {
                Y8 y8 = Y8.c;
                Y8 y82 = Y8.e;
                Y8 y83 = Y8.f;
                Y8[] y8Arr = {y8, y82, y83};
                G8[] g8Arr = G8.f6577a;
                if (C3591b9.a(c3591b9, y8Arr, "executeVideoPlayerActions", z ? "show" : "hide", null, 8) && c3591b9.k != z) {
                    c3591b9.k = z;
                    if (!z) {
                        if (C3591b9.a(c3591b9, new Y8[]{y8, y82, y83}, "executeVideoPlayerActions", "hide", null, 8) && c3591b9.j.n.isPlaying()) {
                            c3591b9.j.g();
                            C4043r8 c4043r8 = c3591b9.j;
                            Kh state = Kh.e;
                            c4043r8.getClass();
                            Intrinsics.checkNotNullParameter(state, "state");
                            c4043r8.r = state;
                            return;
                        }
                        return;
                    }
                    if (C3591b9.a(c3591b9, new Y8[]{y8, y82, y83}, "executeVideoPlayerActions", "show", null, 8)) {
                        C4043r8 c4043r82 = c3591b9.j;
                        if (c4043r82.r == Kh.e) {
                            c4043r82.f();
                            C4043r8 c4043r83 = c3591b9.j;
                            Kh state2 = Kh.d;
                            c4043r83.getClass();
                            Intrinsics.checkNotNullParameter(state2, "state");
                            c4043r83.r = state2;
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Float.isNaN(event.getX()) || Float.isNaN(event.getY())) {
            if (!this.L0) {
                Y9 y9 = this.i;
                if (y9 != null) {
                    String TAG = j1;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    ((Z9) y9).b(TAG, "dispatchTouchEvent Invalid Coordinates " + event);
                }
                this.L0 = true;
            }
            return super.dispatchTouchEvent(event);
        }
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).a(TAG2, "dispatchTouchEvent " + this);
        }
        this.C0.a(event);
        if (getAdConfig().getRendering().getUseDispatchTouchEvent()) {
            a(event);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.dispatchTouchEvent(event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        Fj fj;
        if (this.e) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).c(TAG, "view is in-app browser. Using EmbeddedBrowserViewClient.");
            }
            C4153v6 c4153v6 = new C4153v6("IN_CUSTOM_BROWSER", new Function0() { // from class: com.inmobi.media.Ej$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Ej.f();
                }
            }, new Function1() { // from class: com.inmobi.media.Ej$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Ej.a((JSONObject) obj);
                }
            }, new Function2() { // from class: com.inmobi.media.Ej$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Ej.a((String) obj, (Map) obj2);
                }
            }, this.i, this.d1, getAdConfig().getCustomBrowser().getInt().getLoadCompletionDeBounce());
            this.F0 = c4153v6;
            fj = c4153v6;
        } else {
            Y9 y92 = this.i;
            if (y92 != null) {
                String TAG2 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((Z9) y92).c(TAG2, "view is ad. Using RenderViewClient");
            }
            Fj fj2 = new Fj(this.f0, this.i, new Function1() { // from class: com.inmobi.media.Ej$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Ej.a(Ej.this, ((Boolean) obj).booleanValue());
                }
            });
            String adType = getAdType();
            fj2.b = Intrinsics.areEqual(adType, "banner") ? getAdConfig().getRendering().getBannerNetworkLoadsLimit() : Intrinsics.areEqual(adType, "audio") ? getAdConfig().getRendering().getAudioNetworkLoadsLimit() : getAdConfig().getRendering().getOtherNetworkLoadsLimit();
            fj = fj2;
        }
        setWebViewClient(fj);
    }

    public final void g() {
        if (!this.z.compareAndSet(false, true)) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).a(TAG, "broadcastReadyEventToJsBridge skipped; already sent");
                return;
            }
            return;
        }
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).a(TAG2, "broadcastReadyEventToJsBridge " + this);
        }
        h("window.imaiview.broadcastEvent('ready');");
        h("window.mraidview.broadcastEvent('ready');");
    }

    public AdConfig getAdConfig() {
        return this.m;
    }

    public final C3979p0 getAdMetaData() {
        return this.l;
    }

    public final InterfaceC4228y0 getAdPodHandler() {
        return this.o0;
    }

    public final N0 getAdQualityManager() {
        N0 n0 = this.J0;
        if (n0 != null) {
            return n0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
        return null;
    }

    public String getAdType() {
        return this.j0;
    }

    public final boolean getAllowAutoRedirection() {
        return this.n0;
    }

    public final int getArea() {
        return getHeight() * getWidth();
    }

    public final WeakReference<Activity> getBannerHolderActivity() {
        return this.v;
    }

    public final String getBeaconUrl() {
        return this.N0;
    }

    public final Jq getCloseAssetArea() {
        return this.g1;
    }

    public final long getConfiguredArea() {
        return this.u0;
    }

    public Context getContainerContext() {
        Activity activity = (Activity) this.u.get();
        if (activity != null) {
            return activity;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    public final String getContentURL() {
        return this.s0;
    }

    public final C3671e5 getContextualDataHandler() {
        return this.Z0;
    }

    public final String getCreativeID() {
        String creativeId = getCreativeId();
        return creativeId == null ? "" : creativeId;
    }

    public String getCreativeId() {
        return this.c0;
    }

    public final String getCurrentPosition() {
        String jSONObject;
        JSONObject jSONObject2 = this.F;
        return (jSONObject2 == null || (jSONObject = jSONObject2.toString()) == null) ? "" : jSONObject;
    }

    public final Object getCurrentPositionMonitor() {
        return this.Q;
    }

    public final int getCurrentRenderingPodAdIndex() {
        InterfaceC4228y0 interfaceC4228y0 = this.o0;
        if (interfaceC4228y0 != null) {
            return ((AbstractC3923n1) interfaceC4228y0).l(this);
        }
        return 0;
    }

    public Object getDataModel() {
        return null;
    }

    public final String getDefaultPosition() {
        String jSONObject;
        JSONObject jSONObject2 = this.E;
        return (jSONObject2 == null || (jSONObject = jSONObject2.toString()) == null) ? "" : jSONObject;
    }

    public final Object getDefaultPositionMonitor() {
        return this.P;
    }

    public final InterfaceC4097t6 getEmbeddedBrowserJsCallbacks() {
        return this.G0;
    }

    public final V getExposureTracker() {
        return this.M0;
    }

    public Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        return this.k0;
    }

    public final Activity getFullScreenActivity() {
        return (Activity) this.u.get();
    }

    public C getFullScreenEventsListener() {
        return this.e1;
    }

    public String getImpressionId() {
        return this.d;
    }

    public final byte getImpressionType() {
        return this.r;
    }

    public final InterfaceC4072s9 getInAppActivityBrowserClientListener() {
        return this.d1;
    }

    public final String getLandingScheme() {
        return this.f;
    }

    public final Gj getListener() {
        Gj gj = this.x;
        if (gj != null) {
            return gj;
        }
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "listener getter " + this);
        }
        C3826jj c3826jj = i1;
        this.x = c3826jj;
        return c3826jj;
    }

    public final String getMCreativeType() {
        return this.H0;
    }

    public final int getMImpressionMinPercentageViewed() {
        return this.z0;
    }

    public final int getMImpressionMinTimeViewed() {
        return this.y0;
    }

    public final Tp getMViewableAd() {
        return this.p0;
    }

    public String getMarkupType() {
        return this.U0;
    }

    public final String getMarkupTypeAdUnit() {
        return this.U0;
    }

    public final C4187wd getMediaProcessor() {
        return this.C;
    }

    public final int getMinimumPixelsPainted() {
        return this.v0;
    }

    public final String getMraidJsString() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "mraidJsString getter " + this);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("mraid_js_store", "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = Db.b;
        Db a2 = Cb.a(context, "mraid_js_store");
        Intrinsics.checkNotNullParameter("mraid_js_string", "key");
        Intrinsics.checkNotNullParameter("mraid_js_string", "key");
        String string = a2.f6510a.getString("mraid_js_string", null);
        if (string == null) {
            Y9 y92 = this.i;
            if (y92 != null) {
                String TAG2 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((Z9) y92).a(TAG2, "Returning default Mraid Js string.");
            }
            return "var imIsObjValid=function(a){return\"undefined\"!=typeof a&&null!=a?!0:!1},EventListeners=function(a){if(\"undefined\"===typeof a)throw Error(\"EventListeners constructor requires an event name\");this.event=a;this.count=0;var b=[];this.shouldRemember=-1!==[\"exposureChange\"].indexOf(a);this.lastArgs=null;this.add=function(a){b.push(a);++this.count;if(this.shouldRemember&&this.lastArgs)try{a.apply({},this.lastArgs)}catch(e){}};this.remove=function(a){var e=!1,d=this;b=b.filter(function(b){if(b=b===a)--d.count,\ne=!0;return!b});return e};this.removeAll=function(){b=[];this.count=0};this.broadcast=function(a){this.shouldRemember&&(this.lastArgs=a);b.forEach(function(b){try{b.apply({},a)}catch(d){}})};this.toString=function(){var c=[a,\":\"];b.forEach(function(a){c.push(\"|\",String(a),\"|\")});return c.join(\"\")}},InmobiObj=function(){this.listeners=[];this.addEventListener=function(a,b){try{if(imIsObjValid(b)&&imIsObjValid(a)){var c=this.listeners;c[a]||(c[a]=new EventListeners(a));c[a].add(b);\"micIntensityChange\"==\na&&window.imraidview.startListeningMicIntensity();\"deviceMuted\"==a&&window.imraidview.startListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&window.imraidview.startListeningDeviceVolumeChange();\"volumeChange\"==a&&window.imraidview.startListeningVolumeChange();\"headphones\"==a&&window.imraidview.startListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&window.imraidview.startListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&window.imraidview.registerDownloaderCallbacks()}}catch(e){this.log(e)}};\nthis.removeEventListener=function(a,b){if(imIsObjValid(a)){var c=this.listeners;imIsObjValid(c[a])&&(imIsObjValid(b)?c[a].remove(b):c[a].removeAll());\"micIntensityChange\"==a&&0==c[a].count&&window.imraidview.stopListeningMicIntensity();\"deviceMuted\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceVolumeChange();\"volumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningVolumeChange();\"headphones\"==\na&&0==c[a].count&&window.imraidview.stopListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&0==c[a].count&&window.imraidview.stopListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&0==c[a].count&&window.imraidview.unregisterDownloaderCallbacks()}};this.broadcastEvent=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)b[c]=arguments[c];c=b.shift();try{var e=this.listeners;e[c]||(e[c]=new EventListeners(c));e[c].broadcast(b)}catch(d){}}};\nthis.sendSaveContentResult=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)if(2==c){var e=arguments[c],e=JSON.parse(e);b[c]=e}else b[c]=arguments[c];e=b[1];\"success\"!=e&&(c=b[0].substring(b[0].indexOf(\"_\")+1),imraid.saveContentIDMap[c]&&delete imraid.saveContentIDMap[c]);window.imraid.broadcastEvent(b[0],b[1],b[2])}}},__im__iosNativeMessageHandler=void 0;\nwindow.webkit&&(window.webkit.messageHandlers&&window.webkit.messageHandlers.nativeMessageHandler)&&(__im__iosNativeMessageHandler=window.webkit.messageHandlers.nativeMessageHandler);\nvar __im__iosNativeCall={nativeCallInFlight:!1,nativeCallQueue:[],executeNativeCall:function(a){this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=!0,imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=a)},nativeCallComplete:function(a){0==this.nativeCallQueue.length?this.nativeCallInFlight=!1:(a=this.nativeCallQueue.shift(),imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=\na)}},IOSNativeCall=function(){this.urlScheme=\"\";this.executeNativeCall=function(a){if(imIsObjValid(__im__iosNativeMessageHandler)){e={};e.command=a;e.scheme=this.urlScheme;for(var b={},c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b[arguments[c]]=\"\"+d);e.params=b}else for(var e=this.urlScheme+\"://\"+a,d,b=!0,c=1;c<arguments.length;c+=2)d=arguments[c+1],null!=d&&(b?(e+=\"?\",b=!1):e+=\"&\",e+=arguments[c]+\"=\"+escape(d));__im__iosNativeCall.executeNativeCall(e);return\"OK\"};this.nativeCallComplete=\nfunction(a){__im__iosNativeCall.nativeCallComplete(a);return\"OK\"};this.updateKV=function(a,b){this[a]=b;var c=this.broadcastMap[a];c&&this.broadcastEvent(c,b)}};\n(function(){var a=window.mraidview={};a.orientationProperties={allowOrientationChange:!0,forceOrientation:\"none\",direction:\"right\"};var b=[],c=!1;a.detectAndBlockFraud=function(b){a.isPossibleFraud()&&a.fireRedirectFraudBeacon(b);return!1};a.popupBlocked=function(b){a.firePopupBlockedBeacon(b)};a.zeroPad=function(a){var b=\"\";10>a&&(b+=\"0\");return b+a};a.supports=function(a){console.log(\"bridge: supports (MRAID)\");if(\"string\"!=typeof a)window.mraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\n\"supports\");else return\"false\"!=sdkController.supports(\"window.mraidview\",a)};a.useCustomClose=function(a){try{sdkController.useCustomClose(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"use CustomClose: \"+b)}};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};a.stackCommands=function(a,d){c?b.push(a):(eval(a),d&&(c=!0))};a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(a.orientationProperties.allowOrientationChange=\nb.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(a.orientationProperties.forceOrientation=b.forceOrientation)):b=null,sdkController.setOrientationProperties(\"window.mraidview\",a.stringify(a.orientationProperties))}catch(d){imraidview.showAlert(\"setOrientationProperties: \"+d+\", props = \"+b)}};a.getOrientationProperties=function(){return{forceOrientation:a.orientationProperties.forceOrientation,allowOrientationChange:a.orientationProperties.allowOrientationChange}};a.resizeProps=null;\na.open=function(a){\"undefined\"==typeof a&&(a=null);try{sdkController.open(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"open: \"+b)}};a.getScreenSize=function(){try{return eval(\"(\"+sdkController.getScreenSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getScreenSize: \"+a)}};a.getMaxSize=function(){try{return eval(\"(\"+sdkController.getMaxSize(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getMaxSize: \"+a)}};a.getCurrentPosition=function(){try{return eval(\"(\"+sdkController.getCurrentPosition(\"window.mraidview\")+\n\")\")}catch(a){imraidview.showAlert(\"getCurrentPosition: \"+a)}};a.getDefaultPosition=function(){try{return eval(\"(\"+sdkController.getDefaultPosition(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getDefaultPosition: \"+a)}};a.getState=function(){try{return String(sdkController.getState(\"window.mraidview\"))}catch(a){imraidview.showAlert(\"getState: \"+a)}};a.isViewable=function(){if(imraidview.fallbackViewabilityEnabled())return imraidview.checkFallbackViewable();try{return sdkController.isViewable(\"window.mraidview\")}catch(a){imraidview.showAlert(\"isViewable: \"+\na)}};a.getPlacementType=function(){return sdkController.getPlacementType(\"window.mraidview\")};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(a){imraidview.showAlert(\"close: \"+a)}};\"function\"!=typeof String.prototype.startsWith&&(String.prototype.startsWith=function(a){return 0==this.indexOf(a)});a.playVideo=function(a){var b=\"\";null!=a&&(b=a);try{sdkController.playVideo(\"window.mraidview\",b)}catch(c){imraidview.showAlert(\"playVideo: \"+c)}};a.stringify=function(b){if(\"undefined\"===\ntypeof JSON){var d=\"\",c;if(\"undefined\"==typeof b.length)return a.stringifyArg(b);for(c=0;c<b.length;c++)0<c&&(d+=\",\"),d+=a.stringifyArg(b[c]);return d+\"]\"}return JSON.stringify(b)};a.stringifyArg=function(a){var b,c,f;c=typeof a;b=\"\";if(\"number\"===c||\"boolean\"===c)b+=args;else if(a instanceof Array)b=b+\"[\"+a+\"]\";else if(a instanceof Object){c=!0;b+=\"{\";for(f in a)null!==a[f]&&(c||(b+=\",\"),b=b+'\"'+f+'\":',c=typeof a[f],b=\"number\"===c||\"boolean\"===c?b+a[f]:\"function\"===typeof a[f]?b+'\"\"':a[f]instanceof\nObject?b+this.stringify(args[i][f]):b+'\"'+a[f]+'\"',c=!1);b+=\"}\"}else a=a.replace(/\\\\/g,\"\\\\\\\\\"),a=a.replace(/\"/g,'\\\\\"'),b=b+'\"'+a+'\"';imraidview.showAlert(\"json:\"+b);return b};getPID=function(a){var b=\"\";null!=a&&(\"undefined\"!=typeof a.id&&null!=a.id)&&(b=a.id);return b};a.storePicture=function(b){console.log(\"bridge: storePicture\");if(\"string\"!=typeof b)window.mraid.broadcastEvent(\"error\",\"storePicture method expects url as string parameter\",\"storePicture\");else{if(a.supports(\"storePicture\"))return!window.confirm(\"Do you want to download the file?\")?\n(window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled by user.\",\"storePicture\"),!1):sdkController.storePicture(\"window.mraidview\",b);window.mraid.broadcastEvent(\"error\",\"Store picture on \"+b+\" was cancelled because it is unsupported in this device/app.\",\"storePicture\")}};a.fireMediaTrackingEvent=function(a,b){};a.fireMediaErrorEvent=function(a,b){};a.fireMediaTimeUpdateEvent=function(a,b,c){};a.fireMediaCloseEvent=function(a,b,c){};a.fireMediaVolumeChangeEvent=function(a,b,c){};\na.broadcastEvent=function(){window.mraid.broadcastEvent.apply(window.mraid,arguments)};a.unload=function(){try{sdkController.unload(\"window.mraidview\")}catch(a){}};a.getCurrentAppOrientation=function(){var b;switch(a.orientation){case 0:case 180:b=\"portrait\";break;case 90:case 270:b=\"landscape\";break;default:b=\"none\"}return{orientation:b,locked:!1}};a.expand=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.expand(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"executeNativeExpand: \"+\nb+\", URL = \"+a)}};a.setExpandProperties=function(b){try{b?this.props=b:b=null;if(\"undefined\"!=typeof b.lockOrientation&&null!=b.lockOrientation&&\"undefined\"!=typeof b.orientation&&null!=b.orientation){var c={};c.allowOrientationChange=!b.lockOrientation;c.forceOrientation=b.orientation;a.setOrientationProperties(c)}sdkController.setExpandProperties(\"window.mraidview\",a.stringify(b))}catch(k){imraidview.showAlert(\"executeNativesetExpandProperties: \"+k+\", props = \"+b)}};a.getExpandProperties=function(){try{return eval(\"(\"+\nsdkController.getExpandProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getExpandProperties: \"+a)}};a.resizeProps=null;a.setResizeProperties=function(b){var c,k;try{c=parseInt(b.width);k=parseInt(b.height);if(isNaN(c)||isNaN(k)||1>c||1>k)throw\"Invalid\";b.width=c;b.height=k;a.resizeProps=b;sdkController.setResizeProperties(\"window.mraidview\",a.stringify(b))}catch(f){window.mraid.broadcastEvent(\"error\",\"Invalid properties.\",\"setResizeProperties\")}};a.getResizeProperties=function(){try{return eval(\"(\"+\nsdkController.getResizeProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getResizeProperties: \"+a)}};a.resize=function(){if(null==a.resizeProps)window.mraid.broadcastEvent(\"error\",\"Valid resize dimensions must be provided before calling resize\",\"resize\");else try{sdkController.resize(\"window.mraidview\")}catch(b){imraidview.showAlert(\"resize called in bridge\")}}})();\n(function(){var a=window.mraid=new InmobiObj,b=window.mraidview,c=!1;b.isAdShownToUser=!1;b.onUserInteraction=function(){imraidview.onUserInteraction();c=!0};b.isPossibleFraud=function(){return a.supports(\"redirectFraudDetection\")&&(!b.isAdShownToUser||!c)};b.fireRedirectFraudBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var c={};c.trigger=a;c.isAdShown=b.isAdShownToUser.toString();inmobi.recordEvent(135,c)}};b.getSdkVersionInt=function(){for(var a=imraid.getSdkVersion().split(\".\"),\nb=a.length,c=\"\",f=0;f<b;f++)c+=a[f];return parseInt(c)};b.firePopupBlockedBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var b={};b.trigger=a;inmobi.recordEvent(136,b)}};window.onbeforeunload=function(){b.detectAndBlockFraud(\"redirect\")};a.addEventListener(\"viewableChange\",function(a){a&&!b.isAdShownToUser&&(b.isAdShownToUser=!0);\"function\"===typeof b.iosBannerExposureChange&&b.iosBannerExposureChange(a)});a.useCustomClose=b.useCustomClose;a.close=b.close;a.getExpandProperties=\nfunction(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"getExpandProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getExpandProperties is deprecated\",\"getExpandProperties\");return b.getExpandProperties()};a.setExpandProperties=function(c){1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"setExpandProperties\"):(\"undefined\"!=typeof c&&(\"useCustomClose\"in c&&\"undefined\"!=typeof a.getState()&&\"expanded\"!=\na.getState())&&a.useCustomClose(c.useCustomClose),window.mraid.broadcastEvent(\"error\",\"MRAID setExpandProperties is deprecated\",\"setExpandProperties\"),b.setExpandProperties(c))};a.getResizeProperties=function(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"getResizeProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getResizeProperties is deprecated\",\"getResizeProperties\");return b.getResizeProperties()};a.setResizeProperties=function(a){1083<=\nb.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"setResizeProperties\"):(window.mraid.broadcastEvent(\"error\",\"MRAID setResizeProperties is deprecated\",\"setResizeProperties\"),b.setResizeProperties(a))};a.getOrientationProperties=b.getOrientationProperties;a.setOrientationProperties=b.setOrientationProperties;a.expand=function(a){try{1083<=b.getSdkVersionInt()?\"string\"===typeof a&&\"\"!==a.trim()?b.open(a):window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"expand\"):\n(window.mraid.broadcastEvent(\"error\",\"MRAID expand is deprecated\",\"expand\"),b.expand(a))}catch(c){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getMaxSize=b.getMaxSize;a.getState=b.getState;a.isViewable=b.isViewable;a.createCalendarEvent=function(a){window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"createCalendarEvent\")};a.open=function(c){b.detectAndBlockFraud(\"mraid.open\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"open\"):b.open(c))};a.resize=function(){try{1083<=\nb.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"MRAID resize not supported\",\"resize\"):(window.mraid.broadcastEvent(\"error\",\"MRAID resize is deprecated\",\"resize\"),b.expand())}catch(a){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getVersion=function(){return\"3.0\"};a.getPlacementType=b.getPlacementType;a.playVideo=function(a){b.playVideo(a)};a.getScreenSize=b.getScreenSize;a.getCurrentPosition=b.getCurrentPosition;a.getDefaultPosition=b.getDefaultPosition;a.supports=function(a){return b.supports(a)};\na.storePicture=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"storePicture\"):b.storePicture(c)};a.unload=function(){b.unload()};a.getCurrentAppOrientation=b.getCurrentAppOrientation;a.getLocation=function(){return null};a.getAudioVolume=b.getAudioVolume})();\n(function(){var a=window.imraidview={},b=!1,c={RESUME:\"resume\",PAUSE:\"pause\",MUTE:\"mute\",UNMUTE:\"unmute\",SHOW:\"show\",HIDE:\"hide\",SKIP:\"skip\"};a.setOrientationProperties=function(b){try{b?(\"undefined\"!=typeof b.allowOrientationChange&&(mraidview.orientationProperties.allowOrientationChange=b.allowOrientationChange),\"undefined\"!=typeof b.forceOrientation&&(mraidview.orientationProperties.forceOrientation=b.forceOrientation),\"undefined\"!=typeof b.direction&&(mraidview.orientationProperties.direction=\nb.direction)):b=null,sdkController.setOrientationProperties(\"window.imraidview\",mraidview.stringify(mraidview.orientationProperties))}catch(c){a.showAlert(\"setOrientationProperties: \"+c+\", props = \"+b)}};a.getOrientationProperties=function(){return mraidview.orientationProperties};a.firePostStatusEvent=function(a){window.imraid.broadcastEvent(\"postStatus\",a)};a.fireMediaTrackingEvent=function(a,b){var c={};c.name=a;var d=\"inmobi_media_\"+a;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(d=d+\"_\"+b);window.imraid.broadcastEvent(d,\nc)};a.fireMediaErrorEvent=function(a,b){var c={name:\"error\"};c.code=b;var d=\"inmobi_media_\"+c.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(d=d+\"_\"+a);window.imraid.broadcastEvent(d,c)};a.fireMediaTimeUpdateEvent=function(a,b,c){var d={name:\"timeupdate\",target:{}};d.target.currentTime=b;d.target.duration=c;b=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,d)};a.saveContent=function(a,b,c){window.imraid.addEventListener(\"saveContent_\"+a,c);\nsdkController.saveContent(\"window.imraidview\",a,b)};a.cancelSaveContent=function(a){sdkController.cancelSaveContent(\"window.imraidview\",a)};a.disableCloseRegion=function(a){sdkController.disableCloseRegion(\"window.imraidview\",a)};a.fireGalleryImageSelectedEvent=function(a,b,c){var d=new Image;d.src=\"data:image/jpeg;base64,\"+a;d.width=b;d.height=c;window.imraid.broadcastEvent(\"galleryImageSelected\",d)};a.fireCameraPictureCatpturedEvent=function(a,b,c){var d=new Image;d.src=\"data:image/jpeg;base64,\"+\na;d.width=b;d.height=c;window.imraid.broadcastEvent(\"cameraPictureCaptured\",d)};a.fireMediaCloseEvent=function(a,b,c){var d={name:\"close\"};d.viaUserInteraction=b;d.target={};d.target.currentTime=c;b=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,d)};a.fireMediaVolumeChangeEvent=function(a,b,c){var d={name:\"volumechange\",target:{}};d.target.volume=b;d.target.muted=c;b=\"inmobi_media_\"+d.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+\na);window.imraid.broadcastEvent(b,d)};a.fireDeviceMuteChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceMuted\",a)};a.fireDeviceVolumeChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceVolumeChange\",a)};a.fireHeadphonePluggedEvent=function(a){window.imraid.broadcastEvent(\"headphones\",a)};a.showAlert=function(a){sdkController.showAlert(\"window.imraidview\",a)};a.openExternal=function(b,c){try{600<=getSdkVersionInt()?sdkController.openExternal(\"window.imraidview\",b,c):sdkController.openExternal(\"window.imraidview\",\nb)}catch(d){a.showAlert(\"openExternal: \"+d)}};a.log=function(b){try{sdkController.log(\"window.imraidview\",b)}catch(c){a.showAlert(\"log: \"+c)}};a.getPlatform=function(){return\"android\"};a.asyncPing=function(b){try{sdkController.asyncPing(\"window.imraidview\",b)}catch(c){a.showAlert(\"asyncPing: \"+c)}};a.startListeningDeviceMuteEvents=function(){sdkController.registerDeviceMuteEventListener(\"window.imraidview\")};a.stopListeningDeviceMuteEvents=function(){sdkController.unregisterDeviceMuteEventListener(\"window.imraidview\")};\na.startListeningDeviceVolumeChange=function(){sdkController.registerDeviceVolumeChangeEventListener(\"window.imraidview\")};a.stopListeningDeviceVolumeChange=function(){sdkController.unregisterDeviceVolumeChangeEventListener(\"window.imraidview\")};a.startListeningHeadphonePluggedEvents=function(){sdkController.registerHeadphonePluggedEventListener(\"window.imraidview\")};a.stopListeningHeadphonePluggedEvents=function(){sdkController.unregisterHeadphonePluggedEventListener(\"window.imraidview\")};getSdkVersionInt=\nfunction(){for(var b=a.getSdkVersion().split(\".\"),c=b.length,d=\"\",e=0;e<c;e++)d+=b[e];return parseInt(d)};a.getSdkVersionInt=getSdkVersionInt;a.getSdkVersion=function(){return window._im_imaiview.getSdkVersion()};a.supports=function(a){console.log(\"bridge: supports (IMRAID)\");if(\"string\"!=typeof a)window.imraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.imraidview\",a)};a.postToSocial=function(b,c,d,e){window.imraid.broadcastEvent(\"error\",\n\"Method not supported\",\"postToSocial\");a.log(\"Method postToSocial not supported\")};a.incentCompleted=function(a){if(\"object\"!=typeof a||null==a)sdkController.incentCompleted(\"window.imraidview\",null);else try{sdkController.incentCompleted(\"window.imraidview\",JSON.stringify(a))}catch(b){sdkController.incentCompleted(\"window.imraidview\",null)}};a.getOrientation=function(){try{return String(sdkController.getOrientation(\"window.imraidview\"))}catch(b){a.showAlert(\"getOrientation: \"+b)}};a.acceptAction=\nfunction(b){try{sdkController.acceptAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"acceptAction: \"+c+\", params = \"+b)}};a.rejectAction=function(b){try{sdkController.rejectAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"rejectAction: \"+c+\", params = \"+b)}};a.updateToPassbook=function(b){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"updateToPassbook\");a.log(\"Method not supported\")};a.isDeviceMuted=function(){return\"false\"!=sdkController.isDeviceMuted(\"window.imraidview\")};\na.getDeviceVolume=function(){return 603>=getSdkVersionInt()?-1:sdkController.getDeviceVolume(\"window.imraidview\")};a.isHeadPhonesPlugged=function(){return\"false\"!=sdkController.isHeadphonePlugged(\"window.imraidview\")};a.sendSaveContentResult=function(){window.imraid.sendSaveContentResult.apply(window.imraid,arguments)};a.broadcastEvent=function(){window.imraid.broadcastEvent.apply(window.imraid,arguments)};a.disableBackButton=function(a){void 0==a||\"boolean\"!=typeof a?console.log(\"disableBackButton called with invalid params\"):\nsdkController.disableBackButton(\"window.imraidview\",a)};a.isBackButtonDisabled=function(){return sdkController.isBackButtonDisabled(\"window.imraidview\")};a.startListeningForBackButtonPressedEvent=function(){sdkController.registerBackButtonPressedEventListener(\"window.imraidview\")};a.stopListeningForBackButtonPressedEvent=function(){sdkController.unregisterBackButtonPressedEventListener(\"window.imraidview\")};a.hideStatusBar=function(){};a.setOpaqueBackground=function(){};a.startDownloader=function(a,\nb,c){682<=getSdkVersionInt()&&sdkController.startDownloader(\"window.imraidview\",a,b,c)};a.registerDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.registerDownloaderCallbacks(\"window.imraidview\")};a.unregisterDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.unregisterDownloaderCallbacks(\"window.imraidview\")};a.getDownloadProgress=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadProgress(\"window.imraidview\"):-1};a.getDownloadStatus=function(){return 682<=\ngetSdkVersionInt()?sdkController.getDownloadStatus(\"window.imraidview\"):-1};a.fireEvent=function(a){700<=getSdkVersionInt()&&(\"fireSkip\"===a?sdkController.fireSkip(\"window.imraidview\"):\"fireComplete\"===a?sdkController.fireComplete(\"window.imraidview\"):\"showEndCard\"===a&&sdkController.showEndCard(\"window.imraidview\"))};a.saveBlob=function(a){700<=getSdkVersionInt()&&sdkController.saveBlob(\"window.imraidview\",a)};a.getBlob=function(a,b){700<=getSdkVersionInt()&&sdkController.getBlob(a,b)};a.setCloseEndCardTracker=\nfunction(a){700<=getSdkVersionInt()&&sdkController.setCloseEndCardTracker(\"window.imraidview\",a)};a.getRenderableAdIndexes=function(){try{if(917<=getSdkVersionInt())return sdkController.getRenderableAdIndexes(\"window.imraidview\")}catch(a){}return\"[]\"};a.getCurrentRenderingIndex=function(){try{if(917<=getSdkVersionInt())return sdkController.getCurrentRenderingIndex(\"window.imraidview\")}catch(a){}return-1};a.showAd=function(a){try{917<=getSdkVersionInt()&&sdkController.showAd(\"window.imraidview\",a)}catch(b){}};\na.timeSinceShow=function(){try{if(917<=getSdkVersionInt())return sdkController.timeSinceShow(\"window.imraidview\")}catch(a){}return-1};a.getShowTimeStamp=function(){try{if(917<=getSdkVersionInt())return sdkController.getShowTimeStamp(\"window.imraidview\")}catch(a){}return-1};a.closeAll=function(){try{917<=getSdkVersionInt()&&sdkController.closeAll(\"window.imraidview\")}catch(a){}};a.loadAd=function(a){try{917<=getSdkVersionInt()&&sdkController.loadAd(\"window.imraidview\",a)}catch(b){}};a.setAdContext=\nfunction(a){try{917<=getSdkVersionInt()&&sdkController.setAdContext(\"window.imraidview\",a)}catch(b){}};a.getAdContext=function(){try{if(917<=getSdkVersionInt())return sdkController.getAdContext(\"window.imraidview\")}catch(a){}return\"\"};a.openWithoutTracker=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.openWithoutTracker(\"window.imraidview\",a)}catch(b){}};a.openInlineInstaller=function(b,c,d){try{\"undefined\"==typeof b&&(b=null),\"undefined\"==typeof d&&(d=null),sdkController.openInlineInstaller(\"window.imraidview\",\nb,c,d)}catch(e){a.showAlert(\"openInlineInstaller: \"+e)}};a.impressionRendered=function(){window.imraid.broadcastEvent(\"impressionRendered\")};a.customExpandInNative=function(a,b,c){try{void 0==a||\"string\"!=typeof a?console.log(\"url called with invalid params\"):void 0==b||\"number\"!=typeof b?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"boolean\"!=typeof c?console.log(\"hideCloseButton called with invalid params\"):sdkController.customExpandInNative(\"window.imraidview\",a,b,c)}catch(d){}};\na.customExpand=function(b,c,d,e,f){try{void 0==d||\"number\"!=typeof d?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"number\"!=typeof c?console.log(\"inputType called with invalid params\"):void 0==e||\"boolean\"!=typeof e?console.log(\"topNavBarVisible called with invalid params\"):void 0==f||\"boolean\"!=typeof f?console.log(\"bottomNavBarVisible called with invalid params\"):sdkController.customExpand(\"window.imraidview\",b,c,d,e,f)}catch(k){a.showAlert(\"executeNativeCustomExpand: \"+\nk+\", input = \"+b+\", inputType = \"+c+\", screenPercentage = \"+d+\", bottomNavBarVisible = \"+f+\", topNavBarVisible = \"+e)}};a.closeCustomExpand=function(){try{sdkController.closeCustomExpand(\"window.imraidview\")}catch(a){}};a.onGestureDetected=function(a,b){window.imraid.broadcastEvent(\"onGestureDetected\",a,b)};a.onUserLandingCompleted=function(){window.imraid.broadcastEvent(\"onUserLandingCompleted\")};a.onUserInteraction=function(){window.imraid.broadcastEvent(\"onUserInteraction\")};a.impressionFired=\nfunction(){try{sdkController.impressionFired(\"window.imraidview\")}catch(a){}};a.getMaxDeviceVolume=function(){try{return sdkController.getMaxDeviceVolume(\"window.imraidview\")}catch(a){return 15}};a.zoom=function(a){try{sdkController.zoom(\"window.imraidview\",a)}catch(b){}};a.onAudioStateChanged=function(a){try{sdkController.onAudioStateChanged(\"window.imraidview\",a)}catch(b){}};a.submitAdReport=function(a){try{sdkController.submitAdReport(\"window.imraidview\",void 0!=a.adQualityUrl?a.adQualityUrl:null,\nvoid 0!=a.enableUserAdReportScreenshot?a.enableUserAdReportScreenshot:null,void 0!=a.templateInfo?a.templateInfo:null)}catch(b){}};a.logTelemetryEvent=function(a){try{var b=void 0!=a.eventType?a.eventType:null,c=void 0!=a.payload?a.payload:null;a=null;null!=c&&(a=mraidview.stringify(c));sdkController.logTelemetryEvent(\"window.imraidview\",b,a)}catch(d){}};a.onUserAudioMuteInteraction=function(a){try{sdkController.onUserAudioMuteInteraction(\"window.imraidview\",a)}catch(b){}};a.enableFallbackViewabilityFunctionality=\nfunction(){b=!0;a.checkFallbackViewable()&&window.mraid.broadcastEvent(\"viewableChange\",!0);mraid.addEventListener(\"sizeChange\",function(){window.mraid.broadcastEvent(\"viewableChange\",a.checkFallbackViewable())})};a.checkFallbackViewable=function(){try{var b=mraidview.getCurrentPosition(),c=b.height;return 40<=b.width&&40<=c?!0:!1}catch(d){a.showAlert(\"checkFallbackViewable: \"+d)}};a.fallbackViewabilityEnabled=function(){return b};a.getSafeArea=function(){try{return JSON.parse(sdkController.getSafeArea(\"window.imraidview\"))}catch(a){return null}};\na.loadWebView=function(b,c){try{\"string\"!==typeof b?a.showAlert(\"loadWebView: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"loadWebView: html parameter should be a string\"):sdkController.loadWebView(\"window.imraidview\",b,c)}catch(d){a.showAlert(\"loadWebView: \"+d)}};a.showWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"showWebView: id parameter should be a string\"):sdkController.showWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"showWebView: \"+c)}};a.sendMessage=\nfunction(b,c){try{\"string\"!==typeof b?a.showAlert(\"sendMessage: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"sendMessage: message parameter should be a string\"):sdkController.sendMessage(\"window.imraidview\",b,c)}catch(d){a.showAlert(\"sendMessage: \"+d)}};a.destroyWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"destroyWebView: id parameter should be a string\"):sdkController.destroyWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"destroyWebView: \"+c)}};a.pingV2=function(b){if(\"object\"===\ntypeof b&&null!==b)try{sdkController.pingV2(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"pingV2: \"+c)}else a.showAlert(\"pingV2: pingJson is not a valid JSON object\")};a.enableNativeGestures=function(b){try{\"boolean\"!==typeof b?a.log(\"enableNativeGestures: 'enabled' must be a boolean.\"):sdkController.enableNativeGestures(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableNativeGestures: \"+c)}};a.enableTouchBeginCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):\nsdkController.enableTouchBeginCallback(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableTouchBeginCallback: \"+c)}};a.enableTouchEndCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):sdkController.enableTouchEndCallback(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableTouchEndCallback: \"+c)}};var e=function(){try{var a=window.mraidview.getSdkVersionInt();return 1110===a||1111===a}catch(b){return!1}},d=0,k=function(a,b){var c=Number(a);return!isNaN(c)&&\nisFinite(c)?Math.round(c*b):a};a.createVideoPlayer=function(b){try{if(!(0<d))try{d=\"number\"===typeof window.devicePixelRatio&&0<window.devicePixelRatio?window.devicePixelRatio:1}catch(c){d=1}if(e())try{var f=b.config;\"undefined\"!==typeof f.playbackUpdateInterval&&null!==f.playbackUpdateInterval&&(f.playbackInterval=f.playbackUpdateInterval);var g=f.videoViewPosition;null!==g&&(\"undefined\"!==typeof g&&\"undefined\"!==typeof g.x&&null!==g.x)&&(g.x=k(g.x,d));null!==g&&(\"undefined\"!==typeof g&&\"undefined\"!==\ntypeof g.y&&null!==g.y)&&(g.y=k(g.y,d))}catch(l){a.showAlert(\"applyCreateVideoPlayerContractPatch: \"+l)}h();n();sdkController.createVideoPlayer(\"window.imraidview\",JSON.stringify(b))}catch(r){a.showAlert(\"createVideoPlayer: \"+r)}};a.updateVideoPosition=function(b){try{sdkController.updateVideoPosition(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"updateVideoPosition: \"+c)}};a.executeVideoPlayerActions=function(b,d){try{if(!Object.values(c).includes(b))throw Error(\"Invalid videoCommand\");\nsdkController.executeVideoPlayerActions(\"window.imraidview\",b,JSON.stringify(d))}catch(e){a.showAlert(\"executeVideoPlayerActions: \"+e)}};a.getPlaybackState=function(){try{return sdkController.getPlaybackState(\"window.imraidview\")}catch(b){return a.showAlert(\"getPlaybackState: \"+b),null}};a.destroyVideoPlayer=function(){try{l(),sdkController.destroyVideoPlayer(\"window.imraidview\")}catch(b){a.showAlert(\"destroyVideoPlayer: \"+b)}};var f=null,g=!1,h=function(){if(!g&&e())try{f=window.imraid.broadcastEvent,\nwindow.imraid.broadcastEvent=function(b){try{if(1<arguments.length&&\"VideoPlayerPosition\"===arguments[0]&&window.mraidview){var c=arguments[1];c&&(\"undefined\"!==typeof c.x&&null!==c.x)&&(c.x=k(c.x,1/d));c&&(\"undefined\"!==typeof c.y&&null!==c.y)&&(c.y=k(c.y,1/d))}if(\"function\"===typeof f)return f.apply(this,arguments)}catch(e){a.showAlert(\"originalBroadcastEvent failed: \"+e)}},g=!0}catch(b){l(),a.showAlert(\"Registering listener failed: \"+b)}},l=function(){try{g&&(window.imraid.broadcastEvent=f,f=null,\ng=!1)}catch(b){a.showAlert(\"Unregistering listener failed: \"+b)}},n=function(){try{if(window.imraid&&!(\"function\"!==typeof window.imraid.addEventListener||\"function\"!==typeof window.imraid.broadcastEvent)&&!window.imraid.__videoErrorRelaysRegistered)window.imraid.addEventListener(\"VideoPlaybackError\",function(b){try{window.imraid.broadcastEvent(\"error\",{command:\"VideoPlayerError\",errorCode:b&&b.errorCode},\"VideoPlaybackError\")}catch(c){a.showAlert(\"VideoPlaybackError relay failed: \"+c)}}),window.imraid.addEventListener(\"VideoCommandError\",\nfunction(b){try{window.imraid.broadcastEvent(\"error\",{command:b&&b.jsCommand,errorMsg:b&&b.errorMessage},\"VideoCommandError\")}catch(c){a.showAlert(\"VideoCommandError relay failed: \"+c)}}),window.imraid.__videoErrorRelaysRegistered=!0}catch(b){a.showAlert(\"registerVideoErrorRelays failed: \"+b)}}})();\n(function(){var a=window.imraid=new InmobiObj,b=window.imraidview;a.getOrientation=b.getOrientation;a.setOrientationProperties=b.setOrientationProperties;a.getOrientationProperties=b.getOrientationProperties;a.saveContentIDMap={};a.saveContent=function(c,e,f){var g=arguments.length,h,l=null;if(3>g){if(\"function\"===typeof arguments[g-1])h=arguments[g-1];else return;l={reason:1}}else a.saveContentIDMap[c]&&(h=arguments[2],l={reason:11,url:arguments[1]});\"function\"!==!h&&(l?(window.imraid.addEventListener(\"saveContent_failed_\"+\nc,h),window.imraid.sendSaveContentResult(\"saveContent_failed_\"+c,\"failed\",JSON.stringify(l))):(a.removeEventListener(\"saveContent_\"+c),a.saveContentIDMap[c]=!0,b.saveContent(c,e,f)))};a.cancelSaveContent=function(a){b.cancelSaveContent(a)};a.asyncPing=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"asyncPing\"):b.asyncPing(c)};a.disableCloseRegion=b.disableCloseRegion;a.getSdkVersion=b.getSdkVersion;a.log=function(c){\"undefined\"==typeof c?a.broadcastEvent(\"error\",\"message is required.\",\n\"log\"):\"string\"==typeof c?b.log(c):b.log(JSON.stringify(c))};a.getInMobiAIVersion=function(){return\"2.0\"};a.getVendorName=function(){return\"inmobi\"};a.openExternal=function(a,c){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imraid.openExternal\")||b.openExternal(a,c)};a.updateToPassbook=function(c){mraidview.detectAndBlockFraud(\"imraid.updateToPassbook\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"updateToPassbook\"):\nb.updateToPassbook(c))};a.postToSocial=function(a,c,e,g){mraidview.detectAndBlockFraud(\"imraid.postToSocial\")||b.postToSocial(a,c,e,g)};a.getPlatform=b.getPlatform;a.incentCompleted=b.incentCompleted;a.loadSKStore=b.loadSKStore;a.showSKStore=function(a){mraidview.detectAndBlockFraud(\"imraid.showSKStore\")||b.showSKStore(a)};a.pingV2=b.pingV2;a.enableHitTest=b.enableHitTest;a.enableNativeGestures=b.enableNativeGestures;a.enableTouchBeginCallback=b.enableTouchBeginCallback;a.enableTouchEndCallback=b.enableTouchEndCallback;\na.skoverlay=b.skoverlay;a.skoverlayWithSkan=b.skoverlayWithSkan;a.zoom=b.zoom;a.dismissSKOverlay=b.dismissSKOverlay;a.supports=function(a){return b.supports(a)};a.isDeviceMuted=function(){return!imIsObjValid(a.listeners.deviceMuted)?-1:b.isDeviceMuted()};a.isHeadPhonesPlugged=function(){return!imIsObjValid(a.listeners.headphones)?!1:b.isHeadPhonesPlugged()};a.getDeviceVolume=function(){return b.getDeviceVolume()};a.setDeviceVolume=function(a){b.setDeviceVolume(a)};a.hideStatusBar=function(){b.hideStatusBar()};\na.setOpaqueBackground=function(){b.setOpaqueBackground()};a.getRenderableAdIndexes=b.getRenderableAdIndexes;a.getCurrentRenderingIndex=b.getCurrentRenderingIndex;a.showAd=b.showAd;a.timeSinceShow=b.timeSinceShow;a.closeAll=b.closeAll;a.loadAd=b.loadAd;a.setAdContext=b.setAdContext;a.getAdContext=b.getAdContext;a.getShowTimeStamp=b.getShowTimeStamp;a.disableBackButton=b.disableBackButton;a.isBackButtonDisabled=b.isBackButtonDisabled;a.startDownloader=b.startDownloader;a.getDownloadProgress=b.getDownloadProgress;\na.getDownloadStatus=b.getDownloadStatus;a.fireEvent=b.fireEvent;a.saveBlob=b.saveBlob;a.getBlob=b.getBlob;a.setCloseEndCardTracker=b.setCloseEndCardTracker;a.openWithoutTracker=b.openWithoutTracker;a.openInlineInstaller=b.openInlineInstaller;a.impressionRendered=b.impressionRendered;a.onGestureDetected=b.onGestureDetected;a.onUserLandingCompleted=b.onUserLandingCompleted;a.customExpand=b.customExpand;a.closeCustomExpand=b.closeCustomExpand;a.customExpandInNative=b.customExpandInNative;a.impressionFired=\nb.impressionFired;a.getImraidVersion=b.getImraidVersion;a.getMaxDeviceVolume=b.getMaxDeviceVolume;a.onAudioStateChanged=b.onAudioStateChanged;a.onUserAudioMuteInteraction=b.onUserAudioMuteInteraction;a.submitAdReport=b.submitAdReport;a.enableFallbackViewabilityFunctionality=b.enableFallbackViewabilityFunctionality;a.logTelemetryEvent=b.logTelemetryEvent;a.getSafeArea=b.getSafeArea;a.onReceviedSKANCallback=b.onReceviedSKANCallback;a.getOpenMode=b.getOpenMode;a.loadWebView=b.loadWebView;a.showWebView=\nb.showWebView;a.sendMessage=b.sendMessage;a.destroyWebView=b.destroyWebView;a.createVideoPlayer=function(a){b.createVideoPlayer(a)};a.updateVideoPosition=function(a){b.updateVideoPosition(a)};a.executeVideoPlayerActions=function(a,c){b.executeVideoPlayerActions(a,c)};a.getPlaybackState=function(){return b.getPlaybackState()};a.destroyVideoPlayer=function(){b.destroyVideoPlayer()};try{a.addEventListener(\"onUserLandingCompleted\",function(){1080>b.getSdkVersionInt()&&a.broadcastEvent(\"onUserLandingInitialized\")})}catch(c){}try{a.addEventListener(\"orientationChange\",\nfunction(a){\"function\"===typeof b.fireSafeAreaChangeEventOnOrientationChange&&b.fireSafeAreaChangeEventOnOrientationChange(a)})}catch(e){b&&\"function\"===typeof b.log&&b.log(\"orientationChange listener registration failed: \"+e)}})();\n(function(){var a=window._im_imaiview={ios:{}};window.imaiview=a;a.broadcastEvent=function(){for(var a=Array(arguments.length),c=0;c<arguments.length;c++)a[c]=arguments[c];c=a.shift();try{window.mraid.broadcastEvent(c,a)}catch(e){}};a.getPlatform=function(){return\"android\"};a.getPlatformVersion=function(){return sdkController.getPlatformVersion(\"window.imaiview\")};a.log=function(a){sdkController.log(\"window.imaiview\",a)};a.openEmbedded=function(a){sdkController.openEmbedded(\"window.imaiview\",a)};\na.openExternal=function(a,c){600<=getSdkVersionInt()?sdkController.openExternal(\"window.imaiview\",a,c):sdkController.openExternal(\"window.imaiview\",a)};a.ping=function(a,c){sdkController.ping(\"window.imaiview\",a,c)};a.pingInWebView=function(a,c){sdkController.pingInWebView(\"window.imaiview\",a,c)};a.getSdkVersion=function(){try{var a=sdkController.getSdkVersion(\"window.imaiview\");if(\"string\"==typeof a&&null!=a)return a}catch(c){return\"3.7.0\"}};a.onUserInteraction=function(a){if(\"object\"!=typeof a||\nnull==a)sdkController.onUserInteraction(\"window.imaiview\",null);else try{sdkController.onUserInteraction(\"window.imaiview\",JSON.stringify(a))}catch(c){sdkController.onUserInteraction(\"window.imaiview\",null)}};a.fireAdReady=function(){sdkController.fireAdReady(\"window.imaiview\")};a.fireAdFailed=function(a){try{\"number\"===typeof a&&Number.isFinite(a)&&1120<=getSdkVersionInt()?sdkController.fireAdFailed(\"window.imaiview\",a):sdkController.fireAdFailed(\"window.imaiview\")}catch(c){sdkController.fireAdFailed(\"window.imaiview\")}};\na.broadcastEvent=function(){window.imai.broadcastEvent.apply(window.imai,arguments)}})();\n(function(){var a=window._im_imaiview;window._im_imai=new InmobiObj;window._im_imai.ios=new InmobiObj;var b=window._im_imai;window.imai=window._im_imai;b.matchString=function(a,b){if(\"string\"!=typeof a||null==a||null==b)return-1;var d=-1;try{d=a.indexOf(b)}catch(k){}return d};b.isHttpUrl=function(a){return\"string\"!=typeof a||null==a?!1:0==b.matchString(a,\"http://\")?!0:0==b.matchString(a,\"https://\")?!0:!1};b.appendTapParams=function(a,e,d){if(!imIsObjValid(e)||!imIsObjValid(d))return a;b.isHttpUrl(a)&&\n(a=-1==b.matchString(a,\"?\")?a+(\"?u-tap-o=\"+e+\",\"+d):a+(\"&u-tap-o=\"+e+\",\"+d));return a};b.performAdClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,k=a.landingConfig;if(!imIsObjValid(d)&&!imIsObjValid(k))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var f=null,g=null,h=null,l=null,n=null,m=null,q=null,p=null;if(imIsObjValid(e))try{l=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(s){n=\nl=0}imIsObjValid(k)?imIsObjValid(d)?(m=k.url,q=k.fallbackUrl,p=k.urlType,f=d.url,g=d.pingWV,h=d.fr):(m=k.url,p=k.urlType):(m=d.url,p=d.urlType);d=b.getPlatform();try{if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"boolean\"!=typeof g&&\"number\"!=typeof g||null==g)g=!0;if(0>g||1<g)g=!0;if(\"number\"!=typeof p||null==p)p=0;f=b.appendTapParams(f,l,n);imIsObjValid(f)?!0==g?b.pingInWebView(f,h):b.ping(f,h):b.log(\"clickurl provided is null.\");if(imIsObjValid(m))switch(imIsObjValid(f)||\n(m=b.appendTapParams(m,l,n)),p){case 1:b.openEmbedded(m);break;case 2:\"ios\"==d?b.ios.openItunesProductView(m):this.broadcastEvent(\"error\",\"Cannot process openItunesProductView for os\"+d);break;default:b.openExternal(m,q)}else b.log(\"Landing url provided is null.\")}catch(t){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.performActionClick=function(a,e){e=e||event;if(imIsObjValid(a)){var d=a.clickConfig,k=a.landingConfig;\nif(!imIsObjValid(d)&&!imIsObjValid(k))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var f=null,g=null,h=null,l=null,n=null;if(imIsObjValid(e))try{l=e.changedTouches[0].pageX,n=e.changedTouches[0].pageY}catch(m){n=l=0}imIsObjValid(d)&&(f=d.url,g=d.pingWV,h=d.fr);try{if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"boolean\"!=typeof g&&\"number\"!=typeof g||null==g)g=\n!0;if(0>g||1<g)g=!0;f=b.appendTapParams(f,l,n);imIsObjValid(f)?!0==g?b.pingInWebView(f,h):b.ping(f,h):b.log(\"clickurl provided is null.\");b.onUserInteraction(k)}catch(q){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.getVersion=function(){return\"1.0\"};b.getPlatform=a.getPlatform;b.getPlatformVersion=a.getPlatformVersion;b.log=a.log;b.openEmbedded=function(b){console.log(\"openEmbedded is deprecated, will be removed in future version\");\nmraidview.detectAndBlockFraud(\"imai.openEmbedded\")||a.openEmbedded(b)};b.openExternal=function(b,e){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imai.openExternal\")||a.openExternal(b,e)};b.ping=a.ping;b.pingInWebView=a.pingInWebView;b.onUserInteraction=a.onUserInteraction;b.getSdkVersion=a.getSdkVersion;b.loadSKStore=a.loadSKStore;b.showSKStore=function(b){mraidview.detectAndBlockFraud(\"imai.showSKStore\")||a.showSKStore(b)};b.ios.openItunesProductView=\nfunction(b){mraidview.detectAndBlockFraud(\"imai.ios.openItunesProductView\")||a.ios.openItunesProductView(b)};b.fireAdReady=a.fireAdReady;b.fireAdFailed=a.fireAdFailed})();";
        }
        Y9 y93 = this.i;
        if (y93 != null) {
            String TAG3 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((Z9) y93).a(TAG3, "Returning fetched Mraid Js string.");
        }
        return string;
    }

    public final Jg getOrientationProperties() {
        return this.I0;
    }

    public final long getPlacementId() {
        return this.b0;
    }

    public byte getPlacementType() {
        return this.b;
    }

    public final HtmlVideoPlaybackState getPlaybackState() {
        C3591b9 c3591b9 = this.a1;
        if (c3591b9 == null) {
            return null;
        }
        Y8 y8 = Y8.f6968a;
        Y8[] y8Arr = {y8, Y8.b, Y8.c, Y8.d, Y8.e, Y8.f, Y8.g};
        G8[] g8Arr = G8.f6577a;
        if (!C3591b9.a(c3591b9, y8Arr, "getVideoPlayerState", "getPlaybackState", null, 8)) {
            return new HtmlVideoPlaybackState();
        }
        if (c3591b9.p.get() == y8) {
            c3591b9.a("getVideoPlayerState", "Playback state requested before load", (String) null);
        }
        return c3591b9.j.b();
    }

    public D getReferenceContainer() {
        return this.m0;
    }

    public final Oj getRenderViewTelemetry() {
        return this.f0;
    }

    public final JSONArray getRenderableAdIndexes() {
        InterfaceC4228y0 interfaceC4228y0 = this.o0;
        return interfaceC4228y0 != null ? ((AbstractC3923n1) interfaceC4228y0).w() : new JSONArray();
    }

    public final AdConfig.RenderingConfig getRenderingConfig() {
        return getAdConfig().getRendering();
    }

    public final C3715fk getRoute() {
        return this.j;
    }

    public final JSONObject getSafeArea() {
        Lq lq = this.P0;
        if (lq != null) {
            Integer f = AbstractC3841k6.f();
            Kq kq = (f == null && (f = AbstractC3841k6.g) == null) ? null : (Kq) lq.d.get(Integer.valueOf(f.intValue()));
            if (kq != null) {
                return kq.a();
            }
        }
        return null;
    }

    public final boolean getShouldFireLandingPageBeacons() {
        return this.O0;
    }

    public final long getShowTimeStamp() {
        InterfaceC4228y0 interfaceC4228y0 = this.o0;
        if (interfaceC4228y0 != null) {
            return ((AbstractC3923n1) interfaceC4228y0).x();
        }
        return 0L;
    }

    public final Fk getSiblingWebviewManager() {
        return (Fk) this.t.getValue();
    }

    public Map<String, C4092t1> getTelemetryManagerMap() {
        return this.R0;
    }

    public C4113tm getTelemetryOnAdImpression() {
        Map<String, C4092t1> telemetryManagerMap = getTelemetryManagerMap();
        return new C4113tm(telemetryManagerMap != null ? telemetryManagerMap.get("AdImpressionSuccessful") : null, this.H0, getCreativeId(), getImpressionId(), getMarkupType());
    }

    public final boolean getUnloaded() {
        return this.Q0;
    }

    public final Zp getVISIBILITY_CHANGE_LISTENER() {
        return this.X0;
    }

    public View getVideoContainerView() {
        return null;
    }

    public final String getViewState() {
        return this.B;
    }

    @Override // com.inmobi.media.Ji
    public long getViewTouchTimestamp() {
        return this.g;
    }

    @Override // com.inmobi.media.D
    public Tp getViewableAd() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "viewableAd getter " + this);
        }
        if (this.p0 == null) {
            this.p0 = new C3961oa(this, new Up(this), new T7(this.r, this.H0, this.y0, this.z0, getVisibilityTrackingMinPercentage(), this.i), this.i);
            Set<Jm> set = this.c;
            if (set != null) {
                for (Jm jm : set) {
                    try {
                        if (jm.f6656a == 3) {
                            setOmidViewableAd(jm);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Exception e) {
                        Y9 y92 = this.i;
                        if (y92 != null) {
                            String TAG2 = j1;
                            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                            ((Z9) y92).b(TAG2, "Exception occurred while creating the HTML viewable ad : " + e.getMessage());
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        Tp tp = this.p0;
        Intrinsics.checkNotNull(tp);
        return tp;
    }

    public final int[] getViewableFrameArray() {
        return this.t0;
    }

    public final int getVisibilityTrackingMinPercentage() {
        return Intrinsics.areEqual("audio", getAdType()) ? getAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
    }

    public final yq getWebViewFactory() {
        return this.k;
    }

    public final Iq getWindowInsetListener() {
        return this.T0;
    }

    public final Sk getWvStateMachine() {
        return this.s;
    }

    public final void h() {
        String TAG = j1;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        String str = "cancelHtmlUrlPrefetch " + this;
        Job job = this.A;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.A = null;
    }

    public final void i(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        Oj oj = this.f0;
        if (oj != null) {
            oj.b();
        }
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "loadDataInWebView " + this);
        }
        this.R = false;
        if (this.O.get()) {
            return;
        }
        loadDataWithBaseURL("", content, "text/html", "UTF-8", null);
    }

    public final void j(String str) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "loadScript " + this);
        }
        loadUrl(str);
    }

    public final void k() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "deferredDestroy " + this);
        }
        super.destroy();
    }

    public final void l() {
        if (this.O.get()) {
            return;
        }
        if (!this.J) {
            this.J = true;
            return;
        }
        h();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.e0;
        if (onGlobalLayoutListener != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            this.e0 = null;
        }
        this.O.set(true);
        this.k.a(this.j.b);
        Lq lq = this.P0;
        if (lq != null) {
            lq.a();
        }
        C3671e5 c3671e5 = this.Z0;
        if (c3671e5 != null) {
            c3671e5.b();
        }
        this.R = true;
        this.V = -1;
        C3591b9 c3591b9 = this.a1;
        if (c3591b9 != null) {
            Y9 y9 = c3591b9.c;
            if (y9 != null) {
                ((Z9) y9).a("HybridVideoPlayerHandler", "destroy");
            }
            c3591b9.a();
            c3591b9.m = null;
            Ag ag = c3591b9.o;
            if (ag != null) {
                Y9 y92 = ag.g;
                if (y92 != null) {
                    Intrinsics.checkNotNullExpressionValue("Ag", "TAG");
                    ((Z9) y92).c("Ag", "stopOmidSession");
                }
                Bf bf = ag.e;
                if (bf != null) {
                    if (bf.c == null) {
                        Y9 y93 = bf.b;
                        if (y93 != null) {
                            ((Z9) y93).a(AbstractC3724g1.f, "Failed to stopAdSession. adSession is null");
                        }
                    } else {
                        Y9 y94 = bf.b;
                        if (y94 != null) {
                            ((Z9) y94).a(AbstractC3724g1.f, "stopAdSession");
                        }
                        AdSession adSession = bf.c;
                        if (adSession != null) {
                            adSession.finish();
                        }
                        bf.c = null;
                    }
                }
            }
            c3591b9.o = null;
            AbstractC3727g4.a(c3591b9.d);
        }
        this.a1 = null;
        removeJavascriptInterface("sdkController");
        C4187wd c4187wd = this.C;
        if (c4187wd != null) {
            C3567ad c3567ad = c4187wd.d;
            if (c3567ad != null) {
                c3567ad.a();
            }
            c4187wd.d = null;
            C3567ad c3567ad2 = c4187wd.e;
            if (c3567ad2 != null) {
                c3567ad2.a();
            }
            c4187wd.e = null;
            C3567ad c3567ad3 = c4187wd.f;
            if (c3567ad3 != null) {
                c3567ad3.a();
            }
            c4187wd.f = null;
        }
        this.u.clear();
        this.v.clear();
        WeakReference weakReference = this.w;
        if (weakReference != null) {
            weakReference.clear();
        }
        Tp tp = this.p0;
        if (tp != null) {
            tp.e();
        }
        Tp tp2 = this.p0;
        if (tp2 != null) {
            tp2.a();
        }
        C3939nh c3939nh = this.h0;
        if (c3939nh != null) {
            C3931n9 c3931n9 = (C3931n9) Zg.c.getValue();
            String id = c3939nh.c;
            c3931n9.getClass();
            Intrinsics.checkNotNullParameter(id, "id");
            c3931n9.b.remove(id);
            Iterator it = c3931n9.b.entrySet().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                    it.remove();
                }
            }
            Q5 q5 = (Q5) Zg.d.getValue();
            String id2 = c3939nh.c;
            q5.getClass();
            Intrinsics.checkNotNullParameter(id2, "id");
            q5.b.remove(id2);
            Iterator it2 = q5.b.entrySet().iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
                if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                    it2.remove();
                }
            }
            c3939nh.d.set(true);
        }
        this.h0 = null;
        V();
        U();
        Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.clear();
        }
        setFriendlyViews(null);
        this.G0 = null;
        this.x = null;
        this.m0 = null;
        this.o0 = null;
        this.D0 = false;
        this.d1 = null;
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.g, null, null, new C4026qj(viewGroup, this, null), 3, null);
        }
    }

    public final void n() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "dismissCurrentIntAdViewContainerInShowNextPodFlow " + this);
        }
        C4187wd c4187wd = this.C;
        if (c4187wd != null) {
            C3764hd c3764hd = c4187wd.c;
            if (c3764hd != null) {
                c3764hd.b();
            }
            c4187wd.c = null;
        }
        if (Intrinsics.areEqual(Profile.DEFAULT_PROFILE_NAME, this.B)) {
            setAndUpdateViewState("Hidden");
            if (getParent() instanceof ViewGroup) {
                this.k.b(new Function1() { // from class: com.inmobi.media.Ej$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Ej.b((Mj) obj);
                    }
                });
            }
            SparseArray sparseArray = InMobiAdActivity.t;
            Intrinsics.checkNotNullParameter(this, "container");
            InMobiAdActivity.t.remove(hashCode());
        }
    }

    public void o() {
        InterfaceC4228y0 interfaceC4228y0;
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "dismissCurrentViewContainer " + this);
        }
        C4187wd c4187wd = this.C;
        if (c4187wd != null) {
            C3764hd c3764hd = c4187wd.c;
            if (c3764hd != null) {
                c3764hd.b();
            }
            c4187wd.c = null;
        }
        if (Intrinsics.areEqual(Profile.DEFAULT_PROFILE_NAME, this.B)) {
            setAndUpdateViewState("Hidden");
            ViewParent parent = getParent();
            boolean z = parent instanceof ViewGroup;
            if (z) {
                this.k.b(new Function1() { // from class: com.inmobi.media.Ej$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Ej.c((Mj) obj);
                    }
                });
            }
            if (1 == this.b) {
                p();
            } else if (z) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        if (this.K != Vp.c || (interfaceC4228y0 = this.o0) == null) {
            return;
        }
        interfaceC4228y0.a(this, getFullScreenActivity());
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C3685ej c3685ej;
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "onAttachedToWindow " + this);
        }
        super.onAttachedToWindow();
        if (!this.e) {
            if (Intrinsics.areEqual(this.j.b, BuildConfig.FLAVOR)) {
                getListener().d(this);
            }
            if (getAdConfig().getRendering().getEnableActivityContextOnBannerAttach()) {
                D();
            }
        }
        C4187wd c4187wd = this.C;
        if (c4187wd != null) {
            C3567ad c3567ad = c4187wd.d;
            if (c3567ad != null) {
                c3567ad.b();
            }
            C3567ad c3567ad2 = c4187wd.e;
            if (c3567ad2 != null) {
                c3567ad2.b();
            }
            C3567ad c3567ad3 = c4187wd.f;
            if (c3567ad3 != null) {
                c3567ad3.b();
            }
        }
        Q();
        if (this.w == null) {
            ViewParent parent = getParent();
            this.w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        W();
        T();
        S();
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).a(TAG2, "==== CHECKPOINT REACHED - VISIBLE ====");
        }
        Y9 y93 = this.i;
        if (y93 == null || (c3685ej = ((Z9) y93).f6988a) == null) {
            return;
        }
        c3685ej.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "onDetachedFromWindow " + this);
        }
        C4153v6 c4153v6 = this.F0;
        if (c4153v6 != null) {
            C4153v6.a(c4153v6, 8, true, null, 12);
            Ck ck = c4153v6.m;
            if (!ck.f && ck.f6497a > 0) {
                ck.f = true;
                ck.g = Ak.f;
                ck.a();
            }
            CoroutineScopeKt.cancel$default(ck.d, null, 1, null);
        }
        C4187wd c4187wd = this.C;
        if (c4187wd != null) {
            C3567ad c3567ad = c4187wd.d;
            if (c3567ad != null) {
                c3567ad.a();
            }
            C3567ad c3567ad2 = c4187wd.e;
            if (c3567ad2 != null) {
                c3567ad2.a();
            }
            C3567ad c3567ad3 = c4187wd.f;
            if (c3567ad3 != null) {
                c3567ad3.a();
            }
        }
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).a(TAG2, "Detached from window");
        }
        N0 n0 = this.J0;
        if (n0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
            n0 = null;
        }
        if (n0.d.get()) {
            n0.a("session end is already triggered");
        } else if (!n0.f6730a.getEnabled()) {
            n0.a("config kill switch - false. ad quality will skip");
        } else if (n0.g == null) {
            n0.a("setup not done. ignore trigger");
        } else {
            n0.d.set(true);
            n0.a(false);
        }
        if (this.K0.get()) {
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new C4247yj(this, null), 3, null);
        }
        W();
        V();
        U();
        try {
            super.onDetachedFromWindow();
        } catch (IllegalArgumentException e) {
            Y9 y93 = this.i;
            if (y93 != null) {
                String TAG3 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((Z9) y93).b(TAG3, "Detaching WebView from window encountered an error ( " + e.getMessage() + " )");
            }
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (!this.n) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).c(TAG, "DoubleTap gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(1)) {
            Y9 y92 = this.i;
            if (y92 != null) {
                String TAG2 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((Z9) y92).c(TAG2, "Double tap gesture is disabled from config");
            }
            return false;
        }
        Y9 y93 = this.i;
        if (y93 != null) {
            String TAG3 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((Z9) y93).a(TAG3, "onDoubleTapEvent detected \n " + e);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (e.getAction() == 0) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put(AbstractC3727g4.c(e.getX()));
                jSONArray.put(AbstractC3727g4.c(e.getY()));
            } catch (JSONException e2) {
                Y9 y94 = this.i;
                if (y94 != null) {
                    String TAG4 = j1;
                    Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                    ((Z9) y94).a(TAG4, "Exception in onDoubleTap", e2);
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            h("window.imraidview.onGestureDetected('1', '" + jSONArray2 + "');");
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        if (!this.n) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).c(TAG, "Fling gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(6)) {
            Y9 y92 = this.i;
            if (y92 != null) {
                String TAG2 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((Z9) y92).c(TAG2, "fling gesture is disabled from config");
            }
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(AbstractC3727g4.c(motionEvent.getX())), Integer.valueOf(AbstractC3727g4.c(motionEvent.getY()))})));
            jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(AbstractC3727g4.c(e2.getX())), Integer.valueOf(AbstractC3727g4.c(e2.getY()))})));
            jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(f), Float.valueOf(f2)})));
        } catch (Exception e) {
            Y9 y93 = this.i;
            if (y93 != null) {
                String TAG3 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((Z9) y93).a(TAG3, "Exception in onFling", e);
            }
        }
        h("window.imraidview.onGestureDetected('6', '" + jSONArray + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (!this.n) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).c(TAG, "Long Press gesture is disabled via enableNativeGestures API");
                return;
            }
            return;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(5)) {
            Y9 y92 = this.i;
            if (y92 != null) {
                String TAG2 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((Z9) y92).c(TAG2, "LongPress gesture is disabled from config");
                return;
            }
            return;
        }
        Y9 y93 = this.i;
        if (y93 != null) {
            String TAG3 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((Z9) y93).a(TAG3, "onLongPress detected \n " + e);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(AbstractC3727g4.c(e.getX()));
            jSONArray.put(AbstractC3727g4.c(e.getY()));
        } catch (JSONException e2) {
            Y9 y94 = this.i;
            if (y94 != null) {
                String TAG4 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((Z9) y94).a(TAG4, "Exception in onLongPress", e2);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('5', '" + jSONArray2 + "');");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        if (this.e && !this.a0) {
            this.a0 = true;
            SparseArray sparseArray = InMobiAdActivity.t;
            h1.getClass();
            JSONObject jsonObject = C3855kj.a("IN_CUSTOM_BROWSER", "onScroll");
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            Ej ej = InMobiAdActivity.u;
            if (ej != null) {
                ej.c(jsonObject);
            }
            return false;
        }
        if (!this.n) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).c(TAG, "Scroll gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).a(TAG2, "onScroll detected \n " + motionEvent + " \n " + e2);
        }
        if (!this.e) {
            C4250ym scrollThrottler = getScrollThrottler();
            scrollThrottler.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - scrollThrottler.b < scrollThrottler.f7509a) {
                scrollThrottler.b = elapsedRealtime;
            } else {
                scrollThrottler.b = elapsedRealtime;
                if (getRenderingConfig().getSupportedGestures().contains(8)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(AbstractC3727g4.c(motionEvent.getX())), Integer.valueOf(AbstractC3727g4.c(motionEvent.getY()))})));
                        jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(AbstractC3727g4.c(e2.getX())), Integer.valueOf(AbstractC3727g4.c(e2.getY()))})));
                    } catch (Exception e) {
                        Y9 y93 = this.i;
                        if (y93 != null) {
                            String TAG3 = j1;
                            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                            ((Z9) y93).a(TAG3, "Exception in onScroll", e);
                        }
                    }
                    h("window.imraidview.onGestureDetected('8', '" + jSONArray + "');");
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (!this.n) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).c(TAG, "SingleTapConfirmed gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.e || !getRenderingConfig().getSupportedGestures().contains(0)) {
            Y9 y92 = this.i;
            if (y92 != null) {
                String TAG2 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((Z9) y92).c(TAG2, "Click gesture is disabled from config");
            }
            return false;
        }
        Y9 y93 = this.i;
        if (y93 != null) {
            String TAG3 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((Z9) y93).a(TAG3, "onSingleTapConfirmed detected \n " + e);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(AbstractC3727g4.c(e.getX()));
            jSONArray.put(AbstractC3727g4.c(e.getY()));
        } catch (JSONException e2) {
            Y9 y94 = this.i;
            if (y94 != null) {
                String TAG4 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((Z9) y94).a(TAG4, "Exception in onSingleTapConfirmed", e2);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('0', '" + jSONArray2 + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "onSingleTapUp detected \n " + e);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "onSizeChanged " + this);
        }
        super.onSizeChanged(i, i2, i3, i4);
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).a(TAG2, "onSizeChanged (" + i + ", " + i2 + ")");
        }
        if (i == 0 || i2 == 0) {
            return;
        }
        a(AbstractC3727g4.b(i / AbstractC3841k6.b()), AbstractC3727g4.b(i2 / AbstractC3841k6.b()));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (Float.isNaN(event.getX()) || Float.isNaN(event.getY())) {
            if (!this.L0) {
                Y9 y9 = this.i;
                if (y9 != null) {
                    String TAG = j1;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    ((Z9) y9).b(TAG, "onTouchEvent Invalid Coordinates " + event);
                }
                this.L0 = true;
            }
            return super.onTouchEvent(event);
        }
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).a(TAG2, "onTouchEvent " + this);
        }
        if (!getAdConfig().getRendering().getUseDispatchTouchEvent()) {
            a(event);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.onTouchEvent(event);
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "onWindowFocusChanged " + this + " - " + z);
        }
        super.onWindowFocusChanged(z);
        if (z) {
            if (isShown()) {
                Q7 q7 = T7.k;
                if (q7.b(this, this, this.z0) && q7.a(this, this, this.z0)) {
                    z = true;
                }
            }
            z = false;
        }
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity == null || !fullScreenActivity.isInMultiWindowMode()) {
            d(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r2.a(r4, r4, r5) != false) goto L19;
     */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWindowVisibilityChanged(int i) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "onWindowVisibilityChanged " + this + ServerSentEventKt.SPACE + i);
        }
        super.onWindowVisibilityChanged(i);
        boolean z = true;
        boolean z2 = i == 0;
        if (z2) {
            int visibilityTrackingMinPercentage = getVisibilityTrackingMinPercentage();
            if (isShown()) {
                Q7 q7 = T7.k;
                if (q7.b(this, this, visibilityTrackingMinPercentage)) {
                }
            }
            z = false;
        } else {
            z = z2;
        }
        d(z);
    }

    public final void p() {
        Activity fullScreenActivity;
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "finishFullScreenActivity " + this);
        }
        SparseArray sparseArray = InMobiAdActivity.t;
        Intrinsics.checkNotNullParameter(this, "container");
        InMobiAdActivity.t.remove(hashCode());
        if (getFullScreenActivity() == null) {
            if (Intrinsics.areEqual(Profile.DEFAULT_PROFILE_NAME, this.B)) {
                setAndUpdateViewState("Hidden");
            }
            Y();
            return;
        }
        InterfaceC4228y0 interfaceC4228y0 = this.o0;
        if (interfaceC4228y0 == null || !interfaceC4228y0.a(this)) {
            Activity fullScreenActivity2 = getFullScreenActivity();
            Intrinsics.checkNotNull(fullScreenActivity2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
            ((InMobiAdActivity) fullScreenActivity2).e = true;
            Activity fullScreenActivity3 = getFullScreenActivity();
            if (fullScreenActivity3 != null) {
                fullScreenActivity3.finish();
            }
            if (this.V == -1 || (fullScreenActivity = getFullScreenActivity()) == null) {
                return;
            }
            fullScreenActivity.overridePendingTransition(0, this.V);
        }
    }

    public final void q() {
        N0 n0;
        AdQualityControl adQualityControl;
        Activity activity;
        N0 n02;
        AdQualityControl adQualityControl2;
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "fireAQSession - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
        }
        if (!Intrinsics.areEqual(getAdType(), "int") || Build.VERSION.SDK_INT < 29 || (activity = (Activity) this.u.get()) == null) {
            N0 n03 = this.J0;
            if (n03 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
                n0 = null;
            } else {
                n0 = n03;
            }
            n0.getClass();
            Intrinsics.checkNotNullParameter(this, "adView");
            if (!n0.a()) {
                n0.a("session state invalid");
                return;
            }
            n0.a("session start trigger...");
            n0.c.set(true);
            AdQualityControl adQualityControl3 = n0.g;
            if (adQualityControl3 == null || !adQualityControl3.getTakeScreenshot() || (adQualityControl = n0.g) == null) {
                return;
            }
            n0.a(this, (long) (adQualityControl.getScreenshotDelayInSeconds() * 1000), false, (C3970oj) null);
            return;
        }
        N0 n04 = this.J0;
        if (n04 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
            n02 = null;
        } else {
            n02 = n04;
        }
        n02.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!n02.a()) {
            n02.a("session state invalid");
            return;
        }
        n02.a("session start trigger...");
        n02.c.set(true);
        AdQualityControl adQualityControl4 = n02.g;
        if (adQualityControl4 == null || !adQualityControl4.getTakeScreenshot() || (adQualityControl2 = n02.g) == null) {
            return;
        }
        n02.a(activity, (long) (adQualityControl2.getScreenshotDelayInSeconds() * 1000), false, (C3970oj) null);
    }

    public final void r() {
        if (this.O.get()) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).b(TAG, "fireAdReady called on destroyed view");
                return;
            }
            return;
        }
        if (this.Q0) {
            Y9 y92 = this.i;
            if (y92 != null) {
                String TAG2 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((Z9) y92).a(TAG2, "fireAdReady " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        Oj oj = this.f0;
        if (oj != null) {
            Map a2 = oj.a();
            long j = oj.c;
            CoroutineScope coroutineScope = AbstractC4143un.f7420a;
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            a2.put("latency", Long.valueOf(elapsedRealtime));
            oj.h = elapsedRealtime;
            String a3 = oj.a("FireAdReady");
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b(a3, a2, EnumC3944nm.f7271a);
        }
        Y9 y93 = this.i;
        if (y93 != null) {
            String TAG3 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            ((Z9) y93).a(TAG3, "fireAdReady " + this);
        }
        this.D0 = true;
        if (this.r == 0) {
            v();
        }
        g();
        BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new Bj(this, null), 3, null);
        getListener().h(this);
    }

    public final void s() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "fireBackButtonPressedEvent " + this);
        }
        String str = this.N;
        if (str != null) {
            a(str, "broadcastEvent('backButtonPressed')");
        }
    }

    public final void setAdPodHandler(InterfaceC4228y0 interfaceC4228y0) {
        this.o0 = interfaceC4228y0;
    }

    public void setAdType(String str) {
        this.j0 = str;
    }

    public final void setAllowAutoRedirection(boolean z) {
        this.n0 = z;
    }

    public final void setAndUpdateViewState(String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "setAndUpdateViewState " + this);
        }
        this.B = state;
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).a(TAG2, "set state:" + this.B);
        }
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = state.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        f(lowerCase);
    }

    public final void setBackButtonDisabled(boolean z) {
        this.M = z;
    }

    public final void setBannerHolderActivity(WeakReference<Activity> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.v = weakReference;
    }

    public final void setBeaconUrl(String str) {
        this.N0 = str;
    }

    public final void setBlobProvider(InterfaceC3585b3 interfaceC3585b3) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "setBlobProvider " + this);
        }
        this.l0 = interfaceC3585b3;
    }

    public final void setCloseAssetArea(Jq value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!this.Y0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!AbstractC3727g4.a(context)) {
                return;
            }
        }
        this.g1 = new Jq(0, value.b, value.c, 0);
    }

    public final void setConfiguredArea(long j) {
        this.u0 = getWidth() * getHeight();
    }

    public final void setContentURL(String str) {
        this.s0 = str;
    }

    public final void setContextualDataHandler(C3671e5 c3671e5) {
        this.Z0 = c3671e5;
    }

    public void setCreativeId(String str) {
        this.c0 = str;
    }

    public final void setDisableBackButton(boolean z) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "setDisableBackButton " + this);
        }
        this.M = z;
    }

    public final void setEmbeddedBrowserJsCallbacks(InterfaceC4097t6 interfaceC4097t6) {
        this.G0 = interfaceC4097t6;
    }

    public final void setEnableNativeGestures(boolean z) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "enableNativeGestures " + this + ServerSentEventKt.SPACE + z);
        }
        boolean z2 = this.n;
        this.n = z;
        if (z && !z2) {
            if (this.A0 == null) {
                this.A0 = new C3964od(this);
            }
        } else {
            if (z || !z2) {
                return;
            }
            this.A0 = null;
        }
    }

    public final void setEnableTouchBeginCallback(boolean z) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "setEnableTouchBeginCallback " + this + ServerSentEventKt.SPACE + z);
        }
        this.p = z;
    }

    public final void setEnableTouchEndCallback(boolean z) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "setEnableTouchEndCallback " + this + ServerSentEventKt.SPACE + z);
        }
        this.o = z;
    }

    public void setExitAnimation(int i) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "setExitAnimation " + this);
        }
        this.V = i;
    }

    public final void setExposureTracker(V v) {
        this.M0 = v;
    }

    public void setFriendlyViews(Map<View, FriendlyObstructionPurpose> map) {
        this.k0 = map;
    }

    public void setFullScreenActivityContext(Activity activity) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "setFullScreenActivityContext " + this);
        }
        this.u = new WeakReference(activity);
        a0();
        if (this.e || activity == null) {
            return;
        }
        Lq lq = this.P0;
        if (lq != null) {
            lq.a();
        }
        this.P0 = new Lq(activity, this.T0, this.i);
    }

    public final void setImmersiveMode(boolean z) {
        this.Y0 = z;
    }

    public void setImpressionId(String str) {
        this.d = str;
    }

    public final void setInAppActivityBrowserClientListener(InterfaceC4072s9 interfaceC4072s9) {
        this.d1 = interfaceC4072s9;
    }

    public final void setLandingPageTelemetryControlInfoOnWebViewClient(Yb yb) {
        C4153v6 c4153v6 = this.F0;
        if (c4153v6 != null) {
            c4153v6.k = yb;
            c4153v6.l = new Wb(yb, c4153v6);
        }
    }

    public final void setLandingScheme(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f = str;
    }

    public final void setMCreativeType(String str) {
        this.H0 = str;
    }

    public final void setMImpressionMinPercentageViewed(int i) {
        this.z0 = i;
    }

    public final void setMImpressionMinTimeViewed(int i) {
        this.y0 = i;
    }

    public final void setMViewableAd(Tp tp) {
        this.p0 = tp;
    }

    public final void setMarkupTypeAdUnit(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.U0 = str;
    }

    public final void setOrientationProperties(Jg jg) {
        Intrinsics.checkNotNullParameter(jg, "<set-?>");
        this.I0 = jg;
    }

    public final void setPingAckListener(InterfaceC3853kh pingAckListener) {
        Intrinsics.checkNotNullParameter(pingAckListener, "pingAckListener");
        this.q = pingAckListener;
    }

    public final void setPingManager(C3939nh pingManager) {
        Intrinsics.checkNotNullParameter(pingManager, "pingManager");
        this.h0 = pingManager;
    }

    public final void setPlacementId(long j) {
        this.b0 = j;
    }

    public final void setPreloadView(boolean z) {
    }

    public void setReferenceContainer(D d) {
        this.m0 = d;
    }

    public final void setRenderViewEventListener(Gj gj) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "setRenderViewEventListener " + this);
        }
        this.x = gj;
    }

    public final void setRenderViewTelemetry(Oj oj) {
        this.f0 = oj;
    }

    public final void setScrollable(boolean z) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "setScrollable " + this);
        }
        setScrollContainer(z);
        setVerticalScrollBarEnabled(z);
        setHorizontalScrollBarEnabled(z);
    }

    public final void setShouldFireLandingPageBeacons(boolean z) {
        this.O0 = z;
    }

    public void setTelemetryManagerMap(Map<String, C4092t1> map) {
        this.R0 = map;
    }

    public final void setUnloaded(boolean z) {
        this.Q0 = z;
    }

    public final void setUseCustomClose(boolean z) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "setUseCustomClose " + this + ServerSentEventKt.SPACE + z);
        }
        this.I = z;
    }

    public void setViewTouchTimestamp(long j) {
        this.g = j;
    }

    public final void setWatermark(final WatermarkData watermarkData) {
        Intrinsics.checkNotNullParameter(watermarkData, "watermarkData");
        if (!getAdConfig().getWatermarkEnabled()) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).c(TAG, "Watermark disabled from config. ignoring...");
                return;
            }
            return;
        }
        final byte[] decode = Base64.decode(watermarkData.getWatermarkBase64EncodedString(), 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        if (!this.d0.get()) {
            this.d0.set(true);
            this.e0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.inmobi.media.Ej$$ExternalSyntheticLambda7
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Ej.a(Ej.this, decode, watermarkData);
                }
            };
            getViewTreeObserver().addOnGlobalLayoutListener(this.e0);
        } else {
            Y9 y92 = this.i;
            if (y92 != null) {
                String TAG2 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((Z9) y92).c(TAG2, "Watermark layout listener already set; ignoring duplicate setWatermark call");
            }
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "stopLoading " + this);
        }
        if (this.O.get()) {
            return;
        }
        super.stopLoading();
    }

    public final void t() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "fireClickTrackers " + this);
        }
        C3671e5 c3671e5 = this.Z0;
        if (c3671e5 != null) {
            c3671e5.f();
        }
        x();
        getListener().b(this);
    }

    public final void u() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "fireEvent " + this + " 2");
        }
    }

    public void v() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "fireImpression " + this);
        }
        if (Intrinsics.areEqual("video", this.H0) || Intrinsics.areEqual("audio", this.H0)) {
            return;
        }
        H();
        h("window.imraidview.impressionRendered();");
        getListener().c(this);
    }

    public final void w() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "fireIncentCompleted " + this);
        }
        h("window.imraidview.broadcastEvent('incentCompleted'," + new JSONObject() + ");");
    }

    public final void x() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "fireOnUserInteraction " + this);
        }
        h("window.imraidview.onUserInteraction();");
    }

    public final void y() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "firePopupBlockedEvent " + this);
        }
        h("window.mraidview.popupBlocked('popupBlocked')");
    }

    public final void z() {
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity != null) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).c(TAG, "fullScreenActivity is not null and finishing");
            }
            InMobiAdActivity inMobiAdActivity = fullScreenActivity instanceof InMobiAdActivity ? (InMobiAdActivity) fullScreenActivity : null;
            if (inMobiAdActivity != null) {
                inMobiAdActivity.b();
            } else {
                fullScreenActivity.finish();
            }
        }
    }

    public final void m() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "disableHardwareAcceleration called. " + this);
        }
        try {
            setLayerType(1, null);
        } catch (Exception e) {
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Ej(Context context, byte b, Set set, String str, boolean z, String landingScheme, long j, Ij ij, Y9 y9, C3715fk route, yq webViewFactory, C3979p0 c3979p0, AdConfig adConfig) {
        super(r10);
        C3798ij c3883lj;
        Jq jq;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.b = b;
        this.c = set;
        this.d = str;
        this.e = z;
        this.f = landingScheme;
        this.g = j;
        this.h = ij;
        this.i = y9;
        this.j = route;
        this.k = webViewFactory;
        this.l = c3979p0;
        this.m = adConfig;
        this.p = true;
        this.q = new Aj(this);
        this.s = new Sk(y9);
        this.t = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Ej$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ej.c(Ej.this);
            }
        });
        this.u = new WeakReference(null);
        this.v = new WeakReference(null);
        this.y = MutexKt.Mutex$default(false, 1, null);
        this.z = new AtomicBoolean(false);
        this.B = Profile.DEFAULT_PROFILE_NAME;
        this.G = true;
        this.H = true;
        this.J = true;
        this.K = Vp.f6918a;
        this.O = new AtomicBoolean(false);
        this.P = new Object();
        this.Q = new Object();
        this.S = true;
        this.V = -1;
        this.b0 = Long.MIN_VALUE;
        this.d0 = new AtomicBoolean(false);
        this.g0 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.inmobi.media.Ej$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ej.b(Ej.this);
            }
        });
        this.i0 = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Ej$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ej.C();
            }
        });
        this.w0 = new C3941nj(this);
        this.x0 = new C4054rj(this);
        this.y0 = Integer.MIN_VALUE;
        this.z0 = Integer.MIN_VALUE;
        this.K0 = new AtomicBoolean(true);
        this.S0 = new C3970oj(this);
        this.T0 = new Dj(this);
        this.U0 = "html";
        this.V0 = new C4110tj(this, context);
        this.W0 = new C3998pj(this);
        this.X0 = new C3913mj(this);
        String TAG = j1;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        String str2 = "init constructor " + this;
        h1.getClass();
        k1.a();
        this.m0 = this;
        this.q0 = true;
        this.I0 = new Jg();
        GestureDetector gestureDetector = new GestureDetector(context, this);
        gestureDetector.setOnDoubleTapListener(this);
        gestureDetector.setIsLongpressEnabled(b == 1);
        this.B0 = gestureDetector;
        this.C0 = new Im(this);
        if (this.n && this.A0 == null) {
            this.A0 = new C3964od(this);
        }
        if (ij != null) {
            this.f0 = new Oj(ij);
        }
        AbstractC3771hj.a(this, y9);
        if (c3979p0 != null) {
            setAdType(c3979p0.f7296a);
            this.Y0 = c3979p0.b;
            this.b0 = c3979p0.c;
            this.n0 = c3979p0.d;
            setCreativeId(c3979p0.e);
            this.o0 = c3979p0.i;
            this.s0 = c3979p0.j;
            this.U0 = c3979p0.g;
            String str3 = c3979p0.h;
            if (str3 != null) {
                setAdSize(str3);
            }
            setTelemetryManagerMap(c3979p0.k);
            b(c3979p0.f);
        }
        this.c1 = new Cj(this);
        this.d1 = new C4082sj(this);
        this.e1 = new C4220xj(this);
        if (getAdConfig().getRendering().getDisableShowCustomView()) {
            c3883lj = new C3798ij(this);
        } else {
            c3883lj = new C3883lj(this);
        }
        this.f1 = c3883lj;
        if (!this.Y0 && !AbstractC3727g4.a(context)) {
            jq = new Jq(0, 0, 0, 0);
        } else {
            jq = new Jq(0, 44, 44, 0);
        }
        this.g1 = jq;
    }

    public final void j() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "completeFromInterActive " + this);
        }
        C3671e5 c3671e5 = this.Z0;
        if (c3671e5 != null) {
            c3671e5.g();
        }
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).a(TAG2, "completeFromInterActive");
        }
    }

    public final void k(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Oj oj = this.f0;
        if (oj != null) {
            oj.b();
        }
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "loadUrlInWebView " + this);
        }
        this.R = false;
        if (this.O.get()) {
            return;
        }
        loadUrl(url);
    }

    public final void f(String str) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "fireStateChange " + this + ServerSentEventKt.SPACE + str);
        }
        h("window.mraidview.broadcastEvent('stateChange','" + str + "');");
    }

    public final void h(final String value) {
        Intrinsics.checkNotNullParameter(value, "js");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "injectJavaScript " + this + " - " + value);
        }
        Intrinsics.checkNotNullParameter(value, "value");
        Lazy lazy = P6.f6777a;
        Wc wc = (Wc) P6.e.getValue();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Ej$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                Ej.d(Ej.this, value);
            }
        };
        wc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wc.f6931a.postAtFrontOfQueue(runnable);
    }

    public final void c(String str, String str2) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "sendTelemetryForAutoRedirectFraud " + this + ServerSentEventKt.SPACE + str + ServerSentEventKt.SPACE + str2);
        }
        HashMap hashMap = new HashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            hashMap.put("creativeId", creativeId);
        }
        hashMap.put("trigger", str);
        String impressionId = getImpressionId();
        if (impressionId != null) {
            hashMap.put("impressionId", impressionId);
        }
        hashMap.put("adType", str2);
        a("BlockAutoRedirection", hashMap);
    }

    public final void f(boolean z) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "processUseCustomCloseRequest " + this + ServerSentEventKt.SPACE + z);
        }
        setUseCustomClose(z);
        W();
    }

    public final void i() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "closeAll " + this);
        }
        InterfaceC4228y0 interfaceC4228y0 = this.o0;
        if (interfaceC4228y0 != null) {
            interfaceC4228y0.b();
        }
        z();
    }

    public final void g(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        if (getAdConfig().getPingV2().getEnabled()) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).a(TAG, "handlePing " + this);
            }
            if (this.h0 == null) {
                this.h0 = new C3939nh(this.q, this.f0);
            }
            C3939nh c3939nh = this.h0;
            Intrinsics.checkNotNull(c3939nh);
            c3939nh.getClass();
            Intrinsics.checkNotNullParameter(json, "json");
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.e, null, null, new C3881lh(c3939nh, json, null), 3, null);
            return;
        }
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).a(TAG2, "pings v2 is disabled " + this);
        }
        Oj oj = this.f0;
        if (oj != null) {
            oj.a(0, "unknown", (short) 2257);
        }
        InterfaceC3853kh interfaceC3853kh = this.q;
        A6[] a6Arr = A6.f6449a;
        ((Aj) interfaceC3853kh).a("", -100, "Ping V2 is disabled from SDK config", System.currentTimeMillis(), 0);
    }

    public final void c(boolean z) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "fireViewableChange " + this + ServerSentEventKt.SPACE + z);
        }
        h("window.mraidview.broadcastEvent('viewableChange'," + z + ");");
    }

    public static final Unit c(Mj it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.o();
        return Unit.INSTANCE;
    }

    public final void a(C3964od movementGestureDetector, MotionEvent initialEvent, MotionEvent endEvent) {
        Intrinsics.checkNotNullParameter(movementGestureDetector, "movementGestureDetector");
        Intrinsics.checkNotNullParameter(initialEvent, "initialEvent");
        Intrinsics.checkNotNullParameter(endEvent, "endEvent");
        if (!this.e && getRenderingConfig().getSupportedGestures().contains(4)) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).a(TAG, StringsKt.trimIndent(" onScaleDetected\n " + initialEvent + " \n " + endEvent));
            }
            JSONArray jSONArray = new JSONArray();
            float f = 2;
            jSONArray.put(new JSONArray((Collection) CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(AbstractC3727g4.c((endEvent.getX(1) + endEvent.getX()) / f)), Integer.valueOf(AbstractC3727g4.c((endEvent.getY(1) + endEvent.getY()) / f))})));
            h("window.imraidview.onGestureDetected('4', '" + jSONArray + "');");
            return;
        }
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).c(TAG2, "Pinch gesture is disabled from config");
        }
    }

    public final void c(String str) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "evaluateScript " + this);
        }
        evaluateJavascript(str, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r6.equals("html5video") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0129, code lost:
    
        if (r5.D == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012d, code lost:
    
        if (r5.S == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012f, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0130, code lost:
    
        r6 = r5.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0132, code lost:
    
        if (r6 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0134, code lost:
    
        r2 = com.inmobi.media.Ej.j1;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "TAG");
        ((com.inmobi.media.Z9) r6).c(r2, "HTML5 video supported:" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0124, code lost:
    
        if (r6.equals("inlineVideo") == false) goto L80;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0157 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(String str) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "supports " + this + ServerSentEventKt.SPACE + str);
        }
        boolean z = false;
        if (str != null) {
            switch (str.hashCode()) {
                case -1886160473:
                    if (str.equals("playVideo")) {
                        return true;
                    }
                    break;
                case -1647691422:
                    break;
                case -988153970:
                    if (str.equals("pingV2")) {
                        AdConfig.PingsV2Config pingV2 = getAdConfig().getPingV2();
                        Y9 y92 = this.i;
                        if (y92 != null) {
                            String TAG2 = j1;
                            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                            ((Z9) y92).a(TAG2, "supports(pingV2) " + pingV2.getEnabled());
                        }
                        return pingV2.getEnabled();
                    }
                    break;
                case -315615134:
                    str.equals("streaming");
                    break;
                case -168584769:
                    if (str.equals("edge-to-edge")) {
                        if (getPlacementType() != 1) {
                            Y9 y93 = this.i;
                            if (y93 != null) {
                                String TAG3 = j1;
                                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                                ((Z9) y93).b(TAG3, "EDGE_TO_EDGE is only supported for fullscreen ads. supports(edge-to-edge) = false");
                            }
                            return false;
                        }
                        if (this.Y0) {
                            Y9 y94 = this.i;
                            if (y94 != null) {
                                String TAG4 = j1;
                                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                                ((Z9) y94).b(TAG4, "Ad is in Immersive mode. supports(edge-to-edge) = false");
                            }
                            return false;
                        }
                        Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        return AbstractC3727g4.a(context);
                    }
                    break;
                case 886211909:
                    if (str.equals("openInlineInstaller")) {
                        return true;
                    }
                    break;
                case 1137617595:
                    if (str.equals(U3.i.v)) {
                        return this.Y0;
                    }
                    break;
                case 1509574865:
                    break;
                case 1511497695:
                    if (str.equals("hybridVideo") && getAdConfig().getHybridNative().getIsEnabled()) {
                        String maxSupportedPlayerVersion = getAdConfig().getHybridNative().getMaxSupportedPlayerVersion();
                        Oj oj = this.f0;
                        try {
                            AbstractC3748gp.a(maxSupportedPlayerVersion);
                            return true;
                        } catch (Jh e) {
                            if (oj != null) {
                                oj.a(e.f6653a);
                            }
                        }
                    }
                    return false;
                case 1642189884:
                    if (!str.equals("saveContent")) {
                    }
                    break;
                case 1772979069:
                    str.equals("redirectFraudDetection");
                    break;
            }
        }
        return false;
    }

    @Override // com.inmobi.media.Ji
    public final boolean c() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "canRedirectExternally Called");
        }
        if (getRenderingConfig().getAutoRedirectionEnforcement()) {
            return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
        }
        return true;
    }

    public final void c(String jsCallbackNamespace, String callback, String blob) {
        Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(blob, "blob");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "retrievedBlob");
        }
        a(jsCallbackNamespace, callback + "(" + blob + ");");
    }

    public final void b(float f, float f2) {
        if (!this.o) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).c(TAG, "Touch End is disabled via enableTouchEnd API");
                return;
            }
            return;
        }
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).a(TAG2, "onTouchEnd detected");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(AbstractC3727g4.c(f));
            jSONArray.put(AbstractC3727g4.c(f2));
        } catch (JSONException e) {
            Y9 y93 = this.i;
            if (y93 != null) {
                String TAG3 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((Z9) y93).a(TAG3, "Exception in onTouchEnd", e);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('10', '" + jSONArray2 + "');");
    }

    public final void c(int i) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "showPodAdAtIndex " + this + ServerSentEventKt.SPACE + i);
        }
        if (this.K == Vp.c && this.o0 != null && !this.O.get()) {
            InterfaceC4228y0 interfaceC4228y0 = this.o0;
            if (interfaceC4228y0 != null) {
                interfaceC4228y0.a(i, this, getFullScreenActivity());
                return;
            }
            return;
        }
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).b(TAG2, "Cannot show index pod ad as the current ad is not viewable");
        }
        b(false);
    }

    public final void c(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        if (getLandingPageConfig().getEnableOnLpLifeCycleEvent()) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).a(TAG, "onLpLifeCycleEvent " + this);
            }
            h("window.imraid.broadcastEvent('onLpLifeCycleEvent', " + jsonObject + ");");
        }
    }

    public final void c(Ej sourceView, String targetId) {
        Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "fireShowWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        sourceView.h("window.imraidview.broadcastEvent('webViewShown'," + jSONObject + ");");
    }

    public static final C4250ym b(Ej ej) {
        return new C4250ym(ej.getAdConfig().getRendering().getScrollThrottleInterval());
    }

    @Override // com.inmobi.media.D
    public void b() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "destroyContainer " + this);
        }
        l();
        this.k.b(new Function1() { // from class: com.inmobi.media.Ej$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ej.a((Mj) obj);
            }
        });
        removeAllViews();
        AdConfig.OmidConfig omidConfig = getAdConfig().getViewability().getOmidConfig();
        if (this.q0 && omidConfig.isOmidEnabled()) {
            Fg.f6559a.getClass();
            if (Omid.isActive()) {
                new Jj(this, omidConfig.getWebViewRetainTime()).a();
                return;
            }
        }
        super.destroy();
    }

    public final void a(float f, float f2) {
        if (!this.p) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).c(TAG, "Touch Begin is disabled via enableTouchBegin API");
                return;
            }
            return;
        }
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).a(TAG2, "onTouchBegin detected");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(AbstractC3727g4.c(f));
            jSONArray.put(AbstractC3727g4.c(f2));
        } catch (JSONException e) {
            Y9 y93 = this.i;
            if (y93 != null) {
                String TAG3 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((Z9) y93).a(TAG3, "Exception in onTouchBegin", e);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        h("window.imraidview.onGestureDetected('9', '" + jSONArray2 + "');");
    }

    public final void e(String str) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "fireDetectAutoRedirectFraud " + this + ServerSentEventKt.SPACE + str);
        }
        h("window.mraidview.fireRedirectFraudBeacon('" + str + "')");
    }

    public final void e(boolean z) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "processDisableCloseRegionRequest " + this + ServerSentEventKt.SPACE + z);
        }
        this.L = z;
        W();
    }

    public final void b(Hg orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "handle orientationChange " + this + ServerSentEventKt.SPACE + orientation);
        }
        a(Ig.a(orientation));
    }

    public static final void a(Ej renderView, byte[] bArr, WatermarkData watermarkData) {
        Y9 y9 = renderView.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "adding overlay to renderview");
        }
        Context context = renderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FrameLayout overlayLayout = AbstractC3977oq.a(context, bArr, watermarkData.getAlpha());
        Intrinsics.checkNotNullParameter(overlayLayout, "overlayLayout");
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        if (renderView.getParent() != null) {
            ViewParent parent = renderView.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).addView(overlayLayout, 0);
        }
        renderView.getViewableAd().a(overlayLayout, FriendlyObstructionPurpose.NOT_VISIBLE);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = renderView.e0;
        if (onGlobalLayoutListener != null) {
            renderView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            renderView.e0 = null;
        }
    }

    public final void b(String str, JSONObject message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "fireError " + this + " - " + message);
        }
        h("window.imraidview.broadcastEvent('error','" + message + "', '" + str + "');");
        d(message);
    }

    public final void b(String str, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "processMediaPlaybackRequest " + this);
        }
        if (this.Q0) {
            Y9 y92 = this.i;
            if (y92 != null) {
                String TAG2 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((Z9) y92).b(TAG2, "Media playback is not allowed after unload! Ignoring request ...");
                return;
            }
            return;
        }
        if (1 != this.b) {
            Y9 y93 = this.i;
            if (y93 != null) {
                String TAG3 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                ((Z9) y93).b(TAG3, "Media playback is only supported on full screen ads! Ignoring request ...");
                return;
            }
            return;
        }
        Activity activity = (Activity) this.u.get();
        if (activity == null) {
            Y9 y94 = this.i;
            if (y94 != null) {
                String TAG4 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                ((Z9) y94).b(TAG4, "Media playback is  not allowed before it is visible! Ignoring request ...");
            }
            a(str, "Media playback is  not allowed before it is visible! Ignoring request ...", "playVideo");
            return;
        }
        C4187wd c4187wd = this.C;
        if (c4187wd != null) {
            c4187wd.a(activity, url);
        }
    }

    public static final Unit b(Mj it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.o();
        return Unit.INSTANCE;
    }

    public final void b(int i) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "loadPodAd " + this);
        }
        if (this.K == Vp.c && this.o0 != null && !this.O.get()) {
            InterfaceC4228y0 interfaceC4228y0 = this.o0;
            if (interfaceC4228y0 != null) {
                interfaceC4228y0.a(i, this);
                return;
            }
            return;
        }
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).b(TAG2, "Cannot load index pod ad as the current ad is not viewable");
        }
        a(false);
    }

    public final void b(boolean z) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "fireNextAdShowComplete " + this);
        }
        String str = "window.imraidview.broadcastEvent('adShowSuccess'," + z + ");";
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).a(TAG2, str + " Index: " + getCurrentRenderingPodAdIndex());
        }
        h(str);
    }

    public final void b(String str) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "creativeType " + this + ServerSentEventKt.SPACE + str);
        }
        this.H0 = str;
    }

    public final void b(String str, String str2, String str3) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "onUserLandingInitialized " + this + " isInAppBrowser: " + this.e);
        }
        h("window.imraid.broadcastEvent('onUserLandingInitialized');");
        if (str2 == null) {
            return;
        }
        a(str2, "broadcastEvent('" + str + "Successful','" + str3 + "');");
    }

    public final void b(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "onCTLifeCycleEvent " + this);
        }
        h("window.imraid.broadcastEvent('onCTLifeCycleEvent', " + jsonObject + ");");
    }

    public final void b(String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "fireLandingPageTracker " + this);
        }
        getListener().a(this, trackerName, macros);
    }

    public final void b(Ej sourceView, String targetId) {
        Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "fireLoadWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        Oj oj = this.f0;
        jSONObject.put("latency", oj != null ? oj.h : 0L);
        sourceView.h("window.imraidview.broadcastEvent('webViewLoaded', " + jSONObject + ");");
    }

    public final void a(String url, String templateInfoStr, boolean z) {
        Activity activity;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(templateInfoStr, "templateInfoStr");
        try {
            JSONObject jSONObject = new JSONObject(templateInfoStr);
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).a(TAG, "report - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
            }
            if (Intrinsics.areEqual(getAdType(), "int") && Build.VERSION.SDK_INT >= 29 && (activity = (Activity) this.u.get()) != null) {
                Lazy lazy = G0.f6569a;
                G0.a(activity, this, url, z, jSONObject, this.S0);
            } else {
                Lazy lazy2 = G0.f6569a;
                G0.a(this, this, url, z, jSONObject, this.S0);
            }
        } catch (Exception e) {
            Y9 y92 = this.i;
            if (y92 != null) {
                String TAG2 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((Z9) y92).a(TAG2, "issue wile reporting ad", e);
            }
        }
    }

    public final void a(MotionEvent motionEvent) {
        C3964od c3964od;
        if (this.e && !this.W) {
            this.W = true;
            SparseArray sparseArray = InMobiAdActivity.t;
            h1.getClass();
            JSONObject jsonObject = C3855kj.a("IN_CUSTOM_BROWSER", "onInteraction");
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            Ej ej = InMobiAdActivity.u;
            if (ej != null) {
                ej.c(jsonObject);
            }
        }
        if (this.b == 1 && (c3964od = this.A0) != null) {
            c3964od.a(motionEvent);
        }
        this.B0.onTouchEvent(motionEvent);
    }

    public final void a(Gj gj) {
        WatermarkData watermarkData;
        AdQualityControl adQualityControl;
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "initialize " + this);
        }
        int i = Build.VERSION.SDK_INT;
        if (Intrinsics.areEqual(this.U0, "htmlUrl")) {
            getSettings().setMixedContentMode(2);
        }
        P();
        this.x = gj;
        ViewParent parent = getParent();
        this.w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        setBackgroundColor(getRenderingConfig().getWebviewBackgroundColor());
        String url = getMraidConfig().getUrl();
        int maxRetries = getMraidConfig().getMaxRetries();
        int retryInterval = getMraidConfig().getRetryInterval();
        long expiry = getMraidConfig().getExpiry();
        Y9 y92 = this.i;
        C4020qd c4020qd = new C4020qd(url, maxRetries, retryInterval, expiry, y92);
        if (url != null) {
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new C3992pd(c4020qd, null), 3, null);
        } else if (y92 != null) {
            String TAG2 = c4020qd.f;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).b(TAG2, "MRAID Js Url provided is invalid.");
        }
        setImportantForAccessibility(2);
        setScrollable(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(getAdConfig().getRendering().getEnableDomStorage());
        getSettings().setGeolocationEnabled(true);
        e();
        if (this.e && getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
        setWebChromeClient(this.f1);
        if (!this.e) {
            C4130ub c4130ub = new C4130ub(this.b, this);
            Y9 logger = this.i;
            if (logger != null) {
                Intrinsics.checkNotNullParameter(logger, "logger");
                c4130ub.c = logger;
            }
            addJavascriptInterface(c4130ub, "sdkController");
        }
        this.C = new C4187wd(this, this.i);
        this.J0 = new N0(getAdConfig().getAdQuality(), this.i);
        if (i >= 29) {
            WebViewRenderProcessClient kj = new Kj(this.i, this.f0);
            Object value = P6.c.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            setWebViewRenderProcessClient((ExecutorService) value, kj);
        }
        C3979p0 c3979p0 = this.l;
        if (c3979p0 != null && (adQualityControl = c3979p0.n) != null) {
            N0 n0 = this.J0;
            if (n0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adQualityManager");
                n0 = null;
            }
            n0.getClass();
            Intrinsics.checkNotNullParameter(adQualityControl, "adQualityControl");
            n0.a("adQuality session setup");
            if (!n0.f6730a.getEnabled()) {
                n0.a("config kill switch while setup - false. ad quality will skip");
            } else if (n0.c.get()) {
                n0.a("session already started. skip");
            } else {
                n0.a("verifying control flags");
                String beacon = adQualityControl.getBeacon();
                if (beacon != null && beacon.length() == 0) {
                    n0.a("no beacon received. aborting...");
                    CoroutineScope coroutineScope = G0.e;
                    if (coroutineScope != null) {
                        CoroutineScopeKt.cancel(coroutineScope, new CancellationException("Shutdown"));
                    }
                    G0.e = null;
                    n0.a("session end - cleanup");
                    n0.g = null;
                    n0.f.clear();
                    n0.c.set(false);
                    n0.d.set(false);
                    n0.a("ad quality session is already in progress. skipping...");
                } else {
                    n0.g = adQualityControl;
                }
            }
        }
        C3979p0 c3979p02 = this.l;
        if (c3979p02 != null && (watermarkData = c3979p02.m) != null) {
            setWatermark(watermarkData);
        }
        C3979p0 c3979p03 = this.l;
        if (c3979p03 != null ? Intrinsics.areEqual(c3979p03.l, Boolean.TRUE) : false) {
            m();
        }
    }

    public final void l(String str) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "registerBackButtonPressedEventListener " + this);
        }
        this.N = str;
    }

    public final void a(RelativeLayout adView) {
        Ag ag;
        Intrinsics.checkNotNullParameter(adView, "adBackgroundView");
        Y9 y9 = this.i;
        if (y9 != null) {
            ((Z9) y9).b("HtmlVideoPlayer", "inflateVideoPlayer " + this);
        }
        C3591b9 c3591b9 = this.a1;
        if (c3591b9 != null) {
            Intrinsics.checkNotNullParameter(adView, "parentView");
            Y8[] y8Arr = {Y8.b, Y8.c};
            G8[] g8Arr = G8.f6577a;
            if (C3591b9.a(c3591b9, y8Arr, "createVideoPlayer", "inflate", null, 8)) {
                Y9 y92 = c3591b9.c;
                if (y92 != null) {
                    ((Z9) y92).b("HybridVideoPlayerHandler", "Inflate called");
                }
                if (c3591b9.h && (ag = c3591b9.o) != null) {
                    Intrinsics.checkNotNullParameter(adView, "parentView");
                    Y9 y93 = ag.g;
                    if (y93 != null) {
                        Intrinsics.checkNotNullExpressionValue("Ag", "TAG");
                        ((Z9) y93).c("Ag", "startOmidSession");
                    }
                    Bf bf = ag.e;
                    if (bf != null) {
                        Intrinsics.checkNotNullParameter(adView, "adView");
                        if (bf.c == null) {
                            Y9 y94 = bf.b;
                            if (y94 != null) {
                                ((Z9) y94).a(AbstractC3724g1.f, "Failed to registerAdView. adSession is null");
                            }
                        } else {
                            Y9 y95 = bf.b;
                            if (y95 != null) {
                                ((Z9) y95).a(AbstractC3724g1.f, "registerAdView");
                            }
                            AbstractC4012q5.a(bf.f7114a, new C3555a1(bf, adView, null));
                        }
                    }
                    Bf bf2 = ag.e;
                    if (bf2 != null) {
                        if (bf2.c == null) {
                            Y9 y96 = bf2.b;
                            if (y96 != null) {
                                ((Z9) y96).a(AbstractC3724g1.f, "Failed to startAdSession. adSession is null");
                            }
                        } else {
                            Y9 y97 = bf2.b;
                            if (y97 != null) {
                                ((Z9) y97).a(AbstractC3724g1.f, "startAdSession");
                            }
                            AbstractC4012q5.a(bf2.f7114a, new C3640d1(bf2, null));
                        }
                    }
                }
                c3591b9.j.a(adView);
                c3591b9.j.f();
                c3591b9.n = true;
            }
        }
    }

    public final void a(V8 v8, Object obj) {
        if (obj instanceof String) {
            obj = "'" + obj + "'";
        }
        String str = "window.imraid.broadcastEvent('" + v8.f6910a + "', " + obj + ");";
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).b(TAG, "fireHtmlVideoEvents: " + str);
        }
        h(str);
    }

    public final void a(HashMap params) {
        Ag ag;
        Bf bf;
        Intrinsics.checkNotNullParameter(params, "params");
        getListener().a(params);
        C3591b9 c3591b9 = this.a1;
        if (c3591b9 == null || (ag = c3591b9.o) == null || (bf = ag.e) == null) {
            return;
        }
        bf.a(InteractionType.CLICK);
    }

    public static final Unit a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "it");
        SparseArray sparseArray = InMobiAdActivity.t;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Ej ej = InMobiAdActivity.u;
        if (ej != null) {
            ej.c(jsonObject);
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        SparseArray sparseArray = InMobiAdActivity.t;
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Ej ej = InMobiAdActivity.u;
        if (ej != null) {
            ej.b(trackerName, macros);
        }
        return Unit.INSTANCE;
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "initContextualData " + this);
        }
        this.Z0 = new C3671e5(ad != null ? ad.getContextData() : null, this.b0);
    }

    public static final Unit a(Mj it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.b();
        return Unit.INSTANCE;
    }

    public final void a(String url, boolean z) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(url, "url");
        if (!z) {
            k(url);
            return;
        }
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "loadHtmlUrl: prefetching URL content before WebView load");
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Oj oj = this.f0;
        if (oj != null) {
            Map a2 = oj.a();
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("HtmlUrlPrefetchStarted", a2, EnumC3944nm.f7271a);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new C4166vj(url, this, elapsedRealtime, null), 3, null);
        this.A = launch$default;
    }

    @Override // com.inmobi.media.Ji
    public final void a(String mraidApi) {
        Intrinsics.checkNotNullParameter(mraidApi, "mraidApi");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "sendFraudBeaconAndTelemetryEvent " + this);
        }
        e(mraidApi);
        String adType = getAdType();
        if (adType == null) {
            adType = "banner";
        }
        c(mraidApi, adType);
    }

    public final void a(boolean z) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "fireNextAdLoadComplete " + this);
        }
        String str = "window.imraidview.broadcastEvent('adLoadSuccess'," + z + ");";
        Y9 y92 = this.i;
        if (y92 != null) {
            String TAG2 = j1;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ((Z9) y92).c(TAG2, str + " Index: " + getCurrentRenderingPodAdIndex());
        }
        h(str);
    }

    public final void a(int i, int i2) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "fireSizeChanged " + this + " w-" + i + " h-" + i2);
        }
        h("window.mraidview.broadcastEvent('sizeChange'," + i + "," + i2 + ");");
    }

    public final void a(int i) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "fireOrientationChange " + this + ServerSentEventKt.SPACE + i);
        }
        h("window.imraid.broadcastEvent('orientationChange','" + i + "');");
    }

    public final void a(String str, String message, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "fireError " + this + " - " + message + " - " + str2);
        }
        if (str == null || str2 == null) {
            return;
        }
        a(str, "broadcastEvent('error',\"" + message + "\", \"" + str2 + "\")");
    }

    public final void a(String str, JSONObject message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "fireError " + this + " - " + message + " - " + str);
        }
        if (str == null) {
            return;
        }
        h("window.imraidview.broadcastEvent('error','" + message + "', '" + str + "');");
    }

    public final void a(String str, String callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "fireJavaScriptCallback " + this);
        }
        if (str == null) {
            return;
        }
        h(str + "." + callback);
    }

    public final void a(String str, HashMap hashMap) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "processTelemetryEvent " + this);
        }
        getListener().a(str, hashMap);
    }

    public void a(Jg orientationProperties) {
        Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "setOrientationProperties " + this);
        }
        this.I0 = orientationProperties;
        a0();
    }

    public static final void a(Ej ej) {
        ej.getListener().j(ej);
    }

    @Override // com.inmobi.media.Kg
    public final void a(Hg orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "onOrientationUpdate " + this);
        }
    }

    public final void a(Hg orientation, Kq kq) {
        JSONObject jSONObject;
        Jq jq;
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "fireOnSafeAreaChanged " + this);
        }
        Intrinsics.checkNotNullParameter(kq, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        try {
            kq.getClass();
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            jq = (Jq) kq.f6682a.get(orientation);
        } catch (Exception unused) {
        }
        if (jq != null) {
            jSONObject = jq.a();
            jSONObject.put(U3.i.n, Ig.a(orientation));
            h("window.imraid.broadcastEvent('onSafeAreaChange', " + jSONObject + ")");
        }
        jSONObject = null;
        h("window.imraid.broadcastEvent('onSafeAreaChange', " + jSONObject + ")");
    }

    @Override // com.inmobi.media.V2
    public final Ub d() {
        Zb zb;
        String str;
        String str2;
        String str3;
        C4201x0 c4201x0;
        String str4;
        C4201x0 c4201x02;
        String str5;
        C4201x0 c4201x03;
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "initLandingPageHandler " + this);
        }
        boolean z = this.e;
        String str6 = this.f;
        boolean cctEnabled = getAdConfig().getCctEnabled();
        boolean partialTabsEnabled = getAdConfig().getPartialTabsEnabled();
        Ij ij = this.h;
        Vb vb = new Vb(z, str6, cctEnabled, partialTabsEnabled, ij != null ? ij.m : null);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C3998pj c3998pj = this.W0;
        C4110tj c4110tj = this.V0;
        if (this.e) {
            zb = null;
        } else {
            Ij ij2 = this.h;
            long j = (ij2 == null || (c4201x03 = ij2.f6630a) == null) ? 0L : c4201x03.f7470a;
            String impressionId = getImpressionId();
            String str7 = impressionId == null ? "" : impressionId;
            Ij ij3 = this.h;
            zb = new Zb(j, str7, (ij3 == null || (c4201x02 = ij3.f6630a) == null || (str5 = c4201x02.f) == null) ? "" : str5, (ij3 == null || (c4201x0 = ij3.f6630a) == null || (str4 = c4201x0.e) == null) ? "" : str4, (ij3 == null || (str3 = ij3.b) == null) ? "" : str3, (ij3 == null || (str2 = ij3.f) == null) ? "" : str2, (ij3 == null || (str = ij3.d) == null) ? "" : str, ij3 != null ? ij3.h : false, this.f);
        }
        return new Ub(context, vb, c3998pj, c4110tj, this, zb, this.i, new WeakReference(this));
    }

    public final void d(JSONObject jSONObject) {
        short s;
        final String optString = jSONObject.optString(IronSourceConstants.EVENTS_ERROR_CODE);
        Object a2 = AbstractC3784i4.a(new Function0() { // from class: com.inmobi.media.Ej$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Short.valueOf(Ej.m(optString));
            }
        });
        if (Result.m8086isSuccessimpl(a2)) {
            short shortValue = ((Number) a2).shortValue();
            Oj oj = this.f0;
            if (oj != null) {
                Map a3 = oj.a();
                switch (shortValue) {
                    case 101:
                        s = 2261;
                        break;
                    case 102:
                        s = 2262;
                        break;
                    case 103:
                        s = 2263;
                        break;
                    case 104:
                        s = 2267;
                        break;
                    case 105:
                        s = 2266;
                        break;
                    case 106:
                        s = 2265;
                        break;
                    case CUSTOM_ACTION_07_VALUE:
                        s = 2264;
                        break;
                    default:
                        switch (shortValue) {
                            case MRAID_ERROR_VALUE:
                                s = 2268;
                                break;
                            case INVALID_IFA_STATUS_VALUE:
                                s = 2269;
                                break;
                            case 303:
                                s = 2270;
                                break;
                            case AD_EXPIRED_VALUE:
                                s = 2271;
                                break;
                            case MRAID_BRIDGE_ERROR_VALUE:
                                s = 2272;
                                break;
                            case 306:
                                s = 2273;
                                break;
                            case 307:
                                s = 2274;
                                break;
                            case 308:
                                s = 2275;
                                break;
                            case ASSET_FAILED_TO_DELETE_VALUE:
                                s = 2276;
                                break;
                            case AD_HTML_FAILED_TO_LOAD_VALUE:
                                s = 2277;
                                break;
                            case MRAID_JS_CALL_EMPTY_VALUE:
                                s = 2278;
                                break;
                            case DEEPLINK_OPEN_FAILED_VALUE:
                                s = 2280;
                                break;
                            case EVALUATE_JAVASCRIPT_FAILED_VALUE:
                                s = 2281;
                                break;
                            default:
                                s = shortValue;
                                break;
                        }
                }
                a3.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
                long j = oj.c;
                CoroutineScope coroutineScope = AbstractC4143un.f7420a;
                a3.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
                C3829jm c3829jm = C3829jm.f7187a;
                C3829jm.b("CompanionWebViewLoadFailed", a3, EnumC3944nm.f7271a);
            }
        }
    }

    public static final void d(Ej ej, String str) {
        try {
            if (ej.O.get()) {
                return;
            }
            String str2 = "javascript:try{" + str + "}catch(e){}";
            Y9 y9 = ej.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).a(TAG, "Injecting javascript");
            }
            ej.c(str2);
        } catch (Exception e) {
            Y9 y92 = ej.i;
            if (y92 != null) {
                String TAG2 = j1;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                ((Z9) y92).b(TAG2, "SDK encountered an unexpected error injecting JavaScript in the Ad container; " + e.getMessage());
            }
        }
    }

    public final void d(String errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.Q0) {
            Y9 y9 = this.i;
            if (y9 != null) {
                String TAG = j1;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((Z9) y9).a(TAG, "fireAdFailed " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        this.E0 = true;
        Oj oj = this.f0;
        if (oj != null) {
            Map a2 = oj.a();
            long j = oj.c;
            CoroutineScope coroutineScope = AbstractC4143un.f7420a;
            a2.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
            String a3 = oj.a("FireAdFailed");
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b(a3, a2, EnumC3944nm.f7271a);
        }
        getListener().a(this, errorCode);
    }

    public static String d(int i) {
        return "SDK_" + i;
    }

    public final boolean a(JsResult jsResult) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "shouldRenderPopup " + this);
        }
        if (getRenderingConfig().getShouldRenderPopup()) {
            return true;
        }
        jsResult.cancel();
        y();
        return false;
    }

    @Override // com.inmobi.media.Ji
    public final boolean a() {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "hasUserInteracted " + getViewTouchTimestamp() + ServerSentEventKt.SPACE + getRenderingConfig().getUserTouchResetTime());
        }
        if (!getRenderingConfig().getAutoRedirectionEnforcement() || this.n0) {
            return true;
        }
        return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
    }

    public final void a(Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).a(TAG, "handlePingException " + this, e);
        }
        InterfaceC3853kh interfaceC3853kh = this.q;
        A6[] a6Arr = A6.f6449a;
        ((Aj) interfaceC3853kh).a("", PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED, "Ping exception occurred", System.currentTimeMillis(), 0);
        Lazy lazy = Ba.f6473a;
        U9.a(e);
    }

    public static final Unit a(Ej ej, boolean z) {
        Y9 y9 = ej.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "onRenderProcessGone");
        }
        ej.getListener().a(ej, z);
        return Unit.INSTANCE;
    }

    public final void a(boolean z, short s) {
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "fireRenderProcessGoneTelemetry");
        }
        Oj oj = this.f0;
        if (oj != null) {
            oj.a(z, s);
        }
    }

    public final void a(Ej sourceView, String targetId) {
        Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Y9 y9 = this.i;
        if (y9 != null) {
            String TAG = j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y9).c(TAG, "fireDestroyWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", targetId);
        sourceView.h("window.imraidview.broadcastEvent('destroyWebView'," + jSONObject + ");");
    }
}
