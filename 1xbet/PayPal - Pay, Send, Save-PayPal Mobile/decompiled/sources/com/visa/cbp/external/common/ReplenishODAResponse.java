package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class ReplenishODAResponse {

    @com.google.gson.annotations.SerializedName("ODAData")
    @com.visa.cbp.external.common.NullValueValidate
    private com.visa.cbp.external.common.ReplenishODAData oDAData;

    public com.visa.cbp.external.common.ReplenishODAData getODAData() {
        return this.oDAData;
    }

    public void setODAData(com.visa.cbp.external.common.ReplenishODAData replenishODAData) {
        this.oDAData = replenishODAData;
    }
}
