package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface CameraConfigProvider {
    public static final androidx.camera.core.impl.CameraConfigProvider EMPTY = new androidx.camera.core.impl.CameraConfigProvider() { // from class: androidx.camera.core.impl.CameraConfigProvider$$ExternalSyntheticLambda0
        @Override // androidx.camera.core.impl.CameraConfigProvider
        public final androidx.camera.core.impl.CameraConfig getConfig(androidx.camera.core.CameraInfo cameraInfo, android.content.Context context) {
            return androidx.camera.core.impl.CameraConfigProvider.lambda$static$0(cameraInfo, context);
        }
    };

    static /* synthetic */ androidx.camera.core.impl.CameraConfig lambda$static$0(androidx.camera.core.CameraInfo cameraInfo, android.content.Context context) {
        return null;
    }

    androidx.camera.core.impl.CameraConfig getConfig(androidx.camera.core.CameraInfo cameraInfo, android.content.Context context);
}
