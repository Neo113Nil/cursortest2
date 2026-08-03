package androidx.media3.exoplayer;

/* loaded from: classes2.dex */
final class MediaPeriodQueue {
    public static final long INITIAL_RENDERER_POSITION_OFFSET_US = 1000000000000L;
    private static final int MAXIMUM_BUFFER_AHEAD_PERIODS = 100;
    private final androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector;
    private final androidx.media3.common.util.HandlerWrapper analyticsCollectorHandler;
    private int length;
    private androidx.media3.exoplayer.MediaPeriodHolder loading;
    private final androidx.media3.exoplayer.MediaPeriodHolder.Factory mediaPeriodHolderFactory;
    private long nextWindowSequenceNumber;
    private java.lang.Object oldFrontPeriodUid;
    private long oldFrontPeriodWindowSequenceNumber;
    private androidx.media3.exoplayer.MediaPeriodHolder playing;
    private androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration;
    private androidx.media3.exoplayer.MediaPeriodHolder reading;
    private int repeatMode;
    private boolean shuffleModeEnabled;
    private final androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();
    private final androidx.media3.common.Timeline.Window window = new androidx.media3.common.Timeline.Window();
    private java.util.List<androidx.media3.exoplayer.MediaPeriodHolder> preloadPriorityList = new java.util.ArrayList();

    static boolean areDurationsCompatible(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    public MediaPeriodQueue(androidx.media3.exoplayer.analytics.AnalyticsCollector analyticsCollector, androidx.media3.common.util.HandlerWrapper handlerWrapper, androidx.media3.exoplayer.MediaPeriodHolder.Factory factory, androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.analyticsCollector = analyticsCollector;
        this.analyticsCollectorHandler = handlerWrapper;
        this.mediaPeriodHolderFactory = factory;
        this.preloadConfiguration = preloadConfiguration;
    }

    public boolean updateRepeatMode(androidx.media3.common.Timeline timeline, int i) {
        this.repeatMode = i;
        return updateForPlaybackModeChange(timeline);
    }

    public boolean updateShuffleModeEnabled(androidx.media3.common.Timeline timeline, boolean z) {
        this.shuffleModeEnabled = z;
        return updateForPlaybackModeChange(timeline);
    }

    public void updatePreloadConfiguration(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.preloadConfiguration = preloadConfiguration;
        invalidatePreloadPool(timeline);
    }

    public boolean isLoading(androidx.media3.exoplayer.source.MediaPeriod mediaPeriod) {
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod;
    }

    public void reevaluateBuffer(long j) {
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            mediaPeriodHolder.reevaluateBuffer(j);
        }
    }

    public boolean shouldLoadNextMediaPeriod() {
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder == null || (!mediaPeriodHolder.info.isFinal && this.loading.isFullyBuffered() && this.loading.info.durationUs != -9223372036854775807L && this.length < 100);
    }

    public androidx.media3.exoplayer.MediaPeriodInfo getNextMediaPeriodInfo(long j, androidx.media3.exoplayer.PlaybackInfo playbackInfo) {
        if (this.loading == null) {
            return getFirstMediaPeriodInfo(playbackInfo);
        }
        return getFollowingMediaPeriodInfo(playbackInfo.timeline, this.loading, j);
    }

