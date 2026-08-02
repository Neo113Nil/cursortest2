package com.paypal.oslo.feature.xoom.ui.sendmoney;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel$initialize$1", f = "SendMoneyViewModel.kt", i = {2}, l = {136, 141, 152}, m = "invokeSuspend", n = {"result"}, nl = {137, 142, 141}, s = {"L$0"}, v = 2)
/* loaded from: classes16.dex */
final class SendMoneyViewModel$initialize$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ java.lang.String getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d0, code lost:
    
        if (r12 == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005f, code lost:
    
        if (r12 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x003c, code lost:
    
        if (r12 != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.xoom.domain.usecase.GetUserAgreementAcceptedUseCase getUserAgreementAcceptedUseCase;
        com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase validateUserUseCase;
        com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnNetworkError onNetworkError;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getUserAgreementAcceptedUseCase = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
            this.getOutputFormats = 1;
            obj = getUserAgreementAcceptedUseCase.invoke(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    onNetworkError = (com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent) obj;
                    this.getHighResolutionOutputSizeshNQ4ISI.invoke(onNetworkError);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.xoom.domain.model.UserValidationResult userValidationResult = (com.paypal.oslo.feature.xoom.domain.model.UserValidationResult) obj;
                if (kotlin.jvm.internal.Intrinsics.areEqual(userValidationResult, com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.UnlinkedUser.INSTANCE)) {
                    onNetworkError = com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnUnlinkedUserEncountered.INSTANCE;
                } else if (userValidationResult instanceof com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ForbiddenUser) {
                    com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ForbiddenUser forbiddenUser = (com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ForbiddenUser) userValidationResult;
                    onNetworkError = new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnForbiddenUserEncountered(forbiddenUser.getTitleRes(), forbiddenUser.getDescriptionRes(), forbiddenUser.getPrimaryButtonTextRes());
                } else if (userValidationResult instanceof com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.InactiveUser) {
                    onNetworkError = new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnInactiveUserEncountered(((com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.InactiveUser) userValidationResult).getFailedPaymentInfo());
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(userValidationResult, com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.NetworkError.INSTANCE)) {
                    onNetworkError = com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.OnNetworkError.INSTANCE;
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(userValidationResult, com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ActiveUser.INSTANCE)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userValidationResult);
                    this.getOutputFormats = 3;
                    obj = com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel.access$createOnInitializedEventWithUrlAndHeaders(this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, this);
                }
                this.getHighResolutionOutputSizeshNQ4ISI.invoke(onNetworkError);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            validateUserUseCase = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            this.getOutputFormats = 2;
            obj = validateUserUseCase.invoke(this);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent.ShowInterstitial.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel$initialize$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel$initialize$1(this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoSizesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SendMoneyViewModel$initialize$1(com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel sendMoneyViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyEvent, kotlin.Unit> function1, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.ui.sendmoney.SendMoneyViewModel$initialize$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = sendMoneyViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getOutputMinFrameDuration = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighSpeedVideoFpsRanges = str3;
        this.Camera2StreamConfigurationMap = str4;
        this.getHighSpeedVideoSizes = str5;
        this.getHighSpeedVideoSizesFor = str6;
    }
}
