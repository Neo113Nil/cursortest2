package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ>\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/LinkDirectDepositAccountToPayrollProviderInput;", "", "", "directDepositIntegrationId", "Lcom/apollographql/apollo/api/Optional;", "bankAccountNumber", "routingNumber", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/LinkDirectDepositAccountToPayrollProviderInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDirectDepositIntegrationId", "Lcom/apollographql/apollo/api/Optional;", "getBankAccountNumber", "getRoutingNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LinkDirectDepositAccountToPayrollProviderInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> bankAccountNumber;
    private final java.lang.String directDepositIntegrationId;
    private final com.apollographql.apollo.api.Optional<java.lang.String> routingNumber;

    public LinkDirectDepositAccountToPayrollProviderInput(java.lang.String str, com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.directDepositIntegrationId = str;
        this.bankAccountNumber = optional;
        this.routingNumber = optional2;
    }

    public final java.lang.String getDirectDepositIntegrationId() {
        return this.directDepositIntegrationId;
    }

    public /* synthetic */ LinkDirectDepositAccountToPayrollProviderInput(java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getRoutingNumber() {
        return this.routingNumber;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.directDepositIntegrationId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.bankAccountNumber;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.routingNumber;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkDirectDepositAccountToPayrollProviderInput(directDepositIntegrationId=");
        sb.append(str);
        sb.append(", bankAccountNumber=");
        sb.append(optional);
        sb.append(", routingNumber=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.directDepositIntegrationId.hashCode() * 31) + this.bankAccountNumber.hashCode()) * 31) + this.routingNumber.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.LinkDirectDepositAccountToPayrollProviderInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.LinkDirectDepositAccountToPayrollProviderInput linkDirectDepositAccountToPayrollProviderInput = (com.paypal.oslo.api.graphql.schema.type.LinkDirectDepositAccountToPayrollProviderInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.directDepositIntegrationId, linkDirectDepositAccountToPayrollProviderInput.directDepositIntegrationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.bankAccountNumber, linkDirectDepositAccountToPayrollProviderInput.bankAccountNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.routingNumber, linkDirectDepositAccountToPayrollProviderInput.routingNumber);
    }

    public final com.paypal.oslo.api.graphql.schema.type.LinkDirectDepositAccountToPayrollProviderInput copy(java.lang.String directDepositIntegrationId, com.apollographql.apollo.api.Optional<java.lang.String> bankAccountNumber, com.apollographql.apollo.api.Optional<java.lang.String> routingNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositIntegrationId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routingNumber, "");
        return new com.paypal.oslo.api.graphql.schema.type.LinkDirectDepositAccountToPayrollProviderInput(directDepositIntegrationId, bankAccountNumber, routingNumber);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.routingNumber;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.bankAccountNumber;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDirectDepositIntegrationId() {
        return this.directDepositIntegrationId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.LinkDirectDepositAccountToPayrollProviderInput copy$default(com.paypal.oslo.api.graphql.schema.type.LinkDirectDepositAccountToPayrollProviderInput linkDirectDepositAccountToPayrollProviderInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = linkDirectDepositAccountToPayrollProviderInput.directDepositIntegrationId;
        }
        if ((i & 2) != 0) {
            optional = linkDirectDepositAccountToPayrollProviderInput.bankAccountNumber;
        }
        if ((i & 4) != 0) {
            optional2 = linkDirectDepositAccountToPayrollProviderInput.routingNumber;
        }
        return linkDirectDepositAccountToPayrollProviderInput.copy(str, optional, optional2);
    }
}
