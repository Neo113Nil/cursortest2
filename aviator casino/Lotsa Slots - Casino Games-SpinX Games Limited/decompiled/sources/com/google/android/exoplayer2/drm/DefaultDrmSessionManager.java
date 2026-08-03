package com.google.android.exoplayer2.drm;

/* loaded from: classes3.dex */
public class DefaultDrmSessionManager implements com.google.android.exoplayer2.drm.DrmSessionManager {
    public static final long DEFAULT_SESSION_KEEPALIVE_MS = 300000;
    public static final int INITIAL_DRM_REQUEST_RETRY_COUNT = 3;
    public static final int MODE_DOWNLOAD = 2;
    public static final int MODE_PLAYBACK = 0;
    public static final int MODE_QUERY = 1;
    public static final int MODE_RELEASE = 3;
    public static final java.lang.String PLAYREADY_CUSTOM_DATA_KEY = "PRCustomData";
    private static final java.lang.String TAG = "DefaultDrmSessionMgr";
    private final com.google.android.exoplayer2.drm.MediaDrmCallback callback;
    private com.google.android.exoplayer2.drm.ExoMediaDrm exoMediaDrm;
    private final com.google.android.exoplayer2.drm.ExoMediaDrm.Provider exoMediaDrmProvider;
    private final java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> keepaliveSessions;
    private final java.util.HashMap<java.lang.String, java.lang.String> keyRequestParameters;
    private final com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    volatile com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MediaDrmHandler mediaDrmHandler;
    private int mode;
    private final boolean multiSession;
    private com.google.android.exoplayer2.drm.DefaultDrmSession noMultiSessionDrmSession;
    private byte[] offlineLicenseKeySetId;
    private com.google.android.exoplayer2.drm.DefaultDrmSession placeholderDrmSession;
    private final boolean playClearSamplesWithoutKeys;
    private android.os.Handler playbackHandler;
    private android.os.Looper playbackLooper;
    private com.google.android.exoplayer2.analytics.PlayerId playerId;
    private final java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSessionManager.PreacquiredSessionReference> preacquiredSessionReferences;
    private int prepareCallsCount;
    private final com.google.android.exoplayer2.drm.DefaultDrmSessionManager.ProvisioningManagerImpl provisioningManagerImpl;
    private final com.google.android.exoplayer2.drm.DefaultDrmSessionManager.ReferenceCountListenerImpl referenceCountListener;
    private final long sessionKeepaliveMs;
    private final java.util.List<com.google.android.exoplayer2.drm.DefaultDrmSession> sessions;
    private final int[] useDrmSessionsForClearContentTrackTypes;
    private final java.util.UUID uuid;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public static final class Builder {
        private boolean multiSession;
        private boolean playClearSamplesWithoutKeys;
        private final java.util.HashMap<java.lang.String, java.lang.String> keyRequestParameters = new java.util.HashMap<>();
        private java.util.UUID uuid = com.google.android.exoplayer2.C.WIDEVINE_UUID;
        private com.google.android.exoplayer2.drm.ExoMediaDrm.Provider exoMediaDrmProvider = com.google.android.exoplayer2.drm.FrameworkMediaDrm.DEFAULT_PROVIDER;
        private com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy = new com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy();
        private int[] useDrmSessionsForClearContentTrackTypes = new int[0];
        private long sessionKeepaliveMs = 300000;

        public com.google.android.exoplayer2.drm.DefaultDrmSessionManager.Builder setKeyRequestParameters(java.util.Map<java.lang.String, java.lang.String> map) {
            this.keyRequestParameters.clear();
            if (map != null) {
                this.keyRequestParameters.putAll(map);
            }
            return this;
        }

        public com.google.android.exoplayer2.drm.DefaultDrmSessionManager.Builder setUuidAndExoMediaDrmProvider(java.util.UUID uuid, com.google.android.exoplayer2.drm.ExoMediaDrm.Provider provider) {
            this.uuid = (java.util.UUID) com.google.android.exoplayer2.util.Assertions.checkNotNull(uuid);
            this.exoMediaDrmProvider = (com.google.android.exoplayer2.drm.ExoMediaDrm.Provider) com.google.android.exoplayer2.util.Assertions.checkNotNull(provider);
            return this;
        }

        public com.google.android.exoplayer2.drm.DefaultDrmSessionManager.Builder setMultiSession(boolean z) {
            this.multiSession = z;
            return this;
        }

        public com.google.android.exoplayer2.drm.DefaultDrmSessionManager.Builder setUseDrmSessionsForClearContent(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                com.google.android.exoplayer2.util.Assertions.checkArgument(z);
            }
            this.useDrmSessionsForClearContentTrackTypes = (int[]) iArr.clone();
            return this;
        }

