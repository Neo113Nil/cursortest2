package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ProvisioningFlowContextInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletProvisioningProductFlow;", "productFlow", "Lcom/apollographql/apollo/api/Optional;", "", "sourceId", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletProvisioningProductFlow;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletProvisioningProductFlow;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletProvisioningProductFlow;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ProvisioningFlowContextInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DeviceWalletProvisioningProductFlow;", "getProductFlow", "Lcom/apollographql/apollo/api/Optional;", "getSourceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProvisioningFlowContextInput {
    private final com.paypal.oslo.api.graphql.schema.type.DeviceWalletProvisioningProductFlow productFlow;
    private final com.apollographql.apollo.api.Optional<java.lang.String> sourceId;

    public ProvisioningFlowContextInput(com.paypal.oslo.api.graphql.schema.type.DeviceWalletProvisioningProductFlow deviceWalletProvisioningProductFlow, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceWalletProvisioningProductFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.productFlow = deviceWalletProvisioningProductFlow;
        this.sourceId = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DeviceWalletProvisioningProductFlow getProductFlow() {
        return this.productFlow;
    }

    public /* synthetic */ ProvisioningFlowContextInput(com.paypal.oslo.api.graphql.schema.type.DeviceWalletProvisioningProductFlow deviceWalletProvisioningProductFlow, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceWalletProvisioningProductFlow, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getSourceId() {
        return this.sourceId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DeviceWalletProvisioningProductFlow deviceWalletProvisioningProductFlow = this.productFlow;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.sourceId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisioningFlowContextInput(productFlow=");
        sb.append(deviceWalletProvisioningProductFlow);
        sb.append(", sourceId=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.productFlow.hashCode() * 31) + this.sourceId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ProvisioningFlowContextInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ProvisioningFlowContextInput provisioningFlowContextInput = (com.paypal.oslo.api.graphql.schema.type.ProvisioningFlowContextInput) other;
        return this.productFlow == provisioningFlowContextInput.productFlow && kotlin.jvm.internal.Intrinsics.areEqual(this.sourceId, provisioningFlowContextInput.sourceId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ProvisioningFlowContextInput copy(com.paypal.oslo.api.graphql.schema.type.DeviceWalletProvisioningProductFlow productFlow, com.apollographql.apollo.api.Optional<java.lang.String> sourceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceId, "");
        return new com.paypal.oslo.api.graphql.schema.type.ProvisioningFlowContextInput(productFlow, sourceId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.sourceId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DeviceWalletProvisioningProductFlow getProductFlow() {
        return this.productFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ProvisioningFlowContextInput copy$default(com.paypal.oslo.api.graphql.schema.type.ProvisioningFlowContextInput provisioningFlowContextInput, com.paypal.oslo.api.graphql.schema.type.DeviceWalletProvisioningProductFlow deviceWalletProvisioningProductFlow, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            deviceWalletProvisioningProductFlow = provisioningFlowContextInput.productFlow;
        }
        if ((i & 2) != 0) {
            optional = provisioningFlowContextInput.sourceId;
        }
        return provisioningFlowContextInput.copy(deviceWalletProvisioningProductFlow, optional);
    }
}
