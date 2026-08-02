package com.paypal.oslo.feature.xoom.ui.activitydetails;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel$initialize$1", f = "ActivityDetailsViewModel.kt", i = {2}, l = {71, 73, 84}, m = "invokeSuspend", n = {"result"}, nl = {73, 74, 73}, s = {"L$0"}, v = 2)
/* loaded from: classes16.dex */
final class ActivityDetailsViewModel$initialize$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent, kotlin.Unit> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b4, code lost:
    
        if (r6 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004d, code lost:
    
        if (r6 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003c, code lost:
    
        if (r6.invoke(r5) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.xoom.domain.usecase.SetUserAgreementAcceptedUseCase setUserAgreementAcceptedUseCase;
        com.paypal.oslo.feature.xoom.domain.usecase.ValidateUserUseCase validateUserUseCase;
        com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnNetworkError onNetworkError;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            setUserAgreementAcceptedUseCase = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    onNetworkError = (com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent) obj;
                    this.Camera2StreamConfigurationMap.invoke(onNetworkError);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.xoom.domain.model.UserValidationResult userValidationResult = (com.paypal.oslo.feature.xoom.domain.model.UserValidationResult) obj;
                if (kotlin.jvm.internal.Intrinsics.areEqual(userValidationResult, com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.UnlinkedUser.INSTANCE)) {
                    onNetworkError = com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnUnlinkedUserEncountered.INSTANCE;
                } else if (userValidationResult instanceof com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ForbiddenUser) {
                    com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ForbiddenUser forbiddenUser = (com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ForbiddenUser) userValidationResult;
                    onNetworkError = new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnForbiddenUserEncountered(forbiddenUser.getTitleRes(), forbiddenUser.getDescriptionRes(), forbiddenUser.getPrimaryButtonTextRes());
                } else if (userValidationResult instanceof com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.InactiveUser) {
                    onNetworkError = new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnInactiveUserEncountered(((com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.InactiveUser) userValidationResult).getFailedPaymentInfo());
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(userValidationResult, com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.NetworkError.INSTANCE)) {
                    onNetworkError = com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent.OnNetworkError.INSTANCE;
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(userValidationResult, com.paypal.oslo.feature.xoom.domain.model.UserValidationResult.ActiveUser.INSTANCE)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userValidationResult);
                    this.getHighResolutionOutputSizeshNQ4ISI = 3;
                    obj = com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel.access$createOnInitializedEvent(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this);
                }
                this.Camera2StreamConfigurationMap.invoke(onNetworkError);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        validateUserUseCase = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
        obj = validateUserUseCase.invoke(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel$initialize$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel$initialize$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ActivityDetailsViewModel$initialize$1(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel activityDetailsViewModel, java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel$initialize$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = activityDetailsViewModel;
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = function1;
    }
}
