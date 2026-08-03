package com.amazon.device.iap.internal.model;

/* loaded from: classes2.dex */
public class UserDataBuilder {
    private java.lang.String marketplace;
    private java.lang.String userId;

    public java.lang.String getUserId() {
        return this.userId;
    }

    public java.lang.String getMarketplace() {
        return this.marketplace;
    }

    public com.amazon.device.iap.model.UserData build() {
        return new com.amazon.device.iap.model.UserData(this);
    }

    public com.amazon.device.iap.internal.model.UserDataBuilder setUserId(java.lang.String str) {
        this.userId = str;
        return this;
    }

    public com.amazon.device.iap.internal.model.UserDataBuilder setMarketplace(java.lang.String str) {
        this.marketplace = str;
        return this;
    }
}
