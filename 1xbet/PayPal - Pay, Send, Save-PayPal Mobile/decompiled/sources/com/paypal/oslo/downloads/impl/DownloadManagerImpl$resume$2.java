package com.paypal.oslo.downloads.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.DownloadManagerImpl$resume$2", f = "DownloadManagerImpl.kt", i = {1, 2, 2, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 130, 145}, m = "invokeSuspend", n = {"entity", "entity", "config", "priority", "workRequestId"}, nl = {126, 135, 150}, s = {"L$0", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadManagerImpl$resume$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.downloads.impl.DownloadManagerImpl getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao;
        java.lang.Object byId;
        com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity;
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao2;
        com.paypal.oslo.downloads.api.model.DownloadConfig Camera2StreamConfigurationMap;
        com.paypal.oslo.downloads.worker.DownloadWorkScheduler downloadWorkScheduler;
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao3;
        java.lang.String str;
        java.lang.String obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            downloadDao = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
            this.getInputSizeshNQ4ISI = 1;
            byId = downloadDao.getById(this.getHighSpeedVideoFpsRangesFor, this);
            if (byId == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                }
                downloadEntity = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
                Camera2StreamConfigurationMap = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(downloadEntity.getConfigJson());
                com.paypal.oslo.downloads.api.model.DownloadPriority access$parsePriority = com.paypal.oslo.downloads.impl.DownloadManagerImpl.access$parsePriority(this.getHighSpeedVideoSizesFor, downloadEntity.getPriority());
                downloadWorkScheduler = this.getHighSpeedVideoSizesFor.getOutputFormats;
                java.util.UUID m11759scheduleDownload6HENkBo = downloadWorkScheduler.m11759scheduleDownload6HENkBo(this.getHighSpeedVideoFpsRangesFor, Camera2StreamConfigurationMap, access$parsePriority, true);
                downloadDao3 = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
                str = this.getHighSpeedVideoFpsRangesFor;
                obj2 = m11759scheduleDownload6HENkBo.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadEntity);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(Camera2StreamConfigurationMap);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$parsePriority);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m11759scheduleDownload6HENkBo);
                this.getInputSizeshNQ4ISI = 3;
                if (com.paypal.oslo.downloads.impl.data.dao.DownloadDao.updateWorkRequestId$default(downloadDao3, str, obj2, 0L, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
            }
            kotlin.ResultKt.throwOnFailure(obj);
            byId = obj;
        }
        downloadEntity = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) byId;
        if (downloadEntity == null) {
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        if (downloadEntity.canResume()) {
            downloadDao2 = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = downloadEntity;
            this.getInputSizeshNQ4ISI = 2;
            if (com.paypal.oslo.downloads.impl.data.dao.DownloadDao.updateState$default(downloadDao2, this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.downloads.impl.DownloadStateValue.QUEUED, null, 0L, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            Camera2StreamConfigurationMap = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap(downloadEntity.getConfigJson());
            com.paypal.oslo.downloads.api.model.DownloadPriority access$parsePriority2 = com.paypal.oslo.downloads.impl.DownloadManagerImpl.access$parsePriority(this.getHighSpeedVideoSizesFor, downloadEntity.getPriority());
            downloadWorkScheduler = this.getHighSpeedVideoSizesFor.getOutputFormats;
            java.util.UUID m11759scheduleDownload6HENkBo2 = downloadWorkScheduler.m11759scheduleDownload6HENkBo(this.getHighSpeedVideoFpsRangesFor, Camera2StreamConfigurationMap, access$parsePriority2, true);
            downloadDao3 = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
            str = this.getHighSpeedVideoFpsRangesFor;
            obj2 = m11759scheduleDownload6HENkBo2.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadEntity);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(Camera2StreamConfigurationMap);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$parsePriority2);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m11759scheduleDownload6HENkBo2);
            this.getInputSizeshNQ4ISI = 3;
            if (com.paypal.oslo.downloads.impl.data.dao.DownloadDao.updateWorkRequestId$default(downloadDao3, str, obj2, 0L, this, 4, null) == coroutine_suspended) {
            }
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.downloads.impl.DownloadManagerImpl$resume$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.downloads.impl.DownloadManagerImpl$resume$2(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadManagerImpl$resume$2(com.paypal.oslo.downloads.impl.DownloadManagerImpl downloadManagerImpl, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.DownloadManagerImpl$resume$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = downloadManagerImpl;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
