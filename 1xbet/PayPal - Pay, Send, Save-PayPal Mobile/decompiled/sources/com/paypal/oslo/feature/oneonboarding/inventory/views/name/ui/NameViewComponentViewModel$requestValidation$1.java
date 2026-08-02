package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel$requestValidation$1", f = "NameViewComponentViewModel.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, nl = {127}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class NameViewComponentViewModel$requestValidation$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.PersonName Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.utils.NameValidationMessages getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel.access$validateName(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this);
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
        channel = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizesFor;
        channel.mo9266trySendJP2dKIU(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(booleanValue));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel$requestValidation$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel$requestValidation$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NameViewComponentViewModel$requestValidation$1(com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel nameViewComponentViewModel, com.paypal.oslo.core.i18n.domain.model.PersonName personName, java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.utils.NameValidationMessages nameValidationMessages, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel$requestValidation$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = nameViewComponentViewModel;
        this.Camera2StreamConfigurationMap = personName;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = nameValidationMessages;
    }
}
