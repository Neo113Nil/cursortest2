package com.paypal.android.threeds.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.threeds.viewmodel.ChallengeViewModel$initChallenge$1", f = "ChallengeViewModel.kt", i = {0}, l = {107}, m = "invokeSuspend", n = {"encryptedChallengeRequest"}, nl = {106}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class ChallengeViewModel$initChallenge$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.android.threeds.viewmodel.ChallengeViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.android.threeds.data.model.ChallengeRequest getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String encrypt$three_ds_release;
        com.paypal.android.threeds.repository.ChallengeRepository challengeRepository;
        androidx.view.MutableLiveData mutableLiveData;
        androidx.view.MutableLiveData mutableLiveData2;
        androidx.view.MutableLiveData mutableLiveData3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap.setProgressDialogState(true);
            com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel = this.Camera2StreamConfigurationMap;
            com.paypal.android.threeds.data.model.ChallengeRequest challengeRequest = this.getHighSpeedVideoFpsRangesFor;
            javax.crypto.SecretKey secretKey = challengeViewModel.getSecretKey();
            kotlin.jvm.internal.Intrinsics.checkNotNull(secretKey);
            encrypt$three_ds_release = challengeViewModel.getHighSpeedVideoSizesFor.encrypt$three_ds_release(challengeRequest, secretKey);
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge request encrypted successfully", null, null, 6, null);
            challengeRepository = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            com.paypal.android.threeds.data.model.AcsData acsData = this.Camera2StreamConfigurationMap.getAcsData();
            kotlin.jvm.internal.Intrinsics.checkNotNull(acsData);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encrypt$three_ds_release);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = challengeRepository.startChallenge(acsData.getAcsUrl(), encrypt$three_ds_release, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.paypal.android.threeds.network.NetworkResponse networkResponse = (com.paypal.android.threeds.network.NetworkResponse) obj;
        com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge response received from ACS", null, null, 6, null);
        this.Camera2StreamConfigurationMap.setProgressDialogState(false);
        if (networkResponse instanceof com.paypal.android.threeds.network.NetworkResponse.Success) {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge request successful", null, null, 6, null);
            try {
                com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel2 = this.Camera2StreamConfigurationMap;
                java.lang.String str = (java.lang.String) ((com.paypal.android.threeds.network.NetworkResponse.Success) networkResponse).getData();
                javax.crypto.SecretKey secretKey2 = this.Camera2StreamConfigurationMap.getSecretKey();
                kotlin.jvm.internal.Intrinsics.checkNotNull(secretKey2);
                com.paypal.android.threeds.data.model.ChallengeResponse decryptedChallengeResponse = challengeViewModel2.getDecryptedChallengeResponse(str, secretKey2, ((com.paypal.android.threeds.network.NetworkResponse.Success) networkResponse).isMockedResponse());
                com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge response decrypted successfully", null, null, 6, null);
                com.paypal.android.threeds.viewmodel.ChallengeViewModel.access$validateHtmlChallengeResponse(this.Camera2StreamConfigurationMap, decryptedChallengeResponse);
                com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "HTML challenge response validation passed", null, null, 6, null);
                mutableLiveData3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                mutableLiveData3.postValue(com.paypal.android.threeds.viewmodel.ChallengeViewModel.access$validateChallengeResponseParameters(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, decryptedChallengeResponse));
                com.paypal.android.logger.Logger.i$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge response posted successfully", null, null, 6, null);
            } catch (com.paypal.android.threeds.exceptions.SDKRuntimeException e) {
                mutableLiveData2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                mutableLiveData2.postValue(e);
            }
        } else {
            if (!(networkResponse instanceof com.paypal.android.threeds.network.NetworkResponse.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.threeds.network.NetworkResponse.Error error = (com.paypal.android.threeds.network.NetworkResponse.Error) networkResponse;
            com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Challenge request failed with error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", error.getErrorResponse())), null, null, 12, null);
            int code = error.getErrorResponse().code();
            java.lang.String message = error.getErrorResponse().message();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message, "");
            com.paypal.android.threeds.data.model.NetworkErrorResponse networkErrorResponse = new com.paypal.android.threeds.data.model.NetworkErrorResponse(code, message);
            mutableLiveData = this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI;
            mutableLiveData.postValue(networkErrorResponse);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.threeds.viewmodel.ChallengeViewModel$initChallenge$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.threeds.viewmodel.ChallengeViewModel$initChallenge$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChallengeViewModel$initChallenge$1(com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, com.paypal.android.threeds.data.model.ChallengeRequest challengeRequest, kotlin.coroutines.Continuation<? super com.paypal.android.threeds.viewmodel.ChallengeViewModel$initChallenge$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = challengeViewModel;
        this.getHighSpeedVideoFpsRangesFor = challengeRequest;
    }
}
