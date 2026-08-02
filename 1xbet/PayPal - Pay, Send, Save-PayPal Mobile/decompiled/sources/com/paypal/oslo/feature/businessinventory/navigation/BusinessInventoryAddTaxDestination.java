package com.paypal.oslo.feature.businessinventory.navigation;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0002\u001b\u001aB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/navigation/BusinessInventoryAddTaxDestination;", "Lcom/paypal/oslo/feature/businessinventory/api/navigation/BusinessInventoryTaxNavKey;", "Lcom/paypal/oslo/core/telemetry/compose/api/DestinationAnalyticsContextProvider;", "Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;", "presentationMode", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_inventory_prodRelease", "(Lcom/paypal/oslo/feature/businessinventory/navigation/BusinessInventoryAddTaxDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;", "getPresentationMode", "()Lcom/paypal/oslo/feature/businessinventory/navigation/TaxesPresentationMode;", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class BusinessInventoryAddTaxDestination implements com.paypal.oslo.feature.businessinventory.api.navigation.BusinessInventoryTaxNavKey, com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider {
    private final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode presentationMode;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination.Companion INSTANCE = new com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/navigation/BusinessInventoryAddTaxDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businessinventory/navigation/BusinessInventoryAddTaxDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination> serializer() {
            return com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BusinessInventoryAddTaxDestination(int i, com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode taxesPresentationMode, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.businessinventory.navigation.BusinessInventoryAddTaxDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.presentationMode = taxesPresentationMode;
    }

    public BusinessInventoryAddTaxDestination(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode taxesPresentationMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxesPresentationMode, "");
        this.presentationMode = taxesPresentationMode;
    }

    public final com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode getPresentationMode() {
        return this.presentationMode;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor("save_tax", new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.BUSINESS_INVENTORY, "tax_list", "add_tax"), kotlin.collections.SetsKt.setOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(com.paypal.oslo.feature.businessinventory.navigation.InternalDestinationsKt.toBusinessFlow(this.presentationMode), null)));
    }
}
