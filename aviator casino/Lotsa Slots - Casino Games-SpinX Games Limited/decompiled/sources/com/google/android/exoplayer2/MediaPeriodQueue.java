package com.google.android.exoplayer2;

/* loaded from: classes3.dex */
final class MediaPeriodQueue {
    public static final long INITIAL_RENDERER_POSITION_OFFSET_US = 1000000000000L;
    private static final int MAXIMUM_BUFFER_AHEAD_PERIODS = 100;
    private final com.google.android.exoplayer2.analytics.AnalyticsCollector analyticsCollector;
    private final android.os.Handler analyticsCollectorHandler;
    private int length;
    private com.google.android.exoplayer2.MediaPeriodHolder loading;
    private long nextWindowSequenceNumber;
    private java.lang.Object oldFrontPeriodUid;
    private long oldFrontPeriodWindowSequenceNumber;
    private com.google.android.exoplayer2.MediaPeriodHolder playing;
    private com.google.android.exoplayer2.MediaPeriodHolder reading;
    private int repeatMode;
    private boolean shuffleModeEnabled;
    private final com.google.android.exoplayer2.Timeline.Period period = new com.google.android.exoplayer2.Timeline.Period();
    private final com.google.android.exoplayer2.Timeline.Window window = new com.google.android.exoplayer2.Timeline.Window();

    private boolean areDurationsCompatible(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    public MediaPeriodQueue(com.google.android.exoplayer2.analytics.AnalyticsCollector analyticsCollector, android.os.Handler handler) {
        this.analyticsCollector = analyticsCollector;
        this.analyticsCollectorHandler = handler;
    }

    public boolean updateRepeatMode(com.google.android.exoplayer2.Timeline timeline, int i) {
        this.repeatMode = i;
        return updateForPlaybackModeChange(timeline);
    }

    public boolean updateShuffleModeEnabled(com.google.android.exoplayer2.Timeline timeline, boolean z) {
        this.shuffleModeEnabled = z;
        return updateForPlaybackModeChange(timeline);
    }

    public boolean isLoading(com.google.android.exoplayer2.source.MediaPeriod mediaPeriod) {
        com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod;
    }

    public void reevaluateBuffer(long j) {
        com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            mediaPeriodHolder.reevaluateBuffer(j);
        }
    }

    public boolean shouldLoadNextMediaPeriod() {
        com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder == null || (!mediaPeriodHolder.info.isFinal && this.loading.isFullyBuffered() && this.loading.info.durationUs != -9223372036854775807L && this.length < 100);
    }

    public com.google.android.exoplayer2.MediaPeriodInfo getNextMediaPeriodInfo(long j, com.google.android.exoplayer2.PlaybackInfo playbackInfo) {
        if (this.loading == null) {
            return getFirstMediaPeriodInfo(playbackInfo);
        }
        return getFollowingMediaPeriodInfo(playbackInfo.timeline, this.loading, j);
    }

    public com.google.android.exoplayer2.MediaPeriodHolder enqueueNextMediaPeriodHolder(com.google.android.exoplayer2.RendererCapabilities[] rendererCapabilitiesArr, com.google.android.exoplayer2.trackselection.TrackSelector trackSelector, com.google.android.exoplayer2.upstream.Allocator allocator, com.google.android.exoplayer2.MediaSourceList mediaSourceList, com.google.android.exoplayer2.MediaPeriodInfo mediaPeriodInfo, com.google.android.exoplayer2.trackselection.TrackSelectorResult trackSelectorResult) {
        com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder = this.loading;
        com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder2 = new com.google.android.exoplayer2.MediaPeriodHolder(rendererCapabilitiesArr, mediaPeriodHolder == null ? 1000000000000L : (mediaPeriodHolder.getRendererOffset() + this.loading.info.durationUs) - mediaPeriodInfo.startPositionUs, trackSelector, allocator, mediaSourceList, mediaPeriodInfo, trackSelectorResult);
        com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder3 = this.loading;
        if (mediaPeriodHolder3 != null) {
            mediaPeriodHolder3.setNext(mediaPeriodHolder2);
        } else {
            this.playing = mediaPeriodHolder2;
            this.reading = mediaPeriodHolder2;
        }
        this.oldFrontPeriodUid = null;
        this.loading = mediaPeriodHolder2;
        this.length++;
        notifyQueueUpdate();
        return mediaPeriodHolder2;
    }

