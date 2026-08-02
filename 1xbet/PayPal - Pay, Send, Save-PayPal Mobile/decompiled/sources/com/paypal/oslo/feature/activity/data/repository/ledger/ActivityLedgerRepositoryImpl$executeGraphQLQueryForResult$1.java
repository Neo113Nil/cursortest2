package com.paypal.oslo.feature.activity.data.repository.ledger;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl", f = "ActivityLedgerRepositoryImpl.kt", i = {0}, l = {340}, m = "executeGraphQLQueryForResult$activity_prodRelease", n = {"activityLedgerQueriesInputTypes"}, nl = {341}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerRepositoryImpl$executeGraphQLQueryForResult$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.executeGraphQLQueryForResult$activity_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerRepositoryImpl$executeGraphQLQueryForResult$1(com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl activityLedgerRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl$executeGraphQLQueryForResult$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = activityLedgerRepositoryImpl;
    }
}
