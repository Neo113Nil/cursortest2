package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u001c\u001a\u00020\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010("}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/mock/MockRedeemRewardsRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/RedeemRewardsRepository;", "<init>", "()V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/RedeemRewardsError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardsSummaryResult;", "fetchRewardsSummary", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedeemRewardRequest;", "request", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionResult;", "redeemRewards", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedeemRewardRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "shouldReturnError", "Z", "getShouldReturnError", "()Z", "setShouldReturnError", "(Z)V", "shouldReturnBatchProcessing", "getShouldReturnBatchProcessing", "setShouldReturnBatchProcessing", "", "networkDelay", "J", "getNetworkDelay", "()J", "setNetworkDelay", "(J)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardType;", "mockRewardType", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardType;", "getMockRewardType", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardType;", "setMockRewardType", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RewardType;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MockRedeemRewardsRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsRepository {
    public static final int $stable = 8;
    private boolean shouldReturnBatchProcessing;
    private boolean shouldReturnError;
    private long networkDelay = 1000;
    private com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardType mockRewardType = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardType.CASHBACK;

    @javax.inject.Inject
    public MockRedeemRewardsRepository() {
    }

    public final boolean getShouldReturnError() {
        return this.shouldReturnError;
    }

    public final void setShouldReturnError(boolean z) {
        this.shouldReturnError = z;
    }

    public final boolean getShouldReturnBatchProcessing() {
        return this.shouldReturnBatchProcessing;
    }

    public final void setShouldReturnBatchProcessing(boolean z) {
        this.shouldReturnBatchProcessing = z;
    }

    public final long getNetworkDelay() {
        return this.networkDelay;
    }

    public final void setNetworkDelay(long j) {
        this.networkDelay = j;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardType getMockRewardType() {
        return this.mockRewardType;
    }

    public final void setMockRewardType(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardType rewardType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardType, "");
        this.mockRewardType = rewardType;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchRewardsSummary(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsSummaryResult>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository$fetchRewardsSummary$1 mockRedeemRewardsRepository$fetchRewardsSummary$1;
        int i;
        int i2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsSummaryResult rewardsSummaryResult;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository$fetchRewardsSummary$1) {
            mockRedeemRewardsRepository$fetchRewardsSummary$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository$fetchRewardsSummary$1) continuation;
            if ((mockRedeemRewardsRepository$fetchRewardsSummary$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                mockRedeemRewardsRepository$fetchRewardsSummary$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = mockRedeemRewardsRepository$fetchRewardsSummary$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockRedeemRewardsRepository$fetchRewardsSummary$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long j = this.networkDelay;
                    mockRedeemRewardsRepository$fetchRewardsSummary$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(creditProductIdentifier);
                    mockRedeemRewardsRepository$fetchRewardsSummary$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (kotlinx.coroutines.DelayKt.delay(j, mockRedeemRewardsRepository$fetchRewardsSummary$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                i2 = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository.WhenMappings.$EnumSwitchMapping$0[this.mockRewardType.ordinal()];
                if (i2 != 1) {
                    rewardsSummaryResult = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsSummaryResult(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "1000.0"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "50.0"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "200.0"), true, (java.lang.String) null, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers(true, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation(kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), "ROUND_DOWN", kotlin.coroutines.jvm.internal.Boxing.boxInt(0), "PERCENTAGE"), (java.lang.String) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls("https://www.paypal.com/us/webapps/mpp/ua/cbmc-rewards-terms", (java.lang.String) null, "https://www.paypal.com/us/webapps/mpp/ua/pp-plus-terms", 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                } else {
                    if (i2 != 2) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    rewardsSummaryResult = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsSummaryResult(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsSummary(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "1000.0"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "50.0"), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("USD", "200.0"), false, (java.lang.String) null, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.ProductFeatureOffers(true, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardsCalculation(kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f), "ROUND_DOWN", kotlin.coroutines.jvm.internal.Boxing.boxInt(0), "PERCENTAGE"), (java.lang.String) null, 8, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.RewardsContentUrls((java.lang.String) null, (java.lang.String) null, "https://www.paypal.com/us/webapps/mpp/ua/pp-plus-terms", 3, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                }
                return arrow.core.IorKt.rightIor(rewardsSummaryResult);
            }
        }
        mockRedeemRewardsRepository$fetchRewardsSummary$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository$fetchRewardsSummary$1(this, continuation);
        java.lang.Object obj2 = mockRedeemRewardsRepository$fetchRewardsSummary$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockRedeemRewardsRepository$fetchRewardsSummary$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        i2 = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository.WhenMappings.$EnumSwitchMapping$0[this.mockRewardType.ordinal()];
        if (i2 != 1) {
        }
        return arrow.core.IorKt.rightIor(rewardsSummaryResult);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object redeemRewards(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedeemRewardRequest redeemRewardRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionResult>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository$redeemRewards$1 mockRedeemRewardsRepository$redeemRewards$1;
        int i;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionStatus redemptionStatus;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository$redeemRewards$1) {
            mockRedeemRewardsRepository$redeemRewards$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository$redeemRewards$1) continuation;
            if ((mockRedeemRewardsRepository$redeemRewards$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                mockRedeemRewardsRepository$redeemRewards$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = mockRedeemRewardsRepository$redeemRewards$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mockRedeemRewardsRepository$redeemRewards$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    long j = this.networkDelay;
                    mockRedeemRewardsRepository$redeemRewards$1.getHighResolutionOutputSizeshNQ4ISI = redeemRewardRequest;
                    mockRedeemRewardsRepository$redeemRewards$1.getHighSpeedVideoSizes = 1;
                    if (kotlinx.coroutines.DelayKt.delay(j, mockRedeemRewardsRepository$redeemRewards$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    redeemRewardRequest = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedeemRewardRequest) mockRedeemRewardsRepository$redeemRewards$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!this.shouldReturnError) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsError.Default.INSTANCE);
                }
                if (this.shouldReturnBatchProcessing) {
                    redemptionStatus = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionStatus.PENDING;
                } else {
                    redemptionStatus = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionStatus.PROCESSED;
                }
                return arrow.core.EitherKt.right(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionResult(redemptionStatus, redeemRewardRequest.getAmount()));
            }
        }
        mockRedeemRewardsRepository$redeemRewards$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockRedeemRewardsRepository$redeemRewards$1(this, continuation);
        java.lang.Object obj2 = mockRedeemRewardsRepository$redeemRewards$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mockRedeemRewardsRepository$redeemRewards$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        if (!this.shouldReturnError) {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardType.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardType.CASHBACK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RewardType.POINTS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
