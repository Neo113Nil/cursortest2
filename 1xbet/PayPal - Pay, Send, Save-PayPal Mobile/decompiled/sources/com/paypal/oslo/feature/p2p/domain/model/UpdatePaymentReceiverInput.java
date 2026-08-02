package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentReceiverInput;", "", "", "paymentTransferAttemptId", "receiverId", "Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;", "receiverType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;)Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentReceiverInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPaymentTransferAttemptId", "getReceiverId", "Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;", "getReceiverType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UpdatePaymentReceiverInput {
    public static final int $stable = 0;
    private final java.lang.String paymentTransferAttemptId;
    private final java.lang.String receiverId;
    private final com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType;

    public UpdatePaymentReceiverInput(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiverType, "");
        this.paymentTransferAttemptId = str;
        this.receiverId = str2;
        this.receiverType = receiverType;
    }

    public final java.lang.String getPaymentTransferAttemptId() {
        return this.paymentTransferAttemptId;
    }

    public final java.lang.String getReceiverId() {
        return this.receiverId;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.ReceiverType getReceiverType() {
        return this.receiverType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.paymentTransferAttemptId;
        java.lang.String str2 = this.receiverId;
        com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType = this.receiverType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePaymentReceiverInput(paymentTransferAttemptId=");
        sb.append(str);
        sb.append(", receiverId=");
        sb.append(str2);
        sb.append(", receiverType=");
        sb.append(receiverType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.paymentTransferAttemptId.hashCode() * 31) + this.receiverId.hashCode()) * 31) + this.receiverType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentReceiverInput)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentReceiverInput updatePaymentReceiverInput = (com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentReceiverInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTransferAttemptId, updatePaymentReceiverInput.paymentTransferAttemptId) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiverId, updatePaymentReceiverInput.receiverId) && this.receiverType == updatePaymentReceiverInput.receiverType;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentReceiverInput copy(java.lang.String paymentTransferAttemptId, java.lang.String receiverId, com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttemptId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiverId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiverType, "");
        return new com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentReceiverInput(paymentTransferAttemptId, receiverId, receiverType);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.ReceiverType getReceiverType() {
        return this.receiverType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getReceiverId() {
        return this.receiverId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPaymentTransferAttemptId() {
        return this.paymentTransferAttemptId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentReceiverInput copy$default(com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentReceiverInput updatePaymentReceiverInput, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = updatePaymentReceiverInput.paymentTransferAttemptId;
        }
        if ((i & 2) != 0) {
            str2 = updatePaymentReceiverInput.receiverId;
        }
        if ((i & 4) != 0) {
            receiverType = updatePaymentReceiverInput.receiverType;
        }
        return updatePaymentReceiverInput.copy(str, str2, receiverType);
    }
}
