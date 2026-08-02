package com.paypal.oslo.core.webview.ui.callback;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewJavaScriptBridge;", "", "", "script", "Lkotlin/Function1;", "", "resultCallback", "evaluateJavaScript", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "isAvailable", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SecureWebViewJavaScriptBridge {
    void evaluateJavaScript(java.lang.String script, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> resultCallback);

    boolean isAvailable();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void evaluateJavaScript$default(com.paypal.oslo.core.webview.ui.callback.SecureWebViewJavaScriptBridge secureWebViewJavaScriptBridge, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: evaluateJavaScript");
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        secureWebViewJavaScriptBridge.evaluateJavaScript(str, function1);
    }
}
