package com.visa.cbp.external.aam;

/* loaded from: classes5.dex */
public class ReplenishResponse {

    @com.visa.cbp.external.common.NullValueValidate
    private java.lang.String encryptionMetaData;

    @com.visa.cbp.external.common.NullValueValidate
    private com.visa.cbp.external.common.TokenInfo tokenInfo;

    public java.lang.String getEncryptionMetaData() {
        return this.encryptionMetaData;
    }

    public void setEncryptionMetaData(java.lang.String str) {
        this.encryptionMetaData = str;
    }

    public com.visa.cbp.external.common.TokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    public void setTokenInfo(com.visa.cbp.external.common.TokenInfo tokenInfo) {
        this.tokenInfo = tokenInfo;
    }
}
