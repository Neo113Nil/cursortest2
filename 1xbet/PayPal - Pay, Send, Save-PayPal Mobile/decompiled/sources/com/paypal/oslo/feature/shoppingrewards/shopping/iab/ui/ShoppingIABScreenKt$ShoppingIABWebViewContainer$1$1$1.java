package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABScreenKt$ShoppingIABWebViewContainer$1$1$1", f = "ShoppingIABScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ShoppingIABScreenKt$ShoppingIABWebViewContainer$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.view.View getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z = this.Camera2StreamConfigurationMap || this.getHighSpeedVideoSizes.getShowInterstitial() || this.getHighSpeedVideoFpsRanges;
        android.webkit.WebView highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
        if (z) {
            if (highSpeedVideoFpsRangesFor != null) {
                highSpeedVideoFpsRangesFor.setImportantForAccessibility(4);
            }
        } else if (highSpeedVideoFpsRangesFor != null) {
            highSpeedVideoFpsRangesFor.setImportantForAccessibility(1);
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final android.webkit.WebView getHighSpeedVideoFpsRangesFor(android.view.View view) {
        if (view instanceof android.webkit.WebView) {
            return (android.webkit.WebView) view;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            kotlin.jvm.internal.Intrinsics.checkNotNull(childAt);
            android.webkit.WebView highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(childAt);
            if (highSpeedVideoFpsRangesFor != null) {
                return highSpeedVideoFpsRangesFor;
            }
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABScreenKt$ShoppingIABWebViewContainer$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABScreenKt$ShoppingIABWebViewContainer$1$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShoppingIABScreenKt$ShoppingIABWebViewContainer$1$1$1(boolean z, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.ShoppingIABUiState shoppingIABUiState, boolean z2, android.view.View view, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.ShoppingIABScreenKt$ShoppingIABWebViewContainer$1$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoSizes = shoppingIABUiState;
        this.getHighSpeedVideoFpsRanges = z2;
        this.getHighSpeedVideoFpsRangesFor = view;
    }
}
