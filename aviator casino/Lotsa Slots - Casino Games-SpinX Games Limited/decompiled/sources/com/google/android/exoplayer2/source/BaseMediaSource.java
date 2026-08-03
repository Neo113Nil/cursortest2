package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public abstract class BaseMediaSource implements com.google.android.exoplayer2.source.MediaSource {
    private android.os.Looper looper;
    private com.google.android.exoplayer2.analytics.PlayerId playerId;
    private com.google.android.exoplayer2.Timeline timeline;
    private final java.util.ArrayList<com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller> mediaSourceCallers = new java.util.ArrayList<>(1);
    private final java.util.HashSet<com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller> enabledMediaSourceCallers = new java.util.HashSet<>(1);
    private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventDispatcher = new com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher();
    private final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher = new com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher();

    protected void disableInternal() {
    }

    protected void enableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public /* synthetic */ com.google.android.exoplayer2.Timeline getInitialTimeline() {
        return com.google.android.exoplayer2.source.MediaSource.CC.$default$getInitialTimeline(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public /* synthetic */ boolean isSingleWindow() {
        return com.google.android.exoplayer2.source.MediaSource.CC.$default$isSingleWindow(this);
    }

    protected abstract void prepareSourceInternal(com.google.android.exoplayer2.upstream.TransferListener transferListener);

    protected abstract void releaseSourceInternal();

    protected final void refreshSourceInfo(com.google.android.exoplayer2.Timeline timeline) {
        this.timeline = timeline;
        java.util.Iterator<com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller> it = this.mediaSourceCallers.iterator();
        while (it.hasNext()) {
            it.next().onSourceInfoRefreshed(this, timeline);
        }
    }

    protected final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher createEventDispatcher(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return this.eventDispatcher.withParameters(0, mediaPeriodId, 0L);
    }

    protected final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher createEventDispatcher(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, long j) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaPeriodId);
        return this.eventDispatcher.withParameters(0, mediaPeriodId, j);
    }

    protected final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher createEventDispatcher(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, long j) {
        return this.eventDispatcher.withParameters(i, mediaPeriodId, j);
    }

    protected final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher createDrmEventDispatcher(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return this.drmEventDispatcher.withParameters(0, mediaPeriodId);
    }

    protected final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher createDrmEventDispatcher(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return this.drmEventDispatcher.withParameters(i, mediaPeriodId);
    }

    protected final boolean isEnabled() {
        return !this.enabledMediaSourceCallers.isEmpty();
    }

    protected final com.google.android.exoplayer2.analytics.PlayerId getPlayerId() {
        return (com.google.android.exoplayer2.analytics.PlayerId) com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.playerId);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void addEventListener(android.os.Handler handler, com.google.android.exoplayer2.source.MediaSourceEventListener mediaSourceEventListener) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(handler);
        com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaSourceEventListener);
        this.eventDispatcher.addEventListener(handler, mediaSourceEventListener);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void removeEventListener(com.google.android.exoplayer2.source.MediaSourceEventListener mediaSourceEventListener) {
        this.eventDispatcher.removeEventListener(mediaSourceEventListener);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void addDrmEventListener(android.os.Handler handler, com.google.android.exoplayer2.drm.DrmSessionEventListener drmSessionEventListener) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(handler);
        com.google.android.exoplayer2.util.Assertions.checkNotNull(drmSessionEventListener);
        this.drmEventDispatcher.addEventListener(handler, drmSessionEventListener);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void removeDrmEventListener(com.google.android.exoplayer2.drm.DrmSessionEventListener drmSessionEventListener) {
        this.drmEventDispatcher.removeEventListener(drmSessionEventListener);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void prepareSource(com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller mediaSourceCaller, com.google.android.exoplayer2.upstream.TransferListener transferListener) {
        prepareSource(mediaSourceCaller, transferListener, com.google.android.exoplayer2.analytics.PlayerId.UNSET);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void prepareSource(com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller mediaSourceCaller, com.google.android.exoplayer2.upstream.TransferListener transferListener, com.google.android.exoplayer2.analytics.PlayerId playerId) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        android.os.Looper looper = this.looper;
        com.google.android.exoplayer2.util.Assertions.checkArgument(looper == null || looper == myLooper);
        this.playerId = playerId;
        com.google.android.exoplayer2.Timeline timeline = this.timeline;
        this.mediaSourceCallers.add(mediaSourceCaller);
        if (this.looper == null) {
            this.looper = myLooper;
            this.enabledMediaSourceCallers.add(mediaSourceCaller);
            prepareSourceInternal(transferListener);
        } else if (timeline != null) {
            enable(mediaSourceCaller);
            mediaSourceCaller.onSourceInfoRefreshed(this, timeline);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void enable(com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller mediaSourceCaller) {
        com.google.android.exoplayer2.util.Assertions.checkNotNull(this.looper);
        boolean isEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.add(mediaSourceCaller);
        if (isEmpty) {
            enableInternal();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void disable(com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller mediaSourceCaller) {
        boolean z = !this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.remove(mediaSourceCaller);
        if (z && this.enabledMediaSourceCallers.isEmpty()) {
            disableInternal();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void releaseSource(com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller mediaSourceCaller) {
        this.mediaSourceCallers.remove(mediaSourceCaller);
        if (this.mediaSourceCallers.isEmpty()) {
            this.looper = null;
            this.timeline = null;
            this.playerId = null;
            this.enabledMediaSourceCallers.clear();
            releaseSourceInternal();
            return;
        }
        disable(mediaSourceCaller);
    }
}
