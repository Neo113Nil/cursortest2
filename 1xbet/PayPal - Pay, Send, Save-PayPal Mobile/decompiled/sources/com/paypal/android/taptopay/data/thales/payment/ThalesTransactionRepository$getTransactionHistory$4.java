package com.paypal.android.taptopay.data.thales.payment;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/domain/model/payment/Transaction;", "Lcom/paypal/android/taptopay/domain/model/payment/GetTransactionHistoryError;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository$getTransactionHistory$4", f = "ThalesTransactionRepository.kt", i = {}, l = {68, 80, 91}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class ThalesTransactionRepository$getTransactionHistory$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends java.util.List<? extends com.paypal.android.taptopay.domain.model.payment.Transaction>, com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError>>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ boolean getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fd, code lost:
    
        if (r14 == r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0167, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
    
        if (r14 != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006e, code lost:
    
        if (r14 != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError.DefaultError defaultError;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Getting transaction history", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitalizedCardId", this.getHighSpeedVideoFpsRangesFor), kotlin.TuplesKt.to("from", this.Camera2StreamConfigurationMap), kotlin.TuplesKt.to("refreshAccessToken", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoSizes))), null, 4, null);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository.access$getAccessToken(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this);
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return (com.paypal.android.taptopay.domain.Result) obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.taptopay.domain.Result result = (com.paypal.android.taptopay.domain.Result) obj;
            if (result instanceof com.paypal.android.taptopay.domain.Result.Success) {
                return new com.paypal.android.taptopay.domain.Result.Success(((com.paypal.android.taptopay.domain.Result.Success) result).getResult());
            }
            if (!(result instanceof com.paypal.android.taptopay.domain.Result.Failure)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError mobileGatewayError = (com.gemalto.mfs.mwsdk.mobilegateway.MobileGatewayError) ((com.paypal.android.taptopay.domain.Result.Failure) result).getError();
            if (mobileGatewayError.getHTTPStatusCode() == 401 && !this.getHighSpeedVideoSizes) {
                com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Refresh Thales access token and retry getting transaction history.", null, null, 6, null);
                this.getHighSpeedVideoFpsRanges = 3;
                obj = this.getHighResolutionOutputSizeshNQ4ISI.getTransactionHistory$tap_to_pay_data_thales_release(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, true, this);
            } else {
                if (mobileGatewayError.getSDKErrorCode() == com.gemalto.mfs.mwsdk.mobilegateway.enrollment.MGErrorCode.NO_INTERNET) {
                    defaultError = com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError.DeviceOffline.INSTANCE;
                } else {
                    java.lang.String message = mobileGatewayError.getMessage();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(message, "");
                    defaultError = new com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError.DefaultError(message, mobileGatewayError.getCausingException());
                }
                return new com.paypal.android.taptopay.domain.Result.Failure(defaultError);
            }
        }
        com.paypal.android.taptopay.domain.Result result2 = (com.paypal.android.taptopay.domain.Result) obj;
        if (result2 instanceof com.paypal.android.taptopay.domain.Result.Success) {
            com.paypal.android.taptopay.domain.Result.Success success = (com.paypal.android.taptopay.domain.Result.Success) result2;
            com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Got access token to get transaction history,", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("digitalizedCardId", this.getHighSpeedVideoFpsRangesFor), kotlin.TuplesKt.to(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, success.getResult())), null, 4, null);
            this.getHighSpeedVideoFpsRanges = 2;
            obj = com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository.access$getTransactionHistory(this.getHighResolutionOutputSizeshNQ4ISI, (java.lang.String) success.getResult(), this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this);
        } else {
            if (!(result2 instanceof com.paypal.android.taptopay.domain.Result.Failure)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.taptopay.domain.Result.Failure failure = (com.paypal.android.taptopay.domain.Result.Failure) result2;
            com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Failed to get access token to get transaction history.", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", failure.getError())), null, 4, null);
            return new com.paypal.android.taptopay.domain.Result.Failure(failure.getError());
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends java.util.List<? extends com.paypal.android.taptopay.domain.model.payment.Transaction>, com.paypal.android.taptopay.domain.model.payment.GetTransactionHistoryError>> continuation) {
        return ((com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository$getTransactionHistory$4) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository$getTransactionHistory$4(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesTransactionRepository$getTransactionHistory$4(java.lang.String str, java.lang.String str2, boolean z, com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository thalesTransactionRepository, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.payment.ThalesTransactionRepository$getTransactionHistory$4> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoSizes = z;
        this.getHighResolutionOutputSizeshNQ4ISI = thalesTransactionRepository;
    }
}
