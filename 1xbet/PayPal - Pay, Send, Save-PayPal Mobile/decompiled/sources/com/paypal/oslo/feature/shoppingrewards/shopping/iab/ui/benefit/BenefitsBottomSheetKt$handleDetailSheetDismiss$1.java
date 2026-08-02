package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsBottomSheetKt", f = "BenefitsBottomSheet.kt", i = {0, 0}, l = {305}, m = "handleDetailSheetDismiss", n = {"clearSelection", "onDismiss"}, nl = {306}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class BenefitsBottomSheetKt$handleDetailSheetDismiss$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsBottomSheetKt.handleDetailSheetDismiss(null, null, this);
    }

    BenefitsBottomSheetKt$handleDetailSheetDismiss$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsBottomSheetKt$handleDetailSheetDismiss$1> continuation) {
        super(continuation);
    }
}
