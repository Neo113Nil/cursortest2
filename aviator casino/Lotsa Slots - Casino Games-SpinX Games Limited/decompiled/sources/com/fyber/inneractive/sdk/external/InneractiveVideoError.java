package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public class InneractiveVideoError extends com.fyber.inneractive.sdk.external.InneractiveError {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.external.InneractiveVideoError.Error f3656a;
    public final java.lang.Throwable b;

    public enum Error {
        ERROR_NO_MEDIA_FILES("ErrorNoMediaFiles", true),
        ERROR_FAILED_PLAYING_MEDIA_FILE("ErrorPlayingMediaFile", false),
        ERROR_FAILED_PLAYING_ALL_MEDIA_FILES("ErrorPlayingAllMediaFile", true),
        ERROR_PRE_BUFFER_TIMEOUT("ErrorPreBufferTimeout", false),
        ERROR_BUFFER_TIMEOUT("ErrorBufferTimeout", false);

        private java.lang.String errorString;
        private boolean isFatal;

        Error(java.lang.String str, boolean z) {
            this.errorString = str;
            this.isFatal = z;
        }

        public java.lang.String getErrorString() {
            return this.errorString;
        }

        public boolean isFatal() {
            return this.isFatal;
        }
    }

    public InneractiveVideoError(com.fyber.inneractive.sdk.external.InneractiveVideoError.Error error) {
        this.f3656a = error;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public java.lang.String description() {
        if (this.b == null) {
            return this.f3656a.getErrorString();
        }
        return this.f3656a.getErrorString() + ": " + this.b;
    }

    public java.lang.Throwable getCause() {
        return this.b;
    }

    public com.fyber.inneractive.sdk.external.InneractiveVideoError.Error getPlayerError() {
        return this.f3656a;
    }

    public InneractiveVideoError(com.fyber.inneractive.sdk.external.InneractiveVideoError.Error error, java.lang.Throwable th) {
        this(error);
        this.b = th;
    }
}
