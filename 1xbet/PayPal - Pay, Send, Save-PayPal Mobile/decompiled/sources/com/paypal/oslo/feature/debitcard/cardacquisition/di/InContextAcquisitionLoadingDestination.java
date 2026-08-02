package com.paypal.oslo.feature.debitcard.cardacquisition.di;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/di/InContextAcquisitionLoadingDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "selectedFundingSourceId", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/di/InContextAcquisitionLoadingDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/di/InContextAcquisitionLoadingDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "Ljava/lang/String;", "getSelectedFundingSourceId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class InContextAcquisitionLoadingDestination implements androidx.navigation3.runtime.NavKey {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
    private final java.lang.String selectedFundingSourceId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.INSTANCE.serializer();
            return serializer;
        }
    }), null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/di/InContextAcquisitionLoadingDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/di/InContextAcquisitionLoadingDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination> serializer() {
            return com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InContextAcquisitionLoadingDestination(int i, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.productName = debitCardProductName;
        if ((i & 2) == 0) {
            this.selectedFundingSourceId = null;
        } else {
            this.selectedFundingSourceId = str;
        }
    }

    public InContextAcquisitionLoadingDestination(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        this.productName = debitCardProductName;
        this.selectedFundingSourceId = str;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$debit_card_prodRelease(com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.productName);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.selectedFundingSourceId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.selectedFundingSourceId);
        }
    }

    public /* synthetic */ InContextAcquisitionLoadingDestination(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(debitCardProductName, (i & 2) != 0 ? null : str);
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    public final java.lang.String getSelectedFundingSourceId() {
        return this.selectedFundingSourceId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
        java.lang.String str = this.selectedFundingSourceId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InContextAcquisitionLoadingDestination(productName=");
        sb.append(debitCardProductName);
        sb.append(", selectedFundingSourceId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.productName.hashCode();
        java.lang.String str = this.selectedFundingSourceId;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination inContextAcquisitionLoadingDestination = (com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination) other;
        return this.productName == inContextAcquisitionLoadingDestination.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingSourceId, inContextAcquisitionLoadingDestination.selectedFundingSourceId);
    }

    public final com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String selectedFundingSourceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination(productName, selectedFundingSourceId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSelectedFundingSourceId() {
        return this.selectedFundingSourceId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.di.InContextAcquisitionLoadingDestination inContextAcquisitionLoadingDestination, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitCardProductName = inContextAcquisitionLoadingDestination.productName;
        }
        if ((i & 2) != 0) {
            str = inContextAcquisitionLoadingDestination.selectedFundingSourceId;
        }
        return inContextAcquisitionLoadingDestination.copy(debitCardProductName, str);
    }
}
