package androidx.media3.common;

/* loaded from: classes2.dex */
public final class VideoFrameProcessingException extends java.lang.Exception {
    public final long presentationTimeUs;

    public static androidx.media3.common.VideoFrameProcessingException from(java.lang.Exception exc) {
        return from(exc, -9223372036854775807L);
    }

    public static androidx.media3.common.VideoFrameProcessingException from(java.lang.Exception exc, long j) {
        if (exc instanceof androidx.media3.common.VideoFrameProcessingException) {
            return (androidx.media3.common.VideoFrameProcessingException) exc;
        }
        return new androidx.media3.common.VideoFrameProcessingException(exc, j);
    }

    public VideoFrameProcessingException(java.lang.String str) {
        this(str, -9223372036854775807L);
    }

    public VideoFrameProcessingException(java.lang.String str, long j) {
        super(str);
        this.presentationTimeUs = j;
    }

    public VideoFrameProcessingException(java.lang.String str, java.lang.Throwable th) {
        this(str, th, -9223372036854775807L);
    }

    public VideoFrameProcessingException(java.lang.String str, java.lang.Throwable th, long j) {
        super(str, th);
        this.presentationTimeUs = j;
    }

    public VideoFrameProcessingException(java.lang.Throwable th) {
        this(th, -9223372036854775807L);
    }

    public VideoFrameProcessingException(java.lang.Throwable th, long j) {
        super(th);
        this.presentationTimeUs = j;
    }
}
