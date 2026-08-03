package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
public class PlaybackException extends java.lang.Exception implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.PlaybackException> CREATOR = new com.google.android.exoplayer2.Bundleable.Creator() { // from class: com.google.android.exoplayer2.PlaybackException$$ExternalSyntheticLambda0
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final com.google.android.exoplayer2.Bundleable fromBundle(android.os.Bundle bundle) {
            return new com.google.android.exoplayer2.PlaybackException(bundle);
        }
    };
    public static final int CUSTOM_ERROR_CODE_BASE = 1000000;
    public static final int ERROR_CODE_AUDIO_TRACK_INIT_FAILED = 5001;
    public static final int ERROR_CODE_AUDIO_TRACK_WRITE_FAILED = 5002;
    public static final int ERROR_CODE_BEHIND_LIVE_WINDOW = 1002;
    public static final int ERROR_CODE_DECODER_INIT_FAILED = 4001;
    public static final int ERROR_CODE_DECODER_QUERY_FAILED = 4002;
    public static final int ERROR_CODE_DECODING_FAILED = 4003;
    public static final int ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES = 4004;
    public static final int ERROR_CODE_DECODING_FORMAT_UNSUPPORTED = 4005;
    public static final int ERROR_CODE_DRM_CONTENT_ERROR = 6003;
    public static final int ERROR_CODE_DRM_DEVICE_REVOKED = 6007;
    public static final int ERROR_CODE_DRM_DISALLOWED_OPERATION = 6005;
    public static final int ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED = 6004;
    public static final int ERROR_CODE_DRM_LICENSE_EXPIRED = 6008;
    public static final int ERROR_CODE_DRM_PROVISIONING_FAILED = 6002;
    public static final int ERROR_CODE_DRM_SCHEME_UNSUPPORTED = 6001;
    public static final int ERROR_CODE_DRM_SYSTEM_ERROR = 6006;
    public static final int ERROR_CODE_DRM_UNSPECIFIED = 6000;
    public static final int ERROR_CODE_FAILED_RUNTIME_CHECK = 1004;
    public static final int ERROR_CODE_IO_BAD_HTTP_STATUS = 2004;
    public static final int ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED = 2007;
    public static final int ERROR_CODE_IO_FILE_NOT_FOUND = 2005;
    public static final int ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE = 2003;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_FAILED = 2001;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT = 2002;
    public static final int ERROR_CODE_IO_NO_PERMISSION = 2006;
    public static final int ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE = 2008;
    public static final int ERROR_CODE_IO_UNSPECIFIED = 2000;
    public static final int ERROR_CODE_PARSING_CONTAINER_MALFORMED = 3001;
    public static final int ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED = 3003;
    public static final int ERROR_CODE_PARSING_MANIFEST_MALFORMED = 3002;
    public static final int ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED = 3004;
    public static final int ERROR_CODE_REMOTE_ERROR = 1001;
    public static final int ERROR_CODE_TIMEOUT = 1003;
    public static final int ERROR_CODE_UNSPECIFIED = 1000;
    protected static final int FIELD_CUSTOM_ID_BASE = 1000;
    private static final int FIELD_INT_ERROR_CODE = 0;
    private static final int FIELD_LONG_TIMESTAMP_MS = 1;
    private static final int FIELD_STRING_CAUSE_CLASS_NAME = 3;
    private static final int FIELD_STRING_CAUSE_MESSAGE = 4;
    private static final int FIELD_STRING_MESSAGE = 2;
    public final int errorCode;
    public final long timestampMs;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    public static java.lang.String getErrorCodeName(int i) {
        if (i == 5001) {
            return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        }
        if (i != 5002) {
            switch (i) {
                case 1000:
                    return "ERROR_CODE_UNSPECIFIED";
                case 1001:
                    return "ERROR_CODE_REMOTE_ERROR";
                case 1002:
                    return "ERROR_CODE_BEHIND_LIVE_WINDOW";
                case 1003:
                    return "ERROR_CODE_TIMEOUT";
                case 1004:
                    return "ERROR_CODE_FAILED_RUNTIME_CHECK";
                default:
                    switch (i) {
                        case 2000:
                            return "ERROR_CODE_IO_UNSPECIFIED";
                        case 2001:
                            return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                        case 2002:
                            return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                        case 2003:
                            return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                        case 2004:
                            return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                        case 2005:
                            return "ERROR_CODE_IO_FILE_NOT_FOUND";
                        case 2006:
                            return "ERROR_CODE_IO_NO_PERMISSION";
                        case 2007:
                            return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                        case 2008:
                            return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                        default:
                            switch (i) {
                                case 3001:
                                    return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                case 3002:
                                    return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                case 3003:
                                    return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                case 3004:
                                    return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                default:
                                    switch (i) {
                                        case 4001:
                                            return "ERROR_CODE_DECODER_INIT_FAILED";
                                        case 4002:
                                            return "ERROR_CODE_DECODER_QUERY_FAILED";
                                        case 4003:
                                            return "ERROR_CODE_DECODING_FAILED";
                                        case 4004:
                                            return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                        case 4005:
                                            return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                        default:
                                            switch (i) {
                                                case 6000:
                                                    return "ERROR_CODE_DRM_UNSPECIFIED";
                                                case 6001:
                                                    return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                case 6002:
                                                    return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                case 6003:
                                                    return "ERROR_CODE_DRM_CONTENT_ERROR";
                                                case 6004:
                                                    return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                case 6005:
                                                    return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                case 6006:
                                                    return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                case 6007:
                                                    return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                case 6008:
                                                    return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                default:
                                                    if (i >= 1000000) {
                                                        return "custom error code";
                                                    }
                                                    return "invalid error code";
                                            }
                                    }
                            }
                    }
            }
        }
        return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
    }

    public final java.lang.String getErrorCodeName() {
        return getErrorCodeName(this.errorCode);
    }

    public PlaybackException(java.lang.String str, java.lang.Throwable th, int i) {
        this(str, th, i, com.google.android.exoplayer2.util.Clock.DEFAULT.elapsedRealtime());
    }

    protected PlaybackException(android.os.Bundle bundle) {
        this(bundle.getString(keyForField(2)), getCauseFromBundle(bundle), bundle.getInt(keyForField(0), 1000), bundle.getLong(keyForField(1), android.os.SystemClock.elapsedRealtime()));
    }

    protected PlaybackException(java.lang.String str, java.lang.Throwable th, int i, long j) {
        super(str, th);
        this.errorCode = i;
        this.timestampMs = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
    
        if (r3 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean errorInfoEquals(com.google.android.exoplayer2.PlaybackException playbackException) {
        if (this == playbackException) {
            return true;
        }
        if (playbackException != null && getClass() == playbackException.getClass()) {
            java.lang.Throwable cause = getCause();
            java.lang.Throwable cause2 = playbackException.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null) {
                }
            } else if (!com.google.android.exoplayer2.util.Util.areEqual(cause.getMessage(), cause2.getMessage()) || !com.google.android.exoplayer2.util.Util.areEqual(cause.getClass(), cause2.getClass())) {
                return false;
            }
            return this.errorCode == playbackException.errorCode && com.google.android.exoplayer2.util.Util.areEqual(getMessage(), playbackException.getMessage()) && this.timestampMs == playbackException.timestampMs;
        }
        return false;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(keyForField(0), this.errorCode);
        bundle.putLong(keyForField(1), this.timestampMs);
        bundle.putString(keyForField(2), getMessage());
        java.lang.Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(keyForField(3), cause.getClass().getName());
            bundle.putString(keyForField(4), cause.getMessage());
        }
        return bundle;
    }

    protected static java.lang.String keyForField(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    private static java.lang.Throwable createThrowable(java.lang.Class<?> cls, java.lang.String str) throws java.lang.Exception {
        return (java.lang.Throwable) cls.getConstructor(java.lang.String.class).newInstance(str);
    }

    private static android.os.RemoteException createRemoteException(java.lang.String str) {
        return new android.os.RemoteException(str);
    }

    private static java.lang.Throwable getCauseFromBundle(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString(keyForField(3));
        java.lang.String string2 = bundle.getString(keyForField(4));
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(string, true, com.google.android.exoplayer2.PlaybackException.class.getClassLoader());
            java.lang.Throwable createThrowable = java.lang.Throwable.class.isAssignableFrom(cls) ? createThrowable(cls, string2) : null;
            if (createThrowable != null) {
                return createThrowable;
            }
        } catch (java.lang.Throwable unused) {
        }
        return createRemoteException(string2);
    }
}
