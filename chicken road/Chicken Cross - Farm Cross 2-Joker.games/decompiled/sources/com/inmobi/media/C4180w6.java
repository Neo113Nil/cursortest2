package com.inmobi.media;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.CookieManager;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.w6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4180w6 extends V2 implements Ji {
    public long b;
    public final String c;
    public final String d;
    public final String e;
    public final Function1 f;
    public final Y9 g;
    public C4153v6 h;
    public final String i;
    public Yb j;
    public boolean k;
    public boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4180w6(Context context, long j, String placementType, String impressionId, String creativeId, Function1 onLpLifecycleEvent, Y9 y9) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(creativeId, "creativeId");
        Intrinsics.checkNotNullParameter(onLpLifecycleEvent, "onLpLifecycleEvent");
        this.b = j;
        this.c = placementType;
        this.d = impressionId;
        this.e = creativeId;
        this.f = onLpLifecycleEvent;
        this.g = y9;
        this.i = "w6";
        setImportantForAccessibility(2);
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        e();
        if (getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
    }

    public static final Unit a(C4180w6 c4180w6) {
        InterfaceC4125u6 interfaceC4125u6;
        ViewParent parent = c4180w6.getParent();
        C4041r6 c4041r6 = parent instanceof C4041r6 ? (C4041r6) parent : null;
        if (c4041r6 != null && (interfaceC4125u6 = c4041r6.d) != null) {
            D d = ((C4128u9) interfaceC4125u6).f7410a.b;
            Ej ej = d instanceof Ej ? (Ej) d : null;
            if (ej != null) {
                ej.F();
            }
        }
        return Unit.INSTANCE;
    }

    private final AdConfig getAdConfig() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return (AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class);
    }

    private final AdConfig.RenderingConfig getRenderingConfig() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getRendering();
    }

    @Override // com.inmobi.media.Ji
    public final boolean c() {
        String TAG = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return !getRenderingConfig().getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > getRenderingConfig().getUserTouchResetTime() ? 1 : ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == getRenderingConfig().getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.V2
    public final Ub d() {
        Vb vb = new Vb(true, null, getAdConfig().getCctEnabled(), 18);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new Ub(context, vb, null, this, null, this.g, 140);
    }

    public final void e() {
        C4153v6 c4153v6 = new C4153v6("IN_CUSTOM_EXPAND", new Function0() { // from class: com.inmobi.media.w6$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4180w6.a(C4180w6.this);
            }
        }, new Function1() { // from class: com.inmobi.media.w6$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4180w6.a(C4180w6.this, (JSONObject) obj);
            }
        }, new Function2() { // from class: com.inmobi.media.w6$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C4180w6.a(C4180w6.this, (String) obj, (Map) obj2);
            }
        }, this.g, null, 0L);
        setWebViewClient(c4153v6);
        this.h = c4153v6;
    }

    public final Yb getLandingPageTelemetryControlInfo() {
        return this.j;
    }

    @Override // com.inmobi.media.Ji
    public long getViewTouchTimestamp() {
        return this.b;
    }

    @Override // android.webkit.WebView
    public final void loadData(String data, String str, String str2) {
        Intrinsics.checkNotNullParameter(data, "data");
        super.loadData(data, str, str2);
        C4153v6 c4153v6 = this.h;
        if (c4153v6 != null) {
            c4153v6.d = true;
        }
    }

    @Override // android.webkit.WebView
    public final void loadUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        super.loadUrl(url);
        C4153v6 c4153v6 = this.h;
        if (c4153v6 != null) {
            c4153v6.d = true;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        if (!this.l) {
            this.l = true;
            Function1 function1 = this.f;
            Ej.h1.getClass();
            function1.invoke(C3855kj.a("IN_CUSTOM_EXPAND", "onScroll"));
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (!this.k) {
            this.k = true;
            Function1 function1 = this.f;
            Ej.h1.getClass();
            function1.invoke(C3855kj.a("IN_CUSTOM_EXPAND", "onInteraction"));
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setLandingPageTelemetryControlInfo(Yb yb) {
        this.j = yb;
        C4153v6 c4153v6 = this.h;
        if (c4153v6 != null) {
            c4153v6.k = yb;
            c4153v6.l = new Wb(yb, c4153v6);
        }
    }

    public void setViewTouchTimestamp(long j) {
        this.b = j;
    }

    public static final Unit a(C4180w6 c4180w6, JSONObject it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c4180w6.f.invoke(it);
        return Unit.INSTANCE;
    }

    public static final Unit a(C4180w6 c4180w6, String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        ViewParent parent = c4180w6.getParent();
        C4041r6 c4041r6 = parent instanceof C4041r6 ? (C4041r6) parent : null;
        if (c4041r6 != null) {
            Intrinsics.checkNotNullParameter(trackerName, "trackerName");
            Intrinsics.checkNotNullParameter(macros, "macros");
            InterfaceC4125u6 interfaceC4125u6 = c4041r6.d;
            if (interfaceC4125u6 != null) {
                Intrinsics.checkNotNullParameter(trackerName, "trackerName");
                Intrinsics.checkNotNullParameter(macros, "macros");
                D d = ((C4128u9) interfaceC4125u6).f7410a.b;
                Ej ej = d instanceof Ej ? (Ej) d : null;
                if (ej != null) {
                    ej.b(trackerName, macros);
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.inmobi.media.Ji
    public final boolean a() {
        String TAG = this.i;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        return !getRenderingConfig().getAutoRedirectionEnforcement() || ((getViewTouchTimestamp() > (-1L) ? 1 : (getViewTouchTimestamp() == (-1L) ? 0 : -1)) != 0 && ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) > getRenderingConfig().getUserTouchResetTime() ? 1 : ((SystemClock.elapsedRealtime() - getViewTouchTimestamp()) == getRenderingConfig().getUserTouchResetTime() ? 0 : -1)) < 0);
    }

    @Override // com.inmobi.media.Ji
    public final void a(String api) {
        Intrinsics.checkNotNullParameter(api, "api");
        HashMap hashMap = new HashMap();
        hashMap.put("creativeId", this.e);
        hashMap.put("trigger", api);
        hashMap.put("impressionId", this.d);
        hashMap.put("adType", this.c);
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("BlockAutoRedirection", hashMap, EnumC3944nm.f7271a);
    }
}
