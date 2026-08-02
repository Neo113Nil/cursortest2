package com.paypal.oslo.feature.activity.data.repository.ledger.source;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl", f = "ActivityLedgerUserActivitiesPagingSourceImpl.kt", i = {0, 0, 0}, l = {74}, m = "load", n = {"params", "cursor", "paginatedQuery"}, nl = {75}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerUserActivitiesPagingSourceImpl$load$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.load(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerUserActivitiesPagingSourceImpl$load$1(com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl activityLedgerUserActivitiesPagingSourceImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.data.repository.ledger.source.ActivityLedgerUserActivitiesPagingSourceImpl$load$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = activityLedgerUserActivitiesPagingSourceImpl;
    }
}
