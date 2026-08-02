package com.visa.cbp.mpqr.facade;

/* loaded from: classes16.dex */
public class TokenPaymentRequest {
    private java.lang.String amount;
    private java.lang.String atc;
    private java.lang.String businessApplicationId;
    private com.visa.cbp.mpqr.facade.CardAcceptor cardAcceptor;
    private java.lang.String cardTransactionQualifiers;
    private com.visa.cbp.mpqr.facade.ChannelSecurityContext channelSecurityContext;
    private java.lang.String clientReferenceId;
    private java.lang.String dvv;
    private java.lang.String encTransactionParticipantDetails;
    private java.lang.String initiationMethod;
    private java.lang.String localTransactionDateTime;
    private java.lang.String merchantCategoryCode;
    private java.lang.String merchantVerificationValue;
    private com.visa.cbp.mpqr.facade.PointOfServiceCapability pointOfServiceCapability;
    private com.visa.cbp.mpqr.facade.PointOfServiceData pointOfServiceData;
    private com.visa.cbp.mpqr.facade.PullFundsTransaction pullFundsTransaction;
    private com.visa.cbp.mpqr.facade.PushFundsTransaction pushFundsTransaction;
    private com.visa.cbp.mpqr.facade.RecipientDetails recipientDetails;
    private com.visa.cbp.mpqr.facade.SenderDetails senderDetails;
    private java.lang.String transactionCurrencyCode;

    public void initialize() {
        com.visa.cbp.mpqr.facade.BillingAddress billingAddress = new com.visa.cbp.mpqr.facade.BillingAddress();
        com.visa.cbp.mpqr.facade.CardAcceptor cardAcceptor = new com.visa.cbp.mpqr.facade.CardAcceptor();
        com.visa.cbp.mpqr.facade.RecipientPaymentInstrument recipientPaymentInstrument = new com.visa.cbp.mpqr.facade.RecipientPaymentInstrument();
        com.visa.cbp.mpqr.facade.RecipientDetails recipientDetails = new com.visa.cbp.mpqr.facade.RecipientDetails();
        com.visa.cbp.mpqr.facade.SenderDetails senderDetails = new com.visa.cbp.mpqr.facade.SenderDetails();
        com.visa.cbp.mpqr.facade.PointOfServiceData pointOfServiceData = new com.visa.cbp.mpqr.facade.PointOfServiceData();
        com.visa.cbp.mpqr.facade.PointOfServiceCapability pointOfServiceCapability = new com.visa.cbp.mpqr.facade.PointOfServiceCapability();
        com.visa.cbp.mpqr.facade.PullFundsTransaction pullFundsTransaction = new com.visa.cbp.mpqr.facade.PullFundsTransaction();
        com.visa.cbp.mpqr.facade.PurchaseIdentifier purchaseIdentifier = new com.visa.cbp.mpqr.facade.PurchaseIdentifier();
        com.visa.cbp.mpqr.facade.PushFundsTransaction pushFundsTransaction = new com.visa.cbp.mpqr.facade.PushFundsTransaction();
        com.visa.cbp.mpqr.facade.ChannelSecurityContext channelSecurityContext = new com.visa.cbp.mpqr.facade.ChannelSecurityContext();
        cardAcceptor.setAddress(billingAddress);
        setCardAcceptor(cardAcceptor);
        recipientDetails.setRecipientPaymentInstrument(recipientPaymentInstrument);
        setRecipientDetails(recipientDetails);
        setSenderDetails(senderDetails);
        setPointOfServiceData(pointOfServiceData);
        setPointOfServiceCapability(pointOfServiceCapability);
        setPullFundsTransaction(pullFundsTransaction);
        pushFundsTransaction.setPurchaseIdentifier(purchaseIdentifier);
        setPushFundsTransaction(pushFundsTransaction);
        setChannelSecurityContext(channelSecurityContext);
    }

    public java.lang.String getDvv() {
        return this.dvv;
    }

    public void setDvv(java.lang.String str) {
        this.dvv = str;
    }

    public java.lang.String getAtc() {
        return this.atc;
    }

    public void setAtc(java.lang.String str) {
        this.atc = str;
    }

    public java.lang.String getCardTransactionQualifiers() {
        return this.cardTransactionQualifiers;
    }

    public void setCardTransactionQualifiers(java.lang.String str) {
        this.cardTransactionQualifiers = str;
    }

