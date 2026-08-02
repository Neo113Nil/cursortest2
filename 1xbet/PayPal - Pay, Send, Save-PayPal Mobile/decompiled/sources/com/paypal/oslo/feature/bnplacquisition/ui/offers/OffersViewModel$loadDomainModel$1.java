package com.paypal.oslo.feature.bnplacquisition.ui.offers;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$loadDomainModel$1", f = "OffersViewModel.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, nl = {142}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class OffersViewModel$loadDomainModel$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.LoadDomainData getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper offersUiMapper;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            offersUiMapper = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = offersUiMapper.toUiModel(this.getHighSpeedVideoFpsRangesFor.getAvailableOffersSuccessCreditApplication(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.Camera2StreamConfigurationMap.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.Success((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersUiModel) obj));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$loadDomainModel$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$loadDomainModel$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OffersViewModel$loadDomainModel$1(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel offersViewModel, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersEvent.LoadDomainData loadDomainData, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel$loadDomainModel$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = offersViewModel;
        this.getHighSpeedVideoFpsRangesFor = loadDomainData;
    }
}
