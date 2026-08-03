package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public interface OnFyberMarketplaceInitializedListener {

    public enum FyberInitStatus {
        SUCCESSFULLY,
        FAILED_NO_KITS_DETECTED,
        FAILED,
        INVALID_APP_ID
    }

    void onFyberMarketplaceInitialized(com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus);
}
