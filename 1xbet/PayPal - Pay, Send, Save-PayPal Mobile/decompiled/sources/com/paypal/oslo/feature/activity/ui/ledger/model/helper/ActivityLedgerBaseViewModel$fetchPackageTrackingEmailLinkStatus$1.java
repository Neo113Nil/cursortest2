package com.paypal.oslo.feature.activity.ui.ledger.model.helper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel", f = "ActivityLedgerBaseViewModel.kt", i = {0}, l = {183}, m = "fetchPackageTrackingEmailLinkStatus$activity_prodRelease", n = {"isForceRefresh"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE}, s = {"I$0"}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.fetchPackageTrackingEmailLinkStatus$activity_prodRelease(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1(com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel activityLedgerBaseViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.ledger.model.helper.ActivityLedgerBaseViewModel$fetchPackageTrackingEmailLinkStatus$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = activityLedgerBaseViewModel;
    }
}
