package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u00012\u00020\u0002:\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\n\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnViewCreated", "OnUiModelInitialized", "OnRedeemClicked", "OnLearnMoreClicked", "OnRewardsSummaryFetchFailed", "OnRewardsSummaryFetched", "OnRewardsDetailProgramTermsClicked", "OnBackClicked", "OnPaymentPastDueErrorDismissed", "OnPaymentPastDueErrorMakePaymentClicked", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnLearnMoreClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnPaymentPastDueErrorDismissed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnPaymentPastDueErrorMakePaymentClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnRedeemClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnRewardsDetailProgramTermsClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnRewardsSummaryFetchFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnRewardsSummaryFetched;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnUiModelInitialized;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnViewCreated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class RewardsDetailEvent implements com.paypal.oslo.core.mvi.Event, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RewardsDetailEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
    public /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
        return super.getLogParams();
    }

    public /* synthetic */ RewardsDetailEvent(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "RewardsDetailEvent" : str, null);
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016JT\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018R\u001a\u0010\f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b.\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "rewardsSummary", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;", "productFeatureOffers", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;", "rewardsContentUrls", "", "hasPastDueAmount", "", "creditAccountId", "entryWasFromAccountSummary", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;ZLjava/lang/String;Z)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;", "component4", "()Z", "component5", "()Ljava/lang/String;", "component6", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;ZLjava/lang/String;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnViewCreated;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "getRewardsSummary", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;", "getProductFeatureOffers", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;", "getRewardsContentUrls", "Z", "getHasPastDueAmount", "Ljava/lang/String;", "getCreditAccountId", "getEntryWasFromAccountSummary"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;
        private final boolean entryWasFromAccountSummary;
        private final boolean hasPastDueAmount;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary;

        public OnViewCreated(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls, boolean z, java.lang.String str, boolean z2) {
            super("OnViewCreated", null);
            this.rewardsSummary = rewardsSummary;
            this.productFeatureOffers = productFeatureOffers;
            this.rewardsContentUrls = rewardsContentUrls;
            this.hasPastDueAmount = z;
            this.creditAccountId = str;
            this.entryWasFromAccountSummary = z2;
        }

        public /* synthetic */ OnViewCreated(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls, boolean z, java.lang.String str, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(rewardsSummary, productFeatureOffers, (i & 4) != 0 ? null : rewardsContentUrls, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z2);
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

        public final boolean getHasPastDueAmount() {
            return this.hasPastDueAmount;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final boolean getEntryWasFromAccountSummary() {
            return this.entryWasFromAccountSummary;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary = this.rewardsSummary;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers = this.productFeatureOffers;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls = this.rewardsContentUrls;
            boolean z = this.hasPastDueAmount;
            java.lang.String str = this.creditAccountId;
            boolean z2 = this.entryWasFromAccountSummary;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnViewCreated(rewardsSummary=");
            sb.append(rewardsSummary);
            sb.append(", productFeatureOffers=");
            sb.append(productFeatureOffers);
            sb.append(", rewardsContentUrls=");
            sb.append(rewardsContentUrls);
            sb.append(", hasPastDueAmount=");
            sb.append(z);
            sb.append(", creditAccountId=");
            sb.append(str);
            sb.append(", entryWasFromAccountSummary=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary = this.rewardsSummary;
            int hashCode = rewardsSummary == null ? 0 : rewardsSummary.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers = this.productFeatureOffers;
            int hashCode2 = productFeatureOffers == null ? 0 : productFeatureOffers.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls = this.rewardsContentUrls;
            int hashCode3 = rewardsContentUrls == null ? 0 : rewardsContentUrls.hashCode();
            int hashCode4 = java.lang.Boolean.hashCode(this.hasPastDueAmount);
            java.lang.String str = this.creditAccountId;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.entryWasFromAccountSummary);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnViewCreated)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnViewCreated onViewCreated = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnViewCreated) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsSummary, onViewCreated.rewardsSummary) && kotlin.jvm.internal.Intrinsics.areEqual(this.productFeatureOffers, onViewCreated.productFeatureOffers) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsContentUrls, onViewCreated.rewardsContentUrls) && this.hasPastDueAmount == onViewCreated.hasPastDueAmount && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, onViewCreated.creditAccountId) && this.entryWasFromAccountSummary == onViewCreated.entryWasFromAccountSummary;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnViewCreated copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls, boolean hasPastDueAmount, java.lang.String creditAccountId, boolean entryWasFromAccountSummary) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnViewCreated(rewardsSummary, productFeatureOffers, rewardsContentUrls, hasPastDueAmount, creditAccountId, entryWasFromAccountSummary);
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getEntryWasFromAccountSummary() {
            return this.entryWasFromAccountSummary;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasPastDueAmount() {
            return this.hasPastDueAmount;
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

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnViewCreated copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnViewCreated onViewCreated, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls, boolean z, java.lang.String str, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rewardsSummary = onViewCreated.rewardsSummary;
            }
            if ((i & 2) != 0) {
                productFeatureOffers = onViewCreated.productFeatureOffers;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers2 = productFeatureOffers;
            if ((i & 4) != 0) {
                rewardsContentUrls = onViewCreated.rewardsContentUrls;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls2 = rewardsContentUrls;
            if ((i & 8) != 0) {
                z = onViewCreated.hasPastDueAmount;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                str = onViewCreated.creditAccountId;
            }
            java.lang.String str2 = str;
            if ((i & 32) != 0) {
                z2 = onViewCreated.entryWasFromAccountSummary;
            }
            return onViewCreated.copy(rewardsSummary, productFeatureOffers2, rewardsContentUrls2, z3, str2, z2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnUiModelInitialized;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.ObservabilityMiddleware.KEY_CPI, "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/RewardsDetailUiModel;", "uiModel", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/RewardsDetailUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/RewardsDetailUiModel;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/RewardsDetailUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnUiModelInitialized;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCpi", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/uimodel/RewardsDetailUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUiModelInitialized extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnUiModelInitialized(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel rewardsDetailUiModel) {
            super("OnUiModelInitialized", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsDetailUiModel, "");
            this.cpi = creditProductIdentifier;
            this.uiModel = rewardsDetailUiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.cpi;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel rewardsDetailUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnUiModelInitialized(cpi=");
            sb.append(creditProductIdentifier);
            sb.append(", uiModel=");
            sb.append(rewardsDetailUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cpi.hashCode() * 31) + this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnUiModelInitialized)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnUiModelInitialized onUiModelInitialized = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnUiModelInitialized) other;
            return this.cpi == onUiModelInitialized.cpi && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, onUiModelInitialized.uiModel);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnUiModelInitialized copy(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier cpi, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnUiModelInitialized(cpi, uiModel);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel getUiModel() {
            return this.uiModel;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCpi() {
            return this.cpi;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnUiModelInitialized copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnUiModelInitialized onUiModelInitialized, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.uimodel.RewardsDetailUiModel rewardsDetailUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                creditProductIdentifier = onUiModelInitialized.cpi;
            }
            if ((i & 2) != 0) {
                rewardsDetailUiModel = onUiModelInitialized.uiModel;
            }
            return onUiModelInitialized.copy(creditProductIdentifier, rewardsDetailUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnRedeemClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRedeemClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRedeemClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRedeemClicked();

        public final int hashCode() {
            return -1734569578;
        }

        private OnRedeemClicked() {
            super("OnRedeemClicked", null);
        }

        public final java.lang.String toString() {
            return "OnRedeemClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRedeemClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnLearnMoreClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLearnMoreClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnLearnMoreClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnLearnMoreClicked();

        public final int hashCode() {
            return -1506178141;
        }

        private OnLearnMoreClicked() {
            super("OnLearnMoreClicked", null);
        }

        public final java.lang.String toString() {
            return "OnLearnMoreClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnLearnMoreClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnRewardsSummaryFetchFailed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRewardsSummaryFetchFailed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsSummaryFetchFailed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsSummaryFetchFailed();

        public final int hashCode() {
            return -1449753472;
        }

        private OnRewardsSummaryFetchFailed() {
            super("OnRewardsSummaryFetchFailed", null);
        }

        public final java.lang.String toString() {
            return "OnRewardsSummaryFetchFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsSummaryFetchFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnRewardsSummaryFetched;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "rewardsSummary", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;", "productFeatureOffers", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;", "rewardsContentUrls", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnRewardsSummaryFetched;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsSummary;", "getRewardsSummary", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/ProductFeatureOffers;", "getProductFeatureOffers", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/RewardsContentUrls;", "getRewardsContentUrls"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRewardsSummaryFetched extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRewardsSummaryFetched(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls) {
            super("OnRewardsSummaryFetched", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsSummary, "");
            this.rewardsSummary = rewardsSummary;
            this.productFeatureOffers = productFeatureOffers;
            this.rewardsContentUrls = rewardsContentUrls;
        }

        public /* synthetic */ OnRewardsSummaryFetched(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRewardsSummaryFetched(rewardsSummary=");
            sb.append(rewardsSummary);
            sb.append(", productFeatureOffers=");
            sb.append(productFeatureOffers);
            sb.append(", rewardsContentUrls=");
            sb.append(rewardsContentUrls);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.rewardsSummary.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers = this.productFeatureOffers;
            int hashCode2 = productFeatureOffers == null ? 0 : productFeatureOffers.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls = this.rewardsContentUrls;
            return (((hashCode * 31) + hashCode2) * 31) + (rewardsContentUrls != null ? rewardsContentUrls.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsSummaryFetched)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsSummaryFetched onRewardsSummaryFetched = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsSummaryFetched) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsSummary, onRewardsSummaryFetched.rewardsSummary) && kotlin.jvm.internal.Intrinsics.areEqual(this.productFeatureOffers, onRewardsSummaryFetched.productFeatureOffers) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsContentUrls, onRewardsSummaryFetched.rewardsContentUrls);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsSummaryFetched copy(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsSummary, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsSummaryFetched(rewardsSummary, productFeatureOffers, rewardsContentUrls);
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

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsSummaryFetched copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsSummaryFetched onRewardsSummaryFetched, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary rewardsSummary, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers productFeatureOffers, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls rewardsContentUrls, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                rewardsSummary = onRewardsSummaryFetched.rewardsSummary;
            }
            if ((i & 2) != 0) {
                productFeatureOffers = onRewardsSummaryFetched.productFeatureOffers;
            }
            if ((i & 4) != 0) {
                rewardsContentUrls = onRewardsSummaryFetched.rewardsContentUrls;
            }
            return onRewardsSummaryFetched.copy(rewardsSummary, productFeatureOffers, rewardsContentUrls);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnRewardsDetailProgramTermsClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRewardsDetailProgramTermsClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsDetailProgramTermsClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsDetailProgramTermsClicked();

        public final int hashCode() {
            return 122034660;
        }

        private OnRewardsDetailProgramTermsClicked() {
            super("OnRewardsDetailProgramTermsClicked", null);
        }

        public final java.lang.String toString() {
            return "OnRewardsDetailProgramTermsClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnRewardsDetailProgramTermsClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnBackClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnBackClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnBackClicked();

        public final int hashCode() {
            return 913554091;
        }

        private OnBackClicked() {
            super("OnBackClicked", null);
        }

        public final java.lang.String toString() {
            return "OnBackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnBackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnPaymentPastDueErrorDismissed;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentPastDueErrorDismissed extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnPaymentPastDueErrorDismissed INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnPaymentPastDueErrorDismissed();

        public final int hashCode() {
            return 2091334706;
        }

        private OnPaymentPastDueErrorDismissed() {
            super("OnPaymentPastDueErrorDismissed", null);
        }

        public final java.lang.String toString() {
            return "OnPaymentPastDueErrorDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnPaymentPastDueErrorDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent$OnPaymentPastDueErrorMakePaymentClicked;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/detail/viewmodel/RewardsDetailEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentPastDueErrorMakePaymentClicked extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnPaymentPastDueErrorMakePaymentClicked INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnPaymentPastDueErrorMakePaymentClicked();

        public final int hashCode() {
            return -1742139546;
        }

        private OnPaymentPastDueErrorMakePaymentClicked() {
            super("OnPaymentPastDueErrorMakePaymentClicked", null);
        }

        public final java.lang.String toString() {
            return "OnPaymentPastDueErrorMakePaymentClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.detail.viewmodel.RewardsDetailEvent.OnPaymentPastDueErrorMakePaymentClicked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ RewardsDetailEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
