package com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnLoad", "OnLoadSuccess", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_NAVIGATE_TO_ERROR, "OnRetry", "OnTrackerClick", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent$OnLoad;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent$OnLoadError;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent$OnLoadSuccess;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent$OnRetry;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent$OnTrackerClick;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class RewardsLandingEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RewardsLandingEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent$OnLoad;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoad extends com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoad INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoad();

        public final int hashCode() {
            return 525902768;
        }

        private OnLoad() {
            super("OnLoad", null);
        }

        public final java.lang.String toString() {
            return "OnLoad";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoad)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent$OnLoadSuccess;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/RewardsLandingUiData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/RewardsLandingUiData;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/RewardsLandingUiData;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/RewardsLandingUiData;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent$OnLoadSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/models/RewardsLandingUiData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadSuccess extends com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiData data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadSuccess(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiData rewardsLandingUiData) {
            super("OnLoadSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsLandingUiData, "");
            this.data = rewardsLandingUiData;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiData getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiData rewardsLandingUiData = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadSuccess(data=");
            sb.append(rewardsLandingUiData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoadSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoadSuccess) other).data);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoadSuccess copy(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiData data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoadSuccess(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoadSuccess copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoadSuccess onLoadSuccess, com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiData rewardsLandingUiData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rewardsLandingUiData = onLoadSuccess.data;
            }
            return onLoadSuccess.copy(rewardsLandingUiData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent$OnLoadError;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "errorType", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent$OnLoadError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadError extends com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadError(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_NAVIGATE_TO_ERROR, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorStateType, "");
            this.errorType = errorStateType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadError(errorType=");
            sb.append(errorStateType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoadError) && this.errorType == ((com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoadError) other).errorType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoadError copy(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoadError(errorType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoadError copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnLoadError onLoadError, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorStateType = onLoadError.errorType;
            }
            return onLoadError.copy(errorStateType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent$OnRetry;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRetry extends com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnRetry INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnRetry();

        public final int hashCode() {
            return -871621346;
        }

        private OnRetry() {
            super("OnRetry", null);
        }

        public final java.lang.String toString() {
            return "OnRetry";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnRetry)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent$OnTrackerClick;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/landing/ui/mvi/RewardsLandingEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTrackerClick extends com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnTrackerClick INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnTrackerClick();

        public final int hashCode() {
            return 1097283066;
        }

        private OnTrackerClick() {
            super("OnTrackerClick", null);
        }

        public final java.lang.String toString() {
            return "OnTrackerClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingEvent.OnTrackerClick)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ RewardsLandingEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
