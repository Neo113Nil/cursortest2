package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardTermsInput;", "", "", "accepted", "Lcom/apollographql/apollo/api/Optional;", "", "submitId", "<init>", "(ZLcom/apollographql/apollo/api/Optional;)V", "component1", "()Z", "component2", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(ZLcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardTermsInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Z", "getAccepted", "Lcom/apollographql/apollo/api/Optional;", "getSubmitId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OnboardTermsInput {
    private final boolean accepted;
    private final com.apollographql.apollo.api.Optional<java.lang.String> submitId;

    public OnboardTermsInput(boolean z, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.accepted = z;
        this.submitId = optional;
    }

    public final boolean getAccepted() {
        return this.accepted;
    }

    public /* synthetic */ OnboardTermsInput(boolean z, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getSubmitId() {
        return this.submitId;
    }

    public final java.lang.String toString() {
        boolean z = this.accepted;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.submitId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardTermsInput(accepted=");
        sb.append(z);
        sb.append(", submitId=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.accepted) * 31) + this.submitId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.OnboardTermsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.OnboardTermsInput onboardTermsInput = (com.paypal.oslo.api.graphql.schema.type.OnboardTermsInput) other;
        return this.accepted == onboardTermsInput.accepted && kotlin.jvm.internal.Intrinsics.areEqual(this.submitId, onboardTermsInput.submitId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardTermsInput copy(boolean accepted, com.apollographql.apollo.api.Optional<java.lang.String> submitId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitId, "");
        return new com.paypal.oslo.api.graphql.schema.type.OnboardTermsInput(accepted, submitId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.submitId;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAccepted() {
        return this.accepted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.OnboardTermsInput copy$default(com.paypal.oslo.api.graphql.schema.type.OnboardTermsInput onboardTermsInput, boolean z, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = onboardTermsInput.accepted;
        }
        if ((i & 2) != 0) {
            optional = onboardTermsInput.submitId;
        }
        return onboardTermsInput.copy(z, optional);
    }
}
