package com.unity3d.services.ads.gmascar.utils;

/* loaded from: classes5.dex */
public class GMAEventSender implements com.unity3d.services.core.webview.bridge.IEventSender {
    private final com.unity3d.services.core.webview.bridge.IEventSender _eventSender;

    public GMAEventSender() {
        this(com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public GMAEventSender(com.unity3d.services.core.webview.bridge.IEventSender iEventSender) {
        this._eventSender = iEventSender;
    }

    public void send(com.unity3d.scar.adapter.common.GMAEvent gMAEvent, java.lang.Object... objArr) {
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.GMA, gMAEvent, objArr);
    }

    public void sendVersion(java.lang.String str) {
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.INIT_GMA, com.unity3d.scar.adapter.common.GMAEvent.VERSION, str);
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(java.lang.Enum<?> r2, java.lang.Enum<?> r3, java.lang.Object... objArr) {
        return this._eventSender.sendEvent(r2, r3, objArr);
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return this._eventSender.canSend();
    }
}
