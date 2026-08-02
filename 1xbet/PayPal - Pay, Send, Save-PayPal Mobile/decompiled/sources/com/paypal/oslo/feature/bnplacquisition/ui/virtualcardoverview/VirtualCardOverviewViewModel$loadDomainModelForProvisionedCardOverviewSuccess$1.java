package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel$loadDomainModelForProvisionedCardOverviewSuccess$1", f = "VirtualCardOverviewViewModel.kt", i = {}, l = {510}, m = "invokeSuspend", n = {}, nl = {511}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class VirtualCardOverviewViewModel$loadDomainModelForProvisionedCardOverviewSuccess$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetailsSuccess getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiMapper virtualCardOverviewUiMapper;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            virtualCardOverviewUiMapper = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = virtualCardOverviewUiMapper.toUiModel(this.getHighSpeedVideoSizes, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.Camera2StreamConfigurationMap.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewEvent.ProvisionedCardOverviewSuccessDomainModelLoaded((com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewUiModel) obj));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel$loadDomainModelForProvisionedCardOverviewSuccess$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel$loadDomainModelForProvisionedCardOverviewSuccess$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VirtualCardOverviewViewModel$loadDomainModelForProvisionedCardOverviewSuccess$1(com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel virtualCardOverviewViewModel, com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.InStoreVccDetailsSuccess inStoreVccDetailsSuccess, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewViewModel$loadDomainModelForProvisionedCardOverviewSuccess$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = virtualCardOverviewViewModel;
        this.getHighSpeedVideoSizes = inStoreVccDetailsSuccess;
    }
}
