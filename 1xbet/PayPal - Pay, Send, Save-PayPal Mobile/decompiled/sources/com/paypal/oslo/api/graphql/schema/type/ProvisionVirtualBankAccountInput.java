package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ProvisionVirtualBankAccountInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountType;", "type", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountFlowIntent;", "flowIntent", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountType;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountType;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountType;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ProvisionVirtualBankAccountInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountType;", "getType", "Lcom/apollographql/apollo/api/Optional;", "getFlowIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProvisionVirtualBankAccountInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountFlowIntent> flowIntent;
    private final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType type;

    /* JADX WARN: Multi-variable type inference failed */
    public ProvisionVirtualBankAccountInput(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType virtualBankAccountType, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountFlowIntent> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualBankAccountType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.type = virtualBankAccountType;
        this.flowIntent = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType getType() {
        return this.type;
    }

    public /* synthetic */ ProvisionVirtualBankAccountInput(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType virtualBankAccountType, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(virtualBankAccountType, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountFlowIntent> getFlowIntent() {
        return this.flowIntent;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType virtualBankAccountType = this.type;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountFlowIntent> optional = this.flowIntent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionVirtualBankAccountInput(type=");
        sb.append(virtualBankAccountType);
        sb.append(", flowIntent=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.type.hashCode() * 31) + this.flowIntent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ProvisionVirtualBankAccountInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ProvisionVirtualBankAccountInput provisionVirtualBankAccountInput = (com.paypal.oslo.api.graphql.schema.type.ProvisionVirtualBankAccountInput) other;
        return this.type == provisionVirtualBankAccountInput.type && kotlin.jvm.internal.Intrinsics.areEqual(this.flowIntent, provisionVirtualBankAccountInput.flowIntent);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ProvisionVirtualBankAccountInput copy(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType type, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountFlowIntent> flowIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowIntent, "");
        return new com.paypal.oslo.api.graphql.schema.type.ProvisionVirtualBankAccountInput(type, flowIntent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountFlowIntent> component2() {
        return this.flowIntent;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ProvisionVirtualBankAccountInput copy$default(com.paypal.oslo.api.graphql.schema.type.ProvisionVirtualBankAccountInput provisionVirtualBankAccountInput, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType virtualBankAccountType, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            virtualBankAccountType = provisionVirtualBankAccountInput.type;
        }
        if ((i & 2) != 0) {
            optional = provisionVirtualBankAccountInput.flowIntent;
        }
        return provisionVirtualBankAccountInput.copy(virtualBankAccountType, optional);
    }
}
