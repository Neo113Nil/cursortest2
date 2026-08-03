package com.google.android.exoplayer2.drm;

/* loaded from: classes3.dex */
public final class ErrorStateDrmSession implements com.google.android.exoplayer2.drm.DrmSession {
    private final com.google.android.exoplayer2.drm.DrmSession.DrmSessionException error;

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void acquire(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public com.google.android.exoplayer2.decoder.CryptoConfig getCryptoConfig() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public byte[] getOfflineLicenseKeySetId() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public java.util.Map<java.lang.String, java.lang.String> queryKeyStatus() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void release(com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean requiresSecureDecoder(java.lang.String str) {
        return false;
    }

    public ErrorStateDrmSession(com.google.android.exoplayer2.drm.DrmSession.DrmSessionException drmSessionException) {
        this.error = (com.google.android.exoplayer2.drm.DrmSession.DrmSessionException) com.google.android.exoplayer2.util.Assertions.checkNotNull(drmSessionException);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public com.google.android.exoplayer2.drm.DrmSession.DrmSessionException getError() {
        return this.error;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final java.util.UUID getSchemeUuid() {
        return com.google.android.exoplayer2.C.UUID_NIL;
    }
}
