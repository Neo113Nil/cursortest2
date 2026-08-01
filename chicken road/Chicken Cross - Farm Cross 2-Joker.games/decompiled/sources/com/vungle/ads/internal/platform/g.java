package com.vungle.ads.internal.platform;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.util.Consumer;
import com.vungle.ads.internal.model.f0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class g {
    public static void a(Context context, Consumer consumer) {
        Object m8079constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        try {
            Result.Companion companion = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(WebSettings.getDefaultUserAgent(context));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8086isSuccessimpl(m8079constructorimpl)) {
            consumer.accept((String) m8079constructorimpl);
        }
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl != null) {
            boolean z = u.f12190a;
            t.a("WebViewUtil", "Failed to get user agent", m8082exceptionOrNullimpl);
            consumer.accept(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r5.intValue() == 2) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(WebView webView, f0 f0Var) {
        int i;
        Boolean b;
        Boolean a2;
        Intrinsics.checkNotNullParameter(webView, "webView");
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
        int i2 = 0;
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs((f0Var == null || (a2 = f0Var.a()) == null) ? false : a2.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs((f0Var == null || (b = f0Var.b()) == null) ? false : b.booleanValue());
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
        Integer c = f0Var != null ? f0Var.c() : null;
        if (c == null || c.intValue() != 1) {
            i = c != null ? 2 : 1;
            webView.setLayerType(i2, null);
        }
        i2 = i;
        webView.setLayerType(i2, null);
    }
}
