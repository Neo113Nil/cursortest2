package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TransactionDetails;", "", "", "paypalTransactionId", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "totalFee", "merchantNetAmount", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;)Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/TransactionDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPaypalTransactionId", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/monetary/GetPaidMoney;", "getTotalFee", "getMerchantNetAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TransactionDetails {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney merchantNetAmount;
    private final java.lang.String paypalTransactionId;
    private final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney totalFee;

    public TransactionDetails(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney2) {
        this.paypalTransactionId = str;
        this.totalFee = getPaidMoney;
        this.merchantNetAmount = getPaidMoney2;
    }

    public final java.lang.String getPaypalTransactionId() {
        return this.paypalTransactionId;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getTotalFee() {
        return this.totalFee;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getMerchantNetAmount() {
        return this.merchantNetAmount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.paypalTransactionId;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney = this.totalFee;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney2 = this.merchantNetAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionDetails(paypalTransactionId=");
        sb.append(str);
        sb.append(", totalFee=");
        sb.append(getPaidMoney);
        sb.append(", merchantNetAmount=");
        sb.append(getPaidMoney2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.paypalTransactionId;
        int hashCode = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney = this.totalFee;
        int hashCode2 = getPaidMoney == null ? 0 : getPaidMoney.hashCode();
        com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney2 = this.merchantNetAmount;
        return (((hashCode * 31) + hashCode2) * 31) + (getPaidMoney2 != null ? getPaidMoney2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TransactionDetails)) {
            return false;
        }
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TransactionDetails transactionDetails = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TransactionDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.paypalTransactionId, transactionDetails.paypalTransactionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalFee, transactionDetails.totalFee) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantNetAmount, transactionDetails.merchantNetAmount);
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TransactionDetails copy(java.lang.String paypalTransactionId, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney totalFee, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney merchantNetAmount) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TransactionDetails(paypalTransactionId, totalFee, merchantNetAmount);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getMerchantNetAmount() {
        return this.merchantNetAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getTotalFee() {
        return this.totalFee;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPaypalTransactionId() {
        return this.paypalTransactionId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TransactionDetails copy$default(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.TransactionDetails transactionDetails, java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney, com.paypal.oslo.feature.businesspayandgetpaid.shared.monetary.GetPaidMoney getPaidMoney2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = transactionDetails.paypalTransactionId;
        }
        if ((i & 2) != 0) {
            getPaidMoney = transactionDetails.totalFee;
        }
        if ((i & 4) != 0) {
            getPaidMoney2 = transactionDetails.merchantNetAmount;
        }
        return transactionDetails.copy(str, getPaidMoney, getPaidMoney2);
    }
}
