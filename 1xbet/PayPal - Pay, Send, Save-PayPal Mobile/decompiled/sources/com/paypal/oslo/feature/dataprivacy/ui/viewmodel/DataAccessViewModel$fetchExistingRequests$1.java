package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessViewModel$fetchExistingRequests$1", f = "DataAccessViewModel.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, nl = {79}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DataAccessViewModel$fetchExistingRequests$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.dataprivacy.domain.usecase.GetExistingRequestsUseCase getExistingRequestsUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getExistingRequestsUseCase = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = getExistingRequestsUseCase.invoke(this);
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
        mutableStateFlow = this.Camera2StreamConfigurationMap.getInputFormats;
        if (ior instanceof arrow.core.Ior.Left) {
            obj2 = (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState) new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Error((com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError) ((arrow.core.Ior.Left) ior).getValue());
        } else if (ior instanceof arrow.core.Ior.Right) {
            obj2 = (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState) new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Success((java.util.List) ((arrow.core.Ior.Right) ior).getValue());
        } else {
            if (!(ior instanceof arrow.core.Ior.Both)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            obj2 = (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState) new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.PartialSuccess((java.util.List) both.getRightValue(), (com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError) both.getLeftValue());
        }
        mutableStateFlow.setValue(obj2);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessViewModel$fetchExistingRequests$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessViewModel$fetchExistingRequests$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataAccessViewModel$fetchExistingRequests$1(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessViewModel dataAccessViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessViewModel$fetchExistingRequests$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = dataAccessViewModel;
    }
}
