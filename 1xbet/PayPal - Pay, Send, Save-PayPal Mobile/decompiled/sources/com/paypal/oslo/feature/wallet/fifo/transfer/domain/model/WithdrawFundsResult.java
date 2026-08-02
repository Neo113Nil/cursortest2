package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJV\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0014J'\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u001aR\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b6\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b7\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsResult;", "", "", "id", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalStatus;", "status", "transferMethod", "transferMode", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;", "amount", "fees", "netAmount", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalStatus;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalStatus;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalStatus;", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;", "component6", "component7", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalStatus;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalStatus;", "getStatus", "getTransferMethod", "getTransferMode", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsMoney;", "getAmount", "getFees", "getNetAmount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class WithdrawFundsResult {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney amount;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney fees;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney netAmount;
    private final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus status;
    private final java.lang.String transferMethod;
    private final java.lang.String transferMode;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult.Companion INSTANCE = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null, null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawFundsResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult> serializer() {
            return com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WithdrawFundsResult(int i, java.lang.String str, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus withdrawalStatus, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney2, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 127, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.status = withdrawalStatus;
        this.transferMethod = str2;
        this.transferMode = str3;
        this.amount = withdrawFundsMoney;
        this.fees = withdrawFundsMoney2;
        this.netAmount = withdrawFundsMoney3;
    }

    public WithdrawFundsResult(java.lang.String str, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus withdrawalStatus, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney2, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawalStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFundsMoney, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFundsMoney2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFundsMoney3, "");
        this.id = str;
        this.status = withdrawalStatus;
        this.transferMethod = str2;
        this.transferMode = str3;
        this.amount = withdrawFundsMoney;
        this.fees = withdrawFundsMoney2;
        this.netAmount = withdrawFundsMoney3;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.status);
        output.encodeStringElement(serialDesc, 2, self.transferMethod);
        output.encodeStringElement(serialDesc, 3, self.transferMode);
        output.encodeSerializableElement(serialDesc, 4, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney$$serializer.INSTANCE, self.amount);
        output.encodeSerializableElement(serialDesc, 5, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney$$serializer.INSTANCE, self.fees);
        output.encodeSerializableElement(serialDesc, 6, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney$$serializer.INSTANCE, self.netAmount);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus getStatus() {
        return this.status;
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

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney getFees() {
        return this.fees;
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney getNetAmount() {
        return this.netAmount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus withdrawalStatus = this.status;
        java.lang.String str2 = this.transferMethod;
        java.lang.String str3 = this.transferMode;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney = this.amount;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney2 = this.fees;
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney3 = this.netAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WithdrawFundsResult(id=");
        sb.append(str);
        sb.append(", status=");
        sb.append(withdrawalStatus);
        sb.append(", transferMethod=");
        sb.append(str2);
        sb.append(", transferMode=");
        sb.append(str3);
        sb.append(", amount=");
        sb.append(withdrawFundsMoney);
        sb.append(", fees=");
        sb.append(withdrawFundsMoney2);
        sb.append(", netAmount=");
        sb.append(withdrawFundsMoney3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.status.hashCode()) * 31) + this.transferMethod.hashCode()) * 31) + this.transferMode.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.fees.hashCode()) * 31) + this.netAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult withdrawFundsResult = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, withdrawFundsResult.id) && this.status == withdrawFundsResult.status && kotlin.jvm.internal.Intrinsics.areEqual(this.transferMethod, withdrawFundsResult.transferMethod) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferMode, withdrawFundsResult.transferMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, withdrawFundsResult.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.fees, withdrawFundsResult.fees) && kotlin.jvm.internal.Intrinsics.areEqual(this.netAmount, withdrawFundsResult.netAmount);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult copy(java.lang.String id, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus status, java.lang.String transferMethod, java.lang.String transferMode, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney amount, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney fees, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney netAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fees, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(netAmount, "");
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult(id, status, transferMethod, transferMode, amount, fees, netAmount);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney getNetAmount() {
        return this.netAmount;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney getFees() {
        return this.fees;
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
    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsResult withdrawFundsResult, java.lang.String str, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus withdrawalStatus, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney2, com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = withdrawFundsResult.id;
        }
        if ((i & 2) != 0) {
            withdrawalStatus = withdrawFundsResult.status;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalStatus withdrawalStatus2 = withdrawalStatus;
        if ((i & 4) != 0) {
            str2 = withdrawFundsResult.transferMethod;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            str3 = withdrawFundsResult.transferMode;
        }
        java.lang.String str5 = str3;
        if ((i & 16) != 0) {
            withdrawFundsMoney = withdrawFundsResult.amount;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney4 = withdrawFundsMoney;
        if ((i & 32) != 0) {
            withdrawFundsMoney2 = withdrawFundsResult.fees;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawFundsMoney withdrawFundsMoney5 = withdrawFundsMoney2;
        if ((i & 64) != 0) {
            withdrawFundsMoney3 = withdrawFundsResult.netAmount;
        }
        return withdrawFundsResult.copy(str, withdrawalStatus2, str4, str5, withdrawFundsMoney4, withdrawFundsMoney5, withdrawFundsMoney3);
    }
}
