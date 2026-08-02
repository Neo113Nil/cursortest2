package androidx.camera.camera2.config;

@dagger.Subcomponent(modules = {androidx.camera.camera2.config.UseCaseCameraModule.class, androidx.camera.camera2.config.UseCaseCameraConfig.class})
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/config/UseCaseCameraComponent;", "", "Landroidx/camera/camera2/impl/UseCaseCamera;", "getUseCaseCamera", "()Landroidx/camera/camera2/impl/UseCaseCamera;", "Landroidx/camera/camera2/config/UseCaseGraphContext;", "getUseCaseGraphContext", "()Landroidx/camera/camera2/config/UseCaseGraphContext;", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
@androidx.camera.camera2.config.UseCaseCameraScope
/* loaded from: classes6.dex */
public interface UseCaseCameraComponent {

    @dagger.Subcomponent.Builder
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/config/UseCaseCameraComponent$Builder;", "", "Landroidx/camera/camera2/config/UseCaseCameraConfig;", "config", "(Landroidx/camera/camera2/config/UseCaseCameraConfig;)Landroidx/camera/camera2/config/UseCaseCameraComponent$Builder;", "Landroidx/camera/camera2/config/UseCaseCameraComponent;", "build", "()Landroidx/camera/camera2/config/UseCaseCameraComponent;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Builder {
        androidx.camera.camera2.config.UseCaseCameraComponent build();

        androidx.camera.camera2.config.UseCaseCameraComponent.Builder config(androidx.camera.camera2.config.UseCaseCameraConfig config);
    }

    androidx.camera.camera2.impl.UseCaseCamera getUseCaseCamera();

    androidx.camera.camera2.config.UseCaseGraphContext getUseCaseGraphContext();
}
