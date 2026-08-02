package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RolloverCryptocurrencyClaimIdentityInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RolloverCryptocurrencyClaimIdentityType;", "identityType", "Lcom/apollographql/apollo/api/Optional;", "dateOfBirth", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RolloverCryptocurrencyClaimIdentityType;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RolloverCryptocurrencyClaimIdentityType;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RolloverCryptocurrencyClaimIdentityType;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/RolloverCryptocurrencyClaimIdentityInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RolloverCryptocurrencyClaimIdentityType;", "getIdentityType", "Lcom/apollographql/apollo/api/Optional;", "getDateOfBirth"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RolloverCryptocurrencyClaimIdentityInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Object> dateOfBirth;
    private final com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimIdentityType identityType;

    public RolloverCryptocurrencyClaimIdentityInput(com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimIdentityType rolloverCryptocurrencyClaimIdentityType, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rolloverCryptocurrencyClaimIdentityType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.identityType = rolloverCryptocurrencyClaimIdentityType;
        this.dateOfBirth = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimIdentityType getIdentityType() {
        return this.identityType;
    }

    public /* synthetic */ RolloverCryptocurrencyClaimIdentityInput(com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimIdentityType rolloverCryptocurrencyClaimIdentityType, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(rolloverCryptocurrencyClaimIdentityType, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimIdentityType rolloverCryptocurrencyClaimIdentityType = this.identityType;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.dateOfBirth;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RolloverCryptocurrencyClaimIdentityInput(identityType=");
        sb.append(rolloverCryptocurrencyClaimIdentityType);
        sb.append(", dateOfBirth=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.identityType.hashCode() * 31) + this.dateOfBirth.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimIdentityInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimIdentityInput rolloverCryptocurrencyClaimIdentityInput = (com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimIdentityInput) other;
        return this.identityType == rolloverCryptocurrencyClaimIdentityInput.identityType && kotlin.jvm.internal.Intrinsics.areEqual(this.dateOfBirth, rolloverCryptocurrencyClaimIdentityInput.dateOfBirth);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimIdentityInput copy(com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimIdentityType identityType, com.apollographql.apollo.api.Optional<? extends java.lang.Object> dateOfBirth) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfBirth, "");
        return new com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimIdentityInput(identityType, dateOfBirth);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component2() {
        return this.dateOfBirth;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimIdentityType getIdentityType() {
        return this.identityType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimIdentityInput copy$default(com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimIdentityInput rolloverCryptocurrencyClaimIdentityInput, com.paypal.oslo.api.graphql.schema.type.RolloverCryptocurrencyClaimIdentityType rolloverCryptocurrencyClaimIdentityType, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            rolloverCryptocurrencyClaimIdentityType = rolloverCryptocurrencyClaimIdentityInput.identityType;
        }
        if ((i & 2) != 0) {
            optional = rolloverCryptocurrencyClaimIdentityInput.dateOfBirth;
        }
        return rolloverCryptocurrencyClaimIdentityInput.copy(rolloverCryptocurrencyClaimIdentityType, optional);
    }
}