    public java.lang.String getClientReferenceId() {
        return this.clientReferenceId;
    }

    public void setClientReferenceId(java.lang.String str) {
        this.clientReferenceId = str;
    }

    public com.visa.cbp.mpqr.facade.PointOfServiceData getPointOfServiceData() {
        return this.pointOfServiceData;
    }

    public void setPointOfServiceData(com.visa.cbp.mpqr.facade.PointOfServiceData pointOfServiceData) {
        this.pointOfServiceData = pointOfServiceData;
    }

    public java.lang.String getMerchantVerificationValue() {
        return this.merchantVerificationValue;
    }

    public void setMerchantVerificationValue(java.lang.String str) {
        this.merchantVerificationValue = str;
    }

    public java.lang.String getLocalTransactionDateTime() {
        return this.localTransactionDateTime;
    }

    public void setLocalTransactionDateTime(java.lang.String str) {
        this.localTransactionDateTime = str;
    }

    public com.visa.cbp.mpqr.facade.PullFundsTransaction getPullFundsTransaction() {
        return this.pullFundsTransaction;
    }

    public void setPullFundsTransaction(com.visa.cbp.mpqr.facade.PullFundsTransaction pullFundsTransaction) {
        this.pullFundsTransaction = pullFundsTransaction;
    }

    public java.lang.String getTransactionCurrencyCode() {
        return this.transactionCurrencyCode;
    }

    public void setTransactionCurrencyCode(java.lang.String str) {
        this.transactionCurrencyCode = str;
    }

    public com.visa.cbp.mpqr.facade.PointOfServiceCapability getPointOfServiceCapability() {
        return this.pointOfServiceCapability;
    }

    public void setPointOfServiceCapability(com.visa.cbp.mpqr.facade.PointOfServiceCapability pointOfServiceCapability) {
        this.pointOfServiceCapability = pointOfServiceCapability;
    }

    public java.lang.String getAmount() {
        return this.amount;
    }

    public void setAmount(java.lang.String str) {
        this.amount = str;
    }

    public com.visa.cbp.mpqr.facade.PushFundsTransaction getPushFundsTransaction() {
        return this.pushFundsTransaction;
    }

    public void setPushFundsTransaction(com.visa.cbp.mpqr.facade.PushFundsTransaction pushFundsTransaction) {
        this.pushFundsTransaction = pushFundsTransaction;
    }

    public java.lang.String getInitiationMethod() {
        return this.initiationMethod;
    }

    public void setInitiationMethod(java.lang.String str) {
        this.initiationMethod = str;
    }

    public com.visa.cbp.mpqr.facade.ChannelSecurityContext getChannelSecurityContext() {
        return this.channelSecurityContext;
    }

    public void setChannelSecurityContext(com.visa.cbp.mpqr.facade.ChannelSecurityContext channelSecurityContext) {
        this.channelSecurityContext = channelSecurityContext;
    }

    public java.lang.String getBusinessApplicationId() {
        return this.businessApplicationId;
    }

    public void setBusinessApplicationId(java.lang.String str) {
        this.businessApplicationId = str;
    }

    public java.lang.String getMerchantCategoryCode() {
        return this.merchantCategoryCode;
    }

    public void setMerchantCategoryCode(java.lang.String str) {
        this.merchantCategoryCode = str;
    }

    public com.visa.cbp.mpqr.facade.CardAcceptor getCardAcceptor() {
        return this.cardAcceptor;
    }

    public void setCardAcceptor(com.visa.cbp.mpqr.facade.CardAcceptor cardAcceptor) {
        this.cardAcceptor = cardAcceptor;
    }

    public com.visa.cbp.mpqr.facade.RecipientDetails getRecipientDetails() {
        return this.recipientDetails;
    }

    public void setRecipientDetails(com.visa.cbp.mpqr.facade.RecipientDetails recipientDetails) {
        this.recipientDetails = recipientDetails;
    }

    public com.visa.cbp.mpqr.facade.SenderDetails getSenderDetails() {
        return this.senderDetails;
    }

    public void setSenderDetails(com.visa.cbp.mpqr.facade.SenderDetails senderDetails) {
        this.senderDetails = senderDetails;
    }

    public java.lang.String getEncTransactionParticipantDetails() {
        return this.encTransactionParticipantDetails;
    }

    public void setEncTransactionParticipantDetails(java.lang.String str) {
        this.encTransactionParticipantDetails = str;
    }
}
