package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/camera/camera2/pipe/compat/OpenCameraResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2", f = "RetryingCameraStateOpener.kt", i = {0, 0, 0, 0, 0}, l = {670}, m = "invokeSuspend", n = {"$this$supervisorScope", "cameraOpenDeferred", "resultDeferred", "timeoutJob", "cameraOpenCancelJob"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 1)
/* loaded from: classes6.dex */
final class CameraStateOpener$tryOpenCamera$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.OpenCameraResult>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.AndroidCameraState getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.CameraStateOpener getInputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009d A[Catch: all -> 0x0142, TRY_ENTER, TryCatch #0 {all -> 0x0142, blocks: (B:6:0x0020, B:7:0x0110, B:11:0x009d, B:13:0x00b3, B:14:0x00c1, B:16:0x00c7, B:17:0x00d5, B:19:0x00db, B:20:0x00e9, B:22:0x00ef, B:23:0x00fd, B:29:0x0114, B:31:0x011f, B:32:0x0124, B:34:0x012a, B:35:0x012f, B:37:0x0135, B:38:0x0138, B:40:0x013e), top: B:5:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0114 A[Catch: all -> 0x0142, TryCatch #0 {all -> 0x0142, blocks: (B:6:0x0020, B:7:0x0110, B:11:0x009d, B:13:0x00b3, B:14:0x00c1, B:16:0x00c7, B:17:0x00d5, B:19:0x00db, B:20:0x00e9, B:22:0x00ef, B:23:0x00fd, B:29:0x0114, B:31:0x011f, B:32:0x0124, B:34:0x012a, B:35:0x012f, B:37:0x0135, B:38:0x0138, B:40:0x013e), top: B:5:0x0020 }] */
    /* JADX WARN: Type inference failed for: r4v11, types: [T, kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, kotlinx.coroutines.Deferred] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, kotlinx.coroutines.Job] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x010d -> B:7:0x0110). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ?? async$default;
        ?? async$default2;
        ?? launch$default;
        ?? launch$default2;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        int i2 = 1;
        androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState = null;
        java.lang.Object[] objArr = 0;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getOutputFormats;
            kotlin.jvm.internal.Ref.ObjectRef objectRef5 = new kotlin.jvm.internal.Ref.ObjectRef();
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            objectRef5.element = async$default;
            kotlin.jvm.internal.Ref.ObjectRef objectRef6 = new kotlin.jvm.internal.Ref.ObjectRef();
            async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$resultDeferred$1(this.getHighSpeedVideoFpsRangesFor, null), 3, null);
            objectRef6.element = async$default2;
            kotlin.jvm.internal.Ref.ObjectRef objectRef7 = new kotlin.jvm.internal.Ref.ObjectRef();
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$timeoutJob$1(null), 3, null);
            objectRef7.element = launch$default;
            kotlin.jvm.internal.Ref.ObjectRef objectRef8 = new kotlin.jvm.internal.Ref.ObjectRef();
            launch$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$cameraOpenCancelJob$1(this.getInputSizeshNQ4ISI, null), 3, null);
            objectRef8.element = launch$default2;
            coroutineScope = coroutineScope2;
            objectRef = objectRef5;
            objectRef2 = objectRef6;
            objectRef3 = objectRef7;
            objectRef4 = objectRef8;
            if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.getInputFormats;
            objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighResolutionOutputSizeshNQ4ISI;
            objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.Camera2StreamConfigurationMap;
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.getHighSpeedVideoSizes;
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputFormats;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.camera.camera2.pipe.compat.OpenCameraResult openCameraResult = (androidx.camera.camera2.pipe.compat.OpenCameraResult) obj;
                if (openCameraResult != null) {
                    androidx.camera.camera2.pipe.core.Log.INSTANCE.getINFO_LOGGABLE();
                    kotlinx.coroutines.Deferred deferred = (kotlinx.coroutines.Deferred) objectRef.element;
                    if (deferred != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) deferred, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    kotlinx.coroutines.Deferred deferred2 = (kotlinx.coroutines.Deferred) objectRef2.element;
                    if (deferred2 != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) deferred2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) objectRef3.element;
                    if (job != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    kotlinx.coroutines.Job job2 = (kotlinx.coroutines.Job) objectRef4.element;
                    if (job2 != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job2, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    return openCameraResult;
                }
                if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                    java.lang.String str = this.getHighSpeedVideoFpsRanges;
                    androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState2 = this.getHighSpeedVideoFpsRangesFor;
                    kotlinx.coroutines.selects.SelectImplementation selectImplementation = new kotlinx.coroutines.selects.SelectImplementation(getGetHighSpeedVideoSizes());
                    kotlinx.coroutines.selects.SelectImplementation selectImplementation2 = selectImplementation;
                    kotlinx.coroutines.Deferred deferred3 = (kotlinx.coroutines.Deferred) objectRef.element;
                    if (deferred3 != null) {
                        selectImplementation2.invoke(deferred3.getOnAwait(), new androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$result$1$1(objectRef, str, null));
                    }
                    kotlinx.coroutines.Deferred deferred4 = (kotlinx.coroutines.Deferred) objectRef2.element;
                    if (deferred4 != null) {
                        selectImplementation2.invoke(deferred4.getOnAwait(), new androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$result$1$2(objectRef2, str, null));
                    }
                    kotlinx.coroutines.Job job3 = (kotlinx.coroutines.Job) objectRef3.element;
                    if (job3 != null) {
                        selectImplementation2.invoke(job3.getOnJoin(), new androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$result$1$3(objectRef3, objectRef, androidCameraState2, null));
                    }
                    kotlinx.coroutines.Job job4 = (kotlinx.coroutines.Job) objectRef4.element;
                    if (job4 != null) {
                        selectImplementation2.invoke(job4.getOnJoin(), new androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2$result$1$4(objectRef4, null));
                    }
                    this.getOutputFormats = coroutineScope;
                    this.getHighSpeedVideoSizes = objectRef;
                    this.Camera2StreamConfigurationMap = objectRef2;
                    this.getHighResolutionOutputSizeshNQ4ISI = objectRef3;
                    this.getInputFormats = objectRef4;
                    this.getOutputMinFrameDuration = 1;
                    obj = selectImplementation.doSelect(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    androidx.camera.camera2.pipe.compat.OpenCameraResult openCameraResult2 = (androidx.camera.camera2.pipe.compat.OpenCameraResult) obj;
                    if (openCameraResult2 != null) {
                    }
                    if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                        return new androidx.camera.camera2.pipe.compat.OpenCameraResult(androidCameraState, androidx.camera.camera2.pipe.CameraError.m320boximpl(androidx.camera.camera2.pipe.CameraError.INSTANCE.m335getERROR_CAMERA_OPENERv7Vf74A()), i2, objArr == true ? 1 : 0);
                    }
                }
            } catch (java.lang.Throwable th) {
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getERROR_LOGGABLE();
                throw th;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.OpenCameraResult> continuation) {
        return ((androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2 cameraStateOpener$tryOpenCamera$2 = new androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        cameraStateOpener$tryOpenCamera$2.getOutputFormats = obj;
        return cameraStateOpener$tryOpenCamera$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraStateOpener$tryOpenCamera$2(androidx.camera.camera2.pipe.compat.CameraStateOpener cameraStateOpener, java.lang.String str, androidx.camera.camera2.pipe.compat.AndroidCameraState androidCameraState, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.CameraStateOpener$tryOpenCamera$2> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = cameraStateOpener;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = androidCameraState;
    }
}
