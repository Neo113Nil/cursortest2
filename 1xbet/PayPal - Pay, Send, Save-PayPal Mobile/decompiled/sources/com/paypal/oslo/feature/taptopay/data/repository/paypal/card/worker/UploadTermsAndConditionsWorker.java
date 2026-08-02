package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001BE\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0015\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/UploadTermsAndConditionsWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/tnc/TermsAndConditionsUploader;", "termsAndConditionsUploader", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/tnc/TermsAndConditionsRetriever;", "termsAndConditionsRetriever", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/ProcessUploadTnCResultHandler;", "processUploadTnCResultHandler", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/tnc/TermsAndConditionsDeleter;", "termsAndConditionsDeleter", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/tnc/TermsAndConditionsUploader;Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/tnc/TermsAndConditionsRetriever;Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/ProcessUploadTnCResultHandler;Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/tnc/TermsAndConditionsDeleter;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/tnc/TermsAndConditionsUploader;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/tnc/TermsAndConditionsRetriever;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/worker/ProcessUploadTnCResultHandler;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/card/tnc/TermsAndConditionsDeleter;", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UploadTermsAndConditionsWorker extends androidx.work.CoroutineWorker {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessUploadTnCResultHandler getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsUploader getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsDeleter Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsRetriever getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @dagger.assisted.AssistedInject
    public UploadTermsAndConditionsWorker(@dagger.assisted.Assisted android.content.Context context, @dagger.assisted.Assisted androidx.work.WorkerParameters workerParameters, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsUploader termsAndConditionsUploader, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsRetriever termsAndConditionsRetriever, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.ProcessUploadTnCResultHandler processUploadTnCResultHandler, com.paypal.oslo.feature.taptopay.data.repository.paypal.card.tnc.TermsAndConditionsDeleter termsAndConditionsDeleter, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsAndConditionsUploader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsAndConditionsRetriever, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processUploadTnCResultHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsAndConditionsDeleter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = termsAndConditionsUploader;
        this.getHighSpeedVideoSizes = termsAndConditionsRetriever;
        this.getHighSpeedVideoFpsRanges = processUploadTnCResultHandler;
        this.Camera2StreamConfigurationMap = termsAndConditionsDeleter;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker$doWork$1 uploadTermsAndConditionsWorker$doWork$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker$doWork$1) {
            uploadTermsAndConditionsWorker$doWork$1 = (com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker$doWork$1) continuation;
            if ((uploadTermsAndConditionsWorker$doWork$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                uploadTermsAndConditionsWorker$doWork$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = uploadTermsAndConditionsWorker$doWork$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = uploadTermsAndConditionsWorker$doWork$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Starting upload terms and conditions worker", null, null, 6, null);
                    kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker$doWork$2 uploadTermsAndConditionsWorker$doWork$2 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker$doWork$2(this, null);
                    uploadTermsAndConditionsWorker$doWork$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, uploadTermsAndConditionsWorker$doWork$2, uploadTermsAndConditionsWorker$doWork$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
        }
        uploadTermsAndConditionsWorker$doWork$1 = new com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker$doWork$1(this, continuation);
        java.lang.Object obj2 = uploadTermsAndConditionsWorker$doWork$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = uploadTermsAndConditionsWorker$doWork$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }
}
