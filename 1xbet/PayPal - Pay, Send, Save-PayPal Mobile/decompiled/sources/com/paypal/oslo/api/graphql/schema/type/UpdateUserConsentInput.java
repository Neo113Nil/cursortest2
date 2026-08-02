package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ4\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0018\u0010\t"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdateUserConsentInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "hasAcceptedCashAccountTermsDisclosures", "hasAcceptedSavingsAccountTermsDisclosures", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/UpdateUserConsentInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getHasAcceptedCashAccountTermsDisclosures", "getHasAcceptedSavingsAccountTermsDisclosures"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdateUserConsentInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> hasAcceptedCashAccountTermsDisclosures;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> hasAcceptedSavingsAccountTermsDisclosures;

    public UpdateUserConsentInput(com.apollographql.apollo.api.Optional<java.lang.Boolean> optional, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.hasAcceptedCashAccountTermsDisclosures = optional;
        this.hasAcceptedSavingsAccountTermsDisclosures = optional2;
    }

    public /* synthetic */ UpdateUserConsentInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getHasAcceptedCashAccountTermsDisclosures() {
        return this.hasAcceptedCashAccountTermsDisclosures;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getHasAcceptedSavingsAccountTermsDisclosures() {
        return this.hasAcceptedSavingsAccountTermsDisclosures;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional = this.hasAcceptedCashAccountTermsDisclosures;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional2 = this.hasAcceptedSavingsAccountTermsDisclosures;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateUserConsentInput(hasAcceptedCashAccountTermsDisclosures=");
        sb.append(optional);
        sb.append(", hasAcceptedSavingsAccountTermsDisclosures=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.hasAcceptedCashAccountTermsDisclosures.hashCode() * 31) + this.hasAcceptedSavingsAccountTermsDisclosures.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdateUserConsentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdateUserConsentInput updateUserConsentInput = (com.paypal.oslo.api.graphql.schema.type.UpdateUserConsentInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.hasAcceptedCashAccountTermsDisclosures, updateUserConsentInput.hasAcceptedCashAccountTermsDisclosures) && kotlin.jvm.internal.Intrinsics.areEqual(this.hasAcceptedSavingsAccountTermsDisclosures, updateUserConsentInput.hasAcceptedSavingsAccountTermsDisclosures);
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdateUserConsentInput copy(com.apollographql.apollo.api.Optional<java.lang.Boolean> hasAcceptedCashAccountTermsDisclosures, com.apollographql.apollo.api.Optional<java.lang.Boolean> hasAcceptedSavingsAccountTermsDisclosures) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hasAcceptedCashAccountTermsDisclosures, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hasAcceptedSavingsAccountTermsDisclosures, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdateUserConsentInput(hasAcceptedCashAccountTermsDisclosures, hasAcceptedSavingsAccountTermsDisclosures);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component2() {
        return this.hasAcceptedSavingsAccountTermsDisclosures;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component1() {
        return this.hasAcceptedCashAccountTermsDisclosures;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdateUserConsentInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdateUserConsentInput updateUserConsentInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = updateUserConsentInput.hasAcceptedCashAccountTermsDisclosures;
        }
        if ((i & 2) != 0) {
            optional2 = updateUserConsentInput.hasAcceptedSavingsAccountTermsDisclosures;
        }
        return updateUserConsentInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateUserConsentInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
