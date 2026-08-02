package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl", f = "MockFinancialActivityRepositoryImpl.kt", i = {0}, l = {239}, m = "getActivitiesPage", n = {"request"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class MockFinancialActivityRepositoryImpl$getActivitiesPage$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getActivitiesPage(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockFinancialActivityRepositoryImpl$getActivitiesPage$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl mockFinancialActivityRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl$getActivitiesPage$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = mockFinancialActivityRepositoryImpl;
    }
}
