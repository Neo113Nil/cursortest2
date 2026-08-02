package com.paypal.oslo.feature.debitcard.servicing.di;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0002,+B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB/\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012J'\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/di/CancelCardConfirmationDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "", "reason", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;", "cancelCardInfo", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/di/CancelCardConfirmationDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/servicing/di/CancelCardConfirmationDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getReason", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;", "getCancelCardInfo", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CancelCardConfirmationDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination.Companion(null);
    private final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo;
    private final java.lang.String reason;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/di/CancelCardConfirmationDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/servicing/di/CancelCardConfirmationDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination> serializer() {
            return com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CancelCardConfirmationDestination(int i, java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.reason = str;
        this.cancelCardInfo = cancelCardInfo;
    }

    public CancelCardConfirmationDestination(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardInfo, "");
        this.reason = str;
        this.cancelCardInfo = cancelCardInfo;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$debit_card_prodRelease(com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.reason);
        output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo$$serializer.INSTANCE, self.cancelCardInfo);
    }

    public final java.lang.String getReason() {
        return this.reason;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo getCancelCardInfo() {
        return this.cancelCardInfo;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor(com.paypal.oslo.feature.debitcard.shared.analytics.CancelCardConfirmationAnalytics.SCREEN_ID, com.paypal.oslo.feature.debitcard.shared.analytics.CancelCardConfirmationAnalytics.INSTANCE.getUserIntent(this.cancelCardInfo.getProductName()), null, 4, null);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.reason;
        com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo = this.cancelCardInfo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelCardConfirmationDestination(reason=");
        sb.append(str);
        sb.append(", cancelCardInfo=");
        sb.append(cancelCardInfo);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.reason.hashCode() * 31) + this.cancelCardInfo.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination cancelCardConfirmationDestination = (com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.reason, cancelCardConfirmationDestination.reason) && kotlin.jvm.internal.Intrinsics.areEqual(this.cancelCardInfo, cancelCardConfirmationDestination.cancelCardInfo);
    }

    public final com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination copy(java.lang.String reason, com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardInfo, "");
        return new com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination(reason, cancelCardInfo);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo getCancelCardInfo() {
        return this.cancelCardInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getReason() {
        return this.reason;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination copy$default(com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination cancelCardConfirmationDestination, java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cancelCardConfirmationDestination.reason;
        }
        if ((i & 2) != 0) {
            cancelCardInfo = cancelCardConfirmationDestination.cancelCardInfo;
        }
        return cancelCardConfirmationDestination.copy(str, cancelCardInfo);
    }
}
