package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ4\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/HomeFeedInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "cursor", "", "limit", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/HomeFeedInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getCursor", "getLimit"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HomeFeedInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> cursor;
    private final com.apollographql.apollo.api.Optional<java.lang.Integer> limit;

    public HomeFeedInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<java.lang.Integer> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.cursor = optional;
        this.limit = optional2;
    }

    public /* synthetic */ HomeFeedInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getCursor() {
        return this.cursor;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> getLimit() {
        return this.limit;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.cursor;
        com.apollographql.apollo.api.Optional<java.lang.Integer> optional2 = this.limit;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HomeFeedInput(cursor=");
        sb.append(optional);
        sb.append(", limit=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.cursor.hashCode() * 31) + this.limit.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.HomeFeedInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.HomeFeedInput homeFeedInput = (com.paypal.oslo.api.graphql.schema.type.HomeFeedInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cursor, homeFeedInput.cursor) && kotlin.jvm.internal.Intrinsics.areEqual(this.limit, homeFeedInput.limit);
    }

    public final com.paypal.oslo.api.graphql.schema.type.HomeFeedInput copy(com.apollographql.apollo.api.Optional<java.lang.String> cursor, com.apollographql.apollo.api.Optional<java.lang.Integer> limit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limit, "");
        return new com.paypal.oslo.api.graphql.schema.type.HomeFeedInput(cursor, limit);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> component2() {
        return this.limit;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.cursor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.HomeFeedInput copy$default(com.paypal.oslo.api.graphql.schema.type.HomeFeedInput homeFeedInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = homeFeedInput.cursor;
        }
        if ((i & 2) != 0) {
            optional2 = homeFeedInput.limit;
        }
        return homeFeedInput.copy(optional, optional2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeFeedInput() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
