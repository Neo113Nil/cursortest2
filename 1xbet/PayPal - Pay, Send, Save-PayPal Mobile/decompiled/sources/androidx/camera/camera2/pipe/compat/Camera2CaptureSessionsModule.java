package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0012\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2CaptureSessionsModule;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Landroidx/camera/camera2/pipe/compat/AndroidMSessionFactory;", "androidMProvider", "Landroidx/camera/camera2/pipe/compat/AndroidMHighSpeedSessionFactory;", "androidMHighSpeedProvider", "Landroidx/camera/camera2/pipe/compat/AndroidNSessionFactory;", "androidNProvider", "Landroidx/camera/camera2/pipe/compat/AndroidPSessionFactory;", "androidPProvider", "Landroidx/camera/camera2/pipe/compat/AndroidExtensionSessionFactory;", "androidExtensionProvider", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;", "provideSessionFactory", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Landroidx/camera/camera2/pipe/CameraGraph$Config;)Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@dagger.Module
/* loaded from: classes6.dex */
public final class Camera2CaptureSessionsModule {
    public static final androidx.camera.camera2.pipe.compat.Camera2CaptureSessionsModule INSTANCE = new androidx.camera.camera2.pipe.compat.Camera2CaptureSessionsModule();

    private Camera2CaptureSessionsModule() {
    }

    @dagger.Provides
    @androidx.camera.camera2.pipe.config.Camera2ControllerScope
    public final androidx.camera.camera2.pipe.compat.CaptureSessionFactory provideSessionFactory(javax.inject.Provider<androidx.camera.camera2.pipe.compat.AndroidMSessionFactory> androidMProvider, javax.inject.Provider<androidx.camera.camera2.pipe.compat.AndroidMHighSpeedSessionFactory> androidMHighSpeedProvider, javax.inject.Provider<androidx.camera.camera2.pipe.compat.AndroidNSessionFactory> androidNProvider, javax.inject.Provider<androidx.camera.camera2.pipe.compat.AndroidPSessionFactory> androidPProvider, javax.inject.Provider<androidx.camera.camera2.pipe.compat.AndroidExtensionSessionFactory> androidExtensionProvider, androidx.camera.camera2.pipe.CameraGraph.Config graphConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidMProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidMHighSpeedProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidNProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidPProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidExtensionProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphConfig, "");
        if (androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m376equalsimpl0(graphConfig.m357getSessionMode2uNL3no(), androidx.camera.camera2.pipe.CameraGraph.OperatingMode.INSTANCE.m381getEXTENSION2uNL3no())) {
            if (android.os.Build.VERSION.SDK_INT < 31) {
                throw new java.lang.IllegalStateException("Cannot use Extension sessions below Android S".toString());
            }
            androidx.camera.camera2.pipe.compat.AndroidExtensionSessionFactory androidExtensionSessionFactory = androidExtensionProvider.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(androidExtensionSessionFactory, "");
            return androidExtensionSessionFactory;
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.camera.camera2.pipe.compat.AndroidPSessionFactory androidPSessionFactory = androidPProvider.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(androidPSessionFactory, "");
            return androidPSessionFactory;
        }
        if (androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m376equalsimpl0(graphConfig.m357getSessionMode2uNL3no(), androidx.camera.camera2.pipe.CameraGraph.OperatingMode.INSTANCE.m382getHIGH_SPEED2uNL3no())) {
            androidx.camera.camera2.pipe.compat.AndroidMHighSpeedSessionFactory androidMHighSpeedSessionFactory = androidMHighSpeedProvider.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(androidMHighSpeedSessionFactory, "");
            return androidMHighSpeedSessionFactory;
        }
        androidx.camera.camera2.pipe.compat.AndroidNSessionFactory androidNSessionFactory = androidNProvider.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(androidNSessionFactory, "");
        return androidNSessionFactory;
    }
}