    public androidx.media3.exoplayer.MediaPeriodHolder enqueueNextMediaPeriodHolder(androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo) {
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = this.loading;
        long rendererOffset = mediaPeriodHolder == null ? 1000000000000L : (mediaPeriodHolder.getRendererOffset() + this.loading.info.durationUs) - mediaPeriodInfo.startPositionUs;
        androidx.media3.exoplayer.MediaPeriodHolder removePreloadedMediaPeriodHolder = removePreloadedMediaPeriodHolder(mediaPeriodInfo);
        if (removePreloadedMediaPeriodHolder == null) {
            removePreloadedMediaPeriodHolder = this.mediaPeriodHolderFactory.create(mediaPeriodInfo, rendererOffset);
        } else {
            removePreloadedMediaPeriodHolder.info = mediaPeriodInfo;
            removePreloadedMediaPeriodHolder.setRendererOffset(rendererOffset);
        }
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder2 = this.loading;
        if (mediaPeriodHolder2 != null) {
            mediaPeriodHolder2.setNext(removePreloadedMediaPeriodHolder);
        } else {
            this.playing = removePreloadedMediaPeriodHolder;
            this.reading = removePreloadedMediaPeriodHolder;
        }
        this.oldFrontPeriodUid = null;
        this.loading = removePreloadedMediaPeriodHolder;
        this.length++;
        notifyQueueUpdate();
        return removePreloadedMediaPeriodHolder;
    }

    public void invalidatePreloadPool(androidx.media3.common.Timeline timeline) {
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder;
        if (this.preloadConfiguration.targetPreloadDurationUs == -9223372036854775807L || (mediaPeriodHolder = this.loading) == null) {
            releasePreloadPool();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.Pair<java.lang.Object, java.lang.Long> defaultPeriodPositionOfNextWindow = getDefaultPeriodPositionOfNextWindow(timeline, mediaPeriodHolder.info.id.periodUid, 0L);
        if (defaultPeriodPositionOfNextWindow != null && !timeline.getWindow(timeline.getPeriodByUid(defaultPeriodPositionOfNextWindow.first, this.period).windowIndex, this.window).isLive()) {
            long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(defaultPeriodPositionOfNextWindow.first);
            if (resolvePeriodUidToWindowSequenceNumberInPreloadPeriods == -1) {
                resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.nextWindowSequenceNumber;
                this.nextWindowSequenceNumber = 1 + resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
            }
            androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfoForPeriodPosition = getMediaPeriodInfoForPeriodPosition(timeline, defaultPeriodPositionOfNextWindow.first, ((java.lang.Long) defaultPeriodPositionOfNextWindow.second).longValue(), resolvePeriodUidToWindowSequenceNumberInPreloadPeriods);
            androidx.media3.exoplayer.MediaPeriodHolder removePreloadedMediaPeriodHolder = removePreloadedMediaPeriodHolder(mediaPeriodInfoForPeriodPosition);
            if (removePreloadedMediaPeriodHolder == null) {
                removePreloadedMediaPeriodHolder = this.mediaPeriodHolderFactory.create(mediaPeriodInfoForPeriodPosition, (mediaPeriodHolder.getRendererOffset() + mediaPeriodHolder.info.durationUs) - mediaPeriodInfoForPeriodPosition.startPositionUs);
            }
            arrayList.add(removePreloadedMediaPeriodHolder);
        }
        releaseAndResetPreloadPriorityList(arrayList);
    }

    public void releasePreloadPool() {
        if (this.preloadPriorityList.isEmpty()) {
            return;
        }
        releaseAndResetPreloadPriorityList(new java.util.ArrayList());
    }

    private androidx.media3.exoplayer.MediaPeriodHolder removePreloadedMediaPeriodHolder(androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo) {
        for (int i = 0; i < this.preloadPriorityList.size(); i++) {
            if (this.preloadPriorityList.get(i).canBeUsedForMediaPeriodInfo(mediaPeriodInfo)) {
                return this.preloadPriorityList.remove(i);
            }
        }
        return null;
    }

    private void releaseAndResetPreloadPriorityList(java.util.List<androidx.media3.exoplayer.MediaPeriodHolder> list) {
        for (int i = 0; i < this.preloadPriorityList.size(); i++) {
            this.preloadPriorityList.get(i).release();
        }
        this.preloadPriorityList = list;
    }

    private androidx.media3.exoplayer.MediaPeriodInfo getMediaPeriodInfoForPeriodPosition(androidx.media3.common.Timeline timeline, java.lang.Object obj, long j, long j2) {
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj, j, j2, this.window, this.period);
        if (resolveMediaPeriodIdForAds.isAd()) {
            return getMediaPeriodInfoForAd(timeline, resolveMediaPeriodIdForAds.periodUid, resolveMediaPeriodIdForAds.adGroupIndex, resolveMediaPeriodIdForAds.adIndexInAdGroup, j, resolveMediaPeriodIdForAds.windowSequenceNumber);
        }
        return getMediaPeriodInfoForContent(timeline, resolveMediaPeriodIdForAds.periodUid, j, -9223372036854775807L, resolveMediaPeriodIdForAds.windowSequenceNumber);
    }

