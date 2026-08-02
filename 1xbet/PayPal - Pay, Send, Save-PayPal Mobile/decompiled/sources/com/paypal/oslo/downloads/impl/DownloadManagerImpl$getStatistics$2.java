package com.paypal.oslo.downloads.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/downloads/api/model/DownloadStatistics;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.DownloadManagerImpl$getStatistics$2", f = "DownloadManagerImpl.kt", i = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, 283}, m = "invokeSuspend", n = {"totalDownloads", "totalDownloads", "activeDownloads", "totalDownloads", "activeDownloads", "completedDownloads", "totalDownloads", "activeDownloads", "completedDownloads", "failedDownloads"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, 283, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE}, s = {"I$0", "I$0", "I$1", "I$0", "I$1", "I$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes5.dex */
final class DownloadManagerImpl$getStatistics$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.api.model.DownloadStatistics>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.downloads.impl.DownloadManagerImpl getHighSpeedVideoSizesFor;

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        if (r11 != r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00fa A[LOOP:0: B:10:0x00f4->B:12:0x00fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao;
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao2;
        int i;
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao3;
        java.lang.Object countByState;
        int i2;
        int i3;
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao4;
        java.lang.Object countByState2;
        int i4;
        int i5;
        com.paypal.oslo.downloads.impl.data.dao.DownloadDao downloadDao5;
        java.lang.Object byState;
        int i6;
        int i7;
        int i8;
        int i9;
        java.util.Iterator it;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.Camera2StreamConfigurationMap;
        if (i10 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            downloadDao = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = 1;
            obj = downloadDao.getAll(this);
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    i = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    int intValue = ((java.lang.Number) obj).intValue();
                    downloadDao3 = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
                    this.getHighResolutionOutputSizeshNQ4ISI = i;
                    this.getHighSpeedVideoFpsRanges = intValue;
                    this.Camera2StreamConfigurationMap = 3;
                    countByState = downloadDao3.countByState("COMPLETED", this);
                    if (countByState != coroutine_suspended) {
                        int i11 = i;
                        i2 = intValue;
                        obj = countByState;
                        i3 = i11;
                        int intValue2 = ((java.lang.Number) obj).intValue();
                        downloadDao4 = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
                        this.getHighResolutionOutputSizeshNQ4ISI = i3;
                        this.getHighSpeedVideoFpsRanges = i2;
                        this.getHighSpeedVideoSizes = intValue2;
                        this.Camera2StreamConfigurationMap = 4;
                        countByState2 = downloadDao4.countByState(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, this);
                        if (countByState2 != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i10 == 3) {
                    i2 = this.getHighSpeedVideoFpsRanges;
                    i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    int intValue22 = ((java.lang.Number) obj).intValue();
                    downloadDao4 = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
                    this.getHighResolutionOutputSizeshNQ4ISI = i3;
                    this.getHighSpeedVideoFpsRanges = i2;
                    this.getHighSpeedVideoSizes = intValue22;
                    this.Camera2StreamConfigurationMap = 4;
                    countByState2 = downloadDao4.countByState(com.paypal.oslo.downloads.impl.DownloadStateValue.FAILED, this);
                    if (countByState2 != coroutine_suspended) {
                        int i12 = i2;
                        i4 = intValue22;
                        obj = countByState2;
                        i5 = i12;
                        int intValue3 = ((java.lang.Number) obj).intValue();
                        downloadDao5 = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
                        this.getHighResolutionOutputSizeshNQ4ISI = i3;
                        this.getHighSpeedVideoFpsRanges = i5;
                        this.getHighSpeedVideoSizes = i4;
                        this.getHighSpeedVideoFpsRangesFor = intValue3;
                        this.Camera2StreamConfigurationMap = 5;
                        byState = downloadDao5.getByState("COMPLETED", this);
                        if (byState != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i10 != 4) {
                    if (i10 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i13 = this.getHighSpeedVideoFpsRangesFor;
                    int i14 = this.getHighSpeedVideoSizes;
                    i7 = this.getHighSpeedVideoFpsRanges;
                    int i15 = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i6 = i13;
                    i8 = i14;
                    i9 = i15;
                    it = ((java.lang.Iterable) obj).iterator();
                    long j = 0;
                    while (it.hasNext()) {
                        j += ((com.paypal.oslo.downloads.impl.data.entity.DownloadEntity) it.next()).getDownloadedBytes();
                    }
                    return new com.paypal.oslo.downloads.api.model.DownloadStatistics(i9, i7, i8, i6, j);
                }
                i4 = this.getHighSpeedVideoSizes;
                i5 = this.getHighSpeedVideoFpsRanges;
                i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                int intValue32 = ((java.lang.Number) obj).intValue();
                downloadDao5 = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
                this.getHighResolutionOutputSizeshNQ4ISI = i3;
                this.getHighSpeedVideoFpsRanges = i5;
                this.getHighSpeedVideoSizes = i4;
                this.getHighSpeedVideoFpsRangesFor = intValue32;
                this.Camera2StreamConfigurationMap = 5;
                byState = downloadDao5.getByState("COMPLETED", this);
                if (byState != coroutine_suspended) {
                    i6 = intValue32;
                    obj = byState;
                    i7 = i5;
                    i8 = i4;
                    i9 = i3;
                    it = ((java.lang.Iterable) obj).iterator();
                    long j2 = 0;
                    while (it.hasNext()) {
                    }
                    return new com.paypal.oslo.downloads.api.model.DownloadStatistics(i9, i7, i8, i6, j2);
                }
                return coroutine_suspended;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int size = ((java.util.List) obj).size();
        downloadDao2 = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = size;
        this.Camera2StreamConfigurationMap = 2;
        java.lang.Object countByStates = downloadDao2.countByStates(com.paypal.oslo.downloads.impl.DownloadStateValue.INSTANCE.getACTIVE_STATES(), this);
        if (countByStates != coroutine_suspended) {
            i = size;
            obj = countByStates;
            int intValue4 = ((java.lang.Number) obj).intValue();
            downloadDao3 = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoFpsRanges = intValue4;
            this.Camera2StreamConfigurationMap = 3;
            countByState = downloadDao3.countByState("COMPLETED", this);
            if (countByState != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.api.model.DownloadStatistics> continuation) {
        return ((com.paypal.oslo.downloads.impl.DownloadManagerImpl$getStatistics$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.downloads.impl.DownloadManagerImpl$getStatistics$2(this.getHighSpeedVideoSizesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadManagerImpl$getStatistics$2(com.paypal.oslo.downloads.impl.DownloadManagerImpl downloadManagerImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.downloads.impl.DownloadManagerImpl$getStatistics$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = downloadManagerImpl;
    }
}
