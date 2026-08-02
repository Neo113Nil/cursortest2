package com.paypal.oslo.feature.notificationcenter.criticalalert.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertContainerKt$CriticalAlertContainer$10$1", f = "CriticalAlertContainer.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, nl = {138}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CriticalAlertContainerKt$CriticalAlertContainer$10$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<androidx.navigation3.runtime.NavKey> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<androidx.navigation3.runtime.NavKey> flow = this.getHighResolutionOutputSizeshNQ4ISI;
            final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            if (flow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertContainerKt$CriticalAlertContainer$10$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    function1.invoke((androidx.navigation3.runtime.NavKey) obj2);
                    return kotlin.Unit.INSTANCE;
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
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertContainerKt$CriticalAlertContainer$10$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertContainerKt$CriticalAlertContainer$10$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CriticalAlertContainerKt$CriticalAlertContainer$10$1(kotlinx.coroutines.flow.Flow<? extends androidx.navigation3.runtime.NavKey> flow, kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertContainerKt$CriticalAlertContainer$10$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = flow;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
