package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JH\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0011"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ActivitySearchSuggestionsInput;", "", "Lcom/apollographql/apollo/api/Optional;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_END_TIME, "", "searchText", "", "limit", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;I)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "()Ljava/lang/String;", "component4", "()I", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;I)Lcom/paypal/oslo/api/graphql/schema/type/ActivitySearchSuggestionsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/apollographql/apollo/api/Optional;", "getStartTime", "getEndTime", "Ljava/lang/String;", "getSearchText", com.visa.cbp.getEncExpo.warmup, "getLimit"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ActivitySearchSuggestionsInput {
    private final com.apollographql.apollo.api.Optional<java.lang.Object> endTime;
    private final int limit;
    private final java.lang.String searchText;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> startTime;

    public ActivitySearchSuggestionsInput(com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional2, java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.startTime = optional;
        this.endTime = optional2;
        this.searchText = str;
        this.limit = i;
    }

    public /* synthetic */ ActivitySearchSuggestionsInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i2 & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, str, i);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getStartTime() {
        return this.startTime;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getEndTime() {
        return this.endTime;
    }

    public final java.lang.String getSearchText() {
        return this.searchText;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.Object> optional = this.startTime;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional2 = this.endTime;
        java.lang.String str = this.searchText;
        int i = this.limit;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivitySearchSuggestionsInput(startTime=");
        sb.append(optional);
        sb.append(", endTime=");
        sb.append(optional2);
        sb.append(", searchText=");
        sb.append(str);
        sb.append(", limit=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.startTime.hashCode() * 31) + this.endTime.hashCode()) * 31) + this.searchText.hashCode()) * 31) + java.lang.Integer.hashCode(this.limit);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput activitySearchSuggestionsInput = (com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.startTime, activitySearchSuggestionsInput.startTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.endTime, activitySearchSuggestionsInput.endTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.searchText, activitySearchSuggestionsInput.searchText) && this.limit == activitySearchSuggestionsInput.limit;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput copy(com.apollographql.apollo.api.Optional<? extends java.lang.Object> startTime, com.apollographql.apollo.api.Optional<? extends java.lang.Object> endTime, java.lang.String searchText, int limit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchText, "");
        return new com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput(startTime, endTime, searchText, limit);
    }

    /* renamed from: component4, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSearchText() {
        return this.searchText;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component2() {
        return this.endTime;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component1() {
        return this.startTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput copy$default(com.paypal.oslo.api.graphql.schema.type.ActivitySearchSuggestionsInput activitySearchSuggestionsInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            optional = activitySearchSuggestionsInput.startTime;
        }
        if ((i2 & 2) != 0) {
            optional2 = activitySearchSuggestionsInput.endTime;
        }
        if ((i2 & 4) != 0) {
            str = activitySearchSuggestionsInput.searchText;
        }
        if ((i2 & 8) != 0) {
            i = activitySearchSuggestionsInput.limit;
        }
        return activitySearchSuggestionsInput.copy(optional, optional2, str, i);
    }
}
