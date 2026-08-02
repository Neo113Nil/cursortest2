package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ4\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentAddressesInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "instrumentId", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentAddressesInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getProductName", "getInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DebitInstrumentAddressesInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> instrumentId;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName> productName;

    /* JADX WARN: Multi-variable type inference failed */
    public DebitInstrumentAddressesInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.productName = optional;
        this.instrumentId = optional2;
    }

    public /* synthetic */ DebitInstrumentAddressesInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName> getProductName() {
        return this.productName;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getInstrumentId() {
        return this.instrumentId;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName> optional = this.productName;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.instrumentId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitInstrumentAddressesInput(productName=");
        sb.append(optional);
        sb.append(", instrumentId=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.productName.hashCode() * 31) + this.instrumentId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput debitInstrumentAddressesInput = (com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.productName, debitInstrumentAddressesInput.productName) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, debitInstrumentAddressesInput.instrumentId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName> productName, com.apollographql.apollo.api.Optional<java.lang.String> instrumentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        return new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput(productName, instrumentId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.instrumentId;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName> component1() {
        return this.productName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput copy$default(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput debitInstrumentAddressesInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = debitInstrumentAddressesInput.productName;
        }
        if ((i & 2) != 0) {
            optional2 = debitInstrumentAddressesInput.instrumentId;
        }
        return debitInstrumentAddressesInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DebitInstrumentAddressesInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