    private android.util.Pair<java.lang.Object, java.lang.Long> getDefaultPeriodPositionOfNextWindow(androidx.media3.common.Timeline timeline, java.lang.Object obj, long j) {
        int nextWindowIndex = timeline.getNextWindowIndex(timeline.getPeriodByUid(obj, this.period).windowIndex, this.repeatMode, this.shuffleModeEnabled);
        if (nextWindowIndex != -1) {
            return timeline.getPeriodPositionUs(this.window, this.period, nextWindowIndex, -9223372036854775807L, j);
        }
        return null;
    }

    public androidx.media3.exoplayer.MediaPeriodHolder getLoadingPeriod() {
        return this.loading;
    }

    public androidx.media3.exoplayer.MediaPeriodHolder getPlayingPeriod() {
        return this.playing;
    }

    public androidx.media3.exoplayer.MediaPeriodHolder getReadingPeriod() {
        return this.reading;
    }

    public androidx.media3.exoplayer.MediaPeriodHolder advanceReadingPeriod() {
        this.reading = ((androidx.media3.exoplayer.MediaPeriodHolder) androidx.media3.common.util.Assertions.checkStateNotNull(this.reading)).getNext();
        notifyQueueUpdate();
        return (androidx.media3.exoplayer.MediaPeriodHolder) androidx.media3.common.util.Assertions.checkStateNotNull(this.reading);
    }

