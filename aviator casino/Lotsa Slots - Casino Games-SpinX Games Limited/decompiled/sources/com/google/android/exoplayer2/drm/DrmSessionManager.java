package com.google.android.exoplayer2.drm;

/* loaded from: classes3.dex */
public interface DrmSessionManager {
    public static final com.google.android.exoplayer2.drm.DrmSessionManager DRM_UNSUPPORTED;

    @java.lang.Deprecated
    public static final com.google.android.exoplayer2.drm.DrmSessionManager DUMMY;

    public interface DrmSessionReference {
        public static final com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference EMPTY = new com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference() { // from class: com.google.android.exoplayer2.drm.DrmSessionManager$DrmSessionReference$$ExternalSyntheticLambda0
            @Override // com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference
            public final void release() {
                com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference.CC.lambda$static$0();
            }
        };

        /* renamed from: com.google.android.exoplayer2.drm.DrmSessionManager$DrmSessionReference$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            static {
                com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference drmSessionReference = com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference.EMPTY;
            }

            public static /* synthetic */ void lambda$static$0() {
            }
        }

        void release();
    }

    com.google.android.exoplayer2.drm.DrmSession acquireSession(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, com.google.android.exoplayer2.Format format);

    int getCryptoType(com.google.android.exoplayer2.Format format);

    com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference preacquireSession(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, com.google.android.exoplayer2.Format format);

    void prepare();

    void release();

    void setPlayer(android.os.Looper looper, com.google.android.exoplayer2.analytics.PlayerId playerId);

    static {
        com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager = new com.google.android.exoplayer2.drm.DrmSessionManager() { // from class: com.google.android.exoplayer2.drm.DrmSessionManager.1
            @Override // com.google.android.exoplayer2.drm.DrmSessionManager
            public /* synthetic */ com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference preacquireSession(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, com.google.android.exoplayer2.Format format) {
                return com.google.android.exoplayer2.drm.DrmSessionManager.CC.$default$preacquireSession(this, eventDispatcher, format);
            }

            @Override // com.google.android.exoplayer2.drm.DrmSessionManager
            public /* synthetic */ void prepare() {
                com.google.android.exoplayer2.drm.DrmSessionManager.CC.$default$prepare(this);
            }

            @Override // com.google.android.exoplayer2.drm.DrmSessionManager
            public /* synthetic */ void release() {
                com.google.android.exoplayer2.drm.DrmSessionManager.CC.$default$release(this);
            }

            @Override // com.google.android.exoplayer2.drm.DrmSessionManager
            public void setPlayer(android.os.Looper looper, com.google.android.exoplayer2.analytics.PlayerId playerId) {
            }

            @Override // com.google.android.exoplayer2.drm.DrmSessionManager
            public com.google.android.exoplayer2.drm.DrmSession acquireSession(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, com.google.android.exoplayer2.Format format) {
                if (format.drmInitData == null) {
                    return null;
                }
                return new com.google.android.exoplayer2.drm.ErrorStateDrmSession(new com.google.android.exoplayer2.drm.DrmSession.DrmSessionException(new com.google.android.exoplayer2.drm.UnsupportedDrmException(1), 6001));
            }

            @Override // com.google.android.exoplayer2.drm.DrmSessionManager
            public int getCryptoType(com.google.android.exoplayer2.Format format) {
                return format.drmInitData != null ? 1 : 0;
            }
        };
        DRM_UNSUPPORTED = drmSessionManager;
        DUMMY = drmSessionManager;
    }

    /* renamed from: com.google.android.exoplayer2.drm.DrmSessionManager$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$prepare(com.google.android.exoplayer2.drm.DrmSessionManager _this) {
        }

        public static void $default$release(com.google.android.exoplayer2.drm.DrmSessionManager _this) {
        }

        static {
            com.google.android.exoplayer2.drm.DrmSessionManager drmSessionManager = com.google.android.exoplayer2.drm.DrmSessionManager.DRM_UNSUPPORTED;
        }

        @java.lang.Deprecated
        public static com.google.android.exoplayer2.drm.DrmSessionManager getDummyDrmSessionManager() {
            return com.google.android.exoplayer2.drm.DrmSessionManager.DRM_UNSUPPORTED;
        }

        public static com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference $default$preacquireSession(com.google.android.exoplayer2.drm.DrmSessionManager _this, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, com.google.android.exoplayer2.Format format) {
            return com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference.EMPTY;
        }
    }
}
