package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AgenticGreetingsInput;", "", "", "Lcom/paypal/oslo/api/graphql/schema/type/AgenticSurface;", "surfaces", "Lcom/apollographql/apollo/api/Optional;", "", "limit", "<init>", "(Ljava/util/List;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Ljava/util/List;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/AgenticGreetingsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getSurfaces", "Lcom/apollographql/apollo/api/Optional;", "getLimit"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AgenticGreetingsInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Integer> limit;
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.AgenticSurface> surfaces;

    /* JADX WARN: Multi-variable type inference failed */
    public AgenticGreetingsInput(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.AgenticSurface> list, com.apollographql.apollo.api.Optional<java.lang.Integer> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.surfaces = list;
        this.limit = optional;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.AgenticSurface> getSurfaces() {
        return this.surfaces;
    }

    public /* synthetic */ AgenticGreetingsInput(java.util.List list, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> getLimit() {
        return this.limit;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.api.graphql.schema.type.AgenticSurface> list = this.surfaces;
        com.apollographql.apollo.api.Optional<java.lang.Integer> optional = this.limit;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AgenticGreetingsInput(surfaces=");
        sb.append(list);
        sb.append(", limit=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.surfaces.hashCode() * 31) + this.limit.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.AgenticGreetingsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.AgenticGreetingsInput agenticGreetingsInput = (com.paypal.oslo.api.graphql.schema.type.AgenticGreetingsInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.surfaces, agenticGreetingsInput.surfaces) && kotlin.jvm.internal.Intrinsics.areEqual(this.limit, agenticGreetingsInput.limit);
    }

    public final com.paypal.oslo.api.graphql.schema.type.AgenticGreetingsInput copy(java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.AgenticSurface> surfaces, com.apollographql.apollo.api.Optional<java.lang.Integer> limit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaces, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limit, "");
        return new com.paypal.oslo.api.graphql.schema.type.AgenticGreetingsInput(surfaces, limit);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> component2() {
        return this.limit;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.AgenticSurface> component1() {
        return this.surfaces;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AgenticGreetingsInput copy$default(com.paypal.oslo.api.graphql.schema.type.AgenticGreetingsInput agenticGreetingsInput, java.util.List list, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = agenticGreetingsInput.surfaces;
        }
        if ((i & 2) != 0) {
            optional = agenticGreetingsInput.limit;
        }
        return agenticGreetingsInput.copy(list, optional);
    }
}
