package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankIssuerInput;", "", "countryCode", "Lcom/apollographql/apollo/api/Optional;", "", "name", "<init>", "(Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/BankIssuerInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCountryCode", "Lcom/apollographql/apollo/api/Optional;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BankIssuerInput {
    private final java.lang.Object countryCode;
    private final com.apollographql.apollo.api.Optional<java.lang.String> name;

    public BankIssuerInput(java.lang.Object obj, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.countryCode = obj;
        this.name = optional;
    }

    public final java.lang.Object getCountryCode() {
        return this.countryCode;
    }

    public /* synthetic */ BankIssuerInput(java.lang.Object obj, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getName() {
        return this.name;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.countryCode;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.name;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BankIssuerInput(countryCode=");
        sb.append(obj);
        sb.append(", name=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.countryCode.hashCode() * 31) + this.name.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.BankIssuerInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.BankIssuerInput bankIssuerInput = (com.paypal.oslo.api.graphql.schema.type.BankIssuerInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, bankIssuerInput.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, bankIssuerInput.name);
    }

    public final com.paypal.oslo.api.graphql.schema.type.BankIssuerInput copy(java.lang.Object countryCode, com.apollographql.apollo.api.Optional<java.lang.String> name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.api.graphql.schema.type.BankIssuerInput(countryCode, name2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getCountryCode() {
        return this.countryCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.BankIssuerInput copy$default(com.paypal.oslo.api.graphql.schema.type.BankIssuerInput bankIssuerInput, java.lang.Object obj, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = bankIssuerInput.countryCode;
        }
        if ((i & 2) != 0) {
            optional = bankIssuerInput.name;
        }
        return bankIssuerInput.copy(obj, optional);
    }
}
