package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\f0\u0001¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u0003*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Lorg/jspecify/annotations/NonNull;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker$doWork$2", f = "UploadTermsAndConditionsWorker.kt", i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {64, 67, 79}, m = "invokeSuspend", n = {"$this$withContext", "deviceWalletServiceCardId", "$this$withContext", "deviceWalletServiceCardId", "termsData", "it", "$i$a$-let-UploadTermsAndConditionsWorker$doWork$2$1", "$this$withContext", "deviceWalletServiceCardId", "termsData", "it", "uploadResult", "workerResult", "$i$a$-let-UploadTermsAndConditionsWorker$doWork$2$1"}, nl = {66, 72, 81}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class UploadTermsAndConditionsWorker$doWork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        if (r6 != r2) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0124 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId;
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsRetriever termsAndConditionsRetriever;
        java.lang.Object invoke;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.TermsAndConditionsData termsAndConditionsData;
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker uploadTermsAndConditionsWorker;
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsUploader termsAndConditionsUploader;
        int i;
        java.lang.Object invoke2;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.TermsAndConditionsData termsAndConditionsData2;
        arrow.core.Either either;
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessUploadTnCResultHandler processUploadTnCResultHandler;
        androidx.work.ListenableWorker.Result invoke3;
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsDeleter termsAndConditionsDeleter;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId2;
        androidx.work.ListenableWorker.Result result;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getInputFormats;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.work.Data inputData = this.getInputSizeshNQ4ISI.getInputData();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputData, "");
            deviceWalletServiceCardId = com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toDeviceWalletServiceCardId(inputData);
            if (deviceWalletServiceCardId != null) {
                termsAndConditionsRetriever = this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes;
                this.getOutputMinFrameDuration = coroutineScope;
                this.getHighResolutionOutputSizeshNQ4ISI = deviceWalletServiceCardId;
                this.getInputFormats = 1;
                invoke = termsAndConditionsRetriever.invoke(deviceWalletServiceCardId, this);
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Worker failed: Device wallet id is null", null, null, 6, null);
                return androidx.work.ListenableWorker.Result.failure(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toErrorData("Worker failed, device wallet id is null"));
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    result = (androidx.work.ListenableWorker.Result) this.getOutputFormats;
                    deviceWalletServiceCardId2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId) this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    invoke3 = result;
                    deviceWalletServiceCardId = deviceWalletServiceCardId2;
                    if (invoke3 != null) {
                        return invoke3;
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Worker failed: Terms and conditions data is null", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId)), 2, null);
                    androidx.work.ListenableWorker.Result failure = androidx.work.ListenableWorker.Result.failure(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toErrorData("Terms and conditions data is null"));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failure, "");
                    return failure;
                }
                int i3 = this.Camera2StreamConfigurationMap;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.TermsAndConditionsData termsAndConditionsData3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.TermsAndConditionsData) this.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker uploadTermsAndConditionsWorker2 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker) this.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.TermsAndConditionsData termsAndConditionsData4 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.TermsAndConditionsData) this.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId deviceWalletServiceCardId3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                i = i3;
                deviceWalletServiceCardId = deviceWalletServiceCardId3;
                termsAndConditionsData2 = termsAndConditionsData4;
                uploadTermsAndConditionsWorker = uploadTermsAndConditionsWorker2;
                termsAndConditionsData = termsAndConditionsData3;
                invoke2 = obj;
                either = (arrow.core.Either) invoke2;
                processUploadTnCResultHandler = uploadTermsAndConditionsWorker.getHighSpeedVideoFpsRanges;
                invoke3 = processUploadTnCResultHandler.invoke(either, uploadTermsAndConditionsWorker.getRunAttemptCount(), deviceWalletServiceCardId);
                if (either.isRight()) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Upload Success, delete terms and conditions", null, null, 6, null);
                    termsAndConditionsDeleter = uploadTermsAndConditionsWorker.Camera2StreamConfigurationMap;
                    this.getOutputMinFrameDuration = coroutineScope;
                    this.getHighResolutionOutputSizeshNQ4ISI = deviceWalletServiceCardId;
                    this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(termsAndConditionsData2);
                    this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(termsAndConditionsData);
                    this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    this.getOutputFormats = invoke3;
                    this.Camera2StreamConfigurationMap = i;
                    this.getInputFormats = 3;
                    if (termsAndConditionsDeleter.invoke(deviceWalletServiceCardId, this) != coroutine_suspended) {
                        deviceWalletServiceCardId2 = deviceWalletServiceCardId;
                        result = invoke3;
                        invoke3 = result;
                        deviceWalletServiceCardId = deviceWalletServiceCardId2;
                    }
                    return coroutine_suspended;
                }
                if (invoke3 != null) {
                }
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Worker failed: Terms and conditions data is null", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId)), 2, null);
                androidx.work.ListenableWorker.Result failure2 = androidx.work.ListenableWorker.Result.failure(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toErrorData("Terms and conditions data is null"));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failure2, "");
                return failure2;
            }
            deviceWalletServiceCardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.DeviceWalletServiceCardId) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        termsAndConditionsData = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.TermsAndConditionsData) invoke;
        if (termsAndConditionsData != null) {
            uploadTermsAndConditionsWorker = this.getInputSizeshNQ4ISI;
            termsAndConditionsUploader = uploadTermsAndConditionsWorker.getHighSpeedVideoFpsRangesFor;
            java.lang.String tncText = termsAndConditionsData.getTncText();
            java.lang.String acceptedTime = termsAndConditionsData.getAcceptedTime();
            this.getOutputMinFrameDuration = coroutineScope;
            this.getHighResolutionOutputSizeshNQ4ISI = deviceWalletServiceCardId;
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(termsAndConditionsData);
            this.getHighSpeedVideoFpsRanges = uploadTermsAndConditionsWorker;
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(termsAndConditionsData);
            i = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getInputFormats = 2;
            invoke2 = termsAndConditionsUploader.invoke(deviceWalletServiceCardId, tncText, acceptedTime, this);
            if (invoke2 != coroutine_suspended) {
                termsAndConditionsData2 = termsAndConditionsData;
                either = (arrow.core.Either) invoke2;
                processUploadTnCResultHandler = uploadTermsAndConditionsWorker.getHighSpeedVideoFpsRanges;
                invoke3 = processUploadTnCResultHandler.invoke(either, uploadTermsAndConditionsWorker.getRunAttemptCount(), deviceWalletServiceCardId);
                if (either.isRight()) {
                }
                if (invoke3 != null) {
                }
            }
            return coroutine_suspended;
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Worker failed: Terms and conditions data is null", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("deviceWalletServiceCardId", deviceWalletServiceCardId)), 2, null);
        androidx.work.ListenableWorker.Result failure22 = androidx.work.ListenableWorker.Result.failure(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ExtensionsKt.toErrorData("Terms and conditions data is null"));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(failure22, "");
        return failure22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker$doWork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker$doWork$2 uploadTermsAndConditionsWorker$doWork$2 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker$doWork$2(this.getInputSizeshNQ4ISI, continuation);
        uploadTermsAndConditionsWorker$doWork$2.getOutputMinFrameDuration = obj;
        return uploadTermsAndConditionsWorker$doWork$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadTermsAndConditionsWorker$doWork$2(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker uploadTermsAndConditionsWorker, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker$doWork$2> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = uploadTermsAndConditionsWorker;
    }
}
