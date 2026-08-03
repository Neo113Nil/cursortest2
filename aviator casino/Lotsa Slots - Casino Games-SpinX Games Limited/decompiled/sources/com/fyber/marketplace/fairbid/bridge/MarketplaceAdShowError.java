package com.fyber.marketplace.fairbid.bridge;

/* loaded from: classes3.dex */
public enum MarketplaceAdShowError {
    GENERIC_SHOW_ERROR("Generic Error"),
    EXPIRED_AD_ERROR("Expired Ad Error");

    private final java.lang.String message;

    MarketplaceAdShowError(java.lang.String str) {
        this.message = str;
    }

    public java.lang.String getMessage() {
        return this.message;
    }
}
