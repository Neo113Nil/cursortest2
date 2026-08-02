package com.paypal.oslo.feature.balance.navigation;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 82\u00020\u00012\u00020\u0002:\u000298B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rBQ\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019JL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010\u001bJ'\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b\u0004\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b5\u0010\u001bR\u001a\u0010\n\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b6\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b7\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/balance/navigation/BalanceTaxOnHoldDetailsDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "", "isTaxIdProvided", "", "amount", "", "currencyCode", "taxRate", "nextWithholdingDate", "amountTaxIdRequired", "<init>", "(ZDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "component1", "()Z", "component2", "()D", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "copy", "(ZDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;D)Lcom/paypal/oslo/feature/balance/navigation/BalanceTaxOnHoldDetailsDestination;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$balance_prodRelease", "(Lcom/paypal/oslo/feature/balance/navigation/BalanceTaxOnHoldDetailsDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "D", "getAmount", "Ljava/lang/String;", "getCurrencyCode", "getTaxRate", "getNextWithholdingDate", "getAmountTaxIdRequired", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class BalanceTaxOnHoldDetailsDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination.Companion INSTANCE = new com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination.Companion(null);
    private final double amount;
    private final double amountTaxIdRequired;
    private final java.lang.String currencyCode;
    private final boolean isTaxIdProvided;
    private final java.lang.String nextWithholdingDate;
    private final java.lang.String taxRate;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/navigation/BalanceTaxOnHoldDetailsDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/balance/navigation/BalanceTaxOnHoldDetailsDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination> serializer() {
            return com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BalanceTaxOnHoldDetailsDestination(int i, boolean z, double d, java.lang.String str, java.lang.String str2, java.lang.String str3, double d2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 63, com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.isTaxIdProvided = z;
        this.amount = d;
        this.currencyCode = str;
        this.taxRate = str2;
        this.nextWithholdingDate = str3;
        this.amountTaxIdRequired = d2;
    }

    public BalanceTaxOnHoldDetailsDestination(boolean z, double d, java.lang.String str, java.lang.String str2, java.lang.String str3, double d2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.isTaxIdProvided = z;
        this.amount = d;
        this.currencyCode = str;
        this.taxRate = str2;
        this.nextWithholdingDate = str3;
        this.amountTaxIdRequired = d2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$balance_prodRelease(com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.isTaxIdProvided);
        output.encodeDoubleElement(serialDesc, 1, self.amount);
        output.encodeStringElement(serialDesc, 2, self.currencyCode);
        output.encodeStringElement(serialDesc, 3, self.taxRate);
        output.encodeStringElement(serialDesc, 4, self.nextWithholdingDate);
        output.encodeDoubleElement(serialDesc, 5, self.amountTaxIdRequired);
    }

    public final boolean isTaxIdProvided() {
        return this.isTaxIdProvided;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getTaxRate() {
        return this.taxRate;
    }

    public final java.lang.String getNextWithholdingDate() {
        return this.nextWithholdingDate;
    }

    public final double getAmountTaxIdRequired() {
        return this.amountTaxIdRequired;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor(com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceOnHold.SCREEN_TAX_ON_HOLD, new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("balance", com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceOnHold.FEATURE, com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceOnHold.ACTION_VIEW_DETAILS), null, 4, null);
    }

    public final java.lang.String toString() {
        boolean z = this.isTaxIdProvided;
        double d = this.amount;
        java.lang.String str = this.currencyCode;
        java.lang.String str2 = this.taxRate;
        java.lang.String str3 = this.nextWithholdingDate;
        double d2 = this.amountTaxIdRequired;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceTaxOnHoldDetailsDestination(isTaxIdProvided=");
        sb.append(z);
        sb.append(", amount=");
        sb.append(d);
        sb.append(", currencyCode=");
        sb.append(str);
        sb.append(", taxRate=");
        sb.append(str2);
        sb.append(", nextWithholdingDate=");
        sb.append(str3);
        sb.append(", amountTaxIdRequired=");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((java.lang.Boolean.hashCode(this.isTaxIdProvided) * 31) + java.lang.Double.hashCode(this.amount)) * 31) + this.currencyCode.hashCode()) * 31) + this.taxRate.hashCode()) * 31) + this.nextWithholdingDate.hashCode()) * 31) + java.lang.Double.hashCode(this.amountTaxIdRequired);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination)) {
            return false;
        }
        com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination balanceTaxOnHoldDetailsDestination = (com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination) other;
        return this.isTaxIdProvided == balanceTaxOnHoldDetailsDestination.isTaxIdProvided && java.lang.Double.compare(this.amount, balanceTaxOnHoldDetailsDestination.amount) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, balanceTaxOnHoldDetailsDestination.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxRate, balanceTaxOnHoldDetailsDestination.taxRate) && kotlin.jvm.internal.Intrinsics.areEqual(this.nextWithholdingDate, balanceTaxOnHoldDetailsDestination.nextWithholdingDate) && java.lang.Double.compare(this.amountTaxIdRequired, balanceTaxOnHoldDetailsDestination.amountTaxIdRequired) == 0;
    }

    public final com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination copy(boolean isTaxIdProvided, double amount, java.lang.String currencyCode, java.lang.String taxRate, java.lang.String nextWithholdingDate, double amountTaxIdRequired) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxRate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextWithholdingDate, "");
        return new com.paypal.oslo.feature.balance.navigation.BalanceTaxOnHoldDetailsDestination(isTaxIdProvided, amount, currencyCode, taxRate, nextWithholdingDate, amountTaxIdRequired);
    }

    /* renamed from: component6, reason: from getter */
    public final double getAmountTaxIdRequired() {
        return this.amountTaxIdRequired;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getNextWithholdingDate() {
        return this.nextWithholdingDate;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getTaxRate() {
        return this.taxRate;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsTaxIdProvided() {
        return this.isTaxIdProvided;
    }
}
