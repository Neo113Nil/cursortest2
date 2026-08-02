package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RequestOnboardingEmailConfirmationCodeInput;", "", "Lcom/apollographql/apollo/api/Optional;", "email", "<init>", "(Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/RequestOnboardingEmailConfirmationCodeInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RequestOnboardingEmailConfirmationCodeInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Object> email;

    public RequestOnboardingEmailConfirmationCodeInput(com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.email = optional;
    }

    public /* synthetic */ RequestOnboardingEmailConfirmationCodeInput(com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getEmail() {
        return this.email;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.email;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestOnboardingEmailConfirmationCodeInput(email=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.email.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.api.graphql.schema.type.RequestOnboardingEmailConfirmationCodeInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, ((com.paypal.oslo.api.graphql.schema.type.RequestOnboardingEmailConfirmationCodeInput) other).email);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RequestOnboardingEmailConfirmationCodeInput copy(com.apollographql.apollo.api.Optional<? extends java.lang.Object> email) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        return new com.paypal.oslo.api.graphql.schema.type.RequestOnboardingEmailConfirmationCodeInput(email);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component1() {
        return this.email;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RequestOnboardingEmailConfirmationCodeInput copy$default(com.paypal.oslo.api.graphql.schema.type.RequestOnboardingEmailConfirmationCodeInput requestOnboardingEmailConfirmationCodeInput, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = requestOnboardingEmailConfirmationCodeInput.email;
        }
        return requestOnboardingEmailConfirmationCodeInput.copy(optional);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RequestOnboardingEmailConfirmationCodeInput() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
