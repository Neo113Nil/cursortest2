package com.paypal.oslo.feature.taptopay.data.worker.paypal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$invoke$2", f = "FailedNotificationRetrier.kt", i = {}, l = {47, 48, 49, 50, 51}, m = "invokeSuspend", n = {}, nl = {48, 49, 50, 51, 52}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class FailedNotificationRetrier$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier.access$retryUpdateCardNotifications(r7.getHighSpeedVideoFpsRangesFor, r7) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier.access$retrySuspendCardNotifications(r7.getHighSpeedVideoFpsRangesFor, r7) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier.access$retryResumeCardNotifications(r7.getHighSpeedVideoFpsRangesFor, r7) != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier.access$retryDeleteCardNotifications(r7.getHighSpeedVideoFpsRangesFor, r7) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        if (com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier.access$retryAddCardNotifications(r7.getHighSpeedVideoFpsRangesFor, r7) != r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 3;
        } else if (i == 3) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 4;
        } else {
            if (i != 4) {
                if (i != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 5;
        }
        this.Camera2StreamConfigurationMap = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$invoke$2(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FailedNotificationRetrier$invoke$2(com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier failedNotificationRetrier, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.worker.paypal.FailedNotificationRetrier$invoke$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = failedNotificationRetrier;
    }
}
