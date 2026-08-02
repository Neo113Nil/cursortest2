package androidx.camera.viewfinder.compose.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.viewfinder.compose.internal.BaseViewfinderExternalSurfaceState$dispatchSurfaceCreated$1", f = "BaseViewfinderExternalSurfaceState.kt", i = {0}, l = {57, 62}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class BaseViewfinderExternalSurfaceState$dispatchSurfaceCreated$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.camera.viewfinder.compose.internal.BaseViewfinderExternalSurfaceState Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceHolder getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (r1.invoke(r6, r3, r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r6.join(r5) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlinx.coroutines.Job job;
        kotlin.jvm.functions.Function3 function3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
            job = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            if (job != null) {
                job.cancel((java.util.concurrent.CancellationException) new androidx.camera.viewfinder.compose.SurfaceReplacedCancellationException());
                this.getHighSpeedVideoSizes = coroutineScope;
                this.getHighSpeedVideoFpsRanges = job;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
            androidx.camera.viewfinder.compose.internal.BaseViewfinderExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 baseViewfinderExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 = new androidx.camera.viewfinder.compose.internal.BaseViewfinderExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1(coroutineScope);
            function3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
            if (function3 != null) {
                androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceHolder viewfinderSurfaceHolder = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoSizes = null;
                this.getHighSpeedVideoFpsRanges = null;
                this.getHighResolutionOutputSizeshNQ4ISI = 2;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.viewfinder.compose.internal.BaseViewfinderExternalSurfaceState$dispatchSurfaceCreated$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.viewfinder.compose.internal.BaseViewfinderExternalSurfaceState$dispatchSurfaceCreated$1 baseViewfinderExternalSurfaceState$dispatchSurfaceCreated$1 = new androidx.camera.viewfinder.compose.internal.BaseViewfinderExternalSurfaceState$dispatchSurfaceCreated$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
        baseViewfinderExternalSurfaceState$dispatchSurfaceCreated$1.getHighSpeedVideoSizes = obj;
        return baseViewfinderExternalSurfaceState$dispatchSurfaceCreated$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseViewfinderExternalSurfaceState$dispatchSurfaceCreated$1(androidx.camera.viewfinder.compose.internal.BaseViewfinderExternalSurfaceState baseViewfinderExternalSurfaceState, androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceHolder viewfinderSurfaceHolder, kotlin.coroutines.Continuation<? super androidx.camera.viewfinder.compose.internal.BaseViewfinderExternalSurfaceState$dispatchSurfaceCreated$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = baseViewfinderExternalSurfaceState;
        this.getHighSpeedVideoFpsRangesFor = viewfinderSurfaceHolder;
    }
}
