package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ>\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CompleteThreeDSecureConfirmationInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "transactionId", "externalReferenceId", "confirmationId", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CompleteThreeDSecureConfirmationInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/apollographql/apollo/api/Optional;", "getTransactionId", "getExternalReferenceId", "Ljava/lang/String;", "getConfirmationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CompleteThreeDSecureConfirmationInput {
    private final java.lang.String confirmationId;
    private final com.apollographql.apollo.api.Optional<java.lang.String> externalReferenceId;
    private final com.apollographql.apollo.api.Optional<java.lang.String> transactionId;

    public CompleteThreeDSecureConfirmationInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.transactionId = optional;
        this.externalReferenceId = optional2;
        this.confirmationId = str;
    }

    public /* synthetic */ CompleteThreeDSecureConfirmationInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, str);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getTransactionId() {
        return this.transactionId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getExternalReferenceId() {
        return this.externalReferenceId;
    }

    public final java.lang.String getConfirmationId() {
        return this.confirmationId;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.transactionId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.externalReferenceId;
        java.lang.String str = this.confirmationId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CompleteThreeDSecureConfirmationInput(transactionId=");
        sb.append(optional);
        sb.append(", externalReferenceId=");
        sb.append(optional2);
        sb.append(", confirmationId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.transactionId.hashCode() * 31) + this.externalReferenceId.hashCode()) * 31) + this.confirmationId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CompleteThreeDSecureConfirmationInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CompleteThreeDSecureConfirmationInput completeThreeDSecureConfirmationInput = (com.paypal.oslo.api.graphql.schema.type.CompleteThreeDSecureConfirmationInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionId, completeThreeDSecureConfirmationInput.transactionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalReferenceId, completeThreeDSecureConfirmationInput.externalReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmationId, completeThreeDSecureConfirmationInput.confirmationId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CompleteThreeDSecureConfirmationInput copy(com.apollographql.apollo.api.Optional<java.lang.String> transactionId, com.apollographql.apollo.api.Optional<java.lang.String> externalReferenceId, java.lang.String confirmationId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalReferenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmationId, "");
        return new com.paypal.oslo.api.graphql.schema.type.CompleteThreeDSecureConfirmationInput(transactionId, externalReferenceId, confirmationId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getConfirmationId() {
        return this.confirmationId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.externalReferenceId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.transactionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CompleteThreeDSecureConfirmationInput copy$default(com.paypal.oslo.api.graphql.schema.type.CompleteThreeDSecureConfirmationInput completeThreeDSecureConfirmationInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = completeThreeDSecureConfirmationInput.transactionId;
        }
        if ((i & 2) != 0) {
            optional2 = completeThreeDSecureConfirmationInput.externalReferenceId;
        }
        if ((i & 4) != 0) {
            str = completeThreeDSecureConfirmationInput.confirmationId;
        }
        return completeThreeDSecureConfirmationInput.copy(optional, optional2, str);
    }
}
