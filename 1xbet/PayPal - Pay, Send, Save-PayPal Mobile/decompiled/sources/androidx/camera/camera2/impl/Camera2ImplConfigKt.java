package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0012\u0004\u0012\u00020\u00020\u0006*\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/hardware/camera2/CaptureRequest$Key;", "Landroidx/camera/core/impl/Config$Option;", "", "createCaptureRequestOption", "(Landroid/hardware/camera2/CaptureRequest$Key;)Landroidx/camera/core/impl/Config$Option;", "Landroidx/camera/core/impl/Config;", "", "toParameters", "(Landroidx/camera/core/impl/Config;)Ljava/util/Map;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2ImplConfigKt {
    public static final androidx.camera.core.impl.Config.Option<java.lang.Object> createCaptureRequestOption(android.hardware.camera2.CaptureRequest.Key<?> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(androidx.camera.camera2.impl.Camera2ImplConfig.CAPTURE_REQUEST_ID_STEM);
        sb.append(key.getName());
        androidx.camera.core.impl.Config.Option<java.lang.Object> create = androidx.camera.core.impl.Config.Option.create(sb.toString(), java.lang.Object.class, key);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        return create;
    }

    public static final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> toParameters(androidx.camera.core.impl.Config config) {
        java.lang.Object retrieveOption;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (androidx.camera.core.impl.Config.Option<?> option : config.listOptions()) {
            java.lang.Object token = option.getToken();
            android.hardware.camera2.CaptureRequest.Key key = token instanceof android.hardware.camera2.CaptureRequest.Key ? (android.hardware.camera2.CaptureRequest.Key) token : null;
            if (key != null && (retrieveOption = config.retrieveOption(option)) != null) {
                linkedHashMap.put(key, retrieveOption);
            }
        }
        return linkedHashMap;
    }
}
