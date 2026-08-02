package com.paypal.oslo.feature.bnplservicing.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOptionsKt$PaymentOptions$2$1", f = "PaymentOptions.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class PaymentOptionsKt$PaymentOptions$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.String, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.Currency getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoSizes;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String highSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDuration = 1;
            if (kotlinx.coroutines.DelayKt.delay(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String access$PaymentOptions$lambda$4 = com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOptionsKt.access$PaymentOptions$lambda$4(this.getHighSpeedVideoSizes);
        if (access$PaymentOptions$lambda$4 != null) {
            java.util.Currency currency = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.String, kotlin.Unit> function2 = this.Camera2StreamConfigurationMap;
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.runtime.MutableState<java.lang.String> mutableState = this.getHighSpeedVideoFpsRangesFor;
            mutableState.setValue(access$PaymentOptions$lambda$4);
            java.lang.String access$PaymentOptions$lambda$7 = com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOptionsKt.access$PaymentOptions$lambda$7(mutableState);
            kotlin.jvm.internal.Intrinsics.checkNotNull(currency);
            highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOptionsKt.getHighSpeedVideoFpsRangesFor(access$PaymentOptions$lambda$7, currency);
            function2.invoke(kotlin.coroutines.jvm.internal.Boxing.boxInt(i2), highSpeedVideoFpsRangesFor);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOptionsKt$PaymentOptions$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOptionsKt$PaymentOptions$2$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PaymentOptionsKt$PaymentOptions$2$1(androidx.compose.runtime.MutableState<java.lang.String> mutableState, java.util.Currency currency, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> function2, int i, androidx.compose.runtime.MutableState<java.lang.String> mutableState2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.common.components.PaymentOptionsKt$PaymentOptions$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = mutableState;
        this.getHighSpeedVideoFpsRanges = currency;
        this.Camera2StreamConfigurationMap = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = mutableState2;
    }
}
