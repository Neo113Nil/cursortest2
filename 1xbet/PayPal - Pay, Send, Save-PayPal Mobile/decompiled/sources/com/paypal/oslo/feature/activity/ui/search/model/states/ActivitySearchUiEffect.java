package com.paypal.oslo.feature.activity.ui.search.model.states;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "NavigateToActivityDetailScreen", "HandleSearchResultPrimaryAction", "HandleXoomTransactionTileAction", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect$HandleSearchResultPrimaryAction;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect$HandleXoomTransactionTileAction;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect$NavigateToActivityDetailScreen;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ActivitySearchUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ActivitySearchUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.NavigateBack();

        public final int hashCode() {
            return 144789821;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect$NavigateToActivityDetailScreen;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "activityTransactionModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;)Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect$NavigateToActivityDetailScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "getActivityTransactionModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToActivityDetailScreen extends com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect {
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
            return (other instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.NavigateToActivityDetailScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.activityTransactionModel, ((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.NavigateToActivityDetailScreen) other).activityTransactionModel);
        }

        public final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.NavigateToActivityDetailScreen copy(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
            return new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.NavigateToActivityDetailScreen(activityTransactionModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel getActivityTransactionModel() {
            return this.activityTransactionModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.NavigateToActivityDetailScreen copy$default(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.NavigateToActivityDetailScreen navigateToActivityDetailScreen, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityTransactionModel = navigateToActivityDetailScreen.activityTransactionModel;
            }
            return navigateToActivityDetailScreen.copy(activityTransactionModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect$HandleSearchResultPrimaryAction;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "primaryActionModel", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;)Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect$HandleSearchResultPrimaryAction;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "getPrimaryActionModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HandleSearchResultPrimaryAction extends com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel primaryActionModel;

        public HandleSearchResultPrimaryAction(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
            super("HandleSearchResultPrimaryAction", null);
            this.primaryActionModel = activityActionModel;
        }

        public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel getPrimaryActionModel() {
            return this.primaryActionModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel = this.primaryActionModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HandleSearchResultPrimaryAction(primaryActionModel=");
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
            return (other instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleSearchResultPrimaryAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryActionModel, ((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleSearchResultPrimaryAction) other).primaryActionModel);
        }

        public final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleSearchResultPrimaryAction copy(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel primaryActionModel) {
            return new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleSearchResultPrimaryAction(primaryActionModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel getPrimaryActionModel() {
            return this.primaryActionModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleSearchResultPrimaryAction copy$default(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleSearchResultPrimaryAction handleSearchResultPrimaryAction, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityActionModel = handleSearchResultPrimaryAction.primaryActionModel;
            }
            return handleSearchResultPrimaryAction.copy(activityActionModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect$HandleXoomTransactionTileAction;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect;", "Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;", "Lcom/paypal/oslo/feature/activity/domain/common/extensions/XoomTransactionDestinationKey;", "destinationKey", "<init>", "(Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;)V", "component1", "()Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;", "copy", "(Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;)Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect$HandleXoomTransactionTileAction;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/xoom/api/navigation/ActivityDetailsDestination;", "getDestinationKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HandleXoomTransactionTileAction extends com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination destinationKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandleXoomTransactionTileAction(com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination activityDetailsDestination) {
            super("HandleXoomTransactionTileAction", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailsDestination, "");
            this.destinationKey = activityDetailsDestination;
        }

        public final com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination getDestinationKey() {
            return this.destinationKey;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination activityDetailsDestination = this.destinationKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HandleXoomTransactionTileAction(destinationKey=");
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
            return (other instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleXoomTransactionTileAction) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationKey, ((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleXoomTransactionTileAction) other).destinationKey);
        }

        public final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleXoomTransactionTileAction copy(com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination destinationKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationKey, "");
            return new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleXoomTransactionTileAction(destinationKey);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination getDestinationKey() {
            return this.destinationKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleXoomTransactionTileAction copy$default(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleXoomTransactionTileAction handleXoomTransactionTileAction, com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination activityDetailsDestination, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDetailsDestination = handleXoomTransactionTileAction.destinationKey;
            }
            return handleXoomTransactionTileAction.copy(activityDetailsDestination);
        }
    }

    public /* synthetic */ ActivitySearchUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
