package com.paypal.oslo.feature.businesscustomers.api.navigation;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/navigation/CreateCustomerDestination;", "Lcom/paypal/oslo/feature/businesscustomers/api/navigation/BusinessCustomersNavKey;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CreateCustomerInput;", "input", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CreateCustomerInput;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/businesscustomers/api/domain/model/CreateCustomerInput;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "component1", "()Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CreateCustomerInput;", "copy", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CreateCustomerInput;)Lcom/paypal/oslo/feature/businesscustomers/api/navigation/CreateCustomerDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_customers_api_prodRelease", "(Lcom/paypal/oslo/feature/businesscustomers/api/navigation/CreateCustomerDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/CreateCustomerInput;", "getInput", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CreateCustomerDestination implements com.paypal.oslo.feature.businesscustomers.api.navigation.BusinessCustomersNavKey {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination.Companion INSTANCE = new com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination.Companion(null);
    private final com.paypal.oslo.feature.businesscustomers.api.domain.model.CreateCustomerInput input;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/navigation/CreateCustomerDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesscustomers/api/navigation/CreateCustomerDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination> serializer() {
            return com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CreateCustomerDestination(int i, com.paypal.oslo.feature.businesscustomers.api.domain.model.CreateCustomerInput createCustomerInput, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.input = new com.paypal.oslo.feature.businesscustomers.api.domain.model.CreateCustomerInput((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 15, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            this.input = createCustomerInput;
        }
    }

    public CreateCustomerDestination(com.paypal.oslo.feature.businesscustomers.api.domain.model.CreateCustomerInput createCustomerInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCustomerInput, "");
        this.input = createCustomerInput;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$business_customers_api_prodRelease(com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !kotlin.jvm.internal.Intrinsics.areEqual(self.input, new com.paypal.oslo.feature.businesscustomers.api.domain.model.CreateCustomerInput((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 15, (kotlin.jvm.internal.DefaultConstructorMarker) null))) {
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.businesscustomers.api.domain.model.CreateCustomerInput$$serializer.INSTANCE, self.input);
        }
    }

    public /* synthetic */ CreateCustomerDestination(com.paypal.oslo.feature.businesscustomers.api.domain.model.CreateCustomerInput createCustomerInput, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.paypal.oslo.feature.businesscustomers.api.domain.model.CreateCustomerInput((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 15, (kotlin.jvm.internal.DefaultConstructorMarker) null) : createCustomerInput);
    }

    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.CreateCustomerInput getInput() {
        return this.input;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor("save_customer", new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.CUSTOMER_DIRECTORY, "save_customer", "add_customer"), kotlin.collections.SetsKt.setOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext("select_customer", null)));
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.businesscustomers.api.domain.model.CreateCustomerInput createCustomerInput = this.input;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateCustomerDestination(input=");
        sb.append(createCustomerInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.input.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.input, ((com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination) other).input);
    }

    public final com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination copy(com.paypal.oslo.feature.businesscustomers.api.domain.model.CreateCustomerInput input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination(input);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.businesscustomers.api.domain.model.CreateCustomerInput getInput() {
        return this.input;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination copy$default(com.paypal.oslo.feature.businesscustomers.api.navigation.CreateCustomerDestination createCustomerDestination, com.paypal.oslo.feature.businesscustomers.api.domain.model.CreateCustomerInput createCustomerInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            createCustomerInput = createCustomerDestination.input;
        }
        return createCustomerDestination.copy(createCustomerInput);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreateCustomerDestination() {
        this((com.paypal.oslo.feature.businesscustomers.api.domain.model.CreateCustomerInput) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
