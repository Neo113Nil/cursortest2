package com.paypal.oslo.feature.wallet.cards.ui.edit;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenKt$UpdateCardScreenContent$2$1", f = "UpdateCardScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class UpdateCardScreenKt$UpdateCardScreenContent$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableIntState Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.focus.FocusRequester getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardFormState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int intValue;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        int length = this.getHighSpeedVideoSizes.getExpiryDate().length();
        if (length == 4) {
            intValue = this.Camera2StreamConfigurationMap.getIntValue();
            if (length > intValue) {
                androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(this.getHighResolutionOutputSizeshNQ4ISI, 0, 1, null);
            }
        }
        this.Camera2StreamConfigurationMap.setIntValue(length);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenKt$UpdateCardScreenContent$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenKt$UpdateCardScreenContent$2$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateCardScreenKt$UpdateCardScreenContent$2$1(com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardFormState updateCardFormState, androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.runtime.MutableIntState mutableIntState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardScreenKt$UpdateCardScreenContent$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = updateCardFormState;
        this.getHighResolutionOutputSizeshNQ4ISI = focusRequester;
        this.Camera2StreamConfigurationMap = mutableIntState;
    }
}
