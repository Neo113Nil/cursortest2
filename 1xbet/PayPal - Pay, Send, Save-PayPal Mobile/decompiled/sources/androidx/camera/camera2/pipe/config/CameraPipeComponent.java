package androidx.camera.camera2.pipe.config;

@dagger.Component(modules = {androidx.camera.camera2.pipe.config.CameraPipeModule.class, androidx.camera.camera2.pipe.config.CameraPipeConfigModule.class, androidx.camera.camera2.pipe.config.Camera2Module.class})
@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/config/CameraPipeComponent;", "", "Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;", "cameraPipeLifetime", "()Landroidx/camera/camera2/pipe/internal/CameraPipeLifetime;", "Landroidx/camera/camera2/pipe/config/CameraGraphComponent$Builder;", "cameraGraphComponentBuilder", "()Landroidx/camera/camera2/pipe/config/CameraGraphComponent$Builder;", "Landroidx/camera/camera2/pipe/config/FrameGraphComponent$Builder;", "frameGraphComponentBuilder", "()Landroidx/camera/camera2/pipe/config/FrameGraphComponent$Builder;", "Landroidx/camera/camera2/pipe/CameraDevices;", "cameras", "()Landroidx/camera/camera2/pipe/CameraDevices;", "Landroidx/camera/camera2/pipe/CameraBackends;", "cameraBackends", "()Landroidx/camera/camera2/pipe/CameraBackends;", "Landroidx/camera/camera2/pipe/CameraContext;", "cameraContext", "()Landroidx/camera/camera2/pipe/CameraContext;", "Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "cameraSurfaceManager", "()Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;", "cameraAudioRestrictionController", "()Landroidx/camera/camera2/pipe/compat/AudioRestrictionController;", "Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencers;", "concurrentSessionSequencers", "()Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencers;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CameraPipeComponent {
    androidx.camera.camera2.pipe.compat.AudioRestrictionController cameraAudioRestrictionController();

    androidx.camera.camera2.pipe.CameraBackends cameraBackends();

    androidx.camera.camera2.pipe.CameraContext cameraContext();

    androidx.camera.camera2.pipe.config.CameraGraphComponent.Builder cameraGraphComponentBuilder();

    androidx.camera.camera2.pipe.internal.CameraPipeLifetime cameraPipeLifetime();

    androidx.camera.camera2.pipe.CameraSurfaceManager cameraSurfaceManager();

    androidx.camera.camera2.pipe.CameraDevices cameras();

    androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers concurrentSessionSequencers();

    androidx.camera.camera2.pipe.config.FrameGraphComponent.Builder frameGraphComponentBuilder();
}
