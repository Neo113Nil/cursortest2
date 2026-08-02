package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel", f = "ReviewScreenViewModel.kt", i = {0, 0, 0, 0, 0, 0}, l = {595}, m = "executeInitialTransferForNewGoal", n = {"sourceId", "state", "updatedGoal", "createdGoalId", "amountValue", "transferRequest"}, nl = {1055}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes14.dex */
final class ReviewScreenViewModel$executeInitialTransferForNewGoal$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel.access$executeInitialTransferForNewGoal(this.getInputFormats, null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewScreenViewModel$executeInitialTransferForNewGoal$1(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel$executeInitialTransferForNewGoal$1> continuation) {
        super(continuation);
        this.getInputFormats = reviewScreenViewModel;
    }
}
