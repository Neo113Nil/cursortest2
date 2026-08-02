package com.paypal.oslo.feature.activity.domain.usecase.ledger;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase", f = "ActivityLedgerUseCase.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE}, m = "executeRepositoryQueryForResult", n = {"activityQuery"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerUseCase$executeRepositoryQueryForResult$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes((com.paypal.oslo.feature.activity.graphql.GetUserSectionedActivitiesQuery) null, (kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkFailureResult, com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult>>) this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerUseCase$executeRepositoryQueryForResult$1(com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase activityLedgerUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase$executeRepositoryQueryForResult$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = activityLedgerUseCase;
    }
}
