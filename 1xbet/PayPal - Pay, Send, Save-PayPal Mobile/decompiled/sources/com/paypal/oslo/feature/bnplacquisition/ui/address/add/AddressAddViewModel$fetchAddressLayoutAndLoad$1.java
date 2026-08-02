package com.paypal.oslo.feature.bnplacquisition.ui.address.add;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel$fetchAddressLayoutAndLoad$1", f = "AddressAddViewModel.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, nl = {156}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AddressAddViewModel$fetchAddressLayoutAndLoad$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.Address Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase;
        com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddUiMapper addressAddUiMapper;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getAddressLayoutUseCase = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
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
        com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel addressAddViewModel = this.getHighSpeedVideoSizes;
        com.paypal.oslo.core.i18n.domain.model.Address address = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout = (com.paypal.oslo.core.i18n.domain.model.AddressLayout) ((arrow.core.Either.Right) either).getValue();
            addressAddUiMapper = addressAddViewModel.getHighSpeedVideoSizes;
            addressAddViewModel.processEvent(new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.AddressFieldsBuilt(addressAddUiMapper.toUiModel(addressLayout, address)));
        } else if (either instanceof arrow.core.Either.Left) {
            addressAddViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddEvent.LayoutFailedToLoad.INSTANCE);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel$fetchAddressLayoutAndLoad$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel$fetchAddressLayoutAndLoad$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressAddViewModel$fetchAddressLayoutAndLoad$1(com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel addressAddViewModel, com.paypal.oslo.core.i18n.domain.model.Address address, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.address.add.AddressAddViewModel$fetchAddressLayoutAndLoad$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = addressAddViewModel;
        this.Camera2StreamConfigurationMap = address;
    }
}
