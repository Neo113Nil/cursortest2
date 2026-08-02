package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel$executeTransfer$1", f = "ReviewScreenViewModel.kt", i = {}, l = {482}, m = "invokeSuspend", n = {}, nl = {1055}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ReviewScreenViewModel$executeTransfer$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.transfers.TransferMoneyboxRequest getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase transferMoneyboxUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            transferMoneyboxUseCase = this.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = transferMoneyboxUseCase.invoke(this.getHighSpeedVideoFpsRangesFor, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success success = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult transferResult = (com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult) ((arrow.core.Either.Right) either).getValue();
            if (transferResult instanceof com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult.OneTime) {
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel.access$handleOneTimeTransferResult(reviewScreenViewModel, success, ((com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult.OneTime) transferResult).getResult());
            } else if (transferResult instanceof com.paypal.oslo.feature.savings.domain.usecase.TransferMoneyboxUseCase.TransferResult.Scheduled) {
                reviewScreenViewModel.getHighResolutionOutputSizeshNQ4ISI(success);
            } else {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel.access$handleTransferError(reviewScreenViewModel, success, (com.paypal.oslo.feature.savings.domain.model.SavingsError) ((arrow.core.Either.Left) either).getValue());
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel$executeTransfer$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel$executeTransfer$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewScreenViewModel$executeTransfer$1(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel reviewScreenViewModel, com.paypal.oslo.feature.savings.domain.model.transfers.TransferMoneyboxRequest transferMoneyboxRequest, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenState.Success success, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen.ReviewScreenViewModel$executeTransfer$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = reviewScreenViewModel;
        this.getHighSpeedVideoFpsRangesFor = transferMoneyboxRequest;
        this.Camera2StreamConfigurationMap = success;
    }
}
