package com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker", f = "UploadTermsAndConditionsWorker.kt", i = {}, l = {56}, m = "doWork", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class UploadTermsAndConditionsWorker$doWork$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.doWork(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UploadTermsAndConditionsWorker$doWork$1(com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker uploadTermsAndConditionsWorker, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.paypal.card.worker.UploadTermsAndConditionsWorker$doWork$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = uploadTermsAndConditionsWorker;
    }
}
