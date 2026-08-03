package com.unity3d.services.ads.operation;

/* loaded from: classes5.dex */
public interface IAdModule<T extends com.unity3d.services.core.webview.bridge.IWebViewSharedObject, T2> extends com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore<T> {
    void executeAdOperation(com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker iWebViewBridgeInvoker, T2 t2);

    com.unity3d.services.core.request.metrics.SDKMetricsSender getMetricSender();
}
