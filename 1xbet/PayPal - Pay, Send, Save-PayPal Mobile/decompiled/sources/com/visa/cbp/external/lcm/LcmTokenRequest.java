package com.visa.cbp.external.lcm;

/* loaded from: classes5.dex */
public class LcmTokenRequest extends com.visa.cbp.external.common.JsonConverter {
    public com.visa.cbp.external.common.UpdateReason updateReason;
    private transient java.lang.String vProvisionTokenId;

    public com.visa.cbp.external.common.UpdateReason getUpdateReason() {
        return this.updateReason;
    }

    public void setUpdateReason(com.visa.cbp.external.common.UpdateReason updateReason) {
        this.updateReason = updateReason;
    }

    public java.lang.String getvProvisionTokenId() {
        return this.vProvisionTokenId;
    }

    public void setvProvisionTokenId(java.lang.String str) {
        this.vProvisionTokenId = str;
    }
}
