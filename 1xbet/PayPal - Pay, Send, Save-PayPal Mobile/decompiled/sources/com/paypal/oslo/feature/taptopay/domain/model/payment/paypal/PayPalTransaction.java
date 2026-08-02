package com.paypal.oslo.feature.taptopay.domain.model.payment.paypal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/payment/paypal/PayPalTransaction;", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;", "payPalCardId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "deviceWalletServiceCardId", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;", "transaction", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;", "component2", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "component3", "()Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;", "copy", "(Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;)Lcom/paypal/oslo/feature/taptopay/domain/model/payment/paypal/PayPalTransaction;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;", "getPayPalCardId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$DeviceWalletServiceCardId;", "getDeviceWalletServiceCardId", "Lcom/paypal/oslo/feature/taptopay/domain/model/payment/Transaction;", "getTransaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PayPalTransaction {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId;
    private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId;
    private final com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction transaction;

    public PayPalTransaction(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction transaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalCardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWalletServiceCardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        this.payPalCardId = payPalCardId;
        this.deviceWalletServiceCardId = deviceWalletServiceCardId;
        this.transaction = transaction;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId getPayPalCardId() {
        return this.payPalCardId;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId getDeviceWalletServiceCardId() {
        return this.deviceWalletServiceCardId;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction getTransaction() {
        return this.transaction;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId = this.payPalCardId;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId = this.deviceWalletServiceCardId;
        com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction transaction = this.transaction;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayPalTransaction(payPalCardId=");
        sb.append(payPalCardId);
        sb.append(", deviceWalletServiceCardId=");
        sb.append(deviceWalletServiceCardId);
        sb.append(", transaction=");
        sb.append(transaction);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.payPalCardId.hashCode() * 31) + this.deviceWalletServiceCardId.hashCode()) * 31) + this.transaction.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.payment.paypal.PayPalTransaction)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.domain.model.payment.paypal.PayPalTransaction payPalTransaction = (com.paypal.oslo.feature.taptopay.domain.model.payment.paypal.PayPalTransaction) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.payPalCardId, payPalTransaction.payPalCardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceWalletServiceCardId, payPalTransaction.deviceWalletServiceCardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.transaction, payPalTransaction.transaction);
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.payment.paypal.PayPalTransaction copy(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction transaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalCardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWalletServiceCardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transaction, "");
        return new com.paypal.oslo.feature.taptopay.domain.model.payment.paypal.PayPalTransaction(payPalCardId, deviceWalletServiceCardId, transaction);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction getTransaction() {
        return this.transaction;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId getDeviceWalletServiceCardId() {
        return this.deviceWalletServiceCardId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId getPayPalCardId() {
        return this.payPalCardId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.payment.paypal.PayPalTransaction copy$default(com.paypal.oslo.feature.taptopay.domain.model.payment.paypal.PayPalTransaction payPalTransaction, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId, com.paypal.oslo.feature.taptopay.domain.model.payment.Transaction transaction, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            payPalCardId = payPalTransaction.payPalCardId;
        }
        if ((i & 2) != 0) {
            deviceWalletServiceCardId = payPalTransaction.deviceWalletServiceCardId;
        }
        if ((i & 4) != 0) {
            transaction = payPalTransaction.transaction;
        }
        return payPalTransaction.copy(payPalCardId, deviceWalletServiceCardId, transaction);
    }
}
