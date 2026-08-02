package androidx.media3.common;

/* loaded from: classes7.dex */
public final class VideoFrameProcessingException extends java.lang.Exception {
    public final long presentationTimeUs;

    public static androidx.media3.common.VideoFrameProcessingException from(java.lang.Exception exc) {
        return from(exc, androidx.media3.common.C.TIME_UNSET);
    }

    public static androidx.media3.common.VideoFrameProcessingException from(java.lang.Exception exc, long j) {
        if (exc instanceof androidx.media3.common.VideoFrameProcessingException) {
            return (androidx.media3.common.VideoFrameProcessingException) exc;
        }
        return new androidx.media3.common.VideoFrameProcessingException(exc, j);
    }

    public VideoFrameProcessingException(java.lang.String str) {
        this(str, androidx.media3.common.C.TIME_UNSET);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoFrameProcessingException(java.lang.String str, long j) {
        super(r0.toString());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(j == androidx.media3.common.C.TIME_UNSET ? " @UNSET" : " @".concat(java.lang.String.valueOf(j)));
        this.presentationTimeUs = j;
    }

    public VideoFrameProcessingException(java.lang.String str, java.lang.Throwable th) {
        this(str, th, androidx.media3.common.C.TIME_UNSET);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoFrameProcessingException(java.lang.String str, java.lang.Throwable th, long j) {
        super(r0.toString(), th);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(j == androidx.media3.common.C.TIME_UNSET ? " @UNSET" : " @".concat(java.lang.String.valueOf(j)));
        this.presentationTimeUs = j;
    }

    public VideoFrameProcessingException(java.lang.Throwable th) {
        this(th, androidx.media3.common.C.TIME_UNSET);
    }

    public VideoFrameProcessingException(java.lang.Throwable th, long j) {
        super(j == androidx.media3.common.C.TIME_UNSET ? " @UNSET" : " @".concat(java.lang.String.valueOf(j)), th);
        this.presentationTimeUs = j;
    }
}
