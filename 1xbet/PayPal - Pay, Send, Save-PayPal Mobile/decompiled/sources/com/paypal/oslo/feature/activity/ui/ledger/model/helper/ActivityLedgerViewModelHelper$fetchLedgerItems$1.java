package com.paypal.oslo.feature.activity.ui.ledger.model.helper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper", f = "ActivityLedgerViewModelHelper.kt", i = {0, 0}, l = {55}, m = "fetchLedgerItems$activity_prodRelease", n = {"activityLedgerUseCase", "inputQueryType$delegate"}, nl = {56}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerViewModelHelper$fetchLedgerItems$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.fetchLedgerItems$activity_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerViewModelHelper$fetchLedgerItems$1(com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper activityLedgerViewModelHelper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper$fetchLedgerItems$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = activityLedgerViewModelHelper;
    }
}
