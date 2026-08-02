package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012Jz\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b(\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b)\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b+\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b,\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b-\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b.\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/ReceiptDetails;", "", "", "amount", "", "maskedPan", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_ENTRY_MODE, "applicationIdentifier", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_APPLICATION_NAME, "transactionStatusInformation", "terminalVerificationResult", "authorizationCode", "cardholderVerificationMethod", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zettle/sdk/ReceiptDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "J", "getAmount", "Ljava/lang/String;", "getApplicationIdentifier", "getApplicationName", "getAuthorizationCode", "getCardPaymentEntryMode", "getCardholderVerificationMethod", "getMaskedPan", "getTerminalVerificationResult", "getTransactionStatusInformation"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ReceiptDetails {
    private final long amount;
    private final java.lang.String applicationIdentifier;
    private final java.lang.String applicationName;
    private final java.lang.String authorizationCode;
    private final java.lang.String cardPaymentEntryMode;
    private final java.lang.String cardholderVerificationMethod;
    private final java.lang.String maskedPan;
    private final java.lang.String terminalVerificationResult;
    private final java.lang.String transactionStatusInformation;

    public ReceiptDetails(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.amount = j;
        this.maskedPan = str;
        this.cardPaymentEntryMode = str2;
        this.applicationIdentifier = str3;
        this.applicationName = str4;
        this.transactionStatusInformation = str5;
        this.terminalVerificationResult = str6;
        this.authorizationCode = str7;
        this.cardholderVerificationMethod = str8;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final java.lang.String getMaskedPan() {
        return this.maskedPan;
    }

    public final java.lang.String getCardPaymentEntryMode() {
        return this.cardPaymentEntryMode;
    }

    public final java.lang.String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    public final java.lang.String getApplicationName() {
        return this.applicationName;
    }

    public final java.lang.String getTransactionStatusInformation() {
        return this.transactionStatusInformation;
    }

    public final java.lang.String getTerminalVerificationResult() {
        return this.terminalVerificationResult;
    }

    public final java.lang.String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public final java.lang.String getCardholderVerificationMethod() {
        return this.cardholderVerificationMethod;
    }

    public final java.lang.String toString() {
        long j = this.amount;
        java.lang.String str = this.maskedPan;
        java.lang.String str2 = this.cardPaymentEntryMode;
        java.lang.String str3 = this.applicationIdentifier;
        java.lang.String str4 = this.applicationName;
        java.lang.String str5 = this.transactionStatusInformation;
        java.lang.String str6 = this.terminalVerificationResult;
        java.lang.String str7 = this.authorizationCode;
        java.lang.String str8 = this.cardholderVerificationMethod;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReceiptDetails(amount=");
        sb.append(j);
        sb.append(", maskedPan=");
        sb.append(str);
        sb.append(", cardPaymentEntryMode=");
        sb.append(str2);
        sb.append(", applicationIdentifier=");
        sb.append(str3);
        sb.append(", applicationName=");
        sb.append(str4);
        sb.append(", transactionStatusInformation=");
        sb.append(str5);
        sb.append(", terminalVerificationResult=");
        sb.append(str6);
        sb.append(", authorizationCode=");
        sb.append(str7);
        sb.append(", cardholderVerificationMethod=");
        sb.append(str8);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.amount);
        java.lang.String str = this.maskedPan;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.cardPaymentEntryMode;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.applicationIdentifier;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.applicationName;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.transactionStatusInformation;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.terminalVerificationResult;
        int hashCode7 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.authorizationCode;
        int hashCode8 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.cardholderVerificationMethod;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.ReceiptDetails)) {
            return false;
        }
        com.zettle.sdk.ReceiptDetails receiptDetails = (com.zettle.sdk.ReceiptDetails) other;
        return this.amount == receiptDetails.amount && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedPan, receiptDetails.maskedPan) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardPaymentEntryMode, receiptDetails.cardPaymentEntryMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.applicationIdentifier, receiptDetails.applicationIdentifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.applicationName, receiptDetails.applicationName) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionStatusInformation, receiptDetails.transactionStatusInformation) && kotlin.jvm.internal.Intrinsics.areEqual(this.terminalVerificationResult, receiptDetails.terminalVerificationResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.authorizationCode, receiptDetails.authorizationCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardholderVerificationMethod, receiptDetails.cardholderVerificationMethod);
    }

    public final com.zettle.sdk.ReceiptDetails copy(long amount, java.lang.String maskedPan, java.lang.String cardPaymentEntryMode, java.lang.String applicationIdentifier, java.lang.String applicationName, java.lang.String transactionStatusInformation, java.lang.String terminalVerificationResult, java.lang.String authorizationCode, java.lang.String cardholderVerificationMethod) {
        return new com.zettle.sdk.ReceiptDetails(amount, maskedPan, cardPaymentEntryMode, applicationIdentifier, applicationName, transactionStatusInformation, terminalVerificationResult, authorizationCode, cardholderVerificationMethod);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getCardholderVerificationMethod() {
        return this.cardholderVerificationMethod;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getAuthorizationCode() {
        return this.authorizationCode;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getTerminalVerificationResult() {
        return this.terminalVerificationResult;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getTransactionStatusInformation() {
        return this.transactionStatusInformation;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getApplicationName() {
        return this.applicationName;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCardPaymentEntryMode() {
        return this.cardPaymentEntryMode;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMaskedPan() {
        return this.maskedPan;
    }

    /* renamed from: component1, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }
}
