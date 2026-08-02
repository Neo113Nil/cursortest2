package androidx.camera.core;

/* loaded from: classes6.dex */
public interface SurfaceOutput extends java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    default int getFormat() {
        return 34;
    }

    android.util.Size getSize();

    android.view.Surface getSurface(java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.camera.core.SurfaceOutput.Event> consumer);

    int getTargets();

    void updateTransformMatrix(float[] fArr, float[] fArr2);

    default void updateTransformMatrix(float[] fArr, float[] fArr2, boolean z) {
    }

    default android.graphics.Matrix getSensorToBufferTransform() {
        return new android.graphics.Matrix();
    }

    public static abstract class Event {
        public static final int EVENT_REQUEST_CLOSE = 0;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface EventCode {
        }

        public abstract int getEventCode();

        public abstract androidx.camera.core.SurfaceOutput getSurfaceOutput();

        Event() {
        }

        public static androidx.camera.core.SurfaceOutput.Event of(int i, androidx.camera.core.SurfaceOutput surfaceOutput) {
            return new androidx.camera.core.AutoValue_SurfaceOutput_Event(i, surfaceOutput);
        }
    }

    public static abstract class CameraInputInfo {
        public abstract androidx.camera.core.impl.CameraInternal getCameraInternal();

        public abstract android.graphics.Rect getInputCropRect();

        public abstract android.util.Size getInputSize();

        public abstract boolean getMirroring();

        public abstract int getRotationDegrees();

        public static androidx.camera.core.SurfaceOutput.CameraInputInfo of(android.util.Size size, android.graphics.Rect rect, androidx.camera.core.impl.CameraInternal cameraInternal, int i, boolean z) {
            return new androidx.camera.core.AutoValue_SurfaceOutput_CameraInputInfo(size, rect, cameraInternal, i, z);
        }
    }
}
