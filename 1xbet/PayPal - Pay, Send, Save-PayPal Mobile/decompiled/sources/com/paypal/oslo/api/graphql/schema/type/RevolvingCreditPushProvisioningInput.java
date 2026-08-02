package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJD\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR(\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b \u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPushProvisioningInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "creditProductIdentifier", "Lcom/apollographql/apollo/api/Optional;", "creditAccountId", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditExternalWalletTokenInput;", "externalWalletTokens", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditPushProvisioningInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditProductIdentifier;", "getCreditProductIdentifier", "Lcom/apollographql/apollo/api/Optional;", "getCreditAccountId", "getExternalWalletTokens"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RevolvingCreditPushProvisioningInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Object> creditAccountId;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier;
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditExternalWalletTokenInput>> externalWalletTokens;

    /* JADX WARN: Multi-variable type inference failed */
    public RevolvingCreditPushProvisioningInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditExternalWalletTokenInput>> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.creditProductIdentifier = revolvingCreditProductIdentifier;
        this.creditAccountId = optional;
        this.externalWalletTokens = optional2;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public /* synthetic */ RevolvingCreditPushProvisioningInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(revolvingCreditProductIdentifier, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getCreditAccountId() {
        return this.creditAccountId;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditExternalWalletTokenInput>> getExternalWalletTokens() {
        return this.externalWalletTokens;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier = this.creditProductIdentifier;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.creditAccountId;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditExternalWalletTokenInput>> optional2 = this.externalWalletTokens;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditPushProvisioningInput(creditProductIdentifier=");
        sb.append(revolvingCreditProductIdentifier);
        sb.append(", creditAccountId=");
        sb.append(optional);
        sb.append(", externalWalletTokens=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.creditProductIdentifier.hashCode() * 31) + this.creditAccountId.hashCode()) * 31) + this.externalWalletTokens.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningInput revolvingCreditPushProvisioningInput = (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningInput) other;
        return this.creditProductIdentifier == revolvingCreditPushProvisioningInput.creditProductIdentifier && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, revolvingCreditPushProvisioningInput.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalWalletTokens, revolvingCreditPushProvisioningInput.externalWalletTokens);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningInput copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier creditProductIdentifier, com.apollographql.apollo.api.Optional<? extends java.lang.Object> creditAccountId, com.apollographql.apollo.api.Optional<? extends java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditExternalWalletTokenInput>> externalWalletTokens) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalWalletTokens, "");
        return new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningInput(creditProductIdentifier, creditAccountId, externalWalletTokens);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditExternalWalletTokenInput>> component3() {
        return this.externalWalletTokens;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component2() {
        return this.creditAccountId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningInput copy$default(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditPushProvisioningInput revolvingCreditPushProvisioningInput, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier revolvingCreditProductIdentifier, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            revolvingCreditProductIdentifier = revolvingCreditPushProvisioningInput.creditProductIdentifier;
        }
        if ((i & 2) != 0) {
            optional = revolvingCreditPushProvisioningInput.creditAccountId;
        }
        if ((i & 4) != 0) {
            optional2 = revolvingCreditPushProvisioningInput.externalWalletTokens;
        }
        return revolvingCreditPushProvisioningInput.copy(revolvingCreditProductIdentifier, optional, optional2);
    }
}