        public com.google.android.exoplayer2.drm.DefaultDrmSessionManager.Builder setPlayClearSamplesWithoutKeys(boolean z) {
            this.playClearSamplesWithoutKeys = z;
            return this;
        }

        public com.google.android.exoplayer2.drm.DefaultDrmSessionManager.Builder setLoadErrorHandlingPolicy(com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = (com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy) com.google.android.exoplayer2.util.Assertions.checkNotNull(loadErrorHandlingPolicy);
            return this;
        }

        public com.google.android.exoplayer2.drm.DefaultDrmSessionManager.Builder setSessionKeepaliveMs(long j) {
            com.google.android.exoplayer2.util.Assertions.checkArgument(j > 0 || j == -9223372036854775807L);
            this.sessionKeepaliveMs = j;
            return this;
        }

        public com.google.android.exoplayer2.drm.DefaultDrmSessionManager build(com.google.android.exoplayer2.drm.MediaDrmCallback mediaDrmCallback) {
            return new com.google.android.exoplayer2.drm.DefaultDrmSessionManager(this.uuid, this.exoMediaDrmProvider, mediaDrmCallback, this.keyRequestParameters, this.multiSession, this.useDrmSessionsForClearContentTrackTypes, this.playClearSamplesWithoutKeys, this.loadErrorHandlingPolicy, this.sessionKeepaliveMs);
        }
    }

    public static final class MissingSchemeDataException extends java.lang.Exception {
        private MissingSchemeDataException(java.util.UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    @java.lang.Deprecated
    public DefaultDrmSessionManager(java.util.UUID uuid, com.google.android.exoplayer2.drm.ExoMediaDrm exoMediaDrm, com.google.android.exoplayer2.drm.MediaDrmCallback mediaDrmCallback, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        this(uuid, exoMediaDrm, mediaDrmCallback, hashMap == null ? new java.util.HashMap<>() : hashMap, false, 3);
    }

    @java.lang.Deprecated
    public DefaultDrmSessionManager(java.util.UUID uuid, com.google.android.exoplayer2.drm.ExoMediaDrm exoMediaDrm, com.google.android.exoplayer2.drm.MediaDrmCallback mediaDrmCallback, java.util.HashMap<java.lang.String, java.lang.String> hashMap, boolean z) {
        this(uuid, exoMediaDrm, mediaDrmCallback, hashMap == null ? new java.util.HashMap<>() : hashMap, z, 3);
    }

    @java.lang.Deprecated
    public DefaultDrmSessionManager(java.util.UUID uuid, com.google.android.exoplayer2.drm.ExoMediaDrm exoMediaDrm, com.google.android.exoplayer2.drm.MediaDrmCallback mediaDrmCallback, java.util.HashMap<java.lang.String, java.lang.String> hashMap, boolean z, int i) {
        this(uuid, new com.google.android.exoplayer2.drm.ExoMediaDrm.AppManagedProvider(exoMediaDrm), mediaDrmCallback, hashMap == null ? new java.util.HashMap<>() : hashMap, z, new int[0], false, new com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy(i), 300000L);
    }

    private DefaultDrmSessionManager(java.util.UUID uuid, com.google.android.exoplayer2.drm.ExoMediaDrm.Provider provider, com.google.android.exoplayer2.drm.MediaDrmCallback mediaDrmCallback, java.util.HashMap<java.lang.String, java.lang.String> hashMap, boolean z, int[] iArr, boolean z2, com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(uuid);
        com.google.android.exoplayer2.util.Assertions.checkArgument(!com.google.android.exoplayer2.C.COMMON_PSSH_UUID.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.uuid = uuid;
        this.exoMediaDrmProvider = provider;
        this.callback = mediaDrmCallback;
        this.keyRequestParameters = hashMap;
        this.multiSession = z;
        this.useDrmSessionsForClearContentTrackTypes = iArr;
        this.playClearSamplesWithoutKeys = z2;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.provisioningManagerImpl = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager.ProvisioningManagerImpl(this);
        this.referenceCountListener = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager.ReferenceCountListenerImpl();
        this.mode = 0;
        this.sessions = new java.util.ArrayList();
        this.preacquiredSessionReferences = com.google.common.collect.Sets.newIdentityHashSet();
        this.keepaliveSessions = com.google.common.collect.Sets.newIdentityHashSet();
        this.sessionKeepaliveMs = j;
    }

    public void setMode(int i, byte[] bArr) {
        com.google.android.exoplayer2.util.Assertions.checkState(this.sessions.isEmpty());
        if (i == 1 || i == 3) {
            com.google.android.exoplayer2.util.Assertions.checkNotNull(bArr);
        }
        this.mode = i;
        this.offlineLicenseKeySetId = bArr;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final void prepare() {
        int i = this.prepareCallsCount;
        this.prepareCallsCount = i + 1;
        if (i != 0) {
            return;
        }
        if (this.exoMediaDrm == null) {
            com.google.android.exoplayer2.drm.ExoMediaDrm acquireExoMediaDrm = this.exoMediaDrmProvider.acquireExoMediaDrm(this.uuid);
            this.exoMediaDrm = acquireExoMediaDrm;
            acquireExoMediaDrm.setOnEventListener(new com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MediaDrmEventListener());
        } else if (this.sessionKeepaliveMs != -9223372036854775807L) {
            for (int i2 = 0; i2 < this.sessions.size(); i2++) {
                this.sessions.get(i2).acquire(null);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final void release() {
        int i = this.prepareCallsCount - 1;
        this.prepareCallsCount = i;
        if (i != 0) {
            return;
        }
        if (this.sessionKeepaliveMs != -9223372036854775807L) {
            java.util.ArrayList arrayList = new java.util.ArrayList(this.sessions);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((com.google.android.exoplayer2.drm.DefaultDrmSession) arrayList.get(i2)).release(null);
            }
        }
        releaseAllPreacquiredSessions();
        maybeReleaseMediaDrm();
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public void setPlayer(android.os.Looper looper, com.google.android.exoplayer2.analytics.PlayerId playerId) {
        initPlaybackLooper(looper);
        this.playerId = playerId;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference preacquireSession(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, com.google.android.exoplayer2.Format format) {
        com.google.android.exoplayer2.util.Assertions.checkState(this.prepareCallsCount > 0);
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.playbackLooper);
        com.google.android.exoplayer2.drm.DefaultDrmSessionManager.PreacquiredSessionReference preacquiredSessionReference = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager.PreacquiredSessionReference(eventDispatcher);
        preacquiredSessionReference.acquire(format);
        return preacquiredSessionReference;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public com.google.android.exoplayer2.drm.DrmSession acquireSession(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, com.google.android.exoplayer2.Format format) {
        com.google.android.exoplayer2.util.Assertions.checkState(this.prepareCallsCount > 0);
        com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.playbackLooper);
        return acquireSession(this.playbackLooper, eventDispatcher, format, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public com.google.android.exoplayer2.drm.DrmSession acquireSession(android.os.Looper looper, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, com.google.android.exoplayer2.Format format, boolean z) {
        java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> list;
        maybeCreateMediaDrmHandler(looper);
        if (format.drmInitData == null) {
            return maybeAcquirePlaceholderSession(com.google.android.exoplayer2.util.MimeTypes.getTrackType(format.sampleMimeType), z);
        }
        com.google.android.exoplayer2.drm.DefaultDrmSession defaultDrmSession = null;
        java.lang.Object[] objArr = 0;
        if (this.offlineLicenseKeySetId == null) {
            list = getSchemeDatas((com.google.android.exoplayer2.drm.DrmInitData) com.google.android.exoplayer2.util.Assertions.checkNotNull(format.drmInitData), this.uuid, false);
            if (list.isEmpty()) {
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MissingSchemeDataException missingSchemeDataException = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MissingSchemeDataException(this.uuid);
                com.google.android.exoplayer2.util.Log.e(TAG, "DRM error", missingSchemeDataException);
                if (eventDispatcher != null) {
                    eventDispatcher.drmSessionManagerError(missingSchemeDataException);
                }
                return new com.google.android.exoplayer2.drm.ErrorStateDrmSession(new com.google.android.exoplayer2.drm.DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            list = null;
        }
        if (!this.multiSession) {
            defaultDrmSession = this.noMultiSessionDrmSession;
        } else {
            java.util.Iterator<com.google.android.exoplayer2.drm.DefaultDrmSession> it = this.sessions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.google.android.exoplayer2.drm.DefaultDrmSession next = it.next();
                if (com.google.android.exoplayer2.util.Util.areEqual(next.schemeDatas, list)) {
                    defaultDrmSession = next;
                    break;
                }
            }
        }
        if (defaultDrmSession == null) {
            defaultDrmSession = createAndAcquireSessionWithRetry(list, false, eventDispatcher, z);
            if (!this.multiSession) {
                this.noMultiSessionDrmSession = defaultDrmSession;
            }
            this.sessions.add(defaultDrmSession);
        } else {
            defaultDrmSession.acquire(eventDispatcher);
        }
        return defaultDrmSession;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public int getCryptoType(com.google.android.exoplayer2.Format format) {
        int cryptoType = ((com.google.android.exoplayer2.drm.ExoMediaDrm) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.exoMediaDrm)).getCryptoType();
        if (format.drmInitData == null) {
            if (com.google.android.exoplayer2.util.Util.linearSearch(this.useDrmSessionsForClearContentTrackTypes, com.google.android.exoplayer2.util.MimeTypes.getTrackType(format.sampleMimeType)) != -1) {
                return cryptoType;
            }
            return 0;
        }
        if (canAcquireSession(format.drmInitData)) {
            return cryptoType;
        }
        return 1;
    }

    private com.google.android.exoplayer2.drm.DrmSession maybeAcquirePlaceholderSession(int i, boolean z) {
        com.google.android.exoplayer2.drm.ExoMediaDrm exoMediaDrm = (com.google.android.exoplayer2.drm.ExoMediaDrm) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.exoMediaDrm);
        if ((exoMediaDrm.getCryptoType() == 2 && com.google.android.exoplayer2.drm.FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC) || com.google.android.exoplayer2.util.Util.linearSearch(this.useDrmSessionsForClearContentTrackTypes, i) == -1 || exoMediaDrm.getCryptoType() == 1) {
            return null;
        }
        com.google.android.exoplayer2.drm.DefaultDrmSession defaultDrmSession = this.placeholderDrmSession;
        if (defaultDrmSession == null) {
            com.google.android.exoplayer2.drm.DefaultDrmSession createAndAcquireSessionWithRetry = createAndAcquireSessionWithRetry(com.google.common.collect.ImmutableList.of(), true, null, z);
            this.sessions.add(createAndAcquireSessionWithRetry);
            this.placeholderDrmSession = createAndAcquireSessionWithRetry;
        } else {
            defaultDrmSession.acquire(null);
        }
        return this.placeholderDrmSession;
    }

    private boolean canAcquireSession(com.google.android.exoplayer2.drm.DrmInitData drmInitData) {
        if (this.offlineLicenseKeySetId != null) {
            return true;
        }
        if (getSchemeDatas(drmInitData, this.uuid, true).isEmpty()) {
            if (drmInitData.schemeDataCount != 1 || !drmInitData.get(0).matches(com.google.android.exoplayer2.C.COMMON_PSSH_UUID)) {
                return false;
            }
            com.google.android.exoplayer2.util.Log.w(TAG, "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.uuid);
        }
        java.lang.String str = drmInitData.schemeType;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? com.google.android.exoplayer2.util.Util.SDK_INT >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    private synchronized void initPlaybackLooper(android.os.Looper looper) {
        android.os.Looper looper2 = this.playbackLooper;
        if (looper2 == null) {
            this.playbackLooper = looper;
            this.playbackHandler = new android.os.Handler(looper);
        } else {
            com.google.android.exoplayer2.util.Assertions.checkState(looper2 == looper);
            com.google.android.exoplayer2.util.Assertions.checkNotNull(this.playbackHandler);
        }
    }

    private void maybeCreateMediaDrmHandler(android.os.Looper looper) {
        if (this.mediaDrmHandler == null) {
            this.mediaDrmHandler = new com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MediaDrmHandler(looper);
        }
    }

    private com.google.android.exoplayer2.drm.DefaultDrmSession createAndAcquireSessionWithRetry(java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> list, boolean z, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher, boolean z2) {
        com.google.android.exoplayer2.drm.DefaultDrmSession createAndAcquireSession = createAndAcquireSession(list, z, eventDispatcher);
        if (acquisitionFailedIndicatingResourceShortage(createAndAcquireSession) && !this.keepaliveSessions.isEmpty()) {
            releaseAllKeepaliveSessions();
            undoAcquisition(createAndAcquireSession, eventDispatcher);
            createAndAcquireSession = createAndAcquireSession(list, z, eventDispatcher);
        }
        if (!acquisitionFailedIndicatingResourceShortage(createAndAcquireSession) || !z2 || this.preacquiredSessionReferences.isEmpty()) {
            return createAndAcquireSession;
        }
        releaseAllPreacquiredSessions();
        if (!this.keepaliveSessions.isEmpty()) {
            releaseAllKeepaliveSessions();
        }
        undoAcquisition(createAndAcquireSession, eventDispatcher);
        return createAndAcquireSession(list, z, eventDispatcher);
    }

    private static boolean acquisitionFailedIndicatingResourceShortage(com.google.android.exoplayer2.drm.DrmSession drmSession) {
        return drmSession.getState() == 1 && (com.google.android.exoplayer2.util.Util.SDK_INT < 19 || (((com.google.android.exoplayer2.drm.DrmSession.DrmSessionException) com.google.android.exoplayer2.util.Assertions.checkNotNull(drmSession.getError())).getCause() instanceof android.media.ResourceBusyException));
    }

    private void undoAcquisition(com.google.android.exoplayer2.drm.DrmSession drmSession, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        drmSession.release(eventDispatcher);
        if (this.sessionKeepaliveMs != -9223372036854775807L) {
            drmSession.release(null);
        }
    }

    private void releaseAllKeepaliveSessions() {
        com.google.common.collect.UnmodifiableIterator it = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) this.keepaliveSessions).iterator();
        while (it.hasNext()) {
            ((com.google.android.exoplayer2.drm.DrmSession) it.next()).release(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void releaseAllPreacquiredSessions() {
        com.google.common.collect.UnmodifiableIterator it = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) this.preacquiredSessionReferences).iterator();
        while (it.hasNext()) {
            ((com.google.android.exoplayer2.drm.DefaultDrmSessionManager.PreacquiredSessionReference) it.next()).release();
        }
    }

    private com.google.android.exoplayer2.drm.DefaultDrmSession createAndAcquireSession(java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> list, boolean z, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.exoMediaDrm);
        com.google.android.exoplayer2.drm.DefaultDrmSession defaultDrmSession = new com.google.android.exoplayer2.drm.DefaultDrmSession(this.uuid, this.exoMediaDrm, this.provisioningManagerImpl, this.referenceCountListener, list, this.mode, this.playClearSamplesWithoutKeys | z, z, this.offlineLicenseKeySetId, this.keyRequestParameters, this.callback, (android.os.Looper) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.playbackLooper), this.loadErrorHandlingPolicy, (com.google.android.exoplayer2.analytics.PlayerId) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.playerId));
        defaultDrmSession.acquire(eventDispatcher);
        if (this.sessionKeepaliveMs != -9223372036854775807L) {
            defaultDrmSession.acquire(null);
        }
        return defaultDrmSession;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReleaseMediaDrm() {
        if (this.exoMediaDrm != null && this.prepareCallsCount == 0 && this.sessions.isEmpty() && this.preacquiredSessionReferences.isEmpty()) {
            ((com.google.android.exoplayer2.drm.ExoMediaDrm) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.exoMediaDrm)).release();
            this.exoMediaDrm = null;
        }
    }

    private static java.util.List<com.google.android.exoplayer2.drm.DrmInitData.SchemeData> getSchemeDatas(com.google.android.exoplayer2.drm.DrmInitData drmInitData, java.util.UUID uuid, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList(drmInitData.schemeDataCount);
        for (int i = 0; i < drmInitData.schemeDataCount; i++) {
            com.google.android.exoplayer2.drm.DrmInitData.SchemeData schemeData = drmInitData.get(i);
            if ((schemeData.matches(uuid) || (com.google.android.exoplayer2.C.CLEARKEY_UUID.equals(uuid) && schemeData.matches(com.google.android.exoplayer2.C.COMMON_PSSH_UUID))) && (schemeData.data != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    private class MediaDrmHandler extends android.os.Handler {
        public MediaDrmHandler(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (com.google.android.exoplayer2.drm.DefaultDrmSession defaultDrmSession : com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.sessions) {
                if (defaultDrmSession.hasSessionId(bArr)) {
                    defaultDrmSession.onMediaDrmEvent(message.what);
                    return;
                }
            }
        }
    }

    private class ProvisioningManagerImpl implements com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager {
        private com.google.android.exoplayer2.drm.DefaultDrmSession provisioningSession;
        private final java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> sessionsAwaitingProvisioning = new java.util.HashSet();

        public ProvisioningManagerImpl(com.google.android.exoplayer2.drm.DefaultDrmSessionManager defaultDrmSessionManager) {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public void provisionRequired(com.google.android.exoplayer2.drm.DefaultDrmSession defaultDrmSession) {
            this.sessionsAwaitingProvisioning.add(defaultDrmSession);
            if (this.provisioningSession != null) {
                return;
            }
            this.provisioningSession = defaultDrmSession;
            defaultDrmSession.provision();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionCompleted() {
            this.provisioningSession = null;
            com.google.common.collect.ImmutableList copyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) this.sessionsAwaitingProvisioning);
            this.sessionsAwaitingProvisioning.clear();
            com.google.common.collect.UnmodifiableIterator it = copyOf.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.drm.DefaultDrmSession) it.next()).onProvisionCompleted();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionError(java.lang.Exception exc, boolean z) {
            this.provisioningSession = null;
            com.google.common.collect.ImmutableList copyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) this.sessionsAwaitingProvisioning);
            this.sessionsAwaitingProvisioning.clear();
            com.google.common.collect.UnmodifiableIterator it = copyOf.iterator();
            while (it.hasNext()) {
                ((com.google.android.exoplayer2.drm.DefaultDrmSession) it.next()).onProvisionError(exc, z);
            }
        }

        public void onSessionFullyReleased(com.google.android.exoplayer2.drm.DefaultDrmSession defaultDrmSession) {
            this.sessionsAwaitingProvisioning.remove(defaultDrmSession);
            if (this.provisioningSession == defaultDrmSession) {
                this.provisioningSession = null;
                if (this.sessionsAwaitingProvisioning.isEmpty()) {
                    return;
                }
                com.google.android.exoplayer2.drm.DefaultDrmSession next = this.sessionsAwaitingProvisioning.iterator().next();
                this.provisioningSession = next;
                next.provision();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class ReferenceCountListenerImpl implements com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener {
        private ReferenceCountListenerImpl() {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountIncremented(com.google.android.exoplayer2.drm.DefaultDrmSession defaultDrmSession, int i) {
            if (com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.sessionKeepaliveMs != -9223372036854775807L) {
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.keepaliveSessions.remove(defaultDrmSession);
                ((android.os.Handler) com.google.android.exoplayer2.util.Assertions.checkNotNull(com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.playbackHandler)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountDecremented(final com.google.android.exoplayer2.drm.DefaultDrmSession defaultDrmSession, int i) {
            if (i == 1 && com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.prepareCallsCount > 0 && com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.sessionKeepaliveMs != -9223372036854775807L) {
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.keepaliveSessions.add(defaultDrmSession);
                ((android.os.Handler) com.google.android.exoplayer2.util.Assertions.checkNotNull(com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.playbackHandler)).postAtTime(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$ReferenceCountListenerImpl$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.drm.DefaultDrmSession.this.release(null);
                    }
                }, defaultDrmSession, android.os.SystemClock.uptimeMillis() + com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.sessionKeepaliveMs);
            } else if (i == 0) {
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.sessions.remove(defaultDrmSession);
                if (com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.placeholderDrmSession == defaultDrmSession) {
                    com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.placeholderDrmSession = null;
                }
                if (com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.noMultiSessionDrmSession == defaultDrmSession) {
                    com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.noMultiSessionDrmSession = null;
                }
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.provisioningManagerImpl.onSessionFullyReleased(defaultDrmSession);
                if (com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.sessionKeepaliveMs != -9223372036854775807L) {
                    ((android.os.Handler) com.google.android.exoplayer2.util.Assertions.checkNotNull(com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.playbackHandler)).removeCallbacksAndMessages(defaultDrmSession);
                    com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.keepaliveSessions.remove(defaultDrmSession);
                }
            }
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.maybeReleaseMediaDrm();
        }
    }

    private class MediaDrmEventListener implements com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener {
        private MediaDrmEventListener() {
        }

        @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener
        public void onEvent(com.google.android.exoplayer2.drm.ExoMediaDrm exoMediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MediaDrmHandler) com.google.android.exoplayer2.util.Assertions.checkNotNull(com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.mediaDrmHandler)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class PreacquiredSessionReference implements com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference {
        private final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher;
        private boolean isReleased;
        private com.google.android.exoplayer2.drm.DrmSession session;

        public PreacquiredSessionReference(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
            this.eventDispatcher = eventDispatcher;
        }

        public void acquire(final com.google.android.exoplayer2.Format format) {
            ((android.os.Handler) com.google.android.exoplayer2.util.Assertions.checkNotNull(com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.playbackHandler)).post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$PreacquiredSessionReference$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.drm.DefaultDrmSessionManager.PreacquiredSessionReference.this.m5395xe3bb136(format);
                }
            });
        }

        /* renamed from: lambda$acquire$0$com-google-android-exoplayer2-drm-DefaultDrmSessionManager$PreacquiredSessionReference, reason: not valid java name */
        /* synthetic */ void m5395xe3bb136(com.google.android.exoplayer2.Format format) {
            if (com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.prepareCallsCount == 0 || this.isReleased) {
                return;
            }
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager defaultDrmSessionManager = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this;
            this.session = defaultDrmSessionManager.acquireSession((android.os.Looper) com.google.android.exoplayer2.util.Assertions.checkNotNull(defaultDrmSessionManager.playbackLooper), this.eventDispatcher, format, false);
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.preacquiredSessionReferences.add(this);
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference
        public void release() {
            com.google.android.exoplayer2.util.Util.postOrRun((android.os.Handler) com.google.android.exoplayer2.util.Assertions.checkNotNull(com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.playbackHandler), new java.lang.Runnable() { // from class: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$PreacquiredSessionReference$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.exoplayer2.drm.DefaultDrmSessionManager.PreacquiredSessionReference.this.m5396xd40d204();
                }
            });
        }

        /* renamed from: lambda$release$1$com-google-android-exoplayer2-drm-DefaultDrmSessionManager$PreacquiredSessionReference, reason: not valid java name */
        /* synthetic */ void m5396xd40d204() {
            if (this.isReleased) {
                return;
            }
            com.google.android.exoplayer2.drm.DrmSession drmSession = this.session;
            if (drmSession != null) {
                drmSession.release(this.eventDispatcher);
            }
            com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this.preacquiredSessionReferences.remove(this);
            this.isReleased = true;
        }
    }
}
