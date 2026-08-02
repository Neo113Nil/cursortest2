package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Error", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState$Error;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState$Initial;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState$Loading;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class RewardsSummaryUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RewardsSummaryUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState$Initial;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Initial INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Initial();

        public final int hashCode() {
            return -1589678786;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState$Loading;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState;", "Landroidx/navigation3/runtime/NavKey;", "deferredDestination", "<init>", "(Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDeferredDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey deferredDestination;

        public Loading(androidx.navigation3.runtime.NavKey navKey) {
            super("Loading", null);
            this.deferredDestination = navKey;
        }

        public final androidx.navigation3.runtime.NavKey getDeferredDestination() {
            return this.deferredDestination;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.deferredDestination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(deferredDestination=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            androidx.navigation3.runtime.NavKey navKey = this.deferredDestination;
            if (navKey == null) {
                return 0;
            }
            return navKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.deferredDestination, ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Loading) other).deferredDestination);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Loading copy(androidx.navigation3.runtime.NavKey deferredDestination) {
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Loading(deferredDestination);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDeferredDestination() {
            return this.deferredDestination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Loading copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Loading loading, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = loading.deferredDestination;
            }
            return loading.copy(navKey);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState$Ready;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/models/RewardsSummaryUiData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/models/RewardsSummaryUiData;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/models/RewardsSummaryUiData;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/models/RewardsSummaryUiData;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/models/RewardsSummaryUiData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData rewardsSummaryUiData) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsSummaryUiData, "");
            this.data = rewardsSummaryUiData;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData rewardsSummaryUiData = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(data=");
            sb.append(rewardsSummaryUiData);
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
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Ready) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Ready) other).data);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Ready copy(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Ready(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Ready copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Ready ready, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData rewardsSummaryUiData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rewardsSummaryUiData = ready.data;
            }
            return ready.copy(rewardsSummaryUiData);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState$Error;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState;", "", "selectedTabIndex", "Landroidx/navigation3/runtime/NavKey;", "deferredDestination", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "errorType", "<init>", "(ILandroidx/navigation3/runtime/NavKey;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)V", "component1", "()I", "component2", "()Landroidx/navigation3/runtime/NavKey;", "component3", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "copy", "(ILandroidx/navigation3/runtime/NavKey;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getSelectedTabIndex", "Landroidx/navigation3/runtime/NavKey;", "getDeferredDestination", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey deferredDestination;
        private final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType;
        private final int selectedTabIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(int i, androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorStateType, "");
            this.selectedTabIndex = i;
            this.deferredDestination = navKey;
            this.errorType = errorStateType;
        }

        public /* synthetic */ Error(int i, androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, navKey, errorStateType);
        }

        public final int getSelectedTabIndex() {
            return this.selectedTabIndex;
        }

        public final androidx.navigation3.runtime.NavKey getDeferredDestination() {
            return this.deferredDestination;
        }

        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            int i = this.selectedTabIndex;
            androidx.navigation3.runtime.NavKey navKey = this.deferredDestination;
            com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(selectedTabIndex=");
            sb.append(i);
            sb.append(", deferredDestination=");
            sb.append(navKey);
            sb.append(", errorType=");
            sb.append(errorStateType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.selectedTabIndex);
            androidx.navigation3.runtime.NavKey navKey = this.deferredDestination;
            return (((hashCode * 31) + (navKey == null ? 0 : navKey.hashCode())) * 31) + this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Error error = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Error) other;
            return this.selectedTabIndex == error.selectedTabIndex && kotlin.jvm.internal.Intrinsics.areEqual(this.deferredDestination, error.deferredDestination) && this.errorType == error.errorType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Error copy(int selectedTabIndex, androidx.navigation3.runtime.NavKey deferredDestination, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Error(selectedTabIndex, deferredDestination, errorType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDeferredDestination() {
            return this.deferredDestination;
        }

        /* renamed from: component1, reason: from getter */
        public final int getSelectedTabIndex() {
            return this.selectedTabIndex;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Error copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Error error, int i, androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = error.selectedTabIndex;
            }
            if ((i2 & 2) != 0) {
                navKey = error.deferredDestination;
            }
            if ((i2 & 4) != 0) {
                errorStateType = error.errorType;
            }
            return error.copy(i, navKey, errorStateType);
        }
    }

    public /* synthetic */ RewardsSummaryUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
