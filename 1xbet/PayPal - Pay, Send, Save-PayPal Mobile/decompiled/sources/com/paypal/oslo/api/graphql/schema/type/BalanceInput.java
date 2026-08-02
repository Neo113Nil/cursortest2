package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BalanceInput;", "", "", "accountId", "Lcom/apollographql/apollo/api/Optional;", "currency", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/BalanceInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountId", "Lcom/apollographql/apollo/api/Optional;", "getCurrency"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BalanceInput {
    private final java.lang.String accountId;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> currency;

    public BalanceInput(java.lang.String str, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.accountId = str;
        this.currency = optional;
    }

    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    public /* synthetic */ BalanceInput(java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getCurrency() {
        return this.currency;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.accountId;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.currency;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BalanceInput(accountId=");
        sb.append(str);
        sb.append(", currency=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.accountId.hashCode() * 31) + this.currency.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BalanceInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BalanceInput balanceInput = (com.paypal.oslo.api.graphql.schema.type.BalanceInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, balanceInput.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, balanceInput.currency);
    }

    public final com.paypal.oslo.api.graphql.schema.type.BalanceInput copy(java.lang.String accountId, com.apollographql.apollo.api.Optional<? extends java.lang.Object> currency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        return new com.paypal.oslo.api.graphql.schema.type.BalanceInput(accountId, currency);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component2() {
        return this.currency;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BalanceInput copy$default(com.paypal.oslo.api.graphql.schema.type.BalanceInput balanceInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = balanceInput.accountId;
        }
        if ((i & 2) != 0) {
            optional = balanceInput.currency;
        }
        return balanceInput.copy(str, optional);
    }
}
