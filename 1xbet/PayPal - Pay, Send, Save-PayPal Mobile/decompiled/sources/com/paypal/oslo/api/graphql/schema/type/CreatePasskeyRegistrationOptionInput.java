package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CreatePasskeyRegistrationOptionInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "publicCredential", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationFlowVariant;", "flowVariant", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationFlowVariant;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationFlowVariant;", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationFlowVariant;)Lcom/paypal/oslo/api/graphql/schema/type/CreatePasskeyRegistrationOptionInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getPublicCredential", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationFlowVariant;", "getFlowVariant"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreatePasskeyRegistrationOptionInput {
    private final com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant flowVariant;
    private final com.apollographql.apollo.api.Optional<java.lang.String> publicCredential;

    public CreatePasskeyRegistrationOptionInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant authenticationFlowVariant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationFlowVariant, "");
        this.publicCredential = optional;
        this.flowVariant = authenticationFlowVariant;
    }

    public /* synthetic */ CreatePasskeyRegistrationOptionInput(com.apollographql.apollo.api.Optional.Absent absent, com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant authenticationFlowVariant, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, authenticationFlowVariant);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getPublicCredential() {
        return this.publicCredential;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant getFlowVariant() {
        return this.flowVariant;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.publicCredential;
        com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant authenticationFlowVariant = this.flowVariant;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreatePasskeyRegistrationOptionInput(publicCredential=");
        sb.append(optional);
        sb.append(", flowVariant=");
        sb.append(authenticationFlowVariant);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.publicCredential.hashCode() * 31) + this.flowVariant.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionInput createPasskeyRegistrationOptionInput = (com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, createPasskeyRegistrationOptionInput.publicCredential) && this.flowVariant == createPasskeyRegistrationOptionInput.flowVariant;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionInput copy(com.apollographql.apollo.api.Optional<java.lang.String> publicCredential, com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant flowVariant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowVariant, "");
        return new com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionInput(publicCredential, flowVariant);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant getFlowVariant() {
        return this.flowVariant;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.publicCredential;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionInput copy$default(com.paypal.oslo.api.graphql.schema.type.CreatePasskeyRegistrationOptionInput createPasskeyRegistrationOptionInput, com.apollographql.apollo.api.Optional optional, com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant authenticationFlowVariant, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = createPasskeyRegistrationOptionInput.publicCredential;
        }
        if ((i & 2) != 0) {
            authenticationFlowVariant = createPasskeyRegistrationOptionInput.flowVariant;
        }
        return createPasskeyRegistrationOptionInput.copy(optional, authenticationFlowVariant);
    }
}
