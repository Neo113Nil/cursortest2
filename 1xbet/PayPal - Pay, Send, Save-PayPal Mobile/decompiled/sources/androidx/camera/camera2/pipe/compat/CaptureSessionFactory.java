package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\rJ3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;", "", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "cameraDevice", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "surfaces", "Landroidx/camera/camera2/pipe/compat/CaptureSessionState;", "captureSessionState", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result;", "create", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Ljava/util/Map;Landroidx/camera/camera2/pipe/compat/CaptureSessionState;)Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result;", "Result"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CaptureSessionFactory {
    androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result create(androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDevice, java.util.Map<androidx.camera.camera2.pipe.StreamId, ? extends android.view.Surface> surfaces, androidx.camera.camera2.pipe.compat.CaptureSessionState captureSessionState);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result;", "", "Success", "Failed", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result$Failed;", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result$Success;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Result {

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ<\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result$Success;", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result;", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroidx/camera/camera2/pipe/compat/OutputConfigurationWrapper;", "deferred", "Landroidx/camera/camera2/pipe/OutputId;", "Landroid/view/Surface;", "outputSurfaceMap", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "component2", "copy", "(Ljava/util/Map;Ljava/util/Map;)Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getDeferred", "getOutputSurfaceMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success implements androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result {
            private final java.util.Map<androidx.camera.camera2.pipe.StreamId, androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper> deferred;
            private final java.util.Map<androidx.camera.camera2.pipe.OutputId, android.view.Surface> outputSurfaceMap;

            /* JADX WARN: Multi-variable type inference failed */
            public Success(java.util.Map<androidx.camera.camera2.pipe.StreamId, ? extends androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper> map, java.util.Map<androidx.camera.camera2.pipe.OutputId, ? extends android.view.Surface> map2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
                this.deferred = map;
                this.outputSurfaceMap = map2;
            }

            public final java.util.Map<androidx.camera.camera2.pipe.StreamId, androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper> getDeferred() {
                return this.deferred;
            }

            public final java.util.Map<androidx.camera.camera2.pipe.OutputId, android.view.Surface> getOutputSurfaceMap() {
                return this.outputSurfaceMap;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(deferred=");
                sb.append(this.deferred);
                sb.append(", outputSurfaceMap=");
                sb.append(this.outputSurfaceMap);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                return (this.deferred.hashCode() * 31) + this.outputSurfaceMap.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Success)) {
                    return false;
                }
                androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Success success = (androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Success) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.deferred, success.deferred) && kotlin.jvm.internal.Intrinsics.areEqual(this.outputSurfaceMap, success.outputSurfaceMap);
            }

            public final androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Success copy(java.util.Map<androidx.camera.camera2.pipe.StreamId, ? extends androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper> deferred, java.util.Map<androidx.camera.camera2.pipe.OutputId, ? extends android.view.Surface> outputSurfaceMap) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deferred, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputSurfaceMap, "");
                return new androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Success(deferred, outputSurfaceMap);
            }

            public final java.util.Map<androidx.camera.camera2.pipe.OutputId, android.view.Surface> component2() {
                return this.outputSurfaceMap;
            }

            public final java.util.Map<androidx.camera.camera2.pipe.StreamId, androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper> component1() {
                return this.deferred;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Success copy$default(androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Success success, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    map = success.deferred;
                }
                if ((i & 2) != 0) {
                    map2 = success.outputSurfaceMap;
                }
                return success.copy(map, map2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result$Failed;", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Failed implements androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result {
            public static final androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Failed INSTANCE = new androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Failed();

            private Failed() {
            }
        }
    }
}
