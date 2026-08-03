package com.unity3d.mediation.adapters.levelplay;

/* loaded from: classes5.dex */
public abstract class LevelPlayBaseAdapter extends com.ironsource.mediationsdk.adunit.adapter.BaseAdapter implements com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdaptiveInterface, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterTestModeInterface {
    private boolean mAdapterDebug;

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdaptiveInterface
    public int getAdaptiveHeight(int i) {
        return -1;
    }

    public boolean isAdaptersDebugEnabled() {
        return this.mAdapterDebug;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.BaseAdapter, com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z) {
        this.mAdapterDebug = z;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(java.lang.String str, java.util.List<java.lang.String> list) {
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterTestModeInterface
    public void setTestMode(boolean z) {
    }
}
