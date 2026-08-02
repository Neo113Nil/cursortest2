package com.paypal.oslo.feature.activity.ui.ledger.model.states;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0011\u0012"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "activityFilterType", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "getActivityFilterType", "()Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "LedgerInitialState", "LedgerFilterState", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState$LedgerFilterState;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState$LedgerInitialState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ActivityLedgerScreenState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType;
    private final java.lang.String name;

    private ActivityLedgerScreenState(java.lang.String str) {
        this.name = str;
        this.activityFilterType = new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(null, 1, null);
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    public com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getActivityFilterType() {
        return this.activityFilterType;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState$LedgerInitialState;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "activityFilterType", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState$LedgerInitialState;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "getActivityFilterType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LedgerInitialState extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LedgerInitialState(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
            super("LedgerInitialState", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
            this.activityFilterType = activityFilterType;
        }

        public /* synthetic */ LedgerInitialState(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default r1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(null, 1, null) : r1);
        }

        @Override // com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState
        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getActivityFilterType() {
            return this.activityFilterType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType = this.activityFilterType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LedgerInitialState(activityFilterType=");
            sb.append(activityFilterType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityFilterType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityFilterType, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState) other).activityFilterType);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState copy(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState(activityFilterType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getActivityFilterType() {
            return this.activityFilterType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerInitialState ledgerInitialState, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityFilterType = ledgerInitialState.activityFilterType;
            }
            return ledgerInitialState.copy(activityFilterType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LedgerInitialState() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState$LedgerFilterState;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "activityFilterType", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState$LedgerFilterState;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "getActivityFilterType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LedgerFilterState extends com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LedgerFilterState(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
            super("LedgerFilterState", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
            this.activityFilterType = activityFilterType;
        }

        public /* synthetic */ LedgerFilterState(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default r1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(null, 1, null) : r1);
        }

        @Override // com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState
        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getActivityFilterType() {
            return this.activityFilterType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType = this.activityFilterType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LedgerFilterState(activityFilterType=");
            sb.append(activityFilterType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.activityFilterType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityFilterType, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState) other).activityFilterType);
        }

        public final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState copy(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
            return new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState(activityFilterType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType getActivityFilterType() {
            return this.activityFilterType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.LedgerFilterState ledgerFilterState, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityFilterType = ledgerFilterState.activityFilterType;
            }
            return ledgerFilterState.copy(activityFilterType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LedgerFilterState() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ ActivityLedgerScreenState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
