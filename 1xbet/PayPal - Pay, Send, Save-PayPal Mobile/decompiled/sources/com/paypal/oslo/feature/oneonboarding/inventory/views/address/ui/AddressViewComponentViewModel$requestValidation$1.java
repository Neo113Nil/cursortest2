package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel$requestValidation$1", f = "AddressViewComponentViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class AddressViewComponentViewModel$requestValidation$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.utils.AddressValidationMessages getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.Address getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel.access$validateAddress(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        channel = this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDuration;
        channel.mo9266trySendJP2dKIU(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel$requestValidation$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel$requestValidation$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressViewComponentViewModel$requestValidation$1(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel addressViewComponentViewModel, com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.utils.AddressValidationMessages addressValidationMessages, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel$requestValidation$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = addressViewComponentViewModel;
        this.getHighSpeedVideoSizes = address;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = addressValidationMessages;
    }
}
