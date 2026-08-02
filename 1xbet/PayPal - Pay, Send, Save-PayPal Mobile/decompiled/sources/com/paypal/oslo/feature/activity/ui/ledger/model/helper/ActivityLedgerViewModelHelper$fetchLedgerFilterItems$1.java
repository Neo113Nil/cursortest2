package com.paypal.oslo.feature.activity.ui.ledger.model.helper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper", f = "ActivityLedgerViewModelHelper.kt", i = {0, 0, 0}, l = {37}, m = "fetchLedgerFilterItems$activity_prodRelease", n = {"activityFilterType", "activityLedgerFilterUseCase", "inputQueryType$delegate"}, nl = {41}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerViewModelHelper$fetchLedgerFilterItems$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputFormats.fetchLedgerFilterItems$activity_prodRelease(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerViewModelHelper$fetchLedgerFilterItems$1(com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper activityLedgerViewModelHelper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerViewModelHelper$fetchLedgerFilterItems$1> continuation) {
        super(continuation);
        this.getOutputFormats = activityLedgerViewModelHelper;
    }
}
