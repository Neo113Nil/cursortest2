package com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$1$1", f = "CIPTaxStepScreenContent.kt", i = {}, l = {200}, m = "invokeSuspend", n = {}, nl = {201}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.focus.FocusRequester getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(this.getHighSpeedVideoFpsRangesFor, 0, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$1$1(this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$1$1(androidx.compose.ui.focus.FocusRequester focusRequester, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = focusRequester;
    }
}
