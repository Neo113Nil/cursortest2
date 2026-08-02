package androidx.camera.camera2.interop;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\f\u001a\u00020\u000b*\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\f\u0010\r\"\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/camera/core/CameraXConfig;", "Landroidx/camera/camera2/interop/Camera2CaptureRequestConfigurator;", "getCamera2CaptureRequestConfigurator", "(Landroidx/camera/core/CameraXConfig;)Landroidx/camera/camera2/interop/Camera2CaptureRequestConfigurator;", "Landroidx/camera/core/CameraXConfig$Builder;", "captureRequestConfigurator", "setCamera2CaptureRequestConfigurator", "(Landroidx/camera/core/CameraXConfig$Builder;Landroidx/camera/camera2/interop/Camera2CaptureRequestConfigurator;)Landroidx/camera/core/CameraXConfig$Builder;", "", "", "parameters", "", "configureWithUnchecked", "(Landroidx/camera/camera2/interop/Camera2CaptureRequestConfigurator;Ljava/util/Map;)V", "Landroidx/camera/core/impl/Config$Option;", "OPTION_CAPTURE_REQUEST_CONFIGURATOR", "Landroidx/camera/core/impl/Config$Option;", "getOPTION_CAPTURE_REQUEST_CONFIGURATOR", "()Landroidx/camera/core/impl/Config$Option;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2CaptureRequestConfiguratorKt {
    private static final androidx.camera.core.impl.Config.Option<androidx.camera.camera2.interop.Camera2CaptureRequestConfigurator> OPTION_CAPTURE_REQUEST_CONFIGURATOR;

    public static final androidx.camera.core.impl.Config.Option<androidx.camera.camera2.interop.Camera2CaptureRequestConfigurator> getOPTION_CAPTURE_REQUEST_CONFIGURATOR() {
        return OPTION_CAPTURE_REQUEST_CONFIGURATOR;
    }

    static {
        androidx.camera.core.impl.Config.Option<androidx.camera.camera2.interop.Camera2CaptureRequestConfigurator> create = androidx.camera.core.impl.Config.Option.create("camerax.core.appConfig.captureRequestConfigurator", androidx.camera.camera2.interop.Camera2CaptureRequestConfigurator.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        OPTION_CAPTURE_REQUEST_CONFIGURATOR = create;
    }

    public static final androidx.camera.camera2.interop.Camera2CaptureRequestConfigurator getCamera2CaptureRequestConfigurator(androidx.camera.core.CameraXConfig cameraXConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraXConfig, "");
        return (androidx.camera.camera2.interop.Camera2CaptureRequestConfigurator) cameraXConfig.getGetHighSpeedVideoFpsRanges().retrieveOption(OPTION_CAPTURE_REQUEST_CONFIGURATOR, null);
    }

    public static final androidx.camera.core.CameraXConfig.Builder setCamera2CaptureRequestConfigurator(androidx.camera.core.CameraXConfig.Builder builder, androidx.camera.camera2.interop.Camera2CaptureRequestConfigurator camera2CaptureRequestConfigurator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera2CaptureRequestConfigurator, "");
        builder.getMutableConfig().insertOption(OPTION_CAPTURE_REQUEST_CONFIGURATOR, camera2CaptureRequestConfigurator);
        return builder;
    }

    public static final void configureWithUnchecked(androidx.camera.camera2.interop.Camera2CaptureRequestConfigurator camera2CaptureRequestConfigurator, java.util.Map<java.lang.Object, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera2CaptureRequestConfigurator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.Object, ? extends java.lang.Object> entry : map.entrySet()) {
            if (entry.getKey() instanceof android.hardware.camera2.CaptureRequest.Key) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        camera2CaptureRequestConfigurator.configureWith(linkedHashMap);
    }
}
