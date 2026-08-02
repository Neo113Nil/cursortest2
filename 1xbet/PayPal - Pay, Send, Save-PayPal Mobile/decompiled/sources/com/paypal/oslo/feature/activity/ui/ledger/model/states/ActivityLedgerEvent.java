package com.paypal.oslo.feature.activity.ui.ledger.model.states;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\n\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\n\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "FilterApplied", "ClearFilter", "RenderLedgerPageEvent", "TransactionTilePressedEvent", "TransactionTileActionPressedEvent", "PackageTrackPressedEvent", "PromotionalRewardPressedEvent", "SearchActionClickedEvent", "XoomTransactionTileActionPressedEvent", "OnPackageTrackingLinkEmailClickedEvent", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$ClearFilter;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$FilterApplied;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$OnPackageTrackingLinkEmailClickedEvent;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$PackageTrackPressedEvent;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$PromotionalRewardPressedEvent;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$RenderLedgerPageEvent;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$SearchActionClickedEvent;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$TransactionTileActionPressedEvent;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$TransactionTilePressedEvent;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$XoomTransactionTileActionPressedEvent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ActivityLedgerEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ActivityLedgerEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$FilterApplied;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "filterType", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$FilterApplied;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "getFilterType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FilterApplied extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType filterType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FilterApplied(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
            super("FilterApplied", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
            this.filterType = activityFilterType;
        }

        public /* synthetic */ FilterApplied(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default r1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(null, 1, null) : r1);
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getFilterType() {
            return this.filterType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType = this.filterType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FilterApplied(filterType=");
            sb.append(activityFilterType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.filterType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.FilterApplied) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterType, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.FilterApplied) other).filterType);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.FilterApplied copy(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType filterType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterType, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.FilterApplied(filterType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getFilterType() {
            return this.filterType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.FilterApplied copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.FilterApplied filterApplied, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityFilterType = filterApplied.filterType;
            }
            return filterApplied.copy(activityFilterType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FilterApplied() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$ClearFilter;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "filterType", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$ClearFilter;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "getFilterType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClearFilter extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType filterType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClearFilter(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
            super("ClearFilter", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
            this.filterType = activityFilterType;
        }

        public /* synthetic */ ClearFilter(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default r1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(null, 1, null) : r1);
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getFilterType() {
            return this.filterType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType = this.filterType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClearFilter(filterType=");
            sb.append(activityFilterType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.filterType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.ClearFilter) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterType, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.ClearFilter) other).filterType);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.ClearFilter copy(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType filterType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterType, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.ClearFilter(filterType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getFilterType() {
            return this.filterType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.ClearFilter copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.ClearFilter clearFilter, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityFilterType = clearFilter.filterType;
            }
            return clearFilter.copy(activityFilterType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ClearFilter() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$RenderLedgerPageEvent;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "filterType", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$RenderLedgerPageEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "getFilterType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RenderLedgerPageEvent extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType filterType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RenderLedgerPageEvent(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
            super("RenderLedgerPageEvent", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
            this.filterType = activityFilterType;
        }

        public /* synthetic */ RenderLedgerPageEvent(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default r1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(null, 1, null) : r1);
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getFilterType() {
            return this.filterType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType = this.filterType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RenderLedgerPageEvent(filterType=");
            sb.append(activityFilterType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.filterType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.RenderLedgerPageEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterType, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.RenderLedgerPageEvent) other).filterType);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.RenderLedgerPageEvent copy(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType filterType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterType, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.RenderLedgerPageEvent(filterType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getFilterType() {
            return this.filterType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.RenderLedgerPageEvent copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.RenderLedgerPageEvent renderLedgerPageEvent, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityFilterType = renderLedgerPageEvent.filterType;
            }
            return renderLedgerPageEvent.copy(activityFilterType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RenderLedgerPageEvent() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$TransactionTilePressedEvent;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "activityTransactionModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$TransactionTilePressedEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "getActivityTransactionModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionTilePressedEvent extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionTilePressedEvent(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
            super("TransactionTilePressedEvent", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
            this.activityTransactionModel = activityTransactionModel;
        }

        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel getActivityTransactionModel() {
            return this.activityTransactionModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel = this.activityTransactionModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionTilePressedEvent(activityTransactionModel=");
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
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTilePressedEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityTransactionModel, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTilePressedEvent) other).activityTransactionModel);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTilePressedEvent copy(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTilePressedEvent(activityTransactionModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel getActivityTransactionModel() {
            return this.activityTransactionModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTilePressedEvent copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTilePressedEvent transactionTilePressedEvent, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityTransactionModel = transactionTilePressedEvent.activityTransactionModel;
            }
            return transactionTilePressedEvent.copy(activityTransactionModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$TransactionTileActionPressedEvent;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "primaryActionModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$TransactionTileActionPressedEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "getPrimaryActionModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionTileActionPressedEvent extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel primaryActionModel;

        public TransactionTileActionPressedEvent(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
            super("TransactionTileActionPressedEvent", null);
            this.primaryActionModel = activityActionModel;
        }

        public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel getPrimaryActionModel() {
            return this.primaryActionModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel = this.primaryActionModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionTileActionPressedEvent(primaryActionModel=");
            sb.append(activityActionModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel = this.primaryActionModel;
            if (activityActionModel == null) {
                return 0;
            }
            return activityActionModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTileActionPressedEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryActionModel, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTileActionPressedEvent) other).primaryActionModel);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTileActionPressedEvent copy(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel primaryActionModel) {
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTileActionPressedEvent(primaryActionModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel getPrimaryActionModel() {
            return this.primaryActionModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTileActionPressedEvent copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTileActionPressedEvent transactionTileActionPressedEvent, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityActionModel = transactionTileActionPressedEvent.primaryActionModel;
            }
            return transactionTileActionPressedEvent.copy(activityActionModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$PackageTrackPressedEvent;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;", "Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageDetailDestination;", "destinationKey", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageDetailDestination;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageDetailDestination;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageDetailDestination;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$PackageTrackPressedEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageDetailDestination;", "getDestinationKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PackageTrackPressedEvent extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination destinationKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PackageTrackPressedEvent(com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination packageDetailDestination) {
            super("PackageTrackPressedEvent", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageDetailDestination, "");
            this.destinationKey = packageDetailDestination;
        }

        public final com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination getDestinationKey() {
            return this.destinationKey;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination packageDetailDestination = this.destinationKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PackageTrackPressedEvent(destinationKey=");
            sb.append(packageDetailDestination);
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
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PackageTrackPressedEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationKey, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PackageTrackPressedEvent) other).destinationKey);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PackageTrackPressedEvent copy(com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination destinationKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationKey, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PackageTrackPressedEvent(destinationKey);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination getDestinationKey() {
            return this.destinationKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PackageTrackPressedEvent copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PackageTrackPressedEvent packageTrackPressedEvent, com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination packageDetailDestination, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                packageDetailDestination = packageTrackPressedEvent.destinationKey;
            }
            return packageTrackPressedEvent.copy(packageDetailDestination);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$PromotionalRewardPressedEvent;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;", "Lcom/paypal/oslo/feature/activity/api/navigation/ActivityPromotionalRewardsDetailsDestinationKey;", "destinationKey", "<init>", "(Lcom/paypal/oslo/feature/activity/api/navigation/ActivityPromotionalRewardsDetailsDestinationKey;)V", "component1", "()Lcom/paypal/oslo/feature/activity/api/navigation/ActivityPromotionalRewardsDetailsDestinationKey;", "copy", "(Lcom/paypal/oslo/feature/activity/api/navigation/ActivityPromotionalRewardsDetailsDestinationKey;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$PromotionalRewardPressedEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/api/navigation/ActivityPromotionalRewardsDetailsDestinationKey;", "getDestinationKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PromotionalRewardPressedEvent extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent {
        public static final int $stable = com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey.$stable;
        private final com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey destinationKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PromotionalRewardPressedEvent(com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey activityPromotionalRewardsDetailsDestinationKey) {
            super("PromotionalRewardPressedEvent", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityPromotionalRewardsDetailsDestinationKey, "");
            this.destinationKey = activityPromotionalRewardsDetailsDestinationKey;
        }

        public final com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey getDestinationKey() {
            return this.destinationKey;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey activityPromotionalRewardsDetailsDestinationKey = this.destinationKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PromotionalRewardPressedEvent(destinationKey=");
            sb.append(activityPromotionalRewardsDetailsDestinationKey);
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
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PromotionalRewardPressedEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationKey, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PromotionalRewardPressedEvent) other).destinationKey);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PromotionalRewardPressedEvent copy(com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey destinationKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationKey, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PromotionalRewardPressedEvent(destinationKey);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey getDestinationKey() {
            return this.destinationKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PromotionalRewardPressedEvent copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PromotionalRewardPressedEvent promotionalRewardPressedEvent, com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey activityPromotionalRewardsDetailsDestinationKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityPromotionalRewardsDetailsDestinationKey = promotionalRewardPressedEvent.destinationKey;
            }
            return promotionalRewardPressedEvent.copy(activityPromotionalRewardsDetailsDestinationKey);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$SearchActionClickedEvent;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SearchActionClickedEvent extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.SearchActionClickedEvent INSTANCE = new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.SearchActionClickedEvent();

        public final int hashCode() {
            return -1372887125;
        }

        private SearchActionClickedEvent() {
            super("SearchActionClickedEvent", null);
        }

        public final java.lang.String toString() {
            return "SearchActionClickedEvent";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.SearchActionClickedEvent)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$XoomTransactionTileActionPressedEvent;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;", "Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;", "Lcom/paypal/oslo/feature/activity/domain/common/extensions/XoomTransactionDestinationKey;", "destinationKey", "<init>", "(Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;)V", "component1", "()Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;", "copy", "(Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$XoomTransactionTileActionPressedEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;", "getDestinationKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class XoomTransactionTileActionPressedEvent extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent {
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
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.XoomTransactionTileActionPressedEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationKey, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.XoomTransactionTileActionPressedEvent) other).destinationKey);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.XoomTransactionTileActionPressedEvent copy(com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination destinationKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationKey, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.XoomTransactionTileActionPressedEvent(destinationKey);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination getDestinationKey() {
            return this.destinationKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.XoomTransactionTileActionPressedEvent copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.XoomTransactionTileActionPressedEvent xoomTransactionTileActionPressedEvent, com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination activityDetailsDestination, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailsDestination = xoomTransactionTileActionPressedEvent.destinationKey;
            }
            return xoomTransactionTileActionPressedEvent.copy(activityDetailsDestination);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$OnPackageTrackingLinkEmailClickedEvent;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;", "Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageSettingsDestination;", "destinationKey", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageSettingsDestination;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageSettingsDestination;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageSettingsDestination;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent$OnPackageTrackingLinkEmailClickedEvent;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageSettingsDestination;", "getDestinationKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPackageTrackingLinkEmailClickedEvent extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination destinationKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPackageTrackingLinkEmailClickedEvent(com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination packageSettingsDestination) {
            super("OnPackageTrackingLinkEmailClickedEvent", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageSettingsDestination, "");
            this.destinationKey = packageSettingsDestination;
        }

        public final com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination getDestinationKey() {
            return this.destinationKey;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination packageSettingsDestination = this.destinationKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPackageTrackingLinkEmailClickedEvent(destinationKey=");
            sb.append(packageSettingsDestination);
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
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.OnPackageTrackingLinkEmailClickedEvent) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationKey, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.OnPackageTrackingLinkEmailClickedEvent) other).destinationKey);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.OnPackageTrackingLinkEmailClickedEvent copy(com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination destinationKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationKey, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.OnPackageTrackingLinkEmailClickedEvent(destinationKey);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination getDestinationKey() {
            return this.destinationKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.OnPackageTrackingLinkEmailClickedEvent copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.OnPackageTrackingLinkEmailClickedEvent onPackageTrackingLinkEmailClickedEvent, com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination packageSettingsDestination, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                packageSettingsDestination = onPackageTrackingLinkEmailClickedEvent.destinationKey;
            }
            return onPackageTrackingLinkEmailClickedEvent.copy(packageSettingsDestination);
        }
    }

    public /* synthetic */ ActivityLedgerEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
