package androidx.camera.camera2.pipe.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\rR\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "cameraAvailability", "Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus;", "getCameraAvailability", "()Lkotlinx/coroutines/flow/StateFlow;", "cameraPriorities", "Lkotlinx/coroutines/flow/SharedFlow;", "", "getCameraPriorities", "()Lkotlinx/coroutines/flow/SharedFlow;", "CameraStatus", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CameraStatusMonitor extends java.lang.AutoCloseable {
    kotlinx.coroutines.flow.StateFlow<androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus> getCameraAvailability();

    kotlinx.coroutines.flow.SharedFlow<kotlin.Unit> getCameraPriorities();

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus;", "", "<init>", "()V", "Unknown", "CameraPrioritiesChanged", "CameraAvailable", "CameraUnavailable"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class CameraStatus {

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus$Unknown;", "Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Unknown extends androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus {
            public static final androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus.Unknown INSTANCE = new androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus.Unknown();

            private Unknown() {
            }

            public final java.lang.String toString() {
                return "UnknownCameraStatus";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus$CameraPrioritiesChanged;", "Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CameraPrioritiesChanged extends androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus {
            public static final androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus.CameraPrioritiesChanged INSTANCE = new androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus.CameraPrioritiesChanged();

            private CameraPrioritiesChanged() {
            }

            public final java.lang.String toString() {
                return "CameraPrioritiesChanged";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus$CameraAvailable;", "Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus;", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCameraId-Dz_R5H8"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CameraAvailable extends androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus {
            private final java.lang.String cameraId;

            private CameraAvailable(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.cameraId = str;
            }

            /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name and from getter */
            public final java.lang.String getCameraId() {
                return this.cameraId;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraAvailable(camera=");
                sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraId.m398toStringimpl(this.cameraId));
                sb.append(')');
                return sb.toString();
            }

            public /* synthetic */ CameraAvailable(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus$CameraUnavailable;", "Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor$CameraStatus;", "Landroidx/camera/camera2/pipe/CameraId;", "cameraId", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCameraId-Dz_R5H8"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CameraUnavailable extends androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus {
            private final java.lang.String cameraId;

            private CameraUnavailable(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.cameraId = str;
            }

            /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name and from getter */
            public final java.lang.String getCameraId() {
                return this.cameraId;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraUnavailable(camera=");
                sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraId.m398toStringimpl(this.cameraId));
                sb.append(')');
                return sb.toString();
            }

            public /* synthetic */ CameraUnavailable(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str);
            }
        }
    }
}
