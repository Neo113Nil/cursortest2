package com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class ResolveRedeemEligibilityUseCase$Companion$redeemFeatureGateMapping$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Manager, java.lang.Boolean> {
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase$Companion$redeemFeatureGateMapping$1 Camera2StreamConfigurationMap = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase$Companion$redeemFeatureGateMapping$1();

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean invoke(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Manager manager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manager, "");
        return java.lang.Boolean.valueOf(manager.isRedeemToBalanceEnabled());
    }

    ResolveRedeemEligibilityUseCase$Companion$redeemFeatureGateMapping$1() {
        super(1, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Manager.class, "isRedeemToBalanceEnabled", "isRedeemToBalanceEnabled()Z", 0);
    }
}
