package com.google.android.exoplayer2.source.ads;

/* loaded from: classes3.dex */
public final class ServerSideAdInsertionMediaSource extends com.google.android.exoplayer2.source.BaseMediaSource implements com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller, com.google.android.exoplayer2.source.MediaSourceEventListener, com.google.android.exoplayer2.drm.DrmSessionEventListener {
    private final com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.AdPlaybackStateUpdater adPlaybackStateUpdater;
    private com.google.android.exoplayer2.Timeline contentTimeline;
    private com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod lastUsedMediaPeriod;
    private final com.google.android.exoplayer2.source.MediaSource mediaSource;
    private android.os.Handler playbackHandler;
    private final com.google.common.collect.ListMultimap<android.util.Pair<java.lang.Long, java.lang.Object>, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod> mediaPeriods = com.google.common.collect.ArrayListMultimap.create();
    private com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> adPlaybackStates = com.google.common.collect.ImmutableMap.of();
    private final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcherWithoutId = createEventDispatcher(null);
    private final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcherWithoutId = createDrmEventDispatcher(null);

    public interface AdPlaybackStateUpdater {
        boolean onAdPlaybackStateUpdateRequested(com.google.android.exoplayer2.Timeline timeline);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public /* synthetic */ void onDrmSessionAcquired(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        com.google.android.exoplayer2.drm.DrmSessionEventListener.CC.$default$onDrmSessionAcquired(this, i, mediaPeriodId);
    }

    public ServerSideAdInsertionMediaSource(com.google.android.exoplayer2.source.MediaSource mediaSource, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.AdPlaybackStateUpdater adPlaybackStateUpdater) {
        this.mediaSource = mediaSource;
        this.adPlaybackStateUpdater = adPlaybackStateUpdater;
    }

