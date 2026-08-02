package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolsInput;", "", "", "offset", "limit", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolUserRole;", "userRole", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolStatus;", "status", "<init>", "(IILcom/paypal/oslo/api/graphql/schema/type/MoneyPoolUserRole;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()I", "component2", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolUserRole;", "component4", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(IILcom/paypal/oslo/api/graphql/schema/type/MoneyPoolUserRole;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getOffset", "getLimit", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolUserRole;", "getUserRole", "Lcom/apollographql/apollo/api/Optional;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MoneyPoolsInput {
    private final int limit;
    private final int offset;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus> status;
    private final com.paypal.oslo.api.graphql.schema.type.MoneyPoolUserRole userRole;

    /* JADX WARN: Multi-variable type inference failed */
    public MoneyPoolsInput(int i, int i2, com.paypal.oslo.api.graphql.schema.type.MoneyPoolUserRole moneyPoolUserRole, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyPoolUserRole, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.offset = i;
        this.limit = i2;
        this.userRole = moneyPoolUserRole;
        this.status = optional;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MoneyPoolUserRole getUserRole() {
        return this.userRole;
    }

    public /* synthetic */ MoneyPoolsInput(int i, int i2, com.paypal.oslo.api.graphql.schema.type.MoneyPoolUserRole moneyPoolUserRole, com.apollographql.apollo.api.Optional.Absent absent, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, moneyPoolUserRole, (i3 & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus> getStatus() {
        return this.status;
    }

    public final java.lang.String toString() {
        int i = this.offset;
        int i2 = this.limit;
        com.paypal.oslo.api.graphql.schema.type.MoneyPoolUserRole moneyPoolUserRole = this.userRole;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus> optional = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyPoolsInput(offset=");
        sb.append(i);
        sb.append(", limit=");
        sb.append(i2);
        sb.append(", userRole=");
        sb.append(moneyPoolUserRole);
        sb.append(", status=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Integer.hashCode(this.offset) * 31) + java.lang.Integer.hashCode(this.limit)) * 31) + this.userRole.hashCode()) * 31) + this.status.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.MoneyPoolsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.MoneyPoolsInput moneyPoolsInput = (com.paypal.oslo.api.graphql.schema.type.MoneyPoolsInput) other;
        return this.offset == moneyPoolsInput.offset && this.limit == moneyPoolsInput.limit && this.userRole == moneyPoolsInput.userRole && kotlin.jvm.internal.Intrinsics.areEqual(this.status, moneyPoolsInput.status);
    }

    public final com.paypal.oslo.api.graphql.schema.type.MoneyPoolsInput copy(int offset, int limit, com.paypal.oslo.api.graphql.schema.type.MoneyPoolUserRole userRole, com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus> status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userRole, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.api.graphql.schema.type.MoneyPoolsInput(offset, limit, userRole, status);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyPoolStatus> component4() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MoneyPoolUserRole getUserRole() {
        return this.userRole;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: component1, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MoneyPoolsInput copy$default(com.paypal.oslo.api.graphql.schema.type.MoneyPoolsInput moneyPoolsInput, int i, int i2, com.paypal.oslo.api.graphql.schema.type.MoneyPoolUserRole moneyPoolUserRole, com.apollographql.apollo.api.Optional optional, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = moneyPoolsInput.offset;
        }
        if ((i3 & 2) != 0) {
            i2 = moneyPoolsInput.limit;
        }
        if ((i3 & 4) != 0) {
            moneyPoolUserRole = moneyPoolsInput.userRole;
        }
        if ((i3 & 8) != 0) {
            optional = moneyPoolsInput.status;
        }
        return moneyPoolsInput.copy(i, i2, moneyPoolUserRole, optional);
    }
}
