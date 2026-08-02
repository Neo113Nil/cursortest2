package com.paypal.oslo.feature.notificationcenter.criticalalert.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertContainerKt$CriticalAlertContainer$6$1", f = "CriticalAlertContainer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CriticalAlertContainerKt$CriticalAlertContainer$6$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function1 = this.Camera2StreamConfigurationMap;
        if (function1 != null) {
            function1.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.getHighSpeedVideoSizes instanceof com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertState.Visible));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertContainerKt$CriticalAlertContainer$6$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertContainerKt$CriticalAlertContainer$6$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CriticalAlertContainerKt$CriticalAlertContainer$6$1(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertState criticalAlertState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertContainerKt$CriticalAlertContainer$6$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoSizes = criticalAlertState;
    }
}