    public com.google.android.exoplayer2.MediaPeriodHolder getLoadingPeriod() {
        return this.loading;
    }

    public com.google.android.exoplayer2.MediaPeriodHolder getPlayingPeriod() {
        return this.playing;
    }

    public com.google.android.exoplayer2.MediaPeriodHolder getReadingPeriod() {
        return this.reading;
    }

    public com.google.android.exoplayer2.MediaPeriodHolder advanceReadingPeriod() {
        com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder = this.reading;
        com.google.android.exoplayer2.util.Assertions.checkState((mediaPeriodHolder == null || mediaPeriodHolder.getNext() == null) ? false : true);
        this.reading = this.reading.getNext();
        notifyQueueUpdate();
        return this.reading;
    }

    public com.google.android.exoplayer2.MediaPeriodHolder advancePlayingPeriod() {
        com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder = this.playing;
        if (mediaPeriodHolder == null) {
            return null;
        }
        if (mediaPeriodHolder == this.reading) {
            this.reading = mediaPeriodHolder.getNext();
        }
        this.playing.release();
        int i = this.length - 1;
        this.length = i;
        if (i == 0) {
            this.loading = null;
            this.oldFrontPeriodUid = this.playing.uid;
            this.oldFrontPeriodWindowSequenceNumber = this.playing.info.id.windowSequenceNumber;
        }
        this.playing = this.playing.getNext();
        notifyQueueUpdate();
        return this.playing;
    }

    public boolean removeAfter(com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder) {
        boolean z = false;
        com.google.android.exoplayer2.util.Assertions.checkState(mediaPeriodHolder != null);
        if (mediaPeriodHolder.equals(this.loading)) {
            return false;
        }
        this.loading = mediaPeriodHolder;
        while (mediaPeriodHolder.getNext() != null) {
            mediaPeriodHolder = mediaPeriodHolder.getNext();
            if (mediaPeriodHolder == this.reading) {
                this.reading = this.playing;
                z = true;
            }
            mediaPeriodHolder.release();
            this.length--;
        }
        this.loading.setNext(null);
        notifyQueueUpdate();
        return z;
    }

    public void clear() {
        if (this.length == 0) {
            return;
        }
        com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder = (com.google.android.exoplayer2.MediaPeriodHolder) com.google.android.exoplayer2.util.Assertions.checkStateNotNull(this.playing);
        this.oldFrontPeriodUid = mediaPeriodHolder.uid;
        this.oldFrontPeriodWindowSequenceNumber = mediaPeriodHolder.info.id.windowSequenceNumber;
        while (mediaPeriodHolder != null) {
            mediaPeriodHolder.release();
            mediaPeriodHolder = mediaPeriodHolder.getNext();
        }
        this.playing = null;
        this.loading = null;
        this.reading = null;
        this.length = 0;
        notifyQueueUpdate();
    }

