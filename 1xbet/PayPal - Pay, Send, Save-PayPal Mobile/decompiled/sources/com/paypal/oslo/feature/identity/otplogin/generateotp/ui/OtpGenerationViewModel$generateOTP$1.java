package com.paypal.oslo.feature.identity.otplogin.generateotp.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel$generateOTP$1", f = "OtpGenerationViewModel.kt", i = {0, 0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 98}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$i$f$withLock", "selectedPhone", "request"}, nl = {185, 99}, s = {"L$0", "I$0", "L$0", "L$1"}, v = 2)
/* loaded from: classes12.dex */
final class OtpGenerationViewModel$generateOTP$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo> getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        if (r13 == r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        java.util.List<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo> list;
        com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.identity.otplogin.generateotp.domain.usecase.OtpGenerationUseCase otpGenerationUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = this.getOutputFormats.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel2 = this.getOutputFormats;
                list = this.getHighSpeedVideoSizes;
                this.getInputSizeshNQ4ISI = mutex;
                this.getOutputMinFrameDuration = otpGenerationViewModel2;
                this.getHighSpeedVideoSizesFor = list;
                this.Camera2StreamConfigurationMap = 0;
                this.getInputFormats = 1;
                if (mutex.lock(null, this) != coroutine_suspended) {
                    otpGenerationViewModel = otpGenerationViewModel2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                arrow.core.Either either = (arrow.core.Either) obj;
                com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel3 = this.getOutputFormats;
                if (either.isLeft()) {
                    com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError otpGenerationError = (com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationError) ((arrow.core.Either.Left) either).getValue();
                    mutableStateFlow4 = otpGenerationViewModel3.getHighSpeedVideoFpsRanges;
                    mutableStateFlow4.setValue(new com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Error(otpGenerationError));
                }
                com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel4 = this.getOutputFormats;
                if (either.isRight()) {
                    com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult.Success success = (com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationResult.Success) ((arrow.core.Either.Right) either).getValue();
                    mutableStateFlow3 = otpGenerationViewModel4.getHighSpeedVideoFpsRanges;
                    mutableStateFlow3.setValue(new com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationUiState.Success(success));
                }
                return kotlin.Unit.INSTANCE;
            }
            list = (java.util.List) this.getHighSpeedVideoSizesFor;
            otpGenerationViewModel = (com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel) this.getOutputMinFrameDuration;
            mutex = (kotlinx.coroutines.sync.Mutex) this.getInputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = otpGenerationViewModel.Camera2StreamConfigurationMap;
            com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo phoneChallengeInfo = (com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo) mutableStateFlow.getValue();
            if (phoneChallengeInfo == null) {
                java.lang.Object first = kotlin.collections.CollectionsKt.first((java.util.List<? extends java.lang.Object>) list);
                mutableStateFlow2 = otpGenerationViewModel.Camera2StreamConfigurationMap;
                mutableStateFlow2.setValue((com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo) first);
                phoneChallengeInfo = (com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo) first;
            }
            mutex.unlock(null);
            com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationRequest otpGenerationRequest = new com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.OtpGenerationRequest(phoneChallengeInfo.getChallengeId(), this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LOGIN);
            otpGenerationUseCase = this.getOutputFormats.getHighSpeedVideoSizes;
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(phoneChallengeInfo);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(otpGenerationRequest);
            this.getHighSpeedVideoSizesFor = null;
            this.getInputFormats = 2;
            obj = otpGenerationUseCase.invoke(otpGenerationRequest, this);
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel$generateOTP$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel$generateOTP$1(this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OtpGenerationViewModel$generateOTP$1(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo> list, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel$generateOTP$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = otpGenerationViewModel;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = str3;
        this.getHighSpeedVideoSizes = list;
    }
}
