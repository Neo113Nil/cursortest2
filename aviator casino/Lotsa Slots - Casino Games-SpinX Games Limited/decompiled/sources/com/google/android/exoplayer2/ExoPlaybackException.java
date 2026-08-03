package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public final class ExoPlaybackException extends com.google.android.exoplayer2.PlaybackException {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.ExoPlaybackException> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.ExoPlaybackException$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            return com.google.android.exoplayer2.ExoPlaybackException.m5365$r8$lambda$1XKy3W7SelM_FKalWARGECf72M(bundle);
        }
    };
    private static final int FIELD_IS_RECOVERABLE = 1006;
    private static final int FIELD_RENDERER_FORMAT = 1004;
    private static final int FIELD_RENDERER_FORMAT_SUPPORT = 1005;
    private static final int FIELD_RENDERER_INDEX = 1003;
    private static final int FIELD_RENDERER_NAME = 1002;
    private static final int FIELD_TYPE = 1001;
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    final boolean isRecoverable;
    public final com.google.android.exoplayer2.source.MediaPeriodId mediaPeriodId;
    public final com.google.android.exoplayer2.Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final java.lang.String rendererName;
    public final int type;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Type {
    }

    /* renamed from: $r8$lambda$1XKy3W7SelM_FKalWARGEC-f72M, reason: not valid java name */
    public static /* synthetic */ com.google.android.exoplayer2.ExoPlaybackException m5365$r8$lambda$1XKy3W7SelM_FKalWARGECf72M(android.os.Bundle bundle) {
        return new com.google.android.exoplayer2.ExoPlaybackException(bundle);
    }

    public static com.google.android.exoplayer2.ExoPlaybackException createForSource(java.io.IOException iOException, int i) {
        return new com.google.android.exoplayer2.ExoPlaybackException(0, iOException, i);
    }

    public static com.google.android.exoplayer2.ExoPlaybackException createForRenderer(java.lang.Throwable th, java.lang.String str, int i, com.google.android.exoplayer2.Format format, int i2, boolean z, int i3) {
        return new com.google.android.exoplayer2.ExoPlaybackException(1, th, null, i3, str, i, format, format == null ? 4 : i2, z);
    }

    @java.lang.Deprecated
    public static com.google.android.exoplayer2.ExoPlaybackException createForUnexpected(java.lang.RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    public static com.google.android.exoplayer2.ExoPlaybackException createForUnexpected(java.lang.RuntimeException runtimeException, int i) {
        return new com.google.android.exoplayer2.ExoPlaybackException(2, runtimeException, i);
    }

    public static com.google.android.exoplayer2.ExoPlaybackException createForRemote(java.lang.String str) {
        return new com.google.android.exoplayer2.ExoPlaybackException(3, null, str, 1001, null, -1, null, 4, false);
    }

    private ExoPlaybackException(int i, java.lang.Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    private ExoPlaybackException(int i, java.lang.Throwable th, java.lang.String str, int i2, java.lang.String str2, int i3, com.google.android.exoplayer2.Format format, int i4, boolean z) {
        this(deriveMessage(i, str, str2, i3, format, i4), th, i2, i, str2, i3, format, i4, null, android.os.SystemClock.elapsedRealtime(), z);
    }

    private ExoPlaybackException(android.os.Bundle bundle) {
        super(bundle);
        this.type = bundle.getInt(keyForField(1001), 2);
        this.rendererName = bundle.getString(keyForField(1002));
        this.rendererIndex = bundle.getInt(keyForField(1003), -1);
        android.os.Bundle bundle2 = bundle.getBundle(keyForField(1004));
        this.rendererFormat = bundle2 == null ? null : com.google.android.exoplayer2.Format.CREATOR.fromBundle(bundle2);
        this.rendererFormatSupport = bundle.getInt(keyForField(1005), 4);
        this.isRecoverable = bundle.getBoolean(keyForField(1006), false);
        this.mediaPeriodId = null;
    }

    private ExoPlaybackException(java.lang.String str, java.lang.Throwable th, int i, int i2, java.lang.String str2, int i3, com.google.android.exoplayer2.Format format, int i4, com.google.android.exoplayer2.source.MediaPeriodId mediaPeriodId, long j, boolean z) {
        super(str, th, i, j);
        com.google.android.exoplayer2.util.Assertions.checkArgument(!z || i2 == 1);
        com.google.android.exoplayer2.util.Assertions.checkArgument(th != null || i2 == 3);
        this.type = i2;
        this.rendererName = str2;
        this.rendererIndex = i3;
        this.rendererFormat = format;
        this.rendererFormatSupport = i4;
        this.mediaPeriodId = mediaPeriodId;
        this.isRecoverable = z;
    }

    public java.io.IOException getSourceException() {
        com.google.android.exoplayer2.util.Assertions.checkState(this.type == 0);
        return (java.io.IOException) com.google.android.exoplayer2.util.Assertions.checkNotNull(getCause());
    }

    public java.lang.Exception getRendererException() {
        com.google.android.exoplayer2.util.Assertions.checkState(this.type == 1);
        return (java.lang.Exception) com.google.android.exoplayer2.util.Assertions.checkNotNull(getCause());
    }

    public java.lang.RuntimeException getUnexpectedException() {
        com.google.android.exoplayer2.util.Assertions.checkState(this.type == 2);
        return (java.lang.RuntimeException) com.google.android.exoplayer2.util.Assertions.checkNotNull(getCause());
    }

    @Override // com.google.android.exoplayer2.PlaybackException
    public boolean errorInfoEquals(com.google.android.exoplayer2.PlaybackException playbackException) {
        if (!super.errorInfoEquals(playbackException)) {
            return false;
        }
        com.google.android.exoplayer2.ExoPlaybackException exoPlaybackException = (com.google.android.exoplayer2.ExoPlaybackException) com.google.android.exoplayer2.util.Util.castNonNull(playbackException);
        return this.type == exoPlaybackException.type && com.google.android.exoplayer2.util.Util.areEqual(this.rendererName, exoPlaybackException.rendererName) && this.rendererIndex == exoPlaybackException.rendererIndex && com.google.android.exoplayer2.util.Util.areEqual(this.rendererFormat, exoPlaybackException.rendererFormat) && this.rendererFormatSupport == exoPlaybackException.rendererFormatSupport && com.google.android.exoplayer2.util.Util.areEqual(this.mediaPeriodId, exoPlaybackException.mediaPeriodId) && this.isRecoverable == exoPlaybackException.isRecoverable;
    }

    com.google.android.exoplayer2.ExoPlaybackException copyWithMediaPeriodId(com.google.android.exoplayer2.source.MediaPeriodId mediaPeriodId) {
        return new com.google.android.exoplayer2.ExoPlaybackException((java.lang.String) com.google.android.exoplayer2.util.Util.castNonNull(getMessage()), getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, mediaPeriodId, this.timestampMs, this.isRecoverable);
    }

    private static java.lang.String deriveMessage(int i, java.lang.String str, java.lang.String str2, int i2, com.google.android.exoplayer2.Format format, int i3) {
        java.lang.String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i == 1) {
            str3 = str2 + " error, index=" + i2 + ", format=" + format + ", format_supported=" + com.google.android.exoplayer2.util.Util.getFormatSupportString(i3);
        } else if (i == 3) {
            str3 = "Remote error";
        } else {
            str3 = "Unexpected runtime error";
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    @Override // com.google.android.exoplayer2.PlaybackException, com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = super.toBundle();
        bundle.putInt(keyForField(1001), this.type);
        bundle.putString(keyForField(1002), this.rendererName);
        bundle.putInt(keyForField(1003), this.rendererIndex);
        if (this.rendererFormat != null) {
            bundle.putBundle(keyForField(1004), this.rendererFormat.toBundle());
        }
        bundle.putInt(keyForField(1005), this.rendererFormatSupport);
        bundle.putBoolean(keyForField(1006), this.isRecoverable);
        return bundle;
    }
}
