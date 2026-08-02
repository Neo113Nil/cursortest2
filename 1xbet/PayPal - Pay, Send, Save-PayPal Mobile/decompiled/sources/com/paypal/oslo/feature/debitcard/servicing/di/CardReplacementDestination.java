package com.paypal.oslo.feature.debitcard.servicing.di;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0002('B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/di/CardReplacementDestination;", "Lcom/paypal/oslo/feature/debitcard/servicing/di/ReportCardFlowDestination;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "replacementInfo", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/di/CardReplacementDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/servicing/di/CardReplacementDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "getReplacementInfo", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CardReplacementDestination implements com.paypal.oslo.feature.debitcard.servicing.di.ReportCardFlowDestination, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination.Companion(null);
    private final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo replacementInfo;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/di/CardReplacementDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/servicing/di/CardReplacementDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination> serializer() {
            return com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardReplacementDestination(int i, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.replacementInfo = cardReplacementInfo;
    }

    public CardReplacementDestination(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardReplacementInfo, "");
        this.replacementInfo = cardReplacementInfo;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo getReplacementInfo() {
        return this.replacementInfo;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor(com.paypal.oslo.feature.debitcard.shared.analytics.CardReplacementAnalytics.SCREEN_ID, com.paypal.oslo.feature.debitcard.shared.analytics.CardReplacementAnalytics.INSTANCE.getUserIntent(this.replacementInfo.getProductName()), null, 4, null);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo = this.replacementInfo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardReplacementDestination(replacementInfo=");
        sb.append(cardReplacementInfo);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.replacementInfo.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.replacementInfo, ((com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination) other).replacementInfo);
    }

    public final com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination copy(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo replacementInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacementInfo, "");
        return new com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination(replacementInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo getReplacementInfo() {
        return this.replacementInfo;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination copy$default(com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination cardReplacementDestination, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cardReplacementInfo = cardReplacementDestination.replacementInfo;
        }
        return cardReplacementDestination.copy(cardReplacementInfo);
    }
}