    public androidx.media3.exoplayer.MediaPeriodHolder advancePlayingPeriod() {
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = this.playing;
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

    public boolean removeAfter(androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder) {
        androidx.media3.common.util.Assertions.checkStateNotNull(mediaPeriodHolder);
        boolean z = false;
        if (mediaPeriodHolder.equals(this.loading)) {
            return false;
        }
        this.loading = mediaPeriodHolder;
        while (mediaPeriodHolder.getNext() != null) {
            mediaPeriodHolder = (androidx.media3.exoplayer.MediaPeriodHolder) androidx.media3.common.util.Assertions.checkNotNull(mediaPeriodHolder.getNext());
            if (mediaPeriodHolder == this.reading) {
                this.reading = this.playing;
                z = true;
            }
            mediaPeriodHolder.release();
            this.length--;
        }
        ((androidx.media3.exoplayer.MediaPeriodHolder) androidx.media3.common.util.Assertions.checkNotNull(this.loading)).setNext(null);
        notifyQueueUpdate();
        return z;
    }

    public void clear() {
        if (this.length == 0) {
            return;
        }
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = (androidx.media3.exoplayer.MediaPeriodHolder) androidx.media3.common.util.Assertions.checkStateNotNull(this.playing);
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

    public boolean updateQueuedPeriods(androidx.media3.common.Timeline timeline, long j, long j2) {
        androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo;
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = this.playing;
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder2 = null;
        while (mediaPeriodHolder != null) {
            androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo2 = mediaPeriodHolder.info;
            if (mediaPeriodHolder2 == null) {
                mediaPeriodInfo = getUpdatedMediaPeriodInfo(timeline, mediaPeriodInfo2);
            } else {
                androidx.media3.exoplayer.MediaPeriodInfo followingMediaPeriodInfo = getFollowingMediaPeriodInfo(timeline, mediaPeriodHolder2, j);
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
    public androidx.media3.exoplayer.MediaPeriodInfo getUpdatedMediaPeriodInfo(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo) {
        long durationUs;
        long j;
        boolean z;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.id;
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
            return new androidx.media3.exoplayer.MediaPeriodInfo(mediaPeriodId, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.requestedContentPositionUs, adGroupTimeUs, j, z, isLastInPeriod, isLastInWindow, isLastInTimeline);
        }
        j = durationUs;
        if (!mediaPeriodId.isAd()) {
        }
        return new androidx.media3.exoplayer.MediaPeriodInfo(mediaPeriodId, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.requestedContentPositionUs, adGroupTimeUs, j, z, isLastInPeriod, isLastInWindow, isLastInTimeline);
    }

    public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(androidx.media3.common.Timeline timeline, java.lang.Object obj, long j) {
        return resolveMediaPeriodIdForAds(timeline, obj, j, resolvePeriodUidToWindowSequenceNumber(timeline, obj), this.window, this.period);
    }

    private static androidx.media3.exoplayer.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(androidx.media3.common.Timeline timeline, java.lang.Object obj, long j, long j2, androidx.media3.common.Timeline.Window window, androidx.media3.common.Timeline.Period period) {
        timeline.getPeriodByUid(obj, period);
        timeline.getWindow(period.windowIndex, window);
        java.lang.Object obj2 = obj;
        for (int indexOfPeriod = timeline.getIndexOfPeriod(obj); isSkippableAdPeriod(period) && indexOfPeriod <= window.lastPeriodIndex; indexOfPeriod++) {
            timeline.getPeriod(indexOfPeriod, period, true);
            obj2 = androidx.media3.common.util.Assertions.checkNotNull(period.uid);
        }
        timeline.getPeriodByUid(obj2, period);
        int adGroupIndexForPositionUs = period.getAdGroupIndexForPositionUs(j);
        if (adGroupIndexForPositionUs == -1) {
            return new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(obj2, j2, period.getAdGroupIndexAfterPositionUs(j));
        }
        return new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(obj2, adGroupIndexForPositionUs, period.getFirstAdIndexToPlay(adGroupIndexForPositionUs), j2);
    }

    private static boolean isSkippableAdPeriod(androidx.media3.common.Timeline.Period period) {
        int adGroupCount = period.getAdGroupCount();
        if (adGroupCount == 0) {
            return false;
        }
        if ((adGroupCount == 1 && period.isLivePostrollPlaceholder(0)) || !period.isServerSideInsertedAdGroup(period.getRemovedAdGroupCount())) {
            return false;
        }
        long j = 0;
        if (period.getAdGroupIndexForPositionUs(0L) != -1) {
            return false;
        }
        if (period.durationUs == 0) {
            return true;
        }
        int i = adGroupCount - (period.isLivePostrollPlaceholder(adGroupCount + (-1)) ? 2 : 1);
        for (int i2 = 0; i2 <= i; i2++) {
            j += period.getContentResumeOffsetUs(i2);
        }
        return period.durationUs <= j;
    }

    public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAdsAfterPeriodPositionChange(androidx.media3.common.Timeline timeline, java.lang.Object obj, long j) {
        long resolvePeriodUidToWindowSequenceNumber = resolvePeriodUidToWindowSequenceNumber(timeline, obj);
        timeline.getPeriodByUid(obj, this.period);
        timeline.getWindow(this.period.windowIndex, this.window);
        boolean z = false;
        for (int indexOfPeriod = timeline.getIndexOfPeriod(obj); indexOfPeriod >= this.window.firstPeriodIndex; indexOfPeriod--) {
            timeline.getPeriod(indexOfPeriod, this.period, true);
            boolean z2 = this.period.getAdGroupCount() > 0;
            z |= z2;
            androidx.media3.common.Timeline.Period period = this.period;
            if (period.getAdGroupIndexForPositionUs(period.durationUs) != -1) {
                obj = androidx.media3.common.util.Assertions.checkNotNull(this.period.uid);
            }
            if (z && (!z2 || this.period.durationUs != 0)) {
                break;
            }
        }
        return resolveMediaPeriodIdForAds(timeline, obj, j, resolvePeriodUidToWindowSequenceNumber, this.window, this.period);
    }

    private void notifyQueueUpdate() {
        final com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = this.playing; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.getNext()) {
            builder.add((com.google.common.collect.ImmutableList.Builder) mediaPeriodHolder.info.id);
        }
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder2 = this.reading;
        final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodHolder2 == null ? null : mediaPeriodHolder2.info.id;
        this.analyticsCollectorHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.MediaPeriodQueue$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.exoplayer.MediaPeriodQueue.this.m4810x6b40a91a(builder, mediaPeriodId);
            }
        });
    }

