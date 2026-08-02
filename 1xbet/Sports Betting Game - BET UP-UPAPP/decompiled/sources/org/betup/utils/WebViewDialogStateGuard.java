package org.betup.utils;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: WebViewDialogStateGuard.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\f"}, d2 = {"Lorg/betup/utils/WebViewDialogStateGuard;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "applyStateless", "", "webView", "Landroid/webkit/WebView;", "stripFragmentViewState", "outState", "Landroid/os/Bundle;", "destroy", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebViewDialogStateGuard {
    public static final int $stable = 0;
    public static final WebViewDialogStateGuard INSTANCE = new WebViewDialogStateGuard();

    private WebViewDialogStateGuard() {
    }

    public final void applyStateless(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        webView.setSaveEnabled(false);
        webView.setSaveFromParentEnabled(false);
    }

    public final void stripFragmentViewState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        ActivitySavedStateGuard.stripNestedViewStatesPublic(outState);
    }

    public final void destroy(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            WebViewDialogStateGuard webViewDialogStateGuard = this;
            webView.stopLoading();
            webView.loadUrl("about:blank");
            webView.clearHistory();
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
            webView.destroy();
            Result.m10853constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
    }
}
