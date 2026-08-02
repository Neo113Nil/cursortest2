package com.paypal.oslo.feature.cashin.api.navigation;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0002*)B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013J'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/cashin/api/navigation/CashInMainDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "", "initialTab", "", "source", "<init>", "(ILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/cashin/api/navigation/CashInMainDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$cash_in_api_prodRelease", "(Lcom/paypal/oslo/feature/cashin/api/navigation/CashInMainDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", com.visa.cbp.getEncExpo.warmup, "getInitialTab", "Ljava/lang/String;", "getSource", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CashInMainDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination.Companion INSTANCE = new com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination.Companion(null);
    private final int initialTab;
    private final java.lang.String source;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cashin/api/navigation/CashInMainDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/cashin/api/navigation/CashInMainDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination> serializer() {
            return com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CashInMainDestination(int i, int i2, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 2, com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.initialTab = 0;
        } else {
            this.initialTab = i2;
        }
        this.source = str;
    }

    public CashInMainDestination(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.initialTab = i;
        this.source = str;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$cash_in_api_prodRelease(com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.initialTab != 0) {
            output.encodeIntElement(serialDesc, 0, self.initialTab);
        }
        output.encodeStringElement(serialDesc, 1, self.source);
    }

    public /* synthetic */ CashInMainDestination(int i, java.lang.String str, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str);
    }

    public final int getInitialTab() {
        return this.initialTab;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor(com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.MainScreen.IDENTIFIER, new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.PRODUCT, com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.MainScreen.FEATURE, "view"), kotlin.collections.SetsKt.setOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.NavigationContext(com.paypal.oslo.feature.merchantbanking.api.analytics.MerchantBankingAnalytics.AccountNumbersScreen.NAVIGATION_TYPE, null, this.source)));
    }

    public final java.lang.String toString() {
        int i = this.initialTab;
        java.lang.String str = this.source;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CashInMainDestination(initialTab=");
        sb.append(i);
        sb.append(", source=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.initialTab) * 31) + this.source.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination)) {
            return false;
        }
        com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination cashInMainDestination = (com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination) other;
        return this.initialTab == cashInMainDestination.initialTab && kotlin.jvm.internal.Intrinsics.areEqual(this.source, cashInMainDestination.source);
    }

    public final com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination copy(int initialTab, java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return new com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination(initialTab, source);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* renamed from: component1, reason: from getter */
    public final int getInitialTab() {
        return this.initialTab;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination copy$default(com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination cashInMainDestination, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = cashInMainDestination.initialTab;
        }
        if ((i2 & 2) != 0) {
            str = cashInMainDestination.source;
        }
        return cashInMainDestination.copy(i, str);
    }
}
