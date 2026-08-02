package com.paypal.oslo.downloads.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.DownloadManagerImpl$retry$2", f = "DownloadManagerImpl.kt", i = {1, 2, 3, 3, 3, 3}, l = {171, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 204}, m = "invokeSuspend", n = {"entity", "entity", "entity", "config", "priority", "workRequestId"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 186, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, s = {"L$0", "L$0", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadManagerImpl$retry$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.downloads.impl.DownloadManagerImpl getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao;
        java.lang.Object byId;
        com.paypal.oslo.downloads.impl.data.entity.DownloadEntity downloadEntity;
        com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker networkConnectivityChecker;
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao2;
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao3;
        com.paypal.oslo.downloads.api.model.DownloadConfig Camera2StreamConfigurationMap;
        com.paypal.oslo.downloads.worker.DownloadWorkScheduler downloadWorkScheduler;
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao4;
        java.lang.String str;
        java.lang.String obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            downloadDao = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
            this.getInputSizeshNQ4ISI = 1;
            byId = downloadDao.getById(this.Camera2StreamConfigurationMap, this);
            if (byId == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                }
                downloadEntity = (com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                Camera2StreamConfigurationMap = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap(downloadEntity.getConfigJson());
                com.paypal.oslo.downloads.api.model.DownloadPriority access$parsePriority = com.paypal.oslo.downloads.impl.DownloadManagerImpl.access$parsePriority(this.getOutputMinFrameDuration, downloadEntity.getPriority());
                downloadWorkScheduler = this.getOutputMinFrameDuration.getOutputFormats;
                java.util.UUID m11759scheduleDownload6HENkBo = downloadWorkScheduler.m11759scheduleDownload6HENkBo(this.Camera2StreamConfigurationMap, Camera2StreamConfigurationMap, access$parsePriority, true);
                downloadDao4 = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
                str = this.Camera2StreamConfigurationMap;
                obj2 = m11759scheduleDownload6HENkBo.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadEntity);
                this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(Camera2StreamConfigurationMap);
                this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$parsePriority);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m11759scheduleDownload6HENkBo);
                this.getInputSizeshNQ4ISI = 4;
                if (com.paypal.oslo.downloads.impl.data.dao.DownloadDao.updateWorkRequestId$default(downloadDao4, str, obj2, 0L, this, 4, null) == coroutine_suspended) {
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
        if (kotlin.jvm.internal.Intrinsics.areEqual(downloadEntity.getState(), com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED) || kotlin.jvm.internal.Intrinsics.areEqual(downloadEntity.getState(), com.paypal.oslo.downloads.impl.DownloadStateValue.WAITING_FOR_RETRY) || kotlin.jvm.internal.Intrinsics.areEqual(downloadEntity.getState(), com.paypal.oslo.downloads.impl.DownloadStateValue.NO_NETWORK)) {
            networkConnectivityChecker = this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI;
            if (!networkConnectivityChecker.isConnected()) {
                downloadDao3 = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadEntity);
                this.getInputSizeshNQ4ISI = 2;
                if (com.paypal.oslo.downloads.impl.data.dao.DownloadDao.updateState$default(downloadDao3, this.Camera2StreamConfigurationMap, com.paypal.oslo.downloads.impl.DownloadStateValue.NO_NETWORK, null, 0L, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
            }
            downloadDao2 = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = downloadEntity;
            this.getInputSizeshNQ4ISI = 3;
            if (com.paypal.oslo.downloads.impl.data.dao.DownloadDao.updateStateAndIncrementRetry$default(downloadDao2, this.Camera2StreamConfigurationMap, com.paypal.oslo.downloads.impl.DownloadStateValue.QUEUED, 0L, this, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            Camera2StreamConfigurationMap = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap(downloadEntity.getConfigJson());
            com.paypal.oslo.downloads.api.model.DownloadPriority access$parsePriority2 = com.paypal.oslo.downloads.impl.DownloadManagerImpl.access$parsePriority(this.getOutputMinFrameDuration, downloadEntity.getPriority());
            downloadWorkScheduler = this.getOutputMinFrameDuration.getOutputFormats;
            java.util.UUID m11759scheduleDownload6HENkBo2 = downloadWorkScheduler.m11759scheduleDownload6HENkBo(this.Camera2StreamConfigurationMap, Camera2StreamConfigurationMap, access$parsePriority2, true);
            downloadDao4 = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap;
            str = this.Camera2StreamConfigurationMap;
            obj2 = m11759scheduleDownload6HENkBo2.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(downloadEntity);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$parsePriority2);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(m11759scheduleDownload6HENkBo2);
            this.getInputSizeshNQ4ISI = 4;
            if (com.paypal.oslo.downloads.impl.data.dao.DownloadDao.updateWorkRequestId$default(downloadDao4, str, obj2, 0L, this, 4, null) == coroutine_suspended) {
            }
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((com.paypal.oslo.downloads.impl.DownloadManagerImpl$retry$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.downloads.impl.DownloadManagerImpl$retry$2(this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadManagerImpl$retry$2(com.paypal.oslo.downloads.impl.DownloadManagerImpl downloadManagerImpl, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.DownloadManagerImpl$retry$2> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = downloadManagerImpl;
        this.Camera2StreamConfigurationMap = str;
    }
}
