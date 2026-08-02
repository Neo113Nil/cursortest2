package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RedeemablePointBalanceInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/PointsRedemptionType;", "redemptionType", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/RedeemablePointBalanceInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getRedemptionType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RedeemablePointBalanceInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PointsRedemptionType> redemptionType;

    /* JADX WARN: Multi-variable type inference failed */
    public RedeemablePointBalanceInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.PointsRedemptionType> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.redemptionType = optional;
    }

    public /* synthetic */ RedeemablePointBalanceInput(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PointsRedemptionType> getRedemptionType() {
        return this.redemptionType;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PointsRedemptionType> optional = this.redemptionType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RedeemablePointBalanceInput(redemptionType=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.redemptionType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.api.graphql.schema.type.RedeemablePointBalanceInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.redemptionType, ((com.paypal.oslo.api.graphql.schema.type.RedeemablePointBalanceInput) other).redemptionType);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RedeemablePointBalanceInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.PointsRedemptionType> redemptionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redemptionType, "");
        return new com.paypal.oslo.api.graphql.schema.type.RedeemablePointBalanceInput(redemptionType);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PointsRedemptionType> component1() {
        return this.redemptionType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RedeemablePointBalanceInput copy$default(com.paypal.oslo.api.graphql.schema.type.RedeemablePointBalanceInput redeemablePointBalanceInput, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = redeemablePointBalanceInput.redemptionType;
        }
        return redeemablePointBalanceInput.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RedeemablePointBalanceInput() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
