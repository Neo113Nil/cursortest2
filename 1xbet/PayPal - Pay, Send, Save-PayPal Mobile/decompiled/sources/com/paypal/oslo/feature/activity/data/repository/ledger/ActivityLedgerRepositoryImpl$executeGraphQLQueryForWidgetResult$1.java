package com.paypal.oslo.feature.activity.data.repository.ledger;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl", f = "ActivityLedgerRepositoryImpl.kt", i = {0}, l = {348}, m = "executeGraphQLQueryForWidgetResult$activity_prodRelease", n = {"activityWidgetQuery"}, nl = {349}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.executeGraphQLQueryForWidgetResult$activity_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$1(com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl activityLedgerRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$executeGraphQLQueryForWidgetResult$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = activityLedgerRepositoryImpl;
    }
}
