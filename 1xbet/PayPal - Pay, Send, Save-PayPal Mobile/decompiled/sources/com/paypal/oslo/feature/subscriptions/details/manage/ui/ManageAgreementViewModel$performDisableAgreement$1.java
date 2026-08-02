package com.paypal.oslo.feature.subscriptions.details.manage.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel", f = "ManageAgreementViewModel.kt", i = {0}, l = {205}, m = "performDisableAgreement", n = {"agreementId"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class ManageAgreementViewModel$performDisableAgreement$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel.access$performDisableAgreement(this.Camera2StreamConfigurationMap, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageAgreementViewModel$performDisableAgreement$1(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel manageAgreementViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewModel$performDisableAgreement$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = manageAgreementViewModel;
    }
}
