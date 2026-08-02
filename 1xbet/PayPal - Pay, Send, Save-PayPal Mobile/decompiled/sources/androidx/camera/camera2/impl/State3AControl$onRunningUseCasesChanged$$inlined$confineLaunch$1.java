package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "androidx/camera/camera2/impl/UseCaseThreads$confineLaunch$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.impl.State3AControl$onRunningUseCasesChanged$$inlined$confineLaunch$1", f = "State3AControl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
public final class State3AControl$onRunningUseCasesChanged$$inlined$confineLaunch$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.Set Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.impl.State3AControl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        int i;
        boolean z;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!this.Camera2StreamConfigurationMap.isEmpty()) {
            int access$calculateTemplateFromUseCases = androidx.camera.camera2.impl.State3AControl.access$calculateTemplateFromUseCases(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
            obj2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            synchronized (obj2) {
                i = this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration;
                if (i != access$calculateTemplateFromUseCases) {
                    this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration = access$calculateTemplateFromUseCases;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.impl.State3AControl$onRunningUseCasesChanged$$inlined$confineLaunch$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.impl.State3AControl$onRunningUseCasesChanged$$inlined$confineLaunch$1(continuation, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public State3AControl$onRunningUseCasesChanged$$inlined$confineLaunch$1(kotlin.coroutines.Continuation continuation, java.util.Set set, androidx.camera.camera2.impl.State3AControl state3AControl) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = set;
        this.getHighResolutionOutputSizeshNQ4ISI = state3AControl;
    }
}