    public void setAdPlaybackStates(final com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> immutableMap) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(!immutableMap.isEmpty());
        java.lang.Object checkNotNull = com.google.android.exoplayer2.util.Assertions.checkNotNull(immutableMap.values().asList().get(0).adsId);
        com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState>> it = immutableMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> next = it.next();
            java.lang.Object key = next.getKey();
            com.google.android.exoplayer2.source.ads.AdPlaybackState value = next.getValue();
            com.google.android.exoplayer2.util.Assertions.checkArgument(com.google.android.exoplayer2.util.Util.areEqual(checkNotNull, value.adsId));
            com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState = this.adPlaybackStates.get(key);
            if (adPlaybackState != null) {
                for (int i = value.removedAdGroupCount; i < value.adGroupCount; i++) {
                    com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup adGroup = value.getAdGroup(i);
                    com.google.android.exoplayer2.util.Assertions.checkArgument(adGroup.isServerSideInserted);
                    if (i < adPlaybackState.adGroupCount && com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getAdCountInGroup(value, i) < com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getAdCountInGroup(adPlaybackState, i)) {
                        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup adGroup2 = value.getAdGroup(i + 1);
                        com.google.android.exoplayer2.util.Assertions.checkArgument(adGroup.contentResumeOffsetUs + adGroup2.contentResumeOffsetUs == adPlaybackState.getAdGroup(i).contentResumeOffsetUs);
                        com.google.android.exoplayer2.util.Assertions.checkArgument(adGroup.timeUs + adGroup.contentResumeOffsetUs == adGroup2.timeUs);
                    }
                    if (adGroup.timeUs == Long.MIN_VALUE) {
                        com.google.android.exoplayer2.util.Assertions.checkArgument(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getAdCountInGroup(value, i) == 0);
                    }
                }
            }
        }
        synchronized (this) {
            android.os.Handler handler = this.playbackHandler;
            if (handler == null) {
                this.adPlaybackStates = immutableMap;
            } else {
                handler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.this.m5436x4663d317(immutableMap);
                    }
                });
            }
        }
    }

    /* renamed from: lambda$setAdPlaybackStates$0$com-google-android-exoplayer2-source-ads-ServerSideAdInsertionMediaSource, reason: not valid java name */
    /* synthetic */ void m5436x4663d317(com.google.common.collect.ImmutableMap immutableMap) {
        com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState;
        for (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedMediaPeriod : this.mediaPeriods.values()) {
            com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) immutableMap.get(sharedMediaPeriod.periodUid);
            if (adPlaybackState2 != null) {
                sharedMediaPeriod.updateAdPlaybackState(adPlaybackState2);
            }
        }
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedMediaPeriod2 = this.lastUsedMediaPeriod;
        if (sharedMediaPeriod2 != null && (adPlaybackState = (com.google.android.exoplayer2.source.ads.AdPlaybackState) immutableMap.get(sharedMediaPeriod2.periodUid)) != null) {
            this.lastUsedMediaPeriod.updateAdPlaybackState(adPlaybackState);
        }
        this.adPlaybackStates = immutableMap;
        if (this.contentTimeline != null) {
            refreshSourceInfo(new com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.ServerSideAdInsertionTimeline(this.contentTimeline, immutableMap));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.MediaItem getMediaItem() {
        return this.mediaSource.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void prepareSourceInternal(com.google.android.exoplayer2.upstream.TransferListener transferListener) {
        android.os.Handler createHandlerForCurrentLooper = com.google.android.exoplayer2.util.Util.createHandlerForCurrentLooper();
        synchronized (this) {
            this.playbackHandler = createHandlerForCurrentLooper;
        }
        this.mediaSource.addEventListener(createHandlerForCurrentLooper, this);
        this.mediaSource.addDrmEventListener(createHandlerForCurrentLooper, this);
        this.mediaSource.prepareSource(this, transferListener, getPlayerId());
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws java.io.IOException {
        this.mediaSource.maybeThrowSourceInfoRefreshError();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void enableInternal() {
        this.mediaSource.enable(this);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void disableInternal() {
        releaseLastUsedMediaPeriod();
        this.mediaSource.disable(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
    public void onSourceInfoRefreshed(com.google.android.exoplayer2.source.MediaSource mediaSource, com.google.android.exoplayer2.Timeline timeline) {
        this.contentTimeline = timeline;
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.AdPlaybackStateUpdater adPlaybackStateUpdater = this.adPlaybackStateUpdater;
        if ((adPlaybackStateUpdater == null || !adPlaybackStateUpdater.onAdPlaybackStateUpdateRequested(timeline)) && !this.adPlaybackStates.isEmpty()) {
            refreshSourceInfo(new com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.ServerSideAdInsertionTimeline(timeline, this.adPlaybackStates));
        }
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    protected void releaseSourceInternal() {
        releaseLastUsedMediaPeriod();
        this.contentTimeline = null;
        synchronized (this) {
            this.playbackHandler = null;
        }
        this.mediaSource.releaseSource(this);
        this.mediaSource.removeEventListener(this);
        this.mediaSource.removeDrmEventListener(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public com.google.android.exoplayer2.source.MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.upstream.Allocator allocator, long j) {
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedMediaPeriod;
        android.util.Pair<java.lang.Long, java.lang.Object> pair = new android.util.Pair<>(java.lang.Long.valueOf(mediaPeriodId.windowSequenceNumber), mediaPeriodId.periodUid);
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedMediaPeriod2 = this.lastUsedMediaPeriod;
        boolean z = false;
        if (sharedMediaPeriod2 != null) {
            if (sharedMediaPeriod2.periodUid.equals(mediaPeriodId.periodUid)) {
                sharedMediaPeriod = this.lastUsedMediaPeriod;
                this.mediaPeriods.put(pair, sharedMediaPeriod);
                z = true;
            } else {
                this.lastUsedMediaPeriod.release(this.mediaSource);
                sharedMediaPeriod = null;
            }
            this.lastUsedMediaPeriod = null;
        } else {
            sharedMediaPeriod = null;
        }
        if (sharedMediaPeriod == null && ((sharedMediaPeriod = (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod) com.google.common.collect.Iterables.getLast(this.mediaPeriods.get((com.google.common.collect.ListMultimap<android.util.Pair<java.lang.Long, java.lang.Object>, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod>) pair), null)) == null || !sharedMediaPeriod.canReuseMediaPeriod(mediaPeriodId, j))) {
            com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState = (com.google.android.exoplayer2.source.ads.AdPlaybackState) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodId.periodUid));
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedMediaPeriod3 = new com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod(this.mediaSource.createPeriod(new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(mediaPeriodId.periodUid, mediaPeriodId.windowSequenceNumber), allocator, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodId, adPlaybackState)), mediaPeriodId.periodUid, adPlaybackState);
            this.mediaPeriods.put(pair, sharedMediaPeriod3);
            sharedMediaPeriod = sharedMediaPeriod3;
        }
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl = new com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl(sharedMediaPeriod, mediaPeriodId, createEventDispatcher(mediaPeriodId), createDrmEventDispatcher(mediaPeriodId));
        sharedMediaPeriod.add(mediaPeriodImpl);
        if (z && sharedMediaPeriod.trackSelections.length > 0) {
            mediaPeriodImpl.seekToUs(j);
        }
        return mediaPeriodImpl;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl = (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl) mediaPeriod;
        mediaPeriodImpl.sharedPeriod.remove(mediaPeriodImpl);
        if (mediaPeriodImpl.sharedPeriod.isUnused()) {
            this.mediaPeriods.remove(new android.util.Pair(java.lang.Long.valueOf(mediaPeriodImpl.mediaPeriodId.windowSequenceNumber), mediaPeriodImpl.mediaPeriodId.periodUid), mediaPeriodImpl.sharedPeriod);
            if (this.mediaPeriods.isEmpty()) {
                this.lastUsedMediaPeriod = mediaPeriodImpl.sharedPeriod;
            } else {
                mediaPeriodImpl.sharedPeriod.release(this.mediaSource);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionAcquired(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, int i2) {
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, true);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionAcquired(i2);
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmSessionAcquired(i2);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysLoaded(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysLoaded();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmKeysLoaded();
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionManagerError(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, java.lang.Exception exc) {
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionManagerError(exc);
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmSessionManagerError(exc);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysRestored(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysRestored();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmKeysRestored();
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmKeysRemoved(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmKeysRemoved();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmKeysRemoved();
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public void onDrmSessionReleased(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, null, false);
        if (mediaPeriodForEvent == null) {
            this.drmEventDispatcherWithoutId.drmSessionReleased();
        } else {
            mediaPeriodForEvent.drmEventDispatcher.drmSessionReleased();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadStarted(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadStarted(loadEventInfo, mediaLoadData);
        } else {
            mediaPeriodForEvent.sharedPeriod.onLoadStarted(loadEventInfo, mediaLoadData);
            mediaPeriodForEvent.mediaSourceEventDispatcher.loadStarted(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (com.google.android.exoplayer2.source.ads.AdPlaybackState) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadCompleted(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadCompleted(loadEventInfo, mediaLoadData);
        } else {
            mediaPeriodForEvent.sharedPeriod.onLoadFinished(loadEventInfo);
            mediaPeriodForEvent.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (com.google.android.exoplayer2.source.ads.AdPlaybackState) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadCanceled(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadCanceled(loadEventInfo, mediaLoadData);
        } else {
            mediaPeriodForEvent.sharedPeriod.onLoadFinished(loadEventInfo);
            mediaPeriodForEvent.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (com.google.android.exoplayer2.source.ads.AdPlaybackState) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onLoadError(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z) {
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, true);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.loadError(loadEventInfo, mediaLoadData, iOException, z);
            return;
        }
        if (z) {
            mediaPeriodForEvent.sharedPeriod.onLoadFinished(loadEventInfo);
        }
        mediaPeriodForEvent.mediaSourceEventDispatcher.loadError(loadEventInfo, correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (com.google.android.exoplayer2.source.ads.AdPlaybackState) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))), iOException, z);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onUpstreamDiscarded(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, false);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.upstreamDiscarded(mediaLoadData);
        } else {
            mediaPeriodForEvent.mediaSourceEventDispatcher.upstreamDiscarded(correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (com.google.android.exoplayer2.source.ads.AdPlaybackState) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))));
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public void onDownstreamFormatChanged(int i, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = getMediaPeriodForEvent(mediaPeriodId, mediaLoadData, false);
        if (mediaPeriodForEvent == null) {
            this.mediaSourceEventDispatcherWithoutId.downstreamFormatChanged(mediaLoadData);
        } else {
            mediaPeriodForEvent.sharedPeriod.onDownstreamFormatChanged(mediaPeriodForEvent, mediaLoadData);
            mediaPeriodForEvent.mediaSourceEventDispatcher.downstreamFormatChanged(correctMediaLoadData(mediaPeriodForEvent, mediaLoadData, (com.google.android.exoplayer2.source.ads.AdPlaybackState) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.adPlaybackStates.get(mediaPeriodForEvent.mediaPeriodId.periodUid))));
        }
    }

    private void releaseLastUsedMediaPeriod() {
        com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedMediaPeriod = this.lastUsedMediaPeriod;
        if (sharedMediaPeriod != null) {
            sharedMediaPeriod.release(this.mediaSource);
            this.lastUsedMediaPeriod = null;
        }
    }

    private com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl getMediaPeriodForEvent(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData, boolean z) {
        if (mediaPeriodId == null) {
            return null;
        }
        java.util.List<com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod> list = this.mediaPeriods.get((com.google.common.collect.ListMultimap<android.util.Pair<java.lang.Long, java.lang.Object>, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod>) new android.util.Pair<>(java.lang.Long.valueOf(mediaPeriodId.windowSequenceNumber), mediaPeriodId.periodUid));
        if (list.isEmpty()) {
            return null;
        }
        if (z) {
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedMediaPeriod = (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod) com.google.common.collect.Iterables.getLast(list);
            return sharedMediaPeriod.loadingPeriod != null ? sharedMediaPeriod.loadingPeriod : (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl) com.google.common.collect.Iterables.getLast(sharedMediaPeriod.mediaPeriods);
        }
        for (int i = 0; i < list.size(); i++) {
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodForEvent = list.get(i).getMediaPeriodForEvent(mediaLoadData);
            if (mediaPeriodForEvent != null) {
                return mediaPeriodForEvent;
            }
        }
        return (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl) list.get(0).mediaPeriods.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getMediaPeriodEndPositionUs(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState) {
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodImpl.mediaPeriodId;
        if (mediaPeriodId.isAd()) {
            com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup adGroup = adPlaybackState.getAdGroup(mediaPeriodId.adGroupIndex);
            if (adGroup.count == -1) {
                return 0L;
            }
            return adGroup.durationsUs[mediaPeriodId.adIndexInAdGroup];
        }
        if (mediaPeriodId.nextAdGroupIndex == -1) {
            return Long.MAX_VALUE;
        }
        com.google.android.exoplayer2.source.ads.AdPlaybackState.AdGroup adGroup2 = adPlaybackState.getAdGroup(mediaPeriodId.nextAdGroupIndex);
        if (adGroup2.timeUs == Long.MIN_VALUE) {
            return Long.MAX_VALUE;
        }
        return adGroup2.timeUs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.exoplayer2.source.MediaLoadData correctMediaLoadData(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData, com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState) {
        return new com.google.android.exoplayer2.source.MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, correctMediaLoadDataPositionMs(mediaLoadData.mediaStartTimeMs, mediaPeriodImpl, adPlaybackState), correctMediaLoadDataPositionMs(mediaLoadData.mediaEndTimeMs, mediaPeriodImpl, adPlaybackState));
    }

    private static long correctMediaLoadDataPositionMs(long j, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState) {
        long mediaPeriodPositionUsForContent;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long msToUs = com.google.android.exoplayer2.util.Util.msToUs(j);
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodImpl.mediaPeriodId;
        if (mediaPeriodId.isAd()) {
            mediaPeriodPositionUsForContent = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForAd(msToUs, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, adPlaybackState);
        } else {
            mediaPeriodPositionUsForContent = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(msToUs, -1, adPlaybackState);
        }
        return com.google.android.exoplayer2.util.Util.usToMs(mediaPeriodPositionUsForContent);
    }

    private static final class SharedMediaPeriod implements com.google.android.exoplayer2.source.MediaPeriod.Callback {
        private final com.google.android.exoplayer2.source.MediaPeriod actualMediaPeriod;
        private com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState;
        private boolean hasStartedPreparing;
        private boolean isPrepared;
        private com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl loadingPeriod;
        private final java.lang.Object periodUid;
        private final java.util.List<com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl> mediaPeriods = new java.util.ArrayList();
        private final java.util.Map<java.lang.Long, android.util.Pair<com.google.android.exoplayer2.source.LoadEventInfo, com.google.android.exoplayer2.source.MediaLoadData>> activeLoads = new java.util.HashMap();
        public com.google.android.exoplayer2.trackselection.ExoTrackSelection[] trackSelections = new com.google.android.exoplayer2.trackselection.ExoTrackSelection[0];
        public com.google.android.exoplayer2.source.SampleStream[] sampleStreams = new com.google.android.exoplayer2.source.SampleStream[0];
        public com.google.android.exoplayer2.source.MediaLoadData[] lastDownstreamFormatChangeData = new com.google.android.exoplayer2.source.MediaLoadData[0];

        public SharedMediaPeriod(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod, java.lang.Object obj, com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState) {
            this.actualMediaPeriod = mediaPeriod;
            this.periodUid = obj;
            this.adPlaybackState = adPlaybackState;
        }

        public void updateAdPlaybackState(com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState) {
            this.adPlaybackState = adPlaybackState;
        }

        public void add(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl) {
            this.mediaPeriods.add(mediaPeriodImpl);
        }

        public void remove(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl) {
            if (mediaPeriodImpl.equals(this.loadingPeriod)) {
                this.loadingPeriod = null;
                this.activeLoads.clear();
            }
            this.mediaPeriods.remove(mediaPeriodImpl);
        }

        public boolean isUnused() {
            return this.mediaPeriods.isEmpty();
        }

        public void release(com.google.android.exoplayer2.source.MediaSource mediaSource) {
            mediaSource.releasePeriod(this.actualMediaPeriod);
        }

        public boolean canReuseMediaPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, long j) {
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl = (com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl) com.google.common.collect.Iterables.getLast(this.mediaPeriods);
            return com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodId, this.adPlaybackState) == com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.getMediaPeriodEndPositionUs(mediaPeriodImpl, this.adPlaybackState), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl getMediaPeriodForEvent(com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
            if (mediaLoadData == null || mediaLoadData.mediaStartTimeMs == -9223372036854775807L) {
                return null;
            }
            for (int i = 0; i < this.mediaPeriods.size(); i++) {
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl = this.mediaPeriods.get(i);
                long mediaPeriodPositionUs = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(com.google.android.exoplayer2.util.Util.msToUs(mediaLoadData.mediaStartTimeMs), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
                long mediaPeriodEndPositionUs = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.getMediaPeriodEndPositionUs(mediaPeriodImpl, this.adPlaybackState);
                if (mediaPeriodPositionUs >= 0 && mediaPeriodPositionUs < mediaPeriodEndPositionUs) {
                    return mediaPeriodImpl;
                }
            }
            return null;
        }

        public void prepare(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, long j) {
            mediaPeriodImpl.lastStartPositionUs = j;
            if (this.hasStartedPreparing) {
                if (this.isPrepared) {
                    ((com.google.android.exoplayer2.source.MediaPeriod.Callback) com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaPeriodImpl.callback)).onPrepared(mediaPeriodImpl);
                }
            } else {
                this.hasStartedPreparing = true;
                this.actualMediaPeriod.prepare(this, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState));
            }
        }

        public void maybeThrowPrepareError() throws java.io.IOException {
            this.actualMediaPeriod.maybeThrowPrepareError();
        }

        public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups() {
            return this.actualMediaPeriod.getTrackGroups();
        }

        public java.util.List<com.google.android.exoplayer2.offline.StreamKey> getStreamKeys(java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection> list) {
            return this.actualMediaPeriod.getStreamKeys(list);
        }

        public boolean continueLoading(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, long j) {
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl2 = this.loadingPeriod;
            if (mediaPeriodImpl2 != null && !mediaPeriodImpl.equals(mediaPeriodImpl2)) {
                for (android.util.Pair<com.google.android.exoplayer2.source.LoadEventInfo, com.google.android.exoplayer2.source.MediaLoadData> pair : this.activeLoads.values()) {
                    mediaPeriodImpl2.mediaSourceEventDispatcher.loadCompleted((com.google.android.exoplayer2.source.LoadEventInfo) pair.first, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.correctMediaLoadData(mediaPeriodImpl2, (com.google.android.exoplayer2.source.MediaLoadData) pair.second, this.adPlaybackState));
                    mediaPeriodImpl.mediaSourceEventDispatcher.loadStarted((com.google.android.exoplayer2.source.LoadEventInfo) pair.first, com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.correctMediaLoadData(mediaPeriodImpl, (com.google.android.exoplayer2.source.MediaLoadData) pair.second, this.adPlaybackState));
                }
            }
            this.loadingPeriod = mediaPeriodImpl;
            return this.actualMediaPeriod.continueLoading(getStreamPositionUsWithNotYetStartedHandling(mediaPeriodImpl, j));
        }

        public boolean isLoading(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl) {
            return mediaPeriodImpl.equals(this.loadingPeriod) && this.actualMediaPeriod.isLoading();
        }

        public long getBufferedPositionUs(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl) {
            return getMediaPeriodPositionUsWithEndOfSourceHandling(mediaPeriodImpl, this.actualMediaPeriod.getBufferedPositionUs());
        }

        public long getNextLoadPositionUs(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl) {
            return getMediaPeriodPositionUsWithEndOfSourceHandling(mediaPeriodImpl, this.actualMediaPeriod.getNextLoadPositionUs());
        }

        public long seekToUs(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, long j) {
            return com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(this.actualMediaPeriod.seekToUs(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState)), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public long getAdjustedSeekPositionUs(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, long j, com.google.android.exoplayer2.SeekParameters seekParameters) {
            return com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(this.actualMediaPeriod.getAdjustedSeekPositionUs(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState), seekParameters), mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public void discardBuffer(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, long j, boolean z) {
            this.actualMediaPeriod.discardBuffer(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState), z);
        }

        public void reevaluateBuffer(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, long j) {
            this.actualMediaPeriod.reevaluateBuffer(getStreamPositionUsWithNotYetStartedHandling(mediaPeriodImpl, j));
        }

        public long readDiscontinuity(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl) {
            if (!mediaPeriodImpl.equals(this.mediaPeriods.get(0))) {
                return -9223372036854775807L;
            }
            long readDiscontinuity = this.actualMediaPeriod.readDiscontinuity();
            if (readDiscontinuity == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(readDiscontinuity, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        public long selectTracks(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, com.google.android.exoplayer2.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, com.google.android.exoplayer2.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            com.google.android.exoplayer2.source.SampleStream emptySampleStream;
            com.google.android.exoplayer2.source.SampleStream[] sampleStreamArr2;
            mediaPeriodImpl.lastStartPositionUs = j;
            if (mediaPeriodImpl.equals(this.mediaPeriods.get(0))) {
                this.trackSelections = (com.google.android.exoplayer2.trackselection.ExoTrackSelection[]) java.util.Arrays.copyOf(exoTrackSelectionArr, exoTrackSelectionArr.length);
                long streamPositionUs = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
                com.google.android.exoplayer2.source.SampleStream[] sampleStreamArr3 = this.sampleStreams;
                if (sampleStreamArr3.length == 0) {
                    sampleStreamArr2 = new com.google.android.exoplayer2.source.SampleStream[exoTrackSelectionArr.length];
                } else {
                    sampleStreamArr2 = (com.google.android.exoplayer2.source.SampleStream[]) java.util.Arrays.copyOf(sampleStreamArr3, sampleStreamArr3.length);
                }
                com.google.android.exoplayer2.source.SampleStream[] sampleStreamArr4 = sampleStreamArr2;
                long selectTracks = this.actualMediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr4, zArr2, streamPositionUs);
                this.sampleStreams = (com.google.android.exoplayer2.source.SampleStream[]) java.util.Arrays.copyOf(sampleStreamArr4, sampleStreamArr4.length);
                this.lastDownstreamFormatChangeData = (com.google.android.exoplayer2.source.MediaLoadData[]) java.util.Arrays.copyOf(this.lastDownstreamFormatChangeData, sampleStreamArr4.length);
                for (int i = 0; i < sampleStreamArr4.length; i++) {
                    if (sampleStreamArr4[i] == null) {
                        sampleStreamArr[i] = null;
                        this.lastDownstreamFormatChangeData[i] = null;
                    } else if (sampleStreamArr[i] == null || zArr2[i]) {
                        sampleStreamArr[i] = new com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SampleStreamImpl(mediaPeriodImpl, i);
                        this.lastDownstreamFormatChangeData[i] = null;
                    }
                }
                return com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(selectTracks, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
            }
            for (int i2 = 0; i2 < exoTrackSelectionArr.length; i2++) {
                com.google.android.exoplayer2.trackselection.ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i2];
                boolean z = true;
                if (exoTrackSelection != null) {
                    if (zArr[i2] && sampleStreamArr[i2] != null) {
                        z = false;
                    }
                    zArr2[i2] = z;
                    if (z) {
                        if (com.google.android.exoplayer2.util.Util.areEqual(this.trackSelections[i2], exoTrackSelection)) {
                            emptySampleStream = new com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SampleStreamImpl(mediaPeriodImpl, i2);
                        } else {
                            emptySampleStream = new com.google.android.exoplayer2.source.EmptySampleStream();
                        }
                        sampleStreamArr[i2] = emptySampleStream;
                    }
                } else {
                    sampleStreamArr[i2] = null;
                    zArr2[i2] = true;
                }
            }
            return j;
        }

        public int readData(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, int i, com.google.android.exoplayer2.FormatHolder formatHolder, com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer, int i2) {
            int readData = ((com.google.android.exoplayer2.source.SampleStream) com.google.android.exoplayer2.util.Util.castNonNull(this.sampleStreams[i])).readData(formatHolder, decoderInputBuffer, i2 | 5);
            long mediaPeriodPositionUsWithEndOfSourceHandling = getMediaPeriodPositionUsWithEndOfSourceHandling(mediaPeriodImpl, decoderInputBuffer.timeUs);
            if ((readData == -4 && mediaPeriodPositionUsWithEndOfSourceHandling == Long.MIN_VALUE) || (readData == -3 && getBufferedPositionUs(mediaPeriodImpl) == Long.MIN_VALUE && !decoderInputBuffer.waitingForKeys)) {
                maybeNotifyDownstreamFormatChanged(mediaPeriodImpl, i);
                decoderInputBuffer.clear();
                decoderInputBuffer.addFlag(4);
                return -4;
            }
            if (readData == -4) {
                maybeNotifyDownstreamFormatChanged(mediaPeriodImpl, i);
                ((com.google.android.exoplayer2.source.SampleStream) com.google.android.exoplayer2.util.Util.castNonNull(this.sampleStreams[i])).readData(formatHolder, decoderInputBuffer, i2);
                decoderInputBuffer.timeUs = mediaPeriodPositionUsWithEndOfSourceHandling;
            }
            return readData;
        }

        public int skipData(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, int i, long j) {
            return ((com.google.android.exoplayer2.source.SampleStream) com.google.android.exoplayer2.util.Util.castNonNull(this.sampleStreams[i])).skipData(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState));
        }

        public boolean isReady(int i) {
            return ((com.google.android.exoplayer2.source.SampleStream) com.google.android.exoplayer2.util.Util.castNonNull(this.sampleStreams[i])).isReady();
        }

        public void maybeThrowError(int i) throws java.io.IOException {
            ((com.google.android.exoplayer2.source.SampleStream) com.google.android.exoplayer2.util.Util.castNonNull(this.sampleStreams[i])).maybeThrowError();
        }

        public void onDownstreamFormatChanged(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
            int findMatchingStreamIndex = findMatchingStreamIndex(mediaLoadData);
            if (findMatchingStreamIndex != -1) {
                this.lastDownstreamFormatChangeData[findMatchingStreamIndex] = mediaLoadData;
                mediaPeriodImpl.hasNotifiedDownstreamFormatChange[findMatchingStreamIndex] = true;
            }
        }

        public void onLoadStarted(com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo, com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
            this.activeLoads.put(java.lang.Long.valueOf(loadEventInfo.loadTaskId), android.util.Pair.create(loadEventInfo, mediaLoadData));
        }

        public void onLoadFinished(com.google.android.exoplayer2.source.LoadEventInfo loadEventInfo) {
            this.activeLoads.remove(java.lang.Long.valueOf(loadEventInfo.loadTaskId));
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
        public void onPrepared(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
            this.isPrepared = true;
            for (int i = 0; i < this.mediaPeriods.size(); i++) {
                com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl = this.mediaPeriods.get(i);
                if (mediaPeriodImpl.callback != null) {
                    mediaPeriodImpl.callback.onPrepared(mediaPeriodImpl);
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
        public void onContinueLoadingRequested(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
            com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl = this.loadingPeriod;
            if (mediaPeriodImpl == null) {
                return;
            }
            ((com.google.android.exoplayer2.source.MediaPeriod.Callback) com.google.android.exoplayer2.util.Assertions.checkNotNull(mediaPeriodImpl.callback)).onContinueLoadingRequested(this.loadingPeriod);
        }

        private long getStreamPositionUsWithNotYetStartedHandling(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, long j) {
            if (j < mediaPeriodImpl.lastStartPositionUs) {
                return com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(mediaPeriodImpl.lastStartPositionUs, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState) - (mediaPeriodImpl.lastStartPositionUs - j);
            }
            return com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getStreamPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
        }

        private long getMediaPeriodPositionUsWithEndOfSourceHandling(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, long j) {
            if (j == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            long mediaPeriodPositionUs = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUs(j, mediaPeriodImpl.mediaPeriodId, this.adPlaybackState);
            if (mediaPeriodPositionUs >= com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.getMediaPeriodEndPositionUs(mediaPeriodImpl, this.adPlaybackState)) {
                return Long.MIN_VALUE;
            }
            return mediaPeriodPositionUs;
        }

        private int findMatchingStreamIndex(com.google.android.exoplayer2.source.MediaLoadData mediaLoadData) {
            if (mediaLoadData.trackFormat == null) {
                return -1;
            }
            int i = 0;
            loop0: while (true) {
                com.google.android.exoplayer2.trackselection.ExoTrackSelection[] exoTrackSelectionArr = this.trackSelections;
                if (i >= exoTrackSelectionArr.length) {
                    return -1;
                }
                com.google.android.exoplayer2.trackselection.ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
                if (exoTrackSelection != null) {
                    com.google.android.exoplayer2.source.TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
                    boolean z = mediaLoadData.trackType == 0 && trackGroup.equals(getTrackGroups().get(0));
                    for (int i2 = 0; i2 < trackGroup.length; i2++) {
                        com.google.android.exoplayer2.Format format = trackGroup.getFormat(i2);
                        if (format.equals(mediaLoadData.trackFormat) || (z && format.id != null && format.id.equals(mediaLoadData.trackFormat.id))) {
                            break loop0;
                        }
                    }
                }
                i++;
            }
            return i;
        }

        private void maybeNotifyDownstreamFormatChanged(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, int i) {
            if (mediaPeriodImpl.hasNotifiedDownstreamFormatChange[i] || this.lastDownstreamFormatChangeData[i] == null) {
                return;
            }
            mediaPeriodImpl.hasNotifiedDownstreamFormatChange[i] = true;
            mediaPeriodImpl.mediaSourceEventDispatcher.downstreamFormatChanged(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.correctMediaLoadData(mediaPeriodImpl, this.lastDownstreamFormatChangeData[i], this.adPlaybackState));
        }
    }

    private static final class ServerSideAdInsertionTimeline extends com.google.android.exoplayer2.source.ForwardingTimeline {
        private final com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> adPlaybackStates;

        public ServerSideAdInsertionTimeline(com.google.android.exoplayer2.Timeline timeline, com.google.common.collect.ImmutableMap<java.lang.Object, com.google.android.exoplayer2.source.ads.AdPlaybackState> immutableMap) {
            super(timeline);
            com.google.android.exoplayer2.util.Assertions.checkState(timeline.getWindowCount() == 1);
            com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();
            for (int i = 0; i < timeline.getPeriodCount(); i++) {
                timeline.getPeriod(i, period, true);
                com.google.android.exoplayer2.util.Assertions.checkState(immutableMap.containsKey(com.google.android.exoplayer2.util.Assertions.checkNotNull(period.uid)));
            }
            this.adPlaybackStates = immutableMap;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Window getWindow(int i, com.google.android.exoplayer2.Timeline.Window window, long j) {
            super.getWindow(i, window, j);
            com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();
            com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState = (com.google.android.exoplayer2.source.ads.AdPlaybackState) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.adPlaybackStates.get(com.google.android.exoplayer2.util.Assertions.checkNotNull(getPeriod(window.firstPeriodIndex, period, true).uid)));
            long mediaPeriodPositionUsForContent = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(window.positionInFirstPeriodUs, -1, adPlaybackState);
            if (window.durationUs != -9223372036854775807L) {
                com.google.android.exoplayer2.Timeline.Period period2 = super.getPeriod(window.lastPeriodIndex, period, true);
                long j2 = period2.positionInWindowUs;
                com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.adPlaybackStates.get(period2.uid));
                com.google.android.exoplayer2.Timeline.Period period3 = getPeriod(window.lastPeriodIndex, period);
                window.durationUs = period3.positionInWindowUs + com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(window.durationUs - j2, -1, adPlaybackState2);
            } else if (adPlaybackState.contentDurationUs != -9223372036854775807L) {
                window.durationUs = adPlaybackState.contentDurationUs - mediaPeriodPositionUsForContent;
            }
            window.positionInFirstPeriodUs = mediaPeriodPositionUsForContent;
            return window;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public com.google.android.exoplayer2.Timeline.Period getPeriod(int i, com.google.android.exoplayer2.Timeline.Period period, boolean z) {
            long mediaPeriodPositionUsForContent;
            super.getPeriod(i, period, true);
            com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState = (com.google.android.exoplayer2.source.ads.AdPlaybackState) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.adPlaybackStates.get(period.uid));
            long j = period.durationUs;
            if (j == -9223372036854775807L) {
                mediaPeriodPositionUsForContent = adPlaybackState.contentDurationUs;
            } else {
                mediaPeriodPositionUsForContent = com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(j, -1, adPlaybackState);
            }
            long j2 = mediaPeriodPositionUsForContent;
            com.google.android.exoplayer2.Timeline.Period period2 = new com.google.android.exoplayer2.Timeline.Period();
            long j3 = 0;
            for (int i2 = 0; i2 < i + 1; i2++) {
                this.timeline.getPeriod(i2, period2, true);
                com.google.android.exoplayer2.source.ads.AdPlaybackState adPlaybackState2 = (com.google.android.exoplayer2.source.ads.AdPlaybackState) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.adPlaybackStates.get(period2.uid));
                if (i2 == 0) {
                    j3 = -com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(-period2.getPositionInWindowUs(), -1, adPlaybackState2);
                }
                if (i2 != i) {
                    j3 += com.google.android.exoplayer2.source.ads.ServerSideAdInsertionUtil.getMediaPeriodPositionUsForContent(period2.durationUs, -1, adPlaybackState2);
                }
            }
            period.set(period.id, period.uid, period.windowIndex, j2, j3, adPlaybackState, period.isPlaceholder);
            return period;
        }
    }

    private static final class MediaPeriodImpl implements com.google.android.exoplayer2.source.MediaPeriod {
        public com.google.android.exoplayer2.source.MediaPeriod.Callback callback;
        public final com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
        public boolean[] hasNotifiedDownstreamFormatChange = new boolean[0];
        public long lastStartPositionUs;
        public final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId;
        public final com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;
        public final com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedPeriod;

        public MediaPeriodImpl(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.SharedMediaPeriod sharedMediaPeriod, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher eventDispatcher, com.google.android.exoplayer2.drm.DrmSessionEventListener.EventDispatcher eventDispatcher2) {
            this.sharedPeriod = sharedMediaPeriod;
            this.mediaPeriodId = mediaPeriodId;
            this.mediaSourceEventDispatcher = eventDispatcher;
            this.drmEventDispatcher = eventDispatcher2;
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void prepare(com.google.android.exoplayer2.source.MediaPeriod.Callback callback, long j) {
            this.callback = callback;
            this.sharedPeriod.prepare(this, j);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void maybeThrowPrepareError() throws java.io.IOException {
            this.sharedPeriod.maybeThrowPrepareError();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public com.google.android.exoplayer2.source.TrackGroupArray getTrackGroups() {
            return this.sharedPeriod.getTrackGroups();
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public java.util.List<com.google.android.exoplayer2.offline.StreamKey> getStreamKeys(java.util.List<com.google.android.exoplayer2.trackselection.ExoTrackSelection> list) {
            return this.sharedPeriod.getStreamKeys(list);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long selectTracks(com.google.android.exoplayer2.trackselection.ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, com.google.android.exoplayer2.source.SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            if (this.hasNotifiedDownstreamFormatChange.length == 0) {
                this.hasNotifiedDownstreamFormatChange = new boolean[sampleStreamArr.length];
            }
            return this.sharedPeriod.selectTracks(this, exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public void discardBuffer(long j, boolean z) {
            this.sharedPeriod.discardBuffer(this, j, z);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long readDiscontinuity() {
            return this.sharedPeriod.readDiscontinuity(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long seekToUs(long j) {
            return this.sharedPeriod.seekToUs(this, j);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod
        public long getAdjustedSeekPositionUs(long j, com.google.android.exoplayer2.SeekParameters seekParameters) {
            return this.sharedPeriod.getAdjustedSeekPositionUs(this, j, seekParameters);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getBufferedPositionUs() {
            return this.sharedPeriod.getBufferedPositionUs(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public long getNextLoadPositionUs() {
            return this.sharedPeriod.getNextLoadPositionUs(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean continueLoading(long j) {
            return this.sharedPeriod.continueLoading(this, j);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public boolean isLoading() {
            return this.sharedPeriod.isLoading(this);
        }

        @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
        public void reevaluateBuffer(long j) {
            this.sharedPeriod.reevaluateBuffer(this, j);
        }
    }

    private static final class SampleStreamImpl implements com.google.android.exoplayer2.source.SampleStream {
        private final com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriod;
        private final int streamIndex;

        public SampleStreamImpl(com.google.android.exoplayer2.source.ads.ServerSideAdInsertionMediaSource.MediaPeriodImpl mediaPeriodImpl, int i) {
            this.mediaPeriod = mediaPeriodImpl;
            this.streamIndex = i;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return this.mediaPeriod.sharedPeriod.isReady(this.streamIndex);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws java.io.IOException {
            this.mediaPeriod.sharedPeriod.maybeThrowError(this.streamIndex);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(com.google.android.exoplayer2.FormatHolder formatHolder, com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer, int i) {
            return this.mediaPeriod.sharedPeriod.readData(this.mediaPeriod, this.streamIndex, formatHolder, decoderInputBuffer, i);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j) {
            return this.mediaPeriod.sharedPeriod.skipData(this.mediaPeriod, this.streamIndex, j);
        }
    }
}
