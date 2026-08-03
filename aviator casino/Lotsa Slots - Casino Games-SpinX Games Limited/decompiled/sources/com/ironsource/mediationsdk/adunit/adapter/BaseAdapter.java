package com.ironsource.mediationsdk.adunit.adapter;

/* loaded from: classes5.dex */
public abstract class BaseAdapter implements com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface, com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface {
    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public boolean isUsingActivityBeforeImpression(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        return true;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z) {
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public void setConsent(boolean z) {
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface
    public void setNetworkData(com.ironsource.mediationsdk.AdapterNetworkData adapterNetworkData) {
    }
}
