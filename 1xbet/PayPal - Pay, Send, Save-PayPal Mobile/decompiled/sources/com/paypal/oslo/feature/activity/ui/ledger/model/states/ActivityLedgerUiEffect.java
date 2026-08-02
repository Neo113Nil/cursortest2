package com.paypal.oslo.feature.activity.ui.ledger.model.states;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\n\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\n\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "TriggerFilterApplied", "TriggerFilterCleared", "ReLoadInitialLedgerScreen", "NavigateToActivityDetailScreen", "HandleActivityTransactionPrimaryAction", "NavigateToPackageDetailScreen", "NavigateToPromotionalRewardScreen", "NavigateToSearchScreen", "HandleXoomActivityTransactionTilePressed", "HandlePackageTrackingLinkEmailPressed", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$HandleActivityTransactionPrimaryAction;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$HandlePackageTrackingLinkEmailPressed;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$HandleXoomActivityTransactionTilePressed;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$NavigateToActivityDetailScreen;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$NavigateToPackageDetailScreen;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$NavigateToPromotionalRewardScreen;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$NavigateToSearchScreen;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$ReLoadInitialLedgerScreen;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$TriggerFilterApplied;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$TriggerFilterCleared;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ActivityLedgerUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ActivityLedgerUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$TriggerFilterApplied;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "filterType", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$TriggerFilterApplied;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "getFilterType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TriggerFilterApplied extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType filterType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TriggerFilterApplied(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
            super("TriggerFilterApplied", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
            this.filterType = activityFilterType;
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getFilterType() {
            return this.filterType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType = this.filterType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TriggerFilterApplied(filterType=");
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
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.TriggerFilterApplied) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterType, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.TriggerFilterApplied) other).filterType);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.TriggerFilterApplied copy(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType filterType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterType, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.TriggerFilterApplied(filterType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getFilterType() {
            return this.filterType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.TriggerFilterApplied copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.TriggerFilterApplied triggerFilterApplied, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityFilterType = triggerFilterApplied.filterType;
            }
            return triggerFilterApplied.copy(activityFilterType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$TriggerFilterCleared;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "filterType", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$TriggerFilterCleared;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "getFilterType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TriggerFilterCleared extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType filterType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TriggerFilterCleared(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
            super("TriggerFilterCleared", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
            this.filterType = activityFilterType;
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getFilterType() {
            return this.filterType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType = this.filterType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TriggerFilterCleared(filterType=");
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
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.TriggerFilterCleared) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterType, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.TriggerFilterCleared) other).filterType);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.TriggerFilterCleared copy(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType filterType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterType, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.TriggerFilterCleared(filterType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getFilterType() {
            return this.filterType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.TriggerFilterCleared copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.TriggerFilterCleared triggerFilterCleared, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityFilterType = triggerFilterCleared.filterType;
            }
            return triggerFilterCleared.copy(activityFilterType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$ReLoadInitialLedgerScreen;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "filterType", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$ReLoadInitialLedgerScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "getFilterType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReLoadInitialLedgerScreen extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType filterType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReLoadInitialLedgerScreen(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
            super("ReLoadInitialLedgerScreen", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
            this.filterType = activityFilterType;
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getFilterType() {
            return this.filterType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType = this.filterType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReLoadInitialLedgerScreen(filterType=");
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
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.ReLoadInitialLedgerScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterType, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.ReLoadInitialLedgerScreen) other).filterType);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.ReLoadInitialLedgerScreen copy(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType filterType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterType, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.ReLoadInitialLedgerScreen(filterType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getFilterType() {
            return this.filterType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.ReLoadInitialLedgerScreen copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.ReLoadInitialLedgerScreen reLoadInitialLedgerScreen, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityFilterType = reLoadInitialLedgerScreen.filterType;
            }
            return reLoadInitialLedgerScreen.copy(activityFilterType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$NavigateToActivityDetailScreen;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "activityTransactionModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$NavigateToActivityDetailScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "getActivityTransactionModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToActivityDetailScreen extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToActivityDetailScreen(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
            super("NavigateToActivityDetailScreen", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
            this.activityTransactionModel = activityTransactionModel;
        }

        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel getActivityTransactionModel() {
            return this.activityTransactionModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel = this.activityTransactionModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToActivityDetailScreen(activityTransactionModel=");
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
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToActivityDetailScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityTransactionModel, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToActivityDetailScreen) other).activityTransactionModel);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToActivityDetailScreen copy(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToActivityDetailScreen(activityTransactionModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel getActivityTransactionModel() {
            return this.activityTransactionModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToActivityDetailScreen copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToActivityDetailScreen navigateToActivityDetailScreen, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityTransactionModel = navigateToActivityDetailScreen.activityTransactionModel;
            }
            return navigateToActivityDetailScreen.copy(activityTransactionModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$HandleActivityTransactionPrimaryAction;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "primaryActionModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$HandleActivityTransactionPrimaryAction;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "getPrimaryActionModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HandleActivityTransactionPrimaryAction extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel primaryActionModel;

        public HandleActivityTransactionPrimaryAction(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
            super("HandleActivityTransactionPrimaryAction", null);
            this.primaryActionModel = activityActionModel;
        }

        public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel getPrimaryActionModel() {
            return this.primaryActionModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel = this.primaryActionModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HandleActivityTransactionPrimaryAction(primaryActionModel=");
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
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleActivityTransactionPrimaryAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryActionModel, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleActivityTransactionPrimaryAction) other).primaryActionModel);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleActivityTransactionPrimaryAction copy(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel primaryActionModel) {
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleActivityTransactionPrimaryAction(primaryActionModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel getPrimaryActionModel() {
            return this.primaryActionModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleActivityTransactionPrimaryAction copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleActivityTransactionPrimaryAction handleActivityTransactionPrimaryAction, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityActionModel = handleActivityTransactionPrimaryAction.primaryActionModel;
            }
            return handleActivityTransactionPrimaryAction.copy(activityActionModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$NavigateToPackageDetailScreen;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect;", "Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageDetailDestination;", "destinationKey", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageDetailDestination;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageDetailDestination;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageDetailDestination;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$NavigateToPackageDetailScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageDetailDestination;", "getDestinationKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPackageDetailScreen extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination destinationKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToPackageDetailScreen(com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination packageDetailDestination) {
            super("NavigateToPackageDetailScreen", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageDetailDestination, "");
            this.destinationKey = packageDetailDestination;
        }

        public final com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination getDestinationKey() {
            return this.destinationKey;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination packageDetailDestination = this.destinationKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPackageDetailScreen(destinationKey=");
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
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPackageDetailScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationKey, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPackageDetailScreen) other).destinationKey);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPackageDetailScreen copy(com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination destinationKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationKey, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPackageDetailScreen(destinationKey);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination getDestinationKey() {
            return this.destinationKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPackageDetailScreen copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPackageDetailScreen navigateToPackageDetailScreen, com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination packageDetailDestination, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                packageDetailDestination = navigateToPackageDetailScreen.destinationKey;
            }
            return navigateToPackageDetailScreen.copy(packageDetailDestination);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$NavigateToPromotionalRewardScreen;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect;", "Lcom/paypal/oslo/feature/activity/api/navigation/ActivityPromotionalRewardsDetailsDestinationKey;", "destinationKey", "<init>", "(Lcom/paypal/oslo/feature/activity/api/navigation/ActivityPromotionalRewardsDetailsDestinationKey;)V", "component1", "()Lcom/paypal/oslo/feature/activity/api/navigation/ActivityPromotionalRewardsDetailsDestinationKey;", "copy", "(Lcom/paypal/oslo/feature/activity/api/navigation/ActivityPromotionalRewardsDetailsDestinationKey;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$NavigateToPromotionalRewardScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/api/navigation/ActivityPromotionalRewardsDetailsDestinationKey;", "getDestinationKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPromotionalRewardScreen extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect {
        public static final int $stable = com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey.$stable;
        private final com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey destinationKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToPromotionalRewardScreen(com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey activityPromotionalRewardsDetailsDestinationKey) {
            super("NavigateToPromotionalRewardScreen", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityPromotionalRewardsDetailsDestinationKey, "");
            this.destinationKey = activityPromotionalRewardsDetailsDestinationKey;
        }

        public final com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey getDestinationKey() {
            return this.destinationKey;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey activityPromotionalRewardsDetailsDestinationKey = this.destinationKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPromotionalRewardScreen(destinationKey=");
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
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPromotionalRewardScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationKey, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPromotionalRewardScreen) other).destinationKey);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPromotionalRewardScreen copy(com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey destinationKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationKey, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPromotionalRewardScreen(destinationKey);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey getDestinationKey() {
            return this.destinationKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPromotionalRewardScreen copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPromotionalRewardScreen navigateToPromotionalRewardScreen, com.paypal.oslo.feature.activity.api.navigation.ActivityPromotionalRewardsDetailsDestinationKey activityPromotionalRewardsDetailsDestinationKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityPromotionalRewardsDetailsDestinationKey = navigateToPromotionalRewardScreen.destinationKey;
            }
            return navigateToPromotionalRewardScreen.copy(activityPromotionalRewardsDetailsDestinationKey);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$NavigateToSearchScreen;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSearchScreen extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToSearchScreen INSTANCE = new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToSearchScreen();

        public final int hashCode() {
            return 1995160291;
        }

        private NavigateToSearchScreen() {
            super("NavigateToSearchScreen", null);
        }

        public final java.lang.String toString() {
            return "NavigateToSearchScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToSearchScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$HandleXoomActivityTransactionTilePressed;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect;", "Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;", "Lcom/paypal/oslo/feature/activity/domain/common/extensions/XoomTransactionDestinationKey;", "destinationKey", "<init>", "(Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;)V", "component1", "()Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;", "copy", "(Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$HandleXoomActivityTransactionTilePressed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;", "getDestinationKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HandleXoomActivityTransactionTilePressed extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination destinationKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandleXoomActivityTransactionTilePressed(com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination activityDetailsDestination) {
            super("HandleXoomActivityTransactionTilePressed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailsDestination, "");
            this.destinationKey = activityDetailsDestination;
        }

        public final com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination getDestinationKey() {
            return this.destinationKey;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination activityDetailsDestination = this.destinationKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HandleXoomActivityTransactionTilePressed(destinationKey=");
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
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleXoomActivityTransactionTilePressed) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationKey, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleXoomActivityTransactionTilePressed) other).destinationKey);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleXoomActivityTransactionTilePressed copy(com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination destinationKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationKey, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleXoomActivityTransactionTilePressed(destinationKey);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination getDestinationKey() {
            return this.destinationKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleXoomActivityTransactionTilePressed copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleXoomActivityTransactionTilePressed handleXoomActivityTransactionTilePressed, com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination activityDetailsDestination, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailsDestination = handleXoomActivityTransactionTilePressed.destinationKey;
            }
            return handleXoomActivityTransactionTilePressed.copy(activityDetailsDestination);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$HandlePackageTrackingLinkEmailPressed;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect;", "Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageSettingsDestination;", "destinationKey", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageSettingsDestination;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageSettingsDestination;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageSettingsDestination;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect$HandlePackageTrackingLinkEmailPressed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/api/navigation/PackageSettingsDestination;", "getDestinationKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HandlePackageTrackingLinkEmailPressed extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination destinationKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlePackageTrackingLinkEmailPressed(com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination packageSettingsDestination) {
            super("HandlePackageTrackingLinkEmailPressed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageSettingsDestination, "");
            this.destinationKey = packageSettingsDestination;
        }

        public final com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination getDestinationKey() {
            return this.destinationKey;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination packageSettingsDestination = this.destinationKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HandlePackageTrackingLinkEmailPressed(destinationKey=");
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
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandlePackageTrackingLinkEmailPressed) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationKey, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandlePackageTrackingLinkEmailPressed) other).destinationKey);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandlePackageTrackingLinkEmailPressed copy(com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination destinationKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationKey, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandlePackageTrackingLinkEmailPressed(destinationKey);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination getDestinationKey() {
            return this.destinationKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandlePackageTrackingLinkEmailPressed copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandlePackageTrackingLinkEmailPressed handlePackageTrackingLinkEmailPressed, com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination packageSettingsDestination, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                packageSettingsDestination = handlePackageTrackingLinkEmailPressed.destinationKey;
            }
            return handlePackageTrackingLinkEmailPressed.copy(packageSettingsDestination);
        }
    }

    public /* synthetic */ ActivityLedgerUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
