package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentApplicationsInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentApplicationsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getProductName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DebitInstrumentApplicationsInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName> productName;

    /* JADX WARN: Multi-variable type inference failed */
    public DebitInstrumentApplicationsInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.productName = optional;
    }

    public /* synthetic */ DebitInstrumentApplicationsInput(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName> getProductName() {
        return this.productName;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName> optional = this.productName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentApplicationsInput(productName=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.productName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationsInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.productName, ((com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationsInput) other).productName);
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationsInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName> productName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        return new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationsInput(productName);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName> component1() {
        return this.productName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationsInput copy$default(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentApplicationsInput debitInstrumentApplicationsInput, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = debitInstrumentApplicationsInput.productName;
        }
        return debitInstrumentApplicationsInput.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DebitInstrumentApplicationsInput() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
