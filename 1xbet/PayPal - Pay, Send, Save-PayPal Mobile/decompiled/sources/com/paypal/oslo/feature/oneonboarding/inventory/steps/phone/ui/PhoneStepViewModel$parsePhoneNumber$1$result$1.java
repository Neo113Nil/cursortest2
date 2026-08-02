package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberError;", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumber;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel$parsePhoneNumber$1$result$1", f = "PhoneStepViewModel.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PhoneStepViewModel$parsePhoneNumber$1$result$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, ? extends com.paypal.oslo.core.i18n.domain.model.PhoneNumber>>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase phoneNumberParseUseCase;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        phoneNumberParseUseCase = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRanges = 1;
        java.lang.Object invoke = phoneNumberParseUseCase.invoke(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, ? extends com.paypal.oslo.core.i18n.domain.model.PhoneNumber>> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel$parsePhoneNumber$1$result$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel$parsePhoneNumber$1$result$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PhoneStepViewModel$parsePhoneNumber$1$result$1(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel phoneStepViewModel, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest phoneNumberRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel$parsePhoneNumber$1$result$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = phoneStepViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = phoneNumberRequest;
    }
}
