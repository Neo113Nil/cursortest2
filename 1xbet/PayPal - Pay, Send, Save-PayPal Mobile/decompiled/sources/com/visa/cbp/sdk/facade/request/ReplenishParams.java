package com.visa.cbp.sdk.facade.request;

/* loaded from: classes16.dex */
public class ReplenishParams {
    private com.visa.cbp.sdk.facade.data.TokenKey tokenKey;

    public ReplenishParams(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        this.tokenKey = tokenKey;
    }

    public com.visa.cbp.sdk.facade.data.TokenKey getTokenKey() {
        return this.tokenKey;
    }

    public void setTokenKey(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        this.tokenKey = tokenKey;
    }
}
