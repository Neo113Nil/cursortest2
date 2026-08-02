package androidx.camera.camera2.config;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/config/CameraAppModule;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@dagger.Module(subcomponents = {androidx.camera.camera2.config.CameraComponent.class})
/* loaded from: classes6.dex */
public abstract class CameraAppModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.config.CameraAppModule.Companion INSTANCE = new androidx.camera.camera2.config.CameraAppModule.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/config/CameraAppModule$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraPipe;", "cameraPipe", "Landroidx/camera/camera2/pipe/CameraDevices;", "provideCameraDevices", "(Landroidx/camera/camera2/pipe/CameraPipe;)Landroidx/camera/camera2/pipe/CameraDevices;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @dagger.Provides
        public final androidx.camera.camera2.pipe.CameraDevices provideCameraDevices(androidx.camera.camera2.pipe.CameraPipe cameraPipe) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipe, "");
            return cameraPipe.cameras();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
