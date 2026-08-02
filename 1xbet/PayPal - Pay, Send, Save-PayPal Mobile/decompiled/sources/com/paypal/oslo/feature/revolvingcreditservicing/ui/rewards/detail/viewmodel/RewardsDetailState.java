package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "InitializingUiModel", "Loading", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Error", "PaymentPastDueError", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$InitializingUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$Loading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$PaymentPastDueError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class RewardsDetailState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RewardsDetailState(java.lang.String str) {
        this.name = str;
    }

    public /* synthetic */ RewardsDetailState(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "RewardsDetailState" : str, null);
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Initial INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Initial();

        public final int hashCode() {
            return -1331711355;
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
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$InitializingUiModel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "rewardsSummary", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;", "productFeatureOffers", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;", "rewardsContentUrls", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$InitializingUiModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "getRewardsSummary", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;", "getProductFeatureOffers", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;", "getRewardsContentUrls"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitializingUiModel extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary;

        public InitializingUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls) {
            super("InitializingUiModel", null);
            this.rewardsSummary = rewardsSummary;
            this.productFeatureOffers = productFeatureOffers;
            this.rewardsContentUrls = rewardsContentUrls;
        }

        public /* synthetic */ InitializingUiModel(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(rewardsSummary, productFeatureOffers, (i & 4) != 0 ? null : rewardsContentUrls);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary getRewardsSummary() {
            return this.rewardsSummary;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers getProductFeatureOffers() {
            return this.productFeatureOffers;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls getRewardsContentUrls() {
            return this.rewardsContentUrls;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary = this.rewardsSummary;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers = this.productFeatureOffers;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls = this.rewardsContentUrls;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializingUiModel(rewardsSummary=");
            sb.append(rewardsSummary);
            sb.append(", productFeatureOffers=");
            sb.append(productFeatureOffers);
            sb.append(", rewardsContentUrls=");
            sb.append(rewardsContentUrls);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary = this.rewardsSummary;
            int hashCode = rewardsSummary == null ? 0 : rewardsSummary.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers = this.productFeatureOffers;
            int hashCode2 = productFeatureOffers == null ? 0 : productFeatureOffers.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls = this.rewardsContentUrls;
            return (((hashCode * 31) + hashCode2) * 31) + (rewardsContentUrls != null ? rewardsContentUrls.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel initializingUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsSummary, initializingUiModel.rewardsSummary) && kotlin.jvm.internal.Intrinsics.areEqual(this.productFeatureOffers, initializingUiModel.productFeatureOffers) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsContentUrls, initializingUiModel.rewardsContentUrls);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel(rewardsSummary, productFeatureOffers, rewardsContentUrls);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls getRewardsContentUrls() {
            return this.rewardsContentUrls;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers getProductFeatureOffers() {
            return this.productFeatureOffers;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary getRewardsSummary() {
            return this.rewardsSummary;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.InitializingUiModel initializingUiModel, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rewardsSummary = initializingUiModel.rewardsSummary;
            }
            if ((i & 2) != 0) {
                productFeatureOffers = initializingUiModel.productFeatureOffers;
            }
            if ((i & 4) != 0) {
                rewardsContentUrls = initializingUiModel.rewardsContentUrls;
            }
            return initializingUiModel.copy(rewardsSummary, productFeatureOffers, rewardsContentUrls);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$Loading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Loading INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Loading();

        public final int hashCode() {
            return 1351564413;
        }

        private Loading() {
            super("Loading", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/RewardsDetailUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "rewardsSummary", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;", "productFeatureOffers", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;", "rewardsContentUrls", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/RewardsDetailUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/RewardsDetailUiModel;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;", "component5", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/RewardsDetailUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/RewardsDetailUiModel;", "getData", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "getRewardsSummary", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;", "getProductFeatureOffers", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;", "getRewardsContentUrls"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel data;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel rewardsDetailUiModel, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsDetailUiModel, "");
            this.cpi = creditProductIdentifier;
            this.data = rewardsDetailUiModel;
            this.rewardsSummary = rewardsSummary;
            this.productFeatureOffers = productFeatureOffers;
            this.rewardsContentUrls = rewardsContentUrls;
        }

        public /* synthetic */ Ready(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel rewardsDetailUiModel, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(creditProductIdentifier, rewardsDetailUiModel, rewardsSummary, productFeatureOffers, (i & 16) != 0 ? null : rewardsContentUrls);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel getData() {
            return this.data;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary getRewardsSummary() {
            return this.rewardsSummary;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers getProductFeatureOffers() {
            return this.productFeatureOffers;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls getRewardsContentUrls() {
            return this.rewardsContentUrls;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.cpi;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel rewardsDetailUiModel = this.data;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary = this.rewardsSummary;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers = this.productFeatureOffers;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls = this.rewardsContentUrls;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(cpi=");
            sb.append(creditProductIdentifier);
            sb.append(", data=");
            sb.append(rewardsDetailUiModel);
            sb.append(", rewardsSummary=");
            sb.append(rewardsSummary);
            sb.append(", productFeatureOffers=");
            sb.append(productFeatureOffers);
            sb.append(", rewardsContentUrls=");
            sb.append(rewardsContentUrls);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.cpi.hashCode();
            int hashCode2 = this.data.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary = this.rewardsSummary;
            int hashCode3 = rewardsSummary == null ? 0 : rewardsSummary.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers = this.productFeatureOffers;
            int hashCode4 = productFeatureOffers == null ? 0 : productFeatureOffers.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls = this.rewardsContentUrls;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (rewardsContentUrls != null ? rewardsContentUrls.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Ready)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Ready) other;
            return this.cpi == ready.cpi && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ready.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsSummary, ready.rewardsSummary) && kotlin.jvm.internal.Intrinsics.areEqual(this.productFeatureOffers, ready.productFeatureOffers) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsContentUrls, ready.rewardsContentUrls);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Ready copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel data, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Ready(cpi, data, rewardsSummary, productFeatureOffers, rewardsContentUrls);
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls getRewardsContentUrls() {
            return this.rewardsContentUrls;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers getProductFeatureOffers() {
            return this.productFeatureOffers;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary getRewardsSummary() {
            return this.rewardsSummary;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel getData() {
            return this.data;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Ready copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Ready ready, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel rewardsDetailUiModel, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditProductIdentifier = ready.cpi;
            }
            if ((i & 2) != 0) {
                rewardsDetailUiModel = ready.data;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel rewardsDetailUiModel2 = rewardsDetailUiModel;
            if ((i & 4) != 0) {
                rewardsSummary = ready.rewardsSummary;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary2 = rewardsSummary;
            if ((i & 8) != 0) {
                productFeatureOffers = ready.productFeatureOffers;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers2 = productFeatureOffers;
            if ((i & 16) != 0) {
                rewardsContentUrls = ready.rewardsContentUrls;
            }
            return ready.copy(creditProductIdentifier, rewardsDetailUiModel2, rewardsSummary2, productFeatureOffers2, rewardsContentUrls);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Error) other).message);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Error copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$PaymentPastDueError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState;", "", "creditAccountId", "", "entryWasFromAccountSummary", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailState$PaymentPastDueError;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "Z", "getEntryWasFromAccountSummary"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentPastDueError extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;
        private final boolean entryWasFromAccountSummary;

        public PaymentPastDueError(java.lang.String str, boolean z) {
            super("PaymentPastDueError", null);
            this.creditAccountId = str;
            this.entryWasFromAccountSummary = z;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final boolean getEntryWasFromAccountSummary() {
            return this.entryWasFromAccountSummary;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.creditAccountId;
            boolean z = this.entryWasFromAccountSummary;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentPastDueError(creditAccountId=");
            sb.append(str);
            sb.append(", entryWasFromAccountSummary=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.creditAccountId;
            return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Boolean.hashCode(this.entryWasFromAccountSummary);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.PaymentPastDueError)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.PaymentPastDueError paymentPastDueError = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.PaymentPastDueError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, paymentPastDueError.creditAccountId) && this.entryWasFromAccountSummary == paymentPastDueError.entryWasFromAccountSummary;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.PaymentPastDueError copy(java.lang.String creditAccountId, boolean entryWasFromAccountSummary) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.PaymentPastDueError(creditAccountId, entryWasFromAccountSummary);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEntryWasFromAccountSummary() {
            return this.entryWasFromAccountSummary;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.PaymentPastDueError copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailState.PaymentPastDueError paymentPastDueError, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentPastDueError.creditAccountId;
            }
            if ((i & 2) != 0) {
                z = paymentPastDueError.entryWasFromAccountSummary;
            }
            return paymentPastDueError.copy(str, z);
        }
    }

    public /* synthetic */ RewardsDetailState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
