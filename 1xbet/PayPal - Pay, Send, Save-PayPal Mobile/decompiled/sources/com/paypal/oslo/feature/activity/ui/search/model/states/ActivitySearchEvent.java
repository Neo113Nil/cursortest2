package com.paypal.oslo.feature.activity.ui.search.model.states;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "SearchQueryChanged", "SearchSubmitted", "SuggestionItemClicked", "SearchResultItemClicked", "FilterChipClicked", "BackClicked", "SearchCleared", "SearchResultItemPrimaryActionClicked", "XoomTransactionTileActionPressedEvent", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$BackClicked;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$FilterChipClicked;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$SearchCleared;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$SearchQueryChanged;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$SearchResultItemClicked;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$SearchResultItemPrimaryActionClicked;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$SearchSubmitted;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$SuggestionItemClicked;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$XoomTransactionTileActionPressedEvent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ActivitySearchEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$SearchQueryChanged;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent;", "", "query", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$SearchQueryChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getQuery"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchQueryChanged extends com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent {
        public static final int $stable = 0;
        private final java.lang.String query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchQueryChanged(java.lang.String str) {
            super("SearchQueryChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.query = str;
        }

        public final java.lang.String getQuery() {
            return this.query;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.query;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchQueryChanged(query=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.query.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchQueryChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.query, ((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchQueryChanged) other).query);
        }

        public final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchQueryChanged copy(java.lang.String query) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
            return new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchQueryChanged(query);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getQuery() {
            return this.query;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchQueryChanged copy$default(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchQueryChanged searchQueryChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = searchQueryChanged.query;
            }
            return searchQueryChanged.copy(str);
        }
    }

    private ActivitySearchEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$SearchSubmitted;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent;", "", "query", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$SearchSubmitted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getQuery"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchSubmitted extends com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent {
        public static final int $stable = 0;
        private final java.lang.String query;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchSubmitted(java.lang.String str) {
            super("SearchSubmitted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.query = str;
        }

        public final java.lang.String getQuery() {
            return this.query;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.query;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchSubmitted(query=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.query.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchSubmitted) && kotlin.jvm.internal.Intrinsics.areEqual(this.query, ((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchSubmitted) other).query);
        }

        public final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchSubmitted copy(java.lang.String query) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
            return new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchSubmitted(query);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getQuery() {
            return this.query;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchSubmitted copy$default(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchSubmitted searchSubmitted, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = searchSubmitted.query;
            }
            return searchSubmitted.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$SuggestionItemClicked;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent;", "", "suggestion", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$SuggestionItemClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSuggestion"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SuggestionItemClicked extends com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent {
        public static final int $stable = 0;
        private final java.lang.String suggestion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuggestionItemClicked(java.lang.String str) {
            super("SuggestionItemClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.suggestion = str;
        }

        public final java.lang.String getSuggestion() {
            return this.suggestion;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.suggestion;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SuggestionItemClicked(suggestion=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.suggestion.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SuggestionItemClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.suggestion, ((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SuggestionItemClicked) other).suggestion);
        }

        public final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SuggestionItemClicked copy(java.lang.String suggestion) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suggestion, "");
            return new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SuggestionItemClicked(suggestion);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSuggestion() {
            return this.suggestion;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SuggestionItemClicked copy$default(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SuggestionItemClicked suggestionItemClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = suggestionItemClicked.suggestion;
            }
            return suggestionItemClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$SearchResultItemClicked;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "activityTransactionModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$SearchResultItemClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "getActivityTransactionModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchResultItemClicked extends com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchResultItemClicked(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
            super("SearchResultItemClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
            this.activityTransactionModel = activityTransactionModel;
        }

        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel getActivityTransactionModel() {
            return this.activityTransactionModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel = this.activityTransactionModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchResultItemClicked(activityTransactionModel=");
            sb.append(activityTransactionModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityTransactionModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityTransactionModel, ((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemClicked) other).activityTransactionModel);
        }

        public final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemClicked copy(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
            return new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemClicked(activityTransactionModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel getActivityTransactionModel() {
            return this.activityTransactionModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemClicked copy$default(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemClicked searchResultItemClicked, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityTransactionModel = searchResultItemClicked.activityTransactionModel;
            }
            return searchResultItemClicked.copy(activityTransactionModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$FilterChipClicked;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent;", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "<init>", "(Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;)Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$FilterChipClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;", "getFilter"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FilterChipClicked extends com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType filter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FilterChipClicked(com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType activitySearchFilterType) {
            super("FilterChipClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySearchFilterType, "");
            this.filter = activitySearchFilterType;
        }

        public final com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType getFilter() {
            return this.filter;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType activitySearchFilterType = this.filter;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FilterChipClicked(filter=");
            sb.append(activitySearchFilterType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.filter.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.FilterChipClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.filter, ((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.FilterChipClicked) other).filter);
        }

        public final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.FilterChipClicked copy(com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType filter) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filter, "");
            return new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.FilterChipClicked(filter);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType getFilter() {
            return this.filter;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.FilterChipClicked copy$default(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.FilterChipClicked filterChipClicked, com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType activitySearchFilterType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activitySearchFilterType = filterChipClicked.filter;
            }
            return filterChipClicked.copy(activitySearchFilterType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$BackClicked;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackClicked extends com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.BackClicked INSTANCE = new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.BackClicked();

        public final int hashCode() {
            return -1823884568;
        }

        private BackClicked() {
            super("BackClicked", null);
        }

        public final java.lang.String toString() {
            return "BackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.BackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$SearchCleared;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchCleared extends com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchCleared INSTANCE = new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchCleared();

        public final int hashCode() {
            return 2136684684;
        }

        private SearchCleared() {
            super("SearchCleared", null);
        }

        public final java.lang.String toString() {
            return "SearchCleared";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchCleared)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$SearchResultItemPrimaryActionClicked;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "activityActionModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$SearchResultItemPrimaryActionClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "getActivityActionModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchResultItemPrimaryActionClicked extends com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel;

        public SearchResultItemPrimaryActionClicked(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
            super("SearchResultItemPrimaryActionClicked", null);
            this.activityActionModel = activityActionModel;
        }

        public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel getActivityActionModel() {
            return this.activityActionModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel = this.activityActionModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SearchResultItemPrimaryActionClicked(activityActionModel=");
            sb.append(activityActionModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel = this.activityActionModel;
            if (activityActionModel == null) {
                return 0;
            }
            return activityActionModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemPrimaryActionClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityActionModel, ((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemPrimaryActionClicked) other).activityActionModel);
        }

        public final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemPrimaryActionClicked copy(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
            return new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemPrimaryActionClicked(activityActionModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel getActivityActionModel() {
            return this.activityActionModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemPrimaryActionClicked copy$default(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemPrimaryActionClicked searchResultItemPrimaryActionClicked, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityActionModel = searchResultItemPrimaryActionClicked.activityActionModel;
            }
            return searchResultItemPrimaryActionClicked.copy(activityActionModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$XoomTransactionTileActionPressedEvent;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent;", "Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;", "Lcom/paypal/oslo/feature/activity/domain/common/extensions/XoomTransactionDestinationKey;", "destinationKey", "<init>", "(Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;)V", "component1", "()Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;", "copy", "(Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;)Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent$XoomTransactionTileActionPressedEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;", "getDestinationKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class XoomTransactionTileActionPressedEvent extends com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination destinationKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public XoomTransactionTileActionPressedEvent(com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination activityDetailsDestination) {
            super("XoomTransactionTileActionPressedEvent", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailsDestination, "");
            this.destinationKey = activityDetailsDestination;
        }

        public final com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination getDestinationKey() {
            return this.destinationKey;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination activityDetailsDestination = this.destinationKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("XoomTransactionTileActionPressedEvent(destinationKey=");
            sb.append(activityDetailsDestination);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destinationKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.XoomTransactionTileActionPressedEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationKey, ((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.XoomTransactionTileActionPressedEvent) other).destinationKey);
        }

        public final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.XoomTransactionTileActionPressedEvent copy(com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination destinationKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationKey, "");
            return new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.XoomTransactionTileActionPressedEvent(destinationKey);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination getDestinationKey() {
            return this.destinationKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.XoomTransactionTileActionPressedEvent copy$default(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.XoomTransactionTileActionPressedEvent xoomTransactionTileActionPressedEvent, com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination activityDetailsDestination, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailsDestination = xoomTransactionTileActionPressedEvent.destinationKey;
            }
            return xoomTransactionTileActionPressedEvent.copy(activityDetailsDestination);
        }
    }

    public /* synthetic */ ActivitySearchEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
