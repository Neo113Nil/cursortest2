package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencySenderInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencySenderType;", "type", "", "id", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencySenderType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencySenderType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencySenderType;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencySenderInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencySenderType;", "getType", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CryptocurrencySenderInput {
    private final java.lang.String id;
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencySenderType type;

    public CryptocurrencySenderInput(com.paypal.oslo.api.graphql.schema.type.CryptocurrencySenderType cryptocurrencySenderType, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencySenderType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = cryptocurrencySenderType;
        this.id = str;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencySenderType getType() {
        return this.type;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencySenderType cryptocurrencySenderType = this.type;
        java.lang.String str = this.id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptocurrencySenderInput(type=");
        sb.append(cryptocurrencySenderType);
        sb.append(", id=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.type.hashCode() * 31) + this.id.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CryptocurrencySenderInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencySenderInput cryptocurrencySenderInput = (com.paypal.oslo.api.graphql.schema.type.CryptocurrencySenderInput) other;
        return this.type == cryptocurrencySenderInput.type && kotlin.jvm.internal.Intrinsics.areEqual(this.id, cryptocurrencySenderInput.id);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencySenderInput copy(com.paypal.oslo.api.graphql.schema.type.CryptocurrencySenderType type, java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.api.graphql.schema.type.CryptocurrencySenderInput(type, id);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencySenderType getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CryptocurrencySenderInput copy$default(com.paypal.oslo.api.graphql.schema.type.CryptocurrencySenderInput cryptocurrencySenderInput, com.paypal.oslo.api.graphql.schema.type.CryptocurrencySenderType cryptocurrencySenderType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cryptocurrencySenderType = cryptocurrencySenderInput.type;
        }
        if ((i & 2) != 0) {
            str = cryptocurrencySenderInput.id;
        }
        return cryptocurrencySenderInput.copy(cryptocurrencySenderType, str);
    }
}
