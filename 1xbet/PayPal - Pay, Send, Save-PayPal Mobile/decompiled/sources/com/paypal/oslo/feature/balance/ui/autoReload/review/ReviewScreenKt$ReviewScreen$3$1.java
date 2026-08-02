package com.paypal.oslo.feature.balance.ui.autoReload.review;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$ReviewScreen$3$1", f = "ReviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class ReviewScreenKt$ReviewScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.res.Resources getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome outcome = addCardFlowNavResult.getOutcome();
        if (outcome instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success) {
            com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnAddFundingInstrument onAddFundingInstrument = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnAddFundingInstrument(((com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success) outcome).getCard().getId());
            androidx.compose.runtime.MutableState<java.lang.String> mutableState = this.Camera2StreamConfigurationMap;
            java.lang.String string = this.getHighSpeedVideoFpsRanges.getString(com.paypal.oslo.feature.balance.R.string.feature_balance_auto_reload_fi_add_card_error);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            mutableState.setValue(string);
            this.getHighResolutionOutputSizeshNQ4ISI.handleIntent(onAddFundingInstrument);
        } else {
            this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$ReviewScreen$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$ReviewScreen$3$1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$ReviewScreen$3$1) create(addCardFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$ReviewScreen$3$1 reviewScreenKt$ReviewScreen$3$1 = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$ReviewScreen$3$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        reviewScreenKt$ReviewScreen$3$1.getHighSpeedVideoSizes = obj;
        return reviewScreenKt$ReviewScreen$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewScreenKt$ReviewScreen$3$1(android.content.res.Resources resources, com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.MutableState<java.lang.String> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewScreenKt$ReviewScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = resources;
        this.getHighResolutionOutputSizeshNQ4ISI = reviewViewModel;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
        this.Camera2StreamConfigurationMap = mutableState;
    }
}
