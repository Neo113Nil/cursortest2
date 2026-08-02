package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class PruningCamera2DeviceManager$queue$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.util.List<androidx.camera.camera2.pipe.compat.CameraRequest>, kotlin.Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.util.List<androidx.camera.camera2.pipe.compat.CameraRequest> list) {
        java.util.List<androidx.camera.camera2.pipe.compat.CameraRequest> list2 = list;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        ((androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager) this.receiver).prune$camera_camera2_pipe(list2);
        return kotlin.Unit.INSTANCE;
    }

    PruningCamera2DeviceManager$queue$1(java.lang.Object obj) {
        super(1, obj, androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager.class, "prune", "prune$camera_camera2_pipe(Ljava/util/List;)V", 0);
    }
}
