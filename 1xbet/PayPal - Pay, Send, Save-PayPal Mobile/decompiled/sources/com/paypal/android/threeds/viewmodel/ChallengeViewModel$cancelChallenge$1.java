package com.paypal.android.threeds.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.threeds.viewmodel.ChallengeViewModel$cancelChallenge$1", f = "ChallengeViewModel.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, m = "invokeSuspend", n = {"encryptedChallengeRequest"}, nl = {255}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class ChallengeViewModel$cancelChallenge$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.android.threeds.data.model.ChallengeRequest Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.android.threeds.viewmodel.ChallengeViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String encrypt$three_ds_release;
        com.paypal.android.threeds.repository.ChallengeRepository challengeRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes.setProgressDialogState(true);
            com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel = this.getHighSpeedVideoSizes;
            com.paypal.android.threeds.data.model.ChallengeRequest challengeRequest = this.Camera2StreamConfigurationMap;
            javax.crypto.SecretKey secretKey = challengeViewModel.getSecretKey();
            kotlin.jvm.internal.Intrinsics.checkNotNull(secretKey);
            encrypt$three_ds_release = challengeViewModel.getHighSpeedVideoSizesFor.encrypt$three_ds_release(challengeRequest, secretKey);
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge cancellation request encrypted", null, null, 6, null);
            challengeRepository = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            com.paypal.android.threeds.data.model.AcsData acsData = this.getHighSpeedVideoSizes.getAcsData();
            kotlin.jvm.internal.Intrinsics.checkNotNull(acsData);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encrypt$three_ds_release);
            this.getHighSpeedVideoFpsRanges = 1;
            if (challengeRepository.startChallenge(acsData.getAcsUrl(), encrypt$three_ds_release, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge cancellation request sent to ACS", null, null, 6, null);
        this.getHighSpeedVideoSizes.setProgressDialogState(false);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.threeds.viewmodel.ChallengeViewModel$cancelChallenge$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.threeds.viewmodel.ChallengeViewModel$cancelChallenge$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengeViewModel$cancelChallenge$1(com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, com.paypal.android.threeds.data.model.ChallengeRequest challengeRequest, kotlin.coroutines.Continuation<? super com.paypal.android.threeds.viewmodel.ChallengeViewModel$cancelChallenge$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = challengeViewModel;
        this.Camera2StreamConfigurationMap = challengeRequest;
    }
}
