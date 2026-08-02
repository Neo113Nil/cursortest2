package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyReceiverInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyReceiverType;", "type", "", "id", "Lcom/apollographql/apollo/api/Optional;", "memo", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyReceiverType;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyReceiverType;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyReceiverType;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyReceiverInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyReceiverType;", "getType", "Ljava/lang/String;", "getId", "Lcom/apollographql/apollo/api/Optional;", "getMemo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CryptocurrencyReceiverInput {
    private final java.lang.String id;
    private final com.apollographql.apollo.api.Optional<java.lang.String> memo;
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType type;

    public CryptocurrencyReceiverInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType cryptocurrencyReceiverType, java.lang.String str, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyReceiverType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.type = cryptocurrencyReceiverType;
        this.id = str;
        this.memo = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType getType() {
        return this.type;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public /* synthetic */ CryptocurrencyReceiverInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType cryptocurrencyReceiverType, java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptocurrencyReceiverType, str, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getMemo() {
        return this.memo;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType cryptocurrencyReceiverType = this.type;
        java.lang.String str = this.id;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.memo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencyReceiverInput(type=");
        sb.append(cryptocurrencyReceiverType);
        sb.append(", id=");
        sb.append(str);
        sb.append(", memo=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.type.hashCode() * 31) + this.id.hashCode()) * 31) + this.memo.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverInput cryptocurrencyReceiverInput = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverInput) other;
        return this.type == cryptocurrencyReceiverInput.type && kotlin.jvm.internal.Intrinsics.areEqual(this.id, cryptocurrencyReceiverInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.memo, cryptocurrencyReceiverInput.memo);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverInput copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType type, java.lang.String id, com.apollographql.apollo.api.Optional<java.lang.String> memo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memo, "");
        return new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverInput(type, id, memo);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.memo;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverInput copy$default(com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverInput cryptocurrencyReceiverInput, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyReceiverType cryptocurrencyReceiverType, java.lang.String str, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cryptocurrencyReceiverType = cryptocurrencyReceiverInput.type;
        }
        if ((i & 2) != 0) {
            str = cryptocurrencyReceiverInput.id;
        }
        if ((i & 4) != 0) {
            optional = cryptocurrencyReceiverInput.memo;
        }
        return cryptocurrencyReceiverInput.copy(cryptocurrencyReceiverType, str, optional);
    }
}
