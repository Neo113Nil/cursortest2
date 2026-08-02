package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel$formatAddress$1", f = "AddressViewComponentViewModel.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AddressViewComponentViewModel$formatAddress$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.Address getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase;
        com.paypal.oslo.core.i18n.domain.model.Address m11247copye42MVwM;
        java.lang.Object invoke;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            formatAddressUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            m11247copye42MVwM = r4.m11247copye42MVwM((r22 & 1) != 0 ? r4.addressLine1 : null, (r22 & 2) != 0 ? r4.addressLine2 : null, (r22 & 4) != 0 ? r4.addressLine3 : null, (r22 & 8) != 0 ? r4.adminArea4 : null, (r22 & 16) != 0 ? r4.adminArea3 : null, (r22 & 32) != 0 ? r4.adminArea2 : null, (r22 & 64) != 0 ? r4.adminArea1 : null, (r22 & 128) != 0 ? r4.postalCode : null, (r22 & 256) != 0 ? r4.countryCode : null, (r22 & 512) != 0 ? this.getHighSpeedVideoFpsRanges.detail : null);
            this.getHighSpeedVideoFpsRangesFor = 1;
            invoke = formatAddressUseCase.invoke(m11247copye42MVwM, new com.paypal.oslo.core.i18n.domain.model.AddressConfiguration(null, null, null, null, com.paypal.oslo.core.i18n.domain.model.Address.Style.MULTILINE, null, null, 111, null), this);
            if (invoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        arrow.core.Either either = (arrow.core.Either) invoke;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel addressViewComponentViewModel = this.Camera2StreamConfigurationMap;
        if (either instanceof arrow.core.Either.Right) {
            java.lang.String str = (java.lang.String) ((arrow.core.Either.Right) either).getValue();
            mutableStateFlow2 = addressViewComponentViewModel.getOutputFormats;
            mutableStateFlow2.setValue(str);
        } else if (either instanceof arrow.core.Either.Left) {
            mutableStateFlow = addressViewComponentViewModel.getOutputFormats;
            mutableStateFlow.setValue(null);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel$formatAddress$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel$formatAddress$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressViewComponentViewModel$formatAddress$1(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel addressViewComponentViewModel, com.paypal.oslo.core.i18n.domain.model.Address address, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel$formatAddress$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = addressViewComponentViewModel;
        this.getHighSpeedVideoFpsRanges = address;
    }
}
