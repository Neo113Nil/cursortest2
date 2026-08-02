package com.paypal.oslo.feature.balance.navigation;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0002,+B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB-\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0014J'\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/balance/navigation/BalanceMoneyOnHoldDetailsDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "", "amount", "", "currencyCode", "<init>", "(DLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "component1", "()D", "component2", "()Ljava/lang/String;", "copy", "(DLjava/lang/String;)Lcom/paypal/oslo/feature/balance/navigation/BalanceMoneyOnHoldDetailsDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$balance_prodRelease", "(Lcom/paypal/oslo/feature/balance/navigation/BalanceMoneyOnHoldDetailsDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "D", "getAmount", "Ljava/lang/String;", "getCurrencyCode", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class BalanceMoneyOnHoldDetailsDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination.Companion INSTANCE = new com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination.Companion(null);
    private final double amount;
    private final java.lang.String currencyCode;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/navigation/BalanceMoneyOnHoldDetailsDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/navigation/BalanceMoneyOnHoldDetailsDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination> serializer() {
            return com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BalanceMoneyOnHoldDetailsDestination(double d, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.amount = d;
        this.currencyCode = str;
    }

    public /* synthetic */ BalanceMoneyOnHoldDetailsDestination(int i, double d, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.amount = d;
        this.currencyCode = str;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$balance_prodRelease(com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeDoubleElement(serialDesc, 0, self.amount);
        output.encodeStringElement(serialDesc, 1, self.currencyCode);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceOnHold.SCREEN_MONEY_ON_HOLD, new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("balance", com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceOnHold.FEATURE, com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceOnHold.ACTION_VIEW_DETAILS), null, 4, null);
    }

    public final java.lang.String toString() {
        double d = this.amount;
        java.lang.String str = this.currencyCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceMoneyOnHoldDetailsDestination(amount=");
        sb.append(d);
        sb.append(", currencyCode=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Double.hashCode(this.amount) * 31) + this.currencyCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination)) {
            return false;
        }
        com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination balanceMoneyOnHoldDetailsDestination = (com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination) other;
        return java.lang.Double.compare(this.amount, balanceMoneyOnHoldDetailsDestination.amount) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, balanceMoneyOnHoldDetailsDestination.currencyCode);
    }

    public final com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination copy(double amount, java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        return new com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination(amount, currencyCode);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    public static /* synthetic */ com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination copy$default(com.paypal.oslo.feature.balance.navigation.BalanceMoneyOnHoldDetailsDestination balanceMoneyOnHoldDetailsDestination, double d, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = balanceMoneyOnHoldDetailsDestination.amount;
        }
        if ((i & 2) != 0) {
            str = balanceMoneyOnHoldDetailsDestination.currencyCode;
        }
        return balanceMoneyOnHoldDetailsDestination.copy(d, str);
    }
}
