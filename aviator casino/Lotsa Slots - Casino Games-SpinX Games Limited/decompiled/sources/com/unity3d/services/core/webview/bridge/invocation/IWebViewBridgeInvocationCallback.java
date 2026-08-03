package com.unity3d.services.core.webview.bridge.invocation;

/* loaded from: classes6.dex */
public interface IWebViewBridgeInvocationCallback {
    void onFailure(java.lang.String str, com.unity3d.services.core.webview.bridge.CallbackStatus callbackStatus);

    void onSuccess();

    void onTimeout();
}
