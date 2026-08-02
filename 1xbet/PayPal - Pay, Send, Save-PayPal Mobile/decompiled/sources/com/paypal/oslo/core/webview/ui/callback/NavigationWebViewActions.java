package com.paypal.oslo.core.webview.ui.callback;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/callback/NavigationWebViewActions;", "", "", "canGoForward", "()Z", "goForward", "canGoBack", "goBack", "", "reload", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface NavigationWebViewActions {
    boolean canGoBack();

    boolean canGoForward();

    boolean goBack();

    boolean goForward();

    void reload();
}
