package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
public class PushFundsTransaction {
    private java.lang.String feeProgramIndicator;
    private com.visa.cbp.mpqr.facade.PurchaseIdentifier purchaseIdentifier;
    private java.lang.String secondaryId;
    private java.lang.String sourceOfFundsCode;
    private java.lang.String transactionFeeAmount;

    public java.lang.String getSecondaryId() {
        return this.secondaryId;
    }

    public void setSecondaryId(java.lang.String str) {
        this.secondaryId = str;
    }

    public java.lang.String getSourceOfFundsCode() {
        return this.sourceOfFundsCode;
    }

    public void setSourceOfFundsCode(java.lang.String str) {
        this.sourceOfFundsCode = str;
    }

    public java.lang.String getFeeProgramIndicator() {
        return this.feeProgramIndicator;
    }

    public void setFeeProgramIndicator(java.lang.String str) {
        this.feeProgramIndicator = str;
    }

    public com.visa.cbp.mpqr.facade.PurchaseIdentifier getPurchaseIdentifier() {
        return this.purchaseIdentifier;
    }

    public void setPurchaseIdentifier(com.visa.cbp.mpqr.facade.PurchaseIdentifier purchaseIdentifier) {
        this.purchaseIdentifier = purchaseIdentifier;
    }

    public java.lang.String getTransactionFeeAmount() {
        return this.transactionFeeAmount;
    }

    public void setTransactionFeeAmount(java.lang.String str) {
        this.transactionFeeAmount = str;
    }
}
