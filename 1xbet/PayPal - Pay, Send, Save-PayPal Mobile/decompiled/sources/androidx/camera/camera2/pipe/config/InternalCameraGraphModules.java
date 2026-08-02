package androidx.camera.camera2.pipe.config;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b!\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/config/InternalCameraGraphModules;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@dagger.Module
/* loaded from: classes6.dex */
public abstract class InternalCameraGraphModules {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.config.InternalCameraGraphModules.Companion INSTANCE = new androidx.camera.camera2.pipe.config.InternalCameraGraphModules.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/camera/camera2/pipe/config/InternalCameraGraphModules$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraBackends;", "cameraBackends", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "Landroidx/camera/camera2/pipe/CameraContext;", "cameraContext", "Landroidx/camera/camera2/pipe/CameraBackend;", "provideCameraBackend", "(Landroidx/camera/camera2/pipe/CameraBackends;Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/CameraContext;)Landroidx/camera/camera2/pipe/CameraBackend;", "cameraBackend", "Landroidx/camera/camera2/pipe/CameraMetadata;", "provideCameraMetadata", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/CameraBackend;)Landroidx/camera/camera2/pipe/CameraMetadata;", "Landroidx/camera/camera2/pipe/CameraGraphId;", "graphId", "Landroidx/camera/camera2/pipe/graph/GraphProcessorImpl;", "graphProcessor", "Landroidx/camera/camera2/pipe/StreamGraph;", "streamGraph", "Landroidx/camera/camera2/pipe/SurfaceTracker;", "surfaceTracker", "Landroidx/camera/camera2/pipe/CameraController;", "provideCameraController", "(Landroidx/camera/camera2/pipe/CameraGraphId;Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/CameraBackend;Landroidx/camera/camera2/pipe/CameraContext;Landroidx/camera/camera2/pipe/graph/GraphProcessorImpl;Landroidx/camera/camera2/pipe/StreamGraph;Landroidx/camera/camera2/pipe/SurfaceTracker;)Landroidx/camera/camera2/pipe/CameraController;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @androidx.camera.camera2.pipe.config.CameraGraphScope
        @dagger.Provides
        public final androidx.camera.camera2.pipe.CameraBackend provideCameraBackend(androidx.camera.camera2.pipe.CameraBackends cameraBackends, androidx.camera.camera2.pipe.CameraGraph.Config graphConfig, androidx.camera.camera2.pipe.CameraContext cameraContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraBackends, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraContext, "");
            androidx.camera.camera2.pipe.CameraBackendFactory customCameraBackend = graphConfig.getCustomCameraBackend();
            if (customCameraBackend != null) {
                return customCameraBackend.create(cameraContext);
            }
            java.lang.String m354getCameraBackendIdAKmI2lo = graphConfig.m354getCameraBackendIdAKmI2lo();
            if (m354getCameraBackendIdAKmI2lo != null) {
                androidx.camera.camera2.pipe.CameraBackend mo239getSG3A4s8 = cameraBackends.mo239getSG3A4s8(m354getCameraBackendIdAKmI2lo);
                if (mo239getSG3A4s8 != null) {
                    return mo239getSG3A4s8;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to initialize ");
                sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraBackendId.m237toStringimpl(m354getCameraBackendIdAKmI2lo));
                sb.append(" from ");
                sb.append(graphConfig);
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            return cameraBackends.getDefault();
        }

        @androidx.camera.camera2.pipe.config.CameraGraphScope
        @dagger.Provides
        public final androidx.camera.camera2.pipe.CameraMetadata provideCameraMetadata(androidx.camera.camera2.pipe.CameraGraph.Config graphConfig, androidx.camera.camera2.pipe.CameraBackend cameraBackend) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraBackend, "");
            androidx.camera.camera2.pipe.CameraMetadata mo219awaitCameraMetadataEfqyGwQ = cameraBackend.mo219awaitCameraMetadataEfqyGwQ(graphConfig.m353getCameraDz_R5H8());
            if (mo219awaitCameraMetadataEfqyGwQ != null) {
                return mo219awaitCameraMetadataEfqyGwQ;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to load metadata for ");
            sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraId.m398toStringimpl(graphConfig.m353getCameraDz_R5H8()));
            sb.append('!');
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }

        @androidx.camera.camera2.pipe.config.CameraGraphScope
        @dagger.Provides
        public final androidx.camera.camera2.pipe.CameraController provideCameraController(androidx.camera.camera2.pipe.CameraGraphId graphId, androidx.camera.camera2.pipe.CameraGraph.Config graphConfig, androidx.camera.camera2.pipe.CameraBackend cameraBackend, androidx.camera.camera2.pipe.CameraContext cameraContext, androidx.camera.camera2.pipe.graph.GraphProcessorImpl graphProcessor, androidx.camera.camera2.pipe.StreamGraph streamGraph, androidx.camera.camera2.pipe.SurfaceTracker surfaceTracker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraBackend, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphProcessor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamGraph, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceTracker, "");
            return cameraBackend.createCameraController(cameraContext, graphId, graphConfig, graphProcessor, streamGraph, surfaceTracker);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
