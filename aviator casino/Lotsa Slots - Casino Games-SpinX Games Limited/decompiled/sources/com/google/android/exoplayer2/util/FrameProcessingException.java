package com.google.android.exoplayer2.util;

/* loaded from: classes3.dex */
public final class FrameProcessingException extends java.lang.Exception {
    public final long presentationTimeUs;

    public static com.google.android.exoplayer2.util.FrameProcessingException from(java.lang.Exception exc) {
        return from(exc, -9223372036854775807L);
    }

    public static com.google.android.exoplayer2.util.FrameProcessingException from(java.lang.Exception exc, long j) {
        if (exc instanceof com.google.android.exoplayer2.util.FrameProcessingException) {
            return (com.google.android.exoplayer2.util.FrameProcessingException) exc;
        }
        return new com.google.android.exoplayer2.util.FrameProcessingException(exc, j);
    }

    public FrameProcessingException(java.lang.String str) {
        this(str, -9223372036854775807L);
    }

    public FrameProcessingException(java.lang.String str, long j) {
        super(str);
        this.presentationTimeUs = j;
    }

    public FrameProcessingException(java.lang.String str, java.lang.Throwable th) {
        this(str, th, -9223372036854775807L);
    }

    public FrameProcessingException(java.lang.String str, java.lang.Throwable th, long j) {
        super(str, th);
        this.presentationTimeUs = j;
    }

    public FrameProcessingException(java.lang.Throwable th) {
        this(th, -9223372036854775807L);
    }

    public FrameProcessingException(java.lang.Throwable th, long j) {
        super(th);
        this.presentationTimeUs = j;
    }
}