    public boolean updateQueuedPeriods(com.google.android.exoplayer2.Timeline timeline, long j, long j2) {
        com.google.android.exoplayer2.MediaPeriodInfo mediaPeriodInfo;
        com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder = this.playing;
        com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder2 = null;
        while (mediaPeriodHolder != null) {
            com.google.android.exoplayer2.MediaPeriodInfo mediaPeriodInfo2 = mediaPeriodHolder.info;
            if (mediaPeriodHolder2 == null) {
                mediaPeriodInfo = getUpdatedMediaPeriodInfo(timeline, mediaPeriodInfo2);
            } else {
                com.google.android.exoplayer2.MediaPeriodInfo followingMediaPeriodInfo = getFollowingMediaPeriodInfo(timeline, mediaPeriodHolder2, j);
                if (followingMediaPeriodInfo == null) {
                    return !removeAfter(mediaPeriodHolder2);
                }
                if (!canKeepMediaPeriodHolder(mediaPeriodInfo2, followingMediaPeriodInfo)) {
                    return !removeAfter(mediaPeriodHolder2);
                }
                mediaPeriodInfo = followingMediaPeriodInfo;
            }
            mediaPeriodHolder.info = mediaPeriodInfo.copyWithRequestedContentPositionUs(mediaPeriodInfo2.requestedContentPositionUs);
            if (!areDurationsCompatible(mediaPeriodInfo2.durationUs, mediaPeriodInfo.durationUs)) {
                mediaPeriodHolder.updateClipping();
                return (removeAfter(mediaPeriodHolder) || (mediaPeriodHolder == this.reading && !mediaPeriodHolder.info.isFollowedByTransitionToSameStream && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((mediaPeriodInfo.durationUs > (-9223372036854775807L) ? 1 : (mediaPeriodInfo.durationUs == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : mediaPeriodHolder.toRendererTime(mediaPeriodInfo.durationUs)) ? 1 : (j2 == ((mediaPeriodInfo.durationUs > (-9223372036854775807L) ? 1 : (mediaPeriodInfo.durationUs == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : mediaPeriodHolder.toRendererTime(mediaPeriodInfo.durationUs)) ? 0 : -1)) >= 0))) ? false : true;
            }
            mediaPeriodHolder2 = mediaPeriodHolder;
            mediaPeriodHolder = mediaPeriodHolder.getNext();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.google.android.exoplayer2.MediaPeriodInfo getUpdatedMediaPeriodInfo(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.MediaPeriodInfo mediaPeriodInfo) {
        long durationUs;
        long j;
        boolean z;
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.id;
        boolean isLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean isLastInWindow = isLastInWindow(timeline, mediaPeriodId);
        boolean isLastInTimeline = isLastInTimeline(timeline, mediaPeriodId, isLastInPeriod);
        timeline.getPeriodByUid(mediaPeriodInfo.id.periodUid, this.period);
        long adGroupTimeUs = (mediaPeriodId.isAd() || mediaPeriodId.nextAdGroupIndex == -1) ? -9223372036854775807L : this.period.getAdGroupTimeUs(mediaPeriodId.nextAdGroupIndex);
        if (mediaPeriodId.isAd()) {
            durationUs = this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        } else if (adGroupTimeUs == -9223372036854775807L || adGroupTimeUs == Long.MIN_VALUE) {
            durationUs = this.period.getDurationUs();
        } else {
            j = adGroupTimeUs;
            if (!mediaPeriodId.isAd()) {
                z = this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex);
            } else {
                z = mediaPeriodId.nextAdGroupIndex != -1 && this.period.isServerSideInsertedAdGroup(mediaPeriodId.nextAdGroupIndex);
            }
            return new com.google.android.exoplayer2.MediaPeriodInfo(mediaPeriodId, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.requestedContentPositionUs, adGroupTimeUs, j, z, isLastInPeriod, isLastInWindow, isLastInTimeline);
        }
        j = durationUs;
        if (!mediaPeriodId.isAd()) {
        }
        return new com.google.android.exoplayer2.MediaPeriodInfo(mediaPeriodId, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.requestedContentPositionUs, adGroupTimeUs, j, z, isLastInPeriod, isLastInWindow, isLastInTimeline);
    }

    public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(com.google.android.exoplayer2.Timeline timeline, java.lang.Object obj, long j) {
        return resolveMediaPeriodIdForAds(timeline, obj, j, resolvePeriodIndexToWindowSequenceNumber(timeline, obj), this.window, this.period);
    }

    private static com.google.android.exoplayer2.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(com.google.android.exoplayer2.Timeline timeline, java.lang.Object obj, long j, long j2, com.google.android.exoplayer2.Timeline.Window window, com.google.android.exoplayer2.Timeline.Period period) {
        timeline.getPeriodByUid(obj, period);
        timeline.getWindow(period.windowIndex, window);
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        java.lang.Object obj2 = obj;
        while (period.durationUs == 0 && period.getAdGroupCount() > 0 && period.isServerSideInsertedAdGroup(period.getRemovedAdGroupCount()) && period.getAdGroupIndexForPositionUs(0L) == -1) {
            int i = indexOfPeriod + 1;
            if (indexOfPeriod >= window.lastPeriodIndex) {
                break;
            }
            timeline.getPeriod(i, period, true);
            obj2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(period.uid);
            indexOfPeriod = i;
        }
        timeline.getPeriodByUid(obj2, period);
        int adGroupIndexForPositionUs = period.getAdGroupIndexForPositionUs(j);
        if (adGroupIndexForPositionUs == -1) {
            return new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(obj2, j2, period.getAdGroupIndexAfterPositionUs(j));
        }
        return new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(obj2, adGroupIndexForPositionUs, period.getFirstAdIndexToPlay(adGroupIndexForPositionUs), j2);
    }

    public com.google.android.exoplayer2.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange(com.google.android.exoplayer2.Timeline timeline, java.lang.Object obj, long j) {
        long resolvePeriodIndexToWindowSequenceNumber = resolvePeriodIndexToWindowSequenceNumber(timeline, obj);
        timeline.getPeriodByUid(obj, this.period);
        timeline.getWindow(this.period.windowIndex, this.window);
        boolean z = false;
        for (int indexOfPeriod = timeline.getIndexOfPeriod(obj); indexOfPeriod >= this.window.firstPeriodIndex; indexOfPeriod--) {
            timeline.getPeriod(indexOfPeriod, this.period, true);
            boolean z2 = this.period.getAdGroupCount() > 0;
            z |= z2;
            com.google.android.exoplayer2.Timeline.Period period = this.period;
            if (period.getAdGroupIndexForPositionUs(period.durationUs) != -1) {
                obj = com.google.android.exoplayer2.util.Assertions.checkNotNull(this.period.uid);
            }
            if (z && (!z2 || this.period.durationUs != 0)) {
                break;
            }
        }
        return resolveMediaPeriodIdForAds(timeline, obj, j, resolvePeriodIndexToWindowSequenceNumber, this.window, this.period);
    }

    private void notifyQueueUpdate() {
        final com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder = this.playing; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.getNext()) {
            builder.add((com.google.common.collect.ImmutableList.Builder) mediaPeriodHolder.info.id);
        }
        com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder2 = this.reading;
        final com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodHolder2 == null ? null : mediaPeriodHolder2.info.id;
        this.analyticsCollectorHandler.post(new java.lang.Runnable() { // from class: com.google.android.exoplayer2.MediaPeriodQueue$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.exoplayer2.MediaPeriodQueue.this.m5377xb2cc2342(builder, mediaPeriodId);
            }
        });
    }

    /* renamed from: lambda$notifyQueueUpdate$0$com-google-android-exoplayer2-MediaPeriodQueue, reason: not valid java name */
    /* synthetic */ void m5377xb2cc2342(com.google.common.collect.ImmutableList.Builder builder, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        this.analyticsCollector.updateMediaPeriodQueueInfo(builder.build(), mediaPeriodId);
    }

    private long resolvePeriodIndexToWindowSequenceNumber(com.google.android.exoplayer2.Timeline timeline, java.lang.Object obj) {
        int indexOfPeriod;
        int i = timeline.getPeriodByUid(obj, this.period).windowIndex;
        java.lang.Object obj2 = this.oldFrontPeriodUid;
        if (obj2 != null && (indexOfPeriod = timeline.getIndexOfPeriod(obj2)) != -1 && timeline.getPeriod(indexOfPeriod, this.period).windowIndex == i) {
            return this.oldFrontPeriodWindowSequenceNumber;
        }
        for (com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder = this.playing; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.getNext()) {
            if (mediaPeriodHolder.uid.equals(obj)) {
                return mediaPeriodHolder.info.id.windowSequenceNumber;
            }
        }
        for (com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder2 = this.playing; mediaPeriodHolder2 != null; mediaPeriodHolder2 = mediaPeriodHolder2.getNext()) {
            int indexOfPeriod2 = timeline.getIndexOfPeriod(mediaPeriodHolder2.uid);
            if (indexOfPeriod2 != -1 && timeline.getPeriod(indexOfPeriod2, this.period).windowIndex == i) {
                return mediaPeriodHolder2.info.id.windowSequenceNumber;
            }
        }
        long j = this.nextWindowSequenceNumber;
        this.nextWindowSequenceNumber = 1 + j;
        if (this.playing == null) {
            this.oldFrontPeriodUid = obj;
            this.oldFrontPeriodWindowSequenceNumber = j;
        }
        return j;
    }

    private boolean canKeepMediaPeriodHolder(com.google.android.exoplayer2.MediaPeriodInfo mediaPeriodInfo, com.google.android.exoplayer2.MediaPeriodInfo mediaPeriodInfo2) {
        return mediaPeriodInfo.startPositionUs == mediaPeriodInfo2.startPositionUs && mediaPeriodInfo.id.equals(mediaPeriodInfo2.id);
    }

    private boolean updateForPlaybackModeChange(com.google.android.exoplayer2.Timeline timeline) {
        com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder = this.playing;
        if (mediaPeriodHolder == null) {
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodHolder.uid);
        while (true) {
            indexOfPeriod = timeline.getNextPeriodIndex(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            while (mediaPeriodHolder.getNext() != null && !mediaPeriodHolder.info.isLastInTimelinePeriod) {
                mediaPeriodHolder = mediaPeriodHolder.getNext();
            }
            com.google.android.exoplayer2.MediaPeriodHolder next = mediaPeriodHolder.getNext();
            if (indexOfPeriod == -1 || next == null || timeline.getIndexOfPeriod(next.uid) != indexOfPeriod) {
                break;
            }
            mediaPeriodHolder = next;
        }
        boolean removeAfter = removeAfter(mediaPeriodHolder);
        mediaPeriodHolder.info = getUpdatedMediaPeriodInfo(timeline, mediaPeriodHolder.info);
        return !removeAfter;
    }

    private com.google.android.exoplayer2.MediaPeriodInfo getFirstMediaPeriodInfo(com.google.android.exoplayer2.PlaybackInfo playbackInfo) {
        return getMediaPeriodInfo(playbackInfo.timeline, playbackInfo.periodId, playbackInfo.requestedContentPositionUs, playbackInfo.positionUs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cc, code lost:
    
        if (r0.isServerSideInsertedAdGroup(r0.getRemovedAdGroupCount()) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.google.android.exoplayer2.MediaPeriodInfo getFollowingMediaPeriodInfo(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.MediaPeriodHolder mediaPeriodHolder, long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        com.google.android.exoplayer2.MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        long rendererOffset = (mediaPeriodHolder.getRendererOffset() + mediaPeriodInfo.durationUs) - j;
        boolean z = true;
        if (mediaPeriodInfo.isLastInTimelinePeriod) {
            int nextPeriodIndex = timeline.getNextPeriodIndex(timeline.getIndexOfPeriod(mediaPeriodInfo.id.periodUid), this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            if (nextPeriodIndex == -1) {
                return null;
            }
            int i = timeline.getPeriod(nextPeriodIndex, this.period, true).windowIndex;
            java.lang.Object checkNotNull = com.google.android.exoplayer2.util.Assertions.checkNotNull(this.period.uid);
            long j7 = mediaPeriodInfo.id.windowSequenceNumber;
            if (timeline.getWindow(i, this.window).firstPeriodIndex == nextPeriodIndex) {
                android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, i, -9223372036854775807L, java.lang.Math.max(0L, rendererOffset));
                if (periodPositionUs == null) {
                    return null;
                }
                checkNotNull = periodPositionUs.first;
                long longValue = ((java.lang.Long) periodPositionUs.second).longValue();
                com.google.android.exoplayer2.MediaPeriodHolder next = mediaPeriodHolder.getNext();
                if (next != null && next.uid.equals(checkNotNull)) {
                    j6 = next.info.id.windowSequenceNumber;
                } else {
                    j6 = this.nextWindowSequenceNumber;
                    this.nextWindowSequenceNumber = 1 + j6;
                }
                j2 = longValue;
                j3 = -9223372036854775807L;
                j7 = j6;
            } else {
                j2 = 0;
                j3 = 0;
            }
            com.google.android.exoplayer2.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, checkNotNull, j2, j7, this.window, this.period);
            if (j3 != -9223372036854775807L && mediaPeriodInfo.requestedContentPositionUs != -9223372036854775807L) {
                if (timeline.getPeriodByUid(mediaPeriodInfo.id.periodUid, this.period).getAdGroupCount() > 0) {
                    com.google.android.exoplayer2.Timeline.Period period = this.period;
                }
                z = false;
                if (resolveMediaPeriodIdForAds.isAd() && z) {
                    j5 = mediaPeriodInfo.requestedContentPositionUs;
                    j4 = j2;
                    return getMediaPeriodInfo(timeline, resolveMediaPeriodIdForAds, j5, j4);
                }
                if (z) {
                    j4 = mediaPeriodInfo.requestedContentPositionUs;
                    j5 = j3;
                    return getMediaPeriodInfo(timeline, resolveMediaPeriodIdForAds, j5, j4);
                }
            }
            j4 = j2;
            j5 = j3;
            return getMediaPeriodInfo(timeline, resolveMediaPeriodIdForAds, j5, j4);
        }
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.id;
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        if (mediaPeriodId.isAd()) {
            int i2 = mediaPeriodId.adGroupIndex;
            int adCountInAdGroup = this.period.getAdCountInAdGroup(i2);
            if (adCountInAdGroup == -1) {
                return null;
            }
            int nextAdIndexToPlay = this.period.getNextAdIndexToPlay(i2, mediaPeriodId.adIndexInAdGroup);
            if (nextAdIndexToPlay < adCountInAdGroup) {
                return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, i2, nextAdIndexToPlay, mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
            }
            long j8 = mediaPeriodInfo.requestedContentPositionUs;
            if (j8 == -9223372036854775807L) {
                com.google.android.exoplayer2.Timeline.Window window = this.window;
                com.google.android.exoplayer2.Timeline.Period period2 = this.period;
                android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs2 = timeline.getPeriodPositionUs(window, period2, period2.windowIndex, -9223372036854775807L, java.lang.Math.max(0L, rendererOffset));
                if (periodPositionUs2 == null) {
                    return null;
                }
                j8 = ((java.lang.Long) periodPositionUs2.second).longValue();
            }
            return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, java.lang.Math.max(getMinStartPositionAfterAdGroupUs(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex), j8), mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
        }
        int firstAdIndexToPlay = this.period.getFirstAdIndexToPlay(mediaPeriodId.nextAdGroupIndex);
        boolean z2 = this.period.isServerSideInsertedAdGroup(mediaPeriodId.nextAdGroupIndex) && this.period.getAdState(mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay) == 3;
        if (firstAdIndexToPlay == this.period.getAdCountInAdGroup(mediaPeriodId.nextAdGroupIndex) || z2) {
            return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, getMinStartPositionAfterAdGroupUs(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex), mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
        }
        return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay, mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
    }

    private com.google.android.exoplayer2.MediaPeriodInfo getMediaPeriodInfo(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j2) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        if (mediaPeriodId.isAd()) {
            return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, j, mediaPeriodId.windowSequenceNumber);
        }
        return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, j2, j, mediaPeriodId.windowSequenceNumber);
    }

    private com.google.android.exoplayer2.MediaPeriodInfo getMediaPeriodInfoForAd(com.google.android.exoplayer2.Timeline timeline, java.lang.Object obj, int i, int i2, long j, long j2) {
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(obj, i, i2, j2);
        long adDurationUs = timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        long adResumePositionUs = i2 == this.period.getFirstAdIndexToPlay(i) ? this.period.getAdResumePositionUs() : 0L;
        return new com.google.android.exoplayer2.MediaPeriodInfo(mediaPeriodId, (adDurationUs == -9223372036854775807L || adResumePositionUs < adDurationUs) ? adResumePositionUs : java.lang.Math.max(0L, adDurationUs - 1), j, -9223372036854775807L, adDurationUs, this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex), false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r9.isServerSideInsertedAdGroup(r9.getRemovedAdGroupCount()) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.google.android.exoplayer2.MediaPeriodInfo getMediaPeriodInfoForContent(com.google.android.exoplayer2.Timeline timeline, java.lang.Object obj, long j, long j2, long j3) {
        boolean z;
        long j4;
        long j5;
        long j6;
        long j7 = j;
        timeline.getPeriodByUid(obj, this.period);
        int adGroupIndexAfterPositionUs = this.period.getAdGroupIndexAfterPositionUs(j7);
        int i = 1;
        if (adGroupIndexAfterPositionUs == -1) {
            if (this.period.getAdGroupCount() > 0) {
                com.google.android.exoplayer2.Timeline.Period period = this.period;
            }
            z = false;
        } else {
            if (this.period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs) && this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs) == this.period.durationUs && this.period.hasPlayedAdGroup(adGroupIndexAfterPositionUs)) {
                adGroupIndexAfterPositionUs = -1;
                z = true;
            }
            z = false;
        }
        com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId = new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(obj, j3, adGroupIndexAfterPositionUs);
        boolean isLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean isLastInWindow = isLastInWindow(timeline, mediaPeriodId);
        boolean isLastInTimeline = isLastInTimeline(timeline, mediaPeriodId, isLastInPeriod);
        boolean z2 = adGroupIndexAfterPositionUs != -1 && this.period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs);
        if (adGroupIndexAfterPositionUs != -1) {
            j5 = this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs);
        } else if (z) {
            j5 = this.period.durationUs;
        } else {
            j4 = -9223372036854775807L;
            j6 = (j4 != -9223372036854775807L || j4 == Long.MIN_VALUE) ? this.period.durationUs : j4;
            if (j6 != -9223372036854775807L && j7 >= j6) {
                if (!isLastInTimeline && z) {
                    i = 0;
                }
                j7 = java.lang.Math.max(0L, j6 - i);
            }
            return new com.google.android.exoplayer2.MediaPeriodInfo(mediaPeriodId, j7, j2, j4, j6, z2, isLastInPeriod, isLastInWindow, isLastInTimeline);
        }
        j4 = j5;
        if (j4 != -9223372036854775807L) {
        }
        if (j6 != -9223372036854775807L) {
            if (!isLastInTimeline) {
                i = 0;
            }
            j7 = java.lang.Math.max(0L, j6 - i);
        }
        return new com.google.android.exoplayer2.MediaPeriodInfo(mediaPeriodId, j7, j2, j4, j6, z2, isLastInPeriod, isLastInWindow, isLastInTimeline);
    }

    private boolean isLastInPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return !mediaPeriodId.isAd() && mediaPeriodId.nextAdGroupIndex == -1;
    }

    private boolean isLastInWindow(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId) {
        if (isLastInPeriod(mediaPeriodId)) {
            return timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window).lastPeriodIndex == timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        }
        return false;
    }

    private boolean isLastInTimeline(com.google.android.exoplayer2.Timeline timeline, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId, boolean z) {
        int indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        return !timeline.getWindow(timeline.getPeriod(indexOfPeriod, this.period).windowIndex, this.window).isDynamic && timeline.isLastPeriod(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled) && z;
    }

    private long getMinStartPositionAfterAdGroupUs(com.google.android.exoplayer2.Timeline timeline, java.lang.Object obj, int i) {
        timeline.getPeriodByUid(obj, this.period);
        long adGroupTimeUs = this.period.getAdGroupTimeUs(i);
        if (adGroupTimeUs == Long.MIN_VALUE) {
            return this.period.durationUs;
        }
        return adGroupTimeUs + this.period.getContentResumeOffsetUs(i);
    }
}
