package com.visa.cbp.sdk.facade.data;

/* loaded from: classes5.dex */
public class CvmMode {
    public com.visa.cbp.sdk.facade.data.VerifyingEntity verifyingEntity;
    public com.visa.cbp.sdk.facade.data.VerifyingType verifyingType;

    public CvmMode(com.visa.cbp.sdk.facade.data.VerifyingEntity verifyingEntity, com.visa.cbp.sdk.facade.data.VerifyingType verifyingType) {
        this.verifyingEntity = verifyingEntity;
        this.verifyingType = verifyingType;
    }

    public com.visa.cbp.sdk.facade.data.VerifyingEntity getVerifyingEntity() {
        return this.verifyingEntity;
    }

    public com.visa.cbp.sdk.facade.data.VerifyingType getVerifyingType() {
        return this.verifyingType;
    }

    public /* synthetic */ CvmMode() {
    }
}
