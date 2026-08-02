package com.visa.cbp.sdk.facade.response;

/* loaded from: classes16.dex */
public class TokenStatusResponse {
    private com.visa.cbp.sdk.facade.data.LcmParams lcmParams;
    private com.visa.cbp.sdk.facade.data.TokenStatus tokenStatus;

    public com.visa.cbp.sdk.facade.data.TokenStatus getTokenStatus() {
        return this.tokenStatus;
    }

    public void setTokenStatus(com.visa.cbp.sdk.facade.data.TokenStatus tokenStatus) {
        this.tokenStatus = tokenStatus;
    }

    public com.visa.cbp.sdk.facade.data.LcmParams getLcmParams() {
        return this.lcmParams;
    }

    public void setLcmParams(com.visa.cbp.sdk.facade.data.LcmParams lcmParams) {
        this.lcmParams = lcmParams;
    }
}
