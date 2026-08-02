package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u000b\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnLoad", "OnReload", "OnLoadSuccess", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_NAVIGATE_TO_ERROR, "OnRetry", "OnClick", "OnChangeTab", "OnOfferActivated", "OnCategorySelectionChanged", "OnRedemptionCompleted", "OnToastDisappeared", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnCategorySelectionChanged;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnChangeTab;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnLoad;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnLoadError;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnLoadSuccess;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnOfferActivated;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnRedemptionCompleted;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnReload;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnRetry;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnToastDisappeared;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class RewardsSummaryEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RewardsSummaryEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnLoad;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent;", "Landroidx/navigation3/runtime/NavKey;", "initialDestination", "deferredDestination", "<init>", "(Landroidx/navigation3/runtime/NavKey;Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "component2", "copy", "(Landroidx/navigation3/runtime/NavKey;Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnLoad;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getInitialDestination", "getDeferredDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoad extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey deferredDestination;
        private final androidx.navigation3.runtime.NavKey initialDestination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoad(androidx.navigation3.runtime.NavKey navKey, androidx.navigation3.runtime.NavKey navKey2) {
            super("OnLoad", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
            this.initialDestination = navKey;
            this.deferredDestination = navKey2;
        }

        public final androidx.navigation3.runtime.NavKey getInitialDestination() {
            return this.initialDestination;
        }

        public final androidx.navigation3.runtime.NavKey getDeferredDestination() {
            return this.deferredDestination;
        }

        public final java.lang.String toString() {
            androidx.navigation3.runtime.NavKey navKey = this.initialDestination;
            androidx.navigation3.runtime.NavKey navKey2 = this.deferredDestination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoad(initialDestination=");
            sb.append(navKey);
            sb.append(", deferredDestination=");
            sb.append(navKey2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.initialDestination.hashCode();
            androidx.navigation3.runtime.NavKey navKey = this.deferredDestination;
            return (hashCode * 31) + (navKey == null ? 0 : navKey.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoad)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoad onLoad = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoad) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.initialDestination, onLoad.initialDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.deferredDestination, onLoad.deferredDestination);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoad copy(androidx.navigation3.runtime.NavKey initialDestination, androidx.navigation3.runtime.NavKey deferredDestination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialDestination, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoad(initialDestination, deferredDestination);
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDeferredDestination() {
            return this.deferredDestination;
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getInitialDestination() {
            return this.initialDestination;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoad copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoad onLoad, androidx.navigation3.runtime.NavKey navKey, androidx.navigation3.runtime.NavKey navKey2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                navKey = onLoad.initialDestination;
            }
            if ((i & 2) != 0) {
                navKey2 = onLoad.deferredDestination;
            }
            return onLoad.copy(navKey, navKey2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnReload;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnReload extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnReload INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnReload();

        public final int hashCode() {
            return -1890390207;
        }

        private OnReload() {
            super("OnReload", null);
        }

        public final java.lang.String toString() {
            return "OnReload";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnReload)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnLoadSuccess;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/models/RewardsSummaryUiData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroidx/navigation3/runtime/NavKey;", "deferredDestination", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/models/RewardsSummaryUiData;Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/models/RewardsSummaryUiData;", "component2", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/models/RewardsSummaryUiData;Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnLoadSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/models/RewardsSummaryUiData;", "getData", "Landroidx/navigation3/runtime/NavKey;", "getDeferredDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadSuccess extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData data;
        private final androidx.navigation3.runtime.NavKey deferredDestination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadSuccess(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData rewardsSummaryUiData, androidx.navigation3.runtime.NavKey navKey) {
            super("OnLoadSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsSummaryUiData, "");
            this.data = rewardsSummaryUiData;
            this.deferredDestination = navKey;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData getData() {
            return this.data;
        }

        public final androidx.navigation3.runtime.NavKey getDeferredDestination() {
            return this.deferredDestination;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData rewardsSummaryUiData = this.data;
            androidx.navigation3.runtime.NavKey navKey = this.deferredDestination;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadSuccess(data=");
            sb.append(rewardsSummaryUiData);
            sb.append(", deferredDestination=");
            sb.append(navKey);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.data.hashCode();
            androidx.navigation3.runtime.NavKey navKey = this.deferredDestination;
            return (hashCode * 31) + (navKey == null ? 0 : navKey.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadSuccess onLoadSuccess = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, onLoadSuccess.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.deferredDestination, onLoadSuccess.deferredDestination);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadSuccess copy(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData data, androidx.navigation3.runtime.NavKey deferredDestination) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadSuccess(data, deferredDestination);
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.navigation3.runtime.NavKey getDeferredDestination() {
            return this.deferredDestination;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadSuccess copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadSuccess onLoadSuccess, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.RewardsSummaryUiData rewardsSummaryUiData, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rewardsSummaryUiData = onLoadSuccess.data;
            }
            if ((i & 2) != 0) {
                navKey = onLoadSuccess.deferredDestination;
            }
            return onLoadSuccess.copy(rewardsSummaryUiData, navKey);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnLoadError;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent;", "", "tabIndex", "Landroidx/navigation3/runtime/NavKey;", "deferredDestination", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "errorType", "<init>", "(ILandroidx/navigation3/runtime/NavKey;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)V", "component1", "()I", "component2", "()Landroidx/navigation3/runtime/NavKey;", "component3", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "copy", "(ILandroidx/navigation3/runtime/NavKey;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnLoadError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTabIndex", "Landroidx/navigation3/runtime/NavKey;", "getDeferredDestination", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadError extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent {
        public static final int $stable = 8;
        private final androidx.navigation3.runtime.NavKey deferredDestination;
        private final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType;
        private final int tabIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadError(int i, androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_NAVIGATE_TO_ERROR, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorStateType, "");
            this.tabIndex = i;
            this.deferredDestination = navKey;
            this.errorType = errorStateType;
        }

        public final int getTabIndex() {
            return this.tabIndex;
        }

        public final androidx.navigation3.runtime.NavKey getDeferredDestination() {
            return this.deferredDestination;
        }

        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            int i = this.tabIndex;
            androidx.navigation3.runtime.NavKey navKey = this.deferredDestination;
            com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadError(tabIndex=");
            sb.append(i);
            sb.append(", deferredDestination=");
            sb.append(navKey);
            sb.append(", errorType=");
            sb.append(errorStateType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.tabIndex);
            androidx.navigation3.runtime.NavKey navKey = this.deferredDestination;
            return (((hashCode * 31) + (navKey == null ? 0 : navKey.hashCode())) * 31) + this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadError)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadError onLoadError = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadError) other;
            return this.tabIndex == onLoadError.tabIndex && kotlin.jvm.internal.Intrinsics.areEqual(this.deferredDestination, onLoadError.deferredDestination) && this.errorType == onLoadError.errorType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadError copy(int tabIndex, androidx.navigation3.runtime.NavKey deferredDestination, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadError(tabIndex, deferredDestination, errorType);
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
        public final int getTabIndex() {
            return this.tabIndex;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadError copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnLoadError onLoadError, int i, androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = onLoadError.tabIndex;
            }
            if ((i2 & 2) != 0) {
                navKey = onLoadError.deferredDestination;
            }
            if ((i2 & 4) != 0) {
                errorStateType = onLoadError.errorType;
            }
            return onLoadError.copy(i, navKey, errorStateType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnRetry;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRetry extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnRetry INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnRetry();

        public final int hashCode() {
            return -615161856;
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
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnRetry)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u0006\u0007\b\t\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent;", "", "p0", "<init>", "(Ljava/lang/String;)V", "TargetingUnit", "CategorySelection", "SeeAllActiveOffers", "OfferClickEvent", "InactiveOffer", "ActiveOffer", "RedeemCard", "SingleCtaOffer", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$ActiveOffer;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$CategorySelection;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$InactiveOffer;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$RedeemCard;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$SeeAllActiveOffers;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$SingleCtaOffer;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$TargetingUnit;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class OnClick extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$OfferClickEvent;", "", "", "getOfferId", "()Ljava/lang/String;", "offerId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public interface OfferClickEvent {
            java.lang.String getOfferId();
        }

        private OnClick(java.lang.String str) {
            super(str, null);
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$TargetingUnit;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick;", "", "targetingUnitId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$TargetingUnit;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTargetingUnitId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class TargetingUnit extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick {
            public static final int $stable = 0;
            private final java.lang.String targetingUnitId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TargetingUnit(java.lang.String str) {
                super("OnClick.TargetingUnit", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.targetingUnitId = str;
            }

            public final java.lang.String getTargetingUnitId() {
                return this.targetingUnitId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.targetingUnitId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("TargetingUnit(targetingUnitId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.targetingUnitId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.TargetingUnit) && kotlin.jvm.internal.Intrinsics.areEqual(this.targetingUnitId, ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.TargetingUnit) other).targetingUnitId);
            }

            public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.TargetingUnit copy(java.lang.String targetingUnitId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetingUnitId, "");
                return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.TargetingUnit(targetingUnitId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getTargetingUnitId() {
                return this.targetingUnitId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.TargetingUnit copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.TargetingUnit targetingUnit, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = targetingUnit.targetingUnitId;
                }
                return targetingUnit.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$CategorySelection;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CategorySelection extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.CategorySelection INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.CategorySelection();

            public final int hashCode() {
                return 1249017472;
            }

            private CategorySelection() {
                super("OnClick.CategorySelection", null);
            }

            public final java.lang.String toString() {
                return "CategorySelection";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.CategorySelection)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$SeeAllActiveOffers;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SeeAllActiveOffers extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.SeeAllActiveOffers INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.SeeAllActiveOffers();

            public final int hashCode() {
                return -926077543;
            }

            private SeeAllActiveOffers() {
                super("OnClick.SeeAllActiveOffers", null);
            }

            public final java.lang.String toString() {
                return "SeeAllActiveOffers";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.SeeAllActiveOffers)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$InactiveOffer;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$OfferClickEvent;", "", "offerId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$InactiveOffer;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOfferId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class InactiveOffer extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick implements com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.OfferClickEvent {
            public static final int $stable = 0;
            private final java.lang.String offerId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InactiveOffer(java.lang.String str) {
                super("OnClick.InactiveOfferChoose", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.offerId = str;
            }

            @Override // com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.OfferClickEvent
            public final java.lang.String getOfferId() {
                return this.offerId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.offerId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("InactiveOffer(offerId=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.offerId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.InactiveOffer) && kotlin.jvm.internal.Intrinsics.areEqual(this.offerId, ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.InactiveOffer) other).offerId);
            }

            public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.InactiveOffer copy(java.lang.String offerId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
                return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.InactiveOffer(offerId);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getOfferId() {
                return this.offerId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.InactiveOffer copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.InactiveOffer inactiveOffer, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = inactiveOffer.offerId;
                }
                return inactiveOffer.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$ActiveOffer;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$OfferClickEvent;", "", "offerId", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffercard/ActiveOfferClickType;", "clickType", "touchpointId", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffercard/ActiveOfferClickType;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffercard/ActiveOfferClickType;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffercard/ActiveOfferClickType;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$ActiveOffer;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOfferId", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/activeoffercard/ActiveOfferClickType;", "getClickType", "getTouchpointId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ActiveOffer extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick implements com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.OfferClickEvent {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType clickType;
            private final java.lang.String offerId;
            private final java.lang.String touchpointId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActiveOffer(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType activeOfferClickType, java.lang.String str2) {
                super("OnClick.ActiveOffer", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeOfferClickType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.offerId = str;
                this.clickType = activeOfferClickType;
                this.touchpointId = str2;
            }

            @Override // com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.OfferClickEvent
            public final java.lang.String getOfferId() {
                return this.offerId;
            }

            public /* synthetic */ ActiveOffer(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType activeOfferClickType, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType.DEFAULT : activeOfferClickType, (i & 4) != 0 ? "" : str2);
            }

            public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType getClickType() {
                return this.clickType;
            }

            public final java.lang.String getTouchpointId() {
                return this.touchpointId;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.offerId;
                com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType activeOfferClickType = this.clickType;
                java.lang.String str2 = this.touchpointId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ActiveOffer(offerId=");
                sb.append(str);
                sb.append(", clickType=");
                sb.append(activeOfferClickType);
                sb.append(", touchpointId=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (((this.offerId.hashCode() * 31) + this.clickType.hashCode()) * 31) + this.touchpointId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.ActiveOffer)) {
                    return false;
                }
                com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.ActiveOffer activeOffer = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.ActiveOffer) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.offerId, activeOffer.offerId) && this.clickType == activeOffer.clickType && kotlin.jvm.internal.Intrinsics.areEqual(this.touchpointId, activeOffer.touchpointId);
            }

            public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.ActiveOffer copy(java.lang.String offerId, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType clickType, java.lang.String touchpointId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(touchpointId, "");
                return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.ActiveOffer(offerId, clickType, touchpointId);
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getTouchpointId() {
                return this.touchpointId;
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType getClickType() {
                return this.clickType;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getOfferId() {
                return this.offerId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.ActiveOffer copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.ActiveOffer activeOffer, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.activeoffercard.ActiveOfferClickType activeOfferClickType, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = activeOffer.offerId;
                }
                if ((i & 2) != 0) {
                    activeOfferClickType = activeOffer.clickType;
                }
                if ((i & 4) != 0) {
                    str2 = activeOffer.touchpointId;
                }
                return activeOffer.copy(str, activeOfferClickType, str2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$RedeemCard;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick;", "Landroidx/navigation3/runtime/NavKey;", "destination", "<init>", "(Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$RedeemCard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/navigation3/runtime/NavKey;", "getDestination"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class RedeemCard extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick {
            public static final int $stable = 8;
            private final androidx.navigation3.runtime.NavKey destination;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RedeemCard(androidx.navigation3.runtime.NavKey navKey) {
                super("OnClick.RedeemCard", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
                this.destination = navKey;
            }

            public final androidx.navigation3.runtime.NavKey getDestination() {
                return this.destination;
            }

            public final java.lang.String toString() {
                androidx.navigation3.runtime.NavKey navKey = this.destination;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("RedeemCard(destination=");
                sb.append(navKey);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.destination.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.RedeemCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.destination, ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.RedeemCard) other).destination);
            }

            public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.RedeemCard copy(androidx.navigation3.runtime.NavKey destination) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
                return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.RedeemCard(destination);
            }

            /* renamed from: component1, reason: from getter */
            public final androidx.navigation3.runtime.NavKey getDestination() {
                return this.destination;
            }

            public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.RedeemCard copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.RedeemCard redeemCard, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    navKey = redeemCard.destination;
                }
                return redeemCard.copy(navKey);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$SingleCtaOffer;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent$SingleCtaNavigationType;", "navigationType", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent$SingleCtaNavigationType;)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent$SingleCtaNavigationType;", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent$SingleCtaNavigationType;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnClick$SingleCtaOffer;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/models/EarnContent$SingleCtaNavigationType;", "getNavigationType"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SingleCtaOffer extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick {
            public static final int $stable = 0;
            private final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.SingleCtaNavigationType navigationType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SingleCtaOffer(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.SingleCtaNavigationType singleCtaNavigationType) {
                super("OnClick.SingleCtaOffer", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(singleCtaNavigationType, "");
                this.navigationType = singleCtaNavigationType;
            }

            public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.SingleCtaNavigationType getNavigationType() {
                return this.navigationType;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.SingleCtaNavigationType singleCtaNavigationType = this.navigationType;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SingleCtaOffer(navigationType=");
                sb.append(singleCtaNavigationType);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.navigationType.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.SingleCtaOffer) && this.navigationType == ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.SingleCtaOffer) other).navigationType;
            }

            public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.SingleCtaOffer copy(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.SingleCtaNavigationType navigationType) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationType, "");
                return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.SingleCtaOffer(navigationType);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.SingleCtaNavigationType getNavigationType() {
                return this.navigationType;
            }

            public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.SingleCtaOffer copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnClick.SingleCtaOffer singleCtaOffer, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.models.EarnContent.SingleCtaNavigationType singleCtaNavigationType, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    singleCtaNavigationType = singleCtaOffer.navigationType;
                }
                return singleCtaOffer.copy(singleCtaNavigationType);
            }
        }

        public /* synthetic */ OnClick(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnChangeTab;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent;", "", "tabIndex", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnChangeTab;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getTabIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnChangeTab extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent {
        public static final int $stable = 0;
        private final int tabIndex;

        public OnChangeTab(int i) {
            super("OnChangeTab", null);
            this.tabIndex = i;
        }

        public final int getTabIndex() {
            return this.tabIndex;
        }

        public final java.lang.String toString() {
            int i = this.tabIndex;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnChangeTab(tabIndex=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.tabIndex);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnChangeTab) && this.tabIndex == ((com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnChangeTab) other).tabIndex;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnChangeTab copy(int tabIndex) {
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnChangeTab(tabIndex);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTabIndex() {
            return this.tabIndex;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnChangeTab copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnChangeTab onChangeTab, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = onChangeTab.tabIndex;
            }
            return onChangeTab.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnOfferActivated;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnOfferActivated extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnOfferActivated INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnOfferActivated();

        public final int hashCode() {
            return -1041564547;
        }

        private OnOfferActivated() {
            super("OnOfferActivated", null);
        }

        public final java.lang.String toString() {
            return "OnOfferActivated";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnOfferActivated)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnCategorySelectionChanged;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnCategorySelectionChanged extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnCategorySelectionChanged INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnCategorySelectionChanged();

        public final int hashCode() {
            return 927960142;
        }

        private OnCategorySelectionChanged() {
            super("OnCategorySelectionChanged", null);
        }

        public final java.lang.String toString() {
            return "OnCategorySelectionChanged";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnCategorySelectionChanged)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnRedemptionCompleted;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRedemptionCompleted extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnRedemptionCompleted INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnRedemptionCompleted();

        public final int hashCode() {
            return 736980920;
        }

        private OnRedemptionCompleted() {
            super("OnRedemptionCompleted", null);
        }

        public final java.lang.String toString() {
            return "OnRedemptionCompleted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnRedemptionCompleted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent$OnToastDisappeared;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnToastDisappeared extends com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnToastDisappeared INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnToastDisappeared();

        public final int hashCode() {
            return -1252139389;
        }

        private OnToastDisappeared() {
            super("OnToastDisappeared", null);
        }

        public final java.lang.String toString() {
            return "OnToastDisappeared";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryEvent.OnToastDisappeared)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ RewardsSummaryEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
