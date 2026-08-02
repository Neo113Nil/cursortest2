package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ6\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolMediaFilesInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolMediaFileCategory;", "category", "", "offset", "limit", "<init>", "(Lcom/apollographql/apollo/api/Optional;II)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "()I", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;II)Lcom/paypal/oslo/api/graphql/schema/type/MoneyPoolMediaFilesInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getCategory", com.visa.cbp.getEncExpo.warmup, "getOffset", "getLimit"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MoneyPoolMediaFilesInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyPoolMediaFileCategory> category;
    private final int limit;
    private final int offset;

    /* JADX WARN: Multi-variable type inference failed */
    public MoneyPoolMediaFilesInput(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.MoneyPoolMediaFileCategory> optional, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.category = optional;
        this.offset = i;
        this.limit = i2;
    }

    public /* synthetic */ MoneyPoolMediaFilesInput(com.apollographql.apollo.api.Optional.Absent absent, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, i, i2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyPoolMediaFileCategory> getCategory() {
        return this.category;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyPoolMediaFileCategory> optional = this.category;
        int i = this.offset;
        int i2 = this.limit;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MoneyPoolMediaFilesInput(category=");
        sb.append(optional);
        sb.append(", offset=");
        sb.append(i);
        sb.append(", limit=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.category.hashCode() * 31) + java.lang.Integer.hashCode(this.offset)) * 31) + java.lang.Integer.hashCode(this.limit);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.MoneyPoolMediaFilesInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.MoneyPoolMediaFilesInput moneyPoolMediaFilesInput = (com.paypal.oslo.api.graphql.schema.type.MoneyPoolMediaFilesInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.category, moneyPoolMediaFilesInput.category) && this.offset == moneyPoolMediaFilesInput.offset && this.limit == moneyPoolMediaFilesInput.limit;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MoneyPoolMediaFilesInput copy(com.apollographql.apollo.api.Optional<? extends com.paypal.oslo.api.graphql.schema.type.MoneyPoolMediaFileCategory> category, int offset, int limit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(category, "");
        return new com.paypal.oslo.api.graphql.schema.type.MoneyPoolMediaFilesInput(category, offset, limit);
    }

    /* renamed from: component3, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyPoolMediaFileCategory> component1() {
        return this.category;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MoneyPoolMediaFilesInput copy$default(com.paypal.oslo.api.graphql.schema.type.MoneyPoolMediaFilesInput moneyPoolMediaFilesInput, com.apollographql.apollo.api.Optional optional, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            optional = moneyPoolMediaFilesInput.category;
        }
        if ((i3 & 2) != 0) {
            i = moneyPoolMediaFilesInput.offset;
        }
        if ((i3 & 4) != 0) {
            i2 = moneyPoolMediaFilesInput.limit;
        }
        return moneyPoolMediaFilesInput.copy(optional, i, i2);
    }
}
