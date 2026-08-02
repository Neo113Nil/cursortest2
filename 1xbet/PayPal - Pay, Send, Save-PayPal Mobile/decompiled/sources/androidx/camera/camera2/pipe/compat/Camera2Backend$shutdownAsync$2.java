package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.Camera2Backend$shutdownAsync$2", f = "Camera2Backend.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m = "invokeSuspend", n = {"controller"}, s = {"L$1"}, v = 1)
/* loaded from: classes6.dex */
final class Camera2Backend$shutdownAsync$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.camera.camera2.pipe.compat.Camera2Backend Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if (r6 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if (r6.closeAll(true).await(r5) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005c -> B:12:0x005e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.Set set;
        java.util.Iterator it;
        androidx.camera.camera2.pipe.compat.Camera2DeviceManager camera2DeviceManager;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            obj2 = this.Camera2StreamConfigurationMap.getOutputMinFrameDuration;
            androidx.camera.camera2.pipe.compat.Camera2Backend camera2Backend = this.Camera2StreamConfigurationMap;
            synchronized (obj2) {
                set = camera2Backend.getInputSizeshNQ4ISI;
            }
            it = set.iterator();
            if (!it.hasNext()) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        androidx.camera.camera2.pipe.CameraController cameraController = (androidx.camera.camera2.pipe.CameraController) this.getHighSpeedVideoFpsRanges;
        it = (java.util.Iterator) this.getHighSpeedVideoSizes;
        kotlin.ResultKt.throwOnFailure(obj);
        if (!((java.lang.Boolean) obj).booleanValue() && androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
            java.util.Objects.toString(cameraController);
        }
        if (!it.hasNext()) {
            cameraController = (androidx.camera.camera2.pipe.CameraController) it.next();
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
            this.getHighSpeedVideoSizes = it;
            this.getHighSpeedVideoFpsRanges = cameraController;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = cameraController.awaitClosed(this);
        } else {
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getDEBUG_LOGGABLE();
            camera2DeviceManager = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoFpsRangesFor = 2;
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.camera.camera2.pipe.compat.Camera2Backend$shutdownAsync$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.camera.camera2.pipe.compat.Camera2Backend$shutdownAsync$2(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Camera2Backend$shutdownAsync$2(androidx.camera.camera2.pipe.compat.Camera2Backend camera2Backend, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.Camera2Backend$shutdownAsync$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = camera2Backend;
    }
}
