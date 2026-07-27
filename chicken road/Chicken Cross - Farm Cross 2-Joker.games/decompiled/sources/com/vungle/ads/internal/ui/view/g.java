package com.vungle.ads.internal.ui.view;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.vungle.ads.internal.presenter.f0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final j f12169a;

    public g(j widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        this.f12169a = widget;
    }

    public static final void a(g this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.run();
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        webView = this.f12169a.b;
        if (webView == null) {
            return;
        }
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.vungle.ads.internal.ui.view.g$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    g.a(g.this);
                }
            });
            return;
        }
        try {
            try {
                Result.Companion companion = Result.INSTANCE;
                webView.onPause();
                Result.m8079constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8079constructorimpl(ResultKt.createFailure(th));
            }
            try {
                Result.Companion companion3 = Result.INSTANCE;
                webView.stopLoading();
                Result.m8079constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                Result.m8079constructorimpl(ResultKt.createFailure(th2));
            }
            Unit unit = null;
            try {
                Result.Companion companion5 = Result.INSTANCE;
                webView.setWebChromeClient(null);
                Result.m8079constructorimpl(Unit.INSTANCE);
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                Result.m8079constructorimpl(ResultKt.createFailure(th3));
            }
            try {
                Result.Companion companion7 = Result.INSTANCE;
                webView.setWebViewClient(new WebViewClient());
                Result.m8079constructorimpl(Unit.INSTANCE);
            } catch (Throwable th4) {
                Result.Companion companion8 = Result.INSTANCE;
                Result.m8079constructorimpl(ResultKt.createFailure(th4));
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    Result.Companion companion9 = Result.INSTANCE;
                    webView.setWebViewRenderProcessClient(null);
                    Result.m8079constructorimpl(Unit.INSTANCE);
                } catch (Throwable th5) {
                    Result.Companion companion10 = Result.INSTANCE;
                    Result.m8079constructorimpl(ResultKt.createFailure(th5));
                }
            }
            try {
                Result.Companion companion11 = Result.INSTANCE;
                webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
                Result.m8079constructorimpl(Unit.INSTANCE);
            } catch (Throwable th6) {
                Result.Companion companion12 = Result.INSTANCE;
                Result.m8079constructorimpl(ResultKt.createFailure(th6));
            }
            try {
                Result.Companion companion13 = Result.INSTANCE;
                webView.clearHistory();
                Result.m8079constructorimpl(Unit.INSTANCE);
            } catch (Throwable th7) {
                Result.Companion companion14 = Result.INSTANCE;
                Result.m8079constructorimpl(ResultKt.createFailure(th7));
            }
            try {
                Result.Companion companion15 = Result.INSTANCE;
                webView.removeAllViews();
                Result.m8079constructorimpl(Unit.INSTANCE);
            } catch (Throwable th8) {
                Result.Companion companion16 = Result.INSTANCE;
                Result.m8079constructorimpl(ResultKt.createFailure(th8));
            }
            try {
                Result.Companion companion17 = Result.INSTANCE;
                this.f12169a.removeAllViews();
                Result.m8079constructorimpl(Unit.INSTANCE);
            } catch (Throwable th9) {
                Result.Companion companion18 = Result.INSTANCE;
                Result.m8079constructorimpl(ResultKt.createFailure(th9));
            }
            try {
                Result.Companion companion19 = Result.INSTANCE;
                String eventId = this.f12169a.getEventId();
                if (eventId != null) {
                    f0.a(eventId);
                    unit = Unit.INSTANCE;
                }
                Result.m8079constructorimpl(unit);
            } catch (Throwable th10) {
                Result.Companion companion20 = Result.INSTANCE;
                Result.m8079constructorimpl(ResultKt.createFailure(th10));
            }
            try {
                Result.Companion companion21 = Result.INSTANCE;
                webView.destroy();
                Result.m8079constructorimpl(Unit.INSTANCE);
            } catch (Throwable th11) {
                Result.Companion companion22 = Result.INSTANCE;
                Result.m8079constructorimpl(ResultKt.createFailure(th11));
            }
            this.f12169a.b = null;
        } catch (Throwable th12) {
            boolean z = u.f12190a;
            t.b("MRAIDAdWidget", com.iab.omid.library.vungle.internal.l.a("Destroy webview: ").append(th12.getMessage()).toString());
        }
    }
}
