package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel$getDepositOptions$1", f = "ReviewScreenViewModel.kt", i = {}, l = {com.datadog.android.core.internal.data.upload.DataOkHttpUploader.HTTP_ENTITY_TOO_LARGE}, m = "invokeSuspend", n = {}, nl = {androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ReviewScreenViewModel$getDepositOptions$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.wallet.fifo.addmoney.domain.usecase.GetDepositOptionsUseCase getDepositOptionsUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Loading.INSTANCE));
            getDepositOptionsUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            obj = getDepositOptionsUseCase.invoke(new com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionRequest(new com.paypal.oslo.feature.wallet.common.domain.model.Money(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap), com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.DepositType.ADD_FUNDS, null, 4, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = new com.paypal.oslo.feature.wallet.common.domain.model.Money(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
        com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel reviewScreenViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel.access$handleDepositOptionsError(reviewScreenViewModel, (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError) ((arrow.core.Ior.Left) ior).getValue(), money);
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel.access$handleDepositOptionsSuccess(reviewScreenViewModel, (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionCategories) ((arrow.core.Ior.Right) ior).getValue(), money);
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel.access$handleDepositOptionsError(reviewScreenViewModel, (com.paypal.oslo.feature.wallet.fifo.addmoney.domain.model.BalanceDepositSelectionError) leftValue, money);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel$getDepositOptions$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel$getDepositOptions$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewScreenViewModel$getDepositOptions$1(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel reviewScreenViewModel, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenViewModel$getDepositOptions$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = reviewScreenViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = str2;
    }
}