    /* renamed from: lambda$notifyQueueUpdate$0$androidx-media3-exoplayer-MediaPeriodQueue, reason: not valid java name */
    /* synthetic */ void m4810x6b40a91a(com.google.common.collect.ImmutableList.Builder builder, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        this.analyticsCollector.updateMediaPeriodQueueInfo(builder.build(), mediaPeriodId);
    }

    private long resolvePeriodUidToWindowSequenceNumber(androidx.media3.common.Timeline timeline, java.lang.Object obj) {
        int indexOfPeriod;
        int i = timeline.getPeriodByUid(obj, this.period).windowIndex;
        java.lang.Object obj2 = this.oldFrontPeriodUid;
        if (obj2 != null && (indexOfPeriod = timeline.getIndexOfPeriod(obj2)) != -1 && timeline.getPeriod(indexOfPeriod, this.period).windowIndex == i) {
            return this.oldFrontPeriodWindowSequenceNumber;
        }
        for (androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = this.playing; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.getNext()) {
            if (mediaPeriodHolder.uid.equals(obj)) {
                return mediaPeriodHolder.info.id.windowSequenceNumber;
            }
        }
        for (androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder2 = this.playing; mediaPeriodHolder2 != null; mediaPeriodHolder2 = mediaPeriodHolder2.getNext()) {
            int indexOfPeriod2 = timeline.getIndexOfPeriod(mediaPeriodHolder2.uid);
            if (indexOfPeriod2 != -1 && timeline.getPeriod(indexOfPeriod2, this.period).windowIndex == i) {
                return mediaPeriodHolder2.info.id.windowSequenceNumber;
            }
        }
        long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj);
        if (resolvePeriodUidToWindowSequenceNumberInPreloadPeriods != -1) {
            return resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
        }
        long j = this.nextWindowSequenceNumber;
        this.nextWindowSequenceNumber = 1 + j;
        if (this.playing == null) {
            this.oldFrontPeriodUid = obj;
            this.oldFrontPeriodWindowSequenceNumber = j;
        }
        return j;
    }

    private long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(java.lang.Object obj) {
        for (int i = 0; i < this.preloadPriorityList.size(); i++) {
            androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = this.preloadPriorityList.get(i);
            if (mediaPeriodHolder.uid.equals(obj)) {
                return mediaPeriodHolder.info.id.windowSequenceNumber;
            }
        }
        return -1L;
    }

    private boolean canKeepMediaPeriodHolder(androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo, androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo2) {
        return mediaPeriodInfo.startPositionUs == mediaPeriodInfo2.startPositionUs && mediaPeriodInfo.id.equals(mediaPeriodInfo2.id);
    }

    private boolean updateForPlaybackModeChange(androidx.media3.common.Timeline timeline) {
        androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder = this.playing;
        if (mediaPeriodHolder == null) {
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodHolder.uid);
        while (true) {
            indexOfPeriod = timeline.getNextPeriodIndex(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            while (((androidx.media3.exoplayer.MediaPeriodHolder) androidx.media3.common.util.Assertions.checkNotNull(mediaPeriodHolder)).getNext() != null && !mediaPeriodHolder.info.isLastInTimelinePeriod) {
                mediaPeriodHolder = mediaPeriodHolder.getNext();
            }
            androidx.media3.exoplayer.MediaPeriodHolder next = mediaPeriodHolder.getNext();
            if (indexOfPeriod == -1 || next == null || timeline.getIndexOfPeriod(next.uid) != indexOfPeriod) {
                break;
            }
            mediaPeriodHolder = next;
        }
        boolean removeAfter = removeAfter(mediaPeriodHolder);
        mediaPeriodHolder.info = getUpdatedMediaPeriodInfo(timeline, mediaPeriodHolder.info);
        return !removeAfter;
    }

    private androidx.media3.exoplayer.MediaPeriodInfo getFirstMediaPeriodInfo(androidx.media3.exoplayer.PlaybackInfo playbackInfo) {
        return getMediaPeriodInfo(playbackInfo.timeline, playbackInfo.periodId, playbackInfo.requestedContentPositionUs, playbackInfo.positionUs);
    }

    private androidx.media3.exoplayer.MediaPeriodInfo getFollowingMediaPeriodInfo(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder, long j) {
        androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        long rendererOffset = (mediaPeriodHolder.getRendererOffset() + mediaPeriodInfo.durationUs) - j;
        if (mediaPeriodInfo.isLastInTimelinePeriod) {
            return getFirstMediaPeriodInfoOfNextPeriod(timeline, mediaPeriodHolder, rendererOffset);
        }
        return getFollowingMediaPeriodInfoOfCurrentPeriod(timeline, mediaPeriodHolder, rendererOffset);
    }

    private androidx.media3.exoplayer.MediaPeriodInfo getFirstMediaPeriodInfoOfNextPeriod(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder, long j) {
        androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo;
        long j2;
        long j3;
        java.lang.Object obj;
        long j4;
        long j5;
        long resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
        androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo2 = mediaPeriodHolder.info;
        int nextPeriodIndex = timeline.getNextPeriodIndex(timeline.getIndexOfPeriod(mediaPeriodInfo2.id.periodUid), this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
        if (nextPeriodIndex == -1) {
            return null;
        }
        int i = timeline.getPeriod(nextPeriodIndex, this.period, true).windowIndex;
        java.lang.Object checkNotNull = androidx.media3.common.util.Assertions.checkNotNull(this.period.uid);
        long j6 = mediaPeriodInfo2.id.windowSequenceNumber;
        if (timeline.getWindow(i, this.window).firstPeriodIndex == nextPeriodIndex) {
            mediaPeriodInfo = mediaPeriodInfo2;
            android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, i, -9223372036854775807L, java.lang.Math.max(0L, j));
            if (periodPositionUs == null) {
                return null;
            }
            java.lang.Object obj2 = periodPositionUs.first;
            long longValue = ((java.lang.Long) periodPositionUs.second).longValue();
            androidx.media3.exoplayer.MediaPeriodHolder next = mediaPeriodHolder.getNext();
            if (next != null && next.uid.equals(obj2)) {
                resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = next.info.id.windowSequenceNumber;
            } else {
                resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods(obj2);
                if (resolvePeriodUidToWindowSequenceNumberInPreloadPeriods == -1) {
                    resolvePeriodUidToWindowSequenceNumberInPreloadPeriods = this.nextWindowSequenceNumber;
                    this.nextWindowSequenceNumber = 1 + resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
                }
            }
            j2 = resolvePeriodUidToWindowSequenceNumberInPreloadPeriods;
            j3 = -9223372036854775807L;
            obj = obj2;
            j4 = longValue;
        } else {
            mediaPeriodInfo = mediaPeriodInfo2;
            j2 = j6;
            j3 = 0;
            obj = checkNotNull;
            j4 = 0;
        }
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId resolveMediaPeriodIdForAds = resolveMediaPeriodIdForAds(timeline, obj, j4, j2, this.window, this.period);
        if (j3 != -9223372036854775807L && mediaPeriodInfo.requestedContentPositionUs != -9223372036854775807L) {
            boolean hasServerSideInsertedAds = hasServerSideInsertedAds(mediaPeriodInfo.id.periodUid, timeline);
            if (resolveMediaPeriodIdForAds.isAd() && hasServerSideInsertedAds) {
                j3 = mediaPeriodInfo.requestedContentPositionUs;
            } else if (hasServerSideInsertedAds) {
                j5 = mediaPeriodInfo.requestedContentPositionUs;
                return getMediaPeriodInfo(timeline, resolveMediaPeriodIdForAds, j3, j5);
            }
        }
        j5 = j4;
        return getMediaPeriodInfo(timeline, resolveMediaPeriodIdForAds, j3, j5);
    }

    private androidx.media3.exoplayer.MediaPeriodInfo getFollowingMediaPeriodInfoOfCurrentPeriod(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.MediaPeriodHolder mediaPeriodHolder, long j) {
        androidx.media3.exoplayer.MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.id;
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        if (mediaPeriodId.isAd()) {
            int i = mediaPeriodId.adGroupIndex;
            int adCountInAdGroup = this.period.getAdCountInAdGroup(i);
            if (adCountInAdGroup == -1) {
                return null;
            }
            int nextAdIndexToPlay = this.period.getNextAdIndexToPlay(i, mediaPeriodId.adIndexInAdGroup);
            if (nextAdIndexToPlay < adCountInAdGroup) {
                return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, i, nextAdIndexToPlay, mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
            }
            long j2 = mediaPeriodInfo.requestedContentPositionUs;
            if (j2 == -9223372036854775807L) {
                androidx.media3.common.Timeline.Window window = this.window;
                androidx.media3.common.Timeline.Period period = this.period;
                android.util.Pair<java.lang.Object, java.lang.Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, period.windowIndex, -9223372036854775807L, java.lang.Math.max(0L, j));
                if (periodPositionUs == null) {
                    return null;
                }
                j2 = ((java.lang.Long) periodPositionUs.second).longValue();
            }
            return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, java.lang.Math.max(getMinStartPositionAfterAdGroupUs(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex), j2), mediaPeriodInfo.requestedContentPositionUs, mediaPeriodId.windowSequenceNumber);
        }
        if (mediaPeriodId.nextAdGroupIndex != -1 && this.period.isLivePostrollPlaceholder(mediaPeriodId.nextAdGroupIndex)) {
            return getFirstMediaPeriodInfoOfNextPeriod(timeline, mediaPeriodHolder, j);
        }
        int firstAdIndexToPlay = this.period.getFirstAdIndexToPlay(mediaPeriodId.nextAdGroupIndex);
        boolean z = this.period.isServerSideInsertedAdGroup(mediaPeriodId.nextAdGroupIndex) && this.period.getAdState(mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay) == 3;
        if (firstAdIndexToPlay == this.period.getAdCountInAdGroup(mediaPeriodId.nextAdGroupIndex) || z) {
            return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, getMinStartPositionAfterAdGroupUs(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex), mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
        }
        return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, mediaPeriodId.nextAdGroupIndex, firstAdIndexToPlay, mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
    }

    private boolean hasServerSideInsertedAds(java.lang.Object obj, androidx.media3.common.Timeline timeline) {
        int adGroupCount = timeline.getPeriodByUid(obj, this.period).getAdGroupCount();
        int removedAdGroupCount = this.period.getRemovedAdGroupCount();
        return adGroupCount > 0 && this.period.isServerSideInsertedAdGroup(removedAdGroupCount) && (adGroupCount > 1 || this.period.getAdGroupTimeUs(removedAdGroupCount) != Long.MIN_VALUE);
    }

    private androidx.media3.exoplayer.MediaPeriodInfo getMediaPeriodInfo(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j2) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        if (mediaPeriodId.isAd()) {
            return getMediaPeriodInfoForAd(timeline, mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, j, mediaPeriodId.windowSequenceNumber);
        }
        return getMediaPeriodInfoForContent(timeline, mediaPeriodId.periodUid, j2, j, mediaPeriodId.windowSequenceNumber);
    }

    private androidx.media3.exoplayer.MediaPeriodInfo getMediaPeriodInfoForAd(androidx.media3.common.Timeline timeline, java.lang.Object obj, int i, int i2, long j, long j2) {
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(obj, i, i2, j2);
        long adDurationUs = timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        long adResumePositionUs = i2 == this.period.getFirstAdIndexToPlay(i) ? this.period.getAdResumePositionUs() : 0L;
        return new androidx.media3.exoplayer.MediaPeriodInfo(mediaPeriodId, (adDurationUs == -9223372036854775807L || adResumePositionUs < adDurationUs) ? adResumePositionUs : java.lang.Math.max(0L, adDurationUs - 1), j, -9223372036854775807L, adDurationUs, this.period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex), false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r10.isServerSideInsertedAdGroup(r10.getRemovedAdGroupCount()) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private androidx.media3.exoplayer.MediaPeriodInfo getMediaPeriodInfoForContent(androidx.media3.common.Timeline timeline, java.lang.Object obj, long j, long j2, long j3) {
        boolean z;
        long j4;
        long j5;
        long j6;
        long j7 = j;
        timeline.getPeriodByUid(obj, this.period);
        int adGroupIndexAfterPositionUs = this.period.getAdGroupIndexAfterPositionUs(j7);
        int i = 1;
        boolean z2 = adGroupIndexAfterPositionUs != -1 && this.period.isLivePostrollPlaceholder(adGroupIndexAfterPositionUs);
        if (adGroupIndexAfterPositionUs == -1) {
            if (this.period.getAdGroupCount() > 0) {
                androidx.media3.common.Timeline.Period period = this.period;
            }
            z = false;
        } else {
            if (this.period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs) && this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs) == this.period.durationUs && this.period.hasPlayedAdGroup(adGroupIndexAfterPositionUs)) {
                adGroupIndexAfterPositionUs = -1;
                z = true;
            }
            z = false;
        }
        androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(obj, j3, adGroupIndexAfterPositionUs);
        boolean isLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean isLastInWindow = isLastInWindow(timeline, mediaPeriodId);
        boolean isLastInTimeline = isLastInTimeline(timeline, mediaPeriodId, isLastInPeriod);
        boolean z3 = (adGroupIndexAfterPositionUs == -1 || !this.period.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs) || z2) ? false : true;
        if (adGroupIndexAfterPositionUs != -1 && !z2) {
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
            return new androidx.media3.exoplayer.MediaPeriodInfo(mediaPeriodId, j7, j2, j4, j6, z3, isLastInPeriod, isLastInWindow, isLastInTimeline);
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
        return new androidx.media3.exoplayer.MediaPeriodInfo(mediaPeriodId, j7, j2, j4, j6, z3, isLastInPeriod, isLastInWindow, isLastInTimeline);
    }

    private boolean isLastInPeriod(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return !mediaPeriodId.isAd() && mediaPeriodId.nextAdGroupIndex == -1;
    }

    private boolean isLastInWindow(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        if (isLastInPeriod(mediaPeriodId)) {
            return timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window).lastPeriodIndex == timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        }
        return false;
    }

    private boolean isLastInTimeline(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, boolean z) {
        int indexOfPeriod = timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        return !timeline.getWindow(timeline.getPeriod(indexOfPeriod, this.period).windowIndex, this.window).isDynamic && timeline.isLastPeriod(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled) && z;
    }

    private long getMinStartPositionAfterAdGroupUs(androidx.media3.common.Timeline timeline, java.lang.Object obj, int i) {
        timeline.getPeriodByUid(obj, this.period);
        long adGroupTimeUs = this.period.getAdGroupTimeUs(i);
        if (adGroupTimeUs == Long.MIN_VALUE) {
            return this.period.durationUs;
        }
        return adGroupTimeUs + this.period.getContentResumeOffsetUs(i);
    }
}
