package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel$parsePhoneNumber$1", f = "PhoneStepViewModel.kt", i = {}, l = {com.visa.cbp.getCertUsage.setAppPrgrmID}, m = "invokeSuspend", n = {}, nl = {338}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PhoneStepViewModel$parsePhoneNumber$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, com.paypal.oslo.core.i18n.domain.model.PhoneNumber>, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.CoroutineContext coroutineContext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineContext = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = kotlinx.coroutines.BuildersKt.withContext(coroutineContext, new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel$parsePhoneNumber$1$result$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.invoke((arrow.core.Either) obj);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel$parsePhoneNumber$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel$parsePhoneNumber$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PhoneStepViewModel$parsePhoneNumber$1(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel phoneStepViewModel, kotlin.jvm.functions.Function1<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, com.paypal.oslo.core.i18n.domain.model.PhoneNumber>, kotlin.Unit> function1, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest phoneNumberRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel$parsePhoneNumber$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = phoneStepViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = phoneNumberRequest;
    }
}
