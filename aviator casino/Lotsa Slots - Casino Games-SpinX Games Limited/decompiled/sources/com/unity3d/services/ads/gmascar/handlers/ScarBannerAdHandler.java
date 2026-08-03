package com.unity3d.services.ads.gmascar.handlers;

/* loaded from: classes5.dex */
public class ScarBannerAdHandler implements com.unity3d.scar.adapter.common.IScarBannerAdListenerWrapper {
    private final com.unity3d.services.core.webview.bridge.IEventSender _eventSender;
    private final java.lang.String _operationId;

    public ScarBannerAdHandler(com.unity3d.services.core.webview.bridge.IEventSender iEventSender, java.lang.String str) {
        this._eventSender = iEventSender;
        this._operationId = str;
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdLoaded() {
        com.unity3d.services.banners.BannerViewCache.getInstance().addScarContainer(this._operationId);
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.SCAR_BANNER_LOADED, this._operationId);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdFailedToLoad(int i, java.lang.String str) {
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.SCAR_BANNER_LOAD_FAILED, this._operationId, java.lang.Integer.valueOf(i), str);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdOpened() {
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.SCAR_BANNER_OPENED, this._operationId);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdClicked() {
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.SCAR_BANNER_CLICKED, this._operationId);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdListenerWrapper
    public void onAdClosed() {
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.SCAR_BANNER_CLOSED, this._operationId);
    }

    @Override // com.unity3d.scar.adapter.common.IScarBannerAdListenerWrapper
    public void onAdImpression() {
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.BANNER, com.unity3d.services.banners.bridge.BannerBridge.BannerEvent.SCAR_BANNER_IMPRESSION, this._operationId);
    }
}
