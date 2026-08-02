package com.paypal.oslo.feature.taptopay.ui.paymode;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$handleAuthExpiredEvent$1", f = "PayModeActivity.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class PayModeActivity$handleAuthExpiredEvent$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = this.getHighSpeedVideoFpsRangesFor.getReAuthPromptManager().showAuthExpiredPrompt(this.getHighSpeedVideoFpsRangesFor, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Auth expired prompt result: success=".concat(java.lang.String.valueOf(booleanValue)), null, null, 6, null);
        if (!booleanValue) {
            this.getHighSpeedVideoFpsRangesFor.finishAndRemoveTask();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$handleAuthExpiredEvent$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$handleAuthExpiredEvent$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayModeActivity$handleAuthExpiredEvent$1(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$handleAuthExpiredEvent$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = payModeActivity;
    }
}
