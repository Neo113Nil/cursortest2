package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJF\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR(\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/DeletePasskeyInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/AuthenticationFlowVariant;", "flowVariant", "", "credentialId", "passkeyId", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/DeletePasskeyInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getFlowVariant", "getCredentialId", "getPasskeyId", "getPasskeyId$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeletePasskeyInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> credentialId;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant> flowVariant;
    private final com.apollographql.apollo.api.Optional<java.lang.String> passkeyId;

    @kotlin.Deprecated(message = "Use `credentialId` instead to match the field name from the passkeys query.")
    public static /* synthetic */ void getPasskeyId$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeletePasskeyInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2, com.apollographql.apollo.api.Optional<java.lang.String> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.flowVariant = optional;
        this.credentialId = optional2;
        this.passkeyId = optional3;
    }

    public /* synthetic */ DeletePasskeyInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant> getFlowVariant() {
        return this.flowVariant;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getCredentialId() {
        return this.credentialId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getPasskeyId() {
        return this.passkeyId;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant> optional = this.flowVariant;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.credentialId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional3 = this.passkeyId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeletePasskeyInput(flowVariant=");
        sb.append(optional);
        sb.append(", credentialId=");
        sb.append(optional2);
        sb.append(", passkeyId=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.flowVariant.hashCode() * 31) + this.credentialId.hashCode()) * 31) + this.passkeyId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.DeletePasskeyInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.DeletePasskeyInput deletePasskeyInput = (com.paypal.oslo.api.graphql.schema.type.DeletePasskeyInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.flowVariant, deletePasskeyInput.flowVariant) && kotlin.jvm.internal.Intrinsics.areEqual(this.credentialId, deletePasskeyInput.credentialId) && kotlin.jvm.internal.Intrinsics.areEqual(this.passkeyId, deletePasskeyInput.passkeyId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.DeletePasskeyInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant> flowVariant, com.apollographql.apollo.api.Optional<java.lang.String> credentialId, com.apollographql.apollo.api.Optional<java.lang.String> passkeyId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowVariant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyId, "");
        return new com.paypal.oslo.api.graphql.schema.type.DeletePasskeyInput(flowVariant, credentialId, passkeyId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.passkeyId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.credentialId;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.AuthenticationFlowVariant> component1() {
        return this.flowVariant;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DeletePasskeyInput copy$default(com.paypal.oslo.api.graphql.schema.type.DeletePasskeyInput deletePasskeyInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = deletePasskeyInput.flowVariant;
        }
        if ((i & 2) != 0) {
            optional2 = deletePasskeyInput.credentialId;
        }
        if ((i & 4) != 0) {
            optional3 = deletePasskeyInput.passkeyId;
        }
        return deletePasskeyInput.copy(optional, optional2, optional3);
    }

    public DeletePasskeyInput() {
        this(null, null, null, 7, null);
    }
}
