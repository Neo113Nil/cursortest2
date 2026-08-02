package com.paypal.oslo.downloads.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/downloads/api/model/DownloadId;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.DownloadManagerImpl$download$2", f = "DownloadManagerImpl.kt", i = {0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3}, l = {68, 81, 86, 95}, m = "invokeSuspend", n = {"downloadId", "downloadId", "storageLocation", "entity", "downloadId", "storageLocation", "entity", "downloadId", "storageLocation", "entity", "workRequestId"}, nl = {74, 82, 88, 100}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadManagerImpl$download$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.api.model.DownloadId>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.downloads.api.model.DownloadRequest Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.downloads.impl.DownloadManagerImpl getInputSizeshNQ4ISI;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String m11726constructorimpl;
        com.paypal.oslo.downloads.api.DownloadStorageProvider downloadStorageProvider;
        java.lang.Object defaultStorageDirectory;
        com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker networkConnectivityChecker;
        com.paypal.oslo.downloads.impl.data.entity.DownloadEntity highSpeedVideoFpsRangesFor;
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao;
        java.lang.String str;
        com.paypal.oslo.downloads.impl.data.entity.DownloadEntity highSpeedVideoFpsRangesFor2;
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao2;
        java.lang.String str2;
        com.paypal.oslo.downloads.worker.DownloadWorkScheduler downloadWorkScheduler;
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao3;
        java.lang.String obj2;
        java.lang.String str3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String obj3 = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "");
            m11726constructorimpl = com.paypal.oslo.downloads.api.model.DownloadId.m11726constructorimpl(obj3);
            downloadStorageProvider = this.getInputSizeshNQ4ISI.getInputFormats;
            this.getHighResolutionOutputSizeshNQ4ISI = m11726constructorimpl;
            this.getHighSpeedVideoSizesFor = 1;
            defaultStorageDirectory = downloadStorageProvider.getDefaultStorageDirectory(this);
            if (defaultStorageDirectory == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    str2 = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return com.paypal.oslo.downloads.api.model.DownloadId.m11725boximpl(str2);
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return com.paypal.oslo.downloads.api.model.DownloadId.m11725boximpl(str3);
                }
                com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) this.getHighSpeedVideoSizes;
                str = (java.lang.String) this.getHighSpeedVideoFpsRanges;
                java.lang.String str4 = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                highSpeedVideoFpsRangesFor = downloadEntity;
                m11726constructorimpl = str4;
                downloadWorkScheduler = this.getInputSizeshNQ4ISI.getOutputFormats;
                java.util.UUID m11759scheduleDownload6HENkBo = downloadWorkScheduler.m11759scheduleDownload6HENkBo(m11726constructorimpl, this.Camera2StreamConfigurationMap.getConfig(), this.Camera2StreamConfigurationMap.getPriority(), true);
                downloadDao3 = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
                obj2 = m11759scheduleDownload6HENkBo.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                this.getHighResolutionOutputSizeshNQ4ISI = m11726constructorimpl;
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(highSpeedVideoFpsRangesFor);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m11759scheduleDownload6HENkBo);
                this.getHighSpeedVideoSizesFor = 4;
                if (com.paypal.oslo.downloads.impl.data.dao.DownloadDao.updateWorkRequestId$default(downloadDao3, m11726constructorimpl, obj2, 0L, this, 4, null) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                str3 = m11726constructorimpl;
                return com.paypal.oslo.downloads.api.model.DownloadId.m11725boximpl(str3);
            }
            m11726constructorimpl = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            defaultStorageDirectory = obj;
        }
        java.lang.String str5 = (java.lang.String) defaultStorageDirectory;
        networkConnectivityChecker = this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
        if (!networkConnectivityChecker.isConnected()) {
            highSpeedVideoFpsRangesFor2 = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(m11726constructorimpl, this.Camera2StreamConfigurationMap, str5, com.paypal.oslo.downloads.impl.DownloadStateValue.NO_NETWORK);
            downloadDao2 = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = m11726constructorimpl;
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(highSpeedVideoFpsRangesFor2);
            this.getHighSpeedVideoSizesFor = 2;
            if (downloadDao2.insert(highSpeedVideoFpsRangesFor2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = m11726constructorimpl;
            return com.paypal.oslo.downloads.api.model.DownloadId.m11725boximpl(str2);
        }
        highSpeedVideoFpsRangesFor = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(m11726constructorimpl, this.Camera2StreamConfigurationMap, str5, com.paypal.oslo.downloads.impl.DownloadStateValue.QUEUED);
        downloadDao = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = m11726constructorimpl;
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str5);
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(highSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoSizesFor = 3;
        if (downloadDao.insert(highSpeedVideoFpsRangesFor, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        str = str5;
        downloadWorkScheduler = this.getInputSizeshNQ4ISI.getOutputFormats;
        java.util.UUID m11759scheduleDownload6HENkBo2 = downloadWorkScheduler.m11759scheduleDownload6HENkBo(m11726constructorimpl, this.Camera2StreamConfigurationMap.getConfig(), this.Camera2StreamConfigurationMap.getPriority(), true);
        downloadDao3 = this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap;
        obj2 = m11759scheduleDownload6HENkBo2.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = m11726constructorimpl;
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(highSpeedVideoFpsRangesFor);
        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m11759scheduleDownload6HENkBo2);
        this.getHighSpeedVideoSizesFor = 4;
        if (com.paypal.oslo.downloads.impl.data.dao.DownloadDao.updateWorkRequestId$default(downloadDao3, m11726constructorimpl, obj2, 0L, this, 4, null) != coroutine_suspended) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.api.model.DownloadId> continuation) {
        return ((com.paypal.oslo.downloads.impl.DownloadManagerImpl$download$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.downloads.impl.DownloadManagerImpl$download$2(this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadManagerImpl$download$2(com.paypal.oslo.downloads.impl.DownloadManagerImpl downloadManagerImpl, com.paypal.oslo.downloads.api.model.DownloadRequest downloadRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.DownloadManagerImpl$download$2> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = downloadManagerImpl;
        this.Camera2StreamConfigurationMap = downloadRequest;
    }
}
