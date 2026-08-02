package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class CardMetadataUpdate extends com.visa.cbp.external.common.JsonConverter {
    java.lang.String date;
    private transient java.lang.String vProvisionedTokenID;

    public java.lang.String getvProvisionedTokenID() {
        return this.vProvisionedTokenID;
    }

    public void setvProvisionedTokenID(java.lang.String str) {
        this.vProvisionedTokenID = str;
    }

    public java.lang.String getDate() {
        return this.date;
    }

    public void setDate(java.lang.String str) {
        this.date = str;
    }
}
