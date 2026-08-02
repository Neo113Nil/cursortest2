package com.paypal.oslo.feature.wallet.cards.ui.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.components.AutoAdvanceFocusKt$AutoAdvanceFocus$1$1", f = "AutoAdvanceFocus.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AutoAdvanceFocusKt$AutoAdvanceFocus$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.focus.FocusRequester getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.Camera2StreamConfigurationMap.length() == this.getHighSpeedVideoSizes) {
            androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(this.getHighSpeedVideoFpsRanges, 0, 1, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.components.AutoAdvanceFocusKt$AutoAdvanceFocus$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.cards.ui.components.AutoAdvanceFocusKt$AutoAdvanceFocus$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoAdvanceFocusKt$AutoAdvanceFocus$1$1(java.lang.String str, int i, androidx.compose.ui.focus.FocusRequester focusRequester, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.components.AutoAdvanceFocusKt$AutoAdvanceFocus$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = focusRequester;
    }
}
