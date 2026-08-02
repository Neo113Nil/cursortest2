package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
public class EncTransactionParticipantDetails {
    private com.visa.cbp.mpqr.facade.RecipientDetails recipientDetails;
    private com.visa.cbp.mpqr.facade.SenderDetails senderDetails;

    public com.visa.cbp.mpqr.facade.SenderDetails getSenderDetails() {
        return this.senderDetails;
    }

    public void setSenderDetails(com.visa.cbp.mpqr.facade.SenderDetails senderDetails) {
        this.senderDetails = senderDetails;
    }

    public com.visa.cbp.mpqr.facade.RecipientDetails getRecipientDetails() {
        return this.recipientDetails;
    }

    public void setRecipientDetails(com.visa.cbp.mpqr.facade.RecipientDetails recipientDetails) {
        this.recipientDetails = recipientDetails;
    }
}
