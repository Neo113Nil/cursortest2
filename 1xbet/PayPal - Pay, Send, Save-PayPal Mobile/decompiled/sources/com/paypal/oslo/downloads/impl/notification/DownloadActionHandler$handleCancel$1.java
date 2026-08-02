package com.paypal.oslo.downloads.impl.notification;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.notification.DownloadActionHandler$handleCancel$1", f = "DownloadActionHandler.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, nl = {85}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class DownloadActionHandler$handleCancel$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.BroadcastReceiver.PendingResult Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.downloads.impl.notification.DownloadActionHandler getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.downloads.api.DownloadManager downloadManager;
        com.paypal.oslo.downloads.worker.notification.WorkerNotificationManager workerNotificationManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    downloadManager = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                    this.getHighSpeedVideoFpsRanges = 1;
                    obj = downloadManager.mo11707cancelN7k_Iqk(com.paypal.oslo.downloads.api.model.DownloadId.m11726constructorimpl(this.getHighSpeedVideoFpsRangesFor), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    workerNotificationManager = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                    workerNotificationManager.cancelNotification(this.getHighSpeedVideoFpsRangesFor);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.downloads.LoggerKt.log, "Download cancelled via notification", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("downloadId", this.getHighSpeedVideoFpsRangesFor)), null, 4, null);
                } else {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.downloads.LoggerKt.log, "Failed to cancel download", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("downloadId", this.getHighSpeedVideoFpsRangesFor)), null, 4, null);
                }
            } catch (java.lang.Exception e) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.downloads.LoggerKt.log, "Error cancelling download", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("downloadId", this.getHighSpeedVideoFpsRangesFor)), null, e, 4, null);
            }
            this.Camera2StreamConfigurationMap.finish();
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.finish();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.downloads.impl.notification.DownloadActionHandler$handleCancel$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.downloads.impl.notification.DownloadActionHandler$handleCancel$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadActionHandler$handleCancel$1(com.paypal.oslo.downloads.impl.notification.DownloadActionHandler downloadActionHandler, java.lang.String str, android.content.BroadcastReceiver.PendingResult pendingResult, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.notification.DownloadActionHandler$handleCancel$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = downloadActionHandler;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = pendingResult;
    }
}
