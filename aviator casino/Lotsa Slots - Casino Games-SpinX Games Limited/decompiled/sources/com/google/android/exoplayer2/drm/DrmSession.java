package com.google.android.exoplayer2.drm;

/* loaded from: classes3.dex */
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

    void acquire(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher);

    com.google.android.exoplayer2.decoder.CryptoConfig getCryptoConfig();

    com.google.android.exoplayer2.drm.DrmSession.DrmSessionException getError();

    byte[] getOfflineLicenseKeySetId();

    java.util.UUID getSchemeUuid();

    int getState();

    boolean playClearSamplesWithoutKeys();

    java.util.Map<java.lang.String, java.lang.String> queryKeyStatus();

    void release(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher);

    boolean requiresSecureDecoder(java.lang.String str);

    /* renamed from: com.google.android.exoplayer2.drm.DrmSession$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$playClearSamplesWithoutKeys(com.google.android.exoplayer2.drm.DrmSession _this) {
            return false;
        }

        public static void replaceSession(com.google.android.exoplayer2.drm.DrmSession drmSession, com.google.android.exoplayer2.drm.DrmSession drmSession2) {
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
