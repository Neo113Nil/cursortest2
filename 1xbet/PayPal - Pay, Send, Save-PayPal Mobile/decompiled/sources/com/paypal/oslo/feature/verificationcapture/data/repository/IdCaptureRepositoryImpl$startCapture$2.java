package com.paypal.oslo.feature.verificationcapture.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.data.repository.IdCaptureRepositoryImpl$startCapture$2", f = "IdCaptureRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class IdCaptureRepositoryImpl$startCapture$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.data.repository.IdCaptureRepositoryImpl Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource daonDocumentCaptureDataSource;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            daonDocumentCaptureDataSource = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
            daonDocumentCaptureDataSource.getGetHighResolutionOutputSizeshNQ4ISI();
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.data.repository.IdCaptureRepositoryImpl$startCapture$2(this.Camera2StreamConfigurationMap, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdCaptureRepositoryImpl$startCapture$2(com.paypal.oslo.feature.verificationcapture.data.repository.IdCaptureRepositoryImpl idCaptureRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.data.repository.IdCaptureRepositoryImpl$startCapture$2> continuation) {
        super(3, continuation);
        this.Camera2StreamConfigurationMap = idCaptureRepositoryImpl;
    }
}
