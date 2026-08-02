package com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\nJ*\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/RewardsSummaryRepository;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/RewardsSummaryRepository$RewardsSummaryGraphQLRequest;", "input", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/usecase/GetRewardsSummaryUseCase$Response;", "getRewardsSummary", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/RewardsSummaryRepository$RewardsSummaryGraphQLRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "RewardsSummaryGraphQLRequest"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface RewardsSummaryRepository {
    java.lang.Object getRewardsSummary(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository.RewardsSummaryGraphQLRequest rewardsSummaryGraphQLRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase.Response>>> continuation);

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\f\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0014\u0010\r\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0014\u0010\u000e\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJH\u0010\u000f\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\b\u0002\u0010\u0005\u001a\u00060\u0002j\u0002`\u00032\f\b\u0002\u0010\u0006\u001a\u00060\u0002j\u0002`\u00032\f\b\u0002\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001e\u0010\u0005\u001a\u00060\u0002j\u0002`\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001e\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001e\u0010\u0007\u001a\u00060\u0002j\u0002`\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/RewardsSummaryRepository$RewardsSummaryGraphQLRequest;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;", "Lcom/paypal/oslo/feature/shoppingrewards/graphql/type/PromotionOffersInput;", "activatedOffersInput", "activatedCategoryOfferInput", "eligibleOffersInput", "inviteFriendInput", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;", "component2", "component3", "component4", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/domain/repository/RewardsSummaryRepository$RewardsSummaryGraphQLRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/PromotionOffersInput;", "getActivatedOffersInput", "getActivatedCategoryOfferInput", "getEligibleOffersInput", "getInviteFriendInput"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RewardsSummaryGraphQLRequest {
        public static final int $stable = 8;
        private final com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput activatedCategoryOfferInput;
        private final com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput activatedOffersInput;
        private final com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput eligibleOffersInput;
        private final com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput inviteFriendInput;

        public RewardsSummaryGraphQLRequest(com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput, com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput2, com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput3, com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionOffersInput, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionOffersInput2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionOffersInput3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(promotionOffersInput4, "");
            this.activatedOffersInput = promotionOffersInput;
            this.activatedCategoryOfferInput = promotionOffersInput2;
            this.eligibleOffersInput = promotionOffersInput3;
            this.inviteFriendInput = promotionOffersInput4;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput getActivatedOffersInput() {
            return this.activatedOffersInput;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput getActivatedCategoryOfferInput() {
            return this.activatedCategoryOfferInput;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput getEligibleOffersInput() {
            return this.eligibleOffersInput;
        }

        public final com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput getInviteFriendInput() {
            return this.inviteFriendInput;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput = this.activatedOffersInput;
            com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput2 = this.activatedCategoryOfferInput;
            com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput3 = this.eligibleOffersInput;
            com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput4 = this.inviteFriendInput;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RewardsSummaryGraphQLRequest(activatedOffersInput=");
            sb.append(promotionOffersInput);
            sb.append(", activatedCategoryOfferInput=");
            sb.append(promotionOffersInput2);
            sb.append(", eligibleOffersInput=");
            sb.append(promotionOffersInput3);
            sb.append(", inviteFriendInput=");
            sb.append(promotionOffersInput4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.activatedOffersInput.hashCode() * 31) + this.activatedCategoryOfferInput.hashCode()) * 31) + this.eligibleOffersInput.hashCode()) * 31) + this.inviteFriendInput.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository.RewardsSummaryGraphQLRequest)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository.RewardsSummaryGraphQLRequest rewardsSummaryGraphQLRequest = (com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository.RewardsSummaryGraphQLRequest) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.activatedOffersInput, rewardsSummaryGraphQLRequest.activatedOffersInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.activatedCategoryOfferInput, rewardsSummaryGraphQLRequest.activatedCategoryOfferInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.eligibleOffersInput, rewardsSummaryGraphQLRequest.eligibleOffersInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.inviteFriendInput, rewardsSummaryGraphQLRequest.inviteFriendInput);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository.RewardsSummaryGraphQLRequest copy(com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput activatedOffersInput, com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput activatedCategoryOfferInput, com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput eligibleOffersInput, com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput inviteFriendInput) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activatedOffersInput, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activatedCategoryOfferInput, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibleOffersInput, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inviteFriendInput, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository.RewardsSummaryGraphQLRequest(activatedOffersInput, activatedCategoryOfferInput, eligibleOffersInput, inviteFriendInput);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput getInviteFriendInput() {
            return this.inviteFriendInput;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput getEligibleOffersInput() {
            return this.eligibleOffersInput;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput getActivatedCategoryOfferInput() {
            return this.activatedCategoryOfferInput;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput getActivatedOffersInput() {
            return this.activatedOffersInput;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository.RewardsSummaryGraphQLRequest copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository.RewardsSummaryGraphQLRequest rewardsSummaryGraphQLRequest, com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput, com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput2, com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput3, com.paypal.oslo.api.graphql.schema.type.PromotionOffersInput promotionOffersInput4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                promotionOffersInput = rewardsSummaryGraphQLRequest.activatedOffersInput;
            }
            if ((i & 2) != 0) {
                promotionOffersInput2 = rewardsSummaryGraphQLRequest.activatedCategoryOfferInput;
            }
            if ((i & 4) != 0) {
                promotionOffersInput3 = rewardsSummaryGraphQLRequest.eligibleOffersInput;
            }
            if ((i & 8) != 0) {
                promotionOffersInput4 = rewardsSummaryGraphQLRequest.inviteFriendInput;
            }
            return rewardsSummaryGraphQLRequest.copy(promotionOffersInput, promotionOffersInput2, promotionOffersInput3, promotionOffersInput4);
        }
    }
}
