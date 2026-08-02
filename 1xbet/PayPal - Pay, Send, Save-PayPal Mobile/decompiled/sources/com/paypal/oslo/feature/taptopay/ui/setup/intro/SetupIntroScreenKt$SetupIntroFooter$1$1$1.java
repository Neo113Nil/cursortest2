package com.paypal.oslo.feature.taptopay.ui.setup.intro;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroScreenKt$SetupIntroFooter$1$1$1", f = "SetupIntroScreen.kt", i = {}, l = {256}, m = "invokeSuspend", n = {}, nl = {257}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class SetupIntroScreenKt$SetupIntroFooter$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.pager.PagerState getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.foundation.pager.PagerState pagerState = this.getHighSpeedVideoFpsRangesFor;
            int i2 = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            if (androidx.compose.foundation.pager.PagerState.animateScrollToPage$default(pagerState, 1 + i2, 0.0f, null, this, 6, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroScreenKt$SetupIntroFooter$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroScreenKt$SetupIntroFooter$1$1$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetupIntroScreenKt$SetupIntroFooter$1$1$1(androidx.compose.foundation.pager.PagerState pagerState, int i, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.setup.intro.SetupIntroScreenKt$SetupIntroFooter$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = pagerState;
        this.Camera2StreamConfigurationMap = i;
    }
}
