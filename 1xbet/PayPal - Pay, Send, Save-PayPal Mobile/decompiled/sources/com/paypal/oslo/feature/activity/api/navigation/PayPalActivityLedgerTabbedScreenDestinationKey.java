package com.paypal.oslo.feature.activity.api.navigation;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0018J'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityLedgerTabbedScreenDestinationKey;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "", "startDate", "endDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityLedgerTabbedScreenDestinationKey;", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$activity_api_prodRelease", "(Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityLedgerTabbedScreenDestinationKey;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getStartDate", "getEndDate", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PayPalActivityLedgerTabbedScreenDestinationKey implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey.Companion INSTANCE = new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey.Companion(null);
    private final java.lang.String endDate;
    private final java.lang.String startDate;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityLedgerTabbedScreenDestinationKey$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityLedgerTabbedScreenDestinationKey;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey> serializer() {
            return com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PayPalActivityLedgerTabbedScreenDestinationKey(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.startDate = null;
        } else {
            this.startDate = str;
        }
        if ((i & 2) == 0) {
            this.endDate = null;
        } else {
            this.endDate = str2;
        }
    }

    public PayPalActivityLedgerTabbedScreenDestinationKey(java.lang.String str, java.lang.String str2) {
        this.startDate = str;
        this.endDate = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$activity_api_prodRelease(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.startDate != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.startDate);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.endDate != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.endDate);
        }
    }

    public /* synthetic */ PayPalActivityLedgerTabbedScreenDestinationKey(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    public final java.lang.String getEndDate() {
        return this.endDate;
    }

    public final boolean equals(java.lang.Object other) {
        return other instanceof com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey;
    }

    public final int hashCode() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(getClass()).hashCode();
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor(com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.Analytics.SCREEN_LEDGER, new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext("activity", com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.Analytics.FEATURE_LEDGER, "view"), null, 4, null);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.startDate;
        java.lang.String str2 = this.endDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayPalActivityLedgerTabbedScreenDestinationKey(startDate=");
        sb.append(str);
        sb.append(", endDate=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey copy(java.lang.String startDate, java.lang.String endDate) {
        return new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey(startDate, endDate);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEndDate() {
        return this.endDate;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey copy$default(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityLedgerTabbedScreenDestinationKey payPalActivityLedgerTabbedScreenDestinationKey, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = payPalActivityLedgerTabbedScreenDestinationKey.startDate;
        }
        if ((i & 2) != 0) {
            str2 = payPalActivityLedgerTabbedScreenDestinationKey.endDate;
        }
        return payPalActivityLedgerTabbedScreenDestinationKey.copy(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PayPalActivityLedgerTabbedScreenDestinationKey() {
        this((java.lang.String) null, (java.lang.String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
