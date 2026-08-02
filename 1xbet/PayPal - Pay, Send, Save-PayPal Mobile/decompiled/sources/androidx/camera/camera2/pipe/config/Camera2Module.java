package androidx.camera.camera2.pipe.config;

@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH'¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H'¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H'¢\u0006\u0004\b*\u0010+J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,H'¢\u0006\u0004\b/\u00100"}, d2 = {"Landroidx/camera/camera2/pipe/config/Camera2Module;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/compat/Camera2Backend;", "camera2Backend", "Landroidx/camera/camera2/pipe/CameraBackend;", "bindCameraPipeCameraBackend", "(Landroidx/camera/camera2/pipe/compat/Camera2Backend;)Landroidx/camera/camera2/pipe/CameraBackend;", "Landroidx/camera/camera2/pipe/compat/PruningCamera2DeviceManager;", "camera2DeviceManager", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceManager;", "bindCamera2DeviceManager", "(Landroidx/camera/camera2/pipe/compat/PruningCamera2DeviceManager;)Landroidx/camera/camera2/pipe/compat/Camera2DeviceManager;", "Landroidx/camera/camera2/pipe/compat/Camera2CameraOpener;", "camera2CameraOpener", "Landroidx/camera/camera2/pipe/compat/CameraOpener;", "bindCameraOpener", "(Landroidx/camera/camera2/pipe/compat/Camera2CameraOpener;)Landroidx/camera/camera2/pipe/compat/CameraOpener;", "Landroidx/camera/camera2/pipe/compat/RetryingCameraStateOpenerImpl;", "retryingCameraStateOpenerImpl", "Landroidx/camera/camera2/pipe/compat/RetryingCameraStateOpener;", "bindRetryingCameraStateOpener", "(Landroidx/camera/camera2/pipe/compat/RetryingCameraStateOpenerImpl;)Landroidx/camera/camera2/pipe/compat/RetryingCameraStateOpener;", "Landroidx/camera/camera2/pipe/compat/Camera2MetadataCache;", "camera2MetadataCache", "Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;", "bindCameraMetadataProvider", "(Landroidx/camera/camera2/pipe/compat/Camera2MetadataCache;)Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;", "Landroidx/camera/camera2/pipe/compat/Camera2ErrorProcessor;", "camera2ErrorProcessor", "Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "bindCameraErrorListener", "(Landroidx/camera/camera2/pipe/compat/Camera2ErrorProcessor;)Landroidx/camera/camera2/pipe/internal/CameraErrorListener;", "Landroidx/camera/camera2/pipe/compat/Camera2CameraAvailabilityMonitor;", "camera2CameraAvailabilityMonitor", "Landroidx/camera/camera2/pipe/compat/CameraAvailabilityMonitor;", "bindCameraAvailabilityMonitor", "(Landroidx/camera/camera2/pipe/compat/Camera2CameraAvailabilityMonitor;)Landroidx/camera/camera2/pipe/compat/CameraAvailabilityMonitor;", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloserImpl;", "camera2CameraDeviceCloser", "Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloser;", "bindCamera2DeviceCloser", "(Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloserImpl;)Landroidx/camera/camera2/pipe/compat/Camera2DeviceCloser;", "Landroidx/camera/camera2/pipe/compat/AudioRestrictionControllerImpl;", "audioRestrictionController", "Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;", "bindAudioRestrictionController", "(Landroidx/camera/camera2/pipe/compat/AudioRestrictionControllerImpl;)Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@dagger.Module(subcomponents = {androidx.camera.camera2.pipe.config.Camera2ControllerComponent.class})
/* loaded from: classes6.dex */
public abstract class Camera2Module {
    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.compat.AudioRestrictionController bindAudioRestrictionController(androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl audioRestrictionController);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.compat.Camera2DeviceCloser bindCamera2DeviceCloser(androidx.camera.camera2.pipe.compat.Camera2DeviceCloserImpl camera2CameraDeviceCloser);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.compat.Camera2DeviceManager bindCamera2DeviceManager(androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager camera2DeviceManager);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor bindCameraAvailabilityMonitor(androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor camera2CameraAvailabilityMonitor);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.internal.CameraErrorListener bindCameraErrorListener(androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor camera2ErrorProcessor);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.compat.Camera2MetadataProvider bindCameraMetadataProvider(androidx.camera.camera2.pipe.compat.Camera2MetadataCache camera2MetadataCache);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.compat.CameraOpener bindCameraOpener(androidx.camera.camera2.pipe.compat.Camera2CameraOpener camera2CameraOpener);

    @androidx.camera.camera2.pipe.config.DefaultCameraBackend
    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.CameraBackend bindCameraPipeCameraBackend(androidx.camera.camera2.pipe.compat.Camera2Backend camera2Backend);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener bindRetryingCameraStateOpener(androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl retryingCameraStateOpenerImpl);
}
