package androidx.camera.core;

/* loaded from: classes6.dex */
public class CameraUnavailableException extends java.lang.Exception {
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_IN_USE = 4;
    public static final int CAMERA_MAX_IN_USE = 5;
    public static final int CAMERA_UNAVAILABLE_DO_NOT_DISTURB = 6;
    public static final int CAMERA_UNKNOWN_ERROR = 0;
    private final int Camera2StreamConfigurationMap;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Reason {
    }

    public CameraUnavailableException(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public CameraUnavailableException(int i, java.lang.String str) {
        super(str);
        this.Camera2StreamConfigurationMap = i;
    }

    public CameraUnavailableException(int i, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.Camera2StreamConfigurationMap = i;
    }

    public CameraUnavailableException(int i, java.lang.Throwable th) {
        super(th);
        this.Camera2StreamConfigurationMap = i;
    }

    public int getReason() {
        return this.Camera2StreamConfigurationMap;
    }
}
