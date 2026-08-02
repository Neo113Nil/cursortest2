package com.paypal.oslo.feature.activity.domain.usecase.ledger;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerFilterUseCase", f = "ActivityLedgerFilterUseCase.kt", i = {0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m = "executeRepositoryQueryForResult", n = {"activityQuery", "activityFilterType"}, nl = {171}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerFilterUseCase$executeRepositoryQueryForResult$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerFilterUseCase getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI(null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerFilterUseCase$executeRepositoryQueryForResult$1(com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerFilterUseCase activityLedgerFilterUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerFilterUseCase$executeRepositoryQueryForResult$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = activityLedgerFilterUseCase;
    }
}
