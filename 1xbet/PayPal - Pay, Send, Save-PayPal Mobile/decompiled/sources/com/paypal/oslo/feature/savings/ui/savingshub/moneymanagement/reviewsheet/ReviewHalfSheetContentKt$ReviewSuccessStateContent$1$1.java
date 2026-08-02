package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewHalfSheetContentKt$ReviewSuccessStateContent$1$1", f = "ReviewHalfSheetContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ReviewHalfSheetContentKt$ReviewSuccessStateContent$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult = (com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel = this.getHighSpeedVideoSizes;
        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewHalfSheetContentKt$ReviewSuccessStateContent$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewHalfSheetContentKt$ReviewSuccessStateContent$1$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel.this, (java.lang.String) obj2);
            }
        };
        final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel2 = this.getHighSpeedVideoSizes;
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewHalfSheetContentKt$ReviewSuccessStateContent$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewHalfSheetContentKt$ReviewSuccessStateContent$1$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel.this);
            }
        };
        final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel3 = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewHalfSheetContentKt.handleAddCardResult(addCardFlowNavResult, function1, function0, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewHalfSheetContentKt$ReviewSuccessStateContent$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewHalfSheetContentKt$ReviewSuccessStateContent$1$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel.this);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel) {
        reviewScreenViewModel.changeFinancialInstrument();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel, java.lang.String str) {
        reviewScreenViewModel.onAddCardSuccess(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel) {
        reviewScreenViewModel.changeFinancialInstrument();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewHalfSheetContentKt$ReviewSuccessStateContent$1$1) create(addCardFlowNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewHalfSheetContentKt$ReviewSuccessStateContent$1$1 reviewHalfSheetContentKt$ReviewSuccessStateContent$1$1 = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewHalfSheetContentKt$ReviewSuccessStateContent$1$1(this.getHighSpeedVideoSizes, continuation);
        reviewHalfSheetContentKt$ReviewSuccessStateContent$1$1.getHighSpeedVideoFpsRangesFor = obj;
        return reviewHalfSheetContentKt$ReviewSuccessStateContent$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewHalfSheetContentKt$ReviewSuccessStateContent$1$1(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewsheet.ReviewHalfSheetContentKt$ReviewSuccessStateContent$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = reviewScreenViewModel;
    }
}
