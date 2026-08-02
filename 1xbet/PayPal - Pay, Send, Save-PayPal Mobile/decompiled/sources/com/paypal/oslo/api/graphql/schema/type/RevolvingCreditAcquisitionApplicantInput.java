package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ4\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionApplicantInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionPrimaryApplicantInput;", "primary", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionApplicantUnderwritingProfileInput;", "underwritingProfile", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditAcquisitionApplicantInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getPrimary", "getUnderwritingProfile"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RevolvingCreditAcquisitionApplicantInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionPrimaryApplicantInput> primary;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicantUnderwritingProfileInput> underwritingProfile;

    public RevolvingCreditAcquisitionApplicantInput(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionPrimaryApplicantInput> optional, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicantUnderwritingProfileInput> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.primary = optional;
        this.underwritingProfile = optional2;
    }

    public /* synthetic */ RevolvingCreditAcquisitionApplicantInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionPrimaryApplicantInput> getPrimary() {
        return this.primary;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicantUnderwritingProfileInput> getUnderwritingProfile() {
        return this.underwritingProfile;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionPrimaryApplicantInput> optional = this.primary;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicantUnderwritingProfileInput> optional2 = this.underwritingProfile;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditAcquisitionApplicantInput(primary=");
        sb.append(optional);
        sb.append(", underwritingProfile=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.primary.hashCode() * 31) + this.underwritingProfile.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicantInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicantInput revolvingCreditAcquisitionApplicantInput = (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicantInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.primary, revolvingCreditAcquisitionApplicantInput.primary) && kotlin.jvm.internal.Intrinsics.areEqual(this.underwritingProfile, revolvingCreditAcquisitionApplicantInput.underwritingProfile);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicantInput copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionPrimaryApplicantInput> primary, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicantUnderwritingProfileInput> underwritingProfile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primary, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(underwritingProfile, "");
        return new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicantInput(primary, underwritingProfile);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicantUnderwritingProfileInput> component2() {
        return this.underwritingProfile;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionPrimaryApplicantInput> component1() {
        return this.primary;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicantInput copy$default(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditAcquisitionApplicantInput revolvingCreditAcquisitionApplicantInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = revolvingCreditAcquisitionApplicantInput.primary;
        }
        if ((i & 2) != 0) {
            optional2 = revolvingCreditAcquisitionApplicantInput.underwritingProfile;
        }
        return revolvingCreditAcquisitionApplicantInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RevolvingCreditAcquisitionApplicantInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
