package com.paypal.oslo.feature.identity.otplogin.generateotp.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel$selectPhone$1", f = "OtpGenerationViewModel.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, nl = {185}, s = {"L$0", "I$0"}, v = 2)
/* loaded from: classes12.dex */
final class OtpGenerationViewModel$selectPhone$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel getInputFormats;
    int getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel;
        kotlinx.coroutines.sync.Mutex mutex2;
        com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo phoneChallengeInfo;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutex = this.getInputFormats.getHighSpeedVideoFpsRangesFor;
            otpGenerationViewModel = this.getInputFormats;
            com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo phoneChallengeInfo2 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = mutex;
            this.getHighSpeedVideoFpsRangesFor = otpGenerationViewModel;
            this.getHighSpeedVideoFpsRanges = phoneChallengeInfo2;
            this.Camera2StreamConfigurationMap = 0;
            this.getInputSizeshNQ4ISI = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex2 = mutex;
            phoneChallengeInfo = phoneChallengeInfo2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            phoneChallengeInfo = (com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo) this.getHighSpeedVideoFpsRanges;
            otpGenerationViewModel = (com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel) this.getHighSpeedVideoFpsRangesFor;
            mutex2 = (kotlinx.coroutines.sync.Mutex) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            mutableStateFlow = otpGenerationViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow.setValue(phoneChallengeInfo);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            mutex2.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            mutex2.unlock(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel$selectPhone$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel$selectPhone$1(this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OtpGenerationViewModel$selectPhone$1(com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel otpGenerationViewModel, com.paypal.oslo.feature.identity.otplogin.generateotp.domain.model.PhoneChallengeInfo phoneChallengeInfo, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.otplogin.generateotp.ui.OtpGenerationViewModel$selectPhone$1> continuation) {
        super(2, continuation);
        this.getInputFormats = otpGenerationViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = phoneChallengeInfo;
    }
}
