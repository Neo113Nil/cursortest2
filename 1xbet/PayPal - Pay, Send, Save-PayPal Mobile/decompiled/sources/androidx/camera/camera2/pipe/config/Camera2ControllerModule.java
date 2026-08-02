package androidx.camera.camera2.pipe.config;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/camera/camera2/pipe/config/Camera2ControllerModule;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/compat/StandardCamera2CaptureSequenceProcessorFactory;", "factoryStandard", "Landroidx/camera/camera2/pipe/compat/Camera2CaptureSequenceProcessorFactory;", "bindCamera2RequestProcessorFactory", "(Landroidx/camera/camera2/pipe/compat/StandardCamera2CaptureSequenceProcessorFactory;)Landroidx/camera/camera2/pipe/compat/Camera2CaptureSequenceProcessorFactory;", "Landroidx/camera/camera2/pipe/compat/Camera2CameraController;", "camera2CameraController", "Landroidx/camera/camera2/pipe/CameraController;", "bindCameraController", "(Landroidx/camera/camera2/pipe/compat/Camera2CameraController;)Landroidx/camera/camera2/pipe/CameraController;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@dagger.Module
/* loaded from: classes6.dex */
public abstract class Camera2ControllerModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.config.Camera2ControllerModule.Companion INSTANCE = new androidx.camera.camera2.pipe.config.Camera2ControllerModule.Companion(null);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessorFactory bindCamera2RequestProcessorFactory(androidx.camera.camera2.pipe.compat.StandardCamera2CaptureSequenceProcessorFactory factoryStandard);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.CameraController bindCameraController(androidx.camera.camera2.pipe.compat.Camera2CameraController camera2CameraController);

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/camera/camera2/pipe/config/Camera2ControllerModule$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Lkotlinx/coroutines/Job;", "cameraPipeJob", "Lkotlinx/coroutines/CoroutineScope;", "provideCoroutineScope", "(Landroidx/camera/camera2/pipe/core/Threads;Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/CoroutineScope;", "Ljavax/inject/Provider;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor;", "provideCameraStatusMonitor", "(Ljavax/inject/Provider;Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/CameraGraph$Config;Lkotlinx/coroutines/Job;)Landroidx/camera/camera2/pipe/internal/CameraStatusMonitor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @dagger.Provides
        @androidx.camera.camera2.pipe.config.Camera2ControllerScope
        public final kotlinx.coroutines.CoroutineScope provideCoroutineScope(androidx.camera.camera2.pipe.core.Threads threads, @androidx.camera.camera2.pipe.config.CameraPipeJob kotlinx.coroutines.Job cameraPipeJob) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipeJob, "");
            return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob(cameraPipeJob).plus(threads.getLightweightDispatcher().plus(new kotlinx.coroutines.CoroutineName("CXCP-Camera2Controller"))));
        }

        @dagger.Provides
        @androidx.camera.camera2.pipe.config.Camera2ControllerScope
        public final androidx.camera.camera2.pipe.internal.CameraStatusMonitor provideCameraStatusMonitor(javax.inject.Provider<android.hardware.camera2.CameraManager> cameraManager, androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.CameraGraph.Config graphConfig, @androidx.camera.camera2.pipe.config.CameraPipeJob kotlinx.coroutines.Job cameraPipeJob) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipeJob, "");
            return new androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor(cameraManager, threads, graphConfig.m353getCameraDz_R5H8(), cameraPipeJob, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
