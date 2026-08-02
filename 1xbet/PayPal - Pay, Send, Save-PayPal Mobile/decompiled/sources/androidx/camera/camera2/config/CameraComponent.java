package androidx.camera.camera2.config;

@androidx.camera.camera2.config.CameraScope
@dagger.Subcomponent(modules = {androidx.camera.camera2.config.CameraModule.class, androidx.camera.camera2.config.CameraConfig.class, androidx.camera.camera2.compat.CameraCompatModule.class})
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/config/CameraComponent;", "", "Landroidx/camera/core/impl/CameraInternal;", "getCameraInternal", "()Landroidx/camera/core/impl/CameraInternal;", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CameraComponent {

    @dagger.Subcomponent.Builder
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/config/CameraComponent$Builder;", "", "Landroidx/camera/camera2/config/CameraConfig;", "config", "(Landroidx/camera/camera2/config/CameraConfig;)Landroidx/camera/camera2/config/CameraComponent$Builder;", "Landroidx/camera/core/internal/StreamSpecsCalculator;", "streamSpecsCalculator", "(Landroidx/camera/core/internal/StreamSpecsCalculator;)Landroidx/camera/camera2/config/CameraComponent$Builder;", "Landroidx/camera/camera2/config/CameraComponent;", "build", "()Landroidx/camera/camera2/config/CameraComponent;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Builder {
        androidx.camera.camera2.config.CameraComponent build();

        androidx.camera.camera2.config.CameraComponent.Builder config(androidx.camera.camera2.config.CameraConfig config);

        @dagger.BindsInstance
        androidx.camera.camera2.config.CameraComponent.Builder streamSpecsCalculator(androidx.camera.core.internal.StreamSpecsCalculator streamSpecsCalculator);
    }

    androidx.camera.core.impl.CameraInternal getCameraInternal();
}
