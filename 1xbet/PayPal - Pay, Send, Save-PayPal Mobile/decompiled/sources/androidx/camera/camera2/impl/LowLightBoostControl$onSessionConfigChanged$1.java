package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.LowLightBoostControl$onSessionConfigChanged$1", f = "LowLightBoostControl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class LowLightBoostControl$onSessionConfigChanged$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ java.util.List<androidx.camera.core.UseCase> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.impl.LowLightBoostControl getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(androidx.camera.camera2.impl.LowLightBoostControl.access$getSessionConfig(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI).getExpectedFrameRateRange().getUpper().intValue() > 30);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((androidx.camera.camera2.impl.LowLightBoostControl$onSessionConfigChanged$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.LowLightBoostControl$onSessionConfigChanged$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LowLightBoostControl$onSessionConfigChanged$1(androidx.camera.camera2.impl.LowLightBoostControl lowLightBoostControl, java.util.List<? extends androidx.camera.core.UseCase> list, kotlin.coroutines.Continuation<? super androidx.camera.camera2.impl.LowLightBoostControl$onSessionConfigChanged$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = lowLightBoostControl;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }
}
