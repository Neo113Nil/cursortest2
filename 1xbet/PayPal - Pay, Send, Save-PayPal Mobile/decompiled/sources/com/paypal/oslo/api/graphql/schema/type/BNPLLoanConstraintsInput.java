package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BNPLLoanConstraintsInput;", "", "applicationSessionId", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "creditProductIdentifiers", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/Object;Ljava/util/List;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLLoanConstraintsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getApplicationSessionId", "Ljava/util/List;", "getCreditProductIdentifiers"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BNPLLoanConstraintsInput {
    private final java.lang.Object applicationSessionId;
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> creditProductIdentifiers;

    /* JADX WARN: Multi-variable type inference failed */
    public BNPLLoanConstraintsInput(java.lang.Object obj, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.applicationSessionId = obj;
        this.creditProductIdentifiers = list;
    }

    public final java.lang.Object getApplicationSessionId() {
        return this.applicationSessionId;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> getCreditProductIdentifiers() {
        return this.creditProductIdentifiers;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.applicationSessionId;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> list = this.creditProductIdentifiers;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BNPLLoanConstraintsInput(applicationSessionId=");
        sb.append(obj);
        sb.append(", creditProductIdentifiers=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.applicationSessionId.hashCode() * 31) + this.creditProductIdentifiers.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BNPLLoanConstraintsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BNPLLoanConstraintsInput bNPLLoanConstraintsInput = (com.paypal.oslo.api.graphql.schema.type.BNPLLoanConstraintsInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.applicationSessionId, bNPLLoanConstraintsInput.applicationSessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditProductIdentifiers, bNPLLoanConstraintsInput.creditProductIdentifiers);
    }

    public final com.paypal.oslo.api.graphql.schema.type.BNPLLoanConstraintsInput copy(java.lang.Object applicationSessionId, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> creditProductIdentifiers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationSessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifiers, "");
        return new com.paypal.oslo.api.graphql.schema.type.BNPLLoanConstraintsInput(applicationSessionId, creditProductIdentifiers);
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier> component2() {
        return this.creditProductIdentifiers;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getApplicationSessionId() {
        return this.applicationSessionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BNPLLoanConstraintsInput copy$default(com.paypal.oslo.api.graphql.schema.type.BNPLLoanConstraintsInput bNPLLoanConstraintsInput, java.lang.Object obj, java.util.List list, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = bNPLLoanConstraintsInput.applicationSessionId;
        }
        if ((i & 2) != 0) {
            list = bNPLLoanConstraintsInput.creditProductIdentifiers;
        }
        return bNPLLoanConstraintsInput.copy(obj, list);
    }
}
