package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/CameraDevices;", "Landroidx/camera/camera2/pipe/CameraBackendId;", "cameraBackendId", "", "includePhysicalCameraMetadata", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/camera/camera2/pipe/CameraMetadata;", "find-Ohbb9yk", "(Landroidx/camera/camera2/pipe/CameraDevices;Ljava/lang/String;Z)Lkotlinx/coroutines/flow/Flow;", "find"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraDevicesKt {
    /* renamed from: find-Ohbb9yk$default, reason: not valid java name */
    public static /* synthetic */ kotlinx.coroutines.flow.Flow m319findOhbb9yk$default(androidx.camera.camera2.pipe.CameraDevices cameraDevices, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return m318findOhbb9yk(cameraDevices, str, z);
    }

    /* renamed from: find-Ohbb9yk, reason: not valid java name */
    public static final kotlinx.coroutines.flow.Flow<androidx.camera.camera2.pipe.CameraMetadata> m318findOhbb9yk(androidx.camera.camera2.pipe.CameraDevices cameraDevices, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevices, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new androidx.camera.camera2.pipe.CameraDevicesKt$find$1(cameraDevices, str, z, null));
    }
}
