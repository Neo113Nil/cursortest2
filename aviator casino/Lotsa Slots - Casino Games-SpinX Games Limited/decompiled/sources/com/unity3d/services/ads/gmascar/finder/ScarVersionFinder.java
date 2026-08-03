package com.unity3d.services.ads.gmascar.finder;

/* loaded from: classes5.dex */
public class ScarVersionFinder implements com.unity3d.services.ads.gmascar.listeners.IInitializationStatusListener {
    private static com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge _mobileAdsBridge;
    private com.unity3d.services.ads.gmascar.utils.GMAEventSender _gmaEventSender;
    private com.unity3d.services.ads.gmascar.finder.GMAInitializer _gmaInitializer;
    private int _gmaSdkVersionCode = -1;
    private com.unity3d.services.ads.gmascar.finder.PresenceDetector _presenceDetector;

    public ScarVersionFinder(com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge iMobileAdsBridge, com.unity3d.services.ads.gmascar.finder.PresenceDetector presenceDetector, com.unity3d.services.ads.gmascar.finder.GMAInitializer gMAInitializer, com.unity3d.services.ads.gmascar.utils.GMAEventSender gMAEventSender) {
        _mobileAdsBridge = iMobileAdsBridge;
        this._presenceDetector = presenceDetector;
        this._gmaInitializer = gMAInitializer;
        this._gmaEventSender = gMAEventSender;
        gMAInitializer.getInitializeListenerBridge().setStatusListener(this);
    }

    public void getVersion() {
        try {
            if (!this._presenceDetector.areGMAClassesPresent()) {
                this._gmaEventSender.sendVersion("0.0.0");
            } else if (this._gmaInitializer.shouldInitialize()) {
                this._gmaInitializer.initializeGMA();
            } else {
                findAndSendVersion(true);
            }
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.debug("Got exception finding GMA SDK: %s", e.getLocalizedMessage());
        }
    }

    public void findAndSendVersion(boolean z) {
        this._gmaEventSender.sendVersion(z ? _mobileAdsBridge.getVersionString() : "0.0.0");
    }

    public int getVersionCode() {
        java.lang.String versionString;
        if (this._gmaSdkVersionCode == -1 && (versionString = _mobileAdsBridge.getVersionString()) != null) {
            java.lang.String[] split = versionString.split("\\.");
            if (split.length > _mobileAdsBridge.getVersionCodeIndex()) {
                try {
                    this._gmaSdkVersionCode = java.lang.Integer.parseInt(split[_mobileAdsBridge.getVersionCodeIndex()]);
                } catch (java.lang.NumberFormatException e) {
                    com.unity3d.services.core.log.DeviceLog.debug("Could not parse %s to an Integer: %s", split[_mobileAdsBridge.getVersionCodeIndex()], e.getLocalizedMessage());
                }
            }
        }
        return this._gmaSdkVersionCode;
    }

    @Override // com.unity3d.services.ads.gmascar.listeners.IInitializationStatusListener
    public void onInitializationComplete(java.lang.Object obj) {
        findAndSendVersion(this._gmaInitializer.initSuccessful(obj));
    }
}
