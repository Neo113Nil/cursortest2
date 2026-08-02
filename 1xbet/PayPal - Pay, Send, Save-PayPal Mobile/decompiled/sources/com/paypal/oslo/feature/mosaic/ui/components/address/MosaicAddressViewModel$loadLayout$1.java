package com.paypal.oslo.feature.mosaic.ui.components.address;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel$loadLayout$1", f = "MosaicAddressViewModel.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, nl = {86}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class MosaicAddressViewModel$loadLayout$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getAddressLayoutUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = 1;
            obj = com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase.invoke$default(getAddressLayoutUseCase, null, null, this, 3, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel mosaicAddressViewModel = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout = (com.paypal.oslo.core.i18n.domain.model.AddressLayout) ((arrow.core.Either.Right) either).getValue();
            mviStateStore2 = mosaicAddressViewModel.Camera2StreamConfigurationMap;
            mviStateStore2.onEvent(new com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutLoaded(addressLayout));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.core.i18n.domain.model.AddressFormattingError addressFormattingError = (com.paypal.oslo.core.i18n.domain.model.AddressFormattingError) ((arrow.core.Either.Left) either).getValue();
            mviStateStore = mosaicAddressViewModel.Camera2StreamConfigurationMap;
            mviStateStore.onEvent(new com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiEvent.LayoutFailed(addressFormattingError.getDescription()));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel$loadLayout$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel$loadLayout$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MosaicAddressViewModel$loadLayout$1(com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel mosaicAddressViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel$loadLayout$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = mosaicAddressViewModel;
    }
}
