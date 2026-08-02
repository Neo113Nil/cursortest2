package androidx.camera.video.internal.encoder;

/* loaded from: classes6.dex */
public class EncodeException extends java.lang.Exception {
    public static final int ERROR_CODEC = 1;
    public static final int ERROR_UNKNOWN = 0;
    private final int getHighSpeedVideoFpsRangesFor;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ErrorType {
    }

    public EncodeException(int i, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public int getErrorType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
