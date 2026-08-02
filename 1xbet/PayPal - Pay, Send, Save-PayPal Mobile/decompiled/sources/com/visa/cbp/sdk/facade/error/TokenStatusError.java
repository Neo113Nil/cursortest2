package com.visa.cbp.sdk.facade.error;

/* loaded from: classes16.dex */
public class TokenStatusError extends com.visa.cbp.sdk.facade.error.CbpError {
    private com.visa.cbp.sdk.facade.data.LcmParams lcmParams;
    private com.visa.cbp.sdk.facade.data.TokenStatus tokenStatus;

    public TokenStatusError(int i, java.lang.String str, com.visa.cbp.sdk.facade.error.ReasonCode reasonCode, java.lang.String str2) {
        super(i, str, reasonCode, str2);
    }

    public com.visa.cbp.sdk.facade.data.LcmParams getLcmParams() {
        return this.lcmParams;
    }

    public void setLcmParams(com.visa.cbp.sdk.facade.data.LcmParams lcmParams) {
        this.lcmParams = lcmParams;
    }

    public com.visa.cbp.sdk.facade.data.TokenStatus getTokenStatus() {
        return this.tokenStatus;
    }

    public void setTokenStatus(com.visa.cbp.sdk.facade.data.TokenStatus tokenStatus) {
        this.tokenStatus = tokenStatus;
    }
}
