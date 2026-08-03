package com.unity3d.ads.core.data.manager;

/* compiled from: AndroidSDKPropertiesManager.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidSDKPropertiesManager;", "Lcom/unity3d/ads/core/data/manager/SDKPropertiesManager;", "()V", "getCurrentInitializationState", "Lcom/unity3d/services/core/properties/SdkProperties$InitializationState;", "setInitializationTime", "", "setInitializationTimeSinceEpoch", "setInitializeState", "initializeState", "setInitialized", "initialized", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidSDKPropertiesManager implements com.unity3d.ads.core.data.manager.SDKPropertiesManager {
    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitialized(boolean initialized) {
        com.unity3d.services.core.properties.SdkProperties.setInitialized(initialized);
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializeState(com.unity3d.services.core.properties.SdkProperties.InitializationState initializeState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeState, "initializeState");
        com.unity3d.services.core.properties.SdkProperties.setInitializeState(initializeState);
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public com.unity3d.services.core.properties.SdkProperties.InitializationState getCurrentInitializationState() {
        com.unity3d.services.core.properties.SdkProperties.InitializationState currentInitializationState = com.unity3d.services.core.properties.SdkProperties.getCurrentInitializationState();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentInitializationState, "getCurrentInitializationState()");
        return currentInitializationState;
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializationTime() {
        com.unity3d.services.core.properties.SdkProperties.setInitializationTime(com.unity3d.services.core.device.Device.getElapsedRealtime());
    }

    @Override // com.unity3d.ads.core.data.manager.SDKPropertiesManager
    public void setInitializationTimeSinceEpoch() {
        com.unity3d.services.core.properties.SdkProperties.setInitializationTimeSinceEpoch(java.lang.System.currentTimeMillis());
    }
}
