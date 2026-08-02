package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditSupportedPaymentInstrumentTypesInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "creditProductIdentifier", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentType;", "paymentTypes", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;Ljava/util/List;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditSupportedPaymentInstrumentTypesInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "getCreditProductIdentifier", "Ljava/util/List;", "getPaymentTypes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RevolvingCreditSupportedPaymentInstrumentTypesInput {
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier;
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType> paymentTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public RevolvingCreditSupportedPaymentInstrumentTypesInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.creditProductIdentifier = revolvingCreditProductIdentifier;
        this.paymentTypes = list;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType> getPaymentTypes() {
        return this.paymentTypes;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier = this.creditProductIdentifier;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType> list = this.paymentTypes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditSupportedPaymentInstrumentTypesInput(creditProductIdentifier=");
        sb.append(revolvingCreditProductIdentifier);
        sb.append(", paymentTypes=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.creditProductIdentifier.hashCode() * 31) + this.paymentTypes.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RevolvingCreditSupportedPaymentInstrumentTypesInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditSupportedPaymentInstrumentTypesInput revolvingCreditSupportedPaymentInstrumentTypesInput = (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditSupportedPaymentInstrumentTypesInput) other;
        return this.creditProductIdentifier == revolvingCreditSupportedPaymentInstrumentTypesInput.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentTypes, revolvingCreditSupportedPaymentInstrumentTypesInput.paymentTypes);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditSupportedPaymentInstrumentTypesInput copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType> paymentTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTypes, "");
        return new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditSupportedPaymentInstrumentTypesInput(creditProductIdentifier, paymentTypes);
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType> component2() {
        return this.paymentTypes;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RevolvingCreditSupportedPaymentInstrumentTypesInput copy$default(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditSupportedPaymentInstrumentTypesInput revolvingCreditSupportedPaymentInstrumentTypesInput, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            revolvingCreditProductIdentifier = revolvingCreditSupportedPaymentInstrumentTypesInput.creditProductIdentifier;
        }
        if ((i & 2) != 0) {
            list = revolvingCreditSupportedPaymentInstrumentTypesInput.paymentTypes;
        }
        return revolvingCreditSupportedPaymentInstrumentTypesInput.copy(revolvingCreditProductIdentifier, list);
    }
}
