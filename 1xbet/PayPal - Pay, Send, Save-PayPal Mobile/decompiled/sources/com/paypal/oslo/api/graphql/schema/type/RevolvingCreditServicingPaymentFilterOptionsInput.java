package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0002¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ@\u0010\r\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R%\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR(\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingPaymentFilterOptionsInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentStatus;", "statuses", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPaymentType;", "types", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditServicingPaymentFilterOptionsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getStatuses", "getTypes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RevolvingCreditServicingPaymentFilterOptionsInput {
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentStatus>> statuses;
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType>> types;

    /* JADX WARN: Multi-variable type inference failed */
    public RevolvingCreditServicingPaymentFilterOptionsInput(com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentStatus>> optional, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType>> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.statuses = optional;
        this.types = optional2;
    }

    public /* synthetic */ RevolvingCreditServicingPaymentFilterOptionsInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentStatus>> getStatuses() {
        return this.statuses;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType>> getTypes() {
        return this.types;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentStatus>> optional = this.statuses;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType>> optional2 = this.types;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditServicingPaymentFilterOptionsInput(statuses=");
        sb.append(optional);
        sb.append(", types=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.statuses.hashCode() * 31) + this.types.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentFilterOptionsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentFilterOptionsInput revolvingCreditServicingPaymentFilterOptionsInput = (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentFilterOptionsInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.statuses, revolvingCreditServicingPaymentFilterOptionsInput.statuses) && kotlin.jvm.internal.Intrinsics.areEqual(this.types, revolvingCreditServicingPaymentFilterOptionsInput.types);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentFilterOptionsInput copy(com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentStatus>> statuses, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType>> types) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statuses, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(types, "");
        return new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentFilterOptionsInput(statuses, types);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentType>> component2() {
        return this.types;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPaymentStatus>> component1() {
        return this.statuses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentFilterOptionsInput copy$default(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditServicingPaymentFilterOptionsInput revolvingCreditServicingPaymentFilterOptionsInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = revolvingCreditServicingPaymentFilterOptionsInput.statuses;
        }
        if ((i & 2) != 0) {
            optional2 = revolvingCreditServicingPaymentFilterOptionsInput.types;
        }
        return revolvingCreditServicingPaymentFilterOptionsInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RevolvingCreditServicingPaymentFilterOptionsInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
