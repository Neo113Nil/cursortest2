package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J<\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentConstraintsInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "creditProductIdentifier", "Lcom/apollographql/apollo/api/Optional;", "creditAccountId", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentConstraintsType;", "types", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;Lcom/apollographql/apollo/api/Optional;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;Lcom/apollographql/apollo/api/Optional;Ljava/util/List;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentConstraintsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "getCreditProductIdentifier", "Lcom/apollographql/apollo/api/Optional;", "getCreditAccountId", "Ljava/util/List;", "getTypes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RevolvingCreditPaymentConstraintsInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Object> creditAccountId;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier;
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentConstraintsType> types;

    /* JADX WARN: Multi-variable type inference failed */
    public RevolvingCreditPaymentConstraintsInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentConstraintsType> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.creditProductIdentifier = revolvingCreditProductIdentifier;
        this.creditAccountId = optional;
        this.types = list;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public /* synthetic */ RevolvingCreditPaymentConstraintsInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, com.apollographql.apollo.api.Optional.Absent absent, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(revolvingCreditProductIdentifier, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, list);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getCreditAccountId() {
        return this.creditAccountId;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentConstraintsType> getTypes() {
        return this.types;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier = this.creditProductIdentifier;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.creditAccountId;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentConstraintsType> list = this.types;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditPaymentConstraintsInput(creditProductIdentifier=");
        sb.append(revolvingCreditProductIdentifier);
        sb.append(", creditAccountId=");
        sb.append(optional);
        sb.append(", types=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.creditProductIdentifier.hashCode() * 31) + this.creditAccountId.hashCode()) * 31) + this.types.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentConstraintsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentConstraintsInput revolvingCreditPaymentConstraintsInput = (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentConstraintsInput) other;
        return this.creditProductIdentifier == revolvingCreditPaymentConstraintsInput.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, revolvingCreditPaymentConstraintsInput.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.types, revolvingCreditPaymentConstraintsInput.types);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentConstraintsInput copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier, com.apollographql.apollo.api.Optional<? extends java.lang.Object> creditAccountId, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentConstraintsType> types) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(types, "");
        return new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentConstraintsInput(creditProductIdentifier, creditAccountId, types);
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentConstraintsType> component3() {
        return this.types;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component2() {
        return this.creditAccountId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentConstraintsInput copy$default(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentConstraintsInput revolvingCreditPaymentConstraintsInput, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, com.apollographql.apollo.api.Optional optional, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            revolvingCreditProductIdentifier = revolvingCreditPaymentConstraintsInput.creditProductIdentifier;
        }
        if ((i & 2) != 0) {
            optional = revolvingCreditPaymentConstraintsInput.creditAccountId;
        }
        if ((i & 4) != 0) {
            list = revolvingCreditPaymentConstraintsInput.types;
        }
        return revolvingCreditPaymentConstraintsInput.copy(revolvingCreditProductIdentifier, optional, list);
    }
}
