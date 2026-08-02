package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ>\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MoneyManagementNextBestActionsInput;", "", "", "surface", "Lcom/apollographql/apollo/api/Optional;", "pageName", "", "limit", "<init>", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "component3", "copy", "(Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/MoneyManagementNextBestActionsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSurface", "Lcom/apollographql/apollo/api/Optional;", "getPageName", "getLimit"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MoneyManagementNextBestActionsInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Integer> limit;
    private final com.apollographql.apollo.api.Optional<java.lang.String> pageName;
    private final java.lang.String surface;

    public MoneyManagementNextBestActionsInput(java.lang.String str, com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<java.lang.Integer> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.surface = str;
        this.pageName = optional;
        this.limit = optional2;
    }

    public final java.lang.String getSurface() {
        return this.surface;
    }

    public /* synthetic */ MoneyManagementNextBestActionsInput(java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getPageName() {
        return this.pageName;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> getLimit() {
        return this.limit;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.surface;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.pageName;
        com.apollographql.apollo.api.Optional<java.lang.Integer> optional2 = this.limit;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyManagementNextBestActionsInput(surface=");
        sb.append(str);
        sb.append(", pageName=");
        sb.append(optional);
        sb.append(", limit=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.surface.hashCode() * 31) + this.pageName.hashCode()) * 31) + this.limit.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.MoneyManagementNextBestActionsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.MoneyManagementNextBestActionsInput moneyManagementNextBestActionsInput = (com.paypal.oslo.api.graphql.schema.type.MoneyManagementNextBestActionsInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.surface, moneyManagementNextBestActionsInput.surface) && kotlin.jvm.internal.Intrinsics.areEqual(this.pageName, moneyManagementNextBestActionsInput.pageName) && kotlin.jvm.internal.Intrinsics.areEqual(this.limit, moneyManagementNextBestActionsInput.limit);
    }

    public final com.paypal.oslo.api.graphql.schema.type.MoneyManagementNextBestActionsInput copy(java.lang.String surface, com.apollographql.apollo.api.Optional<java.lang.String> pageName, com.apollographql.apollo.api.Optional<java.lang.Integer> limit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limit, "");
        return new com.paypal.oslo.api.graphql.schema.type.MoneyManagementNextBestActionsInput(surface, pageName, limit);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> component3() {
        return this.limit;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.pageName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSurface() {
        return this.surface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MoneyManagementNextBestActionsInput copy$default(com.paypal.oslo.api.graphql.schema.type.MoneyManagementNextBestActionsInput moneyManagementNextBestActionsInput, java.lang.String str, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = moneyManagementNextBestActionsInput.surface;
        }
        if ((i & 2) != 0) {
            optional = moneyManagementNextBestActionsInput.pageName;
        }
        if ((i & 4) != 0) {
            optional2 = moneyManagementNextBestActionsInput.limit;
        }
        return moneyManagementNextBestActionsInput.copy(str, optional, optional2);
    }
}
