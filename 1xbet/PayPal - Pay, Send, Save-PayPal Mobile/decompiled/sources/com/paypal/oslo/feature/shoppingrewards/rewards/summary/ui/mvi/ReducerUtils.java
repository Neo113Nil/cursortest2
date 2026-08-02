package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/ReducerUtils;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState$Ready;", "state", "", "offerId", "touchpointId", "Larrow/core/Either;", "Lcom/paypal/oslo/core/mvi/Reducer$UnexpectedEvent;", "Lcom/paypal/oslo/core/mvi/Reducer$Output;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiEffect;", "navigateToOfferDetails$shopping_rewards_prodRelease", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState$Ready;Ljava/lang/String;Ljava/lang/String;)Larrow/core/Either;", "Landroidx/navigation3/runtime/NavKey;", "destination", "navigateToScreen$shopping_rewards_prodRelease", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryUiState$Ready;Landroidx/navigation3/runtime/NavKey;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReducerUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.ReducerUtils INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.ReducerUtils();

    private ReducerUtils() {
    }

    public static /* synthetic */ arrow.core.Either navigateToOfferDetails$shopping_rewards_prodRelease$default(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.ReducerUtils reducerUtils, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Ready ready, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return reducerUtils.navigateToOfferDetails$shopping_rewards_prodRelease(ready, str, str2);
    }

    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect>> navigateToOfferDetails$shopping_rewards_prodRelease(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Ready state, java.lang.String offerId, java.lang.String touchpointId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToOfferDetails(offerId, touchpointId));
    }

    public final arrow.core.Either<com.paypal.oslo.core.mvi.Reducer.UnexpectedEvent, com.paypal.oslo.core.mvi.Reducer.Output<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect>> navigateToScreen$shopping_rewards_prodRelease(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiState.Ready state, androidx.navigation3.runtime.NavKey destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        return com.paypal.oslo.core.mvi.ReducerHelperKt.output(state, new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryUiEffect.NavigateToScreen(destination, false, 2, null));
    }
}
