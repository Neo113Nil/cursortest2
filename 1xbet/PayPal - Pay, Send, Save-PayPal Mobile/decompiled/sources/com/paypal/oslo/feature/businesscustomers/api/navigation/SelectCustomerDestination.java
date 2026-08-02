package com.paypal.oslo.feature.businesscustomers.api.navigation;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/navigation/SelectCustomerDestination;", "Lcom/paypal/oslo/feature/businesscustomers/api/navigation/BusinessCustomersNavKey;", "", "requireEmail", "<init>", "(Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "toAnalyticsScreenDescriptor", "()Lcom/paypal/oslo/core/telemetry/compose/api/ScreenAnalyticsDescriptor;", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/businesscustomers/api/navigation/SelectCustomerDestination;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$business_customers_api_prodRelease", "(Lcom/paypal/oslo/feature/businesscustomers/api/navigation/SelectCustomerDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "getRequireEmail", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class SelectCustomerDestination implements com.paypal.oslo.feature.businesscustomers.api.navigation.BusinessCustomersNavKey {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination.Companion INSTANCE = new com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination.Companion(null);
    private final boolean requireEmail;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/api/navigation/SelectCustomerDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/businesscustomers/api/navigation/SelectCustomerDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination> serializer() {
            return com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SelectCustomerDestination(int i, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.requireEmail = true;
        } else {
            this.requireEmail = z;
        }
    }

    public SelectCustomerDestination(boolean z) {
        this.requireEmail = z;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$business_customers_api_prodRelease(com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !self.requireEmail) {
            output.encodeBooleanElement(serialDesc, 0, self.requireEmail);
        }
    }

    public /* synthetic */ SelectCustomerDestination(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public final boolean getRequireEmail() {
        return this.requireEmail;
    }

    @Override // com.paypal.oslo.core.telemetry.compose.api.DestinationAnalyticsContextProvider
    public final com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor toAnalyticsScreenDescriptor() {
        return new com.paypal.oslo.core.telemetry.compose.api.ScreenAnalyticsDescriptor("customers_list", new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.CUSTOMER_DIRECTORY, "customers_list", "view_customers_list"), kotlin.collections.SetsKt.setOf(new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext("select_customer", null)));
    }

    public final java.lang.String toString() {
        boolean z = this.requireEmail;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectCustomerDestination(requireEmail=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.requireEmail);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination) && this.requireEmail == ((com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination) other).requireEmail;
    }

    public final com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination copy(boolean requireEmail) {
        return new com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination(requireEmail);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getRequireEmail() {
        return this.requireEmail;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination copy$default(com.paypal.oslo.feature.businesscustomers.api.navigation.SelectCustomerDestination selectCustomerDestination, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = selectCustomerDestination.requireEmail;
        }
        return selectCustomerDestination.copy(z);
    }

    public SelectCustomerDestination() {
        this(false, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
