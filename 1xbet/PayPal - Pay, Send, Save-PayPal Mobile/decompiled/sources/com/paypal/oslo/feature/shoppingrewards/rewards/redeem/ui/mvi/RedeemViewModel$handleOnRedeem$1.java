package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel$handleOnRedeem$1", f = "RedeemViewModel.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {354, com.knotapi.knot.utilities.Constants.ID_KROGER}, m = "invokeSuspend", n = {"currentState", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "usdAmount", "currentState", "response", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "usdAmount"}, nl = {356, 374}, s = {"L$0", "I$0", "D$0", "L$0", "L$1", "I$0", "D$0"}, v = 2)
/* loaded from: classes15.dex */
final class RedeemViewModel$handleOnRedeem$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    double getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int intValue;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming redeeming;
        double d;
        com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.models.RedeemUiDataMapper redeemUiDataMapper;
        com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult useCaseResult;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState value = this.getInputSizeshNQ4ISI.getUiState().getValue();
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming redeeming2 = value instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming ? (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming) value : null;
            if (redeeming2 == null) {
                return kotlin.Unit.INSTANCE;
            }
            java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(redeeming2.getAmount());
            intValue = intOrNull != null ? intOrNull.intValue() : 0;
            java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(redeeming2.getConvertedAmount());
            double doubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
            this.Camera2StreamConfigurationMap = redeeming2;
            this.getHighResolutionOutputSizeshNQ4ISI = intValue;
            this.getHighSpeedVideoSizes = doubleValue;
            this.getHighSpeedVideoFpsRanges = 1;
            java.lang.Object access$executeRedemption = com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel.access$executeRedemption(this.getInputSizeshNQ4ISI, redeeming2, intValue, doubleValue, this);
            if (access$executeRedemption != coroutine_suspended) {
                redeeming = redeeming2;
                obj = access$executeRedemption;
                d = doubleValue;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            useCaseResult = (com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel = this.getInputSizeshNQ4ISI;
            T data = ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success) useCaseResult).getData();
            kotlin.jvm.internal.Intrinsics.checkNotNull(data, "");
            redeemViewModel.processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemSuccess(data, (java.lang.String) obj));
            return kotlin.Unit.INSTANCE;
        }
        d = this.getHighSpeedVideoSizes;
        intValue = this.getHighResolutionOutputSizeshNQ4ISI;
        redeeming = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemState.Redeeming) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult useCaseResult2 = (com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult) obj;
        if (useCaseResult2 instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error) {
            this.getInputSizeshNQ4ISI.processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemError(useCaseResult2.toString(), ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error) useCaseResult2) instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Error.NoInternet ? com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.NetworkError : com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType.GenericError));
            return kotlin.Unit.INSTANCE;
        }
        if (useCaseResult2 instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success) {
            this.getInputSizeshNQ4ISI.getInputFormats = null;
            redeemUiDataMapper = this.getInputSizeshNQ4ISI.getInputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(redeeming);
            this.getHighSpeedVideoFpsRangesFor = useCaseResult2;
            this.getHighResolutionOutputSizeshNQ4ISI = intValue;
            this.getHighSpeedVideoSizes = d;
            this.getHighSpeedVideoFpsRanges = 2;
            java.lang.Object formatCashEquivalent$shopping_rewards_prodRelease = redeemUiDataMapper.formatCashEquivalent$shopping_rewards_prodRelease(redeeming.getCurrencyCode(), redeeming.getConvertedAmount(), this);
            if (formatCashEquivalent$shopping_rewards_prodRelease != coroutine_suspended) {
                useCaseResult = useCaseResult2;
                obj = formatCashEquivalent$shopping_rewards_prodRelease;
                com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel2 = this.getInputSizeshNQ4ISI;
                T data2 = ((com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.UseCaseResult.Success) useCaseResult).getData();
                kotlin.jvm.internal.Intrinsics.checkNotNull(data2, "");
                redeemViewModel2.processEvent(new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemSuccess(data2, (java.lang.String) obj));
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel$handleOnRedeem$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel$handleOnRedeem$1(this.getInputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RedeemViewModel$handleOnRedeem$1(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel redeemViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemViewModel$handleOnRedeem$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = redeemViewModel;
    }
}
