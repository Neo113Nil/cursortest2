package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountEligibilityInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountType;", "type", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountType;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountType;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountType;)Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountEligibilityInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/VirtualBankAccountType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VirtualBankAccountEligibilityInput {
    private final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType type;

    public VirtualBankAccountEligibilityInput(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType virtualBankAccountType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(virtualBankAccountType, "");
        this.type = virtualBankAccountType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType virtualBankAccountType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VirtualBankAccountEligibilityInput(type=");
        sb.append(virtualBankAccountType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityInput) && this.type == ((com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityInput) other).type;
    }

    public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityInput copy(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityInput(type);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityInput copy$default(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityInput virtualBankAccountEligibilityInput, com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType virtualBankAccountType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            virtualBankAccountType = virtualBankAccountEligibilityInput.type;
        }
        return virtualBankAccountEligibilityInput.copy(virtualBankAccountType);
    }
}
