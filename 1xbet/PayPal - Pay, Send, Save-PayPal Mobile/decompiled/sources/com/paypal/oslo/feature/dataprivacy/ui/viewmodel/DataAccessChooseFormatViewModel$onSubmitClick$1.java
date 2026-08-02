package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel$onSubmitClick$1", f = "DataAccessChooseFormatViewModel.kt", i = {1, 2}, l = {86, 92, 98}, m = "invokeSuspend", n = {"result", "result"}, nl = {87, 94, 86}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes12.dex */
final class DataAccessChooseFormatViewModel$onSubmitClick$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<java.lang.String> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        if (r1.emit(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel.Effect.NavigateToConfirmation.INSTANCE, r7) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00da, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ce, code lost:
    
        if (r1.emit(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel.Effect.NavigateToConfirmation.INSTANCE, r7) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r8 != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.dataprivacy.domain.usecase.CreateDataAccessRequestUseCase createDataAccessRequestUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            mutableStateFlow.setValue(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel.SubmitState.Loading.INSTANCE);
            createDataAccessRequestUseCase = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = createDataAccessRequestUseCase.invoke(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this);
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        if (ior instanceof arrow.core.Ior.Left) {
            mutableStateFlow4 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            mutableStateFlow4.setValue(new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel.SubmitState.Error((com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError) ((arrow.core.Ior.Left) ior).getValue()));
        } else if (ior instanceof arrow.core.Ior.Right) {
            mutableStateFlow3 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            mutableStateFlow3.setValue(new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel.SubmitState.Success((java.lang.String) ((arrow.core.Ior.Right) ior).getValue()));
            mutableSharedFlow2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
        } else if (ior instanceof arrow.core.Ior.Both) {
            mutableStateFlow2 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            mutableStateFlow2.setValue(new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel.SubmitState.Success((java.lang.String) ((arrow.core.Ior.Both) ior).getRightValue()));
            mutableSharedFlow = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
            this.getHighResolutionOutputSizeshNQ4ISI = 3;
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel$onSubmitClick$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel$onSubmitClick$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataAccessChooseFormatViewModel$onSubmitClick$1(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel dataAccessChooseFormatViewModel, java.util.List<java.lang.String> list, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessChooseFormatViewModel$onSubmitClick$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = dataAccessChooseFormatViewModel;
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighSpeedVideoSizes = map;
    }
}
