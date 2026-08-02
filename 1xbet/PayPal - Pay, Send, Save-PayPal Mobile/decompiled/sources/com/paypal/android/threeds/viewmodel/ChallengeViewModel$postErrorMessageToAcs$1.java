package com.paypal.android.threeds.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.threeds.viewmodel.ChallengeViewModel$postErrorMessageToAcs$1", f = "ChallengeViewModel.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m = "invokeSuspend", n = {"it", "$i$a$-let-ChallengeViewModel$postErrorMessageToAcs$1$1"}, nl = {241}, s = {"L$0", "I$0"}, v = 2)
/* loaded from: classes10.dex */
final class ChallengeViewModel$postErrorMessageToAcs$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.android.threeds.data.model.ErrorMessage getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.android.threeds.viewmodel.ChallengeViewModel getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.android.threeds.repository.ChallengeRepository challengeRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.Camera2StreamConfigurationMap;
            if (str != null) {
                com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel = this.getInputFormats;
                com.paypal.android.threeds.data.model.ErrorMessage errorMessage = this.getHighSpeedVideoFpsRanges;
                challengeRepository = challengeViewModel.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                this.getHighSpeedVideoFpsRangesFor = 0;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (challengeRepository.postErrorMessageToAcs(str, errorMessage, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Error message posted to ACS successfully", null, null, 6, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.threeds.viewmodel.ChallengeViewModel$postErrorMessageToAcs$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.threeds.viewmodel.ChallengeViewModel$postErrorMessageToAcs$1(this.Camera2StreamConfigurationMap, this.getInputFormats, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengeViewModel$postErrorMessageToAcs$1(java.lang.String str, com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, com.paypal.android.threeds.data.model.ErrorMessage errorMessage, kotlin.coroutines.Continuation<? super com.paypal.android.threeds.viewmodel.ChallengeViewModel$postErrorMessageToAcs$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = str;
        this.getInputFormats = challengeViewModel;
        this.getHighSpeedVideoFpsRanges = errorMessage;
    }
}
