package com.paypal.oslo.feature.merchantbanking.ui.terms;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "either", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/merchantbanking/api/errors/AccountRoutingError;", "Lcom/paypal/oslo/feature/merchantbanking/domain/model/AccountRoutingInfoData;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel$provisionAccount$1", f = "AccountRoutingTermsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AccountRoutingTermsViewModel$provisionAccount$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<arrow.core.Either<? extends com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError, ? extends com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        arrow.core.Either either = (arrow.core.Either) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel accountRoutingTermsViewModel = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData accountRoutingInfoData = (com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow2 = accountRoutingTermsViewModel.getHighSpeedVideoFpsRanges;
            mutableStateFlow2.setValue(new com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentSuccess(accountRoutingInfoData));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError accountRoutingError = (com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError) ((arrow.core.Either.Left) either).getValue();
            mutableStateFlow = accountRoutingTermsViewModel.getHighSpeedVideoFpsRanges;
            mutableStateFlow.setValue(new com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsUiState.EnrollmentError(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel.access$mapErrorToErrorScreenType(accountRoutingTermsViewModel, accountRoutingError), 0L, 2, null));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(arrow.core.Either<? extends com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError, ? extends com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData> either, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel$provisionAccount$1) create(either, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel$provisionAccount$1 accountRoutingTermsViewModel$provisionAccount$1 = new com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel$provisionAccount$1(this.Camera2StreamConfigurationMap, continuation);
        accountRoutingTermsViewModel$provisionAccount$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return accountRoutingTermsViewModel$provisionAccount$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountRoutingTermsViewModel$provisionAccount$1(com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel accountRoutingTermsViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.merchantbanking.ui.terms.AccountRoutingTermsViewModel$provisionAccount$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = accountRoutingTermsViewModel;
    }
}
