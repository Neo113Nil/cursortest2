package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public interface UseCaseConfigFactory {
    public static final androidx.camera.core.impl.UseCaseConfigFactory EMPTY_INSTANCE = new androidx.camera.core.impl.UseCaseConfigFactory() { // from class: androidx.camera.core.impl.UseCaseConfigFactory.1
        @Override // androidx.camera.core.impl.UseCaseConfigFactory
        public androidx.camera.core.impl.Config getConfig(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType, int i) {
            return null;
        }
    };

    public enum CaptureType {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    public interface Provider {
        androidx.camera.core.impl.UseCaseConfigFactory newInstance(android.content.Context context) throws androidx.camera.core.InitializationException;
    }

    androidx.camera.core.impl.Config getConfig(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType, int i);
}
