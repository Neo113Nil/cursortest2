package androidx.media3.exoplayer.drm;

/* loaded from: classes2.dex */
public interface DrmSession {
    public static final int STATE_ERROR = 1;
    public static final int STATE_OPENED = 3;
    public static final int STATE_OPENED_WITH_KEYS = 4;
    public static final int STATE_OPENING = 2;
    public static final int STATE_RELEASED = 0;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface State {
    }

    void acquire(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher);

    androidx.media3.decoder.CryptoConfig getCryptoConfig();

    androidx.media3.exoplayer.drm.DrmSession.DrmSessionException getError();

    byte[] getOfflineLicenseKeySetId();

    java.util.UUID getSchemeUuid();

    int getState();

    boolean playClearSamplesWithoutKeys();

    java.util.Map<java.lang.String, java.lang.String> queryKeyStatus();

    void release(androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher);

    boolean requiresSecureDecoder(java.lang.String str);

    /* renamed from: androidx.media3.exoplayer.drm.DrmSession$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$playClearSamplesWithoutKeys(androidx.media3.exoplayer.drm.DrmSession _this) {
            return false;
        }

        public static void replaceSession(androidx.media3.exoplayer.drm.DrmSession drmSession, androidx.media3.exoplayer.drm.DrmSession drmSession2) {
            if (drmSession == drmSession2) {
                return;
            }
            if (drmSession2 != null) {
                drmSession2.acquire(null);
            }
            if (drmSession != null) {
                drmSession.release(null);
            }
        }
    }

    public static class DrmSessionException extends java.io.IOException {
        public final int errorCode;

        public DrmSessionException(java.lang.Throwable th, int i) {
            super(th);
            this.errorCode = i;
        }
    }
}
