package com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel", f = "CardFormViewModel.kt", i = {0, 0, 0, 1, 1, 1}, l = {165, 166}, m = "handleSaveCard", n = {"state", "payload", "billingAddressAdded", "state", "payload", "billingAddressAdded"}, nl = {166, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"}, v = 2)
/* loaded from: classes13.dex */
final class CardFormViewModel$handleSaveCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel.access$handleSaveCard(this.getHighSpeedVideoSizesFor, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardFormViewModel$handleSaveCard$1(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel$handleSaveCard$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = cardFormViewModel;
    }
}
