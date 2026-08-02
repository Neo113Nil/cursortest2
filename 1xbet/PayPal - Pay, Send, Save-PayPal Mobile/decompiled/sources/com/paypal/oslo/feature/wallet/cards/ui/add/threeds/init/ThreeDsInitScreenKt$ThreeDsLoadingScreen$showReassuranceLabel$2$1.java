package com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt$ThreeDsLoadingScreen$showReassuranceLabel$2$1", f = "ThreeDsInitScreen.kt", i = {0}, l = {117}, m = "invokeSuspend", n = {"$this$produceState"}, nl = {118}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class ThreeDsInitScreenKt$ThreeDsLoadingScreen$showReassuranceLabel$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.ProduceStateScope<java.lang.Boolean>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.runtime.ProduceStateScope produceStateScope = (androidx.compose.runtime.ProduceStateScope) this.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = produceStateScope;
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.DelayKt.delay(5000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        produceStateScope.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.runtime.ProduceStateScope<java.lang.Boolean> produceStateScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt$ThreeDsLoadingScreen$showReassuranceLabel$2$1) create(produceStateScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt$ThreeDsLoadingScreen$showReassuranceLabel$2$1 threeDsInitScreenKt$ThreeDsLoadingScreen$showReassuranceLabel$2$1 = new com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt$ThreeDsLoadingScreen$showReassuranceLabel$2$1(continuation);
        threeDsInitScreenKt$ThreeDsLoadingScreen$showReassuranceLabel$2$1.getHighSpeedVideoFpsRanges = obj;
        return threeDsInitScreenKt$ThreeDsLoadingScreen$showReassuranceLabel$2$1;
    }

    ThreeDsInitScreenKt$ThreeDsLoadingScreen$showReassuranceLabel$2$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.cards.ui.add.threeds.init.ThreeDsInitScreenKt$ThreeDsLoadingScreen$showReassuranceLabel$2$1> continuation) {
        super(2, continuation);
    }
}
