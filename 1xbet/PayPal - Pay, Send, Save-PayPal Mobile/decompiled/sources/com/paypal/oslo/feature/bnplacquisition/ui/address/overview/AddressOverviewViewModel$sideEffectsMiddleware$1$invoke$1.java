package com.paypal.oslo.feature.bnplacquisition.ui.address.overview;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel$sideEffectsMiddleware$1$invoke$1", f = "AddressOverviewViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AddressOverviewViewModel$sideEffectsMiddleware$1$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewUiMapper addressOverviewUiMapper;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            addressOverviewUiMapper = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.AddressesFormatted(addressOverviewUiMapper.toUiModel(((com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent.LoadAddresses) this.getHighSpeedVideoFpsRangesFor).getFormattedAddressOverviewItems())));
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel$sideEffectsMiddleware$1$invoke$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel$sideEffectsMiddleware$1$invoke$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressOverviewViewModel$sideEffectsMiddleware$1$invoke$1(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel addressOverviewViewModel, com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewEvent addressOverviewEvent, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressOverviewViewModel$sideEffectsMiddleware$1$invoke$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = addressOverviewViewModel;
        this.getHighSpeedVideoFpsRangesFor = addressOverviewEvent;
    }
}
