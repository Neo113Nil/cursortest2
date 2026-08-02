package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001JK\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\b\b\u0002\u0010\u0018\u001a\u00020\bH&¢\u0006\u0004\b\u0019\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2DeviceManager;", "", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "", "sharedCameraIds", "Landroidx/camera/camera2/pipe/graph/GraphListener;", "graphListener", "", "isPrewarm", "Lkotlin/Function1;", "", "isForegroundObserver", "Landroidx/camera/camera2/pipe/compat/VirtualCamera;", "open-zDSwpeU", "(Ljava/lang/String;Ljava/util/List;Landroidx/camera/camera2/pipe/graph/GraphListener;ZLkotlin/jvm/functions/Function1;)Landroidx/camera/camera2/pipe/compat/VirtualCamera;", "open", "prewarm-EfqyGwQ", "(Ljava/lang/String;)V", "prewarm", "Lkotlinx/coroutines/Deferred;", "close-EfqyGwQ", "(Ljava/lang/String;)Lkotlinx/coroutines/Deferred;", "close", "forceCancelOpen", "closeAll", "(Z)Lkotlinx/coroutines/Deferred;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Camera2DeviceManager {
    /* renamed from: close-EfqyGwQ, reason: not valid java name */
    kotlinx.coroutines.Deferred<kotlin.Unit> mo787closeEfqyGwQ(java.lang.String cameraId);

    kotlinx.coroutines.Deferred<kotlin.Unit> closeAll(boolean forceCancelOpen);

    /* renamed from: open-zDSwpeU, reason: not valid java name */
    androidx.camera.camera2.pipe.compat.VirtualCamera mo788openzDSwpeU(java.lang.String cameraId, java.util.List<androidx.camera.camera2.pipe.CameraId> sharedCameraIds, androidx.camera.camera2.pipe.graph.GraphListener graphListener, boolean isPrewarm, kotlin.jvm.functions.Function1<? super kotlin.Unit, java.lang.Boolean> isForegroundObserver);

    /* renamed from: prewarm-EfqyGwQ, reason: not valid java name */
    void mo789prewarmEfqyGwQ(java.lang.String cameraId);

    static /* synthetic */ kotlinx.coroutines.Deferred closeAll$default(androidx.camera.camera2.pipe.compat.Camera2DeviceManager camera2DeviceManager, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeAll");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return camera2DeviceManager.closeAll(z);
    }
}
