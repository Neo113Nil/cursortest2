package com.visa.cbp.external.aam;

/* loaded from: classes5.dex */
public class ReplenishRequest extends com.visa.cbp.external.aam.ReplenishAckRequest {
    private java.lang.String encryptionMetaData;
    private com.visa.cbp.external.aam.Signature signature;

    @com.google.gson.annotations.SerializedName("tvl")
    private java.util.List<java.lang.String> tvls;

    public java.util.List<java.lang.String> getTvls() {
        if (this.tvls == null) {
            this.tvls = new java.util.ArrayList();
        }
        return this.tvls;
    }

    public void setTvls(java.util.List<java.lang.String> list) {
        this.tvls = list;
    }

    public com.visa.cbp.external.aam.Signature getSignature() {
        return this.signature;
    }

    public void setSignature(com.visa.cbp.external.aam.Signature signature) {
        this.signature = signature;
    }

    public java.lang.String getEncryptionMetaData() {
        return this.encryptionMetaData;
    }

    public void setEncryptionMetaData(java.lang.String str) {
        this.encryptionMetaData = str;
    }
}
