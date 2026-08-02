package com.visa.cbp.sdk.facade.response;

/* loaded from: classes16.dex */
public class ProvisionTokenResponse {
    private com.visa.cbp.sdk.facade.data.TokenKey tokenKey;

    public ProvisionTokenResponse(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        this.tokenKey = tokenKey;
    }

    public com.visa.cbp.sdk.facade.data.TokenKey getTokenKey() {
        return this.tokenKey;
    }
}
