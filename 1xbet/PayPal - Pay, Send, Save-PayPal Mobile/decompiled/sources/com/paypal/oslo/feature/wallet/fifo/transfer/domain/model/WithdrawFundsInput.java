package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0011J'\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsInput;", "", "", "planningId", "disbursementOptionId", "transferMethod", "transferMode", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsInput;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getPlanningId", "getDisbursementOptionId", "getTransferMethod", "getTransferMode", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;", "getAmount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class WithdrawFundsInput {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsInput.Companion INSTANCE = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsInput.Companion(null);
    private final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney amount;
    private final java.lang.String disbursementOptionId;
    private final java.lang.String planningId;
    private final java.lang.String transferMethod;
    private final java.lang.String transferMode;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsInput$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsInput;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsInput> serializer() {
            return com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsInput$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WithdrawFundsInput(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 31, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsInput$$serializer.INSTANCE.getDescriptor());
        }
        this.planningId = str;
        this.disbursementOptionId = str2;
        this.transferMethod = str3;
        this.transferMode = str4;
        this.amount = withdrawFundsMoney;
    }

    public WithdrawFundsInput(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFundsMoney, "");
        this.planningId = str;
        this.disbursementOptionId = str2;
        this.transferMethod = str3;
        this.transferMode = str4;
        this.amount = withdrawFundsMoney;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsInput self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.planningId);
        output.encodeStringElement(serialDesc, 1, self.disbursementOptionId);
        output.encodeStringElement(serialDesc, 2, self.transferMethod);
        output.encodeStringElement(serialDesc, 3, self.transferMode);
        output.encodeSerializableElement(serialDesc, 4, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney$$serializer.INSTANCE, self.amount);
    }

    public final java.lang.String getPlanningId() {
        return this.planningId;
    }

    public final java.lang.String getDisbursementOptionId() {
        return this.disbursementOptionId;
    }

    public final java.lang.String getTransferMethod() {
        return this.transferMethod;
    }

    public final java.lang.String getTransferMode() {
        return this.transferMode;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney getAmount() {
        return this.amount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.planningId;
        java.lang.String str2 = this.disbursementOptionId;
        java.lang.String str3 = this.transferMethod;
        java.lang.String str4 = this.transferMode;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WithdrawFundsInput(planningId=");
        sb.append(str);
        sb.append(", disbursementOptionId=");
        sb.append(str2);
        sb.append(", transferMethod=");
        sb.append(str3);
        sb.append(", transferMode=");
        sb.append(str4);
        sb.append(", amount=");
        sb.append(withdrawFundsMoney);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.planningId.hashCode() * 31) + this.disbursementOptionId.hashCode()) * 31) + this.transferMethod.hashCode()) * 31) + this.transferMode.hashCode()) * 31) + this.amount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsInput)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsInput withdrawFundsInput = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.planningId, withdrawFundsInput.planningId) && kotlin.jvm.internal.Intrinsics.areEqual(this.disbursementOptionId, withdrawFundsInput.disbursementOptionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferMethod, withdrawFundsInput.transferMethod) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferMode, withdrawFundsInput.transferMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, withdrawFundsInput.amount);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsInput copy(java.lang.String planningId, java.lang.String disbursementOptionId, java.lang.String transferMethod, java.lang.String transferMode, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planningId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disbursementOptionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsInput(planningId, disbursementOptionId, transferMethod, transferMode, amount);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getTransferMode() {
        return this.transferMode;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTransferMethod() {
        return this.transferMethod;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDisbursementOptionId() {
        return this.disbursementOptionId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPlanningId() {
        return this.planningId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsInput copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsInput withdrawFundsInput, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = withdrawFundsInput.planningId;
        }
        if ((i & 2) != 0) {
            str2 = withdrawFundsInput.disbursementOptionId;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = withdrawFundsInput.transferMethod;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = withdrawFundsInput.transferMode;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            withdrawFundsMoney = withdrawFundsInput.amount;
        }
        return withdrawFundsInput.copy(str, str5, str6, str7, withdrawFundsMoney);
    }
}
