package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2Backend$prewarmIsConfigSupported$1", f = "Camera2Backend.kt", i = {}, l = {99, 100}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Camera2Backend$prewarmIsConfigSupported$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2Backend getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r6.m786getOrInitializeDeviceSetupWrapper0r8Bogc(r5.Camera2StreamConfigurationMap, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r6.m785getOrInitializeDeviceSetupCompat0r8Bogc(r5.Camera2StreamConfigurationMap, r5) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache;
        androidx.camera.camera2.pipe.compat.Camera2DeviceCache camera2DeviceCache2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            camera2DeviceCache = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        camera2DeviceCache2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.compat.Camera2Backend$prewarmIsConfigSupported$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.compat.Camera2Backend$prewarmIsConfigSupported$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2Backend$prewarmIsConfigSupported$1(androidx.camera.camera2.pipe.compat.Camera2Backend camera2Backend, java.lang.String str, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2Backend$prewarmIsConfigSupported$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = camera2Backend;
        this.Camera2StreamConfigurationMap = str;
    }
}
