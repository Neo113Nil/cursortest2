package com.paypal.oslo.feature.xoom.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserError;", "Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase$invoke$2", f = "ValidateInactiveUserUseCase.kt", i = {0}, l = {36}, m = "invokeSuspend", n = {com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes16.dex */
final class ValidateInactiveUserUseCase$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.xoom.domain.model.UserError, ? extends com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo>>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.xoom.domain.repository.XoomRepository xoomRepository;
        java.lang.String str = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        xoomRepository = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object createFailedPaymentInfo = xoomRepository.createFailedPaymentInfo(str, this);
        return createFailedPaymentInfo == coroutine_suspended ? coroutine_suspended : createFailedPaymentInfo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.xoom.domain.model.UserError, ? extends com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo>> continuation) {
        return ((com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase$invoke$2) create(str, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase$invoke$2 validateInactiveUserUseCase$invoke$2 = new com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase$invoke$2(this.getHighSpeedVideoFpsRanges, continuation);
        validateInactiveUserUseCase$invoke$2.getHighResolutionOutputSizeshNQ4ISI = obj;
        return validateInactiveUserUseCase$invoke$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ValidateInactiveUserUseCase$invoke$2(com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase validateInactiveUserUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = validateInactiveUserUseCase;
    }
}
