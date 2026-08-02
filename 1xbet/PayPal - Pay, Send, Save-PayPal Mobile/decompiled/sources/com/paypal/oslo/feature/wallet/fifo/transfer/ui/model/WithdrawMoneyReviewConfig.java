package com.paypal.oslo.feature.wallet.fifo.transfer.ui.model;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyReviewConfig;", "", "", "amount", "", "balanceId", "currencyCode", "<init>", "(DLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()D", "component2", "()Ljava/lang/String;", "component3", "copy", "(DLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyReviewConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyReviewConfig;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "D", "getAmount", "Ljava/lang/String;", "getBalanceId", "getCurrencyCode", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class WithdrawMoneyReviewConfig {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig.Companion INSTANCE = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig.Companion(null);
    private final double amount;
    private final java.lang.String balanceId;
    private final java.lang.String currencyCode;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyReviewConfig$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/model/WithdrawMoneyReviewConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig> serializer() {
            return com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WithdrawMoneyReviewConfig(double d, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.amount = d;
        this.balanceId = str;
        this.currencyCode = str2;
    }

    public /* synthetic */ WithdrawMoneyReviewConfig(int i, double d, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.amount = d;
        this.balanceId = str;
        this.currencyCode = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.amount);
        output.encodeStringElement(serialDesc, 1, self.balanceId);
        output.encodeStringElement(serialDesc, 2, self.currencyCode);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final java.lang.String getBalanceId() {
        return this.balanceId;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String toString() {
        double d = this.amount;
        java.lang.String str = this.balanceId;
        java.lang.String str2 = this.currencyCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WithdrawMoneyReviewConfig(amount=");
        sb.append(d);
        sb.append(", balanceId=");
        sb.append(str);
        sb.append(", currencyCode=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Double.hashCode(this.amount) * 31) + this.balanceId.hashCode()) * 31) + this.currencyCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig withdrawMoneyReviewConfig = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig) other;
        return java.lang.Double.compare(this.amount, withdrawMoneyReviewConfig.amount) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceId, withdrawMoneyReviewConfig.balanceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, withdrawMoneyReviewConfig.currencyCode);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig copy(double amount, java.lang.String balanceId, java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig(amount, balanceId, currencyCode);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBalanceId() {
        return this.balanceId;
    }

    /* renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.ui.model.WithdrawMoneyReviewConfig withdrawMoneyReviewConfig, double d, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = withdrawMoneyReviewConfig.amount;
        }
        if ((i & 2) != 0) {
            str = withdrawMoneyReviewConfig.balanceId;
        }
        if ((i & 4) != 0) {
            str2 = withdrawMoneyReviewConfig.currencyCode;
        }
        return withdrawMoneyReviewConfig.copy(d, str, str2);
    }
}
