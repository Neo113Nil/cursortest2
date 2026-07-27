package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.ironsource.C4761z5;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class t4 extends qk {
    public /* synthetic */ t4(Context context, String str, t5 t5Var, final da daVar, String str2, h7 h7Var, Function1 function1, Function1 function12, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, t5Var, daVar, str2, h7Var, (i & 64) != 0 ? new Function1() { // from class: com.chartboost.sdk.impl.t4$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                n3 a2;
                a2 = t4.a((Context) obj);
                return a2;
            }
        } : function1, (i & 128) != 0 ? new Function1() { // from class: com.chartboost.sdk.impl.t4$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t4.a((View) obj);
            }
        } : function12, (i & 256) != 0 ? new Function2() { // from class: com.chartboost.sdk.impl.t4$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return t4.a(da.this, (t5) obj, (h7) obj2);
            }
        } : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n3 a(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new n3(it);
    }

    public static final WebChromeClient a(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new WebChromeClient();
    }

    public static final s5 a(da daVar, t5 cb, h7 et) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        Intrinsics.checkNotNullParameter(et, "et");
        return new s5(cb, et, daVar, (com.chartboost.sdk.internal.Model.a) b4.b.b().b().get());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(Context context, String html, t5 callback, da impressionInterface, String str, h7 eventTracker, Function1 cbWebViewFactory, Function1 cbWebChromeClientFactory, Function2 cbWebViewClientFactory) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(cbWebViewFactory, "cbWebViewFactory");
        Intrinsics.checkNotNullParameter(cbWebChromeClientFactory, "cbWebChromeClientFactory");
        Intrinsics.checkNotNullParameter(cbWebViewClientFactory, "cbWebViewClientFactory");
        setFocusable(false);
        i8 a2 = i8.a();
        setWebViewContainer((RelativeLayout) a2.a(new RelativeLayout(context)));
        setWebView((n3) cbWebViewFactory.invoke(context));
        aj.b.a(context);
        try {
            WebView.setWebContentsDebuggingEnabled(false);
        } catch (RuntimeException e) {
            mb.e("Exception while enabling webview debugging", e);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        n3 webView = getWebView();
        if (webView != null) {
            webView.getSettings().setSupportZoom(false);
            webView.setLayoutParams(layoutParams);
            webView.setBackgroundColor(0);
            webView.setWebViewClient((WebViewClient) a2.a(cbWebViewClientFactory.invoke(callback, eventTracker)));
            RelativeLayout webViewContainer = getWebViewContainer();
            if (webViewContainer != null) {
                webViewContainer.setLayoutParams(layoutParams);
                webView.setWebChromeClient((WebChromeClient) cbWebChromeClientFactory.invoke(webViewContainer));
                webViewContainer.addView(webView);
            }
            webView.loadDataWithBaseURL(str, html, "text/html", C4761z5.O, null);
        }
    }
}
