package com.paypal.android.threeds.repository;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/android/threeds/repository/ApiRepository;", "", "Lcom/paypal/android/threeds/network/api/ThreeDsServerApi;", "threeDsApi", "<init>", "(Lcom/paypal/android/threeds/network/api/ThreeDsServerApi;)V", "Lcom/paypal/android/threeds/data/model/SdkDdcRequest;", "sdkDdcRequest", "Lcom/paypal/android/threeds/network/NetworkResponse;", "Lcom/paypal/android/threeds/data/model/SdkDdcResponse;", "sdkDDC", "(Lcom/paypal/android/threeds/data/model/SdkDdcRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/android/threeds/data/model/AuthenticationRequest;", "aReq", "Lcom/paypal/android/threeds/data/model/AuthenticationResponse;", "authenticateRequest", "(Lcom/paypal/android/threeds/data/model/AuthenticationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "url", "Lcom/paypal/android/threeds/data/model/InitChallengeSdkRequest;", "initChallengeSdkRequest", "Lcom/paypal/android/threeds/data/model/InitChallengeSdkResponse;", "initChallengeSdk", "(Ljava/lang/String;Lcom/paypal/android/threeds/data/model/InitChallengeSdkRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/android/threeds/network/api/ThreeDsServerApi;", "getThreeDsApi", "()Lcom/paypal/android/threeds/network/api/ThreeDsServerApi;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ApiRepository {
    public static final int $stable = 8;
    private final com.paypal.android.threeds.network.api.ThreeDsServerApi threeDsApi;

    public ApiRepository(com.paypal.android.threeds.network.api.ThreeDsServerApi threeDsServerApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threeDsServerApi, "");
        this.threeDsApi = threeDsServerApi;
    }

    public final com.paypal.android.threeds.network.api.ThreeDsServerApi getThreeDsApi() {
        return this.threeDsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object sdkDDC(com.paypal.android.threeds.data.model.SdkDdcRequest sdkDdcRequest, kotlin.coroutines.Continuation<? super com.paypal.android.threeds.network.NetworkResponse<com.paypal.android.threeds.data.model.SdkDdcResponse>> continuation) {
        com.paypal.android.threeds.repository.ApiRepository$sdkDDC$1 apiRepository$sdkDDC$1;
        int i;
        retrofit2.Response response;
        if (continuation instanceof com.paypal.android.threeds.repository.ApiRepository$sdkDDC$1) {
            apiRepository$sdkDDC$1 = (com.paypal.android.threeds.repository.ApiRepository$sdkDDC$1) continuation;
            if ((apiRepository$sdkDDC$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                apiRepository$sdkDDC$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = apiRepository$sdkDDC$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = apiRepository$sdkDDC$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.threeds.network.api.ThreeDsServerApi threeDsServerApi = this.threeDsApi;
                    apiRepository$sdkDDC$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sdkDdcRequest);
                    apiRepository$sdkDDC$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = threeDsServerApi.sdkDDC(sdkDdcRequest, apiRepository$sdkDDC$1);
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
                if (!response.isSuccessful()) {
                    com.paypal.android.threeds.data.model.SdkDdcResponse sdkDdcResponse = (com.paypal.android.threeds.data.model.SdkDdcResponse) response.body();
                    if (sdkDdcResponse != null) {
                        return new com.paypal.android.threeds.network.NetworkResponse.Success(sdkDdcResponse, false, 2, null);
                    }
                    return new com.paypal.android.threeds.network.NetworkResponse.Error(response);
                }
                return new com.paypal.android.threeds.network.NetworkResponse.Error(response);
            }
        }
        apiRepository$sdkDDC$1 = new com.paypal.android.threeds.repository.ApiRepository$sdkDDC$1(this, continuation);
        java.lang.Object obj2 = apiRepository$sdkDDC$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = apiRepository$sdkDDC$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        response = (retrofit2.Response) obj2;
        if (!response.isSuccessful()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object authenticateRequest(com.paypal.android.threeds.data.model.AuthenticationRequest authenticationRequest, kotlin.coroutines.Continuation<? super com.paypal.android.threeds.network.NetworkResponse<com.paypal.android.threeds.data.model.AuthenticationResponse>> continuation) {
        com.paypal.android.threeds.repository.ApiRepository$authenticateRequest$1 apiRepository$authenticateRequest$1;
        int i;
        retrofit2.Response response;
        if (continuation instanceof com.paypal.android.threeds.repository.ApiRepository$authenticateRequest$1) {
            apiRepository$authenticateRequest$1 = (com.paypal.android.threeds.repository.ApiRepository$authenticateRequest$1) continuation;
            if ((apiRepository$authenticateRequest$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                apiRepository$authenticateRequest$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = apiRepository$authenticateRequest$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = apiRepository$authenticateRequest$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.threeds.network.api.ThreeDsServerApi threeDsServerApi = this.threeDsApi;
                    apiRepository$authenticateRequest$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationRequest);
                    apiRepository$authenticateRequest$1.Camera2StreamConfigurationMap = 1;
                    obj = threeDsServerApi.authenticateRequest(authenticationRequest, apiRepository$authenticateRequest$1);
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
                if (!response.isSuccessful()) {
                    com.paypal.android.threeds.data.model.AuthenticationResponse authenticationResponse = (com.paypal.android.threeds.data.model.AuthenticationResponse) response.body();
                    if (authenticationResponse != null) {
                        return new com.paypal.android.threeds.network.NetworkResponse.Success(authenticationResponse, false, 2, null);
                    }
                    return new com.paypal.android.threeds.network.NetworkResponse.Error(response);
                }
                return new com.paypal.android.threeds.network.NetworkResponse.Error(response);
            }
        }
        apiRepository$authenticateRequest$1 = new com.paypal.android.threeds.repository.ApiRepository$authenticateRequest$1(this, continuation);
        java.lang.Object obj2 = apiRepository$authenticateRequest$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = apiRepository$authenticateRequest$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        response = (retrofit2.Response) obj2;
        if (!response.isSuccessful()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object initChallengeSdk(java.lang.String str, com.paypal.android.threeds.data.model.InitChallengeSdkRequest initChallengeSdkRequest, kotlin.coroutines.Continuation<? super com.paypal.android.threeds.network.NetworkResponse<com.paypal.android.threeds.data.model.InitChallengeSdkResponse>> continuation) {
        com.paypal.android.threeds.repository.ApiRepository$initChallengeSdk$1 apiRepository$initChallengeSdk$1;
        int i;
        retrofit2.Response response;
        if (continuation instanceof com.paypal.android.threeds.repository.ApiRepository$initChallengeSdk$1) {
            apiRepository$initChallengeSdk$1 = (com.paypal.android.threeds.repository.ApiRepository$initChallengeSdk$1) continuation;
            if ((apiRepository$initChallengeSdk$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                apiRepository$initChallengeSdk$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = apiRepository$initChallengeSdk$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = apiRepository$initChallengeSdk$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.threeds.network.api.ThreeDsServerApi threeDsServerApi = this.threeDsApi;
                    apiRepository$initChallengeSdk$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    apiRepository$initChallengeSdk$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(initChallengeSdkRequest);
                    apiRepository$initChallengeSdk$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = threeDsServerApi.initChallengeSdk(str, initChallengeSdkRequest, apiRepository$initChallengeSdk$1);
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
                if (!response.isSuccessful()) {
                    com.paypal.android.threeds.data.model.InitChallengeSdkResponse initChallengeSdkResponse = (com.paypal.android.threeds.data.model.InitChallengeSdkResponse) response.body();
                    if (initChallengeSdkResponse != null) {
                        return new com.paypal.android.threeds.network.NetworkResponse.Success(initChallengeSdkResponse, false, 2, null);
                    }
                    return new com.paypal.android.threeds.network.NetworkResponse.Error(response);
                }
                return new com.paypal.android.threeds.network.NetworkResponse.Error(response);
            }
        }
        apiRepository$initChallengeSdk$1 = new com.paypal.android.threeds.repository.ApiRepository$initChallengeSdk$1(this, continuation);
        java.lang.Object obj2 = apiRepository$initChallengeSdk$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = apiRepository$initChallengeSdk$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        response = (retrofit2.Response) obj2;
        if (!response.isSuccessful()) {
        }
    }
}
