package com.ingo.sdk.kotlin.common.features.submit_transaction;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/submit_transaction/SubmitTransactionRepositoryImpl;", "Lcom/ingo/sdk/kotlin/common/features/submit_transaction/SubmitTransactionRepository;", "Lcom/ingo/sdk/kotlin/common/features/submit_transaction/SubmitTransactionApi;", "submitTransactionApi", "Lcom/ingo/sdk/kotlin/common/features/location/LocationProvider;", "locationProvider", "<init>", "(Lcom/ingo/sdk/kotlin/common/features/submit_transaction/SubmitTransactionApi;Lcom/ingo/sdk/kotlin/common/features/location/LocationProvider;)V", "", "transactionReferenceNumber", "promoCode", "accountIdentifier", "Lcom/ingo/sdk/kotlin/common/constants/FundsTiming;", "fundsTiming", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/ApiFailure;", "Lcom/ingo/sdk/kotlin/common/features/submit_transaction/model/SubmitTransactionResponse;", "submitTransaction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingo/sdk/kotlin/common/constants/FundsTiming;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/ingo/sdk/kotlin/common/features/submit_transaction/SubmitTransactionApi;", "getHighSpeedVideoSizes", "Lcom/ingo/sdk/kotlin/common/features/location/LocationProvider;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SubmitTransactionRepositoryImpl implements com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionRepository {
    private final com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionApi Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.features.location.LocationProvider getHighSpeedVideoFpsRangesFor;

    public SubmitTransactionRepositoryImpl(com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionApi submitTransactionApi, com.ingo.sdk.kotlin.common.features.location.LocationProvider locationProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitTransactionApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationProvider, "");
        this.Camera2StreamConfigurationMap = submitTransactionApi;
        this.getHighSpeedVideoFpsRangesFor = locationProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r13 != r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object submitTransaction(java.lang.String str, java.lang.String str2, java.lang.String str3, com.ingo.sdk.kotlin.common.constants.FundsTiming fundsTiming, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<com.ingo.sdk.kotlin.common.core.exception.ApiFailure, com.ingo.sdk.kotlin.common.features.submit_transaction.model.SubmitTransactionResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionRepositoryImpl$submitTransaction$1 submitTransactionRepositoryImpl$submitTransaction$1;
        int i;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionRepositoryImpl$submitTransaction$1) {
            submitTransactionRepositoryImpl$submitTransaction$1 = (com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionRepositoryImpl$submitTransaction$1) continuation;
            if ((submitTransactionRepositoryImpl$submitTransaction$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                submitTransactionRepositoryImpl$submitTransaction$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionRepositoryImpl$submitTransaction$1 submitTransactionRepositoryImpl$submitTransaction$12 = submitTransactionRepositoryImpl$submitTransaction$1;
                java.lang.Object obj = submitTransactionRepositoryImpl$submitTransaction$12.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = submitTransactionRepositoryImpl$submitTransaction$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.ingo.sdk.kotlin.common.features.location.LocationProvider locationProvider = this.getHighSpeedVideoFpsRangesFor;
                    submitTransactionRepositoryImpl$submitTransaction$12.getHighSpeedVideoFpsRanges = str;
                    submitTransactionRepositoryImpl$submitTransaction$12.getHighSpeedVideoSizes = str2;
                    submitTransactionRepositoryImpl$submitTransaction$12.getHighSpeedVideoFpsRangesFor = str3;
                    submitTransactionRepositoryImpl$submitTransaction$12.Camera2StreamConfigurationMap = fundsTiming;
                    submitTransactionRepositoryImpl$submitTransaction$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = locationProvider.getLocationData(submitTransactionRepositoryImpl$submitTransaction$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    fundsTiming = (com.ingo.sdk.kotlin.common.constants.FundsTiming) submitTransactionRepositoryImpl$submitTransaction$12.Camera2StreamConfigurationMap;
                    str3 = (java.lang.String) submitTransactionRepositoryImpl$submitTransaction$12.getHighSpeedVideoFpsRangesFor;
                    str2 = (java.lang.String) submitTransactionRepositoryImpl$submitTransaction$12.getHighSpeedVideoSizes;
                    str = (java.lang.String) submitTransactionRepositoryImpl$submitTransaction$12.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionApi submitTransactionApi = this.Camera2StreamConfigurationMap;
                submitTransactionRepositoryImpl$submitTransaction$12.getHighSpeedVideoFpsRanges = null;
                submitTransactionRepositoryImpl$submitTransaction$12.getHighSpeedVideoSizes = null;
                submitTransactionRepositoryImpl$submitTransaction$12.getHighSpeedVideoFpsRangesFor = null;
                submitTransactionRepositoryImpl$submitTransaction$12.Camera2StreamConfigurationMap = null;
                submitTransactionRepositoryImpl$submitTransaction$12.getHighResolutionOutputSizeshNQ4ISI = 2;
                java.lang.Object submitTransaction = submitTransactionApi.submitTransaction(str, str2, str3, fundsTiming, (com.ingo.sdk.kotlin.common.features.location.LocationData) obj, submitTransactionRepositoryImpl$submitTransaction$12);
                return submitTransaction != coroutine_suspended ? coroutine_suspended : submitTransaction;
            }
        }
        submitTransactionRepositoryImpl$submitTransaction$1 = new com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionRepositoryImpl$submitTransaction$1(this, continuation);
        com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionRepositoryImpl$submitTransaction$1 submitTransactionRepositoryImpl$submitTransaction$122 = submitTransactionRepositoryImpl$submitTransaction$1;
        java.lang.Object obj2 = submitTransactionRepositoryImpl$submitTransaction$122.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = submitTransactionRepositoryImpl$submitTransaction$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.ingo.sdk.kotlin.common.features.submit_transaction.SubmitTransactionApi submitTransactionApi2 = this.Camera2StreamConfigurationMap;
        submitTransactionRepositoryImpl$submitTransaction$122.getHighSpeedVideoFpsRanges = null;
        submitTransactionRepositoryImpl$submitTransaction$122.getHighSpeedVideoSizes = null;
        submitTransactionRepositoryImpl$submitTransaction$122.getHighSpeedVideoFpsRangesFor = null;
        submitTransactionRepositoryImpl$submitTransaction$122.Camera2StreamConfigurationMap = null;
        submitTransactionRepositoryImpl$submitTransaction$122.getHighResolutionOutputSizeshNQ4ISI = 2;
        java.lang.Object submitTransaction2 = submitTransactionApi2.submitTransaction(str, str2, str3, fundsTiming, (com.ingo.sdk.kotlin.common.features.location.LocationData) obj2, submitTransactionRepositoryImpl$submitTransaction$122);
        if (submitTransaction2 != coroutine_suspended2) {
        }
    }
}
