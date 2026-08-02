package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel$submitErasureRequest$1", f = "ErasureReasonViewModel.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, nl = {51}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ErasureReasonViewModel$submitErasureRequest$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateErasureRequestUseCase createErasureRequestUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                createErasureRequestUseCase = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                obj = createErasureRequestUseCase.invoke(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this);
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
            if (ior instanceof arrow.core.Ior.Left) {
                mutableStateFlow4 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                mutableStateFlow4.setValue(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState.Error.INSTANCE);
            } else if (!(ior instanceof arrow.core.Ior.Both)) {
                mutableStateFlow2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                mutableStateFlow2.setValue(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState.Success.INSTANCE);
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.dataprivacy.LoggerKt.log, "submitErasureRequest partial success", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("left_value", ((com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError) ((arrow.core.Ior.Both) ior).getLeftValue()).toString())), null, 4, null);
                mutableStateFlow3 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                mutableStateFlow3.setValue(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState.PartialSuccess.INSTANCE);
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            com.paypal.oslo.feature.dataprivacy.LoggerKt.log.e("submitErasureRequest failed unexpectedly", th);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            mutableStateFlow.setValue(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState.Error.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel$submitErasureRequest$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel$submitErasureRequest$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ErasureReasonViewModel$submitErasureRequest$1(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel erasureReasonViewModel, java.util.List<? extends com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason> list, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel$submitErasureRequest$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = erasureReasonViewModel;
        this.getHighSpeedVideoFpsRangesFor = list;
        this.Camera2StreamConfigurationMap = str;
    }
}
