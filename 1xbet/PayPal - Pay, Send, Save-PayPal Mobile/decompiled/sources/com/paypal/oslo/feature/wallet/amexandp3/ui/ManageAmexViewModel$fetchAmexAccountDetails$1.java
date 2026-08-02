package com.paypal.oslo.feature.wallet.amexandp3.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel", f = "ManageAmexViewModel.kt", i = {}, l = {112}, m = "fetchAmexAccountDetails$wallet_prodRelease", n = {}, nl = {113}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ManageAmexViewModel$fetchAmexAccountDetails$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.fetchAmexAccountDetails$wallet_prodRelease(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageAmexViewModel$fetchAmexAccountDetails$1(com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel manageAmexViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexViewModel$fetchAmexAccountDetails$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = manageAmexViewModel;
    }
}
