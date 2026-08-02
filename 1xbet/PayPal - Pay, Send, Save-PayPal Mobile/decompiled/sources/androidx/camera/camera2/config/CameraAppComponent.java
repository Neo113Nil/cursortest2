package androidx.camera.camera2.config;

@dagger.Component(modules = {androidx.camera.camera2.config.CameraAppModule.class, androidx.camera.camera2.config.CameraAppConfig.class})
@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/config/CameraAppComponent;", "", "Landroidx/camera/camera2/config/CameraComponent$Builder;", "cameraBuilder", "()Landroidx/camera/camera2/config/CameraComponent$Builder;", "Landroidx/camera/camera2/pipe/CameraPipe;", "getCameraPipe", "()Landroidx/camera/camera2/pipe/CameraPipe;", "Landroidx/camera/camera2/pipe/CameraDevices;", "getCameraDevices", "()Landroidx/camera/camera2/pipe/CameraDevices;", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CameraAppComponent {

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/config/CameraAppComponent$Builder;", "", "Landroidx/camera/camera2/config/CameraAppConfig;", "config", "(Landroidx/camera/camera2/config/CameraAppConfig;)Landroidx/camera/camera2/config/CameraAppComponent$Builder;", "Landroidx/camera/camera2/config/CameraAppComponent;", "build", "()Landroidx/camera/camera2/config/CameraAppComponent;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Component.Builder
    public interface Builder {
        androidx.camera.camera2.config.CameraAppComponent build();

        androidx.camera.camera2.config.CameraAppComponent.Builder config(androidx.camera.camera2.config.CameraAppConfig config);
    }

    androidx.camera.camera2.config.CameraComponent.Builder cameraBuilder();

    androidx.camera.camera2.pipe.CameraDevices getCameraDevices();

    androidx.camera.camera2.pipe.CameraPipe getCameraPipe();
}
