package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J6\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/compat/RetryingCameraStateOpener;", "", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloser;", "camera2DeviceCloser", "Lkotlin/Function1;", "", "", "isForegroundObserver", "Landroidx/camera/camera2/pipe/compat/OpenCameraResult;", "openCameraWithRetry-aeCOTgg", "(Ljava/lang/String;Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloser;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openCameraWithRetry", "Landroidx/camera/camera2/pipe/compat/AwaitOpenCameraResult;", "openAndAwaitCameraWithRetry-0r8Bogc", "(Ljava/lang/String;Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloser;)Landroidx/camera/camera2/pipe/compat/AwaitOpenCameraResult;", "openAndAwaitCameraWithRetry", "cancelOpen", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface RetryingCameraStateOpener {
    void cancelOpen();

    /* renamed from: openAndAwaitCameraWithRetry-0r8Bogc, reason: not valid java name */
    androidx.camera.camera2.pipe.compat.AwaitOpenCameraResult mo845openAndAwaitCameraWithRetry0r8Bogc(java.lang.String cameraId, androidx.camera.camera2.pipe.compat.Camera2DeviceCloser camera2DeviceCloser);

    /* renamed from: openCameraWithRetry-aeCOTgg, reason: not valid java name */
    java.lang.Object mo846openCameraWithRetryaeCOTgg(java.lang.String str, androidx.camera.camera2.pipe.compat.Camera2DeviceCloser camera2DeviceCloser, kotlin.jvm.functions.Function1<? super kotlin.Unit, java.lang.Boolean> function1, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.OpenCameraResult> continuation);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: openCameraWithRetry-aeCOTgg$default, reason: not valid java name */
    static /* synthetic */ java.lang.Object m844openCameraWithRetryaeCOTgg$default(androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener retryingCameraStateOpener, java.lang.String str, androidx.camera.camera2.pipe.compat.Camera2DeviceCloser camera2DeviceCloser, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openCameraWithRetry-aeCOTgg");
        }
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener.m843$r8$lambda$P9BprrKmujFTusqBJ7x2IEeI6M((kotlin.Unit) obj2));
                }
            };
        }
        return retryingCameraStateOpener.mo846openCameraWithRetryaeCOTgg(str, camera2DeviceCloser, function1, continuation);
    }

    /* renamed from: $r8$lambda$P9BprrKm-ujFTusqBJ7x2IEeI6M, reason: not valid java name */
    static /* synthetic */ boolean m843$r8$lambda$P9BprrKmujFTusqBJ7x2IEeI6M(kotlin.Unit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        return true;
    }
}
