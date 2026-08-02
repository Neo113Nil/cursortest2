package com.paypal.oslo.feature.balance.navigation.result;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/balance/navigation/result/AutoReloadAmountNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "", "amount", "formattedAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/navigation/result/AutoReloadAmountNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$balance_prodRelease", "(Lcom/paypal/oslo/feature/balance/navigation/result/AutoReloadAmountNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAmount", "getFormattedAmount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AutoReloadAmountNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult.Companion INSTANCE = new com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult.Companion(null);
    private final java.lang.String amount;
    private final java.lang.String formattedAmount;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/navigation/result/AutoReloadAmountNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/navigation/result/AutoReloadAmountNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult> serializer() {
            return com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AutoReloadAmountNavResult(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.amount = str;
        this.formattedAmount = str2;
    }

    public AutoReloadAmountNavResult(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.amount = str;
        this.formattedAmount = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$balance_prodRelease(com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.amount);
        output.encodeStringElement(serialDesc, 1, self.formattedAmount);
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final java.lang.String getFormattedAmount() {
        return this.formattedAmount;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.amount;
        java.lang.String str2 = this.formattedAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoReloadAmountNavResult(amount=");
        sb.append(str);
        sb.append(", formattedAmount=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.amount.hashCode() * 31) + this.formattedAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult)) {
            return false;
        }
        com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult autoReloadAmountNavResult = (com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, autoReloadAmountNavResult.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, autoReloadAmountNavResult.formattedAmount);
    }

    public final com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult copy(java.lang.String amount, java.lang.String formattedAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
        return new com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult(amount, formattedAmount);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFormattedAmount() {
        return this.formattedAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult copy$default(com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult autoReloadAmountNavResult, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = autoReloadAmountNavResult.amount;
        }
        if ((i & 2) != 0) {
            str2 = autoReloadAmountNavResult.formattedAmount;
        }
        return autoReloadAmountNavResult.copy(str, str2);
    }
}
