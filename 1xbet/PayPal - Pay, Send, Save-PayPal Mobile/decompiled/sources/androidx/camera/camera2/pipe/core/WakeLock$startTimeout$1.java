package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.core.WakeLock$startTimeout$1", f = "WakeLock.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class WakeLock$startTimeout$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.pipe.core.WakeLock getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j;
        java.lang.Object obj2;
        boolean z;
        int i;
        kotlin.jvm.functions.Function0 function0;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            j = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 1;
            if (kotlinx.coroutines.DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        obj2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
        androidx.camera.camera2.pipe.core.WakeLock wakeLock = this.getHighSpeedVideoSizes;
        synchronized (obj2) {
            z = wakeLock.getOutputFormats;
            if (!z) {
                i = wakeLock.getOutputMinFrameDuration;
                if (i == 0) {
                    wakeLock.getHighSpeedVideoSizesFor = null;
                    wakeLock.getOutputFormats = true;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    function0 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                    function0.invoke();
                    return kotlin.Unit.INSTANCE;
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.core.WakeLock$startTimeout$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.core.WakeLock$startTimeout$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WakeLock$startTimeout$1(androidx.camera.camera2.pipe.core.WakeLock wakeLock, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.core.WakeLock$startTimeout$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = wakeLock;
    }
}
