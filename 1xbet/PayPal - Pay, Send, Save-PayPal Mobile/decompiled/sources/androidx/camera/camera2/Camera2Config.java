package androidx.camera.camera2;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/Camera2Config;", "", "<init>", "()V", "Companion", "DefaultProvider"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2Config {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.Camera2Config.Companion INSTANCE = new androidx.camera.camera2.Camera2Config.Companion(null);

    private Camera2Config() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/camera/camera2/Camera2Config$DefaultProvider;", "Landroidx/camera/core/CameraXConfig$Provider;", "<init>", "()V", "Landroidx/camera/core/CameraXConfig;", "getCameraXConfig", "()Landroidx/camera/core/CameraXConfig;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultProvider implements androidx.camera.core.CameraXConfig.Provider {
        @Override // androidx.camera.core.CameraXConfig.Provider
        public final androidx.camera.core.CameraXConfig getCameraXConfig() {
            return androidx.camera.camera2.Camera2Config.INSTANCE.defaultConfig();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/camera/camera2/Camera2Config$Companion;", "", "<init>", "()V", "Landroidx/camera/core/CameraXConfig;", "defaultConfig", "()Landroidx/camera/core/CameraXConfig;", "Landroidx/camera/camera2/pipe/CameraPipe;", "sharedCameraPipe", "Landroid/content/Context;", "sharedAppContext", "Landroidx/camera/core/impl/CameraThreadConfig;", "sharedThreadConfig", "from", "(Landroidx/camera/camera2/pipe/CameraPipe;Landroid/content/Context;Landroidx/camera/core/impl/CameraThreadConfig;)Landroidx/camera/core/CameraXConfig;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.core.CameraXConfig defaultConfig() {
            return from$default(this, null, null, null, 7, null);
        }

        public static /* synthetic */ androidx.camera.core.CameraXConfig from$default(androidx.camera.camera2.Camera2Config.Companion companion, androidx.camera.camera2.pipe.CameraPipe cameraPipe, android.content.Context context, androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cameraPipe = null;
            }
            if ((i & 2) != 0) {
                context = null;
            }
            if ((i & 4) != 0) {
                cameraThreadConfig = null;
            }
            return companion.from(cameraPipe, context, cameraThreadConfig);
        }

        @kotlin.jvm.JvmStatic
        public final androidx.camera.core.CameraXConfig from(androidx.camera.camera2.pipe.CameraPipe sharedCameraPipe, android.content.Context sharedAppContext, androidx.camera.core.impl.CameraThreadConfig sharedThreadConfig) {
            androidx.camera.core.CameraXConfig build = new androidx.camera.core.CameraXConfig.Builder().setCameraFactoryProvider(new androidx.camera.camera2.adapter.CameraFactoryProvider(sharedCameraPipe, sharedAppContext, sharedThreadConfig)).setDeviceSurfaceManagerProvider(new androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider() { // from class: androidx.camera.camera2.Camera2Config$Companion$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider
                public final androidx.camera.core.impl.CameraDeviceSurfaceManager newInstance(android.content.Context context, java.lang.Object obj, java.util.Set set) {
                    return new androidx.camera.camera2.adapter.CameraSurfaceAdapter(context, obj, set);
                }
            }).setUseCaseConfigFactoryProvider(new androidx.camera.core.impl.UseCaseConfigFactory.Provider() { // from class: androidx.camera.camera2.Camera2Config$Companion$$ExternalSyntheticLambda1
                @Override // androidx.camera.core.impl.UseCaseConfigFactory.Provider
                public final androidx.camera.core.impl.UseCaseConfigFactory newInstance(android.content.Context context) {
                    return new androidx.camera.camera2.adapter.CameraUseCaseAdapter(context);
                }
            }).setRepeatingStreamForced(true).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
            return build;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.CameraXConfig from(androidx.camera.camera2.pipe.CameraPipe cameraPipe, android.content.Context context, androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig) {
        return INSTANCE.from(cameraPipe, context, cameraThreadConfig);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.camera.core.CameraXConfig defaultConfig() {
        return INSTANCE.defaultConfig();
    }
}
