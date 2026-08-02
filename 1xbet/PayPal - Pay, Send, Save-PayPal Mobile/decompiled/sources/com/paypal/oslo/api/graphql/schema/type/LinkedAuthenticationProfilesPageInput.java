package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJF\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\u000bR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/LinkedAuthenticationProfilesPageInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "afterCursor", "beforeCursor", "", "limit", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/LinkedAuthenticationProfilesPageInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getAfterCursor", "getBeforeCursor", "getLimit"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LinkedAuthenticationProfilesPageInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> afterCursor;
    private final com.apollographql.apollo.api.Optional<java.lang.String> beforeCursor;
    private final com.apollographql.apollo.api.Optional<java.lang.Integer> limit;

    public LinkedAuthenticationProfilesPageInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2, com.apollographql.apollo.api.Optional<java.lang.Integer> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.afterCursor = optional;
        this.beforeCursor = optional2;
        this.limit = optional3;
    }

    public /* synthetic */ LinkedAuthenticationProfilesPageInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getAfterCursor() {
        return this.afterCursor;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getBeforeCursor() {
        return this.beforeCursor;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> getLimit() {
        return this.limit;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.afterCursor;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.beforeCursor;
        com.apollographql.apollo.api.Optional<java.lang.Integer> optional3 = this.limit;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LinkedAuthenticationProfilesPageInput(afterCursor=");
        sb.append(optional);
        sb.append(", beforeCursor=");
        sb.append(optional2);
        sb.append(", limit=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.afterCursor.hashCode() * 31) + this.beforeCursor.hashCode()) * 31) + this.limit.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.LinkedAuthenticationProfilesPageInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.LinkedAuthenticationProfilesPageInput linkedAuthenticationProfilesPageInput = (com.paypal.oslo.api.graphql.schema.type.LinkedAuthenticationProfilesPageInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.afterCursor, linkedAuthenticationProfilesPageInput.afterCursor) && kotlin.jvm.internal.Intrinsics.areEqual(this.beforeCursor, linkedAuthenticationProfilesPageInput.beforeCursor) && kotlin.jvm.internal.Intrinsics.areEqual(this.limit, linkedAuthenticationProfilesPageInput.limit);
    }

    public final com.paypal.oslo.api.graphql.schema.type.LinkedAuthenticationProfilesPageInput copy(com.apollographql.apollo.api.Optional<java.lang.String> afterCursor, com.apollographql.apollo.api.Optional<java.lang.String> beforeCursor, com.apollographql.apollo.api.Optional<java.lang.Integer> limit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(afterCursor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beforeCursor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limit, "");
        return new com.paypal.oslo.api.graphql.schema.type.LinkedAuthenticationProfilesPageInput(afterCursor, beforeCursor, limit);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> component3() {
        return this.limit;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.beforeCursor;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.afterCursor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.LinkedAuthenticationProfilesPageInput copy$default(com.paypal.oslo.api.graphql.schema.type.LinkedAuthenticationProfilesPageInput linkedAuthenticationProfilesPageInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = linkedAuthenticationProfilesPageInput.afterCursor;
        }
        if ((i & 2) != 0) {
            optional2 = linkedAuthenticationProfilesPageInput.beforeCursor;
        }
        if ((i & 4) != 0) {
            optional3 = linkedAuthenticationProfilesPageInput.limit;
        }
        return linkedAuthenticationProfilesPageInput.copy(optional, optional2, optional3);
    }

    public LinkedAuthenticationProfilesPageInput() {
        this(null, null, null, 7, null);
    }
}
