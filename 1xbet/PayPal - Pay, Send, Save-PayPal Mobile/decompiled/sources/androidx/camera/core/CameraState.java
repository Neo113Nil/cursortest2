package androidx.camera.core;

/* loaded from: classes6.dex */
public abstract class CameraState {
    public static final int ERROR_CAMERA_DISABLED = 5;
    public static final int ERROR_CAMERA_FATAL_ERROR = 6;
    public static final int ERROR_CAMERA_IN_USE = 2;
    public static final int ERROR_CAMERA_REMOVED = 8;
    public static final int ERROR_DO_NOT_DISTURB_MODE_ENABLED = 7;
    public static final int ERROR_MAX_CAMERAS_IN_USE = 1;
    public static final int ERROR_OTHER_RECOVERABLE_ERROR = 3;
    public static final int ERROR_STREAM_CONFIG = 4;

    public enum ErrorType {
        RECOVERABLE,
        CRITICAL
    }

    public enum Type {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public abstract androidx.camera.core.CameraState.StateError getError();

    public abstract androidx.camera.core.CameraState.Type getType();

    public static androidx.camera.core.CameraState create(androidx.camera.core.CameraState.Type type) {
        return create(type, null);
    }

    public static androidx.camera.core.CameraState create(androidx.camera.core.CameraState.Type type, androidx.camera.core.CameraState.StateError stateError) {
        return new androidx.camera.core.AutoValue_CameraState(type, stateError);
    }

    public static abstract class StateError {
        public abstract java.lang.Throwable getCause();

        public abstract int getCode();

        public static androidx.camera.core.CameraState.StateError create(int i) {
            return create(i, null);
        }

        public static androidx.camera.core.CameraState.StateError create(int i, java.lang.Throwable th) {
            return new androidx.camera.core.AutoValue_CameraState_StateError(i, th);
        }

        public androidx.camera.core.CameraState.ErrorType getType() {
            int code = getCode();
            if (code == 2 || code == 1 || code == 3) {
                return androidx.camera.core.CameraState.ErrorType.RECOVERABLE;
            }
            return androidx.camera.core.CameraState.ErrorType.CRITICAL;
        }
    }
}
