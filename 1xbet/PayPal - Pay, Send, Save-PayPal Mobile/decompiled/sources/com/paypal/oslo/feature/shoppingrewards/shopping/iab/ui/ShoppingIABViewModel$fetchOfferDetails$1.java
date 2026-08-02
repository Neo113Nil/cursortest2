package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel", f = "ShoppingIABViewModel.kt", i = {0}, l = {538}, m = "fetchOfferDetails", n = {"honeyStoreId"}, nl = {543}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class ShoppingIABViewModel$fetchOfferDetails$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel.access$fetchOfferDetails(this.Camera2StreamConfigurationMap, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShoppingIABViewModel$fetchOfferDetails$1(com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel shoppingIABViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABViewModel$fetchOfferDetails$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = shoppingIABViewModel;
    }
}
