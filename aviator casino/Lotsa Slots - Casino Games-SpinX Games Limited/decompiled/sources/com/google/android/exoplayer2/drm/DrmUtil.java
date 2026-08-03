package com.google.android.exoplayer2.drm;

/* loaded from: classes3.dex */
public final class DrmUtil {
    public static final int ERROR_SOURCE_EXO_MEDIA_DRM = 1;
    public static final int ERROR_SOURCE_LICENSE_ACQUISITION = 2;
    public static final int ERROR_SOURCE_PROVISIONING = 3;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ErrorSource {
    }

    public static int getErrorCodeForMediaDrmException(java.lang.Exception exc, int i) {
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 21 && com.google.android.exoplayer2.drm.DrmUtil.Api21.isMediaDrmStateException(exc)) {
            return com.google.android.exoplayer2.drm.DrmUtil.Api21.mediaDrmStateExceptionToErrorCode(exc);
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 23 && com.google.android.exoplayer2.drm.DrmUtil.Api23.isMediaDrmResetException(exc)) {
            return 6006;
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 18 && com.google.android.exoplayer2.drm.DrmUtil.Api18.isNotProvisionedException(exc)) {
            return 6002;
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 18 && com.google.android.exoplayer2.drm.DrmUtil.Api18.isDeniedByServerException(exc)) {
            return 6007;
        }
        if (exc instanceof com.google.android.exoplayer2.drm.UnsupportedDrmException) {
            return 6001;
        }
        if (exc instanceof com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MissingSchemeDataException) {
            return 6003;
        }
        if (exc instanceof com.google.android.exoplayer2.drm.KeysExpiredException) {
            return 6008;
        }
        if (i == 1) {
            return 6006;
        }
        if (i == 2) {
            return 6004;
        }
        if (i == 3) {
            return 6002;
        }
        throw new java.lang.IllegalArgumentException();
    }

    private static final class Api18 {
        private Api18() {
        }

        public static boolean isNotProvisionedException(java.lang.Throwable th) {
            return th instanceof android.media.NotProvisionedException;
        }

        public static boolean isDeniedByServerException(java.lang.Throwable th) {
            return th instanceof android.media.DeniedByServerException;
        }
    }

    private static final class Api21 {
        private Api21() {
        }

        public static boolean isMediaDrmStateException(java.lang.Throwable th) {
            return th instanceof android.media.MediaDrm.MediaDrmStateException;
        }

        public static int mediaDrmStateExceptionToErrorCode(java.lang.Throwable th) {
            return com.google.android.exoplayer2.util.Util.getErrorCodeForMediaDrmErrorCode(com.google.android.exoplayer2.util.Util.getErrorCodeFromPlatformDiagnosticsInfo(((android.media.MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    private static final class Api23 {
        private Api23() {
        }

        public static boolean isMediaDrmResetException(java.lang.Throwable th) {
            return th instanceof android.media.MediaDrmResetException;
        }
    }

    private DrmUtil() {
    }
}
