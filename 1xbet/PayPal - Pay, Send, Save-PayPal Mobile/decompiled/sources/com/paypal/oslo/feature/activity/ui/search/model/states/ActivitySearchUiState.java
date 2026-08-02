package com.paypal.oslo.feature.activity.ui.search.model.states;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010$\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "currentQuery", "submittedQuery", "", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;", "availableFilters", "selectedFilter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;)Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiState;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCurrentQuery", "getSubmittedQuery", "Ljava/util/List;", "getAvailableFilters", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;", "getSelectedFilter", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivitySearchUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType> availableFilters;
    private final java.lang.String currentQuery;
    private final java.lang.String name;
    private final com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType selectedFilter;
    private final java.lang.String submittedQuery;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivitySearchUiState(java.lang.String str, java.lang.String str2, java.util.List<? extends com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType> list, com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType activitySearchFilterType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.currentQuery = str;
        this.submittedQuery = str2;
        this.availableFilters = list;
        this.selectedFilter = activitySearchFilterType;
        this.name = "ActivitySearchUiState";
    }

    public /* synthetic */ ActivitySearchUiState(java.lang.String str, java.lang.String str2, java.util.List list, com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType activitySearchFilterType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.INSTANCE.getEntries() : list, (i & 8) != 0 ? null : activitySearchFilterType);
    }

    public final java.lang.String getCurrentQuery() {
        return this.currentQuery;
    }

    public final java.lang.String getSubmittedQuery() {
        return this.submittedQuery;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType> getAvailableFilters() {
        return this.availableFilters;
    }

    public final com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType getSelectedFilter() {
        return this.selectedFilter;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.currentQuery;
        java.lang.String str2 = this.submittedQuery;
        java.util.List<com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType> list = this.availableFilters;
        com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType activitySearchFilterType = this.selectedFilter;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivitySearchUiState(currentQuery=");
        sb.append(str);
        sb.append(", submittedQuery=");
        sb.append(str2);
        sb.append(", availableFilters=");
        sb.append(list);
        sb.append(", selectedFilter=");
        sb.append(activitySearchFilterType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.currentQuery.hashCode();
        java.lang.String str = this.submittedQuery;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.availableFilters.hashCode();
        com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType activitySearchFilterType = this.selectedFilter;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (activitySearchFilterType != null ? activitySearchFilterType.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState)) {
            return false;
        }
        com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState activitySearchUiState = (com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.currentQuery, activitySearchUiState.currentQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.submittedQuery, activitySearchUiState.submittedQuery) && kotlin.jvm.internal.Intrinsics.areEqual(this.availableFilters, activitySearchUiState.availableFilters) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFilter, activitySearchUiState.selectedFilter);
    }

    public final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState copy(java.lang.String currentQuery, java.lang.String submittedQuery, java.util.List<? extends com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType> availableFilters, com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType selectedFilter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentQuery, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(availableFilters, "");
        return new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState(currentQuery, submittedQuery, availableFilters, selectedFilter);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType getSelectedFilter() {
        return this.selectedFilter;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType> component3() {
        return this.availableFilters;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSubmittedQuery() {
        return this.submittedQuery;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCurrentQuery() {
        return this.currentQuery;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState copy$default(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState activitySearchUiState, java.lang.String str, java.lang.String str2, java.util.List list, com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType activitySearchFilterType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activitySearchUiState.currentQuery;
        }
        if ((i & 2) != 0) {
            str2 = activitySearchUiState.submittedQuery;
        }
        if ((i & 4) != 0) {
            list = activitySearchUiState.availableFilters;
        }
        if ((i & 8) != 0) {
            activitySearchFilterType = activitySearchUiState.selectedFilter;
        }
        return activitySearchUiState.copy(str, str2, list, activitySearchFilterType);
    }

    public ActivitySearchUiState() {
        this(null, null, null, null, 15, null);
    }
}
