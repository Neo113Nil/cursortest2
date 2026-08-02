package com.paypal.oslo.feature.debitcard.cardacquisition.di;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0002('B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/di/DebitCardAcquisitionIntroDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/di/DebitCardAcquisitionIntroDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/di/DebitCardAcquisitionIntroDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class DebitCardAcquisitionIntroDestination implements androidx.navigation3.runtime.NavKey, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/di/DebitCardAcquisitionIntroDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/di/DebitCardAcquisitionIntroDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination> serializer() {
            return com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DebitCardAcquisitionIntroDestination(int i, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.productName = debitCardProductName;
    }

    public DebitCardAcquisitionIntroDestination(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        this.productName = debitCardProductName;
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor(com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAcquisitionIntroAnalytics.SCREEN_ID, com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardAcquisitionIntroAnalytics.INSTANCE.getUserIntent(this.productName), null, 4, null);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitCardAcquisitionIntroDestination(productName=");
        sb.append(debitCardProductName);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.productName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination) && this.productName == ((com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination) other).productName;
    }

    public final com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination(productName);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination debitCardAcquisitionIntroDestination, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitCardProductName = debitCardAcquisitionIntroDestination.productName;
        }
        return debitCardAcquisitionIntroDestination.copy(debitCardProductName);
    }
}
