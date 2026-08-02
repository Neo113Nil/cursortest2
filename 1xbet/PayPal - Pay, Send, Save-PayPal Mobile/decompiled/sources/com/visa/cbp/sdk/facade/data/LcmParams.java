package com.visa.cbp.sdk.facade.data;

/* loaded from: classes16.dex */
public class LcmParams {

    @com.visa.cbp.external.common.NullValueValidate
    private java.lang.String reasonCode;
    private java.lang.String reasonDesc;

    @com.visa.cbp.external.common.NullValueValidate
    private com.visa.cbp.sdk.facade.data.TokenKey tokenKey;

    public LcmParams() {
    }

    public LcmParams(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, java.lang.String str, java.lang.String str2) {
        this.tokenKey = tokenKey;
        this.reasonCode = str;
        this.reasonDesc = str2;
    }

    public com.visa.cbp.sdk.facade.data.TokenKey getTokenKey() {
        return this.tokenKey;
    }

    public void setTokenKey(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        this.tokenKey = tokenKey;
    }

    public java.lang.String getReasonCode() {
        return this.reasonCode;
    }

    public void setReasonCode(java.lang.String str) {
        this.reasonCode = str;
    }

    public java.lang.String getReasonDesc() {
        return this.reasonDesc;
    }

    public void setReasonDesc(java.lang.String str) {
        this.reasonDesc = str;
    }
}
