package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011JH\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivitiesInput;", "", "timeZone", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityFiltersInput;", "filters", "Lcom/apollographql/apollo/api/Optional;", "", "limit", "", "cursor", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/ActivityFiltersInput;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityFiltersInput;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "component4", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/ActivityFiltersInput;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/ActivitiesInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getTimeZone", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityFiltersInput;", "getFilters", "Lcom/apollographql/apollo/api/Optional;", "getLimit", "getCursor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ActivitiesInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> cursor;
    private final com.paypal.oslo.api.graphql.schema.type.ActivityFiltersInput filters;
    private final com.apollographql.apollo.api.Optional<java.lang.Integer> limit;
    private final java.lang.Object timeZone;

    public ActivitiesInput(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.ActivityFiltersInput activityFiltersInput, com.apollographql.apollo.api.Optional<java.lang.Integer> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFiltersInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.timeZone = obj;
        this.filters = activityFiltersInput;
        this.limit = optional;
        this.cursor = optional2;
    }

    public final java.lang.Object getTimeZone() {
        return this.timeZone;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivityFiltersInput getFilters() {
        return this.filters;
    }

    public /* synthetic */ ActivitiesInput(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.ActivityFiltersInput activityFiltersInput, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, activityFiltersInput, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> getLimit() {
        return this.limit;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getCursor() {
        return this.cursor;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.timeZone;
        com.paypal.oslo.api.graphql.schema.type.ActivityFiltersInput activityFiltersInput = this.filters;
        com.apollographql.apollo.api.Optional<java.lang.Integer> optional = this.limit;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.cursor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivitiesInput(timeZone=");
        sb.append(obj);
        sb.append(", filters=");
        sb.append(activityFiltersInput);
        sb.append(", limit=");
        sb.append(optional);
        sb.append(", cursor=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.timeZone.hashCode() * 31) + this.filters.hashCode()) * 31) + this.limit.hashCode()) * 31) + this.cursor.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ActivitiesInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ActivitiesInput activitiesInput = (com.paypal.oslo.api.graphql.schema.type.ActivitiesInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.timeZone, activitiesInput.timeZone) && kotlin.jvm.internal.Intrinsics.areEqual(this.filters, activitiesInput.filters) && kotlin.jvm.internal.Intrinsics.areEqual(this.limit, activitiesInput.limit) && kotlin.jvm.internal.Intrinsics.areEqual(this.cursor, activitiesInput.cursor);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivitiesInput copy(java.lang.Object timeZone, com.paypal.oslo.api.graphql.schema.type.ActivityFiltersInput filters, com.apollographql.apollo.api.Optional<java.lang.Integer> limit, com.apollographql.apollo.api.Optional<java.lang.String> cursor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "");
        return new com.paypal.oslo.api.graphql.schema.type.ActivitiesInput(timeZone, filters, limit, cursor);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component4() {
        return this.cursor;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Integer> component3() {
        return this.limit;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ActivityFiltersInput getFilters() {
        return this.filters;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getTimeZone() {
        return this.timeZone;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ActivitiesInput copy$default(com.paypal.oslo.api.graphql.schema.type.ActivitiesInput activitiesInput, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.ActivityFiltersInput activityFiltersInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = activitiesInput.timeZone;
        }
        if ((i & 2) != 0) {
            activityFiltersInput = activitiesInput.filters;
        }
        if ((i & 4) != 0) {
            optional = activitiesInput.limit;
        }
        if ((i & 8) != 0) {
            optional2 = activitiesInput.cursor;
        }
        return activitiesInput.copy(obj, activityFiltersInput, optional, optional2);
    }
}
