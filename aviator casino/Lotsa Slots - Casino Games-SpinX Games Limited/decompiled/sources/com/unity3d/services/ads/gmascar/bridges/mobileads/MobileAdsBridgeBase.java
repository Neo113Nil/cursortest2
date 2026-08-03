package com.unity3d.services.ads.gmascar.bridges.mobileads;

/* loaded from: classes5.dex */
public abstract class MobileAdsBridgeBase extends com.unity3d.services.core.reflection.GenericBridge implements com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge {
    public static final java.lang.String initializationStatusMethodName = "getInitializationStatus";
    public static final java.lang.String initializeMethodName = "initialize";

    public abstract boolean hasSCARBiddingSupport();

    public MobileAdsBridgeBase(java.util.Map<java.lang.String, java.lang.Class<?>[]> map) {
        super(map);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public java.lang.String getClassName() {
        return "com.google.android.gms.ads.MobileAds";
    }

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public void initialize(android.content.Context context, java.lang.Object obj) {
        callVoidMethod(initializeMethodName, null, context, obj);
    }

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public java.lang.Object getInitializationStatus() {
        return callNonVoidMethod(initializationStatusMethodName, null, new java.lang.Object[0]);
    }

    @Override // com.unity3d.services.ads.gmascar.bridges.mobileads.IMobileAdsBridge
    public java.lang.String getVersionString() {
        java.lang.Object callNonVoidMethod = callNonVoidMethod(getVersionMethodName(), null, new java.lang.Object[0]);
        if (callNonVoidMethod == null) {
            return "0.0.0";
        }
        return callNonVoidMethod.toString();
    }
}
