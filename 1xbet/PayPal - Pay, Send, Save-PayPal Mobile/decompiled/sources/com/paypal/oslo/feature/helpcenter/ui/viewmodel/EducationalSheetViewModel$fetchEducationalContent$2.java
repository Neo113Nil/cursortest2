package com.paypal.oslo.feature.helpcenter.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.ui.viewmodel.EducationalSheetViewModel$fetchEducationalContent$2", f = "EducationalSheetViewModel.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, nl = {55}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class EducationalSheetViewModel$fetchEducationalContent$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.viewmodel.EducationalSheetViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase fetchEducationalSheetDataUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        com.paypal.oslo.feature.helpcenter.ui.models.ScreenState failure;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            fetchEducationalSheetDataUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = mutableStateFlow;
            this.getHighSpeedVideoFpsRangesFor = 1;
            java.lang.Object invoke = fetchEducationalSheetDataUseCase.invoke(com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.CONSUMER, "SUMMARY", "TAX_EDUCATION_SHEET", this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableStateFlow2 = mutableStateFlow;
            obj = invoke;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow2 = (kotlinx.coroutines.flow.MutableStateFlow) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        if (either instanceof arrow.core.Either.Right) {
            failure = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success((com.paypal.oslo.feature.helpcenter.domain.models.EducationalSheetData) ((arrow.core.Either.Right) either).getValue());
        } else if (either instanceof arrow.core.Either.Left) {
            failure = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.INSTANCE.from(((com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError) ((arrow.core.Either.Left) either).getValue()).getCallError()), null, 2, null);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        mutableStateFlow2.setValue(failure);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.helpcenter.ui.viewmodel.EducationalSheetViewModel$fetchEducationalContent$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.helpcenter.ui.viewmodel.EducationalSheetViewModel$fetchEducationalContent$2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EducationalSheetViewModel$fetchEducationalContent$2(com.paypal.oslo.feature.helpcenter.ui.viewmodel.EducationalSheetViewModel educationalSheetViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.ui.viewmodel.EducationalSheetViewModel$fetchEducationalContent$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = educationalSheetViewModel;
    }
}
