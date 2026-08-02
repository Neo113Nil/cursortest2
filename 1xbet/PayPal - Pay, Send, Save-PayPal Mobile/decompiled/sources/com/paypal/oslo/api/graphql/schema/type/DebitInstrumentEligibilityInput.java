package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001f\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/apollographql/apollo/api/Optional;", "", "bundle", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityContextInput;", "evaluationContext", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentEligibilityInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", "getProductName", "Lcom/apollographql/apollo/api/Optional;", "getBundle", "getEvaluationContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DebitInstrumentEligibilityInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> bundle;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityContextInput> evaluationContext;
    private final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName;

    public DebitInstrumentEligibilityInput(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityContextInput> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.productName = debitInstrumentProductName;
        this.bundle = optional;
        this.evaluationContext = optional2;
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
        return this.productName;
    }

    public /* synthetic */ DebitInstrumentEligibilityInput(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(debitInstrumentProductName, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getBundle() {
        return this.bundle;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityContextInput> getEvaluationContext() {
        return this.evaluationContext;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName = this.productName;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional = this.bundle;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityContextInput> optional2 = this.evaluationContext;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentEligibilityInput(productName=");
        sb.append(debitInstrumentProductName);
        sb.append(", bundle=");
        sb.append(optional);
        sb.append(", evaluationContext=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.productName.hashCode() * 31) + this.bundle.hashCode()) * 31) + this.evaluationContext.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput debitInstrumentEligibilityInput = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput) other;
        return this.productName == debitInstrumentEligibilityInput.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.bundle, debitInstrumentEligibilityInput.bundle) && kotlin.jvm.internal.Intrinsics.areEqual(this.evaluationContext, debitInstrumentEligibilityInput.evaluationContext);
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput copy(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName, com.apollographql.apollo.api.Optional<java.lang.Boolean> bundle, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityContextInput> evaluationContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluationContext, "");
        return new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput(productName, bundle, evaluationContext);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityContextInput> component3() {
        return this.evaluationContext;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component2() {
        return this.bundle;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName getProductName() {
        return this.productName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput copy$default(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentEligibilityInput debitInstrumentEligibilityInput, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName debitInstrumentProductName, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitInstrumentProductName = debitInstrumentEligibilityInput.productName;
        }
        if ((i & 2) != 0) {
            optional = debitInstrumentEligibilityInput.bundle;
        }
        if ((i & 4) != 0) {
            optional2 = debitInstrumentEligibilityInput.evaluationContext;
        }
        return debitInstrumentEligibilityInput.copy(debitInstrumentProductName, optional, optional2);
    }
}
