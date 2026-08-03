package com.unity3d.services.ads.gmascar;

/* loaded from: classes5.dex */
public class GMA {
    private static com.unity3d.services.ads.gmascar.GMA instance;
    private final com.unity3d.services.ads.gmascar.GMAScarAdapterBridge _gmaScarAdapterBridge;

    private GMA(com.unity3d.services.ads.gmascar.utils.GMAEventSender gMAEventSender) {
        this._gmaScarAdapterBridge = new com.unity3d.services.ads.gmascar.GMAScarAdapterBridge(new com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeFactory().createMobileAdsBridge(), new com.unity3d.services.ads.gmascar.bridges.InitializeListenerBridge(), new com.unity3d.services.ads.gmascar.bridges.InitializationStatusBridge(), new com.unity3d.services.ads.gmascar.bridges.AdapterStatusBridge(), new com.unity3d.services.ads.gmascar.handlers.WebViewErrorHandler(gMAEventSender), new com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory(), gMAEventSender);
    }

    public static com.unity3d.services.ads.gmascar.GMA getInstance() {
        return getInstance(new com.unity3d.services.ads.gmascar.utils.GMAEventSender());
    }

    public static com.unity3d.services.ads.gmascar.GMA getInstance(com.unity3d.services.ads.gmascar.utils.GMAEventSender gMAEventSender) {
        if (instance == null) {
            instance = new com.unity3d.services.ads.gmascar.GMA(gMAEventSender);
        }
        return instance;
    }

    public com.unity3d.services.ads.gmascar.GMAScarAdapterBridge getBridge() {
        return this._gmaScarAdapterBridge;
    }

    public boolean hasSCARBiddingSupport() {
        return this._gmaScarAdapterBridge.hasSCARBiddingSupport();
    }

    public void getSCARBiddingSignals(boolean z, com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener iBiddingSignalsListener) {
        this._gmaScarAdapterBridge.getSCARBiddingSignals(z, new com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler(z, iBiddingSignalsListener));
    }

    public void getSCARBiddingSignals(java.util.List<com.unity3d.scar.adapter.common.scarads.UnityAdFormat> list, com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener iBiddingSignalsListener) {
        this._gmaScarAdapterBridge.getSCARBiddingSignals(list, new com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler(list.contains(com.unity3d.scar.adapter.common.scarads.UnityAdFormat.BANNER), iBiddingSignalsListener));
    }
}
