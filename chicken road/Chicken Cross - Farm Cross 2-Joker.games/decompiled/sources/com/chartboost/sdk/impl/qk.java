package com.chartboost.sdk.impl;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.widget.RelativeLayout;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class qk extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public n3 f4987a;
    public WebChromeClient b;
    public RelativeLayout c;
    public ie d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setFocusableInTouchMode(true);
        requestFocus();
    }

    public void a() {
        n3 n3Var = this.f4987a;
        if (n3Var == null) {
            mb.a("Webview is null on destroyWebview", (Throwable) null, 2, (Object) null);
            return;
        }
        RelativeLayout relativeLayout = this.c;
        if (relativeLayout != null) {
            relativeLayout.removeView(n3Var);
            removeView(relativeLayout);
        } else {
            mb.a("webViewContainer is null destroyWebview", (Throwable) null, 2, (Object) null);
        }
        n3 n3Var2 = this.f4987a;
        if (n3Var2 != null) {
            n3Var2.loadUrl(AndroidWebViewClient.BLANK_PAGE);
            n3Var2.onPause();
            n3Var2.removeAllViews();
            n3Var2.destroy();
        }
        removeAllViews();
    }

    public final ie getLastOrientation() {
        return this.d;
    }

    public final WebChromeClient getWebChromeClient() {
        return this.b;
    }

    public final n3 getWebView() {
        return this.f4987a;
    }

    public final RelativeLayout getWebViewContainer() {
        return this.c;
    }

    public final void setLastOrientation(ie ieVar) {
        this.d = ieVar;
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.b = webChromeClient;
    }

    public final void setWebView(n3 n3Var) {
        this.f4987a = n3Var;
    }

    public final void setWebViewContainer(RelativeLayout relativeLayout) {
        this.c = relativeLayout;
    }
}
