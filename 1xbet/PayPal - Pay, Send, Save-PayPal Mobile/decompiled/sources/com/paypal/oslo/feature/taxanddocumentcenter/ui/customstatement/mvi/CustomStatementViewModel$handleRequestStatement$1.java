package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel$handleRequestStatement$1", f = "CustomStatementViewModel.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, nl = {103}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class CustomStatementViewModel$handleRequestStatement$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.RequestStatementUseCase requestStatementUseCase;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore2;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore3;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore4;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            requestStatementUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = 1;
            obj = requestStatementUseCase.invoke(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.GenerateStatementRequest.INSTANCE.fromUiState(this.getHighResolutionOutputSizeshNQ4ISI.getSelectedTransactionTypeIndex(), this.getHighResolutionOutputSizeshNQ4ISI.getSelectedFormatIndex(), this.getHighResolutionOutputSizeshNQ4ISI.getSelectedDateFilterIndex(), this.getHighResolutionOutputSizeshNQ4ISI.getFromDate(), this.getHighResolutionOutputSizeshNQ4ISI.getToDate()), this);
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
        com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel customStatementViewModel = this.getHighSpeedVideoFpsRanges;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) ((arrow.core.Ior.Left) ior).getValue();
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Custom statement request failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", taxDocumentCenterError.getClass().getSimpleName()), kotlin.TuplesKt.to("errorMessage", com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterErrorKt.toErrorMessage(taxDocumentCenterError))), null, 4, null);
            mviStateStore5 = customStatementViewModel.getHighSpeedVideoFpsRanges;
            mviStateStore5.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementError.INSTANCE);
        } else if (ior instanceof arrow.core.Ior.Right) {
            if (((java.lang.Boolean) ((arrow.core.Ior.Right) ior).getValue()).booleanValue()) {
                mviStateStore4 = customStatementViewModel.getHighSpeedVideoFpsRanges;
                mviStateStore4.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementSuccess.INSTANCE);
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Custom statement request returned false - empty or invalid data", null, null, 6, null);
                mviStateStore3 = customStatementViewModel.getHighSpeedVideoFpsRanges;
                mviStateStore3.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementError.INSTANCE);
            }
        } else {
            if (!(ior instanceof arrow.core.Ior.Both)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError taxDocumentCenterError2 = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError) both.getLeftValue();
            if (((java.lang.Boolean) both.getRightValue()).booleanValue()) {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Custom statement request completed with warnings", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", taxDocumentCenterError2.getClass().getSimpleName()), kotlin.TuplesKt.to("errorMessage", com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterErrorKt.toErrorMessage(taxDocumentCenterError2))), null, 4, null);
                mviStateStore2 = customStatementViewModel.getHighSpeedVideoFpsRanges;
                mviStateStore2.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementSuccess.INSTANCE);
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Custom statement request failed with both error and false result", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", taxDocumentCenterError2.getClass().getSimpleName()), kotlin.TuplesKt.to("errorMessage", com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterErrorKt.toErrorMessage(taxDocumentCenterError2))), null, 4, null);
                mviStateStore = customStatementViewModel.getHighSpeedVideoFpsRanges;
                mviStateStore.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementError.INSTANCE);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel$handleRequestStatement$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel$handleRequestStatement$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomStatementViewModel$handleRequestStatement$1(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel customStatementViewModel, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content content, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementViewModel$handleRequestStatement$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = customStatementViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = content;
    }
}
