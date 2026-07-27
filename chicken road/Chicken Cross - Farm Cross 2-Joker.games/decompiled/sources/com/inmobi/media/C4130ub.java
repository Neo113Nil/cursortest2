package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.C4352c8;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.f;
import com.unity3d.ads.BuildConfig;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.sse.ServerSentEventKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ub, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4130ub {

    /* renamed from: a, reason: collision with root package name */
    public final Ej f7412a;
    public final int b;
    public Y9 c;

    public C4130ub(int i, Ej mRenderView) {
        Intrinsics.checkNotNullParameter(mRenderView, "mRenderView");
        this.f7412a = mRenderView;
        this.b = i;
    }

    public static final void b(C4130ub c4130ub, String str, String str2) {
        Ub.a(c4130ub.f7412a.getLandingPageHandler(), "open", str, str2, (Yb) null, 24);
    }

    public static final void c(C4130ub c4130ub, String str, String str2) {
        Yb yb;
        try {
            Zb zb = c4130ub.f7412a.getLandingPageHandler().f;
            if (zb != null) {
                String a2 = Pb.a(str2);
                Ub landingPageHandler = c4130ub.f7412a.getLandingPageHandler();
                int i = landingPageHandler.i + 1;
                landingPageHandler.i = i;
                yb = new Yb(zb, a2, i, SystemClock.elapsedRealtime());
            } else {
                yb = null;
            }
            if (yb != null) {
                yb.f = "IN_NATIVE";
            }
            c4130ub.f7412a.getLandingPageHandler().d("openEmbedded", str, str2, yb);
        } catch (Exception e) {
            c4130ub.f7412a.a(str, "Unexpected error", "openEmbedded");
            Kc.a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
            Y9 y9 = c4130ub.c;
            if (y9 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y9).b(str3, "SDK encountered unexpected error in handling openEmbedded() request from creative; " + e.getMessage());
            }
        }
    }

    public static final void d(C4130ub c4130ub, String str, String str2) {
        Ub.a(c4130ub.f7412a.getLandingPageHandler(), "openWithoutTracker", str, str2, (Yb) null, 8);
    }

    public static final void e(C4130ub c4130ub, String str, String str2) {
        try {
            Ej ej = c4130ub.f7412a;
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            ej.b(str, str2.subSequence(i, length + 1).toString());
        } catch (Exception e) {
            c4130ub.f7412a.a(str, "Unexpected error", "playVideo");
            Kc.a((byte) 1, "InMobi", "Error playing video; SDK encountered an unexpected error");
            Y9 y9 = c4130ub.c;
            if (y9 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y9).b(str3, "SDK encountered unexpected error in handling playVideo() request from creative; " + e.getMessage());
            }
        }
    }

    public static final void f(C4130ub c4130ub, String str, String str2) {
        try {
            c4130ub.f7412a.getSiblingWebviewManager().b(c4130ub.f7412a.getRoute().b, str, str2);
        } catch (Exception e) {
            c4130ub.f7412a.b(C4352c8.j, Vj.a(str, Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE));
            Y9 y9 = c4130ub.c;
            if (y9 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y9).b(str3, "SDK encountered unexpected error in handling sendMessage() request from creative; " + e.getMessage());
            }
        }
    }

    public final EnumC3663dp a(String str) {
        try {
            for (Object obj : EnumC3663dp.c) {
                if (Intrinsics.areEqual(((EnumC3663dp) obj).f7075a, str)) {
                    return (EnumC3663dp) obj;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Exception unused) {
            Y9 y9 = this.c;
            if (y9 == null) {
                return null;
            }
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "No matching action found for - " + str);
            return null;
        }
    }

    @JavascriptInterface
    public final void asyncPing(String str, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "asyncPing called: " + url);
        }
        if (!URLUtil.isValidUrl(url)) {
            this.f7412a.a(str, "Invalid url", "asyncPing");
            return;
        }
        try {
            Deferred a2 = ((C3733ga) If.c.getValue()).a(new Kf(url, null, null, null, null, false, 62));
            Function1 onCompleted = new Function1() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4130ub.a(C4130ub.this, (Of) obj);
                }
            };
            Intrinsics.checkNotNullParameter(a2, "<this>");
            Intrinsics.checkNotNullParameter(onCompleted, "onCompleted");
            BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new C3586b4(a2, onCompleted, null), 3, null);
        } catch (Exception e) {
            this.f7412a.a(str, "Unexpected error", "asyncPing");
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).b(str3, "SDK encountered internal error in handling asyncPing() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void cancelSaveContent(String str, String mediaId) {
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "cancelSaveContent called. mediaId:" + mediaId);
        }
    }

    @JavascriptInterface
    public final void close(final String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "close called");
        }
        final Ej a2 = a();
        if (a2 == null) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).a(str3, "webview not present cannot be closed");
                return;
            }
            return;
        }
        if (a2.Q0) {
            Y9 y93 = this.c;
            if (y93 != null) {
                String str4 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((Z9) y93).b(str4, "close called on unloaded ad");
                return;
            }
            return;
        }
        Lazy lazy = P6.f6777a;
        Wc wc = (Wc) P6.e.getValue();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4130ub.a(Ej.this, this, str);
            }
        };
        wc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wc.f6931a.post(runnable);
    }

    @JavascriptInterface
    public final void closeAll(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "closeAll is called");
        }
        Ej a2 = a();
        if (a2 != null) {
            a2.i();
            return;
        }
        Y9 y92 = this.c;
        if (y92 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void closeCustomExpand(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "closeCustomExpand called.");
        }
        if (this.b != 1) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).b(str3, "closeCustomExpand called in incorrect Ad type: " + this.b);
                return;
            }
            return;
        }
        if (this.f7412a != null) {
            new Handler(this.f7412a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    C4130ub.a(C4130ub.this);
                }
            });
            return;
        }
        Y9 y93 = this.c;
        if (y93 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y93).b(str4, "Found a null instance of render view!");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        r11 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.AbstractC3904ma.g, null, null, new com.inmobi.media.C3962ob(r9, r11, null), 3, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void createVideoPlayer(String str, String str2) {
        HtmlVideoPlayerRequest htmlVideoPlayerRequest;
        Object launch$default;
        Y9 y9 = this.c;
        if (y9 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).a(str3, "createVideoPlayer is called with config - " + str2);
        }
        G8[] g8Arr = G8.f6577a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMsg", "Invalid config");
        jSONObject.put(f.b.g, "createVideoPlayer");
        jSONObject.put("params", "null");
        if (str2 != null) {
            Object obj = null;
            try {
                JSONObject jsonObject = new JSONObject(str2);
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                Intrinsics.checkNotNullParameter(HtmlVideoPlayerRequest.class, "type");
                htmlVideoPlayerRequest = (HtmlVideoPlayerRequest) HtmlVideoPlayerRequest.class.cast(AbstractC3875lb.a(jsonObject, HtmlVideoPlayerRequest.class, null, null));
            } catch (JSONException e) {
                Ej ej = this.f7412a;
                V8 v8 = V8.b;
                ej.a("VideoCommandError", jSONObject);
                Y9 y92 = this.c;
                if (y92 != null) {
                    String str4 = AbstractC4158vb.f7434a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((Z9) y92).a(str4, "Error while creating config Json.", e);
                    obj = Unit.INSTANCE;
                }
            }
            if (htmlVideoPlayerRequest != null && launch$default != null) {
                obj = launch$default;
                if (obj != null) {
                    return;
                }
            }
            Ej ej2 = this.f7412a;
            V8 v82 = V8.b;
            ej2.a("VideoCommandError", jSONObject);
            obj = Unit.INSTANCE;
            if (obj != null) {
            }
        }
        Ej ej3 = this.f7412a;
        V8 v83 = V8.b;
        ej3.a("VideoCommandError", jSONObject);
        Unit unit = Unit.INSTANCE;
    }

    @JavascriptInterface
    public final void customExpand(String str, String str2, int i, float f, boolean z, boolean z2) {
        Yb yb;
        Y9 y9 = this.c;
        if (y9 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).a(str3, "customExpand called");
        }
        if (this.f7412a.Q0) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str4 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((Z9) y92).b(str4, "customExpand called on unloaded ad");
                return;
            }
            return;
        }
        if (this.b != 1) {
            Y9 y93 = this.c;
            if (y93 != null) {
                String str5 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((Z9) y93).b(str5, "customExpand called in incorrect Ad type: " + this.b);
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i2 = 0;
            boolean z3 = false;
            while (i2 <= length) {
                boolean z4 = Intrinsics.compare((int) str2.charAt(!z3 ? i2 : length), 32) <= 0;
                if (z3) {
                    if (!z4) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z4) {
                    i2++;
                } else {
                    z3 = true;
                }
            }
            if (str2.subSequence(i2, length + 1).toString().length() != 0) {
                if (i < 0 || i >= EnumC4069s6.values().length) {
                    this.f7412a.a(str, "Invalid inputType", "customExpand");
                    return;
                }
                if (f < 0.0f || f > 1.0f) {
                    this.f7412a.a(str, "Invalid screenPercentage", "customExpand");
                    return;
                }
                Zb zb = this.f7412a.getLandingPageHandler().f;
                if (zb != null) {
                    String a2 = Pb.a(str2);
                    Ub landingPageHandler = this.f7412a.getLandingPageHandler();
                    int i3 = landingPageHandler.i + 1;
                    landingPageHandler.i = i3;
                    yb = new Yb(zb, a2, i3, SystemClock.elapsedRealtime());
                } else {
                    yb = null;
                }
                Yb yb2 = yb;
                if (yb2 != null) {
                    yb2.f = "IN_CUSTOM";
                }
                this.f7412a.getLandingPageHandler().a(Mb.d, yb2, Integer.valueOf(ConnectionsStatusCodes.STATUS_ALREADY_HAVE_ACTIVE_STRATEGY));
                a(str, str2, i, f, z2, yb2);
                return;
            }
        }
        this.f7412a.a(str, "Invalid " + i, "customExpand");
    }

    @JavascriptInterface
    public final void customExpandInNative(final String str, final String url, final float f, final boolean z) {
        Intrinsics.checkNotNullParameter(url, "url");
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "customExpandInNative called");
        }
        Ej ej = this.f7412a;
        if (ej.Q0) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).b(str3, "customExpandInNative called on unloaded ad");
                return;
            }
            return;
        }
        if (this.b == 1) {
            if (f < 0.0f || f > 1.0f) {
                ej.a(str, "Invalid screenPercentage", "customExpandInNative");
                return;
            } else {
                AbstractC3604bm.a(new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda14
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4130ub.a(C4130ub.this, str, url, f, z);
                    }
                });
                return;
            }
        }
        Y9 y93 = this.c;
        if (y93 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y93).b(str4, "customExpandInNative called in incorrect Ad type: " + this.b);
        }
    }

    @JavascriptInterface
    public final void destroyVideoPlayer(String str) {
        BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.g, null, null, new C3990pb(this, null), 3, null);
    }

    @JavascriptInterface
    public final void destroyWebView(String str, final String str2) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).a(str3, "destroyWebView called");
        }
        Ej a2 = a();
        if (a2 != null && a2.Q0) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str4 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((Z9) y92).b(str4, "destroyWebView called on unloaded ad");
            }
            Ej ej = this.f7412a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy = Vj.f6915a;
            JSONObject a3 = Ek.a(str2, "targetViewId", "id", str2);
            a3.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            ej.b("destroyWebView", a3);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            Lazy lazy2 = P6.f6777a;
            Wc wc = (Wc) P6.e.getValue();
            Runnable runnable = new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    C4130ub.a(C4130ub.this, str2);
                }
            };
            wc.getClass();
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            wc.f6931a.post(runnable);
            return;
        }
        Ej ej2 = this.f7412a;
        if (str2 == null) {
            str2 = "";
        }
        Lazy lazy3 = Vj.f6915a;
        JSONObject a4 = Ek.a(str2, "targetViewId", "id", str2);
        a4.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
        ej2.b("destroyWebView", a4);
    }

    @JavascriptInterface
    public final void disableBackButton(String str, final boolean z) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "disableBackButton called");
        }
        this.f7412a.getWebViewFactory().a(new Function1() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4130ub.a(z, (Ej) obj);
            }
        });
    }

    @JavascriptInterface
    public final void disableCloseRegion(final String str, final boolean z) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "disableCloseRegion called");
        }
        Lazy lazy = P6.f6777a;
        Wc wc = (Wc) P6.e.getValue();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                C4130ub.a(C4130ub.this, z, str);
            }
        };
        wc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wc.f6931a.post(runnable);
    }

    @JavascriptInterface
    public final void enableNativeGestures(String str, boolean z) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "enableNativeGestures called with enabled: " + z);
        }
        this.f7412a.setEnableNativeGestures(z);
    }

    @JavascriptInterface
    public final void enableTouchBeginCallback(String str, boolean z) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "enableTouchBeginCallback called with enabled: " + z);
        }
        this.f7412a.setEnableTouchBeginCallback(z);
    }

    @JavascriptInterface
    public final void enableTouchEndCallback(String str, boolean z) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "enableTouchEndCallback called with enabled: " + z);
        }
        this.f7412a.setEnableTouchEndCallback(z);
    }

    @JavascriptInterface
    public final void executeVideoPlayerActions(String str, String action, String str2) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(action, "action");
        Y9 y9 = this.c;
        if (y9 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).a(str3, "executeVideoPlayerActions is called with action - " + action + ", " + str2);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoCommand", action);
        jSONObject.put("config", str2);
        G8[] g8Arr = G8.f6577a;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errorMsg", "Invalid action");
        jSONObject2.put(f.b.g, "executeVideoPlayerActions");
        jSONObject2.put("params", String.valueOf(jSONObject));
        try {
            EnumC3663dp a2 = a(action);
            if (a2 != null) {
                launch$default = BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.g, null, null, new C4018qb(this, a2, jSONObject, null), 3, null);
                if (launch$default != null) {
                    return;
                }
            }
            Ej ej = this.f7412a;
            V8 v8 = V8.b;
            ej.a("VideoCommandError", jSONObject2);
            Unit unit = Unit.INSTANCE;
        } catch (JSONException e) {
            Ej ej2 = this.f7412a;
            V8 v82 = V8.b;
            ej2.a("VideoCommandError", jSONObject2);
            Y9 y92 = this.c;
            if (y92 != null) {
                String str4 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((Z9) y92).a(str4, "Error while creating action Json.", e);
            }
        }
    }

    @JavascriptInterface
    public final void fireAdFailed(String str) {
        fireAdFailed(str, "");
    }

    @JavascriptInterface
    public final void fireAdReady(String str) {
        try {
            Y9 y9 = this.c;
            if (y9 != null) {
                String str2 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((Z9) y9).a(str2, "fireAdReady called.");
            }
            this.f7412a.r();
        } catch (Exception e) {
            this.f7412a.a(str, "Unexpected error", "fireAdReady");
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).b(str3, "SDK encountered unexpected error in handling fireAdReady() signal from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void fireComplete(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "fireComplete is called");
        }
        Ej ej = this.f7412a;
        if (ej != null) {
            ej.j();
            return;
        }
        Y9 y92 = this.c;
        if (y92 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y92).b(str3, "Found a null instance of render view!");
        }
    }

    @JavascriptInterface
    public final void fireSkip(String str) {
        Y9 y9;
        Y9 y92 = this.c;
        if (y92 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y92).a(str2, "fireSkip is called");
        }
        if (this.f7412a == null && (y9 = this.c) != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).b(str3, "Found a null instance of render view!");
        }
        this.f7412a.R();
    }

    @JavascriptInterface
    public final String getAdContext(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "getAdContext is called");
        }
        Ej a2 = a();
        if (a2 != null) {
            InterfaceC4228y0 adPodHandler = a2.getAdPodHandler();
            if (adPodHandler != null) {
                return ((AbstractC3923n1) adPodHandler).v();
            }
            return null;
        }
        Y9 y92 = this.c;
        if (y92 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y92).b(str3, "Found a null instance of ad render view!");
        }
        return null;
    }

    @JavascriptInterface
    public final void getBlob(String str, String str2) {
        InterfaceC3585b3 interfaceC3585b3;
        Y9 y9 = this.c;
        if (y9 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).a(str3, "getBlob is called");
        }
        Ej ej = this.f7412a;
        if (ej == null) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str4 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((Z9) y92).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        Y9 y93 = ej.i;
        if (y93 != null) {
            String TAG = Ej.j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y93).a(TAG, "getBlob");
        }
        if (str == null || str2 == null || (interfaceC3585b3 = ej.l0) == null) {
            return;
        }
        ((AbstractC3923n1) interfaceC3585b3).a(str, str2, ej, ej.getImpressionId());
    }

    @JavascriptInterface
    public final String getCurrentPosition(String str) {
        Ej ej;
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "getCurrentPosition called");
        }
        Ej ej2 = this.f7412a;
        if (ej2 == null) {
            Y9 y92 = this.c;
            if (y92 == null) {
                return "";
            }
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y92).b(str3, "Found a null instance of render view!");
            return "";
        }
        synchronized (ej2.getCurrentPositionMonitor()) {
            this.f7412a.H = true;
            new Handler(this.f7412a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    C4130ub.b(C4130ub.this);
                }
            });
            while (true) {
                ej = this.f7412a;
                if (ej.H) {
                    try {
                        ej.getCurrentPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        return ej.getCurrentPosition();
    }

    @JavascriptInterface
    public final int getCurrentRenderingIndex(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "getCurrentRenderingIndex is called");
        }
        Ej a2 = a();
        if (a2 != null) {
            return a2.getCurrentRenderingPodAdIndex();
        }
        Y9 y92 = this.c;
        if (y92 == null) {
            return 0;
        }
        String str3 = AbstractC4158vb.f7434a;
        Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
        ((Z9) y92).b(str3, "Found a null instance of ad render view!");
        return 0;
    }

    @JavascriptInterface
    public final String getDefaultPosition(String str) {
        Ej ej;
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "getDefaultPosition called");
        }
        synchronized (this.f7412a.getDefaultPositionMonitor()) {
            this.f7412a.G = true;
            new Handler(this.f7412a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C4130ub.c(C4130ub.this);
                }
            });
            while (true) {
                ej = this.f7412a;
                if (ej.G) {
                    try {
                        ej.getDefaultPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        return ej.getDefaultPosition();
    }

    @JavascriptInterface
    public final int getDeviceVolume(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "getDeviceVolume called");
        }
        Ej ej = this.f7412a;
        if (ej == null) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).b(str3, "Found a null instance of render view!");
            }
            return -1;
        }
        try {
            C4187wd mediaProcessor = ej.getMediaProcessor();
            if (mediaProcessor != null) {
                return mediaProcessor.a();
            }
        } catch (Exception e) {
            this.f7412a.a(str, "Unexpected error", "getDeviceVolume");
            Y9 y93 = this.c;
            if (y93 != null) {
                String str4 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((Z9) y93).b(str4, "SDK encountered unexpected error in handling getDeviceVolume() request from creative; " + e.getMessage());
            }
        }
        return -1;
    }

    @JavascriptInterface
    public final int getMaxDeviceVolume(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "getMaxDeviceVolume called");
        }
        try {
            Y5 y5 = Y5.f6965a;
            y5.getClass();
            return ((Number) Y5.f.getValue(y5, Y5.b[0])).intValue();
        } catch (Exception e) {
            this.f7412a.a(str, "Unexpected error", "getMaxDeviceVolume");
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).b(str3, "SDK encountered unexpected error in handling getMaxDeviceVolume() request from creative; " + e.getMessage());
            }
            return 0;
        }
    }

    @JavascriptInterface
    public final String getMaxSize(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "getMaxSize called");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Activity fullScreenActivity = this.f7412a.getFullScreenActivity();
            if (fullScreenActivity == null) {
                Context containerContext = this.f7412a.getContainerContext();
                if ((containerContext instanceof Activity ? (Activity) containerContext : null) == null) {
                    return getScreenSize(str);
                }
                Context containerContext2 = this.f7412a.getContainerContext();
                Intrinsics.checkNotNull(containerContext2, "null cannot be cast to non-null type android.app.Activity");
                fullScreenActivity = (Activity) containerContext2;
            }
            FrameLayout frameLayout = (FrameLayout) fullScreenActivity.findViewById(R.id.content);
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = AbstractC3727g4.b(frameLayout.getWidth() / AbstractC3841k6.b());
            Ref.IntRef intRef2 = new Ref.IntRef();
            intRef2.element = AbstractC3727g4.b(frameLayout.getHeight() / AbstractC3841k6.b());
            if (this.f7412a.getFullScreenActivity() != null && (intRef.element == 0 || intRef2.element == 0)) {
                Intrinsics.checkNotNull(frameLayout);
                ViewTreeObserverOnGlobalLayoutListenerC3933nb viewTreeObserverOnGlobalLayoutListenerC3933nb = new ViewTreeObserverOnGlobalLayoutListenerC3933nb(frameLayout, this.c);
                frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3933nb);
                BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new C4046rb(viewTreeObserverOnGlobalLayoutListenerC3933nb, intRef, intRef2, null), 3, null);
            }
            try {
                jSONObject.put("width", intRef.element);
                jSONObject.put("height", intRef2.element);
            } catch (JSONException e) {
                Y9 y92 = this.c;
                if (y92 != null) {
                    String str3 = AbstractC4158vb.f7434a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((Z9) y92).a(str3, "Error while creating max size Json.", e);
                }
            }
            Y9 y93 = this.c;
            if (y93 != null) {
                String str4 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((Z9) y93).a(str4, "getMaxSize called:" + jSONObject);
            }
        } catch (Exception e2) {
            this.f7412a.a(str, "Unexpected error", "getMaxSize");
            Y9 y94 = this.c;
            if (y94 != null) {
                String str5 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((Z9) y94).b(str5, "SDK encountered unexpected error in handling getMaxSize() request from creative; " + e2.getMessage());
            }
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @JavascriptInterface
    public final String getOrientation(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "getOrientation called");
        }
        byte g = AbstractC3841k6.g();
        return g == 1 ? "0" : g == 3 ? "90" : g == 2 ? "180" : g == 4 ? "270" : com.ironsource.Y1.f;
    }

    @JavascriptInterface
    public final String getOrientationProperties(String str) {
        Ej a2 = a();
        if (a2 == null) {
            a2 = this.f7412a;
        }
        String str2 = a2.getOrientationProperties().d;
        Y9 y9 = this.c;
        if (y9 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).a(str3, "getOrientationProperties called: " + str2);
        }
        Intrinsics.checkNotNull(str2);
        return str2;
    }

    @JavascriptInterface
    public final String getPlacementType(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "getPlacementType called");
        }
        return 1 == this.b ? "interstitial" : "inline";
    }

    @JavascriptInterface
    public final String getPlatform(String str) {
        Y9 y9 = this.c;
        if (y9 == null) {
            return "android";
        }
        String str2 = AbstractC4158vb.f7434a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((Z9) y9).a(str2, "getPlatform. Platform:android");
        return "android";
    }

    @JavascriptInterface
    public final String getPlatformVersion(String str) {
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "getPlatformVersion. Version:" + valueOf);
        }
        return valueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public final String getPlaybackState(String str) {
        Y9 y9;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.g, null, null, new C4074sb(this, objectRef, countDownLatch, null), 3, null);
        if (!countDownLatch.await(1L, TimeUnit.SECONDS) && (y9 = this.c) != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).b(str2, "getPlaybackState timed out waiting on main thread");
        }
        JSONObject jSONObject = (JSONObject) objectRef.element;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    @JavascriptInterface
    public final String getRenderableAdIndexes(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "getRenderableAdIndexes is called");
        }
        Ej a2 = a();
        if (a2 == null) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).b(str3, "Found a null instance of ad render view!");
            }
            String jSONArray = new JSONArray().toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
            return jSONArray;
        }
        JSONArray renderableAdIndexes = a2.getRenderableAdIndexes();
        Y9 y93 = this.c;
        if (y93 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y93).a(str4, "renderableAdIndexes called:" + renderableAdIndexes);
        }
        String jSONArray2 = renderableAdIndexes.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    @JavascriptInterface
    public final String getSafeArea(String str) {
        JSONObject safeArea = this.f7412a.getSafeArea();
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "getSafeArea called:" + safeArea);
        }
        if (safeArea != null) {
            return safeArea.toString();
        }
        return null;
    }

    @JavascriptInterface
    public final String getScreenSize(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", AbstractC3841k6.h().f7240a);
            jSONObject.put("height", AbstractC3841k6.h().b);
            Y9 y9 = this.c;
            if (y9 != null) {
                String str2 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                Z9 z9 = (Z9) y9;
                z9.c(str2, "Message:Width x Height : " + AbstractC3841k6.h().f7240a + "x" + AbstractC3841k6.h().b);
            }
        } catch (JSONException unused) {
        } catch (Exception e) {
            this.f7412a.a(str, "Unexpected error", "getScreenSize");
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).b(str3, "SDK encountered unexpected error while getting screen dimensions; " + e.getMessage());
            }
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        Y9 y93 = this.c;
        if (y93 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y93).a(str4, "getScreenSize called:" + jSONObject2);
        }
        return jSONObject2;
    }

    @JavascriptInterface
    public final String getSdkVersion(String str) {
        Y9 y9 = this.c;
        if (y9 == null) {
            return "11.4.0";
        }
        String str2 = AbstractC4158vb.f7434a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((Z9) y9).a(str2, "getSdkVersion called. Version:11.4.0");
        return "11.4.0";
    }

    @JavascriptInterface
    public final long getShowTimeStamp(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "getShowTimeStamp is called");
        }
        Ej a2 = a();
        if (a2 == null) {
            Y9 y92 = this.c;
            if (y92 == null) {
                return 0L;
            }
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y92).b(str3, "Found a null instance of ad render view!");
            return 0L;
        }
        long showTimeStamp = a2.getShowTimeStamp();
        Y9 y93 = this.c;
        if (y93 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y93).a(str4, "getShowTimeStamp is " + showTimeStamp);
        }
        return showTimeStamp;
    }

    @JavascriptInterface
    public final String getState(String str) {
        String viewState = this.f7412a.getViewState();
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = viewState.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).c(str2, "getState called:" + lowerCase);
        }
        return lowerCase;
    }

    @JavascriptInterface
    public final String getVersion(String str) {
        Y9 y9 = this.c;
        if (y9 == null) {
            return "2.0";
        }
        String str2 = AbstractC4158vb.f7434a;
        Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
        ((Z9) y9).a(str2, "getVersion called. Version:2.0");
        return "2.0";
    }

    @JavascriptInterface
    public final void impressionFired(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "impressionFired is called");
        }
        this.f7412a.E();
    }

    @JavascriptInterface
    public final void incentCompleted(String str, String str2) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).a(str3, "incentCompleted called. IncentData:" + str2);
        }
        this.f7412a.w();
        Oj renderViewTelemetry = this.f7412a.getRenderViewTelemetry();
        if (renderViewTelemetry != null) {
            Map a2 = renderViewTelemetry.a();
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("RewardReceived", a2, EnumC3944nm.f7271a);
        }
        if (str2 == null) {
            try {
                this.f7412a.getListener().a(new HashMap(), renderViewTelemetry);
                return;
            } catch (Exception e) {
                this.f7412a.a(str, "Unexpected error", "incentCompleted");
                if (renderViewTelemetry != null) {
                    renderViewTelemetry.a((short) 2427);
                }
                Y9 y92 = this.c;
                if (y92 != null) {
                    String str4 = AbstractC4158vb.f7434a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((Z9) y92).b(str4, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e.getMessage());
                    return;
                }
                return;
            }
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
                    String str5 = next;
                    hashMap.put(str5, jSONObject.get(str5));
                }
                try {
                    this.f7412a.getListener().a(hashMap, renderViewTelemetry);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e2) {
                    this.f7412a.a(str, "Unexpected error", "incentCompleted");
                    if (renderViewTelemetry != null) {
                        renderViewTelemetry.a((short) 2427);
                    }
                    Y9 y93 = this.c;
                    if (y93 != null) {
                        String str6 = AbstractC4158vb.f7434a;
                        Intrinsics.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
                        ((Z9) y93).b(str6, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e2.getMessage());
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            } catch (JSONException unused) {
                this.f7412a.getListener().a(new HashMap(), renderViewTelemetry);
                Unit unit3 = Unit.INSTANCE;
            }
        } catch (Exception e3) {
            this.f7412a.a(str, "Unexpected error", "incentCompleted");
            if (renderViewTelemetry != null) {
                renderViewTelemetry.a((short) 2427);
            }
            Y9 y94 = this.c;
            if (y94 != null) {
                String str7 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str7, "access$getTAG$p(...)");
                ((Z9) y94).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e3.getMessage());
                Unit unit4 = Unit.INSTANCE;
            }
        }
    }

    @JavascriptInterface
    public final boolean isBackButtonDisabled(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "isBackButtonDisabled called");
        }
        Ej a2 = a();
        if (a2 == null) {
            a2 = this.f7412a;
        }
        return a2.M;
    }

    @JavascriptInterface
    public final String isDeviceMuted(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "isDeviceMuted called");
        }
        if (this.f7412a == null) {
            Y9 y92 = this.c;
            if (y92 == null) {
                return "false";
            }
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y92).b(str3, "Found a null instance of render view!");
            return "false";
        }
        Y9 y93 = this.c;
        if (y93 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y93).a(str4, "JavaScript called: isDeviceMuted()");
        }
        boolean z = false;
        try {
            C4187wd mediaProcessor = this.f7412a.getMediaProcessor();
            Intrinsics.checkNotNull(mediaProcessor);
            Y9 y94 = mediaProcessor.b;
            if (y94 != null) {
                ((Z9) y94).c("MraidMediaProcessor", "isVolumeMuted");
            }
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                AudioManager audioManager = null;
                try {
                    Object systemService = context.getSystemService("audio");
                    if (!(systemService instanceof AudioManager)) {
                        systemService = null;
                    }
                    audioManager = (AudioManager) systemService;
                } catch (Throwable unused) {
                }
                if (audioManager != null) {
                    if (2 != audioManager.getRingerMode()) {
                        z = true;
                    }
                }
            }
        } catch (Exception e) {
            Y9 y95 = this.c;
            if (y95 != null) {
                String str5 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((Z9) y95).b(str5, "SDK encountered unexpected error in checking if device is muted; " + e.getMessage());
            }
        }
        return String.valueOf(z);
    }

    @JavascriptInterface
    public final String isHeadphonePlugged(String str) {
        boolean z;
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "isHeadphonePlugged called");
        }
        if (this.f7412a == null) {
            Y9 y92 = this.c;
            if (y92 == null) {
                return "false";
            }
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y92).b(str3, "Found a null instance of render view!");
            return "false";
        }
        Y9 y93 = this.c;
        if (y93 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y93).a(str4, "JavaScript called: isHeadphonePlugged()");
        }
        try {
            C4187wd mediaProcessor = this.f7412a.getMediaProcessor();
            Intrinsics.checkNotNull(mediaProcessor);
            mediaProcessor.getClass();
            z = C4187wd.b();
        } catch (Exception e) {
            Y9 y94 = this.c;
            if (y94 != null) {
                String str5 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((Z9) y94).b(str5, "SDK encountered unexpected error in checking if headphones are plugged-in; " + e.getMessage());
            }
            z = false;
        }
        return String.valueOf(z);
    }

    @JavascriptInterface
    public final boolean isViewable(String str) {
        Ej ej = this.f7412a;
        if (ej != null) {
            return ej.K == Vp.c;
        }
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).b(str2, "Found a null instance of render view!");
        }
        return false;
    }

    @JavascriptInterface
    public final void loadAd(String str, int i) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "loadAd is called with index - " + i);
        }
        Ej a2 = a();
        if (a2 != null) {
            a2.b(i);
            return;
        }
        Y9 y92 = this.c;
        if (y92 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void loadWebView(String str, final String str2, final String str3) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y9).a(str4, "loadWebView called with html: " + str3);
        }
        Ej a2 = a();
        if (a2 != null && a2.Q0) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str5 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((Z9) y92).b(str5, "loadWebView called on unloaded ad");
            }
            Ej ej = this.f7412a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy = Vj.f6915a;
            JSONObject a3 = Ek.a(str2, "targetViewId", "id", str2);
            a3.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            ej.b("loadWebView", a3);
            return;
        }
        Ej a4 = a();
        if (a4 == null || a4.getPlacementType() != 1) {
            Y9 y93 = this.c;
            if (y93 != null) {
                String str6 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
                ((Z9) y93).b(str6, "sibling creation not allowed for inline placement type");
            }
            Ej ej2 = this.f7412a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy2 = Vj.f6915a;
            JSONObject a5 = Ek.a(str2, "targetViewId", "id", str2);
            a5.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE);
            ej2.b("loadWebView", a5);
            return;
        }
        if (str2 == null || StringsKt.isBlank(str2)) {
            Ej ej3 = this.f7412a;
            Lazy lazy3 = Vj.f6915a;
            JSONObject a6 = Ek.a("", "targetViewId", "id", "");
            a6.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
            ej3.b("loadWebView", a6);
            return;
        }
        if (str3 == null || str3.length() == 0) {
            this.f7412a.b("loadWebView", Vj.a(str2, Sdk.SDKError.Reason.MRAID_ERROR_VALUE));
            return;
        }
        Lazy lazy4 = P6.f6777a;
        Wc wc = (Wc) P6.e.getValue();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C4130ub.a(C4130ub.this, str2, str3);
            }
        };
        wc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wc.f6931a.post(runnable);
    }

    @JavascriptInterface
    public final void log(String str, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).c(str2, "Log called. Message:" + message);
        }
        Ej ej = this.f7412a;
        ej.getClass();
        C3855kj c3855kj = Ej.h1;
        c3855kj.getClass();
        if (!((Boolean) Ej.k1.getValue(c3855kj, C3855kj.f7205a[0])).booleanValue() || message == null) {
            return;
        }
        ej.getListener().a(message);
    }

    @JavascriptInterface
    public final void logTelemetryEvent(String str, String eventType, String str2) {
        if (eventType == null) {
            Y9 y9 = this.c;
            if (y9 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y9).b(str3, "eventType is null");
                return;
            }
            return;
        }
        Y9 y92 = this.c;
        if (y92 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y92).a(str4, "logTelemetryEvent is called: " + eventType);
        }
        Ej ej = this.f7412a;
        ej.getClass();
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Oj oj = ej.f0;
        if (oj != null) {
            oj.a(eventType, str2);
        }
    }

    @JavascriptInterface
    public final void onAudioStateChanged(String str, int i) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "onAudioStateChanged is called: " + i);
        }
        EnumC3952o2.b.getClass();
        EnumC3952o2 enumC3952o2 = (EnumC3952o2) EnumC3952o2.c.get(i);
        if (enumC3952o2 == null) {
            enumC3952o2 = EnumC3952o2.d;
        }
        if (enumC3952o2 != EnumC3952o2.d) {
            this.f7412a.getListener().a(enumC3952o2);
        }
    }

    @JavascriptInterface
    public final void onOrientationChange(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, ">>> onOrientationChange() >>> This API is deprecated!");
        }
    }

    @JavascriptInterface
    public final void onUserAudioMuteInteraction(String str, boolean z) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "onAudioMuteInteraction is called: " + z);
        }
        this.f7412a.getListener().a(z);
    }

    @JavascriptInterface
    public final void onUserInteraction(String str, String str2) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).a(str3, "onUserInteraction called");
        }
        Ej ej = this.f7412a;
        if (ej != null && !ej.a()) {
            this.f7412a.a("onUserInteraction");
            return;
        }
        Y9 y92 = this.c;
        if (y92 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y92).a(str4, "onUserInteraction called. Params:" + str2);
        }
        if (str2 == null) {
            try {
                this.f7412a.a(new HashMap());
                return;
            } catch (Exception e) {
                this.f7412a.a(str, "Unexpected error", "onUserInteraction");
                Y9 y93 = this.c;
                if (y93 != null) {
                    String str5 = AbstractC4158vb.f7434a;
                    Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                    ((Z9) y93).b(str5, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e.getMessage());
                    return;
                }
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.String");
                String str6 = next;
                hashMap.put(str6, jSONObject.get(str6));
            }
            try {
                try {
                    this.f7412a.a(hashMap);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e2) {
                    this.f7412a.a(str, "Unexpected error", "onUserInteraction");
                    Y9 y94 = this.c;
                    if (y94 != null) {
                        String str7 = AbstractC4158vb.f7434a;
                        Intrinsics.checkNotNullExpressionValue(str7, "access$getTAG$p(...)");
                        ((Z9) y94).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e2.getMessage());
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            } catch (Exception e3) {
                this.f7412a.a(str, "Unexpected error", "onUserInteraction");
                Y9 y95 = this.c;
                if (y95 != null) {
                    String str8 = AbstractC4158vb.f7434a;
                    Intrinsics.checkNotNullExpressionValue(str8, "access$getTAG$p(...)");
                    ((Z9) y95).b(str8, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e3.getMessage());
                    Unit unit3 = Unit.INSTANCE;
                }
            }
        } catch (JSONException unused) {
            this.f7412a.a(new HashMap());
            Unit unit4 = Unit.INSTANCE;
        }
    }

    @JavascriptInterface
    public final void open(final String str, final String str2) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).a(str3, "open called");
        }
        if (!this.f7412a.a()) {
            this.f7412a.a("open");
            return;
        }
        Ej ej = this.f7412a;
        if (!ej.Q0) {
            ej.t();
            AbstractC3604bm.a(new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    C4130ub.b(C4130ub.this, str, str2);
                }
            });
            return;
        }
        Y9 y92 = this.c;
        if (y92 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y92).b(str4, "open called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void openEmbedded(final String str, final String str2) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).a(str3, "openEmbedded called");
        }
        if (!this.f7412a.a()) {
            this.f7412a.a("openEmbedded");
            return;
        }
        Ej ej = this.f7412a;
        if (!ej.Q0) {
            ej.t();
            AbstractC3604bm.a(new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    C4130ub.c(C4130ub.this, str, str2);
                }
            });
            return;
        }
        Y9 y92 = this.c;
        if (y92 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y92).b(str4, "openEmbedded called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void openExternal(String str, String url, String str2) {
        Yb yb;
        Intrinsics.checkNotNullParameter(url, "url");
        Y9 y9 = this.c;
        if (y9 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).a(str3, "open External");
        }
        Ej ej = this.f7412a;
        if (ej == null) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str4 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((Z9) y92).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (ej.Q0) {
            Y9 y93 = this.c;
            if (y93 != null) {
                String str5 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((Z9) y93).b(str5, "open called on unloaded ad");
                return;
            }
            return;
        }
        if (!ej.a()) {
            this.f7412a.a("openExternal");
            return;
        }
        this.f7412a.t();
        Y9 y94 = this.c;
        if (y94 != null) {
            String str6 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str6, "access$getTAG$p(...)");
            ((Z9) y94).a(str6, "openExternal called with url: " + url + " , schema: " + Pb.a(url) + ", fallback - " + str2);
        }
        Zb zb = this.f7412a.getLandingPageHandler().f;
        if (zb != null) {
            String a2 = Pb.a(url);
            Ub landingPageHandler = this.f7412a.getLandingPageHandler();
            int i = landingPageHandler.i + 1;
            landingPageHandler.i = i;
            yb = new Yb(zb, a2, i, SystemClock.elapsedRealtime());
        } else {
            yb = null;
        }
        if (yb != null) {
            yb.f = "EX_NATIVE";
        }
        this.f7412a.getLandingPageHandler().a(Mb.d, yb, (Integer) null);
        Ub landingPageHandler2 = this.f7412a.getLandingPageHandler();
        landingPageHandler2.getClass();
        Intrinsics.checkNotNullParameter("openExternal", "api");
        if (url != null) {
            landingPageHandler2.f(str, url, str2, yb);
            return;
        }
        if (str2 != null) {
            landingPageHandler2.f(str, str2, null, yb);
            return;
        }
        landingPageHandler2.a(Mb.e, yb, (Integer) 2);
        Lb lb = landingPageHandler2.d;
        if (lb != null) {
            lb.a(str, "Empty url and fallback url", "openExternal");
        }
        Y9 y95 = landingPageHandler2.g;
        if (y95 != null) {
            Intrinsics.checkNotNullExpressionValue("Ub", "TAG");
            ((Z9) y95).b("Ub", "Empty deeplink and fallback urls");
        }
    }

    @JavascriptInterface
    public final void openInlineInstaller(final String str, final String str2, boolean z, final String str3) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y9).a(str4, "openInlineInstaller called");
        }
        Ej ej = this.f7412a;
        if (ej.Q0) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str5 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((Z9) y92).b(str5, "openInlineInstaller called on unloaded ad");
                return;
            }
            return;
        }
        if (!z && !ej.a()) {
            this.f7412a.a("openInlineInstaller");
        } else {
            this.f7412a.t();
            AbstractC3604bm.a(new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda10
                @Override // java.lang.Runnable
                public final void run() {
                    C4130ub.a(C4130ub.this, str, str3, str2);
                }
            });
        }
    }

    @JavascriptInterface
    public final void openWithoutTracker(final String str, final String str2) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).a(str3, "openWithoutTracker called");
        }
        if (!this.f7412a.a()) {
            this.f7412a.a("openWithoutTracker");
            return;
        }
        if (!this.f7412a.Q0) {
            AbstractC3604bm.a(new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    C4130ub.d(C4130ub.this, str, str2);
                }
            });
            return;
        }
        Y9 y92 = this.c;
        if (y92 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y92).b(str4, "openWithoutTracker called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void ping(String str, String url, boolean z) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "ping called");
        }
        if (this.f7412a == null) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (url != null) {
            int length = url.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                boolean z3 = Intrinsics.compare((int) url.charAt(!z2 ? i : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i++;
                } else {
                    z2 = true;
                }
            }
            if (url.subSequence(i, length + 1).toString().length() != 0 && URLUtil.isValidUrl(url)) {
                Y9 y93 = this.c;
                if (y93 != null) {
                    String str4 = AbstractC4158vb.f7434a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((Z9) y93).a(str4, "JavaScript called ping() URL: >>> " + url + " <<<");
                }
                try {
                    X3 x3 = X3.f6941a;
                    Y9 y94 = this.c;
                    Intrinsics.checkNotNullParameter(url, "url");
                    X3.a(url, z, y94);
                    return;
                } catch (Exception e) {
                    this.f7412a.a(str, "Unexpected error", "ping");
                    Kc.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    Y9 y95 = this.c;
                    if (y95 != null) {
                        String str5 = AbstractC4158vb.f7434a;
                        Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                        ((Z9) y95).b(str5, "SDK encountered unexpected error in handling ping() request from creative; " + e.getMessage());
                        return;
                    }
                    return;
                }
            }
        }
        this.f7412a.a(str, "Invalid URL:" + url, "ping");
    }

    @JavascriptInterface
    public final void pingInWebView(String str, String url, boolean z) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "openInWebView called");
        }
        if (url != null) {
            int length = url.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                boolean z3 = Intrinsics.compare((int) url.charAt(!z2 ? i : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i++;
                } else {
                    z2 = true;
                }
            }
            if (url.subSequence(i, length + 1).toString().length() != 0 && URLUtil.isValidUrl(url)) {
                Y9 y92 = this.c;
                if (y92 != null) {
                    String str3 = AbstractC4158vb.f7434a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((Z9) y92).a(str3, "JavaScript called pingInWebView() URL: >>> " + url + " <<<");
                }
                try {
                    X3 x3 = X3.f6941a;
                    Y9 y93 = this.c;
                    Intrinsics.checkNotNullParameter(url, "url");
                    Vh.a(Sh.b, new Q3(url, z, y93, null));
                    return;
                } catch (Exception e) {
                    this.f7412a.a(str, "Unexpected error", "pingInWebView");
                    Kc.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    Y9 y94 = this.c;
                    if (y94 != null) {
                        String str4 = AbstractC4158vb.f7434a;
                        Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                        ((Z9) y94).b(str4, "SDK encountered unexpected error in handling pingInWebView() request from creative; " + e.getMessage());
                        return;
                    }
                    return;
                }
            }
        }
        this.f7412a.a(str, "Invalid URL:" + url, "pingInWebView");
    }

    @JavascriptInterface
    public final void pingV2(String str, String pingJson) {
        Intrinsics.checkNotNullParameter(pingJson, "pingJson");
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "pingV2 called with JSON: >>> " + pingJson + " <<<");
        }
        try {
            this.f7412a.g(pingJson);
        } catch (Exception e) {
            this.f7412a.a(str, "Unexpected error", "ping");
            this.f7412a.a(e);
            Kc.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).b(str3, "SDK encountered unexpected error in handling ping() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void playVideo(final String str, final String str2) {
        if (this.f7412a == null) {
            Y9 y9 = this.c;
            if (y9 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y9).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str2.subSequence(i, length + 1).toString().length() != 0 && StringsKt.startsWith$default(str2, ProxyConfig.MATCH_HTTP, false, 2, (Object) null) && (StringsKt.endsWith$default(str2, "mp4", false, 2, (Object) null) || StringsKt.endsWith$default(str2, "avi", false, 2, (Object) null) || StringsKt.endsWith$default(str2, "m4v", false, 2, (Object) null))) {
                Y9 y92 = this.c;
                if (y92 != null) {
                    String str4 = AbstractC4158vb.f7434a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((Z9) y92).a(str4, "JavaScript called: playVideo (" + str2 + ")");
                }
                new Handler(this.f7412a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda18
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4130ub.e(C4130ub.this, str, str2);
                    }
                });
                return;
            }
        }
        this.f7412a.a(str, "Null or empty or invalid media playback URL supplied", "playVideo");
    }

    @JavascriptInterface
    public final void registerBackButtonPressedEventListener(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "registerBackButtonPressedEventListener called");
        }
        Ej ej = this.f7412a;
        if (ej == null) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            ej.l(str);
        } catch (Exception e) {
            this.f7412a.a(str, "Unexpected error", "registerBackButtonPressedEventListener");
            Y9 y93 = this.c;
            if (y93 != null) {
                String str4 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((Z9) y93).b(str4, "SDK encountered unexpected error in handling registerBackButtonPressedEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceMuteEventListener(String jsCallbackNamespace) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((Z9) y9).a(str, "registerDeviceMuteEventListener called");
        }
        Ej ej = this.f7412a;
        if (ej == null) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str2 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((Z9) y92).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                C4187wd mediaProcessor = ej.getMediaProcessor();
                if (mediaProcessor != null) {
                    Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    if (mediaProcessor.d == null) {
                        C3567ad c3567ad = new C3567ad(new C4076sd(mediaProcessor, jsCallbackNamespace));
                        mediaProcessor.d = c3567ad;
                        c3567ad.b();
                    }
                }
            } catch (Exception e) {
                this.f7412a.a(jsCallbackNamespace, "Unexpected error", "registerDeviceMuteEventListener");
                Y9 y93 = this.c;
                if (y93 != null) {
                    String str3 = AbstractC4158vb.f7434a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((Z9) y93).b(str3, "SDK encountered unexpected error in handling registerDeviceMuteEventListener() request from creative; " + e.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceVolumeChangeEventListener(String jsCallbackNamespace) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((Z9) y9).a(str, "registerDeviceVolumeChangeEventListener called");
        }
        Ej ej = this.f7412a;
        if (ej == null) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str2 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((Z9) y92).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                C4187wd mediaProcessor = ej.getMediaProcessor();
                if (mediaProcessor != null) {
                    Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    Context context = AbstractC3914mk.f7252a;
                    if (context != null && mediaProcessor.e == null) {
                        C3567ad c3567ad = new C3567ad(new C4133ud(mediaProcessor, jsCallbackNamespace, context, new Handler(Looper.getMainLooper())));
                        mediaProcessor.e = c3567ad;
                        c3567ad.b();
                    }
                }
            } catch (Exception e) {
                this.f7412a.a(jsCallbackNamespace, "Unexpected error", "registerDeviceVolumeChangeEventListener");
                Y9 y93 = this.c;
                if (y93 != null) {
                    String str3 = AbstractC4158vb.f7434a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((Z9) y93).b(str3, "SDK encountered unexpected error in handling registerDeviceVolumeChangeEventListener() request from creative; " + e.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerHeadphonePluggedEventListener(String jsCallbackNamespace) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((Z9) y9).a(str, "registerHeadphonePluggedEventListener called");
        }
        Ej ej = this.f7412a;
        if (ej == null) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str2 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((Z9) y92).b(str2, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (jsCallbackNamespace != null) {
            try {
                C4187wd mediaProcessor = ej.getMediaProcessor();
                if (mediaProcessor != null) {
                    Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
                    if (mediaProcessor.f == null) {
                        C3567ad c3567ad = new C3567ad(new C4048rd(mediaProcessor, jsCallbackNamespace));
                        mediaProcessor.f = c3567ad;
                        c3567ad.b();
                    }
                }
            } catch (Exception e) {
                this.f7412a.a(jsCallbackNamespace, "Unexpected error", "registerHeadphonePluggedEventListener");
                Y9 y93 = this.c;
                if (y93 != null) {
                    String str3 = AbstractC4158vb.f7434a;
                    Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                    ((Z9) y93).b(str3, "SDK encountered unexpected error in handling registerHeadphonePluggedEventListener() request from creative; " + e.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void saveBlob(String str, String str2) {
        InterfaceC3585b3 interfaceC3585b3;
        Y9 y9 = this.c;
        if (y9 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).a(str3, "saveBlob is called");
        }
        Ej ej = this.f7412a;
        if (ej == null) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str4 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((Z9) y92).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        Y9 y93 = ej.i;
        if (y93 != null) {
            String TAG = Ej.j1;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            ((Z9) y93).a(TAG, "saveBlob");
        }
        if (str2 == null || (interfaceC3585b3 = ej.l0) == null) {
            return;
        }
        ((AbstractC3923n1) interfaceC3585b3).a(str2, ej.getImpressionId());
    }

    @JavascriptInterface
    public final void sendMessage(String str, final String str2, final String str3) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y9).a(str4, "sendMessage called with message: " + str3);
        }
        Ej a2 = a();
        if (a2 != null && a2.Q0) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str5 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((Z9) y92).b(str5, "sendMessage called on unloaded ad");
            }
            Ej ej = this.f7412a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy = Vj.f6915a;
            JSONObject a3 = Ek.a(str2, "targetViewId", "id", str2);
            a3.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            ej.b(C4352c8.j, a3);
            return;
        }
        if (str2 == null || StringsKt.isBlank(str2)) {
            Ej ej2 = this.f7412a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy2 = Vj.f6915a;
            JSONObject a4 = Ek.a(str2, "targetViewId", "id", str2);
            a4.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
            ej2.b(C4352c8.j, a4);
            return;
        }
        if (str3 == null || StringsKt.isBlank(str3)) {
            this.f7412a.b(C4352c8.j, Vj.a(str2, Sdk.SDKError.Reason.MRAID_ERROR_VALUE));
            return;
        }
        Lazy lazy3 = P6.f6777a;
        Wc wc = (Wc) P6.e.getValue();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                C4130ub.f(C4130ub.this, str2, str3);
            }
        };
        wc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wc.f6931a.post(runnable);
    }

    @JavascriptInterface
    public final void setAdContext(String str, String podAdContext) {
        Intrinsics.checkNotNullParameter(podAdContext, "podAdContext");
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "setAdContext is called " + podAdContext);
        }
        Ej a2 = a();
        if (a2 != null) {
            InterfaceC4228y0 adPodHandler = a2.getAdPodHandler();
            if (adPodHandler != null) {
                ((AbstractC3923n1) adPodHandler).c(podAdContext);
                return;
            }
            return;
        }
        Y9 y92 = this.c;
        if (y92 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void setOrientationProperties(String str, final String orientationPropertiesString) {
        Intrinsics.checkNotNullParameter(orientationPropertiesString, "orientationPropertiesString");
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "setOrientationProperties called: " + orientationPropertiesString);
        }
        Lazy lazy = P6.f6777a;
        Wc wc = (Wc) P6.e.getValue();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                C4130ub.b(C4130ub.this, orientationPropertiesString);
            }
        };
        wc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        wc.f6931a.post(runnable);
    }

    @JavascriptInterface
    public final void showAd(String str, int i) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "showAd is called with index " + i);
        }
        Ej a2 = a();
        if (a2 != null) {
            a2.c(i);
            return;
        }
        Y9 y92 = this.c;
        if (y92 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void showAlert(String str, String alert) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "showAlert: " + alert);
        }
    }

    @JavascriptInterface
    public final void showWebView(String str, final String str2) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).a(str3, "showEndCard called");
        }
        Ej a2 = a();
        if (a2 != null && a2.Q0) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str4 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((Z9) y92).b(str4, "showWebView called on unloaded ad");
            }
            Ej ej = this.f7412a;
            if (str2 == null) {
                str2 = "";
            }
            Lazy lazy = Vj.f6915a;
            JSONObject a3 = Ek.a(str2, "targetViewId", "id", str2);
            a3.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            ej.b("showWebView", a3);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            Lazy lazy2 = P6.f6777a;
            Wc wc = (Wc) P6.e.getValue();
            Runnable runnable = new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda20
                @Override // java.lang.Runnable
                public final void run() {
                    C4130ub.c(C4130ub.this, str2);
                }
            };
            wc.getClass();
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            wc.f6931a.post(runnable);
            return;
        }
        Ej ej2 = this.f7412a;
        if (str2 == null) {
            str2 = "";
        }
        Lazy lazy3 = Vj.f6915a;
        JSONObject a4 = Ek.a(str2, "targetViewId", "id", str2);
        a4.put(IronSourceConstants.EVENTS_ERROR_CODE, Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
        ej2.b("showWebView", a4);
    }

    @JavascriptInterface
    public final void storePicture(String str, String str2) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).a(str3, "storePicture is deprecated and no-op. ");
        }
    }

    @JavascriptInterface
    public final void submitAdReport(String str, String adQualityUrl, String enableUserAdReportScreenshot, String templateInfo) {
        Intrinsics.checkNotNullParameter(adQualityUrl, "adQualityUrl");
        Intrinsics.checkNotNullParameter(enableUserAdReportScreenshot, "enableUserAdReportScreenshot");
        Intrinsics.checkNotNullParameter(templateInfo, "templateInfo");
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "submitAdReport called");
        }
        this.f7412a.a(adQualityUrl, templateInfo, Intrinsics.areEqual(enableUserAdReportScreenshot, "1"));
    }

    @JavascriptInterface
    public final String supports(String str, String feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "Checking support for: " + feature);
        }
        String valueOf = String.valueOf(this.f7412a.n(feature));
        Y9 y92 = this.c;
        if (y92 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y92).c(str3, "Message:" + feature + " support: " + valueOf);
        }
        return valueOf;
    }

    @JavascriptInterface
    public final long timeSinceShow(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "timeSinceShow is called");
        }
        Ej a2 = a();
        if (a2 != null) {
            return a2.X();
        }
        Y9 y92 = this.c;
        if (y92 == null) {
            return 0L;
        }
        String str3 = AbstractC4158vb.f7434a;
        Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
        ((Z9) y92).b(str3, "Found a null instance of ad render view!");
        return 0L;
    }

    @JavascriptInterface
    public final void unload(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "unload called");
        }
        Ej a2 = a();
        if (a2 == null) {
            a2 = this.f7412a;
        }
        try {
            a2.G();
        } catch (Exception e) {
            a2.a(str, "Unexpected error", "unload");
            Kc.a((byte) 1, "InMobi", "Failed to unload ad; SDK encountered an unexpected error");
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).b(str3, "SDK encountered an expected error in handling the unload() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterBackButtonPressedEventListener(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "unregisterBackButtonPressedEventListener called");
        }
        Ej ej = this.f7412a;
        if (ej == null) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            ej.Z();
        } catch (Exception e) {
            this.f7412a.a(str, "Unexpected error", "unregisterBackButtonPressedEventListener");
            Y9 y93 = this.c;
            if (y93 != null) {
                String str4 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                ((Z9) y93).b(str4, "SDK encountered unexpected error in handling unregisterBackButtonPressedEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceMuteEventListener(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "unregisterDeviceMuteEventListener called");
        }
        if (this.f7412a == null) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        Y9 y93 = this.c;
        if (y93 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y93).a(str4, "Unregister device mute event listener ...");
        }
        try {
            C4187wd mediaProcessor = this.f7412a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3567ad c3567ad = mediaProcessor.d;
                if (c3567ad != null) {
                    c3567ad.a();
                }
                mediaProcessor.d = null;
            }
        } catch (Exception e) {
            this.f7412a.a(str, "Unexpected error", "unRegisterDeviceMuteEventListener");
            Y9 y94 = this.c;
            if (y94 != null) {
                String str5 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((Z9) y94).b(str5, "SDK encountered unexpected error in handling unregisterDeviceMuteEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceVolumeChangeEventListener(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "unregisterDeviceVolumeChangeEventListener called");
        }
        if (this.f7412a == null) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        Y9 y93 = this.c;
        if (y93 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y93).a(str4, "Unregister device volume change listener ...");
        }
        try {
            C4187wd mediaProcessor = this.f7412a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3567ad c3567ad = mediaProcessor.e;
                if (c3567ad != null) {
                    c3567ad.a();
                }
                mediaProcessor.e = null;
            }
        } catch (Exception e) {
            this.f7412a.a(str, "Unexpected error", "unregisterDeviceVolumeChangeEventListener");
            Y9 y94 = this.c;
            if (y94 != null) {
                String str5 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((Z9) y94).b(str5, "SDK encountered unexpected error in handling unregisterDeviceVolumeChangeEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterHeadphonePluggedEventListener(String str) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "unregisterHeadphonePluggedEventListener called");
        }
        if (this.f7412a == null) {
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        Y9 y93 = this.c;
        if (y93 != null) {
            String str4 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
            ((Z9) y93).a(str4, "Unregister headphone plugged event listener ...");
        }
        try {
            C4187wd mediaProcessor = this.f7412a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3567ad c3567ad = mediaProcessor.f;
                if (c3567ad != null) {
                    c3567ad.a();
                }
                mediaProcessor.f = null;
            }
        } catch (Exception e) {
            this.f7412a.a(str, "Unexpected error", "unregisterHeadphonePluggedEventListener");
            Y9 y94 = this.c;
            if (y94 != null) {
                String str5 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((Z9) y94).b(str5, "SDK encountered unexpected error in handling unregisterHeadphonePluggedEventListener() request from creative; " + e.getMessage());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        r12 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.AbstractC3904ma.g, null, null, new com.inmobi.media.C4102tb(r10, r3, r12, null), 3, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateVideoPosition(String str, String str2) {
        VideoViewPosition videoViewPosition;
        Object launch$default;
        Y9 y9 = this.c;
        if (y9 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).a(str3, "updateVideoPosition is called with position - " + str2);
        }
        G8[] g8Arr = G8.f6577a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMsg", "Invalid position");
        jSONObject.put(f.b.g, "updateVideoPlayerPosition");
        jSONObject.put("params", "null");
        if (str2 != null) {
            Object obj = null;
            try {
                JSONObject jsonObject = new JSONObject(str2);
                Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                Intrinsics.checkNotNullParameter(VideoViewPosition.class, "type");
                videoViewPosition = (VideoViewPosition) VideoViewPosition.class.cast(AbstractC3875lb.a(jsonObject, VideoViewPosition.class, null, null));
            } catch (JSONException e) {
                Ej ej = this.f7412a;
                V8 v8 = V8.b;
                ej.a("VideoCommandError", jSONObject);
                Y9 y92 = this.c;
                if (y92 != null) {
                    String str4 = AbstractC4158vb.f7434a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((Z9) y92).a(str4, "Error while creating position Json.", e);
                    obj = Unit.INSTANCE;
                }
            }
            if (videoViewPosition != null && launch$default != null) {
                obj = launch$default;
                if (obj != null) {
                    return;
                }
            }
            Ej ej2 = this.f7412a;
            V8 v82 = V8.b;
            ej2.a("VideoCommandError", jSONObject);
            obj = Unit.INSTANCE;
            if (obj != null) {
            }
        }
        Ej ej3 = this.f7412a;
        V8 v83 = V8.b;
        ej3.a("VideoCommandError", jSONObject);
        Unit unit = Unit.INSTANCE;
    }

    @JavascriptInterface
    public final void useCustomClose(final String str, final boolean z) {
        Y9 y9 = this.c;
        if (y9 != null) {
            String str2 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
            ((Z9) y9).a(str2, "useCustomClose called:" + z);
        }
        new Handler(this.f7412a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                C4130ub.b(C4130ub.this, z, str);
            }
        });
    }

    @JavascriptInterface
    public final void zoom(String jsCallbackNamespace, final int i) {
        Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        Y9 y9 = this.c;
        if (y9 != null) {
            String str = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((Z9) y9).a(str, "zoom is called " + jsCallbackNamespace + ServerSentEventKt.SPACE + i);
        }
        AbstractC3604bm.a(new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                C4130ub.a(C4130ub.this, i);
            }
        });
    }

    public static String b(String str) {
        return "TEMPLATE_" + str;
    }

    @JavascriptInterface
    public final void fireAdFailed(String str, String errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        try {
            Y9 y9 = this.c;
            if (y9 != null) {
                String str2 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((Z9) y9).a(str2, "fireAdFailed called with ec " + errorCode + ".");
            }
            if (StringsKt.isBlank(errorCode)) {
                errorCode = "3100";
            }
            this.f7412a.d(b(errorCode));
        } catch (Exception e) {
            this.f7412a.a(str, "Unexpected error", "fireAdFailed");
            Y9 y92 = this.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).b(str3, "SDK encountered unexpected error in handling fireAdFailed() signal from creative; " + e.getMessage());
            }
        }
    }

    public static final void b(C4130ub c4130ub) {
        try {
            c4130ub.f7412a.J();
        } catch (Exception e) {
            Y9 y9 = c4130ub.c;
            if (y9 != null) {
                String str = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((Z9) y9).b(str, "SDK encountered unexpected error in getting/setting current position; " + e.getMessage());
            }
        }
    }

    public static final void b(final C4130ub c4130ub, String json) {
        Jg op = c4130ub.f7412a.getOrientationProperties();
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(op, "op");
        final Jg jg = new Jg();
        jg.d = json;
        try {
            JSONObject jSONObject = new JSONObject(json);
            String optString = jSONObject.optString("forceOrientation", op.b);
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            Intrinsics.checkNotNullParameter(optString, "<set-?>");
            jg.b = optString;
            jg.f6652a = jSONObject.optBoolean("allowOrientationChange", op.f6652a);
            String optString2 = jSONObject.optString("direction", op.c);
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
            Intrinsics.checkNotNullParameter(optString2, "<set-?>");
            jg.c = optString2;
            if (!Intrinsics.areEqual(jg.b, U3.i.D) && !Intrinsics.areEqual(jg.b, U3.i.C)) {
                Intrinsics.checkNotNullParameter("none", "<set-?>");
                jg.b = "none";
            }
            if (!Intrinsics.areEqual(jg.c, "left") && !Intrinsics.areEqual(jg.c, "right")) {
                Intrinsics.checkNotNullParameter("right", "<set-?>");
                jg.c = "right";
            }
        } catch (JSONException unused) {
            jg = null;
        }
        if (jg != null) {
            c4130ub.f7412a.getWebViewFactory().a(new Function1() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4130ub.a(C4130ub.this, jg, (Ej) obj);
                }
            });
        }
    }

    public static final void c(C4130ub c4130ub) {
        try {
            c4130ub.f7412a.K();
        } catch (Exception e) {
            Y9 y9 = c4130ub.c;
            if (y9 != null) {
                String str = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((Z9) y9).b(str, "SDK encountered unexpected error in getting/setting default position; " + e.getMessage());
            }
        }
    }

    public static final void c(C4130ub c4130ub, String str) {
        try {
            c4130ub.f7412a.getSiblingWebviewManager().b(c4130ub.f7412a.getRoute().b, str);
        } catch (Exception e) {
            c4130ub.f7412a.b("showWebView", Vj.a(str, Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE));
            Y9 y9 = c4130ub.c;
            if (y9 != null) {
                String str2 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((Z9) y9).b(str2, "SDK encountered unexpected error in handling showEndCard() request from creative; " + e.getMessage());
            }
        }
    }

    public final Ej a() {
        if (!Intrinsics.areEqual(this.f7412a.getRoute().b, BuildConfig.FLAVOR)) {
            yq webViewFactory = this.f7412a.getWebViewFactory();
            webViewFactory.getClass();
            Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "id");
            return (Ej) webViewFactory.b.get(BuildConfig.FLAVOR);
        }
        return this.f7412a;
    }

    public static final void b(C4130ub c4130ub, boolean z, String str) {
        try {
            c4130ub.f7412a.f(z);
        } catch (Exception e) {
            c4130ub.f7412a.a(str, "Unexpected error", "useCustomClose");
            Y9 y9 = c4130ub.c;
            if (y9 != null) {
                String str2 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((Z9) y9).b(str2, "SDK encountered internal error in handling useCustomClose() request from creative; " + e.getMessage());
            }
        }
    }

    public static final void a(C4130ub c4130ub, String str, String str2, String str3) {
        Yb yb;
        Zb zb = c4130ub.f7412a.getLandingPageHandler().f;
        if (zb != null) {
            String a2 = Pb.a(str2);
            Ub landingPageHandler = c4130ub.f7412a.getLandingPageHandler();
            int i = landingPageHandler.i + 1;
            landingPageHandler.i = i;
            yb = new Yb(zb, a2, i, SystemClock.elapsedRealtime());
        } else {
            yb = null;
        }
        c4130ub.f7412a.getLandingPageHandler().a(Mb.d, yb, (Integer) null);
        c4130ub.f7412a.getLandingPageHandler().a("openInlineInstaller", str, str2, str3, yb);
    }

    public static final void a(C4130ub c4130ub, String str, String str2, float f, boolean z) {
        Yb yb;
        Zb zb = c4130ub.f7412a.getLandingPageHandler().f;
        if (zb != null) {
            String a2 = Pb.a(str2);
            Ub landingPageHandler = c4130ub.f7412a.getLandingPageHandler();
            int i = landingPageHandler.i + 1;
            landingPageHandler.i = i;
            yb = new Yb(zb, a2, i, SystemClock.elapsedRealtime());
        } else {
            yb = null;
        }
        Yb yb2 = yb;
        if (yb2 != null) {
            yb2.f = "IN_NATIVE";
        }
        c4130ub.f7412a.getLandingPageHandler().a(Mb.d, yb2, (Integer) 8010);
        int a3 = c4130ub.f7412a.getLandingPageHandler().a("customExpandInNative", str, str2, yb2, new C3925n3(f, z));
        Y9 y9 = c4130ub.c;
        if (y9 != null) {
            String str3 = AbstractC4158vb.f7434a;
            Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
            ((Z9) y9).a(str3, "customExpandInNativeRequest: " + a3);
        }
        if (a3 == 3) {
            EnumC4069s6 enumC4069s6 = EnumC4069s6.f7367a;
            c4130ub.a(str, str2, 0, f, !z, yb2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(final String str, String str2, final int i, final float f, final boolean z, final Yb yb) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = str2;
        if (yb != null) {
            yb.f = "IN_CUSTOM";
        }
        new Handler(this.f7412a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.ub$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                C4130ub.a(C4130ub.this, yb, objectRef, i, str, f, z);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(C4130ub c4130ub, Yb yb, Ref.ObjectRef objectRef, int i, String str, float f, boolean z) {
        try {
            if (c4130ub.f7412a.getEmbeddedBrowserJsCallbacks() == null) {
                Y9 y9 = c4130ub.c;
                if (y9 != null) {
                    String str2 = AbstractC4158vb.f7434a;
                    Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                    ((Z9) y9).b(str2, "Found a null instance of EmbeddedBrowserJSCallback instance to customExpand");
                }
                c4130ub.f7412a.getLandingPageHandler().a(Mb.e, yb, Integer.valueOf(ConnectionsStatusCodes.STATUS_ALREADY_DISCOVERING));
                return;
            }
            Y9 y92 = c4130ub.c;
            if (y92 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y92).a(str3, "Custom expand called. Url: " + objectRef.element);
            }
            EnumC4069s6 enumC4069s6 = EnumC4069s6.values()[i];
            if (enumC4069s6 == EnumC4069s6.f7367a) {
                int a2 = c4130ub.f7412a.getLandingPageHandler().a("customExpand", str, (String) objectRef.element, yb, (C3925n3) null);
                Y9 y93 = c4130ub.c;
                if (y93 != null) {
                    String str4 = AbstractC4158vb.f7434a;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$p(...)");
                    ((Z9) y93).a(str4, "processCustomExpandRequest: " + a2);
                }
                if (a2 == 3) {
                    InterfaceC4097t6 embeddedBrowserJsCallbacks = c4130ub.f7412a.getEmbeddedBrowserJsCallbacks();
                    if (embeddedBrowserJsCallbacks != null) {
                        ((C4100t9) embeddedBrowserJsCallbacks).a((String) objectRef.element, enumC4069s6, f, z, c4130ub.f7412a.getViewTouchTimestamp(), yb);
                    }
                    c4130ub.f7412a.getLandingPageHandler().a(Mb.f, yb, (Integer) null);
                    Lb lb = c4130ub.f7412a.getLandingPageHandler().d;
                    if (lb != null) {
                        lb.b("customExpand", str, (String) objectRef.element);
                        return;
                    }
                    return;
                }
                InterfaceC4097t6 embeddedBrowserJsCallbacks2 = c4130ub.f7412a.getEmbeddedBrowserJsCallbacks();
                if (embeddedBrowserJsCallbacks2 != null) {
                    C4156v9.a(((C4100t9) embeddedBrowserJsCallbacks2).f7389a);
                    return;
                }
                return;
            }
            InterfaceC4097t6 embeddedBrowserJsCallbacks3 = c4130ub.f7412a.getEmbeddedBrowserJsCallbacks();
            if (embeddedBrowserJsCallbacks3 != null) {
                ((C4100t9) embeddedBrowserJsCallbacks3).a((String) objectRef.element, enumC4069s6, f, z, c4130ub.f7412a.getViewTouchTimestamp(), yb);
            }
            c4130ub.f7412a.getLandingPageHandler().a(Mb.f, yb, (Integer) null);
            Lb lb2 = c4130ub.f7412a.getLandingPageHandler().d;
            if (lb2 != null) {
                lb2.b("customExpand", str, (String) objectRef.element);
            }
        } catch (Exception e) {
            c4130ub.f7412a.a(str, "Unexpected error", "customExpand");
            c4130ub.f7412a.getLandingPageHandler().a(Mb.e, yb, (Integer) 9);
            Kc.a((byte) 1, "InMobi", "Failed to custom expand ad; SDK encountered an unexpected error");
            Y9 y94 = c4130ub.c;
            if (y94 != null) {
                String str5 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str5, "access$getTAG$p(...)");
                ((Z9) y94).b(str5, "SDK encountered unexpected error in handling customExpand() request; " + e.getMessage());
            }
        }
    }

    public static final void a(C4130ub c4130ub) {
        if (c4130ub.f7412a.getEmbeddedBrowserJsCallbacks() == null) {
            Y9 y9 = c4130ub.c;
            if (y9 != null) {
                String str = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((Z9) y9).b(str, "Found a null instance of EmbeddedBrowserJSCallback instance to closeCustomExpand");
                return;
            }
            return;
        }
        InterfaceC4097t6 embeddedBrowserJsCallbacks = c4130ub.f7412a.getEmbeddedBrowserJsCallbacks();
        if (embeddedBrowserJsCallbacks != null) {
            C4156v9.a(((C4100t9) embeddedBrowserJsCallbacks).f7389a);
        }
    }

    public static final Unit a(C4130ub c4130ub, Jg jg, Ej it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.Q0) {
            Y9 y9 = c4130ub.c;
            if (y9 != null) {
                String str = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((Z9) y9).b(str, "setOrientationProperties called on unloaded ad");
            }
            return Unit.INSTANCE;
        }
        it.a(jg);
        return Unit.INSTANCE;
    }

    public static final void a(Ej ej, C4130ub c4130ub, String str) {
        try {
            ej.o();
        } catch (Exception e) {
            c4130ub.f7412a.a(str, "Unexpected error", "close");
            Kc.a((byte) 1, "InMobi", "Failed to close ad; SDK encountered an unexpected error");
            Y9 y9 = c4130ub.c;
            if (y9 != null) {
                String str2 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((Z9) y9).b(str2, "SDK encountered an expected error in handling the close() request from creative; " + e.getMessage());
            }
        }
    }

    public static final Unit a(C4130ub c4130ub, Of response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (AbstractC4086sn.a(response)) {
            Y9 y9 = c4130ub.c;
            if (y9 != null) {
                String str = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
                ((Z9) y9).a(str, "asyncPing Successful");
            }
        } else {
            Y9 y92 = c4130ub.c;
            if (y92 != null) {
                String str2 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((Z9) y92).b(str2, "asyncPing Failed");
            }
        }
        return Unit.INSTANCE;
    }

    public static final void a(C4130ub c4130ub, boolean z, String str) {
        try {
            c4130ub.f7412a.e(z);
        } catch (Exception e) {
            c4130ub.f7412a.a(str, "Unexpected error", "disableCloseRegion");
            Y9 y9 = c4130ub.c;
            if (y9 != null) {
                String str2 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((Z9) y9).b(str2, "SDK encountered unexpected error in handling disableCloseRegion() request from creative; " + e.getMessage());
            }
        }
    }

    public static final Unit a(boolean z, Ej it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setDisableBackButton(z);
        return Unit.INSTANCE;
    }

    public static final void a(C4130ub c4130ub, int i) {
        c4130ub.f7412a.setInitialScale(i);
    }

    public static final void a(C4130ub c4130ub, String str, String str2) {
        try {
            c4130ub.f7412a.getSiblingWebviewManager().a(c4130ub.f7412a.getRoute().b, str, str2);
        } catch (Exception e) {
            c4130ub.f7412a.b("loadWebView", Vj.a(str, 308));
            Y9 y9 = c4130ub.c;
            if (y9 != null) {
                String str3 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$p(...)");
                ((Z9) y9).b(str3, "SDK encountered unexpected error in handling loadWebView() request from creative; " + e.getMessage());
            }
        }
    }

    public static final void a(C4130ub c4130ub, String str) {
        try {
            c4130ub.f7412a.getSiblingWebviewManager().a(c4130ub.f7412a.getRoute().b, str);
        } catch (Exception e) {
            c4130ub.f7412a.b("destroyWebView", Vj.a(str, Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE));
            Y9 y9 = c4130ub.c;
            if (y9 != null) {
                String str2 = AbstractC4158vb.f7434a;
                Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$p(...)");
                ((Z9) y9).b(str2, "SDK encountered unexpected error in handling destroyWebView() request from creative; " + e.getMessage());
            }
        }
    }
}
