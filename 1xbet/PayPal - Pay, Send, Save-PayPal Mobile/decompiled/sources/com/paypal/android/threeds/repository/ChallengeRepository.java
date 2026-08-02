package com.paypal.android.threeds.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/android/threeds/repository/ChallengeRepository;", "", "Lcom/paypal/android/threeds/network/api/AcsApi;", "acsApi", "<init>", "(Lcom/paypal/android/threeds/network/api/AcsApi;)V", "", "acsUrl", "encryptedChallengeRequest", "Lcom/paypal/android/threeds/network/NetworkResponse;", "startChallenge", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/android/threeds/data/model/ErrorMessage;", "errorMessage", "", "postErrorMessageToAcs", "(Ljava/lang/String;Lcom/paypal/android/threeds/data/model/ErrorMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/android/threeds/network/api/AcsApi;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ChallengeRepository {
    public static final int $stable = 8;
    private final com.paypal.android.threeds.network.api.AcsApi getHighSpeedVideoFpsRangesFor;

    public ChallengeRepository(com.paypal.android.threeds.network.api.AcsApi acsApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acsApi, "");
        this.getHighSpeedVideoFpsRangesFor = acsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object startChallenge(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.android.threeds.network.NetworkResponse<java.lang.String>> continuation) {
        com.paypal.android.threeds.repository.ChallengeRepository$startChallenge$1 challengeRepository$startChallenge$1;
        int i;
        retrofit2.Response response;
        if (continuation instanceof com.paypal.android.threeds.repository.ChallengeRepository$startChallenge$1) {
            challengeRepository$startChallenge$1 = (com.paypal.android.threeds.repository.ChallengeRepository$startChallenge$1) continuation;
            if ((challengeRepository$startChallenge$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                challengeRepository$startChallenge$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = challengeRepository$startChallenge$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = challengeRepository$startChallenge$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    okhttp3.RequestBody requestBodyFromString = com.paypal.android.threeds.utils.NetworkUtil.INSTANCE.getRequestBodyFromString(str2);
                    com.paypal.android.threeds.network.api.AcsApi acsApi = this.getHighSpeedVideoFpsRangesFor;
                    challengeRepository$startChallenge$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    challengeRepository$startChallenge$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
                    challengeRepository$startChallenge$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(requestBodyFromString);
                    challengeRepository$startChallenge$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = acsApi.startChallenge(str, requestBodyFromString, challengeRepository$startChallenge$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                response = (retrofit2.Response) obj;
                boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(response.message(), com.paypal.android.threeds.utils.NetworkUtil.MOCK_MESSAGE);
                if (!response.isSuccessful()) {
                    java.lang.String str3 = (java.lang.String) response.body();
                    if (str3 != null) {
                        return new com.paypal.android.threeds.network.NetworkResponse.Success(str3, areEqual);
                    }
                    return new com.paypal.android.threeds.network.NetworkResponse.Error(response);
                }
                return new com.paypal.android.threeds.network.NetworkResponse.Error(response);
            }
        }
        challengeRepository$startChallenge$1 = new com.paypal.android.threeds.repository.ChallengeRepository$startChallenge$1(this, continuation);
        java.lang.Object obj2 = challengeRepository$startChallenge$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = challengeRepository$startChallenge$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        response = (retrofit2.Response) obj2;
        boolean areEqual2 = kotlin.jvm.internal.Intrinsics.areEqual(response.message(), com.paypal.android.threeds.utils.NetworkUtil.MOCK_MESSAGE);
        if (!response.isSuccessful()) {
        }
    }

    public final java.lang.Object postErrorMessageToAcs(java.lang.String str, com.paypal.android.threeds.data.model.ErrorMessage errorMessage, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object postErrorMessageToAcs = this.getHighSpeedVideoFpsRangesFor.postErrorMessageToAcs(str, errorMessage, continuation);
        return postErrorMessageToAcs == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? postErrorMessageToAcs : kotlin.Unit.INSTANCE;
    }
}
